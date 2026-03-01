package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public abstract class Lambda<R> implements FunctionBase<R>, Serializable {
   private final int arity;

   public Lambda(int arity) {
      this.arity = arity;
   }

   public int getArity() {
      return this.arity;
   }

   @NotNull
   public String toString() {
      String var10000 = Reflection.renderLambdaToString(this);
      Intrinsics.checkNotNullExpressionValue(var10000, "renderLambdaToString(...)");
      return var10000;
   }
}
