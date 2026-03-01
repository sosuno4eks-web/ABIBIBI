package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class LongArrayBuilder extends PrimitiveArrayBuilder<long[]> {
   @NotNull
   private long[] buffer;
   private int position;

   public LongArrayBuilder(@NotNull long[] bufferWithData) {
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
         long[] var10001 = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, this.buffer.length * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.buffer = var10001;
      }

   }

   public final void append$kotlinx_serialization_core(long c) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default((PrimitiveArrayBuilder)this, 0, 1, (Object)null);
      long[] var10000 = this.buffer;
      int var3 = this.getPosition$kotlinx_serialization_core();
      this.position = var3 + 1;
      var10000[var3] = c;
   }

   @NotNull
   public long[] build$kotlinx_serialization_core() {
      long[] var10000 = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }
}
