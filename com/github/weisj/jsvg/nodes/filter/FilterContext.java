package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import java.awt.RenderingHints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FilterContext {
   @NotNull
   private final ChannelStorage<Channel> resultChannels = new ChannelStorage();
   private final Filter.FilterInfo info;
   @NotNull
   private final UnitType primitiveUnits;
   @Nullable
   private final RenderingHints renderingHints;

   public FilterContext(@NotNull Filter.FilterInfo info, @NotNull UnitType primitiveUnits, @Nullable RenderingHints renderingHints) {
      this.info = info;
      this.primitiveUnits = primitiveUnits;
      this.renderingHints = renderingHints;
   }

   @NotNull
   public Filter.FilterInfo info() {
      return this.info;
   }

   @NotNull
   public UnitType primitiveUnits() {
      return this.primitiveUnits;
   }

   @Nullable
   public RenderingHints renderingHints() {
      return this.renderingHints;
   }

   @NotNull
   public ChannelStorage<Channel> resultChannels() {
      return this.resultChannels;
   }

   @NotNull
   public Channel getChannel(@NotNull FilterChannelKey key) {
      return (Channel)this.resultChannels.get(key);
   }
}
