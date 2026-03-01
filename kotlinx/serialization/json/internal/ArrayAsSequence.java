package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class ArrayAsSequence implements CharSequence {
   @NotNull
   private final char[] buffer;
   private int length;

   public ArrayAsSequence(@NotNull char[] buffer) {
      Intrinsics.checkNotNullParameter(buffer, "buffer");
      super();
      this.buffer = buffer;
      this.length = this.buffer.length;
   }

   @NotNull
   public final char[] getBuffer$kotlinx_serialization_json() {
      return this.buffer;
   }

   public int getLength() {
      return this.length;
   }

   public void setLength(int <set-?>) {
      this.length = var1;
   }

   public char get(int index) {
      return this.buffer[index];
   }

   @NotNull
   public CharSequence subSequence(int startIndex, int endIndex) {
      return (CharSequence)StringsKt.concatToString(this.buffer, startIndex, Math.min(endIndex, this.length()));
   }

   @NotNull
   public final String substring(int startIndex, int endIndex) {
      return StringsKt.concatToString(this.buffer, startIndex, Math.min(endIndex, this.length()));
   }

   public final void trim(int newSize) {
      this.setLength(Math.min(this.buffer.length, newSize));
   }

   @NotNull
   public String toString() {
      return this.substring(0, this.length());
   }
}
