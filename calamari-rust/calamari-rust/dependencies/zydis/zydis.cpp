#ifndef ZYDIS_CPP
#define ZYDIS_CPP

#include <impl/includes.hpp>

auto zydis_interface::c_zydis::setup( ) -> setup_error_code
{
    ZyanStatus decoder_status = ZydisDecoderInit( &decoder, ZYDIS_MACHINE_MODE_LONG_64, ZYDIS_STACK_WIDTH_64 );
    if ( !ZYAN_SUCCESS( decoder_status ) )
        return setup_error_code::decoder_error;

    ZyanStatus formatter_status = ZydisFormatterInit( &formatter, ZYDIS_FORMATTER_STYLE_INTEL );
    if ( !ZYAN_SUCCESS( decoder_status ) )
        return setup_error_code::formatter_error;

    return setup_error_code::setup_success;
}

auto zydis_interface::c_zydis::operand_matches( ZydisDecodedOperand& op, ZydisRegister expected, bool debug ) -> bool
{
    switch ( op.type )
    {
    case ZYDIS_OPERAND_TYPE_REGISTER:
        return op.reg.value == expected;

    case ZYDIS_OPERAND_TYPE_MEMORY:
        if ( op.mem.base == expected )
            return true;
        return false;

    case ZYDIS_OPERAND_TYPE_IMMEDIATE:
        return expected == ZYDIS_REGISTER_NONE;

    default:
        return false;
    }
}

auto zydis_interface::c_zydis::register_to_opocode_absoulte( const ZydisRegister& reg ) -> uint64_t
{
    switch ( reg )
    {
    case ZydisRegister::ZYDIS_REGISTER_RAX:
        return 0xB8;
        break;
    case ZydisRegister::ZYDIS_REGISTER_RBX:
        return 0xBB;
        break;
    }

    return 0x0;
}

auto zydis_interface::c_zydis::find_instruction( uint64_t va, const std::optional<c_instruction_node>& prev_node, const c_instruction_node& curr_node, const std::optional<c_instruction_node>& next_node, uint32_t bytes, bool reverse, bool debug ) -> c_instruction*
{
    std::vector<c_instruction> decoded;
    ZydisDecodedInstruction instruction;
    ZydisDecodedOperand operands [ ZYDIS_MAX_OPERAND_COUNT ];

    uint64_t region_start = reverse ? va - bytes : va;
    uint64_t region_end = reverse ? va : va + bytes;
    uint64_t current_addr = region_start;

    while ( ZYAN_SUCCESS( ZydisDecoderDecodeFull( &decoder, ( void* ) current_addr, region_end - current_addr,
        &instruction, operands ) ) )
    {
        c_instruction inst {};

        inst.address = current_addr;
        inst.instruction = instruction;
        memcpy( inst.operand, operands, sizeof( operands ) );

        ZydisFormatterFormatInstruction( &formatter, &instruction, operands, instruction.operand_count_visible,
            inst.buffer, sizeof( inst.buffer ), current_addr, ZYAN_NULL );

        if ( debug ) printf( "%s\n", inst.buffer );

        decoded.push_back( inst );

        current_addr += instruction.length;
        if ( current_addr >= region_end )
            break;
    }

    if ( reverse )
        std::reverse( decoded.begin( ), decoded.end( ) );

    for ( size_t i = 0; i < decoded.size( ); i++ )
    {
        c_instruction* previous = ( i > 0 ) ? &decoded [ i - 1 ] : nullptr;
        c_instruction current = decoded [ i ];
        c_instruction* next = ( i + 1 < decoded.size( ) ) ? &decoded [ i + 1 ] : nullptr;

        auto matches = [ & ] ( const c_instruction_node& node, const c_instruction& ins ) -> bool {
            if ( ins.instruction.mnemonic != node.mnemonic )
                return false;

            for ( size_t idx = 0; idx < node.operands.size( ); idx++ )
            {
                if ( !operand_matches( const_cast< ZydisDecodedOperand& >( ins.operand [ idx ] ), node.operands [ idx ], debug ) )
                    return false;
            }
            return true;
            };

        if ( !matches( curr_node, current ) )
            continue;

        bool ok_prev = !prev_node.has_value( ) || ( previous && matches( *prev_node, *previous ) );
        bool ok_next = !next_node.has_value( ) || ( next && matches( *next_node, *next ) );

        if ( ok_prev && ok_next )
        {
            if ( previous )
                current.previous = new c_instruction( *previous );

            if ( next )
                current.next = new c_instruction( *next );

            return new c_instruction( current );
        }
    }

    return nullptr;
}

auto zydis_interface::c_zydis::get_instruction( uint64_t va, uint32_t bytes, bool debug ) -> c_instruction*
{
    ZyanU64 runtime_address = va;
    ZydisDecodedOperand operands [ ZYDIS_MAX_OPERAND_COUNT ];

    ZydisDecodedInstruction instruction;

    if ( ZYAN_SUCCESS( ZydisDecoderDecodeFull( &decoder, ( void* ) runtime_address, bytes, &instruction, operands ) ) )
    {
        auto inst = new c_instruction( );

        inst->address = runtime_address;
        inst->instruction = instruction;
        memcpy( inst->operand, operands, sizeof( operands ) );

        ZydisFormatterFormatInstruction( &formatter, &instruction, operands, instruction.operand_count_visible, inst->buffer, sizeof( inst->buffer ), runtime_address, ZYAN_NULL );

        if ( debug ) printf( HASH_STR( "%s\n" ), inst->buffer );

        runtime_address += instruction.length;
        return inst;
    }

    return nullptr;
}

auto zydis_interface::c_zydis::get_call_mnemonic_va( c_instruction* instruction ) -> uint64_t
{
    return instruction->address + instruction->instruction.length + instruction->operand [ 0 ].imm.value.s;
}

auto zydis_interface::c_zydis::calculate_absolute_address( c_instruction* instruction, uint32_t operand, uint64_t image ) -> uint64_t
{
    ZyanU64 result_address = 0;

    if ( ZYAN_SUCCESS( ZydisCalcAbsoluteAddress(
        &instruction->instruction,
        &instruction->operand [ operand ],
        instruction->address,
        &result_address ) ) ) {
        return result_address - image;
    }

    return 0;
}

#endif // !ZYDIS_CPP
