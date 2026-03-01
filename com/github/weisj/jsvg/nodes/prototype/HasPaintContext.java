package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.PaintContext;
import org.jetbrains.annotations.NotNull;

public interface HasPaintContext {
   @NotNull
   Mutator<PaintContext> paintContext();
}
