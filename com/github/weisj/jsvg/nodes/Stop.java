package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.geometry.path.BezierPathCommand;
import com.github.weisj.jsvg.geometry.path.PathParser;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.util.ColorUtil;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.Gradient})
@PermittedContent(
   anyOf = {Animate.class, Set.class}
)
public final class Stop extends AbstractSVGNode {
   public static final String TAG = "stop";
   @NotNull
   private Color color;
   private float offset;
   @Nullable
   private BezierPathCommand path;

   public Stop() {
      this.color = PaintParser.DEFAULT_COLOR;
   }

   @NotNull
   public String tagName() {
      return "stop";
   }

   @NotNull
   public Color color() {
      return this.color;
   }

   public float offset() {
      return this.offset;
   }

   @Nullable
   public BezierPathCommand bezierCommand() {
      return this.path;
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      Color c = attributeNode.getColor("stop-color");
      float opacity = attributeNode.getPercentage("stop-opacity", (float)c.getAlpha() / 255.0F);
      this.color = ColorUtil.withAlpha(c, opacity);
      this.offset = attributeNode.getPercentage("offset", 0.0F);
      String pathData = attributeNode.getValue("path");
      this.path = pathData != null ? (new PathParser(pathData)).parseMeshCommand() : null;
   }

   public String toString() {
      return "Stop{color=" + this.color + ", offset=" + this.offset + '}';
   }
}
