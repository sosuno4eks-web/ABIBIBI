package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {
   private final boolean isInline;

   public InlineClassDescriptor(@NotNull String name, @NotNull GeneratedSerializer<?> generatedSerializer) {
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
      super(name, generatedSerializer, 1);
      this.isInline = true;
   }

   public boolean isInline() {
      return this.isInline;
   }

   public int hashCode() {
      return super.hashCode() * 31;
   }

   public boolean equals(@Nullable Object other) {
      SerialDescriptor $this$equalsImpl$iv = (SerialDescriptor)this;
      Object other$iv = other;
      int $i$f$equalsImpl = false;
      boolean var10000;
      if ($this$equalsImpl$iv == other) {
         var10000 = true;
      } else if (!(other instanceof InlineClassDescriptor)) {
         var10000 = false;
      } else if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getSerialName(), (Object)((SerialDescriptor)other).getSerialName())) {
         var10000 = false;
      } else {
         InlineClassDescriptor otherDescriptor = (InlineClassDescriptor)other;
         int var6 = false;
         if (!otherDescriptor.isInline() || !Arrays.equals(this.getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core())) {
            var10000 = false;
         } else if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor)other).getElementsCount()) {
            var10000 = false;
         } else {
            int index$iv = 0;
            int var8 = $this$equalsImpl$iv.getElementsCount();

            while(true) {
               if (index$iv >= var8) {
                  var10000 = true;
                  break;
               }

               if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), (Object)((SerialDescriptor)other$iv).getElementDescriptor(index$iv).getSerialName())) {
                  var10000 = false;
                  break;
               }

               if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), (Object)((SerialDescriptor)other$iv).getElementDescriptor(index$iv).getKind())) {
                  var10000 = false;
                  break;
               }

               ++index$iv;
            }
         }
      }

      return var10000;
   }
}
