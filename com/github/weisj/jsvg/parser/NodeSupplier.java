package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.nodes.Anchor;
import com.github.weisj.jsvg.nodes.Circle;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Defs;
import com.github.weisj.jsvg.nodes.Desc;
import com.github.weisj.jsvg.nodes.Ellipse;
import com.github.weisj.jsvg.nodes.Group;
import com.github.weisj.jsvg.nodes.Image;
import com.github.weisj.jsvg.nodes.Line;
import com.github.weisj.jsvg.nodes.LinearGradient;
import com.github.weisj.jsvg.nodes.Marker;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.Metadata;
import com.github.weisj.jsvg.nodes.Path;
import com.github.weisj.jsvg.nodes.Pattern;
import com.github.weisj.jsvg.nodes.Polygon;
import com.github.weisj.jsvg.nodes.Polyline;
import com.github.weisj.jsvg.nodes.RadialGradient;
import com.github.weisj.jsvg.nodes.Rect;
import com.github.weisj.jsvg.nodes.SVG;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.SolidColor;
import com.github.weisj.jsvg.nodes.Stop;
import com.github.weisj.jsvg.nodes.Style;
import com.github.weisj.jsvg.nodes.Symbol;
import com.github.weisj.jsvg.nodes.Title;
import com.github.weisj.jsvg.nodes.Use;
import com.github.weisj.jsvg.nodes.View;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.filter.DummyFilterPrimitive;
import com.github.weisj.jsvg.nodes.filter.FeBlend;
import com.github.weisj.jsvg.nodes.filter.FeColorMatrix;
import com.github.weisj.jsvg.nodes.filter.FeComposite;
import com.github.weisj.jsvg.nodes.filter.FeDisplacementMap;
import com.github.weisj.jsvg.nodes.filter.FeFlood;
import com.github.weisj.jsvg.nodes.filter.FeGaussianBlur;
import com.github.weisj.jsvg.nodes.filter.FeMerge;
import com.github.weisj.jsvg.nodes.filter.FeMergeNode;
import com.github.weisj.jsvg.nodes.filter.FeOffset;
import com.github.weisj.jsvg.nodes.filter.FeTurbulence;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.mesh.MeshGradient;
import com.github.weisj.jsvg.nodes.mesh.MeshPatch;
import com.github.weisj.jsvg.nodes.mesh.MeshRow;
import com.github.weisj.jsvg.nodes.text.Text;
import com.github.weisj.jsvg.nodes.text.TextPath;
import com.github.weisj.jsvg.nodes.text.TextSpan;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NodeSupplier {
   private final Map<String, Supplier<SVGNode>> constructorMap;

   public NodeSupplier() {
      this(new TreeMap(String.CASE_INSENSITIVE_ORDER));
   }

   public NodeSupplier(@NotNull Map<String, Supplier<SVGNode>> mapImpl) {
      mapImpl.clear();
      this.constructorMap = mapImpl;
      this.constructorMap.put("a", () -> {
         return new Anchor();
      });
      this.constructorMap.put("clippath", () -> {
         return new ClipPath();
      });
      this.constructorMap.put("defs", () -> {
         return new Defs();
      });
      this.constructorMap.put("g", () -> {
         return new Group();
      });
      this.constructorMap.put("image", () -> {
         return new Image();
      });
      this.constructorMap.put("marker", () -> {
         return new Marker();
      });
      this.constructorMap.put("mask", () -> {
         return new Mask();
      });
      this.constructorMap.put("svg", () -> {
         return new SVG();
      });
      this.constructorMap.put("style", () -> {
         return new Style();
      });
      this.constructorMap.put("symbol", () -> {
         return new Symbol();
      });
      this.constructorMap.put("use", () -> {
         return new Use();
      });
      this.constructorMap.put("view", () -> {
         return new View();
      });
      this.populateShapeNodeConstructors();
      this.populatePaintNodeConstructors();
      this.populateTextNodeConstructors();
      this.populateFilterNodeConstructors();
      this.populateAnimationNodeConstructors();
      this.populateMetaNodeConstructors();
      this.populateDummyNodeConstructors();
   }

   @Nullable
   public SVGNode create(@NotNull String tagName) {
      Supplier<SVGNode> supplier = (Supplier)this.constructorMap.get(tagName);
      return supplier == null ? null : (SVGNode)supplier.get();
   }

   private void populateShapeNodeConstructors() {
      this.constructorMap.put("circle", () -> {
         return new Circle();
      });
      this.constructorMap.put("ellipse", () -> {
         return new Ellipse();
      });
      this.constructorMap.put("line", () -> {
         return new Line();
      });
      this.constructorMap.put("path", () -> {
         return new Path();
      });
      this.constructorMap.put("polygon", () -> {
         return new Polygon();
      });
      this.constructorMap.put("polyline", () -> {
         return new Polyline();
      });
      this.constructorMap.put("rect", () -> {
         return new Rect();
      });
   }

   private void populatePaintNodeConstructors() {
      this.constructorMap.put("lineargradient", () -> {
         return new LinearGradient();
      });
      this.constructorMap.put("meshgradient", () -> {
         return new MeshGradient();
      });
      this.constructorMap.put("meshpatch", () -> {
         return new MeshPatch();
      });
      this.constructorMap.put("meshrow", () -> {
         return new MeshRow();
      });
      this.constructorMap.put("pattern", () -> {
         return new Pattern();
      });
      this.constructorMap.put("radialgradient", () -> {
         return new RadialGradient();
      });
      this.constructorMap.put("solidcolor", () -> {
         return new SolidColor();
      });
      this.constructorMap.put("stop", () -> {
         return new Stop();
      });
   }

   private void populateTextNodeConstructors() {
      this.constructorMap.put("text", () -> {
         return new Text();
      });
      this.constructorMap.put("textpath", () -> {
         return new TextPath();
      });
      this.constructorMap.put("tspan", () -> {
         return new TextSpan();
      });
   }

   private void populateFilterNodeConstructors() {
      this.constructorMap.put("filter", () -> {
         return new Filter();
      });
      this.constructorMap.put("feblend", () -> {
         return new FeBlend();
      });
      this.constructorMap.put("fecolormatrix", () -> {
         return new FeColorMatrix();
      });
      this.constructorMap.put("fecomposite", () -> {
         return new FeComposite();
      });
      this.constructorMap.put("fedisplacementmap", () -> {
         return new FeDisplacementMap();
      });
      this.constructorMap.put("feflood", () -> {
         return new FeFlood();
      });
      this.constructorMap.put("fegaussianblur", () -> {
         return new FeGaussianBlur();
      });
      this.constructorMap.put("feMerge", () -> {
         return new FeMerge();
      });
      this.constructorMap.put("feMergeNode", () -> {
         return new FeMergeNode();
      });
      this.constructorMap.put("feturbulence", () -> {
         return new FeTurbulence();
      });
      this.constructorMap.put("feOffset", () -> {
         return new FeOffset();
      });
   }

   private void populateAnimationNodeConstructors() {
      this.constructorMap.put("animate", () -> {
         return new Animate();
      });
      this.constructorMap.put("animatetransform", () -> {
         return new AnimateTransform();
      });
      this.constructorMap.put("set", () -> {
         return new Set();
      });
   }

   private void populateMetaNodeConstructors() {
      this.constructorMap.put("desc", () -> {
         return new Desc();
      });
      this.constructorMap.put("metadata", () -> {
         return new Metadata();
      });
      this.constructorMap.put("title", () -> {
         return new Title();
      });
   }

   private void populateDummyNodeConstructors() {
      this.constructorMap.put("feComponentTransfer", () -> {
         return new DummyFilterPrimitive("feComponentTransfer");
      });
      this.constructorMap.put("feConvolveMatrix", () -> {
         return new DummyFilterPrimitive("feConvolveMatrix");
      });
      this.constructorMap.put("feDiffuseLightning", () -> {
         return new DummyFilterPrimitive("feDiffuseLightning");
      });
      this.constructorMap.put("feDisplacementMap", () -> {
         return new DummyFilterPrimitive("feDisplacementMap");
      });
      this.constructorMap.put("feDropShadow", () -> {
         return new DummyFilterPrimitive("feDropShadow");
      });
      this.constructorMap.put("feFuncA", () -> {
         return new DummyFilterPrimitive("feFuncA");
      });
      this.constructorMap.put("feFuncB", () -> {
         return new DummyFilterPrimitive("feFuncB");
      });
      this.constructorMap.put("feFuncG", () -> {
         return new DummyFilterPrimitive("feFuncG");
      });
      this.constructorMap.put("feFuncR", () -> {
         return new DummyFilterPrimitive("feFuncR");
      });
      this.constructorMap.put("feImage", () -> {
         return new DummyFilterPrimitive("feImage");
      });
      this.constructorMap.put("feMorphology", () -> {
         return new DummyFilterPrimitive("feMorphology");
      });
      this.constructorMap.put("feSpecularLighting", () -> {
         return new DummyFilterPrimitive("feSpecularLighting");
      });
      this.constructorMap.put("feTile", () -> {
         return new DummyFilterPrimitive("feTile");
      });
   }
}
