package com.github.weisj.jsvg.parser.css;

import com.github.weisj.jsvg.parser.ParsedElement;
import org.jetbrains.annotations.NotNull;

public interface StyleSheet {
   void forEachMatchingRule(@NotNull ParsedElement var1, @NotNull StyleSheet.RuleConsumer var2);

   public interface RuleConsumer {
      void applyRule(@NotNull StyleProperty var1);
   }
}
