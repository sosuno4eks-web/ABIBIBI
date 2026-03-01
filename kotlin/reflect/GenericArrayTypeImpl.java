package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalStdlibApi
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {
   @NotNull
   private final Type elementType;

   public GenericArrayTypeImpl(@NotNull Type elementType) {
      Intrinsics.checkNotNullParameter(elementType, "elementType");
      super();
      this.elementType = elementType;
   }

   @NotNull
   public Type getGenericComponentType() {
      return this.elementType;
   }

   @NotNull
   public String getTypeName() {
      return TypesJVMKt.access$typeToString(this.elementType) + "[]";
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof GenericArrayType && Intrinsics.areEqual((Object)this.getGenericComponentType(), (Object)((GenericArrayType)other).getGenericComponentType());
   }

   public int hashCode() {
      return this.getGenericComponentType().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getTypeName();
   }
}
