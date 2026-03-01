package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PolymorphicKt {
   public static final <T> void encodePolymorphically(@NotNull JsonEncoder $this$encodePolymorphically, @NotNull SerializationStrategy<? super T> serializer, T value, @NotNull Function2<? super String, ? super String, Unit> ifPolymorphic) {
      Intrinsics.checkNotNullParameter($this$encodePolymorphically, "<this>");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic");
      int $i$f$encodePolymorphically = false;
      if ($this$encodePolymorphically.getJson().getConfiguration().getUseArrayPolymorphism()) {
         serializer.serialize((Encoder)$this$encodePolymorphically, value);
      } else {
         boolean isPolymorphicSerializer = serializer instanceof AbstractPolymorphicSerializer;
         boolean var10000;
         if (isPolymorphicSerializer) {
            var10000 = $this$encodePolymorphically.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE;
         } else {
            switch(PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[$this$encodePolymorphically.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) {
            case 1:
            case 2:
               var10000 = false;
               break;
            case 3:
               SerialKind it = serializer.getDescriptor().getKind();
               int var11 = false;
               var10000 = Intrinsics.areEqual((Object)it, (Object)StructureKind.CLASS.INSTANCE) || Intrinsics.areEqual((Object)it, (Object)StructureKind.OBJECT.INSTANCE);
               break;
            default:
               throw new NoWhenBranchMatchedException();
            }
         }

         boolean needDiscriminator = var10000;
         String baseClassDiscriminator = needDiscriminator ? classDiscriminator(serializer.getDescriptor(), $this$encodePolymorphically.getJson()) : null;
         SerializationStrategy var15;
         if (isPolymorphicSerializer) {
            AbstractPolymorphicSerializer casted = (AbstractPolymorphicSerializer)serializer;
            if (value == null) {
               int var13 = false;
               String var14 = "Value for serializer " + ((AbstractPolymorphicSerializer)serializer).getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.";
               throw new IllegalArgumentException(var14.toString());
            }

            SerializationStrategy actual = PolymorphicSerializerKt.findPolymorphicSerializer(casted, (Encoder)$this$encodePolymorphically, value);
            if (baseClassDiscriminator != null) {
               access$validateIfSealed(serializer, actual, baseClassDiscriminator);
               checkKind(actual.getDescriptor().getKind());
            }

            Intrinsics.checkNotNull(actual, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            var15 = actual;
         } else {
            var15 = serializer;
         }

         SerializationStrategy actualSerializer = var15;
         if (baseClassDiscriminator != null) {
            ifPolymorphic.invoke(baseClassDiscriminator, actualSerializer.getDescriptor().getSerialName());
         }

         actualSerializer.serialize((Encoder)$this$encodePolymorphically, value);
      }
   }

   private static final void validateIfSealed(SerializationStrategy<?> serializer, SerializationStrategy<?> actualSerializer, String classDiscriminator) {
      if (serializer instanceof SealedClassSerializer) {
         if (JsonInternalDependenciesKt.jsonCachedSerialNames(actualSerializer.getDescriptor()).contains(classDiscriminator)) {
            String baseName = ((SealedClassSerializer)serializer).getDescriptor().getSerialName();
            String actualName = actualSerializer.getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + actualName + "' cannot be serialized as base class '" + baseName + "' because it has property name that conflicts with JSON class discriminator '" + classDiscriminator + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
         }
      }
   }

   public static final void checkKind(@NotNull SerialKind kind) {
      Intrinsics.checkNotNullParameter(kind, "kind");
      if (kind instanceof SerialKind.ENUM) {
         throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
      } else if (kind instanceof PrimitiveKind) {
         throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
      } else if (kind instanceof PolymorphicKind) {
         throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
      }
   }

   public static final <T> T decodeSerializableValuePolymorphic(@NotNull JsonDecoder $this$decodeSerializableValuePolymorphic, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull Function0<String> path) {
      Intrinsics.checkNotNullParameter($this$decodeSerializableValuePolymorphic, "<this>");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(path, "path");
      int $i$f$decodeSerializableValuePolymorphic = false;
      if (deserializer instanceof AbstractPolymorphicSerializer && !$this$decodeSerializableValuePolymorphic.getJson().getConfiguration().getUseArrayPolymorphism()) {
         String discriminator = classDiscriminator(((AbstractPolymorphicSerializer)deserializer).getDescriptor(), $this$decodeSerializableValuePolymorphic.getJson());
         JsonElement value$iv = $this$decodeSerializableValuePolymorphic.decodeJsonElement();
         String serialName$iv = ((AbstractPolymorphicSerializer)deserializer).getDescriptor().getSerialName();
         int $i$f$cast = false;
         if (!(value$iv instanceof JsonObject)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv + " at element: " + (String)path.invoke(), (CharSequence)value$iv.toString());
         } else {
            JsonObject jsonTree;
            String var13;
            label27: {
               jsonTree = (JsonObject)value$iv;
               JsonElement var10000 = (JsonElement)jsonTree.get((Object)discriminator);
               if (var10000 != null) {
                  JsonPrimitive var12 = JsonElementKt.getJsonPrimitive(var10000);
                  if (var12 != null) {
                     var13 = JsonElementKt.getContentOrNull(var12);
                     break label27;
                  }
               }

               var13 = null;
            }

            String type = var13;

            DeserializationStrategy var9;
            try {
               var9 = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer)deserializer, (CompositeDecoder)$this$decodeSerializableValuePolymorphic, type);
            } catch (SerializationException var11) {
               String var10001 = var11.getMessage();
               Intrinsics.checkNotNull(var10001);
               throw JsonExceptionsKt.JsonDecodingException(-1, var10001, (CharSequence)jsonTree.toString());
            }

            Intrinsics.checkNotNull(var9, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return TreeJsonDecoderKt.readPolymorphicJson($this$decodeSerializableValuePolymorphic.getJson(), discriminator, jsonTree, var9);
         }
      } else {
         return deserializer.deserialize((Decoder)$this$decodeSerializableValuePolymorphic);
      }
   }

   @NotNull
   public static final String classDiscriminator(@NotNull SerialDescriptor $this$classDiscriminator, @NotNull Json json) {
      Intrinsics.checkNotNullParameter($this$classDiscriminator, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      Iterator var2 = $this$classDiscriminator.getAnnotations().iterator();

      Annotation annotation;
      do {
         if (!var2.hasNext()) {
            return json.getConfiguration().getClassDiscriminator();
         }

         annotation = (Annotation)var2.next();
      } while(!(annotation instanceof JsonClassDiscriminator));

      return ((JsonClassDiscriminator)annotation).discriminator();
   }

   @NotNull
   public static final Void throwJsonElementPolymorphicException(@Nullable String serialName, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      throw new JsonEncodingException("Class with serial name " + serialName + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
   }

   // $FF: synthetic method
   public static final void access$validateIfSealed(SerializationStrategy serializer, SerializationStrategy actualSerializer, String classDiscriminator) {
      validateIfSealed(serializer, actualSerializer, classDiscriminator);
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[ClassDiscriminatorMode.values().length];

         try {
            var0[ClassDiscriminatorMode.NONE.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
