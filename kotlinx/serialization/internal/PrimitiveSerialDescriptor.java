package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PrimitiveSerialDescriptor implements SerialDescriptor {
   @NotNull
   private final String serialName;
   @NotNull
   private final PrimitiveKind kind;

   public PrimitiveSerialDescriptor(@NotNull String serialName, @NotNull PrimitiveKind kind) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(kind, "kind");
      super();
      this.serialName = serialName;
      this.kind = kind;
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   @NotNull
   public PrimitiveKind getKind() {
      return this.kind;
   }

   public int getElementsCount() {
      return 0;
   }

   @NotNull
   public String getElementName(int index) {
      this.error();
      throw new KotlinNothingValueException();
   }

   public int getElementIndex(@NotNull String name) {
      Intrinsics.checkNotNullParameter(name, "name");
      this.error();
      throw new KotlinNothingValueException();
   }

   public boolean isElementOptional(int index) {
      this.error();
      throw new KotlinNothingValueException();
   }

   @NotNull
   public SerialDescriptor getElementDescriptor(int index) {
      this.error();
      throw new KotlinNothingValueException();
   }

   @NotNull
   public List<Annotation> getElementAnnotations(int index) {
      this.error();
      throw new KotlinNothingValueException();
   }

   @NotNull
   public String toString() {
      return "PrimitiveDescriptor(" + this.getSerialName() + ')';
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof PrimitiveSerialDescriptor)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)this.getSerialName(), (Object)((PrimitiveSerialDescriptor)other).getSerialName()) && Intrinsics.areEqual((Object)this.getKind(), (Object)((PrimitiveSerialDescriptor)other).getKind());
      }
   }

   public int hashCode() {
      return this.getSerialName().hashCode() + 31 * this.getKind().hashCode();
   }

   private final Void error() {
      throw new IllegalStateException("Primitive descriptor " + this.getSerialName() + " does not have elements");
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
}
