package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class ShortSpreadBuilder extends PrimitiveSpreadBuilder<short[]> {
   @NotNull
   private final short[] values;

   public ShortSpreadBuilder(int size) {
      super(size);
      this.values = new short[size];
   }

   protected int getSize(@NotNull short[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(short value) {
      short[] var10000 = this.values;
      int var2 = this.getPosition();
      this.setPosition(var2 + 1);
      var10000[var2] = value;
   }

   @NotNull
   public final short[] toArray() {
      return (short[])this.toArray(this.values, new short[this.size()]);
   }
}
