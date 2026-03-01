package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.FontRenderContext;
import org.jetbrains.annotations.NotNull;

public interface HasFontRenderContext {
   @NotNull
   FontRenderContext fontRenderContext();
}
