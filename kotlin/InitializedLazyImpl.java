package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {
   private final T value;

   public InitializedLazyImpl(T value) {
      this.value = value;
   }

   public T getValue() {
      return this.value;
   }

   public boolean isInitialized() {
      return true;
   }

   @NotNull
   public String toString() {
      return String.valueOf(this.getValue());
   }
}
