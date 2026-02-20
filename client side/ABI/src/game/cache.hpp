#pragma once

#include <driver/driver.hpp>
#include <game/offsets.hpp>
#include <driver/xor.hpp>
#include <print>
#include <thread>
#include <chrono>
#include <game/structs.hpp>
#include <game/settings.hpp>
#include <vector>
#include <game/sdk.hpp>

namespace cache {
	inline uintptr_t UWorld = 0;
	inline uintptr_t UGameInstance = 0;
	inline uintptr_t PersistentLevel = 0;
	inline uintptr_t ActorArray = 0;
	inline int ActorCount = 0;
	inline uintptr_t LocalPlayers = 0;
	inline uintptr_t PlayerController = 0;
	inline uintptr_t GameState = 0;
	inline uintptr_t PlayerArray = 0;
	inline int PlayerCount = 0;

	namespace Local {
		inline uintptr_t LocalUPawn = 0;
		inline uintptr_t LocalRootComponent = 0;
		inline uintptr_t LocalPlayerState = 0;
		inline uintptr_t LocalPlayerCameraManager = 0;
		inline FVector Location = {};

		namespace CameraData {
			inline FMinimalViewInfo Camera = {};
		}
	}

	std::vector<Player> ActorList;

	void clear_cache() {
		UWorld = 0;
		UGameInstance = 0;
		LocalPlayers = 0;
		PlayerController = 0;
		GameState = 0;
		PlayerArray = 0;
		PlayerCount = 0;
		ActorArray = 0;
		ActorCount = 0;
		Local::LocalUPawn = 0;
		Local::LocalRootComponent = 0;
		Local::LocalPlayerState = 0;
		Local::LocalPlayerCameraManager = 0;
		Local::Location = {};
		Local::CameraData::Camera = {};
	}

	bool cache() {
		UWorld = mem.Read<uintptr_t>(mem.BaseAddress + offsets::game::OFFSET_GWORLD);
		if (!UWorld) {
			LOG("Failed to get UWorld");
			clear_cache();
			return false;
		}

		UGameInstance = mem.Read<uintptr_t>(UWorld + offsets::UWorld::OwningGameInstance);
		GameState = mem.Read<uintptr_t>(UWorld + offsets::UWorld::GameState);
		PersistentLevel = mem.Read<uintptr_t>(UWorld + offsets::UWorld::PersistentLevel);
		if (!UGameInstance || !GameState || !PersistentLevel) {
			LOG("Failed to get gameinstance");
			LOG("Failed to get gamestate");
			LOG("Failed to get persistentlevel");
			clear_cache();
			return false;
		}

		// can bruteforce this offset if needed just a TArray
		ActorArray = mem.Read<uintptr_t>(PersistentLevel + offsets::ULevel::ActorArray);
		ActorCount = mem.Read<int>(PersistentLevel + (offsets::ULevel::ActorArray + sizeof(uintptr_t)));

		if (!ActorArray || !ActorCount) {
			LOG("Failed to get actor array");
			LOG("Failed to get actor count");
			clear_cache();
			return false;
		}

		LocalPlayers = mem.Read<uintptr_t>(mem.Read<uintptr_t>(UGameInstance + offsets::UGameInstance::LocalPlayers));
		if (!LocalPlayers) {
			LOG("Failed to get localplayers");
			clear_cache();
			return false;
		}

		PlayerController = mem.Read<uintptr_t>(LocalPlayers + offsets::UPlayer::PlayerController); // LocalPlayers inherits UPlayer
		if (!PlayerController) {
			LOG("failed to get player controller");
			clear_cache();
			return false;
		}

		Local::LocalPlayerCameraManager = mem.Read<uintptr_t>(PlayerController + offsets::APlayerController::PlayerCameraManager);
		if (!Local::LocalPlayerCameraManager) {
			LOG("failed to get camera manager");
			clear_cache();
			return false;
		}

		Local::LocalUPawn = mem.Read<uintptr_t>(PlayerController + offsets::APlayerController::AcknowledgedPawn);
		if (!Local::LocalUPawn) {
			LOG("Failed to get local upawn");
			clear_cache();
			return false;
		}

		Local::LocalRootComponent = mem.Read<uintptr_t>(Local::LocalUPawn + offsets::AActor::RootComponent); // APawn inherits from AActor
		if (!Local::LocalRootComponent) {
			LOG("Failed to get local root component");
			clear_cache();
			return false;
		}

		PlayerArray = mem.Read<uintptr_t>(GameState + offsets::AGameStateBase::PlayerArray);
		PlayerCount = mem.Read<int>(GameState + (offsets::AGameStateBase::PlayerArray + sizeof(uintptr_t)));

		if (!PlayerArray || !PlayerCount) {
			LOG("Failed to get player array or player count");
			clear_cache();
			return false;
		}

		return true;
	}

