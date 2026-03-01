package kotlinx.serialization.json;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public final class JsonKt {
   @NotNull
   private static final String defaultIndent = "    ";
   @NotNull
   private static final String defaultDiscriminator = "type";

   @NotNull
   public static final Json Json(@NotNull Json from, @NotNull Function1<? super JsonBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(from, "from");
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      JsonBuilder builder = new JsonBuilder(from);
      builderAction.invoke(builder);
      JsonConfiguration conf = builder.build$kotlinx_serialization_json();
      return (Json)(new JsonImpl(conf, builder.getSerializersModule()));
   }

   // $FF: synthetic method
   public static Json Json$default(Json var0, Function1 var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var0 = (Json)Json.Default;
      }

      return Json(var0, var1);
   }

   // $FF: synthetic method
   public static final <T> JsonElement encodeToJsonElement(Json $this$encodeToJsonElement, T value) {
      Intrinsics.checkNotNullParameter($this$encodeToJsonElement, "<this>");
      int $i$f$encodeToJsonElement = false;
      SerializersModule var3 = $this$encodeToJsonElement.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return $this$encodeToJsonElement.encodeToJsonElement((SerializationStrategy)SerializersKt.serializer(var3, (KType)null), value);
   }

   // $FF: synthetic method
   public static final <T> T decodeFromJsonElement(Json $this$decodeFromJsonElement, JsonElement json) {
      Intrinsics.checkNotNullParameter($this$decodeFromJsonElement, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      int $i$f$decodeFromJsonElement = false;
      SerializersModule var3 = $this$decodeFromJsonElement.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return $this$decodeFromJsonElement.decodeFromJsonElement((DeserializationStrategy)SerializersKt.serializer(var3, (KType)null), json);
   }
}
