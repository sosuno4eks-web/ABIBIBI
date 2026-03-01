package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MetaSVGNode implements SVGNode {
   @Nullable
   public String id() {
      return null;
   }

   public void build(@NotNull AttributeNode attributeNode) {
   }

   public void addContent(char[] content) {
   }
}
