package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalTime.class}
)
public final class TimedValue<T> {
   private final T value;
   private final long duration;

   private TimedValue(T value, long duration) {
      this.value = value;
      this.duration = duration;
   }

   public final T getValue() {
      return this.value;
   }

   public final long getDuration_UwyO8pc/* $FF was: getDuration-UwyO8pc*/() {
      return this.duration;
   }

   public final T component1() {
      return this.value;
   }

   public final long component2_UwyO8pc/* $FF was: component2-UwyO8pc*/() {
      return this.duration;
   }

   @NotNull
   public final TimedValue<T> copy_RFiDyg4/* $FF was: copy-RFiDyg4*/(T value, long duration) {
      return new TimedValue(value, duration, (DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public static TimedValue copy_RFiDyg4$default/* $FF was: copy-RFiDyg4$default*/(TimedValue var0, Object var1, long var2, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.value;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.duration;
      }

      return var0.copy-RFiDyg4(var1, var2);
   }

   @NotNull
   public String toString() {
      return "TimedValue(value=" + this.value + ", duration=" + Duration.toString-impl(this.duration) + ')';
   }

   public int hashCode() {
      int result = this.value == null ? 0 : this.value.hashCode();
      result = result * 31 + Duration.hashCode-impl(this.duration);
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof TimedValue)) {
         return false;
      } else {
         TimedValue var2 = (TimedValue)other;
         if (!Intrinsics.areEqual(this.value, var2.value)) {
            return false;
         } else {
            return Duration.equals-impl0(this.duration, var2.duration);
         }
      }
   }

   // $FF: synthetic method
   public TimedValue(Object value, long duration, DefaultConstructorMarker $constructor_marker) {
      this(value, duration);
   }
}
