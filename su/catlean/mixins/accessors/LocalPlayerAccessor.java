package su.catlean.mixins.accessors;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_746.class})
public interface LocalPlayerAccessor {
   @Invoker("method_3136")
   void iSendMovementPackets();

   @Accessor("field_3941")
   float getLastYaw();

   @Accessor("field_3925")
   float getLastPitch();

   @Accessor("field_3941")
   void setLastYaw(float var1);

   @Accessor("field_3925")
   void setLastPitch(float var1);

   @Accessor("field_3926")
   double getLastX();

   @Accessor("field_3940")
   double getLastBaseY();

   @Accessor("field_3924")
   double getLastZ();

   @Accessor("field_3922")
   void setJumpRidingScale(float var1);
}
