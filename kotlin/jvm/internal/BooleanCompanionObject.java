package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.3"
)
public final class BooleanCompanionObject {
   @NotNull
   public static final BooleanCompanionObject INSTANCE = new BooleanCompanionObject();

   private BooleanCompanionObject() {
   }
}
