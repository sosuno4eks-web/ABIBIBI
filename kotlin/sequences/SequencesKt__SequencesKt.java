package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
   @InlineOnly
   private static final <T> Sequence<T> Sequence(Function0<? extends Iterator<? extends T>> iterator) {
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      return (Sequence)(new Sequence<T>() {
         public Iterator<T> iterator() {
            return (Iterator)iterator.invoke();
         }
      });
   }

   @NotNull
   public static final <T> Sequence<T> asSequence(@NotNull Iterator<? extends T> $this$asSequence) {
      Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
      return SequencesKt.constrainOnce((Sequence)(new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1($this$asSequence)));
   }

   @NotNull
   public static final <T> Sequence<T> sequenceOf(@NotNull T... elements) {
      Intrinsics.checkNotNullParameter(elements, "elements");
      return ArraysKt.asSequence(elements);
   }

   @SinceKotlin(
      version = "2.2"
   )
   @NotNull
   public static final <T> Sequence<T> sequenceOf(T element) {
      return (Sequence)(new SequencesKt__SequencesKt$sequenceOf$$inlined$Sequence$1(element));
   }

   @SinceKotlin(
      version = "2.2"
   )
   @InlineOnly
   private static final <T> Sequence<T> sequenceOf() {
      return SequencesKt.emptySequence();
   }

   @NotNull
   public static final <T> Sequence<T> emptySequence() {
      return (Sequence)EmptySequence.INSTANCE;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @InlineOnly
   private static final <T> Sequence<T> orEmpty(Sequence<? extends T> $this$orEmpty) {
      Sequence var10000 = $this$orEmpty;
      if ($this$orEmpty == null) {
         var10000 = SequencesKt.emptySequence();
      }

      return var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final <T> Sequence<T> ifEmpty(@NotNull Sequence<? extends T> $this$ifEmpty, @NotNull Function0<? extends Sequence<? extends T>> defaultValue) {
      Intrinsics.checkNotNullParameter($this$ifEmpty, "<this>");
      Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence = (SequenceScope)this.L$0;
            Object var4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Iterator iterator;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               iterator = $this$ifEmpty.iterator();
               Continuation var10002;
               if (iterator.hasNext()) {
                  var10002 = (Continuation)this;
                  this.L$0 = SpillingKt.nullOutSpilledVariable($this$sequence);
                  this.L$1 = SpillingKt.nullOutSpilledVariable(iterator);
                  this.label = 1;
                  if ($this$sequence.yieldAll(iterator, var10002) == var4) {
                     return var4;
                  }
               } else {
                  Sequence var10001 = (Sequence)defaultValue.invoke();
                  var10002 = (Continuation)this;
                  this.L$0 = SpillingKt.nullOutSpilledVariable($this$sequence);
                  this.L$1 = SpillingKt.nullOutSpilledVariable(iterator);
                  this.label = 2;
                  if ($this$sequence.yieldAll(var10001, var10002) == var4) {
                     return var4;
                  }
               }
               break;
            case 1:
               iterator = (Iterator)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            case 2:
               iterator = (Iterator)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            return Unit.INSTANCE;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super T> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @NotNull
   public static final <T> Sequence<T> flatten(@NotNull Sequence<? extends Sequence<? extends T>> $this$flatten) {
      Intrinsics.checkNotNullParameter($this$flatten, "<this>");
      return flatten$SequencesKt__SequencesKt($this$flatten, SequencesKt__SequencesKt::flatten$lambda$2$SequencesKt__SequencesKt);
   }

   @JvmName(
      name = "flattenSequenceOfIterable"
   )
   @NotNull
   public static final <T> Sequence<T> flattenSequenceOfIterable(@NotNull Sequence<? extends Iterable<? extends T>> $this$flatten) {
      Intrinsics.checkNotNullParameter($this$flatten, "<this>");
      return flatten$SequencesKt__SequencesKt($this$flatten, SequencesKt__SequencesKt::flatten$lambda$3$SequencesKt__SequencesKt);
   }

   private static final <T, R> Sequence<R> flatten$SequencesKt__SequencesKt(Sequence<? extends T> $this$flatten, Function1<? super T, ? extends Iterator<? extends R>> iterator) {
      return $this$flatten instanceof TransformingSequence ? ((TransformingSequence)$this$flatten).flatten$kotlin_stdlib(iterator) : (Sequence)(new FlatteningSequence($this$flatten, SequencesKt__SequencesKt::flatten$lambda$4$SequencesKt__SequencesKt, iterator));
   }

   @NotNull
   public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Sequence<? extends Pair<? extends T, ? extends R>> $this$unzip) {
      Intrinsics.checkNotNullParameter($this$unzip, "<this>");
      ArrayList listT = new ArrayList();
      ArrayList listR = new ArrayList();
      Iterator var3 = $this$unzip.iterator();

      while(var3.hasNext()) {
         Pair pair = (Pair)var3.next();
         listT.add(pair.getFirst());
         listR.add(pair.getSecond());
      }

      return TuplesKt.to(listT, listR);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T> Sequence<T> shuffled(@NotNull Sequence<? extends T> $this$shuffled) {
      Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
      return SequencesKt.shuffled($this$shuffled, (Random)Random.Default);
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final <T> Sequence<T> shuffled(@NotNull Sequence<? extends T> $this$shuffled, @NotNull Random random) {
      Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
      Intrinsics.checkNotNullParameter(random, "random");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         int I$0;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence = (SequenceScope)this.L$0;
            Object var7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            List buffer;
            int j;
            Object last;
            Object value;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               buffer = SequencesKt.toMutableList($this$shuffled);
               break;
            case 1:
               j = this.I$0;
               value = this.L$3;
               last = this.L$2;
               buffer = (List)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            Continuation var10002;
            do {
               if (((Collection)buffer).isEmpty()) {
                  return Unit.INSTANCE;
               }

               j = random.nextInt(buffer.size());
               last = CollectionsKt.removeLast(buffer);
               value = j < buffer.size() ? buffer.set(j, last) : last;
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = buffer;
               this.L$2 = SpillingKt.nullOutSpilledVariable(last);
               this.L$3 = SpillingKt.nullOutSpilledVariable(value);
               this.I$0 = j;
               this.label = 1;
            } while($this$sequence.yield(value, var10002) != var7);

            return var7;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super T> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @NotNull
   public static final <T, C, R> Sequence<R> flatMapIndexed(@NotNull Sequence<? extends T> source, @NotNull Function2<? super Integer, ? super T, ? extends C> transform, @NotNull Function1<? super C, ? extends Iterator<? extends R>> iterator) {
      Intrinsics.checkNotNullParameter(source, "source");
      Intrinsics.checkNotNullParameter(transform, "transform");
      Intrinsics.checkNotNullParameter(iterator, "iterator");
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         int I$0;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence = (SequenceScope)this.L$0;
            Object var8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int index;
            Iterator var4;
            Object element;
            Object result;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               index = 0;
               var4 = source.iterator();
               break;
            case 1:
               index = this.I$0;
               result = this.L$3;
               element = this.L$2;
               var4 = (Iterator)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            Continuation var10002;
            Iterator var9;
            do {
               if (!var4.hasNext()) {
                  return Unit.INSTANCE;
               }

               element = var4.next();
               Function2 var10000 = transform;
               int var7 = index++;
               if (var7 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }

               result = var10000.invoke(Boxing.boxInt(var7), element);
               var9 = (Iterator)iterator.invoke(result);
               var10002 = (Continuation)this;
               this.L$0 = $this$sequence;
               this.L$1 = var4;
               this.L$2 = SpillingKt.nullOutSpilledVariable(element);
               this.L$3 = SpillingKt.nullOutSpilledVariable(result);
               this.I$0 = index;
               this.label = 1;
            } while($this$sequence.yieldAll(var9, var10002) != var8);

            return var8;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   @NotNull
   public static final <T> Sequence<T> constrainOnce(@NotNull Sequence<? extends T> $this$constrainOnce) {
      Intrinsics.checkNotNullParameter($this$constrainOnce, "<this>");
      return $this$constrainOnce instanceof ConstrainedOnceSequence ? $this$constrainOnce : (Sequence)(new ConstrainedOnceSequence($this$constrainOnce));
   }

   @NotNull
   public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> nextFunction) {
      Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
      return SequencesKt.constrainOnce((Sequence)(new GeneratorSequence(nextFunction, SequencesKt__SequencesKt::generateSequence$lambda$5$SequencesKt__SequencesKt)));
   }

   @LowPriorityInOverloadResolution
   @NotNull
   public static final <T> Sequence<T> generateSequence(@Nullable T seed, @NotNull Function1<? super T, ? extends T> nextFunction) {
      Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
      return seed == null ? (Sequence)EmptySequence.INSTANCE : (Sequence)(new GeneratorSequence(SequencesKt__SequencesKt::generateSequence$lambda$6$SequencesKt__SequencesKt, nextFunction));
   }

   @NotNull
   public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> seedFunction, @NotNull Function1<? super T, ? extends T> nextFunction) {
      Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
      Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
      return (Sequence)(new GeneratorSequence(seedFunction, nextFunction));
   }

   private static final Iterator flatten$lambda$2$SequencesKt__SequencesKt(Sequence it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return it.iterator();
   }

   private static final Iterator flatten$lambda$3$SequencesKt__SequencesKt(Iterable it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return it.iterator();
   }

   private static final Object flatten$lambda$4$SequencesKt__SequencesKt(Object it) {
      return it;
   }

   private static final Object generateSequence$lambda$5$SequencesKt__SequencesKt(Function0 $nextFunction, Object it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return $nextFunction.invoke();
   }

   private static final Object generateSequence$lambda$6$SequencesKt__SequencesKt(Object $seed) {
      return $seed;
   }

   public SequencesKt__SequencesKt() {
   }
}
