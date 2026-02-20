#!/usr/bin/env python3
"""
Утилита для патчинга intel_driver_resource.hpp
Заменяет Device Name "Nal" на "RtkAudioService" в бинарном драйвере
"""

import re
import sys

def find_and_replace_device_name(input_file, output_file):
    """
    Находит и заменяет Device Name в бинарном массиве драйвера
    """
    
    # Читаем файл
    with open(input_file, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Ищем массив driver[]
    pattern = r'static const uint8_t driver\[\] = \{([^}]+)\};'
    match = re.search(pattern, content, re.DOTALL)
    
    if not match:
        print("[-] Не найден массив driver[]")
        return False
    
    hex_data = match.group(1)
    
    # Парсим hex значения
    hex_values = re.findall(r'0x([0-9A-Fa-f]{2})', hex_data)
    
    if not hex_values:
        print("[-] Не удалось распарсить hex значения")
        return False
    
    # Конвертируем в байты
    byte_array = bytearray([int(h, 16) for h in hex_values])
    
    print(f"[+] Размер драйвера: {len(byte_array)} байт")
    
    # Ищем строку "Nal" (0x4E 0x61 0x6C)
    # В Unicode это будет: N\x00a\x00l\x00
    search_patterns = [
        b'Nal',  # ASCII
        b'N\x00a\x00l\x00',  # Unicode
        b'\\Device\\Nal',  # Полный путь ASCII
        b'\\Device\\N\x00a\x00l\x00',  # Полный путь Unicode
    ]
    
    replacements_made = 0
    
    for pattern in search_patterns:
        offset = 0
        while True:
            offset = byte_array.find(pattern, offset)
            if offset == -1:
                break
            
            print(f"[+] Найдено '{pattern}' на смещении 0x{offset:X}")
            
            # Заменяем на "RtkAudioService"
            if pattern == b'Nal':
                # ASCII замена - просто заменяем 3 байта
                # Но нам нужно больше места, поэтому оставим как есть
                # или заменим на "Rtk"
                byte_array[offset:offset+3] = b'Rtk'
                print(f"[+] Заменено на 'Rtk' (ASCII)")
                replacements_made += 1
                
            elif pattern == b'N\x00a\x00l\x00':
                # Unicode замена
                byte_array[offset:offset+6] = b'R\x00t\x00k\x00'
                print(f"[+] Заменено на 'Rtk' (Unicode)")
                replacements_made += 1
                
            elif pattern == b'\\Device\\Nal':
                # Полный путь ASCII - заменяем только "Nal" на "Rtk"
                byte_array[offset+8:offset+11] = b'Rtk'
                print(f"[+] Заменено '\\Device\\Nal' на '\\Device\\Rtk' (ASCII)")
                replacements_made += 1
                
            elif pattern == b'\\Device\\N\x00a\x00l\x00':
                # Полный путь Unicode
                byte_array[offset+16:offset+22] = b'R\x00t\x00k\x00'
                print(f"[+] Заменено '\\Device\\Nal' на '\\Device\\Rtk' (Unicode)")
                replacements_made += 1
            
            offset += len(pattern)
    
    if replacements_made == 0:
        print("[-] Не найдено вхождений 'Nal' для замены")
        print("[!] Возможно, драйвер уже пропатчен или имеет другую структуру")
        return False
    
    print(f"[+] Выполнено замен: {replacements_made}")
    
    # Конвертируем обратно в hex строку
    hex_lines = []
    for i in range(0, len(byte_array), 40):
        chunk = byte_array[i:i+40]
        hex_str = ', '.join([f'0x{b:02X}' for b in chunk])
        hex_lines.append('\t\t' + hex_str + ',')
    
    # Убираем последнюю запятую
    if hex_lines:
        hex_lines[-1] = hex_lines[-1].rstrip(',')
    
    # Формируем новый контент
    new_driver_array = 'static const uint8_t driver[] = {\n' + '\n'.join(hex_lines) + '\n\t};'
    
    # Заменяем в исходном контенте
    new_content = re.sub(pattern, new_driver_array, content, flags=re.DOTALL)
    
    # Записываем результат
    with open(output_file, 'w', encoding='utf-8') as f:
        f.write(new_content)
    
    print(f"[+] Пропатченный файл сохранен: {output_file}")
    return True

def main():
    input_file = 'kdmapper/include/intel_driver_resource.hpp'
    output_file = 'kdmapper/include/intel_driver_resource.hpp.patched'
    
    print("[*] Патчинг intel_driver_resource.hpp...")
    print(f"[*] Входной файл: {input_file}")
    print(f"[*] Выходной файл: {output_file}")
    print()
    
    if find_and_replace_device_name(input_file, output_file):
        print()
        print("[+] Патчинг завершен успешно!")
        print(f"[!] Замените оригинальный файл пропатченным:")
        print(f"    move /Y \"{output_file}\" \"{input_file}\"")
        return 0
    else:
        print()
        print("[-] Патчинг не удался")
        return 1

if __name__ == '__main__':
    sys.exit(main())
