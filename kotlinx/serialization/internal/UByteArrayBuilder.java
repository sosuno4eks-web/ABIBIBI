package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.PublishedApi;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@PublishedApi
@ExperimentalUnsignedTypes
public final class UByteArrayBuilder extends PrimitiveArrayBuilder<UByteArray> {
   @NotNull
   private byte[] buffer;
   private int position;

   private UByteArrayBuilder(byte[] bufferWithData) {
      Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
      super();
      this.buffer = bufferWithData;
      this.position = UByteArray.getSize-impl(bufferWithData);
      this.ensureCapacity$kotlinx_serialization_core(10);
   }

   public int getPosition$kotlinx_serialization_core() {
      return this.position;
   }

   public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
      if (UByteArray.getSize-impl(this.buffer) < requiredCapacity) {
         byte[] var10001 = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, UByteArray.getSize-impl(this.buffer) * 2));
         Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
         this.buffer = UByteArray.constructor-impl(var10001);
      }

   }

   public final void append_7apg3OU$kotlinx_serialization_core/* $FF was: append-7apg3OU$kotlinx_serialization_core*/(byte c) {
      PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default((PrimitiveArrayBuilder)this, 0, 1, (Object)null);
      byte[] var10000 = this.buffer;
      int var2 = this.getPosition$kotlinx_serialization_core();
      this.position = var2 + 1;
      UByteArray.set-VurrAj0(var10000, var2, c);
   }

   @NotNull
   public byte[] build_TcUX1vc$kotlinx_serialization_core/* $FF was: build-TcUX1vc$kotlinx_serialization_core*/() {
      byte[] var10000 = Arrays.copyOf(this.buffer, this.getPosition$kotlinx_serialization_core());
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return UByteArray.constructor-impl(var10000);
   }

   // $FF: synthetic method
   public UByteArrayBuilder(byte[] bufferWithData, DefaultConstructorMarker $constructor_marker) {
      this(bufferWithData);
   }
}
