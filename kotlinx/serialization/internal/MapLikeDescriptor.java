package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MapLikeDescriptor implements SerialDescriptor {
   @NotNull
   private final String serialName;
   @NotNull
   private final SerialDescriptor keyDescriptor;
   @NotNull
   private final SerialDescriptor valueDescriptor;
   private final int elementsCount;

   private MapLikeDescriptor(String serialName, SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor) {
      this.serialName = serialName;
      this.keyDescriptor = keyDescriptor;
      this.valueDescriptor = valueDescriptor;
      this.elementsCount = 2;
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   @NotNull
   public final SerialDescriptor getKeyDescriptor() {
      return this.keyDescriptor;
   }

   @NotNull
   public final SerialDescriptor getValueDescriptor() {
      return this.valueDescriptor;
   }

   @NotNull
   public SerialKind getKind() {
      return (SerialKind)StructureKind.MAP.INSTANCE;
   }

   public int getElementsCount() {
      return this.elementsCount;
   }

   @NotNull
   public String getElementName(int index) {
      return String.valueOf(index);
   }

   public int getElementIndex(@NotNull String name) {
      Intrinsics.checkNotNullParameter(name, "name");
      Integer var10000 = StringsKt.toIntOrNull(name);
      if (var10000 != null) {
         return var10000;
      } else {
         throw new IllegalArgumentException(name + " is not a valid map index");
      }
   }

   public boolean isElementOptional(int index) {
      if (index < 0) {
         int var2 = false;
         String var3 = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return false;
      }
   }

   @NotNull
   public List<Annotation> getElementAnnotations(int index) {
      if (index < 0) {
         int var2 = false;
         String var3 = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
         throw new IllegalArgumentException(var3.toString());
      } else {
         return CollectionsKt.emptyList();
      }
   }

   @NotNull
   public SerialDescriptor getElementDescriptor(int index) {
      if (index < 0) {
         int var2 = false;
         String var3 = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
         throw new IllegalArgumentException(var3.toString());
      } else {
         SerialDescriptor var10000;
         switch(index % 2) {
         case 0:
            var10000 = this.keyDescriptor;
            break;
         case 1:
            var10000 = this.valueDescriptor;
            break;
         default:
            throw new IllegalStateException("Unreached".toString());
         }

         return var10000;
      }
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof MapLikeDescriptor)) {
         return false;
      } else if (!Intrinsics.areEqual((Object)this.getSerialName(), (Object)((MapLikeDescriptor)other).getSerialName())) {
         return false;
      } else if (!Intrinsics.areEqual((Object)this.keyDescriptor, (Object)((MapLikeDescriptor)other).keyDescriptor)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)this.valueDescriptor, (Object)((MapLikeDescriptor)other).valueDescriptor);
      }
   }

   public int hashCode() {
      int result = this.getSerialName().hashCode();
      result = 31 * result + this.keyDescriptor.hashCode();
      result = 31 * result + this.valueDescriptor.hashCode();
      return result;
   }

   @NotNull
   public String toString() {
      return this.getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
   }

   public boolean isNullable() {
      return SerialDescriptor.super.isNullable();
   }

   public boolean isInline() {
      return SerialDescriptor.super.isInline();
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      return SerialDescriptor.super.getAnnotations();
   }

   // $FF: synthetic method
   public MapLikeDescriptor(String serialName, SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor, DefaultConstructorMarker $constructor_marker) {
      this(serialName, keyDescriptor, valueDescriptor);
   }
}
