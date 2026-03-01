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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

public final class xl {
   private static String[] E;
   private static final long a = j0.a(4155965028989601490L, 8378174187029469774L, MethodHandles.lookup().lookupClass()).a(226342945739969L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   @NotNull
   public static final List w(long a, @NotNull class_746 $this$armorItems) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.f<invokedynamic>(28585, 7490117951476032790L ^ var0));
      class_1799[] var4 = new class_1799[4];
      7213339562950518505L.A<invokedynamic>(7213339562950518505L, var0);
      class_1799 var10003 = var2.method_31548().method_5438(true.w<invokedynamic>(32010, 2642514151722067329L ^ var0));
      Intrinsics.checkNotNullExpressionValue(var10003, true.f<invokedynamic>(16317, 9189557520230561025L ^ var0));
      var4[0] = var10003;

      try {
         class_1799 var10002 = var2.method_31548().method_5438(true.w<invokedynamic>(20334, 4592713530355750882L ^ var0));
         Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(16317, 9189557520230561025L ^ var0));
         var4[1] = var10002;
         var10002 = var2.method_31548().method_5438(true.w<invokedynamic>(27322, 1523109723755000370L ^ var0));
         Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(16317, 9189557520230561025L ^ var0));
         var4[2] = var10002;
         var10002 = var2.method_31548().method_5438(true.w<invokedynamic>(6317, 6497132157376479264L ^ var0));
         Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(16317, 9189557520230561025L ^ var0));
         var4[3] = var10002;
         List var10000 = CollectionsKt.listOf(var4);
         if (7293194699715338332L.A<invokedynamic>(7293194699715338332L, var0) == null) {
            (new String[2]).A<invokedynamic>(new String[2], 7347338521273468591L, var0);
         }

         return var10000;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 7336782376468775740L, var0);
      }
   }

   @NotNull
   public static final List V(@NotNull class_1657 $this$armorItems, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.f<invokedynamic>(498, 7463306704120864099L ^ var1));
      class_1799[] var4 = new class_1799[4];
      class_1799 var10002 = var0.method_31548().method_5438(true.w<invokedynamic>(651, 4550833434045844522L ^ var1));
      Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(11027, 4876487990817585025L ^ var1));
      var4[0] = var10002;
      var10002 = var0.method_31548().method_5438(true.w<invokedynamic>(25572, 94738059758660932L ^ var1));
      Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(16317, 9189579380980376366L ^ var1));
      var4[1] = var10002;
      String[] var10000 = 3618011452291788998L.A<invokedynamic>(3618011452291788998L, var1);
      class_1799 var10003 = var0.method_31548().method_5438(true.w<invokedynamic>(3016, 3754385859321038190L ^ var1));
      Intrinsics.checkNotNullExpressionValue(var10003, true.f<invokedynamic>(16317, 9189579380980376366L ^ var1));
      var4[2] = var10003;
      var10003 = var0.method_31548().method_5438(true.w<invokedynamic>(9589, 7178020971025083344L ^ var1));
      Intrinsics.checkNotNullExpressionValue(var10003, true.f<invokedynamic>(16317, 9189579380980376366L ^ var1));
      var4[3] = var10003;
      String[] var3 = var10000;

      try {
         List var6 = CollectionsKt.mutableListOf(var4);
         if (var3 == null) {
            (new int[1]).A<invokedynamic>(new int[1], 3738830661739737177L, var1);
         }

         return var6;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 3746520525683217683L, var1);
      }
   }

   @NotNull
   public static final List p(@NotNull class_1309 $this$armorItems, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.f<invokedynamic>(28585, 7490160573011781043L ^ var1));
      class_1799[] var3 = new class_1799[4];
      class_1799 var10002 = class_1802.field_8162.method_7854();
      Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(4196, 1490353607890934392L ^ var1));
      var3[0] = var10002;
      var10002 = class_1802.field_8162.method_7854();
      Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(31325, 685246185572069440L ^ var1));
      var3[1] = var10002;
      var10002 = class_1802.field_8162.method_7854();
      Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(31325, 685246185572069440L ^ var1));
      var3[2] = var10002;
      var10002 = class_1802.field_8162.method_7854();
      Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(31325, 685246185572069440L ^ var1));
      var3[3] = var10002;
      return CollectionsKt.mutableListOf(var3);
   }

   public static void k(String[] var0) {
      E = var0;
   }

   public static String[] H() {
      return E;
   }

   static {
      long var20 = a ^ 72198414769982L;
      String[] var10000 = new String[5];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -7916039121740009091L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[6];
      int var16 = 0;
      String var15 = "\u0001 \u0098øÁÕ](\u001a\\þ\u0018Î\u009f/»K\n'Æø;gv ¸Nß«ç\u0017|zóc\u0085\u009f\u0014ÏOZ\u0094ê\u0093ß``\u0015ï\u001dÃ\u0081Þ\u008aÕh\u001e\u0010~¡lÖ\u0093F%\"Ã«\u0013±Lh\"`\u0010$Üû\u0088¬p\u0000¿´\u000e½\u008f«=\u0095v";
      int var17 = "\u0001 \u0098øÁÕ](\u001a\\þ\u0018Î\u009f/»K\n'Æø;gv ¸Nß«ç\u0017|zóc\u0085\u009f\u0014ÏOZ\u0094ê\u0093ß``\u0015ï\u001dÃ\u0081Þ\u008aÕh\u001e\u0010~¡lÖ\u0093F%\"Ã«\u0013±Lh\"`\u0010$Üû\u0088¬p\u0000¿´\u000e½\u008f«=\u0095v".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[6];
                  g = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "\f\u0088ºY£\u0013V\u001e\u00885\u0016Å7®d¯ËÜ\u0004àËs'÷(\u0002r$É\u009ffÙ¬ÌFß\u0093\u001e\u000eoIºL¡ó\u0006fæ";
                  int var5 = "\f\u0088ºY£\u0013V\u001e\u00885\u0016Å7®d¯ËÜ\u0004àËs'÷(\u0002r$É\u009ffÙ¬ÌFß\u0093\u001e\u000eoIºL¡ó\u0006fæ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "îï¡\"9-\t«§Ä\u0081Iz\u009b¼\u009e";
                           var5 = "îï¡\"9-\t«§Ä\u0081Iz\u009b¼\u009e".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "rÅ¨½Î2Î\u0083ç 5#êB¨Sì\na\u007fyCÓu\u0085ª\u001b\u0099ÙèóâV\u0088'é\u0004XÝù(¸¥Ï;\u001e\n\u0005\u008cÊ\\IÀ{µu!955bë>w@n¬Û\u0089#8E¤\tV:@s\u009d*`";
               var17 = "rÅ¨½Î2Î\u0083ç 5#êB¨Sì\na\u007fyCÓu\u0085ª\u001b\u0099ÙèóâV\u0088'é\u0004XÝù(¸¥Ï;\u001e\n\u0005\u008cÊ\\IÀ{µu!955bë>w@n¬Û\u0089#8E¤\tV:@s\u009d*`".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28253;
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
            throw new RuntimeException("su/catlean/xl", var10);
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
         throw new RuntimeException("su/catlean/xl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15471;
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
            throw new RuntimeException("su/catlean/xl", var14);
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
         throw new RuntimeException("su/catlean/xl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
