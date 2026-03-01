package kotlinx.serialization.json;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ClassDiscriminatorMode {
   NONE,
   ALL_JSON_OBJECTS,
   POLYMORPHIC;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<ClassDiscriminatorMode> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final ClassDiscriminatorMode[] $values() {
      ClassDiscriminatorMode[] var0 = new ClassDiscriminatorMode[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
      return var0;
   }
}
