package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

final class JsonIteratorWsSeparated<T> implements Iterator<T>, KMappedMarker {
   @NotNull
   private final Json json;
   @NotNull
   private final ReaderJsonLexer lexer;
   @NotNull
   private final DeserializationStrategy<T> deserializer;

   public JsonIteratorWsSeparated(@NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(lexer, "lexer");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      super();
      this.json = json;
      this.lexer = lexer;
      this.deserializer = deserializer;
   }

   public T next() {
      return (new StreamingJsonDecoder(this.json, WriteMode.OBJ, (AbstractJsonLexer)this.lexer, this.deserializer.getDescriptor(), (StreamingJsonDecoder.DiscriminatorHolder)null)).decodeSerializableValue(this.deserializer);
   }

   public boolean hasNext() {
      return this.lexer.isNotEof();
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
