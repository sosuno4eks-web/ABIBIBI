package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ResultKt {
   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   @NotNull
   public static final Object createFailure(@NotNull Throwable exception) {
      Intrinsics.checkNotNullParameter(exception, "exception");
      return new Result.Failure(exception);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.3"
   )
   public static final void throwOnFailure(@NotNull Object $this$throwOnFailure) {
      if ($this$throwOnFailure instanceof Result.Failure) {
         throw ((Result.Failure)$this$throwOnFailure).exception;
      }
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R> Object runCatching(Function0<? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");

      Result.Companion var10000;
      Object var1;
      try {
         var10000 = Result.Companion;
         var1 = Result.constructor-impl(block.invoke());
      } catch (Throwable var3) {
         var10000 = Result.Companion;
         var1 = Result.constructor-impl(createFailure(var3));
      }

      return var1;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <T, R> Object runCatching(T $this$runCatching, Function1<? super T, ? extends R> block) {
      Intrinsics.checkNotNullParameter(block, "block");

      Result.Companion var10000;
      Object var2;
      try {
         var10000 = Result.Companion;
         var2 = Result.constructor-impl(block.invoke($this$runCatching));
      } catch (Throwable var4) {
         var10000 = Result.Companion;
         var2 = Result.constructor-impl(createFailure(var4));
      }

      return var2;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <T> T getOrThrow(Object $this$getOrThrow) {
      throwOnFailure($this$getOrThrow);
      return $this$getOrThrow;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T extends R> R getOrElse(Object $this$getOrElse, Function1<? super Throwable, ? extends R> onFailure) {
      Intrinsics.checkNotNullParameter(onFailure, "onFailure");
      Throwable exception = Result.exceptionOrNull-impl($this$getOrElse);
      return exception == null ? $this$getOrElse : onFailure.invoke(exception);
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T extends R> R getOrDefault(Object $this$getOrDefault, R defaultValue) {
      return Result.isFailure-impl($this$getOrDefault) ? defaultValue : $this$getOrDefault;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T> R fold(Object $this$fold, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
      Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
      Intrinsics.checkNotNullParameter(onFailure, "onFailure");
      Throwable exception = Result.exceptionOrNull-impl($this$fold);
      return exception == null ? onSuccess.invoke($this$fold) : onFailure.invoke(exception);
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T> Object map(Object $this$map, Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter(transform, "transform");
      Object var2;
      if (Result.isSuccess-impl($this$map)) {
         Result.Companion var10000 = Result.Companion;
         var2 = Result.constructor-impl(transform.invoke($this$map));
      } else {
         var2 = Result.constructor-impl($this$map);
      }

      return var2;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T> Object mapCatching(Object $this$mapCatching, Function1<? super T, ? extends R> transform) {
      Intrinsics.checkNotNullParameter(transform, "transform");
      Object var6;
      if (Result.isSuccess-impl($this$mapCatching)) {
         Object var2 = $this$mapCatching;

         Result.Companion var10000;
         Object var3;
         try {
            var10000 = Result.Companion;
            int var4 = false;
            var3 = Result.constructor-impl(transform.invoke(var2));
         } catch (Throwable var5) {
            var10000 = Result.Companion;
            var3 = Result.constructor-impl(createFailure(var5));
         }

         var6 = var3;
      } else {
         var6 = Result.constructor-impl($this$mapCatching);
      }

      return var6;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T extends R> Object recover(Object $this$recover, Function1<? super Throwable, ? extends R> transform) {
      Intrinsics.checkNotNullParameter(transform, "transform");
      Throwable exception = Result.exceptionOrNull-impl($this$recover);
      Object var10000;
      if (exception == null) {
         var10000 = $this$recover;
      } else {
         Result.Companion var3 = Result.Companion;
         var10000 = Result.constructor-impl(transform.invoke(exception));
      }

      return var10000;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <R, T extends R> Object recoverCatching(Object $this$recoverCatching, Function1<? super Throwable, ? extends R> transform) {
      Intrinsics.checkNotNullParameter(transform, "transform");
      Throwable exception = Result.exceptionOrNull-impl($this$recoverCatching);
      Object var10000;
      if (exception == null) {
         var10000 = $this$recoverCatching;
      } else {
         Object var4;
         Result.Companion var7;
         try {
            var7 = Result.Companion;
            int var5 = false;
            var4 = Result.constructor-impl(transform.invoke(exception));
         } catch (Throwable var6) {
            var7 = Result.Companion;
            var4 = Result.constructor-impl(createFailure(var6));
         }

         var10000 = var4;
      }

      return var10000;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <T> Object onFailure(Object $this$onFailure, Function1<? super Throwable, Unit> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      Throwable var10000 = Result.exceptionOrNull-impl($this$onFailure);
      if (var10000 != null) {
         Throwable it = var10000;
         int var3 = false;
         action.invoke(it);
      }

      return $this$onFailure;
   }

   @InlineOnly
   @SinceKotlin(
      version = "1.3"
   )
   private static final <T> Object onSuccess(Object $this$onSuccess, Function1<? super T, Unit> action) {
      Intrinsics.checkNotNullParameter(action, "action");
      if (Result.isSuccess-impl($this$onSuccess)) {
         action.invoke($this$onSuccess);
      }

      return $this$onSuccess;
   }
}
