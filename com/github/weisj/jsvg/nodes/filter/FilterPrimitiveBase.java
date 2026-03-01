package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

public final class FilterPrimitiveBase {
   @NotNull
   final Length x;
   @NotNull
   final Length y;
   @NotNull
   final Length width;
   @NotNull
   final Length height;
   @NotNull
   private final FilterChannelKey inputChannel;
   @NotNull
   private final FilterChannelKey resultChannel;

   public FilterPrimitiveBase(@NotNull AttributeNode attributeNode) {
      this.x = attributeNode.getLength("x", Unit.PERCENTAGE.valueOf(0.0F));
      this.y = attributeNode.getLength("y", Unit.PERCENTAGE.valueOf(0.0F));
      this.width = attributeNode.getLength("width", Unit.PERCENTAGE.valueOf(100.0F));
      this.height = attributeNode.getLength("height", Unit.PERCENTAGE.valueOf(100.0F));
      this.inputChannel = attributeNode.getFilterChannelKey("in", DefaultFilterChannel.LastResult);
      this.resultChannel = attributeNode.getFilterChannelKey("result", DefaultFilterChannel.LastResult);
   }

   @NotNull
   public Channel channel(@NotNull FilterChannelKey key, @NotNull FilterContext context) {
      return context.getChannel(key);
   }

   @NotNull
   public Channel inputChannel(@NotNull FilterContext context) {
      return this.channel(this.inputChannel, context);
   }

   @NotNull
   public LayoutBounds layoutInput(@NotNull FilterLayoutContext context) {
      return (LayoutBounds)context.resultChannels().get(this.inputChannel);
   }

   public void noop(@NotNull FilterContext context) {
      this.saveResult(this.inputChannel(context), context);
   }

   public void saveLayoutResult(@NotNull LayoutBounds outputBounds, @NotNull FilterLayoutContext filterLayoutContext) {
      this.saveResultImpl(outputBounds, filterLayoutContext.resultChannels());
   }

   public void saveResult(@NotNull Channel output, @NotNull FilterContext filterContext) {
      this.saveResultImpl(output, filterContext.resultChannels());
   }

   private <T> void saveResultImpl(@NotNull T value, @NotNull ChannelStorage<T> storage) {
      storage.addResult(this.resultChannel, value);
      if (this.resultChannel != DefaultFilterChannel.LastResult) {
         storage.addResult(DefaultFilterChannel.LastResult, (Object)value);
      }

   }
}
