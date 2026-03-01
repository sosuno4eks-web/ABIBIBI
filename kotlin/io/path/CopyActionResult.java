package kotlin.io.path;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@ExperimentalPathApi
@SinceKotlin(
   version = "1.8"
)
public enum CopyActionResult {
   CONTINUE,
   SKIP_SUBTREE,
   TERMINATE;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<CopyActionResult> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final CopyActionResult[] $values() {
      CopyActionResult[] var0 = new CopyActionResult[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
      return var0;
   }
}
