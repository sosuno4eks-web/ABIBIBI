package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public final class JsonDecoderForUnsignedTypes extends AbstractDecoder {
   @NotNull
   private final AbstractJsonLexer lexer;
   @NotNull
   private final SerializersModule serializersModule;

   public JsonDecoderForUnsignedTypes(@NotNull AbstractJsonLexer lexer, @NotNull Json json) {
      Intrinsics.checkNotNullParameter(lexer, "lexer");
      Intrinsics.checkNotNullParameter(json, "json");
      super();
      this.lexer = lexer;
      this.serializersModule = json.getSerializersModule();
   }

   @NotNull
   public SerializersModule getSerializersModule() {
      return this.serializersModule;
   }

   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      throw new IllegalStateException("unsupported".toString());
   }

   public int decodeInt() {
      AbstractJsonLexer $this$parseString$iv = this.lexer;
      String expectedType$iv = "UInt";
      int $i$f$parseString = false;
      String input$iv = $this$parseString$iv.consumeStringLenient();

      try {
         int var6 = false;
         return UStringsKt.toUInt(input$iv);
      } catch (IllegalArgumentException var7) {
         AbstractJsonLexer.fail$default($this$parseString$iv, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public long decodeLong() {
      AbstractJsonLexer $this$parseString$iv = this.lexer;
      String expectedType$iv = "ULong";
      int $i$f$parseString = false;
      String input$iv = $this$parseString$iv.consumeStringLenient();

      try {
         int var6 = false;
         return UStringsKt.toULong(input$iv);
      } catch (IllegalArgumentException var7) {
         AbstractJsonLexer.fail$default($this$parseString$iv, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public byte decodeByte() {
      AbstractJsonLexer $this$parseString$iv = this.lexer;
      String expectedType$iv = "UByte";
      int $i$f$parseString = false;
      String input$iv = $this$parseString$iv.consumeStringLenient();

      try {
         int var6 = false;
         return UStringsKt.toUByte(input$iv);
      } catch (IllegalArgumentException var7) {
         AbstractJsonLexer.fail$default($this$parseString$iv, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public short decodeShort() {
      AbstractJsonLexer $this$parseString$iv = this.lexer;
      String expectedType$iv = "UShort";
      int $i$f$parseString = false;
      String input$iv = $this$parseString$iv.consumeStringLenient();

      try {
         int var6 = false;
         return UStringsKt.toUShort(input$iv);
      } catch (IllegalArgumentException var7) {
         AbstractJsonLexer.fail$default($this$parseString$iv, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }
}
