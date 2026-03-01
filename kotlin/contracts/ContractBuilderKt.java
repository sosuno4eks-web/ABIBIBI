package kotlin.contracts;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.ContractsDsl;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ContractBuilderKt {
   @ContractsDsl
   @ExperimentalContracts
   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final void contract(Function1<? super ContractBuilder, Unit> builder) {
      Intrinsics.checkNotNullParameter(builder, "builder");
   }
}
