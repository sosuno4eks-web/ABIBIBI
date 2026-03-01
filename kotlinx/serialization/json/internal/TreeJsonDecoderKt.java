package kotlinx.serialization.json.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

public final class TreeJsonDecoderKt {
   @JsonFriendModuleApi
   public static final <T> T readJson(@NotNull Json json, @NotNull JsonElement element, @NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(element, "element");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      AbstractJsonTreeDecoder var10000;
      if (element instanceof JsonObject) {
         var10000 = (AbstractJsonTreeDecoder)(new JsonTreeDecoder(json, (JsonObject)element, (String)null, (SerialDescriptor)null, 12, (DefaultConstructorMarker)null));
      } else if (element instanceof JsonArray) {
         var10000 = (AbstractJsonTreeDecoder)(new JsonTreeListDecoder(json, (JsonArray)element));
      } else {
         if (!(element instanceof JsonLiteral) && !Intrinsics.areEqual((Object)element, (Object)JsonNull.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
         }

         var10000 = (AbstractJsonTreeDecoder)(new JsonPrimitiveDecoder(json, (JsonElement)((JsonPrimitive)element), (String)null, 4, (DefaultConstructorMarker)null));
      }

      AbstractJsonTreeDecoder input = var10000;
      return input.decodeSerializableValue(deserializer);
   }

   public static final <T> T readPolymorphicJson(@NotNull Json $this$readPolymorphicJson, @NotNull String discriminator, @NotNull JsonObject element, @NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter($this$readPolymorphicJson, "<this>");
      Intrinsics.checkNotNullParameter(discriminator, "discriminator");
      Intrinsics.checkNotNullParameter(element, "element");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return (new JsonTreeDecoder($this$readPolymorphicJson, element, discriminator, deserializer.getDescriptor())).decodeSerializableValue(deserializer);
   }
}
