package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class DirectoryEntriesReader extends SimpleFileVisitor<Path> {
   private final boolean followLinks;
   @Nullable
   private PathNode directoryNode;
   @NotNull
   private ArrayDeque<PathNode> entries;

   public DirectoryEntriesReader(boolean followLinks) {
      this.followLinks = followLinks;
      this.entries = new ArrayDeque();
   }

   public final boolean getFollowLinks() {
      return this.followLinks;
   }

   @NotNull
   public final List<PathNode> readEntries(@NotNull PathNode directoryNode) {
      Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
      this.directoryNode = directoryNode;
      Files.walkFileTree(directoryNode.getPath(), LinkFollowing.INSTANCE.toVisitOptions(this.followLinks), 1, (FileVisitor)this);
      this.entries.removeFirst();
      ArrayDeque var2 = this.entries;
      int var4 = false;
      this.entries = new ArrayDeque();
      return (List)var2;
   }

   @NotNull
   public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) {
      Intrinsics.checkNotNullParameter(dir, "dir");
      Intrinsics.checkNotNullParameter(attrs, "attrs");
      PathNode directoryEntry = new PathNode(dir, attrs.fileKey(), this.directoryNode);
      this.entries.add(directoryEntry);
      FileVisitResult var10000 = super.preVisitDirectory(dir, attrs);
      Intrinsics.checkNotNullExpressionValue(var10000, "preVisitDirectory(...)");
      return var10000;
   }

   @NotNull
   public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) {
      Intrinsics.checkNotNullParameter(file, "file");
      Intrinsics.checkNotNullParameter(attrs, "attrs");
      PathNode fileEntry = new PathNode(file, (Object)null, this.directoryNode);
      this.entries.add(fileEntry);
      FileVisitResult var10000 = super.visitFile(file, attrs);
      Intrinsics.checkNotNullExpressionValue(var10000, "visitFile(...)");
      return var10000;
   }
}
