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
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_1935;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;

public final class c9 {
   @NotNull
   public static final c9 P;
   private static final long a = j0.a(6406519312198232674L, 6599618800250864707L, MethodHandles.lookup().lookupClass()).a(12801108937197L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private c9() {
   }

   @NotNull
   public final class_1799 Z(long a, int id) {
      var1 ^= a;
      List var5 = null;
      k9[] var10000 = -8947804816488209914L.A<invokedynamic>(-8947804816488209914L, var1);
      class_2561 var6 = null;
      k9[] var4 = var10000;

      label64: {
         label63: {
            class_1293[] var8;
            int var11;
            class_5250 var12;
            long var10001;
            label62: {
               label61: {
                  label60: {
                     label59: {
                        label58: {
                           label57: {
                              label56: {
                                 label55: {
                                    try {
                                       var11 = var3;
                                       if (var4 == null) {
                                          break label62;
                                       }

                                       switch(var3) {
                                       case -16711936:
                                          break label58;
                                       case -16711681:
                                          break label61;
                                       case -6684877:
                                          break label56;
                                       case -3407872:
                                          break;
                                       case -65281:
                                          break label60;
                                       case -39424:
                                          break label57;
                                       case -256:
                                          break label59;
                                       case -1:
                                          break label55;
                                       default:
                                          break label64;
                                       }
                                    } catch (NumberFormatException var9) {
                                       throw var9.A<invokedynamic>(var9, -9052743735142845340L, var1);
                                    }

                                    var11 = 2;
                                    break label62;
                                 }

                                 var8 = new class_1293[]{new class_1293(class_1294.field_5919, true.u<invokedynamic>(19901, 601853155212557660L ^ var1), 0), null};
                                 var10001 = 675116234902250260L ^ var1;
                                 var8[1] = new class_1293(class_1294.field_5912, true.u<invokedynamic>(438, 1654806887679668568L ^ var1), 0);
                                 var5 = CollectionsKt.listOf(var8);
                                 var12 = class_2561.method_43470(true.y<invokedynamic>(1363, var10001));
                                 Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
                                 var6 = (class_2561)var12;
                                 break label63;
                              }

                              var8 = new class_1293[4];
                              var8[0] = new class_1293(class_1294.field_5899, true.u<invokedynamic>(14670, 5215968999850281380L ^ var1), 1);
                              var10001 = 2778325851505293675L ^ var1;
                              var8[1] = new class_1293(class_1294.field_5909, true.u<invokedynamic>(1109, 3814662626412967102L ^ var1), 3);
                              var8[2] = new class_1293(class_1294.field_5911, true.u<invokedynamic>(1109, 3814662626412967102L ^ var1), 2);
                              var8[3] = new class_1293(class_1294.field_5920, true.u<invokedynamic>(27467, 4033943104583556013L ^ var1), 4);
                              var5 = CollectionsKt.listOf(var8);
                              var12 = class_2561.method_43470(true.y<invokedynamic>(24359, var10001));
                              Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
                              var6 = (class_2561)var12;
                              break label63;
                           }

                           var8 = new class_1293[5];
                           var8[0] = new class_1293(class_1294.field_5919, true.u<invokedynamic>(12894, 2748576110370423482L ^ var1), 0);
                           var10001 = 2556872450314070839L ^ var1;
                           var8[1] = new class_1293(class_1294.field_5912, true.u<invokedynamic>(28842, 8643188216223907917L ^ var1), 0);
                           var8[2] = new class_1293(class_1294.field_5903, true.u<invokedynamic>(1109, 3814662626412967102L ^ var1), true.u<invokedynamic>(9950, 4999578421271139887L ^ var1));
                           var8[3] = new class_1293(class_1294.field_5909, true.u<invokedynamic>(28842, 8643188216223907917L ^ var1), 2);
                           var8[4] = new class_1293(class_1294.field_5920, true.u<invokedynamic>(17979, 4681798737457542878L ^ var1), 4);
                           var5 = CollectionsKt.listOf(var8);
                           var12 = class_2561.method_43470(true.y<invokedynamic>(19831, var10001));
                           Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
                           var6 = (class_2561)var12;
                           break label63;
                        }

                        var8 = new class_1293[4];
                        var8[0] = new class_1293(class_1294.field_5914, true.u<invokedynamic>(28842, 8643188216223907917L ^ var1), 1);
                        var10001 = 7341820838034766613L ^ var1;
                        var8[1] = new class_1293(class_1294.field_5905, true.u<invokedynamic>(25124, 3733373588570297028L ^ var1), 0);
                        var8[2] = new class_1293(class_1294.field_5924, true.u<invokedynamic>(20283, 1998490573060636633L ^ var1), 1);
                        var8[3] = new class_1293(class_1294.field_5907, true.u<invokedynamic>(10646, 8268648814295095654L ^ var1), 0);
                        var5 = CollectionsKt.listOf(var8);
                        var12 = class_2561.method_43470(true.y<invokedynamic>(23888, var10001));
                        Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
                        var6 = (class_2561)var12;
                        break label63;
                     }

                     var8 = new class_1293[5];
                     var8[0] = new class_1293(class_1294.field_5918, true.u<invokedynamic>(19618, 4845333625572719693L ^ var1), 0);
                     var10001 = 6554608001995756218L ^ var1;
                     var8[1] = new class_1293(class_1294.field_5917, true.u<invokedynamic>(28842, 8643188216223907917L ^ var1), 0);
                     var8[2] = new class_1293(class_1294.field_5905, true.u<invokedynamic>(25124, 3733373588570297028L ^ var1), 0);
                     var8[3] = new class_1293(class_1294.field_5904, true.u<invokedynamic>(25124, 3733373588570297028L ^ var1), 2);
                     var8[4] = new class_1293(class_1294.field_5910, true.u<invokedynamic>(26162, 1277341213815789274L ^ var1), 2);
                     var5 = CollectionsKt.listOf(var8);
                     var12 = class_2561.method_43470(true.y<invokedynamic>(29945, var10001));
                     Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
                     var6 = (class_2561)var12;
                     break label63;
                  }

                  var8 = new class_1293[]{new class_1293(class_1294.field_5914, true.u<invokedynamic>(24926, 3828988396818682295L ^ var1), 2), null};
                  var10001 = 8053229576426213288L ^ var1;
                  var8[1] = new class_1293(class_1294.field_5924, true.u<invokedynamic>(25642, 308237255845696713L ^ var1), 2);
                  var5 = CollectionsKt.listOf(var8);
                  var12 = class_2561.method_43470(true.y<invokedynamic>(27114, var10001));
                  Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
                  var6 = (class_2561)var12;
                  break label63;
               }

               var8 = new class_1293[]{new class_1293(class_1294.field_5913, true.u<invokedynamic>(28842, 8643188216223907917L ^ var1), 0), null};
               var10001 = 8313797986548538599L ^ var1;
               var8[1] = new class_1293(class_1294.field_5904, true.u<invokedynamic>(28842, 8643188216223907917L ^ var1), 2);
               var5 = CollectionsKt.listOf(var8);
               var12 = class_2561.method_43470(true.y<invokedynamic>(31395, var10001));
               Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(28130, 4609349489658776483L ^ var1));
               var6 = (class_2561)var12;
               break label63;
            }

            var8 = new class_1293[var11];
            var8[0] = new class_1293(class_1294.field_5907, true.u<invokedynamic>(30546, 9002034918728419262L ^ var1), 0);
            var10001 = 6337516343353839294L ^ var1;
            var8[1] = new class_1293(class_1294.field_5910, true.u<invokedynamic>(30272, 808786170391119533L ^ var1), 3);
            var5 = CollectionsKt.listOf(var8);
            var12 = class_2561.method_43470(true.y<invokedynamic>(10481, var10001));
            Intrinsics.checkNotNullExpressionValue(var12, true.y<invokedynamic>(8567, 3527656042759718714L ^ var1));
            var6 = (class_2561)var12;
         }

         class_1799 var7 = new class_1799((class_1935)class_1802.field_8436);
         var7.method_57379(class_9334.field_49651, new class_1844(Optional.empty(), Optional.empty(), var5, Optional.empty()));
         var7.method_57379(class_9334.field_49631, var6);
         return var7;
      }

      class_1799 var10 = new class_1799((class_1935)class_1802.field_8436);
      var10.method_57379(class_9334.field_49631, class_2561.method_43470(true.y<invokedynamic>(9361, 2283009720398774999L ^ var1)));
      return var10;
   }

