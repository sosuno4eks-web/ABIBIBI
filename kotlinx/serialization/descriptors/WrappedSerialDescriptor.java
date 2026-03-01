package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WrappedSerialDescriptor implements SerialDescriptor {
   @NotNull
   private final String serialName;
   @NotNull
   private final SerialDescriptor original;

   public WrappedSerialDescriptor(@NotNull String serialName, @NotNull SerialDescriptor original) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(original, "original");
      super();
      this.serialName = serialName;
      this.original = original;
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof WrappedSerialDescriptor)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)this.getSerialName(), (Object)((WrappedSerialDescriptor)other).getSerialName()) && Intrinsics.areEqual((Object)this.original, (Object)((WrappedSerialDescriptor)other).original);
      }
   }

   public int hashCode() {
      int result = this.getSerialName().hashCode();
      result = 31 * result + this.original.hashCode();
      return result;
   }

   @NotNull
   public String toString() {
      return PluginGeneratedSerialDescriptorKt.toStringImpl((SerialDescriptor)this);
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
