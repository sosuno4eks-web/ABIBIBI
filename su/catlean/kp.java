package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_744;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kp extends k9 {
   @NotNull
   public static final kp B;
   static final KProperty[] w;
   @NotNull
   private static final z0 s;
   @NotNull
   private static final zr O;
   @NotNull
   private static final zr Q;
   @NotNull
   private static final z7 C;
   @NotNull
   private static final zo W;
   @NotNull
   private static final zo t;
   @NotNull
   private static final zo M;
   @NotNull
   private static final zo v;
   @NotNull
   private static final zc e;
   @NotNull
   private static final zk N;
   @NotNull
   private static final zo L;
   @NotNull
   private static final zo T;
   @NotNull
   private static final zo q;
   @NotNull
   private static class_243 A;
   private static float x;
   private static boolean V;
   @NotNull
   private static final Queue U;
   @NotNull
   private static final Queue n;
   @NotNull
   private static final AtomicBoolean X;
   @Nullable
   private static class_744 o;
   @Nullable
   private static class_243 f;
   private static boolean z;
   private static int Y;
   private static final long b = j0.a(98884795912328237L, 5916610669508834209L, MethodHandles.lookup().lookupClass()).a(835692541188L);
   private static final String[] c;
   private static final String[] d;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private kp(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 135486846363654L;
      super(var3, true.s<invokedynamic>(2311, 4052336253726805048L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 45268917495044L;
      int var3 = (int)((var1 ^ 45268917495044L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)s.k((short)var3, this, w[0], (short)var4, var5)).intValue();
   }

   private final void Y(int var1, long var2, char var4) {
      long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 80403704359983L;
      int var7 = (int)((var5 ^ 80403704359983L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      s.P(this, var7, w[0], (short)var8, var1, (short)var9);
   }

   @NotNull
   public final ao U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 4921026256918L;
      int var3 = (int)((var1 ^ 4921026256918L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ao)O.k((short)var3, this, w[1], (short)var4, var5);
   }

   public final void P(int a, short a, @NotNull ao <set-?>, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 119950440963580L;
      int var7 = (int)((var5 ^ 119950440963580L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      int var10000 = -2402878428191584254L.A<invokedynamic>(-2402878428191584254L, var5);
      Intrinsics.checkNotNullParameter(var3, true.s<invokedynamic>(31464, 8600995311540409250L ^ var5));
      int var10 = var10000;

      try {
         O.P(this, var7, w[1], (short)var8, var3, (short)var9);
         if (var10 == 0) {
            (new int[3]).A<invokedynamic>(new int[3], -2443239138279547476L, var5);
         }

      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -2318054830463774690L, var5);
      }
   }

   private final ao W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 131214573388494L;
      int var3 = (int)((var1 ^ 131214573388494L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ao)Q.k((short)var3, this, w[2], (short)var4, var5);
   }

   private final void Y(int var1, byte var2, int var3, ao var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var5 ^ 92996026879383L;
      int var7 = (int)((var5 ^ 92996026879383L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Q.P(this, var7, w[2], (short)var8, var4, (short)var9);
   }

   private final n_ P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 96939518427563L;
      int var3 = (int)((var1 ^ 96939518427563L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)C.k((short)var3, this, w[3], (short)var4, var5);
   }

   private final boolean M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 7491058054880L;
      int var3 = (int)((var1 ^ 7491058054880L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, w[4], (short)var4, var5);
   }

   private final boolean x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 84267691695345L;
      int var3 = (int)((var1 ^ 84267691695345L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)t.k((short)var3, this, w[5], (short)var4, var5);
   }

   private final boolean f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 77250660049863L;
      int var3 = (int)((var1 ^ 77250660049863L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)M.k((short)var3, this, w[true.g<invokedynamic>(8818, 8719990932396231653L ^ var1)], (short)var4, var5);
   }

   private final boolean e(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 120299954019789L;
      int var3 = (int)((var1 ^ 120299954019789L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)v.k((short)var3, this, w[true.g<invokedynamic>(15727, 2195422014457604860L ^ var1)], (short)var4, var5);
   }

   private final float r(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 122449397269843L;
      int var3 = (int)((var1 ^ 122449397269843L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)e.k((short)var3, this, w[true.g<invokedynamic>(17422, 7189611242877307675L ^ var1)], (short)var4, var5)).floatValue();
   }

   private final pj m(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ b;
      long var10001 = var3 ^ 83342536851255L;
      int var5 = (int)((var3 ^ 83342536851255L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      return (pj)N.k((short)var5, this, w[true.g<invokedynamic>(25733, 7233602268857536999L ^ var3)], (short)var6, var7);
   }

   private final boolean y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 108806047884079L;
      int var3 = (int)((var1 ^ 108806047884079L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)L.k((short)var3, this, w[true.g<invokedynamic>(10303, 7328489695056200021L ^ var1)], (short)var4, var5);
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 25701931741894L;
      int var3 = (int)((var1 ^ 25701931741894L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var3, this, w[true.g<invokedynamic>(12536, 863406721919256679L ^ var1)], (short)var4, var5);
   }

   private final boolean J(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 42893662719456L;
      int var6 = (int)((var4 ^ 42893662719456L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)q.k((short)var6, this, w[true.g<invokedynamic>(32202, 7347623820980533885L ^ var4)], (short)var7, var8);
   }

   @Nullable
   public final class_243 p() {
      return f;
   }

   public final void Q(@Nullable class_243 <set-?>) {
      f = var1;
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void J(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   public final void i(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 88706909120336L;
      int var6 = (int)((var4 ^ 88706909120336L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      var10001 = var4 ^ 84772166026984L;
      long var9 = (var4 ^ 84772166026984L) >>> 16;
      int var11 = (int)(var10001 << 48 >>> 48);
      int var10000 = 8613414548198964041L.A<invokedynamic>(8613414548198964041L, var4);
      this.Y(true.g<invokedynamic>(26131, 2100630437465860193L ^ var4), var9, (char)var11);
      this.Y(var6, (byte)var7, var8, ao.OFF);
      int var12 = var10000;

      try {
         if (8587187161080099393L.A<invokedynamic>(8587187161080099393L, var4) == null) {
            ++var12;
            var12.A<invokedynamic>(var12, 8601979729732422660L, var4);
         }

      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 8508392463675537881L, var4);
      }
   }

   @Flow
   private final void g(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void m(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void b(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void L(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void v(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void B(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean R() {
      long var0 = b ^ 5173959871909L;
      long var2 = var0 ^ 135105123771273L;
      int var4 = 1309921803857747692L.A<invokedynamic>(1309921803857747692L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = B.x(var2);
            if (var4 != 0) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 1420562186238155900L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final boolean H() {
      long var0 = b ^ 37991243858592L;
      long var2 = var0 ^ 137525652368816L;
      return B.e(var2);
   }

   static {
      long var20 = b ^ 74036123867907L;
      long var22 = var20 ^ 68549529267097L;
      long var10001 = var20 ^ 107643716562882L;
      int var24 = (int)((var20 ^ 107643716562882L) >>> 32);
      int var25 = (int)(var10001 << 32 >>> 48);
      int var26 = (int)(var10001 << 48 >>> 48);
      long var27 = var20 ^ 121715976530041L;
      var10001 = var20 ^ 26203801326411L;
      int var29 = (int)((var20 ^ 26203801326411L) >>> 32);
      int var30 = (int)(var10001 << 32 >>> 48);
      int var31 = (int)(var10001 << 48 >>> 48);
      long var32 = var20 ^ 14836625194650L;
      long var34 = var20 ^ 47358231650988L;
      long var36 = var20 ^ 84814366300488L;
      var10001 = var20 ^ 64224787584745L;
      int var38 = (int)((var20 ^ 64224787584745L) >>> 32);
      int var39 = (int)(var10001 << 32 >>> 32);
      long var40 = var20 ^ 27627568293215L;
      g = new HashMap(13);
      0.A<invokedynamic>(0, 4962770311212504929L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[46];
      int var16 = 0;
      String var15 = "3ü}ÎöÚÎ\u00ad\u0084`ªSö\u007fy\u008c±½å\u0019·2\u0011(\u000eºôçõî\u009e&\u00182Ñß¾\u008azØà°\u00ad\u0099Ým\u0005íØQÿDuÒ./ò\u0018©\u000f«\u0081ZÝ\u0000\u0088§´\bÉGé\u008eg\u009b° Ôî¶\u0011\u001d8á8¬$Ë\u008fB\u009bÕ©\u0000ÏÝç>Þu\u0001\u0004\u000eI\u009ctìÍg¶!£²pÇê\r]Mu9½\u0003T\u0011\u008cå®õïÞ6c÷\t=@X\u001e\u0010\u009b\u009bx\u0094GQ\u0002PËq\\I©¹\u009fú\u0018Âz'ÿ8Hä\bf÷RáÐ\u008dûÄ\u0082\u0082j¡B\u009fñ÷(h\u009d}\u00161)z¶\u0084\u0002;_àl\u0012ØÎõkÚûì?KUM\u001a¼\t\u0010T¼{'\rÃµ±\u0082ü %\u008d±®Y]Ü\u0011y&\u0003\u009cµU J\u0085\u0003nã3äÁz¼Ö\u008aMa*Ö\u008a\u0098\u009eqô@ý\u009d(=I\u009fyUâ\u009bÒ´\u0092\"\u0083V6\u0012Re°µ\u0084\u0084Gý\u009c\u001aþ°x²vEï\u0094uþÑN1ê\u0005[¸\u001dF\u0003«ü«¡²\u0097\u001aß~¼ÀÖC·Ü\u0094åö}\u0013\u0018éõ¹4T+[ù</þ»\u0015 ½êð?é\f<JxqëvªíöÈ°½Ô®UÌ-\u0093\u009fþËÄ\u000b\u0093{\u0092\u0010`¾\u0083\u0001h\u0000Íõä³]Ä^_\u0091a©´EÞ\u0093h\u0091\u0081V¹Ñ\u0013í\u008f\u0003\u008d(þD\u0011FDÓøç\u009dãË®÷:V0w2*mR\u008f\u001e±¶Ém¤Ø/º6\u007f\u0087\u0012Q¨q½½\u0010È\u008e\u009e>Ô\u0095FÃÎ&,Ì\u00978\u001fà(uá_q/fÜ3\u0003aË\u0007§Ù$zr\u0019ü\u009fÙ\r¶ki2\u0094ïÙ\u0010ÎèÍÂµ\u0080'±ªi\u0010}\u007fëuü!\f\u0095\u009bW>,óL©ê «ÔH½!i\u0088\u0097\u0007}V\u0083\u008a¼\u008bB\u0097\u008fÏ`Ê-D\u001f^f-V©ù\u0018A\u0018\u0001²\u0097h\u0098¤êµ\u008bÄ\u0080l\"ØÙ\u001e¾¡ë·\u0097\u0095%H\u0018á=C\u001e½áÌ\u008e}¨eðª³}\rÉx=\u0095¹¸|å@:\u0007\u0000Ï=\u000e\u0085T\u0093´\u001c©X\u001djßnÒZ%üÜ\u0084\u0013$&Í«^Ç úQ\u0012\u0004rök¦\u0083\\¬\u009f¶01\u0096\"\rÐî\u000eý\u0004õ³\u001e¹\u0019?²Àº¨ þÖ=\u009c¶órE\u0002þ\"û}f\u000f\u0080^\u0010\u001b\u0002vÇÏÉ\u0085\u001a\u0097§\u0095\u0002\u001eÛ èéëõQ®\\Ù\u0003¾\u0002\u0096\u000ekÛà\u0004ºc\u0097Ï\u0006ÃÁ!\u0095\u001fZµöG»(rg\u0091\u0018\u0083qÎ\u0095o³ëä\u008a¶\u0087\u008c\u0084\b¶\u001d§Ó*\u007f\u008d}\u0098êÇ°^BrÍ©\u000eÝ÷Ó@ ³NAJ`\u0090\rÔa/<ÒÉÂâìhz\u007f\u009b%²Hu\u0002\u0098>fª\u0000_\u001b\u0018ÑhÉ\u0007\u009e\u001aª_´xÌ\u0010\u008bê`2fùñ°\u0016Çqç\u0010¸\u008fÊ\u0016:ó\u009e\u008cåàMm¯\u001e\"\u00000ÊïÉV#r\u001dm\u009a\f®:h\u0080\u008a«ä;ºk¸\u001cÛÿ\u0090â\u000f\u0087|õw\u0003ø\nðS_\u0007äd\u00874W5´¶g-\u0018Ç²µÜ\u0081\u0096fz\u0012÷È\u009b\u0086\u009b\u0015Utîz\u000eat\u0099Î Ø\u001e\u0086-\n}Ð²8\u0018\t?kãéë,ÉªH\u0019k<K]\\\u00061é\u0003K]\u0010\u0086$7\u0082T\u001a\u00181ì3éYf®å\u008c ½\u001eG R \u0098z\u008aF,\u0010\u001d\u0082\n¶ª¾.v\u0087Ô»\u009aÃ\u009eÃá?ÅL:(nâÖ¦\u0098\u009e®JuÑD\u0082\u0093Ú#Á\u007fä%MÔ\u0089×ônÃd¥:N\u0095\u001b\u009aÐÖ*`e}\u007f KPj¸4\u0016DÓ\u008c\u0089±âÁ°Pµq³àRS\u001c\u0082\u008aáSh\u0082\r.\u0094±(Ø´òD.\bZÖ\u00adÒèÏ¡\u008d8ë\u0012cä\u0006Ò»\u008a8\u0012\u0082éWæw=Èª\u001dL8Ï-³õ ú\u0002\u0002$v \u0084íb\b)\u0014ÃM+¤o\u008f\u00adó~t5\u009e\u009bPáI\u000e9\"\u001b8\u0007\u0005üf/ÿ5\u001e\u0091.ïó\u0001'AIÙ³Lo`(Ù\u000b85Å²n\u0006ç®« Þ\r%\u0097\u0019nÅ\u0084 üSÖC¿\u0017p\u0019ýÄ\u008e¢\u0010 ceþóÊ\u00819\t\u008d/7Ñ\u0084÷\u001c7¸ÉC\u0091q\u0018öaÆ\u001aIÌÑþÕÔ\u0010\u0018\u009eÊþ²\u0011ÍÝ\u00919\u0092$8g@\t8m\u0015ò¼\u0007~\u0085è\u0093\u0004Åß+Ý\u0013EõJÄt÷lÏG¸íR9§uìÃ\u0092w\u008b´SØ\u008dBÕ\u000eüÀS\tªÙªå\u0085\u0091§Ñ\u0010; !V\r\u008f½¯\u0089\u008d(L¬}3@\u009bM¸#×4Ý¿\u009dQK¹!Q\nõDú\u0010L@ê\u000f>F<p%\u0096Ø\u008b\u0083ú+®\u0010Cj_s\t:\u001fW\u0097ôýK.\u0000\u00ad\u001f8Æ\fóÿâÏ\u001cåÉ¼A]:yRtá\u008fgäóÈ§4O7\u0002\u009f\u0019Õðr\u008e):Mýe\t\fy/ÝzÁ-O0\u0011\u0014½\u0099Õ\u0081\u0089^ \u001bOhþ`\u008a\u0004¼Ap»\u0096;8ä8°S\u0081ÒõÓ@½BVÏ«=Ã$Ç .\u009dRUWd\u001c\u001a&5ÛÉ]Ò\u008c¥Tè\ro½ok¾ó;eóªØí\u0096\u0010Q\u0019ê`\u001bV¡ýzGô\u000e¹fÃ\u0099 T\b\u000e©ºc\u0011Ä¸¦\u0006\u0006_å/ïvCåf\u0011<\u0013Ltµ>òÖ]ô\u0087";
      int var17 = "3ü}ÎöÚÎ\u00ad\u0084`ªSö\u007fy\u008c±½å\u0019·2\u0011(\u000eºôçõî\u009e&\u00182Ñß¾\u008azØà°\u00ad\u0099Ým\u0005íØQÿDuÒ./ò\u0018©\u000f«\u0081ZÝ\u0000\u0088§´\bÉGé\u008eg\u009b° Ôî¶\u0011\u001d8á8¬$Ë\u008fB\u009bÕ©\u0000ÏÝç>Þu\u0001\u0004\u000eI\u009ctìÍg¶!£²pÇê\r]Mu9½\u0003T\u0011\u008cå®õïÞ6c÷\t=@X\u001e\u0010\u009b\u009bx\u0094GQ\u0002PËq\\I©¹\u009fú\u0018Âz'ÿ8Hä\bf÷RáÐ\u008dûÄ\u0082\u0082j¡B\u009fñ÷(h\u009d}\u00161)z¶\u0084\u0002;_àl\u0012ØÎõkÚûì?KUM\u001a¼\t\u0010T¼{'\rÃµ±\u0082ü %\u008d±®Y]Ü\u0011y&\u0003\u009cµU J\u0085\u0003nã3äÁz¼Ö\u008aMa*Ö\u008a\u0098\u009eqô@ý\u009d(=I\u009fyUâ\u009bÒ´\u0092\"\u0083V6\u0012Re°µ\u0084\u0084Gý\u009c\u001aþ°x²vEï\u0094uþÑN1ê\u0005[¸\u001dF\u0003«ü«¡²\u0097\u001aß~¼ÀÖC·Ü\u0094åö}\u0013\u0018éõ¹4T+[ù</þ»\u0015 ½êð?é\f<JxqëvªíöÈ°½Ô®UÌ-\u0093\u009fþËÄ\u000b\u0093{\u0092\u0010`¾\u0083\u0001h\u0000Íõä³]Ä^_\u0091a©´EÞ\u0093h\u0091\u0081V¹Ñ\u0013í\u008f\u0003\u008d(þD\u0011FDÓøç\u009dãË®÷:V0w2*mR\u008f\u001e±¶Ém¤Ø/º6\u007f\u0087\u0012Q¨q½½\u0010È\u008e\u009e>Ô\u0095FÃÎ&,Ì\u00978\u001fà(uá_q/fÜ3\u0003aË\u0007§Ù$zr\u0019ü\u009fÙ\r¶ki2\u0094ïÙ\u0010ÎèÍÂµ\u0080'±ªi\u0010}\u007fëuü!\f\u0095\u009bW>,óL©ê «ÔH½!i\u0088\u0097\u0007}V\u0083\u008a¼\u008bB\u0097\u008fÏ`Ê-D\u001f^f-V©ù\u0018A\u0018\u0001²\u0097h\u0098¤êµ\u008bÄ\u0080l\"ØÙ\u001e¾¡ë·\u0097\u0095%H\u0018á=C\u001e½áÌ\u008e}¨eðª³}\rÉx=\u0095¹¸|å@:\u0007\u0000Ï=\u000e\u0085T\u0093´\u001c©X\u001djßnÒZ%üÜ\u0084\u0013$&Í«^Ç úQ\u0012\u0004rök¦\u0083\\¬\u009f¶01\u0096\"\rÐî\u000eý\u0004õ³\u001e¹\u0019?²Àº¨ þÖ=\u009c¶órE\u0002þ\"û}f\u000f\u0080^\u0010\u001b\u0002vÇÏÉ\u0085\u001a\u0097§\u0095\u0002\u001eÛ èéëõQ®\\Ù\u0003¾\u0002\u0096\u000ekÛà\u0004ºc\u0097Ï\u0006ÃÁ!\u0095\u001fZµöG»(rg\u0091\u0018\u0083qÎ\u0095o³ëä\u008a¶\u0087\u008c\u0084\b¶\u001d§Ó*\u007f\u008d}\u0098êÇ°^BrÍ©\u000eÝ÷Ó@ ³NAJ`\u0090\rÔa/<ÒÉÂâìhz\u007f\u009b%²Hu\u0002\u0098>fª\u0000_\u001b\u0018ÑhÉ\u0007\u009e\u001aª_´xÌ\u0010\u008bê`2fùñ°\u0016Çqç\u0010¸\u008fÊ\u0016:ó\u009e\u008cåàMm¯\u001e\"\u00000ÊïÉV#r\u001dm\u009a\f®:h\u0080\u008a«ä;ºk¸\u001cÛÿ\u0090â\u000f\u0087|õw\u0003ø\nðS_\u0007äd\u00874W5´¶g-\u0018Ç²µÜ\u0081\u0096fz\u0012÷È\u009b\u0086\u009b\u0015Utîz\u000eat\u0099Î Ø\u001e\u0086-\n}Ð²8\u0018\t?kãéë,ÉªH\u0019k<K]\\\u00061é\u0003K]\u0010\u0086$7\u0082T\u001a\u00181ì3éYf®å\u008c ½\u001eG R \u0098z\u008aF,\u0010\u001d\u0082\n¶ª¾.v\u0087Ô»\u009aÃ\u009eÃá?ÅL:(nâÖ¦\u0098\u009e®JuÑD\u0082\u0093Ú#Á\u007fä%MÔ\u0089×ônÃd¥:N\u0095\u001b\u009aÐÖ*`e}\u007f KPj¸4\u0016DÓ\u008c\u0089±âÁ°Pµq³àRS\u001c\u0082\u008aáSh\u0082\r.\u0094±(Ø´òD.\bZÖ\u00adÒèÏ¡\u008d8ë\u0012cä\u0006Ò»\u008a8\u0012\u0082éWæw=Èª\u001dL8Ï-³õ ú\u0002\u0002$v \u0084íb\b)\u0014ÃM+¤o\u008f\u00adó~t5\u009e\u009bPáI\u000e9\"\u001b8\u0007\u0005üf/ÿ5\u001e\u0091.ïó\u0001'AIÙ³Lo`(Ù\u000b85Å²n\u0006ç®« Þ\r%\u0097\u0019nÅ\u0084 üSÖC¿\u0017p\u0019ýÄ\u008e¢\u0010 ceþóÊ\u00819\t\u008d/7Ñ\u0084÷\u001c7¸ÉC\u0091q\u0018öaÆ\u001aIÌÑþÕÔ\u0010\u0018\u009eÊþ²\u0011ÍÝ\u00919\u0092$8g@\t8m\u0015ò¼\u0007~\u0085è\u0093\u0004Åß+Ý\u0013EõJÄt÷lÏG¸íR9§uìÃ\u0092w\u008b´SØ\u008dBÕ\u000eüÀS\tªÙªå\u0085\u0091§Ñ\u0010; !V\r\u008f½¯\u0089\u008d(L¬}3@\u009bM¸#×4Ý¿\u009dQK¹!Q\nõDú\u0010L@ê\u000f>F<p%\u0096Ø\u008b\u0083ú+®\u0010Cj_s\t:\u001fW\u0097ôýK.\u0000\u00ad\u001f8Æ\fóÿâÏ\u001cåÉ¼A]:yRtá\u008fgäóÈ§4O7\u0002\u009f\u0019Õðr\u008e):Mýe\t\fy/ÝzÁ-O0\u0011\u0014½\u0099Õ\u0081\u0089^ \u001bOhþ`\u008a\u0004¼Ap»\u0096;8ä8°S\u0081ÒõÓ@½BVÏ«=Ã$Ç .\u009dRUWd\u001c\u001a&5ÛÉ]Ò\u008c¥Tè\ro½ok¾ó;eóªØí\u0096\u0010Q\u0019ê`\u001bV¡ýzGô\u000e¹fÃ\u0099 T\b\u000e©ºc\u0011Ä¸¦\u0006\u0006_å/ïvCåf\u0011<\u0013Ltµ>òÖ]ô\u0087".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var50 = var15.substring(var13, var13 + var14);
         byte var54 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var50.getBytes("ISO-8859-1"));
            String var58 = b(var19).intern();
            switch(var54) {
            case 0:
               var18[var16++] = var58;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[46];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[21];
                  int var3 = 0;
                  String var4 = "\u0014ÿ\"Y#F;hÈßîÆ;z\u0019ckCT\u0094ÍúÖ\u008bÿ\u00859ã\u001a`Ê+8=LÜ\u0002WTÁËs\u0013AÆPqxñ¦\u0016\u0081usólñIS&\u0092\u0094¥Ç¨(8;~L\u008d\u009e¢\u0099]Ì0Àïè%0oÀËí¬·\u0010Â\u0098\u0016\u001dr\u001aâW\u0089Ðñ¯\u0002,yO\u0000³\u009aä)¿\u008doLD\u0086\u0096EøW3òõ\u008d7\u0010Ç\u009a£Rj?*'¤\u0017Òf¾¤\u001aÑÞÇ\u0087\fß.g*½\u000b";
                  int var5 = "\u0014ÿ\"Y#F;hÈßîÆ;z\u0019ckCT\u0094ÍúÖ\u008bÿ\u00859ã\u001a`Ê+8=LÜ\u0002WTÁËs\u0013AÆPqxñ¦\u0016\u0081usólñIS&\u0092\u0094¥Ç¨(8;~L\u008d\u009e¢\u0099]Ì0Àïè%0oÀËí¬·\u0010Â\u0098\u0016\u001dr\u001aâW\u0089Ðñ¯\u0002,yO\u0000³\u009aä)¿\u008doLD\u0086\u0096EøW3òõ\u008d7\u0010Ç\u009a£Rj?*'¤\u0017Òf¾¤\u001aÑÞÇ\u0087\fß.g*½\u000b".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var60 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var60, var2).getBytes("ISO-8859-1");
                     long[] var52 = var6;
                     var60 = var3++;
                     long var61 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var62 = -1;

                     while(true) {
                        long var8 = var61;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var64 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var62) {
                        case 0:
                           var52[var60] = var64;
                           if (var2 >= var5) {
                              i = var6;
                              k = new Integer[21];
                              KProperty[] var49 = new KProperty[true.g<invokedynamic>(11663, 6595048535624339702L ^ var20)];
                              var49[0] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kp.class, true.s<invokedynamic>(13954, 2209678402132526399L ^ var20), true.s<invokedynamic>(27302, 7655745817425123628L ^ var20), 0)));
                              var49[1] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kp.class, true.s<invokedynamic>(14941, 4018437343327996359L ^ var20), true.s<invokedynamic>(589, 2459732099658772933L ^ var20), 0)));
                              var49[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kp.class, true.s<invokedynamic>(28552, 3347266593647107085L ^ var20), true.s<invokedynamic>(2113, 2016680354121284561L ^ var20), 0)));
                              var49[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(8441, 8567090471052497771L ^ var20), true.s<invokedynamic>(11935, 2019460412485786912L ^ var20), 0)));
                              var49[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(23424, 2575634315591002135L ^ var20), true.s<invokedynamic>(798, 4926886064009506986L ^ var20), 0)));
                              var49[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(607, 780500129432433088L ^ var20), true.s<invokedynamic>(6781, 6068626721291397603L ^ var20), 0)));
                              var49[true.g<invokedynamic>(8859, 3716282560551837679L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(16994, 4745663719548989943L ^ var20), true.s<invokedynamic>(10615, 5558391655440341711L ^ var20), 0)));
                              var49[true.g<invokedynamic>(20808, 6135009131512441906L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(28504, 5451936185503489257L ^ var20), true.s<invokedynamic>(27225, 2673762146751289814L ^ var20), 0)));
                              var49[true.g<invokedynamic>(16986, 5875788273249140514L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(3791, 195717949325868401L ^ var20), true.s<invokedynamic>(6582, 4556479284718627382L ^ var20), 0)));
                              var49[true.g<invokedynamic>(26544, 2459423716046969557L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(22710, 9171888428139948834L ^ var20), true.s<invokedynamic>(11668, 7533053015366458927L ^ var20), 0)));
                              var49[true.g<invokedynamic>(32441, 3822702198114747338L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(17470, 446625953960179623L ^ var20), true.s<invokedynamic>(6843, 3885639567917639984L ^ var20), 0)));
                              var49[true.g<invokedynamic>(30241, 6566766808198810439L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(24301, 6383620758336843125L ^ var20), true.s<invokedynamic>(26642, 6170766052398242691L ^ var20), 0)));
                              var49[true.g<invokedynamic>(14677, 7440850222748091435L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kp.class, true.s<invokedynamic>(26170, 1764775417056073142L ^ var20), true.s<invokedynamic>(20032, 5713788423031012806L ^ var20), 0)));
                              w = var49;
                              B = new kp(var27);
                              s = qi.o((il)B, true.s<invokedynamic>(10434, 7065506949080996720L ^ var20), true.g<invokedynamic>(14610, 4770768887841670242L ^ var20), new IntRange(1, true.g<invokedynamic>(8947, 458554592293674894L ^ var20)), var22, (pj)null, (Function0)null, true.g<invokedynamic>(11052, 5259954576470529619L ^ var20), (Object)null);
                              O = qi.M((il)B, true.s<invokedynamic>(4667, 33358891493122443L ^ var20), (Enum)ao.NONE, (pj)null, (Function0)null, true.g<invokedynamic>(32202, 7347697410635464895L ^ var20), (Object)null, var34);
                              Q = qi.M((il)B, true.s<invokedynamic>(14466, 1274030837072677663L ^ var20), (Enum)ao.NONE, (pj)null, (Function0)null, true.g<invokedynamic>(32202, 7347697410635464895L ^ var20), (Object)null, var34);
                              il var53 = (il)B;
                              String var57 = 27587.s<invokedynamic>(27587, 7152575096806742082L ^ var20);
                              n_ var65 = new n_(true.g<invokedynamic>(18678, 1279360987944138112L ^ var20), var29, (char)var30, false, (char)var31, false, true.g<invokedynamic>(8818, 8719958435715211008L ^ var20), (DefaultConstructorMarker)null);
                              int var10005 = 32202.g<invokedynamic>(32202, 7347697410635464895L ^ var20);
                              Object var42 = null;
                              int var43 = var10005;
                              Object var44 = null;
                              Object var45 = null;
                              n_ var46 = var65;
                              String var47 = var57;
                              il var48 = var53;
                              C = qi.b(var24, var48, var47, (char)var25, var46, (pj)var45, (Function0)var44, var43, var42, (short)var26);
                              W = qi.R((il)B, true.s<invokedynamic>(312, 7751764224111669947L ^ var20), true, (pj)null, (Function0)null, true.g<invokedynamic>(32202, 7347697410635464895L ^ var20), var40, (Object)null);
                              t = qi.R((il)B, true.s<invokedynamic>(10173, 9219923225148052523L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(32202, 7347697410635464895L ^ var20), var40, (Object)null);
                              M = qi.R((il)B, true.s<invokedynamic>(20801, 6458499470054204122L ^ var20), true, (pj)null, kp::R, 4, var40, (Object)null);
                              v = qi.R((il)B, true.s<invokedynamic>(3306, 1146134539486429027L ^ var20), false, (pj)null, (Function0)null, true.g<invokedynamic>(32202, 7347697410635464895L ^ var20), var40, (Object)null);
                              e = qi.g((il)B, true.s<invokedynamic>(23828, 7920634138341781128L ^ var20), 5.0F, RangesKt.rangeTo(2.0F, 10.0F), (pj)null, kp::H, true.g<invokedynamic>(17422, 7189621015537596778L ^ var20), var36, (Object)null);
                              N = qi.G((il)B, true.s<invokedynamic>(4727, 8195429818077962699L ^ var20), r6.BOOLS, (Function0)null, var32, 4, (Object)null);
                              L = qi.R((il)B, true.s<invokedynamic>(26270, 3577427355799557395L ^ var20), true, B.m(var38, var39), (Function0)null, true.g<invokedynamic>(17422, 7189621015537596778L ^ var20), var40, (Object)null);
                              T = qi.R((il)B, true.s<invokedynamic>(31857, 3875084207353630664L ^ var20), true, B.m(var38, var39), (Function0)null, true.g<invokedynamic>(17422, 7189621015537596778L ^ var20), var40, (Object)null);
                              q = qi.R((il)B, true.s<invokedynamic>(29273, 3052812083217760746L ^ var20), true, B.m(var38, var39), (Function0)null, true.g<invokedynamic>(17422, 7189621015537596778L ^ var20), var40, (Object)null);
                              class_243 var55 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var55, true.s<invokedynamic>(825, 3055378383943921851L ^ var20));
                              A = var55;
                              U = (Queue)(new LinkedList());
                              n = (Queue)(new LinkedList());
                              X = new AtomicBoolean();
                              return;
                           }
                           break;
                        default:
                           var52[var60] = var64;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "É\u0084ý\u0094NSHô³Uòà\u001fËtU";
                           var5 = "É\u0084ý\u0094NSHô³Uòà\u001fËtU".length();
                           var2 = 0;
                        }

                        var60 = var2;
                        var2 += 8;
                        var7 = var4.substring(var60, var2).getBytes("ISO-8859-1");
                        var52 = var6;
                        var60 = var3++;
                        var61 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var62 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var58;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "þBÿp{L²Ds @ÞÔò72g¶ýu´í\u001c~0\u0098[\u00ad\u0010\u0083öçNáÙ¸\u008c~:s\u0018+\u0094è<\u000b\u008d\u00833ÛC\"£¦\u0097xÂóî\u009eUÔD\u009f»";
               var17 = "þBÿp{L²Ds @ÞÔò72g¶ýu´í\u001c~0\u0098[\u00ad\u0010\u0083öçNáÙ¸\u008c~:s\u0018+\u0094è<\u000b\u008d\u00833ÛC\"£¦\u0097xÂóî\u009eUÔD\u009f»".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var50 = var15.substring(var13, var13 + var14);
            var54 = 0;
         }
      }
   }

   public static void l(int var0) {
      Y = var0;
   }

   public static int C() {
      return Y;
   }

   public static int V() {
      int var0 = C();

      try {
         return var0 == 0 ? 56 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13927;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kp", var10);
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
         throw new RuntimeException("su/catlean/kp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14472;
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
            throw new RuntimeException("su/catlean/kp", var14);
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
         throw new RuntimeException("su/catlean/kp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
