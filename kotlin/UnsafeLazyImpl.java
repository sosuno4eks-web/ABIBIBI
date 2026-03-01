package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {
   @Nullable
   private Function0<? extends T> initializer;
   @Nullable
   private Object _value;

   public UnsafeLazyImpl(@NotNull Function0<? extends T> initializer) {
      Intrinsics.checkNotNullParameter(initializer, "initializer");
      super();
      this.initializer = initializer;
      this._value = UNINITIALIZED_VALUE.INSTANCE;
   }

   public T getValue() {
      if (this._value == UNINITIALIZED_VALUE.INSTANCE) {
         Function0 var10001 = this.initializer;
         Intrinsics.checkNotNull(var10001);
         this._value = var10001.invoke();
         this.initializer = null;
      }

      return this._value;
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

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }
}
