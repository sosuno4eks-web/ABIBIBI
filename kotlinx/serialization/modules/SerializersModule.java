package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class SerializersModule {
   private SerializersModule() {
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   @Deprecated(
      message = "Deprecated in favor of overload with default parameter",
      replaceWith = @ReplaceWith(
   expression = "getContextual(kclass)",
   imports = {}
),
      level = DeprecationLevel.HIDDEN
   )
   public final KSerializer getContextual(KClass kclass) {
      Intrinsics.checkNotNullParameter(kclass, "kclass");
      return this.getContextual(kclass, CollectionsKt.emptyList());
   }

   @ExperimentalSerializationApi
   @Nullable
   public abstract <T> KSerializer<T> getContextual(@NotNull KClass<T> var1, @NotNull List<? extends KSerializer<?>> var2);

   // $FF: synthetic method
   public static KSerializer getContextual$default(SerializersModule var0, KClass var1, List var2, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
      } else {
         if ((var3 & 2) != 0) {
            var2 = CollectionsKt.emptyList();
         }

         return var0.getContextual(var1, var2);
      }
   }

   @ExperimentalSerializationApi
   @Nullable
   public abstract <T> SerializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> var1, @NotNull T var2);

   @ExperimentalSerializationApi
   @Nullable
   public abstract <T> DeserializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> var1, @Nullable String var2);

   @ExperimentalSerializationApi
   public abstract void dumpTo(@NotNull SerializersModuleCollector var1);

   public abstract boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core();

   /** @deprecated */
   // $FF: synthetic method
   @InternalSerializationApi
   public static void getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations() {
   }

   // $FF: synthetic method
   public SerializersModule(DefaultConstructorMarker $constructor_marker) {
      this();
   }
}
