package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

public final class LinkFollowing {
   @NotNull
   public static final LinkFollowing INSTANCE = new LinkFollowing();
   @NotNull
   private static final LinkOption[] nofollowLinkOption;
   @NotNull
   private static final LinkOption[] followLinkOption;
   @NotNull
   private static final Set<FileVisitOption> nofollowVisitOption;
   @NotNull
   private static final Set<FileVisitOption> followVisitOption;

   private LinkFollowing() {
   }

   @NotNull
   public final LinkOption[] toLinkOptions(boolean followLinks) {
      return followLinks ? followLinkOption : nofollowLinkOption;
   }

   @NotNull
   public final Set<FileVisitOption> toVisitOptions(boolean followLinks) {
      return followLinks ? followVisitOption : nofollowVisitOption;
   }

   static {
      LinkOption[] var0 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
      nofollowLinkOption = var0;
      followLinkOption = new LinkOption[0];
      nofollowVisitOption = SetsKt.emptySet();
      followVisitOption = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);
   }
}
