package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalTime.class}
)
public final class TestTimeSource extends AbstractLongTimeSource {
   private long reading;

   public TestTimeSource() {
      super(DurationUnit.NANOSECONDS);
      this.markNow();
   }

   protected long read() {
      return this.reading;
   }

   public final void plusAssign_LRDsOJo/* $FF was: plusAssign-LRDsOJo*/(long duration) {
      long longDelta = Duration.toLong-impl(duration, this.getUnit());
      int $i$f$isSaturated = false;
      long half;
      if ((longDelta - 1L | 1L) != Long.MAX_VALUE) {
         half = this.reading + longDelta;
         if ((this.reading ^ longDelta) >= 0L && (this.reading ^ half) < 0L) {
            this.overflow-LRDsOJo(duration);
         }

         this.reading = half;
      } else {
         half = Duration.div-UwyO8pc(duration, 2);
         long readingBefore = Duration.toLong-impl(half, this.getUnit());
         int $i$f$isSaturated = false;
         if ((readingBefore - 1L | 1L) != Long.MAX_VALUE) {
            readingBefore = this.reading;

            try {
               this.plusAssign-LRDsOJo(half);
               this.plusAssign-LRDsOJo(Duration.minus-LRDsOJo(duration, half));
            } catch (IllegalStateException var10) {
               this.reading = readingBefore;
               throw var10;
            }
         } else {
            this.overflow-LRDsOJo(duration);
         }
      }

   }

   private final void overflow_LRDsOJo/* $FF was: overflow-LRDsOJo*/(long duration) {
      throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(this.getUnit()) + " is advanced by " + Duration.toString-impl(duration) + '.');
   }
}
