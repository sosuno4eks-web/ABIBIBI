package kotlin.coroutines.intrinsics;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.3"
)
@PublishedApi
public enum CoroutineSingletons {
   COROUTINE_SUSPENDED,
   UNDECIDED,
   RESUMED;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<CoroutineSingletons> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final CoroutineSingletons[] $values() {
      CoroutineSingletons[] var0 = new CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
      return var0;
   }
}
