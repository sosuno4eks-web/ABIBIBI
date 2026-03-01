package su.catlean.api.event.events;

import java.nio.file.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class FilesDraggedEvent extends Event {
   @NotNull
   public static final FilesDraggedEvent INSTANCE = new FilesDraggedEvent();
   public static List<? extends Path> paths;

   private FilesDraggedEvent() {
   }

   @NotNull
   public final List<Path> getPaths() {
      List var10000 = paths;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("paths");
         return null;
      }
   }

   public final void setPaths(@NotNull List<? extends Path> <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      paths = var1;
   }

   public final boolean call(@NotNull List<? extends Path> paths) {
      Intrinsics.checkNotNullParameter(paths, "paths");
      this.setPaths(paths);
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
