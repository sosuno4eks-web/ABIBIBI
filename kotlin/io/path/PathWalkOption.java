package kotlin.io.path;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@WasExperimental(
   markerClass = {ExperimentalPathApi.class}
)
@SinceKotlin(
   version = "2.1"
)
public enum PathWalkOption {
   INCLUDE_DIRECTORIES,
   BREADTH_FIRST,
   FOLLOW_LINKS;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<PathWalkOption> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final PathWalkOption[] $values() {
      PathWalkOption[] var0 = new PathWalkOption[]{INCLUDE_DIRECTORIES, BREADTH_FIRST, FOLLOW_LINKS};
      return var0;
   }
}
