package kotlin.contracts;

import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;

@ContractsDsl
@ExperimentalContracts
@SinceKotlin(
   version = "1.3"
)
public interface SimpleEffect extends Effect {
   @ContractsDsl
   @ExperimentalContracts
   @NotNull
   ConditionalEffect implies(boolean var1);
}
