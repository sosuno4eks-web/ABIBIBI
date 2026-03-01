package kotlin.sequences;

import org.jetbrains.annotations.NotNull;

public interface DropTakeSequence<T> extends Sequence<T> {
   @NotNull
   Sequence<T> drop(int var1);

   @NotNull
   Sequence<T> take(int var1);
}
