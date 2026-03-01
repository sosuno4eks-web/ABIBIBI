package kotlin.coroutines;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.3"
)
public interface Continuation<T> {
   @NotNull
   CoroutineContext getContext();

   void resumeWith(@NotNull Object var1);
}
