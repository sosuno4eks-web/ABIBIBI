package kotlin.text;

import java.util.List;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MatchResult {
   @NotNull
   IntRange getRange();

   @NotNull
   String getValue();

   @NotNull
   MatchGroupCollection getGroups();

   @NotNull
   List<String> getGroupValues();

   @NotNull
   MatchResult.Destructured getDestructured();

   @Nullable
   MatchResult next();

   public static final class DefaultImpls {
      @NotNull
      public static MatchResult.Destructured getDestructured(@NotNull MatchResult $this) {
         return new MatchResult.Destructured($this);
      }
   }

   public static final class Destructured {
      @NotNull
      private final MatchResult match;

      public Destructured(@NotNull MatchResult match) {
         Intrinsics.checkNotNullParameter(match, "match");
         super();
         this.match = match;
      }

      @NotNull
      public final MatchResult getMatch() {
         return this.match;
      }

      @InlineOnly
      private final String component1() {
         return (String)this.getMatch().getGroupValues().get(1);
      }

      @InlineOnly
      private final String component2() {
         return (String)this.getMatch().getGroupValues().get(2);
      }

      @InlineOnly
      private final String component3() {
         return (String)this.getMatch().getGroupValues().get(3);
      }

      @InlineOnly
      private final String component4() {
         return (String)this.getMatch().getGroupValues().get(4);
      }

      @InlineOnly
      private final String component5() {
         return (String)this.getMatch().getGroupValues().get(5);
      }

      @InlineOnly
      private final String component6() {
         return (String)this.getMatch().getGroupValues().get(6);
      }

      @InlineOnly
      private final String component7() {
         return (String)this.getMatch().getGroupValues().get(7);
      }

      @InlineOnly
      private final String component8() {
         return (String)this.getMatch().getGroupValues().get(8);
      }

      @InlineOnly
      private final String component9() {
         return (String)this.getMatch().getGroupValues().get(9);
      }

      @InlineOnly
      private final String component10() {
         return (String)this.getMatch().getGroupValues().get(10);
      }

      @NotNull
      public final List<String> toList() {
         return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
      }
   }
}
