#pragma once
#include <chrono>
#include <ctime>
#include <vector>
#include <Windows.h>
#include <tlhelp32.h>
#include <fstream>
#include <vector>
#include <winternl.h>
#include <cstdint>
#include <DbgHelp.h>
#include <thread>
#include <functional>
#include <map>
#include <algorithm>
#pragma comment(lib, "dbghelp.lib")
#pragma comment(lib, "ntdll.lib")
/*
	hello leproxy here
	i don't feel like doing this
	this is such a bruh momento
	i'm speed running ts nerd
*/

namespace memory
{
	__forceinline uintptr_t to_addr( const void* pointer )
	{
		return reinterpret_cast< uintptr_t >( pointer );
	}

	__forceinline void* to_ptr( uintptr_t address )
	{
		return reinterpret_cast< void* >( address );
	}

	__forceinline bool is_valid( uintptr_t address )
	{
		return ( address >= 0x0000000000010000 && address < 0x00007FFFFFFEFFFF );
	}

	__forceinline bool is_valid( const void* pointer )
	{
		return is_valid( to_addr( pointer ) );
	}
}

namespace driver {

	enum class setup_code
	{
		create_error,
		initialize_error,
		active_error,
		process_id_error,
		eproccess_error,
		base_address_error,
		directory_table_base_error,
		game_assembly_error,
		unity_player_error,
		setup_success
	};


	class c_driver {
	public:
		c_driver( ) { }
		~c_driver( ) { }

		u64 game_assembly { };
		u64 unity_player { };

		std::uint32_t m_process_id;
		eprocess_t* m_eprocess;
		peb_t* m_process_peb;
		std::uint64_t m_base_address;
		std::uint64_t m_directory_table_base;

		bool create( ) {
			InitializeSRWLock( &m_request_lock );

			auto result = RegCreateKeyExW(
				HKEY_CURRENT_USER,
				L"SOFTWARE\\{b0a6c5bb-d971-417b-a9af-6b0a69c095d1}",
				0,
				nullptr,
				REG_OPTION_VOLATILE,
				KEY_WRITE | KEY_SET_VALUE,
				nullptr,
				&m_registry_key,
				nullptr
			);

			if ( result != ERROR_SUCCESS ) {
				return false;
			}

			m_response_semaphore = CreateSemaphoreA( nullptr, 0, LONG_MAX, nullptr );
			if ( !m_response_semaphore ) {
				return false;
			}

			m_request_semaphore = CreateSemaphoreA( nullptr, 0, LONG_MAX, nullptr );
			if ( !m_request_semaphore ) {
				return false;
			}

			auto nt_dll = GetModuleHandleA( "ntdll.dll" );
			if ( !nt_dll ) {
				return false;
			}

			m_nt_update_wnf_state_data = reinterpret_cast< nt_update_wnf_state_data_t >(
				GetProcAddress( nt_dll, "NtUpdateWnfStateData" ) );
			if ( !m_nt_update_wnf_state_data ) {
				return false;
			}

			ZeroMemory( &m_state_name, sizeof( m_state_name ) );
			m_state_name.Data [ 0 ] = static_cast< std::uint32_t >( 0x0d83063ea3be0875 & 0xFFFFFFFF );
			m_state_name.Data [ 1 ] = static_cast< std::uint32_t >( ( 0x0d83063ea3be0875 >> 32 ) & 0xFFFFFFFF );
			return true;
		}

		bool initialize( ) {
			m_control_data = reinterpret_cast< control::control_data_t* >(
				VirtualAlloc(
					nullptr,
					sizeof( control::control_data_t ),
					MEM_COMMIT | MEM_RESERVE,
					PAGE_READWRITE
				) );

			if ( !m_control_data ) {
				return false;
			}

			memset( m_control_data, 0, sizeof( control::control_data_t ) );

			control::control_initialize_t control_initialize {};
			control_initialize.m_process_id = GetCurrentProcessId( );
			control_initialize.m_base_address = reinterpret_cast< std::uint64_t >( m_control_data );
			control_initialize.m_response_semaphore = m_response_semaphore;
			control_initialize.m_request_semaphore = m_request_semaphore;

			auto result = RegSetValueExW(
				m_registry_key,
				L"{5f86769f-fdfd-4c36-8e9a-e9a92fe7480a}",
				0,
				REG_BINARY,
				reinterpret_cast< const BYTE* >( &control_initialize ),
				sizeof( control_initialize )
			);

			if ( result != ERROR_SUCCESS ) {
				return false;
			}

			RegCloseKey( m_registry_key );
			RegDeleteKeyW( HKEY_CURRENT_USER, L"SOFTWARE\\{b0a6c5bb-d971-417b-a9af-6b0a69c095d1}" );
			return true;
		}

