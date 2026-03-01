package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class vj {
   @NotNull
   public static final vj o;
   @NotNull
   private static final fs u;
   private static final long a = j0.a(5881884148878920438L, 6295537123834525124L, MethodHandles.lookup().lookupClass()).a(64128694721800L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private vj() {
   }

   @NotNull
   public final List K(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 29562796756528L;
      return c0.S.G().A(var3).r();
   }

   @Flow
   private final void T(Render2DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean E(long param1, _k param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean C(@NotNull _k wayPoint, long a) {
      var2 ^= a;
      long var4 = var2 ^ 31538656457719L;
      Intrinsics.checkNotNullParameter(var1, true.q<invokedynamic>(6805, 3107041798435488598L ^ var2));
      return this.K(var4).remove(var1);
   }

   public final boolean y(@NotNull _k wayPoint, long a) {
      var2 ^= a;
      long var4 = var2 ^ 89851727067630L;
      Intrinsics.checkNotNullParameter(var1, true.q<invokedynamic>(31226, 1707843472870386210L ^ var2));
      return this.K(var4).add(var1);
   }

   public final int W(long a, @NotNull String i) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 71312580506850L;
      long var22 = var20 ^ 91283602915930L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[11];
      int var16 = 0;
      String var15 = "G¡XT6\u0007àY\u0016èý$ÃtÖ¤\u0010\u008eã\n~Ò\u0013)\u000eÁ\u008bßÀ\u0080\u0088o\u0015\u0018 \u0093ø/\u001dåÇà\u00adÿ¸\u0015\u0087\"3\u0084\u0003f\u0082k\u0005%£\u0090 yð2.\u0084Ì\u009b«)\u0014¸\u0087\u0003(ê9½\u008fô+g[¸ï6\u0096\u0019ZµS\u0011¡ ÕwÞÎ¸\u0096$S>ÊÍk0ææ1\u0082\u0087½´§Í&´Õ1\u009c½\t\u0013Þ\u0002\u0018\u0001Ê`\u001eèÜÝÖÎ\u0000¶)~íerÅ\u001a£T\u0097_\u0089\r ê£Ô\u0017üÐ¸\u0095\u0007r\u009eSS1\u0013\u008aPláª-\u008eè\u009eLI±\u0081|Öµ¨\u0010\t7%A®Ú¶ó(\u0085»0¡A¾© \u000b.ÙV\u0088j`\u000eÂ>xÚ@è¨\u0095ª¢¸\u0090¿°¾xuÐäWÑ\u0093/<";
      int var17 = "G¡XT6\u0007àY\u0016èý$ÃtÖ¤\u0010\u008eã\n~Ò\u0013)\u000eÁ\u008bßÀ\u0080\u0088o\u0015\u0018 \u0093ø/\u001dåÇà\u00adÿ¸\u0015\u0087\"3\u0084\u0003f\u0082k\u0005%£\u0090 yð2.\u0084Ì\u009b«)\u0014¸\u0087\u0003(ê9½\u008fô+g[¸ï6\u0096\u0019ZµS\u0011¡ ÕwÞÎ¸\u0096$S>ÊÍk0ææ1\u0082\u0087½´§Í&´Õ1\u009c½\t\u0013Þ\u0002\u0018\u0001Ê`\u001eèÜÝÖÎ\u0000¶)~íerÅ\u001a£T\u0097_\u0089\r ê£Ô\u0017üÐ¸\u0095\u0007r\u009eSS1\u0013\u008aPláª-\u008eè\u009eLI±\u0081|Öµ¨\u0010\t7%A®Ú¶ó(\u0085»0¡A¾© \u000b.ÙV\u0088j`\u000eÂ>xÚ@è¨\u0095ª¢¸\u0090¿°¾xuÐäWÑ\u0093/<".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[11];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "\u009d\u0084ó\u009côiûWÒ\u009c\u009cÏeÓÍ,çÐC4ºíÜg";
                  int var5 = "\u009d\u0084ó\u009côiûWÒ\u009c\u009cÏeÓÍ,çÐC4ºíÜg".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[3];
                  o = new vj();
                  u = new fs(true.q<invokedynamic>(23864, 3901511866620024456L ^ var20), var22, true.u<invokedynamic>(22178, 9002631903957078737L ^ var20), true.u<invokedynamic>(5295, 5827948123289358559L ^ var20));
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\nMµïD¡¯L\u0096\u0007>~1½y\u008a\u0013ò-ðk\u0013MU¬ü\u0003©\u001e\u0096äÛ\u0018\u00adñ\u0087\u0093\u0081Ñ\u001f*\u008eå¦9ý\u0013êù\u0098;´\u0098?îTÒ";
               var17 = "\nMµïD¡¯L\u0096\u0007>~1½y\u008a\u0013ò-ðk\u0013MU¬ü\u0003©\u001e\u0096äÛ\u0018\u00adñ\u0087\u0093\u0081Ñ\u001f*\u008eå¦9ý\u0013êù\u0098;´\u0098?îTÒ".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15407;
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
            throw new RuntimeException("su/catlean/vj", var10);
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
         throw new RuntimeException("su/catlean/vj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29679;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/vj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/vj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
