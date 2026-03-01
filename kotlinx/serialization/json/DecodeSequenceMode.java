package kotlinx.serialization.json;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
public enum DecodeSequenceMode {
   WHITESPACE_SEPARATED,
   ARRAY_WRAPPED,
   AUTO_DETECT;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<DecodeSequenceMode> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final DecodeSequenceMode[] $values() {
      DecodeSequenceMode[] var0 = new DecodeSequenceMode[]{WHITESPACE_SEPARATED, ARRAY_WRAPPED, AUTO_DETECT};
      return var0;
   }
}
