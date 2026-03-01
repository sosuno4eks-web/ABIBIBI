package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {
   @NotNull
   private final float[] values;

   public FloatSpreadBuilder(int size) {
      super(size);
      this.values = new float[size];
   }

   protected int getSize(@NotNull float[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(float value) {
      float[] var10000 = this.values;
      int var2 = this.getPosition();
      this.setPosition(var2 + 1);
      var10000[var2] = value;
   }

   @NotNull
   public final float[] toArray() {
      return (float[])this.toArray(this.values, new float[this.size()]);
   }
}
