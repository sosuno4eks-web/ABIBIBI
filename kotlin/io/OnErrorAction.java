package kotlin.io;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum OnErrorAction {
   SKIP,
   TERMINATE;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<OnErrorAction> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final OnErrorAction[] $values() {
      OnErrorAction[] var0 = new OnErrorAction[]{SKIP, TERMINATE};
      return var0;
   }
}
