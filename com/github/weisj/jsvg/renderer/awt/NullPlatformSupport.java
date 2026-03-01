package com.github.weisj.jsvg.renderer.awt;

import java.awt.image.ImageObserver;
import org.jetbrains.annotations.Nullable;

public final class NullPlatformSupport implements PlatformSupport {
   @Nullable
   public ImageObserver imageObserver() {
      return null;
   }

   @Nullable
   public PlatformSupport.TargetSurface targetSurface() {
      return null;
   }
}
