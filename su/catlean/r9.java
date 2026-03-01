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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

public final class r9 {
   @NotNull
   private final class_2960 x;
   @NotNull
   private final Matrix3x2f T;
   private static final long a = j0.a(8191412126880213925L, 3072806150023662858L, MethodHandles.lookup().lookupClass()).a(198572008848325L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public r9(@NotNull class_2960 texture, long a, @NotNull Matrix3x2f matrix) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(9714, 6807876345499610963L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(255, 6504991778104724063L ^ var2));
      super();
      this.x = var1;
      this.T = var4;
   }

   @NotNull
   public final class_2960 q() {
      return this.x;
   }

   @NotNull
   public final Matrix3x2f N() {
      return this.T;
   }

   @NotNull
   public final class_2960 K() {
      return this.x;
   }

   @NotNull
   public final Matrix3x2f X() {
      return this.T;
   }

   @NotNull
   public final r9 H(long a, @NotNull class_2960 texture, @NotNull Matrix3x2f matrix) {
      var1 ^= a;
      long var5 = var1 ^ 134383779896751L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(21355, 2179831819830068602L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(19613, 6761220278218496654L ^ var1));
      return new r9(var3, var5, var4);
   }

   // $FF: synthetic method
   public static r9 M(r9 var0, class_2960 var1, Matrix3x2f var2, long var3, int var5, Object var6) {
      var3 ^= a;
      long var7 = var3 ^ 89325560289788L;
      k9[] var9 = -1113416148263356874L.A<invokedynamic>(-1113416148263356874L, var3);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var9 == null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -1132158419142231711L, var3);
            }

            var1 = var0.x;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.T;
      }

      return var0.H(var7, var1, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 22666487872862L;
      class_2960 var10000 = this.x;
      Matrix3x2f var10001 = this.T;
      String var10003 = true.c<invokedynamic>(20241, 6070814229596998693L ^ var1);
      return var10003 + var10000 + true.c<invokedynamic>(3590, 1112740781905661232L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 8812910907671L;
      int var3 = this.x.hashCode();
      var3 = var3 * (int)e + this.T.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 56115522098869L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "\u00803\u0094\u0096jöÇÄÛò|<µÂÁÀ©G¿'>ú\u001aÞÛ\u001fNCàù$aÕ¾eÅ\u0098MÕ-\u0010ò>Î\u001c\u008b¿Î$Nï\fM\u001b®\u0018\u0092\u0018\u0089>\u00020¿V\u0016ëD\u001b°3¸\u0006ð\u0080.\b\u0019\u009bV×k\b\u00108\u0099öíg\u0080ø¸Q\u001e§§0\u0088Cã";
      int var13 = "\u00803\u0094\u0096jöÇÄÛò|<µÂÁÀ©G¿'>ú\u001aÞÛ\u001fNCàù$aÕ¾eÅ\u0098MÕ-\u0010ò>Î\u001c\u008b¿Î$Nï\fM\u001b®\u0018\u0092\u0018\u0089>\u00020¿V\u0016ëD\u001b°3¸\u0006ð\u0080.\b\u0019\u009bV×k\b\u00108\u0099öíg\u0080ø¸Q\u001e§§0\u0088Cã".length();
      char var10 = '(';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 6448437661372620606L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "n¾æ\u0017\u0006\u0090+BÒäÍÓB\u008e´\u0013\u0010 Ï×ëÃ1¿\u001fh\u0016UM~A\u009eÿ";
               var13 = "n¾æ\u0017\u0006\u0090+BÒäÍÓB\u008e´\u0013\u0010 Ï×ëÃ1¿\u001fh\u0016UM~A\u009eÿ".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16240;
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
            throw new RuntimeException("su/catlean/r9", var10);
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
         throw new RuntimeException("su/catlean/r9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
