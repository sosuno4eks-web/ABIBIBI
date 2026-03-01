package kotlinx.serialization.modules;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SerialModuleImpl extends SerializersModule {
   @NotNull
   private final Map<KClass<?>, ContextualProvider> class2ContextualFactory;
   @JvmField
   @NotNull
   public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers;
   @NotNull
   private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider;
   @NotNull
   private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
   @NotNull
   private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
   private final boolean hasInterfaceContextualSerializers;

   public SerialModuleImpl(@NotNull Map<KClass<?>, ? extends ContextualProvider> class2ContextualFactory, @NotNull Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> polyBase2Serializers, @NotNull Map<KClass<?>, ? extends Function1<?, ? extends SerializationStrategy<?>>> polyBase2DefaultSerializerProvider, @NotNull Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers, @NotNull Map<KClass<?>, ? extends Function1<? super String, ? extends DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider, boolean hasInterfaceContextualSerializers) {
      Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
      Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
      Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
      Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
      Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
      super((DefaultConstructorMarker)null);
      this.class2ContextualFactory = class2ContextualFactory;
      this.polyBase2Serializers = polyBase2Serializers;
      this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
      this.polyBase2NamedSerializers = polyBase2NamedSerializers;
      this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
      this.hasInterfaceContextualSerializers = hasInterfaceContextualSerializers;
   }

   public boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core() {
      return this.hasInterfaceContextualSerializers;
   }

   @Nullable
   public <T> SerializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> baseClass, @NotNull T value) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(value, "value");
      if (!baseClass.isInstance(value)) {
         return null;
      } else {
         Map var10000 = (Map)this.polyBase2Serializers.get(baseClass);
         KSerializer var4 = var10000 != null ? (KSerializer)var10000.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
         SerializationStrategy registered = var4 instanceof SerializationStrategy ? (SerializationStrategy)var4 : null;
         if (registered != null) {
            return registered;
         } else {
            Object var5 = this.polyBase2DefaultSerializerProvider.get(baseClass);
            Function1 var6 = TypeIntrinsics.isFunctionOfArity(var5, 1) ? (Function1)var5 : null;
            return var6 != null ? (SerializationStrategy)var6.invoke(value) : null;
         }
      }
   }

   @Nullable
   public <T> DeserializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> baseClass, @Nullable String serializedClassName) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Map var10000 = (Map)this.polyBase2NamedSerializers.get(baseClass);
      KSerializer var4 = var10000 != null ? (KSerializer)var10000.get(serializedClassName) : null;
      KSerializer registered = var4 instanceof KSerializer ? var4 : null;
      if (registered != null) {
         return (DeserializationStrategy)registered;
      } else {
         Object var5 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
         Function1 var6 = TypeIntrinsics.isFunctionOfArity(var5, 1) ? (Function1)var5 : null;
         return var6 != null ? (DeserializationStrategy)var6.invoke(serializedClassName) : null;
      }
   }

   @Nullable
   public <T> KSerializer<T> getContextual(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
      ContextualProvider var10000 = (ContextualProvider)this.class2ContextualFactory.get(kClass);
      KSerializer var3 = var10000 != null ? var10000.invoke(typeArgumentsSerializers) : null;
      return var3 instanceof KSerializer ? var3 : null;
   }

   public void dumpTo(@NotNull SerializersModuleCollector collector) {
      Intrinsics.checkNotNullParameter(collector, "collector");
      Map $this$forEach$iv = this.class2ContextualFactory;
      int $i$f$forEach = false;
      Iterator var4 = $this$forEach$iv.entrySet().iterator();

      Entry element$iv;
      boolean var7;
      KClass baseClass;
      while(var4.hasNext()) {
         element$iv = (Entry)var4.next();
         var7 = false;
         baseClass = (KClass)element$iv.getKey();
         ContextualProvider serial = (ContextualProvider)element$iv.getValue();
         if (serial instanceof ContextualProvider.Argless) {
            Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            KSerializer var10002 = ((ContextualProvider.Argless)serial).getSerializer();
            Intrinsics.checkNotNull(var10002, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            collector.contextual(baseClass, var10002);
         } else {
            if (!(serial instanceof ContextualProvider.WithTypeArguments)) {
               throw new NoWhenBranchMatchedException();
            }

            collector.contextual(baseClass, ((ContextualProvider.WithTypeArguments)serial).getProvider());
         }
      }

      $this$forEach$iv = this.polyBase2Serializers;
      $i$f$forEach = false;
      var4 = $this$forEach$iv.entrySet().iterator();

      while(var4.hasNext()) {
         element$iv = (Entry)var4.next();
         var7 = false;
         baseClass = (KClass)element$iv.getKey();
         Map classMap = (Map)element$iv.getValue();
         int $i$f$forEach = false;
         Iterator var12 = classMap.entrySet().iterator();

         while(var12.hasNext()) {
            Entry element$iv = (Entry)var12.next();
            int var15 = false;
            KClass actualClass = (KClass)element$iv.getKey();
            KSerializer serializer = (KSerializer)element$iv.getValue();
            Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(actualClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            int $i$f$cast = false;
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            collector.polymorphic(baseClass, actualClass, serializer);
         }
      }

      $this$forEach$iv = this.polyBase2DefaultSerializerProvider;
      $i$f$forEach = false;
      var4 = $this$forEach$iv.entrySet().iterator();

      Function1 provider;
      while(var4.hasNext()) {
         element$iv = (Entry)var4.next();
         var7 = false;
         baseClass = (KClass)element$iv.getKey();
         provider = (Function1)element$iv.getValue();
         Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
         Intrinsics.checkNotNull(provider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
         collector.polymorphicDefaultSerializer(baseClass, (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(provider, 1));
      }

      $this$forEach$iv = this.polyBase2DefaultDeserializerProvider;
      $i$f$forEach = false;
      var4 = $this$forEach$iv.entrySet().iterator();

      while(var4.hasNext()) {
         element$iv = (Entry)var4.next();
         var7 = false;
         baseClass = (KClass)element$iv.getKey();
         provider = (Function1)element$iv.getValue();
         Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
         Intrinsics.checkNotNull(provider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
         collector.polymorphicDefaultDeserializer(baseClass, (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(provider, 1));
      }

   }
}
