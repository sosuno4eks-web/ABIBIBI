package kotlin.internal;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.2"
)
public enum RequireKotlinVersionKind {
   LANGUAGE_VERSION,
   COMPILER_VERSION,
   API_VERSION;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<RequireKotlinVersionKind> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final RequireKotlinVersionKind[] $values() {
      RequireKotlinVersionKind[] var0 = new RequireKotlinVersionKind[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
      return var0;
   }
}
