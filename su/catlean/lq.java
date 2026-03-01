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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class lq extends k9 {
   @NotNull
   public static final lq N;
   static final KProperty[] d;
   @NotNull
   private static final zo T;
   @NotNull
   private static final z0 c;
   @NotNull
   private static final List W;
   @NotNull
   private static final List s;
   private static final long b = j0.a(8740761594415506349L, 8787050879816575149L, MethodHandles.lookup().lookupClass()).a(23434672467764L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private lq(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 61037690938172L;
      super(var3, true.o<invokedynamic>(32216, 6353206546553724791L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final boolean M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 91369506330962L;
      int var3 = (int)((var1 ^ 91369506330962L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var3, this, d[0], (short)var4, var5);
   }

   public final int t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 90628493071168L;
      int var3 = (int)((var1 ^ 90628493071168L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)c.k((short)var3, this, d[1], (short)var4, var5)).intValue();
   }

   @NotNull
   public final List x() {
      return W;
   }

   @NotNull
   public final List H() {
      return s;
   }

   public void n(long var1) {
      long var10001 = var1 ^ 139745504383299L;
      int var3 = (int)((var1 ^ 139745504383299L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);

      try {
         if (s8.H((short)var3, (short)var4, var5).field_1724 != null) {
            ;
         }
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -6772034130816565592L, var1);
      }
   }

   @Flow
   private final void H(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void U(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void d(long param1, class_1657 param3) {
      // $FF: Couldn't be decompiled
   }

   public final void u(@NotNull class_4587 stack, @NotNull class_591 model, @NotNull ib polygon, double posX, double posY, double posZ, double rotX, double rotY, long a, double rotZ, @NotNull ht part, @NotNull Color color) {
      var14 ^= b;
      long var10001 = var14 ^ 132038353493135L;
      int var20 = (int)((var14 ^ 132038353493135L) >>> 32);
      int var21 = (int)(var10001 << 32 >>> 48);
      int var22 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(175, 7693580483527512653L ^ var14));
      Intrinsics.checkNotNullParameter(var2, true.o<invokedynamic>(2718, 5387896857796941924L ^ var14));
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(26394, 4323768736556381672L ^ var14));
      Intrinsics.checkNotNullParameter(var18, true.o<invokedynamic>(5926, 5095554647275734487L ^ var14));
      Intrinsics.checkNotNullParameter(var19, true.o<invokedynamic>(24634, 2112930586982281937L ^ var14));
      var1.method_22903();
      var1.method_22904(var4, var6, var8);
      var1.method_22905(0.0555F, 0.0555F, 0.0555F);
      var1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees((float)var10));
      var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)var12));
      var1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)var16));
      Matrix4f var23 = var1.method_23760().method_23761();
      boolean var24 = false;
      lq var10000 = N;
      class_630 var10003 = (class_630)var18.t().invoke(var2);
      Intrinsics.checkNotNull(var23);
      var10000.s(var20, var21, var10003, var3, var19, (short)var22, var23);
      N.s(var20, var21, (class_630)var18.p().invoke(var2), var3, var19, (short)var22, var23);
      var1.method_22909();
   }

   public final void s(int a, int a, @NotNull class_630 part, @NotNull ib polygon, @NotNull Color color, short a, @NotNull Matrix4f mat) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean y(class_1657 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean u(vy var0) {
      long var1 = b ^ 77618279803108L;
      long var3 = var1 ^ 137649571279055L;
      Intrinsics.checkNotNullParameter(var0, true.o<invokedynamic>(27266, 8339962186527791209L ^ var1));
      return var0.s(var3);
   }

   private static final boolean z(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = b ^ 43124646925496L;
      long var22 = var20 ^ 56784865819178L;
      long var24 = var20 ^ 77396999875832L;
      long var26 = var20 ^ 22942187713772L;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[26];
      int var16 = 0;
      String var15 = "\u0099â\u0091ªê\u0019Û\u009fw\u0099<l\u00161\u0093`\u0010¾Ô±¸hM±Öà*\u0015\u008cÀe\u0092¨\u0018\u0010ú\rd.\u0018:\råU[ÚWÀÁ¶W3fÂ«sGÊ ½$³Ü\u0088IÒò¿¦Ý\u0004\u001cZr9î\tNiØ£P\u00935\u0002x\u0084\u008a«.ª\u0010ÅDðß1,üN2\u0012 ®W;Z¤\u0010Ñ¿\u001f\u0001ÀÉCS,¿-»¤Ã&\u000f\u0088s\u0091\r£¾î\u0091\u009f\u001b ØmgÿI\u0081\u007fÄ2à\u0094ÁÈ,\u0087^\"\u0001ëVÙ0á_.:V|Æ\u008e\u0013³øýTÕ\u0086¦`æXL\u0004Àm\u009dárÂ¹\u009cHåB\u008fòpÎd1È|qä:,ò(u\"\u0081\u001dA\u009a%\u000fÇ\b\u0080¯æ¯= £\rM\u009a\u009d0¨/y5\u001dD9\n³\u001fSa\u000fÝ5}Þ\u0096¶é5vN\u0092\tF\u0084|\u008c\u009f\u0013d\u0095jææ\u0018^º(in\u0080ë,\u0014n\u0093\u0018¼thªåµÀ\u0017\u009e\u0094Kû\u0010\bKF\u0085°\u0082åÈ\u001fMf\u008d\u000fX)¦\u00104²ó§¨\u001d^\u00916\u0007\u0092@\u001bÂ\u0095Z \u0090ÒF\u00adÐ\u0003\u001e§e\u001e\u009eà_\u0089\"¤\u008c-Å ?äò\u0011e\u0090?&\u0000È\u0013 \u0010Ra,ârY|ìv½Ádï\u0091ÛÁ\u0018\u0085¢ýÁ\u009bÐÕÚÖ\u00ad°®\u0013´\u009eK¤,\u0094\u009cK`\u0005§ p\u0085\u0014Þ\u008eÅ-p\u007fCÖE5Æê\ræg\u0090Õê=(â\t'(!É\u0093m\u0094\u0010é\u0099íôJ\"\u0017Gë\u0093Ü\u0093\u009d\u0081\"\n \u0013\u008c¾°®N!ôR&(þç5ùR\u009aG«{Ú¯Àu\u001b2\fùÃÿaF =\u0087½lw\u00997o>H\u001eaù5^LI±[¯ËV\u0087>\u001a\u009b\b%#oi[\u0010-Ñ\u0086\u0002.\u000eÜ\u001bõK\u0098\u0091\u001bà\u00848\u0010[\u001dº\u0096j\u0087¹\u0005ª ¼\u0004OÄ\u000bý\u0010\u0097\u0013ÔW\u0015\u0094\u008bÖ\u009a°¸\u007fqc¾\f0o;ÃËix*\u0083®9Pl!ÔlPc-\u0018ü\u000fB\u0082\u008e\u0010/Í\fr>?ûÁ\u001fî\u0010öÙ\u001fhS\u0094\u0086:Ø¨Bé \u009cY×ÄÁ\u0000\u0001ÐD:\u009c\u0017°í¢þX®W\u0014¹µ\u008cô\u0082¹ñ|I»\u009dd(,S\u0018\u0013â~\u000fp|\u008ffñoç¢î¡²\u001a²(¶ÕVçGãêåCV\u0001«35s3ù\u0094ò\u0010\u0092ö\"U²Ç\u008d6\u00076\\t:eJw";
      int var17 = "\u0099â\u0091ªê\u0019Û\u009fw\u0099<l\u00161\u0093`\u0010¾Ô±¸hM±Öà*\u0015\u008cÀe\u0092¨\u0018\u0010ú\rd.\u0018:\råU[ÚWÀÁ¶W3fÂ«sGÊ ½$³Ü\u0088IÒò¿¦Ý\u0004\u001cZr9î\tNiØ£P\u00935\u0002x\u0084\u008a«.ª\u0010ÅDðß1,üN2\u0012 ®W;Z¤\u0010Ñ¿\u001f\u0001ÀÉCS,¿-»¤Ã&\u000f\u0088s\u0091\r£¾î\u0091\u009f\u001b ØmgÿI\u0081\u007fÄ2à\u0094ÁÈ,\u0087^\"\u0001ëVÙ0á_.:V|Æ\u008e\u0013³øýTÕ\u0086¦`æXL\u0004Àm\u009dárÂ¹\u009cHåB\u008fòpÎd1È|qä:,ò(u\"\u0081\u001dA\u009a%\u000fÇ\b\u0080¯æ¯= £\rM\u009a\u009d0¨/y5\u001dD9\n³\u001fSa\u000fÝ5}Þ\u0096¶é5vN\u0092\tF\u0084|\u008c\u009f\u0013d\u0095jææ\u0018^º(in\u0080ë,\u0014n\u0093\u0018¼thªåµÀ\u0017\u009e\u0094Kû\u0010\bKF\u0085°\u0082åÈ\u001fMf\u008d\u000fX)¦\u00104²ó§¨\u001d^\u00916\u0007\u0092@\u001bÂ\u0095Z \u0090ÒF\u00adÐ\u0003\u001e§e\u001e\u009eà_\u0089\"¤\u008c-Å ?äò\u0011e\u0090?&\u0000È\u0013 \u0010Ra,ârY|ìv½Ádï\u0091ÛÁ\u0018\u0085¢ýÁ\u009bÐÕÚÖ\u00ad°®\u0013´\u009eK¤,\u0094\u009cK`\u0005§ p\u0085\u0014Þ\u008eÅ-p\u007fCÖE5Æê\ræg\u0090Õê=(â\t'(!É\u0093m\u0094\u0010é\u0099íôJ\"\u0017Gë\u0093Ü\u0093\u009d\u0081\"\n \u0013\u008c¾°®N!ôR&(þç5ùR\u009aG«{Ú¯Àu\u001b2\fùÃÿaF =\u0087½lw\u00997o>H\u001eaù5^LI±[¯ËV\u0087>\u001a\u009b\b%#oi[\u0010-Ñ\u0086\u0002.\u000eÜ\u001bõK\u0098\u0091\u001bà\u00848\u0010[\u001dº\u0096j\u0087¹\u0005ª ¼\u0004OÄ\u000bý\u0010\u0097\u0013ÔW\u0015\u0094\u008bÖ\u009a°¸\u007fqc¾\f0o;ÃËix*\u0083®9Pl!ÔlPc-\u0018ü\u000fB\u0082\u008e\u0010/Í\fr>?ûÁ\u001fî\u0010öÙ\u001fhS\u0094\u0086:Ø¨Bé \u009cY×ÄÁ\u0000\u0001ÐD:\u009c\u0017°í¢þX®W\u0014¹µ\u008cô\u0082¹ñ|I»\u009dd(,S\u0018\u0013â~\u000fp|\u008ffñoç¢î¡²\u001a²(¶ÕVçGãêåCV\u0001«35s3ù\u0094ò\u0010\u0092ö\"U²Ç\u008d6\u00076\\t:eJw".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[26];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "ëdÅX¦q4Z÷W\u0088r[Þ@ÚØ\u0099¸Ö\u009c5£\u001d";
                  int var5 = "ëdÅX¦q4Z÷W\u0088r[Þ@ÚØ\u0099¸Ö\u009c5£\u001d".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              i = var6;
                              k = new Integer[5];
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lq.class, true.o<invokedynamic>(23286, 8937362522743624786L ^ var20), true.o<invokedynamic>(18582, 834788419400910393L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lq.class, true.o<invokedynamic>(14540, 7195741922926638702L ^ var20), true.o<invokedynamic>(23194, 3790745642774254653L ^ var20), 0)))};
                              d = var28;
                              N = new lq(var24);
                              T = qi.R((il)N, true.o<invokedynamic>(18860, 2081635194446759711L ^ var20), true, (pj)null, (Function0)null, true.z<invokedynamic>(21026, 957086672106543657L ^ var20), var26, (Object)null);
                              c = qi.o((il)N, true.o<invokedynamic>(23257, 7524886531637597299L ^ var20), true.z<invokedynamic>(27056, 9197246154221248952L ^ var20), new IntRange(3, true.z<invokedynamic>(111, 3104892598202370149L ^ var20)), var22, (pj)null, (Function0)null, true.z<invokedynamic>(19178, 4576820417898857188L ^ var20), (Object)null);
                              W = (List)(new ArrayList());
                              s = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "#É\u0081[(¡uò\u0006c\u00873\u008d\u00adX\u0091";
                           var5 = "#É\u0081[(¡uò\u0006c\u00873\u008d\u00adX\u0091".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "$.ÏÝyþ\u008533\u001a\u008fØ\u008aüQR:¤¥Ò\u0016\u001c7\u0097âf³T\u000bwêý\u008dm-\u001bM1}éO¢ÅâÙcÕçK\u009e\f`ñ\u0091\t_W\u0080Ôû÷\u0000hàÕ\u000f²ó\u0092p£d\u0012\\ã!\u0092\u009dª\u009a\u0094\t\u0012-xõ\u0005í·\u000f»\u009dK\u0005\u0016Í&\u001d1\u001dB\u0016ÔÓÐôù\u0096\u000eö¨³ÈÎ¾Ìd\u0089x\u0018ÜU\u0097m\u007f\nQZ\u0004\u0091\u0015ó\u0017\u0091t\u0098óqà´Vu\u0089ê¼Ù\u0015\u001dª$Z\u009dé-\u0015¶\u00033¥°_TÚ.ýl\u0080÷ß\u008d1e©¡9è¡·\nêÞ\u0095~ÛõY\u0018,%#¼\u000e>RÞP±\b^\u001cí&>ú}+w´Þ\ns¹eò§\u001d\u0080ý\u009c\u0093Ð _ù=ø}ûPlÐ\u0005Z\u000b¨xS¬¶/\u0083Ñ3¹ñD*B\u0010\u000b!Ë¯f¸«eÃë\u0005\u008db\u008bro";
               var17 = "$.ÏÝyþ\u008533\u001a\u008fØ\u008aüQR:¤¥Ò\u0016\u001c7\u0097âf³T\u000bwêý\u008dm-\u001bM1}éO¢ÅâÙcÕçK\u009e\f`ñ\u0091\t_W\u0080Ôû÷\u0000hàÕ\u000f²ó\u0092p£d\u0012\\ã!\u0092\u009dª\u009a\u0094\t\u0012-xõ\u0005í·\u000f»\u009dK\u0005\u0016Í&\u001d1\u001dB\u0016ÔÓÐôù\u0096\u000eö¨³ÈÎ¾Ìd\u0089x\u0018ÜU\u0097m\u007f\nQZ\u0004\u0091\u0015ó\u0017\u0091t\u0098óqà´Vu\u0089ê¼Ù\u0015\u001dª$Z\u009dé-\u0015¶\u00033¥°_TÚ.ýl\u0080÷ß\u008d1e©¡9è¡·\nêÞ\u0095~ÛõY\u0018,%#¼\u000e>RÞP±\b^\u001cí&>ú}+w´Þ\ns¹eò§\u001d\u0080ý\u009c\u0093Ð _ù=ø}ûPlÐ\u0005Z\u000b¨xS¬¶/\u0083Ñ3¹ñD*B\u0010\u000b!Ë¯f¸«eÃë\u0005\u008db\u008bro".length();
               var14 = 248;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23276;
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
            throw new RuntimeException("su/catlean/lq", var10);
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
         throw new RuntimeException("su/catlean/lq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23622;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/lq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/lq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
