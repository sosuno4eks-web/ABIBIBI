package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

public final class TreeJsonEncoderKt {
   @NotNull
   public static final String PRIMITIVE_TAG = "primitive";

   @JsonFriendModuleApi
   @NotNull
   public static final <T> JsonElement writeJson(@NotNull Json json, T value, @NotNull SerializationStrategy<? super T> serializer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      Ref.ObjectRef result = new Ref.ObjectRef();
      JsonTreeEncoder encoder = new JsonTreeEncoder(json, TreeJsonEncoderKt::writeJson$lambda$0);
      encoder.encodeSerializableValue(serializer, value);
      JsonElement var10000;
      if (result.element == null) {
         Intrinsics.throwUninitializedPropertyAccessException("result");
         var10000 = null;
      } else {
         var10000 = (JsonElement)result.element;
      }

      return var10000;
   }

   private static final boolean getRequiresTopLevelTag(SerialDescriptor $this$requiresTopLevelTag) {
      return $this$requiresTopLevelTag.getKind() instanceof PrimitiveKind || $this$requiresTopLevelTag.getKind() == SerialKind.ENUM.INSTANCE;
   }

   // $FF: synthetic method
   public static final <T extends JsonElement> T cast(JsonElement value, String serialName, Function0<String> path) {
      Intrinsics.checkNotNullParameter(value, "value");
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(path, "path");
      int $i$f$cast = false;
      Intrinsics.reifiedOperationMarker(3, "T");
      if (!(value instanceof JsonElement)) {
         StringBuilder var10001 = (new StringBuilder()).append("Expected ");
         Intrinsics.reifiedOperationMarker(4, "T");
         throw JsonExceptionsKt.JsonDecodingException(-1, var10001.append(Reflection.getOrCreateKotlinClass(JsonElement.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName).append(" at element: ").append((String)path.invoke()).toString(), (CharSequence)value.toString());
      } else {
         return value;
      }
   }

   private static final Unit writeJson$lambda$0(Ref.ObjectRef $result, JsonElement it) {
      Intrinsics.checkNotNullParameter(it, "it");
      $result.element = it;
      return Unit.INSTANCE;
   }

   // $FF: synthetic method
   public static final boolean access$getRequiresTopLevelTag(SerialDescriptor $receiver) {
      return getRequiresTopLevelTag($receiver);
   }
}
