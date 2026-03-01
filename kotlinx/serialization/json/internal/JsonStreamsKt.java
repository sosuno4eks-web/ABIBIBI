package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public final class JsonStreamsKt {
   private static final int SINGLE_CHAR_MAX_CODEPOINT = 65535;
   private static final int HIGH_SURROGATE_HEADER = 55232;
   private static final int LOW_SURROGATE_HEADER = 56320;

   @JsonFriendModuleApi
   public static final <T> void encodeByWriter(@NotNull Json json, @NotNull InternalJsonWriter writer, @NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(writer, "writer");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      StreamingJsonEncoder encoder = new StreamingJsonEncoder(writer, json, WriteMode.OBJ, new JsonEncoder[WriteMode.getEntries().size()]);
      encoder.encodeSerializableValue(serializer, value);
   }

   @JsonFriendModuleApi
   public static final <T> T decodeByReader(@NotNull Json json, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull InternalJsonReader reader) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(reader, "reader");
      ReaderJsonLexer lexer = ReaderJsonLexerKt.ReaderJsonLexer$default(json, reader, (char[])null, 4, (Object)null);

      Object var6;
      try {
         StreamingJsonDecoder input = new StreamingJsonDecoder(json, WriteMode.OBJ, (AbstractJsonLexer)lexer, deserializer.getDescriptor(), (StreamingJsonDecoder.DiscriminatorHolder)null);
         Object result = input.decodeSerializableValue(deserializer);
         lexer.expectEof();
         var6 = result;
      } finally {
         lexer.release();
      }

      return var6;
   }

   @JsonFriendModuleApi
   @ExperimentalSerializationApi
   @NotNull
   public static final <T> Sequence<T> decodeToSequenceByReader(@NotNull Json json, @NotNull InternalJsonReader reader, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull DecodeSequenceMode format) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(reader, "reader");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(format, "format");
      ReaderJsonLexer lexer = ReaderJsonLexerKt.ReaderJsonLexer(json, reader, new char[16384]);
      Iterator iter = JsonIteratorKt.JsonIterator(format, json, lexer, deserializer);
      return SequencesKt.constrainOnce((Sequence)(new JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1(iter)));
   }

   // $FF: synthetic method
   public static Sequence decodeToSequenceByReader$default(Json var0, InternalJsonReader var1, DeserializationStrategy var2, DecodeSequenceMode var3, int var4, Object var5) {
      if ((var4 & 8) != 0) {
         var3 = DecodeSequenceMode.AUTO_DETECT;
      }

      return decodeToSequenceByReader(var0, var1, var2, var3);
   }

   // $FF: synthetic method
   @JsonFriendModuleApi
   @ExperimentalSerializationApi
   public static final <T> Sequence<T> decodeToSequenceByReader(Json json, InternalJsonReader reader, DecodeSequenceMode format) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(reader, "reader");
      Intrinsics.checkNotNullParameter(format, "format");
      int $i$f$decodeToSequenceByReader = false;
      SerializersModule var4 = json.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return decodeToSequenceByReader(json, reader, (DeserializationStrategy)SerializersKt.serializer(var4, (KType)null), format);
   }

   // $FF: synthetic method
   public static Sequence decodeToSequenceByReader$default(Json json, InternalJsonReader reader, DecodeSequenceMode format, int var3, Object var4) {
      if ((var3 & 4) != 0) {
         format = DecodeSequenceMode.AUTO_DETECT;
      }

      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(reader, "reader");
      Intrinsics.checkNotNullParameter(format, "format");
      int $i$f$decodeToSequenceByReader = false;
      SerializersModule var6 = json.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return decodeToSequenceByReader(json, reader, (DeserializationStrategy)SerializersKt.serializer(var6, (KType)null), format);
   }
}
