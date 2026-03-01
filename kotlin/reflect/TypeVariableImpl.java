package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalStdlibApi
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {
   @NotNull
   private final KTypeParameter typeParameter;

   public TypeVariableImpl(@NotNull KTypeParameter typeParameter) {
      Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
      super();
      this.typeParameter = typeParameter;
   }

   @NotNull
   public String getName() {
      return this.typeParameter.getName();
   }

   @NotNull
   public GenericDeclaration getGenericDeclaration() {
      String var1 = "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.typeParameter;
      throw new NotImplementedError("An operation is not implemented: " + var1);
   }

   @NotNull
   public Type[] getBounds() {
      Iterable $this$map$iv = (Iterable)this.typeParameter.getUpperBounds();
      int $i$f$toTypedArray = false;
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
      int $i$f$mapTo = false;
      Iterator var6 = $this$map$iv.iterator();

      while(var6.hasNext()) {
         Object item$iv$iv = var6.next();
         KType it = (KType)item$iv$iv;
         int var9 = false;
         destination$iv$iv.add(TypesJVMKt.access$computeJavaType(it, true));
      }

      Collection $this$toTypedArray$iv = (Collection)((List)destination$iv$iv);
      $i$f$toTypedArray = false;
      return (Type[])$this$toTypedArray$iv.toArray(new Type[0]);
   }

   @NotNull
   public String getTypeName() {
      return this.getName();
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof TypeVariable && Intrinsics.areEqual((Object)this.getName(), (Object)((TypeVariable)other).getName()) && Intrinsics.areEqual((Object)this.getGenericDeclaration(), (Object)((TypeVariable)other).getGenericDeclaration());
   }

   public int hashCode() {
      return this.getName().hashCode() ^ this.getGenericDeclaration().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getTypeName();
   }

   @Nullable
   public final <T extends Annotation> T getAnnotation(@NotNull Class<T> annotationClass) {
      Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
      return null;
   }

   @NotNull
   public final Annotation[] getAnnotations() {
      return new Annotation[0];
   }

   @NotNull
   public final Annotation[] getDeclaredAnnotations() {
      return new Annotation[0];
   }
}
