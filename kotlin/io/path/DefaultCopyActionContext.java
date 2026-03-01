package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalPathApi
final class DefaultCopyActionContext implements CopyActionContext {
   @NotNull
   public static final DefaultCopyActionContext INSTANCE = new DefaultCopyActionContext();

   private DefaultCopyActionContext() {
   }

   @NotNull
   public CopyActionResult copyToIgnoringExistingDirectory(@NotNull Path $this$copyToIgnoringExistingDirectory, @NotNull Path target, boolean followLinks) {
      Intrinsics.checkNotNullParameter($this$copyToIgnoringExistingDirectory, "<this>");
      Intrinsics.checkNotNullParameter(target, "target");
      LinkOption[] options = LinkFollowing.INSTANCE.toLinkOptions(followLinks);
      LinkOption[] var10001 = (LinkOption[])Arrays.copyOf(options, options.length);
      if (Files.isDirectory($this$copyToIgnoringExistingDirectory, (LinkOption[])Arrays.copyOf(var10001, var10001.length))) {
         LinkOption[] var6 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
         if (Files.isDirectory(target, (LinkOption[])Arrays.copyOf(var6, var6.length))) {
            Unit var10000 = Unit.INSTANCE;
            return CopyActionResult.CONTINUE;
         }
      }

      CopyOption[] var10002 = (CopyOption[])Arrays.copyOf(options, options.length);
      Intrinsics.checkNotNullExpressionValue(Files.copy($this$copyToIgnoringExistingDirectory, target, (CopyOption[])Arrays.copyOf(var10002, var10002.length)), "copy(...)");
      return CopyActionResult.CONTINUE;
   }
}
