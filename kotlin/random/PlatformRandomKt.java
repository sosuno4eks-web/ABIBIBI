package kotlin.random;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class PlatformRandomKt {
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final java.util.Random asJavaRandom(@NotNull Random $this$asJavaRandom) {
      Intrinsics.checkNotNullParameter($this$asJavaRandom, "<this>");
      AbstractPlatformRandom var10000 = $this$asJavaRandom instanceof AbstractPlatformRandom ? (AbstractPlatformRandom)$this$asJavaRandom : null;
      java.util.Random var1;
      if (($this$asJavaRandom instanceof AbstractPlatformRandom ? (AbstractPlatformRandom)$this$asJavaRandom : null) != null) {
         var1 = var10000.getImpl();
         if (var1 != null) {
            return var1;
         }
      }

      var1 = (java.util.Random)(new KotlinRandom($this$asJavaRandom));
      return var1;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final Random asKotlinRandom(@NotNull java.util.Random $this$asKotlinRandom) {
      Intrinsics.checkNotNullParameter($this$asKotlinRandom, "<this>");
      KotlinRandom var10000 = $this$asKotlinRandom instanceof KotlinRandom ? (KotlinRandom)$this$asKotlinRandom : null;
      Random var1;
      if (($this$asKotlinRandom instanceof KotlinRandom ? (KotlinRandom)$this$asKotlinRandom : null) != null) {
         var1 = var10000.getImpl();
         if (var1 != null) {
            return var1;
         }
      }

      var1 = (Random)(new PlatformRandom($this$asKotlinRandom));
      return var1;
   }

   @InlineOnly
   private static final Random defaultPlatformRandom() {
      return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
   }

   public static final double doubleFromParts(int hi26, int low27) {
      return (double)(((long)hi26 << 27) + (long)low27) / 9.007199254740992E15D;
   }
}
