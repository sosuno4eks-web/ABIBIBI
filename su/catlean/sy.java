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
import kotlin.ranges.RangesKt;
import net.minecraft.class_10055;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_591;
import org.jetbrains.annotations.NotNull;

public final class sy {
   @NotNull
   private final class_591 J;
   @NotNull
   private final class_10055 o;
   @NotNull
   private class_243 X;
   @NotNull
   private final class_2960 T;
   private float a;
   private float G;
   @NotNull
   private class_243 I;
   private static String[] e;
   private static final long b = j0.a(2827582251493213249L, 6079305591789592606L, MethodHandles.lookup().lookupClass()).a(58915318688061L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;

   public sy(@NotNull class_591 model, long a, @NotNull class_10055 state, @NotNull class_243 pos, @NotNull class_2960 texture, float alpha) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(27233, 2088981288990722518L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(26038, 8516370235960739331L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.j<invokedynamic>(13980, 5911307556401681706L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.j<invokedynamic>(4748, 2532150226481656120L ^ var2));
      super();
      String[] var10000 = 760139899380141659L.A<invokedynamic>(760139899380141659L, var2);
      this.J = var1;
      String[] var8 = var10000;

      try {
         this.o = var4;
         this.X = var5;
         this.T = var6;
         this.a = var7;
         this.G = this.a;
         this.I = this.X;
         if (var8 == null) {
            (new int[4]).A<invokedynamic>(new int[4], 759391986862377266L, var2);
         }

      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 818175159130462783L, var2);
      }
   }

   @NotNull
   public final class_591 i() {
      return this.J;
   }

   @NotNull
   public final class_10055 H() {
      return this.o;
   }

   @NotNull
   public final class_243 O() {
      return this.X;
   }

   public final void B(@NotNull class_243 <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(14664, 9089040943650290465L ^ var2));
      this.X = var1;
   }

   @NotNull
   public final class_2960 l() {
      return this.T;
   }

   public final float I() {
      return this.a;
   }

   public final void B(float <set-?>) {
      this.a = var1;
   }

   public final boolean W(float aSpeed, float ySpeed, long a) {
      // $FF: Couldn't be decompiled
   }

   public final float h(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 12733537344198L;
      String[] var5 = 5636979752328743661L.A<invokedynamic>(5636979752328743661L, var1);

      try {
         float var10000 = RangesKt.coerceIn(gk.E.i(this.G, this.a, q1.A.s(var3)), 0.0F, 255.0F) / 255.0F;
         if (5675812629874559918L.A<invokedynamic>(5675812629874559918L, var1) == null) {
            (new String[4]).A<invokedynamic>(new String[4], 5648678386648336127L, var1);
         }

         return var10000;
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 5759156114750791305L, var1);
      }
   }

   @NotNull
   public final class_243 y(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 79861667695863L;
      long var5 = var1 ^ 96931241682626L;
      return q1.A.J(this.I, this.X, q1.A.s(var3), var5);
   }

   public static void A(String[] var0) {
      e = var0;
   }

   public static String[] b() {
      return e;
   }

   static {
      long var9 = b ^ 18389036036429L;
      String[] var10000 = new String[5];
      f = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 1004371262436509035L, var9);
      Cipher var0;
      Cipher var11 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var11.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "\u0001ß\u0007\u0005\u0080à\u0091=q\u0088ø\r\u0001¥x\u009a\u0010rt\u000e\u007fÙý\u007fê\u007f'W¨\bÆ\u0007Ï\u0010vb4´µÙ\u009c7\u001bv\u008f\u0019\u0000\u0089\u0010\u0019";
      int var6 = "\u0001ß\u0007\u0005\u0080à\u0091=q\u0088ø\r\u0001¥x\u009a\u0010rt\u000e\u007fÙý\u007fê\u007f'W¨\bÆ\u0007Ï\u0010vb4´µÙ\u009c7\u001bv\u008f\u0019\u0000\u0089\u0010\u0019".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var12 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  c = var7;
                  d = new String[5];
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var16;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "ê~\"Ó\u0005-ÂkWFi¦\u0010Æå¿\u0010\u0001V\u0012F³íÆ~ð^2\u0090\u0016%À ";
               var6 = "ê~\"Ó\u0005-ÂkWFi¦\u0010Æå¿\u0010\u0001V\u0012F³íÆ~ð^2\u0090\u0016%À ".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10259;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/sy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/sy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
