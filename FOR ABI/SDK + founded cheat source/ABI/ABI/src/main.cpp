#include <iostream>
#include <print>
#include "skcrypt/xor.hpp"
#include "game/cache.hpp"
#include <overlay/overlay.hpp>
#include "game/rendering.hpp"

int main() {
	std::thread(cache::cache_loop).detach();
	std::thread(cache::cache_important_loop).detach();
	std::thread(cache::cache_player_loop).detach();

	std::cin.get();
	return 0;
}