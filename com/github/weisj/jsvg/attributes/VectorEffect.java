package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum VectorEffect implements HasMatchName {
   None(0),
   NonScalingStroke("non-scaling-stroke", 0),
   NonScalingSize("non-scaling-size", 1),
   NonRotation("non-rotation", 2),
   FixedPosition("fixed-position", 4);

   @NotNull
   private final String matchName;
   private final int flag;

   private VectorEffect(int flag) {
      this.matchName = this.name();
      this.flag = flag;
   }

   private VectorEffect(@NotNull String matchName, int flag) {
      this.matchName = matchName;
      this.flag = flag;
   }

   @NotNull
   public static Set<VectorEffect> parse(@NotNull AttributeNode attributeNode) {
      String[] vectorEffectsRaw = attributeNode.getStringList("vector-effect");
      EnumSet<VectorEffect> vectorEffects = EnumSet.noneOf(VectorEffect.class);
      String[] var3 = vectorEffectsRaw;
      int var4 = vectorEffectsRaw.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String effect = var3[var5];
         vectorEffects.add((VectorEffect)attributeNode.parser().parseEnum(effect, (Enum)None));
      }

      return vectorEffects;
   }

   @NotNull
   public String matchName() {
      return this.matchName;
   }

   private static int flags(@NotNull Set<VectorEffect> effects) {
      int flag = 0;

      VectorEffect effect;
      for(Iterator var2 = effects.iterator(); var2.hasNext(); flag |= effect.flag) {
         effect = (VectorEffect)var2.next();
      }

      return flag;
   }

   public static void applyEffects(@NotNull Set<VectorEffect> effects, @NotNull Output output, @NotNull RenderContext context, @Nullable AffineTransform elementTransform) {
      int flags = flags(effects);
      if (flags != 0) {
         AffineTransform shapeTransform = new AffineTransform(context.userSpaceTransform());
         double x0 = elementTransform != null ? elementTransform.getTranslateX() : 0.0D;
         double y0 = elementTransform != null ? elementTransform.getTranslateY() : 0.0D;
         updateTransformForFlags(flags, shapeTransform, x0, y0);
         output.setTransform(context.rootTransform());
         output.applyTransform(shapeTransform);
      }
   }

   @NotNull
   public static Shape applyNonScalingStroke(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape) {
      output.setTransform(context.rootTransform());
      return context.userSpaceTransform().createTransformedShape(shape);
   }

   private static void updateTransformForFlags(int flags, @NotNull AffineTransform transform, double x0, double y0) {
      double detRoot;
      double detRootInv;
      switch(flags) {
      case 1:
         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
         if (detRoot == 0.0D) {
            return;
         }

         detRootInv = 1.0D / detRoot;
         transform.setTransform(transform.getScaleX() * detRootInv, transform.getShearY() * detRootInv, transform.getShearX() * detRootInv, transform.getScaleY() * detRootInv, transform.getTranslateX(), transform.getTranslateY());
         break;
      case 2:
         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
         transform.setTransform(detRoot, 0.0D, 0.0D, detRoot, transform.getTranslateX(), transform.getTranslateY());
         break;
      case 3:
         transform.setTransform(1.0D, 0.0D, 0.0D, 1.0D, transform.getTranslateX(), transform.getTranslateY());
         break;
      case 4:
         transform.setTransform(transform.getScaleX(), transform.getShearY(), transform.getShearX(), transform.getScaleY(), x0, y0);
         break;
      case 5:
         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
         if (detRoot == 0.0D) {
            return;
         }

         detRootInv = 1.0D / detRoot;
         transform.setTransform(transform.getScaleX() * detRootInv, transform.getShearY() * detRootInv, transform.getShearX() * detRootInv, transform.getScaleY() * detRootInv, x0, y0);
         break;
      case 6:
         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
         transform.setTransform(detRoot, 0.0D, 0.0D, detRoot, x0, y0);
         break;
      case 7:
         transform.setTransform(1.0D, 0.0D, 0.0D, 1.0D, x0, y0);
      }

   }

   // $FF: synthetic method
   private static VectorEffect[] $values() {
      return new VectorEffect[]{None, NonScalingStroke, NonScalingSize, NonRotation, FixedPosition};
   }

   private static final class Flags {
      private static final int NON_SCALING_SIZE = 1;
      private static final int NON_ROTATING = 2;
      private static final int FIXED_POSITION = 4;
   }
}
