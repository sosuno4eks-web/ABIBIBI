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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nb extends nm {
   @NotNull
   public static final nb D;
   private static final long c = j0.a(-6535586200304163245L, 136255379510149217L, MethodHandles.lookup().lookupClass()).a(4443935122135L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;

   private nb(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 81012072506928L;
      super(true.i<invokedynamic>(5055, 4710406537098449751L ^ var1), var3);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var9 = c ^ 115201883894961L;
      long var11 = var9 ^ 38032005721773L;
      i = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "ÛÝ\u0085t§ \u009f\u001cj\"_Cý/`\u008f\u0010 \u001eñ[\u0099Å\u001c\u0082ÁQI\u008c\u0091è\u0089\u009a ëºÉlU\nGCE¤ÂbÀ\u0086'®!j6u\u001a8`zÍ¼\u0091s¸Ä+ø";
      int var6 = "ÛÝ\u0085t§ \u009f\u001cj\"_Cý/`\u008f\u0010 \u001eñ[\u0099Å\u001c\u0082ÁQI\u008c\u0091è\u0089\u009a ëºÉlU\nGCE¤ÂbÀ\u0086'®!j6u\u001a8`zÍ¼\u0091s¸Ä+ø".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var13 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = b(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var17;
               if ((var2 += var3) >= var6) {
                  d = var7;
                  e = new String[5];
                  D = new nb(var11);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var17;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "¥ÃT\u009c\u009dw\u0093Kz6l¼hÚáÇ\u0010È ù\u000b\u0094a\u0007\u0011Ö¥ª\n¯*t¢";
               var6 = "¥ÃT\u009c\u009dw\u0093Kz6l¼hÚáÇ\u0010È ù\u000b\u0094a\u0007\u0011Ö¥ª\n¯*t¢".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var13 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23286;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/nb", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/nb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
