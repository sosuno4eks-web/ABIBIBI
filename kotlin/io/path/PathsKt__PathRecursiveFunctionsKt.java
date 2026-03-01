package kotlin.io.path;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {
   @ExperimentalPathApi
   @SinceKotlin(
      version = "1.8"
   )
   @NotNull
   public static final Path copyToRecursively(@NotNull Path $this$copyToRecursively, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean followLinks, boolean overwrite) {
      Intrinsics.checkNotNullParameter($this$copyToRecursively, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Intrinsics.checkNotNullParameter(onError, "onError");
      return overwrite ? PathsKt.copyToRecursively($this$copyToRecursively, target, onError, followLinks, PathsKt__PathRecursiveFunctionsKt::copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt) : PathsKt.copyToRecursively$default($this$copyToRecursively, target, onError, followLinks, (Function3)null, 8, (Object)null);
   }

   // $FF: synthetic method
   public static Path copyToRecursively$default(Path var0, Path var1, Function3 var2, boolean var3, boolean var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = (Function3)null.INSTANCE;
      }

      return PathsKt.copyToRecursively(var0, var1, var2, var3, var4);
   }

   @ExperimentalPathApi
   @SinceKotlin(
      version = "1.8"
   )
   @NotNull
   public static final Path copyToRecursively(@NotNull Path $this$copyToRecursively, @NotNull Path target, @NotNull Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean followLinks, @NotNull Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) {
      Intrinsics.checkNotNullParameter($this$copyToRecursively, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Intrinsics.checkNotNullParameter(onError, "onError");
      Intrinsics.checkNotNullParameter(copyAction, "copyAction");
      LinkOption[] var6 = LinkFollowing.INSTANCE.toLinkOptions(followLinks);
      var6 = (LinkOption[])Arrays.copyOf(var6, var6.length);
      if (!Files.exists($this$copyToRecursively, (LinkOption[])Arrays.copyOf(var6, var6.length))) {
         throw new NoSuchFileException($this$copyToRecursively.toString(), target.toString(), "The source file doesn't exist.");
      } else {
         LinkOption[] var10001 = new LinkOption[0];
         if (Files.exists($this$copyToRecursively, (LinkOption[])Arrays.copyOf(var10001, var10001.length)) && (followLinks || !Files.isSymbolicLink($this$copyToRecursively))) {
            var10001 = new LinkOption[0];
            boolean targetExistsAndNotSymlink = Files.exists(target, (LinkOption[])Arrays.copyOf(var10001, var10001.length)) && !Files.isSymbolicLink(target);
            if (!targetExistsAndNotSymlink || !Files.isSameFile($this$copyToRecursively, target)) {
               boolean var12;
               if (!Intrinsics.areEqual((Object)$this$copyToRecursively.getFileSystem(), (Object)target.getFileSystem())) {
                  var12 = false;
               } else if (targetExistsAndNotSymlink) {
                  var12 = target.toRealPath().startsWith($this$copyToRecursively.toRealPath());
               } else {
                  Path var10000 = target.getParent();
                  if (var10000 == null) {
                     var12 = false;
                  } else {
                     Path it = var10000;
                     int var8 = false;
                     var10001 = new LinkOption[0];
                     var12 = Files.exists(it, (LinkOption[])Arrays.copyOf(var10001, var10001.length)) && it.toRealPath().startsWith($this$copyToRecursively.toRealPath());
                  }
               }

               boolean isSubdirectory = var12;
               if (isSubdirectory) {
                  throw new FileSystemException($this$copyToRecursively.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
               }
            }
         }

         Path normalizedTarget = target.normalize();
         ArrayList stack = new ArrayList();
         PathsKt.visitFileTree$default($this$copyToRecursively, 0, followLinks, PathsKt__PathRecursiveFunctionsKt::copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt, 1, (Object)null);
         return target;
      }
   }

   // $FF: synthetic method
   public static Path copyToRecursively$default(Path var0, Path var1, Function3 var2, boolean var3, Function3 var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = (Function3)null.INSTANCE;
      }

      if ((var5 & 8) != 0) {
         var4 = PathsKt__PathRecursiveFunctionsKt::copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
      }

      return PathsKt.copyToRecursively(var0, var1, var2, var3, var4);
   }

   @ExperimentalPathApi
   private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(CopyActionResult $this$toFileVisitResult) {
      FileVisitResult var10000;
      switch(PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0[$this$toFileVisitResult.ordinal()]) {
      case 1:
         var10000 = FileVisitResult.CONTINUE;
         break;
      case 2:
         var10000 = FileVisitResult.TERMINATE;
         break;
      case 3:
         var10000 = FileVisitResult.SKIP_SUBTREE;
         break;
      default:
         throw new NoWhenBranchMatchedException();
      }

      return var10000;
   }

   @ExperimentalPathApi
   private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(OnErrorResult $this$toFileVisitResult) {
      FileVisitResult var10000;
      switch(PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1[$this$toFileVisitResult.ordinal()]) {
      case 1:
         var10000 = FileVisitResult.TERMINATE;
         break;
      case 2:
         var10000 = FileVisitResult.SKIP_SUBTREE;
         break;
      default:
         throw new NoWhenBranchMatchedException();
      }

      return var10000;
   }

   @ExperimentalPathApi
   @SinceKotlin(
      version = "1.8"
   )
   public static final void deleteRecursively(@NotNull Path $this$deleteRecursively) {
      Intrinsics.checkNotNullParameter($this$deleteRecursively, "<this>");
      List suppressedExceptions = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt($this$deleteRecursively);
      if (!((Collection)suppressedExceptions).isEmpty()) {
         FileSystemException var2 = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
         FileSystemException $this$deleteRecursively_u24lambda_u248 = var2;
         int var4 = false;
         Iterable $this$forEach$iv = (Iterable)suppressedExceptions;
         int $i$f$forEach = false;
         Iterator var7 = $this$forEach$iv.iterator();

         while(var7.hasNext()) {
            Object element$iv = var7.next();
            Exception it = (Exception)element$iv;
            int var10 = false;
            ExceptionsKt.addSuppressed((Throwable)$this$deleteRecursively_u24lambda_u248, (Throwable)it);
         }

         throw (Throwable)var2;
      }
   }

   private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path $this$deleteRecursivelyImpl) {
      ExceptionsCollector collector = new ExceptionsCollector(0, 1, (DefaultConstructorMarker)null);
      boolean useInsecure = false;
      useInsecure = true;
      Path var10000 = $this$deleteRecursivelyImpl.getFileName();
      if (var10000 != null) {
         Path fileName = var10000;
         int var4 = false;
         var10000 = $this$deleteRecursivelyImpl.getParent();
         if (var10000 == null) {
            var10000 = $this$deleteRecursivelyImpl.getFileSystem().getPath("");
         }

         Path parent = var10000;

         DirectoryStream var6;
         try {
            var6 = Files.newDirectoryStream(parent);
         } catch (Throwable var16) {
            var6 = null;
         }

         if (var6 != null) {
            Closeable var17 = (Closeable)var6;
            Throwable var7 = null;

            try {
               DirectoryStream stream = (DirectoryStream)var17;
               int var10 = false;
               if (stream instanceof SecureDirectoryStream) {
                  useInsecure = false;
                  collector.setPath(parent);
                  handleEntry$PathsKt__PathRecursiveFunctionsKt((SecureDirectoryStream)stream, fileName, (Path)null, collector);
               }

               Unit var18 = Unit.INSTANCE;
            } catch (Throwable var14) {
               var7 = var14;
               throw var14;
            } finally {
               CloseableKt.closeFinally(var17, var7);
            }
         }
      }

      if (useInsecure) {
         insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt($this$deleteRecursivelyImpl, (Path)null, collector);
      }

      return collector.getCollectedExceptions();
   }

   private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(ExceptionsCollector collector, Function0<Unit> function) {
      boolean var2 = false;

      try {
         function.invoke();
      } catch (Exception var4) {
         collector.collect(var4);
      }

   }

   private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(Function0<? extends R> function) {
      boolean var1 = false;

      Object var2;
      try {
         var2 = function.invoke();
      } catch (NoSuchFileException var4) {
         var2 = null;
      }

      return var2;
   }

   private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> $this$handleEntry, Path name, Path parent, ExceptionsCollector collector) {
      collector.enterEntry(name);
      boolean var4 = false;

      try {
         int var5 = false;
         if (parent != null) {
            Path var10000 = collector.getPath();
            Intrinsics.checkNotNull(var10000);
            Path entry = var10000;
            PathsKt.checkFileName(entry);
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(entry, parent);
         }

         LinkOption[] var15 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
         boolean var7;
         if (isDirectory$PathsKt__PathRecursiveFunctionsKt($this$handleEntry, name, var15)) {
            int preEnterTotalExceptions = collector.getTotalExceptions();
            enterDirectory$PathsKt__PathRecursiveFunctionsKt($this$handleEntry, name, collector);
            if (preEnterTotalExceptions == collector.getTotalExceptions()) {
               var7 = false;

               Unit var9;
               try {
                  int var8 = false;
                  $this$handleEntry.deleteDirectory(name);
                  var9 = Unit.INSTANCE;
               } catch (NoSuchFileException var13) {
                  var9 = null;
               }
            }
         } else {
            boolean var17 = false;

            Unit var18;
            try {
               var7 = false;
               $this$handleEntry.deleteFile(name);
               var18 = Unit.INSTANCE;
            } catch (NoSuchFileException var12) {
               var18 = null;
            }
         }
      } catch (Exception var14) {
         collector.collect(var14);
      }

      collector.exitEntry(name);
   }

   private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> $this$enterDirectory, Path name, ExceptionsCollector collector) {
      boolean var3 = false;

      try {
         int var4 = false;
         boolean var5 = false;

         SecureDirectoryStream var8;
         try {
            int var6 = false;
            LinkOption[] var7 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
            var8 = $this$enterDirectory.newDirectoryStream(name, var7);
         } catch (NoSuchFileException var17) {
            var8 = null;
         }

         if (var8 != null) {
            Closeable var21 = (Closeable)var8;
            Throwable var22 = null;

            try {
               SecureDirectoryStream directoryStream = (SecureDirectoryStream)var21;
               int var25 = false;
               Iterator var10000 = directoryStream.iterator();
               Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
               Iterator var9 = var10000;

               while(var9.hasNext()) {
                  Path entry = (Path)var9.next();
                  Path var10001 = entry.getFileName();
                  Intrinsics.checkNotNullExpressionValue(var10001, "getFileName(...)");
                  handleEntry$PathsKt__PathRecursiveFunctionsKt(directoryStream, var10001, collector.getPath(), collector);
               }

               Unit var24 = Unit.INSTANCE;
            } catch (Throwable var18) {
               var22 = var18;
               throw var18;
            } finally {
               CloseableKt.closeFinally(var21, var22);
            }
         }
      } catch (Exception var20) {
         collector.collect(var20);
      }

   }

   private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> $this$isDirectory, Path entryName, LinkOption... options) {
      boolean var3 = false;

      Boolean var5;
      try {
         int var4 = false;
         var5 = ((BasicFileAttributeView)$this$isDirectory.getFileAttributeView(entryName, BasicFileAttributeView.class, (LinkOption[])Arrays.copyOf(options, options.length))).readAttributes().isDirectory();
      } catch (NoSuchFileException var7) {
         var5 = null;
      }

      return var5 != null ? var5 : false;
   }

   private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path entry, Path parent, ExceptionsCollector collector) {
      boolean var3 = false;

      try {
         int var4 = false;
         if (parent != null) {
            PathsKt.checkFileName(entry);
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(entry, parent);
         }

         LinkOption[] var6 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
         if (Files.isDirectory(entry, (LinkOption[])Arrays.copyOf(var6, var6.length))) {
            int preEnterTotalExceptions = collector.getTotalExceptions();
            insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(entry, collector);
            if (preEnterTotalExceptions == collector.getTotalExceptions()) {
               Files.deleteIfExists(entry);
            }
         } else {
            Files.deleteIfExists(entry);
         }
      } catch (Exception var8) {
         collector.collect(var8);
      }

   }

   private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector collector) {
      boolean var2 = false;

      try {
         int var3 = false;
         boolean var4 = false;

         DirectoryStream directoryStream;
         try {
            int var5 = false;
            directoryStream = Files.newDirectoryStream(path);
         } catch (NoSuchFileException var16) {
            directoryStream = null;
         }

         if (directoryStream != null) {
            Closeable var20 = (Closeable)directoryStream;
            Throwable var21 = null;

            try {
               directoryStream = (DirectoryStream)var20;
               int var8 = false;
               Iterator var10000 = directoryStream.iterator();
               Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
               Iterator var9 = var10000;

               while(var9.hasNext()) {
                  Path entry = (Path)var9.next();
                  Intrinsics.checkNotNull(entry);
                  insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(entry, path, collector);
               }

               Unit var22 = Unit.INSTANCE;
            } catch (Throwable var17) {
               var21 = var17;
               throw var17;
            } finally {
               CloseableKt.closeFinally(var20, var21);
            }
         }
      } catch (Exception var19) {
         collector.collect(var19);
      }

   }

   public static final void checkFileName(@NotNull Path $this$checkFileName) {
      Intrinsics.checkNotNullParameter($this$checkFileName, "<this>");
      String fileName = PathsKt.getName($this$checkFileName);
      switch(fileName.hashCode()) {
      case 46:
         if (fileName.equals(".")) {
            throw new IllegalFileNameException($this$checkFileName);
         }
         break;
      case 1472:
         if (fileName.equals("..")) {
            throw new IllegalFileNameException($this$checkFileName);
         }
         break;
      case 1473:
         if (fileName.equals("./")) {
            throw new IllegalFileNameException($this$checkFileName);
         }
         break;
      case 1518:
         if (fileName.equals(".\\")) {
            throw new IllegalFileNameException($this$checkFileName);
         }
         break;
      case 45679:
         if (fileName.equals("../")) {
            throw new IllegalFileNameException($this$checkFileName);
         }
         break;
      case 45724:
         if (fileName.equals("..\\")) {
            throw new IllegalFileNameException($this$checkFileName);
         }
      }

   }

   private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(Path $this$checkNotSameAs, Path parent) {
      if (!Files.isSymbolicLink($this$checkNotSameAs) && Files.isSameFile($this$checkNotSameAs, parent)) {
         throw new FileSystemLoopException($this$checkNotSameAs.toString());
      }
   }

   private static final CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(boolean $followLinks, CopyActionContext $this$copyToRecursively, Path src, Path dst) {
      Intrinsics.checkNotNullParameter($this$copyToRecursively, "$this$copyToRecursively");
      Intrinsics.checkNotNullParameter(src, "src");
      Intrinsics.checkNotNullParameter(dst, "dst");
      LinkOption[] options = LinkFollowing.INSTANCE.toLinkOptions($followLinks);
      LinkOption[] var7 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
      boolean dstIsDirectory = Files.isDirectory(dst, (LinkOption[])Arrays.copyOf(var7, var7.length));
      LinkOption[] var10001 = (LinkOption[])Arrays.copyOf(options, options.length);
      boolean srcIsDirectory = Files.isDirectory(src, (LinkOption[])Arrays.copyOf(var10001, var10001.length));
      if (!srcIsDirectory || !dstIsDirectory) {
         if (dstIsDirectory) {
            PathsKt.deleteRecursively(dst);
         }

         SpreadBuilder var8 = new SpreadBuilder(2);
         var8.addSpread(options);
         var8.add(StandardCopyOption.REPLACE_EXISTING);
         CopyOption[] var9 = (CopyOption[])var8.toArray(new CopyOption[var8.size()]);
         Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[])Arrays.copyOf(var9, var9.length)), "copy(...)");
      }

      return CopyActionResult.CONTINUE;
   }

   private static final CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(boolean $followLinks, CopyActionContext <this>, Path src, Path dst) {
      Intrinsics.checkNotNullParameter(var1, "<this>");
      Intrinsics.checkNotNullParameter(src, "src");
      Intrinsics.checkNotNullParameter(dst, "dst");
      return var1.copyToIgnoringExistingDirectory(src, dst, $followLinks);
   }

   private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source) {
      Path relativePath = PathsKt.relativeTo(source, $this_copyToRecursively);
      Path destination = $target.resolve(relativePath.toString());
      if (!destination.normalize().startsWith(normalizedTarget)) {
         throw new IllegalFileNameException(source, destination, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
      } else {
         Intrinsics.checkNotNull(destination);
         return destination;
      }
   }

   private static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> $onError, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source, Exception exception) {
      return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt((OnErrorResult)$onError.invoke(source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt($this_copyToRecursively, $target, normalizedTarget, source), exception));
   }

   private static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(ArrayList<Path> stack, Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> $copyAction, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> $onError, Path source, BasicFileAttributes attributes) {
      FileVisitResult var8;
      try {
         if (!((Collection)stack).isEmpty()) {
            PathsKt.checkFileName(source);
            Object var10001 = CollectionsKt.last((List)stack);
            Intrinsics.checkNotNullExpressionValue(var10001, "last(...)");
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(source, (Path)var10001);
         }

         var8 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt((CopyActionResult)$copyAction.invoke(DefaultCopyActionContext.INSTANCE, source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt($this_copyToRecursively, $target, normalizedTarget, source)));
      } catch (Exception var10) {
         var8 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt($onError, $this_copyToRecursively, $target, normalizedTarget, source, var10);
      }

      return var8;
   }

   private static final FileVisitResult copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $copyAction, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Function3 $onError, Path directory, BasicFileAttributes attributes) {
      Intrinsics.checkNotNullParameter(directory, "directory");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      FileVisitResult var8 = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError, directory, attributes);
      int var10 = false;
      if (var8 == FileVisitResult.CONTINUE) {
         $stack.add(directory);
      }

      return var8;
   }

   private static final FileVisitResult copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $onError, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Path directory, IOException exception) {
      Intrinsics.checkNotNullParameter(directory, "directory");
      CollectionsKt.removeLast((List)$stack);
      return exception == null ? FileVisitResult.CONTINUE : copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt($onError, $this_copyToRecursively, $target, $normalizedTarget, directory, (Exception)exception);
   }

   private static final Unit copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $copyAction, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Function3 $onError, FileVisitorBuilder $this$visitFileTree) {
      Intrinsics.checkNotNullParameter($this$visitFileTree, "$this$visitFileTree");
      $this$visitFileTree.onPreVisitDirectory(PathsKt__PathRecursiveFunctionsKt::copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt);
      $this$visitFileTree.onVisitFile((Function2)(new Function2<Path, BasicFileAttributes, FileVisitResult>($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError) {
         // $FF: synthetic field
         final ArrayList<Path> $stack;
         // $FF: synthetic field
         final Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
         // $FF: synthetic field
         final Path $this_copyToRecursively;
         // $FF: synthetic field
         final Path $target;
         // $FF: synthetic field
         final Path $normalizedTarget;
         // $FF: synthetic field
         final Function3<Path, Path, Exception, OnErrorResult> $onError;

         {
            this.$stack = $stack;
            this.$copyAction = $copyAction;
            this.$this_copyToRecursively = $receiver;
            this.$target = $target;
            this.$normalizedTarget = $normalizedTarget;
            this.$onError = $onError;
         }

         public final FileVisitResult invoke(Path p0, BasicFileAttributes p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError, p0, p1);
         }
      }));
      $this$visitFileTree.onVisitFileFailed((Function2)(new Function2<Path, Exception, FileVisitResult>($onError, $this_copyToRecursively, $target, $normalizedTarget) {
         // $FF: synthetic field
         final Function3<Path, Path, Exception, OnErrorResult> $onError;
         // $FF: synthetic field
         final Path $this_copyToRecursively;
         // $FF: synthetic field
         final Path $target;
         // $FF: synthetic field
         final Path $normalizedTarget;

         {
            this.$onError = $onError;
            this.$this_copyToRecursively = $receiver;
            this.$target = $target;
            this.$normalizedTarget = $normalizedTarget;
         }

         public final FileVisitResult invoke(Path p0, Exception p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, p0, p1);
         }
      }));
      $this$visitFileTree.onPostVisitDirectory(PathsKt__PathRecursiveFunctionsKt::copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt);
      return Unit.INSTANCE;
   }

   public PathsKt__PathRecursiveFunctionsKt() {
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$1;

      static {
         int[] var0 = new int[CopyActionResult.values().length];

         try {
            var0[CopyActionResult.CONTINUE.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
         }

         try {
            var0[CopyActionResult.TERMINATE.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
         }

         $EnumSwitchMapping$0 = var0;
         var0 = new int[OnErrorResult.values().length];

         try {
            var0[OnErrorResult.TERMINATE.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$1 = var0;
      }
   }
}
