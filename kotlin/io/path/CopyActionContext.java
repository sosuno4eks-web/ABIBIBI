package kotlin.io.path;

import java.nio.file.Path;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@ExperimentalPathApi
@SinceKotlin(
   version = "1.8"
)
public interface CopyActionContext {
   @NotNull
   CopyActionResult copyToIgnoringExistingDirectory(@NotNull Path var1, @NotNull Path var2, boolean var3);
}
