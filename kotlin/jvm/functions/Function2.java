package kotlin.jvm.functions;

import kotlin.Function;

public interface Function2<P1, P2, R> extends Function<R> {
   R invoke(P1 var1, P2 var2);
}
