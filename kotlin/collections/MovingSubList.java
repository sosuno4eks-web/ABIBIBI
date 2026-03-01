package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {
   @NotNull
   private final List<E> list;
   private int fromIndex;
   private int _size;

   public MovingSubList(@NotNull List<? extends E> list) {
      Intrinsics.checkNotNullParameter(list, "list");
      super();
      this.list = list;
   }

   public final void move(int fromIndex, int toIndex) {
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.list.size());
      this.fromIndex = fromIndex;
      this._size = toIndex - fromIndex;
   }

   public E get(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this._size);
      return this.list.get(this.fromIndex + index);
   }

   public int getSize() {
      return this._size;
   }
}
