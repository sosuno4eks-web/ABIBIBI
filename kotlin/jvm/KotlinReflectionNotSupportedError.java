package kotlin.jvm;

import org.jetbrains.annotations.Nullable;

public class KotlinReflectionNotSupportedError extends Error {
   public KotlinReflectionNotSupportedError() {
      super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
   }

   public KotlinReflectionNotSupportedError(@Nullable String message) {
      super(message);
   }

   public KotlinReflectionNotSupportedError(@Nullable String message, @Nullable Throwable cause) {
      super(message, cause);
   }

   public KotlinReflectionNotSupportedError(@Nullable Throwable cause) {
      super(cause);
   }
}
