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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.api.event.events.render.SetupTerrainEvent;
import su.catlean.gofra.Flow;

public final class y2 extends k9 {
   @NotNull
   public static final y2 N;
   static final KProperty[] Q;
   @NotNull
   private static final zc C;
   @NotNull
   private static final zc n;
   @NotNull
   private static final zo m;
   private static float P;
   private static float z;
   private static float T;
   private static float g;
   @NotNull
   private static class_243 O;
   @NotNull
   private static class_243 w;
   private static float K;
   private static float d;
   private static float U;
   @NotNull
   private static class_243 i;
   @NotNull
   private static qq l;
   private static final long b = j0.a(-7831168808539999015L, 4160754055701438418L, MethodHandles.lookup().lookupClass()).a(139159848759504L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] k;
   private static final Integer[] o;
   private static final Map q;

   private y2(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 50399809380854L;
      super(var3, true.g<invokedynamic>(20692, 244123986268360070L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 51668662138457L;
      int var3 = (int)((var1 ^ 51668662138457L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)C.k((short)var3, this, Q[0], (short)var4, var5)).floatValue();
   }

   private final float y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 99670716216094L;
      int var3 = (int)((var1 ^ 99670716216094L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)n.k((short)var3, this, Q[1], (short)var4, var5)).floatValue();
   }

   private final boolean v(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 63270925560112L;
      int var6 = (int)((var4 ^ 63270925560112L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var6, this, Q[2], (short)var7, var8);
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long var1) {
      long var10001 = var1 ^ 91684594614209L;
      int var3 = (int)((var1 ^ 91684594614209L) >>> 48);
      long var4 = var10001 << 16 >>> 16;
      long var6 = var1 ^ 16426737678522L;
      var10001 = var1 ^ 48800209061993L;
      int var8 = (int)((var1 ^ 48800209061993L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var1 ^ 139193785037213L;
      int var13 = 4299464494129485384L.A<invokedynamic>(4299464494129485384L, var1);

      label40: {
         int var10000;
         label39: {
            try {
               var10000 = this.O(var11);
               if (var13 == 0) {
                  break label39;
               }

               if (var10000 == 0) {
                  return;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, 4285364199572838588L, var1);
            }

            try {
               s8.H((short)var8, (short)var9, var10).field_1730 = true;
               var10000 = var13;
               if (var1 >= 0L) {
                  if (var13 == 0) {
                     break label40;
                  }

                  var10000 = this.v((short)var3, var4);
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, 4285364199572838588L, var1);
            }
         }

         try {
            if (var10000 == 0) {
               return;
            }

            s8.f(var6).method_18799(i);
         } catch (NumberFormatException var14) {
            throw var14.A<invokedynamic>(var14, 4285364199572838588L, var1);
         }
      }

      s8.f(var6).method_64578(l.M(), false, l.C(), false);
   }

   @Flow(
      priority = 10
   )
   private final void A(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void T(SetupTerrainEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void G(FreecamStateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void L(UpdateCrosshairTarget param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void D(InputEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void K(@NotNull KeyboardInputEvent e) {
      Intrinsics.checkNotNullParameter(var1, "e");
      var1.cancel();
   }

   @Flow(
      priority = -10
   )
   private final void S(MoveEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void o(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final float u(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 95008233244381L;
      return gk.E.i(T, P, q1.A.s(var3));
   }

   private final float e(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 125552186104108L;
      return gk.E.i(g, z, q1.A.s(var3));
   }

   private final double h(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 10372149884932L;
      return gk.E.s(w.field_1352, O.field_1352, (double)q1.A.s(var3));
   }

   private final double H(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 127989434511400L;
      return gk.E.s(w.field_1351, O.field_1351, (double)q1.A.s(var3));
   }

   private final double J(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 31913849386915L;
      return gk.E.s(w.field_1350, O.field_1350, (double)q1.A.s(var6));
   }

   static {
      long var20 = b ^ 137134783747811L;
      long var22 = var20 ^ 8452908870761L;
      long var24 = var20 ^ 70830874399944L;
      long var26 = var20 ^ 93775678655620L;
      long var28 = var20 ^ 22438793685215L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "ï\u00185|r\u0011ª\u0089\nO¶ï\u0017;~\u0005\u0010\u0000\u0019@!+>\u0080¯\u009ac\n\u0011x\u009f`U\u0010\u008b\u0088üè°4\u00048z½CU¸\u0000i[\u0010oo÷¾OÉ$_ðlE¯g\u0003g£ û2\u008fg7\u0080\u0091«Çùâ\u0018Ìyª\u0004\u008e\u008eÇS,1ªØ\u001f§Ôõ\u0019ïØ\u0000\u0010·ñüÓnSq\u009b±\u0019ä\tx°Ù\u0001(ªÍ\u0019µ%j\u009dj3ÏQ7+vhQ×ý\u0016pD\b\u000eá(m3OØ3\u001eÚö9\u000f\u008b-åYF\u0010]\u0098Í°¾¹ÒÐpt»ë·UKc\u0018þ%u¾ÙW2Yx×a$¨^ûØ\u009bð\u008e7>p\u0093°\u0018ðf\u0094\u008a\u00ad5c-\u0006È\u0099s\u0010\u000eoÿ=<À\u008a\u0091ûÝ.(:]ðô(Æ6ð\u008b\u008eUþ>âÚ\u0082\u009fã¬\b\u0086Ï1ë9wå:ÿ\u0018RTê>j[cøw\u0085 &\u001a\u0014Î\u001d=³Ëik×}HÜcªM@´VNï\u0089¿Ã\u0088ËT®í^r .ÕH\u0094LþnÌx\u001e\u0010\u0080Äâ.]X\bâÑª\u0013\u0090\u00129×\u0081YØÓ\u0084Å\u0080\u0099ÉD \u0018¼}\u0004±lZÜ. \u0010\u0094d(?¢\u009b½ÞÁ\u0015ú½\u00adY`n\u009dW£jFº\u0019brê\u00996Û\u0010#\u001f:¯\u0019ckÔ\u0000\u0007GÝÈZ\u0005%\u0010\u0085+èö1ñ\\ejàÁ³ì`\u008b\u0081\r©ËJ5äv.+\u0081\u0095º\u009aE\u0012Öóô\u0010\u0018sm£9\u00ad\"àýONèWL\u0095¬íq\b\u00050\u0004#¶4á]Ë1\u000eé\u0010\u008d\u0001X\u007f|y\u0012p\u009e\u0080uJ\u00834k\u0082";
      int var17 = "ï\u00185|r\u0011ª\u0089\nO¶ï\u0017;~\u0005\u0010\u0000\u0019@!+>\u0080¯\u009ac\n\u0011x\u009f`U\u0010\u008b\u0088üè°4\u00048z½CU¸\u0000i[\u0010oo÷¾OÉ$_ðlE¯g\u0003g£ û2\u008fg7\u0080\u0091«Çùâ\u0018Ìyª\u0004\u008e\u008eÇS,1ªØ\u001f§Ôõ\u0019ïØ\u0000\u0010·ñüÓnSq\u009b±\u0019ä\tx°Ù\u0001(ªÍ\u0019µ%j\u009dj3ÏQ7+vhQ×ý\u0016pD\b\u000eá(m3OØ3\u001eÚö9\u000f\u008b-åYF\u0010]\u0098Í°¾¹ÒÐpt»ë·UKc\u0018þ%u¾ÙW2Yx×a$¨^ûØ\u009bð\u008e7>p\u0093°\u0018ðf\u0094\u008a\u00ad5c-\u0006È\u0099s\u0010\u000eoÿ=<À\u008a\u0091ûÝ.(:]ðô(Æ6ð\u008b\u008eUþ>âÚ\u0082\u009fã¬\b\u0086Ï1ë9wå:ÿ\u0018RTê>j[cøw\u0085 &\u001a\u0014Î\u001d=³Ëik×}HÜcªM@´VNï\u0089¿Ã\u0088ËT®í^r .ÕH\u0094LþnÌx\u001e\u0010\u0080Äâ.]X\bâÑª\u0013\u0090\u00129×\u0081YØÓ\u0084Å\u0080\u0099ÉD \u0018¼}\u0004±lZÜ. \u0010\u0094d(?¢\u009b½ÞÁ\u0015ú½\u00adY`n\u009dW£jFº\u0019brê\u00996Û\u0010#\u001f:¯\u0019ckÔ\u0000\u0007GÝÈZ\u0005%\u0010\u0085+èö1ñ\\ejàÁ³ì`\u008b\u0081\r©ËJ5äv.+\u0081\u0095º\u009aE\u0012Öóô\u0010\u0018sm£9\u00ad\"àýONèWL\u0095¬íq\b\u00050\u0004#¶4á]Ë1\u000eé\u0010\u008d\u0001X\u007f|y\u0012p\u009e\u0080uJ\u00834k\u0082".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  e = new String[17];
                  q = new HashMap(13);
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
                  String var4 = "g|Ä\u001e\u007f\u0015\u0085¡v\u0083ÒI/.\u0094\u009b\u0011KÅé\u0011\u0081¸\u0019";
                  int var5 = "g|Ä\u001e\u007f\u0015\u0085¡v\u0083ÒI/.\u0094\u009b\u0011KÅé\u0011\u0081¸\u0019".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var36 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var36 = var3++;
                     long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var41 = -1;

                     while(true) {
                        long var8 = var40;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var43 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var41) {
                        case 0:
                           var34[var36] = var43;
                           if (var2 >= var5) {
                              k = var6;
                              o = new Integer[5];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y2.class, true.g<invokedynamic>(14122, 5249922750155020420L ^ var20), true.g<invokedynamic>(32606, 5732789209733075196L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y2.class, true.g<invokedynamic>(28566, 4099941548479283254L ^ var20), true.g<invokedynamic>(15085, 6739572257066931527L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y2.class, true.g<invokedynamic>(15088, 4683936816763721049L ^ var20), true.g<invokedynamic>(26197, 6890175041690929648L ^ var20), 0)))};
                              Q = var30;
                              N = new y2(var22);
                              C = qi.g((il)N, true.g<invokedynamic>(21590, 3590270483878886394L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 3.0F), (pj)null, (Function0)null, true.u<invokedynamic>(5727, 5464049659197677311L ^ var20), var24, (Object)null);
                              n = qi.g((il)N, true.g<invokedynamic>(18202, 3886951336271489201L ^ var20), 0.42F, RangesKt.rangeTo(0.1F, 3.0F), (pj)null, (Function0)null, true.u<invokedynamic>(22707, 7454762907935084564L ^ var20), var24, (Object)null);
                              m = qi.R((il)N, true.g<invokedynamic>(10674, 6911369948099921439L ^ var20), true, (pj)null, (Function0)null, true.u<invokedynamic>(16655, 795269331530385837L ^ var20), var28, (Object)null);
                              class_243 var35 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var35, true.g<invokedynamic>(22046, 2254946676180335025L ^ var20));
                              O = var35;
                              var35 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var35, true.g<invokedynamic>(26335, 8367389937652861281L ^ var20));
                              w = var35;
                              var35 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var35, true.g<invokedynamic>(26335, 8367389937652861281L ^ var20));
                              i = var35;
                              l = new qq(0.0F, 0.0F, var26, false, (bc)null, true.u<invokedynamic>(16655, 795269331530385837L ^ var20), (DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var34[var36] = var43;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "0s\u0003|Å\u0091ÒÞ¨\u008aüõ|)^Â";
                           var5 = "0s\u0003|Å\u0091ÒÞ¨\u008aüõ|)^Â".length();
                           var2 = 0;
                        }

                        var36 = var2;
                        var2 += 8;
                        var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var36 = var3++;
                        var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var41 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0089ü\f\u0096Ó¶Òc\u0091òá}¬\u0083òwÞí\u008bZÏî\u0004âepùÁ\u001dr\u0095p\u0084µb3¹?ì\u0013IõÏõ\u0081*9Ñ.©³-C¸DwyC·\u0084®qú\u0016JÒ`oi®@BºÝ\u0094ºHW\u0014üI\u009bN½Ä_e´#êØq\u0011À}e\b\u009f¾U+¨¡GI\u001b\u0080í^Ñ<Á!Áx\u0090\u0004U²A/¶£ï=\rÙÑ\u008bT\u0086ú\u0010\u008eñÙ\u0010\t<\u0019$Í\u007fø\b`ºH\u0092\u0001\u0098\u0014 ";
               var17 = "\u0089ü\f\u0096Ó¶Òc\u0091òá}¬\u0083òwÞí\u008bZÏî\u0004âepùÁ\u001dr\u0095p\u0084µb3¹?ì\u0013IõÏõ\u0081*9Ñ.©³-C¸DwyC·\u0084®qú\u0016JÒ`oi®@BºÝ\u0094ºHW\u0014üI\u009bN½Ä_e´#êØq\u0011À}e\b\u009f¾U+¨¡GI\u001b\u0080í^Ñ<Á!Áx\u0090\u0004U²A/¶£ï=\rÙÑ\u008bT\u0086ú\u0010\u008eñÙ\u0010\t<\u0019$Í\u007fø\b`ºH\u0092\u0001\u0098\u0014 ".length();
               var14 = 136;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26577;
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
            throw new RuntimeException("su/catlean/y2", var10);
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
         throw new RuntimeException("su/catlean/y2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16604;
      if (o[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = k[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/y2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
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
         throw new RuntimeException("su/catlean/y2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
