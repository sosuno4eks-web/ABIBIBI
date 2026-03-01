package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.renderer.FontRenderContext;
import com.github.weisj.jsvg.renderer.PaintContext;
import org.jetbrains.annotations.NotNull;

public interface HasContext extends HasPaintContext, HasFontContext, HasFontRenderContext, HasFillRule {
   public interface ByDelegate extends HasContext {
      @NotNull
      HasContext contextDelegate();

      @NotNull
      default FillRule fillRule() {
         return this.contextDelegate().fillRule();
      }

      @NotNull
      default Mutator<MeasurableFontSpec> fontSpec() {
         return this.contextDelegate().fontSpec();
      }

      @NotNull
      default FontRenderContext fontRenderContext() {
         return this.contextDelegate().fontRenderContext();
      }

      @NotNull
      default Mutator<PaintContext> paintContext() {
         return this.contextDelegate().paintContext();
      }
   }
}
