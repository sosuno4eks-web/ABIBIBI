package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialInfo;

@Target(
   allowedTargets = {AnnotationTarget.CLASS}
)
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ElementType.TYPE})
@SerialInfo
public @interface JsonIgnoreUnknownKeys {
   // $FF: synthetic class
   public static final class Impl implements JsonIgnoreUnknownKeys {
   }
}
