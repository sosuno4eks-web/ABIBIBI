package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@WasExperimental(
   markerClass = {ExperimentalPathApi.class}
)
@SinceKotlin(
   version = "2.1"
)
public interface FileVisitorBuilder {
   void onPreVisitDirectory(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> var1);

   void onVisitFile(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> var1);

   void onVisitFileFailed(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> var1);

   void onPostVisitDirectory(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> var1);
}
