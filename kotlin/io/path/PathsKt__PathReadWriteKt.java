package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

class PathsKt__PathReadWriteKt {
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final InputStreamReader reader(Path $this$reader, Charset charset, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$reader, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new InputStreamReader(Files.newInputStream($this$reader, (OpenOption[])Arrays.copyOf(options, options.length)), charset);
   }

   // $FF: synthetic method
   static InputStreamReader reader$default(Path $this$reader_u24default, Charset charset, OpenOption[] options, int var3, Object var4) throws IOException {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new InputStreamReader(Files.newInputStream($this$reader_u24default, (OpenOption[])Arrays.copyOf(options, options.length)), charset);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final BufferedReader bufferedReader(Path $this$bufferedReader, Charset charset, int bufferSize, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new BufferedReader((Reader)(new InputStreamReader(Files.newInputStream($this$bufferedReader, (OpenOption[])Arrays.copyOf(options, options.length)), charset)), bufferSize);
   }

   // $FF: synthetic method
   static BufferedReader bufferedReader$default(Path $this$bufferedReader_u24default, Charset charset, int bufferSize, OpenOption[] options, int var4, Object var5) throws IOException {
      if ((var4 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      if ((var4 & 2) != 0) {
         bufferSize = 8192;
      }

      Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new BufferedReader((Reader)(new InputStreamReader(Files.newInputStream($this$bufferedReader_u24default, (OpenOption[])Arrays.copyOf(options, options.length)), charset)), bufferSize);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final OutputStreamWriter writer(Path $this$writer, Charset charset, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$writer, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new OutputStreamWriter(Files.newOutputStream($this$writer, (OpenOption[])Arrays.copyOf(options, options.length)), charset);
   }

   // $FF: synthetic method
   static OutputStreamWriter writer$default(Path $this$writer_u24default, Charset charset, OpenOption[] options, int var3, Object var4) throws IOException {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new OutputStreamWriter(Files.newOutputStream($this$writer_u24default, (OpenOption[])Arrays.copyOf(options, options.length)), charset);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final BufferedWriter bufferedWriter(Path $this$bufferedWriter, Charset charset, int bufferSize, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new BufferedWriter((Writer)(new OutputStreamWriter(Files.newOutputStream($this$bufferedWriter, (OpenOption[])Arrays.copyOf(options, options.length)), charset)), bufferSize);
   }

   // $FF: synthetic method
   static BufferedWriter bufferedWriter$default(Path $this$bufferedWriter_u24default, Charset charset, int bufferSize, OpenOption[] options, int var4, Object var5) throws IOException {
      if ((var4 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      if ((var4 & 2) != 0) {
         bufferSize = 8192;
      }

      Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      return new BufferedWriter((Writer)(new OutputStreamWriter(Files.newOutputStream($this$bufferedWriter_u24default, (OpenOption[])Arrays.copyOf(options, options.length)), charset)), bufferSize);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final byte[] readBytes(Path $this$readBytes) throws IOException {
      Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
      byte[] var10000 = Files.readAllBytes($this$readBytes);
      Intrinsics.checkNotNullExpressionValue(var10000, "readAllBytes(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final void writeBytes(Path $this$writeBytes, byte[] array, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$writeBytes, "<this>");
      Intrinsics.checkNotNullParameter(array, "array");
      Intrinsics.checkNotNullParameter(options, "options");
      Files.write($this$writeBytes, array, (OpenOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final void appendBytes(Path $this$appendBytes, byte[] array) throws IOException {
      Intrinsics.checkNotNullParameter($this$appendBytes, "<this>");
      Intrinsics.checkNotNullParameter(array, "array");
      OpenOption[] var2 = new OpenOption[]{StandardOpenOption.APPEND};
      Files.write($this$appendBytes, array, var2);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final String readText(@NotNull Path $this$readText, @NotNull Charset charset) throws IOException {
      Intrinsics.checkNotNullParameter($this$readText, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      OpenOption[] var3 = new OpenOption[0];
      Closeable var2 = (Closeable)(new InputStreamReader(Files.newInputStream($this$readText, (OpenOption[])Arrays.copyOf(var3, var3.length)), charset));
      Throwable var10 = null;

      String var11;
      try {
         InputStreamReader it = (InputStreamReader)var2;
         int var5 = false;
         var11 = TextStreamsKt.readText((Reader)it);
      } catch (Throwable var8) {
         var10 = var8;
         throw var8;
      } finally {
         CloseableKt.closeFinally(var2, var10);
      }

      return var11;
   }

   // $FF: synthetic method
   public static String readText$default(Path var0, Charset var1, int var2, Object var3) throws IOException {
      if ((var2 & 1) != 0) {
         var1 = Charsets.UTF_8;
      }

      return PathsKt.readText(var0, var1);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final void writeText(@NotNull Path $this$writeText, @NotNull CharSequence text, @NotNull Charset charset, @NotNull OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$writeText, "<this>");
      Intrinsics.checkNotNullParameter(text, "text");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      Closeable var4 = (Closeable)Files.newOutputStream($this$writeText, (OpenOption[])Arrays.copyOf(options, options.length));
      Throwable var5 = null;

      try {
         OutputStream out = (OutputStream)var4;
         int var7 = false;
         if (text instanceof String) {
            Intrinsics.checkNotNull(out);
            FilesKt.writeTextImpl(out, (String)text, charset);
         } else {
            CharsetEncoder encoder = FilesKt.newReplaceEncoder(charset);
            CharBuffer charBuffer = text instanceof CharBuffer ? ((CharBuffer)text).asReadOnlyBuffer() : CharBuffer.wrap(text);
            int var10000 = Math.min(text.length(), 8192);
            Intrinsics.checkNotNull(encoder);
            ByteBuffer byteBuffer = FilesKt.byteBufferForEncoding(var10000, encoder);

            while(charBuffer.hasRemaining()) {
               CoderResult var11 = encoder.encode(charBuffer, byteBuffer, true);
               int var13 = false;
               if (var11.isError()) {
                  throw new IllegalStateException("Check failed.");
               }

               out.write(byteBuffer.array(), 0, byteBuffer.position());
               byteBuffer.clear();
            }
         }

         Unit var18 = Unit.INSTANCE;
      } catch (Throwable var16) {
         var5 = var16;
         throw var16;
      } finally {
         CloseableKt.closeFinally(var4, var5);
      }

   }

   // $FF: synthetic method
   public static void writeText$default(Path var0, CharSequence var1, Charset var2, OpenOption[] var3, int var4, Object var5) throws IOException {
      if ((var4 & 2) != 0) {
         var2 = Charsets.UTF_8;
      }

      PathsKt.writeText(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.5"
   )
   public static final void appendText(@NotNull Path $this$appendText, @NotNull CharSequence text, @NotNull Charset charset) throws IOException {
      Intrinsics.checkNotNullParameter($this$appendText, "<this>");
      Intrinsics.checkNotNullParameter(text, "text");
      Intrinsics.checkNotNullParameter(charset, "charset");
      OpenOption[] var3 = new OpenOption[]{StandardOpenOption.APPEND};
      PathsKt.writeText($this$appendText, text, charset, var3);
   }

   // $FF: synthetic method
   public static void appendText$default(Path var0, CharSequence var1, Charset var2, int var3, Object var4) throws IOException {
      if ((var3 & 2) != 0) {
         var2 = Charsets.UTF_8;
      }

      PathsKt.appendText(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final void forEachLine(Path $this$forEachLine, Charset charset, Function1<? super String, Unit> action) throws IOException {
      Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(action, "action");
      BufferedReader var10000 = Files.newBufferedReader($this$forEachLine, charset);
      Intrinsics.checkNotNullExpressionValue(var10000, "newBufferedReader(...)");
      Reader $this$useLines$iv = (Reader)var10000;
      int $i$f$useLines = false;
      Closeable var5 = (Closeable)((BufferedReader)$this$useLines$iv);
      Throwable var6 = null;

      try {
         BufferedReader it$iv = (BufferedReader)var5;
         int var8 = false;
         Sequence it = TextStreamsKt.lineSequence(it$iv);
         int var10 = false;
         int $i$f$forEach = false;
         Iterator var13 = it.iterator();

         while(var13.hasNext()) {
            Object element$iv = var13.next();
            action.invoke(element$iv);
         }

         Unit var19 = Unit.INSTANCE;
      } catch (Throwable var17) {
         var6 = var17;
         throw var17;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var5, var6);
         InlineMarker.finallyEnd(1);
      }
   }

   // $FF: synthetic method
   static void forEachLine$default(Path $this$forEachLine_u24default, Charset charset, Function1 action, int $this$useLines$iv, Object $i$f$useLines) throws IOException {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$forEachLine_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(action, "action");
      BufferedReader var10000 = Files.newBufferedReader($this$forEachLine_u24default, charset);
      Intrinsics.checkNotNullExpressionValue(var10000, "newBufferedReader(...)");
      Reader $this$useLines$iv = (Reader)var10000;
      int $i$f$useLines = false;
      Closeable var5 = (Closeable)((BufferedReader)$this$useLines$iv);
      Throwable var6 = null;

      try {
         BufferedReader it$iv = (BufferedReader)var5;
         int var8 = false;
         Sequence it = TextStreamsKt.lineSequence(it$iv);
         int var10 = false;
         int $i$f$forEach = false;
         Iterator var13 = it.iterator();

         while(var13.hasNext()) {
            Object element$iv = var13.next();
            action.invoke(element$iv);
         }

         Unit var21 = Unit.INSTANCE;
      } catch (Throwable var17) {
         var6 = var17;
         throw var17;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var5, var6);
         InlineMarker.finallyEnd(1);
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final InputStream inputStream(Path $this$inputStream, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      InputStream var10000 = Files.newInputStream($this$inputStream, (OpenOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "newInputStream(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final OutputStream outputStream(Path $this$outputStream, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$outputStream, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      OutputStream var10000 = Files.newOutputStream($this$outputStream, (OpenOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "newOutputStream(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final List<String> readLines(Path $this$readLines, Charset charset) throws IOException {
      Intrinsics.checkNotNullParameter($this$readLines, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      List var10000 = Files.readAllLines($this$readLines, charset);
      Intrinsics.checkNotNullExpressionValue(var10000, "readAllLines(...)");
      return var10000;
   }

   // $FF: synthetic method
   static List readLines$default(Path $this$readLines_u24default, Charset charset, int var2, Object var3) throws IOException {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$readLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      List var10000 = Files.readAllLines($this$readLines_u24default, charset);
      Intrinsics.checkNotNullExpressionValue(var10000, "readAllLines(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <T> T useLines(Path $this$useLines, Charset charset, Function1<? super Sequence<String>, ? extends T> block) throws IOException {
      Intrinsics.checkNotNullParameter($this$useLines, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(block, "block");
      Closeable var3 = (Closeable)Files.newBufferedReader($this$useLines, charset);
      Throwable var4 = null;

      Object var11;
      try {
         BufferedReader it = (BufferedReader)var3;
         int var6 = false;
         Intrinsics.checkNotNull(it);
         var11 = block.invoke(TextStreamsKt.lineSequence(it));
      } catch (Throwable var9) {
         var4 = var9;
         throw var9;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var3, var4);
         InlineMarker.finallyEnd(1);
      }

      return var11;
   }

   // $FF: synthetic method
   static Object useLines$default(Path $this$useLines_u24default, Charset charset, Function1 block, int var3, Object var4) throws IOException {
      if ((var3 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$useLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(block, "block");
      Closeable var11 = (Closeable)Files.newBufferedReader($this$useLines_u24default, charset);
      Throwable var12 = null;

      Object var13;
      try {
         BufferedReader it = (BufferedReader)var11;
         int var6 = false;
         Intrinsics.checkNotNull(it);
         var13 = block.invoke(TextStreamsKt.lineSequence(it));
      } catch (Throwable var9) {
         var12 = var9;
         throw var9;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var11, var12);
         InlineMarker.finallyEnd(1);
      }

      return var13;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path writeLines(Path $this$writeLines, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$writeLines, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.write($this$writeLines, lines, charset, (OpenOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Path writeLines$default(Path $this$writeLines_u24default, Iterable lines, Charset charset, OpenOption[] options, int var4, Object var5) throws IOException {
      if ((var4 & 2) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$writeLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.write($this$writeLines_u24default, lines, charset, (OpenOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path writeLines(Path $this$writeLines, Sequence<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$writeLines, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.write($this$writeLines, SequencesKt.asIterable(lines), charset, (OpenOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Path writeLines$default(Path $this$writeLines_u24default, Sequence lines, Charset charset, OpenOption[] options, int var4, Object var5) throws IOException {
      if ((var4 & 2) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$writeLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.write($this$writeLines_u24default, SequencesKt.asIterable(lines), charset, (OpenOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path appendLines(Path $this$appendLines, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
      Intrinsics.checkNotNullParameter($this$appendLines, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      OpenOption[] var3 = new OpenOption[]{StandardOpenOption.APPEND};
      Path var10000 = Files.write($this$appendLines, lines, charset, var3);
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Path appendLines$default(Path $this$appendLines_u24default, Iterable lines, Charset charset, int var3, Object var4) throws IOException {
      if ((var3 & 2) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$appendLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      OpenOption[] var5 = new OpenOption[]{StandardOpenOption.APPEND};
      Path var10000 = Files.write($this$appendLines_u24default, lines, charset, var5);
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path appendLines(Path $this$appendLines, Sequence<? extends CharSequence> lines, Charset charset) throws IOException {
      Intrinsics.checkNotNullParameter($this$appendLines, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Iterable var10001 = SequencesKt.asIterable(lines);
      OpenOption[] var3 = new OpenOption[]{StandardOpenOption.APPEND};
      Path var10000 = Files.write($this$appendLines, var10001, charset, var3);
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Path appendLines$default(Path $this$appendLines_u24default, Sequence lines, Charset charset, int var3, Object var4) throws IOException {
      if ((var3 & 2) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$appendLines_u24default, "<this>");
      Intrinsics.checkNotNullParameter(lines, "lines");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Iterable var10001 = SequencesKt.asIterable(lines);
      OpenOption[] var5 = new OpenOption[]{StandardOpenOption.APPEND};
      Path var10000 = Files.write($this$appendLines_u24default, var10001, charset, var5);
      Intrinsics.checkNotNullExpressionValue(var10000, "write(...)");
      return var10000;
   }

   public PathsKt__PathReadWriteKt() {
   }
}
