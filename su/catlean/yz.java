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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1820;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yz extends k9 {
   @NotNull
   public static final yz s;
   static final KProperty[] v;
   @NotNull
   private static final zr I;
   @NotNull
   private static final z0 X;
   @NotNull
   private static final n w;
   private static final long b = j0.a(692240143983412113L, 8519202548738344432L, MethodHandles.lookup().lookupClass()).a(181890461613163L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private yz(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ b;
      long var6 = var4 ^ 18648044193751L;
      super(var6, true.w<invokedynamic>(9077, 7473400967819683146L ^ var4), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final uw M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 9862664735201L;
      int var3 = (int)((var1 ^ 9862664735201L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (uw)I.k((short)var3, this, v[0], (short)var4, var5);
   }

   private final void m(uw var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 66519193761725L;
      int var4 = (int)((var2 ^ 66519193761725L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      I.P(this, var4, v[0], (short)var5, var1, (short)var6);
   }

   private final int G(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 114622376958008L;
      int var3 = (int)((var1 ^ 114622376958008L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)X.k((short)var3, this, v[1], (short)var4, var5)).intValue();
   }

   private final void h(int var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 86659310671754L;
      int var4 = (int)((var2 ^ 86659310671754L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      X.P(this, var4, v[1], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void S(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean f(class_1799 var0) {
      long var1 = b ^ 25469288496228L;
      Intrinsics.checkNotNullParameter(var0, true.w<invokedynamic>(17960, 6485427180411729194L ^ var1));
      return var0.method_7909() instanceof class_1820;
   }

   private static final Unit S(class_1297 var0) {
      long var1 = b ^ 2438956829730L;
      long var3 = var1 ^ 61496378095223L;
      long var5 = var1 ^ 98246729735127L;
      s8.r(var3).method_2905((class_1657)s8.f(var5), var0, class_1268.field_5808);
      s8.f(var5).method_6104(class_1268.field_5808);
      return Unit.INSTANCE;
   }

   private static final Unit v(s1 var0, class_1297 var1) {
      long var2 = b ^ 56766256604718L;
      long var4 = var2 ^ 10619660623122L;
      long var10001 = var2 ^ 41604070661001L;
      int var6 = (int)((var2 ^ 41604070661001L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      dk.I.X(var0.I(), var6, (byte)var7, var8, s.M(var4), yz::S);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 2056407395457L;
      long var22 = var20 ^ 74712802023192L;
      long var10001 = var20 ^ 79116341440554L;
      int var24 = (int)((var20 ^ 79116341440554L) >>> 32);
      int var25 = (int)(var10001 << 32 >>> 40);
      int var26 = (int)(var10001 << 56 >>> 56);
      long var27 = var20 ^ 95354494262829L;
      var10001 = var20 ^ 134076975974426L;
      int var29 = (int)((var20 ^ 134076975974426L) >>> 48);
      int var30 = (int)(var10001 << 16 >>> 32);
      int var31 = (int)(var10001 << 48 >>> 48);
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
      String var15 = "ìW\rð°\u001b&7¡û\u0093ùMÁ¼\"æ*ËQBÃà´É~v\u0080]ü{ë\u000eô\\\u0084y\u001bBÆ?#\u0086ì&¬Ýï\u00911\u0006È7:Rö8þ¨Ê\u0098¥°XùàÇµ\u0090ÏL8\\å\u0088'¹TË\u000eG°Êð\u001f\u0001\u000eT\u000e\tÈÝÁ/tkåÍ=a³ÔÍUÌ\u0096<Þ\u0087\u0081<\u0012m\u0018y4µt>p\u00adALÿ\u0006@¼\u001cE+rÏ×\fH.Ä\u0084\u00108,i\t\"Ðú>\u0005ã]\u008d~\u0092Øª jþC\u0094\u009aZ&Üy\u0088\u008e¯¤ëd\u009d¸\u00075¯¤Î5¸-2¢Ò\u0016\u0090ýê(\u0000\f kXµ¶Ø-túôÖ\u0080\nn¯.\u008fÜÌ\u0015\u0013\"®Ü\u0097yñl©Óxý¤¿\u0087JÕ> `>gý\f\u0094¿RÒ«\u0015\u0018ª²K\u0003ÆdI:è©<p|e×\u0014\u008b73.\u0018B\u000f²/ÀÑÝ\u0017?\u009bmÙÙÚ\u0000\u0085Dâ\u009bç¢ñ\t¼\u0010u\f\u0002F\u000e³\u0019\u000e\u0094\u008f~÷É\u001d,\u0092";
      int var17 = "ìW\rð°\u001b&7¡û\u0093ùMÁ¼\"æ*ËQBÃà´É~v\u0080]ü{ë\u000eô\\\u0084y\u001bBÆ?#\u0086ì&¬Ýï\u00911\u0006È7:Rö8þ¨Ê\u0098¥°XùàÇµ\u0090ÏL8\\å\u0088'¹TË\u000eG°Êð\u001f\u0001\u000eT\u000e\tÈÝÁ/tkåÍ=a³ÔÍUÌ\u0096<Þ\u0087\u0081<\u0012m\u0018y4µt>p\u00adALÿ\u0006@¼\u001cE+rÏ×\fH.Ä\u0084\u00108,i\t\"Ðú>\u0005ã]\u008d~\u0092Øª jþC\u0094\u009aZ&Üy\u0088\u008e¯¤ëd\u009d¸\u00075¯¤Î5¸-2¢Ò\u0016\u0090ýê(\u0000\f kXµ¶Ø-túôÖ\u0080\nn¯.\u008fÜÌ\u0015\u0013\"®Ü\u0097yñl©Óxý¤¿\u0087JÕ> `>gý\f\u0094¿RÒ«\u0015\u0018ª²K\u0003ÆdI:è©<p|e×\u0014\u008b73.\u0018B\u000f²/ÀÑÝ\u0017?\u009bmÙÙÚ\u0000\u0085Dâ\u009bç¢ñ\t¼\u0010u\f\u0002F\u000e³\u0019\u000e\u0094\u008f~÷É\u001d,\u0092".length();
      char var14 = '8';
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var33 = var15.substring(var13, var13 + var14);
         byte var35 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch(var35) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[11];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[3];
                  int var4 = 0;
                  String var5 = "È¡>\u00adhYãzîö\"aÇ³~AA\"Ô\u0013×7\u0093Æ";
                  int var6 = "È¡>\u00adhYãzîö\"aÇ³~AA\"Ô\u0013×7\u0093Æ".length();
                  int var3 = 0;

                  do {
                     int var39 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var39, var3).getBytes("ISO-8859-1");
                     var39 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var41 = true;
                     var0[var39] = var10004;
                  } while(var3 < var6);

                  KProperty[] var32 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yz.class, true.w<invokedynamic>(4758, 6909741920826290558L ^ var20), true.w<invokedynamic>(18746, 1665747132287920852L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yz.class, true.w<invokedynamic>(29722, 8771147559774590967L ^ var20), true.w<invokedynamic>(21605, 1122218630881032076L ^ var20), 0)))};
                  v = var32;
                  s = new yz(var24, var25, (byte)var26);
                  I = qi.M((il)s, true.w<invokedynamic>(20861, 5207064234380210843L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, (int)var0[0], (Object)null, var27);
                  X = qi.o((il)s, true.w<invokedynamic>(9795, 1530844349831136679L ^ var20), 0, new IntRange(0, (int)var0[2]), var22, (pj)null, (Function0)null, (int)var0[1], (Object)null);
                  w = new n((char)var29, var30, (char)var31);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "ð\u0083Q\tì)\u0095\u0098n¹Â\u0010¨\u0081'\b\u0010G±®³\u0083\u001dµPwÝ\u0013\nbD¼o";
               var17 = "ð\u0083Q\tì)\u0095\u0098n¹Â\u0010¨\u0081'\b\u0010G±®³\u0083\u001dµPwÝ\u0013\nbD¼o".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var33 = var15.substring(var13, var13 + var14);
            var35 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6800;
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
            throw new RuntimeException("su/catlean/yz", var10);
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
         throw new RuntimeException("su/catlean/yz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
