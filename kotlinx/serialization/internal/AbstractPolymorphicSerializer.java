package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
   @NotNull
   public abstract KClass<T> getBaseClass();

   public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      SerializationStrategy actualSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$encodeStructure = false;
      CompositeEncoder composite$iv = encoder.beginStructure(descriptor$iv);
      int var9 = false;
      composite$iv.encodeStringElement(this.getDescriptor(), 0, actualSerializer.getDescriptor().getSerialName());
      SerialDescriptor var10001 = this.getDescriptor();
      int $i$f$cast = false;
      Intrinsics.checkNotNull(actualSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
      composite$iv.encodeSerializableElement(var10001, 1, actualSerializer, value);
      composite$iv.endStructure(descriptor$iv);
   }

   @NotNull
   public final T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      SerialDescriptor descriptor$iv = this.getDescriptor();
      int $i$f$decodeStructure = false;
      CompositeDecoder composite$iv = decoder.beginStructure(descriptor$iv);
      CompositeDecoder $this$deserialize_u24lambda_u243 = composite$iv;
      int var7 = false;
      Ref.ObjectRef klassName = new Ref.ObjectRef();
      Object value = null;
      Object var10000;
      if (composite$iv.decodeSequentially()) {
         var10000 = access$decodeSequentially(this, composite$iv);
      } else {
         label32:
         while(true) {
            int index = $this$deserialize_u24lambda_u243.decodeElementIndex(this.getDescriptor());
            switch(index) {
            case -1:
               var10000 = value;
               if (value == null) {
                  int var16 = false;
                  String var17 = "Polymorphic value has not been read for class " + (String)klassName.element;
                  throw new IllegalArgumentException(var17.toString());
               }

               Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
               break label32;
            case 0:
               klassName.element = $this$deserialize_u24lambda_u243.decodeStringElement(this.getDescriptor(), index);
               break;
            case 1:
               Object var10001 = klassName.element;
               if (var10001 == null) {
                  int var12 = false;
                  String var15 = "Cannot read polymorphic value before its type token";
                  throw new IllegalArgumentException(var15.toString());
               }

               klassName.element = var10001;
               DeserializationStrategy serializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, $this$deserialize_u24lambda_u243, (String)klassName.element);
               value = CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u243, this.getDescriptor(), index, serializer, (Object)null, 8, (Object)null);
               break;
            default:
               SerializationException var18 = new SerializationException;
               StringBuilder var10002 = (new StringBuilder()).append("Invalid index in polymorphic deserialization of ");
               String var10003 = (String)klassName.element;
               if (var10003 == null) {
                  var10003 = "unknown class";
               }

               var18.<init>(var10002.append(var10003).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ").append(index).toString());
               throw var18;
            }
         }
      }

      Object result$iv = var10000;
      composite$iv.endStructure(descriptor$iv);
      return result$iv;
   }

   private final T decodeSequentially(CompositeDecoder compositeDecoder) {
      String klassName = compositeDecoder.decodeStringElement(this.getDescriptor(), 0);
      DeserializationStrategy serializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, klassName);
      return CompositeDecoder.decodeSerializableElement$default(compositeDecoder, this.getDescriptor(), 1, serializer, (Object)null, 8, (Object)null);
   }

   @InternalSerializationApi
   @Nullable
   public DeserializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.getSerializersModule().getPolymorphic(this.getBaseClass(), klassName);
   }

   @InternalSerializationApi
   @Nullable
   public SerializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      return encoder.getSerializersModule().getPolymorphic(this.getBaseClass(), value);
   }

   // $FF: synthetic method
   public static final Object access$decodeSequentially(AbstractPolymorphicSerializer $this, CompositeDecoder compositeDecoder) {
      return $this.decodeSequentially(compositeDecoder);
   }
}
