package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FileAlreadyExistsException extends FileSystemException {
   public FileAlreadyExistsException(@NotNull File file, @Nullable File other, @Nullable String reason) {
      Intrinsics.checkNotNullParameter(file, "file");
      super(file, other, reason);
   }

   // $FF: synthetic method
   public FileAlreadyExistsException(File var1, File var2, String var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3);
   }
}
