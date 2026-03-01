package kotlin.reflect;

import kotlin.Function;
import kotlin.SinceKotlin;

public interface KFunction<R> extends KCallable<R>, Function<R> {
   boolean isInline();

   boolean isExternal();

   boolean isOperator();

   boolean isInfix();

   boolean isSuspend();

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isInline$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isExternal$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isOperator$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isInfix$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isSuspend$annotations() {
      }
   }
}
