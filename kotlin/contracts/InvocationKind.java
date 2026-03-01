package kotlin.contracts;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;

@ContractsDsl
@ExperimentalContracts
@SinceKotlin(
   version = "1.3"
)
public enum InvocationKind {
   @ContractsDsl
   AT_MOST_ONCE,
   @ContractsDsl
   AT_LEAST_ONCE,
   @ContractsDsl
   EXACTLY_ONCE,
   @ContractsDsl
   UNKNOWN;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<InvocationKind> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final InvocationKind[] $values() {
      InvocationKind[] var0 = new InvocationKind[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
      return var0;
   }
}
