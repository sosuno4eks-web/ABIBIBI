package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
   @NotNull
   private final KClass<ElementKlass> kClass;
   @NotNull
   private final SerialDescriptor descriptor;

   public ReferenceArraySerializer(@NotNull KClass<ElementKlass> kClass, @NotNull KSerializer<Element> eSerializer) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
      super(eSerializer, (DefaultConstructorMarker)null);
      this.kClass = kClass;
      this.descriptor = (SerialDescriptor)(new ArrayClassDesc(eSerializer.getDescriptor()));
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   protected int collectionSize(@NotNull Element[] $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.length;
   }

   @NotNull
   protected Iterator<Element> collectionIterator(@NotNull Element[] $this$collectionIterator) {
      Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
      return ArrayIteratorKt.iterator($this$collectionIterator);
   }

   @NotNull
   protected ArrayList<Element> builder() {
      return new ArrayList();
   }

   protected int builderSize(@NotNull ArrayList<Element> $this$builderSize) {
      Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
      return $this$builderSize.size();
   }

   @NotNull
   protected Element[] toResult(@NotNull ArrayList<Element> $this$toResult) {
      Intrinsics.checkNotNullParameter($this$toResult, "<this>");
      return PlatformKt.toNativeArrayImpl($this$toResult, this.kClass);
   }

   @NotNull
   protected ArrayList<Element> toBuilder(@NotNull Element[] $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      return new ArrayList((Collection)ArraysKt.asList($this$toBuilder));
   }

   protected void checkCapacity(@NotNull ArrayList<Element> $this$checkCapacity, int size) {
      Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
      $this$checkCapacity.ensureCapacity(size);
   }

   protected void insert(@NotNull ArrayList<Element> $this$insert, int index, Element element) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      $this$insert.add(index, element);
   }
}
