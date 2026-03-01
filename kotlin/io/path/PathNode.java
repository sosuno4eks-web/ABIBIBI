package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PathNode {
   @NotNull
   private final Path path;
   @Nullable
   private final Object key;
   @Nullable
   private final PathNode parent;
   @Nullable
   private Iterator<PathNode> contentIterator;

   public PathNode(@NotNull Path path, @Nullable Object key, @Nullable PathNode parent) {
      Intrinsics.checkNotNullParameter(path, "path");
      super();
      this.path = path;
      this.key = key;
      this.parent = parent;
   }

   @NotNull
   public final Path getPath() {
      return this.path;
   }

   @Nullable
   public final Object getKey() {
      return this.key;
   }

   @Nullable
   public final PathNode getParent() {
      return this.parent;
   }

   @Nullable
   public final Iterator<PathNode> getContentIterator() {
      return this.contentIterator;
   }

   public final void setContentIterator(@Nullable Iterator<PathNode> <set-?>) {
      this.contentIterator = var1;
   }
}
