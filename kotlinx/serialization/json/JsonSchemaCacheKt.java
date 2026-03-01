package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import org.jetbrains.annotations.NotNull;

public final class JsonSchemaCacheKt {
   @NotNull
   public static final DescriptorSchemaCache getSchemaCache(@NotNull Json $this$schemaCache) {
      Intrinsics.checkNotNullParameter($this$schemaCache, "<this>");
      return $this$schemaCache.get_schemaCache$kotlinx_serialization_json();
   }

   /** @deprecated */
   // $FF: synthetic method
   public static void getSchemaCache$annotations(Json <this>) {
   }
}
