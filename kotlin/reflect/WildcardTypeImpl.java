package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalStdlibApi
final class WildcardTypeImpl implements WildcardType, TypeImpl {
   @NotNull
   public static final WildcardTypeImpl.Companion Companion = new WildcardTypeImpl.Companion((DefaultConstructorMarker)null);
   @Nullable
   private final Type upperBound;
   @Nullable
   private final Type lowerBound;
   @NotNull
   private static final WildcardTypeImpl STAR = new WildcardTypeImpl((Type)null, (Type)null);

   public WildcardTypeImpl(@Nullable Type upperBound, @Nullable Type lowerBound) {
      this.upperBound = upperBound;
      this.lowerBound = lowerBound;
   }

   @NotNull
   public Type[] getUpperBounds() {
      Type[] var1 = new Type[1];
      Type var10002 = this.upperBound;
      if (var10002 == null) {
         var10002 = (Type)Object.class;
      }

      var1[0] = var10002;
      return var1;
   }

   @NotNull
   public Type[] getLowerBounds() {
      Type[] var10000;
      if (this.lowerBound == null) {
         var10000 = new Type[0];
      } else {
         Type[] var1 = new Type[]{this.lowerBound};
         var10000 = var1;
      }

      return var10000;
   }

   @NotNull
   public String getTypeName() {
      return this.lowerBound != null ? "? super " + TypesJVMKt.access$typeToString(this.lowerBound) : (this.upperBound != null && !Intrinsics.areEqual((Object)this.upperBound, (Object)Object.class) ? "? extends " + TypesJVMKt.access$typeToString(this.upperBound) : "?");
   }

   public boolean equals(@Nullable Object other) {
      return other instanceof WildcardType && Arrays.equals(this.getUpperBounds(), ((WildcardType)other).getUpperBounds()) && Arrays.equals(this.getLowerBounds(), ((WildcardType)other).getLowerBounds());
   }

   public int hashCode() {
      return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
   }

   @NotNull
   public String toString() {
      return this.getTypeName();
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final WildcardTypeImpl getSTAR() {
         return WildcardTypeImpl.STAR;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
