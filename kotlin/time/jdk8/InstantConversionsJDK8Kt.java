package kotlin.time.jdk8;

import java.time.Instant;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;

@JvmName(
   name = "InstantConversionsJDK8Kt"
)
public final class InstantConversionsJDK8Kt {
   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalTime
   @NotNull
   public static final Instant toJavaInstant(@NotNull kotlin.time.Instant $this$toJavaInstant) {
      Intrinsics.checkNotNullParameter($this$toJavaInstant, "<this>");
      Instant var10000 = Instant.ofEpochSecond($this$toJavaInstant.getEpochSeconds(), (long)$this$toJavaInstant.getNanosecondsOfSecond());
      Intrinsics.checkNotNullExpressionValue(var10000, "ofEpochSecond(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "2.1"
   )
   @ExperimentalTime
   @NotNull
   public static final kotlin.time.Instant toKotlinInstant(@NotNull Instant $this$toKotlinInstant) {
      Intrinsics.checkNotNullParameter($this$toKotlinInstant, "<this>");
      return kotlin.time.Instant.Companion.fromEpochSeconds($this$toKotlinInstant.getEpochSecond(), $this$toKotlinInstant.getNano());
   }
}
