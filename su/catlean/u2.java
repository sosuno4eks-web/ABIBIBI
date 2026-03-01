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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_442;
import org.jetbrains.annotations.NotNull;

public final class u2 extends class_437 {
   @NotNull
   private final class_2960 Y;
   @NotNull
   private final f9 j;
   @NotNull
   private final f9 P;
   private static final long a = j0.a(5566123214592382052L, 3519584097706418993L, MethodHandles.lookup().lookupClass()).a(155439161388420L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public u2(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 49386643320227L;
      long var5 = var1 ^ 97500680462432L;
      long var7 = var1 ^ 41576888117849L;
      super(class_2561.method_30163(true.n<invokedynamic>(16998, 2514553782777415369L ^ var1)));
      this.Y = hp.o(var3, true.n<invokedynamic>(5117, 2849617336392898396L ^ var1), true.n<invokedynamic>(4974, 1308847955304404936L ^ var1));
      this.j = new f9(0.0F, 0.0F, 100.0F, var7, 25.0F, nf.s.G(true.n<invokedynamic>(4868, 1398186756873443238L ^ var1), var5, new Object[0]), u2::F, 0, (Color)null, (Color)null, 0.0F, 0.0F, true.o<invokedynamic>(6058, 9154157482896828175L ^ var1), (DefaultConstructorMarker)null);
      this.P = new f9(0.0F, 0.0F, 100.0F, var7, 25.0F, nf.s.G(true.n<invokedynamic>(28506, 9252004097666034L ^ var1), var5, new Object[0]), u2::M, 0, (Color)null, (Color)null, 0.0F, 0.0F, true.o<invokedynamic>(22583, 9103684102004500624L ^ var1), (DefaultConstructorMarker)null);
   }

   public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
      long var3 = a ^ 1332243908154L;
      long var5 = var3 ^ 39069172701466L;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(21903, 5889651119912345537L ^ var3));
      double var7 = var1.comp_4798();
      double var9 = var1.comp_4799();
      this.j.k((float)var7, (float)var9, var5);
      this.P.k((float)var7, (float)var9, var5);
      return super.method_25402(var1, var2);
   }

   protected void method_57734(@NotNull class_332 context) {
      long var2 = a ^ 119093801666921L;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(19173, 6805304061127020543L ^ var2));
   }

   public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
      long var5 = a ^ 28014068158512L;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(19173, 6805289604683749030L ^ var5));
   }

   private static final Unit F() {
      long var0 = a ^ 54064508886416L;
      long var2 = var0 ^ 14076130325323L;
      long var10001 = var0 ^ 128808236706344L;
      int var4 = (int)((var0 ^ 128808236706344L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      t5.x.L(var2, true);
      s8.H((short)var4, (short)var5, var6).method_1507((class_437)(new class_442()));
      return Unit.INSTANCE;
   }

   private static final Unit M() {
      long var0 = a ^ 111126938207060L;
      long var2 = var0 ^ 97819034316175L;
      long var10001 = var0 ^ 36406814897388L;
      int var4 = (int)((var0 ^ 36406814897388L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      t5.x.L(var2, false);
      s8.H((short)var4, (short)var5, var6).method_1507((class_437)(new class_442()));
      return Unit.INSTANCE;
   }

   static {
      long var11 = a ^ 64575537876946L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[16];
      int var18 = 0;
      String var17 = "Êº\u008eç\u0019Í\u0083ð÷eÇðª{J#(Ê\nÖ\u0003%µû:\u000f«ÞFF÷W\u009eH\u009bl\rÝ\u0012à\u0088f\u0096æM#«\u0010\u0090i\u001c°\u0088ë\u001eÃì(\u0088\u0018\u0093²þ\u001d\u008e¸%\u008dcù~÷~2ä\u0001ÄÉøB<MxÆð\u0016(\u0092\u008eQ\u009f$\u009aB6úÒÊ0\u0013c>LÆ¯Z\u0088\u000eæ-¼öl²÷ý·Þ\u0084\u009e\u0018p¿ÏQ)¼&\u0087À3©AÄWC\u009aN\u0011ÅWÝ\u0004\u007f\u0099v\u0011\u0010J£eÌd<z|\u009c\u0004RÔ>ô¹\u001c\u0010¦kÇÓäØ\u009d.i:q>}±Äf î¹ùUi³\u008eÝÆRÎ \"(^¯qÄ,\u0004-\b4¦â¨ô(hh(v\u0010oVëW1\u0001§ýº\u007f\u0084\u0080zwúÃ@\u0017w\u0007bzb¶ö¯\u0080b!¹\u007fK/ñ\u008c\u000bC¨h\tþþ¯Mö²¸HYÉ\u0017D,o³q@ÉXè¿¹=\u008c\u00915l®`aÂ¦ûôZOµOl-Ñ L4°#)\u0005YÔ|Ónõà\u0099\u008a\u009b\"¾RZ/FÀdF«\u0085p,x¾·\u0010*\u001f å\u001fÿ\u0091H²^Aã\u00139\u0082\u0011\u0010^m[\f\u009c/8ÓNöu\u00070Îõ7\u0018Ø\u0015ÝZ.\u0000¥\u0011\u0002wemf@õ\u0096o©.\u008dS¡«T\u0010\u0080üëÌ+1Rù8dncG+§¬";
      int var19 = "Êº\u008eç\u0019Í\u0083ð÷eÇðª{J#(Ê\nÖ\u0003%µû:\u000f«ÞFF÷W\u009eH\u009bl\rÝ\u0012à\u0088f\u0096æM#«\u0010\u0090i\u001c°\u0088ë\u001eÃì(\u0088\u0018\u0093²þ\u001d\u008e¸%\u008dcù~÷~2ä\u0001ÄÉøB<MxÆð\u0016(\u0092\u008eQ\u009f$\u009aB6úÒÊ0\u0013c>LÆ¯Z\u0088\u000eæ-¼öl²÷ý·Þ\u0084\u009e\u0018p¿ÏQ)¼&\u0087À3©AÄWC\u009aN\u0011ÅWÝ\u0004\u007f\u0099v\u0011\u0010J£eÌd<z|\u009c\u0004RÔ>ô¹\u001c\u0010¦kÇÓäØ\u009d.i:q>}±Äf î¹ùUi³\u008eÝÆRÎ \"(^¯qÄ,\u0004-\b4¦â¨ô(hh(v\u0010oVëW1\u0001§ýº\u007f\u0084\u0080zwúÃ@\u0017w\u0007bzb¶ö¯\u0080b!¹\u007fK/ñ\u008c\u000bC¨h\tþþ¯Mö²¸HYÉ\u0017D,o³q@ÉXè¿¹=\u008c\u00915l®`aÂ¦ûôZOµOl-Ñ L4°#)\u0005YÔ|Ónõà\u0099\u008a\u009b\"¾RZ/FÀdF«\u0085p,x¾·\u0010*\u001f å\u001fÿ\u0091H²^Aã\u00139\u0082\u0011\u0010^m[\f\u009c/8ÓNöu\u00070Îõ7\u0018Ø\u0015ÝZ.\u0000¥\u0011\u0002wemf@õ\u0096o©.\u008dS¡«T\u0010\u0080üëÌ+1Rù8dncG+§¬".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[16];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "\u0083j%!\u000b~ówë\rq\u000f}ër\u0006\u0086\u0098Wð\u0083Îñh";
                  int var5 = "\u0083j%!\u000b~ówë\rq\u000f}ër\u0006\u0086\u0098Wð\u0083Îñh".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "}^\u0084»\u009f1\u0010\u0091\u0019\u0003\r\u0098W¹á+";
                           var5 = "}^\u0084»\u009f1\u0010\u0091\u0019\u0003\r\u0098W¹á+".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "óþÏ$âXT)JGk\u0011GzG\u0012\u00105\u001d¥HË¯¥\u0085¨DCê\u0093\u0019-5";
               var19 = "óþÏ$âXT)JGk\u0011GzG\u0012\u00105\u001d¥HË¯¥\u0085¨DCê\u0093\u0019-5".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2335;
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
            throw new RuntimeException("su/catlean/u2", var10);
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
         throw new RuntimeException("su/catlean/u2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32022;
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
            throw new RuntimeException("su/catlean/u2", var14);
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
         throw new RuntimeException("su/catlean/u2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
