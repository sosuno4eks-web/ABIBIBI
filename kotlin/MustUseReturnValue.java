package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;

@Target(
   allowedTargets = {AnnotationTarget.FILE, AnnotationTarget.CLASS}
)
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ElementType.TYPE})
@SinceKotlin(
   version = "2.2"
)
public @interface MustUseReturnValue {
}
