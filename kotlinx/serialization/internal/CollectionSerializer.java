package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
   public CollectionSerializer(@NotNull KSerializer<E> element) {
      Intrinsics.checkNotNullParameter(element, "element");
      super(element, (DefaultConstructorMarker)null);
   }

   protected int collectionSize(@NotNull C $this$collectionSize) {
      Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
      return $this$collectionSize.size();
   }

   @NotNull
   protected Iterator<E> collectionIterator(@NotNull C $this$collectionIterator) {
      Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
      return $this$collectionIterator.iterator();
   }
}
