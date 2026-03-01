package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.AbstractSVGNode;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractFilterPrimitive extends AbstractSVGNode implements FilterPrimitive {
   private FilterPrimitiveBase filterPrimitiveBase;

   @MustBeInvokedByOverriders
   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.filterPrimitiveBase = new FilterPrimitiveBase(attributeNode);
   }

   @NotNull
   protected final FilterPrimitiveBase impl() {
      return this.filterPrimitiveBase;
   }

   @NotNull
   public Length x() {
      return this.impl().x;
   }

   @NotNull
   public Length y() {
      return this.impl().y;
   }

   @NotNull
   public Length width() {
      return this.impl().width;
   }

   @NotNull
   public Length height() {
      return this.impl().height;
   }
}
