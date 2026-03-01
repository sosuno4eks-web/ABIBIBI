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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yr extends k9 {
   @NotNull
   public static final yr v;
   static final KProperty[] T;
   @NotNull
   private static final zo w;
   @NotNull
   private static final zr t;
   @NotNull
   private static final zl X;
   @NotNull
   private static final zl f;
   @NotNull
   private static final zr g;
   private static boolean c;
   private static int B;
   private static final long b = j0.a(-6005061779639789836L, 7331793704593831478L, MethodHandles.lookup().lookupClass()).a(108212953859072L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] k;
   private static final Integer[] l;
   private static final Map m;

   private yr(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 34357784215306L;
      super(var3, true.y<invokedynamic>(9508, 8231849587737542423L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 40581343582709L;
      int var3 = (int)((var1 ^ 40581343582709L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)w.k((short)var3, this, T[0], (short)var4, var5);
   }

   private final ga t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 82793661782829L;
      int var3 = (int)((var1 ^ 82793661782829L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ga)t.k((short)var3, this, T[1], (short)var4, var5);
   }

   private final String J(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 78920955670043L;
      int var3 = (int)((var1 ^ 78920955670043L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)X.k((short)var3, this, T[2], (short)var4, var5);
   }

   private final String P(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 104479914167975L;
      int var6 = (int)((var4 ^ 104479914167975L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (String)f.k((short)var6, this, T[3], (short)var7, var8);
   }

   private final g9 V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 40428085277211L;
      int var3 = (int)((var1 ^ 40428085277211L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (g9)g.k((short)var3, this, T[4], (short)var4, var5);
   }

   @Flow
   private final void D(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void Q(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   public final void f(char param1, int param2, char param3) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean r() {
      long var0 = b ^ 131007193998751L;
      long var2 = var0 ^ 16057653316719L;

      boolean var10000;
      try {
         if (v.t(var2) == ga.KIT) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, 7240426505790896377L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean M() {
      long var0 = b ^ 96268716981908L;
      long var2 = var0 ^ 50794520352612L;

      boolean var10000;
      try {
         if (v.t(var2) == ga.CUSTOM) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, 4571163670260900850L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 14935434032505L;
      long var22 = var20 ^ 75270622515471L;
      long var24 = var20 ^ 104284320207510L;
      long var26 = var20 ^ 136618028297743L;
      long var28 = var20 ^ 119754092926309L;
      i = new HashMap(13);
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
      String var15 = "\u008ej\u0080%ç/\u009dK2½¿ì~\u001e\u0082hÖ[a\u001f*\u008fÛqõ#(_9æ\u0082±\u0010Ì/ç0\u0086×a:·Ò\u009fÒ\u0094°½«8G¢´-¦c¨\u0014Qv).%@²ïaoüLI\u0011*Gµ.EÙô\u0014ó×¿¥EDÄæù\u0015\u001fcîÌS\u0002©\nnÀ*\u0082'ýCÓ \r`e½Õë½ñ\u0084ó\u0084¸ ùø¶\u009c=¬¼£¾Î\u001d1\u00ad§\u0012 k\n!\u0018\u0015W-¬\u0091\u008d\u007f\u0096Øgb\u0099ûù\u000eÆÒIa\u00adVjÑò r\u000bF)\u001e\u0012e½\u0016è½\u0080íy¿Uú~\u0007ßN°+ùÖ(u\u0086A\u0014ÕI UÏ\u009eö¾óÛ\u008cîë\u0010Sª©\bxpiqi}\u0010m(dU\u0093¯¿\u007fP_\u0010Þa\u0005µ0ý¿\u0018\u0089Y\u007fÜ?óä/\u0010È´MJ\u001dµu'\u000b\u000bPÛ\u0085\u008bÇc\u0010Í\u0094'\u0099«Mø\u000fDDæ©*áð°\u0010½Ìæ8Ä³\u0014ô\u0085P\u001bVV\u001cð\u00878?RßÖ\u0083Ç%\u001cÂàÄ ç/ù\u001cl¼\u008bã1AJÉ=NÚ\u0092[i\u0094÷\u001dÄÕuZÛ|\u0012ÖÖ\u009aì\u008bö¡LEP:ó;\u0092Êì¨\u001bZ\u0094E\u0090é\u000f¥b6ç¤h\t\fÐv³7\u001c\u0092\u0088@*\u0099Á¿ã%\u0011H=\u0015UZuÑ·^tr!p\u0099u\u0084|ïÄ¨\u009fmS\u008eÂ\u009e(\u009e±¹îJ\u0082\u0089©@g»ö\u0014ï>4\u0083:\u0013^«\u0092ððì¬ª>ÆHJ\u0013²<\u000f\u0088ãé\u0090\u008f\u0084ñÝU\u0003ª\t\u008eSVÍ)ßÏ\u0017ã²§Ò·È\u000b=\u0084»®°$)+>B_¸ÙF\u008eêÙå\u001dì=]\u0096\u0091\u0015§e\u0099BefÊFç8ý\u008b·lÜæ\u008d£ Ôå\u0014\u009cP |£Úáx/8\u008dÕÉo¦ñOì»\u0084Nö\u009d\u001d\u009eyîñ\u0096\\\u0094Ò©·M\u0010â\u0089õ`\\\u0081TB\u000fâP\u007fÊ`ÝÌ\u0010È}/\u0093D/\u009e8\\WÌ\u0004âÚ#q\u0010ã(×³\u009cÕ\u009dÒoÃ\u001b_)-\u0005]\u0018MJ\u0012[ê%¿\\ã(\u000f²\u0084Ywh\u0017ôJòJ\u0090N!\u0018\u009cúA\u008e\u00882øS\f¿u\u009a9\u008fK¯À¶C]\u0011¹\u0088¨@\u0019p$sïÖ\u009fQb\u0085½_Äáð\nnTeH\u0080B³?û\u001a\u001f;*xq<:ès\u008d\u008a\u0000Ï\u0011²Ì³>åñ/l´Ù ËQ%¸t!\u0015\u0094\u0095\u000bCØ\u0098(¶+¿ÝK\u008b\u0016»Eèæ±Ð@Ðû\u0089\u0084ö\u001e\u0017±9¤@=rb¶ùêM\u0084¢\u009eÊ\u008f\u009b\u0002\u0084\u0010í¦\u001dU«]ÓÂ¨ÇRÞ_N´@ Ìh\u0099~\u0010\u001a¿²`¡\u0006Ò@6µ\u00821FYÌMÄ¶\t\b»\u009fÀÇó\u0086J";
      int var17 = "\u008ej\u0080%ç/\u009dK2½¿ì~\u001e\u0082hÖ[a\u001f*\u008fÛqõ#(_9æ\u0082±\u0010Ì/ç0\u0086×a:·Ò\u009fÒ\u0094°½«8G¢´-¦c¨\u0014Qv).%@²ïaoüLI\u0011*Gµ.EÙô\u0014ó×¿¥EDÄæù\u0015\u001fcîÌS\u0002©\nnÀ*\u0082'ýCÓ \r`e½Õë½ñ\u0084ó\u0084¸ ùø¶\u009c=¬¼£¾Î\u001d1\u00ad§\u0012 k\n!\u0018\u0015W-¬\u0091\u008d\u007f\u0096Øgb\u0099ûù\u000eÆÒIa\u00adVjÑò r\u000bF)\u001e\u0012e½\u0016è½\u0080íy¿Uú~\u0007ßN°+ùÖ(u\u0086A\u0014ÕI UÏ\u009eö¾óÛ\u008cîë\u0010Sª©\bxpiqi}\u0010m(dU\u0093¯¿\u007fP_\u0010Þa\u0005µ0ý¿\u0018\u0089Y\u007fÜ?óä/\u0010È´MJ\u001dµu'\u000b\u000bPÛ\u0085\u008bÇc\u0010Í\u0094'\u0099«Mø\u000fDDæ©*áð°\u0010½Ìæ8Ä³\u0014ô\u0085P\u001bVV\u001cð\u00878?RßÖ\u0083Ç%\u001cÂàÄ ç/ù\u001cl¼\u008bã1AJÉ=NÚ\u0092[i\u0094÷\u001dÄÕuZÛ|\u0012ÖÖ\u009aì\u008bö¡LEP:ó;\u0092Êì¨\u001bZ\u0094E\u0090é\u000f¥b6ç¤h\t\fÐv³7\u001c\u0092\u0088@*\u0099Á¿ã%\u0011H=\u0015UZuÑ·^tr!p\u0099u\u0084|ïÄ¨\u009fmS\u008eÂ\u009e(\u009e±¹îJ\u0082\u0089©@g»ö\u0014ï>4\u0083:\u0013^«\u0092ððì¬ª>ÆHJ\u0013²<\u000f\u0088ãé\u0090\u008f\u0084ñÝU\u0003ª\t\u008eSVÍ)ßÏ\u0017ã²§Ò·È\u000b=\u0084»®°$)+>B_¸ÙF\u008eêÙå\u001dì=]\u0096\u0091\u0015§e\u0099BefÊFç8ý\u008b·lÜæ\u008d£ Ôå\u0014\u009cP |£Úáx/8\u008dÕÉo¦ñOì»\u0084Nö\u009d\u001d\u009eyîñ\u0096\\\u0094Ò©·M\u0010â\u0089õ`\\\u0081TB\u000fâP\u007fÊ`ÝÌ\u0010È}/\u0093D/\u009e8\\WÌ\u0004âÚ#q\u0010ã(×³\u009cÕ\u009dÒoÃ\u001b_)-\u0005]\u0018MJ\u0012[ê%¿\\ã(\u000f²\u0084Ywh\u0017ôJòJ\u0090N!\u0018\u009cúA\u008e\u00882øS\f¿u\u009a9\u008fK¯À¶C]\u0011¹\u0088¨@\u0019p$sïÖ\u009fQb\u0085½_Äáð\nnTeH\u0080B³?û\u001a\u001f;*xq<:ès\u008d\u008a\u0000Ï\u0011²Ì³>åñ/l´Ù ËQ%¸t!\u0015\u0094\u0095\u000bCØ\u0098(¶+¿ÝK\u008b\u0016»Eèæ±Ð@Ðû\u0089\u0084ö\u001e\u0017±9¤@=rb¶ùêM\u0084¢\u009eÊ\u008f\u009b\u0002\u0084\u0010í¦\u001dU«]ÓÂ¨ÇRÞ_N´@ Ìh\u0099~\u0010\u001a¿²`¡\u0006Ò@6µ\u00821FYÌMÄ¶\t\b»\u009fÀÇó\u0086J".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[25];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ö\u001c\u001a\"\u0017,§|\u00920\u007fp\u0091EýÙ";
                  int var5 = "ö\u001c\u001a\"\u0017,§|\u00920\u007fp\u0091EýÙ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var35 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var35 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var34[var35] = var42;
                           if (var2 >= var5) {
                              k = var6;
                              l = new Integer[4];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yr.class, true.y<invokedynamic>(31037, 8927437671499625121L ^ var20), true.y<invokedynamic>(7172, 4721124465757067137L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yr.class, true.y<invokedynamic>(22790, 1087508240734540421L ^ var20), true.y<invokedynamic>(30419, 6291781545052306769L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yr.class, true.y<invokedynamic>(5346, 4493640111712771962L ^ var20), true.y<invokedynamic>(20140, 6498500040693859638L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yr.class, true.y<invokedynamic>(18355, 2318624008532806709L ^ var20), true.y<invokedynamic>(18836, 4775799913841148423L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yr.class, true.y<invokedynamic>(7232, 8280397969217624020L ^ var20), true.y<invokedynamic>(364, 4587430648089905893L ^ var20), 0)))};
                              T = var30;
                              v = new yr(var22);
                              w = qi.R((il)v, true.y<invokedynamic>(22344, 4205721928578063583L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(20973, 1688175304511523052L ^ var20), var28, (Object)null);
                              t = qi.M((il)v, true.y<invokedynamic>(32218, 7302235146733811293L ^ var20), (Enum)ga.KIT, (pj)null, (Function0)null, true.d<invokedynamic>(31262, 6415160662952715038L ^ var20), (Object)null, var24);
                              X = qi.P((il)v, true.y<invokedynamic>(17473, 1791905807386136531L ^ var20), var26, true.y<invokedynamic>(30069, 3560801704260468462L ^ var20), (pj)null, yr::r, 4, (Object)null);
                              f = qi.P((il)v, true.y<invokedynamic>(26461, 225517622322883787L ^ var20), var26, true.y<invokedynamic>(23887, 4393555356618774222L ^ var20), (pj)null, yr::M, 4, (Object)null);
                              g = qi.M((il)v, true.y<invokedynamic>(31212, 3371517599053869693L ^ var20), (Enum)g9.DELAYED, (pj)null, (Function0)null, true.d<invokedynamic>(31262, 6415160662952715038L ^ var20), (Object)null, var24);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "±iA-ÿ\u001f²\u0088æáOU\f9¸Û";
                           var5 = "±iA-ÿ\u001f²\u0088æáOU\f9¸Û".length();
                           var2 = 0;
                        }

                        var35 = var2;
                        var2 += 8;
                        var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var35 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0011«Eò«¥ºu/ûmGEl\u0016ý@5f;á\u0004*ÔP\u0088¼\n!\u009b¹®!Â\u0010\u001f;w\u00ad\u0090½\"å¶ûÀZÅ\u0096?\u0085\u0082p\u0083\u0097GÍúª\u0016úûÏé»\u0097\u0005Í\u008cê\u009365\t\\)´w4>t";
               var17 = "\u0011«Eò«¥ºu/ûmGEl\u0016ý@5f;á\u0004*ÔP\u0088¼\n!\u009b¹®!Â\u0010\u001f;w\u00ad\u0090½\"å¶ûÀZÅ\u0096?\u0085\u0082p\u0083\u0097GÍúª\u0016úûÏé»\u0097\u0005Í\u008cê\u009365\t\\)´w4>t".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32340;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yr", var10);
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
         throw new RuntimeException("su/catlean/yr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11462;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = k[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yr", var14);
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
         throw new RuntimeException("su/catlean/yr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
