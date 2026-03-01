package kotlin.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.ExperimentalMultiplatform;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target(
   allowedTargets = {AnnotationTarget.CLASS}
)
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({ElementType.TYPE})
@SinceKotlin(
   version = "2.2"
)
@ExperimentalMultiplatform
public @interface ExpectRefinement {
}
