package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class UIntArrayBuilder extends PrimitiveArrayBuilder<UIntArray> {
   @NotNull
   private int[] buffer;
   private int position;

   private UIntArrayBuilder(int[] bufferWithData) {
      Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
      super();
      this.buffer = bufferWithData;
      this.position = UIntArray.getSize-impl(bufferWithData);
      this.ensureCapacity$kotlinx_serialization_core(10);
   }

   public int getPosition$kotlinx_serialization_core() {
      return this.position;
   }

   public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
      if (UIntArray.getSize-impl(this.buffer) < requiredCapacity) {
         int[] var10001 = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, UIntArray.getSize-impl(this.buffer) * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.buffer = UIntArray.constructor-impl(var10001);
      }

   }

   public final void append_WZ4Q5Ns$kotlinx_serialization_core/* $FF was: append-WZ4Q5Ns$kotlinx_serialization_core*/(int c) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default((PrimitiveArrayBuilder)this, 0, 1, (Object)null);
      int[] var10000 = this.buffer;
      int var2 = this.getPosition$kotlinx_serialization_core();
      this.position = var2 + 1;
      UIntArray.set-VXSXFK8(var10000, var2, c);
   }

   @NotNull
   public int[] build__hP7Qyg$kotlinx_serialization_core/* $FF was: build--hP7Qyg$kotlinx_serialization_core*/() {
      int[] var10000 = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UIntArray.constructor-impl(var10000);
   }

   // $FF: synthetic method
   public UIntArrayBuilder(int[] bufferWithData, DefaultConstructorMarker $constructor_marker) {
      this(bufferWithData);
   }
}
