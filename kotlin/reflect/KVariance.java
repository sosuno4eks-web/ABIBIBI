package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.1"
)
public enum KVariance {
   INVARIANT,
   IN,
   OUT;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<KVariance> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final KVariance[] $values() {
      KVariance[] var0 = new KVariance[]{INVARIANT, IN, OUT};
      return var0;
   }
}
