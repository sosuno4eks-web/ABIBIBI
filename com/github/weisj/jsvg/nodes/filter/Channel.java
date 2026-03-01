package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import org.jetbrains.annotations.NotNull;

public interface Channel {
   @NotNull
   ImageProducer producer();

   @NotNull
   default Image toImage(@NotNull RenderContext context) {
      return context.platformSupport().createImage(this.producer());
   }

   @NotNull
   default BufferedImage toBufferedImageNonAliased(@NotNull RenderContext context) {
      return makeNonAliased(this.toImage(context));
   }

   @NotNull
   static BufferedImage makeNonAliased(@NotNull Image img) {
      BufferedImage bufferedImage = new BufferedImage(img.getWidth((ImageObserver)null), img.getHeight((ImageObserver)null), 2);
      Graphics imageGraphics = bufferedImage.getGraphics();
      imageGraphics.drawImage(img, 0, 0, (ImageObserver)null);
      imageGraphics.dispose();
      return bufferedImage;
   }

   @NotNull
   Channel applyFilter(@NotNull ImageFilter var1);

   @NotNull
   PixelProvider pixels(@NotNull RenderContext var1);
}
