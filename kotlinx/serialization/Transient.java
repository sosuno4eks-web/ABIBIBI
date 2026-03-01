package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Target;

@MustBeDocumented
@Target(
   allowedTargets = {AnnotationTarget.PROPERTY}
)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({})
public @interface Transient {
}
