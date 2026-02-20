
/********************************************************
*                                                       *
*   Package generated using UEDumper by Spuckwaffel.    *
*                                                       *
********************************************************/

#pragma once
/// dependency: BasicType
/// dependency: CoreUObject
/// dependency: Engine
/// dependency: MovieScene
/// dependency: PhysicsCore
/// dependency: SlateCore
/// dependency: UMG

/// Enum /Script/AkAudio.EAkCallbackType
/// Size: 0x01 (1 bytes)
enum class EAkCallbackType : uint8_t
{
	EAkCallbackType__EndOfEvent                                                      = 0,
	EAkCallbackType__Marker                                                          = 2,
	EAkCallbackType__Duration                                                        = 3,
	EAkCallbackType__Starvation                                                      = 5,
	EAkCallbackType__MusicPlayStarted                                                = 7,
	EAkCallbackType__MusicSyncBeat                                                   = 8,
	EAkCallbackType__MusicSyncBar                                                    = 9,
	EAkCallbackType__MusicSyncEntry                                                  = 10,
	EAkCallbackType__MusicSyncExit                                                   = 11,
	EAkCallbackType__MusicSyncGrid                                                   = 12,
	EAkCallbackType__MusicSyncUserCue                                                = 13,
	EAkCallbackType__MusicSyncPoint                                                  = 14,
	EAkCallbackType__MIDIEvent                                                       = 16
};

/// Enum /Script/AkAudio.EAkResult
/// Size: 0x01 (1 bytes)
enum class EAkResult : uint8_t
{
	EAkResult__NotImplemented                                                        = 0,
	EAkResult__Success                                                               = 1,
	EAkResult__Fail                                                                  = 2,
	EAkResult__PartialSuccess                                                        = 3,
	EAkResult__NotCompatible                                                         = 4,
	EAkResult__AlreadyConnected                                                      = 5,
	EAkResult__InvalidFile                                                           = 7,
	EAkResult__AudioFileHeaderTooLarge                                               = 8,
	EAkResult__MaxReached                                                            = 9,
	EAkResult__InvalidID                                                             = 14,
	EAkResult__IDNotFound                                                            = 15,
	EAkResult__InvalidInstanceID                                                     = 16,
	EAkResult__NoMoreData                                                            = 17,
	EAkResult__InvalidStateGroup                                                     = 20,
	EAkResult__ChildAlreadyHasAParent                                                = 21,
	EAkResult__InvalidLanguage                                                       = 22,
	EAkResult__CannotAddItseflAsAChild                                               = 23,
	EAkResult__InvalidParameter                                                      = 31,
	EAkResult__ElementAlreadyInList                                                  = 35,
	EAkResult__PathNotFound                                                          = 36,
	EAkResult__PathNoVertices                                                        = 37,
	EAkResult__PathNotRunning                                                        = 38,
	EAkResult__PathNotPaused                                                         = 39,
	EAkResult__PathNodeAlreadyInList                                                 = 40,
	EAkResult__PathNodeNotInList                                                     = 41,
	EAkResult__DataNeeded                                                            = 43,
	EAkResult__NoDataNeeded                                                          = 44,
	EAkResult__DataReady                                                             = 45,
	EAkResult__NoDataReady                                                           = 46,
	EAkResult__InsufficientMemory                                                    = 52,
	EAkResult__Cancelled                                                             = 53,
	EAkResult__UnknownBankID                                                         = 54,
	EAkResult__BankReadError                                                         = 56,
	EAkResult__InvalidSwitchType                                                     = 57,
	EAkResult__FormatNotReady                                                        = 63,
	EAkResult__WrongBankVersion                                                      = 64,
	EAkResult__FileNotFound                                                          = 66,
	EAkResult__DeviceNotReady                                                        = 67,
	EAkResult__BankAlreadyLoaded                                                     = 69,
	EAkResult__RenderedFX                                                            = 71,
	EAkResult__ProcessNeeded                                                         = 72,
	EAkResult__ProcessDone                                                           = 73,
	EAkResult__MemManagerNotInitialized                                              = 74,
	EAkResult__StreamMgrNotInitialized                                               = 75,
	EAkResult__SSEInstructionsNotSupported                                           = 76,
	EAkResult__Busy                                                                  = 77,
	EAkResult__UnsupportedChannelConfig                                              = 78,
	EAkResult__PluginMediaNotAvailable                                               = 79,
	EAkResult__MustBeVirtualized                                                     = 80,
	EAkResult__CommandTooLarge                                                       = 81,
	EAkResult__RejectedByFilter                                                      = 82,
	EAkResult__InvalidCustomPlatformName                                             = 83,
	EAkResult__DLLCannotLoad                                                         = 84,
	EAkResult__DLLPathNotFound                                                       = 85,
	EAkResult__NoJavaVM                                                              = 86,
	EAkResult__OpenSLError                                                           = 87,
	EAkResult__PluginNotRegistered                                                   = 88,
	EAkResult__DataAlignmentError                                                    = 89
};

/// Enum /Script/AkAudio.EAkAndroidAudioAPI
/// Size: 0x01 (1 bytes)
enum class EAkAndroidAudioAPI : uint8_t
{
	EAkAndroidAudioAPI__AAudio                                                       = 0,
	EAkAndroidAudioAPI__OpenSL_ES                                                    = 1
};

/// Enum /Script/AkAudio.EAkAudioSessionMode
/// Size: 0x04 (4 bytes)
enum class EAkAudioSessionMode : uint32_t
{
	EAkAudioSessionMode__Default                                                     = 0,
	EAkAudioSessionMode__VoiceChat                                                   = 1,
	EAkAudioSessionMode__GameChat                                                    = 2,
	EAkAudioSessionMode__VideoRecording                                              = 3,
	EAkAudioSessionMode__Measurement                                                 = 4,
	EAkAudioSessionMode__MoviePlayback                                               = 5,
	EAkAudioSessionMode__VideoChat                                                   = 6
};

/// Enum /Script/AkAudio.EAkAudioSessionCategoryOptions
/// Size: 0x01 (1 bytes)
enum class EAkAudioSessionCategoryOptions : uint8_t
{
	EAkAudioSessionCategoryOptions__MixWithOthers                                    = 0,
	EAkAudioSessionCategoryOptions__DuckOthers                                       = 1,
	EAkAudioSessionCategoryOptions__AllowBluetooth                                   = 2,
	EAkAudioSessionCategoryOptions__DefaultToSpeaker                                 = 3
};

/// Enum /Script/AkAudio.EAkAudioSessionCategory
/// Size: 0x04 (4 bytes)
enum class EAkAudioSessionCategory : uint32_t
{
	EAkAudioSessionCategory__Ambient                                                 = 0,
	EAkAudioSessionCategory__SoloAmbient                                             = 1,
	EAkAudioSessionCategory__PlayAndRecord                                           = 2
};

/// Enum /Script/AkAudio.EReflectionFilterBits
/// Size: 0x01 (1 bytes)
enum class EReflectionFilterBits : uint8_t
{
	EReflectionFilterBits__Wall                                                      = 0,
	EReflectionFilterBits__Ceiling                                                   = 1,
	EReflectionFilterBits__Floor                                                     = 2
};

/// Enum /Script/AkAudio.AkCodecId
/// Size: 0x01 (1 bytes)
enum class AkCodecId : uint8_t
{
	AkCodecId__None                                                                  = 0,
	AkCodecId__PCM                                                                   = 1,
	AkCodecId__ADPCM                                                                 = 2,
	AkCodecId__XMA                                                                   = 3,
	AkCodecId__Vorbis                                                                = 4,
	AkCodecId__AAC                                                                   = 10,
	AkCodecId__ATRAC9                                                                = 12,
	AkCodecId__OpusNX                                                                = 17,
	AkCodecId__AkOpus                                                                = 19,
	AkCodecId__AkOpusWEM                                                             = 20
};

/// Enum /Script/AkAudio.EAkMidiCcValues
/// Size: 0x01 (1 bytes)
enum class EAkMidiCcValues : uint8_t
{
	EAkMidiCcValues__AkMidiCcBankSelectCoarse                                        = 0,
	EAkMidiCcValues__AkMidiCcModWheelCoarse                                          = 1,
	EAkMidiCcValues__AkMidiCcBreathCtrlCoarse                                        = 2,
	EAkMidiCcValues__AkMidiCcCtrl3Coarse                                             = 3,
	EAkMidiCcValues__AkMidiCcFootPedalCoarse                                         = 4,
	EAkMidiCcValues__AkMidiCcPortamentoCoarse                                        = 5,
	EAkMidiCcValues__AkMidiCcDataEntryCoarse                                         = 6,
	EAkMidiCcValues__AkMidiCcVolumeCoarse                                            = 7,
	EAkMidiCcValues__AkMidiCcBalanceCoarse                                           = 8,
	EAkMidiCcValues__AkMidiCcCtrl9Coarse                                             = 9,
	EAkMidiCcValues__AkMidiCcPanPositionCoarse                                       = 10,
	EAkMidiCcValues__AkMidiCcExpressionCoarse                                        = 11,
	EAkMidiCcValues__AkMidiCcEffectCtrl1Coarse                                       = 12,
	EAkMidiCcValues__AkMidiCcEffectCtrl2Coarse                                       = 13,
	EAkMidiCcValues__AkMidiCcCtrl14Coarse                                            = 14,
	EAkMidiCcValues__AkMidiCcCtrl15Coarse                                            = 15,
	EAkMidiCcValues__AkMidiCcGenSlider1                                              = 16,
	EAkMidiCcValues__AkMidiCcGenSlider2                                              = 17,
	EAkMidiCcValues__AkMidiCcGenSlider3                                              = 18,
	EAkMidiCcValues__AkMidiCcGenSlider4                                              = 19,
	EAkMidiCcValues__AkMidiCcCtrl20Coarse                                            = 20,
	EAkMidiCcValues__AkMidiCcCtrl21Coarse                                            = 21,
	EAkMidiCcValues__AkMidiCcCtrl22Coarse                                            = 22,
	EAkMidiCcValues__AkMidiCcCtrl23Coarse                                            = 23,
	EAkMidiCcValues__AkMidiCcCtrl24Coarse                                            = 24,
	EAkMidiCcValues__AkMidiCcCtrl25Coarse                                            = 25,
	EAkMidiCcValues__AkMidiCcCtrl26Coarse                                            = 26,
	EAkMidiCcValues__AkMidiCcCtrl27Coarse                                            = 27,
	EAkMidiCcValues__AkMidiCcCtrl28Coarse                                            = 28,
	EAkMidiCcValues__AkMidiCcCtrl29Coarse                                            = 29,
	EAkMidiCcValues__AkMidiCcCtrl30Coarse                                            = 30,
	EAkMidiCcValues__AkMidiCcCtrl31Coarse                                            = 31,
	EAkMidiCcValues__AkMidiCcBankSelectFine                                          = 32,
	EAkMidiCcValues__AkMidiCcModWheelFine                                            = 33,
	EAkMidiCcValues__AkMidiCcBreathCtrlFine                                          = 34,
	EAkMidiCcValues__AkMidiCcCtrl3Fine                                               = 35,
	EAkMidiCcValues__AkMidiCcFootPedalFine                                           = 36,
	EAkMidiCcValues__AkMidiCcPortamentoFine                                          = 37,
	EAkMidiCcValues__AkMidiCcDataEntryFine                                           = 38,
	EAkMidiCcValues__AkMidiCcVolumeFine                                              = 39,
	EAkMidiCcValues__AkMidiCcBalanceFine                                             = 40,
	EAkMidiCcValues__AkMidiCcCtrl9Fine                                               = 41,
	EAkMidiCcValues__AkMidiCcPanPositionFine                                         = 42,
	EAkMidiCcValues__AkMidiCcExpressionFine                                          = 43,
	EAkMidiCcValues__AkMidiCcEffectCtrl1Fine                                         = 44,
	EAkMidiCcValues__AkMidiCcEffectCtrl2Fine                                         = 45,
	EAkMidiCcValues__AkMidiCcCtrl14Fine                                              = 46,
	EAkMidiCcValues__AkMidiCcCtrl15Fine                                              = 47,
	EAkMidiCcValues__AkMidiCcCtrl20Fine                                              = 52,
	EAkMidiCcValues__AkMidiCcCtrl21Fine                                              = 53,
	EAkMidiCcValues__AkMidiCcCtrl22Fine                                              = 54,
	EAkMidiCcValues__AkMidiCcCtrl23Fine                                              = 55,
	EAkMidiCcValues__AkMidiCcCtrl24Fine                                              = 56,
	EAkMidiCcValues__AkMidiCcCtrl25Fine                                              = 57,
	EAkMidiCcValues__AkMidiCcCtrl26Fine                                              = 58,
	EAkMidiCcValues__AkMidiCcCtrl27Fine                                              = 59,
	EAkMidiCcValues__AkMidiCcCtrl28Fine                                              = 60,
	EAkMidiCcValues__AkMidiCcCtrl29Fine                                              = 61,
	EAkMidiCcValues__AkMidiCcCtrl30Fine                                              = 62,
	EAkMidiCcValues__AkMidiCcCtrl31Fine                                              = 63,
	EAkMidiCcValues__AkMidiCcHoldPedal                                               = 64,
	EAkMidiCcValues__AkMidiCcPortamentoOnOff                                         = 65,
	EAkMidiCcValues__AkMidiCcSustenutoPedal                                          = 66,
	EAkMidiCcValues__AkMidiCcSoftPedal                                               = 67,
	EAkMidiCcValues__AkMidiCcLegatoPedal                                             = 68,
	EAkMidiCcValues__AkMidiCcHoldPedal2                                              = 69,
	EAkMidiCcValues__AkMidiCcSoundVariation                                          = 70,
	EAkMidiCcValues__AkMidiCcSoundTimbre                                             = 71,
	EAkMidiCcValues__AkMidiCcSoundReleaseTime                                        = 72,
	EAkMidiCcValues__AkMidiCcSoundAttackTime                                         = 73,
	EAkMidiCcValues__AkMidiCcSoundBrightness                                         = 74,
	EAkMidiCcValues__AkMidiCcSoundCtrl6                                              = 75,
	EAkMidiCcValues__AkMidiCcSoundCtrl7                                              = 76,
	EAkMidiCcValues__AkMidiCcSoundCtrl8                                              = 77,
	EAkMidiCcValues__AkMidiCcSoundCtrl9                                              = 78,
	EAkMidiCcValues__AkMidiCcSoundCtrl10                                             = 79,
	EAkMidiCcValues__AkMidiCcGeneralButton1                                          = 80,
	EAkMidiCcValues__AkMidiCcGeneralButton2                                          = 81,
	EAkMidiCcValues__AkMidiCcGeneralButton3                                          = 82,
	EAkMidiCcValues__AkMidiCcGeneralButton4                                          = 83,
	EAkMidiCcValues__AkMidiCcReverbLevel                                             = 91,
	EAkMidiCcValues__AkMidiCcTremoloLevel                                            = 92,
	EAkMidiCcValues__AkMidiCcChorusLevel                                             = 93,
	EAkMidiCcValues__AkMidiCcCelesteLevel                                            = 94,
	EAkMidiCcValues__AkMidiCcPhaserLevel                                             = 95,
	EAkMidiCcValues__AkMidiCcDataButtonP1                                            = 96,
	EAkMidiCcValues__AkMidiCcDataButtonM1                                            = 97,
	EAkMidiCcValues__AkMidiCcNonRegisterCoarse                                       = 98,
	EAkMidiCcValues__AkMidiCcNonRegisterFine                                         = 99,
	EAkMidiCcValues__AkMidiCcAllSoundOff                                             = 120,
	EAkMidiCcValues__AkMidiCcAllControllersOff                                       = 121,
	EAkMidiCcValues__AkMidiCcLocalKeyboard                                           = 122,
	EAkMidiCcValues__AkMidiCcAllNotesOff                                             = 123,
	EAkMidiCcValues__AkMidiCcOmniModeOff                                             = 124,
	EAkMidiCcValues__AkMidiCcOmniModeOn                                              = 125,
	EAkMidiCcValues__AkMidiCcOmniMonophonicOn                                        = 126,
	EAkMidiCcValues__AkMidiCcOmniPolyphonicOn                                        = 127
};

/// Enum /Script/AkAudio.EAkMidiEventType
/// Size: 0x01 (1 bytes)
enum class EAkMidiEventType : uint8_t
{
	EAkMidiEventType__AkMidiEventTypeInvalid                                         = 0,
	EAkMidiEventType__AkMidiEventTypeNoteOff                                         = 128,
	EAkMidiEventType__AkMidiEventTypeNoteOn                                          = 144,
	EAkMidiEventType__AkMidiEventTypeNoteAftertouch                                  = 160,
	EAkMidiEventType__AkMidiEventTypeController                                      = 176,
	EAkMidiEventType__AkMidiEventTypeProgramChange                                   = 192,
	EAkMidiEventType__AkMidiEventTypeChannelAftertouch                               = 208,
	EAkMidiEventType__AkMidiEventTypePitchBend                                       = 224,
	EAkMidiEventType__AkMidiEventTypeSysex                                           = 240,
	EAkMidiEventType__AkMidiEventTypeEscape                                          = 247,
	EAkMidiEventType__AkMidiEventTypeMeta                                            = 255
};

/// Enum /Script/AkAudio.ERTPCValueType
/// Size: 0x01 (1 bytes)
enum class ERTPCValueType : uint8_t
{
	ERTPCValueType__Default                                                          = 0,
	ERTPCValueType__Global                                                           = 1,
	ERTPCValueType__GameObject                                                       = 2,
	ERTPCValueType__PlayingID                                                        = 3,
	ERTPCValueType__Unavailable                                                      = 4
};

/// Enum /Script/AkAudio.EAkCurveInterpolation
/// Size: 0x01 (1 bytes)
enum class EAkCurveInterpolation : uint8_t
{
	EAkCurveInterpolation__Log3                                                      = 0,
	EAkCurveInterpolation__Sine                                                      = 1,
	EAkCurveInterpolation__Log1                                                      = 2,
	EAkCurveInterpolation__InvSCurve                                                 = 3,
	EAkCurveInterpolation__Linear                                                    = 4,
	EAkCurveInterpolation__SCurve                                                    = 5,
	EAkCurveInterpolation__Exp1                                                      = 6,
	EAkCurveInterpolation__SineRecip                                                 = 7,
	EAkCurveInterpolation__Exp3                                                      = 8,
	EAkCurveInterpolation__LastFadeCurve                                             = 8,
	EAkCurveInterpolation__Constant                                                  = 9
};

/// Enum /Script/AkAudio.AkActionOnEventType
/// Size: 0x01 (1 bytes)
enum class AkActionOnEventType : uint8_t
{
	AkActionOnEventType__Stop                                                        = 0,
	AkActionOnEventType__Pause                                                       = 1,
	AkActionOnEventType__Resume                                                      = 2,
	AkActionOnEventType__Break                                                       = 3,
	AkActionOnEventType__ReleaseEnvelope                                             = 4
};

/// Enum /Script/AkAudio.AkMultiPositionType
/// Size: 0x01 (1 bytes)
enum class AkMultiPositionType : uint8_t
{
	AkMultiPositionType__SingleSource                                                = 0,
	AkMultiPositionType__MultiSources                                                = 1,
	AkMultiPositionType__MultiDirections                                             = 2
};

/// Enum /Script/AkAudio.AkSpeakerConfiguration
/// Size: 0x04 (4 bytes)
enum class AkSpeakerConfiguration : uint32_t
{
	AkSpeakerConfiguration__Ak_Speaker_Front_Left                                    = 1,
	AkSpeakerConfiguration__Ak_Speaker_Front_Right                                   = 2,
	AkSpeakerConfiguration__Ak_Speaker_Front_Center                                  = 4,
	AkSpeakerConfiguration__Ak_Speaker_Low_Frequency                                 = 8,
	AkSpeakerConfiguration__Ak_Speaker_Back_Left                                     = 16,
	AkSpeakerConfiguration__Ak_Speaker_Back_Right                                    = 32,
	AkSpeakerConfiguration__Ak_Speaker_Back_Center                                   = 256,
	AkSpeakerConfiguration__Ak_Speaker_Side_Left                                     = 512,
	AkSpeakerConfiguration__Ak_Speaker_Side_Right                                    = 1024,
	AkSpeakerConfiguration__Ak_Speaker_Top                                           = 2048,
	AkSpeakerConfiguration__Ak_Speaker_Height_Front_Left                             = 4096,
	AkSpeakerConfiguration__Ak_Speaker_Height_Front_Center                           = 8192,
	AkSpeakerConfiguration__Ak_Speaker_Height_Front_Right                            = 16384,
	AkSpeakerConfiguration__Ak_Speaker_Height_Back_Left                              = 32768,
	AkSpeakerConfiguration__Ak_Speaker_Height_Back_Center                            = 65536,
	AkSpeakerConfiguration__Ak_Speaker_Height_Back_Right                             = 131072
};

/// Enum /Script/AkAudio.AkChannelConfiguration
/// Size: 0x01 (1 bytes)
enum class AkChannelConfiguration : uint8_t
{
	AkChannelConfiguration__Ak_Parent                                                = 0,
	AkChannelConfiguration__Ak_MainMix                                               = 1,
	AkChannelConfiguration__Ak_Passthrough                                           = 2,
	AkChannelConfiguration__Ak_LFE                                                   = 3,
	AkChannelConfiguration__AK_Audio_Objects                                         = 4,
	AkChannelConfiguration__Ak_1                                                     = 5,
	AkChannelConfiguration__Ak_2                                                     = 6,
	AkChannelConfiguration__Ak_28                                                    = 7,
	AkChannelConfiguration__Ak_3                                                     = 8,
	AkChannelConfiguration__Ak_310                                                   = 9,
	AkChannelConfiguration__Ak_4                                                     = 10,
	AkChannelConfiguration__Ak_412                                                   = 11,
	AkChannelConfiguration__Ak_5                                                     = 12,
	AkChannelConfiguration__Ak_514                                                   = 13,
	AkChannelConfiguration__Ak_7                                                     = 14,
	AkChannelConfiguration__Ak_5_1                                                   = 15,
	AkChannelConfiguration__Ak_7_1                                                   = 16,
	AkChannelConfiguration__Ak_7_118                                                 = 17,
	AkChannelConfiguration__Ak_Auro_9                                                = 18,
	AkChannelConfiguration__Ak_Auro_10                                               = 19,
	AkChannelConfiguration__Ak_Auro_11                                               = 20,
	AkChannelConfiguration__Ak_Auro_13                                               = 21,
	AkChannelConfiguration__Ak_Ambisonics_1st_order                                  = 22,
	AkChannelConfiguration__Ak_Ambisonics_2nd_order                                  = 23,
	AkChannelConfiguration__Ak_Ambisonics_3rd_order                                  = 24,
	AkChannelConfiguration__Ak_Ambisonics_4th_order                                  = 25,
	AkChannelConfiguration__Ak_Ambisonics_5th_order                                  = 26
};

/// Enum /Script/AkAudio.AkAcousticPortalState
/// Size: 0x01 (1 bytes)
enum class AkAcousticPortalState : uint8_t
{
	AkAcousticPortalState__Closed                                                    = 0,
	AkAcousticPortalState__Open                                                      = 1
};

/// Enum /Script/AkAudio.PanningRule
/// Size: 0x01 (1 bytes)
enum class PanningRule : uint8_t
{
	PanningRule__PanningRule_Speakers                                                = 0,
	PanningRule__PanningRule_Headphones                                              = 1
};

/// Enum /Script/AkAudio.EAkAudioContext
/// Size: 0x01 (1 bytes)
enum class EAkAudioContext : uint8_t
{
	EAkAudioContext__Foreign                                                         = 0,
	EAkAudioContext__GameplayAudio                                                   = 1,
	EAkAudioContext__EditorAudio                                                     = 2,
	EAkAudioContext__AlwaysActive                                                    = 3
};

/// Enum /Script/AkAudio.AkMeshType
/// Size: 0x01 (1 bytes)
enum class AkMeshType : uint8_t
{
	AkMeshType__StaticMesh                                                           = 0,
	AkMeshType__CollisionMesh                                                        = 1
};

/// Enum /Script/AkAudio.EAkCommSystem
/// Size: 0x04 (4 bytes)
enum class EAkCommSystem : uint32_t
{
	EAkCommSystem__Socket                                                            = 0,
	EAkCommSystem__HTCS                                                              = 1
};

/// Enum /Script/AkAudio.EAkChannelMask
/// Size: 0x01 (1 bytes)
enum class EAkChannelMask : uint8_t
{
	EAkChannelMask__FrontLeft                                                        = 0,
	EAkChannelMask__FrontRight                                                       = 1,
	EAkChannelMask__FrontCenter                                                      = 2,
	EAkChannelMask__LowFrequency                                                     = 3,
	EAkChannelMask__BackLeft                                                         = 4,
	EAkChannelMask__BackRight                                                        = 5,
	EAkChannelMask__BackCenter                                                       = 8,
	EAkChannelMask__SideLeft                                                         = 9,
	EAkChannelMask__SideRight                                                        = 10,
	EAkChannelMask__Top                                                              = 11,
	EAkChannelMask__HeightFrontLeft                                                  = 12,
	EAkChannelMask__HeightFrontCenter                                                = 13,
	EAkChannelMask__HeightFrontRight                                                 = 14,
	EAkChannelMask__HeightBackLeft                                                   = 15,
	EAkChannelMask__HeightBackCenter                                                 = 16,
	EAkChannelMask__HeightBackRight                                                  = 17
};

/// Enum /Script/AkAudio.EAkChannelConfigType
/// Size: 0x04 (4 bytes)
enum class EAkChannelConfigType : uint32_t
{
	EAkChannelConfigType__Anonymous                                                  = 0,
	EAkChannelConfigType__Standard                                                   = 1,
	EAkChannelConfigType__Ambisonic                                                  = 2
};

/// Enum /Script/AkAudio.EAkPanningRule
/// Size: 0x04 (4 bytes)
enum class EAkPanningRule : uint32_t
{
	EAkPanningRule__Speakers                                                         = 0,
	EAkPanningRule__Headphones                                                       = 1
};

/// Enum /Script/AkAudio.EAkFitToGeometryMode
/// Size: 0x01 (1 bytes)
enum class EAkFitToGeometryMode : uint8_t
{
	EAkFitToGeometryMode__OrientedBox                                                = 0,
	EAkFitToGeometryMode__AlignedBox                                                 = 1,
	EAkFitToGeometryMode__ConvexPolyhedron                                           = 2
};

/// Enum /Script/AkAudio.AudioBankOperation
/// Size: 0x01 (1 bytes)
enum class AudioBankOperation : uint8_t
{
	LoadBank                                                                         = 0,
	UnloadBank                                                                       = 1
};

