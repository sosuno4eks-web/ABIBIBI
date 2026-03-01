package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.filter.Filter;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface HasGeometryContext extends Transformable, HasClip, HasFilter {
   public interface ByDelegate extends HasGeometryContext {
      @NotNull
      HasGeometryContext geometryContextDelegate();

      @Nullable
      default ClipPath clipPath() {
         return this.geometryContextDelegate().clipPath();
      }

      @Nullable
      default Mask mask() {
         return this.geometryContextDelegate().mask();
      }

      @Nullable
      default Filter filter() {
         return this.geometryContextDelegate().filter();
      }

      @Nullable
      default AffineTransform transform() {
         return this.geometryContextDelegate().transform();
      }

      @NotNull
      default Point2D transformOrigin(@NotNull MeasureContext context) {
         return this.geometryContextDelegate().transformOrigin(context);
      }
   }
}
