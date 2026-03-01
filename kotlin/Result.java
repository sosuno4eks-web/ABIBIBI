package kotlin;

import java.io.Serializable;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmInline
@SinceKotlin(
   version = "1.3"
)
public final class Result<T> implements Serializable {
   @NotNull
   public static final Result.Companion Companion = new Result.Companion((DefaultConstructorMarker)null);
   @Nullable
   private final Object value;

   /** @deprecated */
   // $FF: synthetic method
   @PublishedApi
   public static void getValue$annotations() {
   }

   public static final boolean isSuccess_impl/* $FF was: isSuccess-impl*/(Object arg0) {
      return !(arg0 instanceof Result.Failure);
   }

   public static final boolean isFailure_impl/* $FF was: isFailure-impl*/(Object arg0) {
      return arg0 instanceof Result.Failure;
   }

   @InlineOnly
   private static final T getOrNull_impl/* $FF was: getOrNull-impl*/(Object arg0) {
      return isFailure-impl(arg0) ? null : arg0;
   }

   @Nullable
   public static final Throwable exceptionOrNull_impl/* $FF was: exceptionOrNull-impl*/(Object arg0) {
      return arg0 instanceof Result.Failure ? ((Result.Failure)arg0).exception : null;
   }

   @NotNull
   public static String toString_impl/* $FF was: toString-impl*/(Object arg0) {
      return arg0 instanceof Result.Failure ? ((Result.Failure)arg0).toString() : "Success(" + arg0 + ')';
   }

   @NotNull
   public String toString() {
      return toString-impl(this.value);
   }

   public static int hashCode_impl/* $FF was: hashCode-impl*/(Object arg0) {
      return arg0 == null ? 0 : arg0.hashCode();
   }

   public int hashCode() {
      return hashCode-impl(this.value);
   }

   public static boolean equals_impl/* $FF was: equals-impl*/(Object arg0, Object other) {
      if (!(other instanceof Result)) {
         return false;
      } else {
         return Intrinsics.areEqual(arg0, ((Result)other).unbox-impl());
      }
   }

   public boolean equals(Object other) {
      return equals-impl(this.value, other);
   }

   // $FF: synthetic method
   @PublishedApi
   private Result(Object value) {
      this.value = value;
   }

   @PublishedApi
   @NotNull
   public static <T> Object constructor_impl/* $FF was: constructor-impl*/(@Nullable Object value) {
      return value;
   }

   // $FF: synthetic method
   public static final Result box_impl/* $FF was: box-impl*/(Object v) {
      return new Result(v);
   }

   // $FF: synthetic method
   public final Object unbox_impl/* $FF was: unbox-impl*/() {
      return this.value;
   }

   public static final boolean equals_impl0/* $FF was: equals-impl0*/(Object p1, Object p2) {
      return Intrinsics.areEqual(p1, p2);
   }

   public static final class Companion {
      private Companion() {
      }

      @InlineOnly
      @JvmName(
         name = "success"
      )
      private final <T> Object success(T value) {
         return Result.constructor-impl(value);
      }

      @InlineOnly
      @JvmName(
         name = "failure"
      )
      private final <T> Object failure(Throwable exception) {
         Intrinsics.checkNotNullParameter(exception, "exception");
         return Result.constructor-impl(ResultKt.createFailure(exception));
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   public static final class Failure implements Serializable {
      @JvmField
      @NotNull
      public final Throwable exception;

      public Failure(@NotNull Throwable exception) {
         Intrinsics.checkNotNullParameter(exception, "exception");
         super();
         this.exception = exception;
      }

      public boolean equals(@Nullable Object other) {
         return other instanceof Result.Failure && Intrinsics.areEqual((Object)this.exception, (Object)((Result.Failure)other).exception);
      }

      public int hashCode() {
         return this.exception.hashCode();
      }

      @NotNull
      public String toString() {
         return "Failure(" + this.exception + ')';
      }
   }
}
