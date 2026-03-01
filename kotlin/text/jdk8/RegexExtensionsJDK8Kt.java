package kotlin.text.jdk8;

import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "RegexExtensionsJDK8Kt"
)
public final class RegexExtensionsJDK8Kt {
   @SinceKotlin(
      version = "1.2"
   )
   @Nullable
   public static final MatchGroup get(@NotNull MatchGroupCollection $this$get, @NotNull String name) {
      Intrinsics.checkNotNullParameter($this$get, "<this>");
      Intrinsics.checkNotNullParameter(name, "name");
      MatchNamedGroupCollection var10000 = $this$get instanceof MatchNamedGroupCollection ? (MatchNamedGroupCollection)$this$get : null;
      if (($this$get instanceof MatchNamedGroupCollection ? (MatchNamedGroupCollection)$this$get : null) == null) {
         throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
      } else {
         MatchNamedGroupCollection namedGroups = var10000;
         return namedGroups.get(name);
      }
   }
}
