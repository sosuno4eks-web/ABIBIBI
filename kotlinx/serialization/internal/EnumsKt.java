package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EnumsKt {
   @PublishedApi
   @NotNull
   public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(@NotNull String serialName, @NotNull T[] values) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(values, "values");
      return (KSerializer)(new EnumSerializer(serialName, values));
   }

   @PublishedApi
   @NotNull
   public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] annotations) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(values, "values");
      Intrinsics.checkNotNullParameter(names, "names");
      Intrinsics.checkNotNullParameter(annotations, "annotations");
      EnumDescriptor descriptor = new EnumDescriptor(serialName, values.length);
      Object[] $this$forEachIndexed$iv = values;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;
      int var8 = 0;

      for(int var9 = values.length; var8 < var9; ++var8) {
         Object item$iv = $this$forEachIndexed$iv[var8];
         int i = index$iv++;
         int var13 = false;
         String var22 = (String)ArraysKt.getOrNull(names, i);
         if (var22 == null) {
            var22 = item$iv.name();
         }

         String elementName = var22;
         PluginGeneratedSerialDescriptor.addElement$default((PluginGeneratedSerialDescriptor)descriptor, elementName, false, 2, (Object)null);
         Annotation[] var23 = (Annotation[])ArraysKt.getOrNull((Object[])annotations, i);
         if (var23 != null) {
            Object[] $this$forEach$iv = var23;
            int $i$f$forEach = false;
            int var17 = 0;

            for(int var18 = $this$forEach$iv.length; var17 < var18; ++var17) {
               Object element$iv = $this$forEach$iv[var17];
               int var21 = false;
               descriptor.pushAnnotation(element$iv);
            }
         }
      }

      return (KSerializer)(new EnumSerializer(serialName, values, (SerialDescriptor)descriptor));
   }

   @PublishedApi
   @NotNull
   public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] entryAnnotations, @Nullable Annotation[] classAnnotations) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(values, "values");
      Intrinsics.checkNotNullParameter(names, "names");
      Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
      EnumDescriptor descriptor = new EnumDescriptor(serialName, values.length);
      boolean $i$f$forEachIndexed;
      int index$iv;
      int var9;
      if (classAnnotations != null) {
         Object[] $this$forEach$iv = classAnnotations;
         $i$f$forEachIndexed = false;
         index$iv = 0;

         for(var9 = classAnnotations.length; index$iv < var9; ++index$iv) {
            Object element$iv = $this$forEach$iv[index$iv];
            int var12 = false;
            descriptor.pushClassAnnotation(element$iv);
         }
      }

      Object[] $this$forEachIndexed$iv = values;
      $i$f$forEachIndexed = false;
      index$iv = 0;
      var9 = 0;

      for(int var24 = values.length; var9 < var24; ++var9) {
         Object item$iv = $this$forEachIndexed$iv[var9];
         int i = index$iv++;
         int var14 = false;
         String var25 = (String)ArraysKt.getOrNull(names, i);
         if (var25 == null) {
            var25 = item$iv.name();
         }

         String elementName = var25;
         PluginGeneratedSerialDescriptor.addElement$default((PluginGeneratedSerialDescriptor)descriptor, elementName, false, 2, (Object)null);
         Annotation[] var26 = (Annotation[])ArraysKt.getOrNull((Object[])entryAnnotations, i);
         if (var26 != null) {
            Object[] $this$forEach$iv = var26;
            int $i$f$forEach = false;
            int var18 = 0;

            for(int var19 = $this$forEach$iv.length; var18 < var19; ++var18) {
               Object element$iv = $this$forEach$iv[var18];
               int var22 = false;
               descriptor.pushAnnotation(element$iv);
            }
         }
      }

      return (KSerializer)(new EnumSerializer(serialName, values, (SerialDescriptor)descriptor));
   }
}
