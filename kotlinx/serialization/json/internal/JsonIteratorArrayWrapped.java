package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

final class JsonIteratorArrayWrapped<T> implements Iterator<T>, KMappedMarker {
   @NotNull
   private final Json json;
   @NotNull
   private final ReaderJsonLexer lexer;
   @NotNull
   private final DeserializationStrategy<T> deserializer;
   private boolean first;
   private boolean finished;

   public JsonIteratorArrayWrapped(@NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<? extends T> deserializer) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(lexer, "lexer");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      super();
      this.json = json;
      this.lexer = lexer;
      this.deserializer = deserializer;
      this.first = true;
   }

   public T next() {
      if (this.first) {
         this.first = false;
      } else {
         this.lexer.consumeNextToken(',');
      }

      StreamingJsonDecoder input = new StreamingJsonDecoder(this.json, WriteMode.OBJ, (AbstractJsonLexer)this.lexer, this.deserializer.getDescriptor(), (StreamingJsonDecoder.DiscriminatorHolder)null);
      return input.decodeSerializableValue(this.deserializer);
   }

   public boolean hasNext() {
      if (this.finished) {
         return false;
      } else if (this.lexer.peekNextToken() == 9) {
         this.finished = true;
         this.lexer.consumeNextToken((byte)9);
         if (this.lexer.isNotEof()) {
            if (this.lexer.peekNextToken() == 8) {
               AbstractJsonLexer.fail$default((AbstractJsonLexer)this.lexer, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            }

            this.lexer.expectEof();
         }

         return false;
      } else if (!this.lexer.isNotEof() && !this.finished) {
         AbstractJsonLexer $this$iv = (AbstractJsonLexer)this.lexer;
         byte expectedToken$iv = 9;
         boolean wasConsumed$iv = true;
         int $i$f$fail$kotlinx_serialization_json = false;
         String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
         int position$iv = $this$iv.currentPosition - 1;
         String s$iv = $this$iv.currentPosition != AbstractJsonLexer.access$getSource($this$iv).length() && position$iv >= 0 ? String.valueOf(AbstractJsonLexer.access$getSource($this$iv).charAt(position$iv)) : "EOF";
         int var10 = false;
         AbstractJsonLexer.fail$default($this$iv, "Expected " + expected$iv + ", but had '" + s$iv + "' instead", position$iv, (String)null, 4, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         return true;
      }
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
