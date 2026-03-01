package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ReaderJsonLexer extends AbstractJsonLexer {
   @NotNull
   private final InternalJsonReader reader;
   @NotNull
   private final char[] buffer;
   @JvmField
   protected int threshold;
   @NotNull
   private final ArrayAsSequence source;

   public ReaderJsonLexer(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
      Intrinsics.checkNotNullParameter(reader, "reader");
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      super();
      this.reader = reader;
      this.buffer = buffer;
      this.threshold = 128;
      this.source = new ArrayAsSequence(this.buffer);
      this.preload(0);
   }

   // $FF: synthetic method
   public ReaderJsonLexer(InternalJsonReader var1, char[] var2, int var3, DefaultConstructorMarker var4) {
      if ((var3 & 2) != 0) {
         var2 = CharArrayPoolBatchSize.INSTANCE.take();
      }

      this(var1, var2);
   }

   @NotNull
   public final InternalJsonReader getReader() {
      return this.reader;
   }

   @NotNull
   public final char[] getBuffer() {
      return this.buffer;
   }

   @NotNull
   protected ArrayAsSequence getSource() {
      return this.source;
   }

   public boolean canConsumeValue() {
      this.ensureHaveChars();
      int current = this.currentPosition;

      while(true) {
         current = this.prefetchOrEof(current);
         if (current == -1) {
            this.currentPosition = current;
            return false;
         }

         char c = this.getSource().charAt(current);
         AbstractJsonLexer var3 = (AbstractJsonLexer)this;
         int $i$f$isWs = false;
         if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
            this.currentPosition = current;
            return this.isValidValueStart(c);
         }

         ++current;
      }
   }

   private final void preload(int unprocessedCount) {
      char[] buffer = this.getSource().getBuffer$kotlinx_serialization_json();
      if (unprocessedCount != 0) {
         ArraysKt.copyInto(buffer, buffer, 0, this.currentPosition, this.currentPosition + unprocessedCount);
      }

      int filledCount = unprocessedCount;

      int actual;
      for(int sizeTotal = this.getSource().length(); filledCount != sizeTotal; filledCount += actual) {
         actual = this.reader.read(buffer, filledCount, sizeTotal - filledCount);
         if (actual == -1) {
            this.getSource().trim(filledCount);
            this.threshold = -1;
            break;
         }
      }

      this.currentPosition = 0;
   }

   public int prefetchOrEof(int position) {
      if (position < this.getSource().length()) {
         return position;
      } else {
         this.currentPosition = position;
         this.ensureHaveChars();
         return this.currentPosition == 0 && ((CharSequence)this.getSource()).length() != 0 ? 0 : -1;
      }
   }

   public byte consumeNextToken() {
      this.ensureHaveChars();
      ArrayAsSequence source = this.getSource();
      int cpos = this.currentPosition;

      byte tc;
      do {
         cpos = this.prefetchOrEof(cpos);
         if (cpos == -1) {
            this.currentPosition = cpos;
            return 10;
         }

         char ch = source.charAt(cpos++);
         tc = AbstractJsonLexerKt.charToTokenClass(ch);
      } while(tc == 3);

      this.currentPosition = cpos;
      return tc;
   }

   public void consumeNextToken(char expected) {
      this.ensureHaveChars();
      ArrayAsSequence source = this.getSource();
      int cpos = this.currentPosition;

      while(true) {
         cpos = this.prefetchOrEof(cpos);
         if (cpos == -1) {
            this.currentPosition = cpos;
            this.unexpectedToken(expected);
            return;
         }

         char c = source.charAt(cpos++);
         AbstractJsonLexer var5 = (AbstractJsonLexer)this;
         int $i$f$isWs = false;
         if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
            this.currentPosition = cpos;
            if (c == expected) {
               return;
            }

            this.unexpectedToken(expected);
         }
      }
   }

   public int skipWhitespaces() {
      int current = this.currentPosition;

      while(true) {
         current = this.prefetchOrEof(current);
         if (current == -1) {
            break;
         }

         char c = this.getSource().charAt(current);
         AbstractJsonLexer var3 = (AbstractJsonLexer)this;
         int $i$f$isWs = false;
         if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
            break;
         }

         ++current;
      }

      this.currentPosition = current;
      return current;
   }

   public void ensureHaveChars() {
      int cur = this.currentPosition;
      int oldSize = this.getSource().length();
      int spaceLeft = oldSize - cur;
      if (spaceLeft <= this.threshold) {
         this.preload(spaceLeft);
      }
   }

   @NotNull
   public String consumeKeyString() {
      this.consumeNextToken('"');
      int current = this.currentPosition;
      int closingQuote = this.indexOf('"', current);
      if (closingQuote == -1) {
         current = this.prefetchOrEof(current);
         if (current != -1) {
            return this.consumeString((CharSequence)this.getSource(), this.currentPosition, current);
         } else {
            AbstractJsonLexer $this$iv = (AbstractJsonLexer)this;
            byte expectedToken$iv = 1;
            boolean wasConsumed$iv = true;
            int $i$f$fail$kotlinx_serialization_json = false;
            String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
            int position$iv = $this$iv.currentPosition - 1;
            String s$iv = $this$iv.currentPosition != AbstractJsonLexer.access$getSource($this$iv).length() && position$iv >= 0 ? String.valueOf(AbstractJsonLexer.access$getSource($this$iv).charAt(position$iv)) : "EOF";
            int var12 = false;
            AbstractJsonLexer.fail$default($this$iv, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, (String)null, 4, (Object)null);
            throw new KotlinNothingValueException();
         }
      } else {
         for(int i = current; i < closingQuote; ++i) {
            if (this.getSource().charAt(i) == '\\') {
               return this.consumeString((CharSequence)this.getSource(), this.currentPosition, i);
            }
         }

         this.currentPosition = closingQuote + 1;
         return this.substring(current, closingQuote);
      }
   }

   public int indexOf(char char, int startPos) {
      ArrayAsSequence src = this.getSource();
      int i = startPos;

      for(int var5 = src.length(); i < var5; ++i) {
         if (src.charAt(i) == var1) {
            return i;
         }
      }

      return -1;
   }

   @NotNull
   public String substring(int startPos, int endPos) {
      return this.getSource().substring(startPos, endPos);
   }

   protected void appendRange(int fromIndex, int toIndex) {
      StringBuilder var3 = this.getEscapedString();
      Intrinsics.checkNotNullExpressionValue(var3.append(this.getSource().getBuffer$kotlinx_serialization_json(), fromIndex, toIndex - fromIndex), "append(...)");
   }

   @Nullable
   public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
      Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
      return null;
   }

   public final void release() {
      CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
   }
}
