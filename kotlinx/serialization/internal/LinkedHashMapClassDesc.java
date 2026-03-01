package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class LinkedHashMapClassDesc extends MapLikeDescriptor {
   public LinkedHashMapClassDesc(@NotNull SerialDescriptor keyDesc, @NotNull SerialDescriptor valueDesc) {
      Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
      Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
      super("kotlin.collections.LinkedHashMap", keyDesc, valueDesc, (DefaultConstructorMarker)null);
   }
}
