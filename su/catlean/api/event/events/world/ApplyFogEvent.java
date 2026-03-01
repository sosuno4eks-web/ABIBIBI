package su.catlean.api.event.events.world;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import su.catlean.api.event.Event;

public final class ApplyFogEvent extends Event {
   @NotNull
   public static final ApplyFogEvent INSTANCE = new ApplyFogEvent();
   @NotNull
   private static Vector4f colorVec = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private static float eStart;
   private static float eEnd;
   private static float rStart;
   private static float rEnd;

   private ApplyFogEvent() {
   }

   @NotNull
   public final Vector4f getColorVec() {
      return colorVec;
   }

   public final void setColorVec(@NotNull Vector4f <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      colorVec = var1;
   }

   public final float getEStart() {
      return eStart;
   }

   public final void setEStart(float <set-?>) {
      eStart = var1;
   }

   public final float getEEnd() {
      return eEnd;
   }

   public final void setEEnd(float <set-?>) {
      eEnd = var1;
   }

   public final float getRStart() {
      return rStart;
   }

   public final void setRStart(float <set-?>) {
      rStart = var1;
   }

   public final float getREnd() {
      return rEnd;
   }

   public final void setREnd(float <set-?>) {
      rEnd = var1;
   }
}
