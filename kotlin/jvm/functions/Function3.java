package kotlin.jvm.functions;

import kotlin.Function;

public interface Function3<P1, P2, P3, R> extends Function<R> {
   R invoke(P1 var1, P2 var2, P3 var3);
}
