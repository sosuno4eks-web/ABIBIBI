package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class EquipArmEvent extends Event {
   @NotNull
   public static final EquipArmEvent INSTANCE;
   // $FF: synthetic field
   static final KProperty<Object>[] $$delegatedProperties;
   @NotNull
   private static final ReadWriteProperty progress$delegate;
   public static class_1306 arm;

   private EquipArmEvent() {
   }

   public final float getProgress() {
      return ((Number)progress$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
   }

   public final void setProgress(float <set-?>) {
      progress$delegate.setValue(this, $$delegatedProperties[0], var1);
   }

   @NotNull
   public final class_1306 getArm() {
      class_1306 var10000 = arm;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("arm");
         return null;
      }
   }

   public final void setArm(@NotNull class_1306 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      arm = var1;
   }

   public final boolean call(float swingProgress, @NotNull class_1306 arm) {
      Intrinsics.checkNotNullParameter(arm, "arm");
      this.setCancelled(false);
      this.setProgress(swingProgress);
      this.setArm(arm);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      KProperty[] var0 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(EquipArmEvent.class, "progress", "getProgress()F", 0)))};
      $$delegatedProperties = var0;
      INSTANCE = new EquipArmEvent();
      progress$delegate = Delegates.INSTANCE.notNull();
   }
}
