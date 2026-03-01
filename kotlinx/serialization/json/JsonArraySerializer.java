package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@PublishedApi
public final class JsonArraySerializer implements KSerializer<JsonArray> {
   @NotNull
   public static final JsonArraySerializer INSTANCE = new JsonArraySerializer();
   @NotNull
   private static final SerialDescriptor descriptor;

   private JsonArraySerializer() {
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return descriptor;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull JsonArray value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      JsonElementSerializersKt.access$verify(encoder);
      BuiltinSerializersKt.ListSerializer((KSerializer)JsonElementSerializer.INSTANCE).serialize(encoder, value);
   }

   @NotNull
   public JsonArray deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      JsonElementSerializersKt.access$verify(decoder);
      return new JsonArray((List)BuiltinSerializersKt.ListSerializer((KSerializer)JsonElementSerializer.INSTANCE).deserialize(decoder));
   }

   static {
      descriptor = (SerialDescriptor)JsonArraySerializer.JsonArrayDescriptor.INSTANCE;
   }

   private static final class JsonArrayDescriptor implements SerialDescriptor {
      @NotNull
      public static final JsonArraySerializer.JsonArrayDescriptor INSTANCE = new JsonArraySerializer.JsonArrayDescriptor();
      // $FF: synthetic field
      private final SerialDescriptor $$delegate_0;
      @NotNull
      private static final String serialName = "kotlinx.serialization.json.JsonArray";

      private JsonArrayDescriptor() {
         this.$$delegate_0 = BuiltinSerializersKt.ListSerializer((KSerializer)JsonElementSerializer.INSTANCE).getDescriptor();
      }

      @NotNull
      public String getSerialName() {
         return serialName;
      }

      /** @deprecated */
      // $FF: synthetic method
      @ExperimentalSerializationApi
      public static void getSerialName$annotations() {
      }

      @NotNull
      public String getElementName(int index) {
         return this.$$delegate_0.getElementName(index);
      }

      public int getElementIndex(@NotNull String name) {
         Intrinsics.checkNotNullParameter(name, "name");
         return this.$$delegate_0.getElementIndex(name);
      }

      @NotNull
      public List<Annotation> getElementAnnotations(int index) {
         return this.$$delegate_0.getElementAnnotations(index);
      }

      @NotNull
      public SerialDescriptor getElementDescriptor(int index) {
         return this.$$delegate_0.getElementDescriptor(index);
      }

      public boolean isElementOptional(int index) {
         return this.$$delegate_0.isElementOptional(index);
      }

      @NotNull
      public SerialKind getKind() {
         return this.$$delegate_0.getKind();
      }

      public boolean isNullable() {
         return this.$$delegate_0.isNullable();
      }

      public boolean isInline() {
         return this.$$delegate_0.isInline();
      }

      public int getElementsCount() {
         return this.$$delegate_0.getElementsCount();
      }

      @NotNull
      public List<Annotation> getAnnotations() {
         return this.$$delegate_0.getAnnotations();
      }
   }
}