/// Enum /Script/AkAudio.AudioObjectType
/// Size: 0x01 (1 bytes)
enum class AudioObjectType : uint8_t
{
	SFX                                                                              = 0,
	Music                                                                            = 1,
	Voice                                                                            = 2,
	Switch                                                                           = 3,
	State                                                                            = 4,
	RTPC                                                                             = 5,
	Trigger                                                                          = 6,
	SoundBank                                                                        = 7,
	AudioPackage                                                                     = 8,
	AuxBus                                                                           = 9,
	Room                                                                             = 10,
	MIDI                                                                             = 11,
	Emitter                                                                          = 12,
	Listener                                                                         = 13,
	Language                                                                         = 14,
	Device                                                                           = 15,
	Portal                                                                           = 16
};

/// Enum /Script/AkAudio.AudioAction
/// Size: 0x01 (1 bytes)
enum class AudioAction : uint8_t
{
	PostEvent                                                                        = 0,
	Stop                                                                             = 1,
	Break                                                                            = 2,
	Pause                                                                            = 3,
	Resume                                                                           = 4,
	Mute                                                                             = 5,
	Unmute                                                                           = 6,
	Load                                                                             = 7,
	Unload                                                                           = 8,
	Reload                                                                           = 9,
	SetValue                                                                         = 10,
	GetValue                                                                         = 11,
	Activate                                                                         = 12,
	Deactivate                                                                       = 13,
	AudioRegister                                                                    = 14,
	UnRegister                                                                       = 15
};

/// Enum /Script/AkAudio.AudioLogVerbosity
/// Size: 0x01 (1 bytes)
enum class AudioLogVerbosity : uint8_t
{
	Notification                                                                     = 0,
	Warning                                                                          = 1,
	Error                                                                            = 2
};

/// Enum /Script/AkAudio.EGeographicRTPCType
/// Size: 0x01 (1 bytes)
enum class EGeographicRTPCType : uint8_t
{
	EGeographicRTPCType__Distance                                                    = 0,
	EGeographicRTPCType__Altitude                                                    = 1,
	EGeographicRTPCType__Longitude                                                   = 2,
	EGeographicRTPCType__Latitude                                                    = 3,
	EGeographicRTPCType__HeadSetDistance                                             = 4
};

/// Class /Script/AkAudio.AkPortalComponent
/// Size: 0x00F0 (240 bytes) (0x000220 - 0x000310) align 16 pad: 0x0000
class UAkPortalComponent : public USceneComponent
{ 
public:
	bool                                               bDynamic;                                                   // 0x0220   (0x0001)  
	AkAcousticPortalState                              InitialState;                                               // 0x0221   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0222   (0x0002)  MISSED
	float                                              ObstructionRefreshInterval;                                 // 0x0224   (0x0004)  
	TEnumAsByte<ECollisionChannel>                     ObstructionCollisionChannel;                                // 0x0228   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0229   (0x0003)  MISSED
	float                                              AutoDisableDistance;                                        // 0x022C   (0x0004)  
	float                                              fTickInterval;                                              // 0x0230   (0x0004)  
	unsigned char                                      UnknownData02_6[0xC];                                       // 0x0234   (0x000C)  MISSED
	class UPrimitiveComponent*                         Parent;                                                     // 0x0240   (0x0008)  
	unsigned char                                      UnknownData03_7[0xC8];                                      // 0x0248   (0x00C8)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkPortalComponent.PortalPlacementValid
	// bool PortalPlacementValid();                                                                                             // [0xc0ed00] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkPortalComponent.OpenPortal
	// void OpenPortal();                                                                                                       // [0xc0eae0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkPortalComponent.GetPrimitiveParent
	// class UPrimitiveComponent* GetPrimitiveParent();                                                                         // [0xc0e840] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkPortalComponent.GetCurrentState
	// AkAcousticPortalState GetCurrentState();                                                                                 // [0xc0e750] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkPortalComponent.ClosePortal
	// void ClosePortal();                                                                                                      // [0xc0e5f0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkAcousticPortal
/// Size: 0x0010 (16 bytes) (0x000318 - 0x000328) align 8 pad: 0x0000
class AAkAcousticPortal : public AVolume
{ 
public:
	class UAkPortalComponent*                          Portal;                                                     // 0x0318   (0x0008)  
	AkAcousticPortalState                              InitialState;                                               // 0x0320   (0x0001)  
	bool                                               bRequiresStateMigration;                                    // 0x0321   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0322   (0x0006)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkAcousticPortal.OpenPortal
	// void OpenPortal();                                                                                                       // [0xc0eac0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkAcousticPortal.GetCurrentState
	// AkAcousticPortalState GetCurrentState();                                                                                 // [0xc0e720] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkAcousticPortal.ClosePortal
	// void ClosePortal();                                                                                                      // [0xc0e5d0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkAudioType
/// Size: 0x0018 (24 bytes) (0x000028 - 0x000040) align 8 pad: 0x0000
class UAkAudioType : public UObject
{ 
public:
	uint32_t                                           ShortID;                                                    // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	TArray<class UObject*>                             UserData;                                                   // 0x0030   (0x0010)  
};

/// Class /Script/AkAudio.AkAcousticTexture
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UAkAcousticTexture : public UAkAudioType
{ 
public:
};

/// Class /Script/AkAudio.AkAcousticTextureSetComponent
/// Size: 0x0020 (32 bytes) (0x000220 - 0x000240) align 16 pad: 0x0008
#pragma pack(push, 0x1)
class UAkAcousticTextureSetComponent : public USceneComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x18];                                      // 0x0220   (0x0018)  MISSED
};
#pragma pack(pop)

/// Class /Script/AkAudio.AkAmbientSound
/// Size: 0x0040 (64 bytes) (0x0002E0 - 0x000320) align 8 pad: 0x0000
class AAkAmbientSound : public AActor
{ 
public:
	class UAkAudioEvent*                               AkAudioEvent;                                               // 0x02E0   (0x0008)  
	class UAkComponent*                                AkComponent;                                                // 0x02E8   (0x0008)  
	bool                                               StopWhenOwnerIsDestroyed;                                   // 0x02F0   (0x0001)  
	bool                                               AutoPost;                                                   // 0x02F1   (0x0001)  
	unsigned char                                      UnknownData00_7[0x2E];                                      // 0x02F2   (0x002E)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkAmbientSound.StopAmbientSound
	// void StopAmbientSound();                                                                                                 // [0xc0fde0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkAmbientSound.StartAmbientSound
	// void StartAmbientSound();                                                                                                // [0xc0fdc0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
};

