package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "JvmClassMappingKt"
)
public final class JvmClassMappingKt {
   @JvmName(
      name = "getJavaClass"
   )
   @NotNull
   public static final <T> Class<T> getJavaClass(@NotNull KClass<T> $this$java) {
      Intrinsics.checkNotNullParameter($this$java, "<this>");
      Class var10000 = ((ClassBasedDeclarationContainer)$this$java).getJClass();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   public static void getJavaClass$annotations(KClass <this>) {
   }

   @Nullable
   public static final <T> Class<T> getJavaPrimitiveType(@NotNull KClass<T> $this$javaPrimitiveType) {
      Intrinsics.checkNotNullParameter($this$javaPrimitiveType, "<this>");
      Class thisJClass = ((ClassBasedDeclarationContainer)$this$javaPrimitiveType).getJClass();
      if (thisJClass.isPrimitive()) {
         Intrinsics.checkNotNull(thisJClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
         return thisJClass;
      } else {
         String var2 = thisJClass.getName();
         Class var10000;
         if (var2 != null) {
            switch(var2.hashCode()) {
            case -2056817302:
               if (var2.equals("java.lang.Integer")) {
                  var10000 = Integer.TYPE;
                  return var10000;
               }
               break;
            case -527879800:
               if (var2.equals("java.lang.Float")) {
                  var10000 = Float.TYPE;
                  return var10000;
               }
               break;
            case -515992664:
               if (var2.equals("java.lang.Short")) {
                  var10000 = Short.TYPE;
                  return var10000;
               }
               break;
            case 155276373:
               if (var2.equals("java.lang.Character")) {
                  var10000 = Character.TYPE;
                  return var10000;
               }
               break;
            case 344809556:
               if (var2.equals("java.lang.Boolean")) {
                  var10000 = Boolean.TYPE;
                  return var10000;
               }
               break;
            case 398507100:
               if (var2.equals("java.lang.Byte")) {
                  var10000 = Byte.TYPE;
                  return var10000;
               }
               break;
            case 398795216:
               if (var2.equals("java.lang.Long")) {
                  var10000 = Long.TYPE;
                  return var10000;
               }
               break;
            case 399092968:
               if (var2.equals("java.lang.Void")) {
                  var10000 = Void.TYPE;
                  return var10000;
               }
               break;
            case 761287205:
               if (var2.equals("java.lang.Double")) {
                  var10000 = Double.TYPE;
                  return var10000;
               }
            }
         }

         var10000 = null;
         return var10000;
      }
   }

   @NotNull
   public static final <T> Class<T> getJavaObjectType(@NotNull KClass<T> $this$javaObjectType) {
      Intrinsics.checkNotNullParameter($this$javaObjectType, "<this>");
      Class thisJClass = ((ClassBasedDeclarationContainer)$this$javaObjectType).getJClass();
      if (!thisJClass.isPrimitive()) {
         Intrinsics.checkNotNull(thisJClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
         return thisJClass;
      } else {
         Class var10000;
         label52: {
            String var2 = thisJClass.getName();
            if (var2 != null) {
               switch(var2.hashCode()) {
               case -1325958191:
                  if (var2.equals("double")) {
                     var10000 = Double.class;
                     break label52;
                  }
                  break;
               case 104431:
                  if (var2.equals("int")) {
                     var10000 = Integer.class;
                     break label52;
                  }
                  break;
               case 3039496:
                  if (var2.equals("byte")) {
                     var10000 = Byte.class;
                     break label52;
                  }
                  break;
               case 3052374:
                  if (var2.equals("char")) {
                     var10000 = Character.class;
                     break label52;
                  }
                  break;
               case 3327612:
                  if (var2.equals("long")) {
                     var10000 = Long.class;
                     break label52;
                  }
                  break;
               case 3625364:
                  if (var2.equals("void")) {
                     var10000 = Void.class;
                     break label52;
                  }
                  break;
               case 64711720:
                  if (var2.equals("boolean")) {
                     var10000 = Boolean.class;
                     break label52;
                  }
                  break;
               case 97526364:
                  if (var2.equals("float")) {
                     var10000 = Float.class;
                     break label52;
                  }
                  break;
               case 109413500:
                  if (var2.equals("short")) {
                     var10000 = Short.class;
                     break label52;
                  }
               }
            }

            var10000 = thisJClass;
         }

         Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
         return var10000;
      }
   }

   @JvmName(
      name = "getKotlinClass"
   )
   @NotNull
   public static final <T> KClass<T> getKotlinClass(@NotNull Class<T> $this$kotlin) {
      Intrinsics.checkNotNullParameter($this$kotlin, "<this>");
      return Reflection.getOrCreateKotlinClass($this$kotlin);
   }

   @NotNull
   public static final <T> Class<T> getJavaClass(@NotNull T $this$javaClass) {
      Intrinsics.checkNotNullParameter($this$javaClass, "<this>");
      int $i$f$getJavaClass = false;
      Class var10000 = $this$javaClass.getClass();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
      return var10000;
   }

   /** @deprecated */
   @JvmName(
      name = "getRuntimeClassOfKClassInstance"
   )
   @NotNull
   public static final <T> Class<KClass<T>> getRuntimeClassOfKClassInstance(@NotNull KClass<T> $this$javaClass) {
      Intrinsics.checkNotNullParameter($this$javaClass, "<this>");
      int $i$f$getRuntimeClassOfKClassInstance = false;
      Class var10000 = ((Object)$this$javaClass).getClass();
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @Deprecated(
      message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.",
      replaceWith = @ReplaceWith(
   expression = "(this as Any).javaClass",
   imports = {}
),
      level = DeprecationLevel.ERROR
   )
   public static void getRuntimeClassOfKClassInstance$annotations(KClass <this>) {
   }

   // $FF: synthetic method
   public static final boolean isArrayOf(Object[] $this$isArrayOf) {
      Intrinsics.checkNotNullParameter($this$isArrayOf, "<this>");
      Intrinsics.reifiedOperationMarker(4, "T");
      return ((Class)Object.class).isAssignableFrom(((Class)$this$isArrayOf.getClass()).getComponentType());
   }

   @NotNull
   public static final <T extends Annotation> KClass<? extends T> getAnnotationClass(@NotNull T $this$annotationClass) {
      Intrinsics.checkNotNullParameter($this$annotationClass, "<this>");
      Class var10000 = $this$annotationClass.annotationType();
      Intrinsics.checkNotNullExpressionValue(var10000, "annotationType(...)");
      KClass var1 = getKotlinClass(var10000);
      Intrinsics.checkNotNull(var1, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
      return var1;
   }

   private static final <E extends Enum<E>> Class<E> getDeclaringJavaClass(Enum<E> $this$declaringJavaClass) {
      Intrinsics.checkNotNullParameter($this$declaringJavaClass, "<this>");
      Class var10000 = $this$declaringJavaClass.getDeclaringClass();
      Intrinsics.checkNotNullExpressionValue(var10000, "getDeclaringClass(...)");
      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.7"
   )
   @InlineOnly
   public static void getDeclaringJavaClass$annotations(Enum <this>) {
   }
}
