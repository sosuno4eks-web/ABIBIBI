package kotlinx.serialization.builtins;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;
import kotlin.time.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.LongSerializer;
import org.jetbrains.annotations.NotNull;

@ExperimentalTime
public final class InstantComponentSerializer implements KSerializer<Instant> {
   @NotNull
   public static final InstantComponentSerializer INSTANCE = new InstantComponentSerializer();
   @NotNull
   private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.serialization.InstantComponentSerializer", new SerialDescriptor[0], InstantComponentSerializer::descriptor$lambda$0);

   private InstantComponentSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   @NotNull
   public Instant deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$decodeStructure = false;
      CompositeDecoder composite$iv = decoder.beginStructure(descriptor$iv);
      CompositeDecoder $this$deserialize_u24lambda_u241 = composite$iv;
      int var7 = false;
      boolean epochSecondsNotSeen = true;
      long epochSeconds = 0L;
      int nanosecondsOfSecond = 0;

      while(true) {
         int index = $this$deserialize_u24lambda_u241.decodeElementIndex(INSTANCE.getDescriptor());
         switch(index) {
         case -1:
            if (epochSecondsNotSeen) {
               throw new MissingFieldException("epochSeconds", INSTANCE.getDescriptor().getSerialName());
            }

            Object result$iv = Instant.Companion.fromEpochSeconds(epochSeconds, nanosecondsOfSecond);
            composite$iv.endStructure(descriptor$iv);
            return result$iv;
         case 0:
            epochSecondsNotSeen = false;
            epochSeconds = $this$deserialize_u24lambda_u241.decodeLongElement(INSTANCE.getDescriptor(), 0);
            break;
         case 1:
            nanosecondsOfSecond = $this$deserialize_u24lambda_u241.decodeIntElement(INSTANCE.getDescriptor(), 1);
            break;
         default:
            throw new SerializationException("Unexpected index: " + index);
         }
      }
   }

   public void serialize(@NotNull Encoder encoder, @NotNull Instant value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$encodeStructure = false;
      CompositeEncoder composite$iv = encoder.beginStructure(descriptor$iv);
      int var8 = false;
      composite$iv.encodeLongElement(INSTANCE.getDescriptor(), 0, value.getEpochSeconds());
      if (value.getNanosecondsOfSecond() != 0 || composite$iv.shouldEncodeElementDefault(INSTANCE.getDescriptor(), 1)) {
         composite$iv.encodeIntElement(INSTANCE.getDescriptor(), 1, value.getNanosecondsOfSecond());
      }

      composite$iv.endStructure(descriptor$iv);
   }

   private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
      String elementName$iv = "epochSeconds";
      List annotations$iv = CollectionsKt.emptyList();
      boolean isOptional$iv = false;
      int $i$f$element = false;
      SerialDescriptor descriptor$iv = LongSerializer.INSTANCE.getDescriptor();
      $this$buildClassSerialDescriptor.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
      elementName$iv = "nanosecondsOfSecond";
      isOptional$iv = true;
      annotations$iv = CollectionsKt.emptyList();
      $i$f$element = false;
      descriptor$iv = LongSerializer.INSTANCE.getDescriptor();
      $this$buildClassSerialDescriptor.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
      return Unit.INSTANCE;
   }
}
