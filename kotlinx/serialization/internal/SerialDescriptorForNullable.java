package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SerialDescriptorForNullable implements SerialDescriptor, CachedNames {
   @NotNull
   private final SerialDescriptor original;
   @NotNull
   private final String serialName;
   @NotNull
   private final Set<String> serialNames;

   public SerialDescriptorForNullable(@NotNull SerialDescriptor original) {
      Intrinsics.checkNotNullParameter(original, "original");
      super();
      this.original = original;
      this.serialName = this.original.getSerialName() + '?';
      this.serialNames = Platform_commonKt.cachedSerialNames(this.original);
   }

   @NotNull
   public final SerialDescriptor getOriginal$kotlinx_serialization_core() {
      return this.original;
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   @NotNull
   public Set<String> getSerialNames() {
      return this.serialNames;
   }

   public boolean isNullable() {
      return true;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof SerialDescriptorForNullable)) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)this.original, (Object)((SerialDescriptorForNullable)other).original);
      }
   }

   @NotNull
   public String toString() {
      return "" + this.original + '?';
   }

   public int hashCode() {
      return this.original.hashCode() * 31;
   }

   @NotNull
   public SerialKind getKind() {
      return this.original.getKind();
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
