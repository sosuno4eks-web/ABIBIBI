package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import org.jetbrains.annotations.NotNull;

public interface UIFuture<T> {
   boolean checkIfReady(@NotNull PlatformSupport var1);

   T get();
}
