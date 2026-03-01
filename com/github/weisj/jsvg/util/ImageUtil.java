package com.github.weisj.jsvg.util;

import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.renderer.GraphicsUtil;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.Raster;
import java.awt.image.SinglePixelPackedSampleModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ImageUtil {
   private ImageUtil() {
   }

   @NotNull
   public static BufferedImage createCompatibleTransparentImage(@NotNull Output output, double width, double height) {
      return createCompatibleTransparentImage(output.transform(), width, height);
   }

   @NotNull
   public static BufferedImage createCompatibleTransparentImage(int width, int height) {
      return new BufferedImage(width, height, 3);
   }

   @NotNull
   public static BufferedImage createCompatibleTransparentImage(@Nullable AffineTransform at, double width, double height) {
      return new BufferedImage((int)Math.ceil(GeometryUtil.scaleXOfTransform(at) * width), (int)Math.ceil(GeometryUtil.scaleYOfTransform(at) * height), 3);
   }

   @NotNull
   public static BufferedImage createLuminosityBuffer(@Nullable AffineTransform at, double width, double height) {
      return new BufferedImage((int)Math.ceil(GeometryUtil.scaleXOfTransform(at) * width), (int)Math.ceil(GeometryUtil.scaleYOfTransform(at) * height), 10);
   }

   public static int[] getINT_RGBA_DataBank(@NotNull Raster raster) {
      DataBufferInt dstDB = (DataBufferInt)raster.getDataBuffer();
      return dstDB.getBankData()[0];
   }

   public static int getINT_RGBA_DataOffset(@NotNull Raster raster) {
      DataBufferInt dstDB = (DataBufferInt)raster.getDataBuffer();
      SinglePixelPackedSampleModel sppsm = (SinglePixelPackedSampleModel)raster.getSampleModel();
      return dstDB.getOffset() + sppsm.getOffset(raster.getMinX() - raster.getSampleModelTranslateX(), raster.getMinY() - raster.getSampleModelTranslateY());
   }

   public static int getINT_RGBA_DataAdjust(@NotNull Raster raster) {
      return getINT_RGBA_ScanlineStride(raster) - raster.getWidth();
   }

   public static int getINT_RGBA_ScanlineStride(@NotNull Raster raster) {
      return ((SinglePixelPackedSampleModel)raster.getSampleModel()).getScanlineStride();
   }

   @NotNull
   public static BufferedImage copy(@NotNull RenderContext context, @NotNull ImageProducer producer) {
      Image img = context.platformSupport().createImage(producer);
      BufferedImage bufferedImage = createCompatibleTransparentImage((AffineTransform)null, (double)img.getWidth((ImageObserver)null), (double)img.getHeight((ImageObserver)null));
      Graphics2D g = GraphicsUtil.createGraphics(bufferedImage);
      g.drawImage(img, (AffineTransform)null, (ImageObserver)null);
      g.dispose();
      return bufferedImage;
   }
}
