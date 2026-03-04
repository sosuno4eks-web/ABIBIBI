package ru.noxium.module.impl.combat.auraProcess;

import lombok.Generated;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import ru.noxium.util.other.IMinecraft;

// HitAura removed - rotation methods disabled

@Environment(EnvType.CLIENT)
public final class UFunTimeRotations implements IMinecraft {

   public static void rotation(LivingEntity target, boolean isAttack, float attackDistance, boolean check) {
      // HitAura removed - method disabled
   }

   @Generated
   public UFunTimeRotations() {
   }
}
