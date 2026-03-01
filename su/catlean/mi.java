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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10014;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_591;
import net.minecraft.class_7833;
import net.minecraft.class_892;
import net.minecraft.class_897;
import net.minecraft.class_9946;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import su.catlean.mixins.accessors.EndCrystalRendererAccessor;

public final class mi {
   @NotNull
   public static final mi B;
   private static String l;
   private static final long a = j0.a(7680854361086086570L, 8798740282846676285L, MethodHandles.lookup().lookupClass()).a(243217383111208L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private mi() {
   }

   public final void c(@NotNull class_4587 stack, @NotNull ic mode, @NotNull Color fillColor, long a, @NotNull Color lineColor, int vDistance, int hDistance) {
      // $FF: Couldn't be decompiled
   }

   public final void v(@NotNull class_4587 stack, int a, @NotNull ic mode, @NotNull Color fillColor, @NotNull Color lineColor, byte a, @NotNull Color friendFillColor, @NotNull Color friendLineColor, int vDistance, int hDistance, int a) {
      // $FF: Couldn't be decompiled
   }

   public final void E(@NotNull class_4587 stack, @NotNull ic mode, @NotNull Color fillColor, long a, @NotNull Color lineColor, @NotNull ArrayList list, int vDistance, int hDistance) {
      // $FF: Couldn't be decompiled
   }

   private final void K(class_4587 param1, class_1297 param2, Color param3, ic param4, ib param5, float param6, int param7, char param8, char param9) {
      // $FF: Couldn't be decompiled
   }

   static void e(mi var0, class_4587 var1, class_1297 var2, Color var3, ic var4, ib var5, float var6, long var7, int var9, Object var10) {
      var7 ^= a;
      long var11 = var7 ^ 108269485206416L;
      long var10001 = var7 ^ 4951842967759L;
      int var13 = (int)((var7 ^ 4951842967759L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      if ((var9 & true.d<invokedynamic>(14556, 216086630693220223L ^ var7)) != 0) {
         var6 = q1.A.s(var11);
      }

      var0.K(var1, var2, var3, var4, var5, var6, var13, (char)var14, (char)var15);
   }

   public final void x(@NotNull class_4587 stack, @NotNull class_591 model, int a, @NotNull class_10055 state, @NotNull class_243 pos, char a, @NotNull Color color, @NotNull ic mode, @NotNull ib polygon, int a) {
      long var11 = ((long)var3 << 32 | (long)var6 << 48 >>> 32 | (long)var10 << 48 >>> 48) ^ a;
      long var10001 = var11 ^ 32220460748031L;
      int var13 = (int)((var11 ^ 32220460748031L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var11 ^ 11973814952361L;
      var10001 = var11 ^ 18493807774685L;
      int var18 = (int)((var11 ^ 18493807774685L) >>> 48);
      int var19 = (int)(var10001 << 16 >>> 48);
      int var20 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(18404, 1933746218807210390L ^ var11));
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(13993, 4187766994200772820L ^ var11));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(22541, 3133219300607503973L ^ var11));
      Intrinsics.checkNotNullParameter(var5, true.v<invokedynamic>(15787, 2402856535822224332L ^ var11));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(6863, 576206584142326968L ^ var11));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(10912, 166149535448620236L ^ var11));
      Intrinsics.checkNotNullParameter(var9, true.v<invokedynamic>(15881, 4498750175238801513L ^ var11));
      mr var22 = new mr(var13, var9, (short)var14, var8, (short)var15, var7);
      var1.method_22903();
      class_4184 var10000 = s8.H((short)var18, (short)var19, var20).method_1561().field_4686;
      Intrinsics.checkNotNull(var10000);
      class_243 var32 = var10000.method_71156();
      Intrinsics.checkNotNullExpressionValue(var32, true.v<invokedynamic>(17235, 4992515555203495211L ^ var11));
      class_243 var23 = var32;
      double var24 = var5.field_1352 - var23.field_1352;
      double var26 = var5.field_1351 - var23.field_1351;
      double var28 = var5.field_1350 - var23.field_1350;
      var10000 = s8.H((short)var18, (short)var19, var20).field_1773.method_19418();
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(23035, 4343000785197084561L ^ var11));
      class_4184 var30 = var10000;
      var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var30.method_19330() + 180.0F));
      String var33 = -5152085667491940004L.A<invokedynamic>(-5152085667491940004L, var11);
      var1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(-var30.method_19329()));
      var1.method_46416((float)var24, (float)var26, (float)var28);
      var1.method_22905(var4.field_53453, var4.field_53453, var4.field_53453);
      lw.l.f(var4, var1, var4.field_53446, var16);
      var1.method_22905(-1.0F, -1.0F, 1.0F);
      var1.method_22905(0.9375F, 0.9375F, 0.9375F);
      var1.method_46416(0.0F, -1.501F, 0.0F);
      var2.method_62110(var4);
      var2.field_3483.field_3665 = false;
      var2.field_3484.field_3665 = false;
      var2.field_3486.field_3665 = false;
      var2.field_3482.field_3665 = false;
      var2.field_3479.field_3665 = false;
      var2.field_3394.field_3665 = false;
      var2.method_60879(var1, (class_4588)var22, true.d<invokedynamic>(16139, 6817273074823475183L ^ var11), 0);
      var1.method_22909();
      String var21 = var33;

      try {
         if (var21 == null) {
            (new int[5]).A<invokedynamic>(new int[5], -5176666865047733357L, var11);
         }

      } catch (NumberFormatException var31) {
         throw var31.A<invokedynamic>(var31, -5049302657864699132L, var11);
      }
   }

   private final void Y(class_4587 var1, class_1297 var2, Color var3, ic var4, ib var5, long var6, float var8) {
      var6 ^= a;
      long var10001 = var6 ^ 29229849026955L;
      int var9 = (int)((var6 ^ 29229849026955L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var6 ^ 68554219323813L;
      var10001 = var6 ^ 25330090600105L;
      int var14 = (int)((var6 ^ 25330090600105L) >>> 48);
      int var15 = (int)(var10001 << 16 >>> 48);
      int var16 = (int)(var10001 << 32 >>> 32);

      try {
         if (!(var2 instanceof class_1511)) {
            return;
         }
      } catch (NumberFormatException var29) {
         throw var29.A<invokedynamic>(var29, 1484290276080180848L, var6);
      }

      mr var17 = new mr(var9, var5, (short)var10, var4, (short)var11, var3);
      class_897 var10000 = s8.H((short)var14, (short)var15, var16).method_1561().method_3953(var2);
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(9718, 3891641793875410685L ^ var6));
      class_897 var18 = var10000;
      class_9946 var19 = ((EndCrystalRendererAccessor)((class_892)var18)).getModel();
      class_10017 var30 = ((class_892)var18).method_62425(var2, q1.A.s(var12));
      Intrinsics.checkNotNullExpressionValue(var30, true.v<invokedynamic>(7308, 2698898734672856986L ^ var6));
      class_10014 var20 = (class_10014)var30;
      class_4184 var31 = s8.H((short)var14, (short)var15, var16).method_1561().field_4686;
      Intrinsics.checkNotNull(var31);
      class_243 var32 = var31.method_71156();
      Intrinsics.checkNotNullExpressionValue(var32, true.v<invokedynamic>(12926, 4736945602751981940L ^ var6));
      class_243 var21 = var32;
      double var22 = ((class_1511)var2).method_23317() - var21.field_1352;
      double var24 = ((class_1511)var2).method_23318() - var21.field_1351;
      double var26 = ((class_1511)var2).method_23321() - var21.field_1350;
      var1.method_22903();
      var31 = s8.H((short)var14, (short)var15, var16).field_1773.method_19418();
      Intrinsics.checkNotNullExpressionValue(var31, true.v<invokedynamic>(11886, 4673664798548718944L ^ var6));
      class_4184 var28 = var31;
      var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var28.method_19330() + 180.0F));
      var1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(-var28.method_19329()));
      var1.method_22904(var22, var24, var26);
      var1.method_22905(var8, var8, var8);
      var1.method_22905(2.0F, 2.0F, 2.0F);
      var1.method_46416(0.0F, -0.5F, 0.0F);
      var19.method_62083(var20);
      var19.method_60879(var1, (class_4588)var17, true.d<invokedynamic>(9131, 7965438666581548602L ^ var6), 0);
      var1.method_22909();
   }

   static {
      long var20 = a ^ 39321179134666L;
      d = new HashMap(13);
      "wWwHub".A<invokedynamic>("wWwHub", 1552800462550705429L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[29];
      int var16 = 0;
      String var15 = " \u0016Í22\u009c~Ä\bÔ\u0014\u0080¸ \u001dk ÇÁð^ü\u0007¹ÅÜÆífÚùu\u001a\u0002\u000ft7\u0083°,\u0015^\u0017Xî\u009c\u009e@\u009b\u0010\u0000ÒûÉ5Å~(B3\u0087ÁÙÜV& ïúg\u009e¿yi?ÛV\u0084=h{\u000eTÉ\u009a°<+\u0014Y\u0080\u009c\u0007{[:+Ïf(FÞFthV\u0017\u0007\u0099ó8oß} R\u0083¨\r\u0082Õ\u0003áFi7,Ci\fpû,G\u0012¦\u008f×\u009eQ òl§ëÓ\u0014\u0004\u0097ä.À\u0098\u0086ü¢\u0093a×<¦Ý\u001d\u0086SY×pô¿\u008a\u001d\u0014\u0010©Ò\u0018î^\u008c¼\u0010D%\b¿µe·\u008d\u0018>}\u009e» Þ¨÷\u00adÇ\u0002ñTçD[¥öâÍ.Oý\" sMÁ-ÊNò\u000eP\u001bÈ\u0092\u001dô#>29\u0091j9è¬îí(\u0098\u0092kt\u0089¼\u0010^\u00170\u0004\u0099\t5µ\u008aÚ7\u0011\u0016ú^ª\u0010©ÕP\u008f·\u009cñXÛËÏXN_W> [e\t\u0099ÜÂ\n¢þäZªÙ\u0097Ï½\u001b\u0095èBÖmÞAý\u001c\u009e\u0083¡É`ä(»)ª\u008aV\u000b\u009dÿégÉ.O\u0090ò\u009eôF8Æ!agÅõm~:\u008e\u0099Ð2ß\u001bÇá®#ß£\u0010_æþ7SÀ]ÎJ»o\u008b\u009dßÎ0\u0010é½ÿ\u0002Ù1D3Ú»·\u0080\u0099U\tTĈMÅ\u007f\u0097`\u000b.ø\u001a]\u0012êâñ\u009eê\u0088àõªO^V\u0084àK±r\u009e\u009a\u008aOn5\u0095¢!t6¡\u008a\u0017\u008c@\u0088ÿÎ\u001bÒ\u0085\u0005A\u009a'Q»Þæ\u0011'ì|ð\u0016=\b\u008dröb\u001f\u0012\u0000.b\u0097>u\u00033y8\u0004Î\u0096|ð\\\u0092Þ¹I\u0000Å³'E£¼\u0001\u0084%Àß³d$\bYGKEMfhg\u0092A8¼tïr($:Û|\\\u0098¥ã\u001b\\,\u0099 8Ý\u0002¥\u008b§ßÐ\u0015p¾{gj@7nÇ÷©Î\u0001AÇÌ¬ê!Hu¥Få0G\u0099~Ãw\u00adµ+$&OuÈz²<b_\u001fp¾¼jÓÉ±\u000fÜ\u001cT+5ØJüHùB\u0081|à>\u0098þó¤\u008f4úä&\"[¤Â-\u008bkì'\u009eaol½\u001cè\u0084ý\u0096p\u0007\u008eÈÁ\u0013È\u009f\u0083\u001dvcÊ\u0086õü¡k\nâ\u008f\u0003E PÀ)í£5åL~ôû¢¨9\u0016°»\u0007ó¸Ëß\u0016G¢bÞxsÙ¤b(¿\u008d-tY\u009c¨\u0097x\u0015lcÐãü\bÛlú%\"x\u0082$:\u0095\u0087Y\u009b\u0016SI\u0083\u001c\u008fÌ\u0096Ü8\u00ad A\"°\u001ezëÙ';ÂæÝ\u0005²bÅ\u00ad\"\u009bÝÞÇ Ø\u0016\u0002ÆéOx]Ü\u0010÷\u008fêv¯×\u001e\u009azíøº\u008e&\u0096ü(\u0006\u000e\u009c£ 5Gç7Öyñ=Ye¨¸V°  \u0002E¡OØQ8dÈ\u000f2«\u0088\u0000¦çw\u0010\f °\u0011\u0087\u0007ËÒ8xü¶ßÕ¿¾ÊÖ\u0010æ5b¸!\u0002Ýò\u000beYU\u0096½ÒO@H\u0084jrû\u0091 ÌÍ¶ã¿à\u001c;2\u0092\u009c\u0017u¾\u0094\u0083ç\u000f÷Ó½ªàê-uÖ\u009a¢f\u00adP8¨ÔéÆïïY\u000bVj~\u0000gvÂñ\u009cOt\u0084®_\u0099\në\u0095¬\u0003OP_èMI\u0018ß[#n·Å/\u0010Í\u0017Äé\u0093C_¸{Oåké®á_;\u0014Fhô \u0006éVÏ\u0002\u0096kNLcvh\u0001ë\u001b\u001e\u0080\u0019\u00ad\u0085± ýé\u0019Ý\u0013\u0017d×ñ\u0094#R\u00183i\u0097\u0080E\u009c\u0083\u0082l+k\u000fà\u0099¥\u0013ß4\u009b\u0018`æ0\u0001\u0093Rx\u001a\u0093o\u00ad(8Öç/\u008bà\u008f\u0087DÜÍ\u00870ôKTçÆIé]}+Ja\u0080b=\u000e^ÊÆBEÅ¼ï\u0002\u001b\u0092)ëýÇÄC\u0080¨\u0096â&pðz\u0011t´\u0018£ûÂ\u0010\u0017\u0082\u0006@#¨r\u007f\nka{XEV#\u0018UÖíp,Qª\u00ad#Ðíeê\u008b®\rKO]SÑ±C\u0094";
      int var17 = " \u0016Í22\u009c~Ä\bÔ\u0014\u0080¸ \u001dk ÇÁð^ü\u0007¹ÅÜÆífÚùu\u001a\u0002\u000ft7\u0083°,\u0015^\u0017Xî\u009c\u009e@\u009b\u0010\u0000ÒûÉ5Å~(B3\u0087ÁÙÜV& ïúg\u009e¿yi?ÛV\u0084=h{\u000eTÉ\u009a°<+\u0014Y\u0080\u009c\u0007{[:+Ïf(FÞFthV\u0017\u0007\u0099ó8oß} R\u0083¨\r\u0082Õ\u0003áFi7,Ci\fpû,G\u0012¦\u008f×\u009eQ òl§ëÓ\u0014\u0004\u0097ä.À\u0098\u0086ü¢\u0093a×<¦Ý\u001d\u0086SY×pô¿\u008a\u001d\u0014\u0010©Ò\u0018î^\u008c¼\u0010D%\b¿µe·\u008d\u0018>}\u009e» Þ¨÷\u00adÇ\u0002ñTçD[¥öâÍ.Oý\" sMÁ-ÊNò\u000eP\u001bÈ\u0092\u001dô#>29\u0091j9è¬îí(\u0098\u0092kt\u0089¼\u0010^\u00170\u0004\u0099\t5µ\u008aÚ7\u0011\u0016ú^ª\u0010©ÕP\u008f·\u009cñXÛËÏXN_W> [e\t\u0099ÜÂ\n¢þäZªÙ\u0097Ï½\u001b\u0095èBÖmÞAý\u001c\u009e\u0083¡É`ä(»)ª\u008aV\u000b\u009dÿégÉ.O\u0090ò\u009eôF8Æ!agÅõm~:\u008e\u0099Ð2ß\u001bÇá®#ß£\u0010_æþ7SÀ]ÎJ»o\u008b\u009dßÎ0\u0010é½ÿ\u0002Ù1D3Ú»·\u0080\u0099U\tTĈMÅ\u007f\u0097`\u000b.ø\u001a]\u0012êâñ\u009eê\u0088àõªO^V\u0084àK±r\u009e\u009a\u008aOn5\u0095¢!t6¡\u008a\u0017\u008c@\u0088ÿÎ\u001bÒ\u0085\u0005A\u009a'Q»Þæ\u0011'ì|ð\u0016=\b\u008dröb\u001f\u0012\u0000.b\u0097>u\u00033y8\u0004Î\u0096|ð\\\u0092Þ¹I\u0000Å³'E£¼\u0001\u0084%Àß³d$\bYGKEMfhg\u0092A8¼tïr($:Û|\\\u0098¥ã\u001b\\,\u0099 8Ý\u0002¥\u008b§ßÐ\u0015p¾{gj@7nÇ÷©Î\u0001AÇÌ¬ê!Hu¥Få0G\u0099~Ãw\u00adµ+$&OuÈz²<b_\u001fp¾¼jÓÉ±\u000fÜ\u001cT+5ØJüHùB\u0081|à>\u0098þó¤\u008f4úä&\"[¤Â-\u008bkì'\u009eaol½\u001cè\u0084ý\u0096p\u0007\u008eÈÁ\u0013È\u009f\u0083\u001dvcÊ\u0086õü¡k\nâ\u008f\u0003E PÀ)í£5åL~ôû¢¨9\u0016°»\u0007ó¸Ëß\u0016G¢bÞxsÙ¤b(¿\u008d-tY\u009c¨\u0097x\u0015lcÐãü\bÛlú%\"x\u0082$:\u0095\u0087Y\u009b\u0016SI\u0083\u001c\u008fÌ\u0096Ü8\u00ad A\"°\u001ezëÙ';ÂæÝ\u0005²bÅ\u00ad\"\u009bÝÞÇ Ø\u0016\u0002ÆéOx]Ü\u0010÷\u008fêv¯×\u001e\u009azíøº\u008e&\u0096ü(\u0006\u000e\u009c£ 5Gç7Öyñ=Ye¨¸V°  \u0002E¡OØQ8dÈ\u000f2«\u0088\u0000¦çw\u0010\f °\u0011\u0087\u0007ËÒ8xü¶ßÕ¿¾ÊÖ\u0010æ5b¸!\u0002Ýò\u000beYU\u0096½ÒO@H\u0084jrû\u0091 ÌÍ¶ã¿à\u001c;2\u0092\u009c\u0017u¾\u0094\u0083ç\u000f÷Ó½ªàê-uÖ\u009a¢f\u00adP8¨ÔéÆïïY\u000bVj~\u0000gvÂñ\u009cOt\u0084®_\u0099\në\u0095¬\u0003OP_èMI\u0018ß[#n·Å/\u0010Í\u0017Äé\u0093C_¸{Oåké®á_;\u0014Fhô \u0006éVÏ\u0002\u0096kNLcvh\u0001ë\u001b\u001e\u0080\u0019\u00ad\u0085± ýé\u0019Ý\u0013\u0017d×ñ\u0094#R\u00183i\u0097\u0080E\u009c\u0083\u0082l+k\u000fà\u0099¥\u0013ß4\u009b\u0018`æ0\u0001\u0093Rx\u001a\u0093o\u00ad(8Öç/\u008bà\u008f\u0087DÜÍ\u00870ôKTçÆIé]}+Ja\u0080b=\u000e^ÊÆBEÅ¼ï\u0002\u001b\u0092)ëýÇÄC\u0080¨\u0096â&pðz\u0011t´\u0018£ûÂ\u0010\u0017\u0082\u0006@#¨r\u007f\nka{XEV#\u0018UÖíp,Qª\u00ad#Ðíeê\u008b®\rKO]SÑ±C\u0094".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[29];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "Æý&\u00ad\u0097X_ÅÍ\u001f2O\u008d+r\u0003p\u0010Vh]D\u0092 \u001cú\u0096n'éEN\u001bÆfÿºÒJ|ý(\u0094o\u0099+Õ\r¾PÖÝ~B=q\u0086Ì\tV´¶\u0002¡iø\u0013óßÀ&`";
                  int var5 = "Æý&\u00ad\u0097X_ÅÍ\u001f2O\u008d+r\u0003p\u0010Vh]D\u0092 \u001cú\u0096n'éEN\u001bÆfÿºÒJ|ý(\u0094o\u0099+Õ\r¾PÖÝ~B=q\u0086Ì\tV´¶\u0002¡iø\u0013óßÀ&`".length();
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
                              f = new Integer[11];
                              B = new mi();
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "°jXM\u0018\u001fÕt³ò\u00169ùFFÍ";
                           var5 = "°jXM\u0018\u001fÕt³ò\u00169ùFFÍ".length();
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

               var15 = "\u007fÀW\u008c\u000bÿ\u008egÜ\u0099²N\u007fY\u0002¯ùÊÙ\u0005»ãÚk\u008e\u009a\u0084û\f5_ZsDCä\u0010^\u0081ì$ÑL\u0019+é¾\u007f\u008e\u0082º3á?\u007fñ\u00102¿~ã×ËT:*<V\u0084þ\u009f\u00ad\u000e";
               var17 = "\u007fÀW\u008c\u000bÿ\u008egÜ\u0099²N\u007fY\u0002¯ùÊÙ\u0005»ãÚk\u008e\u009a\u0084û\f5_ZsDCä\u0010^\u0081ì$ÑL\u0019+é¾\u007f\u008e\u0082º3á?\u007fñ\u00102¿~ã×ËT:*<V\u0084þ\u009f\u00ad\u000e".length();
               var14 = '8';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void z(String var0) {
      l = var0;
   }

   public static String p() {
      return l;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20330;
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
            throw new RuntimeException("su/catlean/mi", var10);
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
         throw new RuntimeException("su/catlean/mi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10724;
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
            throw new RuntimeException("su/catlean/mi", var14);
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
         throw new RuntimeException("su/catlean/mi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
