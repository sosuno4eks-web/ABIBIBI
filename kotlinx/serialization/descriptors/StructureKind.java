package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public abstract class StructureKind extends SerialKind {
   private StructureKind() {
      super((DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public StructureKind(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class CLASS extends StructureKind {
      @NotNull
      public static final StructureKind.CLASS INSTANCE = new StructureKind.CLASS();

      private CLASS() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class LIST extends StructureKind {
      @NotNull
      public static final StructureKind.LIST INSTANCE = new StructureKind.LIST();

      private LIST() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class MAP extends StructureKind {
      @NotNull
      public static final StructureKind.MAP INSTANCE = new StructureKind.MAP();

      private MAP() {
         super((DefaultConstructorMarker)null);
      }
   }

   public static final class OBJECT extends StructureKind {
      @NotNull
      public static final StructureKind.OBJECT INSTANCE = new StructureKind.OBJECT();

      private OBJECT() {
         super((DefaultConstructorMarker)null);
      }
   }
}
