package kotlinx.serialization.json;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import org.jetbrains.annotations.NotNull;

final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {
   @NotNull
   public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private JsonLiteralSerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull JsonLiteral value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      JsonElementSerializersKt.access$verify(encoder);
      if (value.isString()) {
         encoder.encodeString(value.getContent());
      } else if (value.getCoerceToInlineType$kotlinx_serialization_json() != null) {
         encoder.encodeInline(value.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(value.getContent());
      } else {
         Long var3 = StringsKt.toLongOrNull(value.getContent());
         boolean var6;
         long it;
         if (var3 != null) {
            it = ((Number)var3).longValue();
            var6 = false;
            encoder.encodeLong(it);
         } else {
            ULong var7 = UStringsKt.toULongOrNull(value.getContent());
            if (var7 != null) {
               it = var7.unbox-impl();
               var6 = false;
               encoder.encodeInline(BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor()).encodeLong(it);
            } else {
               Double var8 = StringsKt.toDoubleOrNull(value.getContent());
               if (var8 != null) {
                  double it = ((Number)var8).doubleValue();
                  var6 = false;
                  encoder.encodeDouble(it);
               } else {
                  Boolean var9 = StringsKt.toBooleanStrictOrNull(value.getContent());
                  if (var9 != null) {
                     boolean it = var9;
                     int var5 = false;
                     encoder.encodeBoolean(it);
                  } else {
                     encoder.encodeString(value.getContent());
                  }
               }
            }
         }
      }
   }

   @NotNull
   public JsonLiteral deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonElement result = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
      if (!(result instanceof JsonLiteral)) {
         throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(result.getClass()), (CharSequence)result.toString());
      } else {
         return (JsonLiteral)result;
      }
   }

   static {
      descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
   }
}
