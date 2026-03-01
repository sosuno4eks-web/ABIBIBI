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
import org.jetbrains.annotations.NotNull;

public final class iw {
   private static final long a = j0.a(3840605541867404672L, 8474326096654125637L, MethodHandles.lookup().lookupClass()).a(148002427831473L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @NotNull
   public static final z0 K(@NotNull z0 $this$withNameValOverride, int i, int a, @NotNull String string, long a) {
      long var6 = ((long)var2 << 32 | var4 << 32 >>> 32) ^ a;
      long var8 = var6 ^ 113303533492268L;
      Intrinsics.checkNotNullParameter(var0, true.q<invokedynamic>(23728, 4596722433511351016L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(13530, 8837879662526270081L ^ var6));
      s2.T.W().add(new em(var8, var0.M(), (Number)var1, var3));
      return var0;
   }

   @NotNull
   public static final zc j(@NotNull zc $this$withNameValOverride, float i, long a, @NotNull String string) {
      var2 ^= a;
      long var5 = var2 ^ 16512618004642L;
      Intrinsics.checkNotNullParameter(var0, true.q<invokedynamic>(27834, 7020841983937989230L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.q<invokedynamic>(23997, 1115097389979892586L ^ var2));
      s2.T.W().add(new em(var5, var0.M(), (Number)var1, var4));
      return var0;
   }

   static {
      long var0 = a ^ 117882741349860L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "©Ä½ð\u0000êB\\Íù\u0002ì5÷\u008a¬\u0010\u0015t\n^»4\u008e°\u009cô)Ë\u000bA\u0012\u0091";
      int var8 = "©Ä½ð\u0000êB\\Íù\u0002ì5÷\u008a¬\u0010\u0015t\n^»4\u008e°\u009cô)Ë\u000bA\u0012\u0091".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[4];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "\u009e\u008a\u001a\tG\u008bÛ#\u009c\u0007yF²@ÿÏ\u0010j\u009b\u0019T\u0014S,\u00ad\u0003ëª6]\u000f<\u0088";
               var8 = "\u009e\u008a\u001a\tG\u008bÛ#\u009c\u0007yF²@ÿÏ\u0010j\u009b\u0019T\u0014S,\u00ad\u0003ëª6]\u000f<\u0088".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26616;
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
            throw new RuntimeException("su/catlean/iw", var10);
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
         throw new RuntimeException("su/catlean/iw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
