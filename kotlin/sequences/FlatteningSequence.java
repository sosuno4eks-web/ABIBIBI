package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class FlatteningSequence<T, R, E> implements Sequence<E> {
   @NotNull
   private final Sequence<T> sequence;
   @NotNull
   private final Function1<T, R> transformer;
   @NotNull
   private final Function1<R, Iterator<E>> iterator;

   public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
      Intrinsics.checkNotNullParameter(sequence, "sequence");
      Intrinsics.checkNotNullParameter(transformer, "transformer");
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      super();
      this.sequence = sequence;
      this.transformer = transformer;
      this.iterator = iterator;
   }

   @NotNull
   public Iterator<E> iterator() {
      return (Iterator)(new Iterator<E>() {
         private final Iterator<T> iterator;
         private Iterator<? extends E> itemIterator;
         private int state;

         {
            this.iterator = FlatteningSequence.this.sequence.iterator();
         }

         public final Iterator<T> getIterator() {
            return this.iterator;
         }

         public final Iterator<E> getItemIterator() {
            return this.itemIterator;
         }

         public final void setItemIterator(Iterator<? extends E> <set-?>) {
            this.itemIterator = var1;
         }

         public final int getState() {
            return this.state;
         }

         public final void setState(int <set-?>) {
            this.state = var1;
         }

         public E next() {
            if (this.state == 2) {
               throw new NoSuchElementException();
            } else if (this.state == 0 && !this.ensureItemIterator()) {
               throw new NoSuchElementException();
            } else {
               this.state = 0;
               Iterator var10000 = this.itemIterator;
               Intrinsics.checkNotNull(var10000);
               return var10000.next();
            }
         }

         public boolean hasNext() {
            if (this.state == 1) {
               return true;
            } else {
               return this.state == 2 ? false : this.ensureItemIterator();
            }
         }

         private final boolean ensureItemIterator() {
            Iterator itemIterator = this.itemIterator;
            if (itemIterator != null && itemIterator.hasNext()) {
               this.state = 1;
               return true;
            } else {
               Iterator nextItemIterator;
               do {
                  if (!this.iterator.hasNext()) {
                     this.state = 2;
                     this.itemIterator = null;
                     return false;
                  }

                  Object element = this.iterator.next();
                  nextItemIterator = (Iterator)FlatteningSequence.this.iterator.invoke(FlatteningSequence.this.transformer.invoke(element));
               } while(!nextItemIterator.hasNext());

               this.itemIterator = nextItemIterator;
               this.state = 1;
               return true;
            }
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }

   private static final class State {
      @NotNull
      public static final FlatteningSequence.State INSTANCE = new FlatteningSequence.State();
      public static final int UNDEFINED = 0;
      public static final int READY = 1;
      public static final int DONE = 2;
   }
}
