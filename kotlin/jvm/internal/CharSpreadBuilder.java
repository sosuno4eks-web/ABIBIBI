package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class CharSpreadBuilder extends PrimitiveSpreadBuilder<char[]> {
   @NotNull
   private final char[] values;

   public CharSpreadBuilder(int size) {
      super(size);
      this.values = new char[size];
   }

   protected int getSize(@NotNull char[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(char value) {
      char[] var10000 = this.values;
      int var2 = this.getPosition();
      this.setPosition(var2 + 1);
      var10000[var2] = value;
   }

   @NotNull
   public final char[] toArray() {
      return (char[])this.toArray(this.values, new char[this.size()]);
   }
}
