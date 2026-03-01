package kotlin.contracts;

import kotlin.Function;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ContractsDsl
@ExperimentalContracts
@SinceKotlin(
   version = "1.3"
)
public interface ContractBuilder {
   @ContractsDsl
   @NotNull
   Returns returns();

   @ContractsDsl
   @NotNull
   Returns returns(@Nullable Object var1);

   @ContractsDsl
   @NotNull
   ReturnsNotNull returnsNotNull();

   @ContractsDsl
   @NotNull
   <R> CallsInPlace callsInPlace(@NotNull Function<? extends R> var1, @NotNull InvocationKind var2);

   public static final class DefaultImpls {
      // $FF: synthetic method
      public static CallsInPlace callsInPlace$default(ContractBuilder var0, Function var1, InvocationKind var2, int var3, Object var4) {
         if (var4 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
         } else {
            if ((var3 & 2) != 0) {
               var2 = InvocationKind.UNKNOWN;
            }

            return var0.callsInPlace(var1, var2);
         }
      }
   }
}
