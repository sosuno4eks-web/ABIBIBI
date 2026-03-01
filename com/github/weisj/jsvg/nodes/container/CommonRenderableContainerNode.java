package com.github.weisj.jsvg.nodes.container;

import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.HasContext;
import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
import com.github.weisj.jsvg.nodes.prototype.Renderable;
import com.github.weisj.jsvg.nodes.prototype.impl.HasContextImpl;
import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;

public abstract class CommonRenderableContainerNode extends BaseContainerNode<SVGNode> implements Renderable, HasGeometryContext.ByDelegate, HasContext.ByDelegate {
   private final List<SVGNode> children = new ArrayList();
   private boolean isVisible;
   private HasGeometryContext geometryContext;
   private HasContext context;

   @MustBeInvokedByOverriders
   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.isVisible = this.parseIsVisible(attributeNode);
      this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
      this.context = HasContextImpl.parse(attributeNode);
   }

   @NotNull
   public HasGeometryContext geometryContextDelegate() {
      return this.geometryContext;
   }

   @NotNull
   public HasContext contextDelegate() {
      return this.context;
   }

   protected void doAdd(@NotNull SVGNode node) {
      this.children.add(node);
   }

   public List<? extends SVGNode> children() {
      return this.children;
   }

   public void render(@NotNull RenderContext context, @NotNull Output output) {
      Iterator var3 = this.children().iterator();

      while(var3.hasNext()) {
         SVGNode child = (SVGNode)var3.next();
         NodeRenderer.renderNode(child, context, output);
      }

   }

   public boolean isVisible(@NotNull RenderContext context) {
      return this.isVisible;
   }
}
