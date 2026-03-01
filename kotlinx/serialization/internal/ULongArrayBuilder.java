package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class ULongArrayBuilder extends PrimitiveArrayBuilder<ULongArray> {
   @NotNull
   private long[] buffer;
   private int position;

   private ULongArrayBuilder(long[] bufferWithData) {
      Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
      super();
      this.buffer = bufferWithData;
      this.position = ULongArray.getSize-impl(bufferWithData);
      this.ensureCapacity$kotlinx_serialization_core(10);
   }

   public int getPosition$kotlinx_serialization_core() {
      return this.position;
   }

   public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
      if (ULongArray.getSize-impl(this.buffer) < requiredCapacity) {
         long[] var10001 = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, ULongArray.getSize-impl(this.buffer) * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.buffer = ULongArray.constructor-impl(var10001);
      }

   }

   public final void append_VKZWuLQ$kotlinx_serialization_core/* $FF was: append-VKZWuLQ$kotlinx_serialization_core*/(long c) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default((PrimitiveArrayBuilder)this, 0, 1, (Object)null);
      long[] var10000 = this.buffer;
      int var3 = this.getPosition$kotlinx_serialization_core();
      this.position = var3 + 1;
      ULongArray.set-k8EXiF4(var10000, var3, c);
   }

   @NotNull
   public long[] build_Y2RjT0g$kotlinx_serialization_core/* $FF was: build-Y2RjT0g$kotlinx_serialization_core*/() {
      long[] var10000 = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return ULongArray.constructor-impl(var10000);
   }

   // $FF: synthetic method
   public ULongArrayBuilder(long[] bufferWithData, DefaultConstructorMarker $constructor_marker) {
      this(bufferWithData);
   }
}
