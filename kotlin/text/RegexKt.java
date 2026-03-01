package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

public final class RegexKt {
   private static final int toInt(Iterable<? extends FlagEnum> $this$toInt) {
      int initial$iv = 0;
      int $i$f$fold = false;
      int accumulator$iv = initial$iv;

      FlagEnum option;
      for(Iterator var5 = $this$toInt.iterator(); var5.hasNext(); accumulator$iv |= option.getValue()) {
         Object element$iv = var5.next();
         option = (FlagEnum)element$iv;
         int var9 = false;
      }

      return accumulator$iv;
   }

   // $FF: synthetic method
   private static final <T extends Enum<T> & FlagEnum> Set<T> fromInt(int value) {
      int $i$f$fromInt = false;
      Intrinsics.reifiedOperationMarker(4, "T");
      EnumSet var2 = EnumSet.allOf((Class)Enum.class);
      EnumSet $this$fromInt_u24lambda_u241 = (EnumSet)var2;
      int var4 = false;
      Intrinsics.checkNotNull($this$fromInt_u24lambda_u241);
      Iterable var10000 = (Iterable)$this$fromInt_u24lambda_u241;
      Intrinsics.needClassReification();
      CollectionsKt.retainAll(var10000, (Function1)(new Function1<T, Boolean>() {
         public final Boolean invoke(T it) {
            return (value & ((FlagEnum)it).getMask()) == ((FlagEnum)it).getValue();
         }
      }));
      Set var5 = Collections.unmodifiableSet((Set)var2);
      Intrinsics.checkNotNullExpressionValue(var5, "unmodifiableSet(...)");
      return (Set)var5;
   }

   private static final MatchResult findNext(Matcher $this$findNext, int from, CharSequence input) {
      return !$this$findNext.find(from) ? null : (MatchResult)(new MatcherMatchResult($this$findNext, input));
   }

   private static final MatchResult matchEntire(Matcher $this$matchEntire, CharSequence input) {
      return !$this$matchEntire.matches() ? null : (MatchResult)(new MatcherMatchResult($this$matchEntire, input));
   }

   private static final IntRange range(java.util.regex.MatchResult $this$range) {
      return RangesKt.until($this$range.start(), $this$range.end());
   }

   private static final IntRange range(java.util.regex.MatchResult $this$range, int groupIndex) {
      return RangesKt.until($this$range.start(groupIndex), $this$range.end(groupIndex));
   }

   // $FF: synthetic method
   public static final int access$toInt(Iterable $receiver) {
      return toInt($receiver);
   }

   // $FF: synthetic method
   public static final MatchResult access$findNext(Matcher $receiver, int from, CharSequence input) {
      return findNext($receiver, from, input);
   }

   // $FF: synthetic method
   public static final MatchResult access$matchEntire(Matcher $receiver, CharSequence input) {
      return matchEntire($receiver, input);
   }

   // $FF: synthetic method
   public static final IntRange access$range(java.util.regex.MatchResult $receiver) {
      return range($receiver);
   }

   // $FF: synthetic method
   public static final IntRange access$range(java.util.regex.MatchResult $receiver, int groupIndex) {
      return range($receiver, groupIndex);
   }
}