		bool is_active( ) {
			m_control_data->m_request_type = control::control_type::verify;
			return send_control( );
		}

		void unload( ) {
			if ( !m_control_data ) return;
			m_control_data->m_request_type = control::control_type::unload_driver;
			send_control( );
			cleanup( );
		}

		std::uint32_t get_process_id( std::wstring process_name ) {
			auto snapshot = CreateToolhelp32Snapshot( TH32CS_SNAPPROCESS, 0 );
			if ( snapshot == INVALID_HANDLE_VALUE )
				return false;

			PROCESSENTRY32W process_entry { };
			process_entry.dwSize = sizeof( process_entry );
			Process32FirstW( snapshot, &process_entry );
			do {
				if ( !process_name.compare( process_entry.szExeFile ) )
					return process_entry.th32ProcessID;
			} while ( Process32NextW( snapshot, &process_entry ) );

			return 0;
		}

		eprocess_t* get_eprocess( std::uint32_t process_id ) {
			m_control_data->m_request_type = control::control_type::get_eprocess;
			m_control_data->m_process_id = process_id;

			if ( !send_control( ) )
				return nullptr;

			return m_control_data->m_process;
		}

		std::uint64_t get_base_address( eprocess_t* eprocess ) {
			m_control_data->m_request_type = control::control_type::get_base_address;
			m_control_data->m_process = eprocess;

			if ( !send_control( ) )
				return 0;

			return reinterpret_cast< std::uint64_t >( m_control_data->m_address2 );
		}

		peb_t* get_process_peb( eprocess_t* eprocess ) {
			m_control_data->m_request_type = control::control_type::get_process_peb;
			m_control_data->m_process = eprocess;

			if ( !send_control( ) )
				return nullptr;

			return m_control_data->m_process_peb;
		}

		std::uint64_t get_directory_table_base( eprocess_t* eprocess ) {
			m_control_data->m_request_type = control::control_type::get_directory_table_base;
			m_control_data->m_process = eprocess;

			if ( !send_control( 5000 ) )
				return 0;

			return m_control_data->m_address;
		}

		setup_code attach_process( std::wstring target_process ) {

			if ( !create( ) )
				return setup_code::create_error;

			if ( !initialize( ) )
				return setup_code::initialize_error;

			if ( !is_active( ) )
				return setup_code::active_error;

			this->m_process_id = this->get_process_id( target_process );
			if ( !m_process_id )
				return setup_code::process_id_error;

			this->m_eprocess = this->get_eprocess( m_process_id );
			if ( !m_eprocess )
				return setup_code::eproccess_error;

			this->m_process_peb = this->get_process_peb( m_eprocess );
			if ( !m_process_peb )
				return setup_code::base_address_error;

			this->m_base_address = this->get_base_address( m_eprocess );
			if ( !m_base_address )
				return setup_code::base_address_error;

			this->m_directory_table_base = this->get_directory_table_base( m_eprocess );
			if ( !m_directory_table_base ) 
				return setup_code::directory_table_base_error;

			this->game_assembly = this->get_process_module( HASH_STR( L"GameAssembly.dll" ) );
			if ( !this->game_assembly )
				return setup_code::game_assembly_error;

			this->unity_player = this->get_process_module( HASH_STR( L"UnityPlayer.dll" ) );

			return setup_code::setup_success;
		}

