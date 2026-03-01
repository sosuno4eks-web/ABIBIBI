package kotlin.text;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public enum RegexOption implements FlagEnum {
   private final int value;
   private final int mask;
   IGNORE_CASE(2, 0, 2, (DefaultConstructorMarker)null),
   MULTILINE(8, 0, 2, (DefaultConstructorMarker)null),
   LITERAL(16, 0, 2, (DefaultConstructorMarker)null),
   UNIX_LINES(1, 0, 2, (DefaultConstructorMarker)null),
   COMMENTS(4, 0, 2, (DefaultConstructorMarker)null),
   DOT_MATCHES_ALL(32, 0, 2, (DefaultConstructorMarker)null),
   CANON_EQ(128, 0, 2, (DefaultConstructorMarker)null);

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   private RegexOption(int value, int mask) {
      this.value = value;
      this.mask = mask;
   }

   // $FF: synthetic method
   RegexOption(int var3, int var4, int var5, DefaultConstructorMarker var6) {
      if ((var5 & 2) != 0) {
         var4 = var3;
      }

      this(var3, var4);
   }

   public int getValue() {
      return this.value;
   }

   public int getMask() {
      return this.mask;
   }

   @NotNull
   public static EnumEntries<RegexOption> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final RegexOption[] $values() {
      RegexOption[] var0 = new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
      return var0;
   }
}
