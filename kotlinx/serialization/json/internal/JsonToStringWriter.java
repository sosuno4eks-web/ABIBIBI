package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class JsonToStringWriter implements InternalJsonWriter {
   @NotNull
   private char[] array;
   private int size;

   public JsonToStringWriter() {
      this.array = CharArrayPool.INSTANCE.take();
   }

   public void writeLong(long value) {
      this.write(String.valueOf(value));
   }

   public void writeChar(char char) {
      this.ensureAdditionalCapacity(1);
      char[] var10000 = this.array;
      int var2 = this.size++;
      var10000[var2] = var1;
   }

   public void write(@NotNull String text) {
      Intrinsics.checkNotNullParameter(text, "text");
      int length = text.length();
      if (length != 0) {
         this.ensureAdditionalCapacity(length);
         char[] var4 = this.array;
         int var5 = this.size;
         byte var6 = 0;
         int var7 = text.length();
         text.getChars(var6, var7, var4, var5);
         this.size += length;
      }
   }

   public void writeQuoted(@NotNull String text) {
      Intrinsics.checkNotNullParameter(text, "text");
      this.ensureAdditionalCapacity(text.length() + 2);
      char[] arr = this.array;
      int sz = this.size;
      arr[sz++] = '"';
      int length = text.length();
      byte var6 = 0;
      text.getChars(var6, length, arr, sz);
      int i = sz;

      for(int var8 = sz + length; i < var8; ++i) {
         int ch = arr[i];
         if (ch < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[ch] != 0) {
            this.appendStringSlowPath(i - sz, i, text);
            return;
         }
      }

      sz += length;
      arr[sz++] = '"';
      this.size = sz;
   }

   private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string) {
      int sz = currentSize;
      int i = firstEscapedChar;

      for(int var6 = string.length(); i < var6; ++i) {
         sz = this.ensureTotalCapacity(sz, 2);
         int ch = string.charAt(i);
         if (ch < StringOpsKt.getESCAPE_MARKERS().length) {
            byte marker = StringOpsKt.getESCAPE_MARKERS()[ch];
            if (marker == 0) {
               this.array[sz++] = (char)ch;
            } else if (marker == 1) {
               String var10000 = StringOpsKt.getESCAPE_STRINGS()[ch];
               Intrinsics.checkNotNull(var10000);
               String escapedString = var10000;
               sz = this.ensureTotalCapacity(sz, escapedString.length());
               char[] var11 = this.array;
               byte var12 = 0;
               int var13 = escapedString.length();
               escapedString.getChars(var12, var13, var11, sz);
               sz += escapedString.length();
               this.size = sz;
            } else {
               this.array[sz] = '\\';
               this.array[sz + 1] = (char)marker;
               sz += 2;
               this.size = sz;
            }
         } else {
            this.array[sz++] = (char)ch;
         }
      }

      sz = this.ensureTotalCapacity(sz, 1);
      this.array[sz++] = '"';
      this.size = sz;
   }

   public void release() {
      CharArrayPool.INSTANCE.release(this.array);
   }

   @NotNull
   public String toString() {
      return new String(this.array, 0, this.size);
   }

   private final void ensureAdditionalCapacity(int expected) {
      this.ensureTotalCapacity(this.size, expected);
   }

   private final int ensureTotalCapacity(int oldSize, int additional) {
      int newSize = oldSize + additional;
      if (this.array.length <= newSize) {
         char[] var10001 = Arrays.copyOf(this.array, RangesKt.coerceAtLeast(newSize, oldSize * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.array = var10001;
      }

      return oldSize;
   }
}
