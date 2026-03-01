package kotlinx.serialization;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
public final class ContextualSerializer<T> implements KSerializer<T> {
   @NotNull
   private final KClass<T> serializableClass;
   @Nullable
   private final KSerializer<T> fallbackSerializer;
   @NotNull
   private final List<KSerializer<?>> typeArgumentsSerializers;
   @NotNull
   private final SerialDescriptor descriptor;

   public ContextualSerializer(@NotNull KClass<T> serializableClass, @Nullable KSerializer<T> fallbackSerializer, @NotNull KSerializer<?>[] typeArgumentsSerializers) {
      Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
      Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
      super();
      this.serializableClass = serializableClass;
      this.fallbackSerializer = fallbackSerializer;
      this.typeArgumentsSerializers = ArraysKt.asList(typeArgumentsSerializers);
      this.descriptor = ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", (SerialKind)SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], ContextualSerializer::descriptor$lambda$0), this.serializableClass);
   }

   private final KSerializer<T> serializer(SerializersModule serializersModule) {
      KSerializer var10000 = serializersModule.getContextual(this.serializableClass, this.typeArgumentsSerializers);
      if (var10000 == null) {
         var10000 = this.fallbackSerializer;
         if (var10000 == null) {
            Platform_commonKt.serializerNotRegistered(this.serializableClass);
            throw new KotlinNothingValueException();
         }
      }

      return var10000;
   }

   public ContextualSerializer(@NotNull KClass<T> serializableClass) {
      Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
      this(serializableClass, (KSerializer)null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      encoder.encodeSerializableValue((SerializationStrategy)this.serializer(encoder.getSerializersModule()), value);
   }

   @NotNull
   public T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return decoder.decodeSerializableValue((DeserializationStrategy)this.serializer(decoder.getSerializersModule()));
   }

   private static final Unit descriptor$lambda$0(ContextualSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      List var3;
      label16: {
         Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
         KSerializer var10001 = this$0.fallbackSerializer;
         if (var10001 != null) {
            SerialDescriptor var2 = var10001.getDescriptor();
            if (var2 != null) {
               var3 = var2.getAnnotations();
               break label16;
            }
         }

         var3 = null;
      }

      if (var3 == null) {
         var3 = CollectionsKt.emptyList();
      }

      $this$buildSerialDescriptor.setAnnotations(var3);
      return Unit.INSTANCE;
   }
}
