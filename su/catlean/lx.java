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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_4597;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.ItemCommandEvent;
import su.catlean.api.event.events.render.RenderFloatingItemEvent;
import su.catlean.api.event.events.render.ShowFloatingItemEvent;
import su.catlean.gofra.Flow;

public final class lx extends k9 {
   @NotNull
   public static final lx y;
   static final KProperty[] Q;
   @NotNull
   private static final zr n;
   @NotNull
   private static final z0 c;
   @Nullable
   private static class_1799 T;
   private static int x;
   @Nullable
   private static class_4597 P;
   private static final long b = j0.a(-6691863681441462513L, 5361332397931989174L, MethodHandles.lookup().lookupClass()).a(213530094774031L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private lx(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 16171078080364L;
      super(var3, true.c<invokedynamic>(21984, 500308159425681251L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final gd p(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 56860852085526L;
      int var6 = (int)((var4 ^ 56860852085526L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (gd)n.k((short)var6, this, Q[0], (short)var7, var8);
   }

   private final int P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 22405767888615L;
      int var3 = (int)((var1 ^ 22405767888615L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)c.k((short)var3, this, Q[1], (short)var4, var5)).intValue();
   }

   @Flow
   private final void I(ShowFloatingItemEvent var1) {
      long var2 = b ^ 72971278033455L;
      long var4 = var2 ^ 53090067212119L;
      T = var1.getItem();
      x = this.c(var4);
      var1.cancel();
   }

   @Flow
   private final void z(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void X(RenderFloatingItemEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void q(ItemCommandEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final int c(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 9151925540402L;
      long var22 = var20 ^ 62397856191869L;
      long var24 = var20 ^ 50071782153288L;
      long var26 = var20 ^ 88203295398434L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "\u009a\u0087jËùû\u0016\u001a\u0002[ßóÒ7c\u008b\u00187<å \u007f\u008aÌñ.Ki\u001dä\u001e\u0086\u0095Ý¹0A\f{¤ª \u0015Gò\u0015\u0091«`Òs\u0092Q¿Þ\u0089If¨Î\u0081(QËÓª\u0094£êY\u0019ç8\u0000\u0010<\u0089\u0005ï¶¿\u0002)·\u0003ÒÕòsIÓ \u007f\u0019°5©K\u0085ä`4Ì}K\u001duëF\u008c¾ßFt)*\u009däÙñ\b\u007fÀÍ\u0010\u0098+Îª»PbIN%\u0083Ïv\u0094ÝÜ0¤¹§â4¾À:[4\u0088 âlY4\u009d\r\u000eñ\\ò¾\u001bÍ;¤\u0082\u0013½-øÿ\u0000`CÏ\u001d\u0004àñ\u0085R\u0002Óä#H0Ú\u0014kâ\u008ei¼\u008d\u009d¬<D\u0002nJÄQ'gkTÌj\u009dl\u0004\u0083þ\u0087\u008f×à\u0014¿¢åEÑÀ\u0001ÂtÞbDM¥\u00000\u0018lÌ¸=1£Þ$%¤Ã\u001f\u000f\u008b&jI\u0081XßxÜ¡\u009e5÷{ôQÔI§²\u0017LÊïì6£Ü»\rËKDS\u0010\"ßXöL0unIÆ¶Éé(\u009d·";
      int var17 = "\u009a\u0087jËùû\u0016\u001a\u0002[ßóÒ7c\u008b\u00187<å \u007f\u008aÌñ.Ki\u001dä\u001e\u0086\u0095Ý¹0A\f{¤ª \u0015Gò\u0015\u0091«`Òs\u0092Q¿Þ\u0089If¨Î\u0081(QËÓª\u0094£êY\u0019ç8\u0000\u0010<\u0089\u0005ï¶¿\u0002)·\u0003ÒÕòsIÓ \u007f\u0019°5©K\u0085ä`4Ì}K\u001duëF\u008c¾ßFt)*\u009däÙñ\b\u007fÀÍ\u0010\u0098+Îª»PbIN%\u0083Ïv\u0094ÝÜ0¤¹§â4¾À:[4\u0088 âlY4\u009d\r\u000eñ\\ò¾\u001bÍ;¤\u0082\u0013½-øÿ\u0000`CÏ\u001d\u0004àñ\u0085R\u0002Óä#H0Ú\u0014kâ\u008ei¼\u008d\u009d¬<D\u0002nJÄQ'gkTÌj\u009dl\u0004\u0083þ\u0087\u008f×à\u0014¿¢åEÑÀ\u0001ÂtÞbDM¥\u00000\u0018lÌ¸=1£Þ$%¤Ã\u001f\u000f\u008b&jI\u0081XßxÜ¡\u009e5÷{ôQÔI§²\u0017LÊïì6£Ü»\rËKDS\u0010\"ßXöL0unIÆ¶Éé(\u009d·".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[12];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[18];
                  int var3 = 0;
                  String var4 = "õ\u0081ëfE^º\u0088@$\u0007¢Á©ÐF@b¬Â3Ñ£`\u0000\u0017è/4ml\"åÚ\u0091@ø^{\u008f\u00032Áq²tÊ\u0098\u001b\"kz\u0013þ\u0010§Âr¨$\u0093\u0005à\nt\u001d\u009cc³½¡\b*\n\u008dL½\u008cÞ3ß\u0097\\?³C\"|XV\tÊËþ\u001e\b\u0081,ÿï¦äÎ\u0081ËW~î\u000f0¤,åù8½&Å\u0095s5CYÈ\u0091ômò";
                  int var5 = "õ\u0081ëfE^º\u0088@$\u0007¢Á©ÐF@b¬Â3Ñ£`\u0000\u0017è/4ml\"åÚ\u0091@ø^{\u008f\u00032Áq²tÊ\u0098\u001b\"kz\u0013þ\u0010§Âr¨$\u0093\u0005à\nt\u001d\u009cc³½¡\b*\n\u008dL½\u008cÞ3ß\u0097\\?³C\"|XV\tÊËþ\u001e\b\u0081,ÿï¦äÎ\u0081ËW~î\u000f0¤,åù8½&Å\u0095s5CYÈ\u0091ômò".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[18];
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lx.class, true.c<invokedynamic>(27381, 4834427869859045241L ^ var20), true.c<invokedynamic>(6824, 7034304138753617708L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lx.class, true.c<invokedynamic>(12993, 7155506571532207950L ^ var20), true.c<invokedynamic>(9614, 8980831489388679168L ^ var20), 0)))};
                              Q = var28;
                              y = new lx(var26);
                              n = qi.M((il)y, true.c<invokedynamic>(23222, 7116317239615287103L ^ var20), (Enum)gd.FadeOut, (pj)null, (Function0)null, true.n<invokedynamic>(5428, 7814128246791324570L ^ var20), (Object)null, var24);
                              c = qi.o((il)y, true.c<invokedynamic>(706, 2418151008599783239L ^ var20), true.n<invokedynamic>(23232, 4512592325025631349L ^ var20), new IntRange(1, true.n<invokedynamic>(7499, 2591046130462379005L ^ var20)), var22, (pj)null, (Function0)null, true.n<invokedynamic>(21437, 3329780604650915075L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "=Òè\\\u0088Á¬zAªºR\u000fZ\u009c¦";
                           var5 = "=Òè\\\u0088Á¬zAªºR\u000fZ\u009c¦".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
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

               var15 = "\u0096Ö¶àÙ`\u0087¦\bÑ÷îw\nuk \u0016\u0011ÌAµã\u0097\u0010h/*ªÈ[\u0084\u0091þRåï\u001b$O\u0010ì<J\u009a\u0087a³ü";
               var17 = "\u0096Ö¶àÙ`\u0087¦\bÑ÷îw\nuk \u0016\u0011ÌAµã\u0097\u0010h/*ªÈ[\u0084\u0091þRåï\u001b$O\u0010ì<J\u009a\u0087a³ü".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3735;
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
            throw new RuntimeException("su/catlean/lx", var10);
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
         throw new RuntimeException("su/catlean/lx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28069;
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
            throw new RuntimeException("su/catlean/lx", var14);
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
         throw new RuntimeException("su/catlean/lx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
