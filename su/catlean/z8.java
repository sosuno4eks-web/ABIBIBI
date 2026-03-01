package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class z8 {
   @NotNull
   public static final z8 I;
   @NotNull
   private static mm J;
   @NotNull
   private static final aa m;
   @NotNull
   private static Color Z;
   @NotNull
   private static Color D;
   @NotNull
   private static Color F;
   @NotNull
   private static Color t;
   @NotNull
   private static Color G;
   @NotNull
   private static Color x;
   @NotNull
   private static Color l;
   @NotNull
   private static Color O;
   @NotNull
   private static Color h;
   @NotNull
   private static Color Q;
   @NotNull
   private static Color N;
   @NotNull
   private static Color c;
   @NotNull
   private static Color M;
   private static String[] L;
   private static final long a = j0.a(3224107359917683971L, 3514305136328709690L, MethodHandles.lookup().lookupClass()).a(228521796207166L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private z8() {
   }

   @NotNull
   public final Color i() {
      return Z;
   }

   public final void o(@NotNull Color <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051205692194684053L ^ var2));
      Z = var1;
   }

   @NotNull
   public final Color O() {
      return D;
   }

   public final void T(@NotNull Color <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051290777393534548L ^ var2));
      D = var1;
   }

   @NotNull
   public final Color T() {
      return F;
   }

   public final void r(short a, @NotNull Color <set-?>, int a, short a) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.j<invokedynamic>(2368, 1126321763098958119L ^ var5));
      F = var2;
   }

   @NotNull
   public final Color F() {
      return t;
   }

   public final void f(@NotNull Color <set-?>, int a, byte a, int a) {
      long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051204709248409522L ^ var5));
      t = var1;
   }

   @NotNull
   public final Color r() {
      return G;
   }

   public final void Q(@NotNull Color <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051290992334927831L ^ var2));
      G = var1;
   }

   @NotNull
   public final Color E() {
      return x;
   }

   public final void J(@NotNull Color <set-?>, short a, int a, char a) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051180667630311053L ^ var5));
      x = var1;
   }

   @NotNull
   public final Color M() {
      return l;
   }

   public final void W(short a, int a, short a, @NotNull Color <set-?>) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(22827, 1051227937550408784L ^ var5));
      l = var4;
   }

   @NotNull
   public final Color N() {
      return O;
   }

   public final void g(long a, @NotNull Color <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(22827, 1051205995466719792L ^ var1));
      O = var3;
   }

   @NotNull
   public final Color h() {
      return h;
   }

   public final void O(long a, @NotNull Color <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(22827, 1051238409247436686L ^ var1));
      h = var3;
   }

   @NotNull
   public final Color a() {
      return Q;
   }

   public final void R(@NotNull Color <set-?>, int a, long a) {
      long var5 = ((long)var2 << 32 | var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051219107563777021L ^ var5));
      Q = var1;
   }

   @NotNull
   public final Color U() {
      return N;
   }

   public final void B(@NotNull Color <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22827, 1051241879489932211L ^ var2));
      N = var1;
   }

   @NotNull
   public final Color V() {
      return c;
   }

   public final void u(short a, short a, int a, @NotNull Color <set-?>) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(22827, 1051170013789429853L ^ var5));
      c = var4;
   }

   @NotNull
   public final Color p() {
      return M;
   }

   public final void i(long a, @NotNull Color <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(22827, 1051307009978067350L ^ var1));
      M = var3;
   }

   public final void d(@NotNull mm newTheme, long a) {
      var2 ^= a;
      long var4 = var2 ^ 6762162369700L;
      long var6 = var2 ^ 1719261305280L;
      long var8 = var2 ^ 109503430840044L;
      long var10 = var2 ^ 108297361536397L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(13384, 8682391700037586622L ^ var2));
      J = c0.S.v().E(var10);
      c0.S.v().v(var4, var1);
      c0.S.O().A(var6).n(var1.F(), var8);
      m.T(0.0F);
   }

   public final void x(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 113921510848239L;
      long var5 = var1 ^ 46644507335766L;
      long var7 = var1 ^ 47509450104609L;
      3488884764828362076L.A<invokedynamic>(3488884764828362076L, var1);
      m.j(1.0F, var3);
      mm var10 = c0.S.v().E(var7);
      float var11 = m.a();
      D = gk.E.c(var5, J.a(), var10.a(), var11);
      F = gk.E.c(var5, J.h(), var10.h(), var11);
      t = gk.E.c(var5, J.b(), var10.b(), var11);

      try {
         G = gk.E.c(var5, J.x(), var10.x(), var11);
         x = gk.E.c(var5, J.J(), var10.J(), var11);
         l = gk.E.c(var5, J.G(), var10.G(), var11);
         O = gk.E.c(var5, J.c(), var10.c(), var11);
         h = gk.E.c(var5, J.v(), var10.v(), var11);
         Q = gk.E.c(var5, J.Z(), var10.Z(), var11);
         N = gk.E.c(var5, J.R(), var10.R(), var11);
         c = gk.E.c(var5, J.H(), var10.H(), var11);
         M = gk.E.c(var5, J.g(), var10.g(), var11);
         if (3516731215078110631L.A<invokedynamic>(3516731215078110631L, var1) == null) {
            (new int[5]).A<invokedynamic>(new int[5], 3529805600101900491L, var1);
         }

      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, 3481401470986936443L, var1);
      }
   }

   @NotNull
   public final Color Z(long a, int offset) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final Map F(int a, @NotNull mm theme, char a, char a) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.j<invokedynamic>(25048, 4277468669589281381L ^ var5));
      mm var8 = var2;
      boolean var9 = false;
      Pair[] var10 = new Pair[true.n<invokedynamic>(3680, 4631830859311369482L ^ var5)];
      var10[0] = TuplesKt.to(true.j<invokedynamic>(25694, 4514910661736685550L ^ var5), var2.a());
      var10[1] = TuplesKt.to(true.j<invokedynamic>(11775, 6662395394068944457L ^ var5), var2.h());
      var10[2] = TuplesKt.to(true.j<invokedynamic>(14701, 6279812448999801554L ^ var5), var2.b());
      int[] var10000 = 6593869033008893621L.A<invokedynamic>(6593869033008893621L, var5);
      var10[3] = TuplesKt.to(true.j<invokedynamic>(21366, 3597367894625609927L ^ var5), var2.x());
      var10[4] = TuplesKt.to(true.j<invokedynamic>(20471, 5907813451712001103L ^ var5), var2.J());
      var10[5] = TuplesKt.to(true.j<invokedynamic>(25504, 5574808455607539737L ^ var5), var2.G());
      var10[true.n<invokedynamic>(14756, 418898082765077187L ^ var5)] = TuplesKt.to(true.j<invokedynamic>(4785, 348488860630624518L ^ var5), var2.c());
      int[] var7 = var10000;

      try {
         var10[true.n<invokedynamic>(24825, 2954517734854697882L ^ var5)] = TuplesKt.to(true.j<invokedynamic>(11099, 1127149099313631470L ^ var5), var8.v());
         var10[true.n<invokedynamic>(13459, 7860265655057348594L ^ var5)] = TuplesKt.to(true.j<invokedynamic>(4504, 4838458104882178617L ^ var5), var8.Z());
         var10[true.n<invokedynamic>(17320, 8389331700338393290L ^ var5)] = TuplesKt.to(true.j<invokedynamic>(23040, 6159892379541266875L ^ var5), var8.R());
         var10[true.n<invokedynamic>(18769, 288246679628909114L ^ var5)] = TuplesKt.to(true.j<invokedynamic>(26953, 5955242656956470013L ^ var5), var8.H());
         var10[true.n<invokedynamic>(4013, 6955700680548109513L ^ var5)] = TuplesKt.to(true.j<invokedynamic>(604, 3795188279087217122L ^ var5), var8.g());
         Map var12 = MapsKt.mapOf(var10);
         if (var7 != null) {
            (new int[3]).A<invokedynamic>(new int[3], 6620187896609151076L, var5);
         }

         return var12;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 6609400751923825554L, var5);
      }
   }

   static {
      long var27 = a ^ 23717907920909L;
      long var10001 = var27 ^ 49433566103191L;
      int var29 = (int)((var27 ^ 49433566103191L) >>> 48);
      int var30 = (int)(var10001 << 16 >>> 48);
      int var31 = (int)(var10001 << 32 >>> 32);
      long var32 = var27 ^ 103905133544458L;
      String[] var10000 = new String[2];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -1460413146221542009L, var27);
      Cipher var18;
      Cipher var34 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var34.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[17];
      int var23 = 0;
      String var22 = "[ãPLÍä¸ñv_wèO\u000eT¹\u009aVpËLE0Î\u0010Ç\bb×Ä§\u0010\u0084\u0084¹èu;©QW ×ä§SAºëBö\u008b\u001eDþGFÕ\u0098Ö\u009b®î@ÿ/þ\u0082\u0013\u000fÀ\u001e#\b\u0010=Ý¨ã\u001eoðGrKú´\u0098hè¬\u0010\u0014ÁÖÏmH»\u0083\u0087ª\u0092\u00ad\u0085\u000fôM\u0018ï\u0007UÑæÉÜÝñ\u008a?È`FÓ´Èw*\u0086¦º^¹\u0018Ã~!\u0087»È\u00166b\u0014#7ÓÄz|T\u0099(\u001c0\u000f\u009fÞ ú¬\u0016)w\u00907«úÁ\u009b\n\u001f\u0005Bbi¯Åïd\u0082\u001de=¯¥¨%óí\u0093\u0010/AI\u001bêåL\u0081_\u0092\u0016ìáXJ8\u0010\\\u008eWÞ6wÍ¸ÈaA)¾±\u001a¬\u0010ëK²>£R¨\u0092\u0006Ý\u0004Ç×¶\u0098Ù\u0010Óïç´\u000eÒ\u0001\u0096Ò)åH9É|\u001b\u0010¼\u0086âÖ7\u008dÆ¨\u00ad\u009bÊ,ûE\t\u009e\u00103« ¥²ª\u008cè}À7\u0015ìZÊâ\u0010z7Yêcyð3X\u0015¥äî¹ò\u009f";
      int var24 = "[ãPLÍä¸ñv_wèO\u000eT¹\u009aVpËLE0Î\u0010Ç\bb×Ä§\u0010\u0084\u0084¹èu;©QW ×ä§SAºëBö\u008b\u001eDþGFÕ\u0098Ö\u009b®î@ÿ/þ\u0082\u0013\u000fÀ\u001e#\b\u0010=Ý¨ã\u001eoðGrKú´\u0098hè¬\u0010\u0014ÁÖÏmH»\u0083\u0087ª\u0092\u00ad\u0085\u000fôM\u0018ï\u0007UÑæÉÜÝñ\u008a?È`FÓ´Èw*\u0086¦º^¹\u0018Ã~!\u0087»È\u00166b\u0014#7ÓÄz|T\u0099(\u001c0\u000f\u009fÞ ú¬\u0016)w\u00907«úÁ\u009b\n\u001f\u0005Bbi¯Åïd\u0082\u001de=¯¥¨%óí\u0093\u0010/AI\u001bêåL\u0081_\u0092\u0016ìáXJ8\u0010\\\u008eWÞ6wÍ¸ÈaA)¾±\u001a¬\u0010ëK²>£R¨\u0092\u0006Ý\u0004Ç×¶\u0098Ù\u0010Óïç´\u000eÒ\u0001\u0096Ò)åH9É|\u001b\u0010¼\u0086âÖ7\u008dÆ¨\u00ad\u009bÊ,ûE\t\u009e\u00103« ¥²ª\u008cè}À7\u0015ìZÊâ\u0010z7Yêcyð3X\u0015¥äî¹ò\u009f".length();
      char var21 = 24;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var35 = var22.substring(var20, var20 + var21);
         byte var37 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var35.getBytes("ISO-8859-1"));
            String var43 = a(var26).intern();
            switch(var37) {
            case 0:
               var25[var23++] = var43;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  d = new String[17];
                  i = new HashMap(13);
                  Cipher var7;
                  var34 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var34.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[10];
                  int var10 = 0;
                  String var11 = "ºÁêl~å4²¯íÃuÁekz$1ci\u0006}ÿ!<¸#wø¦\u001f\u001clÞ \u001d\u001añ\u001b\\²£\u0082m\u0085ù;»èð>½«SÇ+6LÃr\u0005Ôñ\u0084";
                  int var12 = "ºÁêl~å4²¯íÃuÁekz$1ci\u0006}ÿ!<¸#wø¦\u001f\u001clÞ \u001d\u001añ\u001b\\²£\u0082m\u0085ù;»èð>½«SÇ+6LÃr\u0005Ôñ\u0084".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var41 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var41, var9).getBytes("ISO-8859-1");
                     long[] var39 = var13;
                     var41 = var10++;
                     long var46 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var47 = -1;

                     while(true) {
                        long var15 = var46;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var49 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var47) {
                        case 0:
                           var39[var41] = var49;
                           if (var9 >= var12) {
                              f = var13;
                              g = new Integer[10];
                              Cipher var2;
                              var34 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var34.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = 6506285909888197742L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var46 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var45 = true;
                              long var0 = var46;
                              I = new z8();
                              J = it.p();
                              m = new aa(sa.OUT_EXPO, var0, (short)var29, (short)var30, var31);
                              Color var42 = Color.WHITE;
                              Intrinsics.checkNotNullExpressionValue(var42, true.j<invokedynamic>(28263, 2658309416754668825L ^ var27));
                              Z = var42;
                              D = c0.S.v().E(var32).a();
                              F = c0.S.v().E(var32).h();
                              t = c0.S.v().E(var32).b();
                              G = c0.S.v().E(var32).x();
                              x = c0.S.v().E(var32).J();
                              l = c0.S.v().E(var32).G();
                              O = c0.S.v().E(var32).c();
                              h = c0.S.v().E(var32).v();
                              Q = c0.S.v().E(var32).Z();
                              N = c0.S.v().E(var32).R();
                              c = c0.S.v().E(var32).H();
                              M = c0.S.v().E(var32).g();
                              return;
                           }
                           break;
                        default:
                           var39[var41] = var49;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "\u008c=eî^OÄðª$C&\u0091Õ\u0089\u0087";
                           var12 = "\u008c=eî^OÄðª$C&\u0091Õ\u0089\u0087".length();
                           var9 = 0;
                        }

                        var41 = var9;
                        var9 += 8;
                        var14 = var11.substring(var41, var9).getBytes("ISO-8859-1");
                        var39 = var13;
                        var41 = var10++;
                        var46 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var47 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var43;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "Æô\u007f]\u008aÕÂ9IåÄ \u0007hD~áåLQ\u0085¯\u0085Ú\u000eO;'¸Í\u0002 Í\u0085@×\u00165\u008f£ \u0014Ê¬ùð]Å\u0012\"\u009b\u0095\u001c0¢í;\u008b&\u0090|\u001e\u0097\b\u009f\u008eª³9'i\u008bJ";
               var24 = "Æô\u007f]\u008aÕÂ9IåÄ \u0007hD~áåLQ\u0085¯\u0085Ú\u000eO;'¸Í\u0002 Í\u0085@×\u00165\u008f£ \u0014Ê¬ùð]Å\u0012\"\u009b\u0095\u001c0¢í;\u008b&\u0090|\u001e\u0097\b\u009f\u008eª³9'i\u008bJ".length();
               var21 = '(';
               var20 = -1;
            }

            ++var20;
            var35 = var22.substring(var20, var20 + var21);
            var37 = 0;
         }
      }
   }

   public static void R(String[] var0) {
      L = var0;
   }

   public static String[] D() {
      return L;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24898;
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
            throw new RuntimeException("su/catlean/z8", var10);
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
         throw new RuntimeException("su/catlean/z8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6544;
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
            throw new RuntimeException("su/catlean/z8", var14);
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
         throw new RuntimeException("su/catlean/z8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
