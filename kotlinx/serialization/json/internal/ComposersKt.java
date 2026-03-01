package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class ComposersKt {
   @NotNull
   public static final Composer Composer(@NotNull InternalJsonWriter sb, @NotNull Json json) {
      Intrinsics.checkNotNullParameter(sb, "sb");
      Intrinsics.checkNotNullParameter(json, "json");
      return json.getConfiguration().getPrettyPrint() ? (Composer)(new ComposerWithPrettyPrint(sb, json)) : new Composer(sb);
   }
}
