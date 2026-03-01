package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

public final class StreamingJsonEncoderKt {
   @NotNull
   private static final Set<SerialDescriptor> unsignedNumberDescriptors;

   public static final boolean isUnsignedNumber(@NotNull SerialDescriptor $this$isUnsignedNumber) {
      Intrinsics.checkNotNullParameter($this$isUnsignedNumber, "<this>");
      return $this$isUnsignedNumber.isInline() && unsignedNumberDescriptors.contains($this$isUnsignedNumber);
   }

   public static final boolean isUnquotedLiteral(@NotNull SerialDescriptor $this$isUnquotedLiteral) {
      Intrinsics.checkNotNullParameter($this$isUnquotedLiteral, "<this>");
      return $this$isUnquotedLiteral.isInline() && Intrinsics.areEqual((Object)$this$isUnquotedLiteral, (Object)JsonElementKt.getJsonUnquotedLiteralDescriptor());
   }

   static {
      SerialDescriptor[] var0 = new SerialDescriptor[]{BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(), BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor()};
      unsignedNumberDescriptors = SetsKt.setOf(var0);
   }
}
