package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class AdjustedTimeMark implements TimeMark {
   @NotNull
   private final TimeMark mark;
   private final long adjustment;

   private AdjustedTimeMark(TimeMark mark, long adjustment) {
      Intrinsics.checkNotNullParameter(mark, "mark");
      super();
      this.mark = mark;
      this.adjustment = adjustment;
   }

   @NotNull
   public final TimeMark getMark() {
      return this.mark;
   }

   public final long getAdjustment_UwyO8pc/* $FF was: getAdjustment-UwyO8pc*/() {
      return this.adjustment;
   }

   public long elapsedNow_UwyO8pc/* $FF was: elapsedNow-UwyO8pc*/() {
      return Duration.minus-LRDsOJo(this.mark.elapsedNow-UwyO8pc(), this.adjustment);
   }

   @NotNull
   public TimeMark plus_LRDsOJo/* $FF was: plus-LRDsOJo*/(long duration) {
      return (TimeMark)(new AdjustedTimeMark(this.mark, Duration.plus-LRDsOJo(this.adjustment, duration), (DefaultConstructorMarker)null));
   }

   @NotNull
   public TimeMark minus_LRDsOJo/* $FF was: minus-LRDsOJo*/(long duration) {
      return TimeMark.DefaultImpls.minus-LRDsOJo(this, duration);
   }

   public boolean hasPassedNow() {
      return TimeMark.DefaultImpls.hasPassedNow(this);
   }

   public boolean hasNotPassedNow() {
      return TimeMark.DefaultImpls.hasNotPassedNow(this);
   }

   // $FF: synthetic method
   public AdjustedTimeMark(TimeMark mark, long adjustment, DefaultConstructorMarker $constructor_marker) {
      this(mark, adjustment);
   }
}
