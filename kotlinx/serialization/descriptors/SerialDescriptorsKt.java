package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.HashMapClassDesc;
import kotlinx.serialization.internal.HashSetClassDesc;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import org.jetbrains.annotations.NotNull;

public final class SerialDescriptorsKt {
   @NotNull
   public static final SerialDescriptor buildClassSerialDescriptor(@NotNull String serialName, @NotNull SerialDescriptor[] typeParameters, @NotNull Function1<? super ClassSerialDescriptorBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      if (StringsKt.isBlank((CharSequence)serialName)) {
         int var4 = false;
         String var5 = "Blank serial names are prohibited";
         throw new IllegalArgumentException(var5.toString());
      } else {
         ClassSerialDescriptorBuilder sdBuilder = new ClassSerialDescriptorBuilder(serialName);
         builderAction.invoke(sdBuilder);
         return (SerialDescriptor)(new SerialDescriptorImpl(serialName, (SerialKind)StructureKind.CLASS.INSTANCE, sdBuilder.getElementNames$kotlinx_serialization_core().size(), ArraysKt.toList(typeParameters), sdBuilder));
      }
   }

   // $FF: synthetic method
   public static SerialDescriptor buildClassSerialDescriptor$default(String var0, SerialDescriptor[] var1, Function1 var2, int var3, Object var4) {
      if ((var3 & 4) != 0) {
         var2 = SerialDescriptorsKt::buildClassSerialDescriptor$lambda$0;
      }

      return buildClassSerialDescriptor(var0, var1, var2);
   }

