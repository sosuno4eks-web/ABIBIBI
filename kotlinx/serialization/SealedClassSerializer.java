package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
   @NotNull
   private final KClass<T> baseClass;
   @NotNull
   private List<? extends Annotation> _annotations;
   @NotNull
   private final Lazy descriptor$delegate;
   @NotNull
   private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;
   @NotNull
   private final Map<String, KSerializer<? extends T>> serialName2Serializer;

   public SealedClassSerializer(@NotNull String serialName, @NotNull KClass<T> baseClass, @NotNull KClass<? extends T>[] subclasses, @NotNull KSerializer<? extends T>[] subclassSerializers) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(subclasses, "subclasses");
      Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
      super();
      this.baseClass = baseClass;
      this._annotations = CollectionsKt.emptyList();
      this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, SealedClassSerializer::descriptor_delegate$lambda$3);
      if (subclasses.length != subclassSerializers.length) {
         throw new IllegalArgumentException("All subclasses of sealed class " + this.getBaseClass().getSimpleName() + " should be marked @Serializable");
      } else {
         this.class2Serializer = MapsKt.toMap((Iterable)ArraysKt.zip(subclasses, subclassSerializers));
         Iterable $this$groupingBy$iv = (Iterable)this.class2Serializer.entrySet();
         int $i$f$mapValues = false;
         Grouping $this$aggregate$iv = (Grouping)(new SealedClassSerializer$special$$inlined$groupingBy$1($this$groupingBy$iv));
         $i$f$mapValues = false;
         Grouping $this$aggregateTo$iv$iv = $this$aggregate$iv;
         Map destination$iv$iv = (Map)(new LinkedHashMap());
         int $i$f$mapValuesTo = false;
         Iterator var10 = $this$aggregate$iv.sourceIterator();

         Object element$iv$iv$iv;
         boolean var18;
         while(var10.hasNext()) {
            Object e$iv$iv = var10.next();
            Object key$iv$iv = $this$aggregateTo$iv$iv.keyOf(e$iv$iv);
            element$iv$iv$iv = destination$iv$iv.get(key$iv$iv);
            if (element$iv$iv$iv == null && !destination$iv$iv.containsKey(key$iv$iv)) {
            }

            Entry element = (Entry)e$iv$iv;
            Entry accumulator = (Entry)element$iv$iv$iv;
            String key = (String)key$iv$iv;
            var18 = false;
            if (accumulator != null) {
               throw new IllegalStateException(("Multiple sealed subclasses of '" + this.getBaseClass() + "' have the same serial name '" + key + "': '" + accumulator.getKey() + "', '" + element.getKey() + '\'').toString());
            }

            destination$iv$iv.put(key$iv$iv, element);
         }

         Map $this$mapValues$iv = destination$iv$iv;
         $i$f$mapValues = false;
         destination$iv$iv = (Map)(new LinkedHashMap(MapsKt.mapCapacity(destination$iv$iv.size())));
         $i$f$mapValuesTo = false;
         Iterable $this$associateByTo$iv$iv$iv = (Iterable)$this$mapValues$iv.entrySet();
         int $i$f$associateByTo = false;
         Iterator var27 = $this$associateByTo$iv$iv$iv.iterator();

         while(var27.hasNext()) {
            element$iv$iv$iv = var27.next();
            Entry it$iv$iv = (Entry)element$iv$iv$iv;
            int var28 = false;
            Object var10001 = it$iv$iv.getKey();
            Entry it = (Entry)element$iv$iv$iv;
            Object var21 = var10001;
            var18 = false;
            KSerializer var22 = (KSerializer)((Entry)it.getValue()).getValue();
            destination$iv$iv.put(var21, var22);
         }

         this.serialName2Serializer = destination$iv$iv;
      }
   }

   @NotNull
   public KClass<T> getBaseClass() {
      return this.baseClass;
   }

   @PublishedApi
   public SealedClassSerializer(@NotNull String serialName, @NotNull KClass<T> baseClass, @NotNull KClass<? extends T>[] subclasses, @NotNull KSerializer<? extends T>[] subclassSerializers, @NotNull Annotation[] classAnnotations) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(subclasses, "subclasses");
      Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
      Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
      this(serialName, baseClass, subclasses, subclassSerializers);
      this._annotations = ArraysKt.asList(classAnnotations);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      Lazy var1 = this.descriptor$delegate;
      return (SerialDescriptor)var1.getValue();
   }

   @Nullable
   public DeserializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      KSerializer var10000 = (KSerializer)this.serialName2Serializer.get(klassName);
      return var10000 != null ? (DeserializationStrategy)var10000 : super.findPolymorphicSerializerOrNull(decoder, klassName);
   }

   @Nullable
   public SerializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      KSerializer var10000 = (KSerializer)this.class2Serializer.get(Reflection.getOrCreateKotlinClass(value.getClass()));
      SerializationStrategy var5 = var10000 != null ? (SerializationStrategy)var10000 : super.findPolymorphicSerializerOrNull(encoder, value);
      if (var5 != null) {
         SerializationStrategy $this$cast$iv = var5;
         int $i$f$cast = false;
         var5 = $this$cast$iv;
      } else {
         var5 = null;
      }

      return var5;
   }

   private static final Unit descriptor_delegate$lambda$3$lambda$2$lambda$1(SealedClassSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
      Map $this$forEach$iv = this$0.serialName2Serializer;
      int $i$f$forEach = false;
      Iterator var4 = $this$forEach$iv.entrySet().iterator();

      while(var4.hasNext()) {
         Entry element$iv = (Entry)var4.next();
         int var7 = false;
         String name = (String)element$iv.getKey();
         KSerializer serializer = (KSerializer)element$iv.getValue();
         ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, name, serializer.getDescriptor(), (List)null, false, 12, (Object)null);
      }

      return Unit.INSTANCE;
   }

   private static final Unit descriptor_delegate$lambda$3$lambda$2(SealedClassSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), (List)null, false, 12, (Object)null);
      SerialDescriptor elementDescriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + this$0.getBaseClass().getSimpleName() + '>', (SerialKind)SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], SealedClassSerializer::descriptor_delegate$lambda$3$lambda$2$lambda$1);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", elementDescriptor, (List)null, false, 12, (Object)null);
      $this$buildSerialDescriptor.setAnnotations(this$0._annotations);
      return Unit.INSTANCE;
   }

   private static final SerialDescriptor descriptor_delegate$lambda$3(String $serialName, SealedClassSerializer this$0) {
      return SerialDescriptorsKt.buildSerialDescriptor($serialName, (SerialKind)PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], SealedClassSerializer::descriptor_delegate$lambda$3$lambda$2);
   }
}
