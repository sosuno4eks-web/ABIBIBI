package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
public abstract class TaggedEncoder<Tag> implements Encoder, CompositeEncoder {
   @NotNull
   private final ArrayList<Tag> tagStack = new ArrayList();

   protected abstract Tag getTag(@NotNull SerialDescriptor var1, int var2);

   @NotNull
   public SerializersModule getSerializersModule() {
      return SerializersModuleBuildersKt.EmptySerializersModule();
   }

   protected void encodeTaggedValue(Tag tag, @NotNull Object value) {
      Intrinsics.checkNotNullParameter(value, "value");
      throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(this.getClass()) + " encoder");
   }

   protected void encodeTaggedNonNullMark(Tag tag) {
   }

   protected void encodeTaggedNull(Tag tag) {
      throw new SerializationException("null is not supported");
   }

   protected void encodeTaggedInt(Tag tag, int value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedByte(Tag tag, byte value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedShort(Tag tag, short value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedLong(Tag tag, long value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedFloat(Tag tag, float value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedDouble(Tag tag, double value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedBoolean(Tag tag, boolean value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedChar(Tag tag, char value) {
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedString(Tag tag, @NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      this.encodeTaggedValue(tag, value);
   }

   protected void encodeTaggedEnum(Tag tag, @NotNull SerialDescriptor enumDescriptor, int ordinal) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      this.encodeTaggedValue(tag, ordinal);
   }

   @NotNull
   protected Encoder encodeTaggedInline(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
      Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
      TaggedEncoder $this$encodeTaggedInline_u24lambda_u240 = (TaggedEncoder)this;
      int var5 = false;
      $this$encodeTaggedInline_u24lambda_u240.pushTag(tag);
      return (Encoder)this;
   }

   @NotNull
   public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.encodeTaggedInline(this.popTag(), descriptor);
   }

   private final boolean encodeElement(SerialDescriptor desc, int index) {
      Object tag = this.getTag(desc, index);
      this.pushTag(tag);
      return true;
   }

   public void encodeNotNullMark() {
      this.encodeTaggedNonNullMark(this.getCurrentTag());
   }

   public void encodeNull() {
      this.encodeTaggedNull(this.popTag());
   }

   public final void encodeBoolean(boolean value) {
      this.encodeTaggedBoolean(this.popTag(), value);
   }

   public final void encodeByte(byte value) {
      this.encodeTaggedByte(this.popTag(), value);
   }

   public final void encodeShort(short value) {
      this.encodeTaggedShort(this.popTag(), value);
   }

   public final void encodeInt(int value) {
      this.encodeTaggedInt(this.popTag(), value);
   }

   public final void encodeLong(long value) {
      this.encodeTaggedLong(this.popTag(), value);
   }

   public final void encodeFloat(float value) {
      this.encodeTaggedFloat(this.popTag(), value);
   }

   public final void encodeDouble(double value) {
      this.encodeTaggedDouble(this.popTag(), value);
   }

   public final void encodeChar(char value) {
      this.encodeTaggedChar(this.popTag(), value);
   }

   public final void encodeString(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      this.encodeTaggedString(this.popTag(), value);
   }

   public final void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      this.encodeTaggedEnum(this.popTag(), enumDescriptor, index);
   }

   @NotNull
   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (CompositeEncoder)this;
   }

   public final void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (!((Collection)this.tagStack).isEmpty()) {
         this.popTag();
      }

      this.endEncode(descriptor);
   }

   protected void endEncode(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
   }

   public final void encodeBooleanElement(@NotNull SerialDescriptor descriptor, int index, boolean value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedBoolean(this.getTag(descriptor, index), value);
   }

   public final void encodeByteElement(@NotNull SerialDescriptor descriptor, int index, byte value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedByte(this.getTag(descriptor, index), value);
   }

   public final void encodeShortElement(@NotNull SerialDescriptor descriptor, int index, short value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedShort(this.getTag(descriptor, index), value);
   }

   public final void encodeIntElement(@NotNull SerialDescriptor descriptor, int index, int value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedInt(this.getTag(descriptor, index), value);
   }

   public final void encodeLongElement(@NotNull SerialDescriptor descriptor, int index, long value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedLong(this.getTag(descriptor, index), value);
   }

   public final void encodeFloatElement(@NotNull SerialDescriptor descriptor, int index, float value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedFloat(this.getTag(descriptor, index), value);
   }

   public final void encodeDoubleElement(@NotNull SerialDescriptor descriptor, int index, double value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedDouble(this.getTag(descriptor, index), value);
   }

   public final void encodeCharElement(@NotNull SerialDescriptor descriptor, int index, char value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this.encodeTaggedChar(this.getTag(descriptor, index), value);
   }

   public final void encodeStringElement(@NotNull SerialDescriptor descriptor, int index, @NotNull String value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(value, "value");
      this.encodeTaggedString(this.getTag(descriptor, index), value);
   }

   @NotNull
   public final Encoder encodeInlineElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.encodeTaggedInline(this.getTag(descriptor, index), descriptor.getElementDescriptor(index));
   }

   public <T> void encodeSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      if (this.encodeElement(descriptor, index)) {
         this.encodeSerializableValue(serializer, value);
      }

   }

   public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      if (this.encodeElement(descriptor, index)) {
         this.encodeNullableSerializableValue(serializer, value);
      }

   }

   protected final Tag getCurrentTag() {
      return CollectionsKt.last((List)this.tagStack);
   }

   @Nullable
   protected final Tag getCurrentTagOrNull() {
      return CollectionsKt.lastOrNull((List)this.tagStack);
   }

   protected final void pushTag(Tag name) {
      this.tagStack.add(name);
   }

   protected final Tag popTag() {
      if (!((Collection)this.tagStack).isEmpty()) {
         return this.tagStack.remove(CollectionsKt.getLastIndex((List)this.tagStack));
      } else {
         throw new SerializationException("No tag in stack for requested element");
      }
   }

   @NotNull
   public CompositeEncoder beginCollection(@NotNull SerialDescriptor descriptor, int collectionSize) {
      return Encoder.super.beginCollection(descriptor, collectionSize);
   }

   public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
      Encoder.super.encodeSerializableValue(serializer, value);
   }

   @ExperimentalSerializationApi
   public <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Encoder.super.encodeNullableSerializableValue(serializer, value);
   }

   @ExperimentalSerializationApi
   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
      return CompositeEncoder.super.shouldEncodeElementDefault(descriptor, index);
   }
}
