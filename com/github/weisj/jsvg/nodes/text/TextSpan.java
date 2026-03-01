package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.TextContent, Category.TextContentChild})
@PermittedContent(
   categories = {Category.Descriptive},
   anyOf = {Anchor.class, TextSpan.class, Animate.class, AnimateTransform.class, Set.class},
   charData = true
)
public final class TextSpan extends LinearTextContainer {
   public static final String TAG = "tspan";

   @NotNull
   public String tagName() {
      return "tspan";
   }
}
