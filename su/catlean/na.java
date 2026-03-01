package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class na extends nm {
   @NotNull
   public static final na X;
   @NotNull
   private static final List t;
   @NotNull
   private static final aa R;
   private static final long c = j0.a(7526091677389679608L, 3125062501101706339L, MethodHandles.lookup().lookupClass()).a(256070029602921L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] m;
   private static final Map n;

   private na(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 92191306131742L;
      super(true.d<invokedynamic>(5419, 2921452608985205093L ^ var1), var3);
   }

   @NotNull
   public final List J() {
      return t;
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void O(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean D(d1 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean R(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var27 = c ^ 36810850169325L;
      long var29 = var27 ^ 124647786456287L;
      long var10001 = var27 ^ 140073522586347L;
      int var31 = (int)((var27 ^ 140073522586347L) >>> 48);
      int var32 = (int)(var10001 << 16 >>> 48);
      int var33 = (int)(var10001 << 32 >>> 32);
      i = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "|\u0005\u009a\u0013Åë\u0011Uf8,T×\u009e7¼\u0004Uµ\u0086\u001e2ã¨\u001c×5ÚwäµÂtY\u0007åªüí\u0010\u0018'\u008eF4Iî¶\u0091\u0088a),\u0011\u008e\u00985\u001d9~wCTË^ \u0012&A`}m¬LÄ³\t`\u00ad'2î\u0002\u009b°COæ\u0007t\u0095m\u007fAW®,×\u0010(\u001eaÚÒEKÅ\u0016-\u0086\u0093\u001cÎu<\u0010\u0091k\rÿÌí¡8A\u0084\u009fóv1³C(\u0010ö\u001c¨âVï\u001dS\u0001§G2«Ñ¥2.f\u009a\u0094é\u0097®©\u0000v¬TÑXJ\u000e\u0010ÈûW\u0003Î´ \u0088¯\u0019m½ávD\u0000Z\u0082\u0080p\u009eB1pð¤@\u00ad\u001a\\oë¥F8Ñî«\r0D\u0081î\u008d3±«ñÚ\u0091ËüñN\r\u0018Î\u0080\u0094\\QJ\u009d×û¶.´>wEwßÇ\u001eô\u008fn\\Õ\u007fJA\u0007\u0018\u0019á<\u00102ã5z\u0099\nb!é»\u0081sæïÑ\u009e ½Cêï\u0015ïy\u0001e{aÆïµÿB¬\u0010\u001a\u008f\u0085&ÂÍi¡)9\\Î\u00893\u0010@ä\u000f¦\u0082òRO\u000b\u0087ÊÆÃJõ)\u00107ä?üw4\u0089\u0000\u009fTkÁ5tD\u0081\u0010\u00adnµ\u0016+äQÃ_¾75D+Ý\u000e";
      int var24 = "|\u0005\u009a\u0013Åë\u0011Uf8,T×\u009e7¼\u0004Uµ\u0086\u001e2ã¨\u001c×5ÚwäµÂtY\u0007åªüí\u0010\u0018'\u008eF4Iî¶\u0091\u0088a),\u0011\u008e\u00985\u001d9~wCTË^ \u0012&A`}m¬LÄ³\t`\u00ad'2î\u0002\u009b°COæ\u0007t\u0095m\u007fAW®,×\u0010(\u001eaÚÒEKÅ\u0016-\u0086\u0093\u001cÎu<\u0010\u0091k\rÿÌí¡8A\u0084\u009fóv1³C(\u0010ö\u001c¨âVï\u001dS\u0001§G2«Ñ¥2.f\u009a\u0094é\u0097®©\u0000v¬TÑXJ\u000e\u0010ÈûW\u0003Î´ \u0088¯\u0019m½ávD\u0000Z\u0082\u0080p\u009eB1pð¤@\u00ad\u001a\\oë¥F8Ñî«\r0D\u0081î\u008d3±«ñÚ\u0091ËüñN\r\u0018Î\u0080\u0094\\QJ\u009d×û¶.´>wEwßÇ\u001eô\u008fn\\Õ\u007fJA\u0007\u0018\u0019á<\u00102ã5z\u0099\nb!é»\u0081sæïÑ\u009e ½Cêï\u0015ïy\u0001e{aÆïµÿB¬\u0010\u001a\u008f\u0085&ÂÍi¡)9\\Î\u00893\u0010@ä\u000f¦\u0082òRO\u000b\u0087ÊÆÃJõ)\u00107ä?üw4\u0089\u0000\u009fTkÁ5tD\u0081\u0010\u00adnµ\u0016+äQÃ_¾75D+Ý\u000e".length();
      char var21 = '(';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var34 = var22.substring(var20, var20 + var21);
         byte var36 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var26).intern();
            switch(var36) {
            case 0:
               var25[var23++] = var41;
               if ((var20 += var21) >= var24) {
                  d = var25;
                  e = new String[15];
                  n = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[8];
                  int var10 = 0;
                  String var11 = "³'2\u0081\u000f\u0092e´1ù£\u0015÷H¨\u0013úÀÅ\\QÐ\u009dm\u0095Þ-ðc\u0097\u0017\u0000\u0017¼\u009a\u008dXx¦K\u0013×á\u008b\u0006gî\u000b";
                  int var12 = "³'2\u0081\u000f\u0092e´1ù£\u0015÷H¨\u0013úÀÅ\\QÐ\u009dm\u0095Þ-ðc\u0097\u0017\u0000\u0017¼\u009a\u008dXx¦K\u0013×á\u008b\u0006gî\u000b".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var40 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var40, var9).getBytes("ISO-8859-1");
                     long[] var37 = var13;
                     var40 = var10++;
                     long var44 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var45 = -1;

                     while(true) {
                        long var15 = var44;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var47 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var45) {
                        case 0:
                           var37[var40] = var47;
                           if (var9 >= var12) {
                              j = var13;
                              m = new Integer[8];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = -3521204257977821971L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var44 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var43 = true;
                              long var0 = var44;
                              X = new na(var29);
                              t = (List)(new ArrayList());
                              R = new aa(sa.OUT_BACK, var0, (short)var31, (short)var32, var33);
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var47;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "¦ÞO\u0014Ë°t\u0080o\u0000Í]ßðvi";
                           var12 = "¦ÞO\u0014Ë°t\u0080o\u0000Í]ßðvi".length();
                           var9 = 0;
                        }

                        var40 = var9;
                        var9 += 8;
                        var14 = var11.substring(var40, var9).getBytes("ISO-8859-1");
                        var37 = var13;
                        var40 = var10++;
                        var44 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var45 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var41;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "ð\u0098À(¶b~\u00adFÔIhTg\u001dê\u0088Kpå¢\u0011{×¥ð£½Ì1Ýlê¤\u0099\u0080ó|\u0091\u009e¸ºnôç\u009aÛk¨B\"J\u0019÷4L¸<®\u0094\u0095fRÏ¤à®Èù\u0014/¶üâè\u0019Î<\t\u0096éW°¿\u0093ËX\u007f*\t\u0016@Ùê6{¢²$v7WN=7¡\u0095ºc»û(\u001b2>\u0002ô\u000bû\u0003\u0007\u001aî¶*V¦]ÿÎ.ù/~9h» \u000flEÉ©`\u008a\u0003²¨^V\n\u001cP";
               var24 = "ð\u0098À(¶b~\u00adFÔIhTg\u001dê\u0088Kpå¢\u0011{×¥ð£½Ì1Ýlê¤\u0099\u0080ó|\u0091\u009e¸ºnôç\u009aÛk¨B\"J\u0019÷4L¸<®\u0094\u0095fRÏ¤à®Èù\u0014/¶üâè\u0019Î<\t\u0096éW°¿\u0093ËX\u007f*\t\u0016@Ùê6{¢²$v7WN=7¡\u0095ºc»û(\u001b2>\u0002ô\u000bû\u0003\u0007\u001aî¶*V¦]ÿÎ.ù/~9h» \u000flEÉ©`\u008a\u0003²¨^V\n\u001cP".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var34 = var22.substring(var20, var20 + var21);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18809;
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
            throw new RuntimeException("su/catlean/na", var10);
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
         throw new RuntimeException("su/catlean/na" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7580;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/na", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/na" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
