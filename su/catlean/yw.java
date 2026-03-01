package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.gofra.Flow;

public final class yw extends k9 {
   @NotNull
   public static final yw M;
   // $FF: synthetic field
   static final KProperty[] S;
   @NotNull
   private static final zl e;
   @NotNull
   private static final zl Y;
   @NotNull
   private static final zl x;
   @NotNull
   private static final zl Q;
   @NotNull
   private static final zl N;
   @NotNull
   private static final zo m;
   private static final long b = j0.a(-7551820279198574366L, 7486190491675120994L, MethodHandles.lookup().lookupClass()).a(182603102473544L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;

   private yw(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 114180104557447L;
      super(var3, true.z<invokedynamic>(31136, 7991305902959269760L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final String y(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 27306259353086L;
      int var6 = (int)((var4 ^ 27306259353086L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (String)e.k((short)var6, this, S[0], (short)var7, var8);
   }

   private final String V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 5871054251597L;
      int var3 = (int)((var1 ^ 5871054251597L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)Y.k((short)var3, this, S[1], (short)var4, var5);
   }

   private final String G(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 60274271178854L;
      int var3 = (int)((var1 ^ 60274271178854L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)x.k((short)var3, this, S[2], (short)var4, var5);
   }

   private final String j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 111452117490979L;
      int var3 = (int)((var1 ^ 111452117490979L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)Q.k((short)var3, this, S[3], (short)var4, var5);
   }

   private final String H(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 16944362291913L;
      int var3 = (int)((var1 ^ 16944362291913L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)N.k((short)var3, this, S[4], (short)var4, var5);
   }

   private final boolean f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 50466209777033L;
      int var3 = (int)((var1 ^ 50466209777033L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var3, this, S[5], (short)var4, var5);
   }

   @Flow
   public final void H(@NotNull ScreenEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final String O(char var1, int var2, String var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 133822642217662L;
      int var7 = (int)((var5 ^ 133822642217662L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var5 ^ 107868448820838L;
      var10001 = var5 ^ 64446065395339L;
      int var12 = (int)((var5 ^ 64446065395339L) >>> 32);
      int var13 = (int)(var10001 << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      String var15 = true.z<invokedynamic>(10617, 4001186931583737819L ^ var5);

      try {
         String var10000 = (new SimpleDateFormat(this.H(var10))).format(new Date());
         Intrinsics.checkNotNullExpressionValue(var10000, true.z<invokedynamic>(3304, 6304877167395830358L ^ var5));
         var15 = var10000;
      } catch (Exception var17) {
         ha.F((k9)this, var12, var13, class_124.field_1061 + true.z<invokedynamic>(7885, 2247148495226398846L ^ var5), false, 2, (Object)null, var14);
      }

      String var18 = 4158.z<invokedynamic>(4158, 8113162926566041224L ^ var5);
      String var10002 = s8.H((short)var7, (short)var8, var9).method_1548().method_1676();
      Intrinsics.checkNotNullExpressionValue(var10002, true.z<invokedynamic>(5152, 2316001534601454234L ^ var5));
      return StringsKt.replace$default(StringsKt.replace$default(var3, var18, var10002, false, 4, (Object)null), true.z<invokedynamic>(3230, 3636949657217006138L ^ var5), var15, false, 4, (Object)null);
   }

   private final boolean u(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean Q() {
      long var0 = b ^ 105560095526049L;
      long var2 = var0 ^ 52004663393098L;
      return M.u(var2);
   }

   static {
      long var20 = b ^ 24219300862721L;
      long var22 = var20 ^ 42889380795386L;
      long var24 = var20 ^ 66187879116510L;
      long var26 = var20 ^ 49031885968820L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[32];
      int var16 = 0;
      String var15 = "6½¾R\tÓ'± CIGº\u0017ÔÁ \u0093\u0098ÛÇÕøõ+ãÊØ6Ïvð6\b@Ì ôe{Eè\u0017\u0011¤\u008b\\\rn\u0010ÕöÅå¼¢\thÈaÑý¾3BÒ m¿\u0018Ìk\u009c^x Oxö=f·ø\u009beÝËzú`\u0088hWçª\u0019>üt\u0010\u0086°êR\u0010óSl\u0011\u009aÌADk²*83pñ]\u0081Úºô\u0005H\u0010µ\u008b0Å¶¨\u000f.ÿÌ:Õ}PkX\u0017OVí\u0005\b%õâý&U\u0017¨gm\u0017^è\b\u000b9í\u0004\u008d\u0003Ö\"\u0012\u0010\u0015:\u0010\u0016\u008b¿îâûYe\u0081\u0088¬Ä\u0096\u0018H~|^4»<Ýt¿\u008b\u0013áÃ<Kô\u0096yÓ(dS\u0096\u0088\u0017à¯(iTYcs_X\u000fb±\u007fö*¥vê+%%ûû\u0095\u000e\u0016.Óò\u0013<y<\u0004x?\u0084/Ä¥\u0015\u000f#*#\u0006nÒ\n\u0086\u0016t]æ>p(¿\u0099Þ\u0002tõäy\u0085#R\u009fî}Â52Ó\u00adÏ\u0002\u0092\u0012J;\u0088ÌÚwôð_´g^\u001d¥ÇçÒ¹f\u0085WF\u008e0\r+wì\u0007\u008aG¿¶èQ·@T#\u0010\u001cÐ7\\ÕqÕ\b\u008f§¼t\u0094á\u0010\u0012O\u001f\u0082A¨b×·±b\u001e.ÛûÖ04¾[cy:DG[9Ýç\u001f\u0018\u0089\u001a)6Ïª¹\u009d2p\u0089ø&K}°ó\rAó¯\u009f/t\u001cM\u0092]\u0019)\tÜ_C\u0018üR¬I\u0097P\u0018nË¶\u000f¡ D\u0093Ô^\u0006o%\u009dZÍW jùã\u0097|t \u0011úJ§üî¨Ò¨\r¤\u0085»\u009f\u0000Çê\u0098#e\t$ú\u0094ñ0\u000b\u00811ÉRZÃpåÖùÇUrE¸élù\u0087\u0096\u000e½ãacw|ùßMa\u0010ï3Ê\u009e©\u0016\u000b{<\u001dÕàé\u0085ù8µã¯`\n\u0091y©Ï\u009b\u0094ª\u000b/xWÂ\f7 M\n#ëÅ\u008d>ÐKw\rúOB-E\u0085Ö\u0085Q\u0089Ió§èP\u008c.á§`ÊNO¥g\u0010):c\u0087èÑ\u00051d\u0085-¡t´\u001b\" uÆ&@\u008b\u0018¼%\u001d\u009cæ^l´\u0086Ìv\u007f\u0001Häüª¼!\u008cÊÍ\f¯\u000fw\u0018\u001b¹ì\u009b\u00045ç3Ý9I\u001c÷ùwµJ\u0007Â§æ\u001b\u0086\u00008b\u001e\u008a¹íÐv2\u0095r3ÚôyÚW\u008d\u00851¨\u001e\u0085Ò_\u000ea\u00adô^`\u0015k8BGñ\u0011ï»Ï\u0094â>ÎÏn\u008b\u0082.ôîâÊ\u0097É¡8\u001d4*\u0006\\ÈÏ\u008dÌ\u008e9\u0013Ú# \u0017@yuÓ(j{'ùí\u008aÆªFÄûB´ \u0091É+J¥Ý\u008d÷´ò\u0018Á\u000fø+ÇT7÷\u008aJ °-N»\u0081\u0081\u007fF#ª0¬+\u008eöyAC#\u008dM<\b\u0089Mó¢Ò\n\u0015\u000e\u0085\u0018t&®g»\u007f\u0003íÒÓ\u0016\u0095\u0014¼\u008f2Ôøû\u009ecdÆ\u001b\u0010Ö\u001e\u0085èÚ·¶ß&\\v¨]\u0015¶¦\u0010\u0017\u001f\u0000z\u0094¶u\u001fÏ\u001c,\u0004J6\u001ap «¿×\u009cd«\b\u0017NÇ\u0013§{\u0014æIãÐwø\u009e\u0090õ2\u000fûyU×o\u0012£\u0010|º<d\u0085Z\u0000ß\u0012?*\u009cþNã\u0081\u0018%,V5:\t}\u001a\u0006\u001e?Lßl\u0096%¨\u0091\u009c\u0080\u0010\u0015\u0098³\u0018Gß\u0080ó\u009d\u0018v¶¯\u009dq¿\u0013Z~eÕÆÌ\u0093^\u008f\u0084^\u0010\u0014vBy\u008b:©0\u0017êVæX\u0093ú\u000f\u0010\u0002<Ó\u0086ô\u0095Ôÿ\u0092\u0082úô\nN²\u000b";
      int var17 = "6½¾R\tÓ'± CIGº\u0017ÔÁ \u0093\u0098ÛÇÕøõ+ãÊØ6Ïvð6\b@Ì ôe{Eè\u0017\u0011¤\u008b\\\rn\u0010ÕöÅå¼¢\thÈaÑý¾3BÒ m¿\u0018Ìk\u009c^x Oxö=f·ø\u009beÝËzú`\u0088hWçª\u0019>üt\u0010\u0086°êR\u0010óSl\u0011\u009aÌADk²*83pñ]\u0081Úºô\u0005H\u0010µ\u008b0Å¶¨\u000f.ÿÌ:Õ}PkX\u0017OVí\u0005\b%õâý&U\u0017¨gm\u0017^è\b\u000b9í\u0004\u008d\u0003Ö\"\u0012\u0010\u0015:\u0010\u0016\u008b¿îâûYe\u0081\u0088¬Ä\u0096\u0018H~|^4»<Ýt¿\u008b\u0013áÃ<Kô\u0096yÓ(dS\u0096\u0088\u0017à¯(iTYcs_X\u000fb±\u007fö*¥vê+%%ûû\u0095\u000e\u0016.Óò\u0013<y<\u0004x?\u0084/Ä¥\u0015\u000f#*#\u0006nÒ\n\u0086\u0016t]æ>p(¿\u0099Þ\u0002tõäy\u0085#R\u009fî}Â52Ó\u00adÏ\u0002\u0092\u0012J;\u0088ÌÚwôð_´g^\u001d¥ÇçÒ¹f\u0085WF\u008e0\r+wì\u0007\u008aG¿¶èQ·@T#\u0010\u001cÐ7\\ÕqÕ\b\u008f§¼t\u0094á\u0010\u0012O\u001f\u0082A¨b×·±b\u001e.ÛûÖ04¾[cy:DG[9Ýç\u001f\u0018\u0089\u001a)6Ïª¹\u009d2p\u0089ø&K}°ó\rAó¯\u009f/t\u001cM\u0092]\u0019)\tÜ_C\u0018üR¬I\u0097P\u0018nË¶\u000f¡ D\u0093Ô^\u0006o%\u009dZÍW jùã\u0097|t \u0011úJ§üî¨Ò¨\r¤\u0085»\u009f\u0000Çê\u0098#e\t$ú\u0094ñ0\u000b\u00811ÉRZÃpåÖùÇUrE¸élù\u0087\u0096\u000e½ãacw|ùßMa\u0010ï3Ê\u009e©\u0016\u000b{<\u001dÕàé\u0085ù8µã¯`\n\u0091y©Ï\u009b\u0094ª\u000b/xWÂ\f7 M\n#ëÅ\u008d>ÐKw\rúOB-E\u0085Ö\u0085Q\u0089Ió§èP\u008c.á§`ÊNO¥g\u0010):c\u0087èÑ\u00051d\u0085-¡t´\u001b\" uÆ&@\u008b\u0018¼%\u001d\u009cæ^l´\u0086Ìv\u007f\u0001Häüª¼!\u008cÊÍ\f¯\u000fw\u0018\u001b¹ì\u009b\u00045ç3Ý9I\u001c÷ùwµJ\u0007Â§æ\u001b\u0086\u00008b\u001e\u008a¹íÐv2\u0095r3ÚôyÚW\u008d\u00851¨\u001e\u0085Ò_\u000ea\u00adô^`\u0015k8BGñ\u0011ï»Ï\u0094â>ÎÏn\u008b\u0082.ôîâÊ\u0097É¡8\u001d4*\u0006\\ÈÏ\u008dÌ\u008e9\u0013Ú# \u0017@yuÓ(j{'ùí\u008aÆªFÄûB´ \u0091É+J¥Ý\u008d÷´ò\u0018Á\u000fø+ÇT7÷\u008aJ °-N»\u0081\u0081\u007fF#ª0¬+\u008eöyAC#\u008dM<\b\u0089Mó¢Ò\n\u0015\u000e\u0085\u0018t&®g»\u007f\u0003íÒÓ\u0016\u0095\u0014¼\u008f2Ôøû\u009ecdÆ\u001b\u0010Ö\u001e\u0085èÚ·¶ß&\\v¨]\u0015¶¦\u0010\u0017\u001f\u0000z\u0094¶u\u001fÏ\u001c,\u0004J6\u001ap «¿×\u009cd«\b\u0017NÇ\u0013§{\u0014æIãÐwø\u009e\u0090õ2\u000fûyU×o\u0012£\u0010|º<d\u0085Z\u0000ß\u0012?*\u009cþNã\u0081\u0018%,V5:\t}\u001a\u0006\u001e?Lßl\u0096%¨\u0091\u009c\u0080\u0010\u0015\u0098³\u0018Gß\u0080ó\u009d\u0018v¶¯\u009dq¿\u0013Z~eÕÆÌ\u0093^\u008f\u0084^\u0010\u0014vBy\u008b:©0\u0017êVæX\u0093ú\u000f\u0010\u0002<Ó\u0086ô\u0095Ôÿ\u0092\u0082úô\nN²\u000b".length();
      char var14 = 16;
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[32];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[3];
                  int var4 = 0;
                  String var5 = "/Å4è\u0091\u0018\u0016ú£Í\u009eðî¥ÊK¯\u0011'\u0091\u009b\u0086Z\u0013";
                  int var6 = "/Å4è\u0091\u0018\u0016ú£Í\u009eðî¥ÊK¯\u0011'\u0091\u009b\u0086Z\u0013".length();
                  int var3 = 0;

                  do {
                     int var32 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var32, var3).getBytes("ISO-8859-1");
                     var32 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var0[var32] = var10004;
                  } while(var3 < var6);

                  KProperty[] var28 = new KProperty[(int)var0[0]];
                  var28[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yw.class, true.z<invokedynamic>(20539, 8631158873585632252L ^ var20), true.z<invokedynamic>(2502, 8808685087231121925L ^ var20), 0)));
                  var28[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yw.class, true.z<invokedynamic>(12785, 7251147532775989793L ^ var20), true.z<invokedynamic>(6469, 5212242851108948633L ^ var20), 0)));
                  var28[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yw.class, true.z<invokedynamic>(21860, 7547309486632289957L ^ var20), true.z<invokedynamic>(26992, 2782749150751095476L ^ var20), 0)));
                  var28[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yw.class, true.z<invokedynamic>(17093, 4440799355203047695L ^ var20), true.z<invokedynamic>(14145, 8929276608851027100L ^ var20), 0)));
                  var28[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yw.class, true.z<invokedynamic>(1906, 8532856282134779048L ^ var20), true.z<invokedynamic>(10249, 4437806024803662786L ^ var20), 0)));
                  var28[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yw.class, true.z<invokedynamic>(10336, 3022209613719550894L ^ var20), true.z<invokedynamic>(28143, 3686992565157002800L ^ var20), 0)));
                  S = var28;
                  M = new yw(var22);
                  e = qi.P((il)M, true.z<invokedynamic>(27751, 5267686154238918590L ^ var20), var24, true.z<invokedynamic>(26511, 4660636577932702810L ^ var20), (pj)null, (Function0)null, (int)var0[1], (Object)null);
                  Y = qi.P((il)M, true.z<invokedynamic>(12043, 931990640597351635L ^ var20), var24, true.z<invokedynamic>(18432, 8076031359788866523L ^ var20), (pj)null, (Function0)null, (int)var0[2], (Object)null);
                  x = qi.P((il)M, true.z<invokedynamic>(10593, 4167733017665288883L ^ var20), var24, true.z<invokedynamic>(23963, 2853723344795127385L ^ var20), (pj)null, (Function0)null, (int)var0[2], (Object)null);
                  Q = qi.P((il)M, true.z<invokedynamic>(31485, 8238427571070527793L ^ var20), var24, true.z<invokedynamic>(3230, 3637012894926839625L ^ var20), (pj)null, (Function0)null, (int)var0[2], (Object)null);
                  N = qi.P((il)M, true.z<invokedynamic>(27087, 8809234360974670353L ^ var20), var24, true.z<invokedynamic>(15228, 1378577035378469032L ^ var20), (pj)null, yw::Q, 4, (Object)null);
                  m = qi.R((il)M, true.z<invokedynamic>(1627, 6951080354058802568L ^ var20), false, (pj)null, (Function0)null, (int)var0[2], var26, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "Î\u0083\"Ö\u000bÕÞ\u0001×^×º\u0081\u0095\u0082Ô 3î£è1ð3¬ Ê\u0093\u008eó\u000eäìs\u001c\n\u008c\u0084µ}\u0002\u0089äà÷\u00ad°\u0094\u009b";
               var17 = "Î\u0083\"Ö\u000bÕÞ\u0001×^×º\u0081\u0095\u0082Ô 3î£è1ð3¬ Ê\u0093\u008eó\u000eäìs\u001c\n\u008c\u0084µ}\u0002\u0089äà÷\u00ad°\u0094\u009b".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26330;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yw", var10);
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
         throw new RuntimeException("su/catlean/yw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
