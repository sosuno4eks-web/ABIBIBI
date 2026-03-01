package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "TimersKt"
)
public final class TimersKt {
   @InlineOnly
   private static final TimerTask schedule(Timer $this$schedule, long delay, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter($this$schedule, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      TimerTask task = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      $this$schedule.schedule(task, delay);
      return task;
   }

   @InlineOnly
   private static final TimerTask schedule(Timer $this$schedule, Date time, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter($this$schedule, "<this>");
      Intrinsics.checkNotNullParameter(time, "time");
      Intrinsics.checkNotNullParameter(action, "action");
      TimerTask task = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      $this$schedule.schedule(task, time);
      return task;
   }

   @InlineOnly
   private static final TimerTask schedule(Timer $this$schedule, long delay, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter($this$schedule, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      TimerTask task = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      $this$schedule.schedule(task, delay, period);
      return task;
   }

   @InlineOnly
   private static final TimerTask schedule(Timer $this$schedule, Date time, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter($this$schedule, "<this>");
      Intrinsics.checkNotNullParameter(time, "time");
      Intrinsics.checkNotNullParameter(action, "action");
      TimerTask task = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      $this$schedule.schedule(task, time, period);
      return task;
   }

   @InlineOnly
   private static final TimerTask scheduleAtFixedRate(Timer $this$scheduleAtFixedRate, long delay, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter($this$scheduleAtFixedRate, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      TimerTask task = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      $this$scheduleAtFixedRate.scheduleAtFixedRate(task, delay, period);
      return task;
   }

   @InlineOnly
   private static final TimerTask scheduleAtFixedRate(Timer $this$scheduleAtFixedRate, Date time, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter($this$scheduleAtFixedRate, "<this>");
      Intrinsics.checkNotNullParameter(time, "time");
      Intrinsics.checkNotNullParameter(action, "action");
      TimerTask task = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      $this$scheduleAtFixedRate.scheduleAtFixedRate(task, time, period);
      return task;
   }

   @PublishedApi
   @NotNull
   public static final Timer timer(@Nullable String name, boolean daemon) {
      return name == null ? new Timer(daemon) : new Timer(name, daemon);
   }

   @InlineOnly
   private static final Timer timer(String name, boolean daemon, long initialDelay, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var9 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.schedule(var9, initialDelay, period);
      return timer;
   }

   // $FF: synthetic method
   static Timer timer$default(String name, boolean daemon, long initialDelay, long period, Function1 action, int var7, Object var8) {
      if ((var7 & 1) != 0) {
         name = null;
      }

      if ((var7 & 2) != 0) {
         daemon = false;
      }

      if ((var7 & 4) != 0) {
         initialDelay = 0L;
      }

      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var9 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.schedule(var9, initialDelay, period);
      return timer;
   }

   @InlineOnly
   private static final Timer timer(String name, boolean daemon, Date startAt, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter(startAt, "startAt");
      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var8 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.schedule(var8, startAt, period);
      return timer;
   }

   // $FF: synthetic method
   static Timer timer$default(String name, boolean daemon, Date startAt, long period, Function1 action, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         name = null;
      }

      if ((var6 & 2) != 0) {
         daemon = false;
      }

      Intrinsics.checkNotNullParameter(startAt, "startAt");
      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var8 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.schedule(var8, startAt, period);
      return timer;
   }

   @InlineOnly
   private static final Timer fixedRateTimer(String name, boolean daemon, long initialDelay, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var9 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.scheduleAtFixedRate(var9, initialDelay, period);
      return timer;
   }

   // $FF: synthetic method
   static Timer fixedRateTimer$default(String name, boolean daemon, long initialDelay, long period, Function1 action, int var7, Object var8) {
      if ((var7 & 1) != 0) {
         name = null;
      }

      if ((var7 & 2) != 0) {
         daemon = false;
      }

      if ((var7 & 4) != 0) {
         initialDelay = 0L;
      }

      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var9 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.scheduleAtFixedRate(var9, initialDelay, period);
      return timer;
   }

   @InlineOnly
   private static final Timer fixedRateTimer(String name, boolean daemon, Date startAt, long period, Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter(startAt, "startAt");
      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var8 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.scheduleAtFixedRate(var8, startAt, period);
      return timer;
   }

   // $FF: synthetic method
   static Timer fixedRateTimer$default(String name, boolean daemon, Date startAt, long period, Function1 action, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         name = null;
      }

      if ((var6 & 2) != 0) {
         daemon = false;
      }

      Intrinsics.checkNotNullParameter(startAt, "startAt");
      Intrinsics.checkNotNullParameter(action, "action");
      Timer timer = timer(name, daemon);
      TimerTask var8 = (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
      timer.scheduleAtFixedRate(var8, startAt, period);
      return timer;
   }

   @InlineOnly
   private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      return (TimerTask)(new TimerTask(action) {
         // $FF: synthetic field
         final Function1<TimerTask, Unit> $action;

         public {
            this.$action = $action;
         }

         public void run() {
            this.$action.invoke(this);
         }
      });
   }
}
