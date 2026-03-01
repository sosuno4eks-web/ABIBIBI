package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class SerialDescriptorKt {
   @NotNull
   public static final Iterable<SerialDescriptor> getElementDescriptors(@NotNull SerialDescriptor $this$elementDescriptors) {
      Intrinsics.checkNotNullParameter($this$elementDescriptors, "<this>");
      return (Iterable)(new SerialDescriptorKt$special$$inlined$Iterable$1($this$elementDescriptors));
   }

   @NotNull
   public static final Iterable<String> getElementNames(@NotNull SerialDescriptor $this$elementNames) {
      Intrinsics.checkNotNullParameter($this$elementNames, "<this>");
      return (Iterable)(new SerialDescriptorKt$special$$inlined$Iterable$2($this$elementNames));
   }
}
