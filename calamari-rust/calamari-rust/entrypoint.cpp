#pragma once
#include <impl/includes.hpp>

auto main( int argc, char* argv[] ) -> int
{
#ifdef TEST
	logging::console( HASH_STR( "rust" ) );
#else
	HWND console = LI_FN( GetConsoleWindow ).safe_cached( )( );
	::ShowWindow( console, SW_HIDE );
#endif // TEST

	if ( argc != 3 )
		logging::error_box( 0 );

	auto monoauth_status = monoauth->create_session( argv [ 1 ] );

	if ( !monoauth_status.has_value( ) )
	{
		switch ( monoauth_status.error( ) )
		{
		case monoauth_interface::session_setup_error_code::create_error:
			logging::error_box( 1 );
			break;
		case monoauth_interface::session_setup_error_code::odd_response:
			logging::error_box( 2 );
			break;
		}
	}

	auto brand_status = monoauth->session->get_brand( std::stoi( argv [ 2 ] ) );

	if ( !brand_status.has_value( ) )
	{
		switch ( brand_status.error( ) )
		{
		case monoauth_interface::brand_setup_error_code::get_error:
			logging::error_box( 3 );
			break;
		case monoauth_interface::brand_setup_error_code::odd_response:
			logging::error_box( 4 );
			break;
		}
	}

	auto zydis_status = zydis->setup( );

	switch ( zydis_status )
	{
	case zydis_interface::setup_error_code::decoder_error:
		logging::error_box( 100 );
		break;
	case zydis_interface::setup_error_code::formatter_error:
		logging::error_box( 101 );
		break;
	case zydis_interface::setup_error_code::setup_success:
		break;
	}

	while ( !g_vm->get_process_id( HASH_STR( L"RustClient.exe" ) ) ) {
		Sleep( 1 );
	}

	auto vm_status = g_vm->attach_process( HASH_STR( L"RustClient.exe" ) );

	switch ( vm_status )
	{
	case driver::setup_code::create_error:
		logging::error_box( 600 );
		break;
	case driver::setup_code::initialize_error:
		logging::error_box( 601 );
		break;
	case driver::setup_code::active_error:
		logging::error_box( 602 );
		break;
	case driver::setup_code::process_id_error:
		logging::error_box( 603 );
		break;
	case driver::setup_code::eproccess_error:
		logging::error_box( 604 );
		break;
	case driver::setup_code::base_address_error:
		logging::error_box( 605 );
		break;
	case driver::setup_code::directory_table_base_error:
		logging::error_box( 606 );
		break;
	case driver::setup_code::game_assembly_error:
		logging::error_box( 607 );
		break;
	case driver::setup_code::unity_player_error:
		logging::log( HASH_STR( "UnityPlayer.dll is missing!" ) );
		break;
	}

	auto render_status = render->setup( HASH_STR( L"RustClient.exe" ) );

	switch ( render_status )
	{
	case render_interface::setup_error_code::process_not_found:
		logging::error_box( 700 );
		break;
	case render_interface::setup_error_code::game_window_not_found:
		logging::error_box( 701 );
		break;
	case render_interface::setup_error_code::game_window_dimensions_error:
		logging::error_box( 702 );
		break;
	case render_interface::setup_error_code::bobi_error:
		logging::error_box( 703 );
		break;
	case render_interface::setup_error_code::overlay_process_not_found:
		logging::error_box( 704 );
		break;
	case render_interface::setup_error_code::d3d11_error:
		logging::error_box( 705 );
		break;
	case render_interface::setup_error_code::imgui_win32_error:
		logging::error_box( 706 );
		break;
	case render_interface::setup_error_code::imgui_d3d11_error:
		logging::error_box( 707 );
		break;
	case render_interface::setup_error_code::setup_success:
		logging::log( HASH_STR( "Render successfuly setup!" ) );
		break;
	}

	std::jthread( [ & ] ( ) -> void { render->render_thread( ); } ).detach( );

	std::jthread( [ & ] ( ) -> void { entities->cache_thread( ); } ).detach( );

	std::jthread( [ & ] ( ) -> void { entities->update_thread( ); } ).detach( );

	std::jthread( [ & ] ( ) -> void { env->first_thread( ); } ).detach( );

	Sleep( -1 );

	return std::cin.get( ) != EOF ? false : true;
}