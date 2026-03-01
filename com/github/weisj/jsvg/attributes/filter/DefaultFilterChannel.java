package com.github.weisj.jsvg.attributes.filter;

import org.jetbrains.annotations.NotNull;

public enum DefaultFilterChannel implements FilterChannelKey {
   SourceGraphic,
   SourceAlpha,
   BackgroundImage,
   BackgroundAlpha,
   FillPaint,
   StrokePaint,
   LastResult;

   @NotNull
   public Object key() {
      return this == LastResult ? this : this.toString();
   }

   // $FF: synthetic method
   private static DefaultFilterChannel[] $values() {
      return new DefaultFilterChannel[]{SourceGraphic, SourceAlpha, BackgroundImage, BackgroundAlpha, FillPaint, StrokePaint, LastResult};
   }
}
