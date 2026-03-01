package kotlinx.serialization.internal;

import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class UnitSerializer implements KSerializer<Unit> {
   @NotNull
   public static final UnitSerializer INSTANCE = new UnitSerializer();
   // $FF: synthetic field
   private final ObjectSerializer<Unit> $$delegate_0;

   private UnitSerializer() {
      this.$$delegate_0 = new ObjectSerializer("kotlin.Unit", Unit.INSTANCE);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.$$delegate_0.getDescriptor();
   }

   public void serialize(@NotNull Encoder encoder, @NotNull Unit value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      this.$$delegate_0.serialize(encoder, value);
   }

   public void deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      this.$$delegate_0.deserialize(decoder);
   }
}
