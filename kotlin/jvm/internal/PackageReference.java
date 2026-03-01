package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public final class PackageReference implements ClassBasedDeclarationContainer {
   @NotNull
   private final Class<?> jClass;
   @NotNull
   private final String moduleName;

   public PackageReference(@NotNull Class<?> jClass, @NotNull String moduleName) {
      Intrinsics.checkNotNullParameter(jClass, "jClass");
      Intrinsics.checkNotNullParameter(moduleName, "moduleName");
      super();
      this.jClass = jClass;
      this.moduleName = moduleName;
   }

   @NotNull
   public Class<?> getJClass() {
      return this.jClass;
   }

   @NotNull
   public Collection<KCallable<?>> getMembers() {
      throw new KotlinReflectionNotSupportedError();
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof PackageReference && Intrinsics.areEqual((Object)this.getJClass(), (Object)((PackageReference)other).getJClass());
   }

   public int hashCode() {
      return this.getJClass().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getJClass() + " (Kotlin reflection is not available)";
   }
}
