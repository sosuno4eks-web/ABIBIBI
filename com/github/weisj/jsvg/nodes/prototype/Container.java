package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.nodes.SVGNode;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.ApiStatus.Internal;

public interface Container<E> {
   @Internal
   void addChild(@Nullable String var1, @NotNull SVGNode var2);

   List<? extends E> children();

   default <T extends E> List<T> childrenOfType(Class<T> type) {
      Stream var10000 = this.children().stream();
      Objects.requireNonNull(type);
      var10000 = var10000.filter(type::isInstance);
      Objects.requireNonNull(type);
      return (List)var10000.map(type::cast).collect(Collectors.toList());
   }
}
