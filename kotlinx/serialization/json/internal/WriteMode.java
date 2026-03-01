package kotlinx.serialization.json.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public enum WriteMode {
   @JvmField
   public final char begin;
   @JvmField
   public final char end;
   OBJ('{', '}'),
   LIST('[', ']'),
   MAP('{', '}'),
   POLY_OBJ('[', ']');

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   private WriteMode(char begin, char end) {
      this.begin = begin;
      this.end = end;
   }

   @NotNull
   public static EnumEntries<WriteMode> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final WriteMode[] $values() {
      WriteMode[] var0 = new WriteMode[]{OBJ, LIST, MAP, POLY_OBJ};
      return var0;
   }
}
