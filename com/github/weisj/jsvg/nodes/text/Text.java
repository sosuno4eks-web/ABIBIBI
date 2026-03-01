package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.Graphic, Category.TextContent})
@PermittedContent(
   categories = {Category.Animation, Category.Descriptive, Category.TextContentChild},
   anyOf = {Anchor.class},
   charData = true
)
public final class Text extends LinearTextContainer implements HasGeometryContext.ByDelegate {
   public static final String TAG = "text";
   private HasGeometryContext geometryContext;

   @NotNull
   public String tagName() {
      return "text";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
   }

   @NotNull
   public HasGeometryContext geometryContextDelegate() {
      return this.geometryContext;
   }
}
