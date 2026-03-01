package kotlinx.serialization.modules;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SerializersModuleBuildersKt {
   @NotNull
   public static final <T> SerializersModule serializersModuleOf(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      int $i$f$SerializersModule = false;
      SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
      int var5 = false;
      builder$iv.contextual(kClass, serializer);
      return builder$iv.build();
   }

   // $FF: synthetic method
   public static final <T> SerializersModule serializersModuleOf(KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      int $i$f$serializersModuleOf = false;
      Intrinsics.reifiedOperationMarker(4, "T");
      return serializersModuleOf(Reflection.getOrCreateKotlinClass(Object.class), serializer);
   }

   @NotNull
   public static final SerializersModule SerializersModule(@NotNull Function1<? super SerializersModuleBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      int $i$f$SerializersModule = false;
      SerializersModuleBuilder builder = new SerializersModuleBuilder();
      builderAction.invoke(builder);
      return builder.build();
   }

   @NotNull
   public static final SerializersModule EmptySerializersModule() {
      return SerializersModuleKt.getEmptySerializersModule();
   }

   // $FF: synthetic method
   public static final <T> void contextual(SerializersModuleBuilder $this$contextual, KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter($this$contextual, "<this>");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      int $i$f$contextual = false;
      Intrinsics.reifiedOperationMarker(4, "T");
      $this$contextual.contextual(Reflection.getOrCreateKotlinClass(Object.class), serializer);
   }

   public static final <Base> void polymorphic(@NotNull SerializersModuleBuilder $this$polymorphic, @NotNull KClass<Base> baseClass, @Nullable KSerializer<Base> baseSerializer, @NotNull Function1<? super PolymorphicModuleBuilder<? super Base>, Unit> builderAction) {
      Intrinsics.checkNotNullParameter($this$polymorphic, "<this>");
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      int $i$f$polymorphic = false;
      PolymorphicModuleBuilder builder = new PolymorphicModuleBuilder(baseClass, baseSerializer);
      builderAction.invoke(builder);
      builder.buildTo($this$polymorphic);
   }

   // $FF: synthetic method
   public static void polymorphic$default(SerializersModuleBuilder $this$polymorphic_u24default, KClass baseClass, KSerializer baseSerializer, Function1 builderAction, int $i$f$polymorphic, Object builder) {
      if ((var4 & 2) != 0) {
         baseSerializer = null;
      }

      if ((var4 & 4) != 0) {
         builderAction = (Function1)null.INSTANCE;
      }

      Intrinsics.checkNotNullParameter($this$polymorphic_u24default, "<this>");
      Intrinsics.checkNotNullParameter(baseClass, "baseClass");
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      int $i$f$polymorphic = false;
      PolymorphicModuleBuilder builder = new PolymorphicModuleBuilder(baseClass, baseSerializer);
      builderAction.invoke(builder);
      builder.buildTo($this$polymorphic_u24default);
   }
}
