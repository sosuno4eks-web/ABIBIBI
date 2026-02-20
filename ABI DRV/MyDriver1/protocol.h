#pragma once
/*
 * protocol.h - SATA Protocol Communication Bridge
 */

#include "definitions.h"

/* Protocol initialization and management */
extern "C" NTSTATUS SataProtocolStart();

/* Communication handler functions */
NTSTATUS HandleCommPacket(PCOMM_PACKET packet);
NTSTATUS InstallCommunicationHandler();
PVOID FindSuitableHandlerLocation();

/* External interface for cross-module communication */
NTSTATUS ExternalCommInterface(PCOMM_PACKET packet);
