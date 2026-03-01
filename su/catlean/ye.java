package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1684;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.AfterEntitySpawn;
import su.catlean.gofra.Flow;

public final class ye extends k9 {
   @NotNull
   public static final ye N;
   static final KProperty[] u;
   @NotNull
   private static final zo U;
   @NotNull
   private static final zr I;
   @NotNull
   private static final iv S;
   @Nullable
   private static class_2338 C;
   private static int t;
   private static int T;
   @NotNull
   private static final HashMap m;
   private static final long b = j0.a(-313090713709974914L, 8989237802051835496L, MethodHandles.lookup().lookupClass()).a(98409482576857L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;
   private static final long k;

   private ye(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var6 = var4 ^ 129635793641790L;
      super(var6, true.h<invokedynamic>(28255, 2253620266846469429L ^ var4), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean d(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 40465121225058L;
      int var3 = (int)((var1 ^ 40465121225058L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)U.k((short)var3, this, u[0], (short)var4, var5);
   }

   private final uw u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 68338902855752L;
      int var3 = (int)((var1 ^ 68338902855752L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (uw)I.k((short)var3, this, u[1], (short)var4, var5);
   }

   @Flow
   private final void n(AfterEntitySpawn var1) {
      long var2 = b ^ 19395815948169L;
      long var10001 = var2 ^ 49538875916256L;
      int var4 = (int)((var2 ^ 49538875916256L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);

      try {
         if (var1.getEntity() instanceof class_1684) {
            s8.i((char)var4, var5, (short)var6).method_18456().stream().min(Comparator.comparingDouble(ye::e)).ifPresent(ye::g);
         }

      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, -5095996143929913207L, var2);
      }
   }

   @Flow(
      priority = -10
   )
   private final void R(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final float R(class_2338 param1, long param2, float param4) {
      // $FF: Couldn't be decompiled
   }

   private final class_2338 T(int var1, float var2, char var3, float var4, int var5) {
      long var6 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ b;
      long var8 = var6 ^ 108218591358383L;
      long var10001 = var6 ^ 108807776143054L;
      int var10 = (int)((var6 ^ 108807776143054L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var6 ^ 98570492709953L;
      class_243 var15 = s8.f(var8).method_33571();
      Intrinsics.checkNotNullExpressionValue(var15, true.h<invokedynamic>(29384, 126985072812307551L ^ var6));
      return this.e(var13, var15, this.b((short)var10, (char)var11, var4, var2, var12));
   }

   private final class_2338 e(long param1, class_243 param3, class_243 param4) {
      // $FF: Couldn't be decompiled
   }

   private final class_243 L(class_243 var1, long var2, class_243 var4) {
      var2 ^= b;
      long var10001 = var2 ^ 125428714371555L;
      int var5 = (int)((var2 ^ 125428714371555L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);

      class_243 var10000;
      double var9;
      label17: {
         try {
            var10000 = var1;
            if (s8.i((char)var5, var6, (short)var7).method_8320(class_2338.method_49638((class_2374)var4)).method_26204() instanceof class_2404) {
               var9 = 0.8D;
               break label17;
            }
         } catch (NumberFormatException var8) {
            throw var8.A<invokedynamic>(var8, -4664535572505487734L, var2);
         }

         var9 = 0.99D;
      }

      var10000 = var10000.method_1021(var9);
      Intrinsics.checkNotNullExpressionValue(var10000, true.h<invokedynamic>(18121, 3554289540726165933L ^ var2));
      return var10000;
   }

   private final class_243 b(short param1, char param2, float param3, float param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   private static final double D(AfterEntitySpawn var0, class_742 var1) {
      long var2 = b ^ 76718644302808L;
      long var4 = var2 ^ 36277636405526L;
      return var1.method_5707(N.W(var4, var0.getEntity()));
   }

   private static final double e(Function1 var0, Object var1) {
      return ((Number)var0.invoke(var1)).doubleValue();
   }

   private static final Unit v(AfterEntitySpawn param0, class_742 param1) {
      // $FF: Couldn't be decompiled
   }

   private static final void g(Function1 var0, Object var1) {
      var0.invoke(var1);
   }

   private static final Unit Z(qq var0) {
      long var1 = b ^ 60609178658625L;
      long var3 = var1 ^ 109279508808451L;
      long var5 = var1 ^ 126988880179649L;
      ff.y(class_1268.field_5808, var5, var0.M(), var0.C());
      h4.G((class_2596)(new class_2879(class_1268.field_5808)), var3);
      return Unit.INSTANCE;
   }

   private static final Unit K(qq var0) {
      long var1 = b ^ 77376700916574L;
      long var3 = var1 ^ 65908050273783L;
      long var5 = var1 ^ 81951800435147L;
      dk var10000 = dk.I;
      class_1792 var10001 = class_1802.field_8634;
      Intrinsics.checkNotNullExpressionValue(var10001, true.h<invokedynamic>(25220, 3091441287147138851L ^ var1));
      var10000.Z(var10001, N.u(var5), ye::Z, var3);
      return Unit.INSTANCE;
   }

   static {
      long var25 = b ^ 17980976562484L;
      long var27 = var25 ^ 71357416759729L;
      long var10001 = var25 ^ 56496047635318L;
      int var29 = (int)((var25 ^ 56496047635318L) >>> 48);
      int var30 = (int)(var10001 << 16 >>> 48);
      int var31 = (int)(var10001 << 32 >>> 32);
      long var32 = var25 ^ 126258223359554L;
      e = new HashMap(13);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[24];
      int var21 = 0;
      String var20 = "ÜÉ\u0087\u0000\u009f\u009dp{5\u0013;¶\u008d\u001f¢2ÍðÌ¡Õ`XåÞ\u0003¼í\u009cÀ»¼÷\u009a\r\u0091\u0082\u0098 ôÅ\u0010æÔ²\u000f¼óa_\u000eu\\\f\u000eTÝÜÕ28ò\u0001ïv\u009cyþ\u009fÒï\u0094KÛP\bÝË\f\u0081÷@\u0099\b>ÃwJ¤éã×Q:Gã\u008c¾\u0093ª\u0016¿\u000fCmFÏÑ\\ Ñ*µ%d\u0005Æ{·\u000fÊÏ¶>õ\u009cù°(Û*Â-<\r4)¨ \u0001n¥s\u0010¸H\u0088ê±³\u001cú\u0018<[ié>8Z\u001dÕqjCÆ»\u0083â Ô\u009cÂÛbÉ^Ïþ\u0081\u0090ZÆ\f\u0090L,\u0013Õ©KÂ\u0001\u009dyêðþ\u0007\u0089¾\r\u0018\u0015dPí=í\u009d<:²(Æ\u0087Î{ñm\u0090a\u008bHU\ró(h\u0014\fª¿ \u0097\u001eOÃãQ\u0086\u0015ò\u0097\u009c\fPì4ßvcHq¡üõÎ´\u0096=\u000bÖê\u001a±}å\u0080 8ÐjÆè\u0086\u009aÞC\u0091SAY\u0014\u008a\u0015Ó\u0092@ |Êò1_¢.\fÄ¼Î±Ðkf;é±\u0084\u0097N´\u001a\u0011òix\u0011\u0087èÔu\n¢¤FHA\u0084E\u009ciL\bX\u0094\u0096w\tø¬ºÁ\u0007öI\u0017\u0088\u0097\u009cÕ!¶p\u000fæõmÿ³<H\u001d\u001aG÷±[k;¿r\u0094ª$D\u001aw*0)>Áòó(4\u0099¹Ñ9W\\\u008a¦Äw\u0010\u009fÂ,/\fÚØ?Y\u0001\u0095²:jHõ\u0018Æw\u009f\b)W9¶\u0097\u0087¶\u0001\u009eM*\u0011\\×W}õ\u008f\u0015\u001d(§g\u008cáãcYß\u001cSC\u0091®v\u0005þò 3\u0081r^ÔÉÁ\tì,®d\u009a\u000fk\u000f/¿ñ\t\u009e` \n\u008c ?\u009b\u009cÀ9ª°%\u0087fL8\u0085\u008bí!9ÎÊäÁ\u008e\u001dÜ]\u0005Çw\u000e(hµ\u0004E/\fÞßL7¿úÒ&\u009b6Âê\u001c½\u008fo\u000b\u0096µÅ\u0005E\u008fLETí³ôª\u0001[\u0089W )á\u0014¥F\u0013ãï\u0013ÜàP\u0093øZ\u009d\u0094Ô\u001f\u0000\u0089ñÑ\u0007\u00978í½\u008ex\u000f\u0005 \nùootG\u0012x\u0002ðþ\u0015\"\u0014.\u008béRw\u0001(Ü\u0011\u0014~PDxom!+0\u009cûY@\u0001\u009d\u0083zL6©K¾e¹jÙÊÈ\u0094Ö\f(\u0011´\u0096\u008dp\u0006\t\u0011v¤2¢\n\u008eVR\f\u0018¾\u0001M¼ây/\u0018e\u008dÀ\u0016ëT|;Ù\u008c]\u0089À\u0001©\u0005\u008c\\³qä\u001d²\r\u0010@*éèß±QßºÂ\u001dÍV z&\u0018\u009eb\u0083¢X^\u0005ÕÂ;û³¾ÚT2ö)LpZ\u00889\u0084 f¹3Ìu\u0097m§×ï\u0091 \tI+\u0018mì\nÊþ\u0088\u00016ªà¦\u000e#«\u0010l Å\u0095pq¯~D\u00820S\u0002dÄ\u00adßÅúLCè\u0089$e¦gîØ\u0017Exÿó Rò\u001a+WPªÅâÖ\u0094ü\u0019M\u0010Þì¯B\u009eÞ\n«éÑõ'\u0014P.\u0000é\u0010\u0083©À)\u0002\u0001ï¬¡0&d\u0085/\u001d\u0097 y\u0016Ó$J¤á\u0080ûÐÞéoÔWàÁÙÿ\u008dCÏÜ5\u0085\r\u0098óðÓ¡L";
      int var22 = "ÜÉ\u0087\u0000\u009f\u009dp{5\u0013;¶\u008d\u001f¢2ÍðÌ¡Õ`XåÞ\u0003¼í\u009cÀ»¼÷\u009a\r\u0091\u0082\u0098 ôÅ\u0010æÔ²\u000f¼óa_\u000eu\\\f\u000eTÝÜÕ28ò\u0001ïv\u009cyþ\u009fÒï\u0094KÛP\bÝË\f\u0081÷@\u0099\b>ÃwJ¤éã×Q:Gã\u008c¾\u0093ª\u0016¿\u000fCmFÏÑ\\ Ñ*µ%d\u0005Æ{·\u000fÊÏ¶>õ\u009cù°(Û*Â-<\r4)¨ \u0001n¥s\u0010¸H\u0088ê±³\u001cú\u0018<[ié>8Z\u001dÕqjCÆ»\u0083â Ô\u009cÂÛbÉ^Ïþ\u0081\u0090ZÆ\f\u0090L,\u0013Õ©KÂ\u0001\u009dyêðþ\u0007\u0089¾\r\u0018\u0015dPí=í\u009d<:²(Æ\u0087Î{ñm\u0090a\u008bHU\ró(h\u0014\fª¿ \u0097\u001eOÃãQ\u0086\u0015ò\u0097\u009c\fPì4ßvcHq¡üõÎ´\u0096=\u000bÖê\u001a±}å\u0080 8ÐjÆè\u0086\u009aÞC\u0091SAY\u0014\u008a\u0015Ó\u0092@ |Êò1_¢.\fÄ¼Î±Ðkf;é±\u0084\u0097N´\u001a\u0011òix\u0011\u0087èÔu\n¢¤FHA\u0084E\u009ciL\bX\u0094\u0096w\tø¬ºÁ\u0007öI\u0017\u0088\u0097\u009cÕ!¶p\u000fæõmÿ³<H\u001d\u001aG÷±[k;¿r\u0094ª$D\u001aw*0)>Áòó(4\u0099¹Ñ9W\\\u008a¦Äw\u0010\u009fÂ,/\fÚØ?Y\u0001\u0095²:jHõ\u0018Æw\u009f\b)W9¶\u0097\u0087¶\u0001\u009eM*\u0011\\×W}õ\u008f\u0015\u001d(§g\u008cáãcYß\u001cSC\u0091®v\u0005þò 3\u0081r^ÔÉÁ\tì,®d\u009a\u000fk\u000f/¿ñ\t\u009e` \n\u008c ?\u009b\u009cÀ9ª°%\u0087fL8\u0085\u008bí!9ÎÊäÁ\u008e\u001dÜ]\u0005Çw\u000e(hµ\u0004E/\fÞßL7¿úÒ&\u009b6Âê\u001c½\u008fo\u000b\u0096µÅ\u0005E\u008fLETí³ôª\u0001[\u0089W )á\u0014¥F\u0013ãï\u0013ÜàP\u0093øZ\u009d\u0094Ô\u001f\u0000\u0089ñÑ\u0007\u00978í½\u008ex\u000f\u0005 \nùootG\u0012x\u0002ðþ\u0015\"\u0014.\u008béRw\u0001(Ü\u0011\u0014~PDxom!+0\u009cûY@\u0001\u009d\u0083zL6©K¾e¹jÙÊÈ\u0094Ö\f(\u0011´\u0096\u008dp\u0006\t\u0011v¤2¢\n\u008eVR\f\u0018¾\u0001M¼ây/\u0018e\u008dÀ\u0016ëT|;Ù\u008c]\u0089À\u0001©\u0005\u008c\\³qä\u001d²\r\u0010@*éèß±QßºÂ\u001dÍV z&\u0018\u009eb\u0083¢X^\u0005ÕÂ;û³¾ÚT2ö)LpZ\u00889\u0084 f¹3Ìu\u0097m§×ï\u0091 \tI+\u0018mì\nÊþ\u0088\u00016ªà¦\u000e#«\u0010l Å\u0095pq¯~D\u00820S\u0002dÄ\u00adßÅúLCè\u0089$e¦gîØ\u0017Exÿó Rò\u001a+WPªÅâÖ\u0094ü\u0019M\u0010Þì¯B\u009eÞ\n«éÑõ'\u0014P.\u0000é\u0010\u0083©À)\u0002\u0001ï¬¡0&d\u0085/\u001d\u0097 y\u0016Ó$J¤á\u0080ûÐÞéoÔWàÁÙÿ\u008dCÏÜ5\u0085\r\u0098óðÓ¡L".length();
      char var19 = 128;
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var35 = var20.substring(var18, var18 + var19);
         byte var37 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var35.getBytes("ISO-8859-1"));
            String var42 = b(var24).intern();
            switch(var37) {
            case 0:
               var23[var21++] = var42;
               if ((var18 += var19) >= var22) {
                  c = var23;
                  d = new String[24];
                  i = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[8];
                  int var8 = 0;
                  String var9 = "\u0089#î+ãì\u0094\u0088\u0004\u0082°:QVßÅýs¬&\u0098Èì\u0099®×\u008b\u001d¾è÷ka 8ø$ÂJèÁ'ùÐ¬x$;";
                  int var10 = "\u0089#î+ãì\u0094\u0088\u0004\u0082°:QVßÅýs¬&\u0098Èì\u0099®×\u008b\u001d¾è÷ka 8ø$ÂJèÁ'ùÐ¬x$;".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var41 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var41, var7).getBytes("ISO-8859-1");
                     long[] var38 = var11;
                     var41 = var8++;
                     long var45 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var46 = -1;

                     while(true) {
                        long var13 = var45;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var48 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var46) {
                        case 0:
                           var38[var41] = var48;
                           if (var7 >= var10) {
                              f = var11;
                              g = new Integer[8];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -5077326393560261821L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var45 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var44 = true;
                              k = var45;
                              KProperty[] var34 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ye.class, true.h<invokedynamic>(7417, 4479684208500601650L ^ var25), true.h<invokedynamic>(6908, 7682172836564399406L ^ var25), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ye.class, true.h<invokedynamic>(261, 428779783272754889L ^ var25), true.h<invokedynamic>(18046, 5227069238852168107L ^ var25), 0)))};
                              u = var34;
                              N = new ye((char)var29, (char)var30, var31);
                              U = qi.R((il)N, true.h<invokedynamic>(16195, 1207604301768478858L ^ var25), false, (pj)null, (Function0)null, true.b<invokedynamic>(9789, 7917993943526313685L ^ var25), var32, (Object)null);
                              I = qi.M((il)N, true.h<invokedynamic>(22215, 7465996972264077593L ^ var25), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.b<invokedynamic>(8324, 3512027105518946411L ^ var25), (Object)null, var27);
                              S = new iv();
                              m = new HashMap();
                              return;
                           }
                           break;
                        default:
                           var38[var41] = var48;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u0090\u0004\u0003ÈùI5*\u009c(¾à\u0019ñ_b";
                           var10 = "\u0090\u0004\u0003ÈùI5*\u009c(¾à\u0019ñ_b".length();
                           var7 = 0;
                        }

                        var41 = var7;
                        var7 += 8;
                        var12 = var9.substring(var41, var7).getBytes("ISO-8859-1");
                        var38 = var11;
                        var41 = var8++;
                        var45 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var46 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var42;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "£\u009a\r-\u0088\u0091r¢ç)ØB7¸Ì\"\u000e\u0019)\f\u001c\u00855H\u0007Á\u0006æCãÀz0.ÇJÙ3c¤3ØÃ-;\u0019j®*¤ø\u0002\u0007\u009c\u0011§\u009dºÿv`\u0085È{¾u\bùÿÿµ\u0007¯#<UÊ~à{¤";
               var22 = "£\u009a\r-\u0088\u0091r¢ç)ØB7¸Ì\"\u000e\u0019)\f\u001c\u00855H\u0007Á\u0006æCãÀz0.ÇJÙ3c¤3ØÃ-;\u0019j®*¤ø\u0002\u0007\u009c\u0011§\u009dºÿv`\u0085È{¾u\bùÿÿµ\u0007¯#<UÊ~à{¤".length();
               var19 = ' ';
               var18 = -1;
            }

            ++var18;
            var35 = var20.substring(var18, var18 + var19);
            var37 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26938;
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
            throw new RuntimeException("su/catlean/ye", var10);
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
         throw new RuntimeException("su/catlean/ye" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11784;
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
            throw new RuntimeException("su/catlean/ye", var14);
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
         throw new RuntimeException("su/catlean/ye" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
