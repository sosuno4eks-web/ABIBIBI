package com.github.weisj.jsvg.parser;

public enum SeparatorMode {
   COMMA_ONLY,
   WHITESPACE_ONLY,
   COMMA_AND_WHITESPACE;

   // $FF: synthetic method
   private static SeparatorMode[] $values() {
      return new SeparatorMode[]{COMMA_ONLY, WHITESPACE_ONLY, COMMA_AND_WHITESPACE};
   }
}
