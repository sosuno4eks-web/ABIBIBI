package kotlin;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

final class KotlinVersionCurrentValue {
   @NotNull
   public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();

   private KotlinVersionCurrentValue() {
   }

   @JvmStatic
   @NotNull
   public static final KotlinVersion get() {
      return new KotlinVersion(2, 2, 10);
   }
}
