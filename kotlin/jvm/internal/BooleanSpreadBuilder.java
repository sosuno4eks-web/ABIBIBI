package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class BooleanSpreadBuilder extends PrimitiveSpreadBuilder<boolean[]> {
   @NotNull
   private final boolean[] values;

   public BooleanSpreadBuilder(int size) {
      super(size);
      this.values = new boolean[size];
   }

   protected int getSize(@NotNull boolean[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(boolean value) {
      boolean[] var10000 = this.values;
      int var2 = this.getPosition();
      this.setPosition(var2 + 1);
      var10000[var2] = value;
   }

   @NotNull
   public final boolean[] toArray() {
      return (boolean[])this.toArray(this.values, new boolean[this.size()]);
   }
}
