package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NothingSerialDescriptor implements SerialDescriptor {
   @NotNull
   public static final NothingSerialDescriptor INSTANCE = new NothingSerialDescriptor();
   @NotNull
   private static final SerialKind kind;
   @NotNull
   private static final String serialName;

   private NothingSerialDescriptor() {
   }

   @NotNull
   public SerialKind getKind() {
      return kind;
   }

   @NotNull
   public String getSerialName() {
      return serialName;
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
      return "NothingSerialDescriptor";
   }

   public boolean equals(@Nullable Object other) {
      return this == other;
   }

   public int hashCode() {
      return this.getSerialName().hashCode() + 31 * this.getKind().hashCode();
   }

   private final Void error() {
      throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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

   static {
      kind = (SerialKind)StructureKind.OBJECT.INSTANCE;
      serialName = "kotlin.Nothing";
   }
}
