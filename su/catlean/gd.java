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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum gd {
   public static final gd FadeOut;
   public static final gd Size;
   public static final gd Otkisuli;
   public static final gd Insert;
   public static final gd Fall;
   public static final gd Rocket;
   public static final gd Roll;
   public static final gd Off;
   private static final gd[] r;
   private static final EnumEntries T;
   private static String[] d;
   private static final long a = j0.a(5590435754304314947L, 6157786148408876615L, MethodHandles.lookup().lookupClass()).a(47426807811364L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map e;

   @NotNull
   public static EnumEntries A() {
      return T;
   }

   private static final gd[] W(long var0) {
      var0 ^= a;
      gd[] var2 = new gd[true.g<invokedynamic>(32001, 361583045586557495L ^ var0)];
      var2[0] = FadeOut;
      var2[1] = Size;
      var2[2] = Otkisuli;
      var2[3] = Insert;
      var2[4] = Fall;
      var2[5] = Rocket;
      var2[true.g<invokedynamic>(30374, 8365230340103246227L ^ var0)] = Roll;
      var2[true.g<invokedynamic>(31749, 6450044949485656887L ^ var0)] = Off;
      return var2;
   }

   static {
      long var20 = a ^ 31118882260493L;
      long var22 = var20 ^ 49391254640266L;
      if (7027374208402548799L.A<invokedynamic>(7027374208402548799L, var20) != null) {
         (new String[2]).A<invokedynamic>(new String[2], 7011898639444185170L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[8];
      int var17 = 0;
      String var16 = "\u0081êÆ\u0096î6×\u0099\bÀçÞ>0ÒM&\b\u0004êÿÿØ\u001bây\u0010z_ö\u0089Ãÿ\\y«°9d&·´»\bÔ»\rEãþÔ\u0099\bÊ\u0092È «oÚ÷";
      int var18 = "\u0081êÆ\u0096î6×\u0099\bÀçÞ>0ÒM&\b\u0004êÿÿØ\u001bây\u0010z_ö\u0089Ãÿ\\y«°9d&·´»\bÔ»\rEãþÔ\u0099\bÊ\u0092È «oÚ÷".length();
      char var15 = '\b';
      int var14 = -1;

      label58:
      while(true) {
         ++var14;
         String var24 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var30;
               if ((var14 += var15) >= var18) {
                  e = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "Ei±¾?v¨¯\u000b½\u0014â\u0086´\u0007¡Ëx\u0016L§Úú\u0084";
                  int var5 = "Ei±¾?v¨¯\u000b½\u0014â\u0086´\u0007¡Ëx\u0016L§Úú\u0084".length();
                  int var2 = 0;

                  label40:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              FadeOut = new gd(var11[4], 0);
                              Size = new gd(var11[7], 1);
                              Otkisuli = new gd(var11[3], 2);
                              Insert = new gd(var11[6], 3);
                              Fall = new gd(var11[5], 4);
                              Rocket = new gd(var11[0], 5);
                              Roll = new gd(var11[2], true.g<invokedynamic>(16223, 414736165639842022L ^ var20));
                              Off = new gd(var11[1], true.g<invokedynamic>(26721, 2615032511559811035L ^ var20));
                              r = W(var22);
                              T = EnumEntriesKt.enumEntries((Enum[])r);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label40;
                           }

                           var4 = "\b\u0001\u0019¦\rDöØ<Vy:Y/lÓ";
                           var5 = "\b\u0001\u0019¦\rDöØ<Vy:Y/lÓ".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var30;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label58;
               }

               var16 = "\u008b°\u0094Þ=_Ù \b~\u0002¶á9FF\u0097";
               var18 = "\u008b°\u0094Þ=_Ù \b~\u0002¶á9FF\u0097".length();
               var15 = '\b';
               var14 = -1;
            }

            ++var14;
            var24 = var16.substring(var14, var14 + var15);
            var10001 = 0;
         }
      }
   }

   public static void q(String[] var0) {
      d = var0;
   }

   public static String[] v() {
      return d;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14257;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/gd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/gd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
