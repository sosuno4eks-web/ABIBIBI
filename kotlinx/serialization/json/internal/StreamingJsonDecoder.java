package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {
   @NotNull
   private final Json json;
   @NotNull
   private final WriteMode mode;
   @JvmField
   @NotNull
   public final AbstractJsonLexer lexer;
   @NotNull
   private final SerializersModule serializersModule;
   private int currentIndex;
   @Nullable
   private StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder;
   @NotNull
   private final JsonConfiguration configuration;
   @Nullable
   private final JsonElementMarker elementMarker;

   public StreamingJsonDecoder(@NotNull Json json, @NotNull WriteMode mode, @NotNull AbstractJsonLexer lexer, @NotNull SerialDescriptor descriptor, @Nullable StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(mode, "mode");
      Intrinsics.checkNotNullParameter(lexer, "lexer");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      super();
      this.json = json;
      this.mode = mode;
      this.lexer = lexer;
      this.serializersModule = this.json.getSerializersModule();
      this.currentIndex = -1;
      this.discriminatorHolder = discriminatorHolder;
      this.configuration = this.json.getConfiguration();
      this.elementMarker = this.configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
   }

   @NotNull
   public final Json getJson() {
      return this.json;
   }

   private final boolean trySkip(StreamingJsonDecoder.DiscriminatorHolder $this$trySkip, String unknownKey) {
      if ($this$trySkip == null) {
         return false;
      } else if (Intrinsics.areEqual((Object)$this$trySkip.discriminatorToSkip, (Object)unknownKey)) {
         $this$trySkip.discriminatorToSkip = null;
         return true;
      } else {
         return false;
      }
   }

   @NotNull
   public SerializersModule getSerializersModule() {
      return this.serializersModule;
   }

   @NotNull
   public JsonElement decodeJsonElement() {
      return (new JsonTreeReader(this.json.getConfiguration(), this.lexer)).read();
   }

   public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");

      String var10000;
      try {
         if (deserializer instanceof AbstractPolymorphicSerializer && !this.json.getConfiguration().getUseArrayPolymorphism()) {
            String discriminator = PolymorphicKt.classDiscriminator(((AbstractPolymorphicSerializer)deserializer).getDescriptor(), this.json);
            var10000 = this.lexer.peekLeadingMatchingValue(discriminator, this.configuration.isLenient());
            DeserializationStrategy deserializer$iv;
            String discriminator$iv;
            String type$iv;
            if (var10000 != null) {
               String type = var10000;

               try {
                  deserializer$iv = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer)deserializer, (CompositeDecoder)this, type);
               } catch (SerializationException var19) {
                  var10000 = var19.getMessage();
                  Intrinsics.checkNotNull(var10000);
                  discriminator$iv = StringsKt.removeSuffix(StringsKt.substringBefore$default(var10000, '\n', (String)null, 2, (Object)null), (CharSequence)".");
                  var10000 = var19.getMessage();
                  Intrinsics.checkNotNull(var10000);
                  type$iv = StringsKt.substringAfter(var10000, '\n', "");
                  AbstractJsonLexer.fail$default(this.lexer, discriminator$iv, 0, type$iv, 2, (Object)null);
                  throw new KotlinNothingValueException();
               }

               Intrinsics.checkNotNull(deserializer$iv, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
               this.discriminatorHolder = new StreamingJsonDecoder.DiscriminatorHolder(discriminator);
               return deserializer$iv.deserialize((Decoder)this);
            } else {
               JsonDecoder $this$decodeSerializableValuePolymorphic$iv = (JsonDecoder)this;
               deserializer$iv = deserializer;
               int $i$f$decodeSerializableValuePolymorphic = false;
               Object var22;
               if (deserializer instanceof AbstractPolymorphicSerializer && !$this$decodeSerializableValuePolymorphic$iv.getJson().getConfiguration().getUseArrayPolymorphism()) {
                  discriminator$iv = PolymorphicKt.classDiscriminator(((AbstractPolymorphicSerializer)deserializer).getDescriptor(), $this$decodeSerializableValuePolymorphic$iv.getJson());
                  JsonElement value$iv$iv = $this$decodeSerializableValuePolymorphic$iv.decodeJsonElement();
                  String serialName$iv$iv = ((AbstractPolymorphicSerializer)deserializer).getDescriptor().getSerialName();
                  int $i$f$cast = false;
                  if (!(value$iv$iv instanceof JsonObject)) {
                     StringBuilder var16 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
                     byte var15 = -1;
                     int var12 = false;
                     String var17 = this.lexer.path.getPath();
                     throw JsonExceptionsKt.JsonDecodingException(var15, var16.append(var17).toString(), (CharSequence)value$iv$iv.toString());
                  }

                  JsonObject jsonTree$iv;
                  label50: {
                     jsonTree$iv = (JsonObject)value$iv$iv;
                     JsonElement var23 = (JsonElement)jsonTree$iv.get((Object)discriminator$iv);
                     if (var23 != null) {
                        JsonPrimitive var24 = JsonElementKt.getJsonPrimitive(var23);
                        if (var24 != null) {
                           var10000 = JsonElementKt.getContentOrNull(var24);
                           break label50;
                        }
                     }

                     var10000 = null;
                  }

                  type$iv = var10000;

                  DeserializationStrategy var14;
                  try {
                     var14 = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer)deserializer$iv, (CompositeDecoder)$this$decodeSerializableValuePolymorphic$iv, type$iv);
                  } catch (SerializationException var18) {
                     String var10001 = var18.getMessage();
                     Intrinsics.checkNotNull(var10001);
                     throw JsonExceptionsKt.JsonDecodingException(-1, var10001, (CharSequence)jsonTree$iv.toString());
                  }

                  Intrinsics.checkNotNull(var14, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                  var22 = TreeJsonDecoderKt.readPolymorphicJson($this$decodeSerializableValuePolymorphic$iv.getJson(), discriminator$iv, jsonTree$iv, var14);
               } else {
                  var22 = deserializer.deserialize((Decoder)$this$decodeSerializableValuePolymorphic$iv);
               }

               return var22;
            }
         } else {
            return deserializer.deserialize((Decoder)this);
         }
      } catch (MissingFieldException var20) {
         var10000 = var20.getMessage();
         Intrinsics.checkNotNull(var10000);
         if (StringsKt.contains$default((CharSequence)var10000, (CharSequence)"at path", false, 2, (Object)null)) {
            throw var20;
         } else {
            throw new MissingFieldException(var20.getMissingFields(), var20.getMessage() + " at path: " + this.lexer.path.getPath(), (Throwable)var20);
         }
      }
   }

   @NotNull
   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      WriteMode newMode = WriteModeKt.switchMode(this.json, descriptor);
      this.lexer.path.pushDescriptor(descriptor);
      this.lexer.consumeNextToken(newMode.begin);
      this.checkLeadingComma();
      CompositeDecoder var10000;
      switch(StreamingJsonDecoder.WhenMappings.$EnumSwitchMapping$0[newMode.ordinal()]) {
      case 1:
      case 2:
      case 3:
         var10000 = (CompositeDecoder)(new StreamingJsonDecoder(this.json, newMode, this.lexer, descriptor, this.discriminatorHolder));
         break;
      default:
         var10000 = (CompositeDecoder)(this.mode == newMode && this.json.getConfiguration().getExplicitNulls() ? this : new StreamingJsonDecoder(this.json, newMode, this.lexer, descriptor, this.discriminatorHolder));
      }

      return var10000;
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (descriptor.getElementsCount() == 0 && JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
         this.skipLeftoverElements(descriptor);
      }

      if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
         JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
         throw new KotlinNothingValueException();
      } else {
         this.lexer.consumeNextToken(this.mode.end);
         this.lexer.path.popDescriptor();
      }
   }

   private final void skipLeftoverElements(SerialDescriptor descriptor) {
      while(this.decodeElementIndex(descriptor) != -1) {
      }

   }

   public boolean decodeNotNullMark() {
      JsonElementMarker var10000 = this.elementMarker;
      return !(var10000 != null ? var10000.isUnmarkedNull$kotlinx_serialization_json() : false) && !AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, (Object)null);
   }

   @Nullable
   public Void decodeNull() {
      return null;
   }

   private final void checkLeadingComma() {
      if (this.lexer.peekNextToken() == 4) {
         AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      boolean isMapKey = this.mode == WriteMode.MAP && (index & 1) == 0;
      if (isMapKey) {
         this.lexer.path.resetCurrentMapKey();
      }

      Object value = super.decodeSerializableElement(descriptor, index, deserializer, previousValue);
      if (isMapKey) {
         this.lexer.path.updateCurrentMapKey(value);
      }

      return value;
   }

   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      int var10000;
      switch(StreamingJsonDecoder.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()]) {
      case 2:
         var10000 = this.decodeMapIndex();
         break;
      case 3:
      default:
         var10000 = this.decodeListIndex();
         break;
      case 4:
         var10000 = this.decodeObjectIndex(descriptor);
      }

      int index = var10000;
      if (this.mode != WriteMode.MAP) {
         this.lexer.path.updateDescriptorIndex(index);
      }

      return index;
   }

   private final int decodeMapIndex() {
      boolean hasComma = false;
      boolean decodingKey = this.currentIndex % 2 != 0;
      if (decodingKey) {
         if (this.currentIndex != -1) {
            hasComma = this.lexer.tryConsumeComma();
         }
      } else {
         this.lexer.consumeNextToken(':');
      }

      int var10000;
      if (this.lexer.canConsumeValue()) {
         if (decodingKey) {
            AbstractJsonLexer $this$iv;
            int position$iv;
            boolean $i$f$require$kotlinx_serialization_json;
            boolean var7;
            if (this.currentIndex == -1) {
               $this$iv = this.lexer;
               boolean condition$iv = !hasComma;
               position$iv = $this$iv.currentPosition;
               $i$f$require$kotlinx_serialization_json = false;
               if (!condition$iv) {
                  var7 = false;
                  AbstractJsonLexer.fail$default($this$iv, "Unexpected leading comma", position$iv, (String)null, 4, (Object)null);
                  throw new KotlinNothingValueException();
               }
            } else {
               $this$iv = this.lexer;
               position$iv = $this$iv.currentPosition;
               $i$f$require$kotlinx_serialization_json = false;
               if (!hasComma) {
                  var7 = false;
                  AbstractJsonLexer.fail$default($this$iv, "Expected comma after the key-value pair", position$iv, (String)null, 4, (Object)null);
                  throw new KotlinNothingValueException();
               }
            }
         }

         ++this.currentIndex;
         var10000 = this.currentIndex;
      } else {
         if (hasComma && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma$default(this.lexer, (String)null, 1, (Object)null);
            throw new KotlinNothingValueException();
         }

         var10000 = -1;
      }

      return var10000;
   }

   private final boolean coerceInputValue(SerialDescriptor descriptor, int index) {
      Json $this$tryCoerceValue$iv = this.json;
      int $i$f$tryCoerceValue = false;
      boolean isOptional$iv = descriptor.isElementOptional(index);
      SerialDescriptor elementDescriptor$iv = descriptor.getElementDescriptor(index);
      boolean it;
      boolean coerceToNull$iv;
      boolean var14;
      if (isOptional$iv && !elementDescriptor$iv.isNullable()) {
         it = true;
         coerceToNull$iv = false;
         if (this.lexer.tryConsumeNull(it)) {
            var14 = true;
            return var14;
         }
      }

      if (Intrinsics.areEqual((Object)elementDescriptor$iv.getKind(), (Object)SerialKind.ENUM.INSTANCE)) {
         if (elementDescriptor$iv.isNullable()) {
            it = false;
            coerceToNull$iv = false;
            if (this.lexer.tryConsumeNull(it)) {
               var14 = false;
               return var14;
            }
         }

         it = false;
         String var10000 = this.lexer.peekString(this.configuration.isLenient());
         if (var10000 == null) {
            var14 = false;
            return var14;
         }

         String enumValue$iv = var10000;
         int enumIndex$iv = JsonNamesMapKt.getJsonNameIndex(elementDescriptor$iv, $this$tryCoerceValue$iv, enumValue$iv);
         coerceToNull$iv = !$this$tryCoerceValue$iv.getConfiguration().getExplicitNulls() && elementDescriptor$iv.isNullable();
         if (enumIndex$iv == -3 && (isOptional$iv || coerceToNull$iv)) {
            int var12 = false;
            this.lexer.consumeString();
            var14 = true;
            return var14;
         }
      }

      var14 = false;
      return var14;
   }

   private final int decodeObjectIndex(SerialDescriptor descriptor) {
      boolean hasComma = this.lexer.tryConsumeComma();

      JsonElementMarker var6;
      while(this.lexer.canConsumeValue()) {
         hasComma = false;
         String key = this.decodeStringKey();
         this.lexer.consumeNextToken(':');
         int index = JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, key);
         boolean var10000;
         if (index != -3) {
            if (!this.configuration.getCoerceInputValues() || !this.coerceInputValue(descriptor, index)) {
               var6 = this.elementMarker;
               if (var6 != null) {
                  var6.mark$kotlinx_serialization_json(index);
               }

               return index;
            }

            hasComma = this.lexer.tryConsumeComma();
            var10000 = false;
         } else {
            var10000 = true;
         }

         boolean isUnknown = var10000;
         if (isUnknown) {
            hasComma = this.handleUnknown(descriptor, key);
         }
      }

      if (hasComma && !this.json.getConfiguration().getAllowTrailingComma()) {
         JsonExceptionsKt.invalidTrailingComma$default(this.lexer, (String)null, 1, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         var6 = this.elementMarker;
         return var6 != null ? var6.nextUnmarkedIndex$kotlinx_serialization_json() : -1;
      }
   }

   private final boolean handleUnknown(SerialDescriptor descriptor, String key) {
      if (!JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json) && !this.trySkip(this.discriminatorHolder, key)) {
         this.lexer.path.popDescriptor();
         this.lexer.failOnUnknownKey(key);
      } else {
         this.lexer.skipElement(this.configuration.isLenient());
      }

      return this.lexer.tryConsumeComma();
   }

   private final int decodeListIndex() {
      boolean hasComma = this.lexer.tryConsumeComma();
      int var10000;
      if (this.lexer.canConsumeValue()) {
         if (this.currentIndex != -1 && !hasComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         }

         ++this.currentIndex;
         var10000 = this.currentIndex;
      } else {
         if (hasComma && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
            throw new KotlinNothingValueException();
         }

         var10000 = -1;
      }

      return var10000;
   }

   public boolean decodeBoolean() {
      return this.lexer.consumeBooleanLenient();
   }

   public byte decodeByte() {
      long value = this.lexer.consumeNumericLiteral();
      if (value != (long)((byte)((int)value))) {
         AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + value + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         return (byte)((int)value);
      }
   }

   public short decodeShort() {
      long value = this.lexer.consumeNumericLiteral();
      if (value != (long)((short)((int)value))) {
         AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + value + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         return (short)((int)value);
      }
   }

   public int decodeInt() {
      long value = this.lexer.consumeNumericLiteral();
      if (value != (long)((int)value)) {
         AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + value + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         return (int)value;
      }
   }

   public long decodeLong() {
      return this.lexer.consumeNumericLiteral();
   }

   public float decodeFloat() {
      AbstractJsonLexer $this$parseString$iv = this.lexer;
      String expectedType$iv = "float";
      int $i$f$parseString = false;
      String input$iv = $this$parseString$iv.consumeStringLenient();

      float var10000;
      try {
         int var7 = false;
         var10000 = Float.parseFloat(input$iv);
      } catch (IllegalArgumentException var8) {
         AbstractJsonLexer.fail$default($this$parseString$iv, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }

      float result = var10000;
      boolean specialFp = this.json.getConfiguration().getAllowSpecialFloatingPointValues();
      if (!specialFp && !(Math.abs(result) <= Float.MAX_VALUE)) {
         JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, (Number)result);
         throw new KotlinNothingValueException();
      } else {
         return result;
      }
   }

   public double decodeDouble() {
      AbstractJsonLexer $this$parseString$iv = this.lexer;
      String expectedType$iv = "double";
      int $i$f$parseString = false;
      String input$iv = $this$parseString$iv.consumeStringLenient();

      double var10000;
      try {
         int var8 = false;
         var10000 = Double.parseDouble(input$iv);
      } catch (IllegalArgumentException var9) {
         AbstractJsonLexer.fail$default($this$parseString$iv, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }

      double result = var10000;
      boolean specialFp = this.json.getConfiguration().getAllowSpecialFloatingPointValues();
      if (!specialFp && !(Math.abs(result) <= Double.MAX_VALUE)) {
         JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, (Number)result);
         throw new KotlinNothingValueException();
      } else {
         return result;
      }
   }

   public char decodeChar() {
      String string = this.lexer.consumeStringLenient();
      if (string.length() != 1) {
         AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got '" + string + '\'', 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         return string.charAt(0);
      }
   }

   private final String decodeStringKey() {
      return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
   }

   @NotNull
   public String decodeString() {
      return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
   }

   public void decodeStringChunked(@NotNull Function1<? super String, Unit> consumeChunk) {
      Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
      this.lexer.consumeStringChunked(this.configuration.isLenient(), consumeChunk);
   }

   @NotNull
   public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? (Decoder)(new JsonDecoderForUnsignedTypes(this.lexer, this.json)) : super.decodeInline(descriptor);
   }

   public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, this.decodeString(), " at path " + this.lexer.path.getPath());
   }

   public static final class DiscriminatorHolder {
      @JvmField
      @Nullable
      public String discriminatorToSkip;

      public DiscriminatorHolder(@Nullable String discriminatorToSkip) {
         this.discriminatorToSkip = discriminatorToSkip;
      }
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[WriteMode.values().length];

         try {
            var0[WriteMode.LIST.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[WriteMode.MAP.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[WriteMode.POLY_OBJ.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[WriteMode.OBJ.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
