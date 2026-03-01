package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
   public ReaderJsonLexerWithComments(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
      Intrinsics.checkNotNullParameter(reader, "reader");
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      super(reader, buffer);
   }

   public void consumeNextToken(char expected) {
      this.ensureHaveChars();
      ArrayAsSequence source = this.getSource();
      int current = this.skipWhitespaces();
      if (current >= source.length() || current == -1) {
         this.currentPosition = -1;
         this.unexpectedToken(expected);
      }

      char c = source.charAt(current);
      this.currentPosition = current + 1;
      if (c != expected) {
         this.unexpectedToken(expected);
      }
   }

   public boolean canConsumeValue() {
      this.ensureHaveChars();
      int current = this.skipWhitespaces();
      return current < this.getSource().length() && current != -1 ? this.isValidValueStart(this.getSource().charAt(current)) : false;
   }

   public byte consumeNextToken() {
      this.ensureHaveChars();
      ArrayAsSequence source = this.getSource();
      int cpos = this.skipWhitespaces();
      if (cpos < source.length() && cpos != -1) {
         this.currentPosition = cpos + 1;
         return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
      } else {
         return 10;
      }
   }

   public byte peekNextToken() {
      this.ensureHaveChars();
      ArrayAsSequence source = this.getSource();
      int cpos = this.skipWhitespaces();
      if (cpos < source.length() && cpos != -1) {
         this.currentPosition = cpos;
         return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
      } else {
         return 10;
      }
   }

   private final Pair<Integer, Boolean> handleComment(int position) {
      int current = position;
      int startIndex = position + 2;
      switch(this.getSource().charAt(position + 1)) {
      case '*':
         boolean rareCaseHit = false;

         while(current != -1) {
            current = StringsKt.indexOf$default((CharSequence)this.getSource(), "*/", startIndex, false, 4, (Object)null);
            if (current != -1) {
               return TuplesKt.to(current + 2, true);
            }

            if (this.getSource().charAt(this.getSource().length() - 1) != '*') {
               current = this.prefetchOrEof(this.getSource().length());
               startIndex = current;
            } else {
               current = this.prefetchWithinThreshold(this.getSource().length() - 1);
               if (rareCaseHit) {
                  break;
               }

               rareCaseHit = true;
               startIndex = current;
            }
         }

         this.currentPosition = this.getSource().length();
         AbstractJsonLexer.fail$default((AbstractJsonLexer)this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      case '/':
         while(current != -1) {
            current = StringsKt.indexOf$default((CharSequence)this.getSource(), '\n', startIndex, false, 4, (Object)null);
            if (current != -1) {
               return TuplesKt.to(current + 1, true);
            }

            current = this.prefetchOrEof(this.getSource().length());
            startIndex = current;
         }

         return TuplesKt.to(-1, true);
      default:
         return TuplesKt.to(position, false);
      }
   }

   private final int prefetchWithinThreshold(int position) {
      if (this.getSource().length() - position > this.threshold) {
         return position;
      } else {
         this.currentPosition = position;
         this.ensureHaveChars();
         return this.currentPosition == 0 && ((CharSequence)this.getSource()).length() != 0 ? 0 : -1;
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
         int cont = false;
         if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
            ++current;
         } else {
            if (c == '/' && current + 1 < this.getSource().length()) {
               Pair var6 = this.handleComment(current);
               int var4 = ((Number)var6.component1()).intValue();
               cont = (Boolean)var6.component2();
               current = var4;
               if (cont) {
                  continue;
               }
            }
            break;
         }
      }

      this.currentPosition = current;
      return current;
   }
}
