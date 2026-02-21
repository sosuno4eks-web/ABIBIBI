
#include <ntddk.h>

NTSTATUS CustomDriverEntry(
	_In_ PDRIVER_OBJECT  rtkaudioParam1,
	_In_ PUNICODE_STRING rtkaudioParam2
)
{
	UNREFERENCED_PARAMETER(rtkaudioParam1);
	UNREFERENCED_PARAMETER(rtkaudioParam2);
	
	DbgPrintEx(0, 0, "Hello world!");

	return 0;
}