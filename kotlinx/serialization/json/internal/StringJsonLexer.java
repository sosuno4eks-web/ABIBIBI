package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StringJsonLexer extends AbstractJsonLexer {
   @NotNull
   private final String source;

   public StringJsonLexer(@NotNull String source) {
      Intrinsics.checkNotNullParameter(source, "source");
      super();
      this.source = source;
   }

   @NotNull
   protected String getSource() {
      return this.source;
   }

   public int prefetchOrEof(int position) {
      return position < this.getSource().length() ? position : -1;
   }

   public byte consumeNextToken() {
      String source = this.getSource();
      int cpos = this.currentPosition;

      while(cpos != -1 && cpos < source.length()) {
         char c = source.charAt(cpos++);
         AbstractJsonLexer var4 = (AbstractJsonLexer)this;
         int $i$f$isWs = false;
         if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
            this.currentPosition = cpos;
            return AbstractJsonLexerKt.charToTokenClass(c);
         }
      }

      this.currentPosition = source.length();
      return 10;
   }

   public boolean canConsumeValue() {
      int current = this.currentPosition;
      if (current == -1) {
         return false;
      } else {
         for(String source = this.getSource(); current < source.length(); ++current) {
            char c = source.charAt(current);
            AbstractJsonLexer var4 = (AbstractJsonLexer)this;
            int $i$f$isWs = false;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
               this.currentPosition = current;
               return this.isValidValueStart(c);
            }
         }

         this.currentPosition = current;
         return false;
      }
   }

   public int skipWhitespaces() {
      int current = this.currentPosition;
      if (current == -1) {
         return current;
      } else {
         for(String source = this.getSource(); current < source.length(); ++current) {
            char c = source.charAt(current);
            AbstractJsonLexer var4 = (AbstractJsonLexer)this;
            int $i$f$isWs = false;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
               break;
            }
         }

         this.currentPosition = current;
         return current;
      }
   }

   public void consumeNextToken(char expected) {
      if (this.currentPosition == -1) {
         this.unexpectedToken(expected);
      }

      String source = this.getSource();
      int cpos = this.currentPosition;

      while(cpos < source.length()) {
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

      this.currentPosition = -1;
      this.unexpectedToken(expected);
   }

   @NotNull
   public String consumeKeyString() {
      this.consumeNextToken('"');
      int current = this.currentPosition;
      int closingQuote = StringsKt.indexOf$default((CharSequence)this.getSource(), '"', current, false, 4, (Object)null);
      if (closingQuote != -1) {
         for(int i = current; i < closingQuote; ++i) {
            if (this.getSource().charAt(i) == '\\') {
               return this.consumeString((CharSequence)this.getSource(), this.currentPosition, i);
            }
         }

         this.currentPosition = closingQuote + 1;
         String var10000 = this.getSource().substring(current, closingQuote);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         return var10000;
      } else {
         this.consumeStringLenient();
         AbstractJsonLexer $this$iv = (AbstractJsonLexer)this;
         byte expectedToken$iv = 1;
         boolean wasConsumed$iv = false;
         int $i$f$fail$kotlinx_serialization_json = false;
         String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
         int position$iv = $this$iv.currentPosition;
         String s$iv = $this$iv.currentPosition != AbstractJsonLexer.access$getSource($this$iv).length() && position$iv >= 0 ? String.valueOf(AbstractJsonLexer.access$getSource($this$iv).charAt(position$iv)) : "EOF";
         int var12 = false;
         AbstractJsonLexer.fail$default($this$iv, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, (String)null, 4, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) {
      Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
      Iterable $this$forEach$iv = (Iterable)StringsKt.chunked((CharSequence)(isLenient ? this.consumeStringLenient() : this.consumeString()), 16384);
      int $i$f$forEach = false;
      Iterator var5 = $this$forEach$iv.iterator();

      while(var5.hasNext()) {
         Object element$iv = var5.next();
         consumeChunk.invoke(element$iv);
      }

   }

   @Nullable
   public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
      Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
      int positionSnapshot = this.currentPosition;

      String var5;
      try {
         String firstKey;
         if (this.consumeNextToken() != 6) {
            firstKey = null;
            return firstKey;
         }

         firstKey = this.peekString(isLenient);
         if (Intrinsics.areEqual((Object)firstKey, (Object)keyToMatch)) {
            this.discardPeeked();
            if (this.consumeNextToken() != 5) {
               var5 = null;
               return var5;
            }

            var5 = this.peekString(isLenient);
            return var5;
         }

         var5 = null;
      } finally {
         this.currentPosition = positionSnapshot;
         this.discardPeeked();
      }

      return var5;
   }
}
