package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ef {
   @NotNull
   private final class_2338 g;
   private float J;
   private float a;
   @NotNull
   private final ArrayDeque Y;
   private int G;
   @NotNull
   private final iv q;
   private static boolean s;
   private static final long b = j0.a(6895087750326910462L, 4511056399434890664L, MethodHandles.lookup().lookupClass()).a(30113653496567L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   public ef(@NotNull class_2338 pos, long a, @Nullable class_2350 direction) {
      var2 ^= b;
      long var10001 = var2 ^ 21572122189433L;
      long var5 = (var2 ^ 21572122189433L) >>> 16;
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(2185, 293035537455286196L ^ var2));
      super();
      this.g = var1;
      this.Y = new ArrayDeque();
      this.q = new iv();
      this.L(var4, var5, (short)var7);
   }

   @NotNull
   public final class_2338 r() {
      return this.g;
   }

   public final float g() {
      return this.J;
   }

   public final float p() {
      return this.a;
   }

   public final int G() {
      return this.G;
   }

   public final void r(int <set-?>) {
      this.G = var1;
   }

   public final void L(@Nullable class_2350 direction, long a, short a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean t(long a, boolean async) {
      // $FF: Couldn't be decompiled
   }

   public static boolean Q(ef var0, boolean var1, long var2, int var4, Object var5) {
      var2 ^= b;
      long var6 = var2 ^ 110823847294677L;
      boolean var8 = 1535738741135645088L.A<invokedynamic>(1535738741135645088L, var2);

      int var10000;
      label20: {
         try {
            var10000 = var4 & 1;
            if (var8) {
               return (boolean)var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NoWhenBranchMatchedException var9) {
            throw var9.A<invokedynamic>(var9, 1528143202713826038L, var2);
         }

         var1 = false;
      }

      var10000 = var0.t(var6, var1);
      return (boolean)var10000;
   }

   public final boolean R(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void G(int param1, long param2, int param4, class_2350 param5) {
      // $FF: Couldn't be decompiled
   }

   public final void U(@NotNull u7 reason, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void Y(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 133788271123199L;
      boolean var10000 = 4037626800423863373L.A<invokedynamic>(4037626800423863373L, var1);
      this.Y.clear();
      boolean var5 = var10000;

      int var8;
      label30: {
         label29: {
            try {
               float var9;
               var8 = (var9 = this.J - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               if (!var5) {
                  break label30;
               }

               if (var8 == 0) {
                  break label29;
               }
            } catch (NoWhenBranchMatchedException var7) {
               throw var7.A<invokedynamic>(var7, 4080093775610601308L, var1);
            }

            var8 = 0;
            break label30;
         }

         var8 = 1;
      }

      try {
         if (var8 == 0) {
            h4.G((class_2596)(new class_2846(class_2847.field_12971, this.g, class_2350.field_11033)), var3);
         }

      } catch (NoWhenBranchMatchedException var6) {
         throw var6.A<invokedynamic>(var6, 4080093775610601308L, var1);
      }
   }

   private static final class_2596 f(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12968, var0.g, var1, var2));
   }

   private static final class_2596 M(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0.g, var1, var2));
   }

   private static final class_2596 J(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12968, var0.g, var1, var2));
   }

   private static final class_2596 U(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0.g, var1, var2));
   }

   private static final class_2596 t(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12968, var0.g, var1, var2));
   }

   private static final class_2596 e(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0.g, var1, var2));
   }

   private static final void Y(int var0, int var1) {
      long var2 = b ^ 134375322712877L;
      long var4 = var2 ^ 6691901141736L;
      y6.Z(var4, y6.m, var0, var1);
      y6.m.A().set(false);
   }

   private static final Unit l(boolean var0, ef var1, int var2, class_2350 var3) {
      long var4 = b ^ 108288000557633L;
      long var6 = var4 ^ 129795832159158L;
      long var8 = var4 ^ 34468560465974L;

      try {
         if (!var0) {
            var1.G(var2, var8, s8.f(var6).method_31548().method_67532(), var3);
         }
      } catch (NoWhenBranchMatchedException var10) {
         throw var10.A<invokedynamic>(var10, 1749754848995999627L, var4);
      }

      return Unit.INSTANCE;
   }

   private static final class_2596 Z(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0.g, var1, var2));
   }

   private static final class_2596 d(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0.g, var1, var2));
   }

   private static final class_2596 z(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12968, var0.g, var1, var2));
   }

   private static final void n(int var0, int var1) {
      long var2 = b ^ 74353142953400L;
      long var4 = var2 ^ 70089935158397L;
      y6.Z(var4, y6.m, var0, var1);
   }

   private static final class_2596 m(ef var0, class_2350 var1, int var2) {
      return (class_2596)(new class_2846(class_2847.field_12968, var0.g, var1, var2));
   }

   public static void m(boolean var0) {
      s = var0;
   }

   public static boolean v() {
      return s;
   }

   public static boolean i() {
      boolean var0 = v();

      try {
         return !var0;
      } catch (NoWhenBranchMatchedException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = b ^ 6405974279657L;
      e = new HashMap(13);
      false.A<invokedynamic>(false, -2311978749543198378L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "ºAN\u0083\u0084\u0095¢ÀRJ¾\u0094¤áIñÉ;m\n\u0013\u001e\u0086\u0082\u009epõFzmøø(V¼\u0088Ø§È\u008dÝàßÝæ\u0093\u00adQûö¸¼\u0084I\u0011÷ªÖäýÓ_ûÅ\u0012UÓ\u0003ib<¯î\u0010 ¡2þÖJÂ`\u0097}R\\\u0088^-+(´çsQÀ\u0083\u00149¡¨R\u0018[áV4ñîT³ÔÅ\u0081\u0084ü÷\u009aûàNõkvzâ\u0083¸B\u0015ä(C\u0004F÷%ò4l¬\u008eîæ\u009dÄ%¸íæ¨Ù\u0099\u001emq× O*\u0011!Ì\u0095V«,ð$\u0094\u0094\u0016";
      int var17 = "ºAN\u0083\u0084\u0095¢ÀRJ¾\u0094¤áIñÉ;m\n\u0013\u001e\u0086\u0082\u009epõFzmøø(V¼\u0088Ø§È\u008dÝàßÝæ\u0093\u00adQûö¸¼\u0084I\u0011÷ªÖäýÓ_ûÅ\u0012UÓ\u0003ib<¯î\u0010 ¡2þÖJÂ`\u0097}R\\\u0088^-+(´çsQÀ\u0083\u00149¡¨R\u0018[áV4ñîT³ÔÅ\u0081\u0084ü÷\u009aûàNõkvzâ\u0083¸B\u0015ä(C\u0004F÷%ò4l¬\u008eîæ\u009dÄ%¸íæ¨Ù\u0099\u001emq× O*\u0011!Ì\u0095V«,ð$\u0094\u0094\u0016".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[7];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "\u001b\u0006i\u0093 Á\u0000\u0002¦`±\u009f«\u009e^\u0099¤ºã\u0091¸t\u0092S#»w\u000b\u0002Ï\u001bÃ";
                  int var5 = "\u001b\u0006i\u0093 Á\u0000\u0002¦`±\u009f«\u009e^\u0099¤ºã\u0091¸t\u0092S#»w\u000b\u0002Ï\u001bÃ".length();
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
                              f = var6;
                              h = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "²#£f\u00184Æk\u001cbñZ£\u001dÙç";
                           var5 = "²#£f\u00184Æk\u001cbñZ£\u001dÙç".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\b¹\u001c¬\u0004\u0012u\u00172\u009cÞ ³W\u000fÁÅv\u008b±`6¯rì\" ®âþ$·\u007fdðÌUSâ,\u0010Ï.©éÙ¿ó\u000e<B¯\u0089¨KÄæ";
               var17 = "\b¹\u001c¬\u0004\u0012u\u00172\u009cÞ ³W\u000fÁÅv\u008b±`6¯rì\" ®âþ$·\u007fdðÌUSâ,\u0010Ï.©éÙ¿ó\u000e<B¯\u0089¨KÄæ".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2041;
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
            throw new RuntimeException("su/catlean/ef", var10);
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
         throw new RuntimeException("su/catlean/ef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3559;
      if (h[var3] == null) {
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
            throw new RuntimeException("su/catlean/ef", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/ef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
