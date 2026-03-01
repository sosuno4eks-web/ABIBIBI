package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllegalFileNameException extends FileSystemException {
   public IllegalFileNameException(@NotNull Path file, @Nullable Path other, @Nullable String message) {
      Intrinsics.checkNotNullParameter(file, "file");
      super(file.toString(), other != null ? other.toString() : null, message);
   }

   public IllegalFileNameException(@NotNull Path file) {
      Intrinsics.checkNotNullParameter(file, "file");
      this(file, (Path)null, (String)null);
   }
}
