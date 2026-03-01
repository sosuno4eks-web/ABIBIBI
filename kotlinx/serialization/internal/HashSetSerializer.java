package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class HashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, HashSet<E>> {
   @NotNull
   private final SerialDescriptor descriptor;

   public HashSetSerializer(@NotNull KSerializer<E> eSerializer) {
      Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
      super(eSerializer);
      this.descriptor = (SerialDescriptor)(new HashSetClassDesc(eSerializer.getDescriptor()));
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.descriptor;
   }

   @NotNull
   protected HashSet<E> builder() {
      return new HashSet();
   }

   protected int builderSize(@NotNull HashSet<E> $this$builderSize) {
      Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
      return $this$builderSize.size();
   }

   @NotNull
   protected Set<E> toResult(@NotNull HashSet<E> $this$toResult) {
      Intrinsics.checkNotNullParameter($this$toResult, "<this>");
      return (Set)$this$toResult;
   }

   @NotNull
   protected HashSet<E> toBuilder(@NotNull Set<? extends E> $this$toBuilder) {
      Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
      HashSet var10000 = $this$toBuilder instanceof HashSet ? (HashSet)$this$toBuilder : null;
      if (($this$toBuilder instanceof HashSet ? (HashSet)$this$toBuilder : null) == null) {
         var10000 = new HashSet((Collection)$this$toBuilder);
      }

      return var10000;
   }

   protected void checkCapacity(@NotNull HashSet<E> $this$checkCapacity, int size) {
      Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
   }

   protected void insert(@NotNull HashSet<E> $this$insert, int index, E element) {
      Intrinsics.checkNotNullParameter($this$insert, "<this>");
      $this$insert.add(element);
   }
}
