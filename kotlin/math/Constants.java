package kotlin.math;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

final class Constants {
   @NotNull
   public static final Constants INSTANCE = new Constants();
   @JvmField
   public static final double LN2 = Math.log(2.0D);
   @JvmField
   public static final double epsilon = Math.ulp(1.0D);
   @JvmField
   public static final double taylor_2_bound;
   @JvmField
   public static final double taylor_n_bound;
   @JvmField
   public static final double upper_taylor_2_bound;
   @JvmField
   public static final double upper_taylor_n_bound;

   private Constants() {
   }

   static {
      taylor_2_bound = Math.sqrt(epsilon);
      taylor_n_bound = Math.sqrt(taylor_2_bound);
      upper_taylor_2_bound = (double)1 / taylor_2_bound;
      upper_taylor_n_bound = (double)1 / taylor_n_bound;
   }
}
