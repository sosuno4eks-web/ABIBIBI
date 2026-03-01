package kotlin.js;

import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.RequiresOptIn;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;

@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@RequiresOptIn(
   level = RequiresOptIn.Level.WARNING
)
@SinceKotlin(
   version = "2.0"
)
public @interface ExperimentalJsStatic {
}
