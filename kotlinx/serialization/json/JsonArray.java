package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable(
   with = JsonArraySerializer.class
)
public final class JsonArray extends JsonElement implements List<JsonElement>, KMappedMarker {
   @NotNull
   public static final JsonArray.Companion Companion = new JsonArray.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final List<JsonElement> content;

   public JsonArray(@NotNull List<? extends JsonElement> content) {
      Intrinsics.checkNotNullParameter(content, "content");
      super((DefaultConstructorMarker)null);
      this.content = content;
   }

   public boolean equals(@Nullable Object other) {
      return Intrinsics.areEqual((Object)this.content, (Object)other);
   }

   public int hashCode() {
      return this.content.hashCode();
   }

   @NotNull
   public String toString() {
      return CollectionsKt.joinToString$default((Iterable)this.content, (CharSequence)",", (CharSequence)"[", (CharSequence)"]", 0, (CharSequence)null, (Function1)null, 56, (Object)null);
   }

   public boolean isEmpty() {
      return this.content.isEmpty();
   }

   public boolean contains(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.content.contains(element);
   }

   @NotNull
   public Iterator<JsonElement> iterator() {
      return this.content.iterator();
   }

   public boolean containsAll(@NotNull Collection<?> elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return this.content.containsAll(elements);
   }

   @NotNull
   public JsonElement get(int index) {
      return (JsonElement)this.content.get(index);
   }

   public int indexOf(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.content.indexOf(element);
   }

   public int lastIndexOf(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.content.lastIndexOf(element);
   }

   @NotNull
   public ListIterator<JsonElement> listIterator() {
      return this.content.listIterator();
   }

   @NotNull
   public ListIterator<JsonElement> listIterator(int index) {
      return this.content.listIterator(index);
   }

   @NotNull
   public List<JsonElement> subList(int fromIndex, int toIndex) {
      return this.content.subList(fromIndex, toIndex);
   }

   public int getSize() {
      return this.content.size();
   }

   public boolean add(JsonElement element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void add(int index, JsonElement element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection<? extends JsonElement> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(int index, Collection<? extends JsonElement> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean removeAll(Collection<?> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean retainAll(Collection<?> elements) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement set(int index, JsonElement element) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement remove(int index) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void replaceAll(UnaryOperator<JsonElement> p0) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void sort(Comparator<? super JsonElement> p0) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public <T> T[] toArray(T[] array) {
      Intrinsics.checkNotNullParameter(array, "array");
      return CollectionToArray.toArray((Collection)this, array);
   }

   public Object[] toArray() {
      return CollectionToArray.toArray((Collection)this);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final KSerializer<JsonArray> serializer() {
         return (KSerializer)JsonArraySerializer.INSTANCE;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
