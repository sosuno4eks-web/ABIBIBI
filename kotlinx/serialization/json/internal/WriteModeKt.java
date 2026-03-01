package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

public final class WriteModeKt {
   @NotNull
   public static final WriteMode switchMode(@NotNull Json $this$switchMode, @NotNull SerialDescriptor desc) {
      Intrinsics.checkNotNullParameter($this$switchMode, "<this>");
      Intrinsics.checkNotNullParameter(desc, "desc");
      SerialKind var2 = desc.getKind();
      WriteMode var10000;
      if (var2 instanceof PolymorphicKind) {
         var10000 = WriteMode.POLY_OBJ;
      } else if (Intrinsics.areEqual((Object)var2, (Object)StructureKind.LIST.INSTANCE)) {
         var10000 = WriteMode.LIST;
      } else if (Intrinsics.areEqual((Object)var2, (Object)StructureKind.MAP.INSTANCE)) {
         int $i$f$selectMapMode = false;
         SerialDescriptor keyDescriptor$iv = carrierDescriptor(desc.getElementDescriptor(0), $this$switchMode.getSerializersModule());
         SerialKind keyKind$iv = keyDescriptor$iv.getKind();
         boolean var8;
         if (!(keyKind$iv instanceof PrimitiveKind) && !Intrinsics.areEqual((Object)keyKind$iv, (Object)SerialKind.ENUM.INSTANCE)) {
            if (!$this$switchMode.getConfiguration().getAllowStructuredMapKeys()) {
               throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv);
            }

            var8 = false;
            var10000 = WriteMode.LIST;
         } else {
            var8 = false;
            var10000 = WriteMode.MAP;
         }
      } else {
         var10000 = WriteMode.OBJ;
      }

      return var10000;
   }

   public static final <T, R1 extends T, R2 extends T> T selectMapMode(@NotNull Json $this$selectMapMode, @NotNull SerialDescriptor mapDescriptor, @NotNull Function0<? extends R1> ifMap, @NotNull Function0<? extends R2> ifList) {
      Intrinsics.checkNotNullParameter($this$selectMapMode, "<this>");
      Intrinsics.checkNotNullParameter(mapDescriptor, "mapDescriptor");
      Intrinsics.checkNotNullParameter(ifMap, "ifMap");
      Intrinsics.checkNotNullParameter(ifList, "ifList");
      int $i$f$selectMapMode = false;
      SerialDescriptor keyDescriptor = carrierDescriptor(mapDescriptor.getElementDescriptor(0), $this$selectMapMode.getSerializersModule());
      SerialKind keyKind = keyDescriptor.getKind();
      Object var10000;
      if (!(keyKind instanceof PrimitiveKind) && !Intrinsics.areEqual((Object)keyKind, (Object)SerialKind.ENUM.INSTANCE)) {
         if (!$this$selectMapMode.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor);
         }

         var10000 = ifList.invoke();
      } else {
         var10000 = ifMap.invoke();
      }

      return var10000;
   }

   @NotNull
   public static final SerialDescriptor carrierDescriptor(@NotNull SerialDescriptor $this$carrierDescriptor, @NotNull SerializersModule module) {
      Intrinsics.checkNotNullParameter($this$carrierDescriptor, "<this>");
      Intrinsics.checkNotNullParameter(module, "module");
      SerialDescriptor var10000;
      if (Intrinsics.areEqual((Object)$this$carrierDescriptor.getKind(), (Object)SerialKind.CONTEXTUAL.INSTANCE)) {
         var10000 = ContextAwareKt.getContextualDescriptor(module, $this$carrierDescriptor);
         if (var10000 != null) {
            var10000 = carrierDescriptor(var10000, module);
            if (var10000 != null) {
               return var10000;
            }
         }

         var10000 = $this$carrierDescriptor;
      } else {
         var10000 = $this$carrierDescriptor.isInline() ? carrierDescriptor($this$carrierDescriptor.getElementDescriptor(0), module) : $this$carrierDescriptor;
      }

      return var10000;
   }
}
