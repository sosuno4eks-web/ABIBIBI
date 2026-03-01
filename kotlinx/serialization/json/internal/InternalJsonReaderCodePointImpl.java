package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonFriendModuleApi
public abstract class InternalJsonReaderCodePointImpl implements InternalJsonReader {
   @Nullable
   private Character bufferedChar;

   public abstract boolean exhausted();

   public abstract int nextCodePoint();

   public final int read(@NotNull char[] buffer, int bufferOffset, int count) {
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      int i = 0;
      if (this.bufferedChar != null) {
         int var10001 = bufferOffset + i;
         Character var10002 = this.bufferedChar;
         Intrinsics.checkNotNull(var10002);
         buffer[var10001] = var10002;
         ++i;
         this.bufferedChar = null;
      }

      while(i < count && !this.exhausted()) {
         int codePoint = this.nextCodePoint();
         if (codePoint <= 65535) {
            buffer[bufferOffset + i] = (char)codePoint;
            ++i;
         } else {
            char upChar = (char)((codePoint >>> 10) + 'ퟀ');
            char lowChar = (char)((codePoint & 1023) + '\udc00');
            buffer[bufferOffset + i] = upChar;
            ++i;
            if (i < count) {
               buffer[bufferOffset + i] = lowChar;
               ++i;
            } else {
               this.bufferedChar = lowChar;
            }
         }
      }

      return i > 0 ? i : -1;
   }
}
