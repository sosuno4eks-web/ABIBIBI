package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PlatformKt {
   public static final <T> T getChecked(@NotNull T[] $this$getChecked, int index) {
      Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
      int $i$f$getChecked = false;
      return $this$getChecked[index];
   }

   public static final boolean getChecked(@NotNull boolean[] $this$getChecked, int index) {
      Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
      int $i$f$getChecked = false;
      return $this$getChecked[index];
   }

   public static final <T> boolean isInterface(@NotNull KClass<T> $this$isInterface) {
      Intrinsics.checkNotNullParameter($this$isInterface, "<this>");
      return JvmClassMappingKt.getJavaClass($this$isInterface).isInterface();
   }

   @Nullable
   public static final <T> KSerializer<T> compiledSerializerImpl(@NotNull KClass<T> $this$compiledSerializerImpl) {
      Intrinsics.checkNotNullParameter($this$compiledSerializerImpl, "<this>");
      return constructSerializerForGivenTypeArgs($this$compiledSerializerImpl);
   }

   @NotNull
   public static final <T, E extends T> E[] toNativeArrayImpl(@NotNull ArrayList<E> $this$toNativeArrayImpl, @NotNull KClass<T> eClass) {
      Intrinsics.checkNotNullParameter($this$toNativeArrayImpl, "<this>");
      Intrinsics.checkNotNullParameter(eClass, "eClass");
      Object var10001 = Array.newInstance(JvmClassMappingKt.getJavaClass(eClass), $this$toNativeArrayImpl.size());
      Intrinsics.checkNotNull(var10001, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
      Object[] var10000 = $this$toNativeArrayImpl.toArray((Object[])var10001);
      Intrinsics.checkNotNullExpressionValue(var10000, "toArray(...)");
      return var10000;
   }

   @NotNull
   public static final Void platformSpecificSerializerNotRegistered(@NotNull KClass<?> $this$platformSpecificSerializerNotRegistered) {
      Intrinsics.checkNotNullParameter($this$platformSpecificSerializerNotRegistered, "<this>");
      Platform_commonKt.serializerNotRegistered($this$platformSpecificSerializerNotRegistered);
      throw new KotlinNothingValueException();
   }

   @NotNull
   public static final Void serializerNotRegistered(@NotNull Class<?> $this$serializerNotRegistered) {
      Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
      throw new SerializationException(Platform_commonKt.notRegisteredMessage(JvmClassMappingKt.getKotlinClass($this$serializerNotRegistered)));
   }

   @Nullable
   public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull KClass<T> $this$constructSerializerForGivenTypeArgs, @NotNull KSerializer<Object>... args) {
      Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
      Intrinsics.checkNotNullParameter(args, "args");
      return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass($this$constructSerializerForGivenTypeArgs), (KSerializer[])Arrays.copyOf(args, args.length));
   }

   @Nullable
   public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull Class<T> $this$constructSerializerForGivenTypeArgs, @NotNull KSerializer<Object>... args) {
      Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
      Intrinsics.checkNotNullParameter(args, "args");
      if ($this$constructSerializerForGivenTypeArgs.isEnum() && isNotAnnotated($this$constructSerializerForGivenTypeArgs)) {
         return createEnumSerializer($this$constructSerializerForGivenTypeArgs);
      } else {
         KSerializer serializer = invokeSerializerOnDefaultCompanion($this$constructSerializerForGivenTypeArgs, (KSerializer[])Arrays.copyOf(args, args.length));
         if (serializer != null) {
            return serializer;
         } else {
            KSerializer fromNamedCompanion = findObjectSerializer($this$constructSerializerForGivenTypeArgs);
            if (fromNamedCompanion != null) {
               int var5 = false;
               return fromNamedCompanion;
            } else {
               fromNamedCompanion = findInNamedCompanion($this$constructSerializerForGivenTypeArgs, (KSerializer[])Arrays.copyOf(args, args.length));
               if (fromNamedCompanion != null) {
                  return fromNamedCompanion;
               } else {
                  return isPolymorphicSerializer($this$constructSerializerForGivenTypeArgs) ? (KSerializer)(new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass($this$constructSerializerForGivenTypeArgs))) : null;
               }
            }
         }
      }
   }

   private static final <T> KSerializer<T> findInNamedCompanion(Class<T> $this$findInNamedCompanion, KSerializer<Object>... args) {
      Object namedCompanion = findNamedCompanionByAnnotation($this$findInNamedCompanion);
      KSerializer var3;
      boolean $i$f$singleOrNull;
      if (namedCompanion != null) {
         var3 = invokeSerializerOnCompanion(namedCompanion, (KSerializer[])Arrays.copyOf(args, args.length));
         if (var3 != null) {
            $i$f$singleOrNull = false;
            return var3;
         }
      }

      try {
         Class[] var10000 = $this$findInNamedCompanion.getDeclaredClasses();
         Intrinsics.checkNotNullExpressionValue(var10000, "getDeclaredClasses(...)");
         Object[] $this$singleOrNull$iv = (Object[])var10000;
         $i$f$singleOrNull = false;
         Object single$iv = null;
         boolean found$iv = false;
         int var9 = 0;
         int var10 = $this$singleOrNull$iv.length;

         Object var17;
         while(true) {
            if (var9 >= var10) {
               var17 = !found$iv ? null : single$iv;
               break;
            }

            Object element$iv = $this$singleOrNull$iv[var9];
            Class it = (Class)element$iv;
            int var13 = false;
            if (Intrinsics.areEqual((Object)it.getSimpleName(), (Object)"$serializer")) {
               if (found$iv) {
                  var17 = null;
                  break;
               }

               single$iv = element$iv;
               found$iv = true;
            }

            ++var9;
         }

         label37: {
            Class var4 = (Class)var17;
            if (var4 != null) {
               Field var16 = var4.getField("INSTANCE");
               if (var16 != null) {
                  var17 = var16.get((Object)null);
                  break label37;
               }
            }

            var17 = null;
         }

         Object var15 = var17;
         var3 = var15 instanceof KSerializer ? (KSerializer)var15 : null;
      } catch (NoSuchFieldException var14) {
         var3 = null;
      }

      return var3;
   }

   private static final <T> Object findNamedCompanionByAnnotation(Class<T> $this$findNamedCompanionByAnnotation) {
      Class[] var10000 = $this$findNamedCompanionByAnnotation.getDeclaredClasses();
      Intrinsics.checkNotNullExpressionValue(var10000, "getDeclaredClasses(...)");
      Object[] $this$firstOrNull$iv = (Object[])var10000;
      int $i$f$firstOrNull = false;
      int var4 = 0;
      int var5 = $this$firstOrNull$iv.length;

      Object var9;
      while(true) {
         if (var4 >= var5) {
            var9 = null;
            break;
         }

         Object element$iv = $this$firstOrNull$iv[var4];
         Class clazz = (Class)element$iv;
         int var8 = false;
         if (clazz.getAnnotation(NamedCompanion.class) != null) {
            var9 = element$iv;
            break;
         }

         ++var4;
      }

      Class var10 = (Class)var9;
      if ((Class)var9 == null) {
         return null;
      } else {
         Class companionClass = var10;
         String var10001 = companionClass.getSimpleName();
         Intrinsics.checkNotNullExpressionValue(var10001, "getSimpleName(...)");
         return companionOrNull($this$findNamedCompanionByAnnotation, var10001);
      }
   }

   private static final <T> boolean isNotAnnotated(Class<T> $this$isNotAnnotated) {
      return $this$isNotAnnotated.getAnnotation(Serializable.class) == null && $this$isNotAnnotated.getAnnotation(Polymorphic.class) == null;
   }

   private static final <T> boolean isPolymorphicSerializer(Class<T> $this$isPolymorphicSerializer) {
      if ($this$isPolymorphicSerializer.getAnnotation(Polymorphic.class) != null) {
         return true;
      } else {
         Serializable serializable = (Serializable)$this$isPolymorphicSerializer.getAnnotation(Serializable.class);
         return serializable != null && Intrinsics.areEqual((Object)Reflection.getOrCreateKotlinClass(serializable.with()), (Object)Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class));
      }
   }

   private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> jClass, KSerializer<Object>... args) {
      Object var10000 = companionOrNull(jClass, "Companion");
      if (var10000 == null) {
         return null;
      } else {
         Object companion = var10000;
         return invokeSerializerOnCompanion(companion, (KSerializer[])Arrays.copyOf(args, args.length));
      }
   }

   private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object companion, KSerializer<Object>... args) {
      KSerializer var2;
      try {
         Class[] var13;
         if (args.length == 0) {
            var13 = new Class[0];
         } else {
            int var3 = 0;
            int var11 = args.length;

            Class[] var5;
            for(var5 = new Class[var11]; var3 < var11; ++var3) {
               var5[var3] = KSerializer.class;
            }

            var13 = var5;
         }

         Class[] types = var13;
         Object var10 = companion.getClass().getDeclaredMethod("serializer", (Class[])Arrays.copyOf(types, types.length)).invoke(companion, Arrays.copyOf(args, args.length));
         var2 = var10 instanceof KSerializer ? (KSerializer)var10 : null;
      } catch (NoSuchMethodException var7) {
         var2 = null;
      } catch (InvocationTargetException var8) {
         Throwable var10000 = var8.getCause();
         if (var10000 == null) {
            throw var8;
         }

         Throwable cause = var10000;
         InvocationTargetException var12 = new InvocationTargetException;
         String var10003 = cause.getMessage();
         if (var10003 == null) {
            var10003 = var8.getMessage();
         }

         var12.<init>(cause, var10003);
         throw var12;
      }

      return var2;
   }

   private static final Object companionOrNull(Class<?> $this$companionOrNull, String companionName) {
      Object var2;
      try {
         Field companion = $this$companionOrNull.getDeclaredField(companionName);
         companion.setAccessible(true);
         var2 = companion.get((Object)null);
      } catch (Throwable var4) {
         var2 = null;
      }

      return var2;
   }

   private static final <T> KSerializer<T> createEnumSerializer(Class<T> $this$createEnumSerializer) {
      Object[] constants = $this$createEnumSerializer.getEnumConstants();
      String var10002 = $this$createEnumSerializer.getCanonicalName();
      Intrinsics.checkNotNullExpressionValue(var10002, "getCanonicalName(...)");
      Intrinsics.checkNotNull(constants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
      return (KSerializer)(new EnumSerializer(var10002, (Enum[])constants));
   }

   private static final <T> KSerializer<T> findObjectSerializer(Class<T> $this$findObjectSerializer) {
      String var10000 = $this$findObjectSerializer.getCanonicalName();
      boolean $i$f$singleOrNull;
      boolean var23;
      if (var10000 != null) {
         String it = var10000;
         $i$f$singleOrNull = false;
         var23 = !StringsKt.startsWith$default(it, "java.", false, 2, (Object)null) && !StringsKt.startsWith$default(it, "kotlin.", false, 2, (Object)null);
      } else {
         var23 = false;
      }

      if (!var23) {
         return null;
      } else {
         Field[] var24 = $this$findObjectSerializer.getDeclaredFields();
         Intrinsics.checkNotNullExpressionValue(var24, "getDeclaredFields(...)");
         Object[] $this$singleOrNull$iv = (Object[])var24;
         $i$f$singleOrNull = false;
         Object single$iv = null;
         boolean found$iv = false;
         int var7 = 0;
         int var8 = $this$singleOrNull$iv.length;

         Object var25;
         while(true) {
            if (var7 >= var8) {
               var25 = !found$iv ? null : single$iv;
               break;
            }

            Object element$iv = $this$singleOrNull$iv[var7];
            Field it = (Field)element$iv;
            int var11 = false;
            if (Intrinsics.areEqual((Object)it.getName(), (Object)"INSTANCE") && Intrinsics.areEqual((Object)it.getType(), (Object)$this$findObjectSerializer) && Modifier.isStatic(it.getModifiers())) {
               if (found$iv) {
                  var25 = null;
                  break;
               }

               single$iv = element$iv;
               found$iv = true;
            }

            ++var7;
         }

         Field var26 = (Field)var25;
         if ((Field)var25 == null) {
            return null;
         } else {
            Field field = var26;
            Object instance = field.get((Object)null);
            Method[] var27 = $this$findObjectSerializer.getMethods();
            Intrinsics.checkNotNullExpressionValue(var27, "getMethods(...)");
            Object[] $this$singleOrNull$iv = (Object[])var27;
            found$iv = false;
            Object single$iv = null;
            boolean found$iv = false;
            int var20 = 0;
            int var21 = $this$singleOrNull$iv.length;

            while(true) {
               if (var20 >= var21) {
                  var25 = !found$iv ? null : single$iv;
                  break;
               }

               Object element$iv;
               label79: {
                  element$iv = $this$singleOrNull$iv[var20];
                  Method it = (Method)element$iv;
                  int var13 = false;
                  if (Intrinsics.areEqual((Object)it.getName(), (Object)"serializer")) {
                     Class[] var28 = it.getParameterTypes();
                     Intrinsics.checkNotNullExpressionValue(var28, "getParameterTypes(...)");
                     if (((Object[])var28).length == 0 && Intrinsics.areEqual((Object)it.getReturnType(), (Object)KSerializer.class)) {
                        var23 = true;
                        break label79;
                     }
                  }

                  var23 = false;
               }

               if (var23) {
                  if (found$iv) {
                     var25 = null;
                     break;
                  }

                  single$iv = element$iv;
                  found$iv = true;
               }

               ++var20;
            }

            Method var29 = (Method)var25;
            if ((Method)var25 == null) {
               return null;
            } else {
               Method method = var29;
               Object result = method.invoke(instance);
               return result instanceof KSerializer ? (KSerializer)result : null;
            }
         }
      }
   }

   public static final boolean isReferenceArray(@NotNull KClass<Object> rootClass) {
      Intrinsics.checkNotNullParameter(rootClass, "rootClass");
      return JvmClassMappingKt.getJavaClass(rootClass).isArray();
   }

   @NotNull
   public static final Map<KClass<?>, KSerializer<?>> initBuiltins() {
      Map var0 = MapsKt.createMapBuilder();
      Map $this$initBuiltins_u24lambda_u2415 = var0;
      int var2 = false;
      var0.put(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.Companion));
      var0.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.Companion));
      var0.put(Reflection.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.Companion));
      var0.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.Companion));
      var0.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
      var0.put(Reflection.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE));
      var0.put(Reflection.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer());
      boolean var3 = false;

      boolean var4;
      try {
         var4 = false;
         $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.Companion));
      } catch (NoClassDefFoundError var21) {
      } catch (ClassNotFoundException var22) {
      }

      Map $this$initBuiltins_u24lambda_u2415_u24lambda_u2412 = var0;
      int var5 = false;
      boolean var6 = false;

      boolean var7;
      try {
         var7 = false;
         $this$initBuiltins_u24lambda_u2415_u24lambda_u2412.put(Reflection.getOrCreateKotlinClass(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer());
      } catch (NoClassDefFoundError var19) {
      } catch (ClassNotFoundException var20) {
      }

      var6 = false;

      try {
         var7 = false;
         $this$initBuiltins_u24lambda_u2415_u24lambda_u2412.put(Reflection.getOrCreateKotlinClass(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer());
      } catch (NoClassDefFoundError var17) {
      } catch (ClassNotFoundException var18) {
      }

      var6 = false;

      try {
         var7 = false;
         $this$initBuiltins_u24lambda_u2415_u24lambda_u2412.put(Reflection.getOrCreateKotlinClass(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer());
      } catch (NoClassDefFoundError var15) {
      } catch (ClassNotFoundException var16) {
      }

      var6 = false;

      try {
         var7 = false;
         $this$initBuiltins_u24lambda_u2415_u24lambda_u2412.put(Reflection.getOrCreateKotlinClass(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer());
      } catch (NoClassDefFoundError var13) {
      } catch (ClassNotFoundException var14) {
      }

      var3 = false;

      try {
         var4 = false;
         $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Uuid.class), BuiltinSerializersKt.serializer(Uuid.Companion));
      } catch (NoClassDefFoundError var11) {
      } catch (ClassNotFoundException var12) {
      }

      var3 = false;

      try {
         var4 = false;
         $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Instant.class), BuiltinSerializersKt.serializer(Instant.Companion));
      } catch (NoClassDefFoundError var9) {
      } catch (ClassNotFoundException var10) {
      }

      return MapsKt.build(var0);
   }

   private static final void loadSafe(Function0<Unit> block) {
      boolean var1 = false;

      try {
         block.invoke();
      } catch (NoClassDefFoundError var3) {
      } catch (ClassNotFoundException var4) {
      }

   }
}
