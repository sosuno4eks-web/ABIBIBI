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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kw extends k9 {
   @NotNull
   public static final kw q;
   static final KProperty[] B;
   @NotNull
   private static final zo X;
   @NotNull
   private static final z0 d;
   @NotNull
   private static final zc J;
   @NotNull
   private static final zc T;
   @NotNull
   private static final z0 n;
   @NotNull
   private static final zo g;
   @NotNull
   private static final zc S;
   @NotNull
   private static final z0 e;
   @NotNull
   private static final z0 c;
   @NotNull
   private static final z0 u;
   private static final long b = j0.a(8642425267856149728L, 7812225993654461212L, MethodHandles.lookup().lookupClass()).a(206215824349065L);
   private static final String[] f;
   private static final String[] i;
   private static final Map k;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map o;

   private kw(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 31589583585162L;
      super(var3, true.t<invokedynamic>(28624, 5629834835361750010L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 130622623914857L;
      int var3 = (int)((var1 ^ 130622623914857L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, B[0], (short)var4, var5);
   }

   private final int i(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 10554932421637L;
      int var6 = (int)((var4 ^ 10554932421637L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)d.k((short)var6, this, B[1], (short)var7, var8)).intValue();
   }

   private final float t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 104854969454440L;
      int var3 = (int)((var1 ^ 104854969454440L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)J.k((short)var3, this, B[2], (short)var4, var5)).floatValue();
   }

   private final float m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 46520104249747L;
      int var3 = (int)((var1 ^ 46520104249747L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)T.k((short)var3, this, B[3], (short)var4, var5)).floatValue();
   }

   private final int u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 76136424294225L;
      int var3 = (int)((var1 ^ 76136424294225L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)n.k((short)var3, this, B[4], (short)var4, var5)).intValue();
   }

   private final boolean J(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 33731384282708L;
      int var3 = (int)((var1 ^ 33731384282708L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)g.k((short)var3, this, B[5], (short)var4, var5);
   }

   private final float d(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 56710022004856L;
      int var3 = (int)((var1 ^ 56710022004856L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)S.k((short)var3, this, B[true.b<invokedynamic>(13110, 4916235542741736947L ^ var1)], (short)var4, var5)).floatValue();
   }

   public final int V(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final int G(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 67104993817341L;
      int var6 = (int)((var4 ^ 67104993817341L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      boolean var9 = 4686570842351157655L.A<invokedynamic>(4686570842351157655L, var4);

      try {
         int var10000 = ((Number)c.k((short)var6, this, B[true.b<invokedynamic>(5657, 4452603450110265940L ^ var4)], (short)var7, var8)).intValue();
         if (var9) {
            (new int[1]).A<invokedynamic>(new int[1], 4687267042514993847L, var4);
         }

         return var10000;
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, 4753630734335434901L, var4);
      }
   }

   private final int f(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 71868953052361L;
      int var6 = (int)((var4 ^ 71868953052361L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)u.k((short)var6, this, B[true.b<invokedynamic>(7298, 372344872132327161L ^ var4)], (short)var7, var8)).intValue();
   }

   @Flow
   private final void x(PlayerUpdateEvent var1) {
      long var2 = b ^ 26443177594555L;
      long var4 = var2 ^ 65239105832582L;
      long var6 = var2 ^ 27517465675844L;
      long var8 = var2 ^ 132315596685955L;
      long var10001 = var2 ^ 112039183838559L;
      int var10 = (int)((var2 ^ 112039183838559L) >>> 56);
      long var11 = var10001 << 8 >>> 8;
      boolean var13 = -264311099675049302L.A<invokedynamic>(-264311099675049302L, var2);

      try {
         if (!k2.J.Z(var8)) {
            return;
         }
      } catch (NumberFormatException var19) {
         throw var19.A<invokedynamic>(var19, -32607888621904159L, var2);
      }

      class_2338 var14 = this.P(var6);

      class_2338 var10000;
      try {
         label44: {
            if (var13) {
               var10000 = var14;
               if (var14 != null) {
                  break label44;
               }
            }

            return;
         }
      } catch (NumberFormatException var18) {
         throw var18.A<invokedynamic>(var18, -32607888621904159L, var2);
      }

      class_2338 var15 = var10000;
      boolean var16 = false;
      class_243 var20 = var15.method_10074().method_46558();
      Intrinsics.checkNotNullExpressionValue(var20, true.t<invokedynamic>(11421, 8375567395027747342L ^ var2));
      class_243 var17 = var20;
      x7.Z.j(var4, qq.g.Q((byte)var10, var11, var17).e(bc.FORCE), 0);
   }

   @Flow(
      priority = -10
   )
   private final void X(MoveEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final class_2338 P(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final double c(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 120699888551354L;
      long var8 = var4 ^ 131551464000899L;
      long var10 = var4 ^ 2985190288248L;

      double var10000;
      try {
         if (i4.v.l() < (long)(this.u(var6) * true.b<invokedynamic>(27916, 1471023204639011248L ^ var4))) {
            var10000 = 0.2873D * (double)this.m(var10);
            return var10000;
         }
      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, 72380064170123372L, var4);
      }

      var10000 = 0.2873D * (double)this.t(var8);
      return var10000;
   }

   private static final boolean U() {
      long var0 = b ^ 121957482223341L;
      long var2 = var0 ^ 16151634598613L;
      boolean var4 = 2594790899145759484L.A<invokedynamic>(2594790899145759484L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = k2.J.Z(var2);
            if (!var4) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 2871697511402309303L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final boolean A() {
      long var0 = b ^ 60117304415220L;
      long var2 = var0 ^ 95618026807244L;
      boolean var4 = -2225951577782673435L.A<invokedynamic>(-2225951577782673435L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = k2.J.Z(var2);
            if (!var4) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, -2106829284424891474L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final boolean I() {
      long var0 = b ^ 22563692734322L;
      long var2 = var0 ^ 128498659584842L;
      boolean var4 = 1557672615940451171L.A<invokedynamic>(1557672615940451171L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = k2.J.Z(var2);
            if (!var4) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 1604736967353186088L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final boolean H() {
      long var0 = b ^ 86469129152627L;
      long var2 = var0 ^ 51673853371467L;
      boolean var4 = -2694088412287064990L.A<invokedynamic>(-2694088412287064990L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = k2.J.Z(var2);
            if (!var4) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, -2790980644251895767L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final boolean y() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 19986867082282L;
      long var22 = var20 ^ 4376392043171L;
      long var24 = var20 ^ 123703533811826L;
      long var26 = var20 ^ 97071159554268L;
      long var28 = var20 ^ 40141040682085L;
      k = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[36];
      int var16 = 0;
      String var15 = "ûèàþ\u0089Y±\fBj6G\u00ad¯ag¾PO¢Á\u009a)\u0001À²Ûþ2\u0014\rK(!ß°f@4Ì\f¼²ï\u0005\u0093(Ý\u0003JrN\u0087òH\bH\u0006NþI=\u008aè£î<\u0004q\u0000#Ì=\u0018}4\u009fÅ\u0084\u0084d\u0001©K,IëN{æ|Z\u0013Þ\t,³\u001a\u0018§³\u008f\u009aûBà\fUÝ¤Ôy\u0098\u0094yÐ\u008cp\u0099\u0098\u0095ï\u0000 $,î\u0000¾HÅÎa\u0003=\u0081\u0016ªØ\u0007\u0090m4\n\u001aL\u0098Ì9¬m]&¡Bñ Ü8Ö\u009c2\u0001/¤wyC¶pÿj\u0089*Âvl\u0092 ¶_a\u0086S*\nÕÉ¬(\u008c\u008fSqÕ\u0017²j|\u0086¨FlH\u009f^²-°;óIR\u000e. \u0085ÝÆ\u0080i\u008a53\"©\u0082\u0085p°\u0010¤!\u008f\u0088àhz\u007fWÍ\u008d|\u001bÕk@($V *ö¢)0\u0083\u008dh\t£âä°\u001bøR\u009dõoX¨\u009f`\u0091\u0090Õö\u0084ß½/ì^Þ.×\u0002\u0018õ ãäZ\u0010\u0007½`;U\u009f¼\u008fïÌëÃÊö*×\u008a\t\u0018eÔé\\\u0011úUjâ\u0004)ëd\u0016çD\n÷£\u0012\u0019¿%£\u0010%Â\nú¶&täª|±Ü\u0019é¯ï\u0018\u0094HÆýÚ(»^EJêÏÂ¤\u008c9\u001bÊ´ø\u0006\\Û÷\u0010SìÉoY}8\u0092_(l51 ±}\u0018¬Ü¯G\u008bþb\u0089}ö)N\u001b¦\u0092\u009a%Ã4T@dç` Çb¿\fs(\u0012\u001aËåÖAûg\u0015S4SµxÓ1´À\tÝo%\f\u00ad8@(ûU£=Ð\u0006ªL¼ì$\u008fÏ\u0016b\u001dh(\u0014Õ÷]»Áé.ø=µ0\u008fHèn·Ý² Û3 ee\u0083\u00adH\u0003#\u0004\u0013\u00ad\u0019\r*§\u001eæÿ\u001f±Ú§>\u000f\u0004\u0092]'\tôõ\"Å(-µØE±½\u0006³\u0088Xí$&\u00160\u0004gúwÙ\u0000Æ¥O7'\u0006Ï®_:×êÐù,$\\_\f(é×¹7\u0018[á¨H\u0093\u0085.Û\u0004\u0098Y\u0081j\u008bàBÚ©\u00980ÍI÷\u0088krX\u0099\u0096Zø\u0013v** \u0019ñ}\u008bÖ\u0003\u0098êÖ_\u0014dVª\t\u0016\u000f/9Ânÿ8E0¿m\\CÌed \u0005\u001cÛ\u0085w°¼õ\u0002Ò*\u001eße\u0094NI¬ °\u008cË·\u0097\u00170\u0080´\u0085\u0089E¾ Cü\u0013\f\u00adV\u001eº\\\u001aÉ\u0001ôÉ\u0015\u0001³x\u0090-Õ²¥Ç60S\u0017ç²\u0010\u000f\u0018HuãC\u0083Ô\u0001ÝÍ¯?\u008c\u0091©\u0007Y\u008f¸y\u007f}S\u0003\u0004 âÍDGlø§\u009aìëN?æ\u009f\u0015'{å}m½/N$\u0005\biä¿\u0093uW(K\u0085´©ÀÊóÜ¤\u009ce5éÿ_¾\u009aü¦ñ®tÖÚ¨\u009aG_X\u0006¢Ë<\u00922&Æ\u0087Mû\u0018Ìü- häÚxã\"ùñ¸W P-¼\u007fS¾÷Qé\u0018\f_ÖÑYYV±<Ø.\b\u0002Fyp\u008b¦Ï\u0087¬dËè %\"¢>\u007fa\u009aHè\u0011m Ô\"ÁdZK,ÜÁY\u007f¬é\u0081\u0093wX\u0003ÇY(@\u0085\u008fvÐ *^éÈ\u0005[ê%¢¾s@'\u0089mzº.\u0098Bú\u001b\u0097\u0011\b#-hï\u009cò\\r\u0015\u0010\u0089XÅÆyÛ¡M\u0082«&'P\u0019\u0088k \"Xao¨¤]Ô\u009bóKÁÆ\u007f?:Pñ\u009fg\u001b©\u0089õ\u00152GÛP\u0005n\u0084 \u0015_+\u0080abDU\u0085opO\u0007\u007f\u00adÍ+\u0014«\u0084[¨reëQËäÀc%Õ :t\u0014âQW\f+GEöï\u00840\u0098B@\u009e\u0097ÖýÑÛÄù\u0085\u0095øÂ\u0090ë=";
      int var17 = "ûèàþ\u0089Y±\fBj6G\u00ad¯ag¾PO¢Á\u009a)\u0001À²Ûþ2\u0014\rK(!ß°f@4Ì\f¼²ï\u0005\u0093(Ý\u0003JrN\u0087òH\bH\u0006NþI=\u008aè£î<\u0004q\u0000#Ì=\u0018}4\u009fÅ\u0084\u0084d\u0001©K,IëN{æ|Z\u0013Þ\t,³\u001a\u0018§³\u008f\u009aûBà\fUÝ¤Ôy\u0098\u0094yÐ\u008cp\u0099\u0098\u0095ï\u0000 $,î\u0000¾HÅÎa\u0003=\u0081\u0016ªØ\u0007\u0090m4\n\u001aL\u0098Ì9¬m]&¡Bñ Ü8Ö\u009c2\u0001/¤wyC¶pÿj\u0089*Âvl\u0092 ¶_a\u0086S*\nÕÉ¬(\u008c\u008fSqÕ\u0017²j|\u0086¨FlH\u009f^²-°;óIR\u000e. \u0085ÝÆ\u0080i\u008a53\"©\u0082\u0085p°\u0010¤!\u008f\u0088àhz\u007fWÍ\u008d|\u001bÕk@($V *ö¢)0\u0083\u008dh\t£âä°\u001bøR\u009dõoX¨\u009f`\u0091\u0090Õö\u0084ß½/ì^Þ.×\u0002\u0018õ ãäZ\u0010\u0007½`;U\u009f¼\u008fïÌëÃÊö*×\u008a\t\u0018eÔé\\\u0011úUjâ\u0004)ëd\u0016çD\n÷£\u0012\u0019¿%£\u0010%Â\nú¶&täª|±Ü\u0019é¯ï\u0018\u0094HÆýÚ(»^EJêÏÂ¤\u008c9\u001bÊ´ø\u0006\\Û÷\u0010SìÉoY}8\u0092_(l51 ±}\u0018¬Ü¯G\u008bþb\u0089}ö)N\u001b¦\u0092\u009a%Ã4T@dç` Çb¿\fs(\u0012\u001aËåÖAûg\u0015S4SµxÓ1´À\tÝo%\f\u00ad8@(ûU£=Ð\u0006ªL¼ì$\u008fÏ\u0016b\u001dh(\u0014Õ÷]»Áé.ø=µ0\u008fHèn·Ý² Û3 ee\u0083\u00adH\u0003#\u0004\u0013\u00ad\u0019\r*§\u001eæÿ\u001f±Ú§>\u000f\u0004\u0092]'\tôõ\"Å(-µØE±½\u0006³\u0088Xí$&\u00160\u0004gúwÙ\u0000Æ¥O7'\u0006Ï®_:×êÐù,$\\_\f(é×¹7\u0018[á¨H\u0093\u0085.Û\u0004\u0098Y\u0081j\u008bàBÚ©\u00980ÍI÷\u0088krX\u0099\u0096Zø\u0013v** \u0019ñ}\u008bÖ\u0003\u0098êÖ_\u0014dVª\t\u0016\u000f/9Ânÿ8E0¿m\\CÌed \u0005\u001cÛ\u0085w°¼õ\u0002Ò*\u001eße\u0094NI¬ °\u008cË·\u0097\u00170\u0080´\u0085\u0089E¾ Cü\u0013\f\u00adV\u001eº\\\u001aÉ\u0001ôÉ\u0015\u0001³x\u0090-Õ²¥Ç60S\u0017ç²\u0010\u000f\u0018HuãC\u0083Ô\u0001ÝÍ¯?\u008c\u0091©\u0007Y\u008f¸y\u007f}S\u0003\u0004 âÍDGlø§\u009aìëN?æ\u009f\u0015'{å}m½/N$\u0005\biä¿\u0093uW(K\u0085´©ÀÊóÜ¤\u009ce5éÿ_¾\u009aü¦ñ®tÖÚ¨\u009aG_X\u0006¢Ë<\u00922&Æ\u0087Mû\u0018Ìü- häÚxã\"ùñ¸W P-¼\u007fS¾÷Qé\u0018\f_ÖÑYYV±<Ø.\b\u0002Fyp\u008b¦Ï\u0087¬dËè %\"¢>\u007fa\u009aHè\u0011m Ô\"ÁdZK,ÜÁY\u007f¬é\u0081\u0093wX\u0003ÇY(@\u0085\u008fvÐ *^éÈ\u0005[ê%¢¾s@'\u0089mzº.\u0098Bú\u001b\u0097\u0011\b#-hï\u009cò\\r\u0015\u0010\u0089XÅÆyÛ¡M\u0082«&'P\u0019\u0088k \"Xao¨¤]Ô\u009bóKÁÆ\u007f?:Pñ\u009fg\u001b©\u0089õ\u00152GÛP\u0005n\u0084 \u0015_+\u0080abDU\u0085opO\u0007\u007f\u00adÍ+\u0014«\u0084[¨reëQËäÀc%Õ :t\u0014âQW\f+GEöï\u00840\u0098B@\u009e\u0097ÖýÑÛÄù\u0085\u0095øÂ\u0090ë=".length();
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
                  f = var18;
                  i = new String[36];
                  o = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[19];
                  int var3 = 0;
                  String var4 = "Ô)Lp¥è\u008d\u001dÁÉ»¸\u0091ä+\u0098g\u001f\u0095\u007f\u0092a%\u000bl\u001a´÷y[%\u0098f²cäês²_\\eYòp\u0081H\u0003ÁyÊþ\u0095c bÅWÉK\u0096`OÍ÷4í\u001bÐ\u0093¨\u0006c\u0002bV®{ce\u000e\u0010ëågÙô¼\u001e\u0013\u001as¥©ð_£ºUÐkÜQ¼ÖÙú\u0090ðj\u0002\u0081\u0090d\u0098-·\r\u001d\t\u0010qGÿ\u0097³U¼Ê\u0085ÑT¸q\u0092è";
                  int var5 = "Ô)Lp¥è\u008d\u001dÁÉ»¸\u0091ä+\u0098g\u001f\u0095\u007f\u0092a%\u000bl\u001a´÷y[%\u0098f²cäês²_\\eYòp\u0081H\u0003ÁyÊþ\u0095c bÅWÉK\u0096`OÍ÷4í\u001bÐ\u0093¨\u0006c\u0002bV®{ce\u000e\u0010ëågÙô¼\u001e\u0013\u001as¥©ð_£ºUÐkÜQ¼ÖÙú\u0090ðj\u0002\u0081\u0090d\u0098-·\r\u001d\t\u0010qGÿ\u0097³U¼Ê\u0085ÑT¸q\u0092è".length();
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
                              l = var6;
                              m = new Integer[19];
                              KProperty[] var30 = new KProperty[true.b<invokedynamic>(1618, 6946908217508249342L ^ var20)];
                              var30[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(29009, 2660412742687393151L ^ var20), true.t<invokedynamic>(21107, 3315708915689694846L ^ var20), 0)));
                              var30[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(3826, 4564364410618084083L ^ var20), true.t<invokedynamic>(19385, 8705870670352564151L ^ var20), 0)));
                              var30[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(20807, 3327605761207051599L ^ var20), true.t<invokedynamic>(15887, 4326957089578830345L ^ var20), 0)));
                              var30[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(21672, 8362077072269451431L ^ var20), true.t<invokedynamic>(4865, 4854695037438813982L ^ var20), 0)));
                              var30[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(2141, 6875788940242320456L ^ var20), true.t<invokedynamic>(3157, 994261290910644346L ^ var20), 0)));
                              var30[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(19047, 4579662295044505186L ^ var20), true.t<invokedynamic>(29632, 497609591989569472L ^ var20), 0)));
                              var30[true.b<invokedynamic>(6391, 8407682810553278547L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(20758, 8260681326852482304L ^ var20), true.t<invokedynamic>(22108, 1674658548551098944L ^ var20), 0)));
                              var30[true.b<invokedynamic>(13352, 4566333140026297479L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(24019, 2738186223719557569L ^ var20), true.t<invokedynamic>(14108, 4569043997601317647L ^ var20), 0)));
                              var30[true.b<invokedynamic>(11586, 707880548936226295L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(26053, 1716553093679813058L ^ var20), true.t<invokedynamic>(15277, 4443124343037579182L ^ var20), 0)));
                              var30[true.b<invokedynamic>(1348, 4934435841957608938L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kw.class, true.t<invokedynamic>(19345, 1185924501525544837L ^ var20), true.t<invokedynamic>(6320, 4117638567281028276L ^ var20), 0)));
                              B = var30;
                              q = new kw(var26);
                              X = qi.R((il)q, true.t<invokedynamic>(17334, 5293957365092005786L ^ var20), false, (pj)null, (Function0)null, true.b<invokedynamic>(30760, 7136019963488714890L ^ var20), var28, (Object)null);
                              d = qi.o((il)q, true.t<invokedynamic>(25451, 2204120359508055904L ^ var20), true.b<invokedynamic>(23101, 2897995803005739668L ^ var20), new IntRange(0, true.b<invokedynamic>(3078, 2012325839630120101L ^ var20)), var22, (pj)null, (Function0)null, true.b<invokedynamic>(16077, 1303525793696253546L ^ var20), (Object)null);
                              J = qi.g((il)q, true.t<invokedynamic>(15692, 5165758050459273541L ^ var20), 2.0F, RangesKt.rangeTo(0.1F, 5.0F), (pj)null, kw::U, true.b<invokedynamic>(11586, 707880548936226295L ^ var20), var24, (Object)null);
                              T = qi.g((il)q, true.t<invokedynamic>(10176, 1499862296000910282L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 5.0F), (pj)null, kw::A, true.b<invokedynamic>(11586, 707880548936226295L ^ var20), var24, (Object)null);
                              n = qi.o((il)q, true.t<invokedynamic>(22365, 7806409039131616067L ^ var20), true.b<invokedynamic>(10427, 1448688386699857936L ^ var20), new IntRange(1, true.b<invokedynamic>(24528, 5286654244782466919L ^ var20)), var22, (pj)null, kw::I, true.b<invokedynamic>(11586, 707880548936226295L ^ var20), (Object)null);
                              g = qi.R((il)q, true.t<invokedynamic>(22094, 2069991055552750166L ^ var20), false, (pj)null, kw::H, 4, var28, (Object)null);
                              S = qi.g((il)q, true.t<invokedynamic>(17594, 8072636484108595351L ^ var20), 1.0F, RangesKt.rangeTo(1.0F, 10.0F), (pj)null, kw::y, true.b<invokedynamic>(11586, 707880548936226295L ^ var20), var24, (Object)null);
                              e = qi.o((il)q, true.t<invokedynamic>(27972, 2829854263720778069L ^ var20), 3, new IntRange(1, 3), var22, (pj)null, (Function0)null, true.b<invokedynamic>(26509, 8782649199780159264L ^ var20), (Object)null);
                              c = qi.o((il)q, true.t<invokedynamic>(15238, 5699753292169432982L ^ var20), 3, new IntRange(1, 3), var22, (pj)null, (Function0)null, true.b<invokedynamic>(26509, 8782649199780159264L ^ var20), (Object)null);
                              u = qi.o((il)q, true.t<invokedynamic>(10818, 9039307133992394329L ^ var20), true.b<invokedynamic>(5956, 4820338873854210018L ^ var20), new IntRange(true.b<invokedynamic>(10427, 1448688386699857936L ^ var20), true.b<invokedynamic>(1341, 1135961354324884875L ^ var20)), var22, (pj)null, (Function0)null, true.b<invokedynamic>(26509, 8782649199780159264L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\n\u0099ÍÑôb+ìx.\u009f\u0081+\u0002¸Ì";
                           var5 = "\n\u0099ÍÑôb+ìx.\u009f\u0081+\u0002¸Ì".length();
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

               var15 = "Òw\nÈÚH3\u0011\u0081ó\u0082\"*Ú\u0099A:®T:¯'ý\u0001(ÂyAN! R\u0085\r\u0086Ø\u0085\u00994+ªêp\u0016 \u009d»I&\u001a²\u000b#û¶W`%G\u0099\bVZ\u0017¤";
               var17 = "Òw\nÈÚH3\u0011\u0081ó\u0082\"*Ú\u0099A:®T:¯'ý\u0001(ÂyAN! R\u0085\r\u0086Ø\u0085\u00994+ªêp\u0016 \u009d»I&\u001a²\u000b#û¶W`%G\u0099\bVZ\u0017¤".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20681;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kw", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("su/catlean/kw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7266;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kw", var14);
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
         throw new RuntimeException("su/catlean/kw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
