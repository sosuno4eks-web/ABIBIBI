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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class su {
   @NotNull
   public static final su j;
   @NotNull
   private static final Float[] r;
   private static final long a = j0.a(1549009486998625793L, 3370790861942542853L, MethodHandles.lookup().lookupClass()).a(108679712626789L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private su() {
   }

   @NotNull
   public final Float[] o() {
      return r;
   }

   public final boolean m(short a, @NotNull class_243 pos, short a, int a, @NotNull class_243 interactVec) {
      // $FF: Couldn't be decompiled
   }

   public static boolean K(su var0, class_243 var1, class_243 var2, int var3, long var4, Object var6) {
      var4 ^= a;
      long var10001 = var4 ^ 120448913307745L;
      int var7 = (int)((var4 ^ 120448913307745L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      boolean var10 = -8669354487474928075L.A<invokedynamic>(-8669354487474928075L, var4);

      int var10000;
      label20: {
         try {
            var10000 = var3 & 2;
            if (var10) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, -8702832411274829704L, var4);
         }

         var2 = var1;
      }

      var10000 = var0.m((short)var7, var1, (short)var8, var9, var2);
      return (boolean)var10000;
   }

   static {
      long var0 = a ^ 126667857579074L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "ÉÀ÷\u001b\u009cCñ\u0089\u000ejcÅ°¨V¡áú\u0084ö'tÝtL\u0086í\u0093½\u000e[\u0003\u0010/¹\u0092«×n$¬\tÑ1µH\r\u009fé\u001889\fÛ\u001fÁ\rÃH2?\f ·\u0004¼ÖWé¯£×5:";
      int var8 = "ÉÀ÷\u001b\u009cCñ\u0089\u000ejcÅ°¨V¡áú\u0084ö'tÝtL\u0086í\u0093½\u000e[\u0003\u0010/¹\u0092«×n$¬\tÑ1µH\r\u009fé\u001889\fÛ\u001fÁ\rÃH2?\f ·\u0004¼ÖWé¯£×5:".length();
      char var5 = ' ';
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var12 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var16;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[5];
                  j = new su();
                  Float[] var11 = new Float[]{1.62F, 0.4F};
                  r = var11;
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var16;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "\u0011_ý\u0004\u0080{!\u008b±Ú ìÞ|R\u001d\u0085`É\\ \u0086¬ý !fDñ\u008a\u0011µ.;\u009eS\u00984jîH\\\u0095dúÄÂöMqXlä\u00adüìU";
               var8 = "\u0011_ý\u0004\u0080{!\u008b±Ú ìÞ|R\u001d\u0085`É\\ \u0086¬ý !fDñ\u008a\u0011µ.;\u009eS\u00984jîH\\\u0095dúÄÂöMqXlä\u00adüìU".length();
               var5 = 24;
               var4 = -1;
            }

            ++var4;
            var12 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1018;
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
            throw new RuntimeException("su/catlean/su", var10);
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
         throw new RuntimeException("su/catlean/su" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
