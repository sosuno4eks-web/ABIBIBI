package kotlin.js;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.RequiresOptIn;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Retention(AnnotationRetention.BINARY)
@Target(
   allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION}
)
@MustBeDocumented
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD})
@RequiresOptIn(
   level = RequiresOptIn.Level.WARNING
)
@SinceKotlin(
   version = "2.0"
)
public @interface ExperimentalJsCollectionsApi {
}
