package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.size.FloatInsets;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.BlittableImage;
import com.github.weisj.jsvg.util.ImageUtil;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ElementCategories({})
@PermittedContent(
   categories = {Category.Descriptive, Category.FilterPrimitive},
   anyOf = {Animate.class, Set.class}
)
public final class Filter extends ContainerNode {
   private static final boolean DEBUG = false;
   public static final String TAG = "filter";
   private static final Length DEFAULT_FILTER_COORDINATE;
   private static final Length DEFAULT_FILTER_SIZE;
   private Length x;
   private Length y;
   private Length width;
   private Length height;
   private UnitType filterUnits;
   private UnitType filterPrimitiveUnits;
   private boolean isValid;

   @NotNull
   public String tagName() {
      return "filter";
   }

   public boolean hasEffect() {
      return this.isValid && !this.children().isEmpty();
   }

   public void build(@NotNull AttributeNode attributeNode) {
      super.build(attributeNode);
      this.isValid = true;
      Iterator var2 = this.children().iterator();

      while(var2.hasNext()) {
         SVGNode child = (SVGNode)var2.next();
         FilterPrimitive filterPrimitive = (FilterPrimitive)child;
         if (!filterPrimitive.isValid()) {
            this.isValid = false;
            break;
         }
      }

      this.filterUnits = (UnitType)attributeNode.getEnum("filterUnits", UnitType.ObjectBoundingBox);
      this.filterPrimitiveUnits = (UnitType)attributeNode.getEnum("primitiveUnits", UnitType.UserSpaceOnUse);
      this.x = attributeNode.getLength("x", DEFAULT_FILTER_COORDINATE);
      this.y = attributeNode.getLength("y", DEFAULT_FILTER_COORDINATE);
      this.width = attributeNode.getLength("width", DEFAULT_FILTER_SIZE);
      this.height = attributeNode.getLength("height", DEFAULT_FILTER_SIZE);
      if (this.filterUnits == UnitType.ObjectBoundingBox) {
         this.x = this.coerceToPercentage(this.x);
         this.y = this.coerceToPercentage(this.y);
         this.width = this.coerceToPercentage(this.width);
         this.height = this.coerceToPercentage(this.height);
      }

   }

   @NotNull
   private Length coerceToPercentage(@NotNull Length length) {
      return length.unit() == Unit.PERCENTAGE ? length : new Length(Unit.PERCENTAGE, length.raw() * 100.0F);
   }

   @Nullable
   public Filter.FilterInfo createFilterInfo(@NotNull Output output, @NotNull RenderContext context, @NotNull Rectangle2D elementBounds) {
      Double filterRegion = this.filterUnits.computeViewBounds(context.measureContext(), elementBounds, this.x, this.y, this.width, this.height);
      Rectangle2D graphicsClipBounds = output.clipBounds();
      FilterLayoutContext filterLayoutContext = new FilterLayoutContext(this.filterPrimitiveUnits, elementBounds, graphicsClipBounds);
      Rectangle2D clippedElementBounds = elementBounds.createIntersection(graphicsClipBounds);
      Rectangle2D effectiveFilterRegion = filterRegion.createIntersection(graphicsClipBounds);
      if (effectiveFilterRegion.isEmpty()) {
         return null;
      } else {
         LayoutBounds elementLayoutBounds = new LayoutBounds(effectiveFilterRegion, new FloatInsets());
         LayoutBounds clippedElementLayoutBounds = new LayoutBounds(clippedElementBounds, new FloatInsets());
         LayoutBounds sourceDependentBounds = elementLayoutBounds.transform((data, flags) -> {
            return flags.operatesOnWholeFilterRegion ? data : clippedElementLayoutBounds.resolve(flags);
         });
         filterLayoutContext.resultChannels().addResult(DefaultFilterChannel.LastResult, (Object)elementLayoutBounds);
         filterLayoutContext.resultChannels().addResult(DefaultFilterChannel.SourceGraphic, (Object)sourceDependentBounds);
         filterLayoutContext.resultChannels().addResult(DefaultFilterChannel.SourceAlpha, (Object)sourceDependentBounds);
         Iterator var12 = this.children().iterator();

         while(var12.hasNext()) {
            SVGNode child = (SVGNode)var12.next();

            try {
               FilterPrimitive filterPrimitive = (FilterPrimitive)child;
               filterPrimitive.layoutFilter(context, filterLayoutContext);
            } catch (IllegalFilterStateException var16) {
            }
         }

         LayoutBounds.Data clipHeuristic = ((LayoutBounds)filterLayoutContext.resultChannels().get(DefaultFilterChannel.LastResult)).resolve(LayoutBounds.ComputeFlags.INITIAL);
         FloatInsets insets = clipHeuristic.clipBoundsEscapeInsets();
         Rectangle2D clipHeuristicBounds = clipHeuristic.bounds().createIntersection(GeometryUtil.grow(graphicsClipBounds, insets));
         BlittableImage blitImage = BlittableImage.create(ImageUtil::createCompatibleTransparentImage, context, clipHeuristicBounds, filterRegion, elementBounds, UnitType.UserSpaceOnUse);
         return new Filter.FilterInfo(output, blitImage, elementBounds);
      }
   }

