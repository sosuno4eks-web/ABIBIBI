package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.1"
)
public enum KVisibility {
   PUBLIC,
   PROTECTED,
   INTERNAL,
   PRIVATE;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<KVisibility> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final KVisibility[] $values() {
      KVisibility[] var0 = new KVisibility[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
      return var0;
   }
}
