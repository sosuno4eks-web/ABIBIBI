package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InheritableSerialInfo;
import org.jetbrains.annotations.NotNull;

@Target(
   allowedTargets = {AnnotationTarget.CLASS}
)
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ElementType.TYPE})
@InheritableSerialInfo
public @interface JsonClassDiscriminator {
   String discriminator();

   // $FF: synthetic class
   public static final class Impl implements JsonClassDiscriminator {
      // $FF: synthetic field
      private final String discriminator;

      public Impl(@NotNull String discriminator) {
         Intrinsics.checkNotNullParameter(discriminator, "discriminator");
         super();
         this.discriminator = discriminator;
      }

      // $FF: synthetic method
      public final String discriminator() {
         return this.discriminator;
      }
   }
}
