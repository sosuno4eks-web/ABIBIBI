package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {
   @NotNull
   private final String serialName;

   public PrimitiveArrayDescriptor(@NotNull SerialDescriptor primitive) {
      Intrinsics.checkNotNullParameter(primitive, "primitive");
      super(primitive, (DefaultConstructorMarker)null);
      this.serialName = primitive.getSerialName() + "Array";
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }
}
