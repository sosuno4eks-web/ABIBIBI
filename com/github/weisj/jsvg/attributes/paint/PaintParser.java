package com.github.weisj.jsvg.attributes.paint;

import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface PaintParser {
   Color DEFAULT_COLOR = Color.BLACK;

   @Nullable
   Color parseColor(@NotNull String var1, @NotNull AttributeNode var2);

   @Nullable
   SVGPaint parsePaint(@Nullable String var1, @NotNull AttributeNode var2);
}
