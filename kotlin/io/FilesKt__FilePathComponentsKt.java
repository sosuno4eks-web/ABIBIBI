package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

class FilesKt__FilePathComponentsKt {
   private static final int getRootLength$FilesKt__FilePathComponentsKt(String $this$getRootLength) {
      int first = StringsKt.indexOf$default((CharSequence)$this$getRootLength, File.separatorChar, 0, false, 4, (Object)null);
      if (first == 0) {
         if ($this$getRootLength.length() > 1 && $this$getRootLength.charAt(1) == File.separatorChar) {
            first = StringsKt.indexOf$default((CharSequence)$this$getRootLength, File.separatorChar, 2, false, 4, (Object)null);
            if (first >= 0) {
               first = StringsKt.indexOf$default((CharSequence)$this$getRootLength, File.separatorChar, first + 1, false, 4, (Object)null);
               if (first >= 0) {
                  return first + 1;
               }

               return $this$getRootLength.length();
            }
         }

         return 1;
      } else if (first > 0 && $this$getRootLength.charAt(first - 1) == ':') {
         ++first;
         return first;
      } else {
         return first == -1 && StringsKt.endsWith$default((CharSequence)$this$getRootLength, ':', false, 2, (Object)null) ? $this$getRootLength.length() : 0;
      }
   }

   @NotNull
   public static final String getRootName(@NotNull File $this$rootName) {
      Intrinsics.checkNotNullParameter($this$rootName, "<this>");
      String var10000 = $this$rootName.getPath();
      Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
      String var1 = var10000;
      byte var2 = 0;
      var10000 = $this$rootName.getPath();
      Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
      int var3 = getRootLength$FilesKt__FilePathComponentsKt(var10000);
      var10000 = var1.substring(var2, var3);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      return var10000;
   }

   @NotNull
   public static final File getRoot(@NotNull File $this$root) {
      Intrinsics.checkNotNullParameter($this$root, "<this>");
      return new File(FilesKt.getRootName($this$root));
   }

   public static final boolean isRooted(@NotNull File $this$isRooted) {
      Intrinsics.checkNotNullParameter($this$isRooted, "<this>");
      String var10000 = $this$isRooted.getPath();
      Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
      return getRootLength$FilesKt__FilePathComponentsKt(var10000) > 0;
   }

   @NotNull
   public static final FilePathComponents toComponents(@NotNull File $this$toComponents) {
      Intrinsics.checkNotNullParameter($this$toComponents, "<this>");
      String path = $this$toComponents.getPath();
      Intrinsics.checkNotNull(path);
      int rootLength = getRootLength$FilesKt__FilePathComponentsKt(path);
      byte var5 = 0;
      String var10000 = path.substring(var5, rootLength);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      String rootName = var10000;
      var10000 = path.substring(rootLength);
      Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
      String subPath = var10000;
      List var18;
      if (((CharSequence)subPath).length() == 0) {
         var18 = CollectionsKt.emptyList();
      } else {
         CharSequence var19 = (CharSequence)subPath;
         char[] var6 = new char[]{File.separatorChar};
         Iterable $this$map$iv = (Iterable)StringsKt.split$default(var19, var6, false, 0, 6, (Object)null);
         int $i$f$map = false;
         Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
         int $i$f$mapTo = false;
         Iterator var11 = $this$map$iv.iterator();

         while(var11.hasNext()) {
            Object item$iv$iv = var11.next();
            String p0 = (String)item$iv$iv;
            int var14 = false;
            destination$iv$iv.add(new File(p0));
         }

         var18 = (List)destination$iv$iv;
      }

      List list = var18;
      return new FilePathComponents(new File(rootName), list);
   }

   @NotNull
   public static final File subPath(@NotNull File $this$subPath, int beginIndex, int endIndex) {
      Intrinsics.checkNotNullParameter($this$subPath, "<this>");
      return FilesKt.toComponents($this$subPath).subPath(beginIndex, endIndex);
   }

   public FilesKt__FilePathComponentsKt() {
   }
}
