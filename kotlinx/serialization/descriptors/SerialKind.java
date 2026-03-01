package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

public abstract class SerialKind {
   private SerialKind() {
   }

   @NotNull
   public String toString() {
      String var10000 = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   // $FF: synthetic method
   public SerialKind(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class CONTEXTUAL extends SerialKind {
      @NotNull
      public static final SerialKind.CONTEXTUAL INSTANCE = new SerialKind.CONTEXTUAL();

      private CONTEXTUAL() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class ENUM extends SerialKind {
      @NotNull
      public static final SerialKind.ENUM INSTANCE = new SerialKind.ENUM();

      private ENUM() {
         super((DefaultConstructorMarker)null);
      }
   }
}
