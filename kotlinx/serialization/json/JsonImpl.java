package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonSerializersModuleValidator;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

final class JsonImpl extends Json {
   public JsonImpl(@NotNull JsonConfiguration configuration, @NotNull SerializersModule module) {
      Intrinsics.checkNotNullParameter(configuration, "configuration");
      Intrinsics.checkNotNullParameter(module, "module");
      super(configuration, module, (DefaultConstructorMarker)null);
      this.validateConfiguration();
   }

   private final void validateConfiguration() {
      if (!Intrinsics.areEqual((Object)this.getSerializersModule(), (Object)SerializersModuleBuildersKt.EmptySerializersModule())) {
         JsonSerializersModuleValidator collector = new JsonSerializersModuleValidator(this.getConfiguration());
         this.getSerializersModule().dumpTo((SerializersModuleCollector)collector);
      }
   }
}
