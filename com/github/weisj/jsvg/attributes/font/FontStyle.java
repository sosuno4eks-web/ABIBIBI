package com.github.weisj.jsvg.attributes.font;

import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class FontStyle {
   private FontStyle() {
   }

   @Nullable
   public AffineTransform transform() {
      return null;
   }

   @NotNull
   public static FontStyle normal() {
      return FontStyle.Normal.INSTANCE;
   }

   @NotNull
   public static FontStyle italic() {
      return FontStyle.Italic.INSTANCE;
   }

   @NotNull
   public static FontStyle oblique() {
      return FontStyle.Oblique.DEFAULT;
   }

   @NotNull
   public static FontStyle oblique(float angle) {
      return new FontStyle.Oblique(angle);
   }

   // $FF: synthetic method
   FontStyle(Object x0) {
      this();
   }

   static final class Normal extends FontStyle {
      @NotNull
      private static final FontStyle.Normal INSTANCE = new FontStyle.Normal();

      Normal() {
         super(null);
      }

      public String toString() {
         return "Normal";
      }

      public boolean equals(Object obj) {
         return obj instanceof FontStyle.Normal;
      }

      public int hashCode() {
         return FontStyle.Normal.class.hashCode();
      }
   }

   static final class Italic extends FontStyle {
      @NotNull
      private static final FontStyle.Italic INSTANCE = new FontStyle.Italic();

      Italic() {
         super(null);
      }

      public String toString() {
         return "Italic";
      }

      public boolean equals(Object obj) {
         return obj instanceof FontStyle.Italic;
      }

      public int hashCode() {
         return FontStyle.Italic.class.hashCode();
      }
   }

   static final class Oblique extends FontStyle {
      public static final float DEFAULT_ANGLE = (float)Math.toRadians(14.0D);
      @NotNull
      public static final FontStyle.Oblique DEFAULT;
      private final float angle;

      public Oblique(float angle) {
         super(null);
         this.angle = angle;
      }

      @NotNull
      public AffineTransform transform() {
         return AffineTransform.getShearInstance((double)(-this.angle), 0.0D);
      }

      public String toString() {
         return "Oblique{" + this.angle + '}';
      }

      public boolean equals(Object o) {
         if (this == o) {
            return true;
         } else if (!(o instanceof FontStyle.Oblique)) {
            return false;
         } else {
            FontStyle.Oblique that = (FontStyle.Oblique)o;
            return Float.compare(that.angle, this.angle) == 0;
         }
      }

      public int hashCode() {
         return Float.hashCode(this.angle);
      }

      static {
         DEFAULT = new FontStyle.Oblique(DEFAULT_ANGLE);
      }
   }
}
