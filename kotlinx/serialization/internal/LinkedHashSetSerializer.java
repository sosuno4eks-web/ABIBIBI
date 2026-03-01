package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class LinkedHashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, LinkedHashSet<E>> {
   @NotNull
   private final SerialDescriptor descriptor;

   public LinkedHashSetSerializer(@NotNull KSerializer<E> eSerializer) {
      Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
      super(eSerializer);
      this.descriptor = (SerialDescriptor)(new LinkedHashSetClassDesc(eSerializer.getDescriptor()));
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   @NotNull
   protected LinkedHashSet<E> builder() {
      return new LinkedHashSet();
   }

   protected int builderSize(@NotNull LinkedHashSet<E> $this$builderSize) {
      Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
      return $this$builderSize.size();
   }

   @NotNull
   protected Set<E> toResult(@NotNull LinkedHashSet<E> $this$toResult) {
      Intrinsics.checkNotNullParameter($this$toResult, "<this>");
      return (Set)$this$toResult;
   }

   @NotNull
   protected LinkedHashSet<E> toBuilder(@NotNull Set<? extends E> $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      LinkedHashSet var10000 = $this$toBuilder instanceof LinkedHashSet ? (LinkedHashSet)$this$toBuilder : null;
      if (($this$toBuilder instanceof LinkedHashSet ? (LinkedHashSet)$this$toBuilder : null) == null) {
         var10000 = new LinkedHashSet((Collection)$this$toBuilder);
      }

      return var10000;
   }

   protected void checkCapacity(@NotNull LinkedHashSet<E> $this$checkCapacity, int size) {
      Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
   }

   protected void insert(@NotNull LinkedHashSet<E> $this$insert, int index, E element) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      $this$insert.add(element);
   }
}
