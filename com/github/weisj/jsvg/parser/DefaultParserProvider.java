package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.attributes.paint.DefaultPaintParser;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.parser.css.CssParser;
import com.github.weisj.jsvg.parser.css.impl.SimpleCssParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DefaultParserProvider implements ParserProvider {
   @NotNull
   public PaintParser createPaintParser() {
      return new DefaultPaintParser();
   }

   @NotNull
   public CssParser createCssParser() {
      return new SimpleCssParser();
   }

   @Nullable
   public DomProcessor createPreProcessor() {
      return null;
   }

   @Nullable
   public DomProcessor createPostProcessor() {
      return null;
   }
}
