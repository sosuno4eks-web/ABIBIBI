package kotlinx.serialization.json;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.InternalJsonReader;
import kotlinx.serialization.json.internal.InternalJsonWriter;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public final class JvmStreamsKt {
   @ExperimentalSerializationApi
   public static final <T> void encodeToStream(@NotNull Json $this$encodeToStream, @NotNull SerializationStrategy<? super T> serializer, T value, @NotNull OutputStream stream) {
      Intrinsics.checkNotNullParameter($this$encodeToStream, "<this>");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      Intrinsics.checkNotNullParameter(stream, "stream");
      JsonToJavaStreamWriter writer = new JsonToJavaStreamWriter(stream);

      try {
         JsonStreamsKt.encodeByWriter($this$encodeToStream, (InternalJsonWriter)writer, serializer, value);
      } finally {
         writer.release();
      }

   }

   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static final <T> void encodeToStream(Json $this$encodeToStream, T value, OutputStream stream) {
      Intrinsics.checkNotNullParameter($this$encodeToStream, "<this>");
      Intrinsics.checkNotNullParameter(stream, "stream");
      int $i$f$encodeToStream = false;
      SerializersModule var4 = $this$encodeToStream.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      encodeToStream($this$encodeToStream, (SerializationStrategy)SerializersKt.serializer(var4, (KType)null), value, stream);
   }

   @ExperimentalSerializationApi
   public static final <T> T decodeFromStream(@NotNull Json $this$decodeFromStream, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull InputStream stream) {
      Intrinsics.checkNotNullParameter($this$decodeFromStream, "<this>");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(stream, "stream");
      JavaStreamSerialReader reader = new JavaStreamSerialReader(stream);

      Object var4;
      try {
         var4 = JsonStreamsKt.decodeByReader($this$decodeFromStream, deserializer, (InternalJsonReader)reader);
      } finally {
         reader.release();
      }

      return var4;
   }

   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static final <T> T decodeFromStream(Json $this$decodeFromStream, InputStream stream) {
      Intrinsics.checkNotNullParameter($this$decodeFromStream, "<this>");
      Intrinsics.checkNotNullParameter(stream, "stream");
      int $i$f$decodeFromStream = false;
      SerializersModule var3 = $this$decodeFromStream.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return decodeFromStream($this$decodeFromStream, (DeserializationStrategy)SerializersKt.serializer(var3, (KType)null), stream);
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final <T> Sequence<T> decodeToSequence(@NotNull Json $this$decodeToSequence, @NotNull InputStream stream, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull DecodeSequenceMode format) {
      Intrinsics.checkNotNullParameter($this$decodeToSequence, "<this>");
      Intrinsics.checkNotNullParameter(stream, "stream");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(format, "format");
      return JsonStreamsKt.decodeToSequenceByReader($this$decodeToSequence, (InternalJsonReader)(new JavaStreamSerialReader(stream)), deserializer, format);
   }

   // $FF: synthetic method
   public static Sequence decodeToSequence$default(Json var0, InputStream var1, DeserializationStrategy var2, DecodeSequenceMode var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = DecodeSequenceMode.AUTO_DETECT;
      }

      return decodeToSequence(var0, var1, var2, var3);
   }

   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static final <T> Sequence<T> decodeToSequence(Json $this$decodeToSequence, InputStream stream, DecodeSequenceMode format) {
      Intrinsics.checkNotNullParameter($this$decodeToSequence, "<this>");
      Intrinsics.checkNotNullParameter(stream, "stream");
      Intrinsics.checkNotNullParameter(format, "format");
      int $i$f$decodeToSequence = false;
      SerializersModule var4 = $this$decodeToSequence.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return decodeToSequence($this$decodeToSequence, stream, (DeserializationStrategy)SerializersKt.serializer(var4, (KType)null), format);
   }

   // $FF: synthetic method
   public static Sequence decodeToSequence$default(Json $this$decodeToSequence_u24default, InputStream stream, DecodeSequenceMode format, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         format = DecodeSequenceMode.AUTO_DETECT;
      }

      Intrinsics.checkNotNullParameter($this$decodeToSequence_u24default, "<this>");
      Intrinsics.checkNotNullParameter(stream, "stream");
      Intrinsics.checkNotNullParameter(format, "format");
      int $i$f$decodeToSequence = false;
      SerializersModule var6 = $this$decodeToSequence_u24default.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return decodeToSequence($this$decodeToSequence_u24default, stream, (DeserializationStrategy)SerializersKt.serializer(var6, (KType)null), format);
   }
}
