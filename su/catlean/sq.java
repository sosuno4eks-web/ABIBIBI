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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sq extends s4 {
   @NotNull
   public static final sq a;
   @NotNull
   private static List O;
   @Nullable
   private static dx D;
   @Nullable
   private static dx s;
   @Nullable
   private static dx F;
   @Nullable
   private static dw U;
   @NotNull
   private static aa i;
   @NotNull
   private static aa d;
   @NotNull
   private static aa T;
   private static boolean h;
   private static float K;
   @NotNull
   private static final dj B;
   @NotNull
   private static final dj t;
   @NotNull
   private static final dj z;
   @NotNull
   private static final dj w;
   @NotNull
   private static final dj G;
   private static final long b = j0.a(5132846040188013533L, 1000207017300972340L, MethodHandles.lookup().lookupClass()).a(111615936603876L);
   private static final String[] g;
   private static final String[] j;
   private static final Map m;
   private static final long[] q;
   private static final Integer[] u;
   private static final Map v;

   private sq(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 6368798349918L;
      int var3 = (int)((var1 ^ 6368798349918L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      super(true.d<invokedynamic>(9040, 1916918595758617136L ^ var1), (short)var3, var4, var5, 0.0F, 0.0F, 0.0F, 0.0F, true.s<invokedynamic>(4309, 3481052509967120906L ^ var1), (DefaultConstructorMarker)null);
   }

   @NotNull
   public final List j() {
      return O;
   }

   public final void K(@NotNull List <set-?>, int a, char a, char a) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(30764, 2661959617374509991L ^ var5));
      O = var1;
   }

   @Nullable
   public final dx m() {
      return D;
   }

   public final void h(@Nullable dx <set-?>) {
      D = var1;
   }

   @Nullable
   public final dx f() {
      return F;
   }

   public final void U(@Nullable dx <set-?>) {
      F = var1;
   }

   @Nullable
   public final dw s() {
      return U;
   }

   public final void C(@Nullable dw <set-?>) {
      U = var1;
   }

   @NotNull
   public final aa G() {
      return i;
   }

   public final void X(long a, @NotNull aa <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.d<invokedynamic>(24236, 5741763894977084998L ^ var1));
      i = var3;
   }

   public void y(long var1) {
      long var3 = var1 ^ 134848885269665L;
      long var5 = var1 ^ 84913510033165L;
      O.clear();
      Iterable var7 = (Iterable)vj.o.K(var5);
      boolean var8 = false;
      Iterator var9 = var7.iterator();

      while(var9.hasNext()) {
         Object var10 = var9.next();
         _k var11 = (_k)var10;
         boolean var12 = false;
         sq var10000 = a;
         O.add(new dw(var3, var11));
         if (var1 > 0L && var1 > 0L) {
            continue;
         }
      }

   }

   public void X(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   private final void T(long param1, String param3) {
      // $FF: Couldn't be decompiled
   }

   public void T(float mX, float mY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   public void D(double mouseX, long a, double mouseY, double amount) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit E(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit W(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit n(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit D(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit x(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit k() {
      long var0 = b ^ 103242300933891L;
      long var2 = var0 ^ 30861811502028L;
      vj var10000 = vj.o;
      sq var10001 = a;
      dw var7 = U;
      Intrinsics.checkNotNull(var7);
      var10000.C(var7.o(), var2);
      sq var6 = a;
      Collection var4 = (Collection)O;
      var6 = a;
      dw var5 = U;
      TypeIntrinsics.asMutableCollection(var4).remove(var5);
      var6 = a;
      U = null;
      return Unit.INSTANCE;
   }

   private static final Unit i(String var0) {
      long var1 = b ^ 74661030783185L;
      long var3 = var1 ^ 106414476085998L;
      Intrinsics.checkNotNullParameter(var0, true.d<invokedynamic>(2464, 3987927232195552975L ^ var1));
      a.T(var3, var0);
      return Unit.INSTANCE;
   }

   static {
      long var31 = b ^ 114714073754088L;
      long var33 = var31 ^ 83598289433249L;
      long var35 = var31 ^ 52575556097385L;
      long var10001 = var31 ^ 26155880474444L;
      int var37 = (int)((var31 ^ 26155880474444L) >>> 32);
      int var38 = (int)(var10001 << 32 >>> 48);
      int var39 = (int)(var10001 << 48 >>> 48);
      var10001 = var31 ^ 2821242138389L;
      int var40 = (int)((var31 ^ 2821242138389L) >>> 48);
      int var41 = (int)(var10001 << 16 >>> 48);
      int var42 = (int)(var10001 << 32 >>> 32);
      m = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[16];
      int var27 = 0;
      String var26 = "\u0012\u0097bÜnzb\u0003\u0098\u008aG\u008aÎ\u0010(\n ¡9¦\u0005Jj\f\u0002åä\u0015ª\u008f´Ñ_\u000fþé\fÒ,d^\u001a&\u0082#×xµt\u0015æß¼:\u0096ÍüÜ¥:\u0081\u0093¬\"+\u0098\u0081\u0000úá;ï \u0087ïû%êu\u0013±ÉtörL\u0095<\u0013Ç§]>õ3LÒüG*z*[\u009a%»|O$o\u0092óV=-ÏG%qËh'õ\u0099sV\u00ads\u0091J\u0093\u0087W\u009f÷gôC¶]t\u0002O)½¯\u009b\u000fÈIR*ÕP\u0004\u0080\u0095\u0007ßyÔÃLÏõÚ\u0091\u001c\u0098r¾&\b\r\u0085\u0012O\u0010\u0097¥Kð\u0012eî©\u0099\u0088*¼è\u0085\u0099\u0003 Ø6\u0019¬\u0019\u009b¶ý\u0007A|\u0011wZßu+dÜ0zÏ\u00ad\u0096\u0081\u008fèr×¯\u0094\u000e\u00106ûF+PÙùñ<M¤Ì\u0097Á7Ð\u0010ÌH\u009a=:XE\u008cf\u0000²R\u0092\u0088Áï\u0010\u0092so~\u0080\"r\u0096ëRA\u0005*óU]\u0010\u0002aï0Þ°hNO\\\u001a!¤§\u008a-\u0010-\u0083g\u001c\u007fª\u009bwåj»Ü-\"d^\u0010Ï²\u008f¢\u0095\u0096`p;Bë\u007f\u00adW\u0002\u0084 §Íö-|Ë\u0017Ç\u001dW:Z\u009c\u0016L³Qá¨R\u0080³èßnë\u0004Èz×ÒJ\u0018@Z<\u007f¿1X¢ÛÑS·5ù\u008cDî\u0089´J\u0011Ù¿¢\u0010â\u0099îÈ\u0087ö.fîæé\u0003í\u0019w± \u0094.k\u0017\u0093'Ú7)0\u009c(üËÇ!dX\u001eý];-=Ð1\u0010\u001d»Ó\u0019e";
      int var28 = "\u0012\u0097bÜnzb\u0003\u0098\u008aG\u008aÎ\u0010(\n ¡9¦\u0005Jj\f\u0002åä\u0015ª\u008f´Ñ_\u000fþé\fÒ,d^\u001a&\u0082#×xµt\u0015æß¼:\u0096ÍüÜ¥:\u0081\u0093¬\"+\u0098\u0081\u0000úá;ï \u0087ïû%êu\u0013±ÉtörL\u0095<\u0013Ç§]>õ3LÒüG*z*[\u009a%»|O$o\u0092óV=-ÏG%qËh'õ\u0099sV\u00ads\u0091J\u0093\u0087W\u009f÷gôC¶]t\u0002O)½¯\u009b\u000fÈIR*ÕP\u0004\u0080\u0095\u0007ßyÔÃLÏõÚ\u0091\u001c\u0098r¾&\b\r\u0085\u0012O\u0010\u0097¥Kð\u0012eî©\u0099\u0088*¼è\u0085\u0099\u0003 Ø6\u0019¬\u0019\u009b¶ý\u0007A|\u0011wZßu+dÜ0zÏ\u00ad\u0096\u0081\u008fèr×¯\u0094\u000e\u00106ûF+PÙùñ<M¤Ì\u0097Á7Ð\u0010ÌH\u009a=:XE\u008cf\u0000²R\u0092\u0088Áï\u0010\u0092so~\u0080\"r\u0096ëRA\u0005*óU]\u0010\u0002aï0Þ°hNO\\\u001a!¤§\u008a-\u0010-\u0083g\u001c\u007fª\u009bwåj»Ü-\"d^\u0010Ï²\u008f¢\u0095\u0096`p;Bë\u007f\u00adW\u0002\u0084 §Íö-|Ë\u0017Ç\u001dW:Z\u009c\u0016L³Qá¨R\u0080³èßnë\u0004Èz×ÒJ\u0018@Z<\u007f¿1X¢ÛÑS·5ù\u008cDî\u0089´J\u0011Ù¿¢\u0010â\u0099îÈ\u0087ö.fîæé\u0003í\u0019w± \u0094.k\u0017\u0093'Ú7)0\u009c(üËÇ!dX\u001eý];-=Ð1\u0010\u001d»Ó\u0019e".length();
      char var25 = 16;
      int var24 = -1;

      label74:
      while(true) {
         ++var24;
         String var43 = var26.substring(var24, var24 + var25);
         byte var46 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var43.getBytes("ISO-8859-1"));
            String var49 = b(var30).intern();
            switch(var46) {
            case 0:
               var29[var27++] = var49;
               if ((var24 += var25) >= var28) {
                  g = var29;
                  j = new String[16];
                  v = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[8];
                  int var14 = 0;
                  String var15 = "C®\u0003½\u0019êm\u0095c D7\u0081µ\u009f4Û\u0088lfrÄ\u0097Ãh×\nÅ_Þ\u009f{F}\u009eVtëe 0×Ì\u001e¼ß\u001f\"";
                  int var16 = "C®\u0003½\u0019êm\u0095c D7\u0081µ\u009f4Û\u0088lfrÄ\u0097Ãh×\nÅ_Þ\u009f{F}\u009eVtëe 0×Ì\u001e¼ß\u001f\"".length();
                  int var13 = 0;

                  label56:
                  while(true) {
                     int var50 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                     long[] var45 = var17;
                     var50 = var14++;
                     long var52 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var53 = -1;

                     while(true) {
                        long var19 = var52;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var55 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var53) {
                        case 0:
                           var45[var50] = var55;
                           if (var13 >= var16) {
                              q = var17;
                              u = new Integer[8];
                              Cipher var1;
                              var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var2 = 1; var2 < 8; ++var2) {
                                 var10003[var2] = (byte)((int)(var31 << var2 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var0 = new long[3];
                              int var4 = 0;
                              String var5 = "ãô-\u0094\n-ç®ãô-\u0094\n-ç®G1\u008dU\u0011¯Ö\u008a";
                              int var6 = "ãô-\u0094\n-ç®ãô-\u0094\n-ç®G1\u008dU\u0011¯Ö\u008a".length();
                              int var3 = 0;

                              do {
                                 var50 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var50, var3).getBytes("ISO-8859-1");
                                 var50 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var55 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var56 = true;
                                 var0[var50] = var55;
                              } while(var3 < var6);

                              a = new sq(var35);
                              O = (List)(new ArrayList());
                              i = new aa(sa.OUT_QUINT, var0[1], (short)var40, (short)var41, var42);
                              d = new aa(sa.OUT_QUINT, var0[0], (short)var40, (short)var41, var42);
                              T = new aa(sa.OUT_QUINT, var0[2], (short)var40, (short)var41, var42);
                              B = new dj(var37, (char)var38, true.d<invokedynamic>(26486, 7937279769855756590L ^ var31), a.K(), (pl)null, (char)var39, sq::E, 4, (DefaultConstructorMarker)null);
                              t = new dj(var37, (char)var38, true.d<invokedynamic>(10287, 8022651461869225584L ^ var31), a.K(), (pl)null, (char)var39, sq::W, 4, (DefaultConstructorMarker)null);
                              z = new dj(var37, (char)var38, "X", a.K(), (pl)null, (char)var39, sq::n, 4, (DefaultConstructorMarker)null);
                              w = new dj(var37, (char)var38, "Y", a.K(), (pl)null, (char)var39, sq::D, 4, (DefaultConstructorMarker)null);
                              G = new dj(var37, (char)var38, "Z", a.K(), (pl)null, (char)var39, sq::x, 4, (DefaultConstructorMarker)null);
                              a.y(var33);
                              a.u(290.0F);
                              return;
                           }
                           break;
                        default:
                           var45[var50] = var55;
                           if (var13 < var16) {
                              continue label56;
                           }

                           var15 = "'HSO CÜ\u0089;QÈF\u008a¼\u0095\u00ad";
                           var16 = "'HSO CÜ\u0089;QÈF\u008a¼\u0095\u00ad".length();
                           var13 = 0;
                        }

                        var50 = var13;
                        var13 += 8;
                        var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                        var45 = var17;
                        var50 = var14++;
                        var52 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var53 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var49;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label74;
               }

               var26 = "ðu\\\u0081\u000f¢\u0010\u0084dûÛÊX²# \u0010¸M Qoê»\u0005\u0006\u0012[\fÙîv\u0017";
               var28 = "ðu\\\u0081\u000f¢\u0010\u0084dûÛÊX²# \u0010¸M Qoê»\u0005\u0006\u0012[\fÙîv\u0017".length();
               var25 = 16;
               var24 = -1;
            }

            ++var24;
            var43 = var26.substring(var24, var24 + var25);
            var46 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28130;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/sq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         j[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
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
         throw new RuntimeException("su/catlean/sq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22111;
      if (u[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = q[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/sq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/sq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
