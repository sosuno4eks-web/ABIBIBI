package kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public final class SerialFormatKt {
   // $FF: synthetic method
   public static final <T> String encodeToString(StringFormat $this$encodeToString, T value) {
      Intrinsics.checkNotNullParameter($this$encodeToString, "<this>");
      int $i$f$encodeToString = false;
      SerializersModule var3 = $this$encodeToString.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return $this$encodeToString.encodeToString((SerializationStrategy)SerializersKt.serializer(var3, (KType)null), value);
   }

   // $FF: synthetic method
   public static final <T> T decodeFromString(StringFormat $this$decodeFromString, String string) {
      Intrinsics.checkNotNullParameter($this$decodeFromString, "<this>");
      Intrinsics.checkNotNullParameter(string, "string");
      int $i$f$decodeFromString = false;
      SerializersModule var3 = $this$decodeFromString.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return $this$decodeFromString.decodeFromString((DeserializationStrategy)SerializersKt.serializer(var3, (KType)null), string);
   }

   @NotNull
   public static final <T> String encodeToHexString(@NotNull BinaryFormat $this$encodeToHexString, @NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter($this$encodeToHexString, "<this>");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      return InternalHexConverter.INSTANCE.printHexBinary($this$encodeToHexString.encodeToByteArray(serializer, value), true);
   }

   public static final <T> T decodeFromHexString(@NotNull BinaryFormat $this$decodeFromHexString, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull String hex) {
      Intrinsics.checkNotNullParameter($this$decodeFromHexString, "<this>");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      Intrinsics.checkNotNullParameter(hex, "hex");
      return $this$decodeFromHexString.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex));
   }

   // $FF: synthetic method
   public static final <T> String encodeToHexString(BinaryFormat $this$encodeToHexString, T value) {
      Intrinsics.checkNotNullParameter($this$encodeToHexString, "<this>");
      int $i$f$encodeToHexString = false;
      SerializersModule var3 = $this$encodeToHexString.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return encodeToHexString($this$encodeToHexString, (SerializationStrategy)SerializersKt.serializer(var3, (KType)null), value);
   }

   // $FF: synthetic method
   public static final <T> T decodeFromHexString(BinaryFormat $this$decodeFromHexString, String hex) {
      Intrinsics.checkNotNullParameter($this$decodeFromHexString, "<this>");
      Intrinsics.checkNotNullParameter(hex, "hex");
      int $i$f$decodeFromHexString = false;
      SerializersModule var3 = $this$decodeFromHexString.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return decodeFromHexString($this$decodeFromHexString, (DeserializationStrategy)SerializersKt.serializer(var3, (KType)null), hex);
   }

   // $FF: synthetic method
   public static final <T> byte[] encodeToByteArray(BinaryFormat $this$encodeToByteArray, T value) {
      Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
      int $i$f$encodeToByteArray = false;
      SerializersModule var3 = $this$encodeToByteArray.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return $this$encodeToByteArray.encodeToByteArray((SerializationStrategy)SerializersKt.serializer(var3, (KType)null), value);
   }

   // $FF: synthetic method
   public static final <T> T decodeFromByteArray(BinaryFormat $this$decodeFromByteArray, byte[] bytes) {
      Intrinsics.checkNotNullParameter($this$decodeFromByteArray, "<this>");
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      int $i$f$decodeFromByteArray = false;
      SerializersModule var3 = $this$decodeFromByteArray.getSerializersModule();
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
      return $this$decodeFromByteArray.decodeFromByteArray((DeserializationStrategy)SerializersKt.serializer(var3, (KType)null), bytes);
   }
}
