package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class xf {
   private static boolean n;

   private xf() {
   }

   @NotNull
   public final x k() {
      return new x();
   }

   public xf(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static void E(boolean var0) {
      n = var0;
   }

   public static boolean L() {
      return n;
   }

   public static boolean w() {
      boolean var0 = L();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = j0.a(1888173729241134745L, 7660538205935996721L, MethodHandles.lookup().lookupClass()).a(91029619677259L) ^ 22177892683860L;
      if (!7709264729216437985L.A<invokedynamic>(7709264729216437985L, var0)) {
         true.A<invokedynamic>(true, 7699506544873279364L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
