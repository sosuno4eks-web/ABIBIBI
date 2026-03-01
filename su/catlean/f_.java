package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1511;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f_ {
   @NotNull
   private final class_1511 F;
   private final boolean L;
   private static String z;
   private static final long a = j0.a(129579877037407003L, 2329864182779465794L, MethodHandles.lookup().lookupClass()).a(82932538751638L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   public f_(long a, @NotNull class_1511 crystal, boolean block) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(30639, 185374877510228162L ^ var1));
      super();
      this.F = var3;
      this.L = var4;
   }

   // $FF: synthetic method
   public f_(class_1511 var1, long var2, boolean var4, int var5, DefaultConstructorMarker var6) {
      var2 ^= a;
      long var7 = var2 ^ 76908824431900L;
      if ((var5 & 2) != 0) {
         var4 = false;
      }

      this(var7, var1, var4);
   }

   @NotNull
   public final class_1511 z() {
      return this.F;
   }

   public final boolean m() {
      return this.L;
   }

   @NotNull
   public final class_1511 t() {
      return this.F;
   }

   public final boolean f() {
      return this.L;
   }

   @NotNull
   public final f_ h(@NotNull class_1511 crystal, boolean block, long a) {
      var3 ^= a;
      long var5 = var3 ^ 60638883992933L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(19539, 2249910962153061049L ^ var3));
      return new f_(var5, var1, var2);
   }

   // $FF: synthetic method
   public static f_ z(f_ param0, class_1511 param1, boolean param2, int param3, Object param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 25520276647613L;
      class_1511 var10000 = this.F;
      boolean var10001 = this.L;
      String var10003 = true.j<invokedynamic>(28065, 2366527957247608416L ^ var1);
      return var10003 + var10000 + true.j<invokedynamic>(27885, 5245794558319904559L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 37452274426007L;
      String var10000 = -5958763546597313257L.A<invokedynamic>(-5958763546597313257L, var1);
      int var4 = this.F.hashCode();
      String var3 = var10000;
      var4 = var4 * (int)e + Boolean.hashCode(this.L);

      try {
         if (var3 != null) {
            (new int[3]).A<invokedynamic>(new int[3], -5955273161718206751L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -5913503884098695918L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void i(String var0) {
      z = var0;
   }

   public static String V() {
      return z;
   }

   static {
      long var14 = a ^ 74844598170405L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 4470950986421846608L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[4];
      int var10 = 0;
      String var9 = "X\u009bI[\u0093&#\u0003º¨_7ij-\u001c \u0012NSI\u0010¸\u0000YQ->{\u0003°\f½\t\u0097\u0018½éGÑ\u0006¥üT`&Õ \"";
      int var11 = "X\u009bI[\u0093&#\u0003º¨_7ij-\u001c \u0012NSI\u0010¸\u0000YQ->{\u0003°\f½\t\u0097\u0018½éGÑ\u0006¥üT`&Õ \"".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var16 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var21;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -3147317110869837387L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var21;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "Ý¾ÈY~\u0007\u0094!\u0090ëø63Á0\u0006èPô\u0093\f\u0098ûEà°eÈ\u0017~q\u0013ml5\u001f$\u000f\u0019\b\u0010Êjt×Gtðödø(ù\u009aYèÐ";
               var11 = "Ý¾ÈY~\u0007\u0094!\u0090ëø63Á0\u0006èPô\u0093\f\u0098ûEà°eÈ\u0017~q\u0013ml5\u001f$\u000f\u0019\b\u0010Êjt×Gtðödø(ù\u009aYèÐ".length();
               var8 = '(';
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18847;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/f_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/f_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
