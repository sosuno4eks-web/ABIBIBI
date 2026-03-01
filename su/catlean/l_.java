package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class l_ extends k9 {
   @NotNull
   public static final l_ u;
   static final KProperty[] y;
   @NotNull
   private static final zv K;
   @NotNull
   private static final zv I;
   @NotNull
   private static final zv B;
   @NotNull
   private static final z0 x;
   @NotNull
   private static final Color z;
   @NotNull
   private static final List Q;
   private static final long b = j0.a(7252825391816312395L, 5370665436286653880L, MethodHandles.lookup().lookupClass()).a(176494819145952L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private l_(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 95743028977758L;
      super(var3, true.w<invokedynamic>(3299, 663931097685582769L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final Color L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 113670234291846L;
      int var3 = (int)((var1 ^ 113670234291846L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)K.k((short)var3, this, y[0], (short)var4, var5);
   }

   private final Color s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 93608775352994L;
      int var3 = (int)((var1 ^ 93608775352994L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)I.k((short)var3, this, y[1], (short)var4, var5);
   }

   private final Color T(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 5903417639824L;
      int var3 = (int)((var1 ^ 5903417639824L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)B.k((short)var3, this, y[2], (short)var4, var5);
   }

   private final int W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 20516162021638L;
      int var3 = (int)((var1 ^ 20516162021638L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)x.k((short)var3, this, y[3], (short)var4, var5)).intValue();
   }

   public void n(long var1) {
      Q.clear();
   }

   public void a(long var1) {
      Q.clear();
   }

   @Flow
   private final void t(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void p(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 103874058124048L;
      long var5 = var1 ^ 22282260399593L;
      long var7 = var1 ^ 114314335384578L;
      long var10001 = var1 ^ 88232098936289L;
      int var9 = (int)((var1 ^ 88232098936289L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      class_243 var10000 = this.W(var7, (class_1297)s8.f(var3)).method_1019(s8.f(var3).method_18798().method_1021(10.0D));
      Intrinsics.checkNotNullExpressionValue(var10000, true.w<invokedynamic>(17795, 8451306953489393894L ^ var1));
      class_243 var12 = var10000;
      Q.add(new gs((float)(var12.field_1352 + (double)gw.Y(-48.0F, (short)var9, 48.0F, false, (char)var10, 4, var11, (Object)null)), (float)(var12.field_1351 + (double)4.0F + (double)gw.Y(-2.0F, (short)var9, 2.0F, false, (char)var10, 4, var11, (Object)null)), (float)(var12.field_1350 + (double)gw.Y(-48.0F, (short)var9, 48.0F, false, (char)var10, 4, var11, (Object)null)), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var5, 0, 0.0F, 0.0F, 0, 0, true.z<invokedynamic>(2920, 3152269535439244080L ^ var1), (DefaultConstructorMarker)null));
   }

   @Flow(
      priority = -10
   )
   private final void F(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void l(ib param1, Matrix4f param2, float param3, float param4, float param5, long param6, float param8, float param9, float param10) {
      // $FF: Couldn't be decompiled
   }

   private final class_243 s(float var1, float var2, float var3, float var4, float var5, float var6, double var7) {
      double var9 = Math.sin(var7);
      double var11 = Math.cos(var7);
      float var13 = var1 - var4;
      float var14 = var3 - var6;
      float var15 = var2 - var5;
      double var16 = (double)var13 * var11 + (double)var14 * var9;
      double var18 = (double)(-var13) * var9 + (double)var14 * var11;
      return new class_243((double)var4 + var16, (double)var5 + (double)var15, (double)var6 + var18);
   }

   static {
      long var20 = b ^ 35292543949085L;
      long var22 = var20 ^ 6341882730749L;
      long var24 = var20 ^ 105814185567502L;
      long var26 = var20 ^ 37200569819711L;
      long var28 = var20 ^ 23025883720473L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[22];
      int var16 = 0;
      String var15 = "W\u001f\u0015)á£\u0002â\u000b$#½\u009d[)#\u0010u\u000euþé¹í\u001dCCíë\u008e\f\u0092m\u0018&!lWÉ4ã&ã\u001cÐ\b¢x\u0007Æh®ª\u0081\u0001v#: îD>\u0096°u\u0006¢µ¼\u0097¾Å)\u0012Â¼\u009e\u0001¤wk}\u0002\r~\u00ad$\u0094°±\u000f@<\"+$\u009f\u00924Ç\u009e?7¢\u0083(ñ*ò© ®\u0012\u0094CU8ýRóÜÃëz)\u0019¹\u0088|\u0010T5Åô\r\u008cK\u001aá\u0086Ð¨«µ|¶JuOá\u0083'HÿhÃ(h¢$1öù\u0082\u0098N\u0004Ú\u009b. 5ÖÉu/J\r\u0091ÍËök\u0014øÀª¡\u007f²\u0000\u0092ÈIqÍÑ\u0010ÃT)5ýAÎq TC869VF \u009b\u0092ìÊrDK\u0010lÃrïlÇ\u00868ïs4¶z\u0080\b\u000bÙZ\u001bëÐO^Í\u0018e_Í2_ØNâ\u0087\u0080¨\u00850\u0010ó\nÀs²ñE^\r»\u0018 ;\bð\n´\u001eÐ$ó\u001f\u001c\u009f«ó®°xv¾©ô\u0097\u008b ì¨\u000f6®É`Á®\u0003~U\u001aa\u0088üñt\u0093ÖMOÝzqÎn*Þ\fB\u009f\u0010\u0017=>\u0015Wg\u0015Rº\u009b\u0010Å,`vJ /VÝÆ\u0085+\u0017òÓé\u0011Ì¡ïC?ý¢ò\u0003\u007fbIÝ`\u0012\fe\u0005]Yé8ËÕ\u007f{©Û\u0087\u0016\u001a7+(+gª£\u0012µ¤\u0084S9q<1\u0086h\u000b\u0089µçÌ$ùgºÎÒ\u0088÷oÊgÚ\u0091\u0086Ä\u001c\u0018qA>hõz,\u0018\u0094ð£\nH\u009cî³â\u008c%7³S\u0083\r¡»\u0086CtUE\u0098 u?>zVß\u0081%Ì\u008e\u0089\u000f«B~XêA\u000e\u001d+æ.\u0094ç'ò\u009cÒïçÂ dº\u001dm}!\t|õBÝ³\u000b\u009eqçHÙç\u0000ñA\u0016£²\u001döË½ä¾\u009d Z\u0097¦\u008d\u009b\u0004\u0084\u0094Å?×6Îÿ\u009eÖ;ú¿m\u008c:c\u0088\u001c]\u0013ú¬\u0094\u008e\u0092\u0010ZH~oÝ|;rz°)u|Ü\u0017\u009a\u0010;Í\u0080xúê ]d)\bM\u0086³³\u0090";
      int var17 = "W\u001f\u0015)á£\u0002â\u000b$#½\u009d[)#\u0010u\u000euþé¹í\u001dCCíë\u008e\f\u0092m\u0018&!lWÉ4ã&ã\u001cÐ\b¢x\u0007Æh®ª\u0081\u0001v#: îD>\u0096°u\u0006¢µ¼\u0097¾Å)\u0012Â¼\u009e\u0001¤wk}\u0002\r~\u00ad$\u0094°±\u000f@<\"+$\u009f\u00924Ç\u009e?7¢\u0083(ñ*ò© ®\u0012\u0094CU8ýRóÜÃëz)\u0019¹\u0088|\u0010T5Åô\r\u008cK\u001aá\u0086Ð¨«µ|¶JuOá\u0083'HÿhÃ(h¢$1öù\u0082\u0098N\u0004Ú\u009b. 5ÖÉu/J\r\u0091ÍËök\u0014øÀª¡\u007f²\u0000\u0092ÈIqÍÑ\u0010ÃT)5ýAÎq TC869VF \u009b\u0092ìÊrDK\u0010lÃrïlÇ\u00868ïs4¶z\u0080\b\u000bÙZ\u001bëÐO^Í\u0018e_Í2_ØNâ\u0087\u0080¨\u00850\u0010ó\nÀs²ñE^\r»\u0018 ;\bð\n´\u001eÐ$ó\u001f\u001c\u009f«ó®°xv¾©ô\u0097\u008b ì¨\u000f6®É`Á®\u0003~U\u001aa\u0088üñt\u0093ÖMOÝzqÎn*Þ\fB\u009f\u0010\u0017=>\u0015Wg\u0015Rº\u009b\u0010Å,`vJ /VÝÆ\u0085+\u0017òÓé\u0011Ì¡ïC?ý¢ò\u0003\u007fbIÝ`\u0012\fe\u0005]Yé8ËÕ\u007f{©Û\u0087\u0016\u001a7+(+gª£\u0012µ¤\u0084S9q<1\u0086h\u000b\u0089µçÌ$ùgºÎÒ\u0088÷oÊgÚ\u0091\u0086Ä\u001c\u0018qA>hõz,\u0018\u0094ð£\nH\u009cî³â\u008c%7³S\u0083\r¡»\u0086CtUE\u0098 u?>zVß\u0081%Ì\u008e\u0089\u000f«B~XêA\u000e\u001d+æ.\u0094ç'ò\u009cÒïçÂ dº\u001dm}!\t|õBÝ³\u000b\u009eqçHÙç\u0000ñA\u0016£²\u001döË½ä¾\u009d Z\u0097¦\u008d\u009b\u0004\u0084\u0094Å?×6Îÿ\u009eÖ;ú¿m\u008c:c\u0088\u001c]\u0013ú¬\u0094\u008e\u0092\u0010ZH~oÝ|;rz°)u|Ü\u0017\u009a\u0010;Í\u0080xúê ]d)\bM\u0086³³\u0090".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[22];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "\u0087m\bYs\u008du0%s\u001a¾\u0014yhQH\u0004½`\u008d*\u0004R¾VPÐO\u007fEY\u001bô3ù¨\u0096\r\u0018\u00adU\u008e\u0006\u001cØ2,5ã§\u0011\u0012ÄLé\u001cý®ÝU\u008c¥j«aªV\u0081ß®N\u008c\f\u0016\u007fGÜì\u0000h¬\u0090ö\u0019Zby\u0093øíª\u00adB=í";
                  int var5 = "\u0087m\bYs\u008du0%s\u001a¾\u0014yhQH\u0004½`\u008d*\u0004R¾VPÐO\u007fEY\u001bô3ù¨\u0096\r\u0018\u00adU\u008e\u0006\u001cØ2,5ã§\u0011\u0012ÄLé\u001cý®ÝU\u008c¥j«aªV\u0081ß®N\u008c\f\u0016\u007fGÜì\u0000h¬\u0090ö\u0019Zby\u0093øíª\u00adB=í".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var36 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var36 = var3++;
                     long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var41 = -1;

                     while(true) {
                        long var8 = var40;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var43 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var41) {
                        case 0:
                           var34[var36] = var43;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[14];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l_.class, true.w<invokedynamic>(6945, 7083522089428482525L ^ var20), true.w<invokedynamic>(12550, 7747135255288796135L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l_.class, true.w<invokedynamic>(12674, 4896032703492477820L ^ var20), true.w<invokedynamic>(9010, 2222903672573903307L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l_.class, true.w<invokedynamic>(30821, 3305000635054430851L ^ var20), true.w<invokedynamic>(20368, 6680633174991482232L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l_.class, true.w<invokedynamic>(26115, 6787977186598192366L ^ var20), true.w<invokedynamic>(31282, 5109701921221941458L ^ var20), 0)))};
                              y = var30;
                              u = new l_(var26);
                              il var35 = (il)u;
                              String var33 = 26590.w<invokedynamic>(26590, 8336531470672037168L ^ var20);
                              Color var44 = Color.YELLOW;
                              Intrinsics.checkNotNullExpressionValue(var44, true.w<invokedynamic>(19746, 4927603940391170013L ^ var20));
                              K = qi.F(var35, var33, var44, (pj)null, (Function0)null, true.z<invokedynamic>(4761, 3637454515691117899L ^ var20), var28, (Object)null);
                              var35 = (il)u;
                              var33 = 16330.w<invokedynamic>(16330, 2557158358204931360L ^ var20);
                              gk var46 = gk.E;
                              Color var45 = Color.YELLOW;
                              Intrinsics.checkNotNullExpressionValue(var45, true.w<invokedynamic>(1966, 5713420756350788950L ^ var20));
                              I = qi.F(var35, var33, var46.e(var24, var45, 0.2F), (pj)null, (Function0)null, true.z<invokedynamic>(17093, 471049961935867162L ^ var20), var28, (Object)null);
                              var35 = (il)u;
                              var33 = 31828.w<invokedynamic>(31828, 2530120463949012663L ^ var20);
                              var46 = gk.E;
                              var45 = Color.ORANGE;
                              Intrinsics.checkNotNullExpressionValue(var45, true.w<invokedynamic>(19264, 3536054796643412396L ^ var20));
                              B = qi.F(var35, var33, var46.e(var24, var45, 0.2F), (pj)null, (Function0)null, true.z<invokedynamic>(17093, 471049961935867162L ^ var20), var28, (Object)null);
                              x = qi.o((il)u, true.w<invokedynamic>(32126, 7978949872157597593L ^ var20), true.z<invokedynamic>(22118, 3525415407646579121L ^ var20), new IntRange(0, true.z<invokedynamic>(27460, 7389240056230290591L ^ var20)), var22, (pj)null, (Function0)null, true.z<invokedynamic>(28233, 268139570031796625L ^ var20), (Object)null);
                              z = new Color(true.z<invokedynamic>(6874, 7633951109591913732L ^ var20), true.z<invokedynamic>(26591, 2960689713044137999L ^ var20), true.z<invokedynamic>(26591, 2960689713044137999L ^ var20));
                              Q = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var34[var36] = var43;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ú(ð9gO)\u0016æU}VÝAÓ¬";
                           var5 = "ú(ð9gO)\u0016æU}VÝAÓ¬".length();
                           var2 = 0;
                        }

                        var36 = var2;
                        var2 += 8;
                        var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var36 = var3++;
                        var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var41 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "´Ý\u0019\u0099Þ¢Wå\u000b\u0096\u000fÍ«£6*0Bþ\u000b9æä\u001bÏ\u0004\u001d\u0001I\u000fß|\u008aê\u001aô'Ù\u000f\u0001\r\u0081¦¢=Os8\u0088ú\u0005âÉ!©$ÕPy@X³¦\u0082¿";
               var17 = "´Ý\u0019\u0099Þ¢Wå\u000b\u0096\u000fÍ«£6*0Bþ\u000b9æä\u001bÏ\u0004\u001d\u0001I\u000fß|\u008aê\u001aô'Ù\u000f\u0001\r\u0081¦¢=Os8\u0088ú\u0005âÉ!©$ÕPy@X³¦\u0082¿".length();
               var14 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5239;
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
            throw new RuntimeException("su/catlean/l_", var10);
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
         throw new RuntimeException("su/catlean/l_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14665;
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
            throw new RuntimeException("su/catlean/l_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/l_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
