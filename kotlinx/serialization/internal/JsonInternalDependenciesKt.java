package kotlinx.serialization.internal;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class JsonInternalDependenciesKt {
   @CoreFriendModuleApi
   @NotNull
   public static final Set<String> jsonCachedSerialNames(@NotNull SerialDescriptor $this$jsonCachedSerialNames) {
      Intrinsics.checkNotNullParameter($this$jsonCachedSerialNames, "<this>");
      return Platform_commonKt.cachedSerialNames($this$jsonCachedSerialNames);
   }
}
