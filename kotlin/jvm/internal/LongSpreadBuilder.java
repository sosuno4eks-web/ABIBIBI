package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class LongSpreadBuilder extends PrimitiveSpreadBuilder<long[]> {
   @NotNull
   private final long[] values;

   public LongSpreadBuilder(int size) {
      super(size);
      this.values = new long[size];
   }

   protected int getSize(@NotNull long[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(long value) {
      long[] var10000 = this.values;
      int var3 = this.getPosition();
      this.setPosition(var3 + 1);
      var10000[var3] = value;
   }

   @NotNull
   public final long[] toArray() {
      return (long[])this.toArray(this.values, new long[this.size()]);
   }
}
