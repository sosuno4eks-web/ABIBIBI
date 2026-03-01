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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class _t {
   @NotNull
   public static final _t e;
   @NotNull
   private static mj u;
   @NotNull
   private static mj S;
   private static boolean d;
   private static boolean i;
   @NotNull
   private static final List a;
   @NotNull
   private static final aa D;
   @NotNull
   private static String Y;
   @Nullable
   private static Function0 Z;
   @NotNull
   private static final String C;
   @NotNull
   private static final String x;
   private static k9[] l;
   private static final long b = j0.a(8909068354530316382L, 1557100630699644587L, MethodHandles.lookup().lookupClass()).a(86175363392845L);
   private static final String[] c;
   private static final String[] f;
   private static final Map g;
   private static final long[] h;
   private static final Integer[] j;
   private static final Map k;

   private _t() {
   }

   public final boolean H() {
      return i;
   }

   public final void O(boolean <set-?>) {
      i = var1;
   }

   public final void d(long a, @NotNull class_332 context, int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   private final void o(long param1, class_332 param3, int param4, int param5, float param6, float param7, float param8, float param9) {
      // $FF: Couldn't be decompiled
   }

   private final Map Z(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean u(double mouseX, double mouseY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void S(int a, int a, double mouseX, int a, double mouseY, int button) {
      long var9 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ b;
      long var11 = var9 ^ 121262146614411L;

      try {
         if (d) {
            ia.v.h(var3, var11, var6, var8);
         }

      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 2714066674253935388L, var9);
      }
   }

   public final void N(long a, int keyCode, int scanCode, int modifiers) {
      // $FF: Couldn't be decompiled
   }

   public final void o(long a, char chr) {
      // $FF: Couldn't be decompiled
   }

   public final boolean e(double mX, double mY, double amount, short a, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit Y() {
      long var0 = b ^ 109703123784333L;
      long var10001 = var0 ^ 16260100314135L;
      int var2 = (int)((var0 ^ 16260100314135L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var2, (short)var3, var4).method_1507((class_437)e1.D);
      return Unit.INSTANCE;
   }

   private static final Unit B() {
      long var0 = b ^ 133182555206871L;
      long var10001 = var0 ^ 22192580276813L;
      int var2 = (int)((var0 ^ 22192580276813L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var2, (short)var3, var4).method_1507((class_437)_u.w);
      return Unit.INSTANCE;
   }

   private static final Unit y() {
      long var0 = b ^ 121491018435555L;
      long var10001 = var0 ^ 3784718077305L;
      int var2 = (int)((var0 ^ 3784718077305L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      s8.H((short)var2, (short)var3, var4).method_1507((class_437)bh.Q);
      return Unit.INSTANCE;
   }

   private static final Unit P() {
      long var0 = b ^ 110743491409563L;
      k9[] var10000 = -8975751135452535172L.A<invokedynamic>(-8975751135452535172L, var0);
      _t var10001 = e;
      k9[] var2 = var10000;

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
               throw var3.A<invokedynamic>(var3, -8979296052105112107L, var0);
            }

            var4 = false;
            break label22;
         }

         var4 = true;
      }

      d = var4;
      return Unit.INSTANCE;
   }

   private static final Unit s() {
      long var0 = b ^ 28541750613066L;
      _t var10000 = e;
      k9[] var4 = -2180088940452281171L.A<invokedynamic>(-2180088940452281171L, var0);
      _t var10001 = e;
      k9[] var2 = var4;

      boolean var5;
      label22: {
         label21: {
            try {
               var5 = i;
               if (var2 == null) {
                  break label22;
               }

               if (!var5) {
                  break label21;
               }
            } catch (NumberFormatException var3) {
               throw var3.A<invokedynamic>(var3, -2183581036726028540L, var0);
            }

            var5 = false;
            break label22;
         }

         var5 = true;
      }

      i = var5;
      var10000 = e;
      Y = "";
      return Unit.INSTANCE;
   }

   private static final Unit l(k9 var0) {
      long var1 = b ^ 109921255168011L;
      long var10001 = var1 ^ 95379356617089L;
      long var3 = (var1 ^ 95379356617089L) >>> 16;
      int var5 = (int)(var10001 << 48 >>> 48);
      e1.D.x(var0, var3, (short)var5);
      return Unit.INSTANCE;
   }

   private static final Unit Z(k9 var0) {
      long var1 = b ^ 139444468563105L;
      long var3 = var1 ^ 123306915358326L;
      e1.D.b(var3, var0);
      return Unit.INSTANCE;
   }

   static {
      long var27 = b ^ 10096940944216L;
      long var10001 = var27 ^ 97212243496867L;
      int var29 = (int)((var27 ^ 97212243496867L) >>> 48);
      long var30 = var10001 << 16 >>> 16;
      var10001 = var27 ^ 112485511517117L;
      int var32 = (int)((var27 ^ 112485511517117L) >>> 48);
      int var33 = (int)(var10001 << 16 >>> 48);
      int var34 = (int)(var10001 << 32 >>> 32);
      k9[] var10000 = new k9[5];
      g = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -105587062327942523L, var27);
      Cipher var18;
      Cipher var36 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var36.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[22];
      int var23 = 0;
      String var22 = "\u0018\u0018\u0086\u0081\u0014c×ò\u0006®¿5ã\u0019ôéh³\u0010ÂÐÇ£þ\u0002ÉÇEÄK\u001c\u0082K½\u0099\u000e¿\u0092\u0003Ðªr\u0000Ñ¬õµ\u0099·æ\u009d¯Íw&¶öt¡æoU\"õ\u0001¦9\u00adZ6\u008b\u009fQ3\\\u008f\u008b\u000býµ°Vé;ðmà6\u009f\u0093ÒwÁü-Ï+N]$Ìh[° ×\u009a\u0087> ²\u0097£\\ªæü\u008a\u0002@øsá6µ\u001dc?bÊ44\u001feüö+(\u0012ö¡H{}±2·ùÛþF©\u0086Ä\u0014\u009c¤\b\u000fGt%\u008dÃ|Â\u008bE \u007fëk$þìÀØ¡\u0010_#f7X2\u0098Ð\"\u0089\u0005?½sb\u0083@P\u0086n\u0093\u008dÙø\u0003µnT3\fªEº\u0097ÿ7zNäÍ\u0092×\u0011dúÙ%\u007fK÷eV&\u0018\u000fèi\u000bÕ\u0085:*÷ý'\u0005\u0098\u008dÚ\u0082\u009d=\u0096\u009fâ±Tàä\u0007M\u0010\u0017c\u0007©L\u0014sñ\"\u0089\u000f\u0083Æ\u009aÈ¥p=úÞu@M9R\u0002åÈyE!ôüðÇ\u008a\u000eg|\u0007¤\nxöUÈÞZ\u0015O;ú¡Â\u00199\u008f\u000bHx\u009a^É¼\u009b\u001beê?cÓ\tÄûÔñ\u0000Àë69ºr(a\u0010ö`r½õU¨\u0013/#¬\f\u0085AÛ\u0088O\u0012\rhBÁû©¶ýäÄ3A¥ <\u0084\u0084\u0088Â@F~¬\u0016Ë\u0010ÿfY\u0012¥H%â\u0085Ýíó\u0014sû\u00ad\u0010\u0011zÝ\u0002\u009c-Ê?Ü\u0014|ÙÎÁ¤u \u0015P\u0003S w\u0016=¨rFÉ$\u008e`cÐ\u001e\u0097+\u0019+,=',\u0094j\u008e³[±@Ln«L+¿PM1C\u0083\u0093\u008f(¹WökDhÅË6Ã6\u001fò¹D\u009b0-\u0084;FÑÐb\u0003À\u001eÃºúÂz\u0082\u009ae7°\u0014$÷ÎÍá\u0081=»uRÉL\u0010t\u0015J\n+Aa~J\u0004\u0015ÐÈf®%\u00107;HøÊ1ôâ\u0094þRÄÿEcÖ Ã\u0086\u008b\u0099°4m 5N\u0082y\u0013\u0085.ý\u000ecJº(\u0011\u0018\u0018O<\u000f/Ç\u0007Ñ\u0011\u0010\u008eëF\u0085ð2\u0091Q\u000eÀ\u0005\r\u008d\u0081<\u001c\u0010\u0014\u00934¹u\u008cÖJ>ÝÐ1\u007f÷×2 \u00848;\u00140À\u0019x\"\u0090\u0081ÿ\u0010'\u0083\\\u0095Rmx\u0005\u009d¼_\u0090ö|¹\u0080`dÅ\u0010»9\u008f¸\"{~ÉÊ\u0086«Dî7y.\u0010 wpn\u008b+Ù[îVÁ>\u008c\u009c±¶\u0010\u001f!\u0084Ì¿ï+\u0091)4u\u000fQé\u008d\u0088";
      int var24 = "\u0018\u0018\u0086\u0081\u0014c×ò\u0006®¿5ã\u0019ôéh³\u0010ÂÐÇ£þ\u0002ÉÇEÄK\u001c\u0082K½\u0099\u000e¿\u0092\u0003Ðªr\u0000Ñ¬õµ\u0099·æ\u009d¯Íw&¶öt¡æoU\"õ\u0001¦9\u00adZ6\u008b\u009fQ3\\\u008f\u008b\u000býµ°Vé;ðmà6\u009f\u0093ÒwÁü-Ï+N]$Ìh[° ×\u009a\u0087> ²\u0097£\\ªæü\u008a\u0002@øsá6µ\u001dc?bÊ44\u001feüö+(\u0012ö¡H{}±2·ùÛþF©\u0086Ä\u0014\u009c¤\b\u000fGt%\u008dÃ|Â\u008bE \u007fëk$þìÀØ¡\u0010_#f7X2\u0098Ð\"\u0089\u0005?½sb\u0083@P\u0086n\u0093\u008dÙø\u0003µnT3\fªEº\u0097ÿ7zNäÍ\u0092×\u0011dúÙ%\u007fK÷eV&\u0018\u000fèi\u000bÕ\u0085:*÷ý'\u0005\u0098\u008dÚ\u0082\u009d=\u0096\u009fâ±Tàä\u0007M\u0010\u0017c\u0007©L\u0014sñ\"\u0089\u000f\u0083Æ\u009aÈ¥p=úÞu@M9R\u0002åÈyE!ôüðÇ\u008a\u000eg|\u0007¤\nxöUÈÞZ\u0015O;ú¡Â\u00199\u008f\u000bHx\u009a^É¼\u009b\u001beê?cÓ\tÄûÔñ\u0000Àë69ºr(a\u0010ö`r½õU¨\u0013/#¬\f\u0085AÛ\u0088O\u0012\rhBÁû©¶ýäÄ3A¥ <\u0084\u0084\u0088Â@F~¬\u0016Ë\u0010ÿfY\u0012¥H%â\u0085Ýíó\u0014sû\u00ad\u0010\u0011zÝ\u0002\u009c-Ê?Ü\u0014|ÙÎÁ¤u \u0015P\u0003S w\u0016=¨rFÉ$\u008e`cÐ\u001e\u0097+\u0019+,=',\u0094j\u008e³[±@Ln«L+¿PM1C\u0083\u0093\u008f(¹WökDhÅË6Ã6\u001fò¹D\u009b0-\u0084;FÑÐb\u0003À\u001eÃºúÂz\u0082\u009ae7°\u0014$÷ÎÍá\u0081=»uRÉL\u0010t\u0015J\n+Aa~J\u0004\u0015ÐÈf®%\u00107;HøÊ1ôâ\u0094þRÄÿEcÖ Ã\u0086\u008b\u0099°4m 5N\u0082y\u0013\u0085.ý\u000ecJº(\u0011\u0018\u0018O<\u000f/Ç\u0007Ñ\u0011\u0010\u008eëF\u0085ð2\u0091Q\u000eÀ\u0005\r\u008d\u0081<\u001c\u0010\u0014\u00934¹u\u008cÖJ>ÝÐ1\u007f÷×2 \u00848;\u00140À\u0019x\"\u0090\u0081ÿ\u0010'\u0083\\\u0095Rmx\u0005\u009d¼_\u0090ö|¹\u0080`dÅ\u0010»9\u008f¸\"{~ÉÊ\u0086«Dî7y.\u0010 wpn\u008b+Ù[îVÁ>\u008c\u009c±¶\u0010\u001f!\u0084Ì¿ï+\u0091)4u\u000fQé\u008d\u0088".length();
      char var21 = 'h';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var37 = var22.substring(var20, var20 + var21);
         byte var39 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var37.getBytes("ISO-8859-1"));
            String var44 = a(var26).intern();
            switch(var39) {
            case 0:
               var25[var23++] = var44;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  f = new String[22];
                  C = true.f<invokedynamic>(11733, 6720939664591311985L ^ var27);
                  x = true.f<invokedynamic>(18581, 831632253124194592L ^ var27);
                  k = new HashMap(13);
                  Cipher var7;
                  var36 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var36.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[10];
                  int var10 = 0;
                  String var11 = "¼;l\u000bEi \u0089Í\u007f^Ñ-&mìþ\u009bþæiD«©\u000eb1ø\u0015\u001dû\u001dÕXÛ\u0086jø\u0015z&Vö\u0007ì\u008e4©Â\u0082Æ¹Z§\u009e\u0011Á\u001f\fjØè4j";
                  int var12 = "¼;l\u000bEi \u0089Í\u007f^Ñ-&mìþ\u009bþæiD«©\u000eb1ø\u0015\u001dû\u001dÕXÛ\u0086jø\u0015z&Vö\u0007ì\u008e4©Â\u0082Æ¹Z§\u009e\u0011Á\u001f\fjØè4j".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var45 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var45, var9).getBytes("ISO-8859-1");
                     long[] var40 = var13;
                     var45 = var10++;
                     long var48 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var49 = -1;

                     while(true) {
                        long var15 = var48;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var51 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var49) {
                        case 0:
                           var40[var45] = var51;
                           if (var9 >= var12) {
                              h = var13;
                              j = new Integer[10];
                              Cipher var2;
                              var36 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var36.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = -4886157624294960480L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var48 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var47 = true;
                              long var0 = var48;
                              e = new _t();
                              D = new aa(sa.OUT_EXPO, var0, (short)var32, (short)var33, var34);
                              Y = "";
                              mj[] var35 = new mj[]{new mj(0.0F, true.f<invokedynamic>(28392, 7878792466976118605L ^ var27), (aa)null, (char)var29, var30, _t::Y, 4, (DefaultConstructorMarker)null), new mj(44.0F, true.f<invokedynamic>(23198, 1668065017220277041L ^ var27), (aa)null, (char)var29, var30, _t::B, 4, (DefaultConstructorMarker)null), new mj(88.0F, true.f<invokedynamic>(311, 7766656482403973279L ^ var27), (aa)null, (char)var29, var30, _t::y, 4, (DefaultConstructorMarker)null), new mj(132.0F, true.f<invokedynamic>(1700, 226104020632469271L ^ var27), (aa)null, (char)var29, var30, _t::P, 4, (DefaultConstructorMarker)null), new mj(176.0F, true.f<invokedynamic>(20682, 2804747962172615038L ^ var27), (aa)null, (char)var29, var30, _t::s, 4, (DefaultConstructorMarker)null)};
                              a = CollectionsKt.mutableListOf(var35);
                              _t var43 = e;
                              u = (mj)a.get(0);
                              var43 = e;
                              S = u;
                              return;
                           }
                           break;
                        default:
                           var40[var45] = var51;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "î8U\u0016[\u0007Ô 6ö÷»3\u000e¦ï";
                           var12 = "î8U\u0016[\u0007Ô 6ö÷»3\u000e¦ï".length();
                           var9 = 0;
                        }

                        var45 = var9;
                        var9 += 8;
                        var14 = var11.substring(var45, var9).getBytes("ISO-8859-1");
                        var40 = var13;
                        var45 = var10++;
                        var48 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var49 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var44;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "5 \u0016C×\r\u00ad\u0017TQ\u001fëÈW.\u0095pÃAî°WÍÿ\u0085ÝÙés\bº\u0091Ït2Y\u0091\u008bé\u0080\u001c\u0089'\u009cuÀH¸§$#k\bQÌt¯zË\n¬-£·,\u0080dY[\\|ª{û:Læ@Ø[\u0090vU,Ã\u008c2\u0006\u0085õS\n£pf+a\u0000¬§\u008c[\u0006Ùe\u007f \u0012\u0083&I÷´Û\u0017Y´Ä:\u009f:Gè\u0092\u0012{þ9z";
               var24 = "5 \u0016C×\r\u00ad\u0017TQ\u001fëÈW.\u0095pÃAî°WÍÿ\u0085ÝÙés\bº\u0091Ït2Y\u0091\u008bé\u0080\u001c\u0089'\u009cuÀH¸§$#k\bQÌt¯zË\n¬-£·,\u0080dY[\\|ª{û:Læ@Ø[\u0090vU,Ã\u008c2\u0006\u0085õS\n£pf+a\u0000¬§\u008c[\u0006Ùe\u007f \u0012\u0083&I÷´Û\u0017Y´Ä:\u009f:Gè\u0092\u0012{þ9z".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var37 = var22.substring(var20, var20 + var21);
            var39 = 0;
         }
      }
   }

   public static void O(k9[] var0) {
      l = var0;
   }

   public static k9[] q() {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1723;
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
            throw new RuntimeException("su/catlean/_t", var10);
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
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/_t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8378;
      if (j[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = h[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/_t", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/_t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
