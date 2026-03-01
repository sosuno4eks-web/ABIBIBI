package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class JsonIteratorKt {
   @NotNull
   public static final <T> Iterator<T> JsonIterator(@NotNull DecodeSequenceMode mode, @NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(mode, "mode");
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(lexer, "lexer");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Iterator var10000;
      switch(JsonIteratorKt.WhenMappings.$EnumSwitchMapping$0[determineFormat((AbstractJsonLexer)lexer, mode).ordinal()]) {
      case 1:
         var10000 = (Iterator)(new JsonIteratorWsSeparated(json, lexer, deserializer));
         break;
      case 2:
         var10000 = (Iterator)(new JsonIteratorArrayWrapped(json, lexer, deserializer));
         break;
      case 3:
         throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
      default:
         throw new NoWhenBranchMatchedException();
      }

      return var10000;
   }

   private static final DecodeSequenceMode determineFormat(AbstractJsonLexer $this$determineFormat, DecodeSequenceMode suggested) {
      DecodeSequenceMode var10000;
      switch(JsonIteratorKt.WhenMappings.$EnumSwitchMapping$0[suggested.ordinal()]) {
      case 1:
         var10000 = DecodeSequenceMode.WHITESPACE_SEPARATED;
         break;
      case 2:
         if (!tryConsumeStartArray($this$determineFormat)) {
            byte expectedToken$iv = 8;
            boolean wasConsumed$iv = true;
            int $i$f$fail$kotlinx_serialization_json = false;
            String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
            int position$iv = $this$determineFormat.currentPosition - 1;
            String s$iv = $this$determineFormat.currentPosition != AbstractJsonLexer.access$getSource($this$determineFormat).length() && position$iv >= 0 ? String.valueOf(AbstractJsonLexer.access$getSource($this$determineFormat).charAt(position$iv)) : "EOF";
            int var11 = false;
            AbstractJsonLexer.fail$default($this$determineFormat, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, (String)null, 4, (Object)null);
            throw new KotlinNothingValueException();
         }

         var10000 = DecodeSequenceMode.ARRAY_WRAPPED;
         break;
      case 3:
         var10000 = tryConsumeStartArray($this$determineFormat) ? DecodeSequenceMode.ARRAY_WRAPPED : DecodeSequenceMode.WHITESPACE_SEPARATED;
         break;
      default:
         throw new NoWhenBranchMatchedException();
      }

      return var10000;
   }

   private static final boolean tryConsumeStartArray(AbstractJsonLexer $this$tryConsumeStartArray) {
      if ($this$tryConsumeStartArray.peekNextToken() == 8) {
         $this$tryConsumeStartArray.consumeNextToken((byte)8);
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[DecodeSequenceMode.values().length];

         try {
            var0[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
