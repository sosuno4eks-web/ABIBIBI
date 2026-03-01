package com.github.weisj.jsvg.util;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface Provider<T> {
   @NotNull
   T get();
}
