package com.github.weisj.jsvg.nodes.mesh;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Float;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({Category.Gradient})
@PermittedContent(
   categories = {Category.Descriptive},
   anyOf = {MeshRow.class, Animate.class, AnimateTransform.class, Set.class}
)
public final class MeshGradient extends ContainerNode implements SVGPaint {
   public static final String TAG = "meshgradient";
   private Length x;
   private Length y;
   private UnitType gradientUnits;

   @NotNull
   public String tagName() {
      return "meshgradient";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.x = attributeNode.getLength("x", 0.0F);
      this.y = attributeNode.getLength("y", 0.0F);
      this.gradientUnits = (UnitType)attributeNode.getEnum("gradientUnits", UnitType.ObjectBoundingBox);
      MeshBuilder.buildMesh(this, new Float(this.x.raw(), this.y.raw()));
   }

   public void renderMesh(@NotNull MeasureContext measure, @NotNull Output output) {
      Output meshOutput = output.createChild();
      meshOutput.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
      Iterator var4 = this.children().iterator();

      while(var4.hasNext()) {
         SVGNode child = (SVGNode)var4.next();
         MeshRow row = (MeshRow)child;
         Iterator var7 = row.children().iterator();

         while(var7.hasNext()) {
            SVGNode node = (SVGNode)var7.next();
            MeshPatch patch = (MeshPatch)node;
            patch.renderPath(meshOutput);
         }
      }

      meshOutput.dispose();
   }

   public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      Output.SafeState safeState = output.safeState();
      Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
      output.setClip(shape);
      output.translate(b.getX(), b.getY());
      this.renderMesh(context.measureContext(), output);
      safeState.restore();
   }

   public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
      Output.SafeState safeState = output.safeState();
      Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
      output.setClip(output.stroke().createStrokedShape(shape));
      output.translate(b.getX(), b.getY());
      this.renderMesh(context.measureContext(), output);
      safeState.restore();
   }
}
