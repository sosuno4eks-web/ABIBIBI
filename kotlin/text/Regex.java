package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Regex implements Serializable {
   @NotNull
   public static final Regex.Companion Companion = new Regex.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final Pattern nativePattern;
   @Nullable
   private Set<? extends RegexOption> _options;

   @PublishedApi
   public Regex(@NotNull Pattern nativePattern) {
      Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
      super();
      this.nativePattern = nativePattern;
   }

   public Regex(@NotNull String pattern) {
      Intrinsics.checkNotNullParameter(pattern, "pattern");
      Pattern var10001 = Pattern.compile(pattern);
      Intrinsics.checkNotNullExpressionValue(var10001, "compile(...)");
      this(var10001);
   }

   public Regex(@NotNull String pattern, @NotNull RegexOption option) {
      Intrinsics.checkNotNullParameter(pattern, "pattern");
      Intrinsics.checkNotNullParameter(option, "option");
      Pattern var10001 = Pattern.compile(pattern, Companion.ensureUnicodeCase(option.getValue()));
      Intrinsics.checkNotNullExpressionValue(var10001, "compile(...)");
      this(var10001);
   }

   public Regex(@NotNull String pattern, @NotNull Set<? extends RegexOption> options) {
      Intrinsics.checkNotNullParameter(pattern, "pattern");
      Intrinsics.checkNotNullParameter(options, "options");
      Pattern var10001 = Pattern.compile(pattern, Companion.ensureUnicodeCase(RegexKt.access$toInt((Iterable)options)));
      Intrinsics.checkNotNullExpressionValue(var10001, "compile(...)");
      this(var10001);
   }

   @NotNull
   public final String getPattern() {
      String var10000 = this.nativePattern.pattern();
      Intrinsics.checkNotNullExpressionValue(var10000, "pattern(...)");
      return var10000;
   }

   @NotNull
   public final Set<RegexOption> getOptions() {
      Set var10000 = this._options;
      if (var10000 == null) {
         int value$iv = this.nativePattern.flags();
         int $i$f$fromInt = false;
         EnumSet var3 = EnumSet.allOf(RegexOption.class);
         int var5 = false;
         Intrinsics.checkNotNull(var3);
         CollectionsKt.retainAll((Iterable)var3, (Function1)(new Regex$special$$inlined$fromInt$1(value$iv)));
         var10000 = Collections.unmodifiableSet((Set)var3);
         Intrinsics.checkNotNullExpressionValue(var10000, "unmodifiableSet(...)");
         Set var6 = var10000;
         int var7 = false;
         this._options = var6;
         var10000 = var6;
      }

      return var10000;
   }

   public final boolean matches(@NotNull CharSequence input) {
      Intrinsics.checkNotNullParameter(input, "input");
      return this.nativePattern.matcher(input).matches();
   }

   public final boolean containsMatchIn(@NotNull CharSequence input) {
      Intrinsics.checkNotNullParameter(input, "input");
      return this.nativePattern.matcher(input).find();
   }

   @Nullable
   public final MatchResult find(@NotNull CharSequence input, int startIndex) {
      Intrinsics.checkNotNullParameter(input, "input");
      Matcher var10000 = this.nativePattern.matcher(input);
      Intrinsics.checkNotNullExpressionValue(var10000, "matcher(...)");
      return RegexKt.access$findNext(var10000, startIndex, input);
   }

   // $FF: synthetic method
   public static MatchResult find$default(Regex var0, CharSequence var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.find(var1, var2);
   }

   @NotNull
   public final Sequence<MatchResult> findAll(@NotNull CharSequence input, int startIndex) {
      Intrinsics.checkNotNullParameter(input, "input");
      if (startIndex >= 0 && startIndex <= input.length()) {
         return SequencesKt.generateSequence(Regex::findAll$lambda$1, (Function1)null.INSTANCE);
      } else {
         throw new IndexOutOfBoundsException("Start index out of bounds: " + startIndex + ", input length: " + input.length());
      }
   }

   // $FF: synthetic method
   public static Sequence findAll$default(Regex var0, CharSequence var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.findAll(var1, var2);
   }

   @Nullable
   public final MatchResult matchEntire(@NotNull CharSequence input) {
      Intrinsics.checkNotNullParameter(input, "input");
      Matcher var10000 = this.nativePattern.matcher(input);
      Intrinsics.checkNotNullExpressionValue(var10000, "matcher(...)");
      return RegexKt.access$matchEntire(var10000, input);
   }

   @SinceKotlin(
      version = "1.7"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @Nullable
   public final MatchResult matchAt(@NotNull CharSequence input, int index) {
      Intrinsics.checkNotNullParameter(input, "input");
      Matcher $this$matchAt_u24lambda_u242 = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
      int var4 = false;
      MatcherMatchResult var10000;
      if ($this$matchAt_u24lambda_u242.lookingAt()) {
         Intrinsics.checkNotNull($this$matchAt_u24lambda_u242);
         var10000 = new MatcherMatchResult($this$matchAt_u24lambda_u242, input);
      } else {
         var10000 = null;
      }

      return (MatchResult)var10000;
   }

   @SinceKotlin(
      version = "1.7"
   )
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   public final boolean matchesAt(@NotNull CharSequence input, int index) {
      Intrinsics.checkNotNullParameter(input, "input");
      return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
   }

   @NotNull
   public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
      Intrinsics.checkNotNullParameter(input, "input");
      Intrinsics.checkNotNullParameter(replacement, "replacement");
      String var10000 = this.nativePattern.matcher(input).replaceAll(replacement);
      Intrinsics.checkNotNullExpressionValue(var10000, "replaceAll(...)");
      return var10000;
   }

   @NotNull
   public final String replace(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform) {
      Intrinsics.checkNotNullParameter(input, "input");
      Intrinsics.checkNotNullParameter(transform, "transform");
      MatchResult var10000 = find$default(this, input, 0, 2, (Object)null);
      if (var10000 == null) {
         return input.toString();
      } else {
         MatchResult match = var10000;
         int lastStart = 0;
         int length = input.length();
         StringBuilder sb = new StringBuilder(length);

         do {
            sb.append(input, lastStart, match.getRange().getStart());
            sb.append((CharSequence)transform.invoke(match));
            lastStart = match.getRange().getEndInclusive() + 1;
            match = match.next();
         } while(lastStart < length && match != null);

         if (lastStart < length) {
            sb.append(input, lastStart, length);
         }

         String var8 = sb.toString();
         Intrinsics.checkNotNullExpressionValue(var8, "toString(...)");
         return var8;
      }
   }

   @NotNull
   public final String replaceFirst(@NotNull CharSequence input, @NotNull String replacement) {
      Intrinsics.checkNotNullParameter(input, "input");
      Intrinsics.checkNotNullParameter(replacement, "replacement");
      String var10000 = this.nativePattern.matcher(input).replaceFirst(replacement);
      Intrinsics.checkNotNullExpressionValue(var10000, "replaceFirst(...)");
      return var10000;
   }

   @NotNull
   public final List<String> split(@NotNull CharSequence input, int limit) {
      Intrinsics.checkNotNullParameter(input, "input");
      StringsKt.requireNonNegativeLimit(limit);
      Matcher matcher = this.nativePattern.matcher(input);
      if (limit != 1 && matcher.find()) {
         ArrayList result = new ArrayList(limit > 0 ? RangesKt.coerceAtMost(limit, 10) : 10);
         int lastStart = 0;
         int lastSplit = limit - 1;

         do {
            result.add(input.subSequence(lastStart, matcher.start()).toString());
            lastStart = matcher.end();
         } while((lastSplit < 0 || result.size() != lastSplit) && matcher.find());

         result.add(input.subSequence(lastStart, input.length()).toString());
         return (List)result;
      } else {
         return CollectionsKt.listOf(input.toString());
      }
   }

   // $FF: synthetic method
   public static List split$default(Regex var0, CharSequence var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.split(var1, var2);
   }

   @SinceKotlin(
      version = "1.6"
   )
   @NotNull
   public final Sequence<String> splitToSequence(@NotNull CharSequence input, int limit) {
      Intrinsics.checkNotNullParameter(input, "input");
      StringsKt.requireNonNegativeLimit(limit);
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         int I$0;
         int I$1;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence = (SequenceScope)this.L$0;
            Object var6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            String var10001;
            Continuation var10002;
            Matcher matcher;
            int nextStartx;
            int splitCount;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               matcher = Regex.this.nativePattern.matcher(input);
               if (limit == 1 || !matcher.find()) {
                  var10001 = input.toString();
                  var10002 = (Continuation)this;
                  this.L$0 = SpillingKt.nullOutSpilledVariable($this$sequence);
                  this.L$1 = SpillingKt.nullOutSpilledVariable(matcher);
                  this.label = 1;
                  if ($this$sequence.yield(var10001, var10002) == var6) {
                     return var6;
                  }

                  return Unit.INSTANCE;
               }

               int nextStart = 0;
               splitCount = 0;
               var10001 = input.subSequence(nextStart, matcher.start()).toString();
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = matcher;
               this.I$0 = nextStart;
               this.I$1 = splitCount;
               this.label = 2;
               if ($this$sequence.yield(var10001, var10002) == var6) {
                  return var6;
               }
               break;
            case 1:
               matcher = (Matcher)this.L$1;
               ResultKt.throwOnFailure($result);
               return Unit.INSTANCE;
            case 2:
               splitCount = this.I$1;
               nextStartx = this.I$0;
               matcher = (Matcher)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            case 3:
               splitCount = this.I$1;
               nextStartx = this.I$0;
               matcher = (Matcher)this.L$1;
               ResultKt.throwOnFailure($result);
               return Unit.INSTANCE;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            do {
               nextStartx = matcher.end();
               ++splitCount;
               if (splitCount == limit - 1 || !matcher.find()) {
                  var10001 = input.subSequence(nextStartx, input.length()).toString();
                  var10002 = (Continuation)this;
                  this.L$0 = SpillingKt.nullOutSpilledVariable($this$sequence);
                  this.L$1 = SpillingKt.nullOutSpilledVariable(matcher);
                  this.I$0 = nextStartx;
                  this.I$1 = splitCount;
                  this.label = 3;
                  if ($this$sequence.yield(var10001, var10002) == var6) {
                     return var6;
                  }

                  return Unit.INSTANCE;
               }

               var10001 = input.subSequence(nextStartx, matcher.start()).toString();
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = matcher;
               this.I$0 = nextStartx;
               this.I$1 = splitCount;
               this.label = 2;
            } while($this$sequence.yield(var10001, var10002) != var6);

            return var6;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super String> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   // $FF: synthetic method
   public static Sequence splitToSequence$default(Regex var0, CharSequence var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.splitToSequence(var1, var2);
   }

   @NotNull
   public String toString() {
      String var10000 = this.nativePattern.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @NotNull
   public final Pattern toPattern() {
      return this.nativePattern;
   }

   private final Object writeReplace() {
      String var10002 = this.nativePattern.pattern();
      Intrinsics.checkNotNullExpressionValue(var10002, "pattern(...)");
      return new Regex.Serialized(var10002, this.nativePattern.flags());
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }

   private static final MatchResult findAll$lambda$1(Regex this$0, CharSequence $input, int $startIndex) {
      return this$0.find($input, $startIndex);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final Regex fromLiteral(@NotNull String literal) {
         Intrinsics.checkNotNullParameter(literal, "literal");
         return new Regex(literal, RegexOption.LITERAL);
      }

      @NotNull
      public final String escape(@NotNull String literal) {
         Intrinsics.checkNotNullParameter(literal, "literal");
         String var10000 = Pattern.quote(literal);
         Intrinsics.checkNotNullExpressionValue(var10000, "quote(...)");
         return var10000;
      }

      @NotNull
      public final String escapeReplacement(@NotNull String literal) {
         Intrinsics.checkNotNullParameter(literal, "literal");
         String var10000 = Matcher.quoteReplacement(literal);
         Intrinsics.checkNotNullExpressionValue(var10000, "quoteReplacement(...)");
         return var10000;
      }

      private final int ensureUnicodeCase(int flags) {
         return (flags & 2) != 0 ? flags | 64 : flags;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   private static final class Serialized implements Serializable {
      @NotNull
      public static final Regex.Serialized.Companion Companion = new Regex.Serialized.Companion((DefaultConstructorMarker)null);
      @NotNull
      private final String pattern;
      private final int flags;
      private static final long serialVersionUID = 0L;

      public Serialized(@NotNull String pattern, int flags) {
         Intrinsics.checkNotNullParameter(pattern, "pattern");
         super();
         this.pattern = pattern;
         this.flags = flags;
      }

      @NotNull
      public final String getPattern() {
         return this.pattern;
      }

      public final int getFlags() {
         return this.flags;
      }

      private final Object readResolve() {
         Pattern var10002 = Pattern.compile(this.pattern, this.flags);
         Intrinsics.checkNotNullExpressionValue(var10002, "compile(...)");
         return new Regex(var10002);
      }

      public static final class Companion {
         private Companion() {
         }

         // $FF: synthetic method
         public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
         }
      }
   }
}
