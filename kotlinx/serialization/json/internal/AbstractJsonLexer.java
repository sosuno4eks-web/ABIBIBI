package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractJsonLexer {
   @JvmField
   public int currentPosition;
   @JvmField
   @NotNull
   public final JsonPath path = new JsonPath();
   @Nullable
   private String peekedString;
   @NotNull
   private StringBuilder escapedString = new StringBuilder();

   @NotNull
   protected abstract CharSequence getSource();

   protected final boolean isWs(char $this$isWs) {
      int $i$f$isWs = false;
      return $this$isWs == ' ' || $this$isWs == '\n' || $this$isWs == '\r' || $this$isWs == '\t';
   }

   public void ensureHaveChars() {
   }

   public final boolean isNotEof() {
      return this.peekNextToken() != 10;
   }

   public abstract int prefetchOrEof(int var1);

   public abstract boolean canConsumeValue();

   public abstract byte consumeNextToken();

   public final boolean tryConsumeComma() {
      int current = this.skipWhitespaces();
      CharSequence source = this.getSource();
      if (current < source.length() && current != -1) {
         if (source.charAt(current) == ',') {
            ++this.currentPosition;
            int var10000 = this.currentPosition;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected final boolean isValidValueStart(char c) {
      boolean var10000;
      switch(c) {
      case ',':
      case ':':
      case ']':
      case '}':
         var10000 = false;
         break;
      default:
         var10000 = true;
      }

      return var10000;
   }

   public final void expectEof() {
      byte nextToken = this.consumeNextToken();
      if (nextToken != 10) {
         fail$default(this, "Expected EOF after parsing, but had " + this.getSource().charAt(this.currentPosition - 1) + " instead", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   @NotNull
   protected final StringBuilder getEscapedString() {
      return this.escapedString;
   }

   protected final void setEscapedString(@NotNull StringBuilder <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.escapedString = var1;
   }

   public final byte consumeNextToken(byte expected) {
      byte token = this.consumeNextToken();
      if (token == expected) {
         return token;
      } else {
         boolean wasConsumed$iv = true;
         int $i$f$fail$kotlinx_serialization_json = false;
         String expected$iv = AbstractJsonLexerKt.tokenDescription(expected);
         int position$iv = this.currentPosition - 1;
         String s$iv = this.currentPosition != access$getSource(this).length() && position$iv >= 0 ? String.valueOf(access$getSource(this).charAt(position$iv)) : "EOF";
         int var12 = false;
         fail$default(this, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, (String)null, 4, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public abstract void consumeNextToken(char var1);

   protected final void unexpectedToken(char expected) {
      boolean wasConsumed$iv;
      boolean $i$f$fail$kotlinx_serialization_json;
      if (this.currentPosition > 0 && expected == '"') {
         wasConsumed$iv = false;
         int snapshot$iv = this.currentPosition;

         String var16;
         try {
            $i$f$fail$kotlinx_serialization_json = false;
            int var7 = this.currentPosition;
            this.currentPosition = var7 + -1;
            var16 = this.consumeStringLenient();
         } finally {
            this.currentPosition = snapshot$iv;
         }

         if (Intrinsics.areEqual((Object)var16, (Object)"null")) {
            this.fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
            throw new KotlinNothingValueException();
         }
      }

      byte expectedToken$iv = AbstractJsonLexerKt.charToTokenClass(expected);
      wasConsumed$iv = true;
      $i$f$fail$kotlinx_serialization_json = false;
      String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
      int position$iv = this.currentPosition - 1;
      String s$iv = this.currentPosition != access$getSource(this).length() && position$iv >= 0 ? String.valueOf(access$getSource(this).charAt(position$iv)) : "EOF";
      int var12 = false;
      fail$default(this, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, (String)null, 4, (Object)null);
      throw new KotlinNothingValueException();
   }

   @NotNull
   public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed, @NotNull Function2<? super String, ? super String, String> message) {
      Intrinsics.checkNotNullParameter(message, "message");
      int $i$f$fail$kotlinx_serialization_json = false;
      String expected = AbstractJsonLexerKt.tokenDescription(expectedToken);
      int position = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
      String s = this.currentPosition != access$getSource(this).length() && position >= 0 ? String.valueOf(access$getSource(this).charAt(position)) : "EOF";
      fail$default(this, (String)message.invoke(expected, s), position, (String)null, 4, (Object)null);
      throw new KotlinNothingValueException();
   }

   // $FF: synthetic method
   public static Void fail$kotlinx_serialization_json$default(AbstractJsonLexer $this, byte expectedToken, boolean wasConsumed, Function2 message, int $i$f$fail$kotlinx_serialization_json, Object expected) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
      } else {
         if ((var4 & 2) != 0) {
            wasConsumed = true;
         }

         if ((var4 & 4) != 0) {
            message = (Function2)null.INSTANCE;
         }

         Intrinsics.checkNotNullParameter(message, "message");
         int $i$f$fail$kotlinx_serialization_json = false;
         String expected = AbstractJsonLexerKt.tokenDescription(expectedToken);
         int position = wasConsumed ? $this.currentPosition - 1 : $this.currentPosition;
         String s = $this.currentPosition != access$getSource($this).length() && position >= 0 ? String.valueOf(access$getSource($this).charAt(position)) : "EOF";
         fail$default($this, (String)message.invoke(expected, s), position, (String)null, 4, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public byte peekNextToken() {
      CharSequence source = this.getSource();
      int cpos = this.currentPosition;

      while(true) {
         cpos = this.prefetchOrEof(cpos);
         if (cpos == -1) {
            this.currentPosition = cpos;
            return 10;
         }

         char ch = source.charAt(cpos);
         switch(ch) {
         case '\t':
         case '\n':
         case '\r':
         case ' ':
            ++cpos;
            break;
         default:
            this.currentPosition = cpos;
            return AbstractJsonLexerKt.charToTokenClass(ch);
         }
      }
   }

   public final boolean tryConsumeNull(boolean doConsume) {
      int current = this.skipWhitespaces();
      current = this.prefetchOrEof(current);
      int len = this.getSource().length() - current;
      if (len >= 4 && current != -1) {
         for(int i = 0; i < 4; ++i) {
            if ("null".charAt(i) != this.getSource().charAt(current + i)) {
               return false;
            }
         }

         if (len > 4 && AbstractJsonLexerKt.charToTokenClass(this.getSource().charAt(current + 4)) == 0) {
            return false;
         } else {
            if (doConsume) {
               this.currentPosition = current + 4;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   public static boolean tryConsumeNull$default(AbstractJsonLexer var0, boolean var1, int var2, Object var3) {
      if (var3 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
      } else {
         if ((var2 & 1) != 0) {
            var1 = true;
         }

         return var0.tryConsumeNull(var1);
      }
   }

   public abstract int skipWhitespaces();

   @Nullable
   public abstract String peekLeadingMatchingValue(@NotNull String var1, boolean var2);

   @Nullable
   public final String peekString(boolean isLenient) {
      byte token = this.peekNextToken();
      String var10000;
      if (isLenient) {
         if (token != 1 && token != 0) {
            return null;
         }

         var10000 = this.consumeStringLenient();
      } else {
         if (token != 1) {
            return null;
         }

         var10000 = this.consumeString();
      }

      String string = var10000;
      this.peekedString = string;
      return string;
   }

   public final void discardPeeked() {
      this.peekedString = null;
   }

   public int indexOf(char char, int startPos) {
      return StringsKt.indexOf$default(this.getSource(), var1, startPos, false, 4, (Object)null);
   }

   @NotNull
   public String substring(int startPos, int endPos) {
      return this.getSource().subSequence(startPos, endPos).toString();
   }

   @NotNull
   public abstract String consumeKeyString();

   private final boolean insideString(boolean isLenient, char char) {
      return isLenient ? AbstractJsonLexerKt.charToTokenClass(var2) == 0 : var2 != '"';
   }

   public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) {
      Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
      byte nextToken = this.peekNextToken();
      if (!isLenient || nextToken == 0) {
         if (!isLenient) {
            this.consumeNextToken('"');
         }

         int currentPosition = this.currentPosition;
         int lastPosition = currentPosition;
         char var6 = this.getSource().charAt(currentPosition);

         boolean usedAppend;
         for(usedAppend = false; this.insideString(isLenient, var6); var6 = this.getSource().charAt(currentPosition)) {
            if (!isLenient && var6 == '\\') {
               usedAppend = true;
               currentPosition = this.prefetchOrEof(this.appendEscape(lastPosition, currentPosition));
               lastPosition = currentPosition;
            } else {
               ++currentPosition;
            }

            if (currentPosition >= this.getSource().length()) {
               this.writeRange(lastPosition, currentPosition, usedAppend, consumeChunk);
               usedAppend = false;
               currentPosition = this.prefetchOrEof(currentPosition);
               if (currentPosition == -1) {
                  fail$default(this, "EOF", currentPosition, (String)null, 4, (Object)null);
                  throw new KotlinNothingValueException();
               }

               lastPosition = currentPosition;
            }
         }

         this.writeRange(lastPosition, currentPosition, usedAppend, consumeChunk);
         this.currentPosition = currentPosition;
         if (!isLenient) {
            this.consumeNextToken('"');
         }

      }
   }

   private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, Function1<? super String, Unit> consumeChunk) {
      if (currentChunkHasEscape) {
         consumeChunk.invoke(this.decodedString(fromIndex, toIndex));
      } else {
         consumeChunk.invoke(this.substring(fromIndex, toIndex));
      }

   }

   @NotNull
   public final String consumeString() {
      return this.peekedString != null ? this.takePeeked() : this.consumeKeyString();
   }

   @NotNull
   protected final String consumeString(@NotNull CharSequence source, int startPosition, int current) {
      Intrinsics.checkNotNullParameter(source, "source");
      int currentPosition = current;
      int lastPosition = startPosition;
      char var6 = source.charAt(current);

      boolean usedAppend;
      for(usedAppend = false; var6 != '"'; var6 = source.charAt(currentPosition)) {
         if (var6 == '\\') {
            usedAppend = true;
            currentPosition = this.prefetchOrEof(this.appendEscape(lastPosition, currentPosition));
            if (currentPosition == -1) {
               fail$default(this, "Unexpected EOF", currentPosition, (String)null, 4, (Object)null);
               throw new KotlinNothingValueException();
            }

            lastPosition = currentPosition;
         } else {
            ++currentPosition;
            if (currentPosition >= source.length()) {
               usedAppend = true;
               this.appendRange(lastPosition, currentPosition);
               currentPosition = this.prefetchOrEof(currentPosition);
               if (currentPosition == -1) {
                  fail$default(this, "Unexpected EOF", currentPosition, (String)null, 4, (Object)null);
                  throw new KotlinNothingValueException();
               }

               lastPosition = currentPosition;
            }
         }
      }

      String string = !usedAppend ? this.substring(lastPosition, currentPosition) : this.decodedString(lastPosition, currentPosition);
      this.currentPosition = currentPosition + 1;
      return string;
   }

   private final int appendEscape(int lastPosition, int current) {
      this.appendRange(lastPosition, current);
      return this.appendEsc(current + 1);
   }

   private final String decodedString(int lastPosition, int currentPosition) {
      this.appendRange(lastPosition, currentPosition);
      String var10000 = this.escapedString.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String result = var10000;
      this.escapedString.setLength(0);
      return result;
   }

   private final String takePeeked() {
      String var10000 = this.peekedString;
      Intrinsics.checkNotNull(var10000);
      String var1 = var10000;
      int var3 = false;
      this.peekedString = null;
      return var1;
   }

   @NotNull
   public final String consumeStringLenientNotNull() {
      String result = this.consumeStringLenient();
      if (Intrinsics.areEqual((Object)result, (Object)"null") && this.wasUnquotedString()) {
         fail$default(this, "Unexpected 'null' value instead of string literal", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         return result;
      }
   }

   private final boolean wasUnquotedString() {
      return this.getSource().charAt(this.currentPosition - 1) != '"';
   }

   @NotNull
   public final String consumeStringLenient() {
      if (this.peekedString != null) {
         return this.takePeeked();
      } else {
         int current = this.skipWhitespaces();
         if (current < this.getSource().length() && current != -1) {
            byte token = AbstractJsonLexerKt.charToTokenClass(this.getSource().charAt(current));
            if (token == 1) {
               return this.consumeString();
            } else if (token != 0) {
               fail$default(this, "Expected beginning of the string, but got " + this.getSource().charAt(current), 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            } else {
               boolean usedAppend = false;

               while(AbstractJsonLexerKt.charToTokenClass(this.getSource().charAt(current)) == 0) {
                  ++current;
                  if (current >= this.getSource().length()) {
                     usedAppend = true;
                     this.appendRange(this.currentPosition, current);
                     int eof = this.prefetchOrEof(current);
                     if (eof == -1) {
                        this.currentPosition = current;
                        return this.decodedString(0, 0);
                     }

                     current = eof;
                  }
               }

               String result = !usedAppend ? this.substring(this.currentPosition, current) : this.decodedString(this.currentPosition, current);
               this.currentPosition = current;
               return result;
            }
         } else {
            fail$default(this, "EOF", current, (String)null, 4, (Object)null);
            throw new KotlinNothingValueException();
         }
      }
   }

   protected void appendRange(int fromIndex, int toIndex) {
      this.escapedString.append(this.getSource(), fromIndex, toIndex);
   }

   private final int appendEsc(int startPosition) {
      int currentPosition = this.prefetchOrEof(startPosition);
      if (currentPosition == -1) {
         fail$default(this, "Expected escape sequence to continue, got EOF", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         char currentChar = this.getSource().charAt(currentPosition++);
         if (currentChar == 'u') {
            return this.appendHex(this.getSource(), currentPosition);
         } else {
            char c = AbstractJsonLexerKt.escapeToChar(currentChar);
            if (c == 0) {
               fail$default(this, "Invalid escaped char '" + currentChar + '\'', 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            } else {
               this.escapedString.append(c);
               return currentPosition;
            }
         }
      }
   }

   private final int appendHex(CharSequence source, int startPos) {
      if (startPos + 4 >= source.length()) {
         this.currentPosition = startPos;
         this.ensureHaveChars();
         if (this.currentPosition + 4 >= source.length()) {
            fail$default(this, "Unexpected EOF during unicode escape", 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         } else {
            return this.appendHex(source, this.currentPosition);
         }
      } else {
         this.escapedString.append((char)((this.fromHexChar(source, startPos) << 12) + (this.fromHexChar(source, startPos + 1) << 8) + (this.fromHexChar(source, startPos + 2) << 4) + this.fromHexChar(source, startPos + 3)));
         return startPos + 4;
      }
   }

   public final void require$kotlinx_serialization_json(boolean condition, int position, @NotNull Function0<String> message) {
      Intrinsics.checkNotNullParameter(message, "message");
      int $i$f$require$kotlinx_serialization_json = false;
      if (!condition) {
         fail$default(this, (String)message.invoke(), position, (String)null, 4, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   // $FF: synthetic method
   public static void require$kotlinx_serialization_json$default(AbstractJsonLexer $this, boolean condition, int position, Function0 message, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
      } else {
         if ((var4 & 2) != 0) {
            position = $this.currentPosition;
         }

         Intrinsics.checkNotNullParameter(message, "message");
         int $i$f$require$kotlinx_serialization_json = false;
         if (!condition) {
            fail$default($this, (String)message.invoke(), position, (String)null, 4, (Object)null);
            throw new KotlinNothingValueException();
         }
      }
   }

   private final int fromHexChar(CharSequence source, int currentPosition) {
      char character = source.charAt(currentPosition);
      int var10000;
      if ('0' <= character ? character < ':' : false) {
         var10000 = character - 48;
      } else if ('a' <= character ? character < 'g' : false) {
         var10000 = character - 97 + 10;
      } else {
         if (!('A' <= character ? character < 'G' : false)) {
            fail$default(this, "Invalid toHexChar char '" + character + "' in unicode escape", 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         }

         var10000 = character - 65 + 10;
      }

      return var10000;
   }

   public final void skipElement(boolean allowLenientStrings) {
      List tokenStack = (List)(new ArrayList());
      byte lastToken = this.peekNextToken();
      if (lastToken != 8 && lastToken != 6) {
         this.consumeStringLenient();
      } else {
         while(true) {
            while(true) {
               lastToken = this.peekNextToken();
               if (lastToken == 1) {
                  if (allowLenientStrings) {
                     this.consumeStringLenient();
                  } else {
                     this.consumeKeyString();
                  }
               } else {
                  if (lastToken != 8 && lastToken != 6) {
                     if (lastToken == 9) {
                        if (((Number)CollectionsKt.last(tokenStack)).byteValue() != 8) {
                           throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, this.getSource());
                        }

                        CollectionsKt.removeLast(tokenStack);
                     } else if (lastToken == 7) {
                        if (((Number)CollectionsKt.last(tokenStack)).byteValue() != 6) {
                           throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, this.getSource());
                        }

                        CollectionsKt.removeLast(tokenStack);
                     } else if (lastToken == 10) {
                        fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String)null, 6, (Object)null);
                        throw new KotlinNothingValueException();
                     }
                  } else {
                     tokenStack.add(lastToken);
                  }

                  this.consumeNextToken();
                  if (tokenStack.size() == 0) {
                     return;
                  }
               }
            }
         }
      }
   }

   @NotNull
   public String toString() {
      return "JsonReader(source='" + this.getSource() + "', currentPosition=" + this.currentPosition + ')';
   }

   public final void failOnUnknownKey(@NotNull String key) {
      Intrinsics.checkNotNullParameter(key, "key");
      String processed = this.substring(0, this.currentPosition);
      int lastIndexOf = StringsKt.lastIndexOf$default((CharSequence)processed, key, 0, false, 6, (Object)null);
      throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + lastIndexOf + " at path: " + this.path.getPath() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + JsonExceptionsKt.minify(this.getSource(), lastIndexOf));
   }

   @NotNull
   public final Void fail(@NotNull String message, int position, @NotNull String hint) {
      Intrinsics.checkNotNullParameter(message, "message");
      Intrinsics.checkNotNullParameter(hint, "hint");
      String hintMessage = ((CharSequence)hint).length() == 0 ? "" : '\n' + hint;
      throw JsonExceptionsKt.JsonDecodingException(position, message + " at path: " + this.path.getPath() + hintMessage, this.getSource());
   }

   // $FF: synthetic method
   public static Void fail$default(AbstractJsonLexer var0, String var1, int var2, String var3, int var4, Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
      } else {
         if ((var4 & 2) != 0) {
            var2 = var0.currentPosition;
         }

         if ((var4 & 4) != 0) {
            var3 = "";
         }

         return var0.fail(var1, var2, var3);
      }
   }

   public final long consumeNumericLiteral() {
      int current = this.skipWhitespaces();
      current = this.prefetchOrEof(current);
      if (current < this.getSource().length() && current != -1) {
         boolean var10000;
         if (this.getSource().charAt(current) == '"') {
            ++current;
            if (current == this.getSource().length()) {
               fail$default(this, "EOF", 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean hasQuotation = var10000;
         long accumulator = 0L;
         long exponentAccumulator = 0L;
         boolean isNegative = false;
         boolean isExponentPositive = false;
         boolean hasExponent = false;
         int start = current;

         while(current != this.getSource().length()) {
            char ch = this.getSource().charAt(current);
            if ((ch == 'e' || ch == 'E') && !hasExponent) {
               if (current == start) {
                  fail$default(this, "Unexpected symbol " + ch + " in numeric literal", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               isExponentPositive = true;
               hasExponent = true;
               ++current;
            } else if (ch == '-' && hasExponent) {
               if (current == start) {
                  fail$default(this, "Unexpected symbol '-' in numeric literal", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               isExponentPositive = false;
               ++current;
            } else if (ch == '+' && hasExponent) {
               if (current == start) {
                  fail$default(this, "Unexpected symbol '+' in numeric literal", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               isExponentPositive = true;
               ++current;
            } else if (ch == '-') {
               if (current != start) {
                  fail$default(this, "Unexpected symbol '-' in numeric literal", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               isNegative = true;
               ++current;
            } else {
               byte token = AbstractJsonLexerKt.charToTokenClass(ch);
               if (token != 0) {
                  break;
               }

               ++current;
               int digit = ch - 48;
               if (!(0 <= digit ? digit < 10 : false)) {
                  fail$default(this, "Unexpected symbol '" + ch + "' in numeric literal", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               if (hasExponent) {
                  exponentAccumulator = exponentAccumulator * (long)10 + (long)digit;
               } else {
                  accumulator = accumulator * (long)10 - (long)digit;
                  if (accumulator > 0L) {
                     fail$default(this, "Numeric value overflow", 0, (String)null, 6, (Object)null);
                     throw new KotlinNothingValueException();
                  }
               }
            }
         }

         boolean hasChars = current != start;
         if (start != current && (!isNegative || start != current - 1)) {
            if (hasQuotation) {
               if (!hasChars) {
                  fail$default(this, "EOF", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               if (this.getSource().charAt(current) != '"') {
                  fail$default(this, "Expected closing quotation mark", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               ++current;
            }

            this.currentPosition = current;
            if (hasExponent) {
               double doubleAccumulator = (double)accumulator * consumeNumericLiteral$calculateExponent(exponentAccumulator, isExponentPositive);
               if (doubleAccumulator > 9.223372036854776E18D || doubleAccumulator < -9.223372036854776E18D) {
                  fail$default(this, "Numeric value overflow", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               if (Math.floor(doubleAccumulator) != doubleAccumulator) {
                  fail$default(this, "Can't convert " + doubleAccumulator + " to Long", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               accumulator = (long)doubleAccumulator;
            }

            long var16;
            if (isNegative) {
               var16 = accumulator;
            } else {
               if (accumulator == Long.MIN_VALUE) {
                  fail$default(this, "Numeric value overflow", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }

               var16 = -accumulator;
            }

            return var16;
         } else {
            fail$default(this, "Expected numeric literal", 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         }
      } else {
         fail$default(this, "EOF", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public final long consumeNumericLiteralFully() {
      long result = this.consumeNumericLiteral();
      byte next = this.consumeNextToken();
      if (next == 10) {
         return result;
      } else {
         byte expectedToken$iv = 10;
         boolean wasConsumed$iv = true;
         int $i$f$fail$kotlinx_serialization_json = false;
         String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
         int position$iv = this.currentPosition - 1;
         String s$iv = this.currentPosition != access$getSource(this).length() && position$iv >= 0 ? String.valueOf(access$getSource(this).charAt(position$iv)) : "EOF";
         int var12 = false;
         fail$default(this, "Expected input to contain a single valid number, but got '" + s$iv + "' after it", position$iv, (String)null, 4, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   public final boolean consumeBoolean() {
      return this.consumeBoolean(this.skipWhitespaces());
   }

   public final boolean consumeBooleanLenient() {
      int current = this.skipWhitespaces();
      if (current == this.getSource().length()) {
         fail$default(this, "EOF", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         boolean var10000;
         if (this.getSource().charAt(current) == '"') {
            ++current;
            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean hasQuotation = var10000;
         boolean result = this.consumeBoolean(current);
         if (hasQuotation) {
            if (this.currentPosition == this.getSource().length()) {
               fail$default(this, "EOF", 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            }

            if (this.getSource().charAt(this.currentPosition) != '"') {
               fail$default(this, "Expected closing quotation mark", 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            }

            ++this.currentPosition;
            int var4 = this.currentPosition;
         }

         return result;
      }
   }

   private final boolean consumeBoolean(int start) {
      int current = this.prefetchOrEof(start);
      if (current < this.getSource().length() && current != -1) {
         boolean var3;
         switch(this.getSource().charAt(current++) | 32) {
         case 102:
            this.consumeBooleanLiteral("alse", current);
            var3 = false;
            break;
         case 116:
            this.consumeBooleanLiteral("rue", current);
            var3 = true;
            break;
         default:
            fail$default(this, "Expected valid boolean literal prefix, but had '" + this.consumeStringLenient() + '\'', 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         }

         return var3;
      } else {
         fail$default(this, "EOF", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      }
   }

   private final void consumeBooleanLiteral(String literalSuffix, int current) {
      if (this.getSource().length() - current < literalSuffix.length()) {
         fail$default(this, "Unexpected end of boolean literal", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         int i = 0;

         for(int var4 = ((CharSequence)literalSuffix).length(); i < var4; ++i) {
            char expected = literalSuffix.charAt(i);
            char actual = this.getSource().charAt(current + i);
            if (expected != (actual | 32)) {
               fail$default(this, "Expected valid boolean literal prefix, but had '" + this.consumeStringLenient() + '\'', 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            }
         }

         this.currentPosition = current + literalSuffix.length();
      }
   }

   private final <T> T withPositionRollback(Function0<? extends T> action) {
      int $i$f$withPositionRollback = false;
      int snapshot = this.currentPosition;

      Object var4;
      try {
         var4 = action.invoke();
      } finally {
         InlineMarker.finallyStart(1);
         this.currentPosition = snapshot;
         InlineMarker.finallyEnd(1);
      }

      return var4;
   }

   private static final double consumeNumericLiteral$calculateExponent(long exponentAccumulator, boolean isExponentPositive) {
      double var10000;
      if (!isExponentPositive) {
         var10000 = Math.pow(10.0D, -((double)exponentAccumulator));
      } else {
         if (!isExponentPositive) {
            throw new NoWhenBranchMatchedException();
         }

         var10000 = Math.pow(10.0D, (double)exponentAccumulator);
      }

      return var10000;
   }

   // $FF: synthetic method
   public static final CharSequence access$getSource(AbstractJsonLexer $this) {
      return $this.getSource();
   }
}
