package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
   private AbstractCollectionSerializer() {
   }

   protected abstract int collectionSize(Collection var1);

   @NotNull
   protected abstract Iterator<Element> collectionIterator(Collection var1);

   protected abstract Builder builder();

   protected abstract int builderSize(Builder var1);

   protected abstract Collection toResult(Builder var1);

   protected abstract Builder toBuilder(Collection var1);

   protected abstract void checkCapacity(Builder var1, int var2);

   public abstract void serialize(@NotNull Encoder var1, Collection var2);

   @InternalSerializationApi
   public final Collection merge(@NotNull Decoder decoder, @Nullable Collection previous) {
      Object var10000;
      label22: {
         Intrinsics.checkNotNullParameter(decoder, "decoder");
         if (previous != null) {
            var10000 = this.toBuilder(previous);
            if (var10000 != null) {
               break label22;
            }
         }

         var10000 = this.builder();
      }

      Object builder = var10000;
      int startIndex = this.builderSize(builder);
      CompositeDecoder compositeDecoder = decoder.beginStructure(this.getDescriptor());
      if (compositeDecoder.decodeSequentially()) {
         this.readAll(compositeDecoder, builder, startIndex, this.readSize(compositeDecoder, builder));
      } else {
         while(true) {
            int index = compositeDecoder.decodeElementIndex(this.getDescriptor());
            if (index == -1) {
               break;
            }

            readElement$default(this, compositeDecoder, startIndex + index, builder, false, 8, (Object)null);
         }
      }

      compositeDecoder.endStructure(this.getDescriptor());
      return this.toResult(builder);
   }

   public Collection deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      return this.merge(decoder, (Object)null);
   }

   private final int readSize(CompositeDecoder decoder, Builder builder) {
      int size = decoder.decodeCollectionSize(this.getDescriptor());
      this.checkCapacity(builder, size);
      return size;
   }

   protected abstract void readElement(@NotNull CompositeDecoder var1, int var2, Builder var3, boolean var4);

   // $FF: synthetic method
   public static void readElement$default(AbstractCollectionSerializer var0, CompositeDecoder var1, int var2, Object var3, boolean var4, int var5, Object var6) {
      if (var6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
      } else {
         if ((var5 & 8) != 0) {
            var4 = true;
         }

         var0.readElement(var1, var2, var3, var4);
      }
   }

   protected abstract void readAll(@NotNull CompositeDecoder var1, Builder var2, int var3, int var4);

   // $FF: synthetic method
   public AbstractCollectionSerializer(DefaultConstructorMarker $constructor_marker) {
      this();
   }
}
