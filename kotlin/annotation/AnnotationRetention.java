package kotlin.annotation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum AnnotationRetention {
   SOURCE,
   BINARY,
   RUNTIME;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<AnnotationRetention> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final AnnotationRetention[] $values() {
      AnnotationRetention[] var0 = new AnnotationRetention[]{SOURCE, BINARY, RUNTIME};
      return var0;
   }
}
