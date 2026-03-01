package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JsonFriendModuleApi
public interface InternalJsonWriter {
   @NotNull
   InternalJsonWriter.Companion Companion = InternalJsonWriter.Companion.$$INSTANCE;

   void writeLong(long var1);

   void writeChar(char var1);

   void write(@NotNull String var1);

   void writeQuoted(@NotNull String var1);

   void release();

   public static final class Companion {
      // $FF: synthetic field
      static final InternalJsonWriter.Companion $$INSTANCE = new InternalJsonWriter.Companion();

      private Companion() {
      }

      public final void doWriteEscaping(@NotNull String text, @NotNull Function3<? super String, ? super Integer, ? super Integer, Unit> writeImpl) {
         Intrinsics.checkNotNullParameter(text, "text");
         Intrinsics.checkNotNullParameter(writeImpl, "writeImpl");
         int $i$f$doWriteEscaping = false;
         int lastPos = 0;
         int i = 0;

         for(int var6 = ((CharSequence)text).length(); i < var6; ++i) {
            int c = text.charAt(i);
            if (c < StringOpsKt.getESCAPE_STRINGS().length && StringOpsKt.getESCAPE_STRINGS()[c] != null) {
               writeImpl.invoke(text, lastPos, i);
               String var10000 = StringOpsKt.getESCAPE_STRINGS()[c];
               Intrinsics.checkNotNull(var10000);
               String escape = var10000;
               writeImpl.invoke(escape, 0, escape.length());
               lastPos = i + 1;
            }
         }

         writeImpl.invoke(text, lastPos, text.length());
      }
   }
}
