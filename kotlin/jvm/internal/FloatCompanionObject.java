package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public final class FloatCompanionObject {
   @NotNull
   public static final FloatCompanionObject INSTANCE = new FloatCompanionObject();
   public static final float MIN_VALUE = Float.MIN_VALUE;
   public static final float MAX_VALUE = Float.MAX_VALUE;
   public static final float POSITIVE_INFINITY = Float.POSITIVE_INFINITY;
   public static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;
   public static final float NaN = Float.NaN;
   public static final int SIZE_BYTES = 4;
   public static final int SIZE_BITS = 32;

   private FloatCompanionObject() {
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

   public final float getMIN_VALUE() {
      return Float.MIN_VALUE;
   }

   public final float getMAX_VALUE() {
      return Float.MAX_VALUE;
   }

   public final float getPOSITIVE_INFINITY() {
      return Float.POSITIVE_INFINITY;
   }

   public final float getNEGATIVE_INFINITY() {
      return Float.NEGATIVE_INFINITY;
   }

   public final float getNaN() {
      return Float.NaN;
   }
}
