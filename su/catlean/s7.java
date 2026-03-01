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

public final class s7 extends s4 {
   @NotNull
   public static final s7 m;
   @NotNull
   private static final List N;
   @Nullable
   private static dx W;
   @Nullable
   private static dx R;
   @Nullable
   private static dx x;
   @Nullable
   private static di O;
   @NotNull
   private static aa X;
   @NotNull
   private static aa E;
   @NotNull
   private static aa H;
   private static boolean T;
   private static float F;
   @NotNull
   private static final dj g;
   @NotNull
   private static final dj w;
   @NotNull
   private static final dj U;
   @NotNull
   private static final dj q;
   @NotNull
   private static final dj t;
   private static String[] K;
   private static final long a = j0.a(1015426499464787753L, 2681694252977960844L, MethodHandles.lookup().lookupClass()).a(187653429368415L);
   private static final String[] d;
   private static final String[] h;
   private static final Map b;
   private static final long[] i;
   private static final Integer[] j;
   private static final Map s;

   private s7(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 57795865445126L;
      int var3 = (int)((var1 ^ 57795865445126L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      super(true.o<invokedynamic>(19566, 3462107688119973818L ^ var1), (short)var3, var4, var5, 0.0F, 0.0F, 0.0F, 0.0F, true.m<invokedynamic>(6510, 5349079787800852003L ^ var1), (DefaultConstructorMarker)null);
   }

   @NotNull
   public final List G() {
      return N;
   }

   @Nullable
   public final dx O() {
      return W;
   }

   public final void l(@Nullable dx <set-?>) {
      W = var1;
   }

   @Nullable
   public final dx c() {
      return x;
   }

   public final void H(@Nullable dx <set-?>) {
      x = var1;
   }

   @Nullable
   public final di i() {
      return O;
   }

   public final void g(@Nullable di <set-?>) {
      O = var1;
   }

   @NotNull
   public final aa B() {
      return X;
   }

   public final void l(long a, @NotNull aa <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(24964, 564231654077422365L ^ var1));
      X = var3;
   }

   public void y(long var1) {
      long var3 = var1 ^ 68179430488558L;
      long var10001 = var1 ^ 111871873618311L;
      int var5 = (int)((var1 ^ 111871873618311L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      N.clear();
      Iterable var8 = (Iterable)vb.p.E(var5, (short)var6, (short)var7);
      boolean var9 = false;
      Iterator var10 = var8.iterator();

      while(var10.hasNext()) {
         Object var11 = var10.next();
         v1 var12 = (v1)var11;
         boolean var13 = false;
         s7 var10000 = m;
         N.add(new di(var3, var12));
         if (var1 >= 0L && var1 >= 0L) {
            continue;
         }
      }

   }

   public void X(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   private final void L(long var1, String var3) {
      var1 ^= a;
      long var4 = var1 ^ 125853814458039L;
      long var6 = var1 ^ 32647354742222L;
      long var8 = var1 ^ 116503808355643L;
      vb.p.Z(var8, new v1(var3, "", 0, "", "", false, var4, 0, true.m<invokedynamic>(5847, 1618443991698069656L ^ var1), (DefaultConstructorMarker)null));
      this.y(var6);
      this.K((xp)null);
   }

   public void T(float mX, float mY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   public void D(double mouseX, long a, double mouseY, double amount) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit M(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit x(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit A(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit b(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit l(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit d() {
      long var0 = a ^ 20663606133560L;
      long var2 = var0 ^ 15829756977005L;
      vb var10000 = vb.p;
      s7 var10001 = m;
      di var7 = O;
      Intrinsics.checkNotNull(var7);
      var10000.d(var7.E(), var2);
      s7 var6 = m;
      Collection var4 = (Collection)N;
      var6 = m;
      di var5 = O;
      TypeIntrinsics.asMutableCollection(var4).remove(var5);
      var6 = m;
      O = null;
      return Unit.INSTANCE;
   }

   private static final Unit a(String var0) {
      long var1 = a ^ 32867287896902L;
      long var3 = var1 ^ 35082562082714L;
      Intrinsics.checkNotNullParameter(var0, true.o<invokedynamic>(10386, 8195486774163971427L ^ var1));
      m.L(var3, var0);
      return Unit.INSTANCE;
   }

   static {
      long var31 = a ^ 76488473489917L;
      long var33 = var31 ^ 94234164967507L;
      long var35 = var31 ^ 18066754687643L;
      long var37 = var31 ^ 56416064640036L;
      long var10001 = var31 ^ 15896819215806L;
      int var39 = (int)((var31 ^ 15896819215806L) >>> 32);
      int var40 = (int)(var10001 << 32 >>> 48);
      int var41 = (int)(var10001 << 48 >>> 48);
      var10001 = var31 ^ 29877815698919L;
      int var42 = (int)((var31 ^ 29877815698919L) >>> 48);
      int var43 = (int)(var10001 << 16 >>> 48);
      int var44 = (int)(var10001 << 32 >>> 32);
      b = new HashMap(13);
      null.A<invokedynamic>((Object)null, 5233805585331878165L, var31);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[18];
      int var27 = 0;
      String var26 = "ü\u0004%Ç:\u0098t\u0091}£\u0001æBãº×\u0010°\u008fX~uÏ\u009a¡>]¦ÉÌï\r\u009c\u0010¬w4ÁØL\u001e\u0001:uÇí/gHï\u0010óà\u0089çús\u0083ç\u001eËÖ\u001cöT\u0005O\u0010»N=\u008a(ôÝ\u0016J`\u0001ÏrÀÿ9\u0010p{?z\u009e1M\u0017{Ä\u00adL¯ ý¹\u0018Y,á\u0090\u0007±ÄPO%pÔ*»³\u007f3\u0011.¥\u0095NX¢\u0010jÅ\u008d\u001fsi\u008b¦W{¬Áß#Iî\u0010îï\u000e\u009d+·\u00adòkS\u001c¨\u0007&\u000eì\u0018ËÉ\u008di³¿BtKy´J>O¶Úk=æãþ»3ï\u0098\u0087_w\ffj&ð\u009fES\u0081ü½&8¡Äè\u001fè\u0084Ô4Cå_H{À0\u0099\u0011)JY\u0087¢ýÙJ\u00832¶7E§W0®fIâÙr\u001b ºå¿Ì°gX£\u008c`\u000e\"+\u001a\u0015Áë\u008b\u0081:\u0093÷\u009e÷\\¤H¯\u0000~ü×!µ.ìl²\u0096\u008b\u0000§èSiºGOú\u001bª\u0005Àì\fÏ³Ír¾\u0015\u0014kx#õka\u0098×8MÖ<8k??/\u009fi\b4E\u0006uo0Â\u0017\u000eß\u009d\u000b°\u0010;þuA¯\u0016\u0013ê\u0083\u0010¹=È>«å\u0010\u0091qê=²cfÚQ¸\u0005?\u001b\u0005°\\\u0010u¢\u0012÷\fZDN\u001a¤\u000eL\u0094\u0007E\u0001 \u009a²\u0018\u0085\u008c\u0090\u0005\u0090\u0005u4\u0003²:$÷\u0095Gz\u0083¢ÌÑbø:Í%%Ù\u0011\u00ad\u0010\u0012hèþC \u0093\u009b\u007f÷\u0084g\nñ\u0017 ";
      int var28 = "ü\u0004%Ç:\u0098t\u0091}£\u0001æBãº×\u0010°\u008fX~uÏ\u009a¡>]¦ÉÌï\r\u009c\u0010¬w4ÁØL\u001e\u0001:uÇí/gHï\u0010óà\u0089çús\u0083ç\u001eËÖ\u001cöT\u0005O\u0010»N=\u008a(ôÝ\u0016J`\u0001ÏrÀÿ9\u0010p{?z\u009e1M\u0017{Ä\u00adL¯ ý¹\u0018Y,á\u0090\u0007±ÄPO%pÔ*»³\u007f3\u0011.¥\u0095NX¢\u0010jÅ\u008d\u001fsi\u008b¦W{¬Áß#Iî\u0010îï\u000e\u009d+·\u00adòkS\u001c¨\u0007&\u000eì\u0018ËÉ\u008di³¿BtKy´J>O¶Úk=æãþ»3ï\u0098\u0087_w\ffj&ð\u009fES\u0081ü½&8¡Äè\u001fè\u0084Ô4Cå_H{À0\u0099\u0011)JY\u0087¢ýÙJ\u00832¶7E§W0®fIâÙr\u001b ºå¿Ì°gX£\u008c`\u000e\"+\u001a\u0015Áë\u008b\u0081:\u0093÷\u009e÷\\¤H¯\u0000~ü×!µ.ìl²\u0096\u008b\u0000§èSiºGOú\u001bª\u0005Àì\fÏ³Ír¾\u0015\u0014kx#õka\u0098×8MÖ<8k??/\u009fi\b4E\u0006uo0Â\u0017\u000eß\u009d\u000b°\u0010;þuA¯\u0016\u0013ê\u0083\u0010¹=È>«å\u0010\u0091qê=²cfÚQ¸\u0005?\u001b\u0005°\\\u0010u¢\u0012÷\fZDN\u001a¤\u000eL\u0094\u0007E\u0001 \u009a²\u0018\u0085\u008c\u0090\u0005\u0090\u0005u4\u0003²:$÷\u0095Gz\u0083¢ÌÑbø:Í%%Ù\u0011\u00ad\u0010\u0012hèþC \u0093\u009b\u007f÷\u0084g\nñ\u0017 ".length();
      char var25 = 16;
      int var24 = -1;

      label74:
      while(true) {
         ++var24;
         String var45 = var26.substring(var24, var24 + var25);
         byte var48 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var45.getBytes("ISO-8859-1"));
            String var51 = b(var30).intern();
            switch(var48) {
            case 0:
               var29[var27++] = var51;
               if ((var24 += var25) >= var28) {
                  d = var29;
                  h = new String[18];
                  s = new HashMap(13);
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
                  String var15 = "\u0094Ë$¸ò4Ã±÷S1[\u0016ê\u0099³4CÛ¥%xªC\"påô\u0019\u0010nÀèzÿ+ÖH\u000f\"dD²5vå®Å";
                  int var16 = "\u0094Ë$¸ò4Ã±÷S1[\u0016ê\u0099³4CÛ¥%xªC\"påô\u0019\u0010nÀèzÿ+ÖH\u000f\"dD²5vå®Å".length();
                  int var13 = 0;

                  label56:
                  while(true) {
                     int var52 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var52, var13).getBytes("ISO-8859-1");
                     long[] var47 = var17;
                     var52 = var14++;
                     long var54 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var55 = -1;

                     while(true) {
                        long var19 = var54;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var57 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var55) {
                        case 0:
                           var47[var52] = var57;
                           if (var13 >= var16) {
                              i = var17;
                              j = new Integer[8];
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
                              String var5 = "\u0017ÍÝU^~¾\u009aE%Û\u0098T@¥\u001e\u0017ÍÝU^~¾\u009a";
                              int var6 = "\u0017ÍÝU^~¾\u009aE%Û\u0098T@¥\u001e\u0017ÍÝU^~¾\u009a".length();
                              int var3 = 0;

                              do {
                                 var52 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var52, var3).getBytes("ISO-8859-1");
                                 var52 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var57 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var58 = true;
                                 var0[var52] = var57;
                              } while(var3 < var6);

                              m = new s7(var37);
                              N = (List)(new ArrayList());
                              X = new aa(sa.OUT_QUINT, var0[0], (short)var42, (short)var43, var44);
                              E = new aa(sa.OUT_QUINT, var0[2], (short)var42, (short)var43, var44);
                              H = new aa(sa.OUT_QUINT, var0[1], (short)var42, (short)var43, var44);
                              g = new dj(var39, (char)var40, true.o<invokedynamic>(4909, 8982758896120136802L ^ var31), m.K(), (pl)null, (char)var41, s7::M, 4, (DefaultConstructorMarker)null);
                              w = new dj(var39, (char)var40, true.o<invokedynamic>(4260, 6825006970798704621L ^ var31), m.K(), (pl)null, (char)var41, s7::x, 4, (DefaultConstructorMarker)null);
                              U = new dj(var39, (char)var40, true.o<invokedynamic>(31444, 5368315530436275602L ^ var31), m.K(), (pl)null, (char)var41, s7::A, 4, (DefaultConstructorMarker)null);
                              q = new dj(var39, (char)var40, true.o<invokedynamic>(16177, 6992499271625320554L ^ var31), m.K(), (pl)null, (char)var41, s7::b, 4, (DefaultConstructorMarker)null);
                              t = new dj(var39, (char)var40, true.o<invokedynamic>(22118, 4973570070182740270L ^ var31), m.K(), (pl)null, (char)var41, s7::l, 4, (DefaultConstructorMarker)null);
                              vb.p.l(var35);
                              m.y(var33);
                              m.u(530.0F);
                              return;
                           }
                           break;
                        default:
                           var47[var52] = var57;
                           if (var13 < var16) {
                              continue label56;
                           }

                           var15 = ",m§¶\u000fC§:*lÒ»½#\u0090\t";
                           var16 = ",m§¶\u000fC§:*lÒ»½#\u0090\t".length();
                           var13 = 0;
                        }

                        var52 = var13;
                        var13 += 8;
                        var18 = var15.substring(var52, var13).getBytes("ISO-8859-1");
                        var47 = var17;
                        var52 = var14++;
                        var54 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var55 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var51;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label74;
               }

               var26 = "\u008f$¼\u0004ûm\u0004µiÉ'úFñ\u0003Ù\u0010ä\u0019«x\u0092\u0095'c©°Uu\t\u0014Øl";
               var28 = "\u008f$¼\u0004ûm\u0004µiÉ'úFñ\u0003Ù\u0010ä\u0019«x\u0092\u0095'c©°Uu\t\u0014Øl".length();
               var25 = 16;
               var24 = -1;
            }

            ++var24;
            var45 = var26.substring(var24, var24 + var25);
            var48 = 0;
         }
      }
   }

   public static void f(String[] var0) {
      K = var0;
   }

   public static String[] k() {
      return K;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24075;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])b.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               b.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/s7", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/s7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19091;
      if (j[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/s7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/s7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
