package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

public final class SlidingWindowKt {
   public static final void checkWindowSizeStep(int size, int step) {
      if (size <= 0 || step <= 0) {
         int var2 = false;
         String var3 = size != step ? "Both size " + size + " and step " + step + " must be greater than zero." : "size " + size + " must be greater than zero.";
         throw new IllegalArgumentException(var3.toString());
      }
   }

   @NotNull
   public static final <T> Sequence<List<T>> windowedSequence(@NotNull Sequence<? extends T> $this$windowedSequence, int size, int step, boolean partialWindows, boolean reuseBuffer) {
      Intrinsics.checkNotNullParameter($this$windowedSequence, "<this>");
      checkWindowSizeStep(size, step);
      return (Sequence)(new SlidingWindowKt$windowedSequence$$inlined$Sequence$1($this$windowedSequence, size, step, partialWindows, reuseBuffer));
   }

   @NotNull
   public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int size, int step, boolean partialWindows, boolean reuseBuffer) {
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      return !iterator.hasNext() ? (Iterator)EmptyIterator.INSTANCE : SequencesKt.iterator((Function2)(new Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         int I$0;
         int I$1;
         int I$2;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$iterator;
            int bufferInitialCapacity;
            int gap;
            RingBuffer buffer;
            Object var9;
            List var10001;
            Continuation var10002;
            label170: {
               Iterator var6;
               Object e;
               label190: {
                  $this$iterator = (SequenceScope)this.L$0;
                  var9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                  Object ex;
                  ArrayList bufferx;
                  int skip;
                  Iterator var12;
                  switch(this.label) {
                  case 0:
                     ResultKt.throwOnFailure($result);
                     bufferInitialCapacity = RangesKt.coerceAtMost(size, 1024);
                     gap = step - size;
                     if (gap < 0) {
                        buffer = new RingBuffer(bufferInitialCapacity);
                        var6 = iterator;
                        break label190;
                     }

                     bufferx = new ArrayList(bufferInitialCapacity);
                     skip = 0;
                     var12 = iterator;
                     break;
                  case 1:
                     skip = this.I$2;
                     gap = this.I$1;
                     bufferInitialCapacity = this.I$0;
                     ex = this.L$3;
                     var12 = (Iterator)this.L$2;
                     bufferx = (ArrayList)this.L$1;
                     ResultKt.throwOnFailure($result);
                     if (reuseBuffer) {
                        bufferx.clear();
                     } else {
                        bufferx = new ArrayList(size);
                     }

                     skip = gap;
                     break;
                  case 2:
                     skip = this.I$2;
                     gap = this.I$1;
                     bufferInitialCapacity = this.I$0;
                     bufferx = (ArrayList)this.L$1;
                     ResultKt.throwOnFailure($result);
                     return Unit.INSTANCE;
                  case 3:
                     gap = this.I$1;
                     bufferInitialCapacity = this.I$0;
                     e = this.L$3;
                     var6 = (Iterator)this.L$2;
                     buffer = (RingBuffer)this.L$1;
                     ResultKt.throwOnFailure($result);
                     buffer.removeFirst(step);
                     break label190;
                  case 4:
                     gap = this.I$1;
                     bufferInitialCapacity = this.I$0;
                     buffer = (RingBuffer)this.L$1;
                     ResultKt.throwOnFailure($result);
                     buffer.removeFirst(step);
                     break label170;
                  case 5:
                     gap = this.I$1;
                     bufferInitialCapacity = this.I$0;
                     buffer = (RingBuffer)this.L$1;
                     ResultKt.throwOnFailure($result);
                     return Unit.INSTANCE;
                  default:
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  while(var12.hasNext()) {
                     ex = var12.next();
                     if (skip > 0) {
                        --skip;
                     } else {
                        bufferx.add(ex);
                        if (bufferx.size() == size) {
                           var10002 = (Continuation)this;
                           this.L$0 = $this$iterator;
                           this.L$1 = bufferx;
                           this.L$2 = var12;
                           this.L$3 = SpillingKt.nullOutSpilledVariable(ex);
                           this.I$0 = bufferInitialCapacity;
                           this.I$1 = gap;
                           this.I$2 = skip;
                           this.label = 1;
                           if ($this$iterator.yield(bufferx, var10002) == var9) {
                              return var9;
                           }

                           if (reuseBuffer) {
                              bufferx.clear();
                           } else {
                              bufferx = new ArrayList(size);
                           }

                           skip = gap;
                        }
                     }
                  }

                  if (!((Collection)bufferx).isEmpty() && (partialWindows || bufferx.size() == size)) {
                     var10002 = (Continuation)this;
                     this.L$0 = SpillingKt.nullOutSpilledVariable($this$iterator);
                     this.L$1 = SpillingKt.nullOutSpilledVariable(bufferx);
                     this.L$2 = null;
                     this.L$3 = null;
                     this.I$0 = bufferInitialCapacity;
                     this.I$1 = gap;
                     this.I$2 = skip;
                     this.label = 2;
                     if ($this$iterator.yield(bufferx, var10002) == var9) {
                        return var9;
                     }
                  }

                  return Unit.INSTANCE;
               }

               while(var6.hasNext()) {
                  e = var6.next();
                  buffer.add(e);
                  if (buffer.isFull()) {
                     if (buffer.size() < size) {
                        buffer = buffer.expanded(size);
                     } else {
                        var10001 = reuseBuffer ? (List)buffer : (List)(new ArrayList((Collection)buffer));
                        var10002 = (Continuation)this;
                        this.L$0 = $this$iterator;
                        this.L$1 = buffer;
                        this.L$2 = var6;
                        this.L$3 = SpillingKt.nullOutSpilledVariable(e);
                        this.I$0 = bufferInitialCapacity;
                        this.I$1 = gap;
                        this.label = 3;
                        if ($this$iterator.yield(var10001, var10002) == var9) {
                           return var9;
                        }

                        buffer.removeFirst(step);
                     }
                  }
               }

               if (!partialWindows) {
                  return Unit.INSTANCE;
               }
            }

            while(buffer.size() > step) {
               var10001 = reuseBuffer ? (List)buffer : (List)(new ArrayList((Collection)buffer));
               var10002 = (Continuation)this;
               this.L$0 = $this$iterator;
               this.L$1 = buffer;
               this.L$2 = null;
               this.L$3 = null;
               this.I$0 = bufferInitialCapacity;
               this.I$1 = gap;
               this.label = 4;
               if ($this$iterator.yield(var10001, var10002) == var9) {
                  return var9;
               }

               buffer.removeFirst(step);
            }

            if (!((Collection)buffer).isEmpty()) {
               var10002 = (Continuation)this;
               this.L$0 = SpillingKt.nullOutSpilledVariable($this$iterator);
               this.L$1 = SpillingKt.nullOutSpilledVariable(buffer);
               this.L$2 = null;
               this.L$3 = null;
               this.I$0 = bufferInitialCapacity;
               this.I$1 = gap;
               this.label = 5;
               if ($this$iterator.yield(buffer, var10002) == var9) {
                  return var9;
               }
            }

            return Unit.INSTANCE;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super List<? extends T>> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }
}
