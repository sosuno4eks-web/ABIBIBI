package su.catlean;

import java.awt.Color;
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
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mo {
   @NotNull
   private final class_2338 n;
   @NotNull
   private final Color C;
   private static final long a = j0.a(6506162490136500652L, 4705672478153672420L, MethodHandles.lookup().lookupClass()).a(77538032129600L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public mo(@NotNull class_2338 pos, @NotNull Color color, long a) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.z<invokedynamic>(29950, 5645737446970591465L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.z<invokedynamic>(10236, 6101126801658534888L ^ var3));
      super();
      this.n = var1;
      this.C = var2;
   }

   @NotNull
   public final class_2338 W() {
      return this.n;
   }

   @NotNull
   public final Color x() {
      return this.C;
   }

   @NotNull
   public final class_2338 V() {
      return this.n;
   }

   @NotNull
   public final Color y() {
      return this.C;
   }

   @NotNull
   public final mo Z(short a, @NotNull class_2338 pos, int a, char a, @NotNull Color color) {
      long var6 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 83832063137444L;
      Intrinsics.checkNotNullParameter(var2, true.z<invokedynamic>(14945, 3593286977767000042L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.z<invokedynamic>(19388, 3201253325995914801L ^ var6));
      return new mo(var2, var5, var8);
   }

   // $FF: synthetic method
   public static mo T(mo var0, class_2338 var1, Color var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var10001 = var5 ^ 115347758209986L;
      int var7 = (int)((var5 ^ 115347758209986L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      String[] var10 = 4550239533093124475L.A<invokedynamic>(4550239533093124475L, var5);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (var10 != null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, 4599109667356046772L, var5);
            }

            var1 = var0.n;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.C;
      }

      return var0.Z((short)var7, var1, var8, (char)var9, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 40144119447907L;
      class_2338 var10000 = this.n;
      Color var10001 = this.C;
      String var10003 = true.z<invokedynamic>(11971, 8782730705033099048L ^ var1);
      return var10003 + var10000 + true.z<invokedynamic>(16541, 4446353619834313074L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 74626192272651L;
      int var3 = this.n.hashCode();
      var3 = var3 * (int)e + this.C.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 114525466674269L;
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
      String var11 = "ST\u0018ïÉ\u0098tàzî+ä=!_\u001aÉ\u0019?\bó0ç\u0010\u001aø\n²0~ \u0012\u0096lúàû)¢`\u0010\u009a\u001b\u0082\u0086ìï\u0004Á½\bG`\u0015\u00ad#\u0004\u0010æX\u009ej\u0084¯\u0007c\u0010q XSþ\u0017\u001e\u0010$\u0018\u0089§\\8\u008bñµ^y&Kx>ø";
      int var13 = "ST\u0018ïÉ\u0098tàzî+ä=!_\u001aÉ\u0019?\bó0ç\u0010\u001aø\n²0~ \u0012\u0096lúàû)¢`\u0010\u009a\u001b\u0082\u0086ìï\u0004Á½\bG`\u0015\u00ad#\u0004\u0010æX\u009ej\u0084¯\u0007c\u0010q XSþ\u0017\u001e\u0010$\u0018\u0089§\\8\u008bñµ^y&Kx>ø".length();
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
                  long var2 = -1840113681643589196L;
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

               var11 = "ÍýYÉaº¨\u00969A&\næ´$a_ü\f\u0006ÜTÑò\u0010ûDèOêã©ö\fm\u00187¥\u0012®¡";
               var13 = "ÍýYÉaº¨\u00969A&\næ´$a_ü\f\u0006ÜTÑò\u0010ûDèOêã©ö\fm\u00187¥\u0012®¡".length();
               var10 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4020;
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
            throw new RuntimeException("su/catlean/mo", var10);
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
         throw new RuntimeException("su/catlean/mo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
