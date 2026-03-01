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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_3965;
import net.minecraft.class_2828.class_2829;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class or extends k9 {
   @NotNull
   public static final or A;
   static final KProperty[] w;
   @NotNull
   private static final zr d;
   @NotNull
   private static final zo g;
   @NotNull
   private static final zo W;
   @NotNull
   private static final zo X;
   @NotNull
   private static final zo N;
   @NotNull
   private static final zo n;
   @NotNull
   private static final zr I;
   @NotNull
   private static final iv x;
   private static final long b = j0.a(2329416698407246926L, 4882803438321427331L, MethodHandles.lookup().lookupClass()).a(5713420313469L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private or(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 108144270321081L;
      super(var3, true.p<invokedynamic>(27726, 8851478388148604786L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final fv u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 12246300101910L;
      int var3 = (int)((var1 ^ 12246300101910L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (fv)d.k((short)var3, this, w[0], (short)var4, var5);
   }

   private final boolean I(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 77915150462722L;
      int var6 = (int)((var4 ^ 77915150462722L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)g.k((short)var6, this, w[1], (short)var7, var8);
   }

   private final boolean f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 97894690516735L;
      int var3 = (int)((var1 ^ 97894690516735L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, w[2], (short)var4, var5);
   }

   private final boolean c(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 6788912397402L;
      int var3 = (int)((var1 ^ 6788912397402L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, w[3], (short)var4, var5);
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 88980002239878L;
      int var3 = (int)((var1 ^ 88980002239878L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)N.k((short)var3, this, w[4], (short)var4, var5);
   }

   private final boolean r(byte var1, int var2, int var3) {
      long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 85887566511935L;
      int var6 = (int)((var4 ^ 85887566511935L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)n.k((short)var6, this, w[5], (short)var7, var8);
   }

   private final uw i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 72858702753118L;
      int var3 = (int)((var1 ^ 72858702753118L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (uw)I.k((short)var3, this, w[true.w<invokedynamic>(22485, 4648912210321243298L ^ var1)], (short)var4, var5);
   }

   private final void q(uw var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 106620334522114L;
      int var4 = (int)((var2 ^ 106620334522114L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      I.P(this, var4, w[true.w<invokedynamic>(19883, 7148775188123468950L ^ var2)], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void x(CollisionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void F(long param1, double[] param3, double[] param4) {
      // $FF: Couldn't be decompiled
   }

   private final void p(double[] var1, double[] var2, long var3) {
      var3 ^= b;
      long var10001 = var3 ^ 108239848264505L;
      int var5 = (int)((var3 ^ 108239848264505L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var3 ^ 2655886874252L;
      long var10 = var3 ^ 11684001920786L;
      long var12 = var3 ^ 65853361887646L;
      int[] var14 = -7749895991333316450L.A<invokedynamic>(-7749895991333316450L, var3);

      byte var10000;
      label22: {
         label21: {
            try {
               var10000 = s8.i((char)var5, var6, (short)var7).method_22347(class_2338.method_49638((class_2374)this.W(var12, (class_1297)s8.f(var8)).method_1031(var1[0], -2.0D, var1[1])));
               if (var14 == null) {
                  break label22;
               }

               if (var10000 != 0) {
                  break label21;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, -7682546792576883254L, var3);
            }

            var10000 = 1;
            break label22;
         }

         var10000 = 2;
      }

      byte var15 = var10000;
      s8.f(var8).method_5814(s8.f(var8).method_23317() + var2[0], s8.f(var8).method_23318() - (double)var15, s8.f(var8).method_23321() + var2[1]);
      h4.G((class_2596)(new class_2829(s8.f(var8).method_23317(), s8.f(var8).method_23318(), s8.f(var8).method_23321(), true, s8.f(var8).field_5976)), var10);
   }

   @Flow(
      priority = -10
   )
   private final void g(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void y(char param1, class_2338 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final float A(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean S(int param1, short param2, char param3) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean Q() {
      long var0 = b ^ 53896588988326L;
      long var2 = var0 ^ 9722638004333L;

      boolean var10000;
      try {
         if (A.u(var2) == fv.PEARL) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 5503774974705450185L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean J() {
      long var0 = b ^ 22674316663658L;
      long var2 = var0 ^ 49805447390369L;

      boolean var10000;
      try {
         if (A.u(var2) == fv.PEARL) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -2833481363370465275L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean L() {
      long var0 = b ^ 88794860736563L;
      long var2 = var0 ^ 115523199774712L;

      boolean var10000;
      try {
         if (A.u(var2) == fv.PEARL) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 1437835663732630364L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean H() {
      long var0 = b ^ 118884084652355L;
      long var2 = var0 ^ 94337459971720L;

      boolean var10000;
      try {
         if (A.u(var2) == fv.PEARL) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 6522350491184704044L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean W() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean j() {
      long var0 = b ^ 81943168032991L;
      long var2 = var0 ^ 126811526979348L;

      boolean var10000;
      try {
         if (A.u(var2) == fv.PEARL) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -2082864594704526416L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean m(class_1799 var0) {
      long var1 = b ^ 136811827524566L;
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(8963, 6355565599200038661L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_8634);
   }

   private static final Unit M() {
      long var0 = b ^ 70082386605639L;
      long var2 = var0 ^ 86111697491952L;
      long var10001 = var0 ^ 54962159594176L;
      int var4 = (int)((var0 ^ 54962159594176L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      ff.f(class_1268.field_5808, 0.0F, 0.0F, (char)var4, true.w<invokedynamic>(19883, 7148868520766360887L ^ var0), var5, (Object)null);
      h4.G((class_2596)(new class_2879(class_1268.field_5808)), var2);
      return Unit.INSTANCE;
   }

   private static final Unit C(class_2338 param0, Ref.ObjectRef param1, s1 param2) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean h(class_1799 var0) {
      long var1 = b ^ 96345626625525L;
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(8810, 8570336976384587885L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_8281);
   }

   private static final Unit u(class_3965 var0) {
      long var1 = b ^ 69457114302747L;
      long var3 = var1 ^ 44776159224978L;
      long var5 = var1 ^ 77024462424370L;
      s8.r(var3).method_2896(s8.f(var5), class_1268.field_5808, var0);
      s8.f(var5).method_6104(class_1268.field_5808);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 134209048963228L;
      long var22 = var20 ^ 16644580494828L;
      long var24 = var20 ^ 67146037660191L;
      long var26 = var20 ^ 86359417968217L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[33];
      int var16 = 0;
      String var15 = "$\u0011B©wñ\u0018\u0018\u000ejx\u0090\u008a\u0085V°\u0089+\u0099ó\u0096~æ0\u009c8Ã1ðI`_\u0095\u0016\u0086õßHLØs\u0013ë´\u0014øuD\u0010Õ ;át»V\u0001õÊû{9ýl¦\u0010sèz\u0093¸þ*zÒp\u001b\u0093~\\Æ\u0019 Ýª7 sJðÎî\r¯\u0000\u0016c\u00ad2ªª%\u0094ùlX¡\u0095xmPBÏp\u001a\u0018Ñ¹\u007fà\u0088\u0007Ü-.qî³·*:\u0013¤|\u009cg\u0084a!µ(f)\u000f\u001e\u0007.\u0080\u008dA\u0081¥=Ô\u008d(eå\fdj\u0007m\u0098ë-uRÀ\u0094?\u0007e\u007fP¦#º·ö\u000e \u0001ðû\u000f\\5\u0080\u0002\u0090³§Û6\u008b\u009c¡\u0002ç\u008b\u0019H£®5¾\u0003º°\u0088`\u0088\u0095(ªØ\u009b9Ìâc\u00985\u0000oí!(K\u000eZ©\u00adG`ÂéY\rt¯óûrô¡ñ\u0001>ÙòZ f\u0010\fä\u009aõ´v6\u001eíV\r't\u000b>®(å/'\u0004â¼\f\u0013lµ²î\tÚûÑ)¦\u0098¥9ë\u009ap÷ºÕüûlÖÓ\u009dßúX@¤6ð\u0018½u\u0000\nÄê\u000b0 Ñ\u0089rm\u0097t\u0088-r!°å\u000f\u0005~\u0018ãË\u008cY±du\u0015,1/Û\tG\u0016mP¡\u008cA\u0091øØø\u0010Â\u000bÃ\u0019íÙ\u009eÆî\u0000ð\u009b\tâä-\u0010\u0094\u00979ßÂ\u0002\u0097¦\u0015g\u001c<l\u0003\u0006M(~O>Áä Z\u000fÕcú%Ñg0ñ\u0090eÒ|s\u009b\"\u007fî_ÐÄ2\u0082%Ò\u0098ñã&´û\u0084ï û\u0005Noa2¥D\u0017èÒ\u0005\u0083´\u0089\u001e«B\u000e\u008aá\u0000Üícµ\\\u001e\\·mX «BñÉbÊ¾kù;Õ©^ë¯Ü®½\u0096hQ$'pFQ×\u000e+md¨8®{ôFÙ\u001cá\u0091\"ì\"FÝÁøãêAbÆ\u008fX\u009cü)6Å²Tý\u000b\u007flø¸\u009c\u0084B«·³ütÉàqÖ7\u0084dÎÎÌàW\u0093\u0018EF=\u0007\u0080)b¼¶l=¹Ê\u001a¬¹%GÌÕqÐÜÀ \u0013yµ1\u0093!)f®1¢r<èl\r&\u009b6\u008eÕèKÞ%YTrQ<³Á(c°ãô\u00864ú×[\u0012:\u008a¿\bærâ\u001c9BTØô\u009aòw·Ð\u0093.\u0092ï5Hµÿ²¼i¶\u0018\u0001ïhõÐ\u0093\u0016º\u008b]>MJÃ`\u0098û\f»:2Þê. \u008c0s\"NYbvÀ\\\u009fÇ\u0080\u0003\u0095+yî\u0094V\u009fòR\u008f©¾\u001dbÁ\u0089-¬(¨Í\u00861ø\u0015g$\u0081=Å\u009bÿx\u0093\u0002\u0081\u0086Itæ=@ì.\u008d&\u0096÷3o\u008b´áë?;\u0098øû \u0088î\u0092²f&eú\b\u009ej\u009e\u00195íbRB\u0018Òz\u0097\u0097¢¯\u0095Ú\u0003Ò©\u0012E \u0016»í¶\u0080µ}\u008cq\u008aðÒ§Q»ní\u00049\u001djp\u0007:>\u0001\u009f\n\u0000\t¸&\u0010KJ\u000f\\±ÜÊuf\u0017k<°|±m\u0010³7ÚfGì\u0016kÊ\báä5}\u0096% Cà§J\u000f¨Ç}?óÒô¤FÉcÓ\u0085øN9 jÙàÿ£ÏÐ\u0080¸- \u008an\u0006¹V\u0007\"\u0017ÍT\fÞz~ú\u001933DSÃÂ\u009eÎäÓé<0\u009cÑ2\u0010ëÓj&\\m X\u009fQ K\u0003k¹Û";
      int var17 = "$\u0011B©wñ\u0018\u0018\u000ejx\u0090\u008a\u0085V°\u0089+\u0099ó\u0096~æ0\u009c8Ã1ðI`_\u0095\u0016\u0086õßHLØs\u0013ë´\u0014øuD\u0010Õ ;át»V\u0001õÊû{9ýl¦\u0010sèz\u0093¸þ*zÒp\u001b\u0093~\\Æ\u0019 Ýª7 sJðÎî\r¯\u0000\u0016c\u00ad2ªª%\u0094ùlX¡\u0095xmPBÏp\u001a\u0018Ñ¹\u007fà\u0088\u0007Ü-.qî³·*:\u0013¤|\u009cg\u0084a!µ(f)\u000f\u001e\u0007.\u0080\u008dA\u0081¥=Ô\u008d(eå\fdj\u0007m\u0098ë-uRÀ\u0094?\u0007e\u007fP¦#º·ö\u000e \u0001ðû\u000f\\5\u0080\u0002\u0090³§Û6\u008b\u009c¡\u0002ç\u008b\u0019H£®5¾\u0003º°\u0088`\u0088\u0095(ªØ\u009b9Ìâc\u00985\u0000oí!(K\u000eZ©\u00adG`ÂéY\rt¯óûrô¡ñ\u0001>ÙòZ f\u0010\fä\u009aõ´v6\u001eíV\r't\u000b>®(å/'\u0004â¼\f\u0013lµ²î\tÚûÑ)¦\u0098¥9ë\u009ap÷ºÕüûlÖÓ\u009dßúX@¤6ð\u0018½u\u0000\nÄê\u000b0 Ñ\u0089rm\u0097t\u0088-r!°å\u000f\u0005~\u0018ãË\u008cY±du\u0015,1/Û\tG\u0016mP¡\u008cA\u0091øØø\u0010Â\u000bÃ\u0019íÙ\u009eÆî\u0000ð\u009b\tâä-\u0010\u0094\u00979ßÂ\u0002\u0097¦\u0015g\u001c<l\u0003\u0006M(~O>Áä Z\u000fÕcú%Ñg0ñ\u0090eÒ|s\u009b\"\u007fî_ÐÄ2\u0082%Ò\u0098ñã&´û\u0084ï û\u0005Noa2¥D\u0017èÒ\u0005\u0083´\u0089\u001e«B\u000e\u008aá\u0000Üícµ\\\u001e\\·mX «BñÉbÊ¾kù;Õ©^ë¯Ü®½\u0096hQ$'pFQ×\u000e+md¨8®{ôFÙ\u001cá\u0091\"ì\"FÝÁøãêAbÆ\u008fX\u009cü)6Å²Tý\u000b\u007flø¸\u009c\u0084B«·³ütÉàqÖ7\u0084dÎÎÌàW\u0093\u0018EF=\u0007\u0080)b¼¶l=¹Ê\u001a¬¹%GÌÕqÐÜÀ \u0013yµ1\u0093!)f®1¢r<èl\r&\u009b6\u008eÕèKÞ%YTrQ<³Á(c°ãô\u00864ú×[\u0012:\u008a¿\bærâ\u001c9BTØô\u009aòw·Ð\u0093.\u0092ï5Hµÿ²¼i¶\u0018\u0001ïhõÐ\u0093\u0016º\u008b]>MJÃ`\u0098û\f»:2Þê. \u008c0s\"NYbvÀ\\\u009fÇ\u0080\u0003\u0095+yî\u0094V\u009fòR\u008f©¾\u001dbÁ\u0089-¬(¨Í\u00861ø\u0015g$\u0081=Å\u009bÿx\u0093\u0002\u0081\u0086Itæ=@ì.\u008d&\u0096÷3o\u008b´áë?;\u0098øû \u0088î\u0092²f&eú\b\u009ej\u009e\u00195íbRB\u0018Òz\u0097\u0097¢¯\u0095Ú\u0003Ò©\u0012E \u0016»í¶\u0080µ}\u008cq\u008aðÒ§Q»ní\u00049\u001djp\u0007:>\u0001\u009f\n\u0000\t¸&\u0010KJ\u000f\\±ÜÊuf\u0017k<°|±m\u0010³7ÚfGì\u0016kÊ\báä5}\u0096% Cà§J\u000f¨Ç}?óÒô¤FÉcÓ\u0085øN9 jÙàÿ£ÏÐ\u0080¸- \u008an\u0006¹V\u0007\"\u0017ÍT\fÞz~ú\u001933DSÃÂ\u009eÎäÓé<0\u009cÑ2\u0010ëÓj&\\m X\u009fQ K\u0003k¹Û".length();
      char var14 = '0';
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
                  c = var18;
                  e = new String[33];
                  l = new HashMap(13);
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
                  String var4 = "Y°µ\u0005P*·)\u0002gcÇPîjU\n^\u0006!Ö\u001fÂ¬\u00161Ü|1sü$Ï6n&\u00078\u009c]Ê\u0017\u001eå±8\u0002k±®Ç\u0087ñ\u0002\u0092åÚ\u0080\u008b\f\u0086ÔÛ$½óÖ9(/#\u0012zS¿î}«æª";
                  int var5 = "Y°µ\u0005P*·)\u0002gcÇPîjU\n^\u0006!Ö\u001fÂ¬\u00161Ü|1sü$Ï6n&\u00078\u009c]Ê\u0017\u001eå±8\u0002k±®Ç\u0087ñ\u0002\u0092åÚ\u0080\u008b\f\u0086ÔÛ$½óÖ9(/#\u0012zS¿î}«æª".length();
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
                              k = new Integer[12];
                              KProperty[] var28 = new KProperty[true.w<invokedynamic>(29709, 5166134945935239751L ^ var20)];
                              var28[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(or.class, true.p<invokedynamic>(300, 7110432284019521144L ^ var20), true.p<invokedynamic>(31267, 1719471223049129340L ^ var20), 0)));
                              var28[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(or.class, true.p<invokedynamic>(26508, 8420732029465333965L ^ var20), true.p<invokedynamic>(3884, 4997291455533676647L ^ var20), 0)));
                              var28[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(or.class, true.p<invokedynamic>(3739, 2479260984416893388L ^ var20), true.p<invokedynamic>(28524, 6646643342352783397L ^ var20), 0)));
                              var28[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(or.class, true.p<invokedynamic>(22623, 2792853261827747596L ^ var20), true.p<invokedynamic>(19169, 2078251894732340666L ^ var20), 0)));
                              var28[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(or.class, true.p<invokedynamic>(17049, 2958644600800130501L ^ var20), true.p<invokedynamic>(560, 2836254467776804200L ^ var20), 0)));
                              var28[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(or.class, true.p<invokedynamic>(23757, 1833504866387340175L ^ var20), true.p<invokedynamic>(4611, 2322011503124145479L ^ var20), 0)));
                              var28[true.w<invokedynamic>(19883, 7148804399739048940L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(or.class, true.p<invokedynamic>(14271, 7215884383854313698L ^ var20), true.p<invokedynamic>(14604, 488175463585795650L ^ var20), 0)));
                              w = var28;
                              A = new or(var26);
                              d = qi.M((il)A, true.p<invokedynamic>(16014, 4558660540947679681L ^ var20), (Enum)fv.VANILLA, (pj)null, (Function0)null, true.w<invokedynamic>(2262, 6462033302740620959L ^ var20), (Object)null, var22);
                              g = qi.R((il)A, true.p<invokedynamic>(8125, 8014172930782783723L ^ var20), false, (pj)null, or::Q, 4, var24, (Object)null);
                              W = qi.R((il)A, true.p<invokedynamic>(118, 4852528020560836411L ^ var20), false, (pj)null, or::J, 4, var24, (Object)null);
                              X = qi.R((il)A, true.p<invokedynamic>(15291, 5906406615350463717L ^ var20), true, (pj)null, or::L, 4, var24, (Object)null);
                              N = qi.R((il)A, true.p<invokedynamic>(28999, 4483113659550205444L ^ var20), true, (pj)null, or::H, 4, var24, (Object)null);
                              n = qi.R((il)A, true.p<invokedynamic>(17507, 8815395990622090038L ^ var20), true, (pj)null, or::W, 4, var24, (Object)null);
                              I = qi.M((il)A, true.p<invokedynamic>(25546, 2627689951077536922L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, or::j, 4, (Object)null, var22);
                              x = new iv();
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0005Û\u0098Ò³\u0002ÕUn#ÒÖ 60È";
                           var5 = "\u0005Û\u0098Ò³\u0002ÕUn#ÒÖ 60È".length();
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

               var15 = "\u0016\"ªKÓf8ïvh\u0082\u0096Q\u0087\u0080Ø \u0094\u0099</(`À\u00102Q\u0098$j\u0016\u0000é½¯\u0090â³\u0010ú\u009b";
               var17 = "\u0016\"ªKÓf8ïvh\u0082\u0096Q\u0087\u0080Ø \u0094\u0099</(`À\u00102Q\u0098$j\u0016\u0000é½¯\u0090â³\u0010ú\u009b".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24049;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/or", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/or" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29939;
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
            throw new RuntimeException("su/catlean/or", var14);
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
         throw new RuntimeException("su/catlean/or" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
