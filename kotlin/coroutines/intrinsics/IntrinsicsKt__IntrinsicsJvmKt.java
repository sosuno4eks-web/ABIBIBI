package kotlin.coroutines.intrinsics;

import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class IntrinsicsKt__IntrinsicsJvmKt {
   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> Object startCoroutineUninterceptedOrReturn(Function1<? super Continuation<? super T>, ? extends Object> $this$startCoroutineUninterceptedOrReturn, Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$startCoroutineUninterceptedOrReturn, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      return !($this$startCoroutineUninterceptedOrReturn instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl($this$startCoroutineUninterceptedOrReturn, completion) : ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$startCoroutineUninterceptedOrReturn, 1)).invoke(completion);
   }

   @PublishedApi
   @Nullable
   public static final <T> Object wrapWithContinuationImpl(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$wrapWithContinuationImpl, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$wrapWithContinuationImpl, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation newCompletion = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion));
      return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$wrapWithContinuationImpl, 1)).invoke(newCompletion);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <R, T> Object startCoroutineUninterceptedOrReturn(Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$startCoroutineUninterceptedOrReturn, R receiver, Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$startCoroutineUninterceptedOrReturn, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      return !($this$startCoroutineUninterceptedOrReturn instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl($this$startCoroutineUninterceptedOrReturn, receiver, completion) : ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$startCoroutineUninterceptedOrReturn, 2)).invoke(receiver, completion);
   }

   @PublishedApi
   @Nullable
   public static final <R, T> Object wrapWithContinuationImpl(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$wrapWithContinuationImpl, R receiver, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$wrapWithContinuationImpl, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation newCompletion = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion));
      return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$wrapWithContinuationImpl, 2)).invoke(receiver, newCompletion);
   }

   @InlineOnly
   private static final <R, P, T> Object startCoroutineUninterceptedOrReturn(Function3<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> $this$startCoroutineUninterceptedOrReturn, R receiver, P param, Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$startCoroutineUninterceptedOrReturn, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      return !($this$startCoroutineUninterceptedOrReturn instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl($this$startCoroutineUninterceptedOrReturn, receiver, param, completion) : ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$startCoroutineUninterceptedOrReturn, 3)).invoke(receiver, param, completion);
   }

   @PublishedApi
   @Nullable
   public static final <R, P, T> Object wrapWithContinuationImpl(@NotNull Function3<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> $this$wrapWithContinuationImpl, R receiver, P param, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$wrapWithContinuationImpl, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation newCompletion = createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion));
      return ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity($this$wrapWithContinuationImpl, 3)).invoke(receiver, param, newCompletion);
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Continuation<Unit> createCoroutineUnintercepted(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$createCoroutineUnintercepted, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$createCoroutineUnintercepted, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation probeCompletion = DebugProbesKt.probeCoroutineCreated(completion);
      Continuation var10000;
      if ($this$createCoroutineUnintercepted instanceof BaseContinuationImpl) {
         var10000 = ((BaseContinuationImpl)$this$createCoroutineUnintercepted).create(probeCompletion);
      } else {
         int $i$f$createCoroutineFromSuspendFunction = false;
         CoroutineContext context$iv = probeCompletion.getContext();
         var10000 = context$iv == EmptyCoroutineContext.INSTANCE ? (Continuation)(new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(probeCompletion, $this$createCoroutineUnintercepted)) : (Continuation)(new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(probeCompletion, context$iv, $this$createCoroutineUnintercepted));
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <R, T> Continuation<Unit> createCoroutineUnintercepted(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$createCoroutineUnintercepted, R receiver, @NotNull Continuation<? super T> completion) {
      Intrinsics.checkNotNullParameter($this$createCoroutineUnintercepted, "<this>");
      Intrinsics.checkNotNullParameter(completion, "completion");
      Continuation probeCompletion = DebugProbesKt.probeCoroutineCreated(completion);
      Continuation var10000;
      if ($this$createCoroutineUnintercepted instanceof BaseContinuationImpl) {
         var10000 = ((BaseContinuationImpl)$this$createCoroutineUnintercepted).create(receiver, probeCompletion);
      } else {
         int $i$f$createCoroutineFromSuspendFunction = false;
         CoroutineContext context$iv = probeCompletion.getContext();
         var10000 = context$iv == EmptyCoroutineContext.INSTANCE ? (Continuation)(new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(probeCompletion, $this$createCoroutineUnintercepted, receiver)) : (Continuation)(new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(probeCompletion, context$iv, $this$createCoroutineUnintercepted, receiver));
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Continuation<T> intercepted(@NotNull Continuation<? super T> $this$intercepted) {
      Intrinsics.checkNotNullParameter($this$intercepted, "<this>");
      ContinuationImpl var10000 = $this$intercepted instanceof ContinuationImpl ? (ContinuationImpl)$this$intercepted : null;
      Continuation var1;
      if (($this$intercepted instanceof ContinuationImpl ? (ContinuationImpl)$this$intercepted : null) != null) {
         var1 = var10000.intercepted();
         if (var1 != null) {
            return var1;
         }
      }

      var1 = $this$intercepted;
      return var1;
   }

   @SinceKotlin(
      version = "1.3"
   )
   private static final <T> Continuation<Unit> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(Continuation<? super T> completion, Function1<? super Continuation<? super T>, ? extends Object> block) {
      int $i$f$createCoroutineFromSuspendFunction = false;
      CoroutineContext context = completion.getContext();
      return context == EmptyCoroutineContext.INSTANCE ? (Continuation)(new RestrictedContinuationImpl(completion) {
         private int label;

         public {
            Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
         }

         protected Object invokeSuspend(Object result) {
            Object var10000;
            switch(this.label) {
            case 0:
               this.label = 1;
               ResultKt.throwOnFailure(result);
               var10000 = block.invoke(this);
               break;
            case 1:
               this.label = 2;
               ResultKt.throwOnFailure(result);
               var10000 = result;
               break;
            default:
               throw new IllegalStateException("This coroutine had already completed".toString());
            }

            return var10000;
         }
      }) : (Continuation)(new ContinuationImpl(completion, context) {
         private int label;

         public {
            Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
         }

         protected Object invokeSuspend(Object result) {
            Object var10000;
            switch(this.label) {
            case 0:
               this.label = 1;
               ResultKt.throwOnFailure(result);
               var10000 = block.invoke(this);
               break;
            case 1:
               this.label = 2;
               ResultKt.throwOnFailure(result);
               var10000 = result;
               break;
            default:
               throw new IllegalStateException("This coroutine had already completed".toString());
            }

            return var10000;
         }
      });
   }

   private static final <T> Continuation<T> createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(Continuation<? super T> completion) {
      CoroutineContext context = completion.getContext();
      return context == EmptyCoroutineContext.INSTANCE ? (Continuation)(new RestrictedContinuationImpl(completion) {
         {
            Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
         }

         protected Object invokeSuspend(Object result) {
            ResultKt.throwOnFailure(result);
            return result;
         }
      }) : (Continuation)(new ContinuationImpl(completion, context) {
         {
            Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
         }

         protected Object invokeSuspend(Object result) {
            ResultKt.throwOnFailure(result);
            return result;
         }
      });
   }

   public IntrinsicsKt__IntrinsicsJvmKt() {
   }
}
