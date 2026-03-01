package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class UShortArrayBuilder extends PrimitiveArrayBuilder<UShortArray> {
   @NotNull
   private short[] buffer;
   private int position;

   private UShortArrayBuilder(short[] bufferWithData) {
      Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
      super();
      this.buffer = bufferWithData;
      this.position = UShortArray.getSize-impl(bufferWithData);
      this.ensureCapacity$kotlinx_serialization_core(10);
   }

   public int getPosition$kotlinx_serialization_core() {
      return this.position;
   }

   public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
      if (UShortArray.getSize-impl(this.buffer) < requiredCapacity) {
         short[] var10001 = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, UShortArray.getSize-impl(this.buffer) * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.buffer = UShortArray.constructor-impl(var10001);
      }

   }

   public final void append_xj2QHRw$kotlinx_serialization_core/* $FF was: append-xj2QHRw$kotlinx_serialization_core*/(short c) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default((PrimitiveArrayBuilder)this, 0, 1, (Object)null);
      short[] var10000 = this.buffer;
      int var2 = this.getPosition$kotlinx_serialization_core();
      this.position = var2 + 1;
      UShortArray.set-01HTLdE(var10000, var2, c);
   }

   @NotNull
   public short[] build_amswpOA$kotlinx_serialization_core/* $FF was: build-amswpOA$kotlinx_serialization_core*/() {
      short[] var10000 = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UShortArray.constructor-impl(var10000);
   }

   // $FF: synthetic method
   public UShortArrayBuilder(short[] bufferWithData, DefaultConstructorMarker $constructor_marker) {
      this(bufferWithData);
   }
}
