package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class JsonExceptionsKt {
   @NotNull
   public static final JsonDecodingException JsonDecodingException(int offset, @NotNull String message) {
      Intrinsics.checkNotNullParameter(message, "message");
      return new JsonDecodingException(offset >= 0 ? "Unexpected JSON token at offset " + offset + ": " + message : message);
   }

   @NotNull
   public static final JsonDecodingException JsonDecodingException(int offset, @NotNull String message, @NotNull CharSequence input) {
      Intrinsics.checkNotNullParameter(message, "message");
      Intrinsics.checkNotNullParameter(input, "input");
      return JsonDecodingException(offset, message + "\nJSON input: " + minify(input, offset));
   }

   @NotNull
   public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number value, @NotNull String output) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(output, "output");
      return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + minify$default((CharSequence)output, 0, 1, (Object)null));
   }

   @NotNull
   public static final Void throwInvalidFloatingPointDecoded(@NotNull AbstractJsonLexer $this$throwInvalidFloatingPointDecoded, @NotNull Number result) {
      Intrinsics.checkNotNullParameter($this$throwInvalidFloatingPointDecoded, "<this>");
      Intrinsics.checkNotNullParameter(result, "result");
      AbstractJsonLexer.fail$default($this$throwInvalidFloatingPointDecoded, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, (Object)null);
      throw new KotlinNothingValueException();
   }

   @NotNull
   public static final Void invalidTrailingComma(@NotNull AbstractJsonLexer $this$invalidTrailingComma, @NotNull String entity) {
      Intrinsics.checkNotNullParameter($this$invalidTrailingComma, "<this>");
      Intrinsics.checkNotNullParameter(entity, "entity");
      $this$invalidTrailingComma.fail("Trailing comma before the end of JSON " + entity, $this$invalidTrailingComma.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
      throw new KotlinNothingValueException();
   }

   // $FF: synthetic method
   public static Void invalidTrailingComma$default(AbstractJsonLexer var0, String var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = "object";
      }

      return invalidTrailingComma(var0, var1);
   }

   @NotNull
   public static final JsonEncodingException InvalidKeyKindException(@NotNull SerialDescriptor keyDescriptor) {
      Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
      return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
   }

   @NotNull
   public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number value, @NotNull String key, @NotNull String output) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(output, "output");
      return new JsonEncodingException(unexpectedFpErrorMessage(value, key, output));
   }

   @NotNull
   public static final JsonDecodingException InvalidFloatingPointDecoded(@NotNull Number value, @NotNull String key, @NotNull String output) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(output, "output");
      return JsonDecodingException(-1, unexpectedFpErrorMessage(value, key, output));
   }

   private static final String unexpectedFpErrorMessage(Number value, String key, String output) {
      return "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + minify$default((CharSequence)output, 0, 1, (Object)null);
   }

   @NotNull
   public static final CharSequence minify(@NotNull CharSequence $this$minify, int offset) {
      Intrinsics.checkNotNullParameter($this$minify, "<this>");
      if ($this$minify.length() < 200) {
         return $this$minify;
      } else {
         StringBuilder var10000;
         int start;
         if (offset == -1) {
            start = $this$minify.length() - 60;
            if (start <= 0) {
               return $this$minify;
            } else {
               var10000 = (new StringBuilder()).append(".....");
               int var9 = $this$minify.length();
               return (CharSequence)var10000.append($this$minify.subSequence(start, var9).toString()).toString();
            }
         } else {
            start = offset - 30;
            int end = offset + 30;
            String prefix = start <= 0 ? "" : ".....";
            String suffix = end >= $this$minify.length() ? "" : ".....";
            var10000 = (new StringBuilder()).append(prefix);
            int var7 = RangesKt.coerceAtLeast(start, 0);
            int var8 = RangesKt.coerceAtMost(end, $this$minify.length());
            return (CharSequence)var10000.append($this$minify.subSequence(var7, var8).toString()).append(suffix).toString();
         }
      }
   }

   // $FF: synthetic method
   public static CharSequence minify$default(CharSequence var0, int var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = -1;
      }

      return minify(var0, var1);
   }
}
