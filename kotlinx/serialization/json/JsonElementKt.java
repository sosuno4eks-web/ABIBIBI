package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonElementKt {
   @NotNull
   private static final SerialDescriptor jsonUnquotedLiteralDescriptor;

   @NotNull
   public static final JsonPrimitive JsonPrimitive(@Nullable Boolean value) {
      return value == null ? (JsonPrimitive)JsonNull.INSTANCE : (JsonPrimitive)(new JsonLiteral(value, false, (SerialDescriptor)null, 4, (DefaultConstructorMarker)null));
   }

   @NotNull
   public static final JsonPrimitive JsonPrimitive(@Nullable Number value) {
      return value == null ? (JsonPrimitive)JsonNull.INSTANCE : (JsonPrimitive)(new JsonLiteral(value, false, (SerialDescriptor)null, 4, (DefaultConstructorMarker)null));
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final JsonPrimitive JsonPrimitive_7apg3OU/* $FF was: JsonPrimitive-7apg3OU*/(byte value) {
      return JsonPrimitive-VKZWuLQ(ULong.constructor-impl((long)value & 255L));
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final JsonPrimitive JsonPrimitive_xj2QHRw/* $FF was: JsonPrimitive-xj2QHRw*/(short value) {
      return JsonPrimitive-VKZWuLQ(ULong.constructor-impl((long)value & 65535L));
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final JsonPrimitive JsonPrimitive_WZ4Q5Ns/* $FF was: JsonPrimitive-WZ4Q5Ns*/(int value) {
      return JsonPrimitive-VKZWuLQ(ULong.constructor-impl((long)value & 4294967295L));
   }

   @ExperimentalSerializationApi
   @SuppressAnimalSniffer
   @NotNull
   public static final JsonPrimitive JsonPrimitive_VKZWuLQ/* $FF was: JsonPrimitive-VKZWuLQ*/(long value) {
      return JsonUnquotedLiteral(Long.toUnsignedString(value));
   }

   @NotNull
   public static final JsonPrimitive JsonPrimitive(@Nullable String value) {
      return value == null ? (JsonPrimitive)JsonNull.INSTANCE : (JsonPrimitive)(new JsonLiteral(value, true, (SerialDescriptor)null, 4, (DefaultConstructorMarker)null));
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final JsonNull JsonPrimitive(@Nullable Void value) {
      return JsonNull.INSTANCE;
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final JsonPrimitive JsonUnquotedLiteral(@Nullable String value) {
      JsonPrimitive var10000;
      if (value == null) {
         var10000 = (JsonPrimitive)JsonNull.INSTANCE;
      } else {
         if (Intrinsics.areEqual((Object)value, (Object)JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
         }

         var10000 = (JsonPrimitive)(new JsonLiteral(value, false, jsonUnquotedLiteralDescriptor));
      }

      return var10000;
   }

   @NotNull
   public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
      return jsonUnquotedLiteralDescriptor;
   }

   @NotNull
   public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement $this$jsonPrimitive) {
      Intrinsics.checkNotNullParameter($this$jsonPrimitive, "<this>");
      JsonPrimitive var10000 = $this$jsonPrimitive instanceof JsonPrimitive ? (JsonPrimitive)$this$jsonPrimitive : null;
      if (($this$jsonPrimitive instanceof JsonPrimitive ? (JsonPrimitive)$this$jsonPrimitive : null) == null) {
         error($this$jsonPrimitive, "JsonPrimitive");
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @NotNull
   public static final JsonObject getJsonObject(@NotNull JsonElement $this$jsonObject) {
      Intrinsics.checkNotNullParameter($this$jsonObject, "<this>");
      JsonObject var10000 = $this$jsonObject instanceof JsonObject ? (JsonObject)$this$jsonObject : null;
      if (($this$jsonObject instanceof JsonObject ? (JsonObject)$this$jsonObject : null) == null) {
         error($this$jsonObject, "JsonObject");
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @NotNull
   public static final JsonArray getJsonArray(@NotNull JsonElement $this$jsonArray) {
      Intrinsics.checkNotNullParameter($this$jsonArray, "<this>");
      JsonArray var10000 = $this$jsonArray instanceof JsonArray ? (JsonArray)$this$jsonArray : null;
      if (($this$jsonArray instanceof JsonArray ? (JsonArray)$this$jsonArray : null) == null) {
         error($this$jsonArray, "JsonArray");
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   @NotNull
   public static final JsonNull getJsonNull(@NotNull JsonElement $this$jsonNull) {
      Intrinsics.checkNotNullParameter($this$jsonNull, "<this>");
      JsonNull var10000 = $this$jsonNull instanceof JsonNull ? (JsonNull)$this$jsonNull : null;
      if (($this$jsonNull instanceof JsonNull ? (JsonNull)$this$jsonNull : null) == null) {
         error($this$jsonNull, "JsonNull");
         throw new KotlinNothingValueException();
      } else {
         return var10000;
      }
   }

   public static final int getInt(@NotNull JsonPrimitive $this$int) {
      Intrinsics.checkNotNullParameter($this$int, "<this>");
      boolean var3 = false;

      long var5;
      try {
         int var4 = false;
         var5 = parseLongImpl($this$int);
      } catch (JsonDecodingException var7) {
         throw new NumberFormatException(var7.getMessage());
      }

      if (!(-2147483648L <= var5 ? var5 <= 2147483647L : false)) {
         throw new NumberFormatException($this$int.getContent() + " is not an Int");
      } else {
         return (int)var5;
      }
   }

   @Nullable
   public static final Integer getIntOrNull(@NotNull JsonPrimitive $this$intOrNull) {
      Intrinsics.checkNotNullParameter($this$intOrNull, "<this>");
      boolean var3 = false;

      Long var5;
      try {
         int var4 = false;
         var5 = parseLongImpl($this$intOrNull);
      } catch (JsonDecodingException var6) {
         var5 = null;
      }

      if (var5 != null) {
         long result = var5;
         return !(-2147483648L <= result ? result <= 2147483647L : false) ? null : (int)result;
      } else {
         return null;
      }
   }

   public static final long getLong(@NotNull JsonPrimitive $this$long) {
      Intrinsics.checkNotNullParameter($this$long, "<this>");
      boolean var1 = false;

      long var3;
      try {
         int var2 = false;
         var3 = parseLongImpl($this$long);
      } catch (JsonDecodingException var5) {
         throw new NumberFormatException(var5.getMessage());
      }

      return var3;
   }

   @Nullable
   public static final Long getLongOrNull(@NotNull JsonPrimitive $this$longOrNull) {
      Intrinsics.checkNotNullParameter($this$longOrNull, "<this>");
      boolean var1 = false;

      Long var3;
      try {
         int var2 = false;
         var3 = parseLongImpl($this$longOrNull);
      } catch (JsonDecodingException var4) {
         var3 = null;
      }

      return var3;
   }

   public static final double getDouble(@NotNull JsonPrimitive $this$double) {
      Intrinsics.checkNotNullParameter($this$double, "<this>");
      return Double.parseDouble($this$double.getContent());
   }

   @Nullable
   public static final Double getDoubleOrNull(@NotNull JsonPrimitive $this$doubleOrNull) {
      Intrinsics.checkNotNullParameter($this$doubleOrNull, "<this>");
      return StringsKt.toDoubleOrNull($this$doubleOrNull.getContent());
   }

   public static final float getFloat(@NotNull JsonPrimitive $this$float) {
      Intrinsics.checkNotNullParameter($this$float, "<this>");
      return Float.parseFloat($this$float.getContent());
   }

   @Nullable
   public static final Float getFloatOrNull(@NotNull JsonPrimitive $this$floatOrNull) {
      Intrinsics.checkNotNullParameter($this$floatOrNull, "<this>");
      return StringsKt.toFloatOrNull($this$floatOrNull.getContent());
   }

   public static final boolean getBoolean(@NotNull JsonPrimitive $this$boolean) {
      Intrinsics.checkNotNullParameter($this$boolean, "<this>");
      Boolean var10000 = StringOpsKt.toBooleanStrictOrNull($this$boolean.getContent());
      if (var10000 != null) {
         return var10000;
      } else {
         throw new IllegalStateException($this$boolean + " does not represent a Boolean");
      }
   }

   @Nullable
   public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive $this$booleanOrNull) {
      Intrinsics.checkNotNullParameter($this$booleanOrNull, "<this>");
      return StringOpsKt.toBooleanStrictOrNull($this$booleanOrNull.getContent());
   }

   @Nullable
   public static final String getContentOrNull(@NotNull JsonPrimitive $this$contentOrNull) {
      Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
      return $this$contentOrNull instanceof JsonNull ? null : $this$contentOrNull.getContent();
   }

   private static final Void error(JsonElement $this$error, String element) {
      throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass($this$error.getClass()) + " is not a " + element);
   }

   private static final <T> T exceptionToNull(Function0<? extends T> f) {
      boolean var1 = false;

      Object var2;
      try {
         var2 = f.invoke();
      } catch (JsonDecodingException var4) {
         var2 = null;
      }

      return var2;
   }

   private static final <T> T exceptionToNumberFormatException(Function0<? extends T> f) {
      boolean var1 = false;

      try {
         Object var2 = f.invoke();
         return var2;
      } catch (JsonDecodingException var4) {
         throw new NumberFormatException(var4.getMessage());
      }
   }

   @PublishedApi
   @NotNull
   public static final Void unexpectedJson(@NotNull String key, @NotNull String expected) {
      Intrinsics.checkNotNullParameter(key, "key");
      Intrinsics.checkNotNullParameter(expected, "expected");
      throw new IllegalArgumentException("Element " + key + " is not a " + expected);
   }

   public static final long parseLongImpl(@NotNull JsonPrimitive $this$parseLongImpl) {
      Intrinsics.checkNotNullParameter($this$parseLongImpl, "<this>");
      return (new StringJsonLexer($this$parseLongImpl.getContent())).consumeNumericLiteralFully();
   }

   static {
      jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
   }
}
