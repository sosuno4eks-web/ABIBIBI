package kotlin.comparisons;

import java.util.Comparator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class ComparisonsKt__ComparisonsKt {
   public static final <T> int compareValuesBy(T a, T b, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
      Intrinsics.checkNotNullParameter(selectors, "selectors");
      if (selectors.length <= 0) {
         String var3 = "Failed requirement.";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, selectors);
      }
   }

   private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T a, T b, Function1<? super T, ? extends Comparable<?>>[] selectors) {
      int var3 = 0;

      for(int var4 = selectors.length; var3 < var4; ++var3) {
         Function1 fn = selectors[var3];
         Comparable v1 = (Comparable)fn.invoke(a);
         Comparable v2 = (Comparable)fn.invoke(b);
         int diff = ComparisonsKt.compareValues(v1, v2);
         if (diff != 0) {
            return diff;
         }
      }

      return 0;
   }

   @InlineOnly
   private static final <T> int compareValuesBy(T a, T b, Function1<? super T, ? extends Comparable<?>> selector) {
      Intrinsics.checkNotNullParameter(selector, "selector");
      return ComparisonsKt.compareValues((Comparable)selector.invoke(a), (Comparable)selector.invoke(b));
   }

   @InlineOnly
   private static final <T, K> int compareValuesBy(T a, T b, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return comparator.compare(selector.invoke(a), selector.invoke(b));
   }

   public static final <T extends Comparable<?>> int compareValues(@Nullable T a, @Nullable T b) {
      if (a == b) {
         return 0;
      } else if (a == null) {
         return -1;
      } else {
         return b == null ? 1 : a.compareTo(b);
      }
   }

   @NotNull
   public static final <T> Comparator<T> compareBy(@NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
      Intrinsics.checkNotNullParameter(selectors, "selectors");
      if (selectors.length <= 0) {
         String var1 = "Failed requirement.";
         throw new IllegalArgumentException(var1.toString());
      } else {
         return ComparisonsKt__ComparisonsKt::compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
      }
   }

   @InlineOnly
   private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector) {
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            Function1 var3 = selector;
            return ComparisonsKt.compareValues((Comparable)var3.invoke(a), (Comparable)var3.invoke(b));
         }
      });
   }

   @InlineOnly
   private static final <T, K> Comparator<T> compareBy(Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            Comparator var3 = comparator;
            Function1 var4 = selector;
            return var3.compare(var4.invoke(a), var4.invoke(b));
         }
      });
   }

   @InlineOnly
   private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector) {
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            Function1 var3 = selector;
            return ComparisonsKt.compareValues((Comparable)var3.invoke(b), (Comparable)var3.invoke(a));
         }
      });
   }

   @InlineOnly
   private static final <T, K> Comparator<T> compareByDescending(Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            Comparator var3 = comparator;
            Function1 var4 = selector;
            return var3.compare(var4.invoke(b), var4.invoke(a));
         }
      });
   }

   @InlineOnly
   private static final <T> Comparator<T> thenBy(Comparator<T> $this$thenBy, Function1<? super T, ? extends Comparable<?>> selector) {
      Intrinsics.checkNotNullParameter($this$thenBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            int previousCompare = $this$thenBy.compare(a, b);
            int var10000;
            if (previousCompare != 0) {
               var10000 = previousCompare;
            } else {
               Function1 var4 = selector;
               var10000 = ComparisonsKt.compareValues((Comparable)var4.invoke(a), (Comparable)var4.invoke(b));
            }

            return var10000;
         }
      });
   }

   @InlineOnly
   private static final <T, K> Comparator<T> thenBy(Comparator<T> $this$thenBy, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter($this$thenBy, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            int previousCompare = $this$thenBy.compare(a, b);
            int var10000;
            if (previousCompare != 0) {
               var10000 = previousCompare;
            } else {
               Comparator var4 = comparator;
               Function1 var5 = selector;
               var10000 = var4.compare(var5.invoke(a), var5.invoke(b));
            }

            return var10000;
         }
      });
   }

   @InlineOnly
   private static final <T> Comparator<T> thenByDescending(Comparator<T> $this$thenByDescending, Function1<? super T, ? extends Comparable<?>> selector) {
      Intrinsics.checkNotNullParameter($this$thenByDescending, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            int previousCompare = $this$thenByDescending.compare(a, b);
            int var10000;
            if (previousCompare != 0) {
               var10000 = previousCompare;
            } else {
               Function1 var4 = selector;
               var10000 = ComparisonsKt.compareValues((Comparable)var4.invoke(b), (Comparable)var4.invoke(a));
            }

            return var10000;
         }
      });
   }

   @InlineOnly
   private static final <T, K> Comparator<T> thenByDescending(Comparator<T> $this$thenByDescending, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter($this$thenByDescending, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      Intrinsics.checkNotNullParameter(selector, "selector");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            int previousCompare = $this$thenByDescending.compare(a, b);
            int var10000;
            if (previousCompare != 0) {
               var10000 = previousCompare;
            } else {
               Comparator var4 = comparator;
               Function1 var5 = selector;
               var10000 = var4.compare(var5.invoke(b), var5.invoke(a));
            }

            return var10000;
         }
      });
   }

   @InlineOnly
   private static final <T> Comparator<T> thenComparator(Comparator<T> $this$thenComparator, Function2<? super T, ? super T, Integer> comparison) {
      Intrinsics.checkNotNullParameter($this$thenComparator, "<this>");
      Intrinsics.checkNotNullParameter(comparison, "comparison");
      return (Comparator)(new Comparator() {
         public final int compare(T a, T b) {
            int previousCompare = $this$thenComparator.compare(a, b);
            return previousCompare != 0 ? previousCompare : ((Number)comparison.invoke(a, b)).intValue();
         }
      });
   }

   @NotNull
   public static final <T> Comparator<T> then(@NotNull Comparator<T> $this$then, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$then, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ComparisonsKt__ComparisonsKt::then$lambda$1$ComparisonsKt__ComparisonsKt;
   }

   @NotNull
   public static final <T> Comparator<T> thenDescending(@NotNull Comparator<T> $this$thenDescending, @NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter($this$thenDescending, "<this>");
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ComparisonsKt__ComparisonsKt::thenDescending$lambda$2$ComparisonsKt__ComparisonsKt;
   }

   @NotNull
   public static final <T> Comparator<T> nullsFirst(@NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ComparisonsKt__ComparisonsKt::nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
   }

   @InlineOnly
   private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
      return ComparisonsKt.nullsFirst(ComparisonsKt.naturalOrder());
   }

   @NotNull
   public static final <T> Comparator<T> nullsLast(@NotNull Comparator<? super T> comparator) {
      Intrinsics.checkNotNullParameter(comparator, "comparator");
      return ComparisonsKt__ComparisonsKt::nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
   }

   @InlineOnly
   private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
      return ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
   }

   @NotNull
   public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
      NaturalOrderComparator var10000 = NaturalOrderComparator.INSTANCE;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
      return (Comparator)var10000;
   }

   @NotNull
   public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
      ReverseOrderComparator var10000 = ReverseOrderComparator.INSTANCE;
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
      return (Comparator)var10000;
   }

   @NotNull
   public static final <T> Comparator<T> reversed(@NotNull Comparator<T> $this$reversed) {
      Intrinsics.checkNotNullParameter($this$reversed, "<this>");
      Comparator var10000;
      if ($this$reversed instanceof ReversedComparator) {
         var10000 = ((ReversedComparator)$this$reversed).getComparator();
      } else if (Intrinsics.areEqual((Object)$this$reversed, (Object)NaturalOrderComparator.INSTANCE)) {
         ReverseOrderComparator var2 = ReverseOrderComparator.INSTANCE;
         Intrinsics.checkNotNull(var2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
         var10000 = (Comparator)var2;
      } else if (Intrinsics.areEqual((Object)$this$reversed, (Object)ReverseOrderComparator.INSTANCE)) {
         NaturalOrderComparator var3 = NaturalOrderComparator.INSTANCE;
         Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
         var10000 = (Comparator)var3;
      } else {
         var10000 = (Comparator)(new ReversedComparator($this$reversed));
      }

      return var10000;
   }

   private static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(Function1[] $selectors, Object a, Object b) {
      return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, b, $selectors);
   }

   private static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator $this_then, Comparator $comparator, Object a, Object b) {
      int previousCompare = $this_then.compare(a, b);
      return previousCompare != 0 ? previousCompare : $comparator.compare(a, b);
   }

   private static final int thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(Comparator $this_thenDescending, Comparator $comparator, Object a, Object b) {
      int previousCompare = $this_thenDescending.compare(a, b);
      return previousCompare != 0 ? previousCompare : $comparator.compare(b, a);
   }

   private static final int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt(Comparator $comparator, Object a, Object b) {
      return a == b ? 0 : (a == null ? -1 : (b == null ? 1 : $comparator.compare(a, b)));
   }

   private static final int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt(Comparator $comparator, Object a, Object b) {
      return a == b ? 0 : (a == null ? 1 : (b == null ? -1 : $comparator.compare(a, b)));
   }

   public ComparisonsKt__ComparisonsKt() {
   }
}
