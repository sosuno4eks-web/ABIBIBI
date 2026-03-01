package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class FilesKt__FileTreeWalkKt extends FilesKt__FileReadWriteKt {
   @NotNull
   public static final FileTreeWalk walk(@NotNull File $this$walk, @NotNull FileWalkDirection direction) {
      Intrinsics.checkNotNullParameter($this$walk, "<this>");
      Intrinsics.checkNotNullParameter(direction, "direction");
      return new FileTreeWalk($this$walk, direction);
   }

   // $FF: synthetic method
   public static FileTreeWalk walk$default(File var0, FileWalkDirection var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = FileWalkDirection.TOP_DOWN;
      }

      return FilesKt.walk(var0, var1);
   }

   @NotNull
   public static final FileTreeWalk walkTopDown(@NotNull File $this$walkTopDown) {
      Intrinsics.checkNotNullParameter($this$walkTopDown, "<this>");
      return FilesKt.walk($this$walkTopDown, FileWalkDirection.TOP_DOWN);
   }

   @NotNull
   public static final FileTreeWalk walkBottomUp(@NotNull File $this$walkBottomUp) {
      Intrinsics.checkNotNullParameter($this$walkBottomUp, "<this>");
      return FilesKt.walk($this$walkBottomUp, FileWalkDirection.BOTTOM_UP);
   }

   public FilesKt__FileTreeWalkKt() {
   }
}
