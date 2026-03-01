package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E>, KMappedMarker {
   @NotNull
   public static final AbstractSet.Companion Companion = new AbstractSet.Companion((DefaultConstructorMarker)null);

   protected AbstractSet() {
   }

   public boolean equals(@Nullable Object other) {
      if (other == this) {
         return true;
      } else {
         return !(other instanceof Set) ? false : Companion.setEquals$kotlin_stdlib((Set)this, (Set)other);
      }
   }

   public int hashCode() {
      return Companion.unorderedHashCode$kotlin_stdlib((Collection)this);
   }

   public Iterator<E> iterator() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public static final class Companion {
      private Companion() {
      }

      public final int unorderedHashCode$kotlin_stdlib(@NotNull Collection<?> c) {
         Intrinsics.checkNotNullParameter(c, "c");
         int hashCode = 0;

         Object element;
         for(Iterator var3 = c.iterator(); var3.hasNext(); hashCode += element != null ? element.hashCode() : 0) {
            element = var3.next();
         }

         return hashCode;
      }

      public final boolean setEquals$kotlin_stdlib(@NotNull Set<?> c, @NotNull Set<?> other) {
         Intrinsics.checkNotNullParameter(c, "c");
         Intrinsics.checkNotNullParameter(other, "other");
         return c.size() != other.size() ? false : c.containsAll((Collection)other);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
