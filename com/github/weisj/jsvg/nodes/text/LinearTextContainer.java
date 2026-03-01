package com.github.weisj.jsvg.nodes.text;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Float;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;

abstract class LinearTextContainer extends TextContainer {
   protected Length[] x;
   protected Length[] y;
   protected Length[] dx;
   protected Length[] dy;
   protected float[] rotate;

   @MustBeInvokedByOverriders
   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.x = attributeNode.getLengthList("x");
      this.y = attributeNode.getLengthList("y");
      this.dx = attributeNode.getLengthList("dx");
      this.dy = attributeNode.getLengthList("dy");
      this.rotate = attributeNode.getFloatList("rotate");
   }

   @NotNull
   public Shape untransformedElementShape(@NotNull RenderContext context) {
      Path2D textPath = new Float();
      this.appendTextShape(this.createCursor(), textPath, context);
      return textPath;
   }

   public void render(@NotNull RenderContext context, @NotNull Output output) {
      this.renderSegment(this.createCursor(), context, output);
   }

   @NotNull
   private GlyphCursor createCursor() {
      return new GlyphCursor(0.0F, 0.0F, new AffineTransform());
   }

   protected GlyphCursor createLocalCursor(@NotNull RenderContext context, @NotNull GlyphCursor current) {
      GlyphCursor local = current.derive();
      if (this.x.length != 0) {
         local.xLocations = this.x;
         local.xOff = 0;
      }

      if (this.y.length != 0) {
         local.yLocations = this.y;
         local.yOff = 0;
      }

      if (this.dx.length != 0) {
         local.xDeltas = this.dx;
         local.dyOff = 0;
      }

      if (this.dy.length != 0) {
         local.yDeltas = this.dy;
         local.dyOff = 0;
      }

      if (this.rotate.length != 0) {
         local.rotations = this.rotate;
         local.rotOff = 0;
      }

      return local;
   }

   protected void cleanUpLocalCursor(@NotNull GlyphCursor current, @NotNull GlyphCursor local) {
      current.updateFrom(local);
      if (this.x.length == 0) {
         current.xOff = local.xOff;
      }

      if (this.y.length == 0) {
         current.yOff = local.yOff;
      }

      if (this.dx.length == 0) {
         current.dxOff = local.dxOff;
      }

      if (this.dy.length == 0) {
         current.dyOff = local.dyOff;
      }

      if (this.rotate.length == 0) {
         current.rotOff = local.rotOff;
      }

   }
}
