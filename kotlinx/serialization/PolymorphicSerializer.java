package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import org.jetbrains.annotations.NotNull;

public final class PolymorphicSerializer<T> extends AbstractPolymorphicSerializer<T> {
   @NotNull
   private final KClass<T> baseClass;
   @NotNull
   private List<? extends Annotation> _annotations;
   @NotNull
   private final Lazy descriptor$delegate;

   public PolymorphicSerializer(@NotNull KClass<T> baseClass) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      super();
      this.baseClass = baseClass;
      this._annotations = CollectionsKt.emptyList();
      this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, PolymorphicSerializer::descriptor_delegate$lambda$1);
   }

   @NotNull
   public KClass<T> getBaseClass() {
      return this.baseClass;
   }

   @PublishedApi
   public PolymorphicSerializer(@NotNull KClass<T> baseClass, @NotNull Annotation[] classAnnotations) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
      this(baseClass);
      this._annotations = ArraysKt.asList(classAnnotations);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      Lazy var1 = this.descriptor$delegate;
      return (SerialDescriptor)var1.getValue();
   }

   @NotNull
   public String toString() {
      return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.getBaseClass() + ')';
   }

   private static final Unit descriptor_delegate$lambda$1$lambda$0(PolymorphicSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
      Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), (List)null, false, 12, (Object)null);
      ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + this$0.getBaseClass().getSimpleName() + '>', (SerialKind)SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], (Function1)null, 8, (Object)null), (List)null, false, 12, (Object)null);
      $this$buildSerialDescriptor.setAnnotations(this$0._annotations);
      return Unit.INSTANCE;
   }

   private static final SerialDescriptor descriptor_delegate$lambda$1(PolymorphicSerializer this$0) {
      return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", (SerialKind)PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], PolymorphicSerializer::descriptor_delegate$lambda$1$lambda$0), this$0.getBaseClass());
   }
}
