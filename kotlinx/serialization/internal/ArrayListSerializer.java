package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@InternalSerializationApi
@PublishedApi
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {
   @NotNull
   private final SerialDescriptor descriptor;

   public ArrayListSerializer(@NotNull KSerializer<E> element) {
      Intrinsics.checkNotNullParameter(element, "element");
      super(element);
      this.descriptor = (SerialDescriptor)(new ArrayListClassDesc(element.getDescriptor()));
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   @NotNull
   protected ArrayList<E> builder() {
      return new ArrayList();
   }

   protected int builderSize(@NotNull ArrayList<E> $this$builderSize) {
      Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
      return $this$builderSize.size();
   }

   @NotNull
   protected List<E> toResult(@NotNull ArrayList<E> $this$toResult) {
      Intrinsics.checkNotNullParameter($this$toResult, "<this>");
      return (List)$this$toResult;
   }

   @NotNull
   protected ArrayList<E> toBuilder(@NotNull List<? extends E> $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      ArrayList var10000 = $this$toBuilder instanceof ArrayList ? (ArrayList)$this$toBuilder : null;
      if (($this$toBuilder instanceof ArrayList ? (ArrayList)$this$toBuilder : null) == null) {
         var10000 = new ArrayList((Collection)$this$toBuilder);
      }

      return var10000;
   }

   protected void checkCapacity(@NotNull ArrayList<E> $this$checkCapacity, int size) {
      Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
      $this$checkCapacity.ensureCapacity(size);
   }

   protected void insert(@NotNull ArrayList<E> $this$insert, int index, E element) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      $this$insert.add(index, element);
   }
}