		bool hyperspace_entries( paging::pt_entries_t& pt_entries, std::uint64_t va ) {
			m_control_data->m_request_type = control::control_type::hyperspace_entries;
			m_control_data->m_address = va;

			if ( !send_control( ) )
				return false;

			pt_entries = std::move( m_control_data->m_pt_entries );
			return true;
		}

		std::uint64_t translate_linear( std::uint64_t va, std::uint32_t* page_size ) {
			auto it = paging::m_virtual_address_space.find( va );
			if ( it != paging::m_virtual_address_space.end( ) ) {
				if ( page_size )
					*page_size = it->second.second;
				return it->second.first;
			}

			paging::pt_entries_t pt_entries;
			if ( !hyperspace_entries( pt_entries, va ) )
				return 0;

			std::uint64_t pa = 0;
			std::uint32_t size = 0;
			if ( pt_entries.m_pdpte.hard.page_size ) {
				pa = ( pt_entries.m_pdpte.hard.pfn << paging::page_shift ) + ( va & paging::page_1gb_mask );
				size = paging::page_1gb_size;
			}
			else if ( pt_entries.m_pde.hard.page_size ) {
				pa = ( pt_entries.m_pde.hard.pfn << paging::page_shift ) + ( va & paging::page_2mb_mask );
				size = paging::page_2mb_size;
			}
			else {
				pa = ( pt_entries.m_pte.hard.pfn << paging::page_shift ) + ( va & paging::page_4kb_mask );
				size = paging::page_4kb_size;
			}

			paging::m_virtual_address_space [ va ] = std::make_pair( pa, size );

			if ( page_size )
				*page_size = size;
			return pa;
		}

		void* map_process_page( std::uint64_t pa ) {
			m_control_data->m_request_type = control::control_type::map_process_page;
			m_control_data->m_address = pa;

			if ( !send_control( ) )
				return nullptr;

			return m_control_data->m_address2;
		}

		bool read_physical( void* dst, std::uint64_t pa, std::size_t size ) {
			m_control_data->m_request_type = control::control_type::read_physical;
			m_control_data->m_address = pa;
			m_control_data->m_address2 = dst;
			m_control_data->m_size = size;
			return send_control( );
		}

		bool write_physical( void* dst, std::uint64_t pa, std::size_t size ) {
			m_control_data->m_request_type = control::control_type::write_physical;
			m_control_data->m_address = pa;
			m_control_data->m_address2 = dst;
			m_control_data->m_size = size;
			return send_control( );
		}

		bool read_virtual( void* dst, std::uint64_t va, std::size_t size ) {
			auto current_buffer = static_cast< std::uint8_t* >( dst );
			auto current_va = va;
			auto remaining = size;

			while ( remaining > 0 ) {
				std::uint32_t page_size = 0;
				auto physical_address = translate_linear( current_va, &page_size );
				if ( !physical_address )
					return false;

				auto page_offset = current_va & ( static_cast< unsigned long long >( page_size ) - 1 );
				auto read_size = std::min( static_cast< std::size_t >( page_size - page_offset ), remaining );

				auto mapped_page = map_process_page( physical_address );
				if ( !mapped_page ) {
					return false;
				}

				__movsb(
					reinterpret_cast< std::uint8_t* >( current_buffer ),
					reinterpret_cast< std::uint8_t* >( mapped_page ),
					read_size
				);

				current_va += read_size;
				current_buffer += read_size;
				remaining -= read_size;
			}

			return true;
		}

		bool write_virtual( void* dst, std::uint64_t va, std::size_t size ) {
			auto current_buffer = static_cast< std::uint8_t* >( dst );
			auto current_va = va;
			auto remaining = size;

			while ( remaining > 0 ) {
				std::uint32_t page_size = 0;
				auto physical_address = translate_linear( current_va, &page_size );
				if ( !physical_address )
					return false;

				auto page_offset = current_va & ( static_cast< unsigned long long >( page_size ) - 1 );
				auto read_size = std::min( static_cast< std::size_t >( page_size - page_offset ), remaining );

				auto mapped_page = map_process_page( physical_address );
				if ( !mapped_page ) {
					return false;
				}

				__movsb(
					reinterpret_cast< std::uint8_t* >( mapped_page ),
					reinterpret_cast< std::uint8_t* >( current_buffer ),
					read_size
				);

				current_va += read_size;
				current_buffer += read_size;
				remaining -= read_size;
			}

			return true;
		}

