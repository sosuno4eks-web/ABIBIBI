package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
public abstract class ListLikeDescriptor implements SerialDescriptor {
   @NotNull
   private final SerialDescriptor elementDescriptor;
   private final int elementsCount;

   private ListLikeDescriptor(SerialDescriptor elementDescriptor) {
      this.elementDescriptor = elementDescriptor;
      this.elementsCount = 1;
   }

   @NotNull
   public final SerialDescriptor getElementDescriptor() {
      return this.elementDescriptor;
   }

   @NotNull
   public SerialKind getKind() {
      return (SerialKind)StructureKind.LIST.INSTANCE;
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
         throw new IllegalArgumentException(name + " is not a valid list index");
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
         return this.elementDescriptor;
      }
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof ListLikeDescriptor)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)this.elementDescriptor, (Object)((ListLikeDescriptor)other).elementDescriptor) && Intrinsics.areEqual((Object)this.getSerialName(), (Object)((ListLikeDescriptor)other).getSerialName());
      }
   }

   public int hashCode() {
      return this.elementDescriptor.hashCode() * 31 + this.getSerialName().hashCode();
   }

   @NotNull
   public String toString() {
      return this.getSerialName() + '(' + this.elementDescriptor + ')';
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
   public ListLikeDescriptor(SerialDescriptor elementDescriptor, DefaultConstructorMarker $constructor_marker) {
      this(elementDescriptor);
   }
}
