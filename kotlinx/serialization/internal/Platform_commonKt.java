package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Platform_commonKt {
   @NotNull
   private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

   @NotNull
   public static final Set<String> cachedSerialNames(@NotNull SerialDescriptor $this$cachedSerialNames) {
      Intrinsics.checkNotNullParameter($this$cachedSerialNames, "<this>");
      if ($this$cachedSerialNames instanceof CachedNames) {
         return ((CachedNames)$this$cachedSerialNames).getSerialNames();
      } else {
         HashSet result = new HashSet($this$cachedSerialNames.getElementsCount());
         int i = 0;

         for(int var3 = $this$cachedSerialNames.getElementsCount(); i < var3; ++i) {
            ((Collection)result).add($this$cachedSerialNames.getElementName(i));
         }

         return (Set)result;
      }
   }

   @NotNull
   public static final SerialDescriptor[] compactArray(@Nullable List<? extends SerialDescriptor> $this$compactArray) {
      int $i$f$toTypedArray = false;
      Collection var4 = (Collection)$this$compactArray;
      List var10000 = var4 != null && !var4.isEmpty() ? $this$compactArray : null;
      SerialDescriptor[] var5;
      if (var10000 != null) {
         Collection $this$toTypedArray$iv = (Collection)var10000;
         $i$f$toTypedArray = false;
         var5 = (SerialDescriptor[])$this$toTypedArray$iv.toArray(new SerialDescriptor[0]);
         if (var5 != null) {
            return var5;
         }
      }

      var5 = EMPTY_DESCRIPTOR_ARRAY;
      return var5;
   }

   @PublishedApi
   @NotNull
   public static final <T> KSerializer<T> cast(@NotNull KSerializer<?> $this$cast) {
      Intrinsics.checkNotNullParameter($this$cast, "<this>");
      int $i$f$cast = false;
      return $this$cast;
   }

   @PublishedApi
   @NotNull
   public static final <T> SerializationStrategy<T> cast(@NotNull SerializationStrategy<?> $this$cast) {
      Intrinsics.checkNotNullParameter($this$cast, "<this>");
      int $i$f$cast = false;
      return $this$cast;
   }

   @PublishedApi
   @NotNull
   public static final <T> DeserializationStrategy<T> cast(@NotNull DeserializationStrategy<?> $this$cast) {
      Intrinsics.checkNotNullParameter($this$cast, "<this>");
      int $i$f$cast = false;
      return $this$cast;
   }

   @NotNull
   public static final Void serializerNotRegistered(@NotNull KClass<?> $this$serializerNotRegistered) {
      Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
      throw new SerializationException(notRegisteredMessage($this$serializerNotRegistered));
   }

   @NotNull
   public static final String notRegisteredMessage(@NotNull KClass<?> $this$notRegisteredMessage) {
      Intrinsics.checkNotNullParameter($this$notRegisteredMessage, "<this>");
      String var10000 = $this$notRegisteredMessage.getSimpleName();
      if (var10000 == null) {
         var10000 = "<local class name not available>";
      }

      return notRegisteredMessage(var10000);
   }

   @NotNull
   public static final String notRegisteredMessage(@NotNull String className) {
      Intrinsics.checkNotNullParameter(className, "className");
      return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
   }

   @NotNull
   public static final KClass<Object> kclass(@NotNull KType $this$kclass) {
      Intrinsics.checkNotNullParameter($this$kclass, "<this>");
      KClassifier t = $this$kclass.getClassifier();
      if (t instanceof KClass) {
         return (KClass)t;
      } else if (t instanceof KTypeParameter) {
         throw new IllegalArgumentException("Captured type parameter " + t + " from generic non-reified function. Such functionality cannot be supported because " + t + " is erased, either specify serializer explicitly or make calling function inline with reified " + t + '.');
      } else {
         throw new IllegalArgumentException("Only KClass supported as classifier, got " + t);
      }
   }

   @NotNull
   public static final KType typeOrThrow(@NotNull KTypeProjection $this$typeOrThrow) {
      Intrinsics.checkNotNullParameter($this$typeOrThrow, "<this>");
      KType var10000 = $this$typeOrThrow.getType();
      if (var10000 == null) {
         int var1 = false;
         String var2 = "Star projections in type arguments are not allowed, but had " + $this$typeOrThrow.getType();
         throw new IllegalArgumentException(var2.toString());
      } else {
         return var10000;
      }
   }

   public static final <T, K> int elementsHashCodeBy(@NotNull Iterable<? extends T> $this$elementsHashCodeBy, @NotNull Function1<? super T, ? extends K> selector) {
      Intrinsics.checkNotNullParameter($this$elementsHashCodeBy, "<this>");
      Intrinsics.checkNotNullParameter(selector, "selector");
      int $i$f$elementsHashCodeBy = false;
      int initial$iv = 1;
      int $i$f$fold = false;
      int accumulator$iv = initial$iv;

      int var10000;
      Object var10001;
      for(Iterator var7 = $this$elementsHashCodeBy.iterator(); var7.hasNext(); accumulator$iv = var10000 + (var10001 != null ? var10001.hashCode() : 0)) {
         Object element$iv = var7.next();
         int var11 = false;
         var10000 = 31 * accumulator$iv;
         var10001 = selector.invoke(element$iv);
      }

      return accumulator$iv;
   }
}
