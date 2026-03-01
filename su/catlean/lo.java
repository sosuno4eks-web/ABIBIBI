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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.gofra.Flow;

public final class lo extends k9 {
   @NotNull
   public static final lo i;
   @NotNull
   private static qq z;
   @NotNull
   private static qq L;
   private static final long b = j0.a(699734860400603749L, 4849255603766270987L, MethodHandles.lookup().lookupClass()).a(252494589526637L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map k;

   private lo(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 113205849238005L;
      super(var6, true.a<invokedynamic>(23195, 7261690217196931482L ^ var4), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @NotNull
   public final qq G() {
      return z;
   }

   public final void Z(@NotNull qq <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(3437, 3885613373426669823L ^ var2));
      z = var1;
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void J(PlayerUpdateEvent var1) {
      long var2 = b ^ 125915998135931L;
      long var4 = var2 ^ 122867285786680L;
      x7.Z.j(var4, z, 0);
   }

   @Flow
   private final void P(JumpEvent var1) {
      var1.setYaw(z.M());
      var1.cancel();
   }

   @Flow
   public final void E(@NotNull EventPlayerTravel e) {
      long var2 = b ^ 92488221774887L;
      long var4 = var2 ^ 108761236310204L;
      long var6 = var2 ^ 32929994165837L;
      boolean var10000 = 857510740340723176L.A<invokedynamic>(857510740340723176L, var2);
      Intrinsics.checkNotNullParameter(var1, "e");
      L = new qq(s8.f(var4).method_36454(), s8.f(var4).method_36455(), var6, false, (bc)null, true.i<invokedynamic>(6462, 8576451812474191976L ^ var2), (DefaultConstructorMarker)null);
      s8.f(var4).method_36456(z.M());
      s8.f(var4).method_36457(z.C());
      boolean var8 = var10000;

      try {
         if (var8) {
            (new int[3]).A<invokedynamic>(new int[3], 836148082561959969L, var2);
         }

      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 856029858081154497L, var2);
      }
   }

   @Flow
   public final void w(@NotNull EventPostPlayerTravel e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void S(UpdateCrosshairTarget param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 82045270901947L;
      long var22 = var20 ^ 3795345628881L;
      long var10001 = var20 ^ 134916823807538L;
      int var24 = (int)((var20 ^ 134916823807538L) >>> 48);
      int var25 = (int)(var10001 << 16 >>> 32);
      int var26 = (int)(var10001 << 48 >>> 48);
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[2];
      int var16 = 0;
      String var15 = "ÏÜ÷)\u001f3\u008eçu¾8¨\u007fbÃ6\u0097\u009eüP\u0088L°\"\u0010Ç(i\b\\;õÁw\u009d2$ÌÔë\u009b";
      int var17 = "ÏÜ÷)\u001f3\u008eçu¾8¨\u007fbÃ6\u0097\u009eüP\u0088L°\"\u0010Ç(i\b\\;õÁw\u009d2$ÌÔë\u009b".length();
      char var14 = 24;
      int var13 = -1;

      while(true) {
         ++var13;
         byte[] var19 = var11.doFinal(var15.substring(var13, var13 + var14).getBytes("ISO-8859-1"));
         String var30 = b(var19).intern();
         boolean var27 = true;
         var18[var16++] = var30;
         if ((var13 += var14) >= var17) {
            c = var18;
            d = new String[2];
            k = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "°»\u0018:.\u0088Õ)òô\u001a+h|\u0086¼";
            int var5 = "°»\u0018:.\u0088Õ)òô\u001a+h|\u0086¼".length();
            int var2 = 0;

            do {
               int var29 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
               var29 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
               long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
               boolean var32 = true;
               var6[var29] = var10004;
            } while(var2 < var5);

            f = var6;
            g = new Integer[2];
            i = new lo((char)var24, var25, (char)var26);
            z = new qq(0.0F, 0.0F, var22, false, (bc)null, true.i<invokedynamic>(3279, 4121193333050508548L ^ var20), (DefaultConstructorMarker)null);
            L = new qq(0.0F, 0.0F, var22, false, (bc)null, true.i<invokedynamic>(6462, 8576458957951275252L ^ var20), (DefaultConstructorMarker)null);
            return;
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8584;
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
            throw new RuntimeException("su/catlean/lo", var10);
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
         throw new RuntimeException("su/catlean/lo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5089;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/lo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/lo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
