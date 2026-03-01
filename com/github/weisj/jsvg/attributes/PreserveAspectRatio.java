package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.parser.SeparatorMode;
import java.awt.geom.AffineTransform;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PreserveAspectRatio {
   @NotNull
   public final PreserveAspectRatio.Align align;
   @NotNull
   public final PreserveAspectRatio.MeetOrSlice meetOrSlice;

   private PreserveAspectRatio(@NotNull PreserveAspectRatio.Align align, @NotNull PreserveAspectRatio.MeetOrSlice meetOrSlice) {
      this.align = align;
      this.meetOrSlice = meetOrSlice;
   }

   @NotNull
   public static PreserveAspectRatio none() {
      return new PreserveAspectRatio(PreserveAspectRatio.Align.None, PreserveAspectRatio.MeetOrSlice.Meet);
   }

   @NotNull
   public static PreserveAspectRatio parse(@Nullable String preserveAspectRation, @NotNull AttributeParser parser) {
      return parse(preserveAspectRation, (PreserveAspectRatio)null, parser);
   }

   @NotNull
   public static PreserveAspectRatio parse(@Nullable String preserveAspectRation, @Nullable PreserveAspectRatio fallback, @NotNull AttributeParser parser) {
      PreserveAspectRatio.Align align = PreserveAspectRatio.Align.xMidYMid;
      PreserveAspectRatio.MeetOrSlice meetOrSlice = PreserveAspectRatio.MeetOrSlice.Meet;
      if (preserveAspectRation == null) {
         return fallback != null ? fallback : new PreserveAspectRatio(align, meetOrSlice);
      } else {
         String[] components = parser.parseStringList(preserveAspectRation, SeparatorMode.COMMA_AND_WHITESPACE);
         if (components.length >= 1 && components.length <= 2) {
            align = (PreserveAspectRatio.Align)parser.parseEnum(components[0], (Enum)align);
            if (components.length > 1) {
               meetOrSlice = (PreserveAspectRatio.MeetOrSlice)parser.parseEnum(components[1], (Enum)meetOrSlice);
            }

            return new PreserveAspectRatio(align, meetOrSlice);
         } else {
            throw new IllegalArgumentException("Too many arguments specified: " + preserveAspectRation);
         }
      }
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof PreserveAspectRatio)) {
         return false;
      } else {
         PreserveAspectRatio that = (PreserveAspectRatio)o;
         return this.align == that.align && this.meetOrSlice == that.meetOrSlice;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.align, this.meetOrSlice});
   }

   @NotNull
   public AffineTransform computeViewPortTransform(@NotNull FloatSize size, @NotNull ViewBox viewBox) {
      AffineTransform viewTransform = new AffineTransform();
      if (this.align == PreserveAspectRatio.Align.None) {
         viewTransform.scale((double)(size.width / viewBox.width), (double)(size.height / viewBox.height));
      } else {
         float xScale = size.width / viewBox.width;
         float yScale = size.height / viewBox.height;
         switch(this.meetOrSlice) {
         case Meet:
            xScale = yScale = Math.min(xScale, yScale);
            break;
         case Slice:
            xScale = yScale = Math.max(xScale, yScale);
            break;
         default:
            throw new IllegalStateException();
         }

         viewTransform.translate((double)this.align.xAlign.align(size.width, viewBox.width * xScale), (double)this.align.yAlign.align(size.height, viewBox.height * yScale));
         viewTransform.scale((double)xScale, (double)yScale);
      }

      viewTransform.translate((double)(-viewBox.x), (double)(-viewBox.y));
      return viewTransform;
   }

   public String toString() {
      return "PreserveAspectRatio{align=" + this.align + ", meetOrSlice=" + this.meetOrSlice + '}';
   }

   public static enum Align {
      None(PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Min),
      xMinYMin(PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Min),
      xMidYMin(PreserveAspectRatio.AlignType.Mid, PreserveAspectRatio.AlignType.Min),
      xMaxYMin(PreserveAspectRatio.AlignType.Max, PreserveAspectRatio.AlignType.Min),
      xMinYMid(PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Mid),
      xMidYMid(PreserveAspectRatio.AlignType.Mid, PreserveAspectRatio.AlignType.Mid),
      xMaxYMid(PreserveAspectRatio.AlignType.Max, PreserveAspectRatio.AlignType.Mid),
      xMinYMax(PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Max),
      xMidYMax(PreserveAspectRatio.AlignType.Mid, PreserveAspectRatio.AlignType.Max),
      xMaxYMax(PreserveAspectRatio.AlignType.Max, PreserveAspectRatio.AlignType.Max);

      @NotNull
      private final PreserveAspectRatio.AlignType xAlign;
      @NotNull
      private final PreserveAspectRatio.AlignType yAlign;

      private Align(@NotNull PreserveAspectRatio.AlignType xAlign, @NotNull PreserveAspectRatio.AlignType yAlign) {
         this.xAlign = xAlign;
         this.yAlign = yAlign;
      }

      public String toString() {
         return this.name() + "{" + this.xAlign + ", " + this.yAlign + "}";
      }

      // $FF: synthetic method
      private static PreserveAspectRatio.Align[] $values() {
         return new PreserveAspectRatio.Align[]{None, xMinYMin, xMidYMin, xMaxYMin, xMinYMid, xMidYMid, xMaxYMid, xMinYMax, xMidYMax, xMaxYMax};
      }
   }

   public static enum MeetOrSlice {
      Meet,
      Slice;

      // $FF: synthetic method
      private static PreserveAspectRatio.MeetOrSlice[] $values() {
         return new PreserveAspectRatio.MeetOrSlice[]{Meet, Slice};
      }
   }

   private static enum AlignType {
      Min {
         float align(float size1, float size2) {
            return 0.0F;
         }
      },
      Mid {
         float align(float size1, float size2) {
            return (size1 - size2) / 2.0F;
         }
      },
      Max {
         float align(float size1, float size2) {
            return size1 - size2;
         }
      };

      private AlignType() {
      }

      abstract float align(float var1, float var2);

      // $FF: synthetic method
      private static PreserveAspectRatio.AlignType[] $values() {
         return new PreserveAspectRatio.AlignType[]{Min, Mid, Max};
      }

      // $FF: synthetic method
      AlignType(Object x2) {
         this();
      }
   }
}
