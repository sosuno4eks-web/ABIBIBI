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
import kotlin.NoWhenBranchMatchedException;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_1753;
import net.minecraft.class_1792;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class lt extends k9 {
   @NotNull
   public static final lt B;
   static final KProperty[] t;
   @NotNull
   private static final z7 J;
   @NotNull
   private static final zo A;
   @Nullable
   private static class_243 O;
   @NotNull
   private static final aa z;
   @NotNull
   private static class_243 X;
   private static final long b = j0.a(5606445742960187212L, 7640775771355479511L, MethodHandles.lookup().lookupClass()).a(15062295797637L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private lt(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 135739666212156L;
      super(var3, true.a<invokedynamic>(4234, 6527365033607891078L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final n_ j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 97107974456668L;
      int var3 = (int)((var1 ^ 97107974456668L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)J.k((short)var3, this, t[0], (short)var4, var5);
   }

   private final void g(char var1, int var2, n_ var3, short var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 63217677744803L;
      int var7 = (int)((var5 ^ 63217677744803L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      J.P(this, var7, t[0], (short)var8, var3, (short)var9);
   }

   private final boolean p(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 127626104060111L;
      int var3 = (int)((var1 ^ 127626104060111L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)A.k((short)var3, this, t[1], (short)var4, var5);
   }

   private final void I(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 105761681716259L;
      int var4 = (int)((var2 ^ 105761681716259L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      A.P(this, var4, t[1], (short)var5, var1, (short)var6);
   }

   private final boolean F(class_1792 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final float Y(long var1, class_1792 var3) {
      var1 ^= b;

      float var10000;
      try {
         if (var3 instanceof class_1753) {
            var10000 = 1.0F;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, 512060043238937173L, var1);
      }

      var10000 = 0.4F;
      return var10000;
   }

   private final float V(class_1792 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final int n(long param1, class_1792 param3) {
      // $FF: Couldn't be decompiled
   }

   private final float R(class_1792 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void m(FreecamStateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void j(TickEvent var1) {
      long var2 = b ^ 87153146992782L;
      long var10001 = var2 ^ 29689951512419L;
      int var4 = (int)((var2 ^ 29689951512419L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      k9[] var7 = 1453761971412156342L.A<invokedynamic>(1453761971412156342L, var2);

      class_746 var10000;
      try {
         label32: {
            if (var7 != null) {
               var10000 = s8.H((short)var4, (short)var5, var6).field_1724;
               if (var10000 != null) {
                  break label32;
               }
            }

            return;
         }
      } catch (NoWhenBranchMatchedException var10) {
         throw var10.A<invokedynamic>(var10, 1534108750081982468L, var2);
      }

      class_746 var8 = var10000;
      boolean var9 = false;
      lt var11 = B;
      class_243 var12 = var8.method_18798();
      Intrinsics.checkNotNullExpressionValue(var12, true.a<invokedynamic>(9921, 9185048309108544827L ^ var2));
      X = var12;
   }

   @Flow
   private final void d(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void W(@NotNull class_1657 player, short a, @NotNull class_1792 item, int a, float yaw, char a) {
      // $FF: Couldn't be decompiled
   }

   private final void G(class_243 var1, float var2, class_2350 var3, long var4, Color var6) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var27 = b ^ 57578142513277L;
      long var10001 = var27 ^ 4888328314740L;
      int var29 = (int)((var27 ^ 4888328314740L) >>> 32);
      int var30 = (int)(var10001 << 32 >>> 48);
      int var31 = (int)(var10001 << 48 >>> 48);
      var10001 = var27 ^ 125627427152893L;
      int var32 = (int)((var27 ^ 125627427152893L) >>> 32);
      int var33 = (int)(var10001 << 32 >>> 48);
      int var34 = (int)(var10001 << 48 >>> 48);
      long var35 = var27 ^ 137114365367785L;
      long var37 = var27 ^ 28544455542333L;
      var10001 = var27 ^ 108240553581039L;
      int var39 = (int)((var27 ^ 108240553581039L) >>> 48);
      int var40 = (int)(var10001 << 16 >>> 48);
      int var41 = (int)(var10001 << 32 >>> 32);
      e = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[28];
      int var23 = 0;
      String var22 = "\u0085Ôü* óz*\u0087×rC\u0084«x]¸í¼\u0088ÙP¯z(\u0016¬E-Vó±vm \u0013lwÄÁè÷\u0087ÄOUÅ%\u0080\u00992HòNÿ\u001fè\u001fÉ\u0004Lsá£5\u0010ócæ^5¥PÒÊ¬Û/\"8ý\u001b Ìg§ë*\u0006æ\u001e\u009f½ÔÑ æqÅk\u0002YT\u000e\u0014ÒbP\n>ü«[\u0093í(}\u007f\u0011\u0013\u0003±v\u0083®\u0099»q\u001f^h\u0097\u000bàKBfÂ\u0081\u00163\u0096\f\u0086\u0096xN\u0092¡®Ý7<|¨½(\u009c(ôYH\u0007hïð8BÁ×\u0002Ü¼l\u008cÿÊK°ÏÚ\u0095¶W\rÛ\u0016\u0088/\u0003ÔqÏt\u0004@© \u00881Æ2Xî\u008fnæ\u0087P\u009b¶¯a-È\f>-c\"òF\u0003Æ\u008dÀ!|\u009aê\u0018\u0002¼^\rµ\u0018Xð\u008f\u009eË·\u008e'\u008dÛª1\røF¸\u0019\u0082\u0010\u0093ýc1ëôt7`\u0011\u000e®µ\u0093\u008a·\u0018ñ$NúÉ\u0010\u0006Ó\u0083¿·b÷Æ\b\u0017\r\b\u000bözçH} _ñ5öGU#¤-Õu\u0002x¥¯kq\u0099eEÂCÔØÎ\u0099Ô\u0090\u0007\u001emì0\u0089\tù§²ì\u008cóåBOþ°\tz\bózÞ;Múö¤ù©\u009eÆ¶²ì\u0092\u001d/x_GÄs\fd]\f\u0090ú\u00984\u0019\u0018\u008fº²\u0090þ\u0004åËöÕ7;Þ6\u0018»ý9ð«£\u0016á]\u0018Çg?xl\u0084Øy\u0085So}ßr\u000b\u001cw\u009d\rÕ×\u009d.ã(Îbö¼\u0012\u0093ð\u0097\u008dß\u001f-`gQ\u0098e\u009a\u00adîÁKÚëÆÍö|¨ër.:Ç\u0007¡Ë;ó2\u0018\u0011²Ûq0êk&Æu;9Qýcë«\u0081\u0095áD\u009fù§ ¯\u0085^\u0019ë\u001bà\u0001\r·÷«\u009eU{ZKExJ«\u008ax\bº\u000e£o\u001a\b>g\u0010Ò¿¤¿õ\u001bVî3b\u0002\u0014gt<Á(Jd\u001aý¯ý\u001c\u0018\u001d\u009b5\u001b\u0017\u001fp[\".Ä\"®\u0083'\u0089\\La8ï\u0086!·Üô\u0004é\rnq\u008c\u0010\u009d\u00884\u0084'l\u0082¢Rvepþ\\:x(PùZ¼#Ç\u001a,\u0081\u009fÙú;:\u000e!*ËÎ0e·=\u0007ÜÜ\u0017£<`XýÎ%\u0092\u007f\u00996\nâ(V¬Ý±¦`tv1ü^Ã\u009b]\u0019¨XÑûå\u0081¸\u000ecdo\u0099JóÑ°\u0083Q\u0011V\u0007\u0005¥Å\u0096  T¬\u0096êE\u008bj>ÁÓ\u007f\u001e\u0014ª\n~\u008c\u0010û³ôPLs\u0080Ù\u009e\u0017\u0097\u009f\u0006(\u008f\u0094M\u0004O\u0001\u0096FÞ½#Ð\u0083±\u0097×ß\u0093\u0016!Ñ\u008fSÄ7ÚÑ\u0096P\u009e6ÕÔ#z\u0099ìðå\u00028CðnO}-÷u\u0099p³S\u0019.&øP\u008f¶¸1Äø \u009b=\u0098§mq%ç!\u009e\u000fÕ\u0001ýÚ+\u0012\u0012\u0017 \u0082yºÓIy\u0095j\b\u0014\u0080\u001e\u0018sÿK9õ\u000e\f\u001f:¹»\u001c3÷÷¬ÐÇÔÑÆë\u007fB";
      int var24 = "\u0085Ôü* óz*\u0087×rC\u0084«x]¸í¼\u0088ÙP¯z(\u0016¬E-Vó±vm \u0013lwÄÁè÷\u0087ÄOUÅ%\u0080\u00992HòNÿ\u001fè\u001fÉ\u0004Lsá£5\u0010ócæ^5¥PÒÊ¬Û/\"8ý\u001b Ìg§ë*\u0006æ\u001e\u009f½ÔÑ æqÅk\u0002YT\u000e\u0014ÒbP\n>ü«[\u0093í(}\u007f\u0011\u0013\u0003±v\u0083®\u0099»q\u001f^h\u0097\u000bàKBfÂ\u0081\u00163\u0096\f\u0086\u0096xN\u0092¡®Ý7<|¨½(\u009c(ôYH\u0007hïð8BÁ×\u0002Ü¼l\u008cÿÊK°ÏÚ\u0095¶W\rÛ\u0016\u0088/\u0003ÔqÏt\u0004@© \u00881Æ2Xî\u008fnæ\u0087P\u009b¶¯a-È\f>-c\"òF\u0003Æ\u008dÀ!|\u009aê\u0018\u0002¼^\rµ\u0018Xð\u008f\u009eË·\u008e'\u008dÛª1\røF¸\u0019\u0082\u0010\u0093ýc1ëôt7`\u0011\u000e®µ\u0093\u008a·\u0018ñ$NúÉ\u0010\u0006Ó\u0083¿·b÷Æ\b\u0017\r\b\u000bözçH} _ñ5öGU#¤-Õu\u0002x¥¯kq\u0099eEÂCÔØÎ\u0099Ô\u0090\u0007\u001emì0\u0089\tù§²ì\u008cóåBOþ°\tz\bózÞ;Múö¤ù©\u009eÆ¶²ì\u0092\u001d/x_GÄs\fd]\f\u0090ú\u00984\u0019\u0018\u008fº²\u0090þ\u0004åËöÕ7;Þ6\u0018»ý9ð«£\u0016á]\u0018Çg?xl\u0084Øy\u0085So}ßr\u000b\u001cw\u009d\rÕ×\u009d.ã(Îbö¼\u0012\u0093ð\u0097\u008dß\u001f-`gQ\u0098e\u009a\u00adîÁKÚëÆÍö|¨ër.:Ç\u0007¡Ë;ó2\u0018\u0011²Ûq0êk&Æu;9Qýcë«\u0081\u0095áD\u009fù§ ¯\u0085^\u0019ë\u001bà\u0001\r·÷«\u009eU{ZKExJ«\u008ax\bº\u000e£o\u001a\b>g\u0010Ò¿¤¿õ\u001bVî3b\u0002\u0014gt<Á(Jd\u001aý¯ý\u001c\u0018\u001d\u009b5\u001b\u0017\u001fp[\".Ä\"®\u0083'\u0089\\La8ï\u0086!·Üô\u0004é\rnq\u008c\u0010\u009d\u00884\u0084'l\u0082¢Rvepþ\\:x(PùZ¼#Ç\u001a,\u0081\u009fÙú;:\u000e!*ËÎ0e·=\u0007ÜÜ\u0017£<`XýÎ%\u0092\u007f\u00996\nâ(V¬Ý±¦`tv1ü^Ã\u009b]\u0019¨XÑûå\u0081¸\u000ecdo\u0099JóÑ°\u0083Q\u0011V\u0007\u0005¥Å\u0096  T¬\u0096êE\u008bj>ÁÓ\u007f\u001e\u0014ª\n~\u008c\u0010û³ôPLs\u0080Ù\u009e\u0017\u0097\u009f\u0006(\u008f\u0094M\u0004O\u0001\u0096FÞ½#Ð\u0083±\u0097×ß\u0093\u0016!Ñ\u008fSÄ7ÚÑ\u0096P\u009e6ÕÔ#z\u0099ìðå\u00028CðnO}-÷u\u0099p³S\u0019.&øP\u008f¶¸1Äø \u009b=\u0098§mq%ç!\u009e\u000fÕ\u0001ýÚ+\u0012\u0012\u0017 \u0082yºÓIy\u0095j\b\u0014\u0080\u001e\u0018sÿK9õ\u000e\f\u001f:¹»\u001c3÷÷¬ÐÇÔÑÆë\u007fB".length();
      char var21 = 24;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var50 = var22.substring(var20, var20 + var21);
         byte var53 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var50.getBytes("ISO-8859-1"));
            String var58 = b(var26).intern();
            switch(var53) {
            case 0:
               var25[var23++] = var58;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  d = new String[28];
                  i = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[10];
                  int var10 = 0;
                  String var11 = "g¨¼\u0090\\\u001fcÇÙÊÔù\u00012Ù¾h\u0017¶\u000f%5½Ãíî\u0019îÉì\u0013ê\u00990Õ¤Ò\u008fG:àÀÜÓQAÙ\u0095e¾©¾^ýÄ\u0014\u000bÇÄ\tú\u0007Ét";
                  int var12 = "g¨¼\u0090\\\u001fcÇÙÊÔù\u00012Ù¾h\u0017¶\u000f%5½Ãíî\u0019îÉì\u0013ê\u00990Õ¤Ò\u008fG:àÀÜÓQAÙ\u0095e¾©¾^ýÄ\u0014\u000bÇÄ\tú\u0007Ét".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var60 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var60, var9).getBytes("ISO-8859-1");
                     long[] var52 = var13;
                     var60 = var10++;
                     long var61 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var62 = -1;

                     while(true) {
                        long var15 = var61;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var65 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var62) {
                        case 0:
                           var52[var60] = var65;
                           if (var9 >= var12) {
                              f = var13;
                              g = new Integer[10];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = 24142909855784309L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var61 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var63 = true;
                              long var0 = var61;
                              KProperty[] var49 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lt.class, true.a<invokedynamic>(27811, 2207780990949097388L ^ var27), true.a<invokedynamic>(29852, 2593425687248627615L ^ var27), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lt.class, true.a<invokedynamic>(13689, 8602933484309489265L ^ var27), true.a<invokedynamic>(20649, 6915888147961037748L ^ var27), 0)))};
                              t = var49;
                              B = new lt(var37);
                              il var54 = (il)B;
                              String var56 = 3756.a<invokedynamic>(3756, 7097702907385224629L ^ var27);
                              n_ var66 = new n_(0, var32, (char)var33, false, (char)var34, false, true.i<invokedynamic>(24926, 8549417717092483573L ^ var27), (DefaultConstructorMarker)null);
                              int var10005 = 29128.i<invokedynamic>(29128, 5877600908013670761L ^ var27);
                              Object var42 = null;
                              int var43 = var10005;
                              Object var44 = null;
                              Object var45 = null;
                              n_ var46 = var66;
                              String var47 = var56;
                              il var48 = var54;
                              J = qi.b(var29, var48, var47, (char)var30, var46, (pj)var45, (Function0)var44, var43, var42, (short)var31);
                              A = qi.R((il)B, true.a<invokedynamic>(15884, 3148216432068111618L ^ var27), false, (pj)null, (Function0)null, true.i<invokedynamic>(24754, 2959451435032641565L ^ var27), var35, (Object)null);
                              z = new aa(sa.OUT_QUINT, var0, (short)var39, (short)var40, var41);
                              class_243 var57 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var57, true.a<invokedynamic>(24654, 7363058441653973845L ^ var27));
                              X = var57;
                              return;
                           }
                           break;
                        default:
                           var52[var60] = var65;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "á\u0014\u0012\túIûR`µ¡Wo\u0003\rÔ";
                           var12 = "á\u0014\u0012\túIûR`µ¡Wo\u0003\rÔ".length();
                           var9 = 0;
                        }

                        var60 = var9;
                        var9 += 8;
                        var14 = var11.substring(var60, var9).getBytes("ISO-8859-1");
                        var52 = var13;
                        var60 = var10++;
                        var61 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var62 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var58;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "Ë\u001ey\u0003\u009dj\u001eá6\"O|¼m&hã\u001ftYóìÿ\u001e\u009aRZÌ\u0019\u0007·\u000b(NíìöAys\u001a\u007f\u0083XóÉ\u0003fó08H@\u0088£~æó¼\u009d/¸\u000eÜFÖv_¢}613";
               var24 = "Ë\u001ey\u0003\u009dj\u001eá6\"O|¼m&hã\u001ftYóìÿ\u001e\u009aRZÌ\u0019\u0007·\u000b(NíìöAys\u001a\u007f\u0083XóÉ\u0003fó08H@\u0088£~æó¼\u009d/¸\u000eÜFÖv_¢}613".length();
               var21 = ' ';
               var20 = -1;
            }

            ++var20;
            var50 = var22.substring(var20, var20 + var21);
            var53 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9793;
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
            throw new RuntimeException("su/catlean/lt", var10);
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
         throw new RuntimeException("su/catlean/lt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21985;
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
            throw new RuntimeException("su/catlean/lt", var14);
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
         throw new RuntimeException("su/catlean/lt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
