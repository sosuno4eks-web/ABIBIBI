package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
public abstract class TaggedDecoder<Tag> implements Decoder, CompositeDecoder {
   @NotNull
   private final ArrayList<Tag> tagStack = new ArrayList();
   private boolean flag;

   @NotNull
   public SerializersModule getSerializersModule() {
      return SerializersModuleBuildersKt.EmptySerializersModule();
   }

   protected abstract Tag getTag(@NotNull SerialDescriptor var1, int var2);

   @NotNull
   protected Object decodeTaggedValue(Tag tag) {
      throw new SerializationException(Reflection.getOrCreateKotlinClass(this.getClass()) + " can't retrieve untyped values");
   }

   protected boolean decodeTaggedNotNullMark(Tag tag) {
      return true;
   }

   @Nullable
   protected Void decodeTaggedNull(Tag tag) {
      return null;
   }

   protected boolean decodeTaggedBoolean(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Boolean");
      return (Boolean)var10000;
   }

   protected byte decodeTaggedByte(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Byte");
      return (Byte)var10000;
   }

   protected short decodeTaggedShort(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Short");
      return (Short)var10000;
   }

   protected int decodeTaggedInt(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Int");
      return (Integer)var10000;
   }

   protected long decodeTaggedLong(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Long");
      return (Long)var10000;
   }

   protected float decodeTaggedFloat(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Float");
      return (Float)var10000;
   }

   protected double decodeTaggedDouble(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Double");
      return (Double)var10000;
   }

   protected char decodeTaggedChar(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Char");
      return (Character)var10000;
   }

   @NotNull
   protected String decodeTaggedString(Tag tag) {
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.String");
      return (String)var10000;
   }

   protected int decodeTaggedEnum(Tag tag, @NotNull SerialDescriptor enumDescriptor) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      Object var10000 = this.decodeTaggedValue(tag);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Int");
      return (Integer)var10000;
   }

   @NotNull
   protected Decoder decodeTaggedInline(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
      Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
      TaggedDecoder $this$decodeTaggedInline_u24lambda_u240 = (TaggedDecoder)this;
      int var5 = false;
      $this$decodeTaggedInline_u24lambda_u240.pushTag(tag);
      return (Decoder)this;
   }

   protected <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return this.decodeSerializableValue(deserializer);
   }

   @NotNull
   public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedInline(this.popTag(), descriptor);
   }

   public boolean decodeNotNullMark() {
      Object var10000 = this.getCurrentTagOrNull();
      if (var10000 == null) {
         return false;
      } else {
         Object currentTag = var10000;
         return this.decodeTaggedNotNullMark(currentTag);
      }
   }

   @Nullable
   public final Void decodeNull() {
      return null;
   }

   public final boolean decodeBoolean() {
      return this.decodeTaggedBoolean(this.popTag());
   }

   public final byte decodeByte() {
      return this.decodeTaggedByte(this.popTag());
   }

   public final short decodeShort() {
      return this.decodeTaggedShort(this.popTag());
   }

   public final int decodeInt() {
      return this.decodeTaggedInt(this.popTag());
   }

   public final long decodeLong() {
      return this.decodeTaggedLong(this.popTag());
   }

   public final float decodeFloat() {
      return this.decodeTaggedFloat(this.popTag());
   }

   public final double decodeDouble() {
      return this.decodeTaggedDouble(this.popTag());
   }

   public final char decodeChar() {
      return this.decodeTaggedChar(this.popTag());
   }

   @NotNull
   public final String decodeString() {
      return this.decodeTaggedString(this.popTag());
   }

   public final int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      return this.decodeTaggedEnum(this.popTag(), enumDescriptor);
   }

   @NotNull
   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (CompositeDecoder)this;
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
   }

   public final boolean decodeBooleanElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedBoolean(this.getTag(descriptor, index));
   }

   public final byte decodeByteElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedByte(this.getTag(descriptor, index));
   }

   public final short decodeShortElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedShort(this.getTag(descriptor, index));
   }

   public final int decodeIntElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedInt(this.getTag(descriptor, index));
   }

   public final long decodeLongElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedLong(this.getTag(descriptor, index));
   }

   public final float decodeFloatElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedFloat(this.getTag(descriptor, index));
   }

   public final double decodeDoubleElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedDouble(this.getTag(descriptor, index));
   }

   public final char decodeCharElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedChar(this.getTag(descriptor, index));
   }

   @NotNull
   public final String decodeStringElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedString(this.getTag(descriptor, index));
   }

   @NotNull
   public final Decoder decodeInlineElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.decodeTaggedInline(this.getTag(descriptor, index), descriptor.getElementDescriptor(index));
   }

   public final <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return this.tagBlock(this.getTag(descriptor, index), TaggedDecoder::decodeSerializableElement$lambda$1);
   }

   @Nullable
   public final <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(deserializer, "deserializer");
      return this.tagBlock(this.getTag(descriptor, index), TaggedDecoder::decodeNullableSerializableElement$lambda$3);
   }

   private final <E> E tagBlock(Tag tag, Function0<? extends E> block) {
      this.pushTag(tag);
      Object r = block.invoke();
      if (!this.flag) {
         this.popTag();
      }

      this.flag = false;
      return r;
   }

   @NotNull
   public final ArrayList<Tag> getTagStack$kotlinx_serialization_core() {
      return this.tagStack;
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

   protected final void copyTagsTo(@NotNull TaggedDecoder<Tag> other) {
      Intrinsics.checkNotNullParameter(other, "other");
      other.tagStack.addAll((Collection)this.tagStack);
   }

   protected final Tag popTag() {
      Object r = this.tagStack.remove(CollectionsKt.getLastIndex((List)this.tagStack));
      this.flag = true;
      return r;
   }

   public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      return Decoder.super.decodeSerializableValue(deserializer);
   }

   @ExperimentalSerializationApi
   @Nullable
   public <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
      return Decoder.super.decodeNullableSerializableValue(deserializer);
   }

   @ExperimentalSerializationApi
   public boolean decodeSequentially() {
      return CompositeDecoder.super.decodeSequentially();
   }

   public int decodeCollectionSize(@NotNull SerialDescriptor descriptor) {
      return CompositeDecoder.super.decodeCollectionSize(descriptor);
   }

   private static final Object decodeSerializableElement$lambda$1(TaggedDecoder this$0, DeserializationStrategy $deserializer, Object $previousValue) {
      return this$0.decodeSerializableValue($deserializer, $previousValue);
   }

   private static final Object decodeNullableSerializableElement$lambda$3(TaggedDecoder this$0, DeserializationStrategy $deserializer, Object $previousValue) {
      Decoder $this$decodeIfNullable$iv = (Decoder)this$0;
      int $i$f$decodeIfNullable = false;
      boolean isNullabilitySupported$iv = $deserializer.getDescriptor().isNullable();
      Object var10000;
      if (!isNullabilitySupported$iv && !$this$decodeIfNullable$iv.decodeNotNullMark()) {
         var10000 = $this$decodeIfNullable$iv.decodeNull();
      } else {
         int var7 = false;
         var10000 = this$0.decodeSerializableValue($deserializer, $previousValue);
      }

      return var10000;
   }
}
