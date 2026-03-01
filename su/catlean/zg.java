package su.catlean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

public final class zg {
   private zg() {
   }

   @NotNull
   public final KSerializer i() {
      return this.R();
   }

   private final KSerializer R() {
      return (KSerializer)fq.s().getValue();
   }

   public zg(DefaultConstructorMarker $constructor_marker) {
      this();
   }
}
