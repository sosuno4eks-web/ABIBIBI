package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ExceptionsCollector {
   private final int limit;
   private int totalExceptions;
   @NotNull
   private final List<Exception> collectedExceptions;
   @Nullable
   private Path path;

   public ExceptionsCollector(int limit) {
      this.limit = limit;
      this.collectedExceptions = (List)(new ArrayList());
   }

   // $FF: synthetic method
   public ExceptionsCollector(int var1, int var2, DefaultConstructorMarker var3) {
      if ((var2 & 1) != 0) {
         var1 = 64;
      }

      this(var1);
   }

   public final int getTotalExceptions() {
      return this.totalExceptions;
   }

   @NotNull
   public final List<Exception> getCollectedExceptions() {
      return this.collectedExceptions;
   }

   @Nullable
   public final Path getPath() {
      return this.path;
   }

   public final void setPath(@Nullable Path <set-?>) {
      this.path = var1;
   }

   public final void enterEntry(@NotNull Path name) {
      Intrinsics.checkNotNullParameter(name, "name");
      Path var10001 = this.path;
      this.path = var10001 != null ? var10001.resolve(name) : null;
   }

   public final void exitEntry(@NotNull Path name) {
      Intrinsics.checkNotNullParameter(name, "name");
      Path var10001 = this.path;
      if (!Intrinsics.areEqual((Object)name, (Object)(var10001 != null ? var10001.getFileName() : null))) {
         String var2 = "Failed requirement.";
         throw new IllegalArgumentException(var2.toString());
      } else {
         var10001 = this.path;
         this.path = var10001 != null ? var10001.getParent() : null;
      }
   }

   public final void collect(@NotNull Exception exception) {
      Intrinsics.checkNotNullParameter(exception, "exception");
      ++this.totalExceptions;
      boolean shouldCollect = this.collectedExceptions.size() < this.limit;
      if (shouldCollect) {
         Exception var4;
         if (this.path != null) {
            Throwable var10000 = (new FileSystemException(String.valueOf(this.path))).initCause((Throwable)exception);
            Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.nio.file.FileSystemException");
            var4 = (Exception)((FileSystemException)var10000);
         } else {
            var4 = exception;
         }

         Exception restoredException = var4;
         this.collectedExceptions.add(restoredException);
      }

   }

   public ExceptionsCollector() {
      this(0, 1, (DefaultConstructorMarker)null);
   }
}
