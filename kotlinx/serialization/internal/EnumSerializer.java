package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PublishedApi
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {
   @NotNull
   private final T[] values;
   @Nullable
   private SerialDescriptor overriddenDescriptor;
   @NotNull
   private final Lazy descriptor$delegate;

   public EnumSerializer(@NotNull String serialName, @NotNull T[] values) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(values, "values");
      super();
      this.values = values;
      this.descriptor$delegate = LazyKt.lazy(EnumSerializer::descriptor_delegate$lambda$0);
   }

   public EnumSerializer(@NotNull String serialName, @NotNull T[] values, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      Intrinsics.checkNotNullParameter(values, "values");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      this(serialName, values);
      this.overriddenDescriptor = descriptor;
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      Lazy var1 = this.descriptor$delegate;
      return (SerialDescriptor)var1.getValue();
   }

   private final SerialDescriptor createUnmarkedDescriptor(String serialName) {
      EnumDescriptor d = new EnumDescriptor(serialName, this.values.length);
      Object[] $this$forEach$iv = this.values;
      int $i$f$forEach = false;
      int var5 = 0;

      for(int var6 = $this$forEach$iv.length; var5 < var6; ++var5) {
         Object element$iv = $this$forEach$iv[var5];
         int var9 = false;
         PluginGeneratedSerialDescriptor.addElement$default((PluginGeneratedSerialDescriptor)d, element$iv.name(), false, 2, (Object)null);
      }

      return (SerialDescriptor)d;
   }

   public void serialize(@NotNull Encoder encoder, @NotNull T value) {
      Intrinsics.checkNotNullParameter(encoder, "encoder");
      Intrinsics.checkNotNullParameter(value, "value");
      int index = ArraysKt.indexOf(this.values, value);
      if (index == -1) {
         StringBuilder var10002 = (new StringBuilder()).append(value).append(" is not a valid enum ").append(this.getDescriptor().getSerialName()).append(", must be one of ");
         String var10003 = Arrays.toString(this.values);
         Intrinsics.checkNotNullExpressionValue(var10003, "toString(...)");
         throw new SerializationException(var10002.append(var10003).toString());
      } else {
         encoder.encodeEnum(this.getDescriptor(), index);
      }
   }

   @NotNull
   public T deserialize(@NotNull Decoder decoder) {
      Intrinsics.checkNotNullParameter(decoder, "decoder");
      int index = decoder.decodeEnum(this.getDescriptor());
      if (!(0 <= index ? index < this.values.length : false)) {
         throw new SerializationException(index + " is not among valid " + this.getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
      } else {
         return this.values[index];
      }
   }

   @NotNull
   public String toString() {
      return "kotlinx.serialization.internal.EnumSerializer<" + this.getDescriptor().getSerialName() + '>';
   }

   private static final SerialDescriptor descriptor_delegate$lambda$0(EnumSerializer this$0, String $serialName) {
      SerialDescriptor var10000 = this$0.overriddenDescriptor;
      if (var10000 == null) {
         var10000 = this$0.createUnmarkedDescriptor($serialName);
      }

      return var10000;
   }
}
