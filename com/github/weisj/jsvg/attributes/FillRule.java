package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

public enum FillRule {
   Nonzero(1),
   EvenOdd(0),
   Inherit(Nonzero.awtWindingRule);

   public final int awtWindingRule;

   private FillRule(int awtWindingRule) {
      this.awtWindingRule = awtWindingRule;
   }

   @NotNull
   public static FillRule parse(@NotNull AttributeNode attributeNode) {
      return (FillRule)attributeNode.getEnum("fill-rule", Inherit);
   }

   // $FF: synthetic method
   private static FillRule[] $values() {
      return new FillRule[]{Nonzero, EvenOdd, Inherit};
   }
}
