package su.catlean.api.event.events.player;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class ClickSlotEvent extends Event {
   @NotNull
   public static final ClickSlotEvent INSTANCE = new ClickSlotEvent();
   @NotNull
   private static class_1713 action;
   private static int id;
   private static int button;
   private static int syncId;

   private ClickSlotEvent() {
   }

   @NotNull
   public final class_1713 getAction() {
      return action;
   }

   public final void setAction(@NotNull class_1713 <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      action = var1;
   }

   public final int getId() {
      return id;
   }

   public final void setId(int <set-?>) {
      id = var1;
   }

   public final int getButton() {
      return button;
   }

   public final void setButton(int <set-?>) {
      button = var1;
   }

   public final int getSyncId() {
      return syncId;
   }

   public final void setSyncId(int <set-?>) {
      syncId = var1;
   }

   public final boolean call(@NotNull class_1713 action, int id, int button, int syncId) {
      Intrinsics.checkNotNullParameter(action, "action");
      this.setCancelled(false);
      ClickSlotEvent.action = action;
      ClickSlotEvent.id = id;
      ClickSlotEvent.button = button;
      ClickSlotEvent.syncId = syncId;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      action = class_1713.field_7790;
   }
}
