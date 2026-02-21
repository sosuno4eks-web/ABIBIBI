#pragma once

#include <cstdint>

namespace settings {
	inline bool running = true;

	namespace esp {
		inline bool on = true;
		inline float max_distance = 400.0f;
	}

	namespace radar {
		inline bool on = true;
		inline float max_distance = 400.0f;
	}

	namespace misc {

	}

	namespace system {
		int screen_x = 1920;
		int screen_y = 1080;
	}
}