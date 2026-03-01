package com.github.weisj.jsvg;

import org.jetbrains.annotations.Nullable;

public final class SVGRenderingHints {
   private static final int P_KEY_IMAGE_ANTIALIASING = 1;
   private static final int P_KEY_SOFT_CLIPPING = 2;
   public static final java.awt.RenderingHints.Key KEY_IMAGE_ANTIALIASING = new SVGRenderingHints.Key(1);
   public static final Object VALUE_IMAGE_ANTIALIASING_ON;
   public static final Object VALUE_IMAGE_ANTIALIASING_OFF;
   public static final java.awt.RenderingHints.Key KEY_SOFT_CLIPPING;
   public static final Object VALUE_SOFT_CLIPPING_ON;
   public static final Object VALUE_SOFT_CLIPPING_OFF;

   private SVGRenderingHints() {
   }

   static {
      VALUE_IMAGE_ANTIALIASING_ON = SVGRenderingHints.Value.ON;
      VALUE_IMAGE_ANTIALIASING_OFF = SVGRenderingHints.Value.OFF;
      KEY_SOFT_CLIPPING = new SVGRenderingHints.Key(2);
      VALUE_SOFT_CLIPPING_ON = SVGRenderingHints.Value.ON;
      VALUE_SOFT_CLIPPING_OFF = SVGRenderingHints.Value.OFF;
   }

   private static final class Key extends java.awt.RenderingHints.Key {
      private Key(int privateKey) {
         super(privateKey);
      }

      public boolean isCompatibleValue(@Nullable Object val) {
         return val instanceof SVGRenderingHints.Value;
      }

      // $FF: synthetic method
      Key(int x0, Object x1) {
         this(x0);
      }
   }

   private static enum Value {
      ON,
      OFF;

      // $FF: synthetic method
      private static SVGRenderingHints.Value[] $values() {
         return new SVGRenderingHints.Value[]{ON, OFF};
      }
   }
}
