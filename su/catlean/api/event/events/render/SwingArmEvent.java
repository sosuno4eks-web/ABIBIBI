package su.catlean.api.event.events.render;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class SwingArmEvent extends Event {
   @NotNull
   public static final SwingArmEvent INSTANCE;
   // $FF: synthetic field
   static final KProperty<Object>[] $$delegatedProperties;
   @NotNull
   private static final ReadWriteProperty swingProgress$delegate;
   public static class_4587 matrices;
   @NotNull
   private static final ReadWriteProperty armX$delegate;
   public static class_1306 arm;

   private SwingArmEvent() {
   }

   public final float getSwingProgress() {
      return ((Number)swingProgress$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
   }

   public final void setSwingProgress(float <set-?>) {
      swingProgress$delegate.setValue(this, $$delegatedProperties[0], var1);
   }

   @NotNull
   public final class_4587 getMatrices() {
      class_4587 var10000 = matrices;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("matrices");
         return null;
      }
   }

   public final void setMatrices(@NotNull class_4587 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      matrices = var1;
   }

   private final int getArmX() {
      return ((Number)armX$delegate.getValue(this, $$delegatedProperties[1])).intValue();
   }

   private final void setArmX(int <set-?>) {
      armX$delegate.setValue(this, $$delegatedProperties[1], var1);
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

   public final boolean call(float swingProgress, @NotNull class_4587 matrices, int armX, @NotNull class_1306 arm) {
      Intrinsics.checkNotNullParameter(matrices, "matrices");
      Intrinsics.checkNotNullParameter(arm, "arm");
      this.setCancelled(false);
      this.setSwingProgress(swingProgress);
      this.setMatrices(matrices);
      this.setArm(arm);
      this.setArmX(armX);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      KProperty[] var0 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(SwingArmEvent.class, "swingProgress", "getSwingProgress()F", 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(SwingArmEvent.class, "armX", "getArmX()I", 0)))};
      $$delegatedProperties = var0;
      INSTANCE = new SwingArmEvent();
      swingProgress$delegate = Delegates.INSTANCE.notNull();
      armX$delegate = Delegates.INSTANCE.notNull();
   }
}
