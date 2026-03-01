package com.github.weisj.jsvg.util;

import org.jetbrains.annotations.NotNull;

public final class ConstantProvider<T> implements Provider<T> {
   @NotNull
   private final T t;

   public ConstantProvider(@NotNull T t) {
      this.t = t;
   }

   @NotNull
   public T get() {
      return this.t;
   }
}
