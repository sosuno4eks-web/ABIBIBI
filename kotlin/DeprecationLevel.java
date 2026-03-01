package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum DeprecationLevel {
   WARNING,
   ERROR,
   HIDDEN;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<DeprecationLevel> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final DeprecationLevel[] $values() {
      DeprecationLevel[] var0 = new DeprecationLevel[]{WARNING, ERROR, HIDDEN};
      return var0;
   }
}
