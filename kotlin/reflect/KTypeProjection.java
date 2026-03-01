package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public final class KTypeProjection {
   @NotNull
   public static final KTypeProjection.Companion Companion = new KTypeProjection.Companion((DefaultConstructorMarker)null);
   @Nullable
   private final KVariance variance;
   @Nullable
   private final KType type;
   @JvmField
   @NotNull
   public static final KTypeProjection star = new KTypeProjection((KVariance)null, (KType)null);

   public KTypeProjection(@Nullable KVariance variance, @Nullable KType type) {
      this.variance = variance;
      this.type = type;
      if (this.variance == null != (this.type == null)) {
         int var3 = false;
         String var4 = this.variance == null ? "Star projection must have no type specified." : "The projection variance " + this.variance + " requires type to be specified.";
         throw new IllegalArgumentException(var4.toString());
      }
   }

   @Nullable
   public final KVariance getVariance() {
      return this.variance;
   }

   @Nullable
   public final KType getType() {
      return this.type;
   }

   @NotNull
   public String toString() {
      KVariance var10000 = this.variance;
      String var1;
      switch(var10000 == null ? -1 : KTypeProjection.WhenMappings.$EnumSwitchMapping$0[var10000.ordinal()]) {
      case -1:
         var1 = "*";
         break;
      case 0:
      default:
         throw new NoWhenBranchMatchedException();
      case 1:
         var1 = String.valueOf(this.type);
         break;
      case 2:
         var1 = "in " + this.type;
         break;
      case 3:
         var1 = "out " + this.type;
      }

      return var1;
   }

   @Nullable
   public final KVariance component1() {
      return this.variance;
   }

   @Nullable
   public final KType component2() {
      return this.type;
   }

   @NotNull
   public final KTypeProjection copy(@Nullable KVariance variance, @Nullable KType type) {
      return new KTypeProjection(variance, type);
   }

   // $FF: synthetic method
   public static KTypeProjection copy$default(KTypeProjection var0, KVariance var1, KType var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.variance;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.type;
      }

      return var0.copy(var1, var2);
   }

   public int hashCode() {
      int result = this.variance == null ? 0 : this.variance.hashCode();
      result = result * 31 + (this.type == null ? 0 : this.type.hashCode());
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof KTypeProjection)) {
         return false;
      } else {
         KTypeProjection var2 = (KTypeProjection)other;
         if (this.variance != var2.variance) {
            return false;
         } else {
            return Intrinsics.areEqual((Object)this.type, (Object)var2.type);
         }
      }
   }

   @JvmStatic
   @NotNull
   public static final KTypeProjection invariant(@NotNull KType type) {
      return Companion.invariant(type);
   }

   @JvmStatic
   @NotNull
   public static final KTypeProjection contravariant(@NotNull KType type) {
      return Companion.contravariant(type);
   }

   @JvmStatic
   @NotNull
   public static final KTypeProjection covariant(@NotNull KType type) {
      return Companion.covariant(type);
   }

   public static final class Companion {
      private Companion() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @PublishedApi
      public static void getStar$annotations() {
      }

      @NotNull
      public final KTypeProjection getSTAR() {
         return KTypeProjection.star;
      }

      @JvmStatic
      @NotNull
      public final KTypeProjection invariant(@NotNull KType type) {
         Intrinsics.checkNotNullParameter(type, "type");
         return new KTypeProjection(KVariance.INVARIANT, type);
      }

      @JvmStatic
      @NotNull
      public final KTypeProjection contravariant(@NotNull KType type) {
         Intrinsics.checkNotNullParameter(type, "type");
         return new KTypeProjection(KVariance.IN, type);
      }

      @JvmStatic
      @NotNull
      public final KTypeProjection covariant(@NotNull KType type) {
         Intrinsics.checkNotNullParameter(type, "type");
         return new KTypeProjection(KVariance.OUT, type);
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
