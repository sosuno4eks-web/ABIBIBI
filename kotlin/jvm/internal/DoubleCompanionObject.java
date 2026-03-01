package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class DoubleCompanionObject {
   @NotNull
   public static final DoubleCompanionObject INSTANCE = new DoubleCompanionObject();
   public static final double MIN_VALUE = Double.MIN_VALUE;
   public static final double MAX_VALUE = Double.MAX_VALUE;
   public static final double POSITIVE_INFINITY = Double.POSITIVE_INFINITY;
   public static final double NEGATIVE_INFINITY = Double.NEGATIVE_INFINITY;
   public static final double NaN = Double.NaN;
   public static final int SIZE_BYTES = 8;
   public static final int SIZE_BITS = 64;

   private DoubleCompanionObject() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getMIN_VALUE$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getMAX_VALUE$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getPOSITIVE_INFINITY$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getNEGATIVE_INFINITY$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getNaN$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getSIZE_BYTES$annotations() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getSIZE_BITS$annotations() {
   }

   public final double getMIN_VALUE() {
      return Double.MIN_VALUE;
   }

   public final double getMAX_VALUE() {
      return Double.MAX_VALUE;
   }

   public final double getPOSITIVE_INFINITY() {
      return Double.POSITIVE_INFINITY;
   }

   public final double getNEGATIVE_INFINITY() {
      return Double.NEGATIVE_INFINITY;
   }

   public final double getNaN() {
      return Double.NaN;
   }
}
