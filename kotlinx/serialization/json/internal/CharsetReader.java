package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CharsetReader {
   @NotNull
   private final InputStream inputStream;
   @NotNull
   private final Charset charset;
   @NotNull
   private final CharsetDecoder decoder;
   @NotNull
   private final ByteBuffer byteBuffer;
   private boolean hasLeftoverPotentiallySurrogateChar;
   private char leftoverChar;

   public CharsetReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
      Intrinsics.checkNotNullParameter(inputStream, "inputStream");
      Intrinsics.checkNotNullParameter(charset, "charset");
      super();
      this.inputStream = inputStream;
      this.charset = charset;
      CharsetDecoder var10001 = this.charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
      Intrinsics.checkNotNullExpressionValue(var10001, "onUnmappableCharacter(...)");
      this.decoder = var10001;
      ByteBuffer var3 = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
      Intrinsics.checkNotNullExpressionValue(var3, "wrap(...)");
      this.byteBuffer = var3;
      this.byteBuffer.flip();
   }

   public final int read(@NotNull char[] array, int offset, int length) {
      Intrinsics.checkNotNullParameter(array, "array");
      if (length == 0) {
         return 0;
      } else if (!(0 <= offset ? offset < array.length : false) || length < 0 || offset + length > array.length) {
         int var8 = false;
         String var9 = "Unexpected arguments: " + offset + ", " + length + ", " + array.length;
         throw new IllegalArgumentException(var9.toString());
      } else {
         int offset = offset;
         int length = length;
         int bytesRead = 0;
         if (this.hasLeftoverPotentiallySurrogateChar) {
            array[offset] = this.leftoverChar;
            offset = offset + 1;
            length = length - 1;
            this.hasLeftoverPotentiallySurrogateChar = false;
            bytesRead = 1;
            if (length == 0) {
               return bytesRead;
            }
         }

         if (length == 1) {
            int c = this.oneShotReadSlowPath();
            if (c == -1) {
               return bytesRead == 0 ? -1 : bytesRead;
            } else {
               array[offset] = (char)c;
               return bytesRead + 1;
            }
         } else {
            return this.doRead(array, offset, length) + bytesRead;
         }
      }
   }

   private final int doRead(char[] array, int offset, int length) {
      CharBuffer charBuffer = CharBuffer.wrap(array, offset, length);
      if (charBuffer.position() != 0) {
         charBuffer = charBuffer.slice();
      }

      boolean isEof = false;

      while(true) {
         CoderResult cr = this.decoder.decode(this.byteBuffer, charBuffer, isEof);
         if (cr.isUnderflow()) {
            if (isEof || !charBuffer.hasRemaining()) {
               break;
            }

            int n = this.fillByteBuffer();
            if (n < 0) {
               isEof = true;
               if (charBuffer.position() == 0 && !this.byteBuffer.hasRemaining()) {
                  break;
               }

               this.decoder.reset();
            }
         } else {
            if (cr.isOverflow()) {
               boolean var7 = charBuffer.position() > 0;
               if (_Assertions.ENABLED && !var7) {
                  String var8 = "Assertion failed";
                  throw new AssertionError(var8);
               }
               break;
            }

            cr.throwException();
         }
      }

      if (isEof) {
         this.decoder.reset();
      }

      return charBuffer.position() == 0 ? -1 : charBuffer.position();
   }

   private final int fillByteBuffer() {
      this.byteBuffer.compact();

      int var5;
      try {
         int limit = this.byteBuffer.limit();
         int position = this.byteBuffer.position();
         int remaining = position <= limit ? limit - position : 0;
         int bytesRead = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + position, remaining);
         if (bytesRead >= 0) {
            ByteBuffer var10000 = this.byteBuffer;
            Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.nio.Buffer");
            ((Buffer)var10000).position(position + bytesRead);
            return this.byteBuffer.remaining();
         }

         var5 = bytesRead;
      } finally {
         this.byteBuffer.flip();
      }

      return var5;
   }

   private final int oneShotReadSlowPath() {
      if (this.hasLeftoverPotentiallySurrogateChar) {
         this.hasLeftoverPotentiallySurrogateChar = false;
         return this.leftoverChar;
      } else {
         char[] array = new char[2];
         int bytesRead = this.read(array, 0, 2);
         int var10000;
         switch(bytesRead) {
         case -1:
            var10000 = -1;
            break;
         case 0:
         default:
            throw new IllegalStateException(("Unreachable state: " + bytesRead).toString());
         case 1:
            var10000 = array[0];
            break;
         case 2:
            this.leftoverChar = array[1];
            this.hasLeftoverPotentiallySurrogateChar = true;
            var10000 = array[0];
         }

         return var10000;
      }
   }

   public final void release() {
      ByteArrayPool8k var10000 = ByteArrayPool8k.INSTANCE;
      byte[] var10001 = this.byteBuffer.array();
      Intrinsics.checkNotNullExpressionValue(var10001, "array(...)");
      var10000.release(var10001);
   }
}
