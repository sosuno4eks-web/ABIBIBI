package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Target(
   allowedTargets = {AnnotationTarget.ANNOTATION_CLASS}
)
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(
   version = "1.3"
)
public @interface RequiresOptIn {
   String message() default "";

   RequiresOptIn.Level level() default RequiresOptIn.Level.ERROR;

   public static enum Level {
      WARNING,
      ERROR;

      // $FF: synthetic field
      private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

      @NotNull
      public static EnumEntries<RequiresOptIn.Level> getEntries() {
         return $ENTRIES;
      }

      // $FF: synthetic method
      private static final RequiresOptIn.Level[] $values() {
         RequiresOptIn.Level[] var0 = new RequiresOptIn.Level[]{WARNING, ERROR};
         return var0;
      }
   }
}
