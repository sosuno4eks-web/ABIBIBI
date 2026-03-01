package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.util.ConstantProvider;
import com.github.weisj.jsvg.util.LazyProvider;
import com.github.weisj.jsvg.util.Provider;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public final class ChannelStorage<T> {
   @NotNull
   private final Map<Object, Provider<T>> storage = new HashMap();

   public void addResult(@NotNull FilterChannelKey key, @NotNull T value) {
      this.storage.put(key.key(), new ConstantProvider(value));
   }

   public void addResult(@NotNull FilterChannelKey key, @NotNull Supplier<T> value) {
      this.storage.put(key.key(), new LazyProvider(value));
   }

   @NotNull
   public T get(@NotNull FilterChannelKey key) {
      Provider<T> provider = (Provider)this.storage.get(key.key());
      if (provider == null) {
         throw new IllegalFilterStateException("Channel " + key + " not found.");
      } else {
         return provider.get();
      }
   }
}
