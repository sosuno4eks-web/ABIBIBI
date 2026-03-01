package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class ByteSpreadBuilder extends PrimitiveSpreadBuilder<byte[]> {
   @NotNull
   private final byte[] values;

   public ByteSpreadBuilder(int size) {
      super(size);
      this.values = new byte[size];
   }

   protected int getSize(@NotNull byte[] $this$getSize) {
      Intrinsics.checkNotNullParameter($this$getSize, "<this>");
      return $this$getSize.length;
   }

   public final void add(byte value) {
      byte[] var10000 = this.values;
      int var2 = this.getPosition();
      this.setPosition(var2 + 1);
      var10000[var2] = value;
   }

   @NotNull
   public final byte[] toArray() {
      return (byte[])this.toArray(this.values, new byte[this.size()]);
   }
}
