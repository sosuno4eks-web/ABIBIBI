package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

class StandardKt__StandardKt {
   @InlineOnly
   private static final Void TODO() {
      throw new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
   }

   @InlineOnly
   private static final Void TODO(String reason) {
      Intrinsics.checkNotNullParameter(reason, "reason");
      throw new NotImplementedError("An operation is not implemented: " + reason);
   }

   @InlineOnly
   private static final <R> R run(Function0<? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      return block.invoke();
   }

   @InlineOnly
   private static final <T, R> R run(T $this$run, Function1<? super T, ? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      return block.invoke($this$run);
   }

   @InlineOnly
   private static final <T, R> R with(T receiver, Function1<? super T, ? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      return block.invoke(receiver);
   }

   @InlineOnly
   private static final <T> T apply(T $this$apply, Function1<? super T, Unit> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      block.invoke($this$apply);
      return $this$apply;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.1"
   )
   private static final <T> T also(T $this$also, Function1<? super T, Unit> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      block.invoke($this$also);
      return $this$also;
   }

   @InlineOnly
   private static final <T, R> R let(T $this$let, Function1<? super T, ? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      return block.invoke($this$let);
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.1"
   )
   private static final <T> T takeIf(T $this$takeIf, Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return (Boolean)predicate.invoke($this$takeIf) ? $this$takeIf : null;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.1"
   )
   private static final <T> T takeUnless(T $this$takeUnless, Function1<? super T, Boolean> predicate) {
      Intrinsics.checkNotNullParameter(predicate, "predicate");
      return !(Boolean)predicate.invoke($this$takeUnless) ? $this$takeUnless : null;
   }

   @InlineOnly
   private static final void repeat(int times, Function1<? super Integer, Unit> action) {
      Intrinsics.checkNotNullParameter(action, "action");

      for(int index = 0; index < times; ++index) {
         action.invoke(index);
      }

   }

   public StandardKt__StandardKt() {
   }
}
