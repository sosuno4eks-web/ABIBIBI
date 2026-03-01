package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_703;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class RenderParticleEvent extends Event {
   @NotNull
   public static final RenderParticleEvent INSTANCE = new RenderParticleEvent();
   private static class_703 particle;

   private RenderParticleEvent() {
   }

   @NotNull
   public final class_703 getParticle() {
      class_703 var10000 = particle;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("particle");
         return null;
      }
   }

   public final boolean call(@NotNull class_703 particle) {
      Intrinsics.checkNotNullParameter(particle, "particle");
      this.setCancelled(false);
      RenderParticleEvent.particle = particle;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
