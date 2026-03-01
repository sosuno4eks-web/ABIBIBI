package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.6"
)
public enum DurationUnit {
   @NotNull
   private final TimeUnit timeUnit;
   NANOSECONDS(TimeUnit.NANOSECONDS),
   MICROSECONDS(TimeUnit.MICROSECONDS),
   MILLISECONDS(TimeUnit.MILLISECONDS),
   SECONDS(TimeUnit.SECONDS),
   MINUTES(TimeUnit.MINUTES),
   HOURS(TimeUnit.HOURS),
   DAYS(TimeUnit.DAYS);

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   private DurationUnit(TimeUnit timeUnit) {
      this.timeUnit = timeUnit;
   }

   @NotNull
   public final TimeUnit getTimeUnit$kotlin_stdlib() {
      return this.timeUnit;
   }

   @NotNull
   public static EnumEntries<DurationUnit> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final DurationUnit[] $values() {
      DurationUnit[] var0 = new DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
      return var0;
   }
}