/// Struct /Script/AkAudio.AkMainOutputSettings
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FAkMainOutputSettings
{ 
	FString                                            AudioDeviceShareset;                                        // 0x0000   (0x0010)  
	uint32_t                                           DeviceID;                                                   // 0x0010   (0x0004)  
	EAkPanningRule                                     PanningRule;                                                // 0x0014   (0x0004)  
	EAkChannelConfigType                               ChannelConfigType;                                          // 0x0018   (0x0004)  
	uint32_t                                           ChannelMask;                                                // 0x001C   (0x0004)  
	uint32_t                                           NumberOfChannels;                                           // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.AkSpatialAudioSettings
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 4 pad: 0x0000
struct FAkSpatialAudioSettings
{ 
	uint32_t                                           MaxSoundPropagationDepth;                                   // 0x0000   (0x0004)  
	float                                              MovementThreshold;                                          // 0x0004   (0x0004)  
	uint32_t                                           NumberOfPrimaryRays;                                        // 0x0008   (0x0004)  
	uint32_t                                           ReflectionOrder;                                            // 0x000C   (0x0004)  
	float                                              MaximumPathLength;                                          // 0x0010   (0x0004)  
	float                                              CPULimitPercentage;                                         // 0x0014   (0x0004)  
	bool                                               EnableDiffractionOnReflections;                             // 0x0018   (0x0001)  
	bool                                               EnableGeometricDiffractionAndTransmission;                  // 0x0019   (0x0001)  
	bool                                               CalcEmitterVirtualPosition;                                 // 0x001A   (0x0001)  
	bool                                               UseObstruction;                                             // 0x001B   (0x0001)  
	bool                                               UseOcclusion;                                               // 0x001C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x001D   (0x0003)  MISSED
};

/// Struct /Script/AkAudio.AkCommonInitializationSettings
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FAkCommonInitializationSettings
{ 
	uint32_t                                           MaximumNumberOfMemoryPools;                                 // 0x0000   (0x0004)  
	uint32_t                                           MaximumNumberOfPositioningPaths;                            // 0x0004   (0x0004)  
	uint32_t                                           CommandQueueSize;                                           // 0x0008   (0x0004)  
	uint32_t                                           SamplesPerFrame;                                            // 0x000C   (0x0004)  
	FAkMainOutputSettings                              MainOutputSettings;                                         // 0x0010   (0x0028)  
	float                                              StreamingLookAheadRatio;                                    // 0x0038   (0x0004)  
	uint16_t                                           NumberOfRefillsInVoice;                                     // 0x003C   (0x0002)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x003E   (0x0002)  MISSED
	FAkSpatialAudioSettings                            SpatialAudioSettings;                                       // 0x0040   (0x0020)  
};

/// Struct /Script/AkAudio.AkCommonInitializationSettingsWithSampleRate
/// Size: 0x0008 (8 bytes) (0x000060 - 0x000068) align 8 pad: 0x0000
struct FAkCommonInitializationSettingsWithSampleRate : FAkCommonInitializationSettings
{ 
	uint32_t                                           SampleRate;                                                 // 0x0060   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0064   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.AkCommunicationSettings
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 8 pad: 0x0000
struct FAkCommunicationSettings
{ 
	uint32_t                                           PoolSize;                                                   // 0x0000   (0x0004)  
	uint16_t                                           DiscoveryBroadcastPort;                                     // 0x0004   (0x0002)  
	uint16_t                                           CommandPort;                                                // 0x0006   (0x0002)  
	uint16_t                                           NotificationPort;                                           // 0x0008   (0x0002)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x000A   (0x0006)  MISSED
	FString                                            NetworkName;                                                // 0x0010   (0x0010)  
};

/// Struct /Script/AkAudio.AkCommunicationSettingsWithSystemInitialization
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FAkCommunicationSettingsWithSystemInitialization : FAkCommunicationSettings
{ 
	bool                                               InitializeSystemComms;                                      // 0x0020   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0021   (0x0007)  MISSED
};

/// Struct /Script/AkAudio.AkAdvancedInitializationSettings
/// Size: 0x002C (44 bytes) (0x000000 - 0x00002C) align 4 pad: 0x0000
struct FAkAdvancedInitializationSettings
{ 
	uint32_t                                           IO_MemorySize;                                              // 0x0000   (0x0004)  
	uint32_t                                           IO_Granularity;                                             // 0x0004   (0x0004)  
	float                                              TargetAutoStreamBufferLength;                               // 0x0008   (0x0004)  
	bool                                               UseStreamCache;                                             // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x000D   (0x0003)  MISSED
	uint32_t                                           MaximumPinnedBytesInCache;                                  // 0x0010   (0x0004)  
	bool                                               EnableGameSyncPreparation;                                  // 0x0014   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0015   (0x0003)  MISSED
	uint32_t                                           ContinuousPlaybackLookAhead;                                // 0x0018   (0x0004)  
	uint32_t                                           MonitorQueuePoolSize;                                       // 0x001C   (0x0004)  
	uint32_t                                           MaximumHardwareTimeoutMs;                                   // 0x0020   (0x0004)  
	bool                                               DebugOutOfRangeCheckEnabled;                                // 0x0024   (0x0001)  
	unsigned char                                      UnknownData02_6[0x3];                                       // 0x0025   (0x0003)  MISSED
	float                                              DebugOutOfRangeLimit;                                       // 0x0028   (0x0004)  
};

/// Struct /Script/AkAudio.AkAdvancedInitializationSettingsWithMultiCoreRendering
/// Size: 0x0004 (4 bytes) (0x00002C - 0x000030) align 4 pad: 0x0000
struct FAkAdvancedInitializationSettingsWithMultiCoreRendering : FAkAdvancedInitializationSettings
{ 
	bool                                               EnableMultiCoreRendering;                                   // 0x002C   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x002D   (0x0003)  MISSED
};

/// Struct /Script/AkAudio.AkAndroidAdvancedInitializationSettings
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 4 pad: 0x0000
struct FAkAndroidAdvancedInitializationSettings : FAkAdvancedInitializationSettingsWithMultiCoreRendering
{ 
	uint32_t                                           AudioAPI;                                                   // 0x0030   (0x0004)  
	bool                                               RoundFrameSizeToHardwareSize;                               // 0x0034   (0x0001)  
	unsigned char                                      UnknownData00_7[0x3];                                       // 0x0035   (0x0003)  MISSED
};

/// Class /Script/AkAudio.AkAndroidInitializationSettings
/// Size: 0x00D0 (208 bytes) (0x000028 - 0x0000F8) align 8 pad: 0x0000
class UAkAndroidInitializationSettings : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FAkCommonInitializationSettingsWithSampleRate      CommonSettings;                                             // 0x0030   (0x0068)  
	FAkCommunicationSettingsWithSystemInitialization   CommunicationSettings;                                      // 0x0098   (0x0028)  
	FAkAndroidAdvancedInitializationSettings           AdvancedSettings;                                           // 0x00C0   (0x0038)  


	/// Functions
	// Function /Script/AkAudio.AkAndroidInitializationSettings.MigrateMultiCoreRendering
	// void MigrateMultiCoreRendering(bool NewValue);                                                                           // [0xc0e8d0] Final|Native|Public  
};

/// Class /Script/AkAudio.AkPlatformInfo
/// Size: 0x0048 (72 bytes) (0x000028 - 0x000070) align 8 pad: 0x0000
class UAkPlatformInfo : public UObject
{ 
public:
	unsigned char                                      UnknownData00_1[0x48];                                      // 0x0028   (0x0048)  MISSED
};

/// Class /Script/AkAudio.AkAndroidPlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkAndroidPlatformInfo : public UAkPlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkAssetBase
/// Size: 0x0010 (16 bytes) (0x000040 - 0x000050) align 8 pad: 0x0000
class UAkAssetBase : public UAkAudioType
{ 
public:
	class UAkAssetPlatformData*                        PlatformAssetData;                                          // 0x0040   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0048   (0x0008)  MISSED
};

/// Class /Script/AkAudio.AkAssetData
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UAkAssetData : public UObject
{ 
public:
	uint32_t                                           CachedHash;                                                 // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	FString                                            BankLanguage;                                               // 0x0030   (0x0010)  
	unsigned char                                      UnknownData01_7[0x38];                                      // 0x0040   (0x0038)  MISSED
};

/// Class /Script/AkAudio.AkAssetDataWithMedia
/// Size: 0x0010 (16 bytes) (0x000078 - 0x000088) align 8 pad: 0x0000
class UAkAssetDataWithMedia : public UAkAssetData
{ 
public:
	TArray<class UAkMediaAsset*>                       MediaList;                                                  // 0x0078   (0x0010)  
};

/// Class /Script/AkAudio.AkAssetPlatformData
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UAkAssetPlatformData : public UObject
{ 
public:
	class UAkAssetData*                                CurrentAssetData;                                           // 0x0028   (0x0008)  
};

/// Class /Script/AkAudio.AkAssetDataSwitchContainerData
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UAkAssetDataSwitchContainerData : public UObject
{ 
public:
	SDK_UNDEFINED(40,392) /* TWeakObjectPtr<UAkGroupValue*> */ __um(GroupValue);                                   // 0x0028   (0x0028)  
	class UAkGroupValue*                               DefaultGroupValue;                                          // 0x0050   (0x0008)  
	TArray<class UAkMediaAsset*>                       MediaList;                                                  // 0x0058   (0x0010)  
	TArray<class UAkAssetDataSwitchContainerData*>     Children;                                                   // 0x0068   (0x0010)  
};

/// Class /Script/AkAudio.AkAssetDataSwitchContainer
/// Size: 0x0068 (104 bytes) (0x000088 - 0x0000F0) align 8 pad: 0x0000
class UAkAssetDataSwitchContainer : public UAkAssetDataWithMedia
{ 
public:
	TArray<class UAkAssetDataSwitchContainerData*>     SwitchContainers;                                           // 0x0088   (0x0010)  
	class UAkGroupValue*                               DefaultGroupValue;                                          // 0x0098   (0x0008)  
	unsigned char                                      UnknownData00_7[0x50];                                      // 0x00A0   (0x0050)  MISSED
};

/// Class /Script/AkAudio.AkAudioEventData
/// Size: 0x01A0 (416 bytes) (0x0000F0 - 0x000290) align 8 pad: 0x0000
class UAkAudioEventData : public UAkAssetDataSwitchContainer
{ 
public:
	float                                              MaxAttenuationRadius;                                       // 0x00F0   (0x0004)  
	bool                                               IsInfinite;                                                 // 0x00F4   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00F5   (0x0003)  MISSED
	float                                              MinimumDuration;                                            // 0x00F8   (0x0004)  
	float                                              MaximumDuration;                                            // 0x00FC   (0x0004)  
	SDK_UNDEFINED(80,393) /* TMap<FString, UAkAssetDataSwitchContainer*> */ __um(LocalizedMedia);                  // 0x0100   (0x0050)  
	SDK_UNDEFINED(80,394) /* TSet<UAkAudioEvent*> */   __um(PostedEvents);                                         // 0x0150   (0x0050)  
	SDK_UNDEFINED(80,395) /* TSet<UAkAuxBus*> */       __um(UserDefinedSends);                                     // 0x01A0   (0x0050)  
	SDK_UNDEFINED(80,396) /* TSet<UAkTrigger*> */      __um(PostedTriggers);                                       // 0x01F0   (0x0050)  
	SDK_UNDEFINED(80,397) /* TSet<UAkGroupValue*> */   __um(GroupValues);                                          // 0x0240   (0x0050)  
};

/// Class /Script/AkAudio.AkAudioBank
/// Size: 0x00C8 (200 bytes) (0x000050 - 0x000118) align 8 pad: 0x0000
class UAkAudioBank : public UAkAssetBase
{ 
public:
	bool                                               AutoLoad;                                                   // 0x0050   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0051   (0x0007)  MISSED
	SDK_UNDEFINED(80,398) /* TMap<FString, UAkAssetPlatformData*> */ __um(LocalizedPlatformAssetDataMap);          // 0x0058   (0x0050)  
	SDK_UNDEFINED(80,399) /* TSet<TWeakObjectPtr<UAkAudioEvent*>> */ __um(LinkedAkEvents);                         // 0x00A8   (0x0050)  
	class UAkAssetPlatformData*                        CurrentLocalizedPlatformAssetData;                          // 0x00F8   (0x0008)  
	unsigned char                                      UnknownData01_7[0x18];                                      // 0x0100   (0x0018)  MISSED
};

/// Class /Script/AkAudio.AkAudioEvent
/// Size: 0x0080 (128 bytes) (0x000050 - 0x0000D0) align 8 pad: 0x0000
class UAkAudioEvent : public UAkAssetBase
{ 
public:
	SDK_UNDEFINED(80,400) /* TMap<FString, UAkAssetPlatformData*> */ __um(LocalizedPlatformAssetDataMap);          // 0x0050   (0x0050)  
	class UAkAudioBank*                                RequiredBank;                                               // 0x00A0   (0x0008)  
	class UAkAudioBank*                                LastRequiredBank;                                           // 0x00A8   (0x0008)  
	class UAkAssetPlatformData*                        CurrentLocalizedPlatformData;                               // 0x00B0   (0x0008)  
	float                                              MaxAttenuationRadius;                                       // 0x00B8   (0x0004)  
	bool                                               IsInfinite;                                                 // 0x00BC   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00BD   (0x0003)  MISSED
	float                                              MinimumDuration;                                            // 0x00C0   (0x0004)  
	float                                              MaximumDuration;                                            // 0x00C4   (0x0004)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x00C8   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkAudioEvent.GetMinimumDuration
	// float GetMinimumDuration();                                                                                              // [0xc0e810] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkAudioEvent.GetMaximumDuration
	// float GetMaximumDuration();                                                                                              // [0xc0e7e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkAudioEvent.GetMaxAttenuationRadius
	// float GetMaxAttenuationRadius();                                                                                         // [0xc0e7b0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkAudioEvent.GetIsInfinite
	// bool GetIsInfinite();                                                                                                    // [0xc0e780] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkGameObject
/// Size: 0x0020 (32 bytes) (0x000220 - 0x000240) align 16 pad: 0x0000
class UAkGameObject : public USceneComponent
{ 
public:
	class UAkAudioEvent*                               AkAudioEvent;                                               // 0x0220   (0x0008)  
	FString                                            EventName;                                                  // 0x0228   (0x0010)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0238   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkGameObject.Stop
	// void Stop();                                                                                                             // [0xc15c60] BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameObject.SetRTPCValue
	// void SetRTPCValue(class UAkRtpc* RTPCValue, float Value, int32_t InterpolationTimeMs, FString RTPC);                     // [0xc15100] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|Const 
	// Function /Script/AkAudio.AkGameObject.PostAssociatedAkEventAsync
	// void PostAssociatedAkEventAsync(class UObject* WorldContextObject, int32_t CallbackMask, FDelegateProperty& PostEventCallback, TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo, int32_t& PlayingID); // [0xc134d0] BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameObject.PostAssociatedAkEvent
	// int32_t PostAssociatedAkEvent(int32_t CallbackMask, FDelegateProperty& PostEventCallback, TArray<FAkExternalSourceInfo>& ExternalSources); // [0xc13330] BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameObject.PostAkEventAsync
	// void PostAkEventAsync(class UObject* WorldContextObject, class UAkAudioEvent* AkEvent, int32_t& PlayingID, int32_t CallbackMask, FDelegateProperty& PostEventCallback, TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo); // [0xc12b70] BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameObject.PostAkEvent
	// int32_t PostAkEvent(class UAkAudioEvent* AkEvent, int32_t CallbackMask, FDelegateProperty& PostEventCallback, TArray<FAkExternalSourceInfo>& ExternalSources, FString in_EventName); // [0xc12940] BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameObject.GetRTPCValue
	// void GetRTPCValue(class UAkRtpc* RTPCValue, ERTPCValueType InputValueType, float& Value, ERTPCValueType& OutputValueType, FString RTPC, int32_t PlayingID); // [0xc11eb0] Final|BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable|BlueprintPure|Const 
};

/// Struct /Script/AkAudio.VoicePlayingData
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FVoicePlayingData
{ 
	unsigned char                                      UnknownData00_2[0x28];                                      // 0x0000   (0x0028)  MISSED
};

/// Class /Script/AkAudio.AkComponent
/// Size: 0x0290 (656 bytes) (0x000240 - 0x0004D0) align 16 pad: 0x0000
class UAkComponent : public UAkGameObject
{ 
public:
	bool                                               bUseSpatialAudio;                                           // 0x0240   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0241   (0x0007)  MISSED
	TEnumAsByte<ECollisionChannel>                     OcclusionCollisionChannel;                                  // 0x0248   (0x0001)  
	bool                                               EnableSpotReflectors;                                       // 0x0249   (0x0001)  
	unsigned char                                      UnknownData01_6[0x2];                                       // 0x024A   (0x0002)  MISSED
	float                                              OuterRadius;                                                // 0x024C   (0x0004)  
	float                                              InnerRadius;                                                // 0x0250   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0254   (0x0004)  MISSED
	class UAkAuxBus*                                   EarlyReflectionAuxBus;                                      // 0x0258   (0x0008)  
	FString                                            EarlyReflectionAuxBusName;                                  // 0x0260   (0x0010)  
	int32_t                                            EarlyReflectionOrder;                                       // 0x0270   (0x0004)  
	float                                              EarlyReflectionBusSendGain;                                 // 0x0274   (0x0004)  
	float                                              EarlyReflectionMaxPathLength;                               // 0x0278   (0x0004)  
	float                                              roomReverbAuxBusGain;                                       // 0x027C   (0x0004)  
	int32_t                                            diffractionMaxEdges;                                        // 0x0280   (0x0004)  
	int32_t                                            diffractionMaxPaths;                                        // 0x0284   (0x0004)  
	float                                              diffractionMaxPathLength;                                   // 0x0288   (0x0004)  
	bool                                               StopWhenOwnerDestroyed;                                     // 0x028C   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x028D   (0x0003)  MISSED
	float                                              AttenuationScalingFactor;                                   // 0x0290   (0x0004)  
	float                                              OcclusionRefreshInterval;                                   // 0x0294   (0x0004)  
	bool                                               bUseReverbVolumes;                                          // 0x0298   (0x0001)  
	bool                                               bAutoCulling;                                               // 0x0299   (0x0001)  
	unsigned char                                      UnknownData04_6[0xCE];                                      // 0x029A   (0x00CE)  MISSED
	SDK_UNDEFINED(80,401) /* TSet<UAkComponent*> */    __um(Listeners);                                            // 0x0368   (0x0050)  
	SDK_UNDEFINED(80,402) /* TSet<UAkComponent*> */    __um(Emitters);                                             // 0x03B8   (0x0050)  
	class UAkRoomComponent*                            CurrentRoom;                                                // 0x0408   (0x0008)  
	class UCAVirtualRoomComponent*                     CurrVirtualRoom;                                            // 0x0410   (0x0008)  
	unsigned char                                      UnknownData05_6[0x1C];                                      // 0x0418   (0x001C)  MISSED
	bool                                               DynamicTickInterval;                                        // 0x0434   (0x0001)  
	bool                                               AutoPostEvent;                                              // 0x0435   (0x0001)  
	bool                                               UseFloorSystem;                                             // 0x0436   (0x0001)  
	unsigned char                                      UnknownData06_6[0x1];                                       // 0x0437   (0x0001)  MISSED
	int32_t                                            CurrentFloor;                                               // 0x0438   (0x0004)  
	float                                              SpecialInsideOutValue;                                      // 0x043C   (0x0004)  
	unsigned char                                      UnknownData07_6[0x8];                                       // 0x0440   (0x0008)  MISSED
	char                                               TickIntervalInFrames;                                       // 0x0448   (0x0001)  
	unsigned char                                      UnknownData08_6[0x3];                                       // 0x0449   (0x0003)  MISSED
	float                                              DistanceToListener;                                         // 0x044C   (0x0004)  
	bool                                               IsListeningToSelf;                                          // 0x0450   (0x0001)  
	unsigned char                                      UnknownData09_6[0x7];                                       // 0x0451   (0x0007)  MISSED
	FVoicePlayingData                                  CurrentSpeakingDialog;                                      // 0x0458   (0x0028)  
	unsigned char                                      UnknownData10_6[0x38];                                      // 0x0480   (0x0038)  MISSED
	FName                                              Category;                                                   // 0x04B8   (0x0008)  
	unsigned char                                      UnknownData11_7[0x10];                                      // 0x04C0   (0x0010)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkComponent.UseReverbVolumes
	// void UseReverbVolumes(bool inUseReverbVolumes);                                                                          // [0xc0fff0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.UseEarlyReflections
	// void UseEarlyReflections(class UAkAuxBus* AuxBus, int32_t Order, float BusSendGain, float MaxPathLength, bool SpotReflectors, FString AuxBusName); // [0xc0fe00] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetSwitch
	// void SetSwitch(class UAkSwitchValue* SwitchValue, FString SwitchGroup, FString SwitchState);                             // [0xc0fc80] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetStopWhenOwnerDestroyed
	// void SetStopWhenOwnerDestroyed(bool bStopWhenOwnerDestroyed);                                                            // [0xc0fbf0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetOutputBusVolume
	// void SetOutputBusVolume(float BusVolume);                                                                                // [0xc0fb70] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetListeners
	// void SetListeners(TArray<UAkComponent*>& Listeners);                                                                     // [0xc0fac0] Final|BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetGameObjectRadius
	// void SetGameObjectRadius(float in_outerRadius, float in_innerRadius);                                                    // [0xc0f960] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetEarlyReflectionsVolume
	// void SetEarlyReflectionsVolume(float SendVolume);                                                                        // [0xc0f8e0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetEarlyReflectionsAuxBus
	// void SetEarlyReflectionsAuxBus(FString AuxBusName);                                                                      // [0xc0f840] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.SetAttenuationScalingFactor
	// bool SetAttenuationScalingFactor(float Value);                                                                           // [0xc0f730] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PostTrigger
	// void PostTrigger(class UAkTrigger* TriggerValue, FString Trigger);                                                       // [0xc0f510] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PostAssociatedAkEventAndWaitForEndAsync
	// void PostAssociatedAkEventAndWaitForEndAsync(int32_t& PlayingID, TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo); // [0xc0f340] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PostAssociatedAkEventAndWaitForEnd
	// int32_t PostAssociatedAkEventAndWaitForEnd(TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo); // [0xc0f1d0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PostAkEventByName
	// int32_t PostAkEventByName(FString in_EventName);                                                                         // [0xc0f120] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PostAkEventAndWaitForEndAsync
	// void PostAkEventAndWaitForEndAsync(class UAkAudioEvent* AkEvent, int32_t& PlayingID, TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo); // [0xc0ef50] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PostAkEventAndWaitForEnd
	// int32_t PostAkEventAndWaitForEnd(class UAkAudioEvent* AkEvent, FString in_EventName, TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo); // [0xc0ed60] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.PlayVoiceDialog
	// int32_t PlayVoiceDialog(FString VoiceEventName, bool WaitUntilCurrentEnd, FString ExternalFileName, int32_t RandomCount); // [0xc0eb00] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkComponent.OnVoiceDialogEndCallback
	// void OnVoiceDialogEndCallback(EAkCallbackType CallbackType, class UAkCallbackInfo* CallbackInfo);                        // [0xc0e9f0] Final|Native|Public  
	// Function /Script/AkAudio.AkComponent.On1PRoomChanged
	// void On1PRoomChanged(bool isInDoor);                                                                                     // [0xc0e960] Final|Native|Public  
	// Function /Script/AkAudio.AkComponent.GetCurrentRoom
	// class UAkRoomComponent* GetCurrentRoom();                                                                                // [0xc0e700] Final|Native|Public  
	// Function /Script/AkAudio.AkComponent.GetAttenuationRadius
	// float GetAttenuationRadius();                                                                                            // [0xc0e6a0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkAudioInputComponent
/// Size: 0x0030 (48 bytes) (0x0004D0 - 0x000500) align 16 pad: 0x0000
class UAkAudioInputComponent : public UAkComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x30];                                      // 0x04D0   (0x0030)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkAudioInputComponent.PostAssociatedAudioInputEvent
	// int32_t PostAssociatedAudioInputEvent();                                                                                 // [0xc0f4e0] BlueprintCosmetic|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkAuxBus
/// Size: 0x0008 (8 bytes) (0x000050 - 0x000058) align 8 pad: 0x0000
class UAkAuxBus : public UAkAssetBase
{ 
public:
	class UAkAudioBank*                                RequiredBank;                                               // 0x0050   (0x0008)  
};

/// Struct /Script/AkAudio.AkBoolPropertyToControl
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FAkBoolPropertyToControl
{ 
	FString                                            ItemProperty;                                               // 0x0000   (0x0010)  
};

/// Struct /Script/AkAudio.AkWwiseObjectDetails
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FAkWwiseObjectDetails
{ 
	FString                                            ItemName;                                                   // 0x0000   (0x0010)  
	FString                                            ItemPath;                                                   // 0x0010   (0x0010)  
	FString                                            ItemID;                                                     // 0x0020   (0x0010)  
};

/// Struct /Script/AkAudio.AkWwiseItemToControl
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FAkWwiseItemToControl
{ 
	FAkWwiseObjectDetails                              ItemPicked;                                                 // 0x0000   (0x0030)  
	FString                                            ItemPath;                                                   // 0x0030   (0x0010)  
};

/// Class /Script/AkAudio.AkCheckBox
/// Size: 0x0A90 (2704 bytes) (0x000140 - 0x000BD0) align 16 pad: 0x0000
class UAkCheckBox : public UContentWidget
{ 
public:
	unsigned char                                      UnknownData00_3[0x3D0];                                     // 0x0140   (0x03D0)  MISSED
	ECheckBoxState                                     CheckedState;                                               // 0x0510   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0511   (0x0003)  MISSED
	SDK_UNDEFINED(16,403) /* FDelegateProperty */      __um(CheckedStateDelegate);                                 // 0x0514   (0x0010)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x0524   (0x0004)  MISSED
	FCheckBoxStyle                                     WidgetStyle;                                                // 0x0528   (0x05C8)  
	TEnumAsByte<EHorizontalAlignment>                  HorizontalAlignment;                                        // 0x0AF0   (0x0001)  
	bool                                               IsFocusable;                                                // 0x0AF1   (0x0001)  
	unsigned char                                      UnknownData03_6[0x6];                                       // 0x0AF2   (0x0006)  MISSED
	FAkBoolPropertyToControl                           ThePropertyToControl;                                       // 0x0AF8   (0x0010)  
	FAkWwiseItemToControl                              ItemToControl;                                              // 0x0B08   (0x0040)  
	SDK_UNDEFINED(16,404) /* FMulticastInlineDelegate */ __um(AkOnCheckStateChanged);                              // 0x0B48   (0x0010)  
	SDK_UNDEFINED(16,405) /* FMulticastInlineDelegate */ __um(OnItemDropped);                                      // 0x0B58   (0x0010)  
	SDK_UNDEFINED(16,406) /* FMulticastInlineDelegate */ __um(OnPropertyDropped);                                  // 0x0B68   (0x0010)  
	unsigned char                                      UnknownData04_7[0x58];                                      // 0x0B78   (0x0058)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkCheckBox.SetIsChecked
	// void SetIsChecked(bool InIsChecked);                                                                                     // [0xc0fa30] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkCheckBox.SetCheckedState
	// void SetCheckedState(ECheckBoxState InCheckedState);                                                                     // [0xc0f7c0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkCheckBox.SetAkItemId
	// void SetAkItemId(FGuid& ItemID);                                                                                         // [0xc0f690] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkCheckBox.SetAkBoolProperty
	// void SetAkBoolProperty(FString ItemProperty);                                                                            // [0xc0f5f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkCheckBox.IsPressed
	// bool IsPressed();                                                                                                        // [0xc0e8a0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkCheckBox.IsChecked
	// bool IsChecked();                                                                                                        // [0xc0e870] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkCheckBox.GetCheckedState
	// ECheckBoxState GetCheckedState();                                                                                        // [0xc0e6d0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkCheckBox.GetAkProperty
	// FString GetAkProperty();                                                                                                 // [0xc0e650] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkCheckBox.GetAkItemId
	// FGuid GetAkItemId();                                                                                                     // [0xc0e610] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.DrawPortalComponent
/// Size: 0x0008 (8 bytes) (0x0005D8 - 0x0005E0) align 16 pad: 0x0000
class UDrawPortalComponent : public UPrimitiveComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x05D8   (0x0008)  MISSED
};

/// Class /Script/AkAudio.DrawRoomComponent
/// Size: 0x0008 (8 bytes) (0x0005D8 - 0x0005E0) align 16 pad: 0x0000
class UDrawRoomComponent : public UPrimitiveComponent
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x05D8   (0x0008)  MISSED
};

/// Class /Script/AkAudio.AkFolder
/// Size: 0x0078 (120 bytes) (0x000040 - 0x0000B8) align 8 pad: 0x0000
class UAkFolder : public UAkAudioType
{ 
public:
	FString                                            UnrealFolderPath;                                           // 0x0040   (0x0010)  
	FString                                            WwiseFolderPath;                                            // 0x0050   (0x0010)  
	unsigned char                                      UnknownData00_7[0x58];                                      // 0x0060   (0x0058)  MISSED
};

/// Class /Script/AkAudio.AkGameplayStatics
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkGameplayStatics : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AkGameplayStatics.UseReverbVolumes
	// void UseReverbVolumes(bool inUseReverbVolumes, class AActor* Actor);                                                     // [0xc162e0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.UseEarlyReflections
	// void UseEarlyReflections(class AActor* Actor, class UAkAuxBus* AuxBus, int32_t Order, float BusSendGain, float MaxPathLength, bool SpotReflectors, FString AuxBusName); // [0xc160c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.UnloadBankByName
	// void UnloadBankByName(FString BankName);                                                                                 // [0xc16030] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.UnloadBankAsync
	// void UnloadBankAsync(class UAkAudioBank* Bank, FDelegateProperty& BankUnloadedCallback);                                 // [0xc15f50] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.UnloadBank
	// void UnloadBank(class UAkAudioBank* Bank, FString BankName, FLatentActionInfo LatentInfo, class UObject* WorldContextObject); // [0xc15de0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StopProfilerCapture
	// void StopProfilerCapture();                                                                                              // [0xc15dc0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StopOutputCapture
	// void StopOutputCapture();                                                                                                // [0xc15da0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StopAllAmbientSounds
	// void StopAllAmbientSounds(class UObject* WorldContextObject);                                                            // [0xc15d20] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StopAll
	// void StopAll();                                                                                                          // [0xc15d00] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StopActor
	// void StopActor(class AActor* Actor);                                                                                     // [0xc15c80] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StartProfilerCapture
	// void StartProfilerCapture(FString Filename);                                                                             // [0xc15bd0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StartOutputCapture
	// void StartOutputCapture(FString Filename);                                                                               // [0xc15b40] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.StartAllAmbientSounds
	// void StartAllAmbientSounds(class UObject* WorldContextObject);                                                           // [0xc15ac0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SpawnAkComponentAtLocation
	// class UAkComponent* SpawnAkComponentAtLocation(class UObject* WorldContextObject, class UAkAudioEvent* AkEvent, FVector Location, FRotator Orientation, bool AutoPost, FString EventName, bool AutoDestroy); // [0xc15880] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetSwitch
	// void SetSwitch(class UAkSwitchValue* SwitchValue, class AActor* Actor, FName SwitchGroup, FName SwitchState);            // [0xc15730] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetState
	// void SetState(class UAkStateValue* StateValue, FName StateGroup, FName State);                                           // [0xc15630] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetSpeakerAngles
	// void SetSpeakerAngles(TArray<float>& SpeakerAngles, float HeightAngle, FString DeviceShareset);                          // [0xc154f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetRTPCValue
	// void SetRTPCValue(class UAkRtpc* RTPCValue, float Value, int32_t InterpolationTimeMs, class AActor* Actor, FName RTPC);  // [0xc152a0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetReflectionsOrder
	// void SetReflectionsOrder(int32_t Order, bool RefreshPaths);                                                              // [0xc15430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetPortalToPortalObstruction
	// void SetPortalToPortalObstruction(class UAkPortalComponent* PortalComponent0, class UAkPortalComponent* PortalComponent1, float ObstructionValue); // [0xc15000] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetPortalObstructionAndOcclusion
	// void SetPortalObstructionAndOcclusion(class UAkPortalComponent* PortalComponent, float ObstructionValue, float OcclusionValue); // [0xc14f00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetPanningRule
	// void SetPanningRule(PanningRule PanRule);                                                                                // [0xc14e90] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetOutputBusVolume
	// void SetOutputBusVolume(float BusVolume, class AActor* Actor);                                                           // [0xc14dd0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetOcclusionScalingFactor
	// void SetOcclusionScalingFactor(float ScalingFactor);                                                                     // [0xc14d50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetOcclusionRefreshInterval
	// void SetOcclusionRefreshInterval(float RefreshInterval, class AActor* Actor);                                            // [0xc14c90] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetMultiplePositions
	// void SetMultiplePositions(class UAkComponent* GameObjectAkComponent, TArray<FTransform> Positions, AkMultiPositionType MultiPositionType); // [0xc14b30] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetMultipleChannelMaskEmitterPositions
	// void SetMultipleChannelMaskEmitterPositions(class UAkComponent* GameObjectAkComponent, TArray<FAkChannelMask> ChannelMasks, TArray<FTransform> Positions, AkMultiPositionType MultiPositionType); // [0xc14950] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetMultipleChannelEmitterPositions
	// void SetMultipleChannelEmitterPositions(class UAkComponent* GameObjectAkComponent, TArray<AkChannelConfiguration> ChannelMasks, TArray<FTransform> Positions, AkMultiPositionType MultiPositionType); // [0xc14770] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetGameObjectToPortalObstruction
	// void SetGameObjectToPortalObstruction(class UAkComponent* GameObjectAkComponent, class UAkPortalComponent* PortalComponent, float ObstructionValue); // [0xc14670] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetCurrentAudioCultureAsync
	// void SetCurrentAudioCultureAsync(FString AudioCulture, FDelegateProperty& Completed);                                    // [0xc14580] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetCurrentAudioCulture
	// void SetCurrentAudioCulture(FString AudioCulture, FLatentActionInfo LatentInfo, class UObject* WorldContextObject);      // [0xc14430] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.SetBusConfig
	// void SetBusConfig(FString BusName, AkChannelConfiguration ChannelConfiguration);                                         // [0xc14360] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.ResetRTPCValue
	// void ResetRTPCValue(class UAkRtpc* RTPCValue, int32_t InterpolationTimeMs, class AActor* Actor, FName RTPC);             // [0xc14220] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.ReplaceMainOutput
	// void ReplaceMainOutput(FAkOutputSettings& MainOutputSettings);                                                           // [0xc14180] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostTrigger
	// void PostTrigger(class UAkTrigger* TriggerValue, class AActor* Actor, FName Trigger);                                    // [0xc14080] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostEventByName
	// void PostEventByName(FString EventName, class AActor* Actor, bool bStopWhenAttachedToDestroyed);                         // [0xc13f60] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostEventAttached
	// int32_t PostEventAttached(class UAkAudioEvent* AkEvent, class AActor* Actor, FName AttachPointName, bool bStopWhenAttachedToDestroyed, FString EventName); // [0xc13d70] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostEventAtLocationByName
	// void PostEventAtLocationByName(FString EventName, FVector Location, FRotator Orientation, class UObject* WorldContextObject); // [0xc13c00] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostEventAtLocation
	// int32_t PostEventAtLocation(class UAkAudioEvent* AkEvent, FVector Location, FRotator Orientation, FString EventName, class UObject* WorldContextObject); // [0xc13a40] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostEvent
	// int32_t PostEvent(class UAkAudioEvent* AkEvent, class AActor* Actor, int32_t CallbackMask, FDelegateProperty& PostEventCallback, TArray<FAkExternalSourceInfo>& ExternalSources, bool bStopWhenAttachedToDestroyed, FString EventName); // [0xc13750] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostAndWaitForEndOfEventAsync
	// void PostAndWaitForEndOfEventAsync(class UAkAudioEvent* AkEvent, class AActor* Actor, int32_t& PlayingID, bool bStopWhenAttachedToDestroyed, TArray<FAkExternalSourceInfo>& ExternalSources, FLatentActionInfo LatentInfo); // [0xc130d0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.PostAndWaitForEndOfEvent
	// int32_t PostAndWaitForEndOfEvent(class UAkAudioEvent* AkEvent, class AActor* Actor, bool bStopWhenAttachedToDestroyed, TArray<FAkExternalSourceInfo>& ExternalSources, FString EventName, FLatentActionInfo LatentInfo); // [0xc12e30] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.LoadInitBank
	// void LoadInitBank();                                                                                                     // [0xc12920] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.LoadBanks
	// void LoadBanks(TArray<UAkAudioBank*>& SoundBanks, bool SynchronizeSoundBanks);                                           // [0xc12830] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.LoadBankByName
	// void LoadBankByName(FString BankName);                                                                                   // [0xc127a0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.LoadBankAsync
	// void LoadBankAsync(class UAkAudioBank* Bank, FDelegateProperty& BankLoadedCallback);                                     // [0xc126c0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.LoadBank
	// void LoadBank(class UAkAudioBank* Bank, FString BankName, FLatentActionInfo LatentInfo, class UObject* WorldContextObject); // [0xc12550] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.IsGame
	// bool IsGame(class UObject* WorldContextObject);                                                                          // [0xc124c0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.IsEditor
	// bool IsEditor();                                                                                                         // [0xc12490] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetSpeakerAngles
	// void GetSpeakerAngles(TArray<float>& SpeakerAngles, float& HeightAngle, FString DeviceShareset);                         // [0xc12330] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetRTPCValue
	// void GetRTPCValue(class UAkRtpc* RTPCValue, int32_t PlayingID, ERTPCValueType InputValueType, float& Value, ERTPCValueType& OutputValueType, class AActor* Actor, FName RTPC); // [0xc12100] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetOcclusionScalingFactor
	// float GetOcclusionScalingFactor();                                                                                       // [0xc11e80] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetCurrentAudioCulture
	// FString GetCurrentAudioCulture();                                                                                        // [0xc11e00] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetAvailableAudioCultures
	// TArray<FString> GetAvailableAudioCultures();                                                                             // [0xc11d20] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetAkMediaAssetUserData
	// class UObject* GetAkMediaAssetUserData(class UAkMediaAsset* Instance, class UClass* Type);                               // [0xc11c50] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetAkComponent
	// class UAkComponent* GetAkComponent(class USceneComponent* AttachToComponent, bool& ComponentCreated, FName AttachPointName, FVector Location, TEnumAsByte<EAttachLocation> LocationType); // [0xc11ab0] Final|Native|Static|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.GetAkAudioTypeUserData
	// class UObject* GetAkAudioTypeUserData(class UAkAudioType* Instance, class UClass* Type);                                 // [0xc119e0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.ExecuteActionOnPlayingID
	// void ExecuteActionOnPlayingID(AkActionOnEventType ActionType, int32_t PlayingID, int32_t TransitionDuration, EAkCurveInterpolation FadeCurve); // [0xc118a0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.ExecuteActionOnEvent
	// void ExecuteActionOnEvent(class UAkAudioEvent* AkEvent, AkActionOnEventType ActionType, class AActor* Actor, int32_t TransitionDuration, EAkCurveInterpolation FadeCurve, int32_t PlayingID); // [0xc116d0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.ClearBanks
	// void ClearBanks();                                                                                                       // [0xc116b0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.CancelEventCallback
	// void CancelEventCallback(FDelegateProperty& PostEventCallback);                                                          // [0xc11610] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkGameplayStatics.AddOutputCaptureMarker
	// void AddOutputCaptureMarker(FString MarkerText);                                                                         // [0xc11580] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkCallbackInfo
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UAkCallbackInfo : public UObject
{ 
public:
	class UAkComponent*                                AkComponent;                                                // 0x0028   (0x0008)  
};

/// Class /Script/AkAudio.AkEventCallbackInfo
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 8 pad: 0x0000
class UAkEventCallbackInfo : public UAkCallbackInfo
{ 
public:
	int32_t                                            PlayingID;                                                  // 0x0030   (0x0004)  
	int32_t                                            eventId;                                                    // 0x0034   (0x0004)  
};

/// Class /Script/AkAudio.AkMIDIEventCallbackInfo
/// Size: 0x0010 (16 bytes) (0x000038 - 0x000048) align 8 pad: 0x0000
class UAkMIDIEventCallbackInfo : public UAkEventCallbackInfo
{ 
public:
	unsigned char                                      UnknownData00_1[0x10];                                      // 0x0038   (0x0010)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetType
	// EAkMidiEventType GetType();                                                                                              // [0xc1a920] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetProgramChange
	// bool GetProgramChange(FAkMidiProgramChange& AsProgramChange);                                                            // [0xc1a870] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetPitchBend
	// bool GetPitchBend(FAkMidiPitchBend& AsPitchBend);                                                                        // [0xc1a7c0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetNoteOn
	// bool GetNoteOn(FAkMidiNoteOnOff& AsNoteOn);                                                                              // [0xc1a710] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetNoteOff
	// bool GetNoteOff(FAkMidiNoteOnOff& AsNoteOff);                                                                            // [0xc1a660] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetNoteAftertouch
	// bool GetNoteAftertouch(FAkMidiNoteAftertouch& AsNoteAftertouch);                                                         // [0xc1a5b0] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetGeneric
	// bool GetGeneric(FAkMidiGeneric& AsGeneric);                                                                              // [0xc1a500] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetChannelAftertouch
	// bool GetChannelAftertouch(FAkMidiChannelAftertouch& AsChannelAftertouch);                                                // [0xc1a450] Final|Native|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetChannel
	// char GetChannel();                                                                                                       // [0xc1a420] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkMIDIEventCallbackInfo.GetCc
	// bool GetCc(FAkMidiCc& AsCc);                                                                                             // [0xc1a370] Final|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/AkAudio.AkMarkerCallbackInfo
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UAkMarkerCallbackInfo : public UAkEventCallbackInfo
{ 
public:
	int32_t                                            Identifier;                                                 // 0x0038   (0x0004)  
	int32_t                                            position;                                                   // 0x003C   (0x0004)  
	FString                                            label;                                                      // 0x0040   (0x0010)  
};

/// Class /Script/AkAudio.AkDurationCallbackInfo
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UAkDurationCallbackInfo : public UAkEventCallbackInfo
{ 
public:
	float                                              Duration;                                                   // 0x0038   (0x0004)  
	float                                              EstimatedDuration;                                          // 0x003C   (0x0004)  
	int32_t                                            AudioNodeID;                                                // 0x0040   (0x0004)  
	int32_t                                            MediaID;                                                    // 0x0044   (0x0004)  
	bool                                               bStreaming;                                                 // 0x0048   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0049   (0x0007)  MISSED
};

/// Struct /Script/AkAudio.AkSegmentInfo
/// Size: 0x0024 (36 bytes) (0x000000 - 0x000024) align 4 pad: 0x0000
struct FAkSegmentInfo
{ 
	int32_t                                            CurrentPosition;                                            // 0x0000   (0x0004)  
	int32_t                                            PreEntryDuration;                                           // 0x0004   (0x0004)  
	int32_t                                            ActiveDuration;                                             // 0x0008   (0x0004)  
	int32_t                                            PostExitDuration;                                           // 0x000C   (0x0004)  
	int32_t                                            RemainingLookAheadTime;                                     // 0x0010   (0x0004)  
	float                                              BeatDuration;                                               // 0x0014   (0x0004)  
	float                                              BarDuration;                                                // 0x0018   (0x0004)  
	float                                              GridDuration;                                               // 0x001C   (0x0004)  
	float                                              GridOffset;                                                 // 0x0020   (0x0004)  
};

/// Class /Script/AkAudio.AkMusicSyncCallbackInfo
/// Size: 0x0040 (64 bytes) (0x000030 - 0x000070) align 8 pad: 0x0000
class UAkMusicSyncCallbackInfo : public UAkCallbackInfo
{ 
public:
	int32_t                                            PlayingID;                                                  // 0x0030   (0x0004)  
	FAkSegmentInfo                                     SegmentInfo;                                                // 0x0034   (0x0024)  
	EAkCallbackType                                    MusicSyncType;                                              // 0x0058   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0059   (0x0007)  MISSED
	FString                                            UserCueName;                                                // 0x0060   (0x0010)  
};

/// Struct /Script/AkAudio.AkGeometrySurfaceOverride
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAkGeometrySurfaceOverride
{ 
	class UAkAcousticTexture*                          AcousticTexture;                                            // 0x0000   (0x0008)  
	bool                                               bEnableOcclusionOverride;                                   // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	float                                              OcclusionValue;                                             // 0x000C   (0x0004)  
	float                                              SurfaceArea;                                                // 0x0010   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.AkAcousticSurface
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAkAcousticSurface
{ 
	uint32_t                                           Texture;                                                    // 0x0000   (0x0004)  
	float                                              Occlusion;                                                  // 0x0004   (0x0004)  
	FString                                            Name;                                                       // 0x0008   (0x0010)  
};

/// Struct /Script/AkAudio.AkTriangle
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 2 pad: 0x0000
struct FAkTriangle
{ 
	uint16_t                                           Point0;                                                     // 0x0000   (0x0002)  
	uint16_t                                           Point1;                                                     // 0x0002   (0x0002)  
	uint16_t                                           Point2;                                                     // 0x0004   (0x0002)  
	uint16_t                                           Surface;                                                    // 0x0006   (0x0002)  
};

/// Struct /Script/AkAudio.AkGeometryData
/// Size: 0x0050 (80 bytes) (0x000000 - 0x000050) align 8 pad: 0x0000
struct FAkGeometryData
{ 
	TArray<FVector>                                    Vertices;                                                   // 0x0000   (0x0010)  
	TArray<FAkAcousticSurface>                         Surfaces;                                                   // 0x0010   (0x0010)  
	TArray<FAkTriangle>                                Triangles;                                                  // 0x0020   (0x0010)  
	TArray<class UPhysicalMaterial*>                   ToOverrideAcousticTexture;                                  // 0x0030   (0x0010)  
	TArray<class UPhysicalMaterial*>                   ToOverrideOcclusion;                                        // 0x0040   (0x0010)  
};

/// Class /Script/AkAudio.AkGeometryComponent
/// Size: 0x0188 (392 bytes) (0x000238 - 0x0003C0) align 16 pad: 0x0000
class UAkGeometryComponent : public UAkAcousticTextureSetComponent
{ 
public:
	AkMeshType                                         MeshType;                                                   // 0x0238   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0239   (0x0003)  MISSED
	int32_t                                            LOD;                                                        // 0x023C   (0x0004)  
	float                                              WeldingThreshold;                                           // 0x0240   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0244   (0x0004)  MISSED
	SDK_UNDEFINED(80,407) /* TMap<UMaterialInterface*, FAkGeometrySurfaceOverride> */ __um(StaticMeshSurfaceOverride); // 0x0248   (0x0050)  
	FAkGeometrySurfaceOverride                         CollisionMeshSurfaceOverride;                               // 0x0298   (0x0018)  
	bool                                               bEnableDiffraction;                                         // 0x02B0   (0x0001)  
	bool                                               bEnableDiffractionOnBoundaryEdges;                          // 0x02B1   (0x0001)  
	unsigned char                                      UnknownData02_6[0x6];                                       // 0x02B2   (0x0006)  MISSED
	class AActor*                                      AssociatedRoom;                                             // 0x02B8   (0x0008)  
	unsigned char                                      UnknownData03_6[0x8];                                       // 0x02C0   (0x0008)  MISSED
	class UPrimitiveComponent*                         Parent;                                                     // 0x02C8   (0x0008)  
	FAkGeometryData                                    GeometryData;                                               // 0x02D0   (0x0050)  
	SDK_UNDEFINED(80,408) /* TMap<int32_t, double> */  __um(SurfaceAreas);                                         // 0x0320   (0x0050)  
	SDK_UNDEFINED(80,409) /* TMap<UMaterialInterface*, FAkGeometrySurfaceOverride> */ __um(PreviousStaticMeshSurfaceOverride); // 0x0370   (0x0050)  


	/// Functions
	// Function /Script/AkAudio.AkGeometryComponent.UpdateGeometry
	// void UpdateGeometry();                                                                                                   // [0xc1a990] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGeometryComponent.SendGeometry
	// void SendGeometry();                                                                                                     // [0xc1a970] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGeometryComponent.RemoveGeometry
	// void RemoveGeometry();                                                                                                   // [0xc1a950] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkGeometryComponent.ConvertMesh
	// void ConvertMesh();                                                                                                      // [0xc1a350] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkGroupValue
/// Size: 0x0028 (40 bytes) (0x000040 - 0x000068) align 8 pad: 0x0000
class UAkGroupValue : public UAkAudioType
{ 
public:
	SDK_UNDEFINED(16,410) /* TArray<TWeakObjectPtr<UAkMediaAsset*>> */ __um(MediaDependencies);                    // 0x0040   (0x0010)  
	uint32_t                                           GroupShortID;                                               // 0x0050   (0x0004)  
	unsigned char                                      UnknownData00_7[0x14];                                      // 0x0054   (0x0014)  MISSED
};

/// Struct /Script/AkAudio.AkPluginInfo
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FAkPluginInfo
{ 
	FString                                            Name;                                                       // 0x0000   (0x0010)  
	uint32_t                                           PluginID;                                                   // 0x0010   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x0014   (0x0004)  MISSED
	FString                                            dll;                                                        // 0x0018   (0x0010)  
};

/// Class /Script/AkAudio.AkInitBankAssetData
/// Size: 0x0010 (16 bytes) (0x000088 - 0x000098) align 8 pad: 0x0000
class UAkInitBankAssetData : public UAkAssetDataWithMedia
{ 
public:
	TArray<FAkPluginInfo>                              PluginInfos;                                                // 0x0088   (0x0010)  
};

/// Class /Script/AkAudio.AkInitBank
/// Size: 0x0020 (32 bytes) (0x000050 - 0x000070) align 8 pad: 0x0000
class UAkInitBank : public UAkAssetBase
{ 
public:
	TArray<FString>                                    AvailableAudioCultures;                                     // 0x0050   (0x0010)  
	FString                                            DefaultLanguage;                                            // 0x0060   (0x0010)  
};

/// Struct /Script/AkAudio.AkAudioSession
/// Size: 0x000C (12 bytes) (0x000000 - 0x00000C) align 4 pad: 0x0000
struct FAkAudioSession
{ 
	EAkAudioSessionCategory                            AudioSessionCategory;                                       // 0x0000   (0x0004)  
	uint32_t                                           AudioSessionCategoryOptions;                                // 0x0004   (0x0004)  
	EAkAudioSessionMode                                AudioSessionMode;                                           // 0x0008   (0x0004)  
};

/// Class /Script/AkAudio.AkIOSInitializationSettings
/// Size: 0x00D8 (216 bytes) (0x000028 - 0x000100) align 8 pad: 0x0000
class UAkIOSInitializationSettings : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FAkCommonInitializationSettingsWithSampleRate      CommonSettings;                                             // 0x0030   (0x0068)  
	FAkAudioSession                                    AudioSession;                                               // 0x0098   (0x000C)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x00A4   (0x0004)  MISSED
	FAkCommunicationSettingsWithSystemInitialization   CommunicationSettings;                                      // 0x00A8   (0x0028)  
	FAkAdvancedInitializationSettings                  AdvancedSettings;                                           // 0x00D0   (0x002C)  
	unsigned char                                      UnknownData02_7[0x4];                                       // 0x00FC   (0x0004)  MISSED
};

/// Class /Script/AkAudio.AkIOSPlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkIOSPlatformInfo : public UAkPlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkItemBoolPropertiesConv
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkItemBoolPropertiesConv : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AkItemBoolPropertiesConv.Conv_FAkBoolPropertyToControlToText
	// FText Conv_FAkBoolPropertyToControlToText(FAkBoolPropertyToControl& INAkBoolPropertyToControl);                          // [0xc1e150] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AkItemBoolPropertiesConv.Conv_FAkBoolPropertyToControlToString
	// FString Conv_FAkBoolPropertyToControlToString(FAkBoolPropertyToControl& INAkBoolPropertyToControl);                      // [0xc1e060] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
};

/// Class /Script/AkAudio.AkItemBoolProperties
/// Size: 0x0040 (64 bytes) (0x000128 - 0x000168) align 8 pad: 0x0000
class UAkItemBoolProperties : public UWidget
{ 
public:
	SDK_UNDEFINED(16,411) /* FMulticastInlineDelegate */ __um(OnSelectionChanged);                                 // 0x0128   (0x0010)  
	SDK_UNDEFINED(16,412) /* FMulticastInlineDelegate */ __um(OnPropertyDragged);                                  // 0x0138   (0x0010)  
	unsigned char                                      UnknownData00_7[0x20];                                      // 0x0148   (0x0020)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkItemBoolProperties.SetSearchText
	// void SetSearchText(FString newText);                                                                                     // [0xc1e7b0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkItemBoolProperties.GetSelectedProperty
	// FString GetSelectedProperty();                                                                                           // [0xc1e390] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkItemBoolProperties.GetSearchText
	// FString GetSearchText();                                                                                                 // [0xc1e310] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkItemPropertiesConv
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkItemPropertiesConv : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AkItemPropertiesConv.Conv_FAkPropertyToControlToText
	// FText Conv_FAkPropertyToControlToText(FAkPropertyToControl& INAkPropertyToControl);                                      // [0xc1e150] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AkItemPropertiesConv.Conv_FAkPropertyToControlToString
	// FString Conv_FAkPropertyToControlToString(FAkPropertyToControl& INAkPropertyToControl);                                  // [0xc1e060] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
};

/// Class /Script/AkAudio.AkItemProperties
/// Size: 0x0040 (64 bytes) (0x000128 - 0x000168) align 8 pad: 0x0000
class UAkItemProperties : public UWidget
{ 
public:
	SDK_UNDEFINED(16,413) /* FMulticastInlineDelegate */ __um(OnSelectionChanged);                                 // 0x0128   (0x0010)  
	SDK_UNDEFINED(16,414) /* FMulticastInlineDelegate */ __um(OnPropertyDragged);                                  // 0x0138   (0x0010)  
	unsigned char                                      UnknownData00_7[0x20];                                      // 0x0148   (0x0020)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkItemProperties.SetSearchText
	// void SetSearchText(FString newText);                                                                                     // [0xc1e7b0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkItemProperties.GetSelectedProperty
	// FString GetSelectedProperty();                                                                                           // [0xc1e410] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkItemProperties.GetSearchText
	// FString GetSearchText();                                                                                                 // [0xc1e310] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkLateReverbComponent
/// Size: 0x00C0 (192 bytes) (0x000220 - 0x0002E0) align 16 pad: 0x0000
class UAkLateReverbComponent : public USceneComponent
{ 
public:
	bool                                               bEnable;                                                    // 0x0220   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0221   (0x0003)  MISSED
	float                                              SendLevel;                                                  // 0x0224   (0x0004)  
	float                                              FadeRate;                                                   // 0x0228   (0x0004)  
	float                                              Priority;                                                   // 0x022C   (0x0004)  
	bool                                               AutoAssignAuxBus;                                           // 0x0230   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0231   (0x0007)  MISSED
	class UAkAuxBus*                                   AuxBus;                                                     // 0x0238   (0x0008)  
	FString                                            AuxBusName;                                                 // 0x0240   (0x0010)  
	unsigned char                                      UnknownData02_6[0x30];                                      // 0x0250   (0x0030)  MISSED
	class ASplineSound*                                ParentSplineRegion;                                         // 0x0280   (0x0008)  
	class UAkAuxBus*                                   AuxBusManual;                                               // 0x0288   (0x0008)  
	unsigned char                                      UnknownData03_7[0x50];                                      // 0x0290   (0x0050)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkLateReverbComponent.AssociateAkTextureSetComponent
	// void AssociateAkTextureSetComponent(class UAkAcousticTextureSetComponent* textureSetComponent);                          // [0xc1dfd0] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkLinuxInitializationSettings
/// Size: 0x00C8 (200 bytes) (0x000028 - 0x0000F0) align 8 pad: 0x0000
class UAkLinuxInitializationSettings : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FAkCommonInitializationSettingsWithSampleRate      CommonSettings;                                             // 0x0030   (0x0068)  
	FAkCommunicationSettingsWithSystemInitialization   CommunicationSettings;                                      // 0x0098   (0x0028)  
	FAkAdvancedInitializationSettingsWithMultiCoreRendering AdvancedSettings;                                      // 0x00C0   (0x0030)  


	/// Functions
	// Function /Script/AkAudio.AkLinuxInitializationSettings.MigrateMultiCoreRendering
	// void MigrateMultiCoreRendering(bool NewValue);                                                                           // [0xc0e8d0] Final|Native|Public  
};

/// Class /Script/AkAudio.AkLinuxPlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkLinuxPlatformInfo : public UAkPlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkMacInitializationSettings
/// Size: 0x00C8 (200 bytes) (0x000028 - 0x0000F0) align 8 pad: 0x0000
class UAkMacInitializationSettings : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FAkCommonInitializationSettingsWithSampleRate      CommonSettings;                                             // 0x0030   (0x0068)  
	FAkCommunicationSettingsWithSystemInitialization   CommunicationSettings;                                      // 0x0098   (0x0028)  
	FAkAdvancedInitializationSettingsWithMultiCoreRendering AdvancedSettings;                                      // 0x00C0   (0x0030)  


	/// Functions
	// Function /Script/AkAudio.AkMacInitializationSettings.MigrateMultiCoreRendering
	// void MigrateMultiCoreRendering(bool NewValue);                                                                           // [0xc0e8d0] Final|Native|Public  
};

/// Class /Script/AkAudio.AkMacPlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkMacPlatformInfo : public UAkPlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkMediaAssetData
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UAkMediaAssetData : public UObject
{ 
public:
	bool                                               IsStreamed;                                                 // 0x0028   (0x0001)  
	bool                                               UseDeviceMemory;                                            // 0x0029   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x002A   (0x0006)  MISSED
	FString                                            Language;                                                   // 0x0030   (0x0010)  
	FString                                            AssetPlatform;                                              // 0x0040   (0x0010)  
	unsigned char                                      UnknownData01_7[0x28];                                      // 0x0050   (0x0028)  MISSED
};

/// Class /Script/AkAudio.AkMediaAsset
/// Size: 0x0050 (80 bytes) (0x000028 - 0x000078) align 8 pad: 0x0000
class UAkMediaAsset : public UObject
{ 
public:
	uint32_t                                           ID;                                                         // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	FString                                            MediaName;                                                  // 0x0030   (0x0010)  
	bool                                               AutoLoad;                                                   // 0x0040   (0x0001)  
	unsigned char                                      UnknownData01_6[0x7];                                       // 0x0041   (0x0007)  MISSED
	TArray<class UObject*>                             UserData;                                                   // 0x0048   (0x0010)  
	FString                                            Language;                                                   // 0x0058   (0x0010)  
	class UAkMediaAssetData*                           CurrentMediaAssetData;                                      // 0x0068   (0x0008)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0070   (0x0008)  MISSED
};

/// Class /Script/AkAudio.AkLocalizedMediaAsset
/// Size: 0x0000 (0 bytes) (0x000078 - 0x000078) align 8 pad: 0x0000
class UAkLocalizedMediaAsset : public UAkMediaAsset
{ 
public:
};

/// Class /Script/AkAudio.AkExternalMediaAsset
/// Size: 0x0060 (96 bytes) (0x000078 - 0x0000D8) align 8 pad: 0x0000
class UAkExternalMediaAsset : public UAkMediaAsset
{ 
public:
	unsigned char                                      UnknownData00_1[0x60];                                      // 0x0078   (0x0060)  MISSED
};

/// Class /Script/AkAudio.AkPlatformInitialisationSettingsBase
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkPlatformInitialisationSettingsBase : public UInterface
{ 
public:
};

/// Class /Script/AkAudio.AkReverbVolume
/// Size: 0x0038 (56 bytes) (0x000318 - 0x000350) align 8 pad: 0x0000
class AAkReverbVolume : public AVolume
{ 
public:
	bool                                               bEnabled;                                                   // 0x0318   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0319   (0x0007)  MISSED
	class UAkAuxBus*                                   AuxBus;                                                     // 0x0320   (0x0008)  
	FString                                            AuxBusName;                                                 // 0x0328   (0x0010)  
	float                                              SendLevel;                                                  // 0x0338   (0x0004)  
	float                                              FadeRate;                                                   // 0x033C   (0x0004)  
	float                                              Priority;                                                   // 0x0340   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0344   (0x0004)  MISSED
	class UAkLateReverbComponent*                      LateReverbComponent;                                        // 0x0348   (0x0008)  
};

/// Class /Script/AkAudio.AkRoomComponent
/// Size: 0x0060 (96 bytes) (0x000240 - 0x0002A0) align 16 pad: 0x0000
class UAkRoomComponent : public UAkGameObject
{ 
public:
	bool                                               bEnable;                                                    // 0x0240   (0x0001)  
	bool                                               bDynamic;                                                   // 0x0241   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0242   (0x0002)  MISSED
	float                                              Priority;                                                   // 0x0244   (0x0004)  
	float                                              WallOcclusion;                                              // 0x0248   (0x0004)  
	float                                              RoomOcclusionValue;                                         // 0x024C   (0x0004)  
	float                                              AuxSendLevel;                                               // 0x0250   (0x0004)  
	bool                                               AutoPost;                                                   // 0x0254   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0255   (0x0003)  MISSED
	class UAkLateReverbComponent*                      SameAVolumeLateReverbCom;                                   // 0x0258   (0x0008)  
	unsigned char                                      UnknownData02_6[0x20];                                      // 0x0260   (0x0020)  MISSED
	class UAkAcousticTextureSetComponent*              GeometryComponent;                                          // 0x0280   (0x0008)  
	unsigned char                                      UnknownData03_7[0x18];                                      // 0x0288   (0x0018)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkRoomComponent.SetGeometryComponent
	// void SetGeometryComponent(class UAkAcousticTextureSetComponent* textureSetComponent);                                    // [0xc1e600] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkRoomComponent.GetPrimitiveParent
	// class UPrimitiveComponent* GetPrimitiveParent();                                                                         // [0xc1e2e0] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkRtpc
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UAkRtpc : public UAkAudioType
{ 
public:
};

/// Class /Script/AkAudio.AkSettings
/// Size: 0x02B8 (696 bytes) (0x000028 - 0x0002E0) align 8 pad: 0x0000
class UAkSettings : public UObject
{ 
public:
	char                                               MaxSimultaneousReverbVolumes;                               // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0029   (0x0007)  MISSED
	FFilePath                                          WwiseProjectPath;                                           // 0x0030   (0x0010)  
	FDirectoryPath                                     WwiseSoundDataFolder;                                       // 0x0040   (0x0010)  
	bool                                               bAutoConnectToWAAPI;                                        // 0x0050   (0x0001)  
	TEnumAsByte<ECollisionChannel>                     DefaultOcclusionCollisionChannel;                           // 0x0051   (0x0001)  
	TEnumAsByte<ECollisionChannel>                     DefaultFitToGeometryCollisionChannel;                       // 0x0052   (0x0001)  
	unsigned char                                      UnknownData01_6[0x5];                                       // 0x0053   (0x0005)  MISSED
	SDK_UNDEFINED(80,415) /* TMap<TWeakObjectPtr<UPhysicalMaterial*>, FAkGeometrySurfacePropertiesToMap> */ __um(AkGeometryMap); // 0x0058   (0x0050)  
	float                                              GlobalDecayAbsorption;                                      // 0x00A8   (0x0004)  
	unsigned char                                      UnknownData02_6[0x4];                                       // 0x00AC   (0x0004)  MISSED
	SDK_UNDEFINED(40,416) /* TWeakObjectPtr<UAkAuxBus*> */ __um(DefaultReverbAuxBus);                              // 0x00B0   (0x0028)  
	SDK_UNDEFINED(80,417) /* TMap<float, TWeakObjectPtr<UAkAuxBus*>> */ __um(EnvironmentDecayAuxBusMap);           // 0x00D8   (0x0050)  
	FString                                            HFDampingName;                                              // 0x0128   (0x0010)  
	FString                                            DecayEstimateName;                                          // 0x0138   (0x0010)  
	FString                                            TimeToFirstReflectionName;                                  // 0x0148   (0x0010)  
	SDK_UNDEFINED(40,418) /* TWeakObjectPtr<UAkRtpc*> */ __um(HFDampingRTPC);                                      // 0x0158   (0x0028)  
	SDK_UNDEFINED(40,419) /* TWeakObjectPtr<UAkRtpc*> */ __um(DecayEstimateRTPC);                                  // 0x0180   (0x0028)  
	SDK_UNDEFINED(40,420) /* TWeakObjectPtr<UAkRtpc*> */ __um(TimeToFirstReflectionRTPC);                          // 0x01A8   (0x0028)  
	SDK_UNDEFINED(40,421) /* TWeakObjectPtr<UAkAudioEvent*> */ __um(AudioInputEvent);                              // 0x01D0   (0x0028)  
	SDK_UNDEFINED(80,422) /* TMap<FGuid, FAkAcousticTextureParams> */ __um(AcousticTextureParamsMap);              // 0x01F8   (0x0050)  
	bool                                               SplitSwitchContainerMedia;                                  // 0x0248   (0x0001)  
	bool                                               SplitMediaPerFolder;                                        // 0x0249   (0x0001)  
	bool                                               UseEventBasedPackaging;                                     // 0x024A   (0x0001)  
	bool                                               EnableAutomaticAssetSynchronization;                        // 0x024B   (0x0001)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x024C   (0x0004)  MISSED
	FString                                            CommandletCommitMessage;                                    // 0x0250   (0x0010)  
	SDK_UNDEFINED(80,423) /* TMap<FString, FString> */ __um(UnrealCultureToWwiseCulture);                          // 0x0260   (0x0050)  
	bool                                               AskedToUseNewAssetManagement;                               // 0x02B0   (0x0001)  
	bool                                               bEnableMultiCoreRendering;                                  // 0x02B1   (0x0001)  
	bool                                               MigratedEnableMultiCoreRendering;                           // 0x02B2   (0x0001)  
	bool                                               FixupRedirectorsDuringMigration;                            // 0x02B3   (0x0001)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x02B4   (0x0004)  MISSED
	FDirectoryPath                                     WwiseWindowsInstallationPath;                               // 0x02B8   (0x0010)  
	FFilePath                                          WwiseMacInstallationPath;                                   // 0x02C8   (0x0010)  
	unsigned char                                      UnknownData05_7[0x8];                                       // 0x02D8   (0x0008)  MISSED
};

/// Class /Script/AkAudio.AkSettingsPerUser
/// Size: 0x0058 (88 bytes) (0x000028 - 0x000080) align 8 pad: 0x0000
class UAkSettingsPerUser : public UObject
{ 
public:
	FDirectoryPath                                     WwiseWindowsInstallationPath;                               // 0x0028   (0x0010)  
	FFilePath                                          WwiseMacInstallationPath;                                   // 0x0038   (0x0010)  
	bool                                               EnableAutomaticAssetSynchronization;                        // 0x0048   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0049   (0x0007)  MISSED
	FString                                            WaapiIPAddress;                                             // 0x0050   (0x0010)  
	uint32_t                                           WaapiPort;                                                  // 0x0060   (0x0004)  
	bool                                               bAutoConnectToWAAPI;                                        // 0x0064   (0x0001)  
	bool                                               AutoSyncSelection;                                          // 0x0065   (0x0001)  
	bool                                               SuppressWwiseProjectPathWarnings;                           // 0x0066   (0x0001)  
	bool                                               SoundDataGenerationSkipLanguage;                            // 0x0067   (0x0001)  
	unsigned char                                      UnknownData01_7[0x18];                                      // 0x0068   (0x0018)  MISSED
};

/// Struct /Script/AkAudio.AkPropertyToControl
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FAkPropertyToControl
{ 
	FString                                            ItemProperty;                                               // 0x0000   (0x0010)  
};

/// Class /Script/AkAudio.AkSlider
/// Size: 0x0458 (1112 bytes) (0x000128 - 0x000580) align 8 pad: 0x0000
class UAkSlider : public UWidget
{ 
public:
	float                                              Value;                                                      // 0x0128   (0x0004)  
	SDK_UNDEFINED(16,424) /* FDelegateProperty */      __um(ValueDelegate);                                        // 0x012C   (0x0010)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x013C   (0x0004)  MISSED
	FSliderStyle                                       WidgetStyle;                                                // 0x0140   (0x0370)  
	TEnumAsByte<EOrientation>                          Orientation;                                                // 0x04B0   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x04B1   (0x0003)  MISSED
	FLinearColor                                       SliderBarColor;                                             // 0x04B4   (0x0010)  
	FLinearColor                                       SliderHandleColor;                                          // 0x04C4   (0x0010)  
	bool                                               IndentHandle;                                               // 0x04D4   (0x0001)  
	bool                                               Locked;                                                     // 0x04D5   (0x0001)  
	unsigned char                                      UnknownData02_6[0x2];                                       // 0x04D6   (0x0002)  MISSED
	float                                              StepSize;                                                   // 0x04D8   (0x0004)  
	bool                                               IsFocusable;                                                // 0x04DC   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x04DD   (0x0003)  MISSED
	FAkPropertyToControl                               ThePropertyToControl;                                       // 0x04E0   (0x0010)  
	FAkWwiseItemToControl                              ItemToControl;                                              // 0x04F0   (0x0040)  
	SDK_UNDEFINED(16,425) /* FMulticastInlineDelegate */ __um(OnValueChanged);                                     // 0x0530   (0x0010)  
	SDK_UNDEFINED(16,426) /* FMulticastInlineDelegate */ __um(OnItemDropped);                                      // 0x0540   (0x0010)  
	SDK_UNDEFINED(16,427) /* FMulticastInlineDelegate */ __um(OnPropertyDropped);                                  // 0x0550   (0x0010)  
	unsigned char                                      UnknownData04_7[0x20];                                      // 0x0560   (0x0020)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkSlider.SetValue
	// void SetValue(float InValue);                                                                                            // [0xc1e9f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetStepSize
	// void SetStepSize(float InValue);                                                                                         // [0xc1e970] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetSliderHandleColor
	// void SetSliderHandleColor(FLinearColor InValue);                                                                         // [0xc1e8e0] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetSliderBarColor
	// void SetSliderBarColor(FLinearColor InValue);                                                                            // [0xc1e850] Final|Native|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetLocked
	// void SetLocked(bool InValue);                                                                                            // [0xc1e720] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetIndentHandle
	// void SetIndentHandle(bool InValue);                                                                                      // [0xc1e690] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetAkSliderItemProperty
	// void SetAkSliderItemProperty(FString ItemProperty);                                                                      // [0xc1e560] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.SetAkSliderItemId
	// void SetAkSliderItemId(FGuid& ItemID);                                                                                   // [0xc1e4c0] Final|Native|Public|HasOutParms|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AkSlider.GetValue
	// float GetValue();                                                                                                        // [0xc1e490] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkSlider.GetAkSliderItemProperty
	// FString GetAkSliderItemProperty();                                                                                       // [0xc1e290] Final|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkSlider.GetAkSliderItemId
	// FGuid GetAkSliderItemId();                                                                                               // [0xc1e250] Final|Native|Public|HasDefaults|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkSpatialAudioVolume
/// Size: 0x0040 (64 bytes) (0x000318 - 0x000358) align 8 pad: 0x0000
class AAkSpatialAudioVolume : public AVolume
{ 
public:
	int32_t                                            RoomIndex;                                                  // 0x0318   (0x0004)  
	unsigned char                                      UnknownData00_6[0x4];                                       // 0x031C   (0x0004)  MISSED
	class USetStateComponent*                          SetStateComponent;                                          // 0x0320   (0x0008)  
	class USetSwitchComponent*                         SetSwitchComponent;                                         // 0x0328   (0x0008)  
	int32_t                                            Floor;                                                      // 0x0330   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x0334   (0x0004)  MISSED
	class UAkSurfaceReflectorSetComponent*             SurfaceReflectorSet;                                        // 0x0338   (0x0008)  
	class UAkLateReverbComponent*                      LateReverb;                                                 // 0x0340   (0x0008)  
	class UAkRoomComponent*                            Room;                                                       // 0x0348   (0x0008)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0350   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkSpatialAudioVolume.UpdateStateByDistance
	// void UpdateStateByDistance();                                                                                            // [0xc23f40] Final|Native|Private 
	// Function /Script/AkAudio.AkSpatialAudioVolume.GetVolumeInMeters
	// float GetVolumeInMeters();                                                                                               // [0xc22c70] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkSpotReflector
/// Size: 0x0028 (40 bytes) (0x0002E0 - 0x000308) align 8 pad: 0x0000
class AAkSpotReflector : public AActor
{ 
public:
	class UAkAuxBus*                                   EarlyReflectionAuxBus;                                      // 0x02E0   (0x0008)  
	FString                                            EarlyReflectionAuxBusName;                                  // 0x02E8   (0x0010)  
	class UAkAcousticTexture*                          AcousticTexture;                                            // 0x02F8   (0x0008)  
	float                                              DistanceScalingFactor;                                      // 0x0300   (0x0004)  
	float                                              Level;                                                      // 0x0304   (0x0004)  
};

/// Class /Script/AkAudio.AkStateValue
/// Size: 0x0000 (0 bytes) (0x000068 - 0x000068) align 8 pad: 0x0000
class UAkStateValue : public UAkGroupValue
{ 
public:
};

/// Class /Script/AkAudio.AkSubmixInputComponent
/// Size: 0x0060 (96 bytes) (0x000500 - 0x000560) align 16 pad: 0x0000
class UAkSubmixInputComponent : public UAkAudioInputComponent
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0500   (0x0008)  MISSED
	class USoundSubmix*                                SubmixToRecord;                                             // 0x0508   (0x0008)  
	unsigned char                                      UnknownData01_7[0x50];                                      // 0x0510   (0x0050)  MISSED
};

/// Struct /Script/AkAudio.AkSurfacePoly
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAkSurfacePoly
{ 
	class UAkAcousticTexture*                          Texture;                                                    // 0x0000   (0x0008)  
	float                                              Occlusion;                                                  // 0x0008   (0x0004)  
	bool                                               EnableSurface;                                              // 0x000C   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x000D   (0x0003)  MISSED
	float                                              SurfaceArea;                                                // 0x0010   (0x0004)  
	unsigned char                                      UnknownData01_7[0x4];                                       // 0x0014   (0x0004)  MISSED
};

/// Class /Script/AkAudio.AkSurfaceReflectorSetComponent
/// Size: 0x0038 (56 bytes) (0x000238 - 0x000270) align 16 pad: 0x0000
class UAkSurfaceReflectorSetComponent : public UAkAcousticTextureSetComponent
{ 
public:
	bool                                               bEnableSurfaceReflectors;                                   // 0x0238   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0239   (0x0007)  MISSED
	TArray<FAkSurfacePoly>                             AcousticPolys;                                              // 0x0240   (0x0010)  
	bool                                               bEnableDiffraction;                                         // 0x0250   (0x0001)  
	bool                                               bEnableDiffractionOnBoundaryEdges;                          // 0x0251   (0x0001)  
	unsigned char                                      UnknownData01_6[0x6];                                       // 0x0252   (0x0006)  MISSED
	class AActor*                                      AssociatedRoom;                                             // 0x0258   (0x0008)  
	class UModel*                                      ParentBrush;                                                // 0x0260   (0x0008)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0268   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkSurfaceReflectorSetComponent.UpdateSurfaceReflectorSet
	// void UpdateSurfaceReflectorSet();                                                                                        // [0xc23f60] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSurfaceReflectorSetComponent.SendSurfaceReflectorSet
	// void SendSurfaceReflectorSet();                                                                                          // [0xc22ef0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkSurfaceReflectorSetComponent.RemoveSurfaceReflectorSet
	// void RemoveSurfaceReflectorSet();                                                                                        // [0xc1a950] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AkSwitchValue
/// Size: 0x0000 (0 bytes) (0x000068 - 0x000068) align 8 pad: 0x0000
class UAkSwitchValue : public UAkGroupValue
{ 
public:
};

/// Class /Script/AkAudio.AkTrigger
/// Size: 0x0000 (0 bytes) (0x000040 - 0x000040) align 8 pad: 0x0000
class UAkTrigger : public UAkAudioType
{ 
public:
};

/// Class /Script/AkAudio.AkWaapiCalls
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkWaapiCalls : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AkWaapiCalls.Unsubscribe
	// FAKWaapiJsonObject Unsubscribe(FAkWaapiSubscriptionId& SubscriptionId, bool& UnsubscriptionDone);                        // [0xc23e20] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiCalls.SubscribeToWaapi
	// FAKWaapiJsonObject SubscribeToWaapi(FAkWaapiUri& WaapiUri, FAKWaapiJsonObject& WaapiOptions, FDelegateProperty& Callback, FAkWaapiSubscriptionId& SubscriptionId, bool& SubscriptionDone); // [0xc23b90] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiCalls.SetSubscriptionID
	// void SetSubscriptionID(FAkWaapiSubscriptionId& Subscription, int32_t ID);                                                // [0xc23ac0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiCalls.RegisterWaapiProjectLoadedCallback
	// bool RegisterWaapiProjectLoadedCallback(FDelegateProperty& Callback);                                                    // [0xc22e40] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiCalls.RegisterWaapiConnectionLostCallback
	// bool RegisterWaapiConnectionLostCallback(FDelegateProperty& Callback);                                                   // [0xc22d90] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiCalls.GetSubscriptionID
	// int32_t GetSubscriptionID(FAkWaapiSubscriptionId& Subscription);                                                         // [0xc22be0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiCalls.Conv_FAkWaapiSubscriptionIdToText
	// FText Conv_FAkWaapiSubscriptionIdToText(FAkWaapiSubscriptionId& INAkWaapiSubscriptionId);                                // [0xc22000] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AkWaapiCalls.Conv_FAkWaapiSubscriptionIdToString
	// FString Conv_FAkWaapiSubscriptionIdToString(FAkWaapiSubscriptionId& INAkWaapiSubscriptionId);                            // [0xc21f30] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AkWaapiCalls.CallWaapi
	// FAKWaapiJsonObject CallWaapi(FAkWaapiUri& WaapiUri, FAKWaapiJsonObject& WaapiArgs, FAKWaapiJsonObject& WaapiOptions);    // [0xc21af0] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/AkAudio.SAkWaapiFieldNamesConv
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class USAkWaapiFieldNamesConv : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.SAkWaapiFieldNamesConv.Conv_FAkWaapiFieldNamesToText
	// FText Conv_FAkWaapiFieldNamesToText(FAkWaapiFieldNames& INAkWaapiFieldNames);                                            // [0xc1e150] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.SAkWaapiFieldNamesConv.Conv_FAkWaapiFieldNamesToString
	// FString Conv_FAkWaapiFieldNamesToString(FAkWaapiFieldNames& INAkWaapiFieldNames);                                        // [0xc1e060] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
};

/// Class /Script/AkAudio.AkWaapiJsonManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkWaapiJsonManager : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AkWaapiJsonManager.SetStringField
	// FAKWaapiJsonObject SetStringField(FAkWaapiFieldNames& FieldName, FString FieldValue, FAKWaapiJsonObject Target);         // [0xc238e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.SetObjectField
	// FAKWaapiJsonObject SetObjectField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject FieldValue, FAKWaapiJsonObject Target); // [0xc236c0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.SetNumberField
	// FAKWaapiJsonObject SetNumberField(FAkWaapiFieldNames& FieldName, float FieldValue, FAKWaapiJsonObject Target);           // [0xc23500] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.SetBoolField
	// FAKWaapiJsonObject SetBoolField(FAkWaapiFieldNames& FieldName, bool FieldValue, FAKWaapiJsonObject Target);              // [0xc23330] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.SetArrayStringFields
	// FAKWaapiJsonObject SetArrayStringFields(FAkWaapiFieldNames& FieldName, TArray<FString>& FieldStringValues, FAKWaapiJsonObject Target); // [0xc23130] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.SetArrayObjectFields
	// FAKWaapiJsonObject SetArrayObjectFields(FAkWaapiFieldNames& FieldName, TArray<FAKWaapiJsonObject>& FieldObjectValues, FAKWaapiJsonObject Target); // [0xc22f10] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.GetStringField
	// FString GetStringField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject Target);                                        // [0xc22a50] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.GetObjectField
	// FAKWaapiJsonObject GetObjectField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject Target);                             // [0xc22730] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.GetNumberField
	// float GetNumberField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject Target);                                          // [0xc225e0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.GetIntegerField
	// int32_t GetIntegerField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject Target);                                       // [0xc22490] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.GetBoolField
	// bool GetBoolField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject Target);                                             // [0xc22340] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.GetArrayField
	// TArray<FAKWaapiJsonObject> GetArrayField(FAkWaapiFieldNames& FieldName, FAKWaapiJsonObject Target);                      // [0xc220f0] Final|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AkWaapiJsonManager.Conv_FAKWaapiJsonObjectToText
	// FText Conv_FAKWaapiJsonObjectToText(FAKWaapiJsonObject INAKWaapiJsonObject);                                             // [0xc21e00] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AkWaapiJsonManager.Conv_FAKWaapiJsonObjectToString
	// FString Conv_FAKWaapiJsonObjectToString(FAKWaapiJsonObject INAKWaapiJsonObject);                                         // [0xc21cf0] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/AkAudio.AkWaapiUriConv
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAkWaapiUriConv : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AkWaapiUriConv.Conv_FAkWaapiUriToText
	// FText Conv_FAkWaapiUriToText(FAkWaapiUri& INAkWaapiUri);                                                                 // [0xc1e150] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AkWaapiUriConv.Conv_FAkWaapiUriToString
	// FString Conv_FAkWaapiUriToString(FAkWaapiUri& INAkWaapiUri);                                                             // [0xc1e060] Final|Native|Static|Public|HasOutParms|BlueprintCallable|BlueprintPure 
};

/// Struct /Script/AkAudio.AkWindowsAdvancedInitializationSettings
/// Size: 0x0008 (8 bytes) (0x000030 - 0x000038) align 4 pad: 0x0000
struct FAkWindowsAdvancedInitializationSettings : FAkAdvancedInitializationSettingsWithMultiCoreRendering
{ 
	bool                                               UseHeadMountedDisplayAudioDevice;                           // 0x0030   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0031   (0x0003)  MISSED
	uint32_t                                           MaxSystemAudioObjects;                                      // 0x0034   (0x0004)  
};

/// Class /Script/AkAudio.AkWindowsInitializationSettings
/// Size: 0x00D0 (208 bytes) (0x000028 - 0x0000F8) align 8 pad: 0x0000
class UAkWindowsInitializationSettings : public UObject
{ 
public:
	unsigned char                                      UnknownData00_3[0x8];                                       // 0x0028   (0x0008)  MISSED
	FAkCommonInitializationSettingsWithSampleRate      CommonSettings;                                             // 0x0030   (0x0068)  
	FAkCommunicationSettingsWithSystemInitialization   CommunicationSettings;                                      // 0x0098   (0x0028)  
	FAkWindowsAdvancedInitializationSettings           AdvancedSettings;                                           // 0x00C0   (0x0038)  


	/// Functions
	// Function /Script/AkAudio.AkWindowsInitializationSettings.MigrateMultiCoreRendering
	// void MigrateMultiCoreRendering(bool NewValue);                                                                           // [0xc0e8d0] Final|Native|Public  
};

/// Class /Script/AkAudio.AkWin32PlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkWin32PlatformInfo : public UAkPlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkWin64PlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkWin64PlatformInfo : public UAkPlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkWindowsPlatformInfo
/// Size: 0x0000 (0 bytes) (0x000070 - 0x000070) align 8 pad: 0x0000
class UAkWindowsPlatformInfo : public UAkWin64PlatformInfo
{ 
public:
};

/// Class /Script/AkAudio.AkWwiseTree
/// Size: 0x0040 (64 bytes) (0x000128 - 0x000168) align 8 pad: 0x0000
class UAkWwiseTree : public UWidget
{ 
public:
	SDK_UNDEFINED(16,428) /* FMulticastInlineDelegate */ __um(OnSelectionChanged);                                 // 0x0128   (0x0010)  
	SDK_UNDEFINED(16,429) /* FMulticastInlineDelegate */ __um(OnItemDragged);                                      // 0x0138   (0x0010)  
	unsigned char                                      UnknownData00_7[0x20];                                      // 0x0148   (0x0020)  MISSED


	/// Functions
	// Function /Script/AkAudio.AkWwiseTree.SetSearchText
	// void SetSearchText(FString newText);                                                                                     // [0xc1e7b0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AkWwiseTree.GetSelectedItem
	// FAkWwiseObjectDetails GetSelectedItem();                                                                                 // [0xc22930] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
	// Function /Script/AkAudio.AkWwiseTree.GetSearchText
	// FString GetSearchText();                                                                                                 // [0xc228b0] Final|BlueprintCosmetic|Native|Public|BlueprintCallable|BlueprintPure|Const 
};

/// Class /Script/AkAudio.AkWwiseTreeSelector
/// Size: 0x0060 (96 bytes) (0x000128 - 0x000188) align 8 pad: 0x0000
class UAkWwiseTreeSelector : public UWidget
{ 
public:
	SDK_UNDEFINED(16,430) /* FMulticastInlineDelegate */ __um(OnSelectionChanged);                                 // 0x0128   (0x0010)  
	SDK_UNDEFINED(16,431) /* FMulticastInlineDelegate */ __um(OnItemDragged);                                      // 0x0138   (0x0010)  
	unsigned char                                      UnknownData00_7[0x40];                                      // 0x0148   (0x0040)  MISSED
};

/// Class /Script/AkAudio.AnimNotify_AudioBank
/// Size: 0x0018 (24 bytes) (0x000038 - 0x000050) align 8 pad: 0x0000
class UAnimNotify_AudioBank : public UAnimNotify
{ 
public:
	class UAkAudioBank*                                Bank;                                                       // 0x0038   (0x0008)  
	TEnumAsByte<AudioBankOperation>                    Operation;                                                  // 0x0040   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0041   (0x0003)  MISSED
	int32_t                                            DelaySecond;                                                // 0x0044   (0x0004)  
	unsigned char                                      UnknownData01_7[0x8];                                       // 0x0048   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.AnimNotify_AudioBank.UnloadBank
	// void UnloadBank();                                                                                                       // [0xc23e00] Final|Native|Private|Const 
	// Function /Script/AkAudio.AnimNotify_AudioBank.LoadBank
	// void LoadBank();                                                                                                         // [0xc22ca0] Final|Native|Private|Const 
};

/// Class /Script/AkAudio.AnimNotify_PlayAudio
/// Size: 0x0068 (104 bytes) (0x000038 - 0x0000A0) align 8 pad: 0x0000
class UAnimNotify_PlayAudio : public UAnimNotify
{ 
public:
	class UAkAudioEvent*                               AudioEvent;                                                 // 0x0038   (0x0008)  
	bool                                               Stoppable;                                                  // 0x0040   (0x0001)  
	bool                                               FollowMesh;                                                 // 0x0041   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0042   (0x0006)  MISSED
	FString                                            ComponentName;                                              // 0x0048   (0x0010)  
	bool                                               UseEmitLocation;                                            // 0x0058   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0059   (0x0003)  MISSED
	FVector                                            EmitLocation;                                               // 0x005C   (0x000C)  
	bool                                               TriggerOnSwitch;                                            // 0x0068   (0x0001)  
	bool                                               IgnoreOnSwitch;                                             // 0x0069   (0x0001)  
	unsigned char                                      UnknownData02_6[0x6];                                       // 0x006A   (0x0006)  MISSED
	FString                                            SwitchGroupName;                                            // 0x0070   (0x0010)  
	FString                                            SwitchName;                                                 // 0x0080   (0x0010)  
	bool                                               NotifyToAudioConsole;                                       // 0x0090   (0x0001)  
	unsigned char                                      UnknownData03_6[0x3];                                       // 0x0091   (0x0003)  MISSED
	SDK_UNDEFINED(8,432) /* TWeakObjectPtr<UAnimInstance*> */ __um(AnimInstance);                                  // 0x0094   (0x0008)  
	unsigned char                                      UnknownData04_7[0x4];                                       // 0x009C   (0x0004)  MISSED


	/// Functions
	// Function /Script/AkAudio.AnimNotify_PlayAudio.OnMontageEnded
	// void OnMontageEnded(class UAnimMontage* Montage, bool Interrupted);                                                      // [0xc22cc0] Final|Native|Private|Const 
};

/// Class /Script/AkAudio.AudioEmitter3D
/// Size: 0x0030 (48 bytes) (0x0002E0 - 0x000310) align 8 pad: 0x0000
class AAudioEmitter3D : public AActor
{ 
public:
	class UAkAudioEvent*                               AudioEvent;                                                 // 0x02E0   (0x0008)  
	bool                                               AutoActivate;                                               // 0x02E8   (0x0001)  
	bool                                               AutoStartStop;                                              // 0x02E9   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x02EA   (0x0002)  MISSED
	float                                              DistanceToStopSound;                                        // 0x02EC   (0x0004)  
	TArray<class UAudioStudioComponent*>               AudioStudioComponents;                                      // 0x02F0   (0x0010)  
	class UAkComponent*                                AkComponent;                                                // 0x0300   (0x0008)  
	bool                                               bIsSoundPlaying;                                            // 0x0308   (0x0001)  
	bool                                               bIsSoundPaused;                                             // 0x0309   (0x0001)  
	unsigned char                                      UnknownData01_7[0x6];                                       // 0x030A   (0x0006)  MISSED


	/// Functions
	// Function /Script/AkAudio.AudioEmitter3D.DeactivateSoundData
	// void DeactivateSoundData();                                                                                              // [0xc25cf0] Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioEmitter3D.ActivateSoundData
	// void ActivateSoundData();                                                                                                // [0xc25870] Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AudioManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAudioManager : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AudioManager.UnmuteWwiseAudio
	// void UnmuteWwiseAudio();                                                                                                 // [0xc2b5a0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.UnloadBankByName
	// int32_t UnloadBankByName(FString BankName, FString Source, bool IgnoreCounter, bool Async, FDelegateProperty& UnloadFinishCallback); // [0xc2b330] Final|Native|Static|Public|HasOutParms 
	// Function /Script/AkAudio.AudioManager.UnloadBank
	// int32_t UnloadBank(class UAkAudioBank* BankReference, class UObject* Source, bool IgnoreCounter, bool Async, FDelegateProperty& UnloadFinishCallback); // [0xc2b170] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.TogglePortalAtLocation
	// void TogglePortalAtLocation(FVector Location, bool Open, class UObject* Source);                                         // [0xc2b030] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.TestImpactSound
	// void TestImpactSound(class UAkAudioEvent* EventReference, class AActor* Emitter, bool AutoSetPos, FVector Pos, FRotator Rotation, bool enableRTPC, float Distance, bool enableAux); // [0xc2ada0] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.StopWwiseEventByName
	// void StopWwiseEventByName(FString EventName, class AActor* Emitter, float FadeoutTime, FString ComponentName, int32_t PlayingID); // [0xc2ab80] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.StopWwiseEvent
	// void StopWwiseEvent(class UAkAudioEvent* EventReference, class AActor* Emitter, float FadeoutTime, FString ComponentName, int32_t PlayingID); // [0xc2a9b0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.StopBackgroundMusic
	// void StopBackgroundMusic(float FadeoutTime);                                                                             // [0xc2a940] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.StopAnimationSound
	// void StopAnimationSound(class AActor* Emitter, float FadeoutTime);                                                       // [0xc2a880] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.StopAll
	// void StopAll(class AActor* Emitter);                                                                                     // [0xc2a800] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetVoiceVolume
	// void SetVoiceVolume(float Volume);                                                                                       // [0xc2a770] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetVoiceLanguage
	// void SetVoiceLanguage(FString NewCulture);                                                                               // [0xc2a6e0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetVoiceEnabled
	// void SetVoiceEnabled(bool Enabled);                                                                                      // [0xc2a660] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetSwitchByReference
	// void SetSwitchByReference(class UAkSwitchValue* SwitchReference, class AActor* TargetActor, FString ComponentName);      // [0xc2a500] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetSwitchByName
	// void SetSwitchByName(FString SwitchGroupName, FString SwitchName, class AActor* TargetActor, FString ComponentName);     // [0xc2a2d0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetStateByReference
	// void SetStateByReference(class UAkStateValue* StateReference, class UObject* Source);                                    // [0xc2a210] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetStateByName
	// void SetStateByName(FString StateGroupName, FString StateName, FString Source);                                          // [0xc2a020] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetSoundVolume
	// void SetSoundVolume(float Volume);                                                                                       // [0xc29fb0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetSoundEnabled
	// void SetSoundEnabled(bool Enabled);                                                                                      // [0xc29f30] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetRTPCByReference
	// void SetRTPCByReference(class UAkRtpc* ParameterReference, float Value, class AActor* TargetActor, float InterpolateTime, FString ComponentName); // [0xc29be0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetReverbEnabled
	// void SetReverbEnabled(bool Enabled);                                                                                     // [0xc29db0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetOcclusionObstructionEnabled
	// void SetOcclusionObstructionEnabled(bool Enabled);                                                                       // [0xc29b60] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetMusicVolume
	// void SetMusicVolume(float Volume);                                                                                       // [0xc29af0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetMusicEnabled
	// void SetMusicEnabled(bool Enabled);                                                                                      // [0xc29a70] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetGlobalRTPC
	// void SetGlobalRTPC(FString ParameterName, float Value, FString Source, float InterpolateTime);                           // [0xc29890] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetEmitterRTPC
	// void SetEmitterRTPC(FString ParameterName, float Value, class AActor* Emitter, float InterpolateTime, FString ComponentName); // [0xc29670] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetEarlyReflectionEnabled
	// void SetEarlyReflectionEnabled(bool Enabled);                                                                            // [0xc295f0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetDiffractionEnabled
	// void SetDiffractionEnabled(bool Enabled);                                                                                // [0xc29570] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetAudioQuality
	// void SetAudioQuality(char NewQuality);                                                                                   // [0xc29500] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SetAttenuationScaling
	// bool SetAttenuationScaling(class AActor* Emitter, float Scale, bool IsAbsolute, FString ComponentName);                  // [0xc29360] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.SeekOnWwiseEventByName
	// void SeekOnWwiseEventByName(FString EventName, int32_t Location);                                                        // [0xc29240] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.SeekOnWwiseEvent
	// void SeekOnWwiseEvent(class UAkAudioEvent* EventReference, int32_t Location);                                            // [0xc29180] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.ResumeSound
	// void ResumeSound(class UAkAudioEvent* EventReference, class AActor* Emitter, FString ComponentName, int32_t PlayingID);  // [0xc28ff0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.ResetRTPCValue
	// void ResetRTPCValue(FString ParameterName, class AActor* GameObject, float InterpolateTime, FString ComponentName);      // [0xc28e10] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.ReloadBank
	// void ReloadBank(FString BankName, FString Source);                                                                       // [0xc28ca0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.ReloadAllLoadedBanks
	// void ReloadAllLoadedBanks();                                                                                             // [0xc28c80] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PostWwiseEventByName
	// int32_t PostWwiseEventByName(FString EventName, class AActor* Emitter, bool StopOnDestroy);                              // [0xc28af0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PostWwiseEvent
	// int32_t PostWwiseEvent(class UAkAudioEvent* EventReference, class AActor* Emitter, bool StopOnDestroy);                  // [0xc289f0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PostTriggerByReference
	// void PostTriggerByReference(class UAkTrigger* TriggerReference, class AActor* TargetActor, FString ComponentName);       // [0xc28890] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PostTriggerByName
	// void PostTriggerByName(FString TriggerName, class AActor* TargetActor, FString ComponentName);                           // [0xc286f0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlayVoice3DByName
	// int32_t PlayVoice3DByName(FString EventName, class AActor* Speaker, bool WaitUntilCurrentEnd, FString ExternalFileName, int32_t RandomCount); // [0xc284c0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.PlayVoice3D
	// int32_t PlayVoice3D(class UAkAudioEvent* EventReference, class AActor* Speaker, bool WaitUntilCurrentEnd, FString ExternalFileName, int32_t RandomCount); // [0xc282d0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlayVoice2DByName
	// int32_t PlayVoice2DByName(FString EventName, FString ExternalFileName, int32_t RandomCount, FString Source);             // [0xc28090] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.PlayVoice2D
	// int32_t PlayVoice2D(class UAkAudioEvent* EventReference, FString ExternalFileName, int32_t RandomCount, FString Source); // [0xc27ea0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlaySoundAtLocationByName
	// int64_t PlaySoundAtLocationByName(FString EventName, class UObject* Source, FVector Location, FRotator Orientation, bool UseAuxSend); // [0xc27ca0] Final|Native|Static|Public|HasDefaults 
	// Function /Script/AkAudio.AudioManager.PlaySoundAtLocation
	// int64_t PlaySoundAtLocation(class UAkAudioEvent* EventReference, class UObject* Source, FVector Location, FRotator Orientation, bool UseAuxSend); // [0xc27b00] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlaySound3DByName
	// int32_t PlaySound3DByName(FString EventName, class AActor* Emitter, FString ComponentName, bool StopOnDestroy, FString Source); // [0xc27870] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.PlaySound3D
	// int32_t PlaySound3D(class UAkAudioEvent* EventReference, class AActor* Emitter, FString ComponentName, bool StopOnDestroy, FString Source); // [0xc27640] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlaySound2DByName
	// int32_t PlaySound2DByName(FString EventName, FString Source);                                                            // [0xc274d0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.PlaySound2D
	// int32_t PlaySound2D(class UAkAudioEvent* EventReference, class UObject* Source);                                         // [0xc27400] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlayMovieSound
	// int32_t PlayMovieSound(class UAkAudioEvent* EventReference, class UObject* Source, int32_t CallbackTypes);               // [0xc27300] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlayIncidentalMusicByName
	// int32_t PlayIncidentalMusicByName(FString EventName, class AActor* Player);                                              // [0xc271d0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.PlayIncidentalMusic
	// int32_t PlayIncidentalMusic(class UAkAudioEvent* EventReference, class AActor* Player);                                  // [0xc27100] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PlayBackgroundMusicByName
	// int32_t PlayBackgroundMusicByName(FString EventName, FString Source);                                                    // [0xc26f90] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.PlayBackgroundMusic
	// int32_t PlayBackgroundMusic(class UAkAudioEvent* EventReference, class UObject* Source);                                 // [0xc26ec0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.PauseSound
	// void PauseSound(class UAkAudioEvent* EventReference, class AActor* Emitter, FString ComponentName, int32_t PlayingID);   // [0xc26d30] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.MuteWwiseAudio
	// void MuteWwiseAudio();                                                                                                   // [0xc26b10] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.LoadBankByName
	// int32_t LoadBankByName(FString BankName, FString Source, bool Async, FDelegateProperty& LoadFinishCallback);             // [0xc268f0] Final|Native|Static|Public|HasOutParms 
	// Function /Script/AkAudio.AudioManager.LoadBank
	// int32_t LoadBank(class UAkAudioBank* BankReference, class UObject* Source, bool Async, FDelegateProperty& LoadFinishCallback); // [0xc26770] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.IsSwitchAt
	// bool IsSwitchAt(FString SwitchGroupName, FString SwitchName, class AActor* TargetActor, FString ComponentName);          // [0xc26530] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.IsStateAt
	// bool IsStateAt(FString StateGroupName, FString StateName);                                                               // [0xc263c0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.IsCharacterSpeakingVoice
	// bool IsCharacterSpeakingVoice(class AActor* Speaker);                                                                    // [0xc26330] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable|BlueprintPure 
	// Function /Script/AkAudio.AudioManager.GetSourcePlayPosition
	// int32_t GetSourcePlayPosition(int32_t PlayingID);                                                                        // [0xc262a0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.GetRTPCValue
	// float GetRTPCValue(FString ParameterName, class AActor* Emitter, FString ComponentName);                                 // [0xc260f0] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioManager.BreakSoundByName
	// void BreakSoundByName(FString EventName, class AActor* Emitter, FString ComponentName, int32_t PlayingID);               // [0xc25b00] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioManager.BreakSound
	// void BreakSound(class UAkAudioEvent* EventReference, class AActor* Emitter, FString ComponentName, int32_t PlayingID);   // [0xc25970] Final|BlueprintCosmetic|Native|Static|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AudioProfileInfoManager
/// Size: 0x0000 (0 bytes) (0x000028 - 0x000028) align 8 pad: 0x0000
class UAudioProfileInfoManager : public UBlueprintFunctionLibrary
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AudioProfileInfoManager.UnRegister
	// void UnRegister();                                                                                                       // [0xc2b150] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.StartAvgRecord
	// void StartAvgRecord();                                                                                                   // [0xc2a7e0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.SetShowSplineSoundOpen
	// void SetShowSplineSoundOpen(bool Value);                                                                                 // [0xc29eb0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.SetShowSpatialVolumeOpen
	// void SetShowSpatialVolumeOpen(bool Value);                                                                               // [0xc29eb0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.SetShowEmitHintOpen
	// void SetShowEmitHintOpen(bool Value);                                                                                    // [0xc29e30] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.SetReverbOpen
	// void SetReverbOpen(bool Value);                                                                                          // [0xc29db0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.SetOBOCOpen
	// void SetOBOCOpen(bool Value);                                                                                            // [0xc29b60] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.Register
	// void Register();                                                                                                         // [0xc28c60] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.PTStopWwiseEventByName
	// void PTStopWwiseEventByName(FString EventName);                                                                          // [0xc26c50] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.PTPostWwiseEventByName
	// void PTPostWwiseEventByName(FString EventName, int32_t Count);                                                           // [0xc26b30] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.GetLastAudioDebugInfo
	// FAudioStudioProfileData GetLastAudioDebugInfo();                                                                         // [0xc26090] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.GetAverageAvgAudioDebugInfo
	// FAudioStudioProfileData GetAverageAvgAudioDebugInfo(bool clearEvents);                                                   // [0xc25fc0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.GetAverageAudioDebugInfo
	// FAudioStudioProfileData GetAverageAudioDebugInfo(bool clearEvents);                                                      // [0xc25ef0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.GetAudioEventMsg
	// FAudioConsoleMessage GetAudioEventMsg(int32_t Index);                                                                    // [0xc25d60] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.GetAudioEventCount
	// int32_t GetAudioEventCount();                                                                                            // [0xc25d30] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.EndAvgRecord
	// void EndAvgRecord();                                                                                                     // [0xc25d10] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.DebugEmitHintAnim
	// void DebugEmitHintAnim();                                                                                                // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/AkAudio.AudioProfileInfoManager.ClearAudioEventMsg
	// void ClearAudioEventMsg();                                                                                               // [0xc25cd0] Final|Native|Static|Public 
	// Function /Script/AkAudio.AudioProfileInfoManager.AddEmitHintIgnoreEvent
	// void AddEmitHintIgnoreEvent(FString ignoreEvent);                                                                        // [0xc25890] Final|Native|Static|Public 
};

/// Class /Script/AkAudio.AudioStudioComponent
/// Size: 0x0000 (0 bytes) (0x0000F8 - 0x0000F8) align 8 pad: 0x0000
class UAudioStudioComponent : public UActorComponent
{ 
public:


	/// Functions
	// Function /Script/AkAudio.AudioStudioComponent.OnDeactivate
	// void OnDeactivate(class UActorComponent* Component);                                                                     // [0xc301d0] Final|Native|Private 
	// Function /Script/AkAudio.AudioStudioComponent.OnActivate
	// void OnActivate(class UActorComponent* Component, bool bReset);                                                          // [0xc30100] Final|Native|Private 
	// Function /Script/AkAudio.AudioStudioComponent.DeactivateSoundData
	// void DeactivateSoundData();                                                                                              // [0xc2fd90] Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioStudioComponent.ActivateSoundData
	// void ActivateSoundData();                                                                                                // [0xc2fc70] Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.AudioStudioSettings
/// Size: 0x00F0 (240 bytes) (0x000028 - 0x000118) align 8 pad: 0x0000
class UAudioStudioSettings : public UObject
{ 
public:
	TArray<FString>                                    PersistentBanks;                                            // 0x0028   (0x0010)  
	TArray<FString>                                    InitialStates;                                              // 0x0038   (0x0010)  
	TArray<FString>                                    InitialEvents;                                              // 0x0048   (0x0010)  
	SDK_UNDEFINED(80,433) /* TMap<FString, FLevelAudioData> */ __um(LevelAudioConfigs);                            // 0x0058   (0x0050)  
	char                                               DiffractionEnabledQuality;                                  // 0x00A8   (0x0001)  
	char                                               EarlyReflectionEnabledQuality;                              // 0x00A9   (0x0001)  
	char                                               OcclusionObstructionEnabledQuality;                         // 0x00AA   (0x0001)  
	char                                               LateReverbEnabledQuality;                                   // 0x00AB   (0x0001)  
	char                                               SoundObjectPoolSize;                                        // 0x00AC   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x00AD   (0x0003)  MISSED
	SDK_UNDEFINED(80,434) /* TMap<FString, int32_t> */ __um(RoomAuxBusRTPCConfigs);                                // 0x00B0   (0x0050)  
	FSoftObjectPath                                    EventExtendDataTable;                                       // 0x0100   (0x0018)  


	/// Functions
	// Function /Script/AkAudio.AudioStudioSettings.UnloadLevelAudioData
	// bool UnloadLevelAudioData(FString LevelName);                                                                            // [0xc30fa0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioStudioSettings.LoadLevelAudioData
	// bool LoadLevelAudioData(FString LevelName);                                                                              // [0xc30010] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioStudioSettings.LoadInitAudioData
	// void LoadInitAudioData();                                                                                                // [0xc2fff0] Final|Native|Static|Public|BlueprintCallable 
	// Function /Script/AkAudio.AudioStudioSettings.GetBankReferencedLevels
	// TArray<FString> GetBankReferencedLevels(FString BankName);                                                               // [0xc2fdd0] Final|Native|Static|Public 
};

/// Class /Script/AkAudio.AudioStudioEditorSettings
/// Size: 0x0008 (8 bytes) (0x000028 - 0x000030) align 8 pad: 0x0000
class UAudioStudioEditorSettings : public UObject
{ 
public:
	bool                                               ShowEmitterIcons;                                           // 0x0028   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0029   (0x0007)  MISSED
};

/// Class /Script/AkAudio.CAVirtualRoomComponent
/// Size: 0x0030 (48 bytes) (0x000240 - 0x000270) align 16 pad: 0x0000
class UCAVirtualRoomComponent : public UAkGameObject
{ 
public:
	int32_t                                            Priority;                                                   // 0x0240   (0x0004)  
	bool                                               bEnable : 1;                                                // 0x0244:0 (0x0001)  
	unsigned char                                      UnknownData00_5[0x3];                                       // 0x0245   (0x0003)  MISSED
	int32_t                                            FloorID;                                                    // 0x0248   (0x0004)  
	unsigned char                                      UnknownData01_7[0x24];                                      // 0x024C   (0x0024)  MISSED
};

/// Class /Script/AkAudio.CAVirtualRoomVolume
/// Size: 0x0008 (8 bytes) (0x000318 - 0x000320) align 8 pad: 0x0000
class ACAVirtualRoomVolume : public AVolume
{ 
public:
	class UCAVirtualRoomComponent*                     VirtualRoom;                                                // 0x0318   (0x0008)  
};

/// Class /Script/AkAudio.EmitterListenerManager
/// Size: 0x0198 (408 bytes) (0x000030 - 0x0001C8) align 8 pad: 0x0000
class UEmitterListenerManager : public UWorldSubsystem
{ 
public:
	SDK_UNDEFINED(16,435) /* FMulticastInlineDelegate */ __um(OnVoiceDialogEnd);                                   // 0x0030   (0x0010)  
	unsigned char                                      UnknownData00_6[0x68];                                      // 0x0040   (0x0068)  MISSED
	TArray<class UAkComponent*>                        DefaultEmitters;                                            // 0x00A8   (0x0010)  
	TArray<class AAudioEmitter3D*>                     AmbienceEmitters;                                           // 0x00B8   (0x0010)  
	TArray<class UAkComponent*>                        DefaultListeners;                                           // 0x00C8   (0x0010)  
	class UAkComponent*                                SpatialAudioListener;                                       // 0x00D8   (0x0008)  
	unsigned char                                      UnknownData01_6[0x8];                                       // 0x00E0   (0x0008)  MISSED
	SDK_UNDEFINED(80,436) /* TMap<AActor*, FString> */ __um(AnimationSoundMap);                                    // 0x00E8   (0x0050)  
	SDK_UNDEFINED(80,437) /* TMap<UAkAudioEvent*, FTArrUMultiSourceSoundComponent> */ __um(MultiSourceEvents);     // 0x0138   (0x0050)  
	unsigned char                                      UnknownData02_6[0x8];                                       // 0x0188   (0x0008)  MISSED
	TArray<class UFoliageSoundPlaybackData*>           FoliageSoundPlaybackDatas;                                  // 0x0190   (0x0010)  
	unsigned char                                      UnknownData03_6[0x8];                                       // 0x01A0   (0x0008)  MISSED
	class UDataTable*                                  EventExtendDataTable;                                       // 0x01A8   (0x0008)  
	unsigned char                                      UnknownData04_7[0x18];                                      // 0x01B0   (0x0018)  MISSED


	/// Functions
	// Function /Script/AkAudio.EmitterListenerManager.GetInstance
	// class UEmitterListenerManager* GetInstance(class UObject* WorldContextObject);                                           // [0xc2ff60] Final|Native|Static|Public|BlueprintCallable|BlueprintPure 
};

/// Class /Script/AkAudio.FoliageSoundComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UFoliageSoundComponent : public UAudioStudioComponent
{ 
public:
	TArray<class UFoliageSoundConfig*>                 SoundConfigs;                                               // 0x00F8   (0x0010)  
	float                                              SearchRadius;                                               // 0x0108   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x010C   (0x0004)  MISSED
};

/// Class /Script/AkAudio.FoliageSoundConfig
/// Size: 0x0018 (24 bytes) (0x000030 - 0x000048) align 8 pad: 0x0000
class UFoliageSoundConfig : public UDataAsset
{ 
public:
	class UAkAudioEvent*                               AudioEvent;                                                 // 0x0030   (0x0008)  
	float                                              TriggerIntervalMin;                                         // 0x0038   (0x0004)  
	float                                              TriggerIntervalMax;                                         // 0x003C   (0x0004)  
	float                                              MinHeight;                                                  // 0x0040   (0x0004)  
	float                                              MaxHeight;                                                  // 0x0044   (0x0004)  
};

/// Class /Script/AkAudio.FoliageSoundPlaybackData
/// Size: 0x0028 (40 bytes) (0x000028 - 0x000050) align 8 pad: 0x0000
class UFoliageSoundPlaybackData : public UObject
{ 
public:
	SDK_UNDEFINED(8,438) /* TWeakObjectPtr<UFoliageSoundConfig*> */ __um(SoundConfig);                             // 0x0028   (0x0008)  
	unsigned char                                      UnknownData00_6[0x10];                                      // 0x0030   (0x0010)  MISSED
	TArray<class UFoliageSoundComponent*>              FoliageSoundInstances;                                      // 0x0040   (0x0010)  
};

/// Class /Script/AkAudio.GlobalAmbienceEmitter
/// Size: 0x0008 (8 bytes) (0x000310 - 0x000318) align 8 pad: 0x0000
class AGlobalAmbienceEmitter : public AAudioEmitter3D
{ 
public:
	class ASplineSound*                                OverridingSplineSound;                                      // 0x0310   (0x0008)  
};

/// Class /Script/AkAudio.LoadBankComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class ULoadBankComponent : public UAudioStudioComponent
{ 
public:
	class UAkAudioBank*                                SoundBank;                                                  // 0x00F8   (0x0008)  
	bool                                               UseCounter;                                                 // 0x0100   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0101   (0x0007)  MISSED
};

/// Class /Script/AkAudio.MovieSceneAkAudioEventSection
/// Size: 0x00E8 (232 bytes) (0x0000E8 - 0x0001D0) align 8 pad: 0x0000
class UMovieSceneAkAudioEventSection : public UMovieSceneSection
{ 
public:
	unsigned char                                      UnknownData00_3[0x40];                                      // 0x00E8   (0x0040)  MISSED
	class UAkAudioEvent*                               Event;                                                      // 0x0128   (0x0008)  
	bool                                               RetriggerEvent;                                             // 0x0130   (0x0001)  
	unsigned char                                      UnknownData01_6[0x3];                                       // 0x0131   (0x0003)  MISSED
	int32_t                                            ScrubTailLengthMs;                                          // 0x0134   (0x0004)  
	bool                                               StopAtSectionEnd;                                           // 0x0138   (0x0001)  
	unsigned char                                      UnknownData02_6[0x7];                                       // 0x0139   (0x0007)  MISSED
	FString                                            EventName;                                                  // 0x0140   (0x0010)  
	unsigned char                                      UnknownData03_6[0x20];                                      // 0x0150   (0x0020)  MISSED
	float                                              MaxSourceDuration;                                          // 0x0170   (0x0004)  
	unsigned char                                      UnknownData04_6[0x4];                                       // 0x0174   (0x0004)  MISSED
	FString                                            MaxDurationSourceID;                                        // 0x0178   (0x0010)  
	unsigned char                                      UnknownData05_7[0x48];                                      // 0x0188   (0x0048)  MISSED
};

/// Class /Script/AkAudio.MovieSceneAkTrack
/// Size: 0x0018 (24 bytes) (0x000078 - 0x000090) align 8 pad: 0x0000
class UMovieSceneAkTrack : public UMovieSceneTrack
{ 
public:
	TArray<class UMovieSceneSection*>                  Sections;                                                   // 0x0078   (0x0010)  
	bool                                               bIsAMasterTrack;                                            // 0x0088   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0089   (0x0007)  MISSED
};

/// Class /Script/AkAudio.MovieSceneAkAudioEventTrack
/// Size: 0x0008 (8 bytes) (0x000090 - 0x000098) align 8 pad: 0x0000
class UMovieSceneAkAudioEventTrack : public UMovieSceneAkTrack
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0090   (0x0008)  MISSED
};

/// Struct /Script/AkAudio.MovieSceneTangentDataSerializationHelper
/// Size: 0x0014 (20 bytes) (0x000000 - 0x000014) align 4 pad: 0x0000
struct FMovieSceneTangentDataSerializationHelper
{ 
	float                                              ArriveTangent;                                              // 0x0000   (0x0004)  
	float                                              LeaveTangent;                                               // 0x0004   (0x0004)  
	TEnumAsByte<ERichCurveTangentWeightMode>           TangentWeightMode;                                          // 0x0008   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0009   (0x0003)  MISSED
	float                                              ArriveTangentWeight;                                        // 0x000C   (0x0004)  
	float                                              LeaveTangentWeight;                                         // 0x0010   (0x0004)  
};

/// Struct /Script/AkAudio.MovieSceneFloatValueSerializationHelper
/// Size: 0x001C (28 bytes) (0x000000 - 0x00001C) align 4 pad: 0x0000
struct FMovieSceneFloatValueSerializationHelper
{ 
	float                                              Value;                                                      // 0x0000   (0x0004)  
	TEnumAsByte<ERichCurveInterpMode>                  InterpMode;                                                 // 0x0004   (0x0001)  
	TEnumAsByte<ERichCurveTangentMode>                 TangentMode;                                                // 0x0005   (0x0001)  
	unsigned char                                      UnknownData00_6[0x2];                                       // 0x0006   (0x0002)  MISSED
	FMovieSceneTangentDataSerializationHelper          Tangent;                                                    // 0x0008   (0x0014)  
};

/// Struct /Script/AkAudio.MovieSceneFloatChannelSerializationHelper
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FMovieSceneFloatChannelSerializationHelper
{ 
	TEnumAsByte<ERichCurveExtrapolation>               PreInfinityExtrap;                                          // 0x0000   (0x0001)  
	TEnumAsByte<ERichCurveExtrapolation>               PostInfinityExtrap;                                         // 0x0001   (0x0001)  
	unsigned char                                      UnknownData00_6[0x6];                                       // 0x0002   (0x0006)  MISSED
	TArray<int32_t>                                    Times;                                                      // 0x0008   (0x0010)  
	TArray<FMovieSceneFloatValueSerializationHelper>   Values;                                                     // 0x0018   (0x0010)  
	float                                              DefaultValue;                                               // 0x0028   (0x0004)  
	bool                                               bHasDefaultValue;                                           // 0x002C   (0x0001)  
	unsigned char                                      UnknownData01_7[0x3];                                       // 0x002D   (0x0003)  MISSED
};

/// Class /Script/AkAudio.MovieSceneAkAudioRTPCSection
/// Size: 0x0168 (360 bytes) (0x0000E8 - 0x000250) align 8 pad: 0x0000
class UMovieSceneAkAudioRTPCSection : public UMovieSceneSection
{ 
public:
	class UAkRtpc*                                     RTPC;                                                       // 0x00E8   (0x0008)  
	FString                                            Name;                                                       // 0x00F0   (0x0010)  
	FRichCurve                                         FloatCurve;                                                 // 0x0100   (0x0080)  
	FMovieSceneFloatChannelSerializationHelper         FloatChannelSerializationHelper;                            // 0x0180   (0x0030)  
	FMovieSceneFloatChannel                            RTPCChannel;                                                // 0x01B0   (0x00A0)  
};

/// Class /Script/AkAudio.MovieSceneAkAudioRTPCTrack
/// Size: 0x0008 (8 bytes) (0x000090 - 0x000098) align 8 pad: 0x0000
class UMovieSceneAkAudioRTPCTrack : public UMovieSceneAkTrack
{ 
public:
	unsigned char                                      UnknownData00_1[0x8];                                       // 0x0090   (0x0008)  MISSED
};

/// Class /Script/AkAudio.MultiPositionSound
/// Size: 0x0010 (16 bytes) (0x000310 - 0x000320) align 8 pad: 0x0000
class AMultiPositionSound : public AAudioEmitter3D
{ 
public:
	TArray<class USceneComponent*>                     EmitterPoints;                                              // 0x0310   (0x0010)  
};

/// Class /Script/AkAudio.MultiSourceSoundComponent
/// Size: 0x0010 (16 bytes) (0x000220 - 0x000230) align 16 pad: 0x0000
class UMultiSourceSoundComponent : public USceneComponent
{ 
public:
	class UAkAudioEvent*                               AudioEvent;                                                 // 0x0220   (0x0008)  
	unsigned char                                      UnknownData00_7[0x8];                                       // 0x0228   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.MultiSourceSoundComponent.DeactivateSoundData
	// void DeactivateSoundData();                                                                                              // [0xc2fdb0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.MultiSourceSoundComponent.ActivateSoundData
	// void ActivateSoundData();                                                                                                // [0xc2fc90] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.MyAudioDebugEmitHint
/// Size: 0x0000 (0 bytes) (0x0002E0 - 0x0002E0) align 8 pad: 0x0000
class AMyAudioDebugEmitHint : public AActor
{ 
public:


	/// Functions
	// Function /Script/AkAudio.MyAudioDebugEmitHint.OnAudioDebugSpatialVolumeHintTrigger
	// void OnAudioDebugSpatialVolumeHintTrigger();                                                                             // [0x3a75280] Event|Public|BlueprintEvent 
	// Function /Script/AkAudio.MyAudioDebugEmitHint.OnAudioDebugEmitHintTrigger
	// void OnAudioDebugEmitHintTrigger();                                                                                      // [0x3a75280] Event|Public|BlueprintEvent 
};

/// Struct /Script/AkAudio.ParticleSoundData
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FParticleSoundData
{ 
	TEnumAsByte<EParticleEventType>                    ParticleEventType;                                          // 0x0000   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0001   (0x0003)  MISSED
	FName                                              ParticleEventName;                                          // 0x0004   (0x0008)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x000C   (0x0004)  MISSED
	class UAkAudioEvent*                               AudioEvent;                                                 // 0x0010   (0x0008)  
};

/// Class /Script/AkAudio.ParticleSoundComponent
/// Size: 0x0018 (24 bytes) (0x0000F8 - 0x000110) align 8 pad: 0x0000
class UParticleSoundComponent : public UAudioStudioComponent
{ 
public:
	TArray<FParticleSoundData>                         SoundData;                                                  // 0x00F8   (0x0010)  
	bool                                               PlaySoundAtLocation;                                        // 0x0108   (0x0001)  
	unsigned char                                      UnknownData00_7[0x7];                                       // 0x0109   (0x0007)  MISSED


	/// Functions
	// Function /Script/AkAudio.ParticleSoundComponent.OnParticleSpawn
	// void OnParticleSpawn(FName EventName, float EmitterTime, FVector Location, FVector Velocity);                            // [0xc30940] Final|Native|Private|HasDefaults 
	// Function /Script/AkAudio.ParticleSoundComponent.OnParticleDeath
	// void OnParticleDeath(FName EventName, float EmitterTime, int32_t ParticleTime, FVector Location, FVector Velocity, FVector Direction); // [0xc30740] Final|Native|Private|HasDefaults 
	// Function /Script/AkAudio.ParticleSoundComponent.OnParticleCollide
	// void OnParticleCollide(FName EventName, float EmitterTime, int32_t ParticleTime, FVector Location, FVector Velocity, FVector Direction, FVector Normal, FName BoneName, class UPhysicalMaterial* PhysMat); // [0xc30460] Final|Native|Private|HasDefaults 
	// Function /Script/AkAudio.ParticleSoundComponent.OnParticleBurst
	// void OnParticleBurst(FName EventName, float EmitterTime, int32_t ParticleCount);                                         // [0xc30350] Final|Native|Private 
};

/// Class /Script/AkAudio.PostEventAsync
/// Size: 0x0070 (112 bytes) (0x000030 - 0x0000A0) align 8 pad: 0x0000
class UPostEventAsync : public UBlueprintAsyncActionBase
{ 
public:
	SDK_UNDEFINED(16,439) /* FMulticastInlineDelegate */ __um(Completed);                                          // 0x0030   (0x0010)  
	unsigned char                                      UnknownData00_7[0x60];                                      // 0x0040   (0x0060)  MISSED


	/// Functions
	// Function /Script/AkAudio.PostEventAsync.PostEventAsync
	// class UPostEventAsync* PostEventAsync(class UObject* WorldContextObject, class UAkAudioEvent* AkEvent, class AActor* Actor, int32_t CallbackMask, FDelegateProperty& PostEventCallback, TArray<FAkExternalSourceInfo>& ExternalSources, bool bStopWhenAttachedToDestroyed); // [0xc30b10] Final|BlueprintCosmetic|Native|Static|Public|HasOutParms|BlueprintCallable 
	// Function /Script/AkAudio.PostEventAsync.PollPostEventFuture
	// void PollPostEventFuture();                                                                                              // [0xc30ad0] Final|Native|Private 
};

/// Class /Script/AkAudio.PostEventAtLocationAsync
/// Size: 0x0050 (80 bytes) (0x000030 - 0x000080) align 8 pad: 0x0000
class UPostEventAtLocationAsync : public UBlueprintAsyncActionBase
{ 
public:
	SDK_UNDEFINED(16,440) /* FMulticastInlineDelegate */ __um(Completed);                                          // 0x0030   (0x0010)  
	unsigned char                                      UnknownData00_7[0x40];                                      // 0x0040   (0x0040)  MISSED


	/// Functions
	// Function /Script/AkAudio.PostEventAtLocationAsync.PostEventAtLocationAsync
	// class UPostEventAtLocationAsync* PostEventAtLocationAsync(class UObject* WorldContextObject, class UAkAudioEvent* AkEvent, FVector Location, FRotator Orientation); // [0xc30da0] Final|BlueprintCosmetic|Native|Static|Public|HasDefaults|BlueprintCallable 
	// Function /Script/AkAudio.PostEventAtLocationAsync.PollPostEventFuture
	// void PollPostEventFuture();                                                                                              // [0xc30af0] Final|Native|Private 
};

/// Class /Script/AkAudio.RainSoundPlane
/// Size: 0x0000 (0 bytes) (0x000310 - 0x000310) align 8 pad: 0x0000
class ARainSoundPlane : public AAudioEmitter3D
{ 
public:
};

/// Class /Script/AkAudio.SetAttenuationComponent
/// Size: 0x0010 (16 bytes) (0x0000F8 - 0x000108) align 8 pad: 0x0000
class USetAttenuationComponent : public UAudioStudioComponent
{ 
public:
	float                                              ActivateValue;                                              // 0x00F8   (0x0004)  
	float                                              ResetValue;                                                 // 0x00FC   (0x0004)  
	bool                                               IsGlobal;                                                   // 0x0100   (0x0001)  
	bool                                               IsAbsoluteValue;                                            // 0x0101   (0x0001)  
	unsigned char                                      UnknownData00_7[0x6];                                       // 0x0102   (0x0006)  MISSED
};

/// Class /Script/AkAudio.SetRTPCComponent
/// Size: 0x0070 (112 bytes) (0x0000F8 - 0x000168) align 8 pad: 0x0000
class USetRTPCComponent : public UAudioStudioComponent
{ 
public:
	FString                                            RTPCName;                                                   // 0x00F8   (0x0010)  
	float                                              InitialValue;                                               // 0x0108   (0x0004)  
	float                                              ResetValue;                                                 // 0x010C   (0x0004)  
	bool                                               IsGlobal;                                                   // 0x0110   (0x0001)  
	bool                                               BindToGeographicRTPCType;                                   // 0x0111   (0x0001)  
	EGeographicRTPCType                                GeographicRTPCType;                                         // 0x0112   (0x0001)  
	bool                                               TickWithAkComponent;                                        // 0x0113   (0x0001)  
	bool                                               SlewWithDeltaTime;                                          // 0x0114   (0x0001)  
	unsigned char                                      UnknownData00_6[0x3];                                       // 0x0115   (0x0003)  MISSED
	float                                              CoolDownTime;                                               // 0x0118   (0x0004)  
	bool                                               IgnoreTickWhenListeningToSelf;                              // 0x011C   (0x0001)  
	unsigned char                                      UnknownData01_6[0x13];                                      // 0x011D   (0x0013)  MISSED
	float                                              CurrentValue;                                               // 0x0130   (0x0004)  
	unsigned char                                      UnknownData02_6[0x18];                                      // 0x0134   (0x0018)  MISSED
	SDK_UNDEFINED(8,441) /* TWeakObjectPtr<AActor*> */ __um(ConnectedActor);                                       // 0x014C   (0x0008)  
	unsigned char                                      UnknownData03_6[0x4];                                       // 0x0154   (0x0004)  MISSED
	class UAkComponent*                                AkComponent;                                                // 0x0158   (0x0008)  
	unsigned char                                      UnknownData04_7[0x8];                                       // 0x0160   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.SetRTPCComponent.TickRTPC
	// void TickRTPC(float DeltaTime);                                                                                          // [0xc30f20] Final|BlueprintCosmetic|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.SetRTPCComponent.OnHearingFactorChanged
	// void OnHearingFactorChanged(bool bCanTick, FString InRTPCName);                                                          // [0xc30260] Final|Native|Public  
	// Function /Script/AkAudio.SetRTPCComponent.ConnectToGameParameter
	// void ConnectToGameParameter(float& ConnectingParameter, class AActor* TargetActor);                                      // [0xc2fcb0] Final|BlueprintCosmetic|Native|Public|HasOutParms|BlueprintCallable 
};

/// Class /Script/AkAudio.SetStateComponent
/// Size: 0x0030 (48 bytes) (0x0000F8 - 0x000128) align 8 pad: 0x0000
class USetStateComponent : public UAudioStudioComponent
{ 
public:
	FString                                            StateGroupName;                                             // 0x00F8   (0x0010)  
	FString                                            ActivateStateName;                                          // 0x0108   (0x0010)  
	FString                                            DeactivateStateName;                                        // 0x0118   (0x0010)  
};

/// Class /Script/AkAudio.SetSwitchComponent
/// Size: 0x0030 (48 bytes) (0x0000F8 - 0x000128) align 8 pad: 0x0000
class USetSwitchComponent : public UAudioStudioComponent
{ 
public:
	FString                                            SwitchGroupName;                                            // 0x00F8   (0x0010)  
	FString                                            ActivateSwitchName;                                         // 0x0108   (0x0010)  
	FString                                            DeactivateSwitchName;                                       // 0x0118   (0x0010)  


	/// Functions
	// Function /Script/AkAudio.SetSwitchComponent.DeactivateSwitchOnOtherActor
	// void DeactivateSwitchOnOtherActor(class AActor* Actor);                                                                  // [0xc318f0] Final|Native|Public|BlueprintCallable 
	// Function /Script/AkAudio.SetSwitchComponent.ActivateSwitchOnOtherActor
	// void ActivateSwitchOnOtherActor(class AActor* Actor);                                                                    // [0xc31860] Final|Native|Public|BlueprintCallable 
};

/// Class /Script/AkAudio.SplineSound
/// Size: 0x0038 (56 bytes) (0x000310 - 0x000348) align 8 pad: 0x0000
class ASplineSound : public AAudioEmitter3D
{ 
public:
	float                                              SplineRadius;                                               // 0x0310   (0x0004)  
	float                                              RegionHeight;                                               // 0x0314   (0x0004)  
	bool                                               OverrideGlobalAmbienceSound;                                // 0x0318   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0319   (0x0007)  MISSED
	class USplineComponent*                            SplineComponent;                                            // 0x0320   (0x0008)  
	unsigned char                                      UnknownData01_6[0x14];                                      // 0x0328   (0x0014)  MISSED
	FColor                                             OutlineColor;                                               // 0x033C   (0x0004)  
	unsigned char                                      UnknownData02_7[0x8];                                       // 0x0340   (0x0008)  MISSED


	/// Functions
	// Function /Script/AkAudio.SplineSound.SetInSamePlane
	// void SetInSamePlane();                                                                                                   // [0xc31a40] Native|Event|Public|BlueprintEvent 
	// Function /Script/AkAudio.SplineSound.ReversePointsOrder
	// void ReversePointsOrder();                                                                                               // [0xc31a20] Native|Event|Public|BlueprintEvent 
	// Function /Script/AkAudio.SplineSound.IsEmitterWithinRegion
	// bool IsEmitterWithinRegion(FVector EmitterLocation);                                                                     // [0xc31980] Final|Native|Public|HasDefaults|BlueprintCallable 
};

/// Struct /Script/AkAudio.AKWaapiJsonObject
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FAKWaapiJsonObject
{ 
	unsigned char                                      UnknownData00_2[0x10];                                      // 0x0000   (0x0010)  MISSED
};

/// Struct /Script/AkAudio.AkWaapiSubscriptionId
/// Size: 0x0008 (8 bytes) (0x000000 - 0x000008) align 8 pad: 0x0000
struct FAkWaapiSubscriptionId
{ 
	unsigned char                                      UnknownData00_2[0x8];                                       // 0x0000   (0x0008)  MISSED
};

/// Struct /Script/AkAudio.AkExternalSourceInfo
/// Size: 0x0038 (56 bytes) (0x000000 - 0x000038) align 8 pad: 0x0000
struct FAkExternalSourceInfo
{ 
	FString                                            ExternalSrcName;                                            // 0x0000   (0x0010)  
	AkCodecId                                          CodecID;                                                    // 0x0010   (0x0001)  
	unsigned char                                      UnknownData00_6[0x7];                                       // 0x0011   (0x0007)  MISSED
	FString                                            Filename;                                                   // 0x0018   (0x0010)  
	class UAkExternalMediaAsset*                       ExternalSourceAsset;                                        // 0x0028   (0x0008)  
	bool                                               IsStreamed;                                                 // 0x0030   (0x0001)  
	unsigned char                                      UnknownData01_7[0x7];                                       // 0x0031   (0x0007)  MISSED
};

/// Struct /Script/AkAudio.AkMidiEventBase
/// Size: 0x0002 (2 bytes) (0x000000 - 0x000002) align 1 pad: 0x0000
struct FAkMidiEventBase
{ 
	EAkMidiEventType                                   Type;                                                       // 0x0000   (0x0001)  
	char                                               Chan;                                                       // 0x0001   (0x0001)  
};

/// Struct /Script/AkAudio.AkMidiProgramChange
/// Size: 0x0001 (1 bytes) (0x000002 - 0x000003) align 1 pad: 0x0000
struct FAkMidiProgramChange : FAkMidiEventBase
{ 
	char                                               ProgramNum;                                                 // 0x0002   (0x0001)  
};

/// Struct /Script/AkAudio.AkMidiChannelAftertouch
/// Size: 0x0001 (1 bytes) (0x000002 - 0x000003) align 1 pad: 0x0000
struct FAkMidiChannelAftertouch : FAkMidiEventBase
{ 
	char                                               Value;                                                      // 0x0002   (0x0001)  
};

/// Struct /Script/AkAudio.AkMidiNoteAftertouch
/// Size: 0x0002 (2 bytes) (0x000002 - 0x000004) align 1 pad: 0x0000
struct FAkMidiNoteAftertouch : FAkMidiEventBase
{ 
	char                                               Note;                                                       // 0x0002   (0x0001)  
	char                                               Value;                                                      // 0x0003   (0x0001)  
};

/// Struct /Script/AkAudio.AkMidiPitchBend
/// Size: 0x0006 (6 bytes) (0x000002 - 0x000008) align 4 pad: 0x0000
struct FAkMidiPitchBend : FAkMidiEventBase
{ 
	char                                               ValueLsb;                                                   // 0x0002   (0x0001)  
	char                                               ValueMsb;                                                   // 0x0003   (0x0001)  
	int32_t                                            FullValue;                                                  // 0x0004   (0x0004)  
};

/// Struct /Script/AkAudio.AkMidiCc
/// Size: 0x0002 (2 bytes) (0x000002 - 0x000004) align 1 pad: 0x0000
struct FAkMidiCc : FAkMidiEventBase
{ 
	EAkMidiCcValues                                    Cc;                                                         // 0x0002   (0x0001)  
	char                                               Value;                                                      // 0x0003   (0x0001)  
};

/// Struct /Script/AkAudio.AkMidiNoteOnOff
/// Size: 0x0002 (2 bytes) (0x000002 - 0x000004) align 1 pad: 0x0000
struct FAkMidiNoteOnOff : FAkMidiEventBase
{ 
	char                                               Note;                                                       // 0x0002   (0x0001)  
	char                                               Velocity;                                                   // 0x0003   (0x0001)  
};

/// Struct /Script/AkAudio.AkMidiGeneric
/// Size: 0x0002 (2 bytes) (0x000002 - 0x000004) align 1 pad: 0x0000
struct FAkMidiGeneric : FAkMidiEventBase
{ 
	char                                               Param1;                                                     // 0x0002   (0x0001)  
	char                                               Param2;                                                     // 0x0003   (0x0001)  
};

/// Struct /Script/AkAudio.AkOutputSettings
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 8 pad: 0x0000
struct FAkOutputSettings
{ 
	FString                                            AudioDeviceSharesetName;                                    // 0x0000   (0x0010)  
	int32_t                                            IdDevice;                                                   // 0x0010   (0x0004)  
	PanningRule                                        PanRule;                                                    // 0x0014   (0x0001)  
	AkChannelConfiguration                             ChannelConfig;                                              // 0x0015   (0x0001)  
	unsigned char                                      UnknownData00_7[0x2];                                       // 0x0016   (0x0002)  MISSED
};

/// Struct /Script/AkAudio.AkChannelMask
/// Size: 0x0004 (4 bytes) (0x000000 - 0x000004) align 4 pad: 0x0000
struct FAkChannelMask
{ 
	int32_t                                            ChannelMask;                                                // 0x0000   (0x0004)  
};

/// Struct /Script/AkAudio.AkCommunicationSettingsWithCommSelection
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FAkCommunicationSettingsWithCommSelection : FAkCommunicationSettings
{ 
	EAkCommSystem                                      CommunicationSystem;                                        // 0x0020   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0024   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.AkReverbDescriptor
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 8 pad: 0x0000
struct FAkReverbDescriptor
{ 
	unsigned char                                      UnknownData00_2[0x28];                                      // 0x0000   (0x0028)  MISSED
};

/// Struct /Script/AkAudio.AkAcousticTextureParams
/// Size: 0x0020 (32 bytes) (0x000000 - 0x000020) align 16 pad: 0x0000
struct FAkAcousticTextureParams
{ 
	FVector4                                           AbsorptionValues;                                           // 0x0000   (0x0010)  
	unsigned char                                      UnknownData00_7[0x10];                                      // 0x0010   (0x0010)  MISSED
};

/// Struct /Script/AkAudio.AkGeometrySurfacePropertiesToMap
/// Size: 0x0030 (48 bytes) (0x000000 - 0x000030) align 8 pad: 0x0000
struct FAkGeometrySurfacePropertiesToMap
{ 
	SDK_UNDEFINED(40,442) /* TWeakObjectPtr<UAkAcousticTexture*> */ __um(AcousticTexture);                         // 0x0000   (0x0028)  
	float                                              OcclusionValue;                                             // 0x0028   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x002C   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.AkSurfaceEdgeInfo
/// Size: 0x0028 (40 bytes) (0x000000 - 0x000028) align 4 pad: 0x0000
struct FAkSurfaceEdgeInfo
{ 
	unsigned char                                      UnknownData00_2[0x28];                                      // 0x0000   (0x0028)  MISSED
};

/// Struct /Script/AkAudio.AkSurfaceEdgeVerts
/// Size: 0x0018 (24 bytes) (0x000000 - 0x000018) align 4 pad: 0x0000
struct FAkSurfaceEdgeVerts
{ 
	unsigned char                                      UnknownData00_2[0x18];                                      // 0x0000   (0x0018)  MISSED
};

/// Struct /Script/AkAudio.AkWaapiFieldNames
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FAkWaapiFieldNames
{ 
	FString                                            FieldName;                                                  // 0x0000   (0x0010)  
};

/// Struct /Script/AkAudio.AkWaapiUri
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FAkWaapiUri
{ 
	FString                                            Uri;                                                        // 0x0000   (0x0010)  
};

/// Struct /Script/AkAudio.AudioConsoleMessage
/// Size: 0x0040 (64 bytes) (0x000000 - 0x000040) align 8 pad: 0x0000
struct FAudioConsoleMessage
{ 
	float                                              TimeSeconds;                                                // 0x0000   (0x0004)  
	TEnumAsByte<AudioLogVerbosity>                     Verbosity;                                                  // 0x0004   (0x0001)  
	TEnumAsByte<AudioAction>                           Action;                                                     // 0x0005   (0x0001)  
	TEnumAsByte<AudioObjectType>                       ObjectType;                                                 // 0x0006   (0x0001)  
	unsigned char                                      UnknownData00_6[0x1];                                       // 0x0007   (0x0001)  MISSED
	FString                                            ObjectName;                                                 // 0x0008   (0x0010)  
	FString                                            GameObject;                                                 // 0x0018   (0x0010)  
	float                                              Value;                                                      // 0x0028   (0x0004)  
	unsigned char                                      UnknownData01_6[0x4];                                       // 0x002C   (0x0004)  MISSED
	FString                                            Source;                                                     // 0x0030   (0x0010)  
};

/// Struct /Script/AkAudio.AudioStudioProfileData
/// Size: 0x0060 (96 bytes) (0x000000 - 0x000060) align 8 pad: 0x0000
struct FAudioStudioProfileData
{ 
	double                                             ak_totalCPU;                                                // 0x0000   (0x0008)  
	double                                             ak_pluginCPU;                                               // 0x0008   (0x0008)  
	double                                             ak_calCpuByRendertime;                                      // 0x0010   (0x0008)  
	uint32_t                                           ak_physicalVoices;                                          // 0x0018   (0x0004)  
	uint32_t                                           ak_virtualVoices;                                           // 0x001C   (0x0004)  
	uint32_t                                           ak_totalVoices;                                             // 0x0020   (0x0004)  
	uint32_t                                           ak_nbActiveEvents;                                          // 0x0024   (0x0004)  
	float                                              ak_memory;                                                  // 0x0028   (0x0004)  
	float                                              gameCPU;                                                    // 0x002C   (0x0004)  
	float                                              FrameTime;                                                  // 0x0030   (0x0004)  
	float                                              gameThreadTime;                                             // 0x0034   (0x0004)  
	float                                              gameMemory;                                                 // 0x0038   (0x0004)  
	uint32_t                                           ak_memory_Used;                                             // 0x003C   (0x0004)  
	uint32_t                                           ak_memory_DeviceUsed;                                       // 0x0040   (0x0004)  
	uint32_t                                           ak_memory_Reserved;                                         // 0x0044   (0x0004)  
	uint32_t                                           ak_memory_Max;                                              // 0x0048   (0x0004)  
	float                                              ak_volume_bus_weapon;                                       // 0x004C   (0x0004)  
	float                                              ak_volume_bus_action;                                       // 0x0050   (0x0004)  
	float                                              ak_volume_bus_ambience;                                     // 0x0054   (0x0004)  
	float                                              ak_volume_bus_voice;                                        // 0x0058   (0x0004)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x005C   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.LevelAudioData
/// Size: 0x0058 (88 bytes) (0x000000 - 0x000058) align 8 pad: 0x0000
struct FLevelAudioData
{ 
	FString                                            InheritedConfigName;                                        // 0x0000   (0x0010)  
	TArray<FString>                                    Levels;                                                     // 0x0010   (0x0010)  
	TArray<FString>                                    Banks;                                                      // 0x0020   (0x0010)  
	TArray<FString>                                    States;                                                     // 0x0030   (0x0010)  
	TArray<FString>                                    Events;                                                     // 0x0040   (0x0010)  
	bool                                               UnloadBanksOnLevelUnload;                                   // 0x0050   (0x0001)  
	bool                                               StopEventsOnLevelUnload;                                    // 0x0051   (0x0001)  
	bool                                               StopAll2DSoundsOnLevelUnload;                               // 0x0052   (0x0001)  
	bool                                               LevelNameExactMatch;                                        // 0x0053   (0x0001)  
	unsigned char                                      UnknownData00_7[0x4];                                       // 0x0054   (0x0004)  MISSED
};

/// Struct /Script/AkAudio.AudioEventExtendData_HD
/// Size: 0x0008 (8 bytes) (0x000008 - 0x000010) align 8 pad: 0x0000
struct FAudioEventExtendData_HD : FTableRowBase
{ 
	FName                                              Category;                                                   // 0x0008   (0x0008)  
};

/// Struct /Script/AkAudio.TArrUMultiSourceSoundComponent
/// Size: 0x0010 (16 bytes) (0x000000 - 0x000010) align 8 pad: 0x0000
struct FTArrUMultiSourceSoundComponent
{ 
	TArray<class UMultiSourceSoundComponent*>          TArrUMultiSourceSoundComponent;                             // 0x0000   (0x0010)  
};

/// Struct /Script/AkAudio.MovieSceneAkAudioEventTemplate
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FMovieSceneAkAudioEventTemplate : FMovieSceneEvalTemplate
{ 
	class UMovieSceneAkAudioEventSection*              Section;                                                    // 0x0020   (0x0008)  
};

/// Struct /Script/AkAudio.MovieSceneAkAudioRTPCTemplate
/// Size: 0x0008 (8 bytes) (0x000020 - 0x000028) align 8 pad: 0x0000
struct FMovieSceneAkAudioRTPCTemplate : FMovieSceneEvalTemplate
{ 
	class UMovieSceneAkAudioRTPCSection*               Section;                                                    // 0x0020   (0x0008)  
};

static_assert(sizeof(UAkPortalComponent) == 0x0310); // 784 bytes (0x000220 - 0x000310)
static_assert(sizeof(AAkAcousticPortal) == 0x0328); // 808 bytes (0x000318 - 0x000328)
static_assert(sizeof(UAkAudioType) == 0x0040); // 64 bytes (0x000028 - 0x000040)
static_assert(sizeof(UAkAcousticTexture) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UAkAcousticTextureSetComponent) == 0x0238); // 568 bytes (0x000220 - 0x000238)
static_assert(sizeof(AAkAmbientSound) == 0x0320); // 800 bytes (0x0002E0 - 0x000320)
static_assert(sizeof(FAkMainOutputSettings) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FAkSpatialAudioSettings) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FAkCommonInitializationSettings) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FAkCommonInitializationSettingsWithSampleRate) == 0x0068); // 104 bytes (0x000060 - 0x000068)
static_assert(sizeof(FAkCommunicationSettings) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FAkCommunicationSettingsWithSystemInitialization) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(sizeof(FAkAdvancedInitializationSettings) == 0x002C); // 44 bytes (0x000000 - 0x00002C)
static_assert(sizeof(FAkAdvancedInitializationSettingsWithMultiCoreRendering) == 0x0030); // 48 bytes (0x00002C - 0x000030)
static_assert(sizeof(FAkAndroidAdvancedInitializationSettings) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(UAkAndroidInitializationSettings) == 0x00F8); // 248 bytes (0x000028 - 0x0000F8)
static_assert(sizeof(UAkPlatformInfo) == 0x0070); // 112 bytes (0x000028 - 0x000070)
static_assert(sizeof(UAkAndroidPlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkAssetBase) == 0x0050); // 80 bytes (0x000040 - 0x000050)
static_assert(sizeof(UAkAssetData) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(UAkAssetDataWithMedia) == 0x0088); // 136 bytes (0x000078 - 0x000088)
static_assert(sizeof(UAkAssetPlatformData) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UAkAssetDataSwitchContainerData) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(UAkAssetDataSwitchContainer) == 0x00F0); // 240 bytes (0x000088 - 0x0000F0)
static_assert(sizeof(UAkAudioEventData) == 0x0290); // 656 bytes (0x0000F0 - 0x000290)
static_assert(sizeof(UAkAudioBank) == 0x0118); // 280 bytes (0x000050 - 0x000118)
static_assert(sizeof(UAkAudioEvent) == 0x00D0); // 208 bytes (0x000050 - 0x0000D0)
static_assert(sizeof(UAkGameObject) == 0x0240); // 576 bytes (0x000220 - 0x000240)
static_assert(sizeof(FVoicePlayingData) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(UAkComponent) == 0x04D0); // 1232 bytes (0x000240 - 0x0004D0)
static_assert(sizeof(UAkAudioInputComponent) == 0x0500); // 1280 bytes (0x0004D0 - 0x000500)
static_assert(sizeof(UAkAuxBus) == 0x0058); // 88 bytes (0x000050 - 0x000058)
static_assert(sizeof(FAkBoolPropertyToControl) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAkWwiseObjectDetails) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FAkWwiseItemToControl) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(UAkCheckBox) == 0x0BD0); // 3024 bytes (0x000140 - 0x000BD0)
static_assert(sizeof(UDrawPortalComponent) == 0x05E0); // 1504 bytes (0x0005D8 - 0x0005E0)
static_assert(sizeof(UDrawRoomComponent) == 0x05E0); // 1504 bytes (0x0005D8 - 0x0005E0)
static_assert(sizeof(UAkFolder) == 0x00B8); // 184 bytes (0x000040 - 0x0000B8)
static_assert(sizeof(UAkGameplayStatics) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAkCallbackInfo) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UAkEventCallbackInfo) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(UAkMIDIEventCallbackInfo) == 0x0048); // 72 bytes (0x000038 - 0x000048)
static_assert(sizeof(UAkMarkerCallbackInfo) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UAkDurationCallbackInfo) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(FAkSegmentInfo) == 0x0024); // 36 bytes (0x000000 - 0x000024)
static_assert(sizeof(UAkMusicSyncCallbackInfo) == 0x0070); // 112 bytes (0x000030 - 0x000070)
static_assert(sizeof(FAkGeometrySurfaceOverride) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAkAcousticSurface) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAkTriangle) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FAkGeometryData) == 0x0050); // 80 bytes (0x000000 - 0x000050)
static_assert(sizeof(UAkGeometryComponent) == 0x03C0); // 960 bytes (0x000238 - 0x0003C0)
static_assert(sizeof(UAkGroupValue) == 0x0068); // 104 bytes (0x000040 - 0x000068)
static_assert(sizeof(FAkPluginInfo) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(UAkInitBankAssetData) == 0x0098); // 152 bytes (0x000088 - 0x000098)
static_assert(sizeof(UAkInitBank) == 0x0070); // 112 bytes (0x000050 - 0x000070)
static_assert(sizeof(FAkAudioSession) == 0x000C); // 12 bytes (0x000000 - 0x00000C)
static_assert(sizeof(UAkIOSInitializationSettings) == 0x0100); // 256 bytes (0x000028 - 0x000100)
static_assert(sizeof(UAkIOSPlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkItemBoolPropertiesConv) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAkItemBoolProperties) == 0x0168); // 360 bytes (0x000128 - 0x000168)
static_assert(sizeof(UAkItemPropertiesConv) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAkItemProperties) == 0x0168); // 360 bytes (0x000128 - 0x000168)
static_assert(sizeof(UAkLateReverbComponent) == 0x02E0); // 736 bytes (0x000220 - 0x0002E0)
static_assert(sizeof(UAkLinuxInitializationSettings) == 0x00F0); // 240 bytes (0x000028 - 0x0000F0)
static_assert(sizeof(UAkLinuxPlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkMacInitializationSettings) == 0x00F0); // 240 bytes (0x000028 - 0x0000F0)
static_assert(sizeof(UAkMacPlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkMediaAssetData) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(UAkMediaAsset) == 0x0078); // 120 bytes (0x000028 - 0x000078)
static_assert(sizeof(UAkLocalizedMediaAsset) == 0x0078); // 120 bytes (0x000078 - 0x000078)
static_assert(sizeof(UAkExternalMediaAsset) == 0x00D8); // 216 bytes (0x000078 - 0x0000D8)
static_assert(sizeof(UAkPlatformInitialisationSettingsBase) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(AAkReverbVolume) == 0x0350); // 848 bytes (0x000318 - 0x000350)
static_assert(sizeof(UAkRoomComponent) == 0x02A0); // 672 bytes (0x000240 - 0x0002A0)
static_assert(sizeof(UAkRtpc) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UAkSettings) == 0x02E0); // 736 bytes (0x000028 - 0x0002E0)
static_assert(sizeof(UAkSettingsPerUser) == 0x0080); // 128 bytes (0x000028 - 0x000080)
static_assert(sizeof(FAkPropertyToControl) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(UAkSlider) == 0x0580); // 1408 bytes (0x000128 - 0x000580)
static_assert(sizeof(AAkSpatialAudioVolume) == 0x0358); // 856 bytes (0x000318 - 0x000358)
static_assert(sizeof(AAkSpotReflector) == 0x0308); // 776 bytes (0x0002E0 - 0x000308)
static_assert(sizeof(UAkStateValue) == 0x0068); // 104 bytes (0x000068 - 0x000068)
static_assert(sizeof(UAkSubmixInputComponent) == 0x0560); // 1376 bytes (0x000500 - 0x000560)
static_assert(sizeof(FAkSurfacePoly) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UAkSurfaceReflectorSetComponent) == 0x0270); // 624 bytes (0x000238 - 0x000270)
static_assert(sizeof(UAkSwitchValue) == 0x0068); // 104 bytes (0x000068 - 0x000068)
static_assert(sizeof(UAkTrigger) == 0x0040); // 64 bytes (0x000040 - 0x000040)
static_assert(sizeof(UAkWaapiCalls) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(USAkWaapiFieldNamesConv) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAkWaapiJsonManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAkWaapiUriConv) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(FAkWindowsAdvancedInitializationSettings) == 0x0038); // 56 bytes (0x000030 - 0x000038)
static_assert(sizeof(UAkWindowsInitializationSettings) == 0x00F8); // 248 bytes (0x000028 - 0x0000F8)
static_assert(sizeof(UAkWin32PlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkWin64PlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkWindowsPlatformInfo) == 0x0070); // 112 bytes (0x000070 - 0x000070)
static_assert(sizeof(UAkWwiseTree) == 0x0168); // 360 bytes (0x000128 - 0x000168)
static_assert(sizeof(UAkWwiseTreeSelector) == 0x0188); // 392 bytes (0x000128 - 0x000188)
static_assert(sizeof(UAnimNotify_AudioBank) == 0x0050); // 80 bytes (0x000038 - 0x000050)
static_assert(sizeof(UAnimNotify_PlayAudio) == 0x00A0); // 160 bytes (0x000038 - 0x0000A0)
static_assert(sizeof(AAudioEmitter3D) == 0x0310); // 784 bytes (0x0002E0 - 0x000310)
static_assert(sizeof(UAudioManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAudioProfileInfoManager) == 0x0028); // 40 bytes (0x000028 - 0x000028)
static_assert(sizeof(UAudioStudioComponent) == 0x00F8); // 248 bytes (0x0000F8 - 0x0000F8)
static_assert(sizeof(UAudioStudioSettings) == 0x0118); // 280 bytes (0x000028 - 0x000118)
static_assert(sizeof(UAudioStudioEditorSettings) == 0x0030); // 48 bytes (0x000028 - 0x000030)
static_assert(sizeof(UCAVirtualRoomComponent) == 0x0270); // 624 bytes (0x000240 - 0x000270)
static_assert(sizeof(ACAVirtualRoomVolume) == 0x0320); // 800 bytes (0x000318 - 0x000320)
static_assert(sizeof(UEmitterListenerManager) == 0x01C8); // 456 bytes (0x000030 - 0x0001C8)
static_assert(sizeof(UFoliageSoundComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(UFoliageSoundConfig) == 0x0048); // 72 bytes (0x000030 - 0x000048)
static_assert(sizeof(UFoliageSoundPlaybackData) == 0x0050); // 80 bytes (0x000028 - 0x000050)
static_assert(sizeof(AGlobalAmbienceEmitter) == 0x0318); // 792 bytes (0x000310 - 0x000318)
static_assert(sizeof(ULoadBankComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(UMovieSceneAkAudioEventSection) == 0x01D0); // 464 bytes (0x0000E8 - 0x0001D0)
static_assert(sizeof(UMovieSceneAkTrack) == 0x0090); // 144 bytes (0x000078 - 0x000090)
static_assert(sizeof(UMovieSceneAkAudioEventTrack) == 0x0098); // 152 bytes (0x000090 - 0x000098)
static_assert(sizeof(FMovieSceneTangentDataSerializationHelper) == 0x0014); // 20 bytes (0x000000 - 0x000014)
static_assert(sizeof(FMovieSceneFloatValueSerializationHelper) == 0x001C); // 28 bytes (0x000000 - 0x00001C)
static_assert(sizeof(FMovieSceneFloatChannelSerializationHelper) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(UMovieSceneAkAudioRTPCSection) == 0x0250); // 592 bytes (0x0000E8 - 0x000250)
static_assert(sizeof(UMovieSceneAkAudioRTPCTrack) == 0x0098); // 152 bytes (0x000090 - 0x000098)
static_assert(sizeof(AMultiPositionSound) == 0x0320); // 800 bytes (0x000310 - 0x000320)
static_assert(sizeof(UMultiSourceSoundComponent) == 0x0230); // 560 bytes (0x000220 - 0x000230)
static_assert(sizeof(AMyAudioDebugEmitHint) == 0x02E0); // 736 bytes (0x0002E0 - 0x0002E0)
static_assert(sizeof(FParticleSoundData) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(UParticleSoundComponent) == 0x0110); // 272 bytes (0x0000F8 - 0x000110)
static_assert(sizeof(UPostEventAsync) == 0x00A0); // 160 bytes (0x000030 - 0x0000A0)
static_assert(sizeof(UPostEventAtLocationAsync) == 0x0080); // 128 bytes (0x000030 - 0x000080)
static_assert(sizeof(ARainSoundPlane) == 0x0310); // 784 bytes (0x000310 - 0x000310)
static_assert(sizeof(USetAttenuationComponent) == 0x0108); // 264 bytes (0x0000F8 - 0x000108)
static_assert(sizeof(USetRTPCComponent) == 0x0168); // 360 bytes (0x0000F8 - 0x000168)
static_assert(sizeof(USetStateComponent) == 0x0128); // 296 bytes (0x0000F8 - 0x000128)
static_assert(sizeof(USetSwitchComponent) == 0x0128); // 296 bytes (0x0000F8 - 0x000128)
static_assert(sizeof(ASplineSound) == 0x0348); // 840 bytes (0x000310 - 0x000348)
static_assert(sizeof(FAKWaapiJsonObject) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAkWaapiSubscriptionId) == 0x0008); // 8 bytes (0x000000 - 0x000008)
static_assert(sizeof(FAkExternalSourceInfo) == 0x0038); // 56 bytes (0x000000 - 0x000038)
static_assert(sizeof(FAkMidiEventBase) == 0x0002); // 2 bytes (0x000000 - 0x000002)
static_assert(sizeof(FAkMidiProgramChange) == 0x0003); // 3 bytes (0x000002 - 0x000003)
static_assert(sizeof(FAkMidiChannelAftertouch) == 0x0003); // 3 bytes (0x000002 - 0x000003)
static_assert(sizeof(FAkMidiNoteAftertouch) == 0x0004); // 4 bytes (0x000002 - 0x000004)
static_assert(sizeof(FAkMidiPitchBend) == 0x0008); // 8 bytes (0x000002 - 0x000008)
static_assert(sizeof(FAkMidiCc) == 0x0004); // 4 bytes (0x000002 - 0x000004)
static_assert(sizeof(FAkMidiNoteOnOff) == 0x0004); // 4 bytes (0x000002 - 0x000004)
static_assert(sizeof(FAkMidiGeneric) == 0x0004); // 4 bytes (0x000002 - 0x000004)
static_assert(sizeof(FAkOutputSettings) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAkChannelMask) == 0x0004); // 4 bytes (0x000000 - 0x000004)
static_assert(sizeof(FAkCommunicationSettingsWithCommSelection) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(sizeof(FAkReverbDescriptor) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FAkAcousticTextureParams) == 0x0020); // 32 bytes (0x000000 - 0x000020)
static_assert(sizeof(FAkGeometrySurfacePropertiesToMap) == 0x0030); // 48 bytes (0x000000 - 0x000030)
static_assert(sizeof(FAkSurfaceEdgeInfo) == 0x0028); // 40 bytes (0x000000 - 0x000028)
static_assert(sizeof(FAkSurfaceEdgeVerts) == 0x0018); // 24 bytes (0x000000 - 0x000018)
static_assert(sizeof(FAkWaapiFieldNames) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAkWaapiUri) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FAudioConsoleMessage) == 0x0040); // 64 bytes (0x000000 - 0x000040)
static_assert(sizeof(FAudioStudioProfileData) == 0x0060); // 96 bytes (0x000000 - 0x000060)
static_assert(sizeof(FLevelAudioData) == 0x0058); // 88 bytes (0x000000 - 0x000058)
static_assert(sizeof(FAudioEventExtendData_HD) == 0x0010); // 16 bytes (0x000008 - 0x000010)
static_assert(sizeof(FTArrUMultiSourceSoundComponent) == 0x0010); // 16 bytes (0x000000 - 0x000010)
static_assert(sizeof(FMovieSceneAkAudioEventTemplate) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(sizeof(FMovieSceneAkAudioRTPCTemplate) == 0x0028); // 40 bytes (0x000020 - 0x000028)
static_assert(offsetof(UAkPortalComponent, InitialState) == 0x0221);
static_assert(offsetof(UAkPortalComponent, ObstructionCollisionChannel) == 0x0228);
static_assert(offsetof(UAkPortalComponent, Parent) == 0x0240);
static_assert(offsetof(AAkAcousticPortal, Portal) == 0x0318);
static_assert(offsetof(AAkAcousticPortal, InitialState) == 0x0320);
static_assert(offsetof(UAkAudioType, UserData) == 0x0030);
static_assert(offsetof(AAkAmbientSound, AkAudioEvent) == 0x02E0);
static_assert(offsetof(AAkAmbientSound, AkComponent) == 0x02E8);
static_assert(offsetof(FAkMainOutputSettings, AudioDeviceShareset) == 0x0000);
static_assert(offsetof(FAkMainOutputSettings, PanningRule) == 0x0014);
static_assert(offsetof(FAkMainOutputSettings, ChannelConfigType) == 0x0018);
static_assert(offsetof(FAkCommonInitializationSettings, MainOutputSettings) == 0x0010);
static_assert(offsetof(FAkCommonInitializationSettings, SpatialAudioSettings) == 0x0040);
static_assert(offsetof(FAkCommunicationSettings, NetworkName) == 0x0010);
static_assert(offsetof(UAkAndroidInitializationSettings, CommonSettings) == 0x0030);
static_assert(offsetof(UAkAndroidInitializationSettings, CommunicationSettings) == 0x0098);
static_assert(offsetof(UAkAndroidInitializationSettings, AdvancedSettings) == 0x00C0);
static_assert(offsetof(UAkAssetBase, PlatformAssetData) == 0x0040);
static_assert(offsetof(UAkAssetData, BankLanguage) == 0x0030);
static_assert(offsetof(UAkAssetDataWithMedia, MediaList) == 0x0078);
static_assert(offsetof(UAkAssetPlatformData, CurrentAssetData) == 0x0028);
static_assert(offsetof(UAkAssetDataSwitchContainerData, DefaultGroupValue) == 0x0050);
static_assert(offsetof(UAkAssetDataSwitchContainerData, MediaList) == 0x0058);
static_assert(offsetof(UAkAssetDataSwitchContainerData, Children) == 0x0068);
static_assert(offsetof(UAkAssetDataSwitchContainer, SwitchContainers) == 0x0088);
static_assert(offsetof(UAkAssetDataSwitchContainer, DefaultGroupValue) == 0x0098);
static_assert(offsetof(UAkAudioBank, CurrentLocalizedPlatformAssetData) == 0x00F8);
static_assert(offsetof(UAkAudioEvent, RequiredBank) == 0x00A0);
static_assert(offsetof(UAkAudioEvent, LastRequiredBank) == 0x00A8);
static_assert(offsetof(UAkAudioEvent, CurrentLocalizedPlatformData) == 0x00B0);
static_assert(offsetof(UAkGameObject, AkAudioEvent) == 0x0220);
static_assert(offsetof(UAkGameObject, EventName) == 0x0228);
static_assert(offsetof(UAkComponent, OcclusionCollisionChannel) == 0x0248);
static_assert(offsetof(UAkComponent, EarlyReflectionAuxBus) == 0x0258);
static_assert(offsetof(UAkComponent, EarlyReflectionAuxBusName) == 0x0260);
static_assert(offsetof(UAkComponent, CurrentRoom) == 0x0408);
static_assert(offsetof(UAkComponent, CurrVirtualRoom) == 0x0410);
static_assert(offsetof(UAkComponent, CurrentSpeakingDialog) == 0x0458);
static_assert(offsetof(UAkComponent, Category) == 0x04B8);
static_assert(offsetof(UAkAuxBus, RequiredBank) == 0x0050);
static_assert(offsetof(FAkBoolPropertyToControl, ItemProperty) == 0x0000);
static_assert(offsetof(FAkWwiseObjectDetails, ItemName) == 0x0000);
static_assert(offsetof(FAkWwiseObjectDetails, ItemPath) == 0x0010);
static_assert(offsetof(FAkWwiseObjectDetails, ItemID) == 0x0020);
static_assert(offsetof(FAkWwiseItemToControl, ItemPicked) == 0x0000);
static_assert(offsetof(FAkWwiseItemToControl, ItemPath) == 0x0030);
static_assert(offsetof(UAkCheckBox, CheckedState) == 0x0510);
static_assert(offsetof(UAkCheckBox, WidgetStyle) == 0x0528);
static_assert(offsetof(UAkCheckBox, HorizontalAlignment) == 0x0AF0);
static_assert(offsetof(UAkCheckBox, ThePropertyToControl) == 0x0AF8);
static_assert(offsetof(UAkCheckBox, ItemToControl) == 0x0B08);
static_assert(offsetof(UAkFolder, UnrealFolderPath) == 0x0040);
static_assert(offsetof(UAkFolder, WwiseFolderPath) == 0x0050);
static_assert(offsetof(UAkCallbackInfo, AkComponent) == 0x0028);
static_assert(offsetof(UAkMarkerCallbackInfo, label) == 0x0040);
static_assert(offsetof(UAkMusicSyncCallbackInfo, SegmentInfo) == 0x0034);
static_assert(offsetof(UAkMusicSyncCallbackInfo, MusicSyncType) == 0x0058);
static_assert(offsetof(UAkMusicSyncCallbackInfo, UserCueName) == 0x0060);
static_assert(offsetof(FAkGeometrySurfaceOverride, AcousticTexture) == 0x0000);
static_assert(offsetof(FAkAcousticSurface, Name) == 0x0008);
static_assert(offsetof(FAkGeometryData, Vertices) == 0x0000);
static_assert(offsetof(FAkGeometryData, Surfaces) == 0x0010);
static_assert(offsetof(FAkGeometryData, Triangles) == 0x0020);
static_assert(offsetof(FAkGeometryData, ToOverrideAcousticTexture) == 0x0030);
static_assert(offsetof(FAkGeometryData, ToOverrideOcclusion) == 0x0040);
static_assert(offsetof(UAkGeometryComponent, MeshType) == 0x0238);
static_assert(offsetof(UAkGeometryComponent, CollisionMeshSurfaceOverride) == 0x0298);
static_assert(offsetof(UAkGeometryComponent, AssociatedRoom) == 0x02B8);
static_assert(offsetof(UAkGeometryComponent, Parent) == 0x02C8);
static_assert(offsetof(UAkGeometryComponent, GeometryData) == 0x02D0);
static_assert(offsetof(FAkPluginInfo, Name) == 0x0000);
static_assert(offsetof(FAkPluginInfo, dll) == 0x0018);
static_assert(offsetof(UAkInitBankAssetData, PluginInfos) == 0x0088);
static_assert(offsetof(UAkInitBank, AvailableAudioCultures) == 0x0050);
static_assert(offsetof(UAkInitBank, DefaultLanguage) == 0x0060);
static_assert(offsetof(FAkAudioSession, AudioSessionCategory) == 0x0000);
static_assert(offsetof(FAkAudioSession, AudioSessionMode) == 0x0008);
static_assert(offsetof(UAkIOSInitializationSettings, CommonSettings) == 0x0030);
static_assert(offsetof(UAkIOSInitializationSettings, AudioSession) == 0x0098);
static_assert(offsetof(UAkIOSInitializationSettings, CommunicationSettings) == 0x00A8);
static_assert(offsetof(UAkIOSInitializationSettings, AdvancedSettings) == 0x00D0);
static_assert(offsetof(UAkLateReverbComponent, AuxBus) == 0x0238);
static_assert(offsetof(UAkLateReverbComponent, AuxBusName) == 0x0240);
static_assert(offsetof(UAkLateReverbComponent, ParentSplineRegion) == 0x0280);
static_assert(offsetof(UAkLateReverbComponent, AuxBusManual) == 0x0288);
static_assert(offsetof(UAkLinuxInitializationSettings, CommonSettings) == 0x0030);
static_assert(offsetof(UAkLinuxInitializationSettings, CommunicationSettings) == 0x0098);
static_assert(offsetof(UAkLinuxInitializationSettings, AdvancedSettings) == 0x00C0);
static_assert(offsetof(UAkMacInitializationSettings, CommonSettings) == 0x0030);
static_assert(offsetof(UAkMacInitializationSettings, CommunicationSettings) == 0x0098);
static_assert(offsetof(UAkMacInitializationSettings, AdvancedSettings) == 0x00C0);
static_assert(offsetof(UAkMediaAssetData, Language) == 0x0030);
static_assert(offsetof(UAkMediaAssetData, AssetPlatform) == 0x0040);
static_assert(offsetof(UAkMediaAsset, MediaName) == 0x0030);
static_assert(offsetof(UAkMediaAsset, UserData) == 0x0048);
static_assert(offsetof(UAkMediaAsset, Language) == 0x0058);
static_assert(offsetof(UAkMediaAsset, CurrentMediaAssetData) == 0x0068);
static_assert(offsetof(AAkReverbVolume, AuxBus) == 0x0320);
static_assert(offsetof(AAkReverbVolume, AuxBusName) == 0x0328);
static_assert(offsetof(AAkReverbVolume, LateReverbComponent) == 0x0348);
static_assert(offsetof(UAkRoomComponent, SameAVolumeLateReverbCom) == 0x0258);
static_assert(offsetof(UAkRoomComponent, GeometryComponent) == 0x0280);
static_assert(offsetof(UAkSettings, WwiseProjectPath) == 0x0030);
static_assert(offsetof(UAkSettings, WwiseSoundDataFolder) == 0x0040);
static_assert(offsetof(UAkSettings, DefaultOcclusionCollisionChannel) == 0x0051);
static_assert(offsetof(UAkSettings, DefaultFitToGeometryCollisionChannel) == 0x0052);
static_assert(offsetof(UAkSettings, HFDampingName) == 0x0128);
static_assert(offsetof(UAkSettings, DecayEstimateName) == 0x0138);
static_assert(offsetof(UAkSettings, TimeToFirstReflectionName) == 0x0148);
static_assert(offsetof(UAkSettings, CommandletCommitMessage) == 0x0250);
static_assert(offsetof(UAkSettings, WwiseWindowsInstallationPath) == 0x02B8);
static_assert(offsetof(UAkSettings, WwiseMacInstallationPath) == 0x02C8);
static_assert(offsetof(UAkSettingsPerUser, WwiseWindowsInstallationPath) == 0x0028);
static_assert(offsetof(UAkSettingsPerUser, WwiseMacInstallationPath) == 0x0038);
static_assert(offsetof(UAkSettingsPerUser, WaapiIPAddress) == 0x0050);
static_assert(offsetof(FAkPropertyToControl, ItemProperty) == 0x0000);
static_assert(offsetof(UAkSlider, WidgetStyle) == 0x0140);
static_assert(offsetof(UAkSlider, Orientation) == 0x04B0);
static_assert(offsetof(UAkSlider, SliderBarColor) == 0x04B4);
static_assert(offsetof(UAkSlider, SliderHandleColor) == 0x04C4);
static_assert(offsetof(UAkSlider, ThePropertyToControl) == 0x04E0);
static_assert(offsetof(UAkSlider, ItemToControl) == 0x04F0);
static_assert(offsetof(AAkSpatialAudioVolume, SetStateComponent) == 0x0320);
static_assert(offsetof(AAkSpatialAudioVolume, SetSwitchComponent) == 0x0328);
static_assert(offsetof(AAkSpatialAudioVolume, SurfaceReflectorSet) == 0x0338);
static_assert(offsetof(AAkSpatialAudioVolume, LateReverb) == 0x0340);
static_assert(offsetof(AAkSpatialAudioVolume, Room) == 0x0348);
static_assert(offsetof(AAkSpotReflector, EarlyReflectionAuxBus) == 0x02E0);
static_assert(offsetof(AAkSpotReflector, EarlyReflectionAuxBusName) == 0x02E8);
static_assert(offsetof(AAkSpotReflector, AcousticTexture) == 0x02F8);
static_assert(offsetof(UAkSubmixInputComponent, SubmixToRecord) == 0x0508);
static_assert(offsetof(FAkSurfacePoly, Texture) == 0x0000);
static_assert(offsetof(UAkSurfaceReflectorSetComponent, AcousticPolys) == 0x0240);
static_assert(offsetof(UAkSurfaceReflectorSetComponent, AssociatedRoom) == 0x0258);
static_assert(offsetof(UAkSurfaceReflectorSetComponent, ParentBrush) == 0x0260);
static_assert(offsetof(UAkWindowsInitializationSettings, CommonSettings) == 0x0030);
static_assert(offsetof(UAkWindowsInitializationSettings, CommunicationSettings) == 0x0098);
static_assert(offsetof(UAkWindowsInitializationSettings, AdvancedSettings) == 0x00C0);
static_assert(offsetof(UAnimNotify_AudioBank, Bank) == 0x0038);
static_assert(offsetof(UAnimNotify_AudioBank, Operation) == 0x0040);
static_assert(offsetof(UAnimNotify_PlayAudio, AudioEvent) == 0x0038);
static_assert(offsetof(UAnimNotify_PlayAudio, ComponentName) == 0x0048);
static_assert(offsetof(UAnimNotify_PlayAudio, EmitLocation) == 0x005C);
static_assert(offsetof(UAnimNotify_PlayAudio, SwitchGroupName) == 0x0070);
static_assert(offsetof(UAnimNotify_PlayAudio, SwitchName) == 0x0080);
static_assert(offsetof(AAudioEmitter3D, AudioEvent) == 0x02E0);
static_assert(offsetof(AAudioEmitter3D, AudioStudioComponents) == 0x02F0);
static_assert(offsetof(AAudioEmitter3D, AkComponent) == 0x0300);
static_assert(offsetof(UAudioStudioSettings, PersistentBanks) == 0x0028);
static_assert(offsetof(UAudioStudioSettings, InitialStates) == 0x0038);
static_assert(offsetof(UAudioStudioSettings, InitialEvents) == 0x0048);
static_assert(offsetof(UAudioStudioSettings, EventExtendDataTable) == 0x0100);
static_assert(offsetof(ACAVirtualRoomVolume, VirtualRoom) == 0x0318);
static_assert(offsetof(UEmitterListenerManager, DefaultEmitters) == 0x00A8);
static_assert(offsetof(UEmitterListenerManager, AmbienceEmitters) == 0x00B8);
static_assert(offsetof(UEmitterListenerManager, DefaultListeners) == 0x00C8);
static_assert(offsetof(UEmitterListenerManager, SpatialAudioListener) == 0x00D8);
static_assert(offsetof(UEmitterListenerManager, FoliageSoundPlaybackDatas) == 0x0190);
static_assert(offsetof(UEmitterListenerManager, EventExtendDataTable) == 0x01A8);
static_assert(offsetof(UFoliageSoundComponent, SoundConfigs) == 0x00F8);
static_assert(offsetof(UFoliageSoundConfig, AudioEvent) == 0x0030);
static_assert(offsetof(UFoliageSoundPlaybackData, FoliageSoundInstances) == 0x0040);
static_assert(offsetof(AGlobalAmbienceEmitter, OverridingSplineSound) == 0x0310);
static_assert(offsetof(ULoadBankComponent, SoundBank) == 0x00F8);
static_assert(offsetof(UMovieSceneAkAudioEventSection, Event) == 0x0128);
static_assert(offsetof(UMovieSceneAkAudioEventSection, EventName) == 0x0140);
static_assert(offsetof(UMovieSceneAkAudioEventSection, MaxDurationSourceID) == 0x0178);
static_assert(offsetof(UMovieSceneAkTrack, Sections) == 0x0078);
static_assert(offsetof(FMovieSceneTangentDataSerializationHelper, TangentWeightMode) == 0x0008);
static_assert(offsetof(FMovieSceneFloatValueSerializationHelper, InterpMode) == 0x0004);
static_assert(offsetof(FMovieSceneFloatValueSerializationHelper, TangentMode) == 0x0005);
static_assert(offsetof(FMovieSceneFloatValueSerializationHelper, Tangent) == 0x0008);
static_assert(offsetof(FMovieSceneFloatChannelSerializationHelper, PreInfinityExtrap) == 0x0000);
static_assert(offsetof(FMovieSceneFloatChannelSerializationHelper, PostInfinityExtrap) == 0x0001);
static_assert(offsetof(FMovieSceneFloatChannelSerializationHelper, Times) == 0x0008);
static_assert(offsetof(FMovieSceneFloatChannelSerializationHelper, Values) == 0x0018);
static_assert(offsetof(UMovieSceneAkAudioRTPCSection, RTPC) == 0x00E8);
static_assert(offsetof(UMovieSceneAkAudioRTPCSection, Name) == 0x00F0);
static_assert(offsetof(UMovieSceneAkAudioRTPCSection, FloatCurve) == 0x0100);
static_assert(offsetof(UMovieSceneAkAudioRTPCSection, FloatChannelSerializationHelper) == 0x0180);
static_assert(offsetof(UMovieSceneAkAudioRTPCSection, RTPCChannel) == 0x01B0);
static_assert(offsetof(AMultiPositionSound, EmitterPoints) == 0x0310);
static_assert(offsetof(UMultiSourceSoundComponent, AudioEvent) == 0x0220);
static_assert(offsetof(FParticleSoundData, ParticleEventType) == 0x0000);
static_assert(offsetof(FParticleSoundData, ParticleEventName) == 0x0004);
static_assert(offsetof(FParticleSoundData, AudioEvent) == 0x0010);
static_assert(offsetof(UParticleSoundComponent, SoundData) == 0x00F8);
static_assert(offsetof(USetRTPCComponent, RTPCName) == 0x00F8);
static_assert(offsetof(USetRTPCComponent, GeographicRTPCType) == 0x0112);
static_assert(offsetof(USetRTPCComponent, AkComponent) == 0x0158);
static_assert(offsetof(USetStateComponent, StateGroupName) == 0x00F8);
static_assert(offsetof(USetStateComponent, ActivateStateName) == 0x0108);
static_assert(offsetof(USetStateComponent, DeactivateStateName) == 0x0118);
static_assert(offsetof(USetSwitchComponent, SwitchGroupName) == 0x00F8);
static_assert(offsetof(USetSwitchComponent, ActivateSwitchName) == 0x0108);
static_assert(offsetof(USetSwitchComponent, DeactivateSwitchName) == 0x0118);
static_assert(offsetof(ASplineSound, SplineComponent) == 0x0320);
static_assert(offsetof(ASplineSound, OutlineColor) == 0x033C);
static_assert(offsetof(FAkExternalSourceInfo, ExternalSrcName) == 0x0000);
static_assert(offsetof(FAkExternalSourceInfo, CodecID) == 0x0010);
static_assert(offsetof(FAkExternalSourceInfo, Filename) == 0x0018);
static_assert(offsetof(FAkExternalSourceInfo, ExternalSourceAsset) == 0x0028);
static_assert(offsetof(FAkMidiEventBase, Type) == 0x0000);
static_assert(offsetof(FAkMidiCc, Cc) == 0x0002);
static_assert(offsetof(FAkOutputSettings, AudioDeviceSharesetName) == 0x0000);
static_assert(offsetof(FAkOutputSettings, PanRule) == 0x0014);
static_assert(offsetof(FAkOutputSettings, ChannelConfig) == 0x0015);
static_assert(offsetof(FAkCommunicationSettingsWithCommSelection, CommunicationSystem) == 0x0020);
static_assert(offsetof(FAkAcousticTextureParams, AbsorptionValues) == 0x0000);
static_assert(offsetof(FAkWaapiFieldNames, FieldName) == 0x0000);
static_assert(offsetof(FAkWaapiUri, Uri) == 0x0000);
static_assert(offsetof(FAudioConsoleMessage, Verbosity) == 0x0004);
static_assert(offsetof(FAudioConsoleMessage, Action) == 0x0005);
static_assert(offsetof(FAudioConsoleMessage, ObjectType) == 0x0006);
static_assert(offsetof(FAudioConsoleMessage, ObjectName) == 0x0008);
static_assert(offsetof(FAudioConsoleMessage, GameObject) == 0x0018);
static_assert(offsetof(FAudioConsoleMessage, Source) == 0x0030);
static_assert(offsetof(FLevelAudioData, InheritedConfigName) == 0x0000);
static_assert(offsetof(FLevelAudioData, Levels) == 0x0010);
static_assert(offsetof(FLevelAudioData, Banks) == 0x0020);
static_assert(offsetof(FLevelAudioData, States) == 0x0030);
static_assert(offsetof(FLevelAudioData, Events) == 0x0040);
static_assert(offsetof(FAudioEventExtendData_HD, Category) == 0x0008);
static_assert(offsetof(FTArrUMultiSourceSoundComponent, TArrUMultiSourceSoundComponent) == 0x0000);
static_assert(offsetof(FMovieSceneAkAudioEventTemplate, Section) == 0x0020);
static_assert(offsetof(FMovieSceneAkAudioRTPCTemplate, Section) == 0x0020);
