package kotlin.collections.builders;

import java.util.Map.Entry;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractMapBuilderEntrySet<E extends Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
   public final boolean contains(@NotNull E element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.containsEntry(element);
   }

   public abstract boolean containsEntry(@NotNull Entry<? extends K, ? extends V> var1);
}
