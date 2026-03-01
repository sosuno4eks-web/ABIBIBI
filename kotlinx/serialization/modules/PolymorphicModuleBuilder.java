package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PolymorphicModuleBuilder<Base> {
   @NotNull
   private final KClass<Base> baseClass;
   @Nullable
   private final KSerializer<Base> baseSerializer;
   @NotNull
   private final List<Pair<KClass<? extends Base>, KSerializer<? extends Base>>> subclasses;
   @Nullable
   private Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider;
   @Nullable
   private Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider;

   @PublishedApi
   public PolymorphicModuleBuilder(@NotNull KClass<Base> baseClass, @Nullable KSerializer<Base> baseSerializer) {
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      super();
      this.baseClass = baseClass;
      this.baseSerializer = baseSerializer;
      this.subclasses = (List)(new ArrayList());
   }

   // $FF: synthetic method
   public PolymorphicModuleBuilder(KClass var1, KSerializer var2, int var3, DefaultConstructorMarker var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      this(var1, var2);
   }

   public final <T extends Base> void subclass(@NotNull KClass<T> subclass, @NotNull KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter(subclass, "subclass");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      this.subclasses.add(TuplesKt.to(subclass, serializer));
   }

   public final void defaultDeserializer(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
      Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
      if (this.defaultDeserializerProvider != null) {
         int var2 = false;
         String var3 = "Default deserializer provider is already registered for class " + this.baseClass + ": " + this.defaultDeserializerProvider;
         throw new IllegalArgumentException(var3.toString());
      } else {
         this.defaultDeserializerProvider = defaultDeserializerProvider;
      }
   }

   /** @deprecated */
   @Deprecated(
      message = "Deprecated in favor of function with more precise name: defaultDeserializer",
      replaceWith = @ReplaceWith(
   expression = "defaultDeserializer(defaultSerializerProvider)",
   imports = {}
),
      level = DeprecationLevel.WARNING
   )
   public final void default(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultSerializerProvider) {
      Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
      this.defaultDeserializer(defaultSerializerProvider);
   }

   @PublishedApi
   public final void buildTo(@NotNull SerializersModuleBuilder builder) {
      Intrinsics.checkNotNullParameter(builder, "builder");
      if (this.baseSerializer != null) {
         SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, this.baseClass, this.baseClass, this.baseSerializer, false, 8, (Object)null);
      }

      Iterable $this$forEach$iv = (Iterable)this.subclasses;
      int $i$f$forEach = false;
      Iterator var4 = $this$forEach$iv.iterator();

      while(var4.hasNext()) {
         Object element$iv = var4.next();
         Pair var6 = (Pair)element$iv;
         int var7 = false;
         KClass kclass = (KClass)var6.component1();
         KSerializer serializer = (KSerializer)var6.component2();
         KClass var10001 = this.baseClass;
         Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
         int $i$f$cast = false;
         Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
         SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, var10001, kclass, serializer, false, 8, (Object)null);
      }

      Function1 defaultSerializer = this.defaultSerializerProvider;
      if (defaultSerializer != null) {
         builder.registerDefaultPolymorphicSerializer(this.baseClass, defaultSerializer, false);
      }

      Function1 defaultDeserializer = this.defaultDeserializerProvider;
      if (defaultDeserializer != null) {
         builder.registerDefaultPolymorphicDeserializer(this.baseClass, defaultDeserializer, false);
      }

   }
}
