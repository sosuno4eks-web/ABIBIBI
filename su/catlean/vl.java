package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.awt.Color;
import java.awt.Font;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

public final class vl {
   @NotNull
   public static final vl n;
   private static final char H;
   @NotNull
   private static final Char2IntArrayMap G;
   private static final long a = j0.a(6894356235754026732L, 9140235426807923741L, MethodHandles.lookup().lookupClass()).a(68468537219102L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private vl() {
   }

   @NotNull
   public final Char2IntArrayMap V() {
      return G;
   }

   public final int F(int x, int n) {
      return var2 * (int)Math.floor((double)var1 / (double)var2);
   }

   @NotNull
   public final String b(@NotNull String text, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_2960 F(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 133366968010850L;
      long var10001 = var1 ^ 63562975344532L;
      int var5 = (int)((var1 ^ 63562975344532L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      String var8 = 9667.c<invokedynamic>(9667, 3999118250317630860L ^ var1);
      String var10002 = this.u((short)var5, (short)var6, var7);
      String var10004 = true.c<invokedynamic>(8077, 4105600079728277493L ^ var1);
      return hp.o(var3, var8, var10004 + var10002);
   }

   @NotNull
   public final String u(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      Object var10000 = IntStream.range(0, true.a<invokedynamic>(11481, 5264449742861317013L ^ var4)).mapToObj(vl::n).collect(Collectors.joining());
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(23108, 6983230089246802145L ^ var4));
      return (String)var10000;
   }

   @NotNull
   public final int[] E(int i, long a) {
      var2 ^= a;
      int var4 = var1 >> true.a<invokedynamic>(17140, 8338794257409145345L ^ var2) & true.a<invokedynamic>(14382, 3308757358121189550L ^ var2);
      int var5 = var1 >> true.a<invokedynamic>(2364, 2317901650270335382L ^ var2) & true.a<invokedynamic>(14382, 3308757358121189550L ^ var2);
      int var6 = var1 & true.a<invokedynamic>(14382, 3308757358121189550L ^ var2);
      int[] var7 = new int[]{var4, var5, var6};
      return var7;
   }

   public final float i(long a, float n) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final a w(char from, char to, @NotNull Font font, @NotNull ObjectArrayList maps, int padding, long a) {
      var6 ^= a;
      long var8 = var6 ^ 66211813123600L;
      long var10 = var6 ^ 47758437637737L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(29032, 3914131127104799294L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(12215, 8947272383828876511L ^ var6));
      a var12 = new a(var8, var1, var2, var3, this.F(var10), var5);
      var4.add(var12);
      return var12;
   }

   @Nullable
   public final ps F(char glyph, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack, long a) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final ps T(long a, char glyph, @NotNull Char2ObjectArrayMap allGlyphs, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack) {
      var1 ^= a;
      long var8 = var1 ^ 27042674674515L;
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(2960, 4279382246946452535L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.c<invokedynamic>(12215, 8947353255046385723L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.c<invokedynamic>(29032, 3914106573782273754L ^ var1));
      Intrinsics.checkNotNullParameter(var7, true.c<invokedynamic>(30400, 3582509595008518505L ^ var1));
      ps var10000 = (ps)var4.get(var3);
      if (var10000 != null) {
         ps var11 = var10000;
         boolean var12 = false;
         return var11;
      } else {
         ps var10 = this.F(var3, var5, var6, var7, var8);
         ((Map)var4).put(var3, var10);
         return var10;
      }
   }

   public final void S(@NotNull Matrix3x2fStack stack, long a, @NotNull String s, float x, float y, @NotNull Color color, boolean gradient, int offset, float scaleMul, @NotNull Char2ObjectArrayMap allGlyphs, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack, @NotNull Object2ObjectOpenHashMap glyphPage) {
      // $FF: Couldn't be decompiled
   }

   public final void G(@NotNull Matrix3x2fStack stack, @NotNull String s, float x, short a, short a, float y, @NotNull Color color, boolean gradient, int offset, float scaleMul, @NotNull Char2ObjectArrayMap allGlyphs, int a, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack, float z, @NotNull Object2ObjectOpenHashMap batchedDraws) {
      // $FF: Couldn't be decompiled
   }

   public final float A(long a, @NotNull String text, @NotNull Char2ObjectArrayMap allGlyphs, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack, float scaleMul) {
      // $FF: Couldn't be decompiled
   }

   public final void f(long a, @NotNull Object2ObjectOpenHashMap batchedDraws) {
      // $FF: Couldn't be decompiled
   }

   public final float Z(@NotNull String text, @NotNull Char2ObjectArrayMap allGlyphs, long a, @NotNull ObjectArrayList maps, @NotNull Font font, @NotNull Font fallBack, float scaleMul) {
      var3 ^= a;
      long var9 = var3 ^ 30141911213636L;
      long var11 = var3 ^ 87979158355681L;
      long var13 = var3 ^ 76382952825202L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(21997, 3231978937142840896L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.c<invokedynamic>(4045, 5936674889995048044L ^ var3));
      Intrinsics.checkNotNullParameter(var5, true.c<invokedynamic>(2379, 4742793902565511927L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.c<invokedynamic>(30237, 8143566054520303032L ^ var3));
      Intrinsics.checkNotNullParameter(var7, true.c<invokedynamic>(1391, 3759194567847272128L ^ var3));
      String var15 = t2.s.H(var1, var9);
      char[] var10000 = this.b(var15, var11).toCharArray();
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(32378, 8805683689621988813L ^ var3));
      char[] var16 = var10000;
      float var17 = 0.0F;
      float var18 = 0.0F;
      int var19 = 0;
      int var20 = var16.length;

      while(var19 < var20) {
         label50: {
            char var21;
            label41: {
               var21 = var16[var19];
               if (var3 > 0L) {
                  if (var21 != true.a<invokedynamic>(12172, 7137798253050900964L ^ var3)) {
                     break label41;
                  }

                  var18 = Math.max(var17, var18);
                  var17 = 0.0F;
               }

               if (var3 >= 0L) {
                  break label50;
               }
            }

            ps var22 = this.T(var13, var21, var2, var5, var6, var7);

            float var24;
            float var25;
            label32: {
               ps var10001;
               try {
                  label30: {
                     var24 = var17;
                     if (var3 > 0L) {
                        var10001 = var22;
                        if (var22 != null) {
                           break label30;
                        }
                     }

                     var25 = 0.0F;
                     break label32;
                  }
               } catch (NumberFormatException var23) {
                  throw var23.A<invokedynamic>(var23, 6591671816076201656L, var3);
               }

               var25 = (float)var10001.K() / var8;
            }

            var17 = var24 + var25;
         }

         ++var19;
         if (var3 <= 0L) {
            break;
         }
      }

      return Math.max(var17, var18);
   }

   private final int Y(char param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean G(char[] param1, int param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private final Triple h(long param1, char[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private static final String n(int var0) {
      long var1 = a ^ 44783558615577L;
      return String.valueOf((char)(new Random()).nextInt(true.a<invokedynamic>(19778, 5778645308177690577L ^ var1), true.a<invokedynamic>(24548, 2330578011461172597L ^ var1)));
   }

   private static final ObjectList X(Object var0) {
      return (ObjectList)(new ObjectArrayList());
   }

   static {
      long var20 = a ^ 119303905902902L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[35];
      int var16 = 0;
      String var15 = "\u009a\u0014\u0082a\u009d÷\u008d\u009e-;k¦CÏ¾\u0004\u0018´³9\u000b\u0099ò¦h\u001e\u0087¹\u009avå¡±¨z\u0012$²\tÿü0,ïô\u001eÔ0é\u0093\u009b±}\u0099=/o\t¸V°Ð5\u008d4¶ü!\t5½ç\u0012\u0000×VT\u0012\u0097L½R·£Ã¬¶\u0098Jp(%9\u001fÔ\u0097YÆ\u009fí³aS(å\u008b¿^Ôº\u0092\u008ehêÁJ×uÒ'`pÃÊø.¼` »¹\u0018\u0096¾õWçà9v¦é®³\u0095\u00979-l\u008b\u0006|]·\u0081E ¦\fÅ0åç/½\u0019NVzMÑb¼`\u009aý\\âÜâò8A\u0094\u0091¦\u0097\u008f\u00950'¸an\t3¡*UôË\u001b³\u0097³õ1Þx\u001ax7\n0ß5ªé\u0098\u0087B!ý\u0081Æ\u009a\u0090}\b\u0090¥\u008b1Ò\u0004\u00187:\u0010ôk\u0017=8?\u009a)û\u0014ï\u008aöÙ\u0007ø\u0010N¢\u000e\u008fÓ{\u0000DÐòâ´ôó¯! ý6¥ìm\u0011X&Þ+\u0081¿ÉQ¢X\u0082\u008aÇî×µ{\rÚ+í½¼\b7è Ý\u009eaí´¹ûd´\u001bæöQ\u009d¡\u0001ÄÑÜCE'D^ôÉàðwÿÊm\u0018ñÙ/\u008fL\u008c!bë\b(tC\u009a!ØU4\u0015\u0018Hïý\u0013\u0010=\u009f\u0081Âç8p?o\u0080úAO¯ùñ\u0018yèýÆ\u0005\u007f\u0015u©\u0097ô´ü\u0098eüS\u0083x>÷dÄþ B@9\u000f\u0005 Eÿ\u0087×\u0082\u0088öµ86ºßú\u001eÐw&\u0089xÝó=a\u008b\u0083. óÖ\u007f\u007f\u0007\u0096Iªò\u0002¢@Wër\u009bc!¥\u0003ô]\ro±\u0083Rè+\u0082Ww \u008c5F\\\u000e6\u0013ôë¨\u0087ê¸Ç,ÿ\u00107\u000f:\u0000 \u008a\u0093¿ð¾\r·\\¦G\u0010¿\u0081ð~NY[\u0004J)W\u00adÔ¦KÁ(ñ ä¤ì\u001d\u0089\tæ\u0007\u0096\u001f\u0018óSzåÀ\u000bM*¦\u0012Y\u0001©õ\u00122\u0090RëÚñ\u0085ÓÃfGF\u0018èLl\u001b\f1g]À\u008b >¦ì©\u0015\u0004\u00ada¨,Úr7(rZÇ\u000e\\¬Ìæ\u0005\u0086\u00ad³Á/\"l\u001b;Ú\u0015\u0099Õ()\u0086¹ÔÍÂ\u001dãüõágØ5\u008f5\u001f\u0010[kü\u0092+o\u000b\u008aÒ1Ù·¼¤\u009e# w\u0014º¡±MÑm\u0085m\u0015t»\"8½j\u000bvÑr\u0019\u0091«îEÏ.|Å}u8\u0010ó¨æñJºþ\u0091p>\u009d.Wº0¯ÑÒBwÛ\u0099°\u0014\u008b\u0084²%\u0012°\u009bÁ<\u00150ô²-\\ûsë\u0086åã0[§Éñ\u0013P9\u001eó0bcâ³+\u0095{Ó\u007fÿ'oj{e\f£î\u0082\u0086Î±ã%\u001e\u008eÃ«}\u0085tWß\u0017zO\u0015\u0007\u008d\u0007\u001bëðNîÏØ\t\u0010ömªW\f\u0095ã\u0097\f±+2îBOª V\u0090ï¡\rªáûgq).j\u0090\r{'\u0096ÿ=4.E*\u001cv\u0096ÀZÀ\"\"\u0018\u000ev\u009b\u0082\u0082\u009f\u0018\u001f·\tU-÷\u0094\"\u007fS\u0014Öt0ð÷\u001f\u0018¿)\u008fÂ*Ú·E«\u0087\u000f\u0015\u000b\u0012\u0098þÐ:6§Gë[o\u0018¦E«FunrJÄ\u0002Ú\u0091úÄ¸\u000ek³Ìv¶\f$\u0017\u0010\n\u001f9ñ¾/ÚÊå\u001d¹\rX\u0091þ±\u0010;$mÄK]¼=å\u0083\rHfáº&\u0010OS\u001dË\b.\u009eÄ\u0015\u00ad*\u0094QÞy\u009b";
      int var17 = "\u009a\u0014\u0082a\u009d÷\u008d\u009e-;k¦CÏ¾\u0004\u0018´³9\u000b\u0099ò¦h\u001e\u0087¹\u009avå¡±¨z\u0012$²\tÿü0,ïô\u001eÔ0é\u0093\u009b±}\u0099=/o\t¸V°Ð5\u008d4¶ü!\t5½ç\u0012\u0000×VT\u0012\u0097L½R·£Ã¬¶\u0098Jp(%9\u001fÔ\u0097YÆ\u009fí³aS(å\u008b¿^Ôº\u0092\u008ehêÁJ×uÒ'`pÃÊø.¼` »¹\u0018\u0096¾õWçà9v¦é®³\u0095\u00979-l\u008b\u0006|]·\u0081E ¦\fÅ0åç/½\u0019NVzMÑb¼`\u009aý\\âÜâò8A\u0094\u0091¦\u0097\u008f\u00950'¸an\t3¡*UôË\u001b³\u0097³õ1Þx\u001ax7\n0ß5ªé\u0098\u0087B!ý\u0081Æ\u009a\u0090}\b\u0090¥\u008b1Ò\u0004\u00187:\u0010ôk\u0017=8?\u009a)û\u0014ï\u008aöÙ\u0007ø\u0010N¢\u000e\u008fÓ{\u0000DÐòâ´ôó¯! ý6¥ìm\u0011X&Þ+\u0081¿ÉQ¢X\u0082\u008aÇî×µ{\rÚ+í½¼\b7è Ý\u009eaí´¹ûd´\u001bæöQ\u009d¡\u0001ÄÑÜCE'D^ôÉàðwÿÊm\u0018ñÙ/\u008fL\u008c!bë\b(tC\u009a!ØU4\u0015\u0018Hïý\u0013\u0010=\u009f\u0081Âç8p?o\u0080úAO¯ùñ\u0018yèýÆ\u0005\u007f\u0015u©\u0097ô´ü\u0098eüS\u0083x>÷dÄþ B@9\u000f\u0005 Eÿ\u0087×\u0082\u0088öµ86ºßú\u001eÐw&\u0089xÝó=a\u008b\u0083. óÖ\u007f\u007f\u0007\u0096Iªò\u0002¢@Wër\u009bc!¥\u0003ô]\ro±\u0083Rè+\u0082Ww \u008c5F\\\u000e6\u0013ôë¨\u0087ê¸Ç,ÿ\u00107\u000f:\u0000 \u008a\u0093¿ð¾\r·\\¦G\u0010¿\u0081ð~NY[\u0004J)W\u00adÔ¦KÁ(ñ ä¤ì\u001d\u0089\tæ\u0007\u0096\u001f\u0018óSzåÀ\u000bM*¦\u0012Y\u0001©õ\u00122\u0090RëÚñ\u0085ÓÃfGF\u0018èLl\u001b\f1g]À\u008b >¦ì©\u0015\u0004\u00ada¨,Úr7(rZÇ\u000e\\¬Ìæ\u0005\u0086\u00ad³Á/\"l\u001b;Ú\u0015\u0099Õ()\u0086¹ÔÍÂ\u001dãüõágØ5\u008f5\u001f\u0010[kü\u0092+o\u000b\u008aÒ1Ù·¼¤\u009e# w\u0014º¡±MÑm\u0085m\u0015t»\"8½j\u000bvÑr\u0019\u0091«îEÏ.|Å}u8\u0010ó¨æñJºþ\u0091p>\u009d.Wº0¯ÑÒBwÛ\u0099°\u0014\u008b\u0084²%\u0012°\u009bÁ<\u00150ô²-\\ûsë\u0086åã0[§Éñ\u0013P9\u001eó0bcâ³+\u0095{Ó\u007fÿ'oj{e\f£î\u0082\u0086Î±ã%\u001e\u008eÃ«}\u0085tWß\u0017zO\u0015\u0007\u008d\u0007\u001bëðNîÏØ\t\u0010ömªW\f\u0095ã\u0097\f±+2îBOª V\u0090ï¡\rªáûgq).j\u0090\r{'\u0096ÿ=4.E*\u001cv\u0096ÀZÀ\"\"\u0018\u000ev\u009b\u0082\u0082\u009f\u0018\u001f·\tU-÷\u0094\"\u007fS\u0014Öt0ð÷\u001f\u0018¿)\u008fÂ*Ú·E«\u0087\u000f\u0015\u000b\u0012\u0098þÐ:6§Gë[o\u0018¦E«FunrJÄ\u0002Ú\u0091úÄ¸\u000ek³Ìv¶\f$\u0017\u0010\n\u001f9ñ¾/ÚÊå\u001d¹\rX\u0091þ±\u0010;$mÄK]¼=å\u0083\rHfáº&\u0010OS\u001dË\b.\u009eÄ\u0015\u00ad*\u0094QÞy\u009b".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[35];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[73];
                  int var3 = 0;
                  String var4 = "Ø\r\u00952&E_@\u0006._\u008aÍ~ë\u0019ÇnÈzÕ\u0012\u001cýÎ\u0006\u0098\u00adO\fø^T#\u009b\u009cW\f[\u000bäI}T<$fÐ¾W×\u0098.$<ÍaS'ùÆ¹K-,ÜG×0\u0090\rÃØ\u0092-\u0014×Ï¤\u0093`ÿ \u0010âú\u0084ÇË0G¡\u001a\u0092WIà÷7\u001b\u000fàÈÈA¤\u0018çC\u009a¬ÖÃ\u0001«ÎÇ\b\tR\u0082Õ%®\u001cc\u009b\u0002è\u0002@dª÷\u0002sr\u00954\u0013\"R\u0097¢Ò)ù7\u000b`\u0017 _ËË0;<%wsI\u0081\u001cáÆbçB'\u008cb\u0019»\u0015É\u0013\u007f\u0019½è°L*\u009e62Ó\u0013\u008f\u009e\u000b\u009aGQârå\u00050\rö¡Âu\u0090¨{ëØs¬&Ñ\u001e?M^èÝZM%8\u0006Ô×%ç,S²É\u0011Hø½\u00844=\"Þ!ÔÃ\u0002IÙæzÉ\u00165\u0012Wõp\u0010\u008b~EænV\u0015ßgVP)gà\u009beØPIj«\u00855çM±\u0085ÈY9Î+ôÇõ^BM\u008a\u0089\u0080Ø#\u009a-\u0019\u0017\u0011~º\u009bãä\u0000¡\u0011ù\u001a\u001d\u0090\u0000\u0082\u008bøú!W\u0005,âÒÎ\u0004\u0099\u0085v\u009c\u0098â}`OcÔ\u0080äõÔàqj\u001eªÖe`¿\u0019»`Ë[s1=TD¹j\u0004\u009d¶¹\u001b\u0004Â\u001dÉ4\u0007ÖÀ¼ä¨K{\r\u0082A]\u008eBÊP\u0018{\u0096hÜ.|\\\u0007\u0004úÎí\u0005¦à¾oÍÌ\u0086\u001a¸3¢Îý\u0091T\u0096\u0096UôÕ\u0004>Ì}¸7ì\u0098A¼®\nW&Ë³ún\u0015Ò]\u001adx$d¼cÁùÊ?ÚïÍß½\u0018<åZ\u00920M\u0087Ð\u0085\\\u0088W(îÄ^\u0087T*ª°z*\u0011,0\u0089\u008f<\u008e\u009de\u009c\u009e}>ìi<ÂÊáP\u0089Ê\u0087.P2\u0097L\u008fx[|÷Ñ8DÂ,bú\u0087\u007fM7\u0016Öà²\u0088êv\u0093Â(é\u0083\u0083\u0086\"\u00adÇ}{ÿ¹Ó=½\u009f&¸±\u0082\u0019«m0\u0082\u0089ø";
                  int var5 = "Ø\r\u00952&E_@\u0006._\u008aÍ~ë\u0019ÇnÈzÕ\u0012\u001cýÎ\u0006\u0098\u00adO\fø^T#\u009b\u009cW\f[\u000bäI}T<$fÐ¾W×\u0098.$<ÍaS'ùÆ¹K-,ÜG×0\u0090\rÃØ\u0092-\u0014×Ï¤\u0093`ÿ \u0010âú\u0084ÇË0G¡\u001a\u0092WIà÷7\u001b\u000fàÈÈA¤\u0018çC\u009a¬ÖÃ\u0001«ÎÇ\b\tR\u0082Õ%®\u001cc\u009b\u0002è\u0002@dª÷\u0002sr\u00954\u0013\"R\u0097¢Ò)ù7\u000b`\u0017 _ËË0;<%wsI\u0081\u001cáÆbçB'\u008cb\u0019»\u0015É\u0013\u007f\u0019½è°L*\u009e62Ó\u0013\u008f\u009e\u000b\u009aGQârå\u00050\rö¡Âu\u0090¨{ëØs¬&Ñ\u001e?M^èÝZM%8\u0006Ô×%ç,S²É\u0011Hø½\u00844=\"Þ!ÔÃ\u0002IÙæzÉ\u00165\u0012Wõp\u0010\u008b~EænV\u0015ßgVP)gà\u009beØPIj«\u00855çM±\u0085ÈY9Î+ôÇõ^BM\u008a\u0089\u0080Ø#\u009a-\u0019\u0017\u0011~º\u009bãä\u0000¡\u0011ù\u001a\u001d\u0090\u0000\u0082\u008bøú!W\u0005,âÒÎ\u0004\u0099\u0085v\u009c\u0098â}`OcÔ\u0080äõÔàqj\u001eªÖe`¿\u0019»`Ë[s1=TD¹j\u0004\u009d¶¹\u001b\u0004Â\u001dÉ4\u0007ÖÀ¼ä¨K{\r\u0082A]\u008eBÊP\u0018{\u0096hÜ.|\\\u0007\u0004úÎí\u0005¦à¾oÍÌ\u0086\u001a¸3¢Îý\u0091T\u0096\u0096UôÕ\u0004>Ì}¸7ì\u0098A¼®\nW&Ë³ún\u0015Ò]\u001adx$d¼cÁùÊ?ÚïÍß½\u0018<åZ\u00920M\u0087Ð\u0085\\\u0088W(îÄ^\u0087T*ª°z*\u0011,0\u0089\u008f<\u008e\u009de\u009c\u009e}>ìi<ÂÊáP\u0089Ê\u0087.P2\u0097L\u008fx[|÷Ñ8DÂ,bú\u0087\u007fM7\u0016Öà²\u0088êv\u0093Â(é\u0083\u0083\u0086\"\u00adÇ}{ÿ¹Ó=½\u009f&¸±\u0082\u0019«m0\u0082\u0089ø".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var25[var27] = var34;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[73];
                              H = (char)true.a<invokedynamic>(27957, var20 ^ 7761107294302432391L);
                              n = new vl();
                              G = new Char2IntArrayMap();
                              vl var26 = n;
                              G.put((char)true.a<invokedynamic>(1719, 2917591539435505465L ^ var20), 0);
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(18971, 368348474750061458L ^ var20), true.a<invokedynamic>(30268, 1320083871522846644L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(19949, 384659354778160177L ^ var20), true.a<invokedynamic>(14240, 8757672807727838765L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(17329, 3828374871414260242L ^ var20), true.a<invokedynamic>(11335, 7383546095848074712L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(19088, 392698278330485567L ^ var20), true.a<invokedynamic>(15825, 729760165088214025L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(18896, 397990511082096759L ^ var20), true.a<invokedynamic>(10363, 4458604519226649069L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(107, 4528751257347031548L ^ var20), true.a<invokedynamic>(7874, 8742885816597651273L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(14355, 6243293918692948374L ^ var20), true.a<invokedynamic>(16287, 7700697417212444214L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(24178, 6774298028789522402L ^ var20), true.a<invokedynamic>(11315, 7867214554633252270L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(16930, 4249453074999559064L ^ var20), true.a<invokedynamic>(5193, 2814659443488593378L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(17718, 1863183821671613569L ^ var20), true.a<invokedynamic>(31781, 8723582010403159544L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(15490, 7005010261198191889L ^ var20), true.a<invokedynamic>(5792, 5324743030872774519L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(12575, 7986278437803208901L ^ var20), true.a<invokedynamic>(16615, 8773060060302295377L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(13863, 3620849110143088566L ^ var20), true.a<invokedynamic>(1537, 8039380474216941500L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(11153, 145760742997404194L ^ var20), true.a<invokedynamic>(17515, 9222430261727643120L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(28746, 2731057318722990540L ^ var20), true.a<invokedynamic>(17506, 5995831258255902189L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(15819, 7184425290402741266L ^ var20), true.a<invokedynamic>(25787, 5485291643829839153L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(4590, 1800183682769490010L ^ var20), true.a<invokedynamic>(210, 8117231104349208931L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(29097, 25556373604266032L ^ var20), true.a<invokedynamic>(12893, 5039750473704256486L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(11684, 8110889651630353436L ^ var20), true.a<invokedynamic>(3547, 6661896954539052110L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(14859, 4799963049254927273L ^ var20), true.a<invokedynamic>(11626, 3314126478774873334L ^ var20));
                              var26 = n;
                              G.put((char)true.a<invokedynamic>(26311, 2437419371223443264L ^ var20), true.a<invokedynamic>(23104, 1116189616571505632L ^ var20));
                              return;
                           }
                           break;
                        default:
                           var25[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "´gwË>'#/G\u0015h÷j\u00ad¢\u0089";
                           var5 = "´gwË>'#/G\u0015h÷j\u00ad¢\u0089".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "áÇ\u0085\u009auÿ\u00ad\u0019k\u00adÛ(\u008bIð$\u0010q\f]\u0083L\u008a\u001b;ÈSÔ\u0090\u0007Oýæ";
               var17 = "áÇ\u0085\u009auÿ\u00ad\u0019k\u00adÛ(\u008bIð$\u0010q\f]\u0083L\u008a\u001b;ÈSÔ\u0090\u0007Oýæ".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 42;
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
            throw new RuntimeException("su/catlean/vl", var10);
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
         throw new RuntimeException("su/catlean/vl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17874;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/vl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/vl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
