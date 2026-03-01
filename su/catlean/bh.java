package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11905;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;

public final class bh extends class_437 {
   @NotNull
   public static final bh Q;
   @NotNull
   private static final aa H;
   private static float T;
   private static float G;
   private static float V;
   private static float E;
   private static boolean i;
   private static float c;
   private static float L;
   private static boolean h;
   private static boolean O;
   @NotNull
   private static ArrayList R;
   private static int z;
   private static final long a = j0.a(7665991957878898251L, 732972765448336364L, MethodHandles.lookup().lookupClass()).a(230257486485506L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map j;

   private bh(long var1) {
      var1 ^= a;
      super(class_2561.method_30163(true.p<invokedynamic>(17439, 6167222517381831629L ^ var1)));
   }

   public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
      long var3 = a ^ 138449027720410L;
      long var5 = var3 ^ 43724753408718L;
      long var7 = var3 ^ 100919713495727L;
      Intrinsics.checkNotNullParameter(var1, true.p<invokedynamic>(5679, 2332032215977302668L ^ var3));
      double var10 = var1.comp_4798();
      double var12 = var1.comp_4799();
      int var14 = var1.method_74245();
      _t.e.u(var10, var12, var14, var5);
      i = true;
      c = (float)var10;
      L = (float)var12;
      k9[] var10000 = -5869222618821830927L.A<invokedynamic>(-5869222618821830927L, var3);
      O = h;
      T = (float)var10 - V;
      k9[] var9 = var10000;
      G = (float)var12 - E;
      Iterable var15 = (Iterable)R;
      boolean var16 = false;
      Iterator var17 = var15.iterator();

      while(var17.hasNext()) {
         Object var18 = var17.next();
         ud var19 = (ud)var18;
         boolean var20 = false;

         try {
            var19.L(var10, var12, var7);
            if (var9 != null && var9 != null) {
               continue;
            }
            break;
         } catch (NumberFormatException var22) {
            throw var22.A<invokedynamic>(var22, -5893887175563828699L, var3);
         }
      }

      try {
         boolean var23 = super.method_25402(var1, var2);
         if (-5878955331161052413L.A<invokedynamic>(-5878955331161052413L, var3) == null) {
            (new k9[5]).A<invokedynamic>(new k9[5], -5863368027722929548L, var3);
         }

         return var23;
      } catch (NumberFormatException var21) {
         throw var21.A<invokedynamic>(var21, -5893887175563828699L, var3);
      }
   }

   public boolean method_25406(@NotNull class_11909 click) {
      long var2 = a ^ 35892006695448L;
      long var10001 = var2 ^ 118948385499438L;
      int var4 = (int)((var2 ^ 118948385499438L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.p<invokedynamic>(2219, 3050464785790882499L ^ var2));
      double var7 = var1.comp_4798();
      double var9 = var1.comp_4799();
      int var11 = var1.method_74245();
      i = false;
      O = false;
      _t.e.S(var4, var5, var7, var6, var9, var11);
      return super.method_25406(var1);
   }

   public boolean method_25400(@NotNull class_11905 input) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25421() {
      return false;
   }

   protected void method_57734(@NotNull class_332 context) {
      long var2 = a ^ 5511953293179L;
      Intrinsics.checkNotNullParameter(var1, true.p<invokedynamic>(6504, 2181463658555666018L ^ var2));
   }

   public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
      long var5 = a ^ 833495576643L;
      Intrinsics.checkNotNullParameter(var1, true.p<invokedynamic>(24917, 1937686452841331049L ^ var5));
   }

