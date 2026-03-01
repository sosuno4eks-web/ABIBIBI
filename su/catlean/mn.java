package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mn implements class_11281 {
   private final float O;
   @NotNull
   private final Color A;
   @NotNull
   private final Color z;
   private final int p;
   private final int a;
   private final float h;
   private final float j;
   private final int S;
   private final float Y;
   @NotNull
   private final class_241 D;
   private final float Q;
   private final float P;
   private static final long b = j0.a(5928574019715964904L, 7165379611826142805L, MethodHandles.lookup().lookupClass()).a(229005446144146L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   public mn(float time, long a, @NotNull Color color, @NotNull Color color2, int colorMode, int glowQuality, float glowRadius, float glowAlphaMult, int glowThinOutline, float fillAlphaMult, @NotNull class_241 uHalfTexelSize, float uSaturation, float uBrightness) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var4, true.t<invokedynamic>(21398, 235633644638242937L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.t<invokedynamic>(25188, 3241313917571119496L ^ var2));
      Intrinsics.checkNotNullParameter(var12, true.t<invokedynamic>(21736, 53841965506236166L ^ var2));
      super();
      this.O = var1;
      this.A = var4;
      this.z = var5;
      this.p = var6;
      this.a = var7;
      this.h = var8;
      this.j = var9;
      this.S = var10;
      this.Y = var11;
      this.D = var12;
      this.Q = var13;
      this.P = var14;
   }

   public final float Y() {
      return this.O;
   }

   @NotNull
   public final Color w() {
      return this.A;
   }

   @NotNull
   public final Color t() {
      return this.z;
   }

   public final int m() {
      return this.p;
   }

   public final int s() {
      return this.a;
   }

   public final float N() {
      return this.h;
   }

   public final float p() {
      return this.j;
   }

   public final int k() {
      return this.S;
   }

   public final float c() {
      return this.Y;
   }

   @NotNull
   public final class_241 f() {
      return this.D;
   }

   public final float v() {
      return this.Q;
   }

   public final float P() {
      return this.P;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = b ^ 94864887949626L;
      long var4 = var2 ^ 131099467241195L;
      long var6 = var2 ^ 4440768948843L;
      long var8 = var2 ^ 16178962783296L;
      long var10 = var2 ^ 4426538010361L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(6385, 5019673058205073611L ^ var2));
      Std140Builder.intoBuffer(var1).putFloat(this.O).putVec4(gk.E.H(this.A, var8), gk.E.L(var10, this.A), gk.E.M(var4, this.A), gk.E.D(var6, this.A)).putVec4(gk.E.H(this.z, var8), gk.E.L(var10, this.z), gk.E.M(var4, this.z), gk.E.D(var6, this.z)).putInt(this.p).putInt(this.a).putFloat(this.h).putFloat(this.j).putInt(this.S).putFloat(this.Y).putVec2(this.D.field_1343, this.D.field_1342).putFloat(this.Q).putFloat(this.P);
   }

   public final float X() {
      return this.O;
   }

   @NotNull
   public final Color R() {
      return this.A;
   }

   @NotNull
   public final Color q() {
      return this.z;
   }

   public final int z() {
      return this.p;
   }

   public final int o() {
      return this.a;
   }

   public final float e() {
      return this.h;
   }

   public final float y() {
      return this.j;
   }

   public final int h() {
      return this.S;
   }

   public final float r() {
      return this.Y;
   }

   @NotNull
   public final class_241 O() {
      return this.D;
   }

   public final float E() {
      return this.Q;
   }

   public final float T() {
      return this.P;
   }

   @NotNull
   public final mn J(float time, int a, @NotNull Color color, short a, @NotNull Color color2, int colorMode, int glowQuality, float glowRadius, float glowAlphaMult, int glowThinOutline, float fillAlphaMult, @NotNull class_241 uHalfTexelSize, float uSaturation, float uBrightness, int a) {
      long var16 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var15 << 48 >>> 48) ^ b;
      long var18 = var16 ^ 54412730203336L;
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(28178, 7828853017294982233L ^ var16));
      Intrinsics.checkNotNullParameter(var5, true.t<invokedynamic>(28891, 1585535542978663069L ^ var16));
      Intrinsics.checkNotNullParameter(var12, true.t<invokedynamic>(27844, 310514717870870147L ^ var16));
      return new mn(var1, var18, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   public static mn y(mn param0, float param1, Color param2, Color param3, int param4, int param5, float param6, float param7, int param8, float param9, class_241 param10, long param11, float param13, int param14, float param15, int param16, Object param17) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 139593046366662L;
      float var3 = this.P;
      float var4 = this.Q;
      class_241 var5 = this.D;
      float var6 = this.Y;
      int var7 = this.S;
      float var8 = this.j;
      float var9 = this.h;
      int var10 = this.a;
      int var11 = this.p;
      Color var12 = this.z;
      Color var13 = this.A;
      float var14 = this.O;
      String var10000 = 14132.t<invokedynamic>(14132, 2380081033121406960L ^ var1);
      return var10000 + var14 + true.t<invokedynamic>(760, 2988189303811844671L ^ var1) + var13 + true.t<invokedynamic>(4579, 8685152476733290784L ^ var1) + var12 + true.t<invokedynamic>(17952, 8393310141910511353L ^ var1) + var11 + true.t<invokedynamic>(26798, 3052005718106587243L ^ var1) + var10 + true.t<invokedynamic>(18384, 8602996054416944907L ^ var1) + var9 + true.t<invokedynamic>(28232, 405402733501662854L ^ var1) + var8 + true.t<invokedynamic>(20530, 1655645638282082558L ^ var1) + var7 + true.t<invokedynamic>(19601, 2553133390208590938L ^ var1) + var6 + true.t<invokedynamic>(13062, 7611948239056870340L ^ var1) + var5 + true.t<invokedynamic>(26630, 8422956854188359881L ^ var1) + var4 + true.t<invokedynamic>(25, 1823389452453259457L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 91828648030260L;
      int var4 = Float.hashCode(this.O);
      var4 = var4 * true.a<invokedynamic>(2022, 7000036947588206312L ^ var1) + this.A.hashCode();
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + this.z.hashCode();
      k9[] var10000 = 3802892518474275580L.A<invokedynamic>(3802892518474275580L, var1);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Integer.hashCode(this.p);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Integer.hashCode(this.a);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Float.hashCode(this.h);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Float.hashCode(this.j);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Integer.hashCode(this.S);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Float.hashCode(this.Y);
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + this.D.hashCode();
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Float.hashCode(this.Q);
      k9[] var3 = var10000;
      var4 = var4 * true.a<invokedynamic>(28343, 6860331337147033533L ^ var1) + Float.hashCode(this.P);

      try {
         if (var3 == null) {
            (new int[5]).A<invokedynamic>(new int[5], 3778707642585446347L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 3768696860311534614L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = b ^ 96979071943840L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[19];
      int var18 = 0;
      String var17 = "Ï3§9Ýze\u0007\u00ad\u000e\r¬X¹y\u0099\u0018àÏî\u009fl(\b\u000e,ý\u0087ì²\u0007D%òø\u0005-¾ªs±(yáG\u0082¹\u0088\u008f\"\u001b·\u009eîV\u0097{G\nbð\u0014\u0082\u008bÑÉ G~ä«&]¶@.RÞêIÃÏ\u0010&®@ÞuK\"Î±\u001e\u0015í¬kqÿ\u0010\u0002ï\u0080ÐDo¸î7\u000b³~(ë»Z(Û\"\u0099)lD¨@\b\u001eI=§f#æ\u0090+ø><HÛ«\u008eþ&I\u0001*ö_\u0007`W \u0083\\\u0082¢ ¸M\u001aÑq?\u0089tM]VÇàÊ\\dÏéA\u0097ñ|e\u0097\u008e]\u000e\f\u0095é\u0092Ú(²$\u007fÏÌoÿ\u0096õaµ\nÜ\u0007kÆ\u0010·\u000f\u0007]ÉÑ*¾ÛÞÏu\u001a±\u001f\u0084ú\u0006\u009famÇ\u0091 #\u001c¨9\u008bð\u0081bù\u0002é\u0087¶\u008d\u0014\u008fÃ\u0010P6±õ;¤L\u0003)vßg¬2\u0010-hre\u0096zÊ`;B_\"Ëô¯\u0087 \u0000P\u0090ûâyØY\u0016\u0081âþòãvK{WG\u001cPZ\u0007ñ¯\u008b?Ü\u008a²\\Ö(5Î8B\u001e'ëÜò¡cçóßz*ÎÊ&\u0003þEE\u0018§\u0082³Õ F\u0080\t¨¦\u0011(þw\t\u0099 Ú\u009b*Û\u001cMù\u001bgÌb\u009b®\u008fÏ°\u0018\u008c6\u001dâ/\u0087}\u0084WÉV\u0013½\"~(\u0001¤,º&é«»\u0018i»Ú\u0092ºÔ¸¸?×=-ìQ\u001a}\u0094¨Ù^xñ\u0097\u0081ä\u001bu¢G\u009c\u0089 \u00014õO9â-ìw¯\u0090§h\u0014\u0083Ë\u0011\u0012\u001d+\u001füÎëgí#\u0096\u001d¾ZØ\u0010\ró.²¯\u00048æ¶xË\u001b\u001a\u0004ó\u000f\u0018ú\u0010}î\u009aFC\u007fñ·\u000f}\u001fô\u001dðû`yÀ\u0012\u0093\u008f|";
      int var19 = "Ï3§9Ýze\u0007\u00ad\u000e\r¬X¹y\u0099\u0018àÏî\u009fl(\b\u000e,ý\u0087ì²\u0007D%òø\u0005-¾ªs±(yáG\u0082¹\u0088\u008f\"\u001b·\u009eîV\u0097{G\nbð\u0014\u0082\u008bÑÉ G~ä«&]¶@.RÞêIÃÏ\u0010&®@ÞuK\"Î±\u001e\u0015í¬kqÿ\u0010\u0002ï\u0080ÐDo¸î7\u000b³~(ë»Z(Û\"\u0099)lD¨@\b\u001eI=§f#æ\u0090+ø><HÛ«\u008eþ&I\u0001*ö_\u0007`W \u0083\\\u0082¢ ¸M\u001aÑq?\u0089tM]VÇàÊ\\dÏéA\u0097ñ|e\u0097\u008e]\u000e\f\u0095é\u0092Ú(²$\u007fÏÌoÿ\u0096õaµ\nÜ\u0007kÆ\u0010·\u000f\u0007]ÉÑ*¾ÛÞÏu\u001a±\u001f\u0084ú\u0006\u009famÇ\u0091 #\u001c¨9\u008bð\u0081bù\u0002é\u0087¶\u008d\u0014\u008fÃ\u0010P6±õ;¤L\u0003)vßg¬2\u0010-hre\u0096zÊ`;B_\"Ëô¯\u0087 \u0000P\u0090ûâyØY\u0016\u0081âþòãvK{WG\u001cPZ\u0007ñ¯\u008b?Ü\u008a²\\Ö(5Î8B\u001e'ëÜò¡cçóßz*ÎÊ&\u0003þEE\u0018§\u0082³Õ F\u0080\t¨¦\u0011(þw\t\u0099 Ú\u009b*Û\u001cMù\u001bgÌb\u009b®\u008fÏ°\u0018\u008c6\u001dâ/\u0087}\u0084WÉV\u0013½\"~(\u0001¤,º&é«»\u0018i»Ú\u0092ºÔ¸¸?×=-ìQ\u001a}\u0094¨Ù^xñ\u0097\u0081ä\u001bu¢G\u009c\u0089 \u00014õO9â-ìw¯\u0090§h\u0014\u0083Ë\u0011\u0012\u001d+\u001füÎëgí#\u0096\u001d¾ZØ\u0010\ró.²¯\u00048æ¶xË\u001b\u001a\u0004ó\u000f\u0018ú\u0010}î\u009aFC\u007fñ·\u000f}\u001fô\u001dðû`yÀ\u0012\u0093\u008f|".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  c = var20;
                  d = new String[19];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "\u0002\n¹\u0082ð\u0001Du§\u009bû\u0005\u0015)\u008dù\t\u0016\u008f\u0092RG.\u0003Åú´é¨¾Oê\u0093 ý\u0093Á3\nÝ±ªK9{\u0085$Mã\u008eRõ=LÒ\u0082Ãe¿±\"\u0000\u008bÙk\u008b<N+·\u0098o";
                  int var5 = "\u0002\n¹\u0082ð\u0001Du§\u009bû\u0005\u0015)\u008dù\t\u0016\u008f\u0092RG.\u0003Åú´é¨¾Oê\u0093 ý\u0093Á3\nÝ±ªK9{\u0085$Mã\u008eRõ=LÒ\u0082Ãe¿±\"\u0000\u008bÙk\u008b<N+·\u0098o".length();
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
                              g = new Integer[11];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Ó^\u0012wzË\u0089!<ù\u0019\u0018û¼½-";
                           var5 = "Ó^\u0012wzË\u0089!<ù\u0019\u0018û¼½-".length();
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

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "$b\u0016,\t«\u0017r\u00ad©\u001b\u0004Ý&\u0098.0Øp8ª\u0001\u0088C\u0010>\u001c_©µ\u0001Ä Ãk5¿X\u0012ª\u0083Xj¥\bî\u001a¨@\fÛÒ\u008b¿É\u009eù]\u0011(ð¼aQH";
               var19 = "$b\u0016,\t«\u0017r\u00ad©\u001b\u0004Ý&\u0098.0Øp8ª\u0001\u0088C\u0010>\u001c_©µ\u0001Ä Ãk5¿X\u0012ª\u0083Xj¥\bî\u001a¨@\fÛÒ\u008b¿É\u009eù]\u0011(ð¼aQH".length();
               var16 = ' ';
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13415;
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
            throw new RuntimeException("su/catlean/mn", var10);
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
         throw new RuntimeException("su/catlean/mn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31827;
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
            throw new RuntimeException("su/catlean/mn", var14);
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
         throw new RuntimeException("su/catlean/mn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
