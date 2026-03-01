package kotlin.io.path;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class PathsKt__PathUtilsKt extends PathsKt__PathRecursiveFunctionsKt {
   @NotNull
   public static final String getName(@NotNull Path $this$name) {
      Intrinsics.checkNotNullParameter($this$name, "<this>");
      Path var10000 = $this$name.getFileName();
      String var1 = var10000 != null ? var10000.toString() : null;
      if (var1 == null) {
         var1 = "";
      }

      return var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   public static void getName$annotations(Path <this>) {
   }

   @NotNull
   public static final String getNameWithoutExtension(@NotNull Path $this$nameWithoutExtension) {
      Intrinsics.checkNotNullParameter($this$nameWithoutExtension, "<this>");
      Path var10000 = $this$nameWithoutExtension.getFileName();
      String var1;
      if (var10000 != null) {
         var1 = var10000.toString();
         if (var1 != null) {
            var1 = StringsKt.substringBeforeLast$default(var1, ".", (String)null, 2, (Object)null);
            if (var1 != null) {
               return var1;
            }
         }
      }

      var1 = "";
      return var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   public static void getNameWithoutExtension$annotations(Path <this>) {
   }

   @NotNull
   public static final String getExtension(@NotNull Path $this$extension) {
      Intrinsics.checkNotNullParameter($this$extension, "<this>");
      Path var10000 = $this$extension.getFileName();
      String var1;
      if (var10000 != null) {
         var1 = var10000.toString();
         if (var1 != null) {
            var1 = StringsKt.substringAfterLast(var1, '.', "");
            if (var1 != null) {
               return var1;
            }
         }
      }

      var1 = "";
      return var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   public static void getExtension$annotations(Path <this>) {
   }

   private static final String getPathString(Path $this$pathString) {
      Intrinsics.checkNotNullParameter($this$pathString, "<this>");
      return $this$pathString.toString();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   public static void getPathString$annotations(Path <this>) {
   }

   @NotNull
   public static final String getInvariantSeparatorsPathString(@NotNull Path $this$invariantSeparatorsPathString) {
      Intrinsics.checkNotNullParameter($this$invariantSeparatorsPathString, "<this>");
      String separator = $this$invariantSeparatorsPathString.getFileSystem().getSeparator();
      String var10000;
      if (!Intrinsics.areEqual((Object)separator, (Object)"/")) {
         var10000 = $this$invariantSeparatorsPathString.toString();
         Intrinsics.checkNotNull(separator);
         var10000 = StringsKt.replace$default(var10000, separator, "/", false, 4, (Object)null);
      } else {
         var10000 = $this$invariantSeparatorsPathString.toString();
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   public static void getInvariantSeparatorsPathString$annotations(Path <this>) {
   }

   /** @deprecated */
   private static final String getInvariantSeparatorsPath(Path $this$invariantSeparatorsPath) {
      Intrinsics.checkNotNullParameter($this$invariantSeparatorsPath, "<this>");
      return PathsKt.getInvariantSeparatorsPathString($this$invariantSeparatorsPath);
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use invariantSeparatorsPathString property instead.",
      replaceWith = @ReplaceWith(
   expression = "invariantSeparatorsPathString",
   imports = {}
),
      level = DeprecationLevel.ERROR
   )
   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalPathApi
   @InlineOnly
   public static void getInvariantSeparatorsPath$annotations(Path <this>) {
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path absolute(Path $this$absolute) {
      Intrinsics.checkNotNullParameter($this$absolute, "<this>");
      Path var10000 = $this$absolute.toAbsolutePath();
      Intrinsics.checkNotNullExpressionValue(var10000, "toAbsolutePath(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final String absolutePathString(Path $this$absolutePathString) {
      Intrinsics.checkNotNullParameter($this$absolutePathString, "<this>");
      return $this$absolutePathString.toAbsolutePath().toString();
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final Path relativeTo(@NotNull Path $this$relativeTo, @NotNull Path base) {
      Intrinsics.checkNotNullParameter($this$relativeTo, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");

      try {
         Path var2 = PathRelativizer.INSTANCE.tryRelativeTo($this$relativeTo, base);
         return var2;
      } catch (IllegalArgumentException var4) {
         throw new IllegalArgumentException(var4.getMessage() + "\nthis path: " + $this$relativeTo + "\nbase path: " + base, (Throwable)var4);
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final Path relativeToOrSelf(@NotNull Path $this$relativeToOrSelf, @NotNull Path base) {
      Intrinsics.checkNotNullParameter($this$relativeToOrSelf, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");
      Path var10000 = PathsKt.relativeToOrNull($this$relativeToOrSelf, base);
      if (var10000 == null) {
         var10000 = $this$relativeToOrSelf;
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @Nullable
   public static final Path relativeToOrNull(@NotNull Path $this$relativeToOrNull, @NotNull Path base) {
      Intrinsics.checkNotNullParameter($this$relativeToOrNull, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");

      Path var2;
      try {
         var2 = PathRelativizer.INSTANCE.tryRelativeTo($this$relativeToOrNull, base);
      } catch (IllegalArgumentException var4) {
         var2 = null;
      }

      return var2;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path copyTo(Path $this$copyTo, Path target, boolean overwrite) throws IOException {
      Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      CopyOption[] var10000;
      if (overwrite) {
         CopyOption[] var4 = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
         var10000 = var4;
      } else {
         var10000 = new CopyOption[0];
      }

      CopyOption[] options = var10000;
      Path var5 = Files.copy($this$copyTo, target, (CopyOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var5, "copy(...)");
      return var5;
   }

   // $FF: synthetic method
   static Path copyTo$default(Path $this$copyTo_u24default, Path target, boolean overwrite, int var3, Object var4) throws IOException {
      if ((var3 & 2) != 0) {
         overwrite = false;
      }

      Intrinsics.checkNotNullParameter($this$copyTo_u24default, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      CopyOption[] var10000;
      if (overwrite) {
         CopyOption[] var6 = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
         var10000 = var6;
      } else {
         var10000 = new CopyOption[0];
      }

      CopyOption[] options = var10000;
      Path var7 = Files.copy($this$copyTo_u24default, target, (CopyOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var7, "copy(...)");
      return var7;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path copyTo(Path $this$copyTo, Path target, CopyOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.copy($this$copyTo, target, (CopyOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "copy(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean exists(Path $this$exists, LinkOption... options) {
      Intrinsics.checkNotNullParameter($this$exists, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return Files.exists($this$exists, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean notExists(Path $this$notExists, LinkOption... options) {
      Intrinsics.checkNotNullParameter($this$notExists, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return Files.notExists($this$notExists, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isRegularFile(Path $this$isRegularFile, LinkOption... options) {
      Intrinsics.checkNotNullParameter($this$isRegularFile, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return Files.isRegularFile($this$isRegularFile, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isDirectory(Path $this$isDirectory, LinkOption... options) {
      Intrinsics.checkNotNullParameter($this$isDirectory, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return Files.isDirectory($this$isDirectory, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isSymbolicLink(Path $this$isSymbolicLink) {
      Intrinsics.checkNotNullParameter($this$isSymbolicLink, "<this>");
      return Files.isSymbolicLink($this$isSymbolicLink);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isExecutable(Path $this$isExecutable) {
      Intrinsics.checkNotNullParameter($this$isExecutable, "<this>");
      return Files.isExecutable($this$isExecutable);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isHidden(Path $this$isHidden) throws IOException {
      Intrinsics.checkNotNullParameter($this$isHidden, "<this>");
      return Files.isHidden($this$isHidden);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isReadable(Path $this$isReadable) {
      Intrinsics.checkNotNullParameter($this$isReadable, "<this>");
      return Files.isReadable($this$isReadable);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isWritable(Path $this$isWritable) {
      Intrinsics.checkNotNullParameter($this$isWritable, "<this>");
      return Files.isWritable($this$isWritable);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean isSameFileAs(Path $this$isSameFileAs, Path other) throws IOException {
      Intrinsics.checkNotNullParameter($this$isSameFileAs, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return Files.isSameFile($this$isSameFileAs, other);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final List<Path> listDirectoryEntries(@NotNull Path $this$listDirectoryEntries, @NotNull String glob) throws IOException {
      Intrinsics.checkNotNullParameter($this$listDirectoryEntries, "<this>");
      Intrinsics.checkNotNullParameter(glob, "glob");
      Closeable var2 = (Closeable)Files.newDirectoryStream($this$listDirectoryEntries, glob);
      Throwable var3 = null;

      List var10;
      try {
         DirectoryStream it = (DirectoryStream)var2;
         int var5 = false;
         Intrinsics.checkNotNull(it);
         var10 = CollectionsKt.toList((Iterable)it);
      } catch (Throwable var8) {
         var3 = var8;
         throw var8;
      } finally {
         CloseableKt.closeFinally(var2, var3);
      }

      return var10;
   }

   // $FF: synthetic method
   public static List listDirectoryEntries$default(Path var0, String var1, int var2, Object var3) throws IOException {
      if ((var2 & 1) != 0) {
         var1 = "*";
      }

      return PathsKt.listDirectoryEntries(var0, var1);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <T> T useDirectoryEntries(Path $this$useDirectoryEntries, String glob, Function1<? super Sequence<? extends Path>, ? extends T> block) throws IOException {
      Intrinsics.checkNotNullParameter($this$useDirectoryEntries, "<this>");
      Intrinsics.checkNotNullParameter(glob, "glob");
      Intrinsics.checkNotNullParameter(block, "block");
      Closeable var3 = (Closeable)Files.newDirectoryStream($this$useDirectoryEntries, glob);
      Throwable var4 = null;

      Object var11;
      try {
         DirectoryStream it = (DirectoryStream)var3;
         int var6 = false;
         Intrinsics.checkNotNull(it);
         var11 = block.invoke(CollectionsKt.asSequence((Iterable)it));
      } catch (Throwable var9) {
         var4 = var9;
         throw var9;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var3, var4);
         InlineMarker.finallyEnd(1);
      }

      return var11;
   }

   // $FF: synthetic method
   static Object useDirectoryEntries$default(Path $this$useDirectoryEntries_u24default, String glob, Function1 block, int var3, Object var4) throws IOException {
      if ((var3 & 1) != 0) {
         glob = "*";
      }

      Intrinsics.checkNotNullParameter($this$useDirectoryEntries_u24default, "<this>");
      Intrinsics.checkNotNullParameter(glob, "glob");
      Intrinsics.checkNotNullParameter(block, "block");
      Closeable var11 = (Closeable)Files.newDirectoryStream($this$useDirectoryEntries_u24default, glob);
      Throwable var12 = null;

      Object var13;
      try {
         DirectoryStream it = (DirectoryStream)var11;
         int var6 = false;
         Intrinsics.checkNotNull(it);
         var13 = block.invoke(CollectionsKt.asSequence((Iterable)it));
      } catch (Throwable var9) {
         var12 = var9;
         throw var9;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var11, var12);
         InlineMarker.finallyEnd(1);
      }

      return var13;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final void forEachDirectoryEntry(Path $this$forEachDirectoryEntry, String glob, Function1<? super Path, Unit> action) throws IOException {
      Intrinsics.checkNotNullParameter($this$forEachDirectoryEntry, "<this>");
      Intrinsics.checkNotNullParameter(glob, "glob");
      Intrinsics.checkNotNullParameter(action, "action");
      Closeable var3 = (Closeable)Files.newDirectoryStream($this$forEachDirectoryEntry, glob);
      Throwable var4 = null;

      try {
         DirectoryStream it = (DirectoryStream)var3;
         int var6 = false;
         Intrinsics.checkNotNull(it);
         Iterable $this$forEach$iv = (Iterable)it;
         int $i$f$forEach = false;
         Iterator var9 = $this$forEach$iv.iterator();

         while(var9.hasNext()) {
            Object element$iv = var9.next();
            action.invoke(element$iv);
         }

         Unit var15 = Unit.INSTANCE;
      } catch (Throwable var13) {
         var4 = var13;
         throw var13;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var3, var4);
         InlineMarker.finallyEnd(1);
      }
   }

   // $FF: synthetic method
   static void forEachDirectoryEntry$default(Path $this$forEachDirectoryEntry_u24default, String glob, Function1 action, int var3, Object var4) throws IOException {
      if ((var3 & 1) != 0) {
         glob = "*";
      }

      Intrinsics.checkNotNullParameter($this$forEachDirectoryEntry_u24default, "<this>");
      Intrinsics.checkNotNullParameter(glob, "glob");
      Intrinsics.checkNotNullParameter(action, "action");
      Closeable var15 = (Closeable)Files.newDirectoryStream($this$forEachDirectoryEntry_u24default, glob);
      Throwable var16 = null;

      try {
         DirectoryStream it = (DirectoryStream)var15;
         int var6 = false;
         Intrinsics.checkNotNull(it);
         Iterable $this$forEach$iv = (Iterable)it;
         int $i$f$forEach = false;
         Iterator var9 = $this$forEach$iv.iterator();

         while(var9.hasNext()) {
            Object element$iv = var9.next();
            action.invoke(element$iv);
         }

         Unit var17 = Unit.INSTANCE;
      } catch (Throwable var13) {
         var16 = var13;
         throw var13;
      } finally {
         InlineMarker.finallyStart(1);
         CloseableKt.closeFinally(var15, var16);
         InlineMarker.finallyEnd(1);
      }
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final long fileSize(Path $this$fileSize) throws IOException {
      Intrinsics.checkNotNullParameter($this$fileSize, "<this>");
      return Files.size($this$fileSize);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final void deleteExisting(Path $this$deleteExisting) throws IOException {
      Intrinsics.checkNotNullParameter($this$deleteExisting, "<this>");
      Files.delete($this$deleteExisting);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final boolean deleteIfExists(Path $this$deleteIfExists) throws IOException {
      Intrinsics.checkNotNullParameter($this$deleteIfExists, "<this>");
      return Files.deleteIfExists($this$deleteIfExists);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createDirectory(Path $this$createDirectory, FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter($this$createDirectory, "<this>");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createDirectory($this$createDirectory, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createDirectory(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createDirectories(Path $this$createDirectories, FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter($this$createDirectories, "<this>");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createDirectories($this$createDirectories, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createDirectories(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.9"
   )
   @NotNull
   public static final Path createParentDirectories(@NotNull Path $this$createParentDirectories, @NotNull FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter($this$createParentDirectories, "<this>");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      int var4 = false;
      Path parent = $this$createParentDirectories.getParent();
      if (parent != null) {
         LinkOption[] var10001 = new LinkOption[0];
         if (!Files.isDirectory(parent, (LinkOption[])Arrays.copyOf(var10001, var10001.length))) {
            try {
               FileAttribute[] var8 = (FileAttribute[])Arrays.copyOf(attributes, attributes.length);
               Intrinsics.checkNotNullExpressionValue(Files.createDirectories(parent, (FileAttribute[])Arrays.copyOf(var8, var8.length)), "createDirectories(...)");
            } catch (FileAlreadyExistsException var7) {
               var10001 = new LinkOption[0];
               if (!Files.isDirectory(parent, (LinkOption[])Arrays.copyOf(var10001, var10001.length))) {
                  throw var7;
               }
            }
         }
      }

      return $this$createParentDirectories;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path moveTo(Path $this$moveTo, Path target, CopyOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$moveTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.move($this$moveTo, target, (CopyOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "move(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path moveTo(Path $this$moveTo, Path target, boolean overwrite) throws IOException {
      Intrinsics.checkNotNullParameter($this$moveTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      CopyOption[] var10000;
      if (overwrite) {
         CopyOption[] var4 = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
         var10000 = var4;
      } else {
         var10000 = new CopyOption[0];
      }

      CopyOption[] options = var10000;
      Path var5 = Files.move($this$moveTo, target, (CopyOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var5, "move(...)");
      return var5;
   }

   // $FF: synthetic method
   static Path moveTo$default(Path $this$moveTo_u24default, Path target, boolean overwrite, int var3, Object var4) throws IOException {
      if ((var3 & 2) != 0) {
         overwrite = false;
      }

      Intrinsics.checkNotNullParameter($this$moveTo_u24default, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      CopyOption[] var10000;
      if (overwrite) {
         CopyOption[] var6 = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
         var10000 = var6;
      } else {
         var10000 = new CopyOption[0];
      }

      CopyOption[] options = var10000;
      Path var7 = Files.move($this$moveTo_u24default, target, (CopyOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var7, "move(...)");
      return var7;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final FileStore fileStore(Path $this$fileStore) throws IOException {
      Intrinsics.checkNotNullParameter($this$fileStore, "<this>");
      FileStore var10000 = Files.getFileStore($this$fileStore);
      Intrinsics.checkNotNullExpressionValue(var10000, "getFileStore(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Object getAttribute(Path $this$getAttribute, String attribute, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$getAttribute, "<this>");
      Intrinsics.checkNotNullParameter(attribute, "attribute");
      Intrinsics.checkNotNullParameter(options, "options");
      return Files.getAttribute($this$getAttribute, attribute, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path setAttribute(Path $this$setAttribute, String attribute, Object value, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$setAttribute, "<this>");
      Intrinsics.checkNotNullParameter(attribute, "attribute");
      Intrinsics.checkNotNullParameter(options, "options");
      Path var10000 = Files.setAttribute($this$setAttribute, attribute, value, (LinkOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "setAttribute(...)");
      return var10000;
   }

   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <V extends FileAttributeView> V fileAttributesViewOrNull(Path $this$fileAttributesViewOrNull, LinkOption... options) {
      Intrinsics.checkNotNullParameter($this$fileAttributesViewOrNull, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      Intrinsics.reifiedOperationMarker(4, "V");
      return Files.getFileAttributeView($this$fileAttributesViewOrNull, (Class)FileAttributeView.class, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <V extends FileAttributeView> V fileAttributesView(Path $this$fileAttributesView, LinkOption... options) {
      Intrinsics.checkNotNullParameter($this$fileAttributesView, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      Intrinsics.reifiedOperationMarker(4, "V");
      FileAttributeView var10000 = Files.getFileAttributeView($this$fileAttributesView, (Class)FileAttributeView.class, (LinkOption[])Arrays.copyOf(options, options.length));
      if (var10000 != null) {
         return (FileAttributeView)var10000;
      } else {
         Intrinsics.reifiedOperationMarker(4, "V");
         PathsKt.fileAttributeViewNotAvailable($this$fileAttributesView, (Class)FileAttributeView.class);
         throw new KotlinNothingValueException();
      }
   }

   @PublishedApi
   @NotNull
   public static final Void fileAttributeViewNotAvailable(@NotNull Path path, @NotNull Class<?> attributeViewClass) {
      Intrinsics.checkNotNullParameter(path, "path");
      Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
      throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
   }

   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final <A extends BasicFileAttributes> A readAttributes(Path $this$readAttributes, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$readAttributes, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      Intrinsics.reifiedOperationMarker(4, "A");
      BasicFileAttributes var10000 = Files.readAttributes($this$readAttributes, (Class)BasicFileAttributes.class, (LinkOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "readAttributes(...)");
      return (BasicFileAttributes)var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Map<String, Object> readAttributes(Path $this$readAttributes, String attributes, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$readAttributes, "<this>");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Intrinsics.checkNotNullParameter(options, "options");
      Map var10000 = Files.readAttributes($this$readAttributes, attributes, (LinkOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "readAttributes(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final FileTime getLastModifiedTime(Path $this$getLastModifiedTime, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$getLastModifiedTime, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      FileTime var10000 = Files.getLastModifiedTime($this$getLastModifiedTime, (LinkOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "getLastModifiedTime(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path setLastModifiedTime(Path $this$setLastModifiedTime, FileTime value) throws IOException {
      Intrinsics.checkNotNullParameter($this$setLastModifiedTime, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      Path var10000 = Files.setLastModifiedTime($this$setLastModifiedTime, value);
      Intrinsics.checkNotNullExpressionValue(var10000, "setLastModifiedTime(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final UserPrincipal getOwner(Path $this$getOwner, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$getOwner, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return Files.getOwner($this$getOwner, (LinkOption[])Arrays.copyOf(options, options.length));
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path setOwner(Path $this$setOwner, UserPrincipal value) throws IOException {
      Intrinsics.checkNotNullParameter($this$setOwner, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      Path var10000 = Files.setOwner($this$setOwner, value);
      Intrinsics.checkNotNullExpressionValue(var10000, "setOwner(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Set<PosixFilePermission> getPosixFilePermissions(Path $this$getPosixFilePermissions, LinkOption... options) throws IOException {
      Intrinsics.checkNotNullParameter($this$getPosixFilePermissions, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      Set var10000 = Files.getPosixFilePermissions($this$getPosixFilePermissions, (LinkOption[])Arrays.copyOf(options, options.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "getPosixFilePermissions(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path setPosixFilePermissions(Path $this$setPosixFilePermissions, Set<? extends PosixFilePermission> value) throws IOException {
      Intrinsics.checkNotNullParameter($this$setPosixFilePermissions, "<this>");
      Intrinsics.checkNotNullParameter(value, "value");
      Path var10000 = Files.setPosixFilePermissions($this$setPosixFilePermissions, value);
      Intrinsics.checkNotNullExpressionValue(var10000, "setPosixFilePermissions(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createLinkPointingTo(Path $this$createLinkPointingTo, Path target) throws IOException {
      Intrinsics.checkNotNullParameter($this$createLinkPointingTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Path var10000 = Files.createLink($this$createLinkPointingTo, target);
      Intrinsics.checkNotNullExpressionValue(var10000, "createLink(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createSymbolicLinkPointingTo(Path $this$createSymbolicLinkPointingTo, Path target, FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter($this$createSymbolicLinkPointingTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createSymbolicLink($this$createSymbolicLinkPointingTo, target, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createSymbolicLink(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path readSymbolicLink(Path $this$readSymbolicLink) throws IOException {
      Intrinsics.checkNotNullParameter($this$readSymbolicLink, "<this>");
      Path var10000 = Files.readSymbolicLink($this$readSymbolicLink);
      Intrinsics.checkNotNullExpressionValue(var10000, "readSymbolicLink(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createFile(Path $this$createFile, FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter($this$createFile, "<this>");
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createFile($this$createFile, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createFile(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createTempFile(String prefix, String suffix, FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createTempFile(prefix, suffix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createTempFile(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Path createTempFile$default(String prefix, String suffix, FileAttribute[] attributes, int var3, Object var4) throws IOException {
      if ((var3 & 1) != 0) {
         prefix = null;
      }

      if ((var3 & 2) != 0) {
         suffix = null;
      }

      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createTempFile(prefix, suffix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createTempFile(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final Path createTempFile(@Nullable Path directory, @Nullable String prefix, @Nullable String suffix, @NotNull FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000;
      if (directory != null) {
         var10000 = Files.createTempFile(directory, prefix, suffix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
         Intrinsics.checkNotNullExpressionValue(var10000, "createTempFile(...)");
      } else {
         var10000 = Files.createTempFile(prefix, suffix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
         Intrinsics.checkNotNullExpressionValue(var10000, "createTempFile(...)");
      }

      return var10000;
   }

   // $FF: synthetic method
   public static Path createTempFile$default(Path var0, String var1, String var2, FileAttribute[] var3, int var4, Object var5) throws IOException {
      if ((var4 & 2) != 0) {
         var1 = null;
      }

      if ((var4 & 4) != 0) {
         var2 = null;
      }

      return PathsKt.createTempFile(var0, var1, var2, var3);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path createTempDirectory(String prefix, FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createTempDirectory(prefix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createTempDirectory(...)");
      return var10000;
   }

   // $FF: synthetic method
   static Path createTempDirectory$default(String prefix, FileAttribute[] attributes, int var2, Object var3) throws IOException {
      if ((var2 & 1) != 0) {
         prefix = null;
      }

      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000 = Files.createTempDirectory(prefix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "createTempDirectory(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @NotNull
   public static final Path createTempDirectory(@Nullable Path directory, @Nullable String prefix, @NotNull FileAttribute<?>... attributes) throws IOException {
      Intrinsics.checkNotNullParameter(attributes, "attributes");
      Path var10000;
      if (directory != null) {
         var10000 = Files.createTempDirectory(directory, prefix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
         Intrinsics.checkNotNullExpressionValue(var10000, "createTempDirectory(...)");
      } else {
         var10000 = Files.createTempDirectory(prefix, (FileAttribute[])Arrays.copyOf(attributes, attributes.length));
         Intrinsics.checkNotNullExpressionValue(var10000, "createTempDirectory(...)");
      }

      return var10000;
   }

   // $FF: synthetic method
   public static Path createTempDirectory$default(Path var0, String var1, FileAttribute[] var2, int var3, Object var4) throws IOException {
      if ((var3 & 2) != 0) {
         var1 = null;
      }

      return PathsKt.createTempDirectory(var0, var1, var2);
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path div(Path $this$div, Path other) {
      Intrinsics.checkNotNullParameter($this$div, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Path var10000 = $this$div.resolve(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path div(Path $this$div, String other) {
      Intrinsics.checkNotNullParameter($this$div, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      Path var10000 = $this$div.resolve(other);
      Intrinsics.checkNotNullExpressionValue(var10000, "resolve(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path Path(String path) {
      Intrinsics.checkNotNullParameter(path, "path");
      Path var10000 = Paths.get(path);
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path Path(String base, String... subpaths) {
      Intrinsics.checkNotNullParameter(base, "base");
      Intrinsics.checkNotNullParameter(subpaths, "subpaths");
      Path var10000 = Paths.get(base, (String[])Arrays.copyOf(subpaths, subpaths.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.5"
   )
   @InlineOnly
   private static final Path toPath(URI $this$toPath) {
      Intrinsics.checkNotNullParameter($this$toPath, "<this>");
      Path var10000 = Paths.get($this$toPath);
      Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      return var10000;
   }

   @WasExperimental(
      markerClass = {ExperimentalPathApi.class}
   )
   @SinceKotlin(
      version = "2.1"
   )
   @NotNull
   public static final Sequence<Path> walk(@NotNull Path $this$walk, @NotNull PathWalkOption... options) {
      Intrinsics.checkNotNullParameter($this$walk, "<this>");
      Intrinsics.checkNotNullParameter(options, "options");
      return (Sequence)(new PathTreeWalk($this$walk, options));
   }

   @WasExperimental(
      markerClass = {ExperimentalPathApi.class}
   )
   @SinceKotlin(
      version = "2.1"
   )
   public static final void visitFileTree(@NotNull Path $this$visitFileTree, @NotNull FileVisitor<Path> visitor, int maxDepth, boolean followLinks) {
      Intrinsics.checkNotNullParameter($this$visitFileTree, "<this>");
      Intrinsics.checkNotNullParameter(visitor, "visitor");
      Set options = followLinks ? SetsKt.setOf(FileVisitOption.FOLLOW_LINKS) : SetsKt.emptySet();
      Files.walkFileTree($this$visitFileTree, options, maxDepth, visitor);
   }

   // $FF: synthetic method
   public static void visitFileTree$default(Path var0, FileVisitor var1, int var2, boolean var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = Integer.MAX_VALUE;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      PathsKt.visitFileTree(var0, var1, var2, var3);
   }

   @WasExperimental(
      markerClass = {ExperimentalPathApi.class}
   )
   @SinceKotlin(
      version = "2.1"
   )
   public static final void visitFileTree(@NotNull Path $this$visitFileTree, int maxDepth, boolean followLinks, @NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter($this$visitFileTree, "<this>");
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      PathsKt.visitFileTree($this$visitFileTree, PathsKt.fileVisitor(builderAction), maxDepth, followLinks);
   }

   // $FF: synthetic method
   public static void visitFileTree$default(Path var0, int var1, boolean var2, Function1 var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = Integer.MAX_VALUE;
      }

      if ((var4 & 2) != 0) {
         var2 = false;
      }

      PathsKt.visitFileTree(var0, var1, var2, var3);
   }

   @WasExperimental(
      markerClass = {ExperimentalPathApi.class}
   )
   @SinceKotlin(
      version = "2.1"
   )
   @NotNull
   public static final FileVisitor<Path> fileVisitor(@NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) {
      Intrinsics.checkNotNullParameter(builderAction, "builderAction");
      FileVisitorBuilderImpl var1 = new FileVisitorBuilderImpl();
      builderAction.invoke(var1);
      return var1.build();
   }

   public PathsKt__PathUtilsKt() {
   }
}
