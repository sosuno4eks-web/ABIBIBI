package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.DslMarker;

@Retention(RetentionPolicy.RUNTIME)
@DslMarker
public @interface JsonDslMarker {
}
