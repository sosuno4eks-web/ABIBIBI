package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yf extends k9 {
   @NotNull
   public static final yf c;
   static final KProperty[] I;
   @NotNull
   private static final zr V;
   @NotNull
   private static final zr L;
   @NotNull
   private static final z0 J;
   @NotNull
   private static final z0 b;
   @NotNull
   private static final zc U;
   @NotNull
   private static final zc x;
   @NotNull
   private static final zc u;
   @NotNull
   private static final zo q;
   private static float k;
   private static float i;
   private static float g;
   private static float o;
   private static final long d = j0.a(4369804726046923126L, 3212839184083307035L, MethodHandles.lookup().lookupClass()).a(278405090207868L);
   private static final String[] e;
   private static final String[] f;
   private static final Map l;
   private static final long[] m;
   private static final Integer[] n;
   private static final Map r;

   private yf(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ d;
      long var6 = var4 ^ 95232451068072L;
      super(var6, true.e<invokedynamic>(29988, 3919984724870813485L ^ var4), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final p p(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 134385628468675L;
      int var3 = (int)((var1 ^ 134385628468675L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (p)V.k((short)var3, this, I[0], (short)var4, var5);
   }

   private final p G(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 58306835467882L;
      int var3 = (int)((var1 ^ 58306835467882L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (p)L.k((short)var3, this, I[1], (short)var4, var5);
   }

   private final int i(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 74910512666348L;
      int var3 = (int)((var1 ^ 74910512666348L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)J.k((short)var3, this, I[2], (short)var4, var5)).intValue();
   }

   private final void w(int var1, long var2) {
      var2 ^= d;
      long var10001 = var2 ^ 57903191354564L;
      int var4 = (int)((var2 ^ 57903191354564L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      J.P(this, var4, I[2], (short)var5, var1, (short)var6);
   }

   private final int H(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 119075270020559L;
      int var3 = (int)((var1 ^ 119075270020559L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)b.k((short)var3, this, I[3], (short)var4, var5)).intValue();
   }

   private final void I(int var1, long var2) {
      var2 ^= d;
      long var10001 = var2 ^ 58209361863682L;
      int var4 = (int)((var2 ^ 58209361863682L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      b.P(this, var4, I[3], (short)var5, var1, (short)var6);
   }

   private final float U(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
      long var10001 = var4 ^ 109738179419206L;
      int var6 = (int)((var4 ^ 109738179419206L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)U.k((short)var6, this, I[4], (short)var7, var8)).floatValue();
   }

   private final void c(float var1, long var2) {
      var2 ^= d;
      long var10001 = var2 ^ 96965237866902L;
      int var4 = (int)((var2 ^ 96965237866902L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      U.P(this, var4, I[4], (short)var5, var1, (short)var6);
   }

   private final float c(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ d;
      long var10001 = var4 ^ 92754200118055L;
      int var6 = (int)((var4 ^ 92754200118055L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)x.k((short)var6, this, I[5], (short)var7, var8)).floatValue();
   }

   private final void i(float var1, long var2) {
      var2 ^= d;
      long var10001 = var2 ^ 47121129564920L;
      int var4 = (int)((var2 ^ 47121129564920L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      x.P(this, var4, I[5], (short)var5, var1, (short)var6);
   }

   private final float P(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 8356339304187L;
      int var3 = (int)((var1 ^ 8356339304187L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)u.k((short)var3, this, I[true.c<invokedynamic>(16455, 8028703444354101131L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final void h(float var1, long var2) {
      var2 ^= d;
      long var10001 = var2 ^ 103064337843199L;
      int var4 = (int)((var2 ^ 103064337843199L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      u.P(this, var4, I[true.c<invokedynamic>(16455, 8028791630658673301L ^ var2)], (short)var5, var1, (short)var6);
   }

   private final boolean m(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 1218595594500L;
      int var3 = (int)((var1 ^ 1218595594500L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)q.k((short)var3, this, I[true.c<invokedynamic>(17754, 2815644987520519530L ^ var1)], (short)var4, var5);
   }

   @Flow(
      priority = 10
   )
   private final void p(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = d ^ 47867846448960L;
      long var22 = var20 ^ 46498886502846L;
      long var10001 = var20 ^ 48153992498324L;
      int var24 = (int)((var20 ^ 48153992498324L) >>> 48);
      int var25 = (int)(var10001 << 16 >>> 32);
      int var26 = (int)(var10001 << 48 >>> 48);
      long var27 = var20 ^ 69270328869003L;
      long var29 = var20 ^ 98068362394479L;
      long var31 = var20 ^ 14511498020728L;
      l = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[25];
      int var16 = 0;
      String var15 = "i¾4\u0084é\u008eH9\u0086ø\u0080\u0081°\f\u0087s\u000f\f{\u00064Ë¬Ì\u0010\u008d\u0085Mv}c¢,ù(\u0010Çm\u009d¬G\u0018 Ç¥Lc\u00058Æ¾§ß%ÿ·WÃ\u0000(\u009e\u0000M¦é\u0086(_jû\u0014-Üý\u0099¹\u001aè:Ü\u0081\u0090¬Sa¿ÑqD;Úx\u0083\u0098vùªJ\u009f³\u0010\f^8â1'\u0018GÎë\u008d*.÷\u0090Þ®êC\u00956aòeÚøÎÛ\u0090òA\u00181Q]¿V»\u0094\u0099o;:ÿ¬\f¯\u0014\u009b×¯\u009e\u001eä-(\u0018\u001aìÚ\u0012Üj\u0085\"_#\u0003ßý/|;#\u007f|î¡:éÝ\u0018\u0007\u001fÉ§ïTU\u0006,z÷C\nâ\u001d\u0080æ¯(Ü\u009f8Â\u008e FÎ\u008fEí6´\u009bãgéÚ6\u0098Þ]ÏLÿ\u0012(ëÉÖó6\u009d»\u0089¢\u0098\u0089\u001882$p\u0013\u001bUH=\u001b\u001c\u0019¦\u001a¸£\u009cat(Â¤ß( YWCl¸SÌ¹èQùTG¥\u0014^wn\u0006\u0082âòpéÝ\u001c<B,\u0090\u000f\u007f *T1û\u0001´´æf¿n\u0011Ë¤¼FfÈjz\f\u001dkÖ\u00ad§ÿðýw´\u0098 áÀÁ2^\t3\u0007ÞðÍ{ø£TÀÎ4Á´QÑÑ?\u009aìOÇ\u0084NüÜ\u0018ÂÊ*äËé§éÎd_}\u0011t\u009f\u0005\u0082%=Û\u0094°¤N ÏÓùn\u008e#\u0093¼>¬¬2\u0005X&Þ\u0096\u008fî\u0011\u0090E\u001f\u0019Dû\u008aèS\u0012§ò\u0010\u0083Û+hs>\u001aa*!\u0007ïU\u0087¹D ÏîVÄ\u0086\u008a&\u0098\u008elIz\u001e°ã2\u00adÄ\u0000\u0005O\"\u0097~°\u0084Â¹<¤ÀX(6 \u0090|\u009f7!Ø®+Þ\u0007%\u001bßßn\u0018\u0086ýphÿ\u0093öl\u008cfqa±.\u0081¾1\u0014æðu6 Oûõh\u0005\u0017Ð\u0097ËÀT¹7\u001a\u00adÎ\u008d\u008c¨6¿¯9Èº\u0014i\u0095\u008c®és0 Ú©\u009a\u000e\u0093\u008a\u0087çÎdøüEh9~¶0ÃámÔ©\u008cí%8ªN\t\u007f\u0005sï\u0001=·o¼²\u000bxò<p\u001c¨ TZp\u0001ø\u009d\u000e\u0016ìÇ1Ë\u008c\u001c0}f\u007fìø#Ñ\u009c\ný¢¶ ißÞÁ(é~Ä\u0000#kO)& tö\u0090\nÿâ\u0083\u0088ªjçs\u0089Xó\u0018\u0093wreªÿ#R\u0003|ü×\u000f]8DGô\u000e×¼1hÉýã\u0088\u000f²_ï¬\u007fè\u0012Ó\u0091NüQú\u008eN\u0017Õ\u0082\u008c!¤z\u0005P\u0096*C¥ôüæÿýÐu¸\f\u0092W\u000bÕEL";
      int var17 = "i¾4\u0084é\u008eH9\u0086ø\u0080\u0081°\f\u0087s\u000f\f{\u00064Ë¬Ì\u0010\u008d\u0085Mv}c¢,ù(\u0010Çm\u009d¬G\u0018 Ç¥Lc\u00058Æ¾§ß%ÿ·WÃ\u0000(\u009e\u0000M¦é\u0086(_jû\u0014-Üý\u0099¹\u001aè:Ü\u0081\u0090¬Sa¿ÑqD;Úx\u0083\u0098vùªJ\u009f³\u0010\f^8â1'\u0018GÎë\u008d*.÷\u0090Þ®êC\u00956aòeÚøÎÛ\u0090òA\u00181Q]¿V»\u0094\u0099o;:ÿ¬\f¯\u0014\u009b×¯\u009e\u001eä-(\u0018\u001aìÚ\u0012Üj\u0085\"_#\u0003ßý/|;#\u007f|î¡:éÝ\u0018\u0007\u001fÉ§ïTU\u0006,z÷C\nâ\u001d\u0080æ¯(Ü\u009f8Â\u008e FÎ\u008fEí6´\u009bãgéÚ6\u0098Þ]ÏLÿ\u0012(ëÉÖó6\u009d»\u0089¢\u0098\u0089\u001882$p\u0013\u001bUH=\u001b\u001c\u0019¦\u001a¸£\u009cat(Â¤ß( YWCl¸SÌ¹èQùTG¥\u0014^wn\u0006\u0082âòpéÝ\u001c<B,\u0090\u000f\u007f *T1û\u0001´´æf¿n\u0011Ë¤¼FfÈjz\f\u001dkÖ\u00ad§ÿðýw´\u0098 áÀÁ2^\t3\u0007ÞðÍ{ø£TÀÎ4Á´QÑÑ?\u009aìOÇ\u0084NüÜ\u0018ÂÊ*äËé§éÎd_}\u0011t\u009f\u0005\u0082%=Û\u0094°¤N ÏÓùn\u008e#\u0093¼>¬¬2\u0005X&Þ\u0096\u008fî\u0011\u0090E\u001f\u0019Dû\u008aèS\u0012§ò\u0010\u0083Û+hs>\u001aa*!\u0007ïU\u0087¹D ÏîVÄ\u0086\u008a&\u0098\u008elIz\u001e°ã2\u00adÄ\u0000\u0005O\"\u0097~°\u0084Â¹<¤ÀX(6 \u0090|\u009f7!Ø®+Þ\u0007%\u001bßßn\u0018\u0086ýphÿ\u0093öl\u008cfqa±.\u0081¾1\u0014æðu6 Oûõh\u0005\u0017Ð\u0097ËÀT¹7\u001a\u00adÎ\u008d\u008c¨6¿¯9Èº\u0014i\u0095\u008c®és0 Ú©\u009a\u000e\u0093\u008a\u0087çÎdøüEh9~¶0ÃámÔ©\u008cí%8ªN\t\u007f\u0005sï\u0001=·o¼²\u000bxò<p\u001c¨ TZp\u0001ø\u009d\u000e\u0016ìÇ1Ë\u008c\u001c0}f\u007fìø#Ñ\u009c\ný¢¶ ißÞÁ(é~Ä\u0000#kO)& tö\u0090\nÿâ\u0083\u0088ªjçs\u0089Xó\u0018\u0093wreªÿ#R\u0003|ü×\u000f]8DGô\u000e×¼1hÉýã\u0088\u000f²_ï¬\u007fè\u0012Ó\u0091NüQú\u008eN\u0017Õ\u0082\u008c!¤z\u0005P\u0096*C¥ôüæÿýÐu¸\f\u0092W\u000bÕEL".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var34 = var15.substring(var13, var13 + var14);
         byte var36 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var36) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[25];
                  r = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[12];
                  int var3 = 0;
                  String var4 = "\u0090ÂÔ\u008b!\u001eR\u001bo\u009b\u0094O _À6åÄt\"\r®î2\u0003\u008czª¶Nâ2¼~ç}É\u001dÂÇ\u0015\u009c¥\"Í 6©é¥,\u0083ïW\u000e\u0000\u0011X²ÂOìÃ\u0012ÌÜ×\u0007QÔ\u0088\u0094,\u0083\u0091)b0èe";
                  int var5 = "\u0090ÂÔ\u008b!\u001eR\u001bo\u009b\u0094O _À6åÄt\"\r®î2\u0003\u008czª¶Nâ2¼~ç}É\u001dÂÇ\u0015\u009c¥\"Í 6©é¥,\u0083ïW\u000e\u0000\u0011X²ÂOìÃ\u0012ÌÜ×\u0007QÔ\u0088\u0094,\u0083\u0091)b0èe".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var40 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                     long[] var37 = var6;
                     var40 = var3++;
                     long var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var44 = -1;

                     while(true) {
                        long var8 = var43;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var44) {
                        case 0:
                           var37[var40] = var46;
                           if (var2 >= var5) {
                              m = var6;
                              n = new Integer[12];
                              KProperty[] var33 = new KProperty[true.c<invokedynamic>(428, 1631908548062510486L ^ var20)];
                              var33[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yf.class, true.e<invokedynamic>(29337, 8823181163939294347L ^ var20), true.e<invokedynamic>(23553, 1196778266889798159L ^ var20), 0)));
                              var33[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yf.class, true.e<invokedynamic>(23485, 4313960860216575400L ^ var20), true.e<invokedynamic>(27038, 2166266995570898837L ^ var20), 0)));
                              var33[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yf.class, true.e<invokedynamic>(1266, 8638410830619679460L ^ var20), true.e<invokedynamic>(1124, 7077571840218536560L ^ var20), 0)));
                              var33[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yf.class, true.e<invokedynamic>(4308, 4119991797074792141L ^ var20), true.e<invokedynamic>(613, 3716508252758711405L ^ var20), 0)));
                              var33[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yf.class, true.e<invokedynamic>(1693, 4750361482439760013L ^ var20), true.e<invokedynamic>(16402, 1170749667536100869L ^ var20), 0)));
                              var33[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yf.class, true.e<invokedynamic>(5184, 6767816900680682074L ^ var20), true.e<invokedynamic>(2733, 6763401250982335667L ^ var20), 0)));
                              var33[true.c<invokedynamic>(31711, 5592543412688717798L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yf.class, true.e<invokedynamic>(5375, 715371838885366510L ^ var20), true.e<invokedynamic>(32486, 7541894449643741417L ^ var20), 0)));
                              var33[true.c<invokedynamic>(25463, 5414186334308540234L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yf.class, true.e<invokedynamic>(4576, 8471497386753232883L ^ var20), true.e<invokedynamic>(28985, 6758585889729081141L ^ var20), 0)));
                              I = var33;
                              c = new yf((char)var24, var25, (char)var26);
                              V = qi.M((il)c, true.e<invokedynamic>(13442, 7989423039661877918L ^ var20), (Enum)su.catlean.p.OFF, (pj)null, (Function0)null, true.c<invokedynamic>(15544, 7657210522865385611L ^ var20), (Object)null, var27);
                              L = qi.M((il)c, true.e<invokedynamic>(1712, 3498371112641108154L ^ var20), (Enum)su.catlean.p.OFF, (pj)null, (Function0)null, true.c<invokedynamic>(26007, 2675243971989608875L ^ var20), (Object)null, var27);
                              J = qi.o((il)c, true.e<invokedynamic>(22432, 587997415248185791L ^ var20), 1, new IntRange(1, true.c<invokedynamic>(8578, 9028503573990170041L ^ var20)), var22, (pj)null, (Function0)null, true.c<invokedynamic>(2431, 1149338246417282375L ^ var20), (Object)null);
                              b = qi.o((il)c, true.e<invokedynamic>(17564, 8007783550508653201L ^ var20), 1, new IntRange(1, true.c<invokedynamic>(8964, 8501073865501794107L ^ var20)), var22, (pj)null, (Function0)null, true.c<invokedynamic>(28339, 2952946301156692611L ^ var20), (Object)null);
                              U = qi.g((il)c, true.e<invokedynamic>(23438, 3593409661454501270L ^ var20), 60.0F, RangesKt.rangeTo(-360.0F, 360.0F), (pj)null, (Function0)null, true.c<invokedynamic>(28339, 2952946301156692611L ^ var20), var29, (Object)null);
                              x = qi.g((il)c, true.e<invokedynamic>(24682, 235356845197950583L ^ var20), 10.0F, RangesKt.rangeTo(-90.0F, 90.0F), (pj)null, (Function0)null, true.c<invokedynamic>(28339, 2952946301156692611L ^ var20), var29, (Object)null);
                              u = qi.g((il)c, true.e<invokedynamic>(8041, 8213841419284873586L ^ var20), 0.0F, RangesKt.rangeTo(-180.0F, 180.0F), (pj)null, (Function0)null, true.c<invokedynamic>(28339, 2952946301156692611L ^ var20), var29, (Object)null);
                              q = qi.R((il)c, true.e<invokedynamic>(15510, 6560121571497157279L ^ var20), true, (pj)null, (Function0)null, true.c<invokedynamic>(26007, 2675243971989608875L ^ var20), var31, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var46;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "3\u001cÓd°p\u0090í$ý\u0004-'\u0080®Â";
                           var5 = "3\u001cÓd°p\u0090í$ý\u0004-'\u0080®Â".length();
                           var2 = 0;
                        }

                        var40 = var2;
                        var2 += 8;
                        var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                        var37 = var6;
                        var40 = var3++;
                        var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var44 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var41;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "$IV&Ýýy0 ãCÕ¼gp\u0081 \u0086ÝÈUj¬åÖÓ\u008bä$D\u001d¹\u0083Pk-@\"²\u001c}õ×\u0090úª\u0014DÃ";
               var17 = "$IV&Ýýy0 ãCÕ¼gp\u0081 \u0086ÝÈUj¬åÖÓ\u008bä$D\u001d¹\u0083Pk-@\"²\u001c}õ×\u0090úª\u0014DÃ".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var34 = var15.substring(var13, var13 + var14);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31173;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/yf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7139;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
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
         throw new RuntimeException("su/catlean/yf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
