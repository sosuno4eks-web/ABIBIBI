package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class ArrayListClassDesc extends ListLikeDescriptor {
   public ArrayListClassDesc(@NotNull SerialDescriptor elementDesc) {
      Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
      super(elementDesc, (DefaultConstructorMarker)null);
   }

   @NotNull
   public String getSerialName() {
      return "kotlin.collections.ArrayList";
   }
}
