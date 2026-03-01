package kotlin.time.jdk8;

import java.time.Duration;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@JvmName(
   name = "DurationConversionsJDK8Kt"
)
public final class DurationConversionsJDK8Kt {
   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final long toKotlinDuration(Duration $this$toKotlinDuration) {
      Intrinsics.checkNotNullParameter($this$toKotlinDuration, "<this>");
      return kotlin.time.Duration.plus-LRDsOJo(DurationKt.toDuration($this$toKotlinDuration.getSeconds(), DurationUnit.SECONDS), DurationKt.toDuration($this$toKotlinDuration.getNano(), DurationUnit.NANOSECONDS));
   }

   @SinceKotlin(
      version = "1.6"
   )
   @InlineOnly
   private static final Duration toJavaDuration_LRDsOJo/* $FF was: toJavaDuration-LRDsOJo*/(long $this$toJavaDuration_u2dLRDsOJo) {
      int var2 = false;
      long var10000 = kotlin.time.Duration.getInWholeSeconds-impl($this$toJavaDuration_u2dLRDsOJo);
      int nanoseconds = kotlin.time.Duration.getNanosecondsComponent-impl($this$toJavaDuration_u2dLRDsOJo);
      long seconds = var10000;
      int var6 = false;
      Duration var7 = Duration.ofSeconds(seconds, (long)nanoseconds);
      Intrinsics.checkNotNullExpressionValue(var7, "toComponents-impl(...)");
      return var7;
   }
}
