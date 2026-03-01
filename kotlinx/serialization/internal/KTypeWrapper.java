package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class KTypeWrapper implements KType {
   @NotNull
   private final KType origin;

   public KTypeWrapper(@NotNull KType origin) {
      Intrinsics.checkNotNullParameter(origin, "origin");
      super();
      this.origin = origin;
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      return this.origin.getAnnotations();
   }

   @NotNull
   public List<KTypeProjection> getArguments() {
      return this.origin.getArguments();
   }

   @Nullable
   public KClassifier getClassifier() {
      return this.origin.getClassifier();
   }

   public boolean isMarkedNullable() {
      return this.origin.isMarkedNullable();
   }

   public boolean equals(@Nullable Object other) {
      if (other == null) {
         return false;
      } else if (!Intrinsics.areEqual((Object)this.origin, (Object)((other instanceof KTypeWrapper ? (KTypeWrapper)other : null) != null ? (other instanceof KTypeWrapper ? (KTypeWrapper)other : null).origin : null))) {
         return false;
      } else {
         KClassifier kClassifier = this.getClassifier();
         if (kClassifier instanceof KClass) {
            KClassifier otherClassifier = (other instanceof KType ? (KType)other : null) != null ? (other instanceof KType ? (KType)other : null).getClassifier() : null;
            return otherClassifier != null && otherClassifier instanceof KClass ? Intrinsics.areEqual((Object)JvmClassMappingKt.getJavaClass((KClass)kClassifier), (Object)JvmClassMappingKt.getJavaClass((KClass)otherClassifier)) : false;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return this.origin.hashCode();
   }

   @NotNull
   public String toString() {
      return "KTypeWrapper: " + this.origin;
   }
}
