package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ContextDescriptor implements SerialDescriptor {
   @NotNull
   private final SerialDescriptor original;
   @JvmField
   @NotNull
   public final KClass<?> kClass;
   @NotNull
   private final String serialName;

   public ContextDescriptor(@NotNull SerialDescriptor original, @NotNull KClass<?> kClass) {
      Intrinsics.checkNotNullParameter(original, "original");
      Intrinsics.checkNotNullParameter(kClass, "kClass");
      super();
      this.original = original;
      this.kClass = kClass;
      this.serialName = this.original.getSerialName() + '<' + this.kClass.getSimpleName() + '>';
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   public boolean equals(@Nullable Object other) {
      ContextDescriptor var10000 = other instanceof ContextDescriptor ? (ContextDescriptor)other : null;
      if ((other instanceof ContextDescriptor ? (ContextDescriptor)other : null) == null) {
         return false;
      } else {
         ContextDescriptor another = var10000;
         return Intrinsics.areEqual((Object)this.original, (Object)another.original) && Intrinsics.areEqual((Object)another.kClass, (Object)this.kClass);
      }
   }

   public int hashCode() {
      int result = this.kClass.hashCode();
      result = 31 * result + this.getSerialName().hashCode();
      return result;
   }

   @NotNull
   public String toString() {
      return "ContextDescriptor(kClass: " + this.kClass + ", original: " + this.original + ')';
   }

   @NotNull
   public SerialKind getKind() {
      return this.original.getKind();
   }

   public boolean isNullable() {
      return this.original.isNullable();
   }

   public boolean isInline() {
      return this.original.isInline();
   }

   public int getElementsCount() {
      return this.original.getElementsCount();
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      return this.original.getAnnotations();
   }

   @NotNull
   public String getElementName(int index) {
      return this.original.getElementName(index);
   }

   public int getElementIndex(@NotNull String name) {
      Intrinsics.checkNotNullParameter(name, "name");
      return this.original.getElementIndex(name);
   }

   @NotNull
   public List<Annotation> getElementAnnotations(int index) {
      return this.original.getElementAnnotations(index);
   }

   @NotNull
   public SerialDescriptor getElementDescriptor(int index) {
      return this.original.getElementDescriptor(index);
   }

   public boolean isElementOptional(int index) {
      return this.original.isElementOptional(index);
   }
}
