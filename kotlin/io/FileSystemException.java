package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FileSystemException extends IOException {
   @NotNull
   private final File file;
   @Nullable
   private final File other;
   @Nullable
   private final String reason;

   public FileSystemException(@NotNull File file, @Nullable File other, @Nullable String reason) {
      Intrinsics.checkNotNullParameter(file, "file");
      super(ExceptionsKt.access$constructMessage(file, other, reason));
      this.file = file;
      this.other = other;
      this.reason = reason;
   }

   // $FF: synthetic method
   public FileSystemException(File var1, File var2, String var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3);
   }

   @NotNull
   public final File getFile() {
      return this.file;
   }

   @Nullable
   public final File getOther() {
      return this.other;
   }

   @Nullable
   public final String getReason() {
      return this.reason;
   }
}
