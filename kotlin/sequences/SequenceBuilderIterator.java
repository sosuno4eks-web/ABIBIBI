package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {
   private int state;
   @Nullable
   private T nextValue;
   @Nullable
   private Iterator<? extends T> nextIterator;
   @Nullable
   private Continuation<? super Unit> nextStep;

   public SequenceBuilderIterator() {
   }

   @Nullable
   public final Continuation<Unit> getNextStep() {
      return this.nextStep;
   }

   public final void setNextStep(@Nullable Continuation<? super Unit> <set-?>) {
      this.nextStep = var1;
   }

   public boolean hasNext() {
      while(true) {
         switch(this.state) {
         case 1:
            Iterator var10000 = this.nextIterator;
            Intrinsics.checkNotNull(var10000);
            if (var10000.hasNext()) {
               this.state = 2;
               return true;
            }

            this.nextIterator = null;
         case 0:
            this.state = 5;
            Continuation var4 = this.nextStep;
            Intrinsics.checkNotNull(var4);
            Continuation step = var4;
            this.nextStep = null;
            Unit var3 = Unit.INSTANCE;
            Result.Companion var10001 = Result.Companion;
            step.resumeWith(Result.constructor-impl(var3));
            break;
         case 2:
         case 3:
            return true;
         case 4:
            return false;
         default:
            throw this.exceptionalState();
         }
      }
   }

   public T next() {
      switch(this.state) {
      case 0:
      case 1:
         return this.nextNotReady();
      case 2:
         this.state = 1;
         Iterator var10000 = this.nextIterator;
         Intrinsics.checkNotNull(var10000);
         return var10000.next();
      case 3:
         this.state = 0;
         Object result = this.nextValue;
         this.nextValue = null;
         return result;
      default:
         throw this.exceptionalState();
      }
   }

   private final T nextNotReady() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.next();
      }
   }

   private final Throwable exceptionalState() {
      Throwable var10000;
      switch(this.state) {
      case 4:
         var10000 = (Throwable)(new NoSuchElementException());
         break;
      case 5:
         var10000 = (Throwable)(new IllegalStateException("Iterator has failed."));
         break;
      default:
         var10000 = (Throwable)(new IllegalStateException("Unexpected state of the iterator: " + this.state));
      }

      return var10000;
   }

   @Nullable
   public Object yield(T value, @NotNull Continuation<? super Unit> $completion) {
      this.nextValue = value;
      this.state = 3;
      int var4 = false;
      this.nextStep = $completion;
      Object var10000 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
      if (var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
         DebugProbesKt.probeCoroutineSuspended($completion);
      }

      return var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? var10000 : Unit.INSTANCE;
   }

   @Nullable
   public Object yieldAll(@NotNull Iterator<? extends T> iterator, @NotNull Continuation<? super Unit> $completion) {
      if (!iterator.hasNext()) {
         return Unit.INSTANCE;
      } else {
         this.nextIterator = iterator;
         this.state = 2;
         int var4 = false;
         this.nextStep = $completion;
         Object var10000 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
         if (var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
         }

         return var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? var10000 : Unit.INSTANCE;
      }
   }

   public void resumeWith(@NotNull Object result) {
      ResultKt.throwOnFailure(result);
      this.state = 4;
   }

   @NotNull
   public CoroutineContext getContext() {
      return (CoroutineContext)EmptyCoroutineContext.INSTANCE;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
