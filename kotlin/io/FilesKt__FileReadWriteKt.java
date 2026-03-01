package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
   @InlineOnly
   private static final InputStreamReader reader(File $this$reader, Charset charset) {
      Intrinsics.checkNotNullParameter($this$reader, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new InputStreamReader((InputStream)(new FileInputStream($this$reader)), charset);
   }

   // $FF: synthetic method
   static InputStreamReader reader$default(File $this$reader_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new InputStreamReader((InputStream)(new FileInputStream($this$reader_u24default)), charset);
   }

   @InlineOnly
   private static final BufferedReader bufferedReader(File $this$bufferedReader, Charset charset, int bufferSize) {
      Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Reader var3 = (Reader)(new InputStreamReader((InputStream)(new FileInputStream($this$bufferedReader)), charset));
      return var3 instanceof BufferedReader ? (BufferedReader)var3 : new BufferedReader(var3, bufferSize);
   }

   // $FF: synthetic method
   static BufferedReader bufferedReader$default(File $this$bufferedReader_u24default, Charset charset, int bufferSize, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      if ((var3 & 2) != 0) {
         bufferSize = 8192;
      }

      Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Reader var5 = (Reader)(new InputStreamReader((InputStream)(new FileInputStream($this$bufferedReader_u24default)), charset));
      return var5 instanceof BufferedReader ? (BufferedReader)var5 : new BufferedReader(var5, bufferSize);
   }

   @InlineOnly
   private static final OutputStreamWriter writer(File $this$writer, Charset charset) {
      Intrinsics.checkNotNullParameter($this$writer, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new OutputStreamWriter((OutputStream)(new FileOutputStream($this$writer)), charset);
   }

   // $FF: synthetic method
   static OutputStreamWriter writer$default(File $this$writer_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new OutputStreamWriter((OutputStream)(new FileOutputStream($this$writer_u24default)), charset);
   }

   @InlineOnly
   private static final BufferedWriter bufferedWriter(File $this$bufferedWriter, Charset charset, int bufferSize) {
      Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Writer var3 = (Writer)(new OutputStreamWriter((OutputStream)(new FileOutputStream($this$bufferedWriter)), charset));
      return var3 instanceof BufferedWriter ? (BufferedWriter)var3 : new BufferedWriter(var3, bufferSize);
   }

   // $FF: synthetic method
   static BufferedWriter bufferedWriter$default(File $this$bufferedWriter_u24default, Charset charset, int bufferSize, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      if ((var3 & 2) != 0) {
         bufferSize = 8192;
      }

      Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Writer var5 = (Writer)(new OutputStreamWriter((OutputStream)(new FileOutputStream($this$bufferedWriter_u24default)), charset));
      return var5 instanceof BufferedWriter ? (BufferedWriter)var5 : new BufferedWriter(var5, bufferSize);
   }

   @InlineOnly
   private static final PrintWriter printWriter(File $this$printWriter, Charset charset) {
      Intrinsics.checkNotNullParameter($this$printWriter, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      short var3 = 8192;
      Writer var4 = (Writer)(new OutputStreamWriter((OutputStream)(new FileOutputStream($this$printWriter)), charset));
      return new PrintWriter((Writer)(var4 instanceof BufferedWriter ? (BufferedWriter)var4 : new BufferedWriter(var4, var3)));
   }

   // $FF: synthetic method
   static PrintWriter printWriter$default(File $this$printWriter_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$printWriter_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      short var5 = 8192;
      Writer var4 = (Writer)(new OutputStreamWriter((OutputStream)(new FileOutputStream($this$printWriter_u24default)), charset));
      return new PrintWriter((Writer)(var4 instanceof BufferedWriter ? (BufferedWriter)var4 : new BufferedWriter(var4, var5)));
   }

   @NotNull
   public static final byte[] readBytes(@NotNull File $this$readBytes) {
      Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
      Closeable var1 = (Closeable)(new FileInputStream($this$readBytes));
      Throwable var2 = null;

      try {
         FileInputStream input = (FileInputStream)var1;
         int var4 = false;
         int offset = 0;
         long var6 = $this$readBytes.length();
         int var10 = false;
         if (var6 > 2147483647L) {
            throw new OutOfMemoryError("File " + $this$readBytes + " is too big (" + var6 + " bytes) to fit in memory.");
         } else {
            int remaining = (int)var6;
            byte[] result = new byte[remaining];

            while(true) {
               int extraByte;
               if (remaining > 0) {
                  extraByte = input.read(result, offset, remaining);
                  if (extraByte >= 0) {
                     remaining -= extraByte;
                     offset += extraByte;
                     continue;
                  }
               }

               byte[] var10000;
               if (remaining > 0) {
                  var10000 = Arrays.copyOf(result, offset);
                  Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
               } else {
                  extraByte = input.read();
                  if (extraByte == -1) {
                     var10000 = result;
                  } else {
                     ExposingBufferByteArrayOutputStream extra = new ExposingBufferByteArrayOutputStream(8193);
                     extra.write(extraByte);
                     ByteStreamsKt.copyTo$default((InputStream)input, (OutputStream)extra, 0, 2, (Object)null);
                     int resultingSize = result.length + extra.size();
                     if (resultingSize < 0) {
                        throw new OutOfMemoryError("File " + $this$readBytes + " is too big to fit in memory.");
                     }

                     var10000 = extra.getBuffer();
                     byte[] var10001 = Arrays.copyOf(result, resultingSize);
                     Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
                     var10000 = ArraysKt.copyInto(var10000, var10001, result.length, 0, extra.size());
                  }
               }

               byte[] var18 = var10000;
               return var18;
            }
         }
      } catch (Throwable var16) {
         var2 = var16;
         throw var16;
      } finally {
         CloseableKt.closeFinally(var1, var2);
      }
   }

   public static final void writeBytes(@NotNull File $this$writeBytes, @NotNull byte[] array) {
      Intrinsics.checkNotNullParameter($this$writeBytes, "<this>");
      Intrinsics.checkNotNullParameter(array, "array");
      Closeable var2 = (Closeable)(new FileOutputStream($this$writeBytes));
      Throwable var3 = null;

      try {
         FileOutputStream it = (FileOutputStream)var2;
         int var5 = false;
         it.write(array);
         Unit var10 = Unit.INSTANCE;
      } catch (Throwable var8) {
         var3 = var8;
         throw var8;
      } finally {
         CloseableKt.closeFinally(var2, var3);
      }

   }

   public static final void appendBytes(@NotNull File $this$appendBytes, @NotNull byte[] array) {
      Intrinsics.checkNotNullParameter($this$appendBytes, "<this>");
      Intrinsics.checkNotNullParameter(array, "array");
      Closeable var2 = (Closeable)(new FileOutputStream($this$appendBytes, true));
      Throwable var3 = null;

      try {
         FileOutputStream it = (FileOutputStream)var2;
         int var5 = false;
         it.write(array);
         Unit var10 = Unit.INSTANCE;
      } catch (Throwable var8) {
         var3 = var8;
         throw var8;
      } finally {
         CloseableKt.closeFinally(var2, var3);
      }

   }

   @NotNull
   public static final String readText(@NotNull File $this$readText, @NotNull Charset charset) {
      Intrinsics.checkNotNullParameter($this$readText, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Closeable var2 = (Closeable)(new InputStreamReader((InputStream)(new FileInputStream($this$readText)), charset));
      Throwable var3 = null;

      String var10;
      try {
         InputStreamReader it = (InputStreamReader)var2;
         int var5 = false;
         var10 = TextStreamsKt.readText((Reader)it);
      } catch (Throwable var8) {
         var3 = var8;
         throw var8;
      } finally {
         CloseableKt.closeFinally(var2, var3);
      }

      return var10;
   }

   // $FF: synthetic method
   public static String readText$default(File var0, Charset var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = Charsets.UTF_8;
      }

      return FilesKt.readText(var0, var1);
   }

   public static final void writeText(@NotNull File $this$writeText, @NotNull String text, @NotNull Charset charset) {
      Intrinsics.checkNotNullParameter($this$writeText, "<this>");
      Intrinsics.checkNotNullParameter(text, "text");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Closeable var3 = (Closeable)(new FileOutputStream($this$writeText));
      Throwable var4 = null;

      try {
         FileOutputStream it = (FileOutputStream)var3;
         int var6 = false;
         FilesKt.writeTextImpl((OutputStream)it, text, charset);
         Unit var11 = Unit.INSTANCE;
      } catch (Throwable var9) {
         var4 = var9;
         throw var9;
      } finally {
         CloseableKt.closeFinally(var3, var4);
      }

   }

   // $FF: synthetic method
   public static void writeText$default(File var0, String var1, Charset var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = Charsets.UTF_8;
      }

      FilesKt.writeText(var0, var1, var2);
   }

   public static final void appendText(@NotNull File $this$appendText, @NotNull String text, @NotNull Charset charset) {
      Intrinsics.checkNotNullParameter($this$appendText, "<this>");
      Intrinsics.checkNotNullParameter(text, "text");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Closeable var3 = (Closeable)(new FileOutputStream($this$appendText, true));
      Throwable var4 = null;

      try {
         FileOutputStream it = (FileOutputStream)var3;
         int var6 = false;
         FilesKt.writeTextImpl((OutputStream)it, text, charset);
         Unit var11 = Unit.INSTANCE;
      } catch (Throwable var9) {
         var4 = var9;
         throw var9;
      } finally {
         CloseableKt.closeFinally(var3, var4);
      }

   }

   // $FF: synthetic method
   public static void appendText$default(File var0, String var1, Charset var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = Charsets.UTF_8;
      }

      FilesKt.appendText(var0, var1, var2);
   }

   public static final void writeTextImpl(@NotNull OutputStream $this$writeTextImpl, @NotNull String text, @NotNull Charset charset) {
      Intrinsics.checkNotNullParameter($this$writeTextImpl, "<this>");
      Intrinsics.checkNotNullParameter(text, "text");
      Intrinsics.checkNotNullParameter(charset, "charset");
      int chunkSize = 8192;
      if (text.length() < 2 * chunkSize) {
         byte[] var10001 = text.getBytes(charset);
         Intrinsics.checkNotNullExpressionValue(var10001, "getBytes(...)");
         $this$writeTextImpl.write(var10001);
      } else {
         CharsetEncoder encoder = FilesKt.newReplaceEncoder(charset);
         CharBuffer charBuffer = CharBuffer.allocate(chunkSize);
         Intrinsics.checkNotNull(encoder);
         ByteBuffer byteBuffer = FilesKt.byteBufferForEncoding(chunkSize, encoder);
         int startIndex = 0;

         int endIndex;
         for(byte leftover = 0; startIndex < text.length(); startIndex = endIndex) {
            endIndex = chunkSize - leftover;
            int var11 = text.length() - startIndex;
            int copyLength = Math.min(endIndex, var11);
            endIndex = startIndex + copyLength;
            char[] var10000 = charBuffer.array();
            Intrinsics.checkNotNullExpressionValue(var10000, "array(...)");
            char[] var12 = var10000;
            text.getChars(startIndex, endIndex, var12, leftover);
            charBuffer.limit(copyLength + leftover);
            CoderResult var14 = encoder.encode(charBuffer, byteBuffer, endIndex == text.length());
            int var13 = false;
            if (!var14.isUnderflow()) {
               throw new IllegalStateException("Check failed.");
            }

            $this$writeTextImpl.write(byteBuffer.array(), 0, byteBuffer.position());
            if (charBuffer.position() != charBuffer.limit()) {
               charBuffer.put(0, charBuffer.get());
               leftover = 1;
            } else {
               leftover = 0;
            }

            charBuffer.clear();
            byteBuffer.clear();
         }

      }
   }

   public static final CharsetEncoder newReplaceEncoder(@NotNull Charset $this$newReplaceEncoder) {
      Intrinsics.checkNotNullParameter($this$newReplaceEncoder, "<this>");
      return $this$newReplaceEncoder.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
   }

   @NotNull
   public static final ByteBuffer byteBufferForEncoding(int chunkSize, @NotNull CharsetEncoder encoder) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      int maxBytesPerChar = (int)((float)Math.ceil((double)encoder.maxBytesPerChar()));
      ByteBuffer var10000 = ByteBuffer.allocate(chunkSize * maxBytesPerChar);
      Intrinsics.checkNotNullExpressionValue(var10000, "allocate(...)");
      return var10000;
   }

   public static final void forEachBlock(@NotNull File $this$forEachBlock, @NotNull Function2<? super byte[], ? super Integer, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachBlock, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      FilesKt.forEachBlock($this$forEachBlock, 4096, action);
   }

   public static final void forEachBlock(@NotNull File $this$forEachBlock, int blockSize, @NotNull Function2<? super byte[], ? super Integer, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachBlock, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      byte[] arr = new byte[RangesKt.coerceAtLeast(blockSize, 512)];
      Closeable var4 = (Closeable)(new FileInputStream($this$forEachBlock));
      Throwable var5 = null;

      try {
         FileInputStream input = (FileInputStream)var4;
         boolean var7 = false;

         while(true) {
            int size = input.read(arr);
            if (size <= 0) {
               Unit var13 = Unit.INSTANCE;
               return;
            }

            action.invoke(arr, size);
         }
      } catch (Throwable var11) {
         var5 = var11;
         throw var11;
      } finally {
         CloseableKt.closeFinally(var4, var5);
      }
   }

   public static final void forEachLine(@NotNull File $this$forEachLine, @NotNull Charset charset, @NotNull Function1<? super String, Unit> action) {
      Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(action, "action");
      TextStreamsKt.forEachLine((Reader)(new BufferedReader((Reader)(new InputStreamReader((InputStream)(new FileInputStream($this$forEachLine)), charset)))), action);
   }

   // $FF: synthetic method
   public static void forEachLine$default(File var0, Charset var1, Function1 var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = Charsets.UTF_8;
      }

      FilesKt.forEachLine(var0, var1, var2);
   }

   @InlineOnly
   private static final FileInputStream inputStream(File $this$inputStream) {
      Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
      return new FileInputStream($this$inputStream);
   }

   @InlineOnly
   private static final FileOutputStream outputStream(File $this$outputStream) {
      Intrinsics.checkNotNullParameter($this$outputStream, "<this>");
      return new FileOutputStream($this$outputStream);
   }

   @NotNull
   public static final List<String> readLines(@NotNull File $this$readLines, @NotNull Charset charset) {
      Intrinsics.checkNotNullParameter($this$readLines, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      ArrayList result = new ArrayList();
      FilesKt.forEachLine($this$readLines, charset, FilesKt__FileReadWriteKt::readLines$lambda$9$FilesKt__FileReadWriteKt);
      return (List)result;
   }

   // $FF: synthetic method
   public static List readLines$default(File var0, Charset var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = Charsets.UTF_8;
      }

      return FilesKt.readLines(var0, var1);
   }

   public static final <T> T useLines(@NotNull File $this$useLines, @NotNull Charset charset, @NotNull Function1<? super Sequence<String>, ? extends T> block) {
      Intrinsics.checkNotNullParameter($this$useLines, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$useLines = false;
      short var5 = 8192;
      Reader var6 = (Reader)(new InputStreamReader((InputStream)(new FileInputStream($this$useLines)), charset));
      Closeable var4 = (Closeable)(var6 instanceof BufferedReader ? (BufferedReader)var6 : new BufferedReader(var6, var5));
      Throwable var12 = null;

      Object var14;
      try {
         BufferedReader it = (BufferedReader)var4;
         int var7 = false;
         var14 = block.invoke(TextStreamsKt.lineSequence(it));
      } catch (Throwable var10) {
         var12 = var10;
         throw var10;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var4, var12);
         InlineMarker.finallyEnd(1);
      }

      return var14;
   }

   // $FF: synthetic method
   public static Object useLines$default(File $this$useLines_u24default, Charset charset, Function1 block, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$useLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$useLines = false;
      short var5 = 8192;
      Reader var6 = (Reader)(new InputStreamReader((InputStream)(new FileInputStream($this$useLines_u24default)), charset));
      Closeable var13 = (Closeable)(var6 instanceof BufferedReader ? (BufferedReader)var6 : new BufferedReader(var6, var5));
      Throwable var14 = null;

      Object var16;
      try {
         BufferedReader it = (BufferedReader)var13;
         int var7 = false;
         var16 = block.invoke(TextStreamsKt.lineSequence(it));
      } catch (Throwable var10) {
         var14 = var10;
         throw var10;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var13, var14);
         InlineMarker.finallyEnd(1);
      }

      return var16;
   }

   private static final Unit readLines$lambda$9$FilesKt__FileReadWriteKt(ArrayList $result, String it) {
      Intrinsics.checkNotNullParameter(it, "it");
      $result.add(it);
      return Unit.INSTANCE;
   }

   public FilesKt__FileReadWriteKt() {
   }
}
