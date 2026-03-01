package su.catlean.api.event;

import su.catlean.gofra.Gofra;

public abstract class Event {
   private boolean cancelled;

   public final boolean getCancelled() {
      return this.cancelled;
   }

   public final void setCancelled(boolean <set-?>) {
      this.cancelled = var1;
   }

   public final void cancel() {
      this.cancelled = true;
   }

   public boolean call() {
      this.cancelled = false;
      Gofra.INSTANCE.drain(this);
      return this.cancelled;
   }
}
