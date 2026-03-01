package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.GraphicsUtil;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@ElementCategories({Category.FilterPrimitive})
@PermittedContent(
   anyOf = {FeMergeNode.class}
)
public final class FeMerge extends ContainerNode implements FilterPrimitive {
   public static final String TAG = "feMerge";
   private FilterPrimitiveBase filterPrimitiveBase;
   private FilterChannelKey[] inputChannels;

   @NotNull
   public String tagName() {
      return "feMerge";
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.filterPrimitiveBase = new FilterPrimitiveBase(attributeNode);
      List<FeMergeNode> nodes = this.childrenOfType(FeMergeNode.class);
      this.inputChannels = new FilterChannelKey[nodes.size()];

      for(int i = 0; i < this.inputChannels.length; ++i) {
         this.inputChannels[i] = ((FeMergeNode)nodes.get(i)).inputChannel();
      }

   }

   public boolean isValid() {
      return this.inputChannels.length > 0;
   }

   @NotNull
   public Length x() {
      return this.filterPrimitiveBase.x;
   }

   @NotNull
   public Length y() {
      return this.filterPrimitiveBase.y;
   }

   @NotNull
   public Length width() {
      return this.filterPrimitiveBase.width;
   }

   @NotNull
   public Length height() {
      return this.filterPrimitiveBase.height;
   }

   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
      if (this.inputChannels.length == 0) {
         this.filterPrimitiveBase.saveLayoutResult((LayoutBounds)filterLayoutContext.resultChannels().get(DefaultFilterChannel.SourceGraphic), filterLayoutContext);
      } else {
         LayoutBounds result = (LayoutBounds)filterLayoutContext.resultChannels().get(this.inputChannels[0]);

         for(int i = 1; i < this.inputChannels.length; ++i) {
            LayoutBounds channelBounds = (LayoutBounds)filterLayoutContext.resultChannels().get(this.inputChannels[i]);
            result = result.union(channelBounds);
         }

         this.filterPrimitiveBase.saveLayoutResult(result, filterLayoutContext);
      }
   }

   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
      if (this.inputChannels.length == 0) {
         this.filterPrimitiveBase.saveResult(this.filterPrimitiveBase.channel(DefaultFilterChannel.SourceGraphic, filterContext), filterContext);
      } else {
         Channel in = this.filterPrimitiveBase.channel(this.inputChannels[0], filterContext);
         Channel result = in;
         if (this.inputChannels.length > 1) {
            BufferedImage dst = in.toBufferedImageNonAliased(context);
            Graphics2D imgGraphics = GraphicsUtil.createGraphics(dst);

            for(int i = 1; i < this.inputChannels.length; ++i) {
               Channel channel = this.filterPrimitiveBase.channel(this.inputChannels[i], filterContext);
               imgGraphics.drawImage(context.platformSupport().createImage(channel.producer()), (AffineTransform)null, context.platformSupport().imageObserver());
            }

            result = new ImageProducerChannel(dst.getSource());
         }

         this.filterPrimitiveBase.saveResult((Channel)result, filterContext);
      }
   }
}
