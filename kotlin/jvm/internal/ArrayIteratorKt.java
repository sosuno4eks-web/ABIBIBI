package kotlin.jvm.internal;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class ArrayIteratorKt {
   @NotNull
   public static final <T> Iterator<T> iterator(@NotNull T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return (Iterator)(new ArrayIterator(array));
   }
}
