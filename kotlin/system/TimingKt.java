package kotlin.system;

import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JvmName(
   name = "TimingKt"
)
public final class TimingKt {
   public static final long measureTimeMillis(@NotNull Function0<Unit> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureTimeMillis = false;
      long start = System.currentTimeMillis();
      block.invoke();
      return System.currentTimeMillis() - start;
   }

   public static final long measureNanoTime(@NotNull Function0<Unit> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$measureNanoTime = false;
      long start = System.nanoTime();
      block.invoke();
      return System.nanoTime() - start;
   }
}
