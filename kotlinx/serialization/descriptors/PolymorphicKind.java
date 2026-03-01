package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
public abstract class PolymorphicKind extends SerialKind {
   private PolymorphicKind() {
      super((DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public PolymorphicKind(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class OPEN extends PolymorphicKind {
      @NotNull
      public static final PolymorphicKind.OPEN INSTANCE = new PolymorphicKind.OPEN();

      private OPEN() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class SEALED extends PolymorphicKind {
      @NotNull
      public static final PolymorphicKind.SEALED INSTANCE = new PolymorphicKind.SEALED();

      private SEALED() {
         super((DefaultConstructorMarker)null);
      }
   }
}