   static {
      long var11 = a ^ 117661600917897L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[11];
      int var18 = 0;
      String var17 = "Þ\u0099\u0003)Ô9\u0084;+í\u009e\u0099\u0017K»»³³,»þ\u00910;\u009b1ö£,Þ÷»ý\u000fëzjJ4+HòÙ\u0095ñ\u001e#ç}\u0096uý$ÃÄâ\u0095\u0098¹½ßÚXY'0§s)¼d\u0014\u0091±777\u0000¹ÎHh\u0085N\u0016ò\u008dÌÜèøt±£ºÀ\u0016mO\u00adµÿ³\u0093ÜY¿·p!\u000bÇ\u0082A¥t8\u009fÓ.)ûs\u008b\u008a2ÅQ®\u0004B\u0098K\u0019\\\u0085´`l÷xeOCC{à\u008cs\b\u001a/O@R\u008e_\u0086p-ø\u001bá%É@AeåÃ\"\u0093\u0006²ïäós\u009e|¤I\u001bYë\u0014ú\u0017ç\u0087R²kxÓé¯Û,ü\u0091\u0087ÌR5Ý\u0097\u000f\u0080È²F[º¿}ß\u001e@HrîIp²Ï+)j¤)\u009a^\u0082\u009c\u00adBo7\b´ÕF|\u008dáø\u008er¹#åî²\u0001\u0096E&J\u0086\u007f\u009cøÅ=R*äMÍ\u009fwX7\u0012Õ«aDv`(Ø .hç£a\u0007\u0097\u0011¸\u009cbóÂL\u0005î|üy?¤o\u0000@nÂ1èdK \u008dX\u00957\t\u0080Å\u009c\"AªÍ\u001dñI\u001dCÈ Ø[\u0081®\u0006j\u0099%\u007f\u008aO¥³Ù\u0098ç\u0007\u0019¢VÎÑ¸cÕ\u0095£U®5H\\¡ë\u001d}\u000fL\u0093_Xqoï+è\u001c\u000e´íA\u0081}\u0092P¨\u0084È?rök9Ûo\u009aË %\u009dÑHÃÁO.\u007fñ\u0088NcLfW\u001cï°ÏüÉù¼9<ÂÕ\u0096¾M\u009aÐ*\u008e\u001fKì\u0011mI]d9Ð\u0013\u0011Bõ[\u009a1½ÚÅ\u0002\u0013J·\fú\u0002\u0014\b\u0094?B\u009a¾â!Ç\u0092¯NÀPoo½~Òz\"òs\u0099\u0004âLY}Y\u009e\u0082~ÀZ?ëVï.Å\u009f04x\u0011ãà\u009a\"\u0080gèB\u0000:\u008acA\u0002ÉüÏìf=F9\u0017Ç\u0094G\fg=©·òäV·\u0006¡mx¾\u0082ï²*Ý,åJ ËK\rÒ¬á\u0002µ_ÉCí¤!ú¬\u000f\u0018ïSMdÇkàÀ+\u0093¼\u008c'É";
      int var19 = "Þ\u0099\u0003)Ô9\u0084;+í\u009e\u0099\u0017K»»³³,»þ\u00910;\u009b1ö£,Þ÷»ý\u000fëzjJ4+HòÙ\u0095ñ\u001e#ç}\u0096uý$ÃÄâ\u0095\u0098¹½ßÚXY'0§s)¼d\u0014\u0091±777\u0000¹ÎHh\u0085N\u0016ò\u008dÌÜèøt±£ºÀ\u0016mO\u00adµÿ³\u0093ÜY¿·p!\u000bÇ\u0082A¥t8\u009fÓ.)ûs\u008b\u008a2ÅQ®\u0004B\u0098K\u0019\\\u0085´`l÷xeOCC{à\u008cs\b\u001a/O@R\u008e_\u0086p-ø\u001bá%É@AeåÃ\"\u0093\u0006²ïäós\u009e|¤I\u001bYë\u0014ú\u0017ç\u0087R²kxÓé¯Û,ü\u0091\u0087ÌR5Ý\u0097\u000f\u0080È²F[º¿}ß\u001e@HrîIp²Ï+)j¤)\u009a^\u0082\u009c\u00adBo7\b´ÕF|\u008dáø\u008er¹#åî²\u0001\u0096E&J\u0086\u007f\u009cøÅ=R*äMÍ\u009fwX7\u0012Õ«aDv`(Ø .hç£a\u0007\u0097\u0011¸\u009cbóÂL\u0005î|üy?¤o\u0000@nÂ1èdK \u008dX\u00957\t\u0080Å\u009c\"AªÍ\u001dñI\u001dCÈ Ø[\u0081®\u0006j\u0099%\u007f\u008aO¥³Ù\u0098ç\u0007\u0019¢VÎÑ¸cÕ\u0095£U®5H\\¡ë\u001d}\u000fL\u0093_Xqoï+è\u001c\u000e´íA\u0081}\u0092P¨\u0084È?rök9Ûo\u009aË %\u009dÑHÃÁO.\u007fñ\u0088NcLfW\u001cï°ÏüÉù¼9<ÂÕ\u0096¾M\u009aÐ*\u008e\u001fKì\u0011mI]d9Ð\u0013\u0011Bõ[\u009a1½ÚÅ\u0002\u0013J·\fú\u0002\u0014\b\u0094?B\u009a¾â!Ç\u0092¯NÀPoo½~Òz\"òs\u0099\u0004âLY}Y\u009e\u0082~ÀZ?ëVï.Å\u009f04x\u0011ãà\u009a\"\u0080gèB\u0000:\u008acA\u0002ÉüÏìf=F9\u0017Ç\u0094G\fg=©·òäV·\u0006¡mx¾\u0082ï²*Ý,åJ ËK\rÒ¬á\u0002µ_ÉCí¤!ú¬\u000f\u0018ïSMdÇkàÀ+\u0093¼\u008c'É".length();
      char var16 = 'P';
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
                  c = new String[11];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[18];
                  int var3 = 0;
                  String var4 = "\u008b#±n\u001cÃ¡\u0098\u000e5¥ô2_\u009bzï:Ç9ß\u0003v1\u008fÝ[\u000ef\u0003ÄD·¹Zkm\u0094ñª\tkÐ\u0087iq\u0006weUÇg \u0082Ö\u0005¡N3Õ\t\u0002ç\u001fko&ø+¶ºå9[Ùç\u0019¢!È½`\u0098´çþA0Î\u0092òL\u0015ìÔ\u0010¿¾\u000eÂÃ\u008eF¨È!yE*à\u0093\u0081\u008b-\u008cXÀîë$?r%]µ(3¸";
                  int var5 = "\u008b#±n\u001cÃ¡\u0098\u000e5¥ô2_\u009bzï:Ç9ß\u0003v1\u008fÝ[\u000ef\u0003ÄD·¹Zkm\u0094ñª\tkÐ\u0087iq\u0006weUÇg \u0082Ö\u0005¡N3Õ\t\u0002ç\u001fko&ø+¶ºå9[Ùç\u0019¢!È½`\u0098´çþA0Î\u0092òL\u0015ìÔ\u0010¿¾\u000eÂÃ\u008eF¨È!yE*à\u0093\u0081\u008b-\u008cXÀîë$?r%]µ(3¸".length();
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
                              f = new Integer[18];
                              P = new c9();
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Ù&`>|\n¥òK\u0011\u0081DÜ\u0006\u0013ë";
                           var5 = "Ù&`>|\n¥òK\u0011\u0081DÜ\u0006\u0013ë".length();
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

               var17 = "ôð\u0005sréÑ>?BuÍK¿ð\u0007!Ã\u009fpó\\\u0016\u000eÅñ!ï\u0013\u008dB\u00939ùÊsË)Å^_Æ`¬%Ö\u008eiæ\u0092ôG\\'º\u0083o\u0010ÏËm\u0096Ü\u0083öà\u0098ìU£8\u0095\u0012t\u0086IZX2«ÀÔÂ¾òIÙSX¨\t<:J\u0090Ì´øF\u0087\u0002\u0097½¶\u007fªáªojÇíHríÓQÃ§\u000f³,´Îä\u009b¸C7\u0090J\u009fìd\u0087´\u009e®¶*\u001aXÃÇE\u009c¨YCb\u000eDÅ^ýÃÅj\u0092¤ó>Á\u0098\u008cè\u0003¾-³DLA¯\u009b¬\u008f";
               var19 = "ôð\u0005sréÑ>?BuÍK¿ð\u0007!Ã\u009fpó\\\u0016\u000eÅñ!ï\u0013\u008dB\u00939ùÊsË)Å^_Æ`¬%Ö\u008eiæ\u0092ôG\\'º\u0083o\u0010ÏËm\u0096Ü\u0083öà\u0098ìU£8\u0095\u0012t\u0086IZX2«ÀÔÂ¾òIÙSX¨\t<:J\u0090Ì´øF\u0087\u0002\u0097½¶\u007fªáªojÇíHríÓQÃ§\u000f³,´Îä\u009b¸C7\u0090J\u009fìd\u0087´\u009e®¶*\u001aXÃÇE\u009c¨YCb\u000eDÅ^ýÃÅj\u0092¤ó>Á\u0098\u008cè\u0003¾-³DLA¯\u009b¬\u008f".length();
               var16 = 'X';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9572;
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
            throw new RuntimeException("su/catlean/c9", var10);
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
         throw new RuntimeException("su/catlean/c9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13249;
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
            throw new RuntimeException("su/catlean/c9", var14);
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
         throw new RuntimeException("su/catlean/c9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
