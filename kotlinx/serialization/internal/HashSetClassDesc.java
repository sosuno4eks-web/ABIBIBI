package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class HashSetClassDesc extends ListLikeDescriptor {
   public HashSetClassDesc(@NotNull SerialDescriptor elementDesc) {
      Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
      super(elementDesc, (DefaultConstructorMarker)null);
   }

   @NotNull
   public String getSerialName() {
      return "kotlin.collections.HashSet";
   }
}
