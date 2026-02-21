# Модификации KDMapper для обхода античита ACE

## Выполненные изменения:

### 1. Замена сигнатурных строк ✅
Все упоминания "kdmapper", "KDMapper", "intel_cpu_unknown", "iqvw64e" заменены на "Realtek Audio Driver" / "rtkaudio":

- `kdmapper/include/intel_driver.hpp` - сообщение об ошибке хука
- `kdmapper/service.cpp` - сообщения о блокировке драйвера
- `kdmapper/main.cpp` - usage сообщение
- `kdmapper/intel_driver.cpp` - сообщения об ошибках загрузки
- `HelloWorld/main.cpp` - имена параметров DriverEntry
- `LibUsageExample/LibUsageExample.cpp` - пример использования

### 2. Затирка PE-заголовков ✅
Добавлена функция в `kdmapper/kdmapper.cpp` которая затирает PE-заголовки в памяти ядра сразу после маппинга:

```cpp
// Wipe PE headers to avoid detection
if (destroyHeader) {
    kdmLog(L"[+] Wiping PE headers from kernel memory" << std::endl);
    BYTE* zero_buffer = new BYTE[TotalVirtualHeaderSize];
    memset(zero_buffer, 0, TotalVirtualHeaderSize);
    
    if (intel_driver::WriteMemory(realBase, zero_buffer, TotalVirtualHeaderSize)) {
        kdmLog(L"[+] PE headers successfully wiped" << std::endl);
    } else {
        kdmLog(L"[-] WARNING: Failed to wipe PE headers!" << std::endl);
    }
    
    delete[] zero_buffer;
}
```

### 3. Рандомизация Device Name ✅
Device Name теперь генерируется случайно из списка реалистичных имен:
- RtkAudioService
- RealtekHDAudio
- IntelAudioHD
- ConexantAudio
- VIAAudioService
- AudioEnhancement
- HDMIAudioService

Изменено в `kdmapper/intel_driver.cpp`:
- Функция `GetDeviceNameW()` генерирует случайное имя
- `IsRunning()` использует динамическое имя
- `Load()` использует динамическое имя

### 4. Рандомизация имени драйвера ✅
Имя драйвера генерируется из реалистичных компонентов:
- Префиксы: Rtk, Realtek, Intel, Conexant, VIA
- Суффиксы: Audio, HDAudio, AudioHD, Sound, AC97
- Версии: 64, x64, HD, v2, v3

Примеры: `RtkAudioHD`, `IntelSoundx64`, `RealtekAudiov3`

### 5. Anti-Debug защита ✅
Добавлен файл `kdmapper/include/anti_debug.hpp` с проверками:
- IsDebuggerPresent
- CheckRemoteDebuggerPresent
- NtQueryInformationProcess (ProcessDebugPort)
- CPUID hypervisor detection
- Sandboxie detection
- Timing checks для обнаружения sandbox

Интегрировано в `kdmapper/main.cpp`:
```cpp
if (anti_debug::is_being_debugged()) {
    kdmLog(L"[-] Debugger or sandbox detected. Exiting..." << std::endl);
    return -1;
}
```

### 6. Случайные задержки ✅
Добавлены случайные задержки (100-600ms) для усложнения анализа времени выполнения.

### 7. Обфускация строк ✅
Создан файл `kdmapper/include/string_obfuscation.hpp` с:
- XOR шифрованием строк на этапе компиляции
- Генераторами случайных имен
- Макросами OBF_STR и OBF_WSTR для защиты строк

## Дополнительные файлы:

### Новые заголовочные файлы:
- `kdmapper/include/anti_debug.hpp` - антидебаг техники
- `kdmapper/include/string_obfuscation.hpp` - обфускация строк

### Утилиты:
- `patch_driver_resource.py` - Python скрипт для патчинга бинарного драйвера (опционально)

## Использование:

После компиляции используйте флаг `--copy-header` для затирки заголовков:

```cmd
kdmapper.exe --copy-header --free YourDriver.sys
```

## Предупреждения:

1. ⚠️ Эти модификации НЕ гарантируют 100% обход ACE
2. ⚠️ Античиты постоянно обновляются и могут детектировать новые сигнатуры
3. ⚠️ Используйте на свой риск
4. ⚠️ Тестируйте ТОЛЬКО в безопасной среде (VM)
5. ⚠️ Anti-debug проверки могут вызвать ложные срабатывания

## Что еще можно улучшить:

### Высокий приоритет:
- ✅ Рандомизация Device Name
- ✅ Рандомизация имени драйвера
- ✅ Anti-debug техники
- ✅ Затирка PE-заголовков
- ⚠️ Патчинг бинарного драйвера (требует ручной работы)

### Средний приоритет:
- Использование другого уязвимого драйвера
- Полная обфускация кода (LLVM-Obfuscator)
- Шифрование секций драйвера
- Polymorphic code generation

### Низкий приоритет:
- Code signing с валидным сертификатом
- Kernel-mode rootkit для скрытия следов
- HWID spoofer интеграция

## Сборка:

1. Откройте `kdmapper.sln` в Visual Studio
2. Убедитесь что все новые файлы добавлены в проект
3. Выберите Release x64
4. Build Solution
5. Переименуйте `kdmapper.exe` в `rtkaudio.exe` (опционально)

## Тестирование:

```cmd
# Базовый тест
kdmapper.exe --copy-header --free HelloWorld.sys

# С независимыми страницами
kdmapper.exe --copy-header --free --indPages HelloWorld.sys

# Полная защита
kdmapper.exe --copy-header --free --indPages --PassAllocationPtr HelloWorld.sys
```

## Обход детекта:

### Статический анализ:
- ✅ Строки обфусцированы
- ✅ Имена рандомизированы
- ✅ PE-заголовки затираются

### Динамический анализ:
- ✅ Anti-debug проверки
- ✅ Случайные задержки
- ✅ Sandbox detection

### Поведенческий анализ:
- ✅ Реалистичные имена драйверов
- ✅ Легитимные Device Names
- ⚠️ Паттерны загрузки (требует дополнительной работы)

## Известные ограничения:

1. Встроенный драйвер `iqvw64e.sys` все еще содержит оригинальные строки в PE
2. Device Name в драйвере остается "Nal" (требует патчинга бинарника)
3. IOCTL коды остаются неизменными
4. Сигнатуры функций могут быть детектированы

## Решение ограничений:

### Для полной маскировки:
1. Используйте `patch_driver_resource.py` для патчинга драйвера
2. Или замените на другой уязвимый драйвер
3. Измените IOCTL коды в коде
4. Добавьте code obfuscation (VMProtect, Themida, etc.)

