package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class TerminateException extends FileSystemException {
   public TerminateException(@NotNull File file) {
      Intrinsics.checkNotNullParameter(file, "file");
      super(file, (File)null, (String)null, 6, (DefaultConstructorMarker)null);
   }
}
