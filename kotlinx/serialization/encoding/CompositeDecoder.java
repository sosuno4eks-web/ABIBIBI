package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CompositeDecoder {
   @NotNull
   CompositeDecoder.Companion Companion = CompositeDecoder.Companion.$$INSTANCE;
   int DECODE_DONE = -1;
   int UNKNOWN_NAME = -3;

   @NotNull
   SerializersModule getSerializersModule();

   void endStructure(@NotNull SerialDescriptor var1);

   @ExperimentalSerializationApi
   default boolean decodeSequentially() {
      return false;
   }

   int decodeElementIndex(@NotNull SerialDescriptor var1);

   default int decodeCollectionSize(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return -1;
   }

   boolean decodeBooleanElement(@NotNull SerialDescriptor var1, int var2);

   byte decodeByteElement(@NotNull SerialDescriptor var1, int var2);

   char decodeCharElement(@NotNull SerialDescriptor var1, int var2);

   short decodeShortElement(@NotNull SerialDescriptor var1, int var2);

   int decodeIntElement(@NotNull SerialDescriptor var1, int var2);

   long decodeLongElement(@NotNull SerialDescriptor var1, int var2);

   float decodeFloatElement(@NotNull SerialDescriptor var1, int var2);

   double decodeDoubleElement(@NotNull SerialDescriptor var1, int var2);

   @NotNull
   String decodeStringElement(@NotNull SerialDescriptor var1, int var2);

   @NotNull
   Decoder decodeInlineElement(@NotNull SerialDescriptor var1, int var2);

   <T> T decodeSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull DeserializationStrategy<? extends T> var3, @Nullable T var4);

   // $FF: synthetic method
   static Object decodeSerializableElement$default(CompositeDecoder var0, SerialDescriptor var1, int var2, DeserializationStrategy var3, Object var4, int var5, Object var6) {
      if (var6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
      } else {
         if ((var5 & 8) != 0) {
            var4 = null;
         }

         return var0.decodeSerializableElement(var1, var2, var3, var4);
      }
   }

   @ExperimentalSerializationApi
   @Nullable
   <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull DeserializationStrategy<? extends T> var3, @Nullable T var4);

   // $FF: synthetic method
   static Object decodeNullableSerializableElement$default(CompositeDecoder var0, SerialDescriptor var1, int var2, DeserializationStrategy var3, Object var4, int var5, Object var6) {
      if (var6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
      } else {
         if ((var5 & 8) != 0) {
            var4 = null;
         }

         return var0.decodeNullableSerializableElement(var1, var2, var3, var4);
      }
   }

   public static final class Companion {
      // $FF: synthetic field
      static final CompositeDecoder.Companion $$INSTANCE = new CompositeDecoder.Companion();
      public static final int DECODE_DONE = -1;
      public static final int UNKNOWN_NAME = -3;

      private Companion() {
      }
   }

   public static final class DefaultImpls {
      /** @deprecated */
      @ExperimentalSerializationApi
      @Deprecated
      public static boolean decodeSequentially(@NotNull CompositeDecoder $this) {
         return $this.decodeSequentially();
      }

      /** @deprecated */
      @Deprecated
      public static int decodeCollectionSize(@NotNull CompositeDecoder $this, @NotNull SerialDescriptor descriptor) {
         Intrinsics.checkNotNullParameter(descriptor, "descriptor");
         return $this.decodeCollectionSize(descriptor);
      }

      // $FF: synthetic method
      public static Object decodeSerializableElement$default(CompositeDecoder var0, SerialDescriptor var1, int var2, DeserializationStrategy var3, Object var4, int var5, Object var6) {
         return CompositeDecoder.decodeSerializableElement$default(var0, var1, var2, var3, var4, var5, var6);
      }

      // $FF: synthetic method
      public static Object decodeNullableSerializableElement$default(CompositeDecoder var0, SerialDescriptor var1, int var2, DeserializationStrategy var3, Object var4, int var5, Object var6) {
         return CompositeDecoder.decodeNullableSerializableElement$default(var0, var1, var2, var3, var4, var5, var6);
      }
   }
}
