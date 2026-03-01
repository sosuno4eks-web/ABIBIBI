package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;

public final class vv {
   @NotNull
   public static final vv G;
   @NotNull
   private static final Map c;
   private static String[] P;
   private static final long a = j0.a(5520340585396876179L, 511053129187755487L, MethodHandles.lookup().lookupClass()).a(50983833473727L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long f;

   private vv() {
   }

   @NotNull
   public final Map k() {
      return c;
   }

   public final void E(int samples, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void i(class_1657 var1, int var2, long var3) {
      var3 ^= a;
      String[] var10000 = -7163427029250384623L.A<invokedynamic>(-7163427029250384623L, var3);
      Object var10001 = c.computeIfAbsent(var1.method_5628(), vv::B);
      Intrinsics.checkNotNullExpressionValue(var10001, true.k<invokedynamic>(32762, 6228699036612573950L ^ var3));
      ArrayDeque var6 = (ArrayDeque)var10001;
      String[] var5 = var10000;
      var6.addLast(var1.method_5829().method_1014(0.0D));

      label21:
      while(true) {
         if (var6.size() > var2) {
            var6.removeFirst();
            if (var5 == null) {
               continue;
            }
         }

         while(var3 <= 0L) {
            if (var5 == null) {
               continue label21;
            }
         }

         return;
      }
   }

   private static final boolean g(List var0, Integer var1) {
      long var2 = a ^ 124863139862602L;
      String[] var10000 = -3089346370760665945L.A<invokedynamic>(-3089346370760665945L, var2);
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(21162, 2353897444678950425L ^ var2));
      String[] var4 = var10000;

      boolean var6;
      label32: {
         try {
            var6 = var0.contains(var1);
            if (var4 != null) {
               return var6;
            }

            if (!var6) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, -3096180459469566057L, var2);
         }

         var6 = false;
         return var6;
      }

      var6 = true;
      return var6;
   }

   private static final boolean d(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final ArrayDeque k(Integer var0) {
      long var1 = a ^ 100892916273902L;
      Intrinsics.checkNotNullParameter(var0, true.k<invokedynamic>(27042, 1095149000954245047L ^ var1));
      return new ArrayDeque();
   }

   private static final ArrayDeque B(Function1 var0, Object var1) {
      return (ArrayDeque)var0.invoke(var1);
   }

   static {
      long var14 = a ^ 62683807000956L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, -6488399821367390797L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[5];
      int var10 = 0;
      String var9 = "EOs«¯p\u008aôjK\t!¤\u00115Ë\u0092n§£TN¸\u000f\fýãpÄx\u0016± +\u001e#û»Bd}\u0016\u001a#ð1w\"éÅì£\u001dÈióÕ×c]\u001e\u009b3'S0\u008b\u0083âI»\u001ahG\u001d\u000fýíc óÃLE\u0091[,K\\éj\u0011:R#¶Õx\u0007¥'Ã¿Zþ,Áüâ\u0081WbRì";
      int var11 = "EOs«¯p\u008aôjK\t!¤\u00115Ë\u0092n§£TN¸\u000f\fýãpÄx\u0016± +\u001e#û»Bd}\u0016\u001a#ð1w\"éÅì£\u001dÈióÕ×c]\u001e\u009b3'S0\u008b\u0083âI»\u001ahG\u001d\u000fýíc óÃLE\u0091[,K\\éj\u0011:R#¶Õx\u0007¥'Ã¿Zþ,Áüâ\u0081WbRì".length();
      char var8 = ' ';
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
                  d = new String[5];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -2869640299439531762L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  f = var23;
                  G = new vv();
                  c = (Map)(new LinkedHashMap());
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

               var9 = "\u0088\u0099\u001d\u000b[ß\u0014ñ \u00848\u008c%¯Æ= ¿^\u008aí\t\u0080R\u0012\u00ad_>>P\u0099F\u0004\u009eöòuÉÕ\u009cÁn-\u009bÏ\u001a\u0003èè";
               var11 = "\u0088\u0099\u001d\u000b[ß\u0014ñ \u00848\u008c%¯Æ= ¿^\u008aí\t\u0080R\u0012\u00ad_>>P\u0099F\u0004\u009eöòuÉÕ\u009cÁn-\u009bÏ\u001a\u0003èè".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void e(String[] var0) {
      P = var0;
   }

   public static String[] U() {
      return P;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22681;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/vv", var10);
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
         throw new RuntimeException("su/catlean/vv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
