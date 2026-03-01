package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

final class PathRelativizer {
   @NotNull
   public static final PathRelativizer INSTANCE = new PathRelativizer();
   private static final Path emptyPath = Paths.get("");
   private static final Path parentPath = Paths.get("..");

   private PathRelativizer() {
   }

   @NotNull
   public final Path tryRelativeTo(@NotNull Path path, @NotNull Path base) {
      Intrinsics.checkNotNullParameter(path, "path");
      Intrinsics.checkNotNullParameter(base, "base");
      Path bn = base.normalize();
      Path pn = path.normalize();
      Path rn = bn.relativize(pn);
      int i = 0;

      for(int var7 = Math.min(bn.getNameCount(), pn.getNameCount()); i < var7 && Intrinsics.areEqual((Object)bn.getName(i), (Object)parentPath); ++i) {
         if (!Intrinsics.areEqual((Object)pn.getName(i), (Object)parentPath)) {
            throw new IllegalArgumentException("Unable to compute relative path");
         }
      }

      Path var10000;
      if (!Intrinsics.areEqual((Object)pn, (Object)bn) && Intrinsics.areEqual((Object)bn, (Object)emptyPath)) {
         var10000 = pn;
      } else {
         String rnString = rn.toString();
         String var10001 = rn.getFileSystem().getSeparator();
         Intrinsics.checkNotNullExpressionValue(var10001, "getSeparator(...)");
         var10000 = StringsKt.endsWith$default(rnString, var10001, false, 2, (Object)null) ? rn.getFileSystem().getPath(StringsKt.dropLast(rnString, rn.getFileSystem().getSeparator().length())) : rn;
      }

      Path r = var10000;
      Intrinsics.checkNotNull(r);
      return r;
   }
}
