package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PrimitivesKt {
   @NotNull
   private static final Map<KClass<?>, KSerializer<?>> BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();

   @NotNull
   public static final SerialDescriptor PrimitiveDescriptorSafe(@NotNull String serialName, @NotNull PrimitiveKind kind) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(kind, "kind");
      checkNameIsNotAPrimitive(serialName);
      return (SerialDescriptor)(new PrimitiveSerialDescriptor(serialName, kind));
   }

   public static final void checkNameIsNotAPrimitive(@NotNull String serialName) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Collection values = BUILTIN_SERIALIZERS.values();
      Iterator var2 = values.iterator();

      KSerializer primitive;
      String primitiveName;
      do {
         if (!var2.hasNext()) {
            return;
         }

         primitive = (KSerializer)var2.next();
         primitiveName = primitive.getDescriptor().getSerialName();
      } while(!Intrinsics.areEqual((Object)serialName, (Object)primitiveName));

      throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + Reflection.getOrCreateKotlinClass(primitive.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
   }

   private static final String capitalize(String $this$capitalize) {
      String var6;
      if (((CharSequence)$this$capitalize).length() > 0) {
         StringBuilder var10000 = new StringBuilder();
         char it = $this$capitalize.charAt(0);
         StringBuilder var4 = var10000;
         int var3 = false;
         var10000 = var4.append((CharSequence)(Character.isLowerCase(it) ? CharsKt.titlecase(it) : String.valueOf(it)));
         byte var5 = 1;
         String var10001 = $this$capitalize.substring(var5);
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         var6 = var10000.append(var10001).toString();
      } else {
         var6 = $this$capitalize;
      }

      return var6;
   }

   @Nullable
   public static final <T> KSerializer<T> builtinSerializerOrNull(@NotNull KClass<T> $this$builtinSerializerOrNull) {
      Intrinsics.checkNotNullParameter($this$builtinSerializerOrNull, "<this>");
      return (KSerializer)BUILTIN_SERIALIZERS.get($this$builtinSerializerOrNull);
   }
}
