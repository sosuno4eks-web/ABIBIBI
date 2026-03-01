package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.parser.css.CssParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ParserProvider {
   @NotNull
   PaintParser createPaintParser();

   @NotNull
   CssParser createCssParser();

   @Nullable
   DomProcessor createPreProcessor();

   @Nullable
   DomProcessor createPostProcessor();
}