   public void applyFilter(@NotNull Output output, @NotNull RenderContext context, @NotNull Filter.FilterInfo filterInfo) {
      ImageProducer producer = filterInfo.blittableImage.image().getSource();
      FilterContext filterContext = new FilterContext(filterInfo, this.filterPrimitiveUnits, output.renderingHints());
      Channel sourceChannel = new ImageProducerChannel(producer);
      filterContext.resultChannels().addResult(DefaultFilterChannel.SourceGraphic, (Object)sourceChannel);
      filterContext.resultChannels().addResult(DefaultFilterChannel.LastResult, (Object)sourceChannel);
      filterContext.resultChannels().addResult(DefaultFilterChannel.SourceAlpha, (Supplier)(() -> {
         return sourceChannel.applyFilter(new Filter.AlphaImageFilter());
      }));
      Iterator var7 = this.children().iterator();

      while(var7.hasNext()) {
         SVGNode child = (SVGNode)var7.next();

         try {
            FilterPrimitive filterPrimitive = (FilterPrimitive)child;
            filterPrimitive.applyFilter(context, filterContext);
         } catch (IllegalFilterStateException var10) {
         }
      }

      filterInfo.producer = ((Channel)Objects.requireNonNull(filterContext.getChannel(DefaultFilterChannel.LastResult))).producer();
   }

   protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
      return node instanceof FilterPrimitive && super.acceptChild(id, node);
   }

   static {
      DEFAULT_FILTER_COORDINATE = Unit.PERCENTAGE.valueOf(-10.0F);
      DEFAULT_FILTER_SIZE = Unit.PERCENTAGE.valueOf(120.0F);
   }

   public static final class FilterInfo {
      public final int imageWidth;
      public final int imageHeight;
      @NotNull
      private final Rectangle2D elementBounds;
      @NotNull
      private final Output imageOutput;
      @NotNull
      private final BlittableImage blittableImage;
      private ImageProducer producer;

      private FilterInfo(@NotNull Output output, @NotNull BlittableImage blittableImage, @NotNull Rectangle2D elementBounds) {
         this.blittableImage = blittableImage;
         this.elementBounds = elementBounds;
         BufferedImage image = blittableImage.image();
         this.imageWidth = image.getWidth();
         this.imageHeight = image.getHeight();
         Graphics2D g = blittableImage.createGraphics();
         g.setRenderingHints(output.renderingHints());
         this.imageOutput = new Graphics2DOutput(g);
      }

      @NotNull
      public Rectangle2D imageBounds() {
         return this.blittableImage.boundsInUserSpace();
      }

      @NotNull
      public Rectangle2D elementBounds() {
         return this.elementBounds;
      }

      @NotNull
      public Output output() {
         return this.imageOutput;
      }

      @NotNull
      public Rectangle2D tile() {
         Rectangle2D imageBounds = this.imageBounds();
         return new Double(imageBounds.getX() - this.elementBounds.getX(), imageBounds.getY() - this.elementBounds.getY(), imageBounds.getWidth(), imageBounds.getHeight());
      }

      public void blitImage(@NotNull Output output, @NotNull RenderContext context) {
         Rectangle2D imageBounds = this.imageBounds();
         this.blittableImage.prepareForBlitting(output, context);
         output.drawImage(context.platformSupport().createImage(this.producer), context.platformSupport().imageObserver());
      }

      public void close() {
         this.imageOutput.dispose();
      }

      // $FF: synthetic method
      private static void lambda$blitImage$0(Rectangle2D imageBounds, Graphics2D g) {
         g.setColor(Color.RED);
         g.draw(imageBounds);
      }

      // $FF: synthetic method
      FilterInfo(Output x0, BlittableImage x1, Rectangle2D x2, Object x3) {
         this(x0, x1, x2);
      }
   }

   private static final class AlphaImageFilter extends RGBImageFilter {
      private final ColorModel model;

      private AlphaImageFilter() {
         this.model = ColorModel.getRGBdefault();
      }

      public int filterRGB(int x, int y, int rgb) {
         return this.model.getAlpha(rgb) << 24;
      }

      // $FF: synthetic method
      AlphaImageFilter(Object x0) {
         this();
      }
   }
}
