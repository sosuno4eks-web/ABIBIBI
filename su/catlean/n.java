package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_746;

public final class n {
   private int a;
   private static String h;
   private static final long b = j0.a(7017454409133665764L, 7958126046740056330L, MethodHandles.lookup().lookupClass()).a(31697049081794L);

   public n(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 127553261310952L;
      super();
      this.S(var6);
   }

   public final boolean s(long a, int t) {
      // $FF: Couldn't be decompiled
   }

   public final boolean z(int ms, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void E(int t, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 129545634779221L;
      int var3 = (int)((var1 ^ 129545634779221L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);

      n var10000;
      int var8;
      label17: {
         try {
            var10000 = this;
            if (s8.H((short)var3, (short)var4, var5).field_1724 == null) {
               var8 = 0;
               break label17;
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, 7094943411818276111L, var1);
         }

         class_746 var7 = s8.H((short)var3, (short)var4, var5).field_1724;
         Intrinsics.checkNotNull(var7);
         var8 = var7.field_6012;
      }

      var10000.a = var8;
   }

   public final int C(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 108699901108565L;
      return this.b(var3);
   }

   private final int b(long param1) {
      // $FF: Couldn't be decompiled
   }

   public static void K(String var0) {
      h = var0;
   }

   public static String e() {
      return h;
   }

   static {
      long var0 = b ^ 35444610345997L;
      if (2558356489264634348L.A<invokedynamic>(2558356489264634348L, var0) == null) {
         "cIuiab".A<invokedynamic>("cIuiab", 2565661968249342488L, var0);
      }

   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
