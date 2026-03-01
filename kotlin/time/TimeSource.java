package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalTime.class}
)
public interface TimeSource {
   @NotNull
   TimeSource.Companion Companion = TimeSource.Companion.$$INSTANCE;

   @NotNull
   TimeMark markNow();

   public static final class Companion {
      // $FF: synthetic field
      static final TimeSource.Companion $$INSTANCE = new TimeSource.Companion();

      private Companion() {
      }
   }

   public static final class Monotonic implements TimeSource.WithComparableMarks {
      @NotNull
      public static final TimeSource.Monotonic INSTANCE = new TimeSource.Monotonic();

      private Monotonic() {
      }

      public long markNow_z9LOYto/* $FF was: markNow-z9LOYto*/() {
         return MonotonicTimeSource.INSTANCE.markNow-z9LOYto();
      }

      @NotNull
      public String toString() {
         return MonotonicTimeSource.INSTANCE.toString();
      }

      @JvmInline
      @SinceKotlin(
         version = "1.9"
      )
      @WasExperimental(
         markerClass = {ExperimentalTime.class}
      )
      public static final class ValueTimeMark implements ComparableTimeMark {
         private final long reading;

         public static long elapsedNow_UwyO8pc/* $FF was: elapsedNow-UwyO8pc*/(long arg0) {
            return MonotonicTimeSource.INSTANCE.elapsedFrom-6eNON_k(arg0);
         }

         public long elapsedNow_UwyO8pc/* $FF was: elapsedNow-UwyO8pc*/() {
            return elapsedNow-UwyO8pc(this.reading);
         }

         public static long plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long arg0, long duration) {
            return MonotonicTimeSource.INSTANCE.adjustReading-6QKq23U(arg0, duration);
         }

         public long plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long duration) {
            return plus-LRDsOJo(this.reading, duration);
         }

         public static long minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long arg0, long duration) {
            return MonotonicTimeSource.INSTANCE.adjustReading-6QKq23U(arg0, Duration.unaryMinus-UwyO8pc(duration));
         }

         public long minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long duration) {
            return minus-LRDsOJo(this.reading, duration);
         }

         public static boolean hasPassedNow_impl/* $FF was: hasPassedNow-impl*/(long arg0) {
            return !Duration.isNegative-impl(elapsedNow-UwyO8pc(arg0));
         }

         public boolean hasPassedNow() {
            return hasPassedNow-impl(this.reading);
         }

         public static boolean hasNotPassedNow_impl/* $FF was: hasNotPassedNow-impl*/(long arg0) {
            return Duration.isNegative-impl(elapsedNow-UwyO8pc(arg0));
         }

         public boolean hasNotPassedNow() {
            return hasNotPassedNow-impl(this.reading);
         }

         public static long minus_UwyO8pc/* $FF was: minus-UwyO8pc*/(long arg0, @NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof TimeSource.Monotonic.ValueTimeMark)) {
               throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + toString-impl(arg0) + " and " + other);
            } else {
               return minus-6eNON_k(arg0, ((TimeSource.Monotonic.ValueTimeMark)other).unbox-impl());
            }
         }

         public long minus_UwyO8pc/* $FF was: minus-UwyO8pc*/(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return minus-UwyO8pc(this.reading, other);
         }

         public static final long minus_6eNON_k/* $FF was: minus-6eNON_k*/(long arg0, long other) {
            return MonotonicTimeSource.INSTANCE.differenceBetween-fRLX17w(arg0, other);
         }

         public static final int compareTo_6eNON_k/* $FF was: compareTo-6eNON_k*/(long arg0, long other) {
            return Duration.compareTo-LRDsOJo(minus-6eNON_k(arg0, other), Duration.Companion.getZERO-UwyO8pc());
         }

         public static String toString_impl/* $FF was: toString-impl*/(long arg0) {
            return "ValueTimeMark(reading=" + arg0 + ')';
         }

         public String toString() {
            return toString-impl(this.reading);
         }

         public static int hashCode_impl/* $FF was: hashCode-impl*/(long arg0) {
            return Long.hashCode(arg0);
         }

         public int hashCode() {
            return hashCode-impl(this.reading);
         }

         public static boolean equals_impl/* $FF was: equals-impl*/(long arg0, Object other) {
            if (!(other instanceof TimeSource.Monotonic.ValueTimeMark)) {
               return false;
            } else {
               long var3 = ((TimeSource.Monotonic.ValueTimeMark)other).unbox-impl();
               return arg0 == var3;
            }
         }

         public boolean equals(Object other) {
            return equals-impl(this.reading, other);
         }

         public static int compareTo_impl/* $FF was: compareTo-impl*/(long arg0, @NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return box-impl(arg0).compareTo(other);
         }

         public int compareTo(@NotNull ComparableTimeMark other) {
            return ComparableTimeMark.DefaultImpls.compareTo((ComparableTimeMark)this, other);
         }

         // $FF: synthetic method
         private ValueTimeMark(long reading) {
            this.reading = reading;
         }

         public static long constructor_impl/* $FF was: constructor-impl*/(long reading) {
            return reading;
         }

         // $FF: synthetic method
         public static final TimeSource.Monotonic.ValueTimeMark box_impl/* $FF was: box-impl*/(long v) {
            return new TimeSource.Monotonic.ValueTimeMark(v);
         }

         // $FF: synthetic method
         public final long unbox_impl/* $FF was: unbox-impl*/() {
            return this.reading;
         }

         public static final boolean equals_impl0/* $FF was: equals-impl0*/(long p1, long p2) {
            return p1 == p2;
         }
      }
   }

   @SinceKotlin(
      version = "1.9"
   )
   @WasExperimental(
      markerClass = {ExperimentalTime.class}
   )
   public interface WithComparableMarks extends TimeSource {
      @NotNull
      ComparableTimeMark markNow();
   }
}
