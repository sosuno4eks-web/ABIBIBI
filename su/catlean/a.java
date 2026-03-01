package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class a {
   private final char G;
   private final char q;
   @NotNull
   private final Font J;
   @NotNull
   private final class_2960 o;
   private final int c;
   @NotNull
   private final Char2ObjectArrayMap F;
   private int s;
   private int i;
   private boolean k;
   private static final long a = j0.a(5071759337303716568L, 8792446296104546052L, MethodHandles.lookup().lookupClass()).a(95988789786804L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public a(long a, char fromIncl, char toExcl, @NotNull Font font, @NotNull class_2960 bindToTexture, int pixelPadding) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var5, true.w<invokedynamic>(2071, 7358902444223115487L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.w<invokedynamic>(14933, 888476460146295452L ^ var1));
      super();
      this.G = var3;
      this.q = var4;
      this.J = var5;
      this.o = var6;
      this.c = var7;
      this.F = new Char2ObjectArrayMap();
   }

   @NotNull
   public final Font Y() {
      return this.J;
   }

   @NotNull
   public final class_2960 R() {
      return this.o;
   }

   public final int k() {
      return this.s;
   }

   public final void a(int <set-?>) {
      this.s = var1;
   }

   public final int n() {
      return this.i;
   }

   public final void k(int <set-?>) {
      this.i = var1;
   }

   @Nullable
   public final ps V(long a, char c) {
      var1 ^= a;
      long var4 = var1 ^ 110265679388506L;

      try {
         if (!this.k) {
            this.v(var4);
         }
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 6515263076368857386L, var1);
      }

      return (ps)this.F.get(var3);
   }

   public final void H(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 58756341846500L;
      int var3 = (int)((var1 ^ 58756341846500L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var3, (short)var4, var5).method_1531().method_4615(this.o);
      this.F.clear();
      this.s = -1;
      this.i = -1;
      this.k = false;
   }

   public final boolean B(long a, char c) {
      // $FF: Couldn't be decompiled
   }

   private final Font m(char var1, long var2) {
      var2 ^= a;

      try {
         if (this.J.canDisplay(var1)) {
            return this.J;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 867504325863436105L, var2);
      }

      return this.J;
   }

   private final void v(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 79027662342457L;
      long var5 = var1 ^ 32614441257339L;
      long var7 = var1 ^ 17231274411131L;

      try {
         if (this.k) {
            return;
         }
      } catch (NumberFormatException var26) {
         throw var26.A<invokedynamic>(var26, -4305194653986937088L, var1);
      }

      int var9 = this.q - this.G - 1;
      int var10 = (int)(Math.ceil(Math.sqrt((double)var9)) * 1.5D);
      this.F.clear();
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      List var18 = (List)(new ArrayList());
      AffineTransform var19 = new AffineTransform();
      FontRenderContext var20 = new FontRenderContext(var19, true, false);

      while(var11 <= var9) {
         char var21 = (char)(this.G + var11);
         Font var22 = this.m(var21, var3);
         Rectangle2D var23 = var22.getStringBounds(String.valueOf(var21), var20);
         int var24 = (int)Math.ceil(var23.getWidth());
         int var25 = (int)Math.ceil(var23.getHeight());
         ++var11;
         var13 = (int)Math.max((double)var13, (double)(var15 + var24));
         var14 = (int)Math.max((double)var14, (double)(var16 + var25));
         int var10000 = var12;
         int var10001 = var10;
         if (var1 > 0L) {
            if (var12 >= var10) {
               var15 = 0;
               var16 += var17 + this.c;
               var12 = 0;
               var17 = 0;
            }

            var17 = (int)Math.max((double)var17, (double)var25);
            var18.add(new ps(var15, var7, var16, var24, var25, var21, this));
            var10000 = var15;
            var10001 = var24 + this.c;
         }

         var15 = var10000 + var10001;
         ++var12;
         if (var1 < 0L) {
            break;
         }
      }

      BufferedImage var27 = new BufferedImage((int)Math.max((double)(var13 + this.c), 1.0D), (int)Math.max((double)(var14 + this.c), 1.0D), 2);
      this.s = var27.getWidth();
      this.i = var27.getHeight();
      Graphics2D var28 = var27.createGraphics();
      var28.setColor(new Color(true.c<invokedynamic>(3938, 8326822357366724145L ^ var1), true.c<invokedynamic>(30814, 6443821968642023692L ^ var1), true.c<invokedynamic>(30814, 6443821968642023692L ^ var1), 0));
      var28.fillRect(0, 0, this.s, this.i);
      var28.setColor(Color.WHITE);
      var28.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
      var28.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
      var28.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      Iterator var29 = var18.iterator();

      while(true) {
         if (var29.hasNext()) {
            ps var30 = (ps)var29.next();
            var28.setFont(this.m(var30.E(), var3));
            var28.drawString(String.valueOf(var30.E()), var30.I(), var30.e() + var28.getFontMetrics().getAscent());
            this.F.put(var30.E(), var30);
            if (var1 < 0L) {
               break;
            }

            if (var1 > 0L) {
               continue;
            }
         }

         gk.E.c(this.o, var27, var5);
         this.k = true;
         break;
      }

   }

   static {
      long var11 = a ^ 86312831759061L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "jx\u008c\u0004\u001bÀtûxÕ\u008eÑFk\u008fäê\u009eß¼'<\u0084Èº\u008eöëS{ã\u0018\u0010£ÿÇ\u0097\u009cE8ðªµ½ã¥\u0000îÛ";
      int var19 = "jx\u008c\u0004\u001bÀtûxÕ\u008eÑFk\u008fäê\u009eß¼'<\u0084Èº\u008eöëS{ã\u0018\u0010£ÿÇ\u0097\u009cE8ðªµ½ã¥\u0000îÛ".length();
      char var16 = ' ';
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var24 = a(var21).intern();
         boolean var10001 = true;
         var20[var18++] = var24;
         if ((var15 += var16) >= var19) {
            b = var20;
            d = new String[2];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "O§c\u0006\u0097>\u0081>Ý&6²\u000b>\u001fV";
            int var5 = "O§c\u0006\u0097>\u0081>Ý&6²\u000b>\u001fV".length();
            int var2 = 0;

            do {
               int var23 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
               var23 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
               long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
               boolean var26 = true;
               var6[var23] = var10004;
            } while(var2 < var5);

            f = var6;
            g = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11467;
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
            throw new RuntimeException("su/catlean/a", var10);
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
         throw new RuntimeException("su/catlean/a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7229;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/a", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
