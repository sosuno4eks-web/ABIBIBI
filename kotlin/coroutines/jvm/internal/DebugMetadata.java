package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlin.jvm.JvmName;

@Target(
   allowedTargets = {AnnotationTarget.CLASS}
)
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ElementType.TYPE})
@SinceKotlin(
   version = "1.3"
)
public @interface DebugMetadata {
   @JvmName(
      name = "v"
   )
   int v() default 1;

   @JvmName(
      name = "f"
   )
   String f() default "";

   @JvmName(
      name = "l"
   )
   int[] l() default {};

   @JvmName(
      name = "n"
   )
   String[] n() default {};

   @JvmName(
      name = "s"
   )
   String[] s() default {};

   @JvmName(
      name = "i"
   )
   int[] i() default {};

   @JvmName(
      name = "m"
   )
   String m() default "";

   @JvmName(
      name = "c"
   )
   String c() default "";
}
