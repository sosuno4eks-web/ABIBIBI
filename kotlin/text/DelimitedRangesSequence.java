package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

final class DelimitedRangesSequence implements Sequence<IntRange> {
   @NotNull
   private final CharSequence input;
   private final int startIndex;
   private final int limit;
   @NotNull
   private final Function2<CharSequence, Integer, Pair<Integer, Integer>> getNextMatch;

   public DelimitedRangesSequence(@NotNull CharSequence input, int startIndex, int limit, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
      Intrinsics.checkNotNullParameter(input, "input");
      Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
      super();
      this.input = input;
      this.startIndex = startIndex;
      this.limit = limit;
      this.getNextMatch = getNextMatch;
   }

   @NotNull
   public Iterator<IntRange> iterator() {
      return (Iterator)(new Iterator<IntRange>() {
         private int nextState = -1;
         private int currentStartIndex;
         private int nextSearchIndex;
         private IntRange nextItem;
         private int counter;

         {
            this.currentStartIndex = RangesKt.coerceIn(DelimitedRangesSequence.this.startIndex, 0, DelimitedRangesSequence.this.input.length());
            this.nextSearchIndex = this.currentStartIndex;
         }

         public final int getNextState() {
            return this.nextState;
         }

         public final void setNextState(int <set-?>) {
            this.nextState = var1;
         }

         public final int getCurrentStartIndex() {
            return this.currentStartIndex;
         }

         public final void setCurrentStartIndex(int <set-?>) {
            this.currentStartIndex = var1;
         }

         public final int getNextSearchIndex() {
            return this.nextSearchIndex;
         }

         public final void setNextSearchIndex(int <set-?>) {
            this.nextSearchIndex = var1;
         }

         public final IntRange getNextItem() {
            return this.nextItem;
         }

         public final void setNextItem(IntRange <set-?>) {
            this.nextItem = var1;
         }

         public final int getCounter() {
            return this.counter;
         }

         public final void setCounter(int <set-?>) {
            this.counter = var1;
         }

         private final void calcNext() {
            if (this.nextSearchIndex < 0) {
               this.nextState = 0;
               this.nextItem = null;
            } else {
               label27: {
                  label26: {
                     if (DelimitedRangesSequence.this.limit > 0) {
                        ++this.counter;
                        if (this.counter >= DelimitedRangesSequence.this.limit) {
                           break label26;
                        }
                     }

                     if (this.nextSearchIndex <= DelimitedRangesSequence.this.input.length()) {
                        Pair match = (Pair)DelimitedRangesSequence.this.getNextMatch.invoke(DelimitedRangesSequence.this.input, this.nextSearchIndex);
                        if (match == null) {
                           this.nextItem = new IntRange(this.currentStartIndex, StringsKt.getLastIndex(DelimitedRangesSequence.this.input));
                           this.nextSearchIndex = -1;
                        } else {
                           int index = ((Number)match.component1()).intValue();
                           int length = ((Number)match.component2()).intValue();
                           this.nextItem = RangesKt.until(this.currentStartIndex, index);
                           this.currentStartIndex = index + length;
                           this.nextSearchIndex = this.currentStartIndex + (length == 0 ? 1 : 0);
                        }
                        break label27;
                     }
                  }

                  this.nextItem = new IntRange(this.currentStartIndex, StringsKt.getLastIndex(DelimitedRangesSequence.this.input));
                  this.nextSearchIndex = -1;
               }

               this.nextState = 1;
            }

         }

         public IntRange next() {
            if (this.nextState == -1) {
               this.calcNext();
            }

            if (this.nextState == 0) {
               throw new NoSuchElementException();
            } else {
               IntRange var10000 = this.nextItem;
               Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.ranges.IntRange");
               IntRange result = var10000;
               this.nextItem = null;
               this.nextState = -1;
               return result;
            }
         }

         public boolean hasNext() {
            if (this.nextState == -1) {
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
