package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

public final class ClassSerialDescriptorBuilder {
   @NotNull
   private final String serialName;
   /** @deprecated */
   private boolean isNullable;
   @NotNull
   private List<? extends Annotation> annotations;
   @NotNull
   private final List<String> elementNames;
   @NotNull
   private final Set<String> uniqueNames;
   @NotNull
   private final List<SerialDescriptor> elementDescriptors;
   @NotNull
   private final List<List<Annotation>> elementAnnotations;
   @NotNull
   private final List<Boolean> elementOptionality;

   public ClassSerialDescriptorBuilder(@NotNull String serialName) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      super();
      this.serialName = serialName;
      this.annotations = CollectionsKt.emptyList();
      this.elementNames = (List)(new ArrayList());
      this.uniqueNames = (Set)(new HashSet());
      this.elementDescriptors = (List)(new ArrayList());
      this.elementAnnotations = (List)(new ArrayList());
      this.elementOptionality = (List)(new ArrayList());
   }

   @NotNull
   public final String getSerialName() {
      return this.serialName;
   }

   /** @deprecated */
   public final boolean isNullable() {
      return this.isNullable;
   }

   /** @deprecated */
   public final void setNullable(boolean <set-?>) {
      this.isNullable = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   @Deprecated(
      message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.",
      level = DeprecationLevel.ERROR
   )
   public static void isNullable$annotations() {
   }

   @NotNull
   public final List<Annotation> getAnnotations() {
      return this.annotations;
   }

   public final void setAnnotations(@NotNull List<? extends Annotation> <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.annotations = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getAnnotations$annotations() {
   }

   @NotNull
   public final List<String> getElementNames$kotlinx_serialization_core() {
      return this.elementNames;
   }

   @NotNull
   public final List<SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
      return this.elementDescriptors;
   }

   @NotNull
   public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
      return this.elementAnnotations;
   }

   @NotNull
   public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
      return this.elementOptionality;
   }

   public final void element(@NotNull String elementName, @NotNull SerialDescriptor descriptor, @NotNull List<? extends Annotation> annotations, boolean isOptional) {
      Intrinsics.checkNotNullParameter(elementName, "elementName");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(annotations, "annotations");
      if (!this.uniqueNames.add(elementName)) {
         int var5 = false;
         String var6 = "Element with name '" + elementName + "' is already registered in " + this.serialName;
         throw new IllegalArgumentException(var6.toString());
      } else {
         ((Collection)this.elementNames).add(elementName);
         ((Collection)this.elementDescriptors).add(descriptor);
         ((Collection)this.elementAnnotations).add(annotations);
         ((Collection)this.elementOptionality).add(isOptional);
      }
   }

   // $FF: synthetic method
   public static void element$default(ClassSerialDescriptorBuilder var0, String var1, SerialDescriptor var2, List var3, boolean var4, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = CollectionsKt.emptyList();
      }

      if ((var5 & 8) != 0) {
         var4 = false;
      }

      var0.element(var1, var2, var3, var4);
   }
}
