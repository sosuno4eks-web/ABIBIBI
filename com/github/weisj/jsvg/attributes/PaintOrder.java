package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.SeparatorMode;
import org.jetbrains.annotations.NotNull;

public final class PaintOrder {
   public static final PaintOrder NORMAL;
   @NotNull
   private final PaintOrder.Phase[] phases;

   public PaintOrder(@NotNull PaintOrder.Phase... phases) {
      this.phases = phases;
   }

   @NotNull
   public PaintOrder.Phase[] phases() {
      return this.phases;
   }

   @NotNull
   public static PaintOrder parse(@NotNull AttributeNode attributeNode) {
      String value = attributeNode.getValue("paint-order");
      AttributeParser parser = attributeNode.parser();
      if (value != null && !"normal".equals(value)) {
         String[] rawPhases = parser.parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
         PaintOrder.Phase[] phases = new PaintOrder.Phase[3];
         int length = Math.min(phases.length, rawPhases.length);
         int i = 0;

         while(i < length) {
            phases[i] = (PaintOrder.Phase)parser.parseEnum(rawPhases[i], PaintOrder.Phase.class);
            if (phases[i] != null) {
               ++i;
            }
         }

         while(i < 3) {
            phases[i] = findNextInNormalOrder(phases, i);
            ++i;
         }

         return new PaintOrder(phases);
      } else {
         return NORMAL;
      }
   }

   @NotNull
   private static PaintOrder.Phase findNextInNormalOrder(@NotNull PaintOrder.Phase[] phases, int maxIndex) {
      PaintOrder.Phase[] var2 = NORMAL.phases();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         PaintOrder.Phase phase = var2[var4];
         boolean found = false;

         for(int i = 0; i < maxIndex; ++i) {
            if (phases[i] == phase) {
               found = true;
               break;
            }
         }

         if (!found) {
            return phase;
         }
      }

      throw new IllegalStateException();
   }

   static {
      NORMAL = new PaintOrder(new PaintOrder.Phase[]{PaintOrder.Phase.FILL, PaintOrder.Phase.STROKE, PaintOrder.Phase.MARKERS});
   }

   public static enum Phase {
      FILL,
      STROKE,
      MARKERS;

      // $FF: synthetic method
      private static PaintOrder.Phase[] $values() {
         return new PaintOrder.Phase[]{FILL, STROKE, MARKERS};
      }
   }
}
