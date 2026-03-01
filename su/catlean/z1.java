package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
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
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;

public final class z1 extends class_437 {
   @NotNull
   private final fs x;
   @NotNull
   private final f9 y;
   @NotNull
   private final f9 s;
   private static final long a = j0.a(189507109474113337L, 536615340427485054L, MethodHandles.lookup().lookupClass()).a(119680293666089L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public z1(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 67439791519571L;
      long var5 = var1 ^ 16955039051590L;
      long var7 = var1 ^ 125442537121151L;
      super(class_2561.method_30163(true.u<invokedynamic>(4411, 2473293477612094266L ^ var1)));
      this.x = new fs(true.u<invokedynamic>(27253, 1200552723432044669L ^ var1), var3, true.s<invokedynamic>(26435, 4166857751654349868L ^ var1), true.s<invokedynamic>(23490, 2039868997337841839L ^ var1));
      this.y = new f9(0.0F, 0.0F, 100.0F, var7, 25.0F, nf.s.G(true.u<invokedynamic>(16358, 6250600121019903458L ^ var1), var5, new Object[0]), z1::n, 0, (Color)null, (Color)null, 0.0F, 0.0F, true.s<invokedynamic>(32162, 6247638741920425676L ^ var1), (DefaultConstructorMarker)null);
      this.s = new f9(0.0F, 0.0F, 100.0F, var7, 25.0F, nf.s.G(true.u<invokedynamic>(785, 5726474819683455263L ^ var1), var5, new Object[0]), z1::E, 0, (Color)null, (Color)null, 0.0F, 0.0F, true.s<invokedynamic>(16163, 5584227941856470089L ^ var1), (DefaultConstructorMarker)null);
   }

   public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
      long var3 = a ^ 76083180309929L;
      long var5 = var3 ^ 15917461627716L;
      Intrinsics.checkNotNullParameter(var1, true.u<invokedynamic>(5909, 7486775045518720652L ^ var3));
      double var7 = var1.comp_4798();
      double var9 = var1.comp_4799();
      this.y.k((float)var7, (float)var9, var5);
      this.s.k((float)var7, (float)var9, var5);
      return super.method_25402(var1, var2);
   }

   public void method_25419() {
   }

   private static final Unit n() {
      long var0 = a ^ 96212155289823L;
      String var2 = true.u<invokedynamic>(12084, 358086816471784415L ^ var0);
      class_156.method_668().method_673(URI.create(var2));
      return Unit.INSTANCE;
   }

