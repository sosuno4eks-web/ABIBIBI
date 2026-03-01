package kotlinx.serialization.json;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexer;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.InternalJsonWriter;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringJsonLexerKt;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;

public abstract class Json implements StringFormat {
   @NotNull
   public static final Json.Default Default = new Json.Default((DefaultConstructorMarker)null);
   @NotNull
   private final JsonConfiguration configuration;
   @NotNull
   private final SerializersModule serializersModule;
   /** @deprecated */
   @NotNull
   private final DescriptorSchemaCache _schemaCache;

   private Json(JsonConfiguration configuration, SerializersModule serializersModule) {
      this.configuration = configuration;
      this.serializersModule = serializersModule;
      this._schemaCache = new DescriptorSchemaCache();
   }

   @NotNull
   public final JsonConfiguration getConfiguration() {
      return this.configuration;
   }

   @NotNull
   public SerializersModule getSerializersModule() {
      return this.serializersModule;
   }

   /** @deprecated */
   @NotNull
   public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
      return this._schemaCache;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Should not be accessed directly, use Json.schemaCache accessor instead",
      replaceWith = @ReplaceWith(
   expression = "schemaCache",
   imports = {}
),
      level = DeprecationLevel.ERROR
   )
   public static void get_schemaCache$kotlinx_serialization_json$annotations() {
   }

   @NotNull
   public final <T> String encodeToString(@NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      JsonToStringWriter result = new JsonToStringWriter();

      String var4;
      try {
         JsonStreamsKt.encodeByWriter(this, (InternalJsonWriter)result, serializer, value);
         var4 = result.toString();
      } finally {
         result.release();
      }

      return var4;
   }

   public final <T> T decodeFromString(@NotNull DeserializationStrategy<? extends T> deserializer, @Language(value = "json",prefix = "",suffix = "") @NotNull String string) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(string, "string");
      StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(this, string);
      StreamingJsonDecoder input = new StreamingJsonDecoder(this, WriteMode.OBJ, (AbstractJsonLexer)lexer, deserializer.getDescriptor(), (StreamingJsonDecoder.DiscriminatorHolder)null);
      Object result = input.decodeSerializableValue(deserializer);
      lexer.expectEof();
      return result;
   }

   @NotNull
   public final <T> JsonElement encodeToJsonElement(@NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      return TreeJsonEncoderKt.writeJson(this, value, serializer);
   }

   public final <T> T decodeFromJsonElement(@NotNull DeserializationStrategy<? extends T> deserializer, @NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(element, "element");
      return TreeJsonDecoderKt.readJson(this, element, deserializer);
   }

   @NotNull
   public final JsonElement parseToJsonElement(@Language(value = "json",prefix = "",suffix = "") @NotNull String string) {
      Intrinsics.checkNotNullParameter(string, "string");
      return (JsonElement)this.decodeFromString((DeserializationStrategy)JsonElementSerializer.INSTANCE, string);
   }

   // $FF: synthetic method
   public final <T> String encodeToString(T value) {
      int $i$f$encodeToString = false;
      SerializersModule var3 = this.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return this.encodeToString((SerializationStrategy)SerializersKt.serializer(var3, (KType)null), value);
   }

   // $FF: synthetic method
   public final <T> T decodeFromString(@Language(value = "json",prefix = "",suffix = "") String string) {
      Intrinsics.checkNotNullParameter(string, "string");
      int $i$f$decodeFromString = false;
      SerializersModule var3 = this.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return this.decodeFromString((DeserializationStrategy)SerializersKt.serializer(var3, (KType)null), string);
   }

   // $FF: synthetic method
   public Json(JsonConfiguration configuration, SerializersModule serializersModule, DefaultConstructorMarker $constructor_marker) {
      this(configuration, serializersModule);
   }

   public static final class Default extends Json {
      private Default() {
         super(new JsonConfiguration(false, false, false, false, false, false, (String)null, false, false, (String)null, false, false, (JsonNamingStrategy)null, false, false, false, (ClassDiscriminatorMode)null, 131071, (DefaultConstructorMarker)null), SerializersModuleBuildersKt.EmptySerializersModule(), (DefaultConstructorMarker)null);
      }

      // $FF: synthetic method
      public Default(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
