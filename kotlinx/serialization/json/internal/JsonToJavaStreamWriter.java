package kotlinx.serialization.json.internal;

import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class JsonToJavaStreamWriter implements InternalJsonWriter {
   @NotNull
   private final OutputStream stream;
   @NotNull
   private final byte[] buffer;
   @NotNull
   private char[] charArray;
   private int indexInBuffer;

   public JsonToJavaStreamWriter(@NotNull OutputStream stream) {
      Intrinsics.checkNotNullParameter(stream, "stream");
      super();
      this.stream = stream;
      this.buffer = ByteArrayPool.INSTANCE.take();
      this.charArray = CharArrayPool.INSTANCE.take();
   }

   public void writeLong(long value) {
      this.write(String.valueOf(value));
   }

   public void writeChar(char char) {
      this.writeUtf8CodePoint(var1);
   }

   public void write(@NotNull String text) {
      Intrinsics.checkNotNullParameter(text, "text");
      int length = text.length();
      this.ensureTotalCapacity(0, length);
      char[] var4 = this.charArray;
      byte var5 = 0;
      byte var6 = 0;
      text.getChars(var6, length, var4, var5);
      this.writeUtf8(this.charArray, length);
   }

   public void writeQuoted(@NotNull String text) {
      Intrinsics.checkNotNullParameter(text, "text");
      this.ensureTotalCapacity(0, text.length() + 2);
      char[] arr = this.charArray;
      arr[0] = '"';
      int length = text.length();
      byte var5 = 1;
      byte var6 = 0;
      text.getChars(var6, length, arr, var5);
      int i = 1;

      for(int var7 = 1 + length; i < var7; ++i) {
         int ch = arr[i];
         if (ch < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[ch] != 0) {
            this.appendStringSlowPath(i, text);
            return;
         }
      }

      arr[length + 1] = '"';
      this.writeUtf8(arr, length + 2);
      this.flush();
   }

   private final void appendStringSlowPath(int currentSize, String string) {
      int sz = currentSize;
      int i = currentSize - 1;

      for(int var5 = string.length(); i < var5; ++i) {
         sz = this.ensureTotalCapacity(sz, 2);
         int ch = string.charAt(i);
         if (ch < StringOpsKt.getESCAPE_MARKERS().length) {
            byte marker = StringOpsKt.getESCAPE_MARKERS()[ch];
            if (marker == 0) {
               this.charArray[sz++] = (char)ch;
            } else if (marker == 1) {
               String var10000 = StringOpsKt.getESCAPE_STRINGS()[ch];
               Intrinsics.checkNotNull(var10000);
               String escapedString = var10000;
               sz = this.ensureTotalCapacity(sz, escapedString.length());
               char[] var10 = this.charArray;
               byte var11 = 0;
               int var12 = escapedString.length();
               escapedString.getChars(var11, var12, var10, sz);
               sz += escapedString.length();
            } else {
               this.charArray[sz] = '\\';
               this.charArray[sz + 1] = (char)marker;
               sz += 2;
            }
         } else {
            this.charArray[sz++] = (char)ch;
         }
      }

      this.ensureTotalCapacity(sz, 1);
      this.charArray[sz++] = '"';
      this.writeUtf8(this.charArray, sz);
      this.flush();
   }

   private final int ensureTotalCapacity(int oldSize, int additional) {
      int newSize = oldSize + additional;
      if (this.charArray.length <= newSize) {
         char[] var10001 = Arrays.copyOf(this.charArray, RangesKt.coerceAtLeast(newSize, oldSize * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.charArray = var10001;
      }

      return oldSize;
   }

   public void release() {
      this.flush();
      CharArrayPool.INSTANCE.release(this.charArray);
      ByteArrayPool.INSTANCE.release(this.buffer);
   }

   private final void flush() {
      this.stream.write(this.buffer, 0, this.indexInBuffer);
      this.indexInBuffer = 0;
   }

   private final void ensure(int bytesCount) {
      int $i$f$ensure = false;
      int $i$f$rest = false;
      if (this.buffer.length - this.indexInBuffer < bytesCount) {
         this.flush();
      }

   }

   private final void write(int byte) {
      int $i$f$write = false;
      byte[] var10000 = this.buffer;
      int var3 = this.indexInBuffer++;
      var10000[var3] = (byte)var1;
   }

   private final int rest() {
      int $i$f$rest = false;
      return this.buffer.length - this.indexInBuffer;
   }

   private final void writeUtf8(char[] string, int count) {
      boolean var12;
      String var13;
      if (count < 0) {
         var12 = false;
         var13 = "count < 0";
         throw new IllegalArgumentException(var13.toString());
      } else if (count > string.length) {
         var12 = false;
         var13 = "count > string.length: " + count + " > " + string.length;
         throw new IllegalArgumentException(var13.toString());
      } else {
         int i = 0;

         while(true) {
            while(i < count) {
               int c = string[i];
               byte bytesCount$iv;
               boolean $i$f$write;
               int byte$iv;
               boolean $i$f$write;
               int codePoint;
               byte[] var10000;
               boolean $i$f$write;
               int var18;
               if (c < 128) {
                  bytesCount$iv = 1;
                  $i$f$write = false;
                  $i$f$write = false;
                  if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
                     this.flush();
                  }

                  $i$f$write = false;
                  var10000 = this.buffer;
                  byte$iv = this.indexInBuffer++;
                  var10000[byte$iv] = (byte)c;
                  ++i;
                  $i$f$write = false;
                  codePoint = i + (this.buffer.length - this.indexInBuffer);

                  for(int runLimit = Math.min(count, codePoint); i < runLimit; ++i) {
                     c = string[i];
                     if (c >= 128) {
                        break;
                     }

                     $i$f$write = false;
                     var10000 = this.buffer;
                     var18 = this.indexInBuffer++;
                     var10000[var18] = (byte)c;
                  }
               } else if (c < 2048) {
                  bytesCount$iv = 2;
                  $i$f$write = false;
                  $i$f$write = false;
                  if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
                     this.flush();
                  }

                  codePoint = c >> 6 | 192;
                  $i$f$write = false;
                  var10000 = this.buffer;
                  byte$iv = this.indexInBuffer++;
                  var10000[byte$iv] = (byte)codePoint;
                  codePoint = c & 63 | 128;
                  $i$f$write = false;
                  var10000 = this.buffer;
                  byte$iv = this.indexInBuffer++;
                  var10000[byte$iv] = (byte)codePoint;
                  ++i;
               } else if (c >= '\ud800' && c <= '\udfff') {
                  int low = i + 1 < count ? string[i + 1] : 0;
                  if (c <= '\udbff' && ('\udc00' <= low ? low < '\ue000' : false)) {
                     codePoint = 65536 + ((c & 1023) << 10 | low & 1023);
                     int bytesCount$iv = 4;
                     $i$f$write = false;
                     int $i$f$rest = false;
                     if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
                        this.flush();
                     }

                     byte$iv = codePoint >> 18 | 240;
                     $i$f$write = false;
                     var10000 = this.buffer;
                     int var20 = this.indexInBuffer++;
                     var10000[var20] = (byte)byte$iv;
                     byte$iv = codePoint >> 12 & 63 | 128;
                     $i$f$write = false;
                     var10000 = this.buffer;
                     var20 = this.indexInBuffer++;
                     var10000[var20] = (byte)byte$iv;
                     byte$iv = codePoint >> 6 & 63 | 128;
                     $i$f$write = false;
                     var10000 = this.buffer;
                     var20 = this.indexInBuffer++;
                     var10000[var20] = (byte)byte$iv;
                     byte$iv = codePoint & 63 | 128;
                     $i$f$write = false;
                     var10000 = this.buffer;
                     var20 = this.indexInBuffer++;
                     var10000[var20] = (byte)byte$iv;
                     i += 2;
                  } else {
                     int byte$iv = 1;
                     $i$f$write = false;
                     int $i$f$rest = false;
                     if (this.buffer.length - this.indexInBuffer < byte$iv) {
                        this.flush();
                     }

                     byte$iv = 63;
                     $i$f$write = false;
                     var10000 = this.buffer;
                     var18 = this.indexInBuffer++;
                     var10000[var18] = (byte)byte$iv;
                     ++i;
                  }
               } else {
                  bytesCount$iv = 3;
                  $i$f$write = false;
                  $i$f$write = false;
                  if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
                     this.flush();
                  }

                  codePoint = c >> 12 | 224;
                  $i$f$write = false;
                  var10000 = this.buffer;
                  byte$iv = this.indexInBuffer++;
                  var10000[byte$iv] = (byte)codePoint;
                  codePoint = c >> 6 & 63 | 128;
                  $i$f$write = false;
                  var10000 = this.buffer;
                  byte$iv = this.indexInBuffer++;
                  var10000[byte$iv] = (byte)codePoint;
                  codePoint = c & 63 | 128;
                  $i$f$write = false;
                  var10000 = this.buffer;
                  byte$iv = this.indexInBuffer++;
                  var10000[byte$iv] = (byte)codePoint;
                  ++i;
               }
            }

            return;
         }
      }
   }

   private final void writeUtf8CodePoint(int codePoint) {
      byte[] var10000;
      byte bytesCount$iv;
      boolean $i$f$write;
      int var5;
      boolean $i$f$rest;
      if (codePoint < 128) {
         bytesCount$iv = 1;
         $i$f$write = false;
         $i$f$rest = false;
         if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
            this.flush();
         }

         $i$f$write = false;
         var10000 = this.buffer;
         var5 = this.indexInBuffer++;
         var10000[var5] = (byte)codePoint;
      } else {
         int byte$iv;
         if (codePoint < 2048) {
            bytesCount$iv = 2;
            $i$f$write = false;
            $i$f$rest = false;
            if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
               this.flush();
            }

            byte$iv = codePoint >> 6 | 192;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
            byte$iv = codePoint & 63 | 128;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
         } else if (55296 <= codePoint ? codePoint < 57344 : false) {
            bytesCount$iv = 1;
            $i$f$write = false;
            $i$f$rest = false;
            if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
               this.flush();
            }

            bytesCount$iv = 63;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)bytesCount$iv;
         } else if (codePoint < 65536) {
            bytesCount$iv = 3;
            $i$f$write = false;
            $i$f$rest = false;
            if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
               this.flush();
            }

            byte$iv = codePoint >> 12 | 224;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
            byte$iv = codePoint >> 6 & 63 | 128;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
            byte$iv = codePoint & 63 | 128;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
         } else {
            if (codePoint > 1114111) {
               throw new JsonEncodingException("Unexpected code point: " + codePoint);
            }

            bytesCount$iv = 4;
            $i$f$write = false;
            $i$f$rest = false;
            if (this.buffer.length - this.indexInBuffer < bytesCount$iv) {
               this.flush();
            }

            byte$iv = codePoint >> 18 | 240;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
            byte$iv = codePoint >> 12 & 63 | 128;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
            byte$iv = codePoint >> 6 & 63 | 128;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
            byte$iv = codePoint & 63 | 128;
            $i$f$write = false;
            var10000 = this.buffer;
            var5 = this.indexInBuffer++;
            var10000[var5] = (byte)byte$iv;
         }
      }

   }
}
