package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.StringOpsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable(
   with = JsonObjectSerializer.class
)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, KMappedMarker {
   @NotNull
   public static final JsonObject.Companion Companion = new JsonObject.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final Map<String, JsonElement> content;

   public JsonObject(@NotNull Map<String, ? extends JsonElement> content) {
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
      return CollectionsKt.joinToString$default((Iterable)this.content.entrySet(), (CharSequence)",", (CharSequence)"{", (CharSequence)"}", 0, (CharSequence)null, JsonObject::toString$lambda$1, 24, (Object)null);
   }

   public boolean isEmpty() {
      return this.content.isEmpty();
   }

   public boolean containsKey(@NotNull String key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return this.content.containsKey(key);
   }

   public boolean containsValue(@NotNull JsonElement value) {
      Intrinsics.checkNotNullParameter(value, "value");
      return this.content.containsValue(value);
   }

   @Nullable
   public JsonElement get(@NotNull String key) {
      Intrinsics.checkNotNullParameter(key, "key");
      return (JsonElement)this.content.get(key);
   }

   public int getSize() {
      return this.content.size();
   }

   @NotNull
   public Set<String> getKeys() {
      return this.content.keySet();
   }

   @NotNull
   public Collection<JsonElement> getValues() {
      return this.content.values();
   }

   @NotNull
   public Set<Entry<String, JsonElement>> getEntries() {
      return this.content.entrySet();
   }

   public JsonElement put(String key, JsonElement value) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement remove(Object key) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean remove(Object key, Object value) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void putAll(Map<? extends String, ? extends JsonElement> from) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p0) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement putIfAbsent(String p0, JsonElement p1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean replace(String p0, JsonElement p1, JsonElement p2) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement replace(String p0, JsonElement p1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement computeIfAbsent(String p0, Function<? super String, ? extends JsonElement> p1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement computeIfPresent(String p0, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement compute(String p0, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public JsonElement merge(String p0, JsonElement p1, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> p2) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   private static final CharSequence toString$lambda$1(Entry var0) {
      Intrinsics.checkNotNullParameter(var0, "<destruct>");
      String k = (String)var0.getKey();
      JsonElement v = (JsonElement)var0.getValue();
      StringBuilder var3 = new StringBuilder();
      int var5 = false;
      StringOpsKt.printQuoted(var3, k);
      var3.append(':');
      var3.append(v);
      return (CharSequence)var3.toString();
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final KSerializer<JsonObject> serializer() {
         return (KSerializer)JsonObjectSerializer.INSTANCE;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
