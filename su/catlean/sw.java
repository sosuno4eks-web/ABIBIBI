package su.catlean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

public final class sw {
   private sw() {
   }

   @NotNull
   public final KSerializer j() {
      return this.q();
   }

   private final KSerializer q() {
      return (KSerializer)hd.L().getValue();
   }

   public sw(DefaultConstructorMarker $constructor_marker) {
      this();
   }
}
