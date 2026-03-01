package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class TypesJVMKt {
   @NotNull
   public static final Type getJavaType(@NotNull KType $this$javaType) {
      Intrinsics.checkNotNullParameter($this$javaType, "<this>");
      if ($this$javaType instanceof KTypeBase) {
         Type var1 = ((KTypeBase)$this$javaType).getJavaType();
         if (var1 != null) {
            int var3 = false;
            return var1;
         }
      }

      return computeJavaType$default($this$javaType, false, 1, (Object)null);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   @ExperimentalStdlibApi
   @LowPriorityInOverloadResolution
   public static void getJavaType$annotations(KType <this>) {
   }

   @ExperimentalStdlibApi
   private static final Type computeJavaType(KType $this$computeJavaType, boolean forceWrapper) {
      KClassifier classifier = $this$computeJavaType.getClassifier();
      if (classifier instanceof KTypeParameter) {
         return (Type)(new TypeVariableImpl((KTypeParameter)classifier));
      } else if (classifier instanceof KClass) {
         Class jClass = forceWrapper ? JvmClassMappingKt.getJavaObjectType((KClass)classifier) : JvmClassMappingKt.getJavaClass((KClass)classifier);
         List arguments = $this$computeJavaType.getArguments();
         if (arguments.isEmpty()) {
            return (Type)jClass;
         } else if (jClass.isArray()) {
            if (jClass.getComponentType().isPrimitive()) {
               return (Type)jClass;
            } else {
               KTypeProjection var10000 = (KTypeProjection)CollectionsKt.singleOrNull(arguments);
               if (var10000 == null) {
                  throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + $this$computeJavaType);
               } else {
                  KTypeProjection var5 = var10000;
                  KVariance variance = var5.component1();
                  KType elementType = var5.component2();
                  Type var9;
                  switch(variance == null ? -1 : TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
                  case -1:
                  case 1:
                     var9 = (Type)jClass;
                     break;
                  case 0:
                  default:
                     throw new NoWhenBranchMatchedException();
                  case 2:
                  case 3:
                     Intrinsics.checkNotNull(elementType);
                     Type javaElementType = computeJavaType$default(elementType, false, 1, (Object)null);
                     var9 = javaElementType instanceof Class ? (Type)jClass : (Type)(new GenericArrayTypeImpl(javaElementType));
                  }

                  return var9;
               }
            }
         } else {
            return createPossiblyInnerType(jClass, arguments);
         }
      } else {
         throw new UnsupportedOperationException("Unsupported type classifier: " + $this$computeJavaType);
      }
   }

   // $FF: synthetic method
   static Type computeJavaType$default(KType var0, boolean var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = false;
      }

      return computeJavaType(var0, var1);
   }

   @ExperimentalStdlibApi
   private static final Type createPossiblyInnerType(Class<?> jClass, List<KTypeProjection> arguments) {
      Class var10000 = jClass.getDeclaringClass();
      Iterable $this$map$iv;
      boolean $i$f$map;
      Collection destination$iv$iv;
      boolean $i$f$mapTo;
      Iterator var9;
      Object item$iv$iv;
      KTypeProjection p0;
      boolean var12;
      Type var14;
      List var15;
      if (var10000 == null) {
         $this$map$iv = (Iterable)arguments;
         var14 = null;
         $i$f$map = false;
         destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
         $i$f$mapTo = false;
         var9 = $this$map$iv.iterator();

         while(var9.hasNext()) {
            item$iv$iv = var9.next();
            p0 = (KTypeProjection)item$iv$iv;
            var12 = false;
            destination$iv$iv.add(getJavaType(p0));
         }

         var15 = (List)destination$iv$iv;
         return (Type)(new ParameterizedTypeImpl(jClass, var14, var15));
      } else {
         Class ownerClass = var10000;
         Type var10001;
         if (Modifier.isStatic(jClass.getModifiers())) {
            var10001 = (Type)ownerClass;
            Iterable $this$map$iv = (Iterable)arguments;
            var14 = var10001;
            int $i$f$map = false;
            Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            int $i$f$mapTo = false;
            Iterator var28 = $this$map$iv.iterator();

            while(var28.hasNext()) {
               Object item$iv$iv = var28.next();
               KTypeProjection p0 = (KTypeProjection)item$iv$iv;
               int var31 = false;
               destination$iv$iv.add(getJavaType(p0));
            }

            var15 = (List)destination$iv$iv;
            return (Type)(new ParameterizedTypeImpl(jClass, var14, var15));
         } else {
            int n = jClass.getTypeParameters().length;
            var10001 = createPossiblyInnerType(ownerClass, arguments.subList(n, arguments.size()));
            $this$map$iv = (Iterable)arguments.subList(0, n);
            var14 = var10001;
            $i$f$map = false;
            destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            $i$f$mapTo = false;
            var9 = $this$map$iv.iterator();

            while(var9.hasNext()) {
               item$iv$iv = var9.next();
               p0 = (KTypeProjection)item$iv$iv;
               var12 = false;
               destination$iv$iv.add(getJavaType(p0));
            }

            var15 = (List)destination$iv$iv;
            return (Type)(new ParameterizedTypeImpl(jClass, var14, var15));
         }
      }
   }

   private static final Type getJavaType(KTypeProjection $this$javaType) {
      KVariance var10000 = $this$javaType.getVariance();
      if (var10000 == null) {
         return (Type)WildcardTypeImpl.Companion.getSTAR();
      } else {
         KVariance variance = var10000;
         KType var3 = $this$javaType.getType();
         Intrinsics.checkNotNull(var3);
         KType type = var3;
         Type var4;
         switch(TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
         case 1:
            var4 = (Type)(new WildcardTypeImpl((Type)null, computeJavaType(type, true)));
            break;
         case 2:
            var4 = computeJavaType(type, true);
            break;
         case 3:
            var4 = (Type)(new WildcardTypeImpl(computeJavaType(type, true), (Type)null));
            break;
         default:
            throw new NoWhenBranchMatchedException();
         }

         return var4;
      }
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalStdlibApi
   private static void getJavaType$annotations(KTypeProjection <this>) {
   }

   private static final String typeToString(Type type) {
      String var10000;
      if (type instanceof Class) {
         if (((Class)type).isArray()) {
            Sequence unwrap = SequencesKt.generateSequence(type, (Function1)null.INSTANCE);
            var10000 = ((Class)SequencesKt.last(unwrap)).getName() + StringsKt.repeat((CharSequence)"[]", SequencesKt.count(unwrap));
         } else {
            var10000 = ((Class)type).getName();
            Intrinsics.checkNotNullExpressionValue(var10000, "getName(...)");
         }
      } else {
         var10000 = type.toString();
      }

      return var10000;
   }

   // $FF: synthetic method
   public static final Type access$computeJavaType(KType $receiver, boolean forceWrapper) {
      return computeJavaType($receiver, forceWrapper);
   }

   // $FF: synthetic method
   public static final String access$typeToString(Type type) {
      return typeToString(type);
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[KVariance.values().length];

         try {
            var0[KVariance.IN.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[KVariance.INVARIANT.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[KVariance.OUT.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
