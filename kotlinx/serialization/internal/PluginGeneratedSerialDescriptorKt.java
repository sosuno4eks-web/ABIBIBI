package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;

public final class PluginGeneratedSerialDescriptorKt {
   // $FF: synthetic method
   public static final <SD extends SerialDescriptor> boolean equalsImpl(SD $this$equalsImpl, Object other, Function1<? super SD, Boolean> typeParamsAreEqual) {
      Intrinsics.checkNotNullParameter($this$equalsImpl, "<this>");
      Intrinsics.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
      int $i$f$equalsImpl = false;
      if ($this$equalsImpl == other) {
         return true;
      } else {
         Intrinsics.reifiedOperationMarker(3, "SD");
         if (!(other instanceof SerialDescriptor)) {
            return false;
         } else if (!Intrinsics.areEqual((Object)$this$equalsImpl.getSerialName(), (Object)((SerialDescriptor)other).getSerialName())) {
            return false;
         } else if (!(Boolean)typeParamsAreEqual.invoke(other)) {
            return false;
         } else if ($this$equalsImpl.getElementsCount() != ((SerialDescriptor)other).getElementsCount()) {
            return false;
         } else {
            int index = 0;

            for(int var5 = $this$equalsImpl.getElementsCount(); index < var5; ++index) {
               if (!Intrinsics.areEqual((Object)$this$equalsImpl.getElementDescriptor(index).getSerialName(), (Object)((SerialDescriptor)other).getElementDescriptor(index).getSerialName())) {
                  return false;
               }

               if (!Intrinsics.areEqual((Object)$this$equalsImpl.getElementDescriptor(index).getKind(), (Object)((SerialDescriptor)other).getElementDescriptor(index).getKind())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public static final int hashCodeImpl(@NotNull SerialDescriptor $this$hashCodeImpl, @NotNull SerialDescriptor[] typeParams) {
      Intrinsics.checkNotNullParameter($this$hashCodeImpl, "<this>");
      Intrinsics.checkNotNullParameter(typeParams, "typeParams");
      int result = $this$hashCodeImpl.getSerialName().hashCode();
      result = 31 * result + Arrays.hashCode(typeParams);
      Iterable elementDescriptors = SerialDescriptorKt.getElementDescriptors($this$hashCodeImpl);
      int $i$f$elementsHashCodeBy = false;
      int initial$iv$iv = 1;
      int $i$f$fold = false;
      int accumulator$iv$iv = initial$iv$iv;

      int var10000;
      int var19;
      String var20;
      for(Iterator var11 = elementDescriptors.iterator(); var11.hasNext(); accumulator$iv$iv = var19 + (var20 != null ? var20.hashCode() : 0)) {
         Object element$iv$iv = var11.next();
         int var15 = false;
         var10000 = 31 * accumulator$iv$iv;
         SerialDescriptor it = (SerialDescriptor)element$iv$iv;
         var19 = var10000;
         int var17 = false;
         var20 = it.getSerialName();
      }

      int namesHash = accumulator$iv$iv;
      int $i$f$elementsHashCodeBy = false;
      int initial$iv$iv = 1;
      int $i$f$fold = false;
      int accumulator$iv$iv = initial$iv$iv;

      SerialKind var27;
      for(Iterator var24 = elementDescriptors.iterator(); var24.hasNext(); accumulator$iv$iv = var19 + (var27 != null ? var27.hashCode() : 0)) {
         Object element$iv$iv = var24.next();
         int var25 = false;
         var10000 = 31 * accumulator$iv$iv;
         SerialDescriptor it = (SerialDescriptor)element$iv$iv;
         var19 = var10000;
         int var18 = false;
         var27 = it.getKind();
      }

      result = 31 * result + namesHash;
      result = 31 * result + accumulator$iv$iv;
      return result;
   }

   @NotNull
   public static final String toStringImpl(@NotNull SerialDescriptor $this$toStringImpl) {
      Intrinsics.checkNotNullParameter($this$toStringImpl, "<this>");
      return CollectionsKt.joinToString$default((Iterable)RangesKt.until(0, $this$toStringImpl.getElementsCount()), (CharSequence)", ", (CharSequence)($this$toStringImpl.getSerialName() + '('), (CharSequence)")", 0, (CharSequence)null, PluginGeneratedSerialDescriptorKt::toStringImpl$lambda$2, 24, (Object)null);
   }

   private static final CharSequence toStringImpl$lambda$2(SerialDescriptor $this_toStringImpl, int i) {
      return (CharSequence)($this_toStringImpl.getElementName(i) + ": " + $this_toStringImpl.getElementDescriptor(i).getSerialName());
   }
}
