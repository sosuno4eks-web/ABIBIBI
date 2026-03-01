package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.Container;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ParsedElement {
   @Nullable
   private final String id;
   @NotNull
   private final AttributeNode attributeNode;
   @NotNull
   private final SVGNode node;
   @NotNull
   private final List<ParsedElement> children = new ArrayList();
   final CharacterDataParser characterDataParser;
   @NotNull
   private ParsedElement.BuildStatus buildStatus;

   ParsedElement(@Nullable String id, @NotNull AttributeNode element, @NotNull SVGNode node) {
      this.buildStatus = ParsedElement.BuildStatus.NOT_BUILT;
      this.attributeNode = element;
      this.node = node;
      this.id = id;
      PermittedContent permittedContent = (PermittedContent)node.getClass().getAnnotation(PermittedContent.class);
      if (permittedContent == null) {
         throw new IllegalStateException("Element <" + node.tagName() + "> doesn't specify permitted content");
      } else {
         if (permittedContent.charData()) {
            this.characterDataParser = new CharacterDataParser();
         } else {
            this.characterDataParser = null;
         }

      }
   }

   public void registerNamedElement(@NotNull String name, @NotNull Object element) {
      this.attributeNode.namedElements().put(name, element);
   }

   @Nullable
   public String id() {
      return this.id;
   }

   @NotNull
   public List<ParsedElement> children() {
      return this.children;
   }

   @NotNull
   public SVGNode node() {
      return this.node;
   }

   @NotNull
   public SVGNode nodeEnsuringBuildStatus() {
      if (this.buildStatus == ParsedElement.BuildStatus.IN_PROGRESS) {
         this.cyclicDependencyDetected();
      } else if (this.buildStatus == ParsedElement.BuildStatus.NOT_BUILT) {
         this.build();
      }

      return this.node;
   }

   @NotNull
   public AttributeNode attributeNode() {
      return this.attributeNode;
   }

   void addChild(ParsedElement parsedElement) {
      this.children.add(parsedElement);
      if (this.node instanceof Container) {
         ((Container)this.node).addChild(parsedElement.id, parsedElement.node);
      }

   }

   void build() {
      if (this.buildStatus != ParsedElement.BuildStatus.FINISHED) {
         if (this.buildStatus == ParsedElement.BuildStatus.IN_PROGRESS) {
            this.cyclicDependencyDetected();
         } else {
            this.buildStatus = ParsedElement.BuildStatus.IN_PROGRESS;
            this.attributeNode.prepareForNodeBuilding(this);
            Iterator var1 = this.children.iterator();

            while(var1.hasNext()) {
               ParsedElement child = (ParsedElement)var1.next();
               child.build();
            }

            this.node.build(this.attributeNode);
            this.buildStatus = ParsedElement.BuildStatus.FINISHED;
         }
      }
   }

   public String toString() {
      return "ParsedElement{node=" + this.node + '}';
   }

   private void cyclicDependencyDetected() {
      throw new IllegalStateException("Cyclic dependency involving node '" + this.id + "' detected.");
   }

   private static enum BuildStatus {
      NOT_BUILT,
      IN_PROGRESS,
      FINISHED;

      // $FF: synthetic method
      private static ParsedElement.BuildStatus[] $values() {
         return new ParsedElement.BuildStatus[]{NOT_BUILT, IN_PROGRESS, FINISHED};
      }
   }
}