		template <typename addr_t>
		bool read( addr_t va, void* buffer, size_t size ) {
			std::uint64_t va64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				va64 = reinterpret_cast< std::uint64_t >( va );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				va64 = static_cast< std::uint64_t >( va );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return read_virtual( buffer, va64, size );
		}

		template <typename ret_t = std::uint64_t, typename addr_t>
		ret_t read( addr_t va ) {
			ret_t buffer { };
			if ( !read(
				va,
				&buffer,
				sizeof( ret_t ) ) )
				return ret_t { };
			return buffer;
		}

		template <typename addr_t>
		bool read_phys( addr_t pa, void* buffer, size_t size ) {
			std::uint64_t pa64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				pa64 = reinterpret_cast< std::uint64_t >( pa );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				pa64 = static_cast< std::uint64_t >( pa );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return read_physical( buffer, pa64, size );
		}

		template <typename ret_t = std::uint64_t, typename addr_t>
		ret_t read_phys( addr_t pa ) {
			std::uint64_t pa64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				pa64 = reinterpret_cast< std::uint64_t >( pa );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				pa64 = static_cast< std::uint64_t >( pa );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			ret_t buffer { };
			if ( !read_physical( &buffer, pa64, sizeof( ret_t ) ) )
				return {};
			return buffer;
		}

		template <typename addr_t>
		bool write_virt( addr_t va, void* buffer, size_t size ) {
			std::uint64_t va64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				va64 = reinterpret_cast< std::uint64_t >( va );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				va64 = static_cast< std::uint64_t >( va );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return write_virtual( buffer, va64, size );
		}

		template <typename value_t, typename addr_t>
		bool write_virt( addr_t va, const value_t& value ) {
			std::uint64_t va64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				va64 = reinterpret_cast< std::uint64_t >( va );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				va64 = static_cast< std::uint64_t >( va );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return write_virtual( const_cast< value_t* >( &value ), va64, sizeof( value_t ) );
		}

		template <typename value_t, typename addr_t>
		bool write( addr_t va, const value_t& value ) {
			std::uint64_t va64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				va64 = reinterpret_cast< std::uint64_t >( va );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				va64 = static_cast< std::uint64_t >( va );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return write_virtual( const_cast< value_t* >( &value ), va64, sizeof( value_t ) );
		}

		template <typename addr_t>
		bool write_phys( addr_t pa, void* buffer, size_t size ) {
			std::uint64_t pa64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				pa64 = reinterpret_cast< std::uint64_t >( pa );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				pa64 = static_cast< std::uint64_t >( pa );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return write_physical( buffer, pa64, size );
		}

		template <typename value_t, typename addr_t>
		bool write_phys( addr_t pa, const value_t& value ) {
			std::uint64_t pa64;
			if constexpr ( std::is_pointer_v<addr_t> ) {
				pa64 = reinterpret_cast< std::uint64_t >( pa );
			}
			else if constexpr ( std::is_integral_v<addr_t> ) {
				pa64 = static_cast< std::uint64_t >( pa );
			}
			else {
				static_assert( std::is_pointer_v<addr_t> || std::is_integral_v<addr_t>,
					"addr_t must be pointer or integral" );
			}

			return write_physical( const_cast< value_t* >( &value ), pa64, sizeof( value_t ) );
		}

		std::uintptr_t get_process_module( const wchar_t* module_name ) {
			if ( !m_process_peb )
				return 0;

			auto peb_data = read< peb_t >( m_process_peb );
			if ( !peb_data.m_ldr )
				return {};

			auto ldr_data = read< peb_ldr_data_t >( peb_data.m_ldr );
			auto current_entry = ldr_data.m_module_list_load_order.m_flink;
			auto first_entry = current_entry;

			do {
				auto entry = read< ldr_data_table_entry_t >( current_entry );
				if ( entry.m_base_dll_name.m_length > 0 && entry.m_base_dll_name.m_length < MAX_PATH * 2 ) {
					wchar_t module_name_buffer [ MAX_PATH ] {};
					if ( read( entry.m_base_dll_name.m_buffer, module_name_buffer, entry.m_base_dll_name.m_length ) ) {
						module_name_buffer [ entry.m_base_dll_name.m_length / 2 ] = L'\0';
						if ( !_wcsicmp( module_name_buffer, module_name ) ) {
							return reinterpret_cast< std::uintptr_t >( entry.m_dll_base );
						}
					}
				}

				current_entry = entry.m_in_load_order_module_list.m_flink;
			} while ( current_entry && current_entry != first_entry );

			return 0;
		}

