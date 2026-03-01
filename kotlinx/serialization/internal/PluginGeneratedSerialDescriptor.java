package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
   @NotNull
   private final String serialName;
   @Nullable
   private final GeneratedSerializer<?> generatedSerializer;
   private final int elementsCount;
   private int added;
   @NotNull
   private final String[] names;
   @NotNull
   private final List<Annotation>[] propertiesAnnotations;
   @Nullable
   private List<Annotation> classAnnotations;
   @NotNull
   private final boolean[] elementsOptionality;
   @NotNull
   private Map<String, Integer> indices;
   @NotNull
   private final Lazy childSerializers$delegate;
   @NotNull
   private final Lazy typeParameterDescriptors$delegate;
   @NotNull
   private final Lazy _hashCode$delegate;

   public PluginGeneratedSerialDescriptor(@NotNull String serialName, @Nullable GeneratedSerializer<?> generatedSerializer, int elementsCount) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      super();
      this.serialName = serialName;
      this.generatedSerializer = generatedSerializer;
      this.elementsCount = elementsCount;
      this.added = -1;
      int var4 = 0;
      int var5 = this.elementsCount;

      String[] var6;
      for(var6 = new String[var5]; var4 < var5; ++var4) {
         var6[var4] = "[UNINITIALIZED]";
      }

      this.names = var6;
      this.propertiesAnnotations = new List[this.elementsCount];
      this.elementsOptionality = new boolean[this.elementsCount];
      this.indices = MapsKt.emptyMap();
      this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, PluginGeneratedSerialDescriptor::childSerializers_delegate$lambda$0);
      this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, PluginGeneratedSerialDescriptor::typeParameterDescriptors_delegate$lambda$2);
      this._hashCode$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, PluginGeneratedSerialDescriptor::_hashCode_delegate$lambda$3);
   }

   // $FF: synthetic method
   public PluginGeneratedSerialDescriptor(String var1, GeneratedSerializer var2, int var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      this(var1, var2, var3);
   }

   @NotNull
   public String getSerialName() {
      return this.serialName;
   }

   public final int getElementsCount() {
      return this.elementsCount;
   }

   @NotNull
   public SerialKind getKind() {
      return (SerialKind)StructureKind.CLASS.INSTANCE;
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      List var10000 = this.classAnnotations;
      if (var10000 == null) {
         var10000 = CollectionsKt.emptyList();
      }

      return var10000;
   }

   @NotNull
   public Set<String> getSerialNames() {
      return this.indices.keySet();
   }

   private final KSerializer<?>[] getChildSerializers() {
      Lazy var1 = this.childSerializers$delegate;
      return (KSerializer[])var1.getValue();
   }

   @NotNull
   public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
      Lazy var1 = this.typeParameterDescriptors$delegate;
      return (SerialDescriptor[])var1.getValue();
   }

   private final int get_hashCode() {
      Lazy var1 = this._hashCode$delegate;
      return ((Number)var1.getValue()).intValue();
   }

   public final void addElement(@NotNull String name, boolean isOptional) {
      Intrinsics.checkNotNullParameter(name, "name");
      String[] var10000 = this.names;
      ++this.added;
      var10000[this.added] = name;
      this.elementsOptionality[this.added] = isOptional;
      this.propertiesAnnotations[this.added] = null;
      if (this.added == this.elementsCount - 1) {
         this.indices = this.buildIndices();
      }

   }

   // $FF: synthetic method
   public static void addElement$default(PluginGeneratedSerialDescriptor var0, String var1, boolean var2, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
      } else {
         if ((var3 & 2) != 0) {
            var2 = false;
         }

         var0.addElement(var1, var2);
      }
   }

   public final void pushAnnotation(@NotNull Annotation annotation) {
      Intrinsics.checkNotNullParameter(annotation, "annotation");
      List it = this.propertiesAnnotations[this.added];
      int var4 = false;
      List var10000;
      if (it == null) {
         ArrayList result = new ArrayList(1);
         this.propertiesAnnotations[this.added] = result;
         var10000 = (List)result;
      } else {
         var10000 = it;
      }

      List list = var10000;
      list.add(annotation);
   }

   public final void pushClassAnnotation(@NotNull Annotation a) {
      Intrinsics.checkNotNullParameter(a, "a");
      if (this.classAnnotations == null) {
         this.classAnnotations = (List)(new ArrayList(1));
      }

      List var10000 = this.classAnnotations;
      Intrinsics.checkNotNull(var10000);
      var10000.add(a);
   }

   @NotNull
   public SerialDescriptor getElementDescriptor(int index) {
      KSerializer[] $this$getChecked$iv = this.getChildSerializers();
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index].getDescriptor();
   }

   public boolean isElementOptional(int index) {
      boolean[] $this$getChecked$iv = this.elementsOptionality;
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   @NotNull
   public List<Annotation> getElementAnnotations(int index) {
      List[] $this$getChecked$iv = this.propertiesAnnotations;
      int $i$f$getChecked = false;
      List var10000 = $this$getChecked$iv[index];
      if ($this$getChecked$iv[index] == null) {
         var10000 = CollectionsKt.emptyList();
      }

      return var10000;
   }

   @NotNull
   public String getElementName(int index) {
      String[] $this$getChecked$iv = this.names;
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   public int getElementIndex(@NotNull String name) {
      Intrinsics.checkNotNullParameter(name, "name");
      Integer var10000 = (Integer)this.indices.get(name);
      return var10000 != null ? var10000 : -3;
   }

   private final Map<String, Integer> buildIndices() {
      HashMap indices = new HashMap();
      int i = 0;

      for(int var3 = this.names.length; i < var3; ++i) {
         ((Map)indices).put(this.names[i], i);
      }

      return (Map)indices;
   }

   public boolean equals(@Nullable Object other) {
      SerialDescriptor $this$equalsImpl$iv = (SerialDescriptor)this;
      Object other$iv = other;
      int $i$f$equalsImpl = false;
      boolean var10000;
      if ($this$equalsImpl$iv == other) {
         var10000 = true;
      } else if (!(other instanceof PluginGeneratedSerialDescriptor)) {
         var10000 = false;
      } else if (!Intrinsics.areEqual((Object)$this$equalsImpl$iv.getSerialName(), (Object)((SerialDescriptor)other).getSerialName())) {
         var10000 = false;
      } else {
         PluginGeneratedSerialDescriptor otherDescriptor = (PluginGeneratedSerialDescriptor)other;
         int var6 = false;
         if (!Arrays.equals(this.getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core())) {
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

   private static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor this$0) {
      GeneratedSerializer var10000 = this$0.generatedSerializer;
      KSerializer[] var1;
      if (var10000 != null) {
         var1 = var10000.childSerializers();
         if (var1 != null) {
            return var1;
         }
      }

      var1 = PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
      return var1;
   }

   private static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor this$0) {
      GeneratedSerializer var10000 = this$0.generatedSerializer;
      List var13;
      if (var10000 != null) {
         KSerializer[] var12 = var10000.typeParametersSerializers();
         if (var12 != null) {
            Object[] $this$map$iv = var12;
            int $i$f$map = false;
            KSerializer[] $this$mapTo$iv$iv = $this$map$iv;
            Collection destination$iv$iv = (Collection)(new ArrayList($this$map$iv.length));
            int $i$f$mapTo = false;
            int var6 = 0;

            for(int var7 = $this$map$iv.length; var6 < var7; ++var6) {
               Object item$iv$iv = $this$mapTo$iv$iv[var6];
               int var10 = false;
               destination$iv$iv.add(item$iv$iv.getDescriptor());
            }

            var13 = (List)destination$iv$iv;
            return Platform_commonKt.compactArray(var13);
         }
      }

      var13 = null;
      return Platform_commonKt.compactArray(var13);
   }

   private static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor this$0) {
      return PluginGeneratedSerialDescriptorKt.hashCodeImpl((SerialDescriptor)this$0, this$0.getTypeParameterDescriptors$kotlinx_serialization_core());
   }
}
