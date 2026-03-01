package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.4"
)
public final class TypeParameterReference implements KTypeParameter {
   @NotNull
   public static final TypeParameterReference.Companion Companion = new TypeParameterReference.Companion((DefaultConstructorMarker)null);
   @Nullable
   private final Object container;
   @NotNull
   private final String name;
   @NotNull
   private final KVariance variance;
   private final boolean isReified;
   @Nullable
   private volatile List<? extends KType> bounds;

   public TypeParameterReference(@Nullable Object container, @NotNull String name, @NotNull KVariance variance, boolean isReified) {
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(variance, "variance");
      super();
      this.container = container;
      this.name = name;
      this.variance = variance;
      this.isReified = isReified;
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   @NotNull
   public KVariance getVariance() {
      return this.variance;
   }

   public boolean isReified() {
      return this.isReified;
   }

   @NotNull
   public List<KType> getUpperBounds() {
      List var10000 = this.bounds;
      if (var10000 == null) {
         List var1 = CollectionsKt.listOf(Reflection.nullableTypeOf(Object.class));
         int var3 = false;
         this.bounds = var1;
         var10000 = var1;
      }

      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   public static void getUpperBounds$annotations() {
   }

   public final void setUpperBounds(@NotNull List<? extends KType> upperBounds) {
      Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
      if (this.bounds != null) {
         throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
      } else {
         this.bounds = upperBounds;
      }
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof TypeParameterReference && Intrinsics.areEqual(this.container, ((TypeParameterReference)other).container) && Intrinsics.areEqual((Object)this.getName(), (Object)((TypeParameterReference)other).getName());
   }

   public int hashCode() {
      Object var10000 = this.container;
      return (var10000 != null ? var10000.hashCode() : 0) * 31 + this.getName().hashCode();
   }

   @NotNull
   public String toString() {
      return Companion.toString((KTypeParameter)this);
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final String toString(@NotNull KTypeParameter typeParameter) {
         Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
         StringBuilder var2 = new StringBuilder();
         int var4 = false;
         switch(TypeParameterReference.Companion.WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()]) {
         case 1:
            Unit var10000 = Unit.INSTANCE;
            break;
         case 2:
            var2.append("in ");
            break;
         case 3:
            var2.append("out ");
            break;
         default:
            throw new NoWhenBranchMatchedException();
         }

         var2.append(typeParameter.getName());
         return var2.toString();
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
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
}