   @NotNull
   public static final SerialDescriptor PrimitiveSerialDescriptor(@NotNull String serialName, @NotNull PrimitiveKind kind) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(kind, "kind");
      if (StringsKt.isBlank((CharSequence)serialName)) {
         int var2 = false;
         String var3 = "Blank serial names are prohibited";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return PrimitivesKt.PrimitiveDescriptorSafe(serialName, kind);
      }
   }

   @NotNull
   public static final SerialDescriptor SerialDescriptor(@NotNull String serialName, @NotNull SerialDescriptor original) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(original, "original");
      boolean var2;
      String var3;
      if (StringsKt.isBlank((CharSequence)serialName)) {
         var2 = false;
         var3 = "Blank serial names are prohibited";
         throw new IllegalArgumentException(var3.toString());
      } else if (Intrinsics.areEqual((Object)serialName, (Object)original.getSerialName())) {
         var2 = false;
         var3 = "The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.getSerialName() + ')';
         throw new IllegalArgumentException(var3.toString());
      } else {
         if (original.getKind() instanceof PrimitiveKind) {
            PrimitivesKt.checkNameIsNotAPrimitive(serialName);
         }

         return (SerialDescriptor)(new WrappedSerialDescriptor(serialName, original));
      }
   }

   @InternalSerializationApi
   @NotNull
   public static final SerialDescriptor buildSerialDescriptor(@NotNull String serialName, @NotNull SerialKind kind, @NotNull SerialDescriptor[] typeParameters, @NotNull Function1<? super ClassSerialDescriptorBuilder, Unit> builder) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(kind, "kind");
      Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
      Intrinsics.checkNotNullParameter(builder, "builder");
      boolean var5;
      String var6;
      if (StringsKt.isBlank((CharSequence)serialName)) {
         var5 = false;
         var6 = "Blank serial names are prohibited";
         throw new IllegalArgumentException(var6.toString());
      } else if (Intrinsics.areEqual((Object)kind, (Object)StructureKind.CLASS.INSTANCE)) {
         var5 = false;
         var6 = "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead";
         throw new IllegalArgumentException(var6.toString());
      } else {
         ClassSerialDescriptorBuilder sdBuilder = new ClassSerialDescriptorBuilder(serialName);
         builder.invoke(sdBuilder);
         return (SerialDescriptor)(new SerialDescriptorImpl(serialName, kind, sdBuilder.getElementNames$kotlinx_serialization_core().size(), ArraysKt.toList(typeParameters), sdBuilder));
      }
   }

   // $FF: synthetic method
   public static SerialDescriptor buildSerialDescriptor$default(String var0, SerialKind var1, SerialDescriptor[] var2, Function1 var3, int var4, Object var5) {
      if ((var4 & 8) != 0) {
         var3 = SerialDescriptorsKt::buildSerialDescriptor$lambda$5;
      }

      return buildSerialDescriptor(var0, var1, var2, var3);
   }

   // $FF: synthetic method
   public static final <T> SerialDescriptor serialDescriptor() {
      int $i$f$serialDescriptor = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      return SerializersKt.serializer((KType)null).getDescriptor();
   }

   @NotNull
   public static final SerialDescriptor serialDescriptor(@NotNull KType type) {
      Intrinsics.checkNotNullParameter(type, "type");
      return SerializersKt.serializer(type).getDescriptor();
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final SerialDescriptor listSerialDescriptor(@NotNull SerialDescriptor elementDescriptor) {
      Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
      return (SerialDescriptor)(new ArrayListClassDesc(elementDescriptor));
   }

   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static final <T> SerialDescriptor listSerialDescriptor() {
      int $i$f$listSerialDescriptor = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      return listSerialDescriptor(SerializersKt.serializer((KType)null).getDescriptor());
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final SerialDescriptor mapSerialDescriptor(@NotNull SerialDescriptor keyDescriptor, @NotNull SerialDescriptor valueDescriptor) {
      Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
      Intrinsics.checkNotNullParameter(valueDescriptor, "valueDescriptor");
      return (SerialDescriptor)(new HashMapClassDesc(keyDescriptor, valueDescriptor));
   }

   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static final <K, V> SerialDescriptor mapSerialDescriptor() {
      int $i$f$mapSerialDescriptor = false;
      Intrinsics.reifiedOperationMarker(6, "K");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      SerialDescriptor var10000 = SerializersKt.serializer((KType)null).getDescriptor();
      Intrinsics.reifiedOperationMarker(6, "V");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      return mapSerialDescriptor(var10000, SerializersKt.serializer((KType)null).getDescriptor());
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final SerialDescriptor setSerialDescriptor(@NotNull SerialDescriptor elementDescriptor) {
      Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
      return (SerialDescriptor)(new HashSetClassDesc(elementDescriptor));
   }

   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static final <T> SerialDescriptor setSerialDescriptor() {
      int $i$f$setSerialDescriptor = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      return setSerialDescriptor(SerializersKt.serializer((KType)null).getDescriptor());
   }

   @NotNull
   public static final SerialDescriptor getNullable(@NotNull SerialDescriptor $this$nullable) {
      Intrinsics.checkNotNullParameter($this$nullable, "<this>");
      return $this$nullable.isNullable() ? $this$nullable : (SerialDescriptor)(new SerialDescriptorForNullable($this$nullable));
   }

   /** @deprecated */
   // $FF: synthetic method
   public static void getNullable$annotations(SerialDescriptor <this>) {
   }

   @NotNull
   public static final SerialDescriptor getNonNullOriginal(@NotNull SerialDescriptor $this$nonNullOriginal) {
      Intrinsics.checkNotNullParameter($this$nonNullOriginal, "<this>");
      return $this$nonNullOriginal instanceof SerialDescriptorForNullable ? ((SerialDescriptorForNullable)$this$nonNullOriginal).getOriginal$kotlinx_serialization_core() : $this$nonNullOriginal;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getNonNullOriginal$annotations(SerialDescriptor <this>) {
   }

   // $FF: synthetic method
   public static final <T> void element(ClassSerialDescriptorBuilder $this$element, String elementName, List<? extends Annotation> annotations, boolean isOptional) {
      Intrinsics.checkNotNullParameter($this$element, "<this>");
      Intrinsics.checkNotNullParameter(elementName, "elementName");
      Intrinsics.checkNotNullParameter(annotations, "annotations");
      int $i$f$element = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      SerialDescriptor descriptor = SerializersKt.serializer((KType)null).getDescriptor();
      $this$element.element(elementName, descriptor, annotations, isOptional);
   }

   // $FF: synthetic method
   public static void element$default(ClassSerialDescriptorBuilder $this$element_u24default, String elementName, List annotations, boolean isOptional, int $i$f$element, Object descriptor) {
      if ((var4 & 2) != 0) {
         annotations = CollectionsKt.emptyList();
      }

      if ((var4 & 4) != 0) {
         isOptional = false;
      }

      Intrinsics.checkNotNullParameter($this$element_u24default, "<this>");
      Intrinsics.checkNotNullParameter(elementName, "elementName");
      Intrinsics.checkNotNullParameter(annotations, "annotations");
      int $i$f$element = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      SerialDescriptor descriptor = SerializersKt.serializer((KType)null).getDescriptor();
      $this$element_u24default.element(elementName, descriptor, annotations, isOptional);
   }

   private static final Unit buildClassSerialDescriptor$lambda$0(ClassSerialDescriptorBuilder <this>) {
      Intrinsics.checkNotNullParameter(var0, "<this>");
      return Unit.INSTANCE;
   }

   private static final Unit buildSerialDescriptor$lambda$5(ClassSerialDescriptorBuilder <this>) {
      Intrinsics.checkNotNullParameter(var0, "<this>");
      return Unit.INSTANCE;
   }
}
