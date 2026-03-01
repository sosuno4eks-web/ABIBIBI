package com.github.weisj.jsvg.attributes.stroke;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.renderer.StrokeContext;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.jetbrains.annotations.NotNull;

public final class StrokeResolver {
   private StrokeResolver() {
   }

   @NotNull
   public static Stroke resolve(float pathLengthFactor, @NotNull MeasureContext measureContext, @NotNull StrokeContext context) {
      Length strokeWidth = context.strokeWidth;
      LineCap lineCap = context.lineCap;
      LineJoin lineJoin = context.lineJoin;
      float miterLimit = context.miterLimit;
      Length[] dashPattern = context.dashPattern;
      Length dashOffset = context.dashOffset;

      assert strokeWidth != null;

      assert lineCap != null;

      assert lineJoin != null;

      assert Length.isSpecified(miterLimit);

      assert dashOffset != null;

      miterLimit = Math.max(1.0F, miterLimit);
      float[] dashes = new float[dashPattern.length];
      float offsetLength = 0.0F;

      for(int i = 0; i < dashes.length; ++i) {
         float dash = dashPattern[i].resolveLength(measureContext);
         if (dashPattern[i].unit() != Unit.PERCENTAGE) {
            dash *= pathLengthFactor;
         }

         offsetLength += dash;
         dashes[i] = dash;
      }

      float phase = dashOffset.resolveLength(measureContext);
      if (dashOffset.unit() != Unit.PERCENTAGE) {
         phase *= pathLengthFactor;
      }

      if (phase < 0.0F) {
         phase += offsetLength;
      }

      if (dashes.length == 0) {
         return new BasicStroke(strokeWidth.resolveLength(measureContext), lineCap.awtCode(), lineJoin.awtCode(), miterLimit);
      } else {
         return new BasicStroke(strokeWidth.resolveLength(measureContext), lineCap.awtCode(), lineJoin.awtCode(), miterLimit, dashes, phase);
      }
   }
}
