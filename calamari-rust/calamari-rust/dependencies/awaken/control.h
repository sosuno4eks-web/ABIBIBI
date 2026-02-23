#pragma once

namespace driver {
    namespace paging {
        constexpr auto page_4kb_size = 0x1000ull;
        constexpr auto page_2mb_size = 0x200000ull;
        constexpr auto page_1gb_size = 0x40000000ull;

        constexpr auto page_shift = 12ull;
        constexpr auto page_2mb_shift = 21ull;
        constexpr auto page_1gb_shift = 30ull;

        constexpr auto page_4kb_mask = 0xFFFull;
        constexpr auto page_2mb_mask = 0x1FFFFFull;
        constexpr auto page_1gb_mask = 0x3FFFFFFFull;

        struct pt_entries_t {
            pml4e m_pml4e;
            pdpte m_pdpte;
            pde m_pde;
            pte m_pte;
        };

        enum class page_protection : std::uint8_t {
            readwrite_execute = 0,
            readwrite,
            inaccessible
        };

        inline std::unordered_map< std::uint64_t,
            std::pair<std::uint64_t, std::uint32_t> > m_virtual_address_space;
    }

    namespace control {
        struct control_initialize_t {
            std::uint64_t m_process_id;
            std::uint64_t m_base_address;
            void* m_response_semaphore;
            void* m_request_semaphore;
        };

        enum control_type {
            none = 0,
            verify,
            get_eprocess,
            get_process_peb,
            get_base_address,
            get_directory_table_base,
            hyperspace_entries,
            map_process_page,
            read_physical,
            write_physical,
            unload_driver
        };

        struct control_data_t {
            control_type m_request_type;
            paging::pt_entries_t m_pt_entries;
            pml4e m_pml4e;
            pdpte m_pdpte;
            pde m_pde;
            pte m_pte;
            std::uint32_t m_process_id;
            eprocess_t* m_process;
            peb_t* m_process_peb;
            std::uint64_t m_address;
            std::uint64_t m_address1;
            void* m_address2;
            std::size_t m_size;
        };
    }
}