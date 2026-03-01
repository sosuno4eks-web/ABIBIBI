package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class GeneratorSequence<T> implements Sequence<T> {
   @NotNull
   private final Function0<T> getInitialValue;
   @NotNull
   private final Function1<T, T> getNextValue;

   public GeneratorSequence(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
      Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
      Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
      super();
      this.getInitialValue = getInitialValue;
      this.getNextValue = getNextValue;
   }

   @NotNull
   public Iterator<T> iterator() {
      return (Iterator)(new Iterator<T>() {
         private T nextItem;
         private int nextState = -2;

         public final T getNextItem() {
            return this.nextItem;
         }

         public final void setNextItem(T <set-?>) {
            this.nextItem = var1;
         }

         public final int getNextState() {
            return this.nextState;
         }

         public final void setNextState(int <set-?>) {
            this.nextState = var1;
         }

         private final void calcNext() {
            Object var10001;
            if (this.nextState == -2) {
               var10001 = GeneratorSequence.this.getInitialValue.invoke();
            } else {
               Function1 var1 = GeneratorSequence.this.getNextValue;
               Object var10002 = this.nextItem;
               Intrinsics.checkNotNull(var10002);
               var10001 = var1.invoke(var10002);
            }

            this.nextItem = var10001;
            this.nextState = this.nextItem == null ? 0 : 1;
         }

         public T next() {
            if (this.nextState < 0) {
               this.calcNext();
            }

            if (this.nextState == 0) {
               throw new NoSuchElementException();
            } else {
               Object var10000 = this.nextItem;
               Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
               Object result = var10000;
               this.nextState = -1;
               return result;
            }
         }

         public boolean hasNext() {
            if (this.nextState < 0) {
               this.calcNext();
            }

            return this.nextState == 1;
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
