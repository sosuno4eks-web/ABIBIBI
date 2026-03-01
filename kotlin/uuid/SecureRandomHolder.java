package kotlin.uuid;

import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;

final class SecureRandomHolder {
   @NotNull
   public static final SecureRandomHolder INSTANCE = new SecureRandomHolder();
   @NotNull
   private static final SecureRandom instance = new SecureRandom();

   private SecureRandomHolder() {
   }

   @NotNull
   public final SecureRandom getInstance() {
      return instance;
   }
}
