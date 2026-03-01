package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

final class LinesIterator implements Iterator<String>, KMappedMarker {
   @NotNull
   private static final LinesIterator.State State = new LinesIterator.State((DefaultConstructorMarker)null);
   @NotNull
   private final CharSequence string;
   private int state;
   private int tokenStartIndex;
   private int delimiterStartIndex;
   private int delimiterLength;
   /** @deprecated */
   @Deprecated
   public static final int UNKNOWN = 0;
   /** @deprecated */
   @Deprecated
   public static final int HAS_NEXT = 1;
   /** @deprecated */
   @Deprecated
   public static final int EXHAUSTED = 2;

   public LinesIterator(@NotNull CharSequence string) {
      Intrinsics.checkNotNullParameter(string, "string");
      super();
      this.string = string;
   }

   public boolean hasNext() {
      if (this.state != 0) {
         return this.state == 1;
      } else if (this.delimiterLength < 0) {
         this.state = 2;
         return false;
      } else {
         int _delimiterLength = -1;
         int _delimiterStartIndex = this.string.length();
         int idx = this.tokenStartIndex;
         int var4 = this.string.length();

         label38:
         while(idx < var4) {
            char c = this.string.charAt(idx);
            switch(c) {
            case '\n':
            case '\r':
               _delimiterLength = c == '\r' && idx + 1 < this.string.length() && this.string.charAt(idx + 1) == '\n' ? 2 : 1;
               _delimiterStartIndex = idx;
               break label38;
            case '\u000b':
            case '\f':
            default:
               ++idx;
            }
         }

         this.state = 1;
         this.delimiterLength = _delimiterLength;
         this.delimiterStartIndex = _delimiterStartIndex;
         return true;
      }
   }

   @NotNull
   public String next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         this.state = 0;
         int lastIndex = this.delimiterStartIndex;
         int firstIndex = this.tokenStartIndex;
         this.tokenStartIndex = this.delimiterStartIndex + this.delimiterLength;
         return this.string.subSequence(firstIndex, lastIndex).toString();
      }
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   private static final class State {
      private State() {
      }

      // $FF: synthetic method
      public State(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
