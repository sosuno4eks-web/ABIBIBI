package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.internal.IntrinsicConstEvaluation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KCallable<R> extends KAnnotatedElement {
   @NotNull
   String getName();

   @NotNull
   List<KParameter> getParameters();

   @NotNull
   KType getReturnType();

   @NotNull
   List<KTypeParameter> getTypeParameters();

   R call(@NotNull Object... var1);

   R callBy(@NotNull Map<KParameter, ? extends Object> var1);

   @Nullable
   KVisibility getVisibility();

   boolean isFinal();

   boolean isOpen();

   boolean isAbstract();

   boolean isSuspend();

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @IntrinsicConstEvaluation
      public static void getName$annotations() {
      }

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
         version = "1.3"
      )
      public static void isSuspend$annotations() {
      }
   }
}
