package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {
   @NotNull
   private Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;
   @Nullable
   private Object value;
   @Nullable
   private Continuation<Object> cont;
   @NotNull
   private Object result;

   public DeepRecursiveScopeImpl(@NotNull Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T value) {
      Intrinsics.checkNotNullParameter(block, "block");
      super((DefaultConstructorMarker)null);
      this.function = block;
      this.value = value;
      Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      this.cont = (Continuation)this;
      this.result = DeepRecursiveKt.access$getUNDEFINED_RESULT$p();
   }

   @NotNull
   public CoroutineContext getContext() {
      return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
   }

   public void resumeWith(@NotNull Object result) {
      this.cont = null;
      this.result = result;
   }

   @Nullable
   public Object callRecursive(T value, @NotNull Continuation<? super R> $completion) {
      int var4 = false;
      Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
      this.cont = $completion;
      this.value = value;
      Object var10000 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
      if (var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended($completion);
      }

      return var10000;
   }

   @Nullable
   public <U, S> Object callRecursive(@NotNull DeepRecursiveFunction<U, S> $this$callRecursive, U value, @NotNull Continuation<? super S> $completion) {
      int var5 = false;
      Function3 var10000 = $this$callRecursive.getBlock$kotlin_stdlib();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
      Function3 function = var10000;
      DeepRecursiveScopeImpl $this$callRecursive_u24lambda_u242_u24lambda_u241 = (DeepRecursiveScopeImpl)this;
      int var8 = false;
      Function3 currentFunction = $this$callRecursive_u24lambda_u242_u24lambda_u241.function;
      if (function != currentFunction) {
         $this$callRecursive_u24lambda_u242_u24lambda_u241.function = function;
         Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
         $this$callRecursive_u24lambda_u242_u24lambda_u241.cont = $this$callRecursive_u24lambda_u242_u24lambda_u241.crossFunctionCompletion(currentFunction, $completion);
      } else {
         Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
         $this$callRecursive_u24lambda_u242_u24lambda_u241.cont = $completion;
      }

      $this$callRecursive_u24lambda_u242_u24lambda_u241.value = value;
      Object var10 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
      if (var10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended($completion);
      }

      return var10;
   }

   private final Continuation<Object> crossFunctionCompletion(Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> currentFunction, Continuation<Object> cont) {
      CoroutineContext var3 = (CoroutineContext)EmptyCoroutineContext.INSTANCE;
      return (Continuation)(new DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1(var3, this, currentFunction, cont));
   }

   public final R runCallLoop() {
      while(true) {
         Object result = this.result;
         Continuation var10000 = this.cont;
         if (var10000 == null) {
            ResultKt.throwOnFailure(result);
            return result;
         }

         Continuation cont = var10000;
         if (Result.equals-impl0(DeepRecursiveKt.access$getUNDEFINED_RESULT$p(), result)) {
            Result.Companion var10001;
            Object var7;
            try {
               Function3 var4 = this.function;
               Object var5 = this.value;
               var7 = !(var4 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(var4, this, var5, cont) : ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(var4, 3)).invoke(this, var5, cont);
            } catch (Throwable var6) {
               var10001 = Result.Companion;
               cont.resumeWith(Result.constructor-impl(ResultKt.createFailure(var6)));
               continue;
            }

            if (var7 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
               var10001 = Result.Companion;
               cont.resumeWith(Result.constructor-impl(var7));
            }
         } else {
            this.result = DeepRecursiveKt.access$getUNDEFINED_RESULT$p();
            cont.resumeWith(result);
         }
      }
   }

   // $FF: synthetic method
   public static final void access$setFunction$p(DeepRecursiveScopeImpl $this, Function3 <set-?>) {
      $this.function = var1;
   }

   // $FF: synthetic method
   public static final void access$setCont$p(DeepRecursiveScopeImpl $this, Continuation <set-?>) {
      $this.cont = var1;
   }

   // $FF: synthetic method
   public static final void access$setResult$p(DeepRecursiveScopeImpl $this, Object <set-?>) {
      $this.result = var1;
   }
}
