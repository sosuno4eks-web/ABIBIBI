package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FileVisitorBuilderImpl implements FileVisitorBuilder {
   @Nullable
   private Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onPreVisitDirectory;
   @Nullable
   private Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onVisitFile;
   @Nullable
   private Function2<? super Path, ? super IOException, ? extends FileVisitResult> onVisitFileFailed;
   @Nullable
   private Function2<? super Path, ? super IOException, ? extends FileVisitResult> onPostVisitDirectory;
   private boolean isBuilt;

   public void onPreVisitDirectory(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      this.checkIsNotBuilt();
      this.checkNotDefined(this.onPreVisitDirectory, "onPreVisitDirectory");
      this.onPreVisitDirectory = function;
   }

   public void onVisitFile(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      this.checkIsNotBuilt();
      this.checkNotDefined(this.onVisitFile, "onVisitFile");
      this.onVisitFile = function;
   }

   public void onVisitFileFailed(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      this.checkIsNotBuilt();
      this.checkNotDefined(this.onVisitFileFailed, "onVisitFileFailed");
      this.onVisitFileFailed = function;
   }

   public void onPostVisitDirectory(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      this.checkIsNotBuilt();
      this.checkNotDefined(this.onPostVisitDirectory, "onPostVisitDirectory");
      this.onPostVisitDirectory = function;
   }

   @NotNull
   public final FileVisitor<Path> build() {
      this.checkIsNotBuilt();
      this.isBuilt = true;
      return (FileVisitor)(new FileVisitorImpl(this.onPreVisitDirectory, this.onVisitFile, this.onVisitFileFailed, this.onPostVisitDirectory));
   }

   private final void checkIsNotBuilt() {
      if (this.isBuilt) {
         throw new IllegalStateException("This builder was already built");
      }
   }

   private final void checkNotDefined(Object function, String name) {
      if (function != null) {
         throw new IllegalStateException(name + " was already defined");
      }
   }
}
