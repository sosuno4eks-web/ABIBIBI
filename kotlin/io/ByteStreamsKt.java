package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@JvmName(
   name = "ByteStreamsKt"
)
public final class ByteStreamsKt {
   @NotNull
   public static final ByteIterator iterator(@NotNull BufferedInputStream $this$iterator) {
      Intrinsics.checkNotNullParameter($this$iterator, "<this>");
      return (ByteIterator)(new ByteIterator() {
         private int nextByte = -1;
         private boolean nextPrepared;
         private boolean finished;

         public final int getNextByte() {
            return this.nextByte;
         }

         public final void setNextByte(int <set-?>) {
            this.nextByte = var1;
         }

         public final boolean getNextPrepared() {
            return this.nextPrepared;
         }

         public final void setNextPrepared(boolean <set-?>) {
            this.nextPrepared = var1;
         }

         public final boolean getFinished() {
            return this.finished;
         }

         public final void setFinished(boolean <set-?>) {
            this.finished = var1;
         }

         private final void prepareNext() {
            if (!this.nextPrepared && !this.finished) {
               this.nextByte = $this$iterator.read();
               this.nextPrepared = true;
               this.finished = this.nextByte == -1;
            }

         }

         public boolean hasNext() {
            this.prepareNext();
            return !this.finished;
         }

         public byte nextByte() {
            this.prepareNext();
            if (this.finished) {
               throw new NoSuchElementException("Input stream is over.");
            } else {
               byte res = (byte)this.nextByte;
               this.nextPrepared = false;
               return res;
            }
         }
      });
   }

   @InlineOnly
   private static final ByteArrayInputStream byteInputStream(String $this$byteInputStream, Charset charset) {
      Intrinsics.checkNotNullParameter($this$byteInputStream, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      byte[] var10002 = $this$byteInputStream.getBytes(charset);
      Intrinsics.checkNotNullExpressionValue(var10002, "getBytes(...)");
      return new ByteArrayInputStream(var10002);
   }

   // $FF: synthetic method
   static ByteArrayInputStream byteInputStream$default(String $this$byteInputStream_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$byteInputStream_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      byte[] var10002 = $this$byteInputStream_u24default.getBytes(charset);
      Intrinsics.checkNotNullExpressionValue(var10002, "getBytes(...)");
      return new ByteArrayInputStream(var10002);
   }

   @InlineOnly
   private static final ByteArrayInputStream inputStream(byte[] $this$inputStream) {
      Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
      return new ByteArrayInputStream($this$inputStream);
   }

   @InlineOnly
   private static final ByteArrayInputStream inputStream(byte[] $this$inputStream, int offset, int length) {
      Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
      return new ByteArrayInputStream($this$inputStream, offset, length);
   }

   @InlineOnly
   private static final BufferedInputStream buffered(InputStream $this$buffered, int bufferSize) {
      Intrinsics.checkNotNullParameter($this$buffered, "<this>");
      return $this$buffered instanceof BufferedInputStream ? (BufferedInputStream)$this$buffered : new BufferedInputStream($this$buffered, bufferSize);
   }

   // $FF: synthetic method
   static BufferedInputStream buffered$default(InputStream $this$buffered_u24default, int bufferSize, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         bufferSize = 8192;
      }

      Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
      return $this$buffered_u24default instanceof BufferedInputStream ? (BufferedInputStream)$this$buffered_u24default : new BufferedInputStream($this$buffered_u24default, bufferSize);
   }

