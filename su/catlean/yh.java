package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class yh extends k9 {
   @NotNull
   public static final yh b;
   static final KProperty[] x;
   @NotNull
   private static final zo y;
   @NotNull
   private static final zc K;
   @NotNull
   private static final zv L;
   @Nullable
   private static class_3965 N;
   private static int A;
   private static final long c = j0.a(4864142659304017251L, 6248584568025495851L, MethodHandles.lookup().lookupClass()).a(26673120744696L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private yh(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 34695719171011L;
      super(var3, true.k<invokedynamic>(5172, 5933805042204070348L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final boolean A(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 73708283345404L;
      int var3 = (int)((var1 ^ 73708283345404L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      int[] var6 = 5379471686440840940L.A<invokedynamic>(5379471686440840940L, var1);

      try {
         boolean var10000 = (Boolean)y.k((short)var3, this, x[0], (short)var4, var5);
         if (var6 != null) {
            (new int[3]).A<invokedynamic>(new int[3], 5336196612334717366L, var1);
         }

         return var10000;
      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, 5373702500702943437L, var1);
      }
   }

   private final float x(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ c;
      long var10001 = var4 ^ 65480272640228L;
      int var6 = (int)((var4 ^ 65480272640228L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)K.k((short)var6, this, x[1], (short)var7, var8)).floatValue();
   }

   private final Color H(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 112786252610911L;
      int var3 = (int)((var1 ^ 112786252610911L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)L.k((short)var3, this, x[2], (short)var4, var5);
   }

   @Flow
   private final void C(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void C(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = c ^ 47751432089522L;
      long var22 = var20 ^ 108011669325581L;
      long var24 = var20 ^ 103664961168497L;
      long var26 = var20 ^ 11319527315558L;
      long var28 = var20 ^ 66000114443588L;
      f = new HashMap(13);
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
      String var15 = "\u0097\u0006ò/G\u0097\u0014Ì¡2\u009d\u0017]ëÍªH\u009a¨Iî¡õY\u0010ü\u0003þ±l\u008en\u0094u÷º»Q\u0016¦E\u0018\u00adnõW-\u001ehÇ\u0095®\u009fìU\u00870|4ítPÐb¸P\u0010©}H\u009f\u000fÇY¥]·«÷_ï\u0013A\u0010\u008d¤³\n\u0000Ö\u0098q\u0097L2º\u0095$@\u00068ÒK\u0091<,\u0011§Îéx³BIi\u000e¬øÖ_â©¿Þä\u0090]ÒT¯æ}õ7©¹}ãªà#©Á\u0089=¢vXÿ1/×\n)Rv\u0016\u00100DD»lbQ\u0012©\u00adý¼\u0083l\u008aù\u0018v\u0007C»Fñ°ãÅG\u0087Þ5\u008bz\u0001^ó\u009e£\u0082HÃ\\ .\u0095¯iVsïª¤¢µQóñØÝö³ÐM³5\u0089Qeù\u001a¦õ>ô0";
      int var17 = "\u0097\u0006ò/G\u0097\u0014Ì¡2\u009d\u0017]ëÍªH\u009a¨Iî¡õY\u0010ü\u0003þ±l\u008en\u0094u÷º»Q\u0016¦E\u0018\u00adnõW-\u001ehÇ\u0095®\u009fìU\u00870|4ítPÐb¸P\u0010©}H\u009f\u000fÇY¥]·«÷_ï\u0013A\u0010\u008d¤³\n\u0000Ö\u0098q\u0097L2º\u0095$@\u00068ÒK\u0091<,\u0011§Îéx³BIi\u000e¬øÖ_â©¿Þä\u0090]ÒT¯æ}õ7©¹}ãªà#©Á\u0089=¢vXÿ1/×\n)Rv\u0016\u00100DD»lbQ\u0012©\u00adý¼\u0083l\u008aù\u0018v\u0007C»Fñ°ãÅG\u0087Þ5\u008bz\u0001^ó\u009e£\u0082HÃ\\ .\u0095¯iVsïª¤¢µQóñØÝö³ÐM³5\u0089Qeù\u001a¦õ>ô0".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[11];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "C\u0012_Ýû\u009a\u0085#îy[¬§ú\u0019\u0094ë\u0080ú½1\u007f)¿i\u0081VÓëú¯õÖ`ºÂ÷]nz¬ôn¨qÓÎÐ";
                  int var5 = "C\u0012_Ýû\u009a\u0085#îy[¬§ú\u0019\u0094ë\u0080ú½1\u007f)¿i\u0081VÓëú¯õÖ`ºÂ÷]nz¬ôn¨qÓÎÐ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var35 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var35 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var34[var35] = var42;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[8];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yh.class, true.k<invokedynamic>(18239, 7039974243378631352L ^ var20), true.k<invokedynamic>(22345, 4528969267366298307L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yh.class, true.k<invokedynamic>(16961, 5790094044109215688L ^ var20), true.k<invokedynamic>(14956, 5484413184186445799L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yh.class, true.k<invokedynamic>(565, 1922378453294864304L ^ var20), true.k<invokedynamic>(7731, 6976051403029564341L ^ var20), 0)))};
                              x = var30;
                              b = new yh(var22);
                              y = qi.R((il)b, true.k<invokedynamic>(8463, 6121842158168634509L ^ var20), true, (pj)null, (Function0)null, true.v<invokedynamic>(29561, 481244043274135839L ^ var20), var26, (Object)null);
                              K = qi.g((il)b, true.k<invokedynamic>(5671, 2369477083576157095L ^ var20), 5.0F, RangesKt.rangeTo(0.0F, 6.0F), (pj)null, (Function0)null, true.v<invokedynamic>(19718, 6131850104923461476L ^ var20), var24, (Object)null);
                              L = qi.F((il)b, true.k<invokedynamic>(24247, 5990567948227185460L ^ var20), new Color(true.v<invokedynamic>(28278, 9206344773543179283L ^ var20), true.v<invokedynamic>(24928, 3169550790111443713L ^ var20), true.v<invokedynamic>(25343, 1070359342523725980L ^ var20), true.v<invokedynamic>(14389, 8215033802406814290L ^ var20)), (pj)null, (Function0)null, true.v<invokedynamic>(11678, 4314715682711861242L ^ var20), var28, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u000f M\u0085¢½òc¸*i\u0016\u0080s´\u001d";
                           var5 = "\u000f M\u0085¢½òc¸*i\u0016\u0080s´\u001d".length();
                           var2 = 0;
                        }

                        var35 = var2;
                        var2 += 8;
                        var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var35 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = " \u0004\u0080y\u008aÂ\u0086m\u0098\u008c\u0019\\\u0093:|\u008f\u008aP¿\u008f'ëÃ\u0013\u0010n\u000f²ÂÑjöþü·¤ºf?ë\u0004";
               var17 = " \u0004\u0080y\u008aÂ\u0086m\u0098\u008c\u0019\\\u0093:|\u008f\u008aP¿\u008f'ëÃ\u0013\u0010n\u000f²ÂÑjöþü·¤ºf?ë\u0004".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27973;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yh", var10);
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
      String var7 = a(var4, var5);
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
         throw new RuntimeException("su/catlean/yh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25252;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/yh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
