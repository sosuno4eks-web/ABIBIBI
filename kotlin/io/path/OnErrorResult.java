package kotlin.io.path;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@ExperimentalPathApi
@SinceKotlin(
   version = "1.8"
)
public enum OnErrorResult {
   SKIP_SUBTREE,
   TERMINATE;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<OnErrorResult> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final OnErrorResult[] $values() {
      OnErrorResult[] var0 = new OnErrorResult[]{SKIP_SUBTREE, TERMINATE};
      return var0;
   }
}