		std::uintptr_t get_module_export( std::uintptr_t module_base, const char* export_name ) {
			if ( !module_base || !export_name )
				return 0;

			dos_header_t dos_header;
			if ( !read( module_base, &dos_header, sizeof( dos_header_t ) ) )
				return 0;

			if ( !dos_header.is_valid( ) )
				return 0;

			nt_headers_t nt_headers;
			if ( !read( module_base + dos_header.m_lfanew, &nt_headers, sizeof( nt_headers_t ) ) )
				return 0;

			if ( !nt_headers.is_valid( ) )
				return 0;

			export_directory_t export_directory;
			if ( !read( module_base + nt_headers.m_export_table.m_virtual_address, &export_directory, sizeof( export_directory_t ) ) )
				return 0;

			auto function_count = export_directory.m_number_of_functions;
			std::vector<DWORD> functions( function_count );
			if ( !read(
				module_base + export_directory.m_address_of_functions,
				functions.data( ),
				function_count * sizeof( DWORD )
			) ) return 0;

			if ( functions.empty( ) )
				return 0;

			auto name_count = export_directory.m_number_of_names;
			std::vector<DWORD> names( name_count );
			if ( !read(
				module_base + export_directory.m_address_of_names,
				names.data( ),
				name_count * sizeof( DWORD )
			) ) return 0;

			if ( names.empty( ) )
				return 0;

			std::vector<WORD> ordinals( name_count );
			if ( !read(
				module_base + export_directory.m_address_of_names_ordinals,
				ordinals.data( ),
				name_count * sizeof( WORD )
			) ) return 0;

			if ( ordinals.empty( ) )
				return 0;

			for ( auto idx = 0; idx < name_count; idx++ ) {
				char name_buffer [ 256 ] = { 0 };
				if ( !read( module_base + names [ idx ], name_buffer, sizeof( name_buffer ) - 1 ) )
					continue;

				if ( strcmp( name_buffer, export_name ) == 0 ) {
					auto ordinal = ordinals [ idx ];
					if ( ordinal >= function_count ) {
						return 0;
					}

					return module_base + functions [ ordinal ];
				}
			}

			return 0;
		}

		void cleanup( ) {
			if ( m_request_semaphore ) {
				CloseHandle( m_request_semaphore );
				m_request_semaphore = nullptr;
			}

			if ( m_response_semaphore ) {
				CloseHandle( m_response_semaphore );
				m_response_semaphore = nullptr;
			}
		}

		template<typename T>
		T read_chain( u64 virtual_address, std::vector<u64> offsets )
		{
			u64 current_address = virtual_address;
			if ( !memory::is_valid( current_address ) )
				return T( );

			for ( size_t index = 0; index < offsets.size( ) - 1; index++ )
			{
				if ( !memory::is_valid( current_address ) )
					return T( );

				u64 offset = offsets [ index ];
				current_address = read<u64>( current_address + offset );
			}

			if ( !memory::is_valid( current_address ) ) return T( );

			return read<T>( current_address + offsets [ offsets.size( ) - 1 ] );
		}

		std::string read_string( u64 virtual_address )
		{
			char buffer [ 255 ] = { 0 };

			if ( !read_virtual( buffer, virtual_address, sizeof( buffer ) ) )
				return { };

			// set null terminator
			buffer [ sizeof( buffer ) - 1 ] = '\0';
			return buffer;
		}

