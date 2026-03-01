package su.catlean;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_745;
import net.minecraft.class_1297.class_5529;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class y1 extends k9 {
   @NotNull
   public static final y1 i;
   static final KProperty[] s;
   @NotNull
   private static final zn w;
   @NotNull
   private static final zn t;
   @NotNull
   private static final zo v;
   @NotNull
   private static final zl o;
   @Nullable
   private static class_745 J;
   @NotNull
   private static final List R;
   private static int g;
   private static boolean e;
   private static boolean d;
   private static final long b = j0.a(-8915915506461567562L, 7033601232343596085L, MethodHandles.lookup().lookupClass()).a(123756429987190L);
   private static final String[] c;
   private static final String[] f;
   private static final Map k;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;

   private y1(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 89251832640635L;
      super(var3, true.e<invokedynamic>(24813, 247424135527888811L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final zu W(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 64731307725816L;
      int var6 = (int)((var4 ^ 64731307725816L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (zu)w.k((short)var6, this, s[0], (short)var7, var8);
   }

   private final zu K(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 65381017401095L;
      int var6 = (int)((var4 ^ 65381017401095L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (zu)t.k((short)var6, this, s[1], (short)var7, var8);
   }

   private final boolean j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 14421041744574L;
      int var3 = (int)((var1 ^ 14421041744574L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)v.k((short)var3, this, s[2], (short)var4, var5);
   }

   private final String e(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 5829387196504L;
      int var6 = (int)((var4 ^ 5829387196504L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (String)o.k((short)var6, this, s[3], (short)var7, var8);
   }

   @Nullable
   public final class_745 Q() {
      return J;
   }

   public final void Y(@Nullable class_745 <set-?>) {
      J = var1;
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void U(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void k(PreSyncEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long var1) {
      String[] var3 = 4289393171719008630L.A<invokedynamic>(4289393171719008630L, var1);

      class_745 var10000;
      label27: {
         try {
            if (var1 < 0L) {
               return;
            }

            var10000 = J;
            if (var3 == null) {
               break label27;
            }

            if (var10000 == null) {
               return;
            }
         } catch (NumberFormatException var4) {
            throw var4.A<invokedynamic>(var4, 4267133733566402669L, var1);
         }

         var10000 = J;
         Intrinsics.checkNotNull(var10000);
         var10000.method_31745(class_5529.field_26998);
         var10000 = J;
         Intrinsics.checkNotNull(var10000);
      }

      var10000.method_36209();
      J = null;
      R.clear();
   }

   private static final Unit V() {
      long var0 = b ^ 139105551911826L;
      String[] var10000 = -1280443132117719862L.A<invokedynamic>(-1280443132117719862L, var0);
      y1 var10001 = i;
      String[] var2 = var10000;

      boolean var4;
      label22: {
         label21: {
            try {
               var4 = e;
               if (var2 == null) {
                  break label22;
               }

               if (!var4) {
                  break label21;
               }
            } catch (NumberFormatException var3) {
               throw var3.A<invokedynamic>(var3, -1257656473307380271L, var0);
            }

            var4 = false;
            break label22;
         }

         var4 = true;
      }

      e = var4;
      return Unit.INSTANCE;
   }

   private static final boolean d() {
      long var0 = b ^ 140091321353195L;
      String[] var2 = -1854372346870567757L.A<invokedynamic>(-1854372346870567757L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = d;
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var3) {
            throw var3.A<invokedynamic>(var3, -1805123264973173336L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final Unit G() {
      long var0 = b ^ 92670663461359L;
      String[] var10000 = -1420928503327430985L.A<invokedynamic>(-1420928503327430985L, var0);
      y1 var10001 = i;
      String[] var2 = var10000;

      boolean var4;
      label22: {
         label21: {
            try {
               var4 = d;
               if (var2 == null) {
                  break label22;
               }

               if (!var4) {
                  break label21;
               }
            } catch (NumberFormatException var3) {
               throw var3.A<invokedynamic>(var3, -1371694815129696340L, var0);
            }

            var4 = false;
            break label22;
         }

         var4 = true;
      }

      d = var4;
      return Unit.INSTANCE;
   }

   private static final boolean R() {
      long var0 = b ^ 107837434669054L;
      String[] var2 = 4780271210132293798L.A<invokedynamic>(4780271210132293798L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = e;
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var3) {
            throw var3.A<invokedynamic>(var3, 4821090816878815677L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      long var20 = b ^ 132743178713715L;
      long var22 = var20 ^ 139953821177204L;
      long var24 = var20 ^ 45907205260583L;
      long var26 = var20 ^ 63128159731277L;
      long var10001 = var20 ^ 95948647190099L;
      int var28 = (int)((var20 ^ 95948647190099L) >>> 56);
      int var29 = (int)(var10001 << 8 >>> 32);
      int var30 = (int)(var10001 << 40 >>> 40);
      k = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[16];
      int var16 = 0;
      String var15 = "©·q\u0010.Ê\u001fuK\u0013S\u0086ÁÅð\u00929t©h?\r+þa\u0097®Eá£&ß\u0018\u0099\u0015.\u001cÒã¬\u0083gô\u0007âöÞ\u0014ÐNpÕ\u009dý\u0096W' ¤Ý³#êZq ÿ\u0089ËªØm0\u009dÖÞ#hÇí\u0004^Óo\u0014É>\u009cÛ\u0099\u0010!\u001føË>Ü\u0096\u0003\u009b±\u0092rãCQl\u0010\u0015\u0082#.¾±Èi\u0097[\u0098ñ\u00ad\u001d\u0095 (\ta^Ú\f\u009ej \u009eRYH\u0017P\u0001Páø\u008ch\"\u0096\u0019°\u0099\u008aý\u0096~\u0012îBØ\u009bÂ\u0014¿\u0097Ðå0¸\u0081#\u0097ãG\u0084|Q*à3¨¤\u0087\u008b\u001c\u001de\u0018Î\u001d§à\u0097\u0005\u0012iR]\u0087iNëX\u0011hÜ·\u0013¯ÍÀ\u001d\u001bªRy\u0018Å¨Õ\u0083úï¥ã\u0019ô\u008d3i-àz¿BK\u0001BP2È\u0010¤Cj?\u0019V.Ñ;nÛ\n¶\u009e}¢\u0010\u000b\u001f+N\u008dçe\u001bNâòL\u0003\f½¥0\u00063ZüÁ¦n¨ô\râî\u0086áñA&e÷J\u001d»6sX\u0091J:çE\u0000\u0011&ùì£l;7¯\u001a\u0097\u001bßS\f>µ @\u0001\bm.÷¢ÙZs@,2¤q\u008b\u0084vÔ©4^ò¹Þ\u008aéÑa÷\"¿@à5ÆÂP®M\u008d\u008dv3Ä\u00188H\u0087dEÌ\u0095xç¶ø \u00adAî»©\u0014õ\u000bíSy\u0019sQ(WÖØ¿ßÿ\u001eÕÝ\r\u000205ï\u008b\u009do;¸Vg\u0015\u001d«@_\u008bþÛ4\u0004\u0089FT\u008f\u00044\u001ch>\u0001:ß\u0080\u0097#yÍ;7¥³\u001eís´~\u0018\u0090JF¸«¨TþÃ©\fÊ\u008b\u0094Q\bðôÂ©]²\u0088\n\u008c´á\u008cÊ~\u0006";
      int var17 = "©·q\u0010.Ê\u001fuK\u0013S\u0086ÁÅð\u00929t©h?\r+þa\u0097®Eá£&ß\u0018\u0099\u0015.\u001cÒã¬\u0083gô\u0007âöÞ\u0014ÐNpÕ\u009dý\u0096W' ¤Ý³#êZq ÿ\u0089ËªØm0\u009dÖÞ#hÇí\u0004^Óo\u0014É>\u009cÛ\u0099\u0010!\u001føË>Ü\u0096\u0003\u009b±\u0092rãCQl\u0010\u0015\u0082#.¾±Èi\u0097[\u0098ñ\u00ad\u001d\u0095 (\ta^Ú\f\u009ej \u009eRYH\u0017P\u0001Páø\u008ch\"\u0096\u0019°\u0099\u008aý\u0096~\u0012îBØ\u009bÂ\u0014¿\u0097Ðå0¸\u0081#\u0097ãG\u0084|Q*à3¨¤\u0087\u008b\u001c\u001de\u0018Î\u001d§à\u0097\u0005\u0012iR]\u0087iNëX\u0011hÜ·\u0013¯ÍÀ\u001d\u001bªRy\u0018Å¨Õ\u0083úï¥ã\u0019ô\u008d3i-àz¿BK\u0001BP2È\u0010¤Cj?\u0019V.Ñ;nÛ\n¶\u009e}¢\u0010\u000b\u001f+N\u008dçe\u001bNâòL\u0003\f½¥0\u00063ZüÁ¦n¨ô\râî\u0086áñA&e÷J\u001d»6sX\u0091J:çE\u0000\u0011&ùì£l;7¯\u001a\u0097\u001bßS\f>µ @\u0001\bm.÷¢ÙZs@,2¤q\u008b\u0084vÔ©4^ò¹Þ\u008aéÑa÷\"¿@à5ÆÂP®M\u008d\u008dv3Ä\u00188H\u0087dEÌ\u0095xç¶ø \u00adAî»©\u0014õ\u000bíSy\u0019sQ(WÖØ¿ßÿ\u001eÕÝ\r\u000205ï\u008b\u009do;¸Vg\u0015\u001d«@_\u008bþÛ4\u0004\u0089FT\u008f\u00044\u001ch>\u0001:ß\u0080\u0097#yÍ;7¥³\u001eís´~\u0018\u0090JF¸«¨TþÃ©\fÊ\u008b\u0094Q\bðôÂ©]²\u0088\n\u008c´á\u008cÊ~\u0006".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var34 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var34) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  f = new String[16];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "\u0014\u00ad\u009cÏ\u0016û\u009cÜQY\u0000a\f\u0011¿g\u0090\u0095Â\u0006K«°¿iZØÚæØ×Jè\u0018w\u0091\u0093¹i×u¹I\u009dûÐ&P";
                  int var5 = "\u0014\u00ad\u009cÏ\u0016û\u009cÜQY\u0000a\f\u0011¿g\u0090\u0095Â\u0006K«°¿iZØÚæØ×Jè\u0018w\u0091\u0093¹i×u¹I\u009dûÐ&P".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var38 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                     long[] var35 = var6;
                     var38 = var3++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var35[var38] = var44;
                           if (var2 >= var5) {
                              l = var6;
                              m = new Integer[8];
                              KProperty[] var31 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y1.class, true.e<invokedynamic>(10384, 2936136532516081200L ^ var20), true.e<invokedynamic>(13696, 4874795164641202991L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y1.class, true.e<invokedynamic>(16601, 6487152462401365631L ^ var20), true.e<invokedynamic>(9141, 5681100727634527505L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y1.class, true.e<invokedynamic>(13159, 3432498017864750538L ^ var20), true.e<invokedynamic>(21640, 4477442970305229359L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y1.class, true.e<invokedynamic>(8784, 2349764199384679674L ^ var20), true.e<invokedynamic>(24029, 1881719681756429173L ^ var20), 0)))};
                              s = var31;
                              i = new y1(var22);
                              w = qi.w((il)i, true.e<invokedynamic>(9752, 185351456277627066L ^ var20), (byte)var28, y1::V, (pj)null, var29, y1::d, 4, var30, (Object)null);
                              t = qi.w((il)i, true.e<invokedynamic>(10069, 3039324909009863164L ^ var20), (byte)var28, y1::G, (pj)null, var29, y1::R, 4, var30, (Object)null);
                              v = qi.R((il)i, true.e<invokedynamic>(7961, 480106479833987514L ^ var20), true, (pj)null, (Function0)null, true.h<invokedynamic>(24028, 1664039032595657158L ^ var20), var26, (Object)null);
                              o = qi.P((il)i, true.e<invokedynamic>(12979, 8391286607825900562L ^ var20), var24, true.e<invokedynamic>(22107, 1088582477321072880L ^ var20), (pj)null, (Function0)null, true.h<invokedynamic>(6361, 4158663622841627844L ^ var20), (Object)null);
                              R = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var35[var38] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¨hmb?\u0002J76aq\u008d\u0001\u000fõ×";
                           var5 = "¨hmb?\u0002J76aq\u008d\u0001\u000fõ×".length();
                           var2 = 0;
                        }

                        var38 = var2;
                        var2 += 8;
                        var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        var35 = var6;
                        var38 = var3++;
                        var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var39;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "¾\u001d,ÆZ2\u009bßÞ\u0000v¼\u00adóán§.\u008fHDo\u0087tinÇ\u008aw|rÅ\u0018Õoá\u0018¶ëOb\u009c^FÚÕbÍ»2K\"8¹\u0007\u0083\u001c";
               var17 = "¾\u001d,ÆZ2\u009bßÞ\u0000v¼\u00adóán§.\u008fHDo\u0087tinÇ\u008aw|rÅ\u0018Õoá\u0018¶ëOb\u009c^FÚÕbÍ»2K\"8¹\u0007\u0083\u001c".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var34 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14415;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/y1", var10);
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
         throw new RuntimeException("su/catlean/y1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29429;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
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
            throw new RuntimeException("su/catlean/y1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
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
         throw new RuntimeException("su/catlean/y1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
