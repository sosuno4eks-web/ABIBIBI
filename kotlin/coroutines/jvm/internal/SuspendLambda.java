package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public abstract class SuspendLambda extends ContinuationImpl implements FunctionBase<Object>, SuspendFunction {
   private final int arity;

   public SuspendLambda(int arity, @Nullable Continuation<Object> completion) {
      super(completion);
      this.arity = arity;
   }

   public int getArity() {
      return this.arity;
   }

   public SuspendLambda(int arity) {
      this(arity, (Continuation)null);
   }

   @NotNull
   public String toString() {
      String var10000;
      if (this.getCompletion() == null) {
         var10000 = Reflection.renderLambdaToString((FunctionBase)this);
         Intrinsics.checkNotNullExpressionValue(var10000, "renderLambdaToString(...)");
      } else {
         var10000 = super.toString();
      }

      return var10000;
   }
}
