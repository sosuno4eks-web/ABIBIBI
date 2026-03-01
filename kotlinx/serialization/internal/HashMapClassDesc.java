package kotlinx.serialization.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class HashMapClassDesc extends MapLikeDescriptor {
   public HashMapClassDesc(@NotNull SerialDescriptor keyDesc, @NotNull SerialDescriptor valueDesc) {
      Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
      Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
      super("kotlin.collections.HashMap", keyDesc, valueDesc, (DefaultConstructorMarker)null);
   }
}
