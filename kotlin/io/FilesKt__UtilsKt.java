package kotlin.io;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
   /** @deprecated */
   @Deprecated(
      message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead."
   )
   @NotNull
   public static final File createTempDir(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) {
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      File dir = File.createTempFile(prefix, suffix, directory);
      dir.delete();
      if (dir.mkdir()) {
         Intrinsics.checkNotNull(dir);
         return dir;
      } else {
         throw new IOException("Unable to create temporary directory " + dir + '.');
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   public static File createTempDir$default(String var0, String var1, File var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var0 = "tmp";
      }

      if ((var3 & 2) != 0) {
         var1 = null;
      }

      if ((var3 & 4) != 0) {
         var2 = null;
      }

      return FilesKt.createTempDir(var0, var1, var2);
   }

   /** @deprecated */
   @Deprecated(
      message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile."
   )
   @NotNull
   public static final File createTempFile(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) {
      Intrinsics.checkNotNullParameter(prefix, "prefix");
      File var10000 = File.createTempFile(prefix, suffix, directory);
      Intrinsics.checkNotNullExpressionValue(var10000, "createTempFile(...)");
      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   public static File createTempFile$default(String var0, String var1, File var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var0 = "tmp";
      }

      if ((var3 & 2) != 0) {
         var1 = null;
      }

      if ((var3 & 4) != 0) {
         var2 = null;
      }

      return FilesKt.createTempFile(var0, var1, var2);
   }

   @NotNull
   public static final String getExtension(@NotNull File $this$extension) {
      Intrinsics.checkNotNullParameter($this$extension, "<this>");
      String var10000 = $this$extension.getName();
      Intrinsics.checkNotNullExpressionValue(var10000, "getName(...)");
      return StringsKt.substringAfterLast(var10000, '.', "");
   }

   @NotNull
   public static final String getInvariantSeparatorsPath(@NotNull File $this$invariantSeparatorsPath) {
      Intrinsics.checkNotNullParameter($this$invariantSeparatorsPath, "<this>");
      String var10000;
      if (File.separatorChar != '/') {
         var10000 = $this$invariantSeparatorsPath.getPath();
         Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
         var10000 = StringsKt.replace$default(var10000, File.separatorChar, '/', false, 4, (Object)null);
      } else {
         var10000 = $this$invariantSeparatorsPath.getPath();
         Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
      }

      return var10000;
   }

   @NotNull
   public static final String getNameWithoutExtension(@NotNull File $this$nameWithoutExtension) {
      Intrinsics.checkNotNullParameter($this$nameWithoutExtension, "<this>");
      String var10000 = $this$nameWithoutExtension.getName();
      Intrinsics.checkNotNullExpressionValue(var10000, "getName(...)");
      return StringsKt.substringBeforeLast$default(var10000, ".", (String)null, 2, (Object)null);
   }

   @NotNull
   public static final String toRelativeString(@NotNull File $this$toRelativeString, @NotNull File base) {
      Intrinsics.checkNotNullParameter($this$toRelativeString, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");
      return toRelativeStringOrNull$FilesKt__UtilsKt($this$toRelativeString, base);
   }

   @NotNull
   public static final File relativeTo(@NotNull File $this$relativeTo, @NotNull File base) {
      Intrinsics.checkNotNullParameter($this$relativeTo, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");
      return new File(FilesKt.toRelativeString($this$relativeTo, base));
   }

   @NotNull
   public static final File relativeToOrSelf(@NotNull File $this$relativeToOrSelf, @NotNull File base) {
      Intrinsics.checkNotNullParameter($this$relativeToOrSelf, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");
      String var10000 = toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrSelf, base);
      File var4;
      if (var10000 != null) {
         String p0 = var10000;
         int var3 = false;
         var4 = new File(p0);
      } else {
         var4 = $this$relativeToOrSelf;
      }

      return var4;
   }

   @Nullable
   public static final File relativeToOrNull(@NotNull File $this$relativeToOrNull, @NotNull File base) {
      Intrinsics.checkNotNullParameter($this$relativeToOrNull, "<this>");
      Intrinsics.checkNotNullParameter(base, "base");
      String var10000 = toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrNull, base);
      File var4;
      if (var10000 != null) {
         String p0 = var10000;
         int var3 = false;
         var4 = new File(p0);
      } else {
         var4 = null;
      }

      return var4;
   }

   private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File $this$toRelativeStringOrNull, File base) {
      FilePathComponents thisComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents($this$toRelativeStringOrNull));
      FilePathComponents baseComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents(base));
      if (!Intrinsics.areEqual((Object)thisComponents.getRoot(), (Object)baseComponents.getRoot())) {
         return null;
      } else {
         int baseCount = baseComponents.getSize();
         int thisCount = thisComponents.getSize();
         int var9 = false;
         int i = 0;

         for(int maxSameCount = Math.min(thisCount, baseCount); i < maxSameCount && Intrinsics.areEqual(thisComponents.getSegments().get(i), baseComponents.getSegments().get(i)); ++i) {
         }

         int sameCount = i;
         StringBuilder res = new StringBuilder();
         int i = baseCount - 1;
         if (i <= i) {
            while(true) {
               if (Intrinsics.areEqual((Object)((File)baseComponents.getSegments().get(i)).getName(), (Object)"..")) {
                  return null;
               }

               res.append("..");
               if (i != sameCount) {
                  res.append(File.separatorChar);
               }

               if (i == sameCount) {
                  break;
               }

               --i;
            }
         }

         if (sameCount < thisCount) {
            if (sameCount < baseCount) {
               res.append(File.separatorChar);
            }

            Iterable var10000 = (Iterable)CollectionsKt.drop((Iterable)thisComponents.getSegments(), sameCount);
            Appendable var10001 = (Appendable)res;
            String var10002 = File.separator;
            Intrinsics.checkNotNullExpressionValue(var10002, "separator");
            CollectionsKt.joinTo$default(var10000, var10001, (CharSequence)var10002, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 124, (Object)null);
         }

         return res.toString();
      }
   }

   @NotNull
   public static final File copyTo(@NotNull File $this$copyTo, @NotNull File target, boolean overwrite, int bufferSize) {
      Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      if (!$this$copyTo.exists()) {
         throw new NoSuchFileException($this$copyTo, (File)null, "The source file doesn't exist.", 2, (DefaultConstructorMarker)null);
      } else {
         if (target.exists()) {
            if (!overwrite) {
               throw new FileAlreadyExistsException($this$copyTo, target, "The destination file already exists.");
            }

            if (!target.delete()) {
               throw new FileAlreadyExistsException($this$copyTo, target, "Tried to overwrite the destination, but failed to delete it.");
            }
         }

         if ($this$copyTo.isDirectory()) {
            if (!target.mkdirs()) {
               throw new FileSystemException($this$copyTo, target, "Failed to create target directory.");
            }
         } else {
            File var10000 = target.getParentFile();
            if (var10000 != null) {
               var10000.mkdirs();
            }

            Closeable var4 = (Closeable)(new FileInputStream($this$copyTo));
            Throwable var5 = null;

            try {
               FileInputStream input = (FileInputStream)var4;
               int var7 = false;
               Closeable var8 = (Closeable)(new FileOutputStream(target));
               Throwable var9 = null;

               long var26;
               try {
                  FileOutputStream output = (FileOutputStream)var8;
                  int var12 = false;
                  var26 = ByteStreamsKt.copyTo((InputStream)input, (OutputStream)output, bufferSize);
               } catch (Throwable var21) {
                  var9 = var21;
                  throw var21;
               } finally {
                  CloseableKt.closeFinally(var8, var9);
               }

               Long var25 = var26;
            } catch (Throwable var23) {
               var5 = var23;
               throw var23;
            } finally {
               CloseableKt.closeFinally(var4, var5);
            }
         }

         return target;
      }
   }

   // $FF: synthetic method
   public static File copyTo$default(File var0, File var1, boolean var2, int var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = false;
      }

      if ((var4 & 4) != 0) {
         var3 = 8192;
      }

      return FilesKt.copyTo(var0, var1, var2, var3);
   }

   public static final boolean copyRecursively(@NotNull File $this$copyRecursively, @NotNull File target, boolean overwrite, @NotNull Function2<? super File, ? super IOException, ? extends OnErrorAction> onError) {
      Intrinsics.checkNotNullParameter($this$copyRecursively, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      Intrinsics.checkNotNullParameter(onError, "onError");
      if (!$this$copyRecursively.exists()) {
         return onError.invoke($this$copyRecursively, new NoSuchFileException($this$copyRecursively, (File)null, "The source file doesn't exist.", 2, (DefaultConstructorMarker)null)) != OnErrorAction.TERMINATE;
      } else {
         try {
            Iterator var4 = FilesKt.walkTopDown($this$copyRecursively).onFail(FilesKt__UtilsKt::copyRecursively$lambda$4$FilesKt__UtilsKt).iterator();

            File src;
            label65:
            do {
               while(var4.hasNext()) {
                  src = (File)var4.next();
                  if (!src.exists()) {
                     continue label65;
                  }

                  String relPath = FilesKt.toRelativeString(src, $this$copyRecursively);
                  File dstFile = new File(target, relPath);
                  if (dstFile.exists() && (!src.isDirectory() || !dstFile.isDirectory())) {
                     boolean stillExists = !overwrite ? true : (dstFile.isDirectory() ? !FilesKt.deleteRecursively(dstFile) : !dstFile.delete());
                     if (stillExists) {
                        if (onError.invoke(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                           return false;
                        }
                        continue;
                     }
                  }

                  if (src.isDirectory()) {
                     dstFile.mkdirs();
                  } else if (FilesKt.copyTo$default(src, dstFile, overwrite, 0, 4, (Object)null).length() != src.length() && onError.invoke(src, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                     return false;
                  }
               }

               return true;
            } while(onError.invoke(src, new NoSuchFileException(src, (File)null, "The source file doesn't exist.", 2, (DefaultConstructorMarker)null)) != OnErrorAction.TERMINATE);

            return false;
         } catch (TerminateException var9) {
            return false;
         }
      }
   }

   // $FF: synthetic method
   public static boolean copyRecursively$default(File var0, File var1, boolean var2, Function2 var3, int var4, Object var5) {
      if ((var4 & 2) != 0) {
         var2 = false;
      }

      if ((var4 & 4) != 0) {
         var3 = (Function2)null.INSTANCE;
      }

      return FilesKt.copyRecursively(var0, var1, var2, var3);
   }

   public static final boolean deleteRecursively(@NotNull File $this$deleteRecursively) {
      Intrinsics.checkNotNullParameter($this$deleteRecursively, "<this>");
      Sequence $this$fold$iv = (Sequence)FilesKt.walkBottomUp($this$deleteRecursively);
      boolean initial$iv = true;
      int $i$f$fold = false;
      boolean accumulator$iv = initial$iv;

      File it;
      for(Iterator var5 = $this$fold$iv.iterator(); var5.hasNext(); accumulator$iv = (it.delete() || !it.exists()) && accumulator$iv) {
         Object element$iv = var5.next();
         it = (File)element$iv;
         int var9 = false;
      }

      return accumulator$iv;
   }

   public static final boolean startsWith(@NotNull File $this$startsWith, @NotNull File other) {
      Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      FilePathComponents components = FilesKt.toComponents($this$startsWith);
      FilePathComponents otherComponents = FilesKt.toComponents(other);
      if (!Intrinsics.areEqual((Object)components.getRoot(), (Object)otherComponents.getRoot())) {
         return false;
      } else {
         return components.getSize() < otherComponents.getSize() ? false : components.getSegments().subList(0, otherComponents.getSize()).equals(otherComponents.getSegments());
      }
   }

   public static final boolean startsWith(@NotNull File $this$startsWith, @NotNull String other) {
      Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return FilesKt.startsWith($this$startsWith, new File(other));
   }

   public static final boolean endsWith(@NotNull File $this$endsWith, @NotNull File other) {
      Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      FilePathComponents components = FilesKt.toComponents($this$endsWith);
      FilePathComponents otherComponents = FilesKt.toComponents(other);
      if (otherComponents.isRooted()) {
         return Intrinsics.areEqual((Object)$this$endsWith, (Object)other);
      } else {
         int shift = components.getSize() - otherComponents.getSize();
         return shift < 0 ? false : components.getSegments().subList(shift, components.getSize()).equals(otherComponents.getSegments());
      }
   }

   public static final boolean endsWith(@NotNull File $this$endsWith, @NotNull String other) {
      Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
      Intrinsics.checkNotNullParameter(other, "other");
      return FilesKt.endsWith($this$endsWith, new File(other));
   }

   @NotNull
   public static final File normalize(@NotNull File $this$normalize) {
      Intrinsics.checkNotNullParameter($this$normalize, "<this>");
      FilePathComponents $this$normalize_u24lambda_u246 = FilesKt.toComponents($this$normalize);
      int var2 = false;
      File var10000 = $this$normalize_u24lambda_u246.getRoot();
      Iterable var10001 = (Iterable)normalize$FilesKt__UtilsKt($this$normalize_u24lambda_u246.getSegments());
      String var10002 = File.separator;
      Intrinsics.checkNotNullExpressionValue(var10002, "separator");
      return FilesKt.resolve(var10000, CollectionsKt.joinToString$default(var10001, (CharSequence)var10002, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null));
   }

   private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents $this$normalize) {
      return new FilePathComponents($this$normalize.getRoot(), normalize$FilesKt__UtilsKt($this$normalize.getSegments()));
   }

   private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> $this$normalize) {
      List list = (List)(new ArrayList($this$normalize.size()));
      Iterator var2 = $this$normalize.iterator();

      while(var2.hasNext()) {
         File file = (File)var2.next();
         String var4 = file.getName();
         if (Intrinsics.areEqual((Object)var4, (Object)".")) {
            Unit var5 = Unit.INSTANCE;
         } else if (Intrinsics.areEqual((Object)var4, (Object)"..")) {
            Comparable var10000;
            if (!list.isEmpty() && !Intrinsics.areEqual((Object)((File)CollectionsKt.last(list)).getName(), (Object)"..")) {
               var10000 = (Comparable)list.remove(list.size() - 1);
            } else {
               var10000 = (Comparable)list.add(file);
            }
         } else {
            list.add(file);
         }
      }

      return list;
   }

   @NotNull
   public static final File resolve(@NotNull File $this$resolve, @NotNull File relative) {
      Intrinsics.checkNotNullParameter($this$resolve, "<this>");
      Intrinsics.checkNotNullParameter(relative, "relative");
      if (FilesKt.isRooted(relative)) {
         return relative;
      } else {
         String var10000 = $this$resolve.toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         String baseName = var10000;
         return ((CharSequence)baseName).length() != 0 && !StringsKt.endsWith$default((CharSequence)baseName, File.separatorChar, false, 2, (Object)null) ? new File(baseName + File.separatorChar + relative) : new File(baseName + relative);
      }
   }

   @NotNull
   public static final File resolve(@NotNull File $this$resolve, @NotNull String relative) {
      Intrinsics.checkNotNullParameter($this$resolve, "<this>");
      Intrinsics.checkNotNullParameter(relative, "relative");
      return FilesKt.resolve($this$resolve, new File(relative));
   }

   @NotNull
   public static final File resolveSibling(@NotNull File $this$resolveSibling, @NotNull File relative) {
      Intrinsics.checkNotNullParameter($this$resolveSibling, "<this>");
      Intrinsics.checkNotNullParameter(relative, "relative");
      FilePathComponents components = FilesKt.toComponents($this$resolveSibling);
      File parentSubPath = components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1);
      return FilesKt.resolve(FilesKt.resolve(components.getRoot(), parentSubPath), relative);
   }

   @NotNull
   public static final File resolveSibling(@NotNull File $this$resolveSibling, @NotNull String relative) {
      Intrinsics.checkNotNullParameter($this$resolveSibling, "<this>");
      Intrinsics.checkNotNullParameter(relative, "relative");
      return FilesKt.resolveSibling($this$resolveSibling, new File(relative));
   }

   private static final Unit copyRecursively$lambda$4$FilesKt__UtilsKt(Function2 $onError, File f, IOException e) {
      Intrinsics.checkNotNullParameter(f, "f");
      Intrinsics.checkNotNullParameter(e, "e");
      if ($onError.invoke(f, e) == OnErrorAction.TERMINATE) {
         throw new TerminateException(f);
      } else {
         return Unit.INSTANCE;
      }
   }

   public FilesKt__UtilsKt() {
   }
}
