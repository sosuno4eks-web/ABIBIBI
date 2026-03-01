package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder<double[]> {
   @NotNull
   private final double[] values;

   public DoubleSpreadBuilder(int size) {
      super(size);
      this.values = new double[size];
   }

   protected int getSize(@NotNull double[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(double value) {
      double[] var10000 = this.values;
      int var3 = this.getPosition();
      this.setPosition(var3 + 1);
      var10000[var3] = value;
   }

   @NotNull
   public final double[] toArray() {
      return (double[])this.toArray(this.values, new double[this.size()]);
   }
}
