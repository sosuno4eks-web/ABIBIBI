package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
   @NotNull
   private final SerialKind kind;
   @NotNull
   private final Lazy elementDescriptors$delegate;

   public EnumDescriptor(@NotNull String name, int elementsCount) {
      Intrinsics.checkNotNullParameter(name, "name");
      super(name, (GeneratedSerializer)null, elementsCount, 2, (DefaultConstructorMarker)null);
      this.kind = (SerialKind)SerialKind.ENUM.INSTANCE;
      this.elementDescriptors$delegate = LazyKt.lazy(EnumDescriptor::elementDescriptors_delegate$lambda$0);
   }

   @NotNull
   public SerialKind getKind() {
      return this.kind;
   }

   private final SerialDescriptor[] getElementDescriptors() {
      Lazy var1 = this.elementDescriptors$delegate;
      return (SerialDescriptor[])var1.getValue();
   }

   @NotNull
   public SerialDescriptor getElementDescriptor(int index) {
      SerialDescriptor[] $this$getChecked$iv = this.getElementDescriptors();
      int $i$f$getChecked = false;
      return $this$getChecked$iv[index];
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (other == null) {
         return false;
      } else if (!(other instanceof SerialDescriptor)) {
         return false;
      } else if (((SerialDescriptor)other).getKind() != SerialKind.ENUM.INSTANCE) {
         return false;
      } else if (!Intrinsics.areEqual((Object)this.getSerialName(), (Object)((SerialDescriptor)other).getSerialName())) {
         return false;
      } else {
         return Intrinsics.areEqual((Object)Platform_commonKt.cachedSerialNames((SerialDescriptor)this), (Object)Platform_commonKt.cachedSerialNames((SerialDescriptor)other));
      }
   }

   @NotNull
   public String toString() {
      return CollectionsKt.joinToString$default(SerialDescriptorKt.getElementNames((SerialDescriptor)this), (CharSequence)", ", (CharSequence)(this.getSerialName() + '('), (CharSequence)")", 0, (CharSequence)null, (Function1)null, 56, (Object)null);
   }

   public int hashCode() {
      int result = this.getSerialName().hashCode();
      Iterable $this$elementsHashCodeBy$iv = SerialDescriptorKt.getElementNames((SerialDescriptor)this);
      int $i$f$elementsHashCodeBy = false;
      int initial$iv$iv = 1;
      int $i$f$fold = false;
      int accumulator$iv$iv = initial$iv$iv;

      String it;
      int var16;
      for(Iterator var9 = $this$elementsHashCodeBy$iv.iterator(); var9.hasNext(); accumulator$iv$iv = var16 + (it != null ? it.hashCode() : 0)) {
         Object element$iv$iv = var9.next();
         int var13 = false;
         int var10000 = 31 * accumulator$iv$iv;
         it = (String)element$iv$iv;
         var16 = var10000;
         int var15 = false;
      }

      result = 31 * result + accumulator$iv$iv;
      return result;
   }

   private static final SerialDescriptor[] elementDescriptors_delegate$lambda$0(int $elementsCount, String $name, EnumDescriptor this$0) {
      int var3 = 0;

      SerialDescriptor[] var4;
      for(var4 = new SerialDescriptor[$elementsCount]; var3 < $elementsCount; ++var3) {
         var4[var3] = SerialDescriptorsKt.buildSerialDescriptor$default($name + '.' + this$0.getElementName(var3), (SerialKind)StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], (Function1)null, 8, (Object)null);
      }

      return var4;
   }
}
