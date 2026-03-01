package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.util.GraphicsResetHelper;
import com.github.weisj.jsvg.util.Provider;
import java.awt.Color;
import java.awt.Font;
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

public class Graphics2DOutput implements Output {
   private final Graphics2D g;

   @NotNull
   public Graphics2D graphics() {
      return this.g;
   }

   public Graphics2DOutput(@NotNull Graphics2D g) {
      this.g = g;
   }

   public void fillShape(@NotNull Shape shape) {
      this.g.fill(shape);
   }

   public void drawShape(@NotNull Shape shape) {
      this.g.draw(shape);
   }

   public void drawImage(@NotNull BufferedImage image) {
      this.g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), (Color)null, (ImageObserver)null);
   }

   public void drawImage(@NotNull Image image, @Nullable ImageObserver observer) {
      this.g.drawImage(image, 0, 0, (ImageObserver)null);
   }

   public void drawImage(@NotNull Image image, @NotNull AffineTransform at, @Nullable ImageObserver observer) {
      this.g.drawImage(image, at, observer);
   }

   public void setPaint(@NotNull Paint paint) {
      GraphicsUtil.safelySetPaint(this.g, paint);
   }

   public void setPaint(@NotNull Provider<Paint> paintProvider) {
      this.setPaint((Paint)paintProvider.get());
   }

   public void setStroke(@NotNull Stroke stroke) {
      this.g.setStroke(stroke);
   }

   @NotNull
   public Stroke stroke() {
      return this.g.getStroke();
   }

   public void applyClip(@NotNull Shape clipShape) {
      this.g.clip(clipShape);
   }

   public void setClip(@Nullable Shape shape) {
      this.g.setClip(shape);
   }

   public Optional<Float> contextFontSize() {
      Font f = this.g.getFont();
      return f != null ? Optional.of(f.getSize2D()) : Optional.empty();
   }

   @NotNull
   public Output createChild() {
      return new Graphics2DOutput((Graphics2D)this.g.create());
   }

   public void dispose() {
      this.g.dispose();
   }

   public void debugPaint(@NotNull Consumer<Graphics2D> painter) {
      Graphics2D debugGraphics = (Graphics2D)this.g.create();
      painter.accept(debugGraphics);
      debugGraphics.dispose();
   }

   @NotNull
   public Rectangle2D clipBounds() {
      return this.g.getClipBounds();
   }

   @NotNull
   public RenderingHints renderingHints() {
      return this.g.getRenderingHints();
   }

   @Nullable
   public Object renderingHint(@NotNull Key key) {
      return this.g.getRenderingHint(key);
   }

   public void setRenderingHint(@NotNull Key key, @Nullable Object value) {
      this.g.setRenderingHint(key, value);
   }

   @NotNull
   public AffineTransform transform() {
      return this.g.getTransform();
   }

   public void setTransform(@NotNull AffineTransform affineTransform) {
      this.g.setTransform(affineTransform);
   }

   public void applyTransform(@NotNull AffineTransform transform) {
      this.g.transform(transform);
   }

   public void rotate(double angle) {
      this.g.rotate(angle);
   }

   public void scale(double sx, double sy) {
      this.g.scale(sx, sy);
   }

   public void translate(double dx, double dy) {
      this.g.translate(dx, dy);
   }

   public void applyOpacity(float opacity) {
      this.g.setComposite(GraphicsUtil.deriveComposite(this.g, opacity));
   }

   @NotNull
   public Output.SafeState safeState() {
      return new GraphicsResetHelper(this.g);
   }

   public boolean supportsFilters() {
      return true;
   }

   public boolean supportsColors() {
      return true;
   }
}
