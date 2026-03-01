package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import org.jetbrains.annotations.NotNull;

public final class ValueUIFuture<T> implements UIFuture<T> {
   private final T value;

   public ValueUIFuture(T value) {
      this.value = value;
   }

   public boolean checkIfReady(@NotNull PlatformSupport platformSupport) {
      return true;
   }

   public T get() {
      return this.value;
   }
}
