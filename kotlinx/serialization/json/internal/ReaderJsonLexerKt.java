package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class ReaderJsonLexerKt {
   public static final int BATCH_SIZE = 16384;
   private static final int DEFAULT_THRESHOLD = 128;

   @NotNull
   public static final ReaderJsonLexer ReaderJsonLexer(@NotNull Json json, @NotNull InternalJsonReader reader, @NotNull char[] buffer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(reader, "reader");
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      return !json.getConfiguration().getAllowComments() ? new ReaderJsonLexer(reader, buffer) : (ReaderJsonLexer)(new ReaderJsonLexerWithComments(reader, buffer));
   }

   // $FF: synthetic method
   public static ReaderJsonLexer ReaderJsonLexer$default(Json var0, InternalJsonReader var1, char[] var2, int var3, Object var4) {
      if ((var3 & 4) != 0) {
         var2 = CharArrayPoolBatchSize.INSTANCE.take();
      }

      return ReaderJsonLexer(var0, var1, var2);
   }
}
