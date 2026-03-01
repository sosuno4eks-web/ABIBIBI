package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import net.minecraft.class_1268;
import net.minecraft.class_2596;
import net.minecraft.class_2879;

public final class ie extends Thread {
   private int y;
   private int w;
   private int E;
   private boolean h;
   private static String[] R;
   private static final long a = j0.a(4604941533213051698L, 5188079150241443884L, MethodHandles.lookup().lookupClass()).a(77388447705755L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   public ie(long a, int epSlot, int originalSlot, int delay, boolean inv) {
      var1 ^= a;
      super();
      -8317626047914249252L.A<invokedynamic>(-8317626047914249252L, var1);
      this.y = var3;
      this.w = var4;
      this.E = var5;
      this.h = var6;

      try {
         if (-8302792897110111828L.A<invokedynamic>(-8302792897110111828L, var1) == null) {
            (new String[1]).A<invokedynamic>(new String[1], -8334752388267736181L, var1);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -8326866308976952844L, var1);
      }
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   private static final Unit b() {
      long var0 = a ^ 64565709775755L;
      long var2 = var0 ^ 30577620719905L;
      long var10001 = var0 ^ 110375406461969L;
      int var4 = (int)((var0 ^ 110375406461969L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      ff.f(class_1268.field_5808, 0.0F, 0.0F, (char)var4, true.b<invokedynamic>(29866, 3209749036377518244L ^ var0), var5, (Object)null);
      h4.G((class_2596)(new class_2879(class_1268.field_5808)), var2);
      return Unit.INSTANCE;
   }

   public static void v(String[] var0) {
      R = var0;
   }

   public static String[] k() {
      return R;
   }

   static {
      long var11 = a ^ 84903358479572L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 2643158149559233392L, var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u0013Ä4Ê\u0016¼,ÎWt{\u0017ÞLg»<q\u0097æ\u0011\u008aÙÊ";
      int var5 = "\u0013Ä4Ê\u0016¼,ÎWt{\u0017ÞLg»<q\u0097æ\u0011\u008aÙÊ".length();
      int var2 = 0;

      label23:
      while(true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var13 = var6;
         var10001 = var3++;
         long var14 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var16 = -1;

         while(true) {
            long var8 = var14;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var18 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch(var16) {
            case 0:
               var13[var10001] = var18;
               if (var2 >= var5) {
                  b = var6;
                  c = new Integer[5];
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var2 < var5) {
                  continue label23;
               }

               var4 = "\u0019\u00adÀYN/q\u0003}\u0087ý\u009b\u009e.¥Ö";
               var5 = "\u0019\u00adÀYN/q\u0003}\u0087ý\u009b\u009e.¥Ö".length();
               var2 = 0;
            }

            var10001 = var2;
            var2 += 8;
            var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
            var13 = var6;
            var10001 = var3++;
            var14 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var16 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32440;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ie", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ie" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
