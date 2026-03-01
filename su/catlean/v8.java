package su.catlean;

import com.mojang.blaze3d.systems.RenderSystem;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import net.minecraft.class_757;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.GameRendererAccessor;

public final class v8 {
   @NotNull
   public static final v8 M;
   private static boolean R;
   @Nullable
   private static class_6364 v;
   private static final long a = j0.a(780661380198909763L, 2198566159485743633L, MethodHandles.lookup().lookupClass()).a(162351743765511L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private v8() {
   }

   @Nullable
   public final class_6364 Y() {
      return v;
   }

   public final void u(@Nullable class_6364 <set-?>) {
      v = var1;
   }

   public final void G(@NotNull class_4587 stack, @NotNull class_1297 target, long a) {
      var3 ^= a;
      long var5 = var3 ^ 37860481167038L;
      long var10001 = var3 ^ 12365452970418L;
      int var7 = (int)((var3 ^ 12365452970418L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      var10001 = var3 ^ 55213435847992L;
      int var10 = (int)((var3 ^ 55213435847992L) >>> 32);
      int var11 = (int)(var10001 << 32 >>> 56);
      int var12 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(21868, 1766512208585076008L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.l<invokedynamic>(20888, 7784496674620811738L ^ var3));
      class_4184 var10000 = s8.H((short)var7, (short)var8, var9).field_1773.method_19418();
      Intrinsics.checkNotNullExpressionValue(var10000, true.l<invokedynamic>(19631, 3144651865957184758L ^ var3));
      class_4184 var14 = var10000;
      this.k(var10, (byte)var11, var12);
      double var15 = (double)q1.A.s(var5);
      double var17 = class_3532.method_16436(var15, var2.field_6038, var2.method_23317()) - var14.method_71156().field_1352;
      double var19 = class_3532.method_16436(var15, var2.field_5971, var2.method_23318()) - var14.method_71156().field_1351;
      double var21 = class_3532.method_16436(var15, var2.field_5989, var2.method_23321()) - var14.method_71156().field_1350;
      R = true;
      Object var27 = s8.H((short)var7, (short)var8, var9).field_1690.method_42435().method_41753();
      Intrinsics.checkNotNullExpressionValue(var27, true.l<invokedynamic>(16093, 3740450393900828294L ^ var3));
      boolean var23 = (Boolean)var27;
      s8.H((short)var7, (short)var8, var9).field_1690.method_42435().method_41748(false);
      RenderSystem.backupProjectionMatrix();
      class_757 var28 = s8.H((short)var7, (short)var8, var9).field_1773;
      Intrinsics.checkNotNull(var28, true.l<invokedynamic>(6097, 2843581299132067736L ^ var3));
      RenderSystem.setProjectionMatrix(((GameRendererAccessor)var28).getLevelProjectionMatrixBuffer().method_71123(q1.A.V()), RenderSystem.getProjectionType());
      GofraState.INSTANCE.setModifyBuffer(true);
      class_10017 var29 = s8.H((short)var7, (short)var8, var9).method_1561().method_3953(var2).method_62425(var2, q1.A.s(var5));
      Intrinsics.checkNotNullExpressionValue(var29, true.l<invokedynamic>(13260, 5506025541664689028L ^ var3));
      class_10017 var24 = var29;
      var28 = s8.H((short)var7, (short)var8, var9).field_1773;
      Intrinsics.checkNotNull(var28, true.l<invokedynamic>(6807, 617917551262556881L ^ var3));
      class_12075 var30 = ((GameRendererAccessor)var28).getLevelRenderState().field_63082;
      Intrinsics.checkNotNullExpressionValue(var30, true.l<invokedynamic>(5278, 7458063842536385730L ^ var3));
      class_12075 var25 = var30;
      s8.H((short)var7, (short)var8, var9).method_1561().method_72976(var24, var25, var17, var19, var21, var1, (class_11659)s8.H((short)var7, (short)var8, var9).field_1773.method_72910());
      s8.H((short)var7, (short)var8, var9).field_1773.method_72911().method_73002();
      s8.H((short)var7, (short)var8, var9).method_22940().method_23000().method_22993();
      s8.H((short)var7, (short)var8, var9).field_1773.method_72910().method_72953();
      GofraState.INSTANCE.setModifyBuffer(false);
      k9[] var31 = -360552147796898848L.A<invokedynamic>(-360552147796898848L, var3);
      s8.H((short)var7, (short)var8, var9).field_1690.method_42435().method_41748(var23);
      RenderSystem.restoreProjectionMatrix();
      R = false;
      k9[] var13 = var31;

      try {
         if (var13 != null) {
            (new int[5]).A<invokedynamic>(new int[5], -412128812941035012L, var3);
         }

      } catch (NumberFormatException var26) {
         throw var26.A<invokedynamic>(var26, -379519213461762124L, var3);
      }
   }

   public final void z(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var10001 = var4 ^ 136324838139660L;
      int var6 = (int)((var4 ^ 136324838139660L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 124366377573024L;
      long var11 = var4 ^ 85414344304487L;
      k9[] var31 = 5233512287341672894L.A<invokedynamic>(5233512287341672894L, var4);

      label20: {
         try {
            if (var31 != null) {
               break label20;
            }

            if (v == null) {
               return;
            }
         } catch (NumberFormatException var32) {
            throw var32.A<invokedynamic>(var32, 5252755450331839978L, var4);
         }

         R = true;
         GofraState.INSTANCE.setModifyBuffer(true);
         l9 var10000 = l9.c;
         Color var10002 = gk.E.e(var9, z8.I.Z(var11, 0), 0.4F);
         class_6364 var10003 = v;
         Intrinsics.checkNotNull(var10003);
         class_6364 var10004 = v;
         Intrinsics.checkNotNull(var10004);
         Color var10012 = Color.WHITE;
         Intrinsics.checkNotNullExpressionValue(var10012, true.l<invokedynamic>(8706, 1571600629907056658L ^ var4));
         Color var10013 = Color.WHITE;
         Intrinsics.checkNotNullExpressionValue(var10013, true.l<invokedynamic>(15855, 1126826600470411258L ^ var4));
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var17 = 0.0F;
         float var18 = 0.0F;
         byte var19 = 0;
         Color var20 = var10013;
         Color var21 = var10012;
         byte var22 = 0;
         float var23 = 4.0F;
         float var24 = 0.0F;
         float var25 = 0.0F;
         float var26 = 0.0F;
         boolean var27 = false;
         boolean var28 = false;
         class_6364 var29 = var10004;
         class_6364 var30 = var10003;
         var10000.G((h3)null, var10002, var6, var30, var7, var29, var28, var27, var26, var25, var24, var23, var22, (short)var8, var21, var20, var19, var18, var17, var16, var15, var14, var13);
         GofraState.INSTANCE.setModifyBuffer(false);
      }

      R = false;
   }

   public final void E(long a, @NotNull class_4587 matrix, @NotNull class_1297 target, float alpha) {
      // $FF: Couldn't be decompiled
   }

   public static void u(long var0, v8 var2, class_4587 var3, class_1297 var4, float var5, int var6, Object var7) {
      var0 ^= a;
      long var8 = var0 ^ 10590862985932L;
      if ((var6 & 4) != 0) {
         var5 = 1.0F;
      }

      var2.E(var8, var3, var4, var5);
   }

   public final void C(long a, @NotNull class_4587 matrix, @NotNull class_1297 target, float alpha) {
      // $FF: Couldn't be decompiled
   }

   public static void G(int var0, v8 var1, class_4587 var2, class_1297 var3, float var4, int var5, Object var6, int var7, byte var8) {
      long var9 = ((long)var0 << 32 | (long)var7 << 40 >>> 32 | (long)var8 << 56 >>> 56) ^ a;
      long var11 = var9 ^ 82956896541774L;
      if ((var5 & 4) != 0) {
         var4 = 1.0F;
      }

      var1.C(var11, var2, var3, var4);
   }

   private final void k(int param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void s(FrameBufferEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 15727624685440L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[22];
      int var18 = 0;
      String var17 = "\u0095ìí\u008e\u0082v\u0092Ãw}=ü\u001fX\u0089\u00adÄ\u0098¿\u0085ª\u0004¥QüY¥\u0080£\u009b².³ÚKªg#\u0011ï\u0088yjB±¸ý(\u0084RgD4®\u0081bÐG\u0087\u001caÅû[7\u001d@\u001d,1êÿ·\u0010ñ`ëÄÇ$@\u0012G;¶\u001d|Ú¦}¬\u0006ÀúÜñ\u0096\u0088\u0086L5\u008bDñ+Û\u0099!\u009c(_½U¡6g9\u0092;\u0082\u0002ni#\u008d2!p\u009b´Ää°ìPDFÄ!\"ü©õ5l¯l\u008cpå¾dúÆà¿\u0098\"êÍ\u0082\u0017\u0011>Ùk\u0000µÚN\u009dÌ\u0099k¼#¢\u0018\u007f\u0018QìÇ\u0088 \u008aìãOî\u008fÁ[n\frÏKä{D/\u0010fP\u0012ÐÍ\u0005púü11iÄ\u0087¯\u0092(îQCeüRh\nî\u008bf\u008d§®ÏÎ\u008f¨óìrÆUÃ\u00adk¨\u000fã^T\u0002\u009d6\u000fÛ]N»\u0092(\u00adL\u009fÎàá\u0013Tyôc\u0012ÁÚ\u0084flÙ>Õj_ÜJ«\u0017\u0097üË×ÿ¿«\u0085¤CºXÑ*\u0010nì\u0011jB¥º\u0082ÚBc\u0099\u0096\u0094\u000e®\u0010 {³*\u0093\u009e\u000fI\u0094ÀTs©,ö[\u0010ü&EOªY\u0099ä{çÖî<\u0016ä¥\u0010Øå¢A;¬*9¹é\u0011\t±\u0013Ûi\u0010heéIñb©\u0002~\u0019é:,Á5á Õµ\u0094@ê±\u001aì$\u009d\u000eÇ$ý\u001e\u000eSTE\u009aÏ`ÑÎûDÉ\fà´eë\u0010h\u0098î(®K0\u009f\u008d¬%\u0087k\u009c¾\u008b(_ôûØC\u001fzÿñF¹a[5R}I pÔdf³µ·§\u0019\u000fø|\u0011\fô#ø71^\u001f¼\u0088jIzä\u0018uC\u000f\u009eËîèÉ3Ç\u0089æßt&¦\u0094ÇÕ¢÷MàxÞÂ\u0089ëgcçtúÿ¯ñy\u000f\u000f§\u0086PtÝ\u000e¾\u001f½Â\n¨Ú\u001c°CP2íÔô\u0016wéóââ\u009c^è\u008b\u0013ðÉ\u00ad\u0097Öæý\u0088\u0019\u0086ÃÅ&Nò(/³Éá:Ü\u008bQ\"\u008bÞîV¼Y\u009eP\u008cq÷90åÐ§\u0018&\u000eYceâ1\u0082\t\u009fW5,\u0088Ï\u009fB6 \u00813ºj\f>\u009dè9\u0088Æ4\n~k¦`Ôü+ô\u007f\u0090\u0096·0\u0082\u0002.õ´\r(µ5Ne*ËÖAE\u009b>°ÕS%Î\u0017Îûÿ¡?\u0083\u0090êòr\u00107Ù?_Øw²4o¬Áù(\u008cL®\u009eÒe\u0089\u0092\u000eºlQ)\u008dÔ×\u008f¼\\2\u008cÃ¨#í$+Òj*ðÄ/i}Rx'X](\u0094\u0016\u009c\u0013\u0019\u0016÷2ß\u000e\u0015\u0089ø\u0018¦\u009cv×-±\u0087\u001eOßO`³A\u0005j9Ý\u008c\u008d¼0æo»\u0093\u0018Eú\\¼%ä\u0087\u0015[7\u009d\u0002§¸¯MU¡èdd\u0099^A";
      int var19 = "\u0095ìí\u008e\u0082v\u0092Ãw}=ü\u001fX\u0089\u00adÄ\u0098¿\u0085ª\u0004¥QüY¥\u0080£\u009b².³ÚKªg#\u0011ï\u0088yjB±¸ý(\u0084RgD4®\u0081bÐG\u0087\u001caÅû[7\u001d@\u001d,1êÿ·\u0010ñ`ëÄÇ$@\u0012G;¶\u001d|Ú¦}¬\u0006ÀúÜñ\u0096\u0088\u0086L5\u008bDñ+Û\u0099!\u009c(_½U¡6g9\u0092;\u0082\u0002ni#\u008d2!p\u009b´Ää°ìPDFÄ!\"ü©õ5l¯l\u008cpå¾dúÆà¿\u0098\"êÍ\u0082\u0017\u0011>Ùk\u0000µÚN\u009dÌ\u0099k¼#¢\u0018\u007f\u0018QìÇ\u0088 \u008aìãOî\u008fÁ[n\frÏKä{D/\u0010fP\u0012ÐÍ\u0005púü11iÄ\u0087¯\u0092(îQCeüRh\nî\u008bf\u008d§®ÏÎ\u008f¨óìrÆUÃ\u00adk¨\u000fã^T\u0002\u009d6\u000fÛ]N»\u0092(\u00adL\u009fÎàá\u0013Tyôc\u0012ÁÚ\u0084flÙ>Õj_ÜJ«\u0017\u0097üË×ÿ¿«\u0085¤CºXÑ*\u0010nì\u0011jB¥º\u0082ÚBc\u0099\u0096\u0094\u000e®\u0010 {³*\u0093\u009e\u000fI\u0094ÀTs©,ö[\u0010ü&EOªY\u0099ä{çÖî<\u0016ä¥\u0010Øå¢A;¬*9¹é\u0011\t±\u0013Ûi\u0010heéIñb©\u0002~\u0019é:,Á5á Õµ\u0094@ê±\u001aì$\u009d\u000eÇ$ý\u001e\u000eSTE\u009aÏ`ÑÎûDÉ\fà´eë\u0010h\u0098î(®K0\u009f\u008d¬%\u0087k\u009c¾\u008b(_ôûØC\u001fzÿñF¹a[5R}I pÔdf³µ·§\u0019\u000fø|\u0011\fô#ø71^\u001f¼\u0088jIzä\u0018uC\u000f\u009eËîèÉ3Ç\u0089æßt&¦\u0094ÇÕ¢÷MàxÞÂ\u0089ëgcçtúÿ¯ñy\u000f\u000f§\u0086PtÝ\u000e¾\u001f½Â\n¨Ú\u001c°CP2íÔô\u0016wéóââ\u009c^è\u008b\u0013ðÉ\u00ad\u0097Öæý\u0088\u0019\u0086ÃÅ&Nò(/³Éá:Ü\u008bQ\"\u008bÞîV¼Y\u009eP\u008cq÷90åÐ§\u0018&\u000eYceâ1\u0082\t\u009fW5,\u0088Ï\u009fB6 \u00813ºj\f>\u009dè9\u0088Æ4\n~k¦`Ôü+ô\u007f\u0090\u0096·0\u0082\u0002.õ´\r(µ5Ne*ËÖAE\u009b>°ÕS%Î\u0017Îûÿ¡?\u0083\u0090êòr\u00107Ù?_Øw²4o¬Áù(\u008cL®\u009eÒe\u0089\u0092\u000eºlQ)\u008dÔ×\u008f¼\\2\u008cÃ¨#í$+Òj*ðÄ/i}Rx'X](\u0094\u0016\u009c\u0013\u0019\u0016÷2ß\u000e\u0015\u0089ø\u0018¦\u009cv×-±\u0087\u001eOßO`³A\u0005j9Ý\u008c\u008d¼0æo»\u0093\u0018Eú\\¼%ä\u0087\u0015[7\u009d\u0002§¸¯MU¡èdd\u0099^A".length();
      char var16 = '(';
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
                  b = var20;
                  c = new String[22];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[13];
                  int var3 = 0;
                  String var4 = "\u001aÔÒ-fç|\u0098\bÓìèº\u008c\u00151\"!\u0001Þ\u007f\u0082$×Ï\u0000Í¸TGE\u0096\u0019:É÷\u0094W§Õ7\u0017uê\u0000&lE³o\u0013Ö«\u0004®\u0003Ë&°¢íòÒ\u0092AÒ\u0089\u0011¿WÛ\u0004NÑKØ\u0087ÆWäný\u00ad\u0089¶s\u0081|";
                  int var5 = "\u001aÔÒ-fç|\u0098\bÓìèº\u008c\u00151\"!\u0001Þ\u007f\u0082$×Ï\u0000Í¸TGE\u0096\u0019:É÷\u0094W§Õ7\u0017uê\u0000&lE³o\u0013Ö«\u0004®\u0003Ë&°¢íòÒ\u0092AÒ\u0089\u0011¿WÛ\u0004NÑKØ\u0087ÆWäný\u00ad\u0089¶s\u0081|".length();
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
                              e = var6;
                              f = new Integer[13];
                              M = new v8();
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0083(Ô\u0090úA\u008b\u0082\u0019é\u0098Õ>Ñ6\u000e";
                           var5 = "\u0083(Ô\u0090úA\u008b\u0082\u0019é\u0098Õ>Ñ6\u000e".length();
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

               var17 = "ÃÒ\u009aÚ#YâÅq»ÓÑÏ7%I´\b\u008eËº\u001c¨ù$\u001eM·\u0092f_Ô\råé¸´I9 \u0080>`íH\u008f¥)\u0018\u0012%µª\u0019aó+\u009aH(\u0006\u0001!O©E\u000e\u000b*@bÒÎ";
               var19 = "ÃÒ\u009aÚ#YâÅq»ÓÑÏ7%I´\b\u008eËº\u001c¨ù$\u001eM·\u0092f_Ô\råé¸´I9 \u0080>`íH\u008f¥)\u0018\u0012%µª\u0019aó+\u009aH(\u0006\u0001!O©E\u000e\u000b*@bÒÎ".length();
               var16 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 803;
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
            throw new RuntimeException("su/catlean/v8", var10);
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
         throw new RuntimeException("su/catlean/v8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6547;
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
            throw new RuntimeException("su/catlean/v8", var14);
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
         throw new RuntimeException("su/catlean/v8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
