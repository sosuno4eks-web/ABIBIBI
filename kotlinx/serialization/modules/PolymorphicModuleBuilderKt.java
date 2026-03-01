package kotlinx.serialization.modules;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

public final class PolymorphicModuleBuilderKt {
   // $FF: synthetic method
   public static final <Base, T extends Base> void subclass(PolymorphicModuleBuilder<? super Base> $this$subclass, KSerializer<T> serializer) {
      Intrinsics.checkNotNullParameter($this$subclass, "<this>");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      int $i$f$subclass = false;
      Intrinsics.reifiedOperationMarker(4, "T");
      $this$subclass.subclass(Reflection.getOrCreateKotlinClass(Object.class), serializer);
   }

   // $FF: synthetic method
   public static final <Base, T extends Base> void subclass(PolymorphicModuleBuilder<? super Base> $this$subclass, KClass<T> clazz) {
      Intrinsics.checkNotNullParameter($this$subclass, "<this>");
      Intrinsics.checkNotNullParameter(clazz, "clazz");
      int $i$f$subclass = false;
      Intrinsics.reifiedOperationMarker(6, "T");
      MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
      $this$subclass.subclass(clazz, SerializersKt.serializer((KType)null));
   }
}
