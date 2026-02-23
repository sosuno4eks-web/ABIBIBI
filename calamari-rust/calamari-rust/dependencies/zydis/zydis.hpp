#ifndef ZYDIS_HPP
#define ZYDIS_HPP

#define NODE(mnemonic, ...) zydis_interface::c_instruction_node{ mnemonic, { __VA_ARGS__ } }

namespace zydis_interface {

    struct c_instruction_node {
        ZydisMnemonic_ mnemonic;
        std::vector<ZydisRegister_> operands;
    };

    struct c_instruction {
        uint64_t address;

        c_instruction* previous;
        c_instruction* next;

        ZydisDecodedInstruction instruction;

        ZydisDecodedOperand operand [ ZYDIS_MAX_OPERAND_COUNT ];
        char buffer [ 256 ];
    };

    enum class setup_error_code {
        decoder_error,
        formatter_error,
        setup_success,
    };

    class c_zydis {
    private:
        ZydisDecoder decoder;
        ZydisFormatter formatter;

    public:
        c_zydis( ) = default;
        ~c_zydis( ) = default;

        [[nodiscard]] setup_error_code setup( );

        bool operand_matches( ZydisDecodedOperand& op, ZydisRegister expected, bool debug = false );

        uint64_t register_to_opocode_absoulte( const ZydisRegister& reg );

        c_instruction* find_instruction( uint64_t va, const std::optional<c_instruction_node>& prev_node, const c_instruction_node& curr_node, const std::optional<c_instruction_node>& next_node, uint32_t bytes = 0x500, bool reverse = false, bool debug = false );
        c_instruction* get_instruction( uint64_t va, uint32_t bytes = 0x100, bool debug = false );

        uint64_t get_call_mnemonic_va( c_instruction* instruction );
        uint64_t calculate_absolute_address( c_instruction* instruction, uint32_t operand, uint64_t image );
    };

} inline auto zydis = std::make_shared<zydis_interface::c_zydis>( );

#endif // !ZYDIS_HPP
