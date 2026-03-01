package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class MatcherMatchResult implements MatchResult {
   @NotNull
   private final Matcher matcher;
   @NotNull
   private final CharSequence input;
   @NotNull
   private final MatchGroupCollection groups;
   @Nullable
   private List<String> groupValues_;

   public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence input) {
      Intrinsics.checkNotNullParameter(matcher, "matcher");
      Intrinsics.checkNotNullParameter(input, "input");
      super();
      this.matcher = matcher;
      this.input = input;
      this.groups = (MatchGroupCollection)(new MatchNamedGroupCollection() {
         public int getSize() {
            return MatcherMatchResult.this.getMatchResult().groupCount() + 1;
         }

         public boolean isEmpty() {
            return false;
         }

         public Iterator<MatchGroup> iterator() {
            return SequencesKt.map(CollectionsKt.asSequence((Iterable)CollectionsKt.getIndices((Collection)this)), <undefinedtype>::iterator$lambda$0).iterator();
         }

         public MatchGroup get(int index) {
            IntRange range = RegexKt.access$range(MatcherMatchResult.this.getMatchResult(), index);
            MatchGroup var10000;
            if (range.getStart() >= 0) {
               String var10002 = MatcherMatchResult.this.getMatchResult().group(index);
               Intrinsics.checkNotNullExpressionValue(var10002, "group(...)");
               var10000 = new MatchGroup(var10002, range);
            } else {
               var10000 = null;
            }

            return var10000;
         }

         public MatchGroup get(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(MatcherMatchResult.this.getMatchResult(), name);
         }

         private static final MatchGroup iterator$lambda$0(Object this$0, int it) {
            return this$0.get(it);
         }
      });
   }

   private final java.util.regex.MatchResult getMatchResult() {
      return (java.util.regex.MatchResult)this.matcher;
   }

   @NotNull
   public IntRange getRange() {
      return RegexKt.access$range(this.getMatchResult());
   }

   @NotNull
   public String getValue() {
      String var10000 = this.getMatchResult().group();
      Intrinsics.checkNotNullExpressionValue(var10000, "group(...)");
      return var10000;
   }

   @NotNull
   public MatchGroupCollection getGroups() {
      return this.groups;
   }

   @NotNull
   public List<String> getGroupValues() {
      if (this.groupValues_ == null) {
         this.groupValues_ = (List)(new AbstractList<String>() {
            public int getSize() {
               return MatcherMatchResult.this.getMatchResult().groupCount() + 1;
            }

            public String get(int index) {
               String var10000 = MatcherMatchResult.this.getMatchResult().group(index);
               if (var10000 == null) {
                  var10000 = "";
               }

               return var10000;
            }
         });
      }

      List var10000 = this.groupValues_;
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   @Nullable
   public MatchResult next() {
      int nextIndex = this.getMatchResult().end() + (this.getMatchResult().end() == this.getMatchResult().start() ? 1 : 0);
      MatchResult var2;
      if (nextIndex <= this.input.length()) {
         Matcher var10000 = this.matcher.pattern().matcher(this.input);
         Intrinsics.checkNotNullExpressionValue(var10000, "matcher(...)");
         var2 = RegexKt.access$findNext(var10000, nextIndex, this.input);
      } else {
         var2 = null;
      }

      return var2;
   }

   @NotNull
   public MatchResult.Destructured getDestructured() {
      return MatchResult.DefaultImpls.getDestructured(this);
   }
}
