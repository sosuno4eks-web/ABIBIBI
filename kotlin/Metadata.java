package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.JvmName;

@Retention(AnnotationRetention.RUNTIME)
@Target(
   allowedTargets = {AnnotationTarget.CLASS}
)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ElementType.TYPE})
@SinceKotlin(
   version = "1.3"
)
public @interface Metadata {
   @JvmName(
      name = "k"
   )
   int k() default 1;

   @JvmName(
      name = "mv"
   )
   int[] mv() default {};

   /** @deprecated */
   @JvmName(
      name = "bv"
   )
   int[] bv() default {1, 0, 3};

   @JvmName(
      name = "d1"
   )
   String[] d1() default {};

   @JvmName(
      name = "d2"
   )
   String[] d2() default {};

   @JvmName(
      name = "xs"
   )
   String xs() default "";

   @JvmName(
      name = "pn"
   )
   String pn() default "";

   @JvmName(
      name = "xi"
   )
   int xi() default 0;

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @Deprecated(
         message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.",
         level = DeprecationLevel.WARNING
      )
      public static void bv$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.2"
      )
      public static void pn$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void xi$annotations() {
      }
   }
}
