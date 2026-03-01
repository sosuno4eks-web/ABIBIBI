package com.github.weisj.jsvg;

import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.SVG;
import com.github.weisj.jsvg.nodes.prototype.Instantiator;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.ShapeOutput;
import com.github.weisj.jsvg.renderer.awt.JComponentPlatformSupport;
import com.github.weisj.jsvg.renderer.awt.NullPlatformSupport;
import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.RenderingHints.Key;
import java.awt.geom.Area;
import java.awt.geom.Path2D.Float;
import java.util.Objects;
import java.util.Optional;
import javax.swing.JComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SVGDocument {
   private static final boolean DEBUG = false;
   @NotNull
   private final SVG root;
   @NotNull
   private final FloatSize size;

   public SVGDocument(@NotNull SVG root) {
      this.root = root;
      float em = SVGFont.defaultFontSize();
      this.size = root.sizeForTopLevel(em, SVGFont.exFromEm(em));
   }

   @NotNull
   public FloatSize size() {
      return this.size;
   }

   @NotNull
   public Shape computeShape() {
      return this.computeShape((ViewBox)null);
   }

   @NotNull
   public Shape computeShape(@Nullable ViewBox viewBox) {
      Area accumulator = new Area(new Float());
      this.renderWithPlatform(new NullPlatformSupport(), new ShapeOutput(accumulator), viewBox);
      return accumulator;
   }

   public void render(@Nullable JComponent component, @NotNull Graphics2D g) {
      this.render(component, g, (ViewBox)null);
   }

   public void render(@Nullable JComponent component, @NotNull Graphics2D graphics2D, @Nullable ViewBox bounds) {
      PlatformSupport platformSupport = component != null ? new JComponentPlatformSupport(component) : new NullPlatformSupport();
      Graphics2D g = (Graphics2D)graphics2D.create();
      this.setupSVGRenderingHints(g);
      Output output = new Graphics2DOutput(g);
      this.renderWithPlatform((PlatformSupport)platformSupport, output, bounds);
      output.dispose();
   }

   private float computePlatformFontSize(@NotNull PlatformSupport platformSupport, @NotNull Output output) {
      Optional var10000 = output.contextFontSize();
      Objects.requireNonNull(platformSupport);
      return (java.lang.Float)var10000.orElseGet(platformSupport::fontSize);
   }

   public void renderWithPlatform(@NotNull PlatformSupport platformSupport, @NotNull Output output, @Nullable ViewBox bounds) {
      RenderContext context = this.prepareRenderContext(platformSupport, output, bounds);
      if (bounds == null) {
         bounds = new ViewBox(this.root.size(context));
      }

      output.applyClip(bounds);
      output.translate((double)bounds.x, (double)bounds.y);
      NodeRenderer.Info info = NodeRenderer.createRenderInfo(this.root, context, output, (Instantiator)null);

      try {
         Objects.requireNonNull(info);
         this.root.renderWithSize(bounds.size(), this.root.viewBox(context), info.context, info.output);
      } catch (Throwable var9) {
         if (info != null) {
            try {
               info.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (info != null) {
         info.close();
      }

   }

   @NotNull
   private RenderContext prepareRenderContext(@NotNull PlatformSupport platformSupport, @NotNull Output output, @Nullable ViewBox bounds) {
      float defaultEm = this.computePlatformFontSize(platformSupport, output);
      float defaultEx = SVGFont.exFromEm(defaultEm);
      MeasureContext initialMeasure = bounds != null ? MeasureContext.createInitial(bounds.size(), defaultEm, defaultEx) : MeasureContext.createInitial(this.root.sizeForTopLevel(defaultEm, defaultEx), defaultEm, defaultEx);
      RenderContext context = RenderContext.createInitial(platformSupport, initialMeasure);
      this.root.applyTransform(output, context);
      return context;
   }

   private void setupSVGRenderingHints(@NotNull Graphics2D g) {
      Object aaHint = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      if (aaHint != RenderingHints.VALUE_ANTIALIAS_DEFAULT) {
         this.setSVGRenderingHint(g, SVGRenderingHints.KEY_IMAGE_ANTIALIASING, aaHint == RenderingHints.VALUE_ANTIALIAS_ON ? SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_ON : SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_OFF);
      } else {
         g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }

      if (g.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL) == RenderingHints.VALUE_STROKE_DEFAULT) {
         g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
      }

   }

   private void setSVGRenderingHint(@NotNull Graphics2D g, @NotNull Key key, @NotNull Object o) {
      if (g.getRenderingHint(key) == null) {
         g.setRenderingHint(key, o);
      }

   }

   // $FF: synthetic method
   private static void lambda$renderWithPlatform$0(ViewBox finalBounds, Graphics2D g) {
      g.setColor(Color.RED);
      g.draw(finalBounds);
   }
}
