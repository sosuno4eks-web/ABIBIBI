package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {
   @NotNull
   public static final SafePublicationLazyImpl.Companion Companion = new SafePublicationLazyImpl.Companion((DefaultConstructorMarker)null);
   @Nullable
   private volatile Function0<? extends T> initializer;
   @Nullable
   private volatile Object _value;
   @NotNull
   private final Object final;
   private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");

   public SafePublicationLazyImpl(@NotNull Function0<? extends T> initializer) {
      Intrinsics.checkNotNullParameter(initializer, "initializer");
      super();
      this.initializer = initializer;
      this._value = UNINITIALIZED_VALUE.INSTANCE;
      this.final = UNINITIALIZED_VALUE.INSTANCE;
   }

   /** @deprecated */
   // $FF: synthetic method
   private static void getFinal$annotations() {
   }

   public T getValue() {
      Object value = this._value;
      if (value != UNINITIALIZED_VALUE.INSTANCE) {
         return value;
      } else {
         Function0 initializerValue = this.initializer;
         if (initializerValue != null) {
            Object newValue = initializerValue.invoke();
            if (valueUpdater.compareAndSet(this, UNINITIALIZED_VALUE.INSTANCE, newValue)) {
               this.initializer = null;
               return newValue;
            }
         }

         return this._value;
      }
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

   public static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
