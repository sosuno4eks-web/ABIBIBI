package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@MustBeDocumented
@Target(
   allowedTargets = {AnnotationTarget.PROPERTY}
)
@ExperimentalSerializationApi
@Documented
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({})
public @interface EncodeDefault {
   EncodeDefault.Mode mode() default EncodeDefault.Mode.ALWAYS;

   @ExperimentalSerializationApi
   public static enum Mode {
      ALWAYS,
      NEVER;

      // $FF: synthetic field
      private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

      @NotNull
      public static EnumEntries<EncodeDefault.Mode> getEntries() {
         return $ENTRIES;
      }

      // $FF: synthetic method
      private static final EncodeDefault.Mode[] $values() {
         EncodeDefault.Mode[] var0 = new EncodeDefault.Mode[]{ALWAYS, NEVER};
         return var0;
      }
   }
}
