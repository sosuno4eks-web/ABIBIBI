package com.github.weisj.jsvg.renderer.awt;

import java.awt.Font;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Objects;
import javax.swing.JComponent;
import org.jetbrains.annotations.NotNull;

public final class JComponentPlatformSupport implements PlatformSupport {
   @NotNull
   private final JComponent component;

   public JComponentPlatformSupport(@NotNull JComponent component) {
      this.component = component;
   }

   public float fontSize() {
      Font font = this.component.getFont();
      return font != null ? font.getSize2D() : PlatformSupport.super.fontSize();
   }

   @NotNull
   public PlatformSupport.TargetSurface targetSurface() {
      JComponent var10000 = this.component;
      Objects.requireNonNull(var10000);
      return var10000::repaint;
   }

   @NotNull
   public ImageObserver imageObserver() {
      return this.component;
   }

   @NotNull
   public Image createImage(@NotNull ImageProducer imageProducer) {
      return this.component.createImage(imageProducer);
   }

   public String toString() {
      return "JComponentAwtSupport{component=" + this.component + '}';
   }
}
