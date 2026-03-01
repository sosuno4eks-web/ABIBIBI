package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.SVGRenderingHints;
import com.github.weisj.jsvg.util.Provider;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Output {
   void fillShape(@NotNull Shape var1);

   void drawShape(@NotNull Shape var1);

   void drawImage(@NotNull BufferedImage var1);

   void drawImage(@NotNull Image var1, @Nullable ImageObserver var2);

   void drawImage(@NotNull Image var1, @NotNull AffineTransform var2, @Nullable ImageObserver var3);

   void setPaint(@NotNull Paint var1);

   void setPaint(@NotNull Provider<Paint> var1);

   void setStroke(@NotNull Stroke var1);

   @NotNull
   Stroke stroke();

   void applyClip(@NotNull Shape var1);

   void setClip(@Nullable Shape var1);

   Optional<Float> contextFontSize();

   @NotNull
   Output createChild();

   void dispose();

   void debugPaint(@NotNull Consumer<Graphics2D> var1);

   @NotNull
   Rectangle2D clipBounds();

   @Nullable
   RenderingHints renderingHints();

   @Nullable
   Object renderingHint(@NotNull Key var1);

   void setRenderingHint(@NotNull Key var1, @Nullable Object var2);

   @NotNull
   AffineTransform transform();

   void setTransform(@NotNull AffineTransform var1);

   void applyTransform(@NotNull AffineTransform var1);

   void rotate(double var1);

   void scale(double var1, double var3);

   void translate(double var1, double var3);

   void applyOpacity(float var1);

   @NotNull
   Output.SafeState safeState();

   boolean supportsFilters();

   boolean supportsColors();

   default boolean isSoftClippingEnabled() {
      return this.renderingHint(SVGRenderingHints.KEY_SOFT_CLIPPING) == SVGRenderingHints.VALUE_SOFT_CLIPPING_ON;
   }

   public interface SafeState {
      void restore();
   }
}
