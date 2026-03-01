package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

public final class JsonElementSerializersKt {
   private static final void verify(Encoder encoder) {
      asJsonEncoder(encoder);
   }

   private static final void verify(Decoder decoder) {
      asJsonDecoder(decoder);
   }

   @NotNull
   public static final JsonDecoder asJsonDecoder(@NotNull Decoder $this$asJsonDecoder) {
      Intrinsics.checkNotNullParameter($this$asJsonDecoder, "<this>");
      JsonDecoder var10000 = $this$asJsonDecoder instanceof JsonDecoder ? (JsonDecoder)$this$asJsonDecoder : null;
      if (($this$asJsonDecoder instanceof JsonDecoder ? (JsonDecoder)$this$asJsonDecoder : null) == null) {
         throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass($this$asJsonDecoder.getClass()));
      } else {
         return var10000;
      }
   }

   @NotNull
   public static final JsonEncoder asJsonEncoder(@NotNull Encoder $this$asJsonEncoder) {
      Intrinsics.checkNotNullParameter($this$asJsonEncoder, "<this>");
      JsonEncoder var10000 = $this$asJsonEncoder instanceof JsonEncoder ? (JsonEncoder)$this$asJsonEncoder : null;
      if (($this$asJsonEncoder instanceof JsonEncoder ? (JsonEncoder)$this$asJsonEncoder : null) == null) {
         throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass($this$asJsonEncoder.getClass()));
      } else {
         return var10000;
      }
   }

   private static final SerialDescriptor defer(Function0<? extends SerialDescriptor> deferred) {
      return (SerialDescriptor)(new SerialDescriptor(deferred) {
         private final Lazy original$delegate;

         {
            this.original$delegate = LazyKt.lazy($deferred);
         }

         private final SerialDescriptor getOriginal() {
            Lazy var1 = this.original$delegate;
            return (SerialDescriptor)var1.getValue();
         }

         public String getSerialName() {
            return this.getOriginal().getSerialName();
         }

         public SerialKind getKind() {
            return this.getOriginal().getKind();
         }

         public int getElementsCount() {
            return this.getOriginal().getElementsCount();
         }

         public String getElementName(int index) {
            return this.getOriginal().getElementName(index);
         }

         public int getElementIndex(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.getOriginal().getElementIndex(name);
         }

         public List<Annotation> getElementAnnotations(int index) {
            return this.getOriginal().getElementAnnotations(index);
         }

         public SerialDescriptor getElementDescriptor(int index) {
            return this.getOriginal().getElementDescriptor(index);
         }

         public boolean isElementOptional(int index) {
            return this.getOriginal().isElementOptional(index);
         }

         public boolean isNullable() {
            return SerialDescriptor.super.isNullable();
         }

         public boolean isInline() {
            return SerialDescriptor.super.isInline();
         }

         public List<Annotation> getAnnotations() {
            return SerialDescriptor.super.getAnnotations();
         }
      });
   }

   // $FF: synthetic method
   public static final void access$verify(Encoder encoder) {
      verify(encoder);
   }

   // $FF: synthetic method
   public static final SerialDescriptor access$defer(Function0 deferred) {
      return defer(deferred);
   }

   // $FF: synthetic method
   public static final void access$verify(Decoder decoder) {
      verify(decoder);
   }
}
