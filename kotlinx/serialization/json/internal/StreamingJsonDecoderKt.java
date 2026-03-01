package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

public final class StreamingJsonDecoderKt {
   @JsonFriendModuleApi
   @NotNull
   public static final <T> JsonElement decodeStringToJsonTree(@NotNull Json json, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull String source) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(source, "source");
      StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(json, source);
      StreamingJsonDecoder input = new StreamingJsonDecoder(json, WriteMode.OBJ, (AbstractJsonLexer)lexer, deserializer.getDescriptor(), (StreamingJsonDecoder.DiscriminatorHolder)null);
      JsonElement tree = input.decodeJsonElement();
      lexer.expectEof();
      return tree;
   }

   private static final <T> T parseString(AbstractJsonLexer $this$parseString, String expectedType, Function1<? super String, ? extends T> block) {
      int $i$f$parseString = false;
      String input = $this$parseString.consumeStringLenient();

      try {
         return block.invoke(input);
      } catch (IllegalArgumentException var6) {
         AbstractJsonLexer.fail$default($this$parseString, "Failed to parse type '" + expectedType + "' for input '" + input + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }
}
