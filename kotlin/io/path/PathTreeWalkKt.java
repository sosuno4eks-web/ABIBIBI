package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class PathTreeWalkKt {
   private static final Object keyOf(Path path, LinkOption[] linkOptions) {
      Object var2;
      try {
         LinkOption[] var3 = (LinkOption[])Arrays.copyOf(linkOptions, linkOptions.length);
         BasicFileAttributes var10000 = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[])Arrays.copyOf(var3, var3.length));
         Intrinsics.checkNotNullExpressionValue(var10000, "readAttributes(...)");
         var2 = var10000.fileKey();
      } catch (Throwable var4) {
         var2 = null;
      }

      return var2;
   }

   private static final boolean createsCycle(PathNode $this$createsCycle) {
      for(PathNode ancestor = $this$createsCycle.getParent(); ancestor != null; ancestor = ancestor.getParent()) {
         if (ancestor.getKey() != null && $this$createsCycle.getKey() != null) {
            if (Intrinsics.areEqual(ancestor.getKey(), $this$createsCycle.getKey())) {
               return true;
            }
         } else {
            try {
               if (Files.isSameFile(ancestor.getPath(), $this$createsCycle.getPath())) {
                  return true;
               }
            } catch (IOException var3) {
            } catch (SecurityException var4) {
            }
         }
      }

      return false;
   }

   // $FF: synthetic method
   public static final boolean access$createsCycle(PathNode $receiver) {
      return createsCycle($receiver);
   }

   // $FF: synthetic method
   public static final Object access$keyOf(Path path, LinkOption[] linkOptions) {
      return keyOf(path, linkOptions);
   }
}
