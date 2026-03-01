package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalStdlibApi
final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {
   @NotNull
   private final Class<?> rawType;
   @Nullable
   private final Type ownerType;
   @NotNull
   private final Type[] typeArguments;

   public ParameterizedTypeImpl(@NotNull Class<?> rawType, @Nullable Type ownerType, @NotNull List<? extends Type> typeArguments) {
      Intrinsics.checkNotNullParameter(rawType, "rawType");
      Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
      super();
      this.rawType = rawType;
      this.ownerType = ownerType;
      Collection $this$toTypedArray$iv = (Collection)typeArguments;
      int $i$f$toTypedArray = false;
      this.typeArguments = (Type[])$this$toTypedArray$iv.toArray(new Type[0]);
   }

   @NotNull
   public Type getRawType() {
      return (Type)this.rawType;
   }

   @Nullable
   public Type getOwnerType() {
      return this.ownerType;
   }

   @NotNull
   public Type[] getActualTypeArguments() {
      return this.typeArguments;
   }

   @NotNull
   public String getTypeName() {
      StringBuilder var1 = new StringBuilder();
      int var3 = false;
      if (this.ownerType != null) {
         var1.append(TypesJVMKt.access$typeToString(this.ownerType));
         var1.append("$");
         var1.append(this.rawType.getSimpleName());
      } else {
         var1.append(TypesJVMKt.access$typeToString((Type)this.rawType));
      }

      if (this.typeArguments.length != 0) {
         ArraysKt.joinTo$default(this.typeArguments, (Appendable)var1, (CharSequence)null, (CharSequence)"<", (CharSequence)">", 0, (CharSequence)null, (Function1)null.INSTANCE, 50, (Object)null);
      }

      return var1.toString();
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ParameterizedType && Intrinsics.areEqual((Object)this.rawType, (Object)((ParameterizedType)other).getRawType()) && Intrinsics.areEqual((Object)this.ownerType, (Object)((ParameterizedType)other).getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), ((ParameterizedType)other).getActualTypeArguments());
   }

   public int hashCode() {
      int var10000 = this.rawType.hashCode();
      Type var10001 = this.ownerType;
      return var10000 ^ (var10001 != null ? var10001.hashCode() : 0) ^ Arrays.hashCode(this.getActualTypeArguments());
   }

   @NotNull
   public String toString() {
      return this.getTypeName();
   }
}
