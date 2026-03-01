package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.geometry.size.Length;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MarkerOrientation {
   private MarkerOrientation() {
   }

   @NotNull
   public static MarkerOrientation parse(@Nullable String value, @NotNull AttributeParser parser) {
      if (value == null) {
         return MarkerOrientation.AngleOrientation.DEFAULT;
      } else if ("auto".equals(value)) {
         return MarkerOrientation.AutoOrientation.INSTANCE;
      } else if ("auto-start-reverse".equals(value)) {
         return MarkerOrientation.AutoStartReverseOrientation.INSTANCE;
      } else {
         float angle = parser.parseAngle(value, Float.NaN);
         return Length.isSpecified(angle) ? new MarkerOrientation.AngleOrientation(angle) : MarkerOrientation.AngleOrientation.DEFAULT;
      }
   }

   public abstract float orientationFor(@NotNull MarkerOrientation.MarkerType var1, float var2, float var3, float var4, float var5);

   // $FF: synthetic method
   MarkerOrientation(Object x0) {
      this();
   }

   private static final class AngleOrientation extends MarkerOrientation {
      @NotNull
      private static final MarkerOrientation.AngleOrientation DEFAULT = new MarkerOrientation.AngleOrientation(0.0F);
      private final float angle;

      private AngleOrientation(float angle) {
         super(null);
         this.angle = angle;
      }

      public float orientationFor(@NotNull MarkerOrientation.MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
         return this.angle;
      }

      // $FF: synthetic method
      AngleOrientation(float x0, Object x1) {
         this(x0);
      }
   }

   private static final class AutoOrientation extends MarkerOrientation {
      @NotNull
      private static final MarkerOrientation.AutoOrientation INSTANCE = new MarkerOrientation.AutoOrientation();

      private AutoOrientation() {
         super(null);
      }

      public float orientationFor(@NotNull MarkerOrientation.MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
         switch(type) {
         case START:
            return (float)Math.atan2((double)dyOut, (double)dxOut);
         case END:
            return (float)Math.atan2((double)dyIn, (double)dxIn);
         case MID:
            return (float)Math.atan2((double)((dyIn + dyOut) / 2.0F), (double)((dxIn + dxOut) / 2.0F));
         default:
            throw new IllegalStateException();
         }
      }
   }

   private static final class AutoStartReverseOrientation extends MarkerOrientation {
      @NotNull
      private static final MarkerOrientation.AutoStartReverseOrientation INSTANCE = new MarkerOrientation.AutoStartReverseOrientation();

      private AutoStartReverseOrientation() {
         super(null);
      }

      public float orientationFor(@NotNull MarkerOrientation.MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
         switch(type) {
         case START:
            return (float)Math.atan2((double)(-dyOut), (double)(-dxOut));
         case END:
            return (float)Math.atan2((double)dyIn, (double)dxIn);
         case MID:
            return (float)Math.atan2((double)((dyIn + dyOut) / 2.0F), (double)((dxIn + dxOut) / 2.0F));
         default:
            throw new IllegalStateException();
         }
      }
   }

   public static enum MarkerType {
      START,
      MID,
      END;

      // $FF: synthetic method
      private static MarkerOrientation.MarkerType[] $values() {
         return new MarkerOrientation.MarkerType[]{START, MID, END};
      }
   }
}
