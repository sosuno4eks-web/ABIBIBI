package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.text.GlyphRenderMethod;
import com.github.weisj.jsvg.attributes.text.Side;
import com.github.weisj.jsvg.attributes.text.Spacing;
import com.github.weisj.jsvg.geometry.SVGShape;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.util.ReversePathIterator;
import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.ShapeNode;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.PathUtil;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Float;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.Graphic, Category.TextContent, Category.TextContentChild})
@PermittedContent(
   categories = {Category.Descriptive},
   anyOf = {Anchor.class, TextSpan.class, Animate.class, AnimateTransform.class, Set.class},
   charData = true
)
public final class TextPath extends TextContainer {
   public static final String TAG = "textpath";
   private static final boolean DEBUG = false;
   private SVGShape pathShape;
   private Spacing spacing;
   private GlyphRenderMethod renderMethod;
   private Side side;
   private Length startOffset;

   @NotNull
   public String tagName() {
      return "textpath";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.renderMethod = (GlyphRenderMethod)attributeNode.getEnum("method", GlyphRenderMethod.Align);
      this.side = (Side)attributeNode.getEnum("side", Side.Left);
      this.spacing = (Spacing)attributeNode.getEnum("spacing", Spacing.Auto);
      this.startOffset = attributeNode.getLength("startOffset", 0.0F);
      String pathData = attributeNode.getValue("path");
      if (pathData != null) {
         this.pathShape = PathUtil.parseFromPathData(pathData, FillRule.EvenOdd);
      } else {
         String href = attributeNode.getHref();
         ShapeNode shaped = (ShapeNode)attributeNode.getElementByHref(ShapeNode.class, Category.Shape, href);
         if (shaped != null) {
            this.pathShape = shaped.shape();
         }
      }

   }

   public boolean isVisible(@NotNull RenderContext context) {
      return this.pathShape != null && super.isVisible(context);
   }

   @NotNull
   public Shape untransformedElementShape(@NotNull RenderContext context) {
      Path2D textPath = new Float();
      this.appendTextShape(this.createCursor(context), textPath, context);
      return textPath;
   }

   public void render(@NotNull RenderContext context, @NotNull Output output) {
      this.renderSegment(this.createCursor(context), context, output);
   }

   @NotNull
   private PathGlyphCursor createCursor(@NotNull RenderContext context) {
      return new PathGlyphCursor(this.createPathIterator(context), this.startOffset.resolveLength(context.measureContext()));
   }

   private void paintDebugPath(@NotNull RenderContext context, @NotNull Graphics2D g) {
      PathIterator pathIterator = this.createPathIterator(context);
      float startX = 0.0F;
      float startY = 0.0F;
      float curX = 0.0F;
      float curY = 0.0F;
      g.setStroke(new BasicStroke(0.5F));

      for(float[] cord = new float[2]; !pathIterator.isDone(); pathIterator.next()) {
         switch(pathIterator.currentSegment(cord)) {
         case 0:
            curX = cord[0];
            curY = cord[1];
            startX = curX;
            startY = curY;
            break;
         case 1:
            g.setColor(Color.MAGENTA);
            g.draw(new java.awt.geom.Line2D.Float(curX, curY, cord[0], cord[1]));
            g.setColor(Color.RED);
            g.fillRect((int)curX - 2, (int)curY - 2, 4, 4);
            g.fillRect((int)cord[0] - 2, (int)cord[1] - 2, 4, 4);
            curX = cord[0];
            curY = cord[1];
            break;
         case 2:
         case 3:
         default:
            throw new IllegalStateException();
         case 4:
            g.setColor(Color.MAGENTA);
            g.draw(new java.awt.geom.Line2D.Float(curX, curY, startX, startY));
            g.setColor(Color.RED);
            g.fillRect((int)curX - 2, (int)curY - 2, 4, 4);
            g.fillRect((int)startX - 2, (int)startY - 2, 4, 4);
            curX = startX;
            curY = startY;
         }
      }

   }

   @NotNull
   private PathIterator createPathIterator(@NotNull RenderContext context) {
      MeasureContext measureContext = context.measureContext();
      Shape path = this.pathShape.shape(context);
      float flatness = 0.1F * measureContext.ex();
      switch(this.side) {
      case Left:
         return path.getPathIterator((AffineTransform)null, (double)flatness);
      case Right:
         return new ReversePathIterator(path.getPathIterator((AffineTransform)null, (double)flatness));
      default:
         throw new IllegalStateException();
      }
   }

   protected GlyphCursor createLocalCursor(@NotNull RenderContext context, @NotNull GlyphCursor current) {
      return new PathGlyphCursor(current, this.startOffset.resolveLength(context.measureContext()), this.createPathIterator(context));
   }

   protected void cleanUpLocalCursor(@NotNull GlyphCursor current, @NotNull GlyphCursor local) {
      current.updateFrom(local);
   }

   // $FF: synthetic method
   private void lambda$render$0(RenderContext context, Graphics2D g) {
      this.paintDebugPath(context, g);
   }
}
