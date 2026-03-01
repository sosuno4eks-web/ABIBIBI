package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum LazyThreadSafetyMode {
   SYNCHRONIZED,
   PUBLICATION,
   NONE;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<LazyThreadSafetyMode> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final LazyThreadSafetyMode[] $values() {
      LazyThreadSafetyMode[] var0 = new LazyThreadSafetyMode[]{SYNCHRONIZED, PUBLICATION, NONE};
      return var0;
   }
}
