package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {
   @Nullable
   private Function0<? extends T> initializer;
   @Nullable
   private volatile Object _value;
   @NotNull
   private final Object lock;

   public SynchronizedLazyImpl(@NotNull Function0<? extends T> initializer, @Nullable Object lock) {
      Intrinsics.checkNotNullParameter(initializer, "initializer");
      super();
      this.initializer = initializer;
      this._value = UNINITIALIZED_VALUE.INSTANCE;
      Object var10001 = lock;
      if (lock == null) {
         var10001 = this;
      }

      this.lock = var10001;
   }

   // $FF: synthetic method
   public SynchronizedLazyImpl(Function0 var1, Object var2, int var3, DefaultConstructorMarker var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      this(var1, var2);
   }

   public T getValue() {
      // $FF: Couldn't be decompiled
   }

   public boolean isInitialized() {
      return this._value != UNINITIALIZED_VALUE.INSTANCE;
   }

   @NotNull
   public String toString() {
      return this.isInitialized() ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
   }

   private final Object writeReplace() {
      return new InitializedLazyImpl(this.getValue());
   }
}
