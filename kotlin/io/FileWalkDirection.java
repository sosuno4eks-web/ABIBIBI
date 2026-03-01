package kotlin.io;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum FileWalkDirection {
   TOP_DOWN,
   BOTTOM_UP;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<FileWalkDirection> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final FileWalkDirection[] $values() {
      FileWalkDirection[] var0 = new FileWalkDirection[]{TOP_DOWN, BOTTOM_UP};
      return var0;
   }
}
