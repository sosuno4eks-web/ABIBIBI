package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class fw {
   @NotNull
   public static final fw x = new fw();
   private static final long a = j0.a(8316433405311434121L, 2478639187842753096L, MethodHandles.lookup().lookupClass()).a(272009980179524L);

   private fw() {
   }

   public final float B(long a, float endPoint, float current, float speed) {
      // $FF: Couldn't be decompiled
   }

   public final double S(@NotNull Number a) {
      Intrinsics.checkNotNullParameter(var1, "a");
      return Math.sqrt(1.0D - (var1.doubleValue() - 1.0D) * (var1.doubleValue() - 1.0D));
   }

   public final double Z(@NotNull Number x) {
      Intrinsics.checkNotNullParameter(var1, "x");
      return 1.0D - (0.5D * Math.sin(3.141592653589793D * var1.doubleValue() + 1.5707963267948966D) + 0.5D);
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
