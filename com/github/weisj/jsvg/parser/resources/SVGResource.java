package com.github.weisj.jsvg.parser.resources;

import com.github.weisj.jsvg.SVGDocument;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;

public class SVGResource implements RenderableResource {
   @NotNull
   private final SVGDocument document;

   public SVGResource(@NotNull SVGDocument document) {
      this.document = document;
   }

   @NotNull
   public FloatSize intrinsicSize(@NotNull RenderContext context) {
      return this.document.size();
   }

   public void render(@NotNull Output output, @NotNull RenderContext context, @NotNull AffineTransform imgTransform) {
      output.applyTransform(imgTransform);
      this.document.renderWithPlatform(context.platformSupport(), output, (ViewBox)null);
   }
}
