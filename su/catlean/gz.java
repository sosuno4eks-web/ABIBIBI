package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.CrosshairRenderEvent;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.ScreenMouseCoordsEvent;
import su.catlean.gofra.Flow;

public final class gz implements zh {
   @NotNull
   public static final gz M;
   @NotNull
   private static List F;
   @NotNull
   private static final iz J;
   @NotNull
   private static List z;
   @NotNull
   private static List H;
   @Nullable
   private static nm B;
   @Nullable
   private static nm U;
   private static float k;
   private static float e;
   public static final float g = 5.0F;
   private static String[] R;
   private static final long a = j0.a(8350768479329466560L, 8719842200612987874L, MethodHandles.lookup().lookupClass()).a(6419431831813L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   private gz() {
   }

   @NotNull
   public final List R() {
      return F;
   }

   public final void E(@NotNull List <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(22009, 6704195174719320477L ^ var2));
      F = var1;
   }

   @NotNull
   public final iz L() {
      return J;
   }

   @NotNull
   public final List c() {
      return z;
   }

   public final void x(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(29777, 3233078756166593656L ^ var1));
      z = var3;
   }

   @NotNull
   public final List h() {
      return H;
   }

   public final void J(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(22009, 6704306782265512220L ^ var1));
      H = var3;
   }

   @Nullable
   public final nm q() {
      return B;
   }

   public final void M(@Nullable nm <set-?>) {
      B = var1;
   }

   @Nullable
   public final nm r() {
      return U;
   }

   public final void r(@Nullable nm <set-?>) {
      U = var1;
   }

   public final float b() {
      return k;
   }

   public final void J(float <set-?>) {
      k = var1;
   }

   public final float X() {
      return e;
   }

   public final void a(float <set-?>) {
      e = var1;
   }

   @Flow
   private final void f(ScreenMouseCoordsEvent var1) {
      k = (float)var1.getX();
      e = (float)var1.getY();
   }

   @Flow
   private final void h(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -20
   )
   private final void Y(Render2DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void x(InputEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void d(FrameBufferEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void O(CrosshairRenderEvent var1) {
      long var2 = a ^ 31115259084103L;
      long var4 = var2 ^ 127745148729123L;

      try {
         if (nj.U.O(var4)) {
            var1.cancel();
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 9074592764637962894L, var2);
      }
   }

   private final void B(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      List var10000 = F;
      nm[] var6 = new nm[true.g<invokedynamic>(27961, 6175535874344480322L ^ var4)];
      var6[0] = nt.D;
      var6[1] = n3.m;
      var6[2] = nz.R;
      var6[3] = ns.t;
      var6[4] = n5.m;
      var6[5] = np.i;
      var6[true.g<invokedynamic>(13018, 1955880396450116011L ^ var4)] = n8.t;
      var6[true.g<invokedynamic>(8914, 7484148700744819116L ^ var4)] = nb.D;
      var6[true.g<invokedynamic>(7755, 7498709348712029473L ^ var4)] = r4.B;
      var6[true.g<invokedynamic>(6992, 4658656859656198181L ^ var4)] = n1.I;
      var6[true.g<invokedynamic>(9800, 4942027003924686140L ^ var4)] = nu.V;
      var6[true.g<invokedynamic>(5966, 852099029450396721L ^ var4)] = ni.E;
      var6[true.g<invokedynamic>(5959, 2590826975296525371L ^ var4)] = nd.S;
      var6[true.g<invokedynamic>(23442, 2297089709111957754L ^ var4)] = ng.R;
      var6[true.g<invokedynamic>(5312, 4407304407163148208L ^ var4)] = ny.U;
      var6[true.g<invokedynamic>(13132, 5931567683427545125L ^ var4)] = nl.I;
      var6[true.g<invokedynamic>(12850, 6207809878665572676L ^ var4)] = ne.G;
      var6[true.g<invokedynamic>(23354, 5318681160912951367L ^ var4)] = na.X;
      var6[true.g<invokedynamic>(31146, 7717514982117931741L ^ var4)] = nj.U;
      var6[true.g<invokedynamic>(21221, 1006019734926315935L ^ var4)] = n6.D;
      var6[true.g<invokedynamic>(25143, 2570250981110374746L ^ var4)] = n2.K;
      var6[true.g<invokedynamic>(380, 7003766751635898894L ^ var4)] = nx.G;
      var6[true.g<invokedynamic>(17867, 1020568745211643576L ^ var4)] = nw.K;
      var10000.addAll((Collection)CollectionsKt.listOf(var6));
   }

   public final void N(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 107072156647827L;
      long var5 = var1 ^ 125510763048976L;
      Iterable var7 = (Iterable)F;
      boolean var8 = false;
      Iterator var9 = var7.iterator();

      label102:
      while(true) {
         Iterator var10000 = var9;

         label99:
         while(var10000.hasNext()) {
            Object var10 = var9.next();
            nm var11 = (nm)var10;
            boolean var12 = false;
            Iterable var13 = (Iterable)var11.B();
            boolean var14 = false;
            if (var1 < 0L) {
               return;
            }

            Iterator var15 = var13.iterator();

            while(var15.hasNext()) {
               Object var16 = var15.next();
               zf var17 = (zf)var16;
               boolean var18 = false;
               Iterable var19 = (Iterable)c0.S.A().a(var5).j();
               var10000 = var19.iterator();
               if (var1 <= 0L) {
                  continue label99;
               }

               Iterator var20 = var10000;

               Object var34;
               label93:
               while(true) {
                  if (var20.hasNext()) {
                     Object var21 = var20.next();
                     var34 = var21;

                     while(true) {
                        bj var22 = (bj)var34;
                        boolean var23 = false;
                        if (!Intrinsics.areEqual((Object)var22.k(), (Object)var11.h())) {
                           continue label93;
                        }

                        var34 = var21;
                        if (var1 > 0L) {
                           break label93;
                        }
                     }
                  }

                  var34 = null;
                  break;
               }

               label109: {
                  bj var35;
                  try {
                     var35 = (bj)var34;
                     if (var35 == null) {
                        break label109;
                     }
                  } catch (Exception var33) {
                     throw var33.A<invokedynamic>(var33, 8990909431209747367L, var1);
                  }

                  bj var24 = var35;
                  Iterable var38 = (Iterable)var24.a();
                  Iterator var39 = var38.iterator();

                  label75:
                  while(true) {
                     if (!var39.hasNext()) {
                        var34 = null;
                        break;
                     }

                     Object var40 = var39.next();
                     var34 = var40;

                     while(true) {
                        x6 var41 = (x6)var34;
                        boolean var25 = false;
                        if (!Intrinsics.areEqual((Object)var41.d(), (Object)var17.M())) {
                           break;
                        }

                        var34 = var40;
                        if (var1 > 0L) {
                           break label75;
                        }
                     }
                  }

                  x6 var36;
                  try {
                     var36 = (x6)var34;
                     if (var36 == null) {
                        break label109;
                     }
                  } catch (Exception var32) {
                     throw var32.A<invokedynamic>(var32, 8990909431209747367L, var1);
                  }

                  x6 var26 = var36;

                  try {
                     var17.n(var3, var26.n());
                  } catch (Exception var31) {
                     var17.r();
                     Logger var37 = s8.T();
                     String var10001 = var17.m();
                     String var10002 = var11.W();
                     String var28 = var31.getMessage();
                     String var29 = var10002;
                     String var30 = var10001;
                     var10001 = 16138.f<invokedynamic>(16138, 7764925703036580244L ^ var1);
                     var37.warn(var10001 + var30 + true.f<invokedynamic>(27923, 7503713856928899972L ^ var1) + var29 + true.f<invokedynamic>(6287, 8743851642926896661L ^ var1) + var28);
                  }
               }

               if (var1 <= 0L) {
                  break;
               }
            }

            if (var1 >= 0L) {
               continue label102;
            }

            return;
         }

         return;
      }
   }

   private static final boolean d(ib var0, Color var1, x5 var2) {
      long var3 = a ^ 2895027086507L;
      long var5 = var3 ^ 90405922522056L;
      long var7 = var3 ^ 19901524483019L;
      Intrinsics.checkNotNullParameter(var2, true.f<invokedynamic>(28271, 1561386127091742775L ^ var3));
      var0.c(var2.K(), var7, var2.v(), var2.B() + var2.J(), 0.0F).N(var1, var5).c(var2.K(), var7, var2.v() + var2.r(), var2.B() + var2.J(), 0.0F).N(var1, var5).c(var2.K(), var7, var2.v() + var2.r(), var2.B(), 0.0F).N(var1, var5).c(var2.K(), var7, var2.v(), var2.B(), 0.0F).N(var1, var5);
      return true;
   }

   private static final boolean l(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean G(dm var0) {
      long var1 = a ^ 132604805613811L;
      long var3 = var1 ^ 109184921970839L;
      Intrinsics.checkNotNullParameter(var0, true.f<invokedynamic>(16565, 7071282726088817331L ^ var1));
      fs.J(var0.V(), var0.a(), (double)var0.N(), (double)var0.d(), var0.H(), var0.c(), (Color)null, (Color)null, var0.s(), var3, true.g<invokedynamic>(13272, 5439988906680517662L ^ var1), (Object)null);
      return true;
   }

   private static final boolean G(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 84062767443164L;
      long var10001 = var20 ^ 117655276474626L;
      int var22 = (int)((var20 ^ 117655276474626L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var20 ^ 21871186546976L;
      String[] var10000 = new String[3];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -1426393846824974564L, var20);
      Cipher var11;
      Cipher var27 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "æÆ\tZ$²lªÑHY1ýZ/fK¦\u0014~Æ4\u0011§Á£î\u008bª\u0003\u0099T0}\u0087\u000f\u0018D×£x'à\u00adÈöéN0p%~ü\u0015ù¢ò×¦ø «®^\u001dã³Ç\u0094\u00adµò\u001f¦ä]\u0010?\u008bÎ7\u0010\táf\"\u00951aÛ¿\u008d\u009e8t´\u0012\u0016 öé¿\n?\u0090£  ª¨T\u009eÞ\u0096°¾7\u0016I¨Â%gå\u008b¯ã_.\bd\u0010~¬\u0087OÕ\u009eêJÓù>\u0004ÒR2\u0097\u0010½ÒïM\u0081\u0011°«Aè2\u000bÙÖÇ\u0014\u0010\u0006{÷\u0095oö)Gô\u0080\u0004zr²@K";
      int var17 = "æÆ\tZ$²lªÑHY1ýZ/fK¦\u0014~Æ4\u0011§Á£î\u008bª\u0003\u0099T0}\u0087\u000f\u0018D×£x'à\u00adÈöéN0p%~ü\u0015ù¢ò×¦ø «®^\u001dã³Ç\u0094\u00adµò\u001f¦ä]\u0010?\u008bÎ7\u0010\táf\"\u00951aÛ¿\u008d\u009e8t´\u0012\u0016 öé¿\n?\u0090£  ª¨T\u009eÞ\u0096°¾7\u0016I¨Â%gå\u008b¯ã_.\bd\u0010~¬\u0087OÕ\u009eêJÓù>\u0004ÒR2\u0097\u0010½ÒïM\u0081\u0011°«Aè2\u000bÙÖÇ\u0014\u0010\u0006{÷\u0095oö)Gô\u0080\u0004zr²@K".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var28 = var15.substring(var13, var13 + var14);
         byte var30 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var35 = a(var19).intern();
            switch(var30) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[9];
                  i = new HashMap(13);
                  Cipher var0;
                  var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[21];
                  int var3 = 0;
                  String var4 = "\u0087Ý\u0012ElwÃÐï@\u0088\f\u001bâ:l¼Xªn'\u0091<RS#À.`\u0017¿Ó[îç\u0092Ô\u0087ù\u0096g£îí\u001b0í³\u0086ò\u009b¹é\u0016\u0007ä\u0006©@\u0017\u008a_íOÈNþví®G$\u0018g\u00adÐ$\u0088õ\"«Hv!X»·x\u0011Lt\u0007£z\u0089mP»\u009e¢\u0091ûøÞl\u0010]».\u00ad\u009c\u0098\u0015Ã½QBC\u0012\u008em aÔ_Ä¶-G?õ\"QB\u000fÀ\u001b¸³!QQ£ÊJ»¸6ç\u0011n\u000f";
                  int var5 = "\u0087Ý\u0012ElwÃÐï@\u0088\f\u001bâ:l¼Xªn'\u0091<RS#À.`\u0017¿Ó[îç\u0092Ô\u0087ù\u0096g£îí\u001b0í³\u0086ò\u009b¹é\u0016\u0007ä\u0006©@\u0017\u008a_íOÈNþví®G$\u0018g\u00adÐ$\u0088õ\"«Hv!X»·x\u0011Lt\u0007£z\u0089mP»\u009e¢\u0091ûøÞl\u0010]».\u00ad\u009c\u0098\u0015Ã½QBC\u0012\u008em aÔ_Ä¶-G?õ\"QB\u000fÀ\u001b¸³!QQ£ÊJ»¸6ç\u0011n\u000f".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var34 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var34 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var34] = var40;
                           if (var2 >= var5) {
                              f = var6;
                              h = new Integer[21];
                              M = new gz();
                              F = (List)(new ArrayList());
                              J = new iz();
                              z = (List)(new ArrayList());
                              H = (List)(new ArrayList());
                              M.B(var22, (short)var23, (char)var24);
                              M.N(var25);
                              return;
                           }
                           break;
                        default:
                           var32[var34] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ìÀÙ\u0096\f¤\u009bÂ¡\u0087=Ë\u008c\u000eTÒ";
                           var5 = "ìÀÙ\u0096\f¤\u009bÂ¡\u0087=Ë\u008c\u000eTÒ".length();
                           var2 = 0;
                        }

                        var34 = var2;
                        var2 += 8;
                        var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                        var32 = var6;
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

               var15 = "f\u00046è\u000e«G\u008dWÓâWöeþ&\u0010á\u009a3ý\t°xéä\u0088¢\u0015®\u000f\u000e·";
               var17 = "f\u00046è\u000e«G\u008dWÓâWöeþ&\u0010á\u009a3ý\t°xéä\u0088¢\u0015®\u000f\u000e·".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var28 = var15.substring(var13, var13 + var14);
            var30 = 0;
         }
      }
   }

   public static void q(String[] var0) {
      R = var0;
   }

   public static String[] O() {
      return R;
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29539;
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
            throw new RuntimeException("su/catlean/gz", var10);
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
         throw new RuntimeException("su/catlean/gz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16039;
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
            throw new RuntimeException("su/catlean/gz", var14);
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
         throw new RuntimeException("su/catlean/gz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
