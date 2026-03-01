package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4604;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;

public final class FrustrumEvent extends Event {
   @NotNull
   public static final FrustrumEvent INSTANCE = new FrustrumEvent();
   public static class_4604 frustrum;

   private FrustrumEvent() {
   }

   @NotNull
   public final class_4604 getFrustrum() {
      class_4604 var10000 = frustrum;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("frustrum");
         return null;
      }
   }

   public final void setFrustrum(@NotNull class_4604 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      frustrum = var1;
   }
}
