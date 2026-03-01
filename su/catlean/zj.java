package su.catlean;

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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zj extends zt {
   @NotNull
   public static final hu E;
   @NotNull
   private final Map S;
   @NotNull
   private final f9 r;
   @Nullable
   private static zt x;
   private static int[] A;
   private static final long a = j0.a(-5946887857901503404L, 5881591377469450637L, MethodHandles.lookup().lookupClass()).a(275824764764534L);
   private static final String[] c;
   private static final String[] f;
   private static final Map h;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map m;

   public zj(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 58119199038831L;
      long var5 = var1 ^ 53626136299776L;
      long var7 = var1 ^ 26599757289298L;
      super(var5);
      8148080865699098810L.A<invokedynamic>(8148080865699098810L, var1);
      this.S = (Map)(new LinkedHashMap());

      try {
         this.r = new f9(0.0F, 0.0F, 40.0F, var7, 15.0F, "", zj::b, 0, z8.I.a(), z8.I.p(), 0.0F, 0.0F, true.q<invokedynamic>(9775, 6561595148959127094L ^ var1), (DefaultConstructorMarker)null);
         this.P(var3);
         if (8173339116239483911L.A<invokedynamic>(8173339116239483911L, var1) == null) {
            (new int[3]).A<invokedynamic>(new int[3], 8089603445887533535L, var1);
         }

      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, 8169551296927750728L, var1);
      }
   }

   private final void U(String var1, int var2, int var3) {
      long var4 = ((long)var2 << 32 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 43383246786745L;
      long var8 = var4 ^ 7158673677944L;
      long var10 = var4 ^ 14414949747945L;
      int[] var10000 = 8990838313884843372L.A<invokedynamic>(8990838313884843372L, var4);
      df var10001 = c0.S.T();
      Iterable var13 = (Iterable)c0.S.T().L(var8);
      df var19 = var10001;
      int[] var12 = var10000;
      boolean var14 = false;
      Iterator var15 = var13.iterator();

      Object var21;
      label38:
      while(true) {
         if (!var15.hasNext()) {
            var21 = null;
            break;
         }

         var21 = var15.next();

         while(true) {
            Object var16 = var21;
            var21 = var16;

            while(true) {
               f6 var17 = (f6)var21;
               boolean var18 = false;
               if (!Intrinsics.areEqual((Object)var17.h(), (Object)var1)) {
                  continue label38;
               }

               var21 = var16;
               if (var3 >= 0) {
                  break;
               }

               if (var12 == null) {
                  break label38;
               }
            }
         }
      }

      f6 var23;
      df var24;
      try {
         Object var22 = var21;
         var24 = var19;
         var23 = (f6)var22;
         if (var23 == null) {
            return;
         }
      } catch (NumberFormatException var20) {
         throw var20.A<invokedynamic>(var20, 8986370320382351262L, var4);
      }

      var24.d(var10, var23);
      this.P(var6);
   }

   private final void p(String var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 34575842247277L;
      long var6 = var2 ^ 68738300480684L;
      c0.S.T().L(var6).removeIf(zj::S);
      this.P(var4);
   }

   public final void P(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void G(int param1, class_1792 param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   public void X(@NotNull class_332 context, int mouseX, int mouseY, long a) {
      // $FF: Couldn't be decompiled
   }

   public void p(int a, char a, int mouseX, short a, int mouseY, int mouseButton) {
      // $FF: Couldn't be decompiled
   }

   public void P(int key, long a) {
      // $FF: Couldn't be decompiled
   }

   public void B(char char, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   public void w(double mouseX, double mouseY, double verticalAmount, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit H(zj var0, String var1) {
      long var2 = a ^ 8277265270896L;
      long var10001 = var2 ^ 110751741162780L;
      int var4 = (int)((var2 ^ 110751741162780L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(5878, 8235720453546942614L ^ var2));
      var0.U(var1, var4, var5);
      zt var10000 = x;
      Intrinsics.checkNotNull(var10000);
      var10000.g(true);
      return Unit.INSTANCE;
   }

   private static final Unit f(zj var0, String var1) {
      long var2 = a ^ 8472596589858L;
      long var4 = var2 ^ 101770735927962L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(5878, 8235720520444495300L ^ var2));
      var0.p(var1, var4);
      return Unit.INSTANCE;
   }

   private static final Unit b(zj var0) {
      long var1 = a ^ 30408197941144L;
      long var10001 = var1 ^ 50710647758575L;
      int var3 = (int)((var1 ^ 50710647758575L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 58926102018615L;
      hu var10000 = E;
      Iterable var9 = (Iterable)c0.S.T().L(var6);
      boolean var10 = false;
      int[] var22 = 1768486227213850915L.A<invokedynamic>(1768486227213850915L, var1);
      Collection var12 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var9, true.q<invokedynamic>(21506, 3293295778701217155L ^ var1))));
      int[] var8 = var22;
      boolean var13 = false;
      Iterator var14 = var9.iterator();

      Collection var23;
      while(true) {
         if (var14.hasNext()) {
            Object var15 = var14.next();
            var23 = var12;
            f6 var16 = (f6)var15;
            if (var8 != null) {
               break;
            }

            boolean var17 = false;
            var12.add(var16.h());
            if (var8 == null) {
               continue;
            }
         }

         var23 = var12;
         break;
      }

      List var25 = (List)var23;
      Function1 var24 = zj::H;
      Function1 var19 = zj::f;
      Function1 var20 = var24;
      List var21 = var25;
      x = (zt)(new zz((short)var3, var21, var4, var20, (char)var5, var19));
      return Unit.INSTANCE;
   }

   private static final boolean U(String var0, f6 var1) {
      long var2 = a ^ 25246315302134L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(22678, 4526675694818191988L ^ var2));
      return Intrinsics.areEqual((Object)var1.h(), (Object)var0);
   }

   private static final boolean S(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit u(zj var0, int var1, class_1792 var2) {
      long var3 = a ^ 29309504008823L;
      long var5 = var3 ^ 20419411410108L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(31426, 8035630141077075618L ^ var3));
      var0.G(var1, var2, var5);
      zt var10000 = x;
      Intrinsics.checkNotNull(var10000);
      var10000.g(true);
      return Unit.INSTANCE;
   }

   private static final Unit e(class_1792 var0, zj var1, int var2) {
      long var3 = a ^ 20916444670189L;
      long var10001 = var3 ^ 112589763996260L;
      int var5 = (int)((var3 ^ 112589763996260L) >>> 48);
      long var6 = var10001 << 16 >>> 16;
      hu var10000 = E;
      class_1792[] var8 = new class_1792[]{var0};
      x = (zt)(new zi(CollectionsKt.mutableListOf(var8), (char)var5, zj::u, var6));
      return Unit.INSTANCE;
   }

   public static final zt A() {
      return x;
   }

   public static final void p(zt <set-?>) {
      x = var0;
   }

   static {
      long var20 = a ^ 45244816598589L;
      h = new HashMap(13);
      null.A<invokedynamic>((Object)null, -7460185008470234653L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "\u001dGî.>ºdÊ<p`\u0095®z#\u009eåO\u0096°öD¼èþ·\u0096&\u0016^ñõ\u0010<g\u0080\u0098\u00adK\u008aÎBm\u007f4ý+í¤\u0010f?PEû%2gºÅ\u0093\u007fYå)\u00ad\u0010\rw\u001eÎ§p®E\u0089Ò\u0003HyÁ\u0012r ·`ÔmA@\u0097sÏi\u009eÑr\u0011âæTT68\u0099\u0012#ÁË\u0005= äÕ\u0094x\u0010±YDTrµ,1lr5ÍW\u000fò`";
      int var17 = "\u001dGî.>ºdÊ<p`\u0095®z#\u009eåO\u0096°öD¼èþ·\u0096&\u0016^ñõ\u0010<g\u0080\u0098\u00adK\u008aÎBm\u007f4ý+í¤\u0010f?PEû%2gºÅ\u0093\u007fYå)\u00ad\u0010\rw\u001eÎ§p®E\u0089Ò\u0003HyÁ\u0012r ·`ÔmA@\u0097sÏi\u009eÑr\u0011âæTT68\u0099\u0012#ÁË\u0005= äÕ\u0094x\u0010±YDTrµ,1lr5ÍW\u000fò`".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  f = new String[8];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[15];
                  int var3 = 0;
                  String var4 = "f\u008d§Ò¿\u0007T Pju\u0093Ófvï·½\u0005ô\"I\u009aµ\u0083\u00adàYÜ\u0093\u00adÇø+oU®8\u008eêEÛ\u0095ÊG\u0012F\u009fú+xf@y$aö\u008bÖ^\u0086@\u0092çÕOuò%\f¸Ï\u001eÎ\u0085hÉ»PPÀ\u000b\u001d$\u0093\u009e[Ì\u001e\u001aþT±Sy¸õ\u0018á\u0084\u0080ËV\u0089";
                  int var5 = "f\u008d§Ò¿\u0007T Pju\u0093Ófvï·½\u0005ô\"I\u009aµ\u0083\u00adàYÜ\u0093\u00adÇø+oU®8\u008eêEÛ\u0095ÊG\u0012F\u009fú+xf@y$aö\u008bÖ^\u0086@\u0092çÕOuò%\f¸Ï\u001eÎ\u0085hÉ»PPÀ\u000b\u001d$\u0093\u009e[Ì\u001e\u001aþT±Sy¸õ\u0018á\u0084\u0080ËV\u0089".length();
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
                              i = var6;
                              l = new Integer[15];
                              E = new hu((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ö\u0082\u0085:.\u0098Ý!õmsÉJÑõ\u0088";
                           var5 = "ö\u0082\u0085:.\u0098Ý!õmsÉJÑõ\u0088".length();
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

               var15 = "\u001e$hL\u0087\u0082\u0096=ß]\u008cS\u0086Äb\u001f ¨\u008cA\u0080>ÜÆÎÖá\u001ajcÊ\u0090[\u009e\u008c&\u0018gT<ÜWü\u0015\" \u001c=S";
               var17 = "\u001e$hL\u0087\u0082\u0096=ß]\u008cS\u0086Äb\u001f ¨\u008cA\u0080>ÜÆÎÖá\u001ajcÊ\u0090[\u009e\u008c&\u0018gT<ÜWü\u0015\" \u001c=S".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void z(int[] var0) {
      A = var0;
   }

   public static int[] F() {
      return A;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16557;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zj", var10);
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
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/zj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16546;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
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
            throw new RuntimeException("su/catlean/zj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
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
         throw new RuntimeException("su/catlean/zj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
