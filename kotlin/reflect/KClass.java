package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {
   @Nullable
   String getSimpleName();

   @Nullable
   String getQualifiedName();

   @NotNull
   Collection<KCallable<?>> getMembers();

   @NotNull
   Collection<KFunction<T>> getConstructors();

   @NotNull
   Collection<KClass<?>> getNestedClasses();

   @Nullable
   T getObjectInstance();

   @SinceKotlin(
      version = "1.1"
   )
   boolean isInstance(@Nullable Object var1);

   @NotNull
   List<KTypeParameter> getTypeParameters();

   @NotNull
   List<KType> getSupertypes();

   @NotNull
   List<KClass<? extends T>> getSealedSubclasses();

   @Nullable
   KVisibility getVisibility();

   boolean isFinal();

   boolean isOpen();

   boolean isAbstract();

   boolean isSealed();

   boolean isData();

   boolean isInner();

   boolean isCompanion();

   boolean isFun();

   boolean isValue();

   boolean equals(@Nullable Object var1);

   int hashCode();

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void getTypeParameters$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void getSupertypes$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.3"
      )
      public static void getSealedSubclasses$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void getVisibility$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isFinal$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isOpen$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isAbstract$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isSealed$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isData$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isInner$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isCompanion$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.4"
      )
      public static void isFun$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.5"
      )
      public static void isValue$annotations() {
      }
   }
}
