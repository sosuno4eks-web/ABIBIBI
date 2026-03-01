package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.experimental.ExperimentalTypeInference;

@Target(
   allowedTargets = {AnnotationTarget.FUNCTION}
)
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({ElementType.METHOD})
@SinceKotlin(
   version = "1.4"
)
@ExperimentalTypeInference
public @interface OverloadResolutionByLambdaReturnType {
}
