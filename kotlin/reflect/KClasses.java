package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "KClasses"
)
public final class KClasses {
   @SinceKotlin(
      version = "1.4"
   )
   @LowPriorityInOverloadResolution
   @NotNull
   public static final <T> T cast(@NotNull KClass<T> $this$cast, @Nullable Object value) {
      Intrinsics.checkNotNullParameter($this$cast, "<this>");
      if (!$this$cast.isInstance(value)) {
         StringBuilder var10002 = (new StringBuilder()).append("Value cannot be cast to ");
         int $i$f$getQualifiedOrSimpleName = false;
         throw new ClassCastException(var10002.append($this$cast.getQualifiedName()).toString());
      } else {
         Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
         return value;
      }
   }

   @SinceKotlin(
      version = "1.4"
   )
   @LowPriorityInOverloadResolution
   @Nullable
   public static final <T> T safeCast(@NotNull KClass<T> $this$safeCast, @Nullable Object value) {
      Intrinsics.checkNotNullParameter($this$safeCast, "<this>");
      Object var10000;
      if ($this$safeCast.isInstance(value)) {
         Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
         var10000 = value;
      } else {
         var10000 = null;
      }

      return var10000;
   }
}
