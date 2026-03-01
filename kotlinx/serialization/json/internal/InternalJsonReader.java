package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;

@JsonFriendModuleApi
public interface InternalJsonReader {
   int read(@NotNull char[] var1, int var2, int var3);
}
