package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

final class LinesSequence implements Sequence<String> {
   @NotNull
   private final BufferedReader reader;

   public LinesSequence(@NotNull BufferedReader reader) {
      Intrinsics.checkNotNullParameter(reader, "reader");
      super();
      this.reader = reader;
   }

   @NotNull
   public Iterator<String> iterator() {
      return (Iterator)(new Iterator<String>() {
         private String nextValue;
         private boolean done;

         public boolean hasNext() {
            if (this.nextValue == null && !this.done) {
               this.nextValue = LinesSequence.this.reader.readLine();
               if (this.nextValue == null) {
                  this.done = true;
               }
            }

            return this.nextValue != null;
         }

         public String next() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               String answer = this.nextValue;
               this.nextValue = null;
               Intrinsics.checkNotNull(answer);
               return answer;
            }
         }

         public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
         }
      });
   }
}