   static {
      long var27 = a ^ 57804001859301L;
      long var29 = var27 ^ 76727926073903L;
      long var10001 = var27 ^ 36385020064039L;
      int var31 = (int)((var27 ^ 36385020064039L) >>> 48);
      int var32 = (int)(var10001 << 16 >>> 48);
      int var33 = (int)(var10001 << 32 >>> 32);
      long var34 = var27 ^ 65117341388233L;
      e = new HashMap(13);
      0.A<invokedynamic>(0, 2119972698733604260L, var27);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[13];
      int var23 = 0;
      String var22 = "×z&¯\u0097q¹´Ô<fÎé\u001a\u009eÛÇ\u0080%©\u0088Ø¸\u0094¬ÀÝ\u0007\u001bÎñ¨\u0010ÜÏl\u0084áàõ*S¤ \u0007>}Ï\u0002\u0010\u0007E\nL»\u0001\u000b';ý5§_\u0012fñ\u0010s\u001e±a\u001c\u007fEIa²\u001c«ò±\u0084X(0\u009fO\u0088\u0013Lcß§\u000f/\u0082\u0017(\\Êá\u0088ù°|x1¼ø÷\u008f:F\u0017\u001c\u008cC\fF\u0080\u0092Þºk(\b²Qu\u0002Òë\u001b\u0082ü0\u0098¾Xã\u0016\u008dõ¶\u009a©¸\rü)@f\u0005Õ¬KP\u0014ÑKz\u0090ZÃ\u0099 éØ¥\u00adsåÀû\u0080$_oAç3b\u0085\u0088äOÁ¶U\u000fpyó\u0091g ;è\u0010¶(1\u009d«¤V\b$i1Î9\u0089\u0086½\u0010\u008d7î\u0018\u0005)\u0086\u0012\\_@\u008c\u008ca<\u0001\u0010O»Á \\áÝï(;-LZ{Wè\u0010ßã£H\u0017\u0006Í\u0089HÊ(\u009e°ù¯\u0083";
      int var24 = "×z&¯\u0097q¹´Ô<fÎé\u001a\u009eÛÇ\u0080%©\u0088Ø¸\u0094¬ÀÝ\u0007\u001bÎñ¨\u0010ÜÏl\u0084áàõ*S¤ \u0007>}Ï\u0002\u0010\u0007E\nL»\u0001\u000b';ý5§_\u0012fñ\u0010s\u001e±a\u001c\u007fEIa²\u001c«ò±\u0084X(0\u009fO\u0088\u0013Lcß§\u000f/\u0082\u0017(\\Êá\u0088ù°|x1¼ø÷\u008f:F\u0017\u001c\u008cC\fF\u0080\u0092Þºk(\b²Qu\u0002Òë\u001b\u0082ü0\u0098¾Xã\u0016\u008dõ¶\u009a©¸\rü)@f\u0005Õ¬KP\u0014ÑKz\u0090ZÃ\u0099 éØ¥\u00adsåÀû\u0080$_oAç3b\u0085\u0088äOÁ¶U\u000fpyó\u0091g ;è\u0010¶(1\u009d«¤V\b$i1Î9\u0089\u0086½\u0010\u008d7î\u0018\u0005)\u0086\u0012\\_@\u008c\u008ca<\u0001\u0010O»Á \\áÝï(;-LZ{Wè\u0010ßã£H\u0017\u0006Í\u0089HÊ(\u009e°ù¯\u0083".length();
      char var21 = ' ';
      int var20 = -1;

      label76:
      while(true) {
         ++var20;
         String var42 = var22.substring(var20, var20 + var21);
         byte var44 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var42.getBytes("ISO-8859-1"));
            String var49 = a(var26).intern();
            switch(var44) {
            case 0:
               var25[var23++] = var49;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  d = new String[13];
                  j = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[4];
                  int var10 = 0;
                  String var11 = "nO\u009c\u000fåß\u0017êÔ8ÉÏ¿¸\u0006\t";
                  int var12 = "nO\u009c\u000fåß\u0017êÔ8ÉÏ¿¸\u0006\t".length();
                  int var9 = 0;

                  label58:
                  while(true) {
                     int var48 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var48, var9).getBytes("ISO-8859-1");
                     long[] var45 = var13;
                     var48 = var10++;
                     long var52 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var53 = -1;

                     while(true) {
                        long var15 = var52;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var55 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var53) {
                        case 0:
                           var45[var48] = var55;
                           if (var9 >= var12) {
                              f = var13;
                              g = new Integer[4];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = 3184765492037656625L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var52 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var51 = true;
                              long var0 = var52;
                              Q = new bh(var29);
                              H = new aa(sa.OUT_QUINT, var0, (short)var31, (short)var32, var33);
                              V = -1.0F;
                              E = -1.0F;
                              c = -1.0F;
                              L = -1.0F;
                              R = new ArrayList();
                              Iterable var36 = (Iterable)gz.M.R();
                              boolean var37 = false;
                              Iterator var38 = var36.iterator();

                              while(var38.hasNext()) {
                                 Object var39 = var38.next();
                                 nm var40 = (nm)var39;
                                 boolean var41 = false;
                                 R.add(new ud(var34, var40));
                              }

                              return;
                           }
                           break;
                        default:
                           var45[var48] = var55;
                           if (var9 < var12) {
                              continue label58;
                           }

                           var11 = "F%]ûÇ-\u0018\u008cÎc_\u0014jÀ\u009b)";
                           var12 = "F%]ûÇ-\u0018\u008cÎc_\u0014jÀ\u009b)".length();
                           var9 = 0;
                        }

                        var48 = var9;
                        var9 += 8;
                        var14 = var11.substring(var48, var9).getBytes("ISO-8859-1");
                        var45 = var13;
                        var48 = var10++;
                        var52 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var53 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var49;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label76;
               }

               var22 = "Sw¼u5\u000bãNEÙ\u008fÅ\u007fsÓ\u0000(õ%Õ°|Ý\"\u000bW=È¹¢\u0005P®ú8Ð\u0002pF7ü\tÝ ²ü¬m\u0086kw\u0005\u0000ûªª>";
               var24 = "Sw¼u5\u000bãNEÙ\u008fÅ\u007fsÓ\u0000(õ%Õ°|Ý\"\u000bW=È¹¢\u0005P®ú8Ð\u0002pF7ü\tÝ ²ü¬m\u0086kw\u0005\u0000ûªª>".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var42 = var22.substring(var20, var20 + var21);
            var44 = 0;
         }
      }
   }

   public static void H(int var0) {
      z = var0;
   }

   public static int t() {
      return z;
   }

   public static int K() {
      int var0 = t();

      try {
         return var0 == 0 ? 119 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8988;
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
            throw new RuntimeException("su/catlean/bh", var10);
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
         throw new RuntimeException("su/catlean/bh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3666;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/bh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/bh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
