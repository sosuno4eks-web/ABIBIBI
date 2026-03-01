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

public final class hp {
   private static k9[] n;
   private static final long a = j0.a(1449287908359526162L, 4271589584057524974L, MethodHandles.lookup().lookupClass()).a(160993401789669L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   @NotNull
   public static final class_2960 O(long a, @NotNull String string) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.d<invokedynamic>(21313, 1504399903497173970L ^ var0));
      class_2960 var10000 = class_2960.method_60654(var2);
      Intrinsics.checkNotNullExpressionValue(var10000, true.d<invokedynamic>(9807, 6873347741878832862L ^ var0));
      return var10000;
   }

   @NotNull
   public static final class_2960 o(long a, @NotNull String id, @NotNull String string) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.d<invokedynamic>(14253, 2765594268345748004L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.d<invokedynamic>(25275, 6544364545849204533L ^ var0));
      class_2960 var10000 = class_2960.method_60655(var2, var3);
      Intrinsics.checkNotNullExpressionValue(var10000, true.d<invokedynamic>(4832, 2244313874129842028L ^ var0));
      return var10000;
   }

   public static void E(k9[] var0) {
      n = var0;
   }

   public static k9[] O() {
      return n;
   }

   static {
      long var9 = a ^ 53911295627230L;
      k9[] var10000 = new k9[5];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -2406165322543233625L, var9);
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
      String var4 = "¾M\u00ad\f-ôjÛÈ6ðÆÖØíK8ï r\u0089a³D,B\u000btKbZp\u0010M/¢ñ5\få)\"\u0019ý¡ç&ËêA\u0093ÿ\u0014´ä§*)¶²W¸üG\u0013P\u0098\u0097B\u001b\u0097ÝA S]\u001eCh±´ÕÉ\u0084µ´êµ¸sc\u001aµÃ\u001c\u0096f\u007f½«Hóey\u0091\u001a";
      int var6 = "¾M\u00ad\f-ôjÛÈ6ðÆÖØíK8ï r\u0089a³D,B\u000btKbZp\u0010M/¢ñ5\få)\"\u0019ý¡ç&ËêA\u0093ÿ\u0014´ä§*)¶²W¸üG\u0013P\u0098\u0097B\u001b\u0097ÝA S]\u001eCh±´ÕÉ\u0084µ´êµ¸sc\u001aµÃ\u001c\u0096f\u007f½«Hóey\u0091\u001a".length();
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
                  b = var7;
                  c = new String[5];
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

               var4 = "\u0099WåË°ÆãÒ\u0006`ÕÞ\fÎ\u0088\u0093\u0010²L\u0080ö\u0088v\u001fkÙÓ©\u008bß×´U";
               var6 = "\u0099WåË°ÆãÒ\u0006`ÕÞ\fÎ\u0088\u0093\u0010²L\u0080ö\u0088v\u001fkÙÓ©\u008bß×´U".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3515;
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
            throw new RuntimeException("su/catlean/hp", var10);
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
         throw new RuntimeException("su/catlean/hp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
