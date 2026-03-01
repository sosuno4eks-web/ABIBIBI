package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
   @NotNull
   private final Json json;
   @NotNull
   private final Function1<JsonElement, Unit> nodeConsumer;
   @JvmField
   @NotNull
   protected final JsonConfiguration configuration;
   @Nullable
   private String polymorphicDiscriminator;
   @Nullable
   private String polymorphicSerialName;

   private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> nodeConsumer) {
      this.json = json;
      this.nodeConsumer = nodeConsumer;
      this.configuration = this.json.getConfiguration();
   }

   @NotNull
   public final Json getJson() {
      return this.json;
   }

   @NotNull
   protected final Function1<JsonElement, Unit> getNodeConsumer() {
      return this.nodeConsumer;
   }

   @NotNull
   public final SerializersModule getSerializersModule() {
      return this.json.getSerializersModule();
   }

   @NotNull
   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return JsonNamesMapKt.getJsonElementName(descriptor, this.json, index);
   }

   public void encodeJsonElement(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      if (this.polymorphicDiscriminator != null && !(element instanceof JsonObject)) {
         PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
         throw new KotlinNothingValueException();
      } else {
         this.encodeSerializableValue((SerializationStrategy)JsonElementSerializer.INSTANCE, element);
      }
   }

   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.configuration.getEncodeDefaults();
   }

   @NotNull
   protected String composeName(@NotNull String parentName, @NotNull String childName) {
      Intrinsics.checkNotNullParameter(parentName, "parentName");
      Intrinsics.checkNotNullParameter(childName, "childName");
      return childName;
   }

   public abstract void putElement(@NotNull String var1, @NotNull JsonElement var2);

   @NotNull
   public abstract JsonElement getCurrent();

   public void encodeNotNullMark() {
   }

   public void encodeNull() {
      String var10000 = (String)this.getCurrentTagOrNull();
      if (var10000 == null) {
         this.nodeConsumer.invoke(JsonNull.INSTANCE);
      } else {
         String tag = var10000;
         this.encodeTaggedNull(tag);
      }
   }

   protected void encodeTaggedNull(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonNull.INSTANCE);
   }

   protected void encodeTaggedInt(@NotNull String tag, int value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive((Number)value));
   }

   protected void encodeTaggedByte(@NotNull String tag, byte value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive((Number)value));
   }

   protected void encodeTaggedShort(@NotNull String tag, short value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive((Number)value));
   }

   protected void encodeTaggedLong(@NotNull String tag, long value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive((Number)value));
   }

   protected void encodeTaggedFloat(@NotNull String tag, float value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive((Number)value));
      if (!this.configuration.getAllowSpecialFloatingPointValues() && !(Math.abs(value) <= Float.MAX_VALUE)) {
         throw JsonExceptionsKt.InvalidFloatingPointEncoded((Number)value, tag, this.getCurrent().toString());
      }
   }

   public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
      // $FF: Couldn't be decompiled
   }

   protected void encodeTaggedDouble(@NotNull String tag, double value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive((Number)value));
      if (!this.configuration.getAllowSpecialFloatingPointValues() && !(Math.abs(value) <= Double.MAX_VALUE)) {
         throw JsonExceptionsKt.InvalidFloatingPointEncoded((Number)value, tag, this.getCurrent().toString());
      }
   }

   protected void encodeTaggedBoolean(@NotNull String tag, boolean value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(value));
   }

   protected void encodeTaggedChar(@NotNull String tag, char value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(String.valueOf(value)));
   }

   protected void encodeTaggedString(@NotNull String tag, @NotNull String value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(value, "value");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(value));
   }

   protected void encodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor, int ordinal) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
   }

   protected void encodeTaggedValue(@NotNull String tag, @NotNull Object value) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(value, "value");
      this.putElement(tag, (JsonElement)JsonElementKt.JsonPrimitive(value.toString()));
   }

   @NotNull
   protected Encoder encodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
      return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? (Encoder)this.inlineUnsignedNumberEncoder(tag) : (StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? (Encoder)this.inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super.encodeTaggedInline(tag, inlineDescriptor));
   }

   @NotNull
   public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Encoder var10000;
      if (this.getCurrentTagOrNull() != null) {
         if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = descriptor.getSerialName();
         }

         var10000 = super.encodeInline(descriptor);
      } else {
         var10000 = (new JsonPrimitiveEncoder(this.json, this.nodeConsumer)).encodeInline(descriptor);
      }

      return var10000;
   }

   @SuppressAnimalSniffer
   private final <undefinedtype> inlineUnsignedNumberEncoder(String tag) {
      return new AbstractEncoder() {
         private final SerializersModule serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();

         public SerializersModule getSerializersModule() {
            return this.serializersModule;
         }

         public final void putUnquotedString(String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            AbstractJsonTreeEncoder.this.putElement(tag, (JsonElement)(new JsonLiteral(s, false, (SerialDescriptor)null, 4, (DefaultConstructorMarker)null)));
         }

         public void encodeInt(int value) {
            this.putUnquotedString(Integer.toUnsignedString(UInt.constructor-impl(value)));
         }

         public void encodeLong(long value) {
            this.putUnquotedString(Long.toUnsignedString(ULong.constructor-impl(value)));
         }

         public void encodeByte(byte value) {
            this.putUnquotedString(UByte.toString-impl(UByte.constructor-impl(value)));
         }

         public void encodeShort(short value) {
            this.putUnquotedString(UShort.toString-impl(UShort.constructor-impl(value)));
         }
      };
   }

   private final <undefinedtype> inlineUnquotedLiteralEncoder(String tag, SerialDescriptor inlineDescriptor) {
      return new AbstractEncoder() {
         public SerializersModule getSerializersModule() {
            return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
         }

         public void encodeString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AbstractJsonTreeEncoder.this.putElement(tag, (JsonElement)(new JsonLiteral(value, false, inlineDescriptor)));
         }
      };
   }

   @NotNull
   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Function1 consumer = this.getCurrentTagOrNull() == null ? this.nodeConsumer : AbstractJsonTreeEncoder::beginStructure$lambda$2;
      SerialKind var4 = descriptor.getKind();
      AbstractJsonTreeEncoder var10000;
      if (!Intrinsics.areEqual((Object)var4, (Object)StructureKind.LIST.INSTANCE) && !(var4 instanceof PolymorphicKind)) {
         if (Intrinsics.areEqual((Object)var4, (Object)StructureKind.MAP.INSTANCE)) {
            Json $this$selectMapMode$iv = this.json;
            int $i$f$selectMapMode = false;
            SerialDescriptor keyDescriptor$iv = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), $this$selectMapMode$iv.getSerializersModule());
            SerialKind keyKind$iv = keyDescriptor$iv.getKind();
            boolean var10;
            Object var12;
            if (!(keyKind$iv instanceof PrimitiveKind) && !Intrinsics.areEqual((Object)keyKind$iv, (Object)SerialKind.ENUM.INSTANCE)) {
               if (!$this$selectMapMode$iv.getConfiguration().getAllowStructuredMapKeys()) {
                  throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv);
               }

               var10 = false;
               var12 = new JsonTreeListEncoder(this.json, consumer);
            } else {
               var10 = false;
               var12 = new JsonTreeMapEncoder(this.json, consumer);
            }

            var10000 = (AbstractJsonTreeEncoder)var12;
         } else {
            var10000 = (AbstractJsonTreeEncoder)(new JsonTreeEncoder(this.json, consumer));
         }
      } else {
         var10000 = (AbstractJsonTreeEncoder)(new JsonTreeListEncoder(this.json, consumer));
      }

      AbstractJsonTreeEncoder encoder = var10000;
      String discriminator = this.polymorphicDiscriminator;
      if (discriminator != null) {
         String var10002;
         if (encoder instanceof JsonTreeMapEncoder) {
            ((JsonTreeMapEncoder)encoder).putElement("key", (JsonElement)JsonElementKt.JsonPrimitive(discriminator));
            JsonTreeMapEncoder var13 = (JsonTreeMapEncoder)encoder;
            var10002 = this.polymorphicSerialName;
            if (var10002 == null) {
               var10002 = descriptor.getSerialName();
            }

            var13.putElement("value", (JsonElement)JsonElementKt.JsonPrimitive(var10002));
         } else {
            var10002 = this.polymorphicSerialName;
            if (var10002 == null) {
               var10002 = descriptor.getSerialName();
            }

            encoder.putElement(discriminator, (JsonElement)JsonElementKt.JsonPrimitive(var10002));
         }

         this.polymorphicDiscriminator = null;
         this.polymorphicSerialName = null;
      }

      return (CompositeEncoder)encoder;
   }

   protected void endEncode(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.nodeConsumer.invoke(this.getCurrent());
   }

   private static final Unit beginStructure$lambda$2(AbstractJsonTreeEncoder this$0, JsonElement node) {
      Intrinsics.checkNotNullParameter(node, "node");
      this$0.putElement((String)this$0.getCurrentTag(), node);
      return Unit.INSTANCE;
   }

   // $FF: synthetic method
   public AbstractJsonTreeEncoder(Json json, Function1 nodeConsumer, DefaultConstructorMarker $constructor_marker) {
      this(json, nodeConsumer);
   }
}