   private static final Unit E() {
      long var0 = a ^ 39894664363270L;
      long var10001 = var0 ^ 10665178348403L;
      int var2 = (int)((var0 ^ 10665178348403L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var2, (short)var3, var4).close();
      return Unit.INSTANCE;
   }

   static {
      long var11 = a ^ 126874773988023L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[14];
      int var18 = 0;
      String var17 = "¸P\\ã~äJ¬Á²§UÀa\u0014VÿÝ+cñÐñ¿\u008cë\u001fSç¨þ\u0083\u0010É\u0000ËD£\u009d5øïHar\u0015©4M8AyA\u0007ïAE2tTm¿§\u008c$\u0094ï#80¢gh|\u0081K-Ü1\u0019\u0004fÌ£r÷KF~°\u0087ºqJÈÒ/lª\u008c|\u008b\u009aD\u0010*\u0010û¢I2%kÃ5Te,\u001bµ\u0088\u00923 \u0014ðI\u00ad\u0089\u0096|Ê\bC£\u008cT5\u0013\u0082\n@\u0015Z\u0018N\u0010\u0001J=ú\u008aÜ\"\u009dÐ\u0010ó¹\u0000\u0085\u008f0\u0013\u007f\u001c%\u0084\u0089ÜR\u0096²\u0010/;\u0000ÎH^Ò¹uÆê¹×ÈL\u0089 ®$\u0092R\u001cèG®Î\t\u0012k\u0007vvú\t\"\u0001Û\u0090[÷Ñ\u0081\u008aTï\u0018\u008bw\u0099\u0010Í?c§«v'µS\u0017ìO\u0086\u0091ÐÈ(5É\u0013D@Sò\u0091Cú¡^\u0017EúgóÃQçÆ¶cd(R\u0088\u0081£Õ¿K\u008auÝ\u0006Ú!\u0000û\u0010«\u0004ØgHÿ\u0017\u0085=h\u0014÷9ÈU}\u0010\u0018a\u0097LT\u009dVÎ\b\u001b¬y\u008e0\u0006F";
      int var19 = "¸P\\ã~äJ¬Á²§UÀa\u0014VÿÝ+cñÐñ¿\u008cë\u001fSç¨þ\u0083\u0010É\u0000ËD£\u009d5øïHar\u0015©4M8AyA\u0007ïAE2tTm¿§\u008c$\u0094ï#80¢gh|\u0081K-Ü1\u0019\u0004fÌ£r÷KF~°\u0087ºqJÈÒ/lª\u008c|\u008b\u009aD\u0010*\u0010û¢I2%kÃ5Te,\u001bµ\u0088\u00923 \u0014ðI\u00ad\u0089\u0096|Ê\bC£\u008cT5\u0013\u0082\n@\u0015Z\u0018N\u0010\u0001J=ú\u008aÜ\"\u009dÐ\u0010ó¹\u0000\u0085\u008f0\u0013\u007f\u001c%\u0084\u0089ÜR\u0096²\u0010/;\u0000ÎH^Ò¹uÆê¹×ÈL\u0089 ®$\u0092R\u001cèG®Î\t\u0012k\u0007vvú\t\"\u0001Û\u0090[÷Ñ\u0081\u008aTï\u0018\u008bw\u0099\u0010Í?c§«v'µS\u0017ìO\u0086\u0091ÐÈ(5É\u0013D@Sò\u0091Cú¡^\u0017EúgóÃQçÆ¶cd(R\u0088\u0081£Õ¿K\u008auÝ\u0006Ú!\u0000û\u0010«\u0004ØgHÿ\u0017\u0085=h\u0014÷9ÈU}\u0010\u0018a\u0097LT\u009dVÎ\b\u001b¬y\u008e0\u0006F".length();
      char var16 = ' ';
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
                  c = new String[14];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[10];
                  int var3 = 0;
                  String var4 = "õ;R\u0013þF\u00874ÞXlã±ýôb*\u0000¹é{¯\u008fv¡5hÒ\"äêg\r\u0090\u008f\u008bUÖn>/N1Þ\u008bºä¡ÚÙ6öÝ3\u008bòo?`E\b,\u001f\n";
                  int var5 = "õ;R\u0013þF\u00874ÞXlã±ýôb*\u0000¹é{¯\u008fv¡5hÒ\"äêg\r\u0090\u008f\u008bUÖn>/N1Þ\u008bºä¡ÚÙ6öÝ3\u008bòo?`E\b,\u001f\n".length();
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
                              f = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\tÄX5ï(»þÍ¹1d\u0007\u00adòS";
                           var5 = "\tÄX5ï(»þÍ¹1d\u0007\u00adòS".length();
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

               var17 = "ç\u009aËÉ\u008e\u001cP\\ÿú\u001e\u000f¸åó&öÍoÂp´mª\u0016þã¢Ì÷;å$ûô4°y88 \u0010M}³X@c6vJ\u0082Å,\u008b\u0094}Mù8m»\u0012µ%xãO9H¶u\u009f";
               var19 = "ç\u009aËÉ\u008e\u001cP\\ÿú\u001e\u000f¸åó&öÍoÂp´mª\u0016þã¢Ì÷;å$ûô4°y88 \u0010M}³X@c6vJ\u0082Å,\u008b\u0094}Mù8m»\u0012µ%xãO9H¶u\u009f".length();
               var16 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4244;
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
            throw new RuntimeException("su/catlean/z1", var10);
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
         throw new RuntimeException("su/catlean/z1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23035;
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
            throw new RuntimeException("su/catlean/z1", var14);
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
         throw new RuntimeException("su/catlean/z1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
