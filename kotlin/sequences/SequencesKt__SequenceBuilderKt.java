package kotlin.sequences;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class SequencesKt__SequenceBuilderKt {
   private static final int State_NotReady = 0;
   private static final int State_ManyNotReady = 1;
   private static final int State_ManyReady = 2;
   private static final int State_Ready = 3;
   private static final int State_Done = 4;
   private static final int State_Failed = 5;

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Sequence<T> sequence(@BuilderInference @NotNull Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      return (Sequence)(new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(block));
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Iterator<T> iterator(@BuilderInference @NotNull Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      SequenceBuilderIterator iterator = new SequenceBuilderIterator();
      iterator.setNextStep(IntrinsicsKt.createCoroutineUnintercepted(block, iterator, (Continuation)iterator));
      return (Iterator)iterator;
   }

   public SequencesKt__SequenceBuilderKt() {
   }
}