		inline uint64_t pattern_scan( uint64_t module, const char* signature, const char* sectionName = nullptr, int skip = 0 )
		{
			static auto pattern_to_byte = [ ] ( const char* pattern ) {
				auto bytes = std::vector<int> {};
				auto start = const_cast< char* >( pattern );
				auto end = const_cast< char* >( pattern ) + strlen( pattern );

				for ( auto current = start; current < end; ++current ) {
					if ( *current == '?' ) {
						++current;
						if ( *current == '?' )
							++current;
						bytes.push_back( -1 );
					}
					else {
						bytes.push_back( strtoul( current, &current, 16 ) );
					}
				}
				return bytes;
				};

			auto dosHeader = ( PIMAGE_DOS_HEADER ) module;
			auto ntHeaders = ( PIMAGE_NT_HEADERS ) ( ( std::uint8_t* ) module + dosHeader->e_lfanew );
			auto patternBytes = pattern_to_byte( signature );
			auto s = patternBytes.size( );
			auto d = patternBytes.data( );
			int currentskip = 0;

			if ( !sectionName ) {
				auto sizeOfImage = ntHeaders->OptionalHeader.SizeOfImage;
				auto scanBytes = reinterpret_cast< std::uint8_t* >( module );

				for ( auto i = 0ul; i < sizeOfImage - s; ++i ) {
					if ( currentskip < skip ) {
						currentskip++;
						continue;
					}

					bool found = true;
					for ( auto j = 0ul; j < s; ++j ) {
						if ( scanBytes [ i + j ] != d [ j ] && d [ j ] != -1 ) {
							found = false;
							break;
						}
					}
					if ( found ) {
						return ( uintptr_t ) &scanBytes [ i ];
					}
				}
			}
			else {
				auto sectionHeader = IMAGE_FIRST_SECTION( ntHeaders );
				for ( WORD i = 0; i < ntHeaders->FileHeader.NumberOfSections; ++i, ++sectionHeader ) {
					if ( strncmp( reinterpret_cast< const char* >( sectionHeader->Name ), sectionName, IMAGE_SIZEOF_SHORT_NAME ) == 0 ) {
						auto sectionStart = reinterpret_cast< std::uint8_t* >( module ) + sectionHeader->VirtualAddress;
						auto sectionSize = sectionHeader->Misc.VirtualSize;

						DWORD;

						for ( auto j = 0ul; j < sectionSize - s; ++j ) {
							bool found = true;
							for ( auto k = 0ul; k < s; ++k ) {
								if ( sectionStart [ j + k ] != d [ k ] && d [ k ] != -1 ) {
									found = false;
									break;
								}
							}
							if ( found ) {
								if ( currentskip < skip ) {
									currentskip++;
									continue;
								}
								return ( uintptr_t ) &sectionStart [ j ];
							}
						}
						break;
					}
				}
			}
			return ( uintptr_t )nullptr;
		}

	private:
		HKEY m_registry_key;
		control::control_data_t* m_control_data { };
		nt_update_wnf_state_data_t m_nt_update_wnf_state_data { };
		WNF_STATE_NAME_INTERNAL m_state_name { };
		HANDLE m_response_semaphore { nullptr };
		HANDLE m_request_semaphore { nullptr };
		SRWLOCK m_request_lock { }; // we don't need this spin locking but it's for synchorization (it will lower reading speeds)

		bool send_control( int timeout_ms = 1000 ) {
			AcquireSRWLockExclusive( &m_request_lock );
			ReleaseSemaphore( m_request_semaphore, 1, nullptr );

			if ( m_nt_update_wnf_state_data(
				reinterpret_cast< WNF_STATE_NAME* >( &m_state_name ),
				nullptr,
				0,
				nullptr,
				nullptr,
				0,
				false
			) ) {
				ReleaseSRWLockExclusive( &m_request_lock );
				return false;
			}

			if ( WaitForSingleObject( m_response_semaphore, timeout_ms ) != WAIT_OBJECT_0 ) {
				ReleaseSRWLockExclusive( &m_request_lock );
				return false;
			}

			ReleaseSRWLockExclusive( &m_request_lock );
			return true;
		}
	};
} inline auto g_vm = std::make_shared<driver::c_driver>( );