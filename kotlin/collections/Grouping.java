package kotlin.collections;

import java.util.Iterator;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.1"
)
public interface Grouping<T, K> {
   @NotNull
   Iterator<T> sourceIterator();

   K keyOf(T var1);
}
