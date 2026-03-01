package kotlin.reflect;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KClassesImplKt {
   @Nullable
   public static final String getQualifiedOrSimpleName(@NotNull KClass<?> $this$qualifiedOrSimpleName) {
      Intrinsics.checkNotNullParameter($this$qualifiedOrSimpleName, "<this>");
      int $i$f$getQualifiedOrSimpleName = false;
      return $this$qualifiedOrSimpleName.getQualifiedName();
   }
}
