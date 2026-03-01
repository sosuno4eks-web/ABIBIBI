package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class IntArrayBuilder extends PrimitiveArrayBuilder<int[]> {
   @NotNull
   private int[] buffer;
   private int position;

   public IntArrayBuilder(@NotNull int[] bufferWithData) {
      Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
      super();
      this.buffer = bufferWithData;
      this.position = bufferWithData.length;
      this.ensureCapacity$kotlinx_serialization_core(10);
   }

   public int getPosition$kotlinx_serialization_core() {
      return this.position;
   }

   public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
      if (this.buffer.length < requiredCapacity) {
         int[] var10001 = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, this.buffer.length * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.buffer = var10001;
      }

   }

   public final void append$kotlinx_serialization_core(int c) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default((PrimitiveArrayBuilder)this, 0, 1, (Object)null);
      int[] var10000 = this.buffer;
      int var2 = this.getPosition$kotlinx_serialization_core();
      this.position = var2 + 1;
      var10000[var2] = c;
   }

   @NotNull
   public int[] build$kotlinx_serialization_core() {
      int[] var10000 = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }
}