	bool cache_camera() {
		if (!UWorld || !Local::LocalPlayerCameraManager) {
			return false;
		}

		// CameraCachePrivate + 0x10 = a fminimalviewinfo
		Local::CameraData::Camera = mem.Read<FMinimalViewInfo>(Local::LocalPlayerCameraManager + offsets::APlayerCameraManager::CameraCachePrivate + 0x10);

		return true;
	}

	bool cache_localplayer() {
		if (!UWorld || !Local::LocalPlayerCameraManager || !Local::LocalUPawn || !Local::LocalRootComponent)
			return false;

		Local::Location = mem.Read<FVector>(Local::LocalRootComponent + offsets::USceneComponent::RelativeLocation);
	}

	Player get_player(uintptr_t pawn, uint32_t object_id, std::string object_name) {
		uintptr_t mesh = mem.Read<uintptr_t>(pawn + offsets::ACharacter::Mesh);
		uintptr_t playerstate = mem.Read<uintptr_t>(pawn + offsets::APawn::PlayerState);
		uintptr_t rootcomponent = mem.Read<uintptr_t>(pawn + offsets::AActor::RootComponent);

		if (!mesh) {
			return {};
		}

		if (!rootcomponent) {
			return {};
		}

		Player player;
		player.actor_pawn = pawn;
		player.actor_mesh = mesh;
		player.actor_state = playerstate;
		player.actor_id = object_id;
		player.actor_name = object_name;
		player.actor_rootcomponent = rootcomponent;

		if (object_name.contains("BP_UamAICharacter")) {
			player.bot = true;
		}

		return player;
	}

	bool cache_players() {
		if (!ActorArray || !ActorCount)
			return false;

		std::vector<Player> player_array;

		for (int i = 0; i < ActorCount; i++) {
			uintptr_t pawn = mem.Read<uintptr_t>(ActorArray + i * 8);
			if (pawn == Local::LocalUPawn) {
				continue;
			}

			uint32_t object_id = mem.Read<uint32_t>(pawn + 24);
			std::string object_name = sdk::GetNameFromFName(object_id);

			if (object_name.contains("BP_UamCharacter")  || object_name.contains("BP_UamAICharacter")  || object_name.contains("BP_UamRangeCharacter_C")) {
				Player player = get_player(pawn, object_id, object_name);
				if (player.actor_mesh || player.actor_rootcomponent) {
					player_array.push_back(player);
				}
			}
		}
		ActorList = player_array;
	}

	void cache_loop() {
		int loop_count = 0;
		while (settings::running) {
			cache();
			loop_count++;
			if (loop_count >= 5) {
				loop_count = 0;
			}
			std::this_thread::sleep_for(std::chrono::milliseconds(50));
		}
	}

	void cache_important_loop() {
		while (settings::running) {
			cache_camera();
			cache_localplayer();
			std::this_thread::sleep_for(std::chrono::milliseconds(2));
		}
	}

	void cache_player_loop() {
		while (settings::running) {
			cache_players();
			std::this_thread::sleep_for(std::chrono::milliseconds(55));
		}
	}
}