package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
   @NotNull
   private final String serialName;
   @NotNull
   private final SerialKind kind;
   private final int elementsCount;
   @NotNull
   private final List<Annotation> annotations;
   @NotNull
   private final Set<String> serialNames;
   @NotNull
   private final String[] elementNames;
   @NotNull
   private final SerialDescriptor[] elementDescriptors;
   @NotNull
   private final List<Annotation>[] elementAnnotations;
   @NotNull
   private final boolean[] elementOptionality;
   @NotNull
   private final Map<String, Integer> name2Index;
   @NotNull
   private final SerialDescriptor[] typeParametersDescriptors;
   @NotNull
   private final Lazy _hashCode$delegate;

   public SerialDescriptorImpl(@NotNull String serialName, @NotNull SerialKind kind, int elementsCount, @NotNull List<? extends SerialDescriptor> typeParameters, @NotNull ClassSerialDescriptorBuilder builder) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(kind, "kind");
      Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
      Intrinsics.checkNotNullParameter(builder, "builder");
      super();
      this.serialName = serialName;
      this.kind = kind;
      this.elementsCount = elementsCount;
      this.annotations = builder.getAnnotations();
      this.serialNames = (Set)CollectionsKt.toHashSet((Iterable)builder.getElementNames$kotlinx_serialization_core());
      Collection $this$toTypedArray$iv = (Collection)builder.getElementNames$kotlinx_serialization_core();
      int $i$f$map = false;
      this.elementNames = (String[])$this$toTypedArray$iv.toArray(new String[0]);
      this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
      $this$toTypedArray$iv = (Collection)builder.getElementAnnotations$kotlinx_serialization_core();
      $i$f$map = false;
      this.elementAnnotations = (List[])$this$toTypedArray$iv.toArray(new List[0]);
      this.elementOptionality = CollectionsKt.toBooleanArray((Collection)builder.getElementOptionality$kotlinx_serialization_core());
      Iterable $this$map$iv = ArraysKt.withIndex(this.elementNames);
      $i$f$map = false;
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
      int $i$f$mapTo = false;
      Iterator var11 = $this$map$iv.iterator();

      while(var11.hasNext()) {
         Object item$iv$iv = var11.next();
         IndexedValue it = (IndexedValue)item$iv$iv;
         int var14 = false;
         destination$iv$iv.add(TuplesKt.to(it.getValue(), it.getIndex()));
      }

      this.name2Index = MapsKt.toMap((Iterable)((List)destination$iv$iv));
      this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
      this._hashCode$delegate = LazyKt.lazy(SerialDescriptorImpl::_hashCode_delegate$lambda$1);
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   @NotNull
   public SerialKind getKind() {
      return this.kind;
   }

   public int getElementsCount() {
      return this.elementsCount;
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      return this.annotations;
   }

   @NotNull
   public Set<String> getSerialNames() {
      return this.serialNames;
   }

   private final int get_hashCode() {
      Lazy var1 = this._hashCode$delegate;
      return ((Number)var1.getValue()).intValue();
   }

   @NotNull
   public String getElementName(int index) {
      String[] $this$getChecked$iv = this.elementNames;
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   public int getElementIndex(@NotNull String name) {
      Intrinsics.checkNotNullParameter(name, "name");
      Integer var10000 = (Integer)this.name2Index.get(name);
      return var10000 != null ? var10000 : -3;
   }

   @NotNull
   public List<Annotation> getElementAnnotations(int index) {
      List[] $this$getChecked$iv = this.elementAnnotations;
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   @NotNull
   public SerialDescriptor getElementDescriptor(int index) {
      SerialDescriptor[] $this$getChecked$iv = this.elementDescriptors;
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   public boolean isElementOptional(int index) {
      boolean[] $this$getChecked$iv = this.elementOptionality;
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   public boolean equals(@Nullable Object other) {
      SerialDescriptor $this$equalsImpl$iv = (SerialDescriptor)this;
      Object other$iv = other;
      int $i$f$equalsImpl = false;
      boolean var10000;
      if ($this$equalsImpl$iv == other) {
         var10000 = true;
      } else if (!(other instanceof SerialDescriptorImpl)) {
         var10000 = false;
      } else if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getSerialName(), (Object)((SerialDescriptor)other).getSerialName())) {
         var10000 = false;
      } else {
         SerialDescriptorImpl otherDescriptor = (SerialDescriptorImpl)other;
         int var6 = false;
         if (!Arrays.equals(this.typeParametersDescriptors, otherDescriptor.typeParametersDescriptors)) {
            var10000 = false;
         } else if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor)other).getElementsCount()) {
            var10000 = false;
         } else {
            int index$iv = 0;
            int var8 = $this$equalsImpl$iv.getElementsCount();

            while(true) {
               if (index$iv >= var8) {
                  var10000 = true;
                  break;
               }

               if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), (Object)((SerialDescriptor)other$iv).getElementDescriptor(index$iv).getSerialName())) {
                  var10000 = false;
                  break;
               }

               if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), (Object)((SerialDescriptor)other$iv).getElementDescriptor(index$iv).getKind())) {
                  var10000 = false;
                  break;
               }

               ++index$iv;
            }
         }
      }

      return var10000;
   }

   public int hashCode() {
      return this.get_hashCode();
   }

   @NotNull
   public String toString() {
      return PluginGeneratedSerialDescriptorKt.toStringImpl((SerialDescriptor)this);
   }

   public boolean isNullable() {
      return SerialDescriptor.super.isNullable();
   }

   public boolean isInline() {
      return SerialDescriptor.super.isInline();
   }

   private static final int _hashCode_delegate$lambda$1(SerialDescriptorImpl this$0) {
      return PluginGeneratedSerialDescriptorKt.hashCodeImpl((SerialDescriptor)this$0, this$0.typeParametersDescriptors);
   }
}
