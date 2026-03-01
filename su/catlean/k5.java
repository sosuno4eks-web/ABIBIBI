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
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class k5 extends k9 {
   @NotNull
   public static final k5 N;
   static final KProperty[] t;
   @NotNull
   private static final zr Q;
   private static final long b = j0.a(-4036970355149271538L, 7195675000949351925L, MethodHandles.lookup().lookupClass()).a(40570037733364L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private k5(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 87586608273603L;
      super(var6, true.q<invokedynamic>(8600, 1241009366853939715L ^ var4), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final uw J(long var1, short var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 27555491640062L;
      int var6 = (int)((var4 ^ 27555491640062L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (uw)Q.k((short)var6, this, t[0], (short)var7, var8);
   }

   private final void t(long var1, uw var3) {
      var1 ^= b;
      long var10001 = var1 ^ 71185401783846L;
      int var4 = (int)((var1 ^ 71185401783846L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Q.P(this, var4, t[0], (short)var5, var3, (short)var6);
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -10
   )
   private final void I(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void s(long var1, qq var3) {
      var1 ^= b;
      long var4 = var1 ^ 1129234213111L;
      long var6 = var1 ^ 22674882272851L;
      long var8 = var1 ^ 34032230412287L;
      long var10001 = var1 ^ 7583544450348L;
      long var10 = (var1 ^ 7583544450348L) >>> 16;
      int var12 = (int)(var10001 << 48 >>> 48);
      s1 var13 = dk.I.M(k5::k, var4, this.J(var10, (short)var12));

      try {
         if (var13.y()) {
            x7.Z.l(var6, new rx(var8, var3, true.w<invokedynamic>(14912, 8816109035696762052L ^ var1), k5::B));
         }

      } catch (NumberFormatException var14) {
         throw var14.A<invokedynamic>(var14, 1817355039993215626L, var1);
      }
   }

   private static final boolean k(class_1799 var0) {
      long var1 = b ^ 135446932663655L;
      Intrinsics.checkNotNullParameter(var0, true.q<invokedynamic>(19727, 2740940991843366391L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_49098);
   }

   private static final Unit V() {
      long var0 = b ^ 82872893528834L;
      long var2 = var0 ^ 94933299166500L;
      long var10001 = var0 ^ 46157196591124L;
      int var4 = (int)((var0 ^ 46157196591124L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      ff.f(class_1268.field_5808, 0.0F, 0.0F, (char)var4, true.w<invokedynamic>(15237, 9027353227330317071L ^ var0), var5, (Object)null);
      h4.G((class_2596)(new class_2879(class_1268.field_5808)), var2);
      return Unit.INSTANCE;
   }

   private static final Unit B(s1 var0) {
      long var1 = b ^ 100526384331274L;
      long var10001 = var1 ^ 123774264490537L;
      long var3 = (var1 ^ 123774264490537L) >>> 16;
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 4074975582176L;
      int var6 = (int)((var1 ^ 4074975582176L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      dk.I.X(var0.I(), var6, (byte)var7, var8, N.J(var3, (short)var5), k5::V);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 117896930015913L;
      long var22 = var20 ^ 126386833381448L;
      long var10001 = var20 ^ 125676984301846L;
      int var24 = (int)((var20 ^ 125676984301846L) >>> 32);
      int var25 = (int)(var10001 << 32 >>> 48);
      int var26 = (int)(var10001 << 48 >>> 48);
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "ÞyÑÃåÏ4%zý\u008e\b\\Ø¿\u001b\u0081LÏ\u008fÝ>\u0087E\tÙ¹]¦Þ#½ \u0019¦lþ@\u0017\t\u008e\u0087ôþÃõb+]_^\u0087\u0019\u0096ÚlÓ|!¬ö\u008d¤n¯ äê}zrHY\u007fùq£\u0097S®j7gÍÖ£\u007fxW\u009cÔ×tÿµ%\u001aþ8\u0081\u0098^\u009f,\u0007å\u009euw¾ù\u0010ò·c¥E®2²Ô\u0015¤c[ìäpãcN/\u0012ß0¦¸^g\u0086e\u0099Ü3q\u0095Ï-ª\u000e\u009cÐ/ç[ \u0001ûpðÄ\u001e²J\u0092\u0018J\u0088Ã Ì¢\u0017å9·é)7ºÏ\u009e\b@\u0013\u0019ÔM\u0088Õ\u00adz*@Ü\u0085y×\u0002ù@!\u0081\u0080\u0096A\u008cuï¡\u009e'eÿy*Qè-ÄB5\u0005Ô\u0089Z H\u000fpý\u0015No¿'\u000bÓ´tt\u0085¿j\r\u00909î\u0091/ïºbOÖÚqm¹ \u0085\u0006QqØI^ ÚËJ\u009b£\u001ff^\u0087\u001ed#h\u0003oÏ;\u0085\u000fÁÍóKÍ\u008cg·\u009bì\f\u009cúÙB=z\u001e)×Ñ¤³Ñ\u0001Îqå\u0002¢ÄZ¦BøîH\u001c FÐ\u0097\u0015\u0016ß$\bÉ\u0015§©Ì\u0093Õä¾?ã\u009fú'Üù 3\u0093\u0019\u0004t\u000b´";
      int var17 = "ÞyÑÃåÏ4%zý\u008e\b\\Ø¿\u001b\u0081LÏ\u008fÝ>\u0087E\tÙ¹]¦Þ#½ \u0019¦lþ@\u0017\t\u008e\u0087ôþÃõb+]_^\u0087\u0019\u0096ÚlÓ|!¬ö\u008d¤n¯ äê}zrHY\u007fùq£\u0097S®j7gÍÖ£\u007fxW\u009cÔ×tÿµ%\u001aþ8\u0081\u0098^\u009f,\u0007å\u009euw¾ù\u0010ò·c¥E®2²Ô\u0015¤c[ìäpãcN/\u0012ß0¦¸^g\u0086e\u0099Ü3q\u0095Ï-ª\u000e\u009cÐ/ç[ \u0001ûpðÄ\u001e²J\u0092\u0018J\u0088Ã Ì¢\u0017å9·é)7ºÏ\u009e\b@\u0013\u0019ÔM\u0088Õ\u00adz*@Ü\u0085y×\u0002ù@!\u0081\u0080\u0096A\u008cuï¡\u009e'eÿy*Qè-ÄB5\u0005Ô\u0089Z H\u000fpý\u0015No¿'\u000bÓ´tt\u0085¿j\r\u00909î\u0091/ïºbOÖÚqm¹ \u0085\u0006QqØI^ ÚËJ\u009b£\u001ff^\u0087\u001ed#h\u0003oÏ;\u0085\u000fÁÍóKÍ\u008cg·\u009bì\f\u009cúÙB=z\u001e)×Ñ¤³Ñ\u0001Îqå\u0002¢ÄZ¦BøîH\u001c FÐ\u0097\u0015\u0016ß$\bÉ\u0015§©Ì\u0093Õä¾?ã\u009fú'Üù 3\u0093\u0019\u0004t\u000b´".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var28 = var15.substring(var13, var13 + var14);
         byte var30 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var30) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[9];
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
                  String var4 = "y!Æ\u0091@ô\u001a}\u009d;\u008e/u\u0088\tÞ";
                  int var5 = "y!Æ\u0091@ô\u001a}\u009d;\u008e/u\u0088\tÞ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var34 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                     long[] var31 = var6;
                     var34 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var31[var34] = var40;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[4];
                              KProperty[] var27 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(k5.class, true.q<invokedynamic>(32013, 5260682713696916023L ^ var20), true.q<invokedynamic>(32399, 281074022945345970L ^ var20), 0)))};
                              t = var27;
                              N = new k5(var24, (short)var25, (short)var26);
                              Q = qi.M((il)N, true.q<invokedynamic>(9233, 8534415232375589672L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.w<invokedynamic>(17689, 5984484742699152442L ^ var20), (Object)null, var22);
                              return;
                           }
                           break;
                        default:
                           var31[var34] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\fd<;íQ¸\u0084\u009cJ\r\u000eÆ\u001dE×";
                           var5 = "\fd<;íQ¸\u0084\u009cJ\r\u000eÆ\u001dE×".length();
                           var2 = 0;
                        }

                        var34 = var2;
                        var2 += 8;
                        var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                        var31 = var6;
                        var34 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "x\u001d\u000e\u008fá!`\f\u001bæ{*eçÆû\u0010ü¨wÝl\u0010üvpä\u0092×\u008aýU\u0004";
               var17 = "x\u001d\u000e\u008fá!`\f\u001bæ{*eçÆû\u0010ü¨wÝl\u0010üvpä\u0092×\u008aýU\u0004".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var28 = var15.substring(var13, var13 + var14);
            var30 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4133;
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
            throw new RuntimeException("su/catlean/k5", var10);
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
         throw new RuntimeException("su/catlean/k5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3640;
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
            throw new RuntimeException("su/catlean/k5", var14);
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
         throw new RuntimeException("su/catlean/k5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
