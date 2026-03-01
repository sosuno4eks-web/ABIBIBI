package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class StringJsonLexerWithComments extends StringJsonLexer {
   public StringJsonLexerWithComments(@NotNull String source) {
      Intrinsics.checkNotNullParameter(source, "source");
      super(source);
   }

   public byte consumeNextToken() {
      String source = this.getSource();
      int cpos = this.skipWhitespaces();
      if (cpos < source.length() && cpos != -1) {
         this.currentPosition = cpos + 1;
         return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
      } else {
         return 10;
      }
   }

   public boolean canConsumeValue() {
      int current = this.skipWhitespaces();
      return current < this.getSource().length() && current != -1 ? this.isValidValueStart(this.getSource().charAt(current)) : false;
   }

   public void consumeNextToken(char expected) {
      String source = this.getSource();
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

   public byte peekNextToken() {
      String source = this.getSource();
      int cpos = this.skipWhitespaces();
      if (cpos < source.length() && cpos != -1) {
         this.currentPosition = cpos;
         return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
      } else {
         return 10;
      }
   }

   public int skipWhitespaces() {
      int current = this.currentPosition;
      if (current == -1) {
         return current;
      } else {
         String source = this.getSource();

         while(current < source.length()) {
            char c = source.charAt(current);
            AbstractJsonLexer var4 = (AbstractJsonLexer)this;
            int $i$f$isWs = false;
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
               ++current;
            } else {
               if (c == '/' && current + 1 < source.length()) {
                  switch(source.charAt(current + 1)) {
                  case '*':
                     current = StringsKt.indexOf$default((CharSequence)source, "*/", current + 2, false, 4, (Object)null);
                     if (current == -1) {
                        this.currentPosition = source.length();
                        AbstractJsonLexer.fail$default((AbstractJsonLexer)this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String)null, 6, (Object)null);
                        throw new KotlinNothingValueException();
                     }

                     current += 2;
                     continue;
                  case '/':
                     current = StringsKt.indexOf$default((CharSequence)source, '\n', current + 2, false, 4, (Object)null);
                     if (current == -1) {
                        current = source.length();
                     } else {
                        ++current;
                     }
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
}
