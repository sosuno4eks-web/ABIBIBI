package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public abstract class PrimitiveKind extends SerialKind {
   private PrimitiveKind() {
      super((DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public PrimitiveKind(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class BOOLEAN extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.BOOLEAN INSTANCE = new PrimitiveKind.BOOLEAN();

      private BOOLEAN() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class BYTE extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.BYTE INSTANCE = new PrimitiveKind.BYTE();

      private BYTE() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class CHAR extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.CHAR INSTANCE = new PrimitiveKind.CHAR();

      private CHAR() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class DOUBLE extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.DOUBLE INSTANCE = new PrimitiveKind.DOUBLE();

      private DOUBLE() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class FLOAT extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.FLOAT INSTANCE = new PrimitiveKind.FLOAT();

      private FLOAT() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class INT extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.INT INSTANCE = new PrimitiveKind.INT();

      private INT() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class LONG extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.LONG INSTANCE = new PrimitiveKind.LONG();

      private LONG() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class SHORT extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.SHORT INSTANCE = new PrimitiveKind.SHORT();

      private SHORT() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class STRING extends PrimitiveKind {
      @NotNull
      public static final PrimitiveKind.STRING INSTANCE = new PrimitiveKind.STRING();

      private STRING() {
         super((DefaultConstructorMarker)null);
      }
   }
}
