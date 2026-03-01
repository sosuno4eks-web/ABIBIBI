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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_241;
import net.minecraft.class_744;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.ClientInputAccessor;

public final class k1 extends k9 {
   @NotNull
   public static final k1 X;
   private static boolean s;
   private static final long b = j0.a(-1903763184234745767L, 2505711662499762691L, MethodHandles.lookup().lookupClass()).a(248975576726249L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private k1(int var1, char var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 45263253352158L;
      super(var6, true.n<invokedynamic>(28240, 219456255602125977L ^ var4), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   private final void k(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = 10
   )
   private final void Q(KeyboardInputEvent var1) {
      long var2 = b ^ 133262872359730L;
      long var4 = var2 ^ 31582205705441L;
      long var10001 = var2 ^ 116289315608252L;
      int var6 = (int)((var2 ^ 116289315608252L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      int[] var9 = -22608504358411075L.A<invokedynamic>(-22608504358411075L, var2);

      boolean var10000;
      label22: {
         try {
            var10000 = s;
            if (var9 != null) {
               break label22;
            }

            if (!var10000) {
               return;
            }
         } catch (NumberFormatException var15) {
            throw var15.A<invokedynamic>(var15, -61152421297099129L, var2);
         }

         var10000 = false;
      }

      s = var10000;
      float var10 = s8.f(var4).field_3913.method_3128().field_1342;
      float var11 = s8.f(var4).field_3913.method_3128().field_1343;
      float var12 = (s8.f(var4).method_36454() - i4.v.W((char)var6, var7, var8)) * 0.017453292F;
      float var13 = (float)Math.cos((double)var12);
      float var14 = (float)Math.sin((double)var12);
      class_744 var16 = s8.f(var4).field_3913;
      Intrinsics.checkNotNull(var16, true.n<invokedynamic>(9878, 869862016477097751L ^ var2));
      ((ClientInputAccessor)var16).setMoveVector(new class_241((float)MathKt.roundToInt(var11 * var13 - var10 * var14), (float)MathKt.roundToInt(var10 * var13 + var11 * var14)));
   }

   static {
      long var9 = b ^ 57723603626114L;
      long var10001 = var9 ^ 83059681500448L;
      int var11 = (int)((var9 ^ 83059681500448L) >>> 32);
      int var12 = (int)(var10001 << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      e = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "DÞxª]«\u0010ö\u0097wsQî¸a,=ów\u0086ò\u0010Á xåÆ5\u000bO\u008b]u¾ö££¸\u0011\f+ðõöIôî\u001aÄÂ\u0003\"`\u0095£øº¨$áYæ&+i\u009f\u008eøªÐ)\fÚ\u009f5îþ¬øL\u008d\u009d\u0017\fZÃ}\u0005â\u001c±r\u009eì\u0085È\u0098£\u0018ÓsÕï\u0095Àµñ\u0089p9®\\¹\u007f6¤Î\f6\b§E\u0014ÇíÕðXÝ\rKFÀ²Ðzêã}\u0013Ì\u0017]¿e";
      int var6 = "DÞxª]«\u0010ö\u0097wsQî¸a,=ów\u0086ò\u0010Á xåÆ5\u000bO\u008b]u¾ö££¸\u0011\f+ðõöIôî\u001aÄÂ\u0003\"`\u0095£øº¨$áYæ&+i\u009f\u008eøªÐ)\fÚ\u009f5îþ¬øL\u008d\u009d\u0017\fZÃ}\u0005â\u001c±r\u009eì\u0085È\u0098£\u0018ÓsÕï\u0095Àµñ\u0089p9®\\¹\u007f6¤Î\f6\b§E\u0014ÇíÕðXÝ\rKFÀ²Ðzêã}\u0013Ì\u0017]¿e".length();
      char var3 = 24;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var16 = b(var8).intern();
         boolean var14 = true;
         var7[var5++] = var16;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[2];
            X = new k1(var11, (char)var12, (char)var13);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14187;
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
            throw new RuntimeException("su/catlean/k1", var10);
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
         throw new RuntimeException("su/catlean/k1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
