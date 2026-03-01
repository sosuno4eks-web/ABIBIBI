package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

public abstract class JsonContentPolymorphicSerializer<T> implements KSerializer<T> {
   @NotNull
   private final KClass<T> baseClass;
   @NotNull
   private final SerialDescriptor descriptor;

   public JsonContentPolymorphicSerializer(@NotNull KClass<T> baseClass) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      super();
      this.baseClass = baseClass;
      this.descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + this.baseClass.getSimpleName() + '>', (SerialKind)PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], (Function1)null, 8, (Object)null);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      SerializationStrategy var10000 = encoder.getSerializersModule().getPolymorphic(this.baseClass, value);
      if (var10000 == null) {
         KSerializer var4 = SerializersKt.serializerOrNull(Reflection.getOrCreateKotlinClass(value.getClass()));
         if (var4 == null) {
            this.throwSubtypeNotRegistered(Reflection.getOrCreateKotlinClass(value.getClass()), this.baseClass);
            throw new KotlinNothingValueException();
         }

         var10000 = (SerializationStrategy)var4;
      }

      SerializationStrategy actualSerializer = var10000;
      ((KSerializer)actualSerializer).serialize(encoder, value);
   }

   @NotNull
   public final T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonDecoder input = JsonElementSerializersKt.asJsonDecoder(decoder);
      JsonElement tree = input.decodeJsonElement();
      DeserializationStrategy var10000 = this.selectDeserializer(tree);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
      KSerializer actualSerializer = (KSerializer)var10000;
      return input.getJson().decodeFromJsonElement((DeserializationStrategy)actualSerializer, tree);
   }

   @NotNull
   protected abstract DeserializationStrategy<T> selectDeserializer(@NotNull JsonElement var1);

   private final Void throwSubtypeNotRegistered(KClass<?> subClass, KClass<?> baseClass) {
      String var10000 = subClass.getSimpleName();
      if (var10000 == null) {
         var10000 = String.valueOf(subClass);
      }

      String subClassName = var10000;
      String scope = "in the scope of '" + baseClass.getSimpleName() + '\'';
      throw new SerializationException("Class '" + subClassName + "' is not registered for polymorphic serialization " + scope + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
   }
}
