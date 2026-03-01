package su.catlean;

import java.awt.Color;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class li extends k9 {
   @NotNull
   public static final li m;
   static final KProperty[] e;
   @NotNull
   private static final zr Q;
   @NotNull
   private static final z0 k;
   @NotNull
   private static final z0 y;
   @NotNull
   private static final zc z;
   @NotNull
   private static final zo t;
   @NotNull
   private static final zv C;
   @NotNull
   private static final zv b;
   @NotNull
   private static final zo W;
   @NotNull
   private static final zc J;
   @NotNull
   private static final zc w;
   @NotNull
   private static final z0 M;
   private static final long c = j0.a(-1483549967539755632L, 7889920316042980351L, MethodHandles.lookup().lookupClass()).a(17775433976905L);
   private static final String[] d;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map n;

   private li(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 36552075246854L;
      super(var3, true.g<invokedynamic>(1780, 3145838534131964533L ^ var1), pa.W(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final pt x(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 131272556074758L;
      int var3 = (int)((var1 ^ 131272556074758L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (pt)Q.k((short)var3, this, e[0], (short)var4, var5);
   }

   public final int h(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 76636547988713L;
      int var6 = (int)((var4 ^ 76636547988713L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)k.k((short)var6, this, e[1], (short)var7, var8)).intValue();
   }

   public final int k(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 56027604844008L;
      int var3 = (int)((var1 ^ 56027604844008L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      String[] var6 = 1073258100613048892L.A<invokedynamic>(1073258100613048892L, var1);

      try {
         int var10000 = ((Number)y.k((short)var3, this, e[2], (short)var4, var5)).intValue();
         if (1072692381632826248L.A<invokedynamic>(1072692381632826248L, var1) == null) {
            (new String[1]).A<invokedynamic>(new String[1], 1011080450836640239L, var1);
         }

         return var10000;
      } catch (NoWhenBranchMatchedException var7) {
         throw var7.A<invokedynamic>(var7, 1011242064849475597L, var1);
      }
   }

   private final float b(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 98755324901225L;
      int var6 = (int)((var4 ^ 98755324901225L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)z.k((short)var6, this, e[3], (short)var7, var8)).floatValue();
   }

   private final boolean f(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 128208477837037L;
      int var3 = (int)((var1 ^ 128208477837037L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)t.k((short)var3, this, e[4], (short)var4, var5);
   }

   private final Color P(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ c;
      long var10001 = var4 ^ 66215000164263L;
      int var6 = (int)((var4 ^ 66215000164263L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Color)C.k((short)var6, this, e[5], (short)var7, var8);
   }

   private final Color Y(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 105074504813594L;
      int var3 = (int)((var1 ^ 105074504813594L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)b.k((short)var3, this, e[true.k<invokedynamic>(8810, 2197587640904063917L ^ var1)], (short)var4, var5);
   }

   private final boolean I(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 43541583526835L;
      int var3 = (int)((var1 ^ 43541583526835L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, e[true.k<invokedynamic>(20488, 688672824697282167L ^ var1)], (short)var4, var5);
   }

   private final float c(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ c;
      long var10001 = var4 ^ 121893902585896L;
      int var6 = (int)((var4 ^ 121893902585896L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)J.k((short)var6, this, e[true.k<invokedynamic>(3106, 7445391625177885123L ^ var4)], (short)var7, var8)).floatValue();
   }

   private final float w(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ c;
      long var10001 = var4 ^ 90702750355652L;
      int var6 = (int)((var4 ^ 90702750355652L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)w.k((short)var6, this, e[true.k<invokedynamic>(10081, 7041873555846513279L ^ var4)], (short)var7, var8)).floatValue();
   }

   private final int v(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 80825582828512L;
      int var3 = (int)((var1 ^ 80825582828512L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)M.k((short)var3, this, e[true.k<invokedynamic>(2952, 4580327905799783840L ^ var1)], (short)var4, var5)).intValue();
   }

   @Flow
   private final void o(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void g(long param1, class_4587 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final Color L(class_238 param1, Color param2, long param3, int param5) {
      // $FF: Couldn't be decompiled
   }

   static Color K(li param0, class_238 param1, Color param2, long param3, int param5, int param6, Object param7) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean L() {
      long var0 = c ^ 124838346559725L;
      long var2 = var0 ^ 110929557952899L;
      return m.I(var2);
   }

   private static final boolean V() {
      long var0 = c ^ 118725216111361L;
      long var2 = var0 ^ 139170429108847L;
      return m.I(var2);
   }

   private static final boolean U() {
      long var0 = c ^ 22739727262507L;
      long var2 = var0 ^ 1956306561605L;
      return m.I(var2);
   }

   static {
      long var20 = c ^ 48331591519113L;
      long var22 = var20 ^ 41000178093781L;
      long var24 = var20 ^ 101244360388083L;
      long var26 = var20 ^ 52776655210464L;
      long var28 = var20 ^ 94768813489156L;
      long var30 = var20 ^ 2418003574803L;
      long var32 = var20 ^ 57722971716913L;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[42];
      int var16 = 0;
      String var15 = "\u009aác~géÕ\u0085µáîêÔH$\u0098\u0010¿¸|\u0094\u0087\u009bÔ«×\u000fcÜv¦îâ\u0010°·\fÔ¾4ôÈ¹\u0085Å\u0086G}g\u0092(ù:NÝPÏ\nbd²ç\u0093\rEi\u0087Å\u00830\u000büu#\u001b/ò;ÄÄ\u0012S\u009f¥\u0015\"\u0016\u0091hðÜ\u0010WäÙ\u0093\u007fA cíKíÁTÔiJ\u0018\u00021A\u0091%`^b&\u0097ýê\u008f/Ã?\u0005LY\u008bó\u0099\u008fí\u0018¡\u009avï$\rðh»ßÈ\"NOÆ£HiÇ¦hZ\u0018i0\u00946¹W\u0000\u0016\u0098Õ±Uuöm\u0084å:°\u0015F¥\u0085ÑÝýVÙÍ`æ¬ö\\\b÷G±7àÃªP@Á\u0016=\u000b\u0018Ð ¥>óJj@¶\u001bÿóü\u0019èJ\u0094ÀïÏ\u001d)gáÂ\u0004P\u0089F\u009fFèZ¥\u0018ûI\u009fk\b\u001d\u0092¢f\u001aÃ7¯M\u009d+I\u0088-g?B}O D¹+Ó`¾\u0011B_\u001e\fß¡í\u008cÆ=\u0095+Á¿\u0099\u0000t¼\u0011¿ì\u0098\u00869Á\u0010\u0097\u008d\u0083ÂÁ}´/=o\u007fF\u000e\u0011!p\u0018K)ôxQ4¿iÄ³\u008b¬ñQ¿YyZ:\u0099\u0017\u0018Æ'(ó9ø\u00815{ySóY\u0093) \u0081f»Ûë\u001fZ6{P²\"4ëù\u001e%\u001añ«K\u0010û+/\u008f\u001d\u0010Õ-\u0005¹$¾UÕâ\u0015\u0003E.IØW\u0018Fc\u0016J\u001d{\u000f\u0017ùGjV\u001e>Þ\u001c-Âqoþ\u0003Þ\u00078I\u0097fU\u0097ÚhÿE\u0019Â\u009fò¼)ë\r\u0000\u0094vâ.6q\u009d\u0082\u0087³Í¯Ar|È\u001e\u0016è\u000f4Ý\u0094P\u0088$\u001bï2{\u001c\u0094EÇí\u001bUë tà\u0010_\u008d\u0004\u0091É\u0004j°\u008fïq£\u0011kß1¦å]8Î\u0085#fí±ý\u0001\u001e\u0018\b\"r\u001clÜ/\u008bèj\u009fÙø¥\u001a\u0084\u009dÌ\u001fÊ\u00953½Q\u0010ÛÍÑ6}\f¶w££\u0089óÁ¯\u0006ê\u0018ä¦ZR%'Üy!¨d©$\rfRÄPLR¦g ÀHQ8DÜ\u0000ìÐª\u009b;Á|õÉÇÝeÄ\\\u0083¨>Kº\"wóé\r°Pñ\u0092É\u0099P\u008akê\u008eãT\u008e\u001dØÈ×\u009c&\u000f\u0013\u001cï\u0014Æ\u0095¯Åà·ýCi3¾XìÈ0W\"x\u001822é\u001aª\u0090n\u0099\u0096ï\u009e\u0081z8§\u00855W?s!\u0088\u0083Z(4ÅN\u009f5á\u0013^úÀW{ä\u0092Xþ'Ò£;FÄæ1TCìctÈF@\"´Rÿ\u001aÑ\u000bG(2õ=¶þ\"v®î28!÷£\u0001öêT,\u0092\u0084Êä\"\u008cåõÞºY\u001f\u0005¸lº;o¤\u0095_ \\4?ÿ>\u0019Ù1ëRX>]Ï\u0087mó@è/ÂyAÞ8[\u009f¯\u001f.\u0007\u0017\u0018fÐ\b«Y\u0014>ùYC¿èÛgôWrÛìÉ\u0085ó\u0005³\u0018\u00892)J¡£oE;LY?¡8Ò\u001doz]§ã\u001f\u008aÂ\u0010,'\u0088m\u0090\u00adq\u0083\u008cøG_\u0086(\u000bd\u0018\u0012\u009fbN78úÈ\n6b\r¬ë-\u0088 \u008d\u009còs\u001bP1 F\u009b\u0099r,aÝgñ\u00181í\u0097\u008c\u008b\u00ad?¬\u0091û@\u0012\u007f\u0097äM°\u000b\u0082ü\u0099þ Gæë\u0081\u008a\u0005ª\u008a¿¨¼\u000eµk\u0089\rjÇ«.SÈ\u0099Þã\u0019a\u0091\u0013y°3\u0018\u0088B.'Ìÿ[Ï¡vº¢;\u001c¬\u0002z\u0088c\"ÅÄ¦~ \u0015¸ø×78&þ9\u0082E_\u008bÕM\u0017E\u007f@\u0003Ö\faM\u008ba\u0013îÛyùò\u0010±k\u0001Ã£Ðë3j\fd\u001f:¨\u0092ü\u0018\u0081ô\u008dëðöÈ\u008f\u0087\r\u000b\u0097\u0001]u:%ä\\m\u008f¦¡z\u0010\u009f¤ððw¬Ç2FYuOZu}·\u0010\u0093\u001a\u0097¾YÄ kdì)09>\u009e\u0084(\u0010ò#qj<f\u0012X\u0000\u000bAýsË¨ç\fV\u0084}&^\u0096p\u0084ìöjs¿éY¡\b_\u0005§gd\u0018çØ \u001d\u007fNN\u000fAúÉ9¶0`h8\u0017GI4À\u0003`";
      int var17 = "\u009aác~géÕ\u0085µáîêÔH$\u0098\u0010¿¸|\u0094\u0087\u009bÔ«×\u000fcÜv¦îâ\u0010°·\fÔ¾4ôÈ¹\u0085Å\u0086G}g\u0092(ù:NÝPÏ\nbd²ç\u0093\rEi\u0087Å\u00830\u000büu#\u001b/ò;ÄÄ\u0012S\u009f¥\u0015\"\u0016\u0091hðÜ\u0010WäÙ\u0093\u007fA cíKíÁTÔiJ\u0018\u00021A\u0091%`^b&\u0097ýê\u008f/Ã?\u0005LY\u008bó\u0099\u008fí\u0018¡\u009avï$\rðh»ßÈ\"NOÆ£HiÇ¦hZ\u0018i0\u00946¹W\u0000\u0016\u0098Õ±Uuöm\u0084å:°\u0015F¥\u0085ÑÝýVÙÍ`æ¬ö\\\b÷G±7àÃªP@Á\u0016=\u000b\u0018Ð ¥>óJj@¶\u001bÿóü\u0019èJ\u0094ÀïÏ\u001d)gáÂ\u0004P\u0089F\u009fFèZ¥\u0018ûI\u009fk\b\u001d\u0092¢f\u001aÃ7¯M\u009d+I\u0088-g?B}O D¹+Ó`¾\u0011B_\u001e\fß¡í\u008cÆ=\u0095+Á¿\u0099\u0000t¼\u0011¿ì\u0098\u00869Á\u0010\u0097\u008d\u0083ÂÁ}´/=o\u007fF\u000e\u0011!p\u0018K)ôxQ4¿iÄ³\u008b¬ñQ¿YyZ:\u0099\u0017\u0018Æ'(ó9ø\u00815{ySóY\u0093) \u0081f»Ûë\u001fZ6{P²\"4ëù\u001e%\u001añ«K\u0010û+/\u008f\u001d\u0010Õ-\u0005¹$¾UÕâ\u0015\u0003E.IØW\u0018Fc\u0016J\u001d{\u000f\u0017ùGjV\u001e>Þ\u001c-Âqoþ\u0003Þ\u00078I\u0097fU\u0097ÚhÿE\u0019Â\u009fò¼)ë\r\u0000\u0094vâ.6q\u009d\u0082\u0087³Í¯Ar|È\u001e\u0016è\u000f4Ý\u0094P\u0088$\u001bï2{\u001c\u0094EÇí\u001bUë tà\u0010_\u008d\u0004\u0091É\u0004j°\u008fïq£\u0011kß1¦å]8Î\u0085#fí±ý\u0001\u001e\u0018\b\"r\u001clÜ/\u008bèj\u009fÙø¥\u001a\u0084\u009dÌ\u001fÊ\u00953½Q\u0010ÛÍÑ6}\f¶w££\u0089óÁ¯\u0006ê\u0018ä¦ZR%'Üy!¨d©$\rfRÄPLR¦g ÀHQ8DÜ\u0000ìÐª\u009b;Á|õÉÇÝeÄ\\\u0083¨>Kº\"wóé\r°Pñ\u0092É\u0099P\u008akê\u008eãT\u008e\u001dØÈ×\u009c&\u000f\u0013\u001cï\u0014Æ\u0095¯Åà·ýCi3¾XìÈ0W\"x\u001822é\u001aª\u0090n\u0099\u0096ï\u009e\u0081z8§\u00855W?s!\u0088\u0083Z(4ÅN\u009f5á\u0013^úÀW{ä\u0092Xþ'Ò£;FÄæ1TCìctÈF@\"´Rÿ\u001aÑ\u000bG(2õ=¶þ\"v®î28!÷£\u0001öêT,\u0092\u0084Êä\"\u008cåõÞºY\u001f\u0005¸lº;o¤\u0095_ \\4?ÿ>\u0019Ù1ëRX>]Ï\u0087mó@è/ÂyAÞ8[\u009f¯\u001f.\u0007\u0017\u0018fÐ\b«Y\u0014>ùYC¿èÛgôWrÛìÉ\u0085ó\u0005³\u0018\u00892)J¡£oE;LY?¡8Ò\u001doz]§ã\u001f\u008aÂ\u0010,'\u0088m\u0090\u00adq\u0083\u008cøG_\u0086(\u000bd\u0018\u0012\u009fbN78úÈ\n6b\r¬ë-\u0088 \u008d\u009còs\u001bP1 F\u009b\u0099r,aÝgñ\u00181í\u0097\u008c\u008b\u00ad?¬\u0091û@\u0012\u007f\u0097äM°\u000b\u0082ü\u0099þ Gæë\u0081\u008a\u0005ª\u008a¿¨¼\u000eµk\u0089\rjÇ«.SÈ\u0099Þã\u0019a\u0091\u0013y°3\u0018\u0088B.'Ìÿ[Ï¡vº¢;\u001c¬\u0002z\u0088c\"ÅÄ¦~ \u0015¸ø×78&þ9\u0082E_\u008bÕM\u0017E\u007f@\u0003Ö\faM\u008ba\u0013îÛyùò\u0010±k\u0001Ã£Ðë3j\fd\u001f:¨\u0092ü\u0018\u0081ô\u008dëðöÈ\u008f\u0087\r\u000b\u0097\u0001]u:%ä\\m\u008f¦¡z\u0010\u009f¤ððw¬Ç2FYuOZu}·\u0010\u0093\u001a\u0097¾YÄ kdì)09>\u009e\u0084(\u0010ò#qj<f\u0012X\u0000\u000bAýsË¨ç\fV\u0084}&^\u0096p\u0084ìöjs¿éY¡\b_\u0005§gd\u0018çØ \u001d\u007fNN\u000fAúÉ9¶0`h8\u0017GI4À\u0003`".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var35 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  f = new String[42];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[24];
                  int var3 = 0;
                  String var4 = "®\u0006aµû«ØZ+vc\u009eÇ+aI\\2Ö\u001bí!Ìj!ñ\u0085e\u0013\u0017\u009f\u0012I)çG\u009a\u0087Q\u0098P'yæIO6\u0014ëÂ\u009fW\u0010[\u008c<Ò\u0091!®\u001c\"\u0006¯°7-®}wc\u0001÷×KMþîñÖ\u0017\u0095a\u0092N%~\u000bè\u000e5±ë8{%8®\u0096â\u0080ÜF\u0089Èf@]\u0096I§Ô$ºó\u0083Æ\u0000\u0002b\u000bM\u001c»¯ú\u0007À\u0091\u001eQr#BS/½\"µaÞWÀ\u0017>ÞX\u0019\u001bòï}à®«{ËQÈj>2ÜetÓ\\%v\u007fÏ'©Äû?";
                  int var5 = "®\u0006aµû«ØZ+vc\u009eÇ+aI\\2Ö\u001bí!Ìj!ñ\u0085e\u0013\u0017\u009f\u0012I)çG\u009a\u0087Q\u0098P'yæIO6\u0014ëÂ\u009fW\u0010[\u008c<Ò\u0091!®\u001c\"\u0006¯°7-®}wc\u0001÷×KMþîñÖ\u0017\u0095a\u0092N%~\u000bè\u000e5±ë8{%8®\u0096â\u0080ÜF\u0089Èf@]\u0096I§Ô$ºó\u0083Æ\u0000\u0002b\u000bM\u001c»¯ú\u0007À\u0091\u001eQr#BS/½\"µaÞWÀ\u0017>ÞX\u0019\u001bòï}à®«{ËQÈj>2ÜetÓ\\%v\u007fÏ'©Äû?".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var39 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                     long[] var38 = var6;
                     var39 = var3++;
                     long var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var44 = -1;

                     while(true) {
                        long var8 = var43;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var44) {
                        case 0:
                           var38[var39] = var46;
                           if (var2 >= var5) {
                              i = var6;
                              l = new Integer[24];
                              KProperty[] var34 = new KProperty[true.k<invokedynamic>(14112, 2903654201098244228L ^ var20)];
                              var34[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(7374, 5635861612587222700L ^ var20), true.g<invokedynamic>(2358, 5631369124578399073L ^ var20), 0)));
                              var34[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(15811, 2376324079694194592L ^ var20), true.g<invokedynamic>(21180, 1031951265042483434L ^ var20), 0)));
                              var34[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(9943, 5205615030060956816L ^ var20), true.g<invokedynamic>(14874, 2006858111086141531L ^ var20), 0)));
                              var34[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(17362, 1606781142609648009L ^ var20), true.g<invokedynamic>(14505, 6676785263168758515L ^ var20), 0)));
                              var34[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(12888, 7437780044540028984L ^ var20), true.g<invokedynamic>(23371, 7709885542444220676L ^ var20), 0)));
                              var34[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(18404, 8650179793401601450L ^ var20), true.g<invokedynamic>(17579, 2796074244209073913L ^ var20), 0)));
                              var34[true.k<invokedynamic>(8810, 2197553080025155033L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(21916, 7048251922619125718L ^ var20), true.g<invokedynamic>(12776, 4139570939034938247L ^ var20), 0)));
                              var34[true.k<invokedynamic>(26101, 1755010091171463751L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(20694, 4756424078517291655L ^ var20), true.g<invokedynamic>(3318, 3444694575420905112L ^ var20), 0)));
                              var34[true.k<invokedynamic>(10393, 8616224357340581670L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(14548, 4199843074211062431L ^ var20), true.g<invokedynamic>(2071, 5661386625271599684L ^ var20), 0)));
                              var34[true.k<invokedynamic>(29163, 1716674750788327006L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(19089, 3003183560725090508L ^ var20), true.g<invokedynamic>(5326, 3525654333451636382L ^ var20), 0)));
                              var34[true.k<invokedynamic>(4648, 7069953452257457545L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(li.class, true.g<invokedynamic>(4433, 3046834956317330200L ^ var20), true.g<invokedynamic>(30725, 390300180030677602L ^ var20), 0)));
                              e = var34;
                              m = new li(var24);
                              Q = qi.M((il)m, true.g<invokedynamic>(21934, 2849285570925940715L ^ var20), (Enum)pt.CubeOutline, (pj)null, (Function0)null, true.k<invokedynamic>(24320, 2624133841395808444L ^ var20), (Object)null, var26);
                              k = qi.o((il)m, true.g<invokedynamic>(21056, 1034137628430092318L ^ var20), true.k<invokedynamic>(4648, 7069953452257457545L ^ var20), new IntRange(1, true.k<invokedynamic>(16119, 3527435848803293519L ^ var20)), var22, (pj)null, (Function0)null, true.k<invokedynamic>(11908, 7346286740182272289L ^ var20), (Object)null);
                              y = qi.o((il)m, true.g<invokedynamic>(32361, 4389753126035842084L ^ var20), 5, new IntRange(1, true.k<invokedynamic>(19037, 8020344218190310887L ^ var20)), var22, (pj)null, (Function0)null, true.k<invokedynamic>(14425, 2278497053415317472L ^ var20), (Object)null);
                              z = qi.g((il)m, true.g<invokedynamic>(4114, 6201746223933295198L ^ var20), 1.0F, RangesKt.rangeTo(0.01F, 5.0F), (pj)null, (Function0)null, true.k<invokedynamic>(14425, 2278497053415317472L ^ var20), var28, (Object)null);
                              t = qi.R((il)m, true.g<invokedynamic>(1490, 8911927388871925639L ^ var20), true, (pj)null, (Function0)null, true.k<invokedynamic>(27727, 608960054637382655L ^ var20), var30, (Object)null);
                              C = qi.F((il)m, true.g<invokedynamic>(25289, 2252120216032082063L ^ var20), new Color(true.k<invokedynamic>(12734, 3664131893832488477L ^ var20)), (pj)null, (Function0)null, true.k<invokedynamic>(27727, 608960054637382655L ^ var20), var32, (Object)null);
                              b = qi.F((il)m, true.g<invokedynamic>(19297, 3555675306959393077L ^ var20), new Color(true.k<invokedynamic>(4811, 1937874613455730042L ^ var20)), (pj)null, (Function0)null, true.k<invokedynamic>(27727, 608960054637382655L ^ var20), var32, (Object)null);
                              W = qi.R((il)m, true.g<invokedynamic>(29329, 8015776947045099725L ^ var20), true, (pj)null, (Function0)null, true.k<invokedynamic>(27727, 608960054637382655L ^ var20), var30, (Object)null);
                              J = qi.g((il)m, true.g<invokedynamic>(22912, 7953576997065704421L ^ var20), 0.8F, RangesKt.rangeTo(0.0F, 1.0F), (pj)null, li::L, true.k<invokedynamic>(10393, 8616224357340581670L ^ var20), var28, (Object)null);
                              w = qi.g((il)m, true.g<invokedynamic>(3269, 155246552002664071L ^ var20), 0.4F, RangesKt.rangeTo(0.0F, 1.0F), (pj)null, li::V, true.k<invokedynamic>(10393, 8616224357340581670L ^ var20), var28, (Object)null);
                              M = qi.o((il)m, true.g<invokedynamic>(19973, 2656531183936492614L ^ var20), 2, new IntRange(1, true.k<invokedynamic>(4648, 7069953452257457545L ^ var20)), var22, (pj)null, li::U, true.k<invokedynamic>(10393, 8616224357340581670L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var38[var39] = var46;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u007f#\u0001Ì>+å¦6ê\u0015ë\u009eÚÄ*";
                           var5 = "\u007f#\u0001Ì>+å¦6ê\u0015ë\u009eÚÄ*".length();
                           var2 = 0;
                        }

                        var39 = var2;
                        var2 += 8;
                        var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                        var38 = var6;
                        var39 = var3++;
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

               var15 = "Û\u009b\u008eQ2Ô\u009d?ý}ÀU:\r\u0098D¼7½\u001dãßdñÖ\u008c\u001an/\u0000Dÿ*\t\u008c+?\u0098fÙ+g<\u0094\u0002\u009b¬>\u009eá\u0001þSDXKRùP}d\\+j\b¡yl9íím(×F;u\u001ee\u0001Nîv\u0093=c\u0087A]\u009dö?jÎÀ\u0094Þ+È\u0014\u0018Q\u008d©3\u0084\"¾\u000f\u008f®\u008a~";
               var17 = "Û\u009b\u008eQ2Ô\u009d?ý}ÀU:\r\u0098D¼7½\u001dãßdñÖ\u008c\u001an/\u0000Dÿ*\t\u008c+?\u0098fÙ+g<\u0094\u0002\u009b¬>\u009eá\u0001þSDXKRùP}d\\+j\b¡yl9íím(×F;u\u001ee\u0001Nîv\u0093=c\u0087A]\u009dö?jÎÀ\u0094Þ+È\u0014\u0018Q\u008d©3\u0084\"¾\u000f\u008f®\u008a~".length();
               var14 = 'H';
               var13 = -1;
            }

            ++var13;
            var35 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15092;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/li", var10);
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
         throw new RuntimeException("su/catlean/li" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1799;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/li", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/li" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
