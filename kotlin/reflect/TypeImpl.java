package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalStdlibApi
interface TypeImpl extends Type {
   @NotNull
   String getTypeName();
}
