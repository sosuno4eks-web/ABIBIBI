package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class IntSpreadBuilder extends PrimitiveSpreadBuilder<int[]> {
   @NotNull
   private final int[] values;

   public IntSpreadBuilder(int size) {
      super(size);
      this.values = new int[size];
   }

   protected int getSize(@NotNull int[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(int value) {
      int[] var10000 = this.values;
      int var2 = this.getPosition();
      this.setPosition(var2 + 1);
      var10000[var2] = value;
   }

   @NotNull
   public final int[] toArray() {
      return (int[])this.toArray(this.values, new int[this.size()]);
   }
}
