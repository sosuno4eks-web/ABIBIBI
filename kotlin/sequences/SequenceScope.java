package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictsSuspension
@SinceKotlin(
   version = "1.3"
)
public abstract class SequenceScope<T> {
   @Nullable
   public abstract Object yield(T var1, @NotNull Continuation<? super Unit> var2);

   @Nullable
   public abstract Object yieldAll(@NotNull Iterator<? extends T> var1, @NotNull Continuation<? super Unit> var2);

   @Nullable
   public final Object yieldAll(@NotNull Iterable<? extends T> elements, @NotNull Continuation<? super Unit> $completion) {
      if (elements instanceof Collection && ((Collection)elements).isEmpty()) {
         return Unit.INSTANCE;
      } else {
         Object var10000 = this.yieldAll(elements.iterator(), $completion);
         return var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? var10000 : Unit.INSTANCE;
      }
   }

   @Nullable
   public final Object yieldAll(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> $completion) {
      Object var10000 = this.yieldAll(sequence.iterator(), $completion);
      return var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? var10000 : Unit.INSTANCE;
   }
}
