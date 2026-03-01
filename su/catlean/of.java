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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class of extends k9 {
   @NotNull
   public static final of v;
   static final KProperty[] g;
   @NotNull
   private static final zr K;
   @NotNull
   private static final zc s;
   @NotNull
   private static final zc k;
   @NotNull
   private static final zo I;
   @Nullable
   private static class_243 i;
   private static final long b = j0.a(-8897977156870696248L, 6377028123929172172L, MethodHandles.lookup().lookupClass()).a(221595138415729L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] l;
   private static final Map m;

   private of(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 89183055273443L;
      super(var3, true.k<invokedynamic>(23042, 4833837835859751011L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final gu L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 108307073518805L;
      int var3 = (int)((var1 ^ 108307073518805L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (gu)K.k((short)var3, this, g[0], (short)var4, var5);
   }

   private final float T(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 38379931844675L;
      int var3 = (int)((var1 ^ 38379931844675L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)s.k((short)var3, this, g[1], (short)var4, var5)).floatValue();
   }

   private final float K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 98353687478711L;
      int var3 = (int)((var1 ^ 98353687478711L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)k.k((short)var3, this, g[2], (short)var4, var5)).floatValue();
   }

   private final boolean U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 138716920667160L;
      int var3 = (int)((var1 ^ 138716920667160L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)I.k((short)var3, this, g[3], (short)var4, var5);
   }

   @Flow
   private final void G(PreSyncEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void v(@NotNull PlayerUpdateEvent event) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void l(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void u(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void Q(@NotNull MoveEvent event) {
      long var2 = b ^ 127092606517483L;
      long var4 = var2 ^ 111043268687215L;
      long var6 = var2 ^ 39471088697059L;
      long var8 = var2 ^ 139587814115523L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(23178, 3440733878472147229L ^ var2));
      if (this.L(var6) == gu.GRIM_GLIDE) {
         double[] var10 = i4.H(i4.v, 0.3F, false, 1.0F, 0.0F, 0.0F, true.i<invokedynamic>(21480, 4079215727560133631L ^ var2), var8, (Object)null);
         var1.cancel();
         var1.setY(-0.03D);
         var1.setX(var10[0]);
         var1.setZ(var10[1]);
         s8.f(var4).method_18800(var1.getX(), -0.03D, var1.getZ());
      }

   }

   public void a(long var1) {
      long var3 = var1 ^ 16426737678522L;
      4323043295207168965L.A<invokedynamic>(4323043295207168965L, var1);
      s8.f(var3).method_31549().field_7479 = false;

      try {
         s8.f(var3).method_31549().method_7248(0.05F);
         if (4280538564550737421L.A<invokedynamic>(4280538564550737421L, var1) == null) {
            (new int[5]).A<invokedynamic>(new int[5], 4306527005685495145L, var1);
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 4315657688644916359L, var1);
      }
   }

   private static final boolean I() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 75445380247488L;
      long var22 = var20 ^ 105544690925341L;
      long var24 = var20 ^ 63561647817977L;
      long var26 = var20 ^ 74074685286751L;
      long var28 = var20 ^ 120726971005166L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "ØK\u0085:xtP\u0016e\u000eEPÒ\u009føî\u0018ý\u008eôêÉ×\u0088\b®Þg\u0094mJ\u000büêKdÞ¨õkÊ\u00105Óª¡\u0097\u0090\bû\u0092¾u¨Àc'Ü0Ík\u001dñÅÂÙ¶Ã\u008eH\u00971£¨??×\u0003ï\u0094iÆÛZh=/{\u0012\u008b9\u009a1\u008b\u0000\u009eIi\u001d\u0092\u008dÊ/`\u0091Õû\u0010N\u001dë\t\u0095I¦¨EkÉÖÎ×X\u009a\u0010\u008e\u0093\u007fn@\u009cì\n\\\u0097\t| C\u0084\u0000\u0010UV/QjÁ\u001d6Ýê\u001f\u000eÒ.|\u0091\u0018\u00156\u001eà3?;Zbë\u0093XÕ%áp¿§üFÀdÃÉ\u0010\u0090èâÝ\u000f\u0000¹{4A6w\u0081\rþ0 ú\u0090\u0085óÀ\u0006QO/\u000e[Û\u0011~\\\u0085\u0085\u007fó\u009d*B\u000eða¿\u0089è4\u008fïd\u0010S\u0096\f8ê;nqu*\u0093\u0086\u0093fz½ è%gId\u00128\rBé 5Û?8FÉ%Z\u007f÷\u00105IÊr2nG$e½\u0018\"\u0007$öiôÜwûo\u0003\u0093e¿ëX\u009eß¾\bå4 ¦";
      int var17 = "ØK\u0085:xtP\u0016e\u000eEPÒ\u009føî\u0018ý\u008eôêÉ×\u0088\b®Þg\u0094mJ\u000büêKdÞ¨õkÊ\u00105Óª¡\u0097\u0090\bû\u0092¾u¨Àc'Ü0Ík\u001dñÅÂÙ¶Ã\u008eH\u00971£¨??×\u0003ï\u0094iÆÛZh=/{\u0012\u008b9\u009a1\u008b\u0000\u009eIi\u001d\u0092\u008dÊ/`\u0091Õû\u0010N\u001dë\t\u0095I¦¨EkÉÖÎ×X\u009a\u0010\u008e\u0093\u007fn@\u009cì\n\\\u0097\t| C\u0084\u0000\u0010UV/QjÁ\u001d6Ýê\u001f\u000eÒ.|\u0091\u0018\u00156\u001eà3?;Zbë\u0093XÕ%áp¿§üFÀdÃÉ\u0010\u0090èâÝ\u000f\u0000¹{4A6w\u0081\rþ0 ú\u0090\u0085óÀ\u0006QO/\u000e[Û\u0011~\\\u0085\u0085\u007fó\u009d*B\u000eða¿\u0089è4\u008fïd\u0010S\u0096\f8ê;nqu*\u0093\u0086\u0093fz½ è%gId\u00128\rBé 5Û?8FÉ%Z\u007f÷\u00105IÊr2nG$e½\u0018\"\u0007$öiôÜwûo\u0003\u0093e¿ëX\u009eß¾\bå4 ¦".length();
      char var14 = 16;
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
                  c = var18;
                  d = new String[15];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "ãhÿ\u0082¼\u008f\u0086:ßçB!ý¦Ø\u0012\u000f\u009d\rßÂÕ\u001b 6Øöè\u00ad°U\u0017Ü\u0012Ï\t¹ð3\u0010";
                  int var5 = "ãhÿ\u0082¼\u008f\u0086:ßçB!ý¦Ø\u0012\u000f\u009d\rßÂÕ\u001b 6Øöè\u00ad°U\u0017Ü\u0012Ï\t¹ð3\u0010".length();
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
                              f = var6;
                              l = new Integer[7];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(of.class, true.k<invokedynamic>(1320, 3843053964573274526L ^ var20), true.k<invokedynamic>(121, 2060526513950487756L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(of.class, true.k<invokedynamic>(10589, 1142236216111128047L ^ var20), true.k<invokedynamic>(19220, 6886881884349448111L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(of.class, true.k<invokedynamic>(3012, 2406799561119858551L ^ var20), true.k<invokedynamic>(8774, 137219020886234871L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(of.class, true.k<invokedynamic>(15450, 5747137379345877229L ^ var20), true.k<invokedynamic>(22985, 4831223782312553843L ^ var20), 0)))};
                              g = var30;
                              v = new of(var26);
                              K = qi.M((il)v, true.k<invokedynamic>(21533, 1203527355959517347L ^ var20), (Enum)gu.Vanilla, (pj)null, (Function0)null, true.i<invokedynamic>(15115, 6175529604923640884L ^ var20), (Object)null, var22);
                              s = qi.g((il)v, true.k<invokedynamic>(21867, 212609120995287508L ^ var20), 1.0F, RangesKt.rangeTo(0.0F, 10.0F), (pj)null, (Function0)null, true.i<invokedynamic>(640, 8136460082216170938L ^ var20), var24, (Object)null);
                              k = qi.g((il)v, true.k<invokedynamic>(11652, 6097962822325623097L ^ var20), 0.78F, RangesKt.rangeTo(0.0F, 5.0F), (pj)null, (Function0)null, true.i<invokedynamic>(12862, 6684781437866689795L ^ var20), var24, (Object)null);
                              I = qi.R((il)v, true.k<invokedynamic>(5482, 250368646487466450L ^ var20), false, (pj)null, of::I, 4, var28, (Object)null);
                              i = class_243.field_1353;
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001f^4\u0018Y\u0005Ô\u0088z\u001fWÜ¯\u009e/8";
                           var5 = "\u001f^4\u0018Y\u0005Ô\u0088z\u001fWÜ¯\u009e/8".length();
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

               var15 = "5R²®Zz\u0099².±Ù\u0085v\u008f¨\u00825\u0000ñ#ÉÚ±\u0011r\u0006\u0095 ²¦\u0007M\u0018DJ\u0018\u0098\u0001-ÀÒ\u001aI9Ì;ð?\u009d]\n\u0094ïÄ0n\u009d";
               var17 = "5R²®Zz\u0099².±Ù\u0085v\u008f¨\u00825\u0000ñ#ÉÚ±\u0011r\u0006\u0095 ²¦\u0007M\u0018DJ\u0018\u0098\u0001-ÀÒ\u001aI9Ì;ð?\u009d]\n\u0094ïÄ0n\u009d".length();
               var14 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27896;
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
            throw new RuntimeException("su/catlean/of", var10);
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
         throw new RuntimeException("su/catlean/of" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28530;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/of", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/of" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
