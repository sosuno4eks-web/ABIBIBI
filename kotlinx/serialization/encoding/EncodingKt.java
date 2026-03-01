package kotlinx.serialization.encoding;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class EncodingKt {
   public static final void encodeStructure(@NotNull Encoder $this$encodeStructure, @NotNull SerialDescriptor descriptor, @NotNull Function1<? super CompositeEncoder, Unit> block) {
      Intrinsics.checkNotNullParameter($this$encodeStructure, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$encodeStructure = false;
      CompositeEncoder composite = $this$encodeStructure.beginStructure(descriptor);
      block.invoke(composite);
      composite.endStructure(descriptor);
   }

   public static final void encodeCollection(@NotNull Encoder $this$encodeCollection, @NotNull SerialDescriptor descriptor, int collectionSize, @NotNull Function1<? super CompositeEncoder, Unit> block) {
      Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$encodeCollection = false;
      CompositeEncoder composite = $this$encodeCollection.beginCollection(descriptor, collectionSize);
      block.invoke(composite);
      composite.endStructure(descriptor);
   }

   public static final <E> void encodeCollection(@NotNull Encoder $this$encodeCollection, @NotNull SerialDescriptor descriptor, @NotNull Collection<? extends E> collection, @NotNull Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> block) {
      Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(collection, "collection");
      Intrinsics.checkNotNullParameter(block, "block");
      int $i$f$encodeCollection = false;
      int collectionSize$iv = collection.size();
      int $i$f$encodeCollection = false;
      CompositeEncoder composite$iv = $this$encodeCollection.beginCollection(descriptor, collectionSize$iv);
      CompositeEncoder $this$encodeCollection_u24lambda_u241 = composite$iv;
      int var11 = false;
      Iterable $this$forEachIndexed$iv = (Iterable)collection;
      int $i$f$forEachIndexed = false;
      int index$iv = 0;
      Iterator var15 = $this$forEachIndexed$iv.iterator();

      while(var15.hasNext()) {
         Object item$iv = var15.next();
         int var17 = index$iv++;
         if (var17 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var20 = false;
         block.invoke($this$encodeCollection_u24lambda_u241, var17, item$iv);
      }

      composite$iv.endStructure(descriptor);
   }
}
