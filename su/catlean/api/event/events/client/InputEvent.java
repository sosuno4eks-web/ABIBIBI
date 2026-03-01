package su.catlean.api.event.events.client;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class InputEvent extends Event {
   @NotNull
   public static final InputEvent INSTANCE = new InputEvent();
   public static InputEvent.Action action;
   public static InputEvent.Device device;
   private static int key = -1;

   private InputEvent() {
   }

   @NotNull
   public final InputEvent.Action getAction() {
      InputEvent.Action var10000 = action;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("action");
         return null;
      }
   }

   public final void setAction(@NotNull InputEvent.Action <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      action = var1;
   }

   @NotNull
   public final InputEvent.Device getDevice() {
      InputEvent.Device var10000 = device;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("device");
         return null;
      }
   }

   public final void setDevice(@NotNull InputEvent.Device <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      device = var1;
   }

   public final int getKey() {
      return key;
   }

   public final void setKey(int <set-?>) {
      key = var1;
   }

   public final boolean call(int key, @NotNull InputEvent.Device device, @NotNull InputEvent.Action action) {
      Intrinsics.checkNotNullParameter(device, "device");
      Intrinsics.checkNotNullParameter(action, "action");
      this.setCancelled(false);
      this.setDevice(device);
      this.setAction(action);
      InputEvent.key = key;
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   public static enum Action {
      Press,
      Release,
      Hold;

      // $FF: synthetic field
      private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

      @NotNull
      public static EnumEntries<InputEvent.Action> getEntries() {
         return $ENTRIES;
      }

      // $FF: synthetic method
      private static final InputEvent.Action[] $values() {
         InputEvent.Action[] var0 = new InputEvent.Action[]{Press, Release, Hold};
         return var0;
      }
   }

   public static enum Device {
      Mouse,
      Keyboard;

      // $FF: synthetic field
      private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

      @NotNull
      public static EnumEntries<InputEvent.Device> getEntries() {
         return $ENTRIES;
      }

      // $FF: synthetic method
      private static final InputEvent.Device[] $values() {
         InputEvent.Device[] var0 = new InputEvent.Device[]{Mouse, Keyboard};
         return var0;
      }
   }
}
