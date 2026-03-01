package com.github.weisj.jsvg.nodes.container;

import com.github.weisj.jsvg.nodes.AbstractSVGNode;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.Container;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BaseContainerNode<E> extends AbstractSVGNode implements Container<E> {
   private static final boolean EXHAUSTIVE_CHECK = true;
   private static final Logger LOGGER = Logger.getLogger(BaseContainerNode.class.getName());

   public final void addChild(@Nullable String id, @NotNull SVGNode node) {
      if (this.isAcceptableType(node) && this.acceptChild(id, node)) {
         this.doAdd(node);
      }

   }

   protected abstract void doAdd(@NotNull SVGNode var1);

   protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
      return true;
   }

   protected boolean isAcceptableType(@NotNull SVGNode node) {
      PermittedContent allowedNodes = (PermittedContent)this.getClass().getAnnotation(PermittedContent.class);
      if (allowedNodes == null) {
         throw new IllegalStateException(String.format("Element <%s> doesn't specify permitted content information", this.tagName()));
      } else if (allowedNodes.any()) {
         return true;
      } else {
         Class<? extends SVGNode> nodeType = node.getClass();
         ElementCategories categories = (ElementCategories)nodeType.getAnnotation(ElementCategories.class);
         if (categories == null) {
            throw new IllegalStateException("Element <" + node.tagName() + "> doesn't specify element category information");
         } else {
            BaseContainerNode.CategoryCheckResult result = this.doIntersect(allowedNodes.categories(), categories.value());
            if (result == BaseContainerNode.CategoryCheckResult.Allowed) {
               return true;
            } else {
               Class[] var6 = allowedNodes.anyOf();
               int var7 = var6.length;

               for(int var8 = 0; var8 < var7; ++var8) {
                  Class<? extends SVGNode> type = var6[var8];
                  if (type.isAssignableFrom(nodeType)) {
                     return true;
                  }
               }

               if (result != BaseContainerNode.CategoryCheckResult.Excluded) {
                  LOGGER.warning(() -> {
                     return String.format("Element <%s> not allowed in <%s> (or not implemented)", node.tagName(), this.tagName());
                  });
               }

               return false;
            }
         }
      }
   }

   private BaseContainerNode.CategoryCheckResult doIntersect(Category[] requested, Category[] provided) {
      BaseContainerNode.CategoryCheckResult result = BaseContainerNode.CategoryCheckResult.Denied;
      Category[] var4 = requested;
      int var5 = requested.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Category request = var4[var6];
         boolean effectivelyAllowed = request.isEffectivelyAllowed();
         if (!effectivelyAllowed) {
         }

         Category[] var9 = provided;
         int var10 = provided.length;

         for(int var11 = 0; var11 < var10; ++var11) {
            Category category = var9[var11];
            if (request == category) {
               if (effectivelyAllowed) {
                  return BaseContainerNode.CategoryCheckResult.Allowed;
               }

               result = BaseContainerNode.CategoryCheckResult.Excluded;
            }
         }
      }

      return result;
   }

   private static enum CategoryCheckResult {
      Allowed,
      Denied,
      Excluded;

      // $FF: synthetic method
      private static BaseContainerNode.CategoryCheckResult[] $values() {
         return new BaseContainerNode.CategoryCheckResult[]{Allowed, Denied, Excluded};
      }
   }
}
