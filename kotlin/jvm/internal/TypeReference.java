package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.4"
)
public final class TypeReference implements KType {
   @NotNull
   public static final TypeReference.Companion Companion = new TypeReference.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final KClassifier classifier;
   @NotNull
   private final List<KTypeProjection> arguments;
   @Nullable
   private final KType platformTypeUpperBound;
   private final int flags;
   public static final int IS_MARKED_NULLABLE = 1;
   public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
   public static final int IS_NOTHING_TYPE = 4;

   @SinceKotlin(
      version = "1.6"
   )
   public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, @Nullable KType platformTypeUpperBound, int flags) {
      Intrinsics.checkNotNullParameter(classifier, "classifier");
      Intrinsics.checkNotNullParameter(arguments, "arguments");
      super();
      this.classifier = classifier;
      this.arguments = arguments;
      this.platformTypeUpperBound = platformTypeUpperBound;
      this.flags = flags;
   }

   @NotNull
   public KClassifier getClassifier() {
      return this.classifier;
   }

   @NotNull
   public List<KTypeProjection> getArguments() {
      return this.arguments;
   }

   @Nullable
   public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
      return this.platformTypeUpperBound;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.6"
   )
   public static void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
   }

   public final int getFlags$kotlin_stdlib() {
      return this.flags;
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.6"
   )
   public static void getFlags$kotlin_stdlib$annotations() {
   }

   public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, boolean isMarkedNullable) {
      Intrinsics.checkNotNullParameter(classifier, "classifier");
      Intrinsics.checkNotNullParameter(arguments, "arguments");
      this(classifier, arguments, (KType)null, isMarkedNullable ? 1 : 0);
   }

   @NotNull
   public List<Annotation> getAnnotations() {
      return CollectionsKt.emptyList();
   }

   public boolean isMarkedNullable() {
      return (this.flags & 1) != 0;
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof TypeReference && Intrinsics.areEqual((Object)this.getClassifier(), (Object)((TypeReference)other).getClassifier()) && Intrinsics.areEqual((Object)this.getArguments(), (Object)((TypeReference)other).getArguments()) && Intrinsics.areEqual((Object)this.platformTypeUpperBound, (Object)((TypeReference)other).platformTypeUpperBound) && this.flags == ((TypeReference)other).flags;
   }

   public int hashCode() {
      return (this.getClassifier().hashCode() * 31 + this.getArguments().hashCode()) * 31 + Integer.hashCode(this.flags);
   }

   @NotNull
   public String toString() {
      return this.asString(false) + " (Kotlin reflection is not available)";
   }

   private final String asString(boolean convertPrimitiveToWrapper) {
      KClassifier var4 = this.getClassifier();
      Class javaClass = (var4 instanceof KClass ? (KClass)var4 : null) != null ? JvmClassMappingKt.getJavaClass(var4 instanceof KClass ? (KClass)var4 : null) : null;
      String var10000;
      if (javaClass == null) {
         var10000 = this.getClassifier().toString();
      } else if ((this.flags & 4) != 0) {
         var10000 = "kotlin.Nothing";
      } else if (javaClass.isArray()) {
         var10000 = this.getArrayClassName(javaClass);
      } else if (convertPrimitiveToWrapper && javaClass.isPrimitive()) {
         KClassifier var10 = this.getClassifier();
         Intrinsics.checkNotNull(var10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
         var10000 = JvmClassMappingKt.getJavaObjectType((KClass)var10).getName();
      } else {
         var10000 = javaClass.getName();
      }

      String klass = var10000;
      String args = this.getArguments().isEmpty() ? "" : CollectionsKt.joinToString$default((Iterable)this.getArguments(), (CharSequence)", ", (CharSequence)"<", (CharSequence)">", 0, (CharSequence)null, TypeReference::asString$lambda$0, 24, (Object)null);
      String nullable = this.isMarkedNullable() ? "?" : "";
      String result = klass + args + nullable;
      KType upper = this.platformTypeUpperBound;
      if (upper instanceof TypeReference) {
         String renderedUpper = ((TypeReference)upper).asString(true);
         var10000 = Intrinsics.areEqual((Object)renderedUpper, (Object)result) ? result : (Intrinsics.areEqual((Object)renderedUpper, (Object)(result + '?')) ? result + '!' : '(' + result + ".." + renderedUpper + ')');
      } else {
         var10000 = result;
      }

      return var10000;
   }

   private final String getArrayClassName(Class<?> $this$arrayClassName) {
      return Intrinsics.areEqual((Object)$this$arrayClassName, (Object)boolean[].class) ? "kotlin.BooleanArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)char[].class) ? "kotlin.CharArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)byte[].class) ? "kotlin.ByteArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)short[].class) ? "kotlin.ShortArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)int[].class) ? "kotlin.IntArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)float[].class) ? "kotlin.FloatArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)long[].class) ? "kotlin.LongArray" : (Intrinsics.areEqual((Object)$this$arrayClassName, (Object)double[].class) ? "kotlin.DoubleArray" : "kotlin.Array")))))));
   }

   private final String asString(KTypeProjection $this$asString) {
      if ($this$asString.getVariance() == null) {
         return "*";
      } else {
         String var4;
         label29: {
            KType var3 = $this$asString.getType();
            TypeReference var10000 = var3 instanceof TypeReference ? (TypeReference)var3 : null;
            if ((var3 instanceof TypeReference ? (TypeReference)var3 : null) != null) {
               var4 = var10000.asString(true);
               if (var4 != null) {
                  break label29;
               }
            }

            var4 = String.valueOf($this$asString.getType());
         }

         String typeString = var4;
         KVariance var5 = $this$asString.getVariance();
         switch(var5 == null ? -1 : TypeReference.WhenMappings.$EnumSwitchMapping$0[var5.ordinal()]) {
         case 1:
            var4 = typeString;
            break;
         case 2:
            var4 = "in " + typeString;
            break;
         case 3:
            var4 = "out " + typeString;
            break;
         default:
            throw new NoWhenBranchMatchedException();
         }

         return var4;
      }
   }

   private static final CharSequence asString$lambda$0(TypeReference this$0, KTypeProjection it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return (CharSequence)this$0.asString(it);
   }

   public static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[KVariance.values().length];

         try {
            var0[KVariance.INVARIANT.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[KVariance.IN.ordinal()] = 2;
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
