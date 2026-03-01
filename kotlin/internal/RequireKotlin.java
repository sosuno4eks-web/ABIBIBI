package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.DeprecationLevel;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@Target(
   allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS}
)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@java.lang.annotation.Repeatable(RequireKotlin.Container.class)
@SinceKotlin(
   version = "1.2"
)
public @interface RequireKotlin {
   String version();

   String message() default "";

   DeprecationLevel level() default DeprecationLevel.ERROR;

   RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;

   int errorCode() default -1;

   @Target(
      allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS}
   )
   @Retention(AnnotationRetention.SOURCE)
   @RepeatableContainer
   @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
   @java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
   public @interface Container {
      RequireKotlin[] value();
   }
}
