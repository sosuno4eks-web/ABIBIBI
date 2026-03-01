package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialInfo;
import org.jetbrains.annotations.NotNull;

@Target(
   allowedTargets = {AnnotationTarget.PROPERTY}
)
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({})
@SerialInfo
public @interface JsonNames {
   String[] names();

   // $FF: synthetic class
   public static final class Impl implements JsonNames {
      // $FF: synthetic field
      private final String[] names;

      public Impl(@NotNull String[] names) {
         Intrinsics.checkNotNullParameter(names, "names");
         super();
         this.names = names;
      }

      // $FF: synthetic method
      public final String[] names() {
         return this.names;
      }
   }
}
