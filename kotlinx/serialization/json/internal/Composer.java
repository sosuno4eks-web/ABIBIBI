package kotlinx.serialization.json.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class Composer {
   @JvmField
   @NotNull
   public final InternalJsonWriter writer;
   private boolean writingFirst;

   public Composer(@NotNull InternalJsonWriter writer) {
      Intrinsics.checkNotNullParameter(writer, "writer");
      super();
      this.writer = writer;
      this.writingFirst = true;
   }

   public final boolean getWritingFirst() {
      return this.writingFirst;
   }

   protected final void setWritingFirst(boolean <set-?>) {
      this.writingFirst = var1;
   }

   public void indent() {
      this.writingFirst = true;
   }

   public void unIndent() {
   }

   public void nextItem() {
      this.writingFirst = false;
   }

   public void nextItemIfNotFirst() {
      this.writingFirst = false;
   }

   public void space() {
   }

   public final void print(char v) {
      this.writer.writeChar(v);
   }

   public final void print(@NotNull String v) {
      Intrinsics.checkNotNullParameter(v, "v");
      this.writer.write(v);
   }

   public void print(float v) {
      this.writer.write(String.valueOf(v));
   }

   public void print(double v) {
      this.writer.write(String.valueOf(v));
   }

   public void print(byte v) {
      this.writer.writeLong((long)v);
   }

   public void print(short v) {
      this.writer.writeLong((long)v);
   }

   public void print(int v) {
      this.writer.writeLong((long)v);
   }

   public void print(long v) {
      this.writer.writeLong(v);
   }

   public void print(boolean v) {
      this.writer.write(String.valueOf(v));
   }

   public void printQuoted(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      this.writer.writeQuoted(value);
   }
}
