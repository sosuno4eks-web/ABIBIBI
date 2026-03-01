package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;
import org.jetbrains.annotations.NotNull;

public final class JsonElementMarker {
   @NotNull
   private final ElementMarker origin;
   private boolean isUnmarkedNull;

   public JsonElementMarker(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      super();
      this.origin = new ElementMarker(descriptor, (Function2)(new Function2<SerialDescriptor, Integer, Boolean>(this) {
         public final Boolean invoke(SerialDescriptor p0, int p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((JsonElementMarker)this.receiver).readIfAbsent(p0, p1);
         }
      }));
   }

   public final boolean isUnmarkedNull$kotlinx_serialization_json() {
      return this.isUnmarkedNull;
   }

   public final void mark$kotlinx_serialization_json(int index) {
      this.origin.mark(index);
   }

   public final int nextUnmarkedIndex$kotlinx_serialization_json() {
      return this.origin.nextUnmarkedIndex();
   }

   private final boolean readIfAbsent(SerialDescriptor descriptor, int index) {
      this.isUnmarkedNull = !descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable();
      return this.isUnmarkedNull;
   }
}
