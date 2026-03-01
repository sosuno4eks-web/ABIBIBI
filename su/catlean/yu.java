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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1794;
import net.minecraft.class_1799;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yu extends k9 {
   @NotNull
   public static final yu s;
   static final KProperty[] x;
   @NotNull
   private static final zr B;
   @NotNull
   private static final z0 O;
   @NotNull
   private static final n R;
   private static final long b = j0.a(-5097163780637326651L, 7035073730781456022L, MethodHandles.lookup().lookupClass()).a(152903151232792L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private yu(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 54356487282671L;
      super(var3, true.v<invokedynamic>(30772, 473178334807797078L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final uw M(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 123536787073275L;
      int var6 = (int)((var4 ^ 123536787073275L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (uw)B.k((short)var6, this, x[0], (short)var7, var8);
   }

   private final void V(long var1, uw var3) {
      var1 ^= b;
      long var10001 = var1 ^ 9357449174034L;
      int var4 = (int)((var1 ^ 9357449174034L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      B.P(this, var4, x[0], (short)var5, var3, (short)var6);
   }

   private final int v(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 51733446248139L;
      int var6 = (int)((var4 ^ 51733446248139L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)O.k((short)var6, this, x[1], (short)var7, var8)).intValue();
   }

   private final void m(long var1, int var3) {
      var1 ^= b;
      long var10001 = var1 ^ 79466590771511L;
      int var4 = (int)((var1 ^ 79466590771511L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      O.P(this, var4, x[1], (short)var5, var3, (short)var6);
   }

   @Flow
   private final void M(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean R(class_1799 var0) {
      long var1 = b ^ 87707094683275L;
      Intrinsics.checkNotNullParameter(var0, true.v<invokedynamic>(21986, 3905947052743330552L ^ var1));
      return var0.method_7909() instanceof class_1794;
   }

   private static final Unit G(class_3965 var0) {
      long var1 = b ^ 50619186666161L;
      long var3 = var1 ^ 17477979518321L;
      long var5 = var1 ^ 107002876057809L;
      s8.r(var3).method_2896(s8.f(var5), class_1268.field_5808, var0);
      s8.f(var5).method_6104(class_1268.field_5808);
      return Unit.INSTANCE;
   }

   private static final Unit W(s1 var0, class_3965 var1) {
      long var2 = b ^ 73219126500607L;
      long var10001 = var2 ^ 260441048793L;
      int var4 = (int)((var2 ^ 260441048793L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      var10001 = var2 ^ 71282730235085L;
      int var7 = (int)((var2 ^ 71282730235085L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      dk.I.X(var0.I(), var7, (byte)var8, var9, s.M((short)var4, var5, (char)var6), yu::G);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 132566505669743L;
      long var22 = var20 ^ 51166290504291L;
      long var24 = var20 ^ 65708844491606L;
      long var10001 = var20 ^ 22588307879265L;
      int var26 = (int)((var20 ^ 22588307879265L) >>> 48);
      int var27 = (int)(var10001 << 16 >>> 32);
      int var28 = (int)(var10001 << 48 >>> 48);
      long var29 = var20 ^ 34230761963772L;
      e = new HashMap(13);
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
      String var15 = "ªrÀ´\u0095\u009eøcëÐÄðxjÙ\u0004y7§a\u0082\u0094âptäsD\u008c\u0087 ü(\u0004\u009d·®þ\u009e\u008f\u0002¼tß³é\u00959Õg³¶.M\u0083äRj\u000fÄC\u0082i\u0095òã?\u000bhìÃ\u000fv0sÜÆS\\>B\b²\u0081à]o^tX_Ø\u0014i\rÿ\u0090¦8ÐÊ\f¦¾\b;\u008bÍ·-å(µû\u0092HÇ\u0091 \u009c\u0082p\u0010!\u008aZÇÌHnb~)\u0012¶c:&z {¥\u0085S ¼F\u0015j\tyTiËw\u0017í®L\\¼\u0013\u0093\u0006´ôrâWÅÙx\u0010R\u00adè\u000efBT\r\b¼°æÎíÝ%\u0018×\u0010)ZHÀ\u008dw\nÁ\fæ\u0013Ó\n}fÒ5Ü\u0084Ù\u0019ª 4ßZÖ§\u0098«ç\u00ad^]ñ!\u0089ê\u0082*)¥\u0084\u0082?\u0091OKJ:&\u0006þ\u001a\n\u0010\u000b¸:\u001d\u0017\u009a-\u0007ç\u007fÊ\u009785á\u007f";
      int var17 = "ªrÀ´\u0095\u009eøcëÐÄðxjÙ\u0004y7§a\u0082\u0094âptäsD\u008c\u0087 ü(\u0004\u009d·®þ\u009e\u008f\u0002¼tß³é\u00959Õg³¶.M\u0083äRj\u000fÄC\u0082i\u0095òã?\u000bhìÃ\u000fv0sÜÆS\\>B\b²\u0081à]o^tX_Ø\u0014i\rÿ\u0090¦8ÐÊ\f¦¾\b;\u008bÍ·-å(µû\u0092HÇ\u0091 \u009c\u0082p\u0010!\u008aZÇÌHnb~)\u0012¶c:&z {¥\u0085S ¼F\u0015j\tyTiËw\u0017í®L\\¼\u0013\u0093\u0006´ôrâWÅÙx\u0010R\u00adè\u000efBT\r\b¼°æÎíÝ%\u0018×\u0010)ZHÀ\u008dw\nÁ\fæ\u0013Ó\n}fÒ5Ü\u0084Ù\u0019ª 4ßZÖ§\u0098«ç\u00ad^]ñ!\u0089ê\u0082*)¥\u0084\u0082?\u0091OKJ:&\u0006þ\u001a\n\u0010\u000b¸:\u001d\u0017\u009a-\u0007ç\u007fÊ\u009785á\u007f".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var34 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var34) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[11];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "¬\u0096ð3£Áà÷ª\u001b´\u0097\rP\u0012D";
                  int var5 = "¬\u0096ð3£Áà÷ª\u001b´\u0097\rP\u0012D".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var38 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                     long[] var35 = var6;
                     var38 = var3++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var35[var38] = var44;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[4];
                              KProperty[] var31 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yu.class, true.v<invokedynamic>(11407, 7509416428375193973L ^ var20), true.v<invokedynamic>(19537, 8052125864908413358L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yu.class, true.v<invokedynamic>(20558, 7967638955590534587L ^ var20), true.v<invokedynamic>(26702, 1798446558469225909L ^ var20), 0)))};
                              x = var31;
                              s = new yu(var29);
                              B = qi.M((il)s, true.v<invokedynamic>(23984, 8803996221882189896L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.v<invokedynamic>(22858, 1596297121852887019L ^ var20), (Object)null, var24);
                              O = qi.o((il)s, true.v<invokedynamic>(5769, 1687765631508284286L ^ var20), 0, new IntRange(0, true.v<invokedynamic>(31042, 7895340665908015074L ^ var20)), var22, (pj)null, (Function0)null, true.v<invokedynamic>(8125, 6899349195493984542L ^ var20), (Object)null);
                              R = new n((char)var26, var27, (char)var28);
                              return;
                           }
                           break;
                        default:
                           var35[var38] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "w\u0087O\u0001×ûKßeN>\u0096\u0083/Ù*";
                           var5 = "w\u0087O\u0001×ûKßeN>\u0096\u0083/Ù*".length();
                           var2 = 0;
                        }

                        var38 = var2;
                        var2 += 8;
                        var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        var35 = var6;
                        var38 = var3++;
                        var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var39;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "ÆÐÖ@#\u0081\u0082\u0084þËkÍ!\u008bPýÉ\u0014õ[\u008fv}\u0018\u0010<èwþ$\u001dùJÒ\u0016¼\u0006hc\u0005Æ";
               var17 = "ÆÐÖ@#\u0081\u0082\u0084þËkÍ!\u008bPýÉ\u0014õ[\u008fv}\u0018\u0010<èwþ$\u001dùJÒ\u0016¼\u0006hc\u0005Æ".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var34 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20984;
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
            throw new RuntimeException("su/catlean/yu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/yu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4774;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/yu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