   @InlineOnly
   private static final InputStreamReader reader(InputStream $this$reader, Charset charset) {
      Intrinsics.checkNotNullParameter($this$reader, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new InputStreamReader($this$reader, charset);
   }

   // $FF: synthetic method
   static InputStreamReader reader$default(InputStream $this$reader_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new InputStreamReader($this$reader_u24default, charset);
   }

   @InlineOnly
   private static final BufferedReader bufferedReader(InputStream $this$bufferedReader, Charset charset) {
      Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Reader var2 = (Reader)(new InputStreamReader($this$bufferedReader, charset));
      short var3 = 8192;
      return var2 instanceof BufferedReader ? (BufferedReader)var2 : new BufferedReader(var2, var3);
   }

   // $FF: synthetic method
   static BufferedReader bufferedReader$default(InputStream $this$bufferedReader_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Reader var4 = (Reader)(new InputStreamReader($this$bufferedReader_u24default, charset));
      short var5 = 8192;
      return var4 instanceof BufferedReader ? (BufferedReader)var4 : new BufferedReader(var4, var5);
   }

   @InlineOnly
   private static final BufferedOutputStream buffered(OutputStream $this$buffered, int bufferSize) {
      Intrinsics.checkNotNullParameter($this$buffered, "<this>");
      return $this$buffered instanceof BufferedOutputStream ? (BufferedOutputStream)$this$buffered : new BufferedOutputStream($this$buffered, bufferSize);
   }

   // $FF: synthetic method
   static BufferedOutputStream buffered$default(OutputStream $this$buffered_u24default, int bufferSize, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         bufferSize = 8192;
      }

      Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
      return $this$buffered_u24default instanceof BufferedOutputStream ? (BufferedOutputStream)$this$buffered_u24default : new BufferedOutputStream($this$buffered_u24default, bufferSize);
   }

   @InlineOnly
   private static final OutputStreamWriter writer(OutputStream $this$writer, Charset charset) {
      Intrinsics.checkNotNullParameter($this$writer, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new OutputStreamWriter($this$writer, charset);
   }

   // $FF: synthetic method
   static OutputStreamWriter writer$default(OutputStream $this$writer_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new OutputStreamWriter($this$writer_u24default, charset);
   }

   @InlineOnly
   private static final BufferedWriter bufferedWriter(OutputStream $this$bufferedWriter, Charset charset) {
      Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Writer var2 = (Writer)(new OutputStreamWriter($this$bufferedWriter, charset));
      short var3 = 8192;
      return var2 instanceof BufferedWriter ? (BufferedWriter)var2 : new BufferedWriter(var2, var3);
   }

   // $FF: synthetic method
   static BufferedWriter bufferedWriter$default(OutputStream $this$bufferedWriter_u24default, Charset charset, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         charset = Charsets.UTF_8;
      }

      Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      Writer var4 = (Writer)(new OutputStreamWriter($this$bufferedWriter_u24default, charset));
      short var5 = 8192;
      return var4 instanceof BufferedWriter ? (BufferedWriter)var4 : new BufferedWriter(var4, var5);
   }

   public static final long copyTo(@NotNull InputStream $this$copyTo, @NotNull OutputStream out, int bufferSize) {
      Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
      Intrinsics.checkNotNullParameter(out, "out");
      long bytesCopied = 0L;
      byte[] buffer = new byte[bufferSize];

      for(int bytes = $this$copyTo.read(buffer); bytes >= 0; bytes = $this$copyTo.read(buffer)) {
         out.write(buffer, 0, bytes);
         bytesCopied += (long)bytes;
      }

      return bytesCopied;
   }

   // $FF: synthetic method
   public static long copyTo$default(InputStream var0, OutputStream var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 8192;
      }

      return copyTo(var0, var1, var2);
   }

   /** @deprecated */
   @Deprecated(
      message = "Use readBytes() overload without estimatedSize parameter",
      replaceWith = @ReplaceWith(
   expression = "readBytes()",
   imports = {}
)
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.3",
      errorSince = "1.5"
   )
   @NotNull
   public static final byte[] readBytes(@NotNull InputStream $this$readBytes, int estimatedSize) {
      Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
      ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(estimatedSize, $this$readBytes.available()));
      copyTo$default($this$readBytes, (OutputStream)buffer, 0, 2, (Object)null);
      byte[] var10000 = buffer.toByteArray();
      Intrinsics.checkNotNullExpressionValue(var10000, "toByteArray(...)");
      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   public static byte[] readBytes$default(InputStream var0, int var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = 8192;
      }

      return readBytes(var0, var1);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final byte[] readBytes(@NotNull InputStream $this$readBytes) {
      Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
      ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(8192, $this$readBytes.available()));
      copyTo$default($this$readBytes, (OutputStream)buffer, 0, 2, (Object)null);
      byte[] var10000 = buffer.toByteArray();
      Intrinsics.checkNotNullExpressionValue(var10000, "toByteArray(...)");
      return var10000;
   }
}
