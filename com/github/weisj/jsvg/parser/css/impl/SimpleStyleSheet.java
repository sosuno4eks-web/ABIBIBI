package com.github.weisj.jsvg.parser.css.impl;

import com.github.weisj.jsvg.parser.ParsedElement;
import com.github.weisj.jsvg.parser.SeparatorMode;
import com.github.weisj.jsvg.parser.css.StyleProperty;
import com.github.weisj.jsvg.parser.css.StyleSheet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public final class SimpleStyleSheet implements StyleSheet {
   @NotNull
   private final Map<String, List<StyleProperty>> classRules = new HashMap();
   @NotNull
   private final Map<String, List<StyleProperty>> idRules = new HashMap();
   @NotNull
   private final Map<String, List<StyleProperty>> tagNameRules = new HashMap();

   @NotNull
   public Map<String, List<StyleProperty>> classRules() {
      return this.classRules;
   }

   @NotNull
   public Map<String, List<StyleProperty>> idRules() {
      return this.idRules;
   }

   @NotNull
   public Map<String, List<StyleProperty>> tagNameRules() {
      return this.tagNameRules;
   }

   void addTagNameRules(@NotNull String tagName, @NotNull List<StyleProperty> rule) {
      ((List)this.tagNameRules.computeIfAbsent(tagName, (k) -> {
         return new ArrayList();
      })).addAll(rule);
   }

   void addClassRules(@NotNull String className, @NotNull List<StyleProperty> rule) {
      ((List)this.classRules.computeIfAbsent(className, (k) -> {
         return new ArrayList();
      })).addAll(rule);
   }

   void addIdRules(@NotNull String id, @NotNull List<StyleProperty> rule) {
      ((List)this.idRules.computeIfAbsent(id, (k) -> {
         return new ArrayList();
      })).addAll(rule);
   }

   public void forEachMatchingRule(@NotNull ParsedElement element, @NotNull StyleSheet.RuleConsumer ruleConsumer) {
      List<StyleProperty> rules = (List)this.tagNameRules.get(element.node().tagName());
      if (rules != null) {
         Objects.requireNonNull(ruleConsumer);
         rules.forEach(ruleConsumer::applyRule);
      }

      if (element.id() != null) {
         rules = (List)this.idRules.get(element.id());
         if (rules != null) {
            Objects.requireNonNull(ruleConsumer);
            rules.forEach(ruleConsumer::applyRule);
         }
      }

      String[] var4 = element.attributeNode().getStringList("class", SeparatorMode.WHITESPACE_ONLY);
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String className = var4[var6];
         rules = (List)this.classRules.get(className);
         if (rules != null) {
            Objects.requireNonNull(ruleConsumer);
            rules.forEach(ruleConsumer::applyRule);
         }
      }

   }
}
