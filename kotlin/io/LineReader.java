package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LineReader {
   @NotNull
   public static final LineReader INSTANCE = new LineReader();
   private static final int BUFFER_SIZE = 32;
   private static CharsetDecoder decoder;
   private static boolean directEOL;
   @NotNull
   private static final byte[] bytes = new byte[32];
   @NotNull
   private static final char[] chars = new char[32];
   @NotNull
   private static final ByteBuffer byteBuf;
   @NotNull
   private static final CharBuffer charBuf;
   @NotNull
   private static final StringBuilder sb;

   private LineReader() {
   }

   @Nullable
   public final synchronized String readLine(@NotNull InputStream inputStream, @NotNull Charset charset) {
      label74: {
         Intrinsics.checkNotNullParameter(inputStream, "inputStream");
         Intrinsics.checkNotNullParameter(charset, "charset");
         if (decoder != null) {
            CharsetDecoder var10000 = decoder;
            if (var10000 == null) {
               Intrinsics.throwUninitializedPropertyAccessException("decoder");
               var10000 = null;
            }

            if (Intrinsics.areEqual((Object)var10000.charset(), (Object)charset)) {
               break label74;
            }
         }

         this.updateCharset(charset);
      }

      int nBytes = 0;
      int nChars = 0;

      while(true) {
         int readByte = inputStream.read();
         if (readByte == -1) {
            if (((CharSequence)sb).length() == 0 && nBytes == 0 && nChars == 0) {
               return null;
            }

            nChars = this.decodeEndOfInput(nBytes, nChars);
            break;
         }

         bytes[nBytes++] = (byte)readByte;
         if (readByte == 10 || nBytes == 32 || !directEOL) {
            byteBuf.limit(nBytes);
            charBuf.position(nChars);
            nChars = this.decode(false);
            if (nChars > 0 && chars[nChars - 1] == '\n') {
               byteBuf.position(0);
               break;
            }

            nBytes = this.compactBytes();
         }
      }

      if (nChars > 0 && chars[nChars - 1] == '\n') {
         --nChars;
         if (nChars > 0 && chars[nChars - 1] == '\r') {
            --nChars;
         }
      }

      if (((CharSequence)sb).length() == 0) {
         return new String(chars, 0, nChars);
      } else {
         sb.append(chars, 0, nChars);
         String var7 = sb.toString();
         Intrinsics.checkNotNullExpressionValue(var7, "toString(...)");
         String result = var7;
         if (sb.length() > 32) {
            this.trimStringBuilder();
         }

         sb.setLength(0);
         return result;
      }
   }

   private final int decode(boolean endOfInput) {
      while(true) {
         CharsetDecoder var10000 = decoder;
         if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            var10000 = null;
         }

         CoderResult var4 = var10000.decode(byteBuf, charBuf, endOfInput);
         Intrinsics.checkNotNullExpressionValue(var4, "decode(...)");
         CoderResult coderResult = var4;
         if (coderResult.isError()) {
            this.resetAll();
            coderResult.throwException();
         }

         int nChars = charBuf.position();
         if (!coderResult.isOverflow()) {
            return nChars;
         }

         sb.append(chars, 0, nChars - 1);
         charBuf.position(0);
         charBuf.limit(32);
         charBuf.put(chars[nChars - 1]);
      }
   }

   private final int compactBytes() {
      ByteBuffer $this$compactBytes_u24lambda_u241 = byteBuf;
      int var2 = false;
      $this$compactBytes_u24lambda_u241.compact();
      int var3 = $this$compactBytes_u24lambda_u241.position();
      int var5 = false;
      $this$compactBytes_u24lambda_u241.position(0);
      return var3;
   }

   private final int decodeEndOfInput(int nBytes, int nChars) {
      byteBuf.limit(nBytes);
      charBuf.position(nChars);
      int var3 = this.decode(true);
      int var5 = false;
      CharsetDecoder var10000 = decoder;
      if (var10000 == null) {
         Intrinsics.throwUninitializedPropertyAccessException("decoder");
         var10000 = null;
      }

      var10000.reset();
      byteBuf.position(0);
      return var3;
   }

   private final void updateCharset(Charset charset) {
      CharsetDecoder var10000 = charset.newDecoder();
      Intrinsics.checkNotNullExpressionValue(var10000, "newDecoder(...)");
      decoder = var10000;
      byteBuf.clear();
      charBuf.clear();
      byteBuf.put((byte)10);
      byteBuf.flip();
      var10000 = decoder;
      if (var10000 == null) {
         Intrinsics.throwUninitializedPropertyAccessException("decoder");
         var10000 = null;
      }

      var10000.decode(byteBuf, charBuf, false);
      directEOL = charBuf.position() == 1 && charBuf.get(0) == '\n';
      this.resetAll();
   }

   private final void resetAll() {
      CharsetDecoder var10000 = decoder;
      if (var10000 == null) {
         Intrinsics.throwUninitializedPropertyAccessException("decoder");
         var10000 = null;
      }

      var10000.reset();
      byteBuf.position(0);
      sb.setLength(0);
   }

   private final void trimStringBuilder() {
      sb.setLength(32);
      sb.trimToSize();
   }

   static {
      ByteBuffer var10000 = ByteBuffer.wrap(bytes);
      Intrinsics.checkNotNullExpressionValue(var10000, "wrap(...)");
      byteBuf = var10000;
      CharBuffer var0 = CharBuffer.wrap(chars);
      Intrinsics.checkNotNullExpressionValue(var0, "wrap(...)");
      charBuf = var0;
      sb = new StringBuilder();
   }
}
