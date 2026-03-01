package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CharsKt__CharKt extends CharsKt__CharJVMKt {
   @SinceKotlin(
      version = "1.5"
   )
   public static final int digitToInt(char $this$digitToInt) {
      int var1 = CharsKt.digitOf($this$digitToInt, 10);
      int var3 = false;
      if (var1 < 0) {
         throw new IllegalArgumentException("Char " + $this$digitToInt + " is not a decimal digit");
      } else {
         return var1;
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final int digitToInt(char $this$digitToInt, int radix) {
      Integer var10000 = CharsKt.digitToIntOrNull($this$digitToInt, radix);
      if (var10000 != null) {
         return var10000;
      } else {
         throw new IllegalArgumentException("Char " + $this$digitToInt + " is not a digit in the given radix=" + radix);
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final Integer digitToIntOrNull(char $this$digitToIntOrNull) {
      Integer var1 = CharsKt.digitOf($this$digitToIntOrNull, 10);
      int it = ((Number)var1).intValue();
      int var3 = false;
      return it >= 0 ? var1 : null;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final Integer digitToIntOrNull(char $this$digitToIntOrNull, int radix) {
      CharsKt.checkRadix(radix);
      Integer var2 = CharsKt.digitOf($this$digitToIntOrNull, radix);
      int it = ((Number)var2).intValue();
      int var4 = false;
      return it >= 0 ? var2 : null;
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final char digitToChar(int $this$digitToChar) {
      if (0 <= $this$digitToChar ? $this$digitToChar < 10 : false) {
         return (char)(48 + $this$digitToChar);
      } else {
         throw new IllegalArgumentException("Int " + $this$digitToChar + " is not a decimal digit");
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final char digitToChar(int $this$digitToChar, int radix) {
      if (!(2 <= radix ? radix < 37 : false)) {
         throw new IllegalArgumentException("Invalid radix: " + radix + ". Valid radix values are in range 2..36");
      } else if ($this$digitToChar >= 0 && $this$digitToChar < radix) {
         return $this$digitToChar < 10 ? (char)(48 + $this$digitToChar) : (char)((char)(65 + $this$digitToChar) - 10);
      } else {
         throw new IllegalArgumentException("Digit " + $this$digitToChar + " does not represent a valid digit in radix " + radix);
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String titlecase(char $this$titlecase) {
      return _OneToManyTitlecaseMappingsKt.titlecaseImpl($this$titlecase);
   }

   @InlineOnly
   private static final String plus(char $this$plus, String other) {
      Intrinsics.checkNotNullParameter(other, "other");
      return $this$plus + other;
   }

   public static final boolean equals(char $this$equals, char other, boolean ignoreCase) {
      if ($this$equals == other) {
         return true;
      } else if (!ignoreCase) {
         return false;
      } else {
         char thisUpper = Character.toUpperCase($this$equals);
         char otherUpper = Character.toUpperCase(other);
         return thisUpper == otherUpper || Character.toLowerCase(thisUpper) == Character.toLowerCase(otherUpper);
      }
   }

   // $FF: synthetic method
   public static boolean equals$default(char var0, char var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return CharsKt.equals(var0, var1, var2);
   }

   public static final boolean isSurrogate(char $this$isSurrogate) {
      return '\ud800' <= $this$isSurrogate ? $this$isSurrogate < '\ue000' : false;
   }

   public CharsKt__CharKt() {
   }
}
