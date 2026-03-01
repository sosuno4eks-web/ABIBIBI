package kotlin.coroutines.jvm.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@JvmName(
   name = "Boxing"
)
public final class Boxing {
   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Boolean boxBoolean(boolean primitive) {
      return primitive;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Byte boxByte(byte primitive) {
      return primitive;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Short boxShort(short primitive) {
      return new Short(primitive);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Integer boxInt(int primitive) {
      return new Integer(primitive);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Long boxLong(long primitive) {
      return new Long(primitive);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Float boxFloat(float primitive) {
      return new Float(primitive);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Double boxDouble(double primitive) {
      return new Double(primitive);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @NotNull
   public static final Character boxChar(char primitive) {
      return new Character(primitive);
   }
}
