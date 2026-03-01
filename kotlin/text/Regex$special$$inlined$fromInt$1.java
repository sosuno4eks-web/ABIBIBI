package kotlin.text;

import kotlin.jvm.functions.Function1;

public final class Regex$special$$inlined$fromInt$1 implements Function1<RegexOption, Boolean> {
   // $FF: synthetic field
   final int $value;

   public Regex$special$$inlined$fromInt$1(int $value) {
      this.$value = $value;
   }

   public final Boolean invoke(RegexOption it) {
      return (this.$value & ((FlagEnum)it).getMask()) == ((FlagEnum)it).getValue();
   }
}
