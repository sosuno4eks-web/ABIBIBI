package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class FileVisitorImpl extends SimpleFileVisitor<Path> {
   @Nullable
   private final Function2<Path, BasicFileAttributes, FileVisitResult> onPreVisitDirectory;
   @Nullable
   private final Function2<Path, BasicFileAttributes, FileVisitResult> onVisitFile;
   @Nullable
   private final Function2<Path, IOException, FileVisitResult> onVisitFileFailed;
   @Nullable
   private final Function2<Path, IOException, FileVisitResult> onPostVisitDirectory;

   public FileVisitorImpl(@Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onPreVisitDirectory, @Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onVisitFile, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> onVisitFileFailed, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> onPostVisitDirectory) {
      this.onPreVisitDirectory = onPreVisitDirectory;
      this.onVisitFile = onVisitFile;
      this.onVisitFileFailed = onVisitFileFailed;
      this.onPostVisitDirectory = onPostVisitDirectory;
   }

   @NotNull
   public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) {
      Intrinsics.checkNotNullParameter(dir, "dir");
      Intrinsics.checkNotNullParameter(attrs, "attrs");
      Function2 var10000 = this.onPreVisitDirectory;
      FileVisitResult var3;
      if (var10000 != null) {
         var3 = (FileVisitResult)var10000.invoke(dir, attrs);
         if (var3 != null) {
            return var3;
         }
      }

      var3 = super.preVisitDirectory(dir, attrs);
      Intrinsics.checkNotNullExpressionValue(var3, "preVisitDirectory(...)");
      return var3;
   }

   @NotNull
   public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) {
      Intrinsics.checkNotNullParameter(file, "file");
      Intrinsics.checkNotNullParameter(attrs, "attrs");
      Function2 var10000 = this.onVisitFile;
      FileVisitResult var3;
      if (var10000 != null) {
         var3 = (FileVisitResult)var10000.invoke(file, attrs);
         if (var3 != null) {
            return var3;
         }
      }

      var3 = super.visitFile(file, attrs);
      Intrinsics.checkNotNullExpressionValue(var3, "visitFile(...)");
      return var3;
   }

   @NotNull
   public FileVisitResult visitFileFailed(@NotNull Path file, @NotNull IOException exc) {
      Intrinsics.checkNotNullParameter(file, "file");
      Intrinsics.checkNotNullParameter(exc, "exc");
      Function2 var10000 = this.onVisitFileFailed;
      FileVisitResult var3;
      if (var10000 != null) {
         var3 = (FileVisitResult)var10000.invoke(file, exc);
         if (var3 != null) {
            return var3;
         }
      }

      var3 = super.visitFileFailed(file, exc);
      Intrinsics.checkNotNullExpressionValue(var3, "visitFileFailed(...)");
      return var3;
   }

   @NotNull
   public FileVisitResult postVisitDirectory(@NotNull Path dir, @Nullable IOException exc) {
      Intrinsics.checkNotNullParameter(dir, "dir");
      Function2 var10000 = this.onPostVisitDirectory;
      FileVisitResult var3;
      if (var10000 != null) {
         var3 = (FileVisitResult)var10000.invoke(dir, exc);
         if (var3 != null) {
            return var3;
         }
      }

      var3 = super.postVisitDirectory(dir, exc);
      Intrinsics.checkNotNullExpressionValue(var3, "postVisitDirectory(...)");
      return var3;
   }
}
