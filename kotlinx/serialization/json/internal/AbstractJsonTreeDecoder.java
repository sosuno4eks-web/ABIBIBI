package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
   @NotNull
   private final Json json;
   @NotNull
   private final JsonElement value;
   @Nullable
   private final String polymorphicDiscriminator;
   @JvmField
   @NotNull
   protected final JsonConfiguration configuration;

   private AbstractJsonTreeDecoder(Json json, JsonElement value, String polymorphicDiscriminator) {
      this.json = json;
      this.value = value;
      this.polymorphicDiscriminator = polymorphicDiscriminator;
      this.configuration = this.getJson().getConfiguration();
   }

   // $FF: synthetic method
   public AbstractJsonTreeDecoder(Json var1, JsonElement var2, String var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3, (DefaultConstructorMarker)null);
   }

   @NotNull
   public Json getJson() {
      return this.json;
   }

   @NotNull
   public JsonElement getValue() {
      return this.value;
   }

   @Nullable
   protected final String getPolymorphicDiscriminator() {
      return this.polymorphicDiscriminator;
   }

   @NotNull
   public SerializersModule getSerializersModule() {
      return this.getJson().getSerializersModule();
   }

   @NotNull
   protected final JsonElement currentObject() {
      String var10000 = (String)this.getCurrentTagOrNull();
      JsonElement var3;
      if (var10000 != null) {
         String it = var10000;
         int var2 = false;
         var3 = this.currentElement(it);
         if (var3 != null) {
            return var3;
         }
      }

      var3 = this.getValue();
      return var3;
   }

   @NotNull
   public final String renderTagStack(@NotNull String currentTag) {
      Intrinsics.checkNotNullParameter(currentTag, "currentTag");
      return this.renderTagStack() + '.' + currentTag;
   }

   @NotNull
   public JsonElement decodeJsonElement() {
      return this.currentObject();
   }

   public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      JsonDecoder $this$decodeSerializableValuePolymorphic$iv = (JsonDecoder)this;
      DeserializationStrategy deserializer$iv = deserializer;
      int $i$f$decodeSerializableValuePolymorphic = false;
      Object var10000;
      if (deserializer instanceof AbstractPolymorphicSerializer && !$this$decodeSerializableValuePolymorphic$iv.getJson().getConfiguration().getUseArrayPolymorphism()) {
         String discriminator$iv = PolymorphicKt.classDiscriminator(((AbstractPolymorphicSerializer)deserializer).getDescriptor(), $this$decodeSerializableValuePolymorphic$iv.getJson());
         JsonElement value$iv$iv = $this$decodeSerializableValuePolymorphic$iv.decodeJsonElement();
         String serialName$iv$iv = ((AbstractPolymorphicSerializer)deserializer).getDescriptor().getSerialName();
         int $i$f$cast = false;
         if (!(value$iv$iv instanceof JsonObject)) {
            StringBuilder var13 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
            byte var12 = -1;
            int var9 = false;
            String var14 = this.renderTagStack();
            throw JsonExceptionsKt.JsonDecodingException(var12, var13.append(var14).toString(), (CharSequence)value$iv$iv.toString());
         }

         JsonObject jsonTree$iv;
         String var19;
         label28: {
            jsonTree$iv = (JsonObject)value$iv$iv;
            JsonElement var17 = (JsonElement)jsonTree$iv.get((Object)discriminator$iv);
            if (var17 != null) {
               JsonPrimitive var18 = JsonElementKt.getJsonPrimitive(var17);
               if (var18 != null) {
                  var19 = JsonElementKt.getContentOrNull(var18);
                  break label28;
               }
            }

            var19 = null;
         }

         String type$iv = var19;

         DeserializationStrategy var11;
         try {
            var11 = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer)deserializer$iv, (CompositeDecoder)$this$decodeSerializableValuePolymorphic$iv, type$iv);
         } catch (SerializationException var15) {
            String var10001 = var15.getMessage();
            Intrinsics.checkNotNull(var10001);
            throw JsonExceptionsKt.JsonDecodingException(-1, var10001, (CharSequence)jsonTree$iv.toString());
         }

         Intrinsics.checkNotNull(var11, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
         var10000 = TreeJsonDecoderKt.readPolymorphicJson($this$decodeSerializableValuePolymorphic$iv.getJson(), discriminator$iv, jsonTree$iv, var11);
      } else {
         var10000 = deserializer.deserialize((Decoder)$this$decodeSerializableValuePolymorphic$iv);
      }

      return var10000;
   }

   @NotNull
   protected String composeName(@NotNull String parentName, @NotNull String childName) {
      Intrinsics.checkNotNullParameter(parentName, "parentName");
      Intrinsics.checkNotNullParameter(childName, "childName");
      return childName;
   }

   @NotNull
   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      JsonElement currentObject = this.currentObject();
      SerialKind var3 = descriptor.getKind();
      boolean $i$f$cast;
      String serialName$iv$iv;
      boolean $i$f$cast;
      StringBuilder var11;
      byte var12;
      boolean $i$f$cast;
      String var14;
      Json var10002;
      CompositeDecoder var23;
      if (!Intrinsics.areEqual((Object)var3, (Object)StructureKind.LIST.INSTANCE) && !(var3 instanceof PolymorphicKind)) {
         if (Intrinsics.areEqual((Object)var3, (Object)StructureKind.MAP.INSTANCE)) {
            Json $this$selectMapMode$iv = this.getJson();
            int $i$f$selectMapMode = false;
            SerialDescriptor keyDescriptor$iv = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), $this$selectMapMode$iv.getSerializersModule());
            SerialKind keyKind$iv = keyDescriptor$iv.getKind();
            String serialName$iv$iv;
            boolean $i$f$cast;
            StringBuilder var17;
            byte var18;
            boolean var19;
            String var20;
            boolean var22;
            Object var24;
            if (!(keyKind$iv instanceof PrimitiveKind) && !Intrinsics.areEqual((Object)keyKind$iv, (Object)SerialKind.ENUM.INSTANCE)) {
               if (!$this$selectMapMode$iv.getConfiguration().getAllowStructuredMapKeys()) {
                  throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv);
               }

               var22 = false;
               var24 = new JsonTreeListDecoder;
               var10002 = this.getJson();
               $i$f$cast = false;
               serialName$iv$iv = descriptor.getSerialName();
               $i$f$cast = false;
               if (!(currentObject instanceof JsonArray)) {
                  var17 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
                  var18 = -1;
                  var19 = false;
                  var20 = access$renderTagStack(this);
                  throw JsonExceptionsKt.JsonDecodingException(var18, var17.append(var20).toString(), (CharSequence)currentObject.toString());
               }

               var24.<init>(var10002, (JsonArray)currentObject);
            } else {
               var22 = false;
               var24 = new JsonTreeMapDecoder;
               var10002 = this.getJson();
               $i$f$cast = false;
               serialName$iv$iv = descriptor.getSerialName();
               $i$f$cast = false;
               if (!(currentObject instanceof JsonObject)) {
                  var17 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
                  var18 = -1;
                  var19 = false;
                  var20 = access$renderTagStack(this);
                  throw JsonExceptionsKt.JsonDecodingException(var18, var17.append(var20).toString(), (CharSequence)currentObject.toString());
               }

               var24.<init>(var10002, (JsonObject)currentObject);
            }

            var23 = (CompositeDecoder)var24;
         } else {
            JsonTreeDecoder var25 = new JsonTreeDecoder;
            var10002 = this.getJson();
            $i$f$cast = false;
            serialName$iv$iv = descriptor.getSerialName();
            $i$f$cast = false;
            if (!(currentObject instanceof JsonObject)) {
               var11 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
               var12 = -1;
               $i$f$cast = false;
               var14 = access$renderTagStack(this);
               throw JsonExceptionsKt.JsonDecodingException(var12, var11.append(var14).toString(), (CharSequence)currentObject.toString());
            }

            var25.<init>(var10002, (JsonObject)currentObject, this.polymorphicDiscriminator, (SerialDescriptor)null, 8, (DefaultConstructorMarker)null);
            var23 = (CompositeDecoder)var25;
         }
      } else {
         JsonTreeListDecoder var10000 = new JsonTreeListDecoder;
         var10002 = this.getJson();
         $i$f$cast = false;
         serialName$iv$iv = descriptor.getSerialName();
         $i$f$cast = false;
         if (!(currentObject instanceof JsonArray)) {
            var11 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
            var12 = -1;
            $i$f$cast = false;
            var14 = access$renderTagStack(this);
            throw JsonExceptionsKt.JsonDecodingException(var12, var11.append(var14).toString(), (CharSequence)currentObject.toString());
         }

         var10000.<init>(var10002, (JsonArray)currentObject);
         var23 = (CompositeDecoder)var10000;
      }

      return var23;
   }

   // $FF: synthetic method
   public final <T extends JsonElement> T cast(JsonElement value, SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      int $i$f$cast = false;
      String serialName$iv = descriptor.getSerialName();
      int $i$f$cast = false;
      Intrinsics.reifiedOperationMarker(3, "T");
      if (!(value instanceof JsonElement)) {
         StringBuilder var10001 = (new StringBuilder()).append("Expected ");
         Intrinsics.reifiedOperationMarker(4, "T");
         StringBuilder var9 = var10001.append(Reflection.getOrCreateKotlinClass(JsonElement.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv).append(" at element: ");
         byte var8 = -1;
         int var7 = false;
         String var10 = access$renderTagStack(this);
         throw JsonExceptionsKt.JsonDecodingException(var8, var9.append((String)var10).toString(), (CharSequence)value.toString());
      } else {
         return value;
      }
   }

   // $FF: synthetic method
   public final <T extends JsonElement> T cast(JsonElement value, String serialName, String tag) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(tag, "tag");
      int $i$f$cast = false;
      int $i$f$cast = false;
      Intrinsics.reifiedOperationMarker(3, "T");
      if (!(value instanceof JsonElement)) {
         StringBuilder var10001 = (new StringBuilder()).append("Expected ");
         Intrinsics.reifiedOperationMarker(4, "T");
         StringBuilder var10 = var10001.append(Reflection.getOrCreateKotlinClass(JsonElement.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName).append(" at element: ");
         byte var9 = -1;
         int var8 = false;
         String var11 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var9, var10.append((String)var11).toString(), (CharSequence)value.toString());
      } else {
         return value;
      }
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
   }

   public boolean decodeNotNullMark() {
      return !(this.currentObject() instanceof JsonNull);
   }

   @NotNull
   protected final JsonPrimitive getPrimitiveValue(@NotNull String tag, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv = access$currentElement(this, tag);
      String serialName$iv = descriptor.getSerialName();
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv instanceof JsonPrimitive)) {
         StringBuilder var12 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv).append(" at element: ");
         byte var13 = -1;
         int var14 = false;
         String var15 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var13, var12.append(var15).toString(), (CharSequence)value$iv.toString());
      } else {
         return (JsonPrimitive)value$iv;
      }
   }

   private final <T> T getPrimitiveValue(String tag, String primitiveName, Function1<? super JsonPrimitive, ? extends T> convert) {
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv.toString());
      } else {
         JsonPrimitive literal = (JsonPrimitive)value$iv;

         try {
            Object var10000 = convert.invoke(literal);
            if (var10000 == null) {
               this.unparsedPrimitive(literal, primitiveName, tag);
               throw new KotlinNothingValueException();
            } else {
               return var10000;
            }
         } catch (IllegalArgumentException var18) {
            this.unparsedPrimitive(literal, primitiveName, tag);
            throw new KotlinNothingValueException();
         }
      }
   }

   private final Void unparsedPrimitive(JsonPrimitive literal, String primitive, String tag) {
      String type = StringsKt.startsWith$default(primitive, "i", false, 2, (Object)null) ? "an " + primitive : "a " + primitive;
      throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + literal + "' as " + type + " value at element: " + this.renderTagStack(tag), (CharSequence)this.currentObject().toString());
   }

   @NotNull
   protected abstract JsonElement currentElement(@NotNull String var1);

   protected int decodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      Json var10001 = this.getJson();
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = access$currentElement(this, tag);
      String serialName$iv$iv = enumDescriptor.getSerialName();
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var15 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
         byte var16 = -1;
         int var17 = false;
         String var18 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var16, var15.append(var18).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, var10001, ((JsonPrimitive)value$iv$iv).getContent(), (String)null, 4, (Object)null);
      }
   }

   @Nullable
   protected Void decodeTaggedNull(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      return null;
   }

   protected boolean decodeTaggedNotNullMark(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      return this.currentElement(tag) != JsonNull.INSTANCE;
   }

   protected boolean decodeTaggedBoolean(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      AbstractJsonTreeDecoder this_$iv = this;
      String tag$iv = tag;
      String primitiveName$iv = "boolean";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         Boolean var10000;
         try {
            int var20 = false;
            var10000 = JsonElementKt.getBooleanOrNull(literal$iv);
            if (var10000 == null) {
               this_$iv.unparsedPrimitive(literal$iv, primitiveName$iv, tag$iv);
               throw new KotlinNothingValueException();
            }
         } catch (IllegalArgumentException var21) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }

         return var10000;
      }
   }

   protected byte decodeTaggedByte(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      AbstractJsonTreeDecoder this_$iv = this;
      String tag$iv = tag;
      String primitiveName$iv = "byte";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         Byte var10000;
         try {
            int var20 = false;
            long result = JsonElementKt.parseLongImpl(literal$iv);
            var10000 = (-128L <= result ? result <= 127L : false) ? (byte)((int)result) : null;
            if (var10000 == null) {
               this_$iv.unparsedPrimitive(literal$iv, primitiveName$iv, tag$iv);
               throw new KotlinNothingValueException();
            }
         } catch (IllegalArgumentException var23) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }

         return ((Number)var10000).byteValue();
      }
   }

   protected short decodeTaggedShort(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      AbstractJsonTreeDecoder this_$iv = this;
      String tag$iv = tag;
      String primitiveName$iv = "short";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         Short var10000;
         try {
            int var20 = false;
            long result = JsonElementKt.parseLongImpl(literal$iv);
            var10000 = (-32768L <= result ? result <= 32767L : false) ? (short)((int)result) : null;
            if (var10000 == null) {
               this_$iv.unparsedPrimitive(literal$iv, primitiveName$iv, tag$iv);
               throw new KotlinNothingValueException();
            }
         } catch (IllegalArgumentException var23) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }

         return ((Number)var10000).shortValue();
      }
   }

   protected int decodeTaggedInt(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      AbstractJsonTreeDecoder this_$iv = this;
      String tag$iv = tag;
      String primitiveName$iv = "int";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         Integer var10000;
         try {
            int var20 = false;
            long result = JsonElementKt.parseLongImpl(literal$iv);
            var10000 = (-2147483648L <= result ? result <= 2147483647L : false) ? (int)result : null;
            if (var10000 == null) {
               this_$iv.unparsedPrimitive(literal$iv, primitiveName$iv, tag$iv);
               throw new KotlinNothingValueException();
            }
         } catch (IllegalArgumentException var23) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }

         return ((Number)var10000).intValue();
      }
   }

   protected long decodeTaggedLong(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      String primitiveName$iv = "long";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         try {
            int var20 = false;
            return JsonElementKt.parseLongImpl(literal$iv);
         } catch (IllegalArgumentException var21) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }
      }
   }

   protected float decodeTaggedFloat(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      String primitiveName$iv = "float";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var15 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var16 = -1;
         int var17 = false;
         String var18 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var16, var15.append(var18).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         float var10000;
         try {
            int var21 = false;
            var10000 = JsonElementKt.getFloat(literal$iv);
         } catch (IllegalArgumentException var22) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }

         float result = var10000;
         boolean specialFp = this.getJson().getConfiguration().getAllowSpecialFloatingPointValues();
         if (!specialFp && !(Math.abs(result) <= Float.MAX_VALUE)) {
            throw JsonExceptionsKt.InvalidFloatingPointDecoded((Number)result, tag, this.currentObject().toString());
         } else {
            return result;
         }
      }
   }

   protected double decodeTaggedDouble(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      String primitiveName$iv = "double";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var16 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var17 = -1;
         int var18 = false;
         String var19 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var17, var16.append(var19).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         double var10000;
         try {
            int var22 = false;
            var10000 = JsonElementKt.getDouble(literal$iv);
         } catch (IllegalArgumentException var23) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }

         double result = var10000;
         boolean specialFp = this.getJson().getConfiguration().getAllowSpecialFloatingPointValues();
         if (!specialFp && !(Math.abs(result) <= Double.MAX_VALUE)) {
            throw JsonExceptionsKt.InvalidFloatingPointDecoded((Number)result, tag, this.currentObject().toString());
         } else {
            return result;
         }
      }
   }

   protected char decodeTaggedChar(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      String primitiveName$iv = "char";
      int $i$f$getPrimitiveValue = false;
      JsonElement value$iv$iv = this.currentElement(tag);
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv$iv instanceof JsonPrimitive)) {
         StringBuilder var14 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(primitiveName$iv).append(" at element: ");
         byte var15 = -1;
         int var16 = false;
         String var17 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var15, var14.append(var17).toString(), (CharSequence)value$iv$iv.toString());
      } else {
         JsonPrimitive literal$iv = (JsonPrimitive)value$iv$iv;

         try {
            int var20 = false;
            return StringsKt.single((CharSequence)literal$iv.getContent());
         } catch (IllegalArgumentException var21) {
            this.unparsedPrimitive(literal$iv, primitiveName$iv, tag);
            throw new KotlinNothingValueException();
         }
      }
   }

   @NotNull
   protected String decodeTaggedString(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      JsonElement value$iv = this.currentElement(tag);
      String serialName$iv = "string";
      int $i$f$cast = false;
      int $i$f$cast = false;
      if (!(value$iv instanceof JsonPrimitive)) {
         StringBuilder var11 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv).append(" at element: ");
         byte var12 = -1;
         int var13 = false;
         String var14 = this.renderTagStack(tag);
         throw JsonExceptionsKt.JsonDecodingException(var12, var11.append(var14).toString(), (CharSequence)value$iv.toString());
      } else {
         JsonPrimitive value = (JsonPrimitive)value$iv;
         if (!(value instanceof JsonLiteral)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + this.renderTagStack(tag), (CharSequence)this.currentObject().toString());
         } else if (!((JsonLiteral)value).isString() && !this.getJson().getConfiguration().isLenient()) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + this.renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", (CharSequence)this.currentObject().toString());
         } else {
            return ((JsonLiteral)value).getContent();
         }
      }
   }

   @NotNull
   protected Decoder decodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
      Decoder var20;
      if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
         Json var10000 = this.getJson();
         int $i$f$getPrimitiveValue = false;
         JsonElement value$iv$iv = access$currentElement(this, tag);
         String serialName$iv$iv = inlineDescriptor.getSerialName();
         int $i$f$cast = false;
         int $i$f$cast = false;
         if (!(value$iv$iv instanceof JsonPrimitive)) {
            StringBuilder var16 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
            byte var17 = -1;
            int var18 = false;
            String var19 = this.renderTagStack(tag);
            throw JsonExceptionsKt.JsonDecodingException(var17, var16.append(var19).toString(), (CharSequence)value$iv$iv.toString());
         }

         StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(var10000, ((JsonPrimitive)value$iv$iv).getContent());
         var20 = (Decoder)(new JsonDecoderForUnsignedTypes((AbstractJsonLexer)lexer, this.getJson()));
      } else {
         var20 = super.decodeTaggedInline(tag, inlineDescriptor);
      }

      return var20;
   }

   @NotNull
   public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : (new JsonPrimitiveDecoder(this.getJson(), this.getValue(), this.polymorphicDiscriminator)).decodeInline(descriptor);
   }

   // $FF: synthetic method
   public AbstractJsonTreeDecoder(Json json, JsonElement value, String polymorphicDiscriminator, DefaultConstructorMarker $constructor_marker) {
      this(json, value, polymorphicDiscriminator);
   }

   // $FF: synthetic method
   public static final JsonElement access$currentElement(AbstractJsonTreeDecoder $this, String tag) {
      return $this.currentElement(tag);
   }

   // $FF: synthetic method
   public static final String access$renderTagStack(AbstractJsonTreeDecoder $this) {
      return $this.renderTagStack();
   }
}
