package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContextAwareKt {
   @Nullable
   public static final KClass<?> getCapturedKClass(@NotNull SerialDescriptor $this$capturedKClass) {
      Intrinsics.checkNotNullParameter($this$capturedKClass, "<this>");
      return $this$capturedKClass instanceof ContextDescriptor ? ((ContextDescriptor)$this$capturedKClass).kClass : ($this$capturedKClass instanceof SerialDescriptorForNullable ? getCapturedKClass(((SerialDescriptorForNullable)$this$capturedKClass).getOriginal$kotlinx_serialization_core()) : null);
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getCapturedKClass$annotations(SerialDescriptor <this>) {
   }

   @ExperimentalSerializationApi
   @Nullable
   public static final SerialDescriptor getContextualDescriptor(@NotNull SerializersModule $this$getContextualDescriptor, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter($this$getContextualDescriptor, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      KClass var10000 = getCapturedKClass(descriptor);
      SerialDescriptor var5;
      if (var10000 != null) {
         KClass klass = var10000;
         int var3 = false;
         KSerializer var4 = SerializersModule.getContextual$default($this$getContextualDescriptor, klass, (List)null, 2, (Object)null);
         var5 = var4 != null ? var4.getDescriptor() : null;
      } else {
         var5 = null;
      }

      return var5;
   }

   @ExperimentalSerializationApi
   @NotNull
   public static final List<SerialDescriptor> getPolymorphicDescriptors(@NotNull SerializersModule $this$getPolymorphicDescriptors, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter($this$getPolymorphicDescriptors, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      KClass var10000 = getCapturedKClass(descriptor);
      if (var10000 == null) {
         return CollectionsKt.emptyList();
      } else {
         KClass kClass = var10000;
         Map var13 = (Map)((SerialModuleImpl)$this$getPolymorphicDescriptors).polyBase2Serializers.get(kClass);
         Collection var14 = var13 != null ? var13.values() : null;
         if (var14 == null) {
            var14 = (Collection)CollectionsKt.emptyList();
         }

         Iterable $this$map$iv = (Iterable)var14;
         int $i$f$map = false;
         Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
         int $i$f$mapTo = false;
         Iterator var8 = $this$map$iv.iterator();

         while(var8.hasNext()) {
            Object item$iv$iv = var8.next();
            KSerializer it = (KSerializer)item$iv$iv;
            int var11 = false;
            destination$iv$iv.add(it.getDescriptor());
         }

         return (List)destination$iv$iv;
      }
   }

   @NotNull
   public static final SerialDescriptor withContext(@NotNull SerialDescriptor $this$withContext, @NotNull KClass<?> context) {
      Intrinsics.checkNotNullParameter($this$withContext, "<this>");
      Intrinsics.checkNotNullParameter(context, "context");
      return (SerialDescriptor)(new ContextDescriptor($this$withContext, context));
   }
}
