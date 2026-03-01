package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {
   @NotNull
   public static final ClassReference.Companion Companion = new ClassReference.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final Class<?> jClass;
   @NotNull
   private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES;

   public ClassReference(@NotNull Class<?> jClass) {
      Intrinsics.checkNotNullParameter(jClass, "jClass");
      super();
      this.jClass = jClass;
   }

   @NotNull
   public Class<?> getJClass() {
      return this.jClass;
   }

   @Nullable
   public String getSimpleName() {
      return Companion.getClassSimpleName(this.getJClass());
   }

   @Nullable
   public String getQualifiedName() {
      return Companion.getClassQualifiedName(this.getJClass());
   }

   @NotNull
   public Collection<KCallable<?>> getMembers() {
      this.error();
      throw new KotlinNothingValueException();
   }

   @NotNull
   public Collection<KFunction<Object>> getConstructors() {
      this.error();
      throw new KotlinNothingValueException();
   }

   @NotNull
   public Collection<KClass<?>> getNestedClasses() {
      this.error();
      throw new KotlinNothingValueException();
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      this.error();
      throw new KotlinNothingValueException();
   }

   @Nullable
   public Object getObjectInstance() {
      this.error();
      throw new KotlinNothingValueException();
   }

   @SinceKotlin(
      version = "1.1"
   )
   public boolean isInstance(@Nullable Object value) {
      return Companion.isInstance(value, this.getJClass());
   }

   @NotNull
   public List<KTypeParameter> getTypeParameters() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void getTypeParameters$annotations() {
   }

   @NotNull
   public List<KType> getSupertypes() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void getSupertypes$annotations() {
   }

   @NotNull
   public List<KClass<? extends Object>> getSealedSubclasses() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.3"
   )
   public static void getSealedSubclasses$annotations() {
   }

   @Nullable
   public KVisibility getVisibility() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void getVisibility$annotations() {
   }

   public boolean isFinal() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isFinal$annotations() {
   }

   public boolean isOpen() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isOpen$annotations() {
   }

   public boolean isAbstract() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isAbstract$annotations() {
   }

   public boolean isSealed() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isSealed$annotations() {
   }

   public boolean isData() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isData$annotations() {
   }

   public boolean isInner() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isInner$annotations() {
   }

   public boolean isCompanion() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.1"
   )
   public static void isCompanion$annotations() {
   }

   public boolean isFun() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void isFun$annotations() {
   }

   public boolean isValue() {
      this.error();
      throw new KotlinNothingValueException();
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.5"
   )
   public static void isValue$annotations() {
   }

   private final Void error() {
      throw new KotlinReflectionNotSupportedError();
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof ClassReference && Intrinsics.areEqual((Object)JvmClassMappingKt.getJavaObjectType((KClass)this), (Object)JvmClassMappingKt.getJavaObjectType((KClass)other));
   }

   public int hashCode() {
      return JvmClassMappingKt.getJavaObjectType((KClass)this).hashCode();
   }

   @NotNull
   public String toString() {
      return this.getJClass() + " (Kotlin reflection is not available)";
   }

   static {
      Class[] var0 = new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class};
      Iterable $this$mapIndexed$iv = (Iterable)CollectionsKt.listOf(var0);
      int $i$f$mapIndexed = false;
      Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10)));
      int $i$f$mapIndexedTo = false;
      int index$iv$iv = 0;
      Iterator var6 = $this$mapIndexed$iv.iterator();

      while(var6.hasNext()) {
         Object item$iv$iv = var6.next();
         int var8 = index$iv$iv++;
         if (var8 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         Class clazz = (Class)item$iv$iv;
         int var11 = false;
         destination$iv$iv.add(TuplesKt.to(clazz, var8));
      }

      FUNCTION_CLASSES = MapsKt.toMap((Iterable)((List)destination$iv$iv));
   }

   public static final class Companion {
      private Companion() {
      }

      private final String classFqNameOf(String type) {
         String var10000;
         switch(type.hashCode()) {
         case -2061550653:
            if (type.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
               var10000 = "kotlin.Double.Companion";
               return var10000;
            }
            break;
         case -2056817302:
            if (type.equals("java.lang.Integer")) {
               var10000 = "kotlin.Int";
               return var10000;
            }
            break;
         case -2034166429:
            if (type.equals("java.lang.Cloneable")) {
               var10000 = "kotlin.Cloneable";
               return var10000;
            }
            break;
         case -1979556166:
            if (type.equals("java.lang.annotation.Annotation")) {
               var10000 = "kotlin.Annotation";
               return var10000;
            }
            break;
         case -1811142716:
            if (type.equals("kotlin.jvm.functions.Function10")) {
               var10000 = "kotlin.Function10";
               return var10000;
            }
            break;
         case -1811142715:
            if (type.equals("kotlin.jvm.functions.Function11")) {
               var10000 = "kotlin.Function11";
               return var10000;
            }
            break;
         case -1811142714:
            if (type.equals("kotlin.jvm.functions.Function12")) {
               var10000 = "kotlin.Function12";
               return var10000;
            }
            break;
         case -1811142713:
            if (type.equals("kotlin.jvm.functions.Function13")) {
               var10000 = "kotlin.Function13";
               return var10000;
            }
            break;
         case -1811142712:
            if (type.equals("kotlin.jvm.functions.Function14")) {
               var10000 = "kotlin.Function14";
               return var10000;
            }
            break;
         case -1811142711:
            if (type.equals("kotlin.jvm.functions.Function15")) {
               var10000 = "kotlin.Function15";
               return var10000;
            }
            break;
         case -1811142710:
            if (type.equals("kotlin.jvm.functions.Function16")) {
               var10000 = "kotlin.Function16";
               return var10000;
            }
            break;
         case -1811142709:
            if (type.equals("kotlin.jvm.functions.Function17")) {
               var10000 = "kotlin.Function17";
               return var10000;
            }
            break;
         case -1811142708:
            if (type.equals("kotlin.jvm.functions.Function18")) {
               var10000 = "kotlin.Function18";
               return var10000;
            }
            break;
         case -1811142707:
            if (type.equals("kotlin.jvm.functions.Function19")) {
               var10000 = "kotlin.Function19";
               return var10000;
            }
            break;
         case -1811142685:
            if (type.equals("kotlin.jvm.functions.Function20")) {
               var10000 = "kotlin.Function20";
               return var10000;
            }
            break;
         case -1811142684:
            if (type.equals("kotlin.jvm.functions.Function21")) {
               var10000 = "kotlin.Function21";
               return var10000;
            }
            break;
         case -1811142683:
            if (type.equals("kotlin.jvm.functions.Function22")) {
               var10000 = "kotlin.Function22";
               return var10000;
            }
            break;
         case -1571515090:
            if (type.equals("java.lang.Comparable")) {
               var10000 = "kotlin.Comparable";
               return var10000;
            }
            break;
         case -1383349348:
            if (type.equals("java.util.Map")) {
               var10000 = "kotlin.collections.Map";
               return var10000;
            }
            break;
         case -1383343454:
            if (type.equals("java.util.Set")) {
               var10000 = "kotlin.collections.Set";
               return var10000;
            }
            break;
         case -1325958191:
            if (type.equals("double")) {
               var10000 = "kotlin.Double";
               return var10000;
            }
            break;
         case -1182275604:
            if (type.equals("kotlin.jvm.internal.ByteCompanionObject")) {
               var10000 = "kotlin.Byte.Companion";
               return var10000;
            }
            break;
         case -1062240117:
            if (type.equals("java.lang.CharSequence")) {
               var10000 = "kotlin.CharSequence";
               return var10000;
            }
            break;
         case -688322466:
            if (type.equals("java.util.Collection")) {
               var10000 = "kotlin.collections.Collection";
               return var10000;
            }
            break;
         case -527879800:
            if (type.equals("java.lang.Float")) {
               var10000 = "kotlin.Float";
               return var10000;
            }
            break;
         case -515992664:
            if (type.equals("java.lang.Short")) {
               var10000 = "kotlin.Short";
               return var10000;
            }
            break;
         case -246476834:
            if (type.equals("kotlin.jvm.internal.CharCompanionObject")) {
               var10000 = "kotlin.Char.Companion";
               return var10000;
            }
            break;
         case -207262728:
            if (type.equals("kotlin.jvm.internal.LongCompanionObject")) {
               var10000 = "kotlin.Long.Companion";
               return var10000;
            }
            break;
         case -165139126:
            if (type.equals("java.util.Map$Entry")) {
               var10000 = "kotlin.collections.Map.Entry";
               return var10000;
            }
            break;
         case 104431:
            if (type.equals("int")) {
               var10000 = "kotlin.Int";
               return var10000;
            }
            break;
         case 3039496:
            if (type.equals("byte")) {
               var10000 = "kotlin.Byte";
               return var10000;
            }
            break;
         case 3052374:
            if (type.equals("char")) {
               var10000 = "kotlin.Char";
               return var10000;
            }
            break;
         case 3327612:
            if (type.equals("long")) {
               var10000 = "kotlin.Long";
               return var10000;
            }
            break;
         case 64711720:
            if (type.equals("boolean")) {
               var10000 = "kotlin.Boolean";
               return var10000;
            }
            break;
         case 65821278:
            if (type.equals("java.util.List")) {
               var10000 = "kotlin.collections.List";
               return var10000;
            }
            break;
         case 77230534:
            if (type.equals("kotlin.jvm.internal.ShortCompanionObject")) {
               var10000 = "kotlin.Short.Companion";
               return var10000;
            }
            break;
         case 80123371:
            if (type.equals("kotlin.jvm.functions.Function0")) {
               var10000 = "kotlin.Function0";
               return var10000;
            }
            break;
         case 80123372:
            if (type.equals("kotlin.jvm.functions.Function1")) {
               var10000 = "kotlin.Function1";
               return var10000;
            }
            break;
         case 80123373:
            if (type.equals("kotlin.jvm.functions.Function2")) {
               var10000 = "kotlin.Function2";
               return var10000;
            }
            break;
         case 80123374:
            if (type.equals("kotlin.jvm.functions.Function3")) {
               var10000 = "kotlin.Function3";
               return var10000;
            }
            break;
         case 80123375:
            if (type.equals("kotlin.jvm.functions.Function4")) {
               var10000 = "kotlin.Function4";
               return var10000;
            }
            break;
         case 80123376:
            if (type.equals("kotlin.jvm.functions.Function5")) {
               var10000 = "kotlin.Function5";
               return var10000;
            }
            break;
         case 80123377:
            if (type.equals("kotlin.jvm.functions.Function6")) {
               var10000 = "kotlin.Function6";
               return var10000;
            }
            break;
         case 80123378:
            if (type.equals("kotlin.jvm.functions.Function7")) {
               var10000 = "kotlin.Function7";
               return var10000;
            }
            break;
         case 80123379:
            if (type.equals("kotlin.jvm.functions.Function8")) {
               var10000 = "kotlin.Function8";
               return var10000;
            }
            break;
         case 80123380:
            if (type.equals("kotlin.jvm.functions.Function9")) {
               var10000 = "kotlin.Function9";
               return var10000;
            }
            break;
         case 97526364:
            if (type.equals("float")) {
               var10000 = "kotlin.Float";
               return var10000;
            }
            break;
         case 109413500:
            if (type.equals("short")) {
               var10000 = "kotlin.Short";
               return var10000;
            }
            break;
         case 155276373:
            if (type.equals("java.lang.Character")) {
               var10000 = "kotlin.Char";
               return var10000;
            }
            break;
         case 226173651:
            if (type.equals("kotlin.jvm.internal.EnumCompanionObject")) {
               var10000 = "kotlin.Enum.Companion";
               return var10000;
            }
            break;
         case 344809556:
            if (type.equals("java.lang.Boolean")) {
               var10000 = "kotlin.Boolean";
               return var10000;
            }
            break;
         case 398507100:
            if (type.equals("java.lang.Byte")) {
               var10000 = "kotlin.Byte";
               return var10000;
            }
            break;
         case 398585941:
            if (type.equals("java.lang.Enum")) {
               var10000 = "kotlin.Enum";
               return var10000;
            }
            break;
         case 398795216:
            if (type.equals("java.lang.Long")) {
               var10000 = "kotlin.Long";
               return var10000;
            }
            break;
         case 482629606:
            if (type.equals("kotlin.jvm.internal.FloatCompanionObject")) {
               var10000 = "kotlin.Float.Companion";
               return var10000;
            }
            break;
         case 499831342:
            if (type.equals("java.util.Iterator")) {
               var10000 = "kotlin.collections.Iterator";
               return var10000;
            }
            break;
         case 577341676:
            if (type.equals("java.util.ListIterator")) {
               var10000 = "kotlin.collections.ListIterator";
               return var10000;
            }
            break;
         case 599019395:
            if (type.equals("kotlin.jvm.internal.StringCompanionObject")) {
               var10000 = "kotlin.String.Companion";
               return var10000;
            }
            break;
         case 761287205:
            if (type.equals("java.lang.Double")) {
               var10000 = "kotlin.Double";
               return var10000;
            }
            break;
         case 1052881309:
            if (type.equals("java.lang.Number")) {
               var10000 = "kotlin.Number";
               return var10000;
            }
            break;
         case 1063877011:
            if (type.equals("java.lang.Object")) {
               var10000 = "kotlin.Any";
               return var10000;
            }
            break;
         case 1195259493:
            if (type.equals("java.lang.String")) {
               var10000 = "kotlin.String";
               return var10000;
            }
            break;
         case 1275614662:
            if (type.equals("java.lang.Iterable")) {
               var10000 = "kotlin.collections.Iterable";
               return var10000;
            }
            break;
         case 1383693018:
            if (type.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
               var10000 = "kotlin.Boolean.Companion";
               return var10000;
            }
            break;
         case 1630335596:
            if (type.equals("java.lang.Throwable")) {
               var10000 = "kotlin.Throwable";
               return var10000;
            }
            break;
         case 1877171123:
            if (type.equals("kotlin.jvm.internal.IntCompanionObject")) {
               var10000 = "kotlin.Int.Companion";
               return var10000;
            }
         }

         var10000 = null;
         return var10000;
      }

      private final String simpleNameOf(String type) {
         String var10000;
         switch(type.hashCode()) {
         case -2061550653:
            if (type.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case -2056817302:
            if (type.equals("java.lang.Integer")) {
               var10000 = "Int";
               return var10000;
            }
            break;
         case -2034166429:
            if (type.equals("java.lang.Cloneable")) {
               var10000 = "Cloneable";
               return var10000;
            }
            break;
         case -1979556166:
            if (type.equals("java.lang.annotation.Annotation")) {
               var10000 = "Annotation";
               return var10000;
            }
            break;
         case -1811142716:
            if (type.equals("kotlin.jvm.functions.Function10")) {
               var10000 = "Function10";
               return var10000;
            }
            break;
         case -1811142715:
            if (type.equals("kotlin.jvm.functions.Function11")) {
               var10000 = "Function11";
               return var10000;
            }
            break;
         case -1811142714:
            if (type.equals("kotlin.jvm.functions.Function12")) {
               var10000 = "Function12";
               return var10000;
            }
            break;
         case -1811142713:
            if (type.equals("kotlin.jvm.functions.Function13")) {
               var10000 = "Function13";
               return var10000;
            }
            break;
         case -1811142712:
            if (type.equals("kotlin.jvm.functions.Function14")) {
               var10000 = "Function14";
               return var10000;
            }
            break;
         case -1811142711:
            if (type.equals("kotlin.jvm.functions.Function15")) {
               var10000 = "Function15";
               return var10000;
            }
            break;
         case -1811142710:
            if (type.equals("kotlin.jvm.functions.Function16")) {
               var10000 = "Function16";
               return var10000;
            }
            break;
         case -1811142709:
            if (type.equals("kotlin.jvm.functions.Function17")) {
               var10000 = "Function17";
               return var10000;
            }
            break;
         case -1811142708:
            if (type.equals("kotlin.jvm.functions.Function18")) {
               var10000 = "Function18";
               return var10000;
            }
            break;
         case -1811142707:
            if (type.equals("kotlin.jvm.functions.Function19")) {
               var10000 = "Function19";
               return var10000;
            }
            break;
         case -1811142685:
            if (type.equals("kotlin.jvm.functions.Function20")) {
               var10000 = "Function20";
               return var10000;
            }
            break;
         case -1811142684:
            if (type.equals("kotlin.jvm.functions.Function21")) {
               var10000 = "Function21";
               return var10000;
            }
            break;
         case -1811142683:
            if (type.equals("kotlin.jvm.functions.Function22")) {
               var10000 = "Function22";
               return var10000;
            }
            break;
         case -1571515090:
            if (type.equals("java.lang.Comparable")) {
               var10000 = "Comparable";
               return var10000;
            }
            break;
         case -1383349348:
            if (type.equals("java.util.Map")) {
               var10000 = "Map";
               return var10000;
            }
            break;
         case -1383343454:
            if (type.equals("java.util.Set")) {
               var10000 = "Set";
               return var10000;
            }
            break;
         case -1325958191:
            if (type.equals("double")) {
               var10000 = "Double";
               return var10000;
            }
            break;
         case -1182275604:
            if (type.equals("kotlin.jvm.internal.ByteCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case -1062240117:
            if (type.equals("java.lang.CharSequence")) {
               var10000 = "CharSequence";
               return var10000;
            }
            break;
         case -688322466:
            if (type.equals("java.util.Collection")) {
               var10000 = "Collection";
               return var10000;
            }
            break;
         case -527879800:
            if (type.equals("java.lang.Float")) {
               var10000 = "Float";
               return var10000;
            }
            break;
         case -515992664:
            if (type.equals("java.lang.Short")) {
               var10000 = "Short";
               return var10000;
            }
            break;
         case -246476834:
            if (type.equals("kotlin.jvm.internal.CharCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case -207262728:
            if (type.equals("kotlin.jvm.internal.LongCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case -165139126:
            if (type.equals("java.util.Map$Entry")) {
               var10000 = "Entry";
               return var10000;
            }
            break;
         case 104431:
            if (type.equals("int")) {
               var10000 = "Int";
               return var10000;
            }
            break;
         case 3039496:
            if (type.equals("byte")) {
               var10000 = "Byte";
               return var10000;
            }
            break;
         case 3052374:
            if (type.equals("char")) {
               var10000 = "Char";
               return var10000;
            }
            break;
         case 3327612:
            if (type.equals("long")) {
               var10000 = "Long";
               return var10000;
            }
            break;
         case 64711720:
            if (type.equals("boolean")) {
               var10000 = "Boolean";
               return var10000;
            }
            break;
         case 65821278:
            if (type.equals("java.util.List")) {
               var10000 = "List";
               return var10000;
            }
            break;
         case 77230534:
            if (type.equals("kotlin.jvm.internal.ShortCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case 80123371:
            if (type.equals("kotlin.jvm.functions.Function0")) {
               var10000 = "Function0";
               return var10000;
            }
            break;
         case 80123372:
            if (type.equals("kotlin.jvm.functions.Function1")) {
               var10000 = "Function1";
               return var10000;
            }
            break;
         case 80123373:
            if (type.equals("kotlin.jvm.functions.Function2")) {
               var10000 = "Function2";
               return var10000;
            }
            break;
         case 80123374:
            if (type.equals("kotlin.jvm.functions.Function3")) {
               var10000 = "Function3";
               return var10000;
            }
            break;
         case 80123375:
            if (type.equals("kotlin.jvm.functions.Function4")) {
               var10000 = "Function4";
               return var10000;
            }
            break;
         case 80123376:
            if (type.equals("kotlin.jvm.functions.Function5")) {
               var10000 = "Function5";
               return var10000;
            }
            break;
         case 80123377:
            if (type.equals("kotlin.jvm.functions.Function6")) {
               var10000 = "Function6";
               return var10000;
            }
            break;
         case 80123378:
            if (type.equals("kotlin.jvm.functions.Function7")) {
               var10000 = "Function7";
               return var10000;
            }
            break;
         case 80123379:
            if (type.equals("kotlin.jvm.functions.Function8")) {
               var10000 = "Function8";
               return var10000;
            }
            break;
         case 80123380:
            if (type.equals("kotlin.jvm.functions.Function9")) {
               var10000 = "Function9";
               return var10000;
            }
            break;
         case 97526364:
            if (type.equals("float")) {
               var10000 = "Float";
               return var10000;
            }
            break;
         case 109413500:
            if (type.equals("short")) {
               var10000 = "Short";
               return var10000;
            }
            break;
         case 155276373:
            if (type.equals("java.lang.Character")) {
               var10000 = "Char";
               return var10000;
            }
            break;
         case 226173651:
            if (type.equals("kotlin.jvm.internal.EnumCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case 344809556:
            if (type.equals("java.lang.Boolean")) {
               var10000 = "Boolean";
               return var10000;
            }
            break;
         case 398507100:
            if (type.equals("java.lang.Byte")) {
               var10000 = "Byte";
               return var10000;
            }
            break;
         case 398585941:
            if (type.equals("java.lang.Enum")) {
               var10000 = "Enum";
               return var10000;
            }
            break;
         case 398795216:
            if (type.equals("java.lang.Long")) {
               var10000 = "Long";
               return var10000;
            }
            break;
         case 482629606:
            if (type.equals("kotlin.jvm.internal.FloatCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case 499831342:
            if (type.equals("java.util.Iterator")) {
               var10000 = "Iterator";
               return var10000;
            }
            break;
         case 577341676:
            if (type.equals("java.util.ListIterator")) {
               var10000 = "ListIterator";
               return var10000;
            }
            break;
         case 599019395:
            if (type.equals("kotlin.jvm.internal.StringCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case 761287205:
            if (type.equals("java.lang.Double")) {
               var10000 = "Double";
               return var10000;
            }
            break;
         case 1052881309:
            if (type.equals("java.lang.Number")) {
               var10000 = "Number";
               return var10000;
            }
            break;
         case 1063877011:
            if (type.equals("java.lang.Object")) {
               var10000 = "Any";
               return var10000;
            }
            break;
         case 1195259493:
            if (type.equals("java.lang.String")) {
               var10000 = "String";
               return var10000;
            }
            break;
         case 1275614662:
            if (type.equals("java.lang.Iterable")) {
               var10000 = "Iterable";
               return var10000;
            }
            break;
         case 1383693018:
            if (type.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
            break;
         case 1630335596:
            if (type.equals("java.lang.Throwable")) {
               var10000 = "Throwable";
               return var10000;
            }
            break;
         case 1877171123:
            if (type.equals("kotlin.jvm.internal.IntCompanionObject")) {
               var10000 = "Companion";
               return var10000;
            }
         }

         var10000 = null;
         return var10000;
      }

      @Nullable
      public final String getClassSimpleName(@NotNull Class<?> jClass) {
         Intrinsics.checkNotNullParameter(jClass, "jClass");
         String var10000;
         if (jClass.isAnonymousClass()) {
            var10000 = null;
         } else if (jClass.isLocalClass()) {
            String name = jClass.getSimpleName();
            Method var9 = jClass.getEnclosingMethod();
            if (var9 != null) {
               Method method = var9;
               int var5 = false;
               Intrinsics.checkNotNull(name);
               var10000 = StringsKt.substringAfter$default(name, method.getName() + '$', (String)null, 2, (Object)null);
               if (var10000 != null) {
                  return var10000;
               }
            }

            Constructor var10 = jClass.getEnclosingConstructor();
            if (var10 != null) {
               Constructor constructor = var10;
               int var6 = false;
               Intrinsics.checkNotNull(name);
               var10000 = StringsKt.substringAfter$default(name, constructor.getName() + '$', (String)null, 2, (Object)null);
            } else {
               Intrinsics.checkNotNull(name);
               var10000 = StringsKt.substringAfter$default(name, '$', (String)null, 2, (Object)null);
            }
         } else {
            String var10001;
            if (jClass.isArray()) {
               Class componentType = jClass.getComponentType();
               if (componentType.isPrimitive()) {
                  var10001 = componentType.getName();
                  Intrinsics.checkNotNullExpressionValue(var10001, "getName(...)");
                  String var3 = this.simpleNameOf(var10001);
                  var10000 = var3 != null ? var3 + "Array" : null;
               } else {
                  var10000 = null;
               }

               if (var10000 == null) {
                  var10000 = "Array";
               }
            } else {
               var10001 = jClass.getName();
               Intrinsics.checkNotNullExpressionValue(var10001, "getName(...)");
               var10000 = this.simpleNameOf(var10001);
               if (var10000 == null) {
                  var10000 = jClass.getSimpleName();
               }
            }
         }

         return var10000;
      }

      @Nullable
      public final String getClassQualifiedName(@NotNull Class<?> jClass) {
         Intrinsics.checkNotNullParameter(jClass, "jClass");
         String var10000;
         if (jClass.isAnonymousClass()) {
            var10000 = null;
         } else if (jClass.isLocalClass()) {
            var10000 = null;
         } else {
            String var10001;
            if (jClass.isArray()) {
               Class componentType = jClass.getComponentType();
               if (componentType.isPrimitive()) {
                  var10001 = componentType.getName();
                  Intrinsics.checkNotNullExpressionValue(var10001, "getName(...)");
                  String var3 = this.classFqNameOf(var10001);
                  var10000 = var3 != null ? var3 + "Array" : null;
               } else {
                  var10000 = null;
               }

               if (var10000 == null) {
                  var10000 = "kotlin.Array";
               }
            } else {
               var10001 = jClass.getName();
               Intrinsics.checkNotNullExpressionValue(var10001, "getName(...)");
               var10000 = this.classFqNameOf(var10001);
               if (var10000 == null) {
                  var10000 = jClass.getCanonicalName();
               }
            }
         }

         return var10000;
      }

      public final boolean isInstance(@Nullable Object value, @NotNull Class<?> jClass) {
         Intrinsics.checkNotNullParameter(jClass, "jClass");
         Map var10000 = ClassReference.FUNCTION_CLASSES;
         Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
         Integer var3 = (Integer)var10000.get(jClass);
         if (var3 != null) {
            int arity = ((Number)var3).intValue();
            int var5 = false;
            return TypeIntrinsics.isFunctionOfArity(value, arity);
         } else {
            Class objectType = jClass.isPrimitive() ? JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(jClass)) : jClass;
            return objectType.isInstance(value);
         }
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
