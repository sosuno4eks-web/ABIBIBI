package ru.noxium.module.impl.combat.auraProcess;

import lombok.Generated;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import ru.noxium.util.other.IMinecraft;
import ru.noxium.util.other.TimerUtil;

// HitAura removed - rotation methods disabled

@Environment(EnvType.CLIENT)
public final class Rotate implements IMinecraft {
   static int tick;
   static float tickF;
   static TimerUtil time1 = new TimerUtil();
   static TimerUtil time2 = new TimerUtil();

   public static void onFunTimeRotation(LivingEntity target, boolean isAttack, float attackDistance, boolean check) {
      // HitAura removed - method disabled
   }

   public static void onSpookyRotation(LivingEntity target, boolean isAttack) {
      // HitAura removed - method disabled
   }

   public static void onHolyRotation(LivingEntity target, boolean isAttack) {
      // HitAura removed - method disabled
   }

   public static void onAresRotation(LivingEntity target, boolean isAttack) {
      // HitAura removed - method disabled
   }

   public static void onMatrixRotation(LivingEntity target, boolean isAttack) {
      // HitAura removed - method disabled
   }

   public static float randomLerp(float min, float max) {
      return min + (max - min) * (float)Math.random();
   }

   @Generated
   public Rotate() {
   }
}
