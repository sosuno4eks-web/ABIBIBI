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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1324;
import net.minecraft.class_5134;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class om extends k9 {
   @NotNull
   public static final om o;
   static final KProperty[] Y;
   @NotNull
   private static final zr V;
   @NotNull
   private static final zc c;
   @NotNull
   private static final zo W;
   @NotNull
   private static final zo i;
   private static final long b = j0.a(4557289316951231598L, 8556122861018643864L, MethodHandles.lookup().lookupClass()).a(26389869533012L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] k;
   private static final Map l;

   private om(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 125103873371280L;
      super(var3, true.z<invokedynamic>(25352, 7476404448441247837L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final hc k(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 95687790972726L;
      int var3 = (int)((var1 ^ 95687790972726L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (hc)V.k((short)var3, this, Y[0], (short)var4, var5);
   }

   private final void U(short var1, hc var2, int var3, short var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 133821405733370L;
      int var7 = (int)((var5 ^ 133821405733370L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      V.P(this, var7, Y[0], (short)var8, var2, (short)var9);
   }

   private final float K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 83281339241114L;
      int var3 = (int)((var1 ^ 83281339241114L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)c.k((short)var3, this, Y[1], (short)var4, var5)).floatValue();
   }

   private final void Y(float var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 26732774589557L;
      int var4 = (int)((var2 ^ 26732774589557L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      c.P(this, var4, Y[1], (short)var5, var1, (short)var6);
   }

   private final boolean d(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 129499682226142L;
      int var3 = (int)((var1 ^ 129499682226142L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, Y[2], (short)var4, var5);
   }

   private final void c(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 104062493021286L;
      int var4 = (int)((var2 ^ 104062493021286L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      W.P(this, var4, Y[2], (short)var5, var1, (short)var6);
   }

   private final boolean m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 19024982204215L;
      int var3 = (int)((var1 ^ 19024982204215L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)i.k((short)var3, this, Y[3], (short)var4, var5);
   }

   private final void p(long var1, boolean var3) {
      var1 ^= b;
      long var10001 = var1 ^ 40832943614773L;
      int var4 = (int)((var1 ^ 40832943614773L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      i.P(this, var4, Y[3], (short)var5, var3, (short)var6);
   }

   public void a(long var1) {
      long var10001 = var1 ^ 51014814754835L;
      int var3 = (int)((var1 ^ 51014814754835L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      this.I((short)var3, var4, var5, 0.6F);
   }

   @Flow
   public final void N(@NotNull PreSyncEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void e(MoveEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final double[] t(double var1, long var3) {
      var3 ^= b;
      boolean var5 = 8761192923376485628L.A<invokedynamic>(8761192923376485628L, var3);

      int var10000;
      double[] var6;
      double[] var8;
      label68: {
         label69: {
            label70: {
               label71: {
                  label72: {
                     label42: {
                        try {
                           var10000 = (int)(var1 * (double)true.v<invokedynamic>(17511, 7230329531549799067L ^ var3));
                           if (var5) {
                              break label68;
                           }

                           switch(var10000) {
                           case 7500:
                           case 10000:
                              break;
                           case 8125:
                           case 8750:
                              break label69;
                           case 15000:
                              break label70;
                           case 20000:
                              break label71;
                           case 25000:
                              break label72;
                           default:
                              break label42;
                           }
                        } catch (NumberFormatException var7) {
                           throw var7.A<invokedynamic>(var7, 8797383899102982646L, var3);
                        }

                        var10000 = 2;
                        break label68;
                     }

                     var8 = null;
                     return var8;
                  }

                  var6 = new double[true.v<invokedynamic>(26052, 935819646533366586L ^ var3)];
                  var6[0] = 0.425D;
                  var6[1] = 0.821D;
                  var6[2] = 0.699D;
                  var6[3] = 0.599D;
                  var6[4] = 1.022D;
                  var6[5] = 1.372D;
                  var6[true.v<invokedynamic>(17451, 5331458867529437919L ^ var3)] = 1.652D;
                  var6[true.v<invokedynamic>(14360, 8373544573588483809L ^ var3)] = 1.869D;
                  var6[true.v<invokedynamic>(8680, 8241924338785695507L ^ var3)] = 2.019D;
                  var6[true.v<invokedynamic>(8976, 4528911398095271407L ^ var3)] = 1.907D;
                  var8 = var6;
                  return var8;
               }

               var6 = new double[true.v<invokedynamic>(24956, 7972989892006475657L ^ var3)];
               var6[0] = 0.42D;
               var6[1] = 0.78D;
               var6[2] = 0.63D;
               var6[3] = 0.51D;
               var6[4] = 0.9D;
               var6[5] = 1.21D;
               var6[true.v<invokedynamic>(17451, 5331458867529437919L ^ var3)] = 1.45D;
               var6[true.v<invokedynamic>(12474, 5982981875575891522L ^ var3)] = 1.43D;
               var8 = var6;
               return var8;
            }

            var6 = new double[true.v<invokedynamic>(7500, 9037383272538508218L ^ var3)];
            var6[0] = 0.42D;
            var6[1] = 0.75D;
            var6[2] = 1.0D;
            var6[3] = 1.16D;
            var6[4] = 1.23D;
            var6[5] = 1.2D;
            var8 = var6;
            return var8;
         }

         var6 = new double[]{0.39D, 0.7D};
         var8 = var6;
         return var8;
      }

      var6 = new double[var10000];
      var6[0] = 0.42D;
      var6[1] = 0.753D;
      var8 = var6;
      return var8;
   }

   private final void I(short var1, int var2, int var3, float var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var7 = var5 ^ 129182317805275L;
      class_1324 var10000 = s8.f(var7).method_5996(class_5134.field_47761);
      Intrinsics.checkNotNull(var10000);
      var10000.method_6192((double)var4);
   }

   private static final boolean J() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean C() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 28709187893687L;
      long var22 = var20 ^ 55142406680726L;
      long var24 = var20 ^ 92461102795634L;
      long var26 = var20 ^ 86678976357L;
      long var28 = var20 ^ 67120860991067L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[13];
      int var16 = 0;
      String var15 = "\\G¸7÷\u0084Bj\nlM\u0099gW\u00adv±Ký?A¼\u0006ä 6\u000fjñ\u000bn^\u0086\u00ad\u0086\u0090Å¦ÑN¿·êÈÕ\u0010\u0003ÌüÝ\u001aê\\-î\u000b>\u0010rn:O@^B\u001e\u00968p\u0012\u0002`Æ\u0007\u0010X9´r\bÐ\u0001\u001e\u009e¡µ´5\"\bi8ºÈ\u0084µ\u00956Ô¸\u008f}¿\u0015\u009c\u001dVÙc¡9^¢ä@8 öÍÛ³¥\u0099¾_¹TÛ¡M\u009a%\u0099õÒéÏR\u0002\u008f/k«|fü~\u0017\u0010±\u0088JXÔñgÁ|\u0001¨WèK\u0084ð\u0010ZØ\u0088¯Òä\u0087\u0091\u000eo$\u0006Ô·\u0011¤\u0010ÄÅHâ¯ vr|¡\u001bfÂÏÈ\u000b\u0018z£â\u000et4º=â3\u0019úË.\u0083Ù>¯8_ü\u0005\nQ\u0018»\u008cð>9p\u0081\f\u009d\u0087ÆjÒ\u00ad\u0010z¯\u0097P¼Ù9Y\u0089\u0010É9\u009fMàÈû¥àc%ç°;\nB";
      int var17 = "\\G¸7÷\u0084Bj\nlM\u0099gW\u00adv±Ký?A¼\u0006ä 6\u000fjñ\u000bn^\u0086\u00ad\u0086\u0090Å¦ÑN¿·êÈÕ\u0010\u0003ÌüÝ\u001aê\\-î\u000b>\u0010rn:O@^B\u001e\u00968p\u0012\u0002`Æ\u0007\u0010X9´r\bÐ\u0001\u001e\u009e¡µ´5\"\bi8ºÈ\u0084µ\u00956Ô¸\u008f}¿\u0015\u009c\u001dVÙc¡9^¢ä@8 öÍÛ³¥\u0099¾_¹TÛ¡M\u009a%\u0099õÒéÏR\u0002\u008f/k«|fü~\u0017\u0010±\u0088JXÔñgÁ|\u0001¨WèK\u0084ð\u0010ZØ\u0088¯Òä\u0087\u0091\u000eo$\u0006Ô·\u0011¤\u0010ÄÅHâ¯ vr|¡\u001bfÂÏÈ\u000b\u0018z£â\u000et4º=â3\u0019úË.\u0083Ù>¯8_ü\u0005\nQ\u0018»\u008cð>9p\u0081\f\u009d\u0087ÆjÒ\u00ad\u0010z¯\u0097P¼Ù9Y\u0089\u0010É9\u009fMàÈû¥àc%ç°;\nB".length();
      char var14 = 24;
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
                  e = new String[13];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "ÿ\u0015\u0088Î6¿[jÕ\"\u001cH\u009d3\u0012\u001b(\u0014nÔÄ\nd\fI?!6\u001ad/`®Ysq\u009c:\u001b³l\u0086þi¦\u0096¿¼G¼\u001db9÷á/çPýVÏµ°g#J\u0014Á6qü1";
                  int var5 = "ÿ\u0015\u0088Î6¿[jÕ\"\u001cH\u009d3\u0012\u001b(\u0014nÔÄ\nd\fI?!6\u001ad/`®Ysq\u009c:\u001b³l\u0086þi¦\u0096¿¼G¼\u001db9÷á/çPýVÏµ°g#J\u0014Á6qü1".length();
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
                              g = var6;
                              k = new Integer[11];
                              KProperty[] var30 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(om.class, true.z<invokedynamic>(2742, 5491043723359936975L ^ var20), true.z<invokedynamic>(20693, 6106289201081138094L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(om.class, true.z<invokedynamic>(24349, 8019503423154959464L ^ var20), true.z<invokedynamic>(74, 7878677250417093433L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(om.class, true.z<invokedynamic>(5146, 5688837545125478244L ^ var20), true.z<invokedynamic>(18042, 2968235920595397893L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(om.class, true.z<invokedynamic>(21245, 2675353081516341643L ^ var20), true.z<invokedynamic>(16597, 1367184159544257441L ^ var20), 0)))};
                              Y = var30;
                              o = new om(var28);
                              V = qi.M((il)o, true.z<invokedynamic>(22252, 5397605132440288657L ^ var20), (Enum)hc.NCP, (pj)null, (Function0)null, true.v<invokedynamic>(14336, 1463953229526287023L ^ var20), (Object)null, var22);
                              c = qi.g((il)o, true.z<invokedynamic>(18745, 6705510369201857091L ^ var20), 2.0F, RangesKt.rangeTo(1.0F, 2.5F), (pj)null, om::J, true.v<invokedynamic>(8680, 8241954661610511169L ^ var20), var24, (Object)null);
                              W = qi.R((il)o, true.z<invokedynamic>(20109, 4553097768127505909L ^ var20), true, (pj)null, om::C, 4, var26, (Object)null);
                              i = qi.R((il)o, true.z<invokedynamic>(14532, 4636493509958292403L ^ var20), false, (pj)null, (Function0)null, true.v<invokedynamic>(23156, 1388240091146854620L ^ var20), var26, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "[¼\u0098ÜÈ¼\u0004ÝTF\u0011Í|2Ûù";
                           var5 = "[¼\u0098ÜÈ¼\u0004ÝTF\u0011Í|2Ûù".length();
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

               var15 = "Ê\u0085ÍÁ÷\u001aS¦vñ\u000bG\u0012È`\u0019E\u008f\u0084T\u0017N\u009bcß4\u008e\u008b9§#äXoz /½\bü ßÃ\u0085\u009e¦\u0019b|\u0084B\u0090EØ\u0094\nÈ\u0084ðÅ\u008câ:å6Î-\u0092\u0096\u0019üCø";
               var17 = "Ê\u0085ÍÁ÷\u001aS¦vñ\u000bG\u0012È`\u0019E\u008f\u0084T\u0017N\u009bcß4\u008e\u008b9§#äXoz /½\bü ßÃ\u0085\u009e¦\u0019b|\u0084B\u0090EØ\u0094\nÈ\u0084ðÅ\u008câ:å6Î-\u0092\u0096\u0019üCø".length();
               var14 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31930;
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
            throw new RuntimeException("su/catlean/om", var10);
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
         throw new RuntimeException("su/catlean/om" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28011;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/om", var14);
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
         throw new RuntimeException("su/catlean/om" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
