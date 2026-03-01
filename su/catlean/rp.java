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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public final class rp implements h5 {
   @NotNull
   public static final rp Z;
   private static boolean T;
   private static float G;
   private static float l;
   private static final long a = j0.a(5316816305597417823L, 2147716963462212942L, MethodHandles.lookup().lookupClass()).a(41400416440874L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private rp() {
   }

   public final boolean Z() {
      return T;
   }

   public final void m(boolean <set-?>) {
      T = var1;
   }

   public final float m() {
      return G;
   }

   public final void x(float <set-?>) {
      G = var1;
   }

   public final float b() {
      return l;
   }

   public final void e(float <set-?>) {
      l = var1;
   }

   public void m(char a, @NotNull PreSyncEvent e, long a) {
      // $FF: Couldn't be decompiled
   }

   public void i(long a, @NotNull PreElytraEvent e) {
      long var4 = var1 ^ 78401589811191L;
      Intrinsics.checkNotNullParameter(var3, "e");
      o4.k.A(s8.f(var4).method_36455());
      s8.f(var4).method_36457(l);
   }

   public void p(@NotNull AfterElytraEvent e, long a) {
      long var4 = var2 ^ 107026128700072L;
      Intrinsics.checkNotNullParameter(var1, "e");
      s8.f(var4).method_36457(o4.k.Na());
   }

   public void T(@NotNull MoveEvent e, long a) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   public void y(long a, @NotNull AfterSendPacket event) {
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(15490, 6047583827071037941L ^ var1));
   }

   public void D(long a, @NotNull ReceivePacket e) {
      Intrinsics.checkNotNullParameter(var3, "e");
   }

   public void n(int a, @NotNull PlayerUpdateEvent e, char a, int a) {
      long var5 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 81467701532875L;
      Intrinsics.checkNotNullParameter(var2, "e");
      l = this.X(var7);
   }

   public void l(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void y(long var1) {
   }

   public void B(long a, @NotNull FireWorkVelocityEvent e) {
      Intrinsics.checkNotNullParameter(var3, "e");
   }

   public void o(@NotNull SetPoseEvent e) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   public void n(@NotNull ReceivePacket e, long a) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   private final float X(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 131512033513752L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "X\u0084ö\u0092¹Î\u0080\u009cÎÔ¢*éôù@\u0010¦\u0095+Æï çô\u0015\u007f\u0085¸Â£¾©(ýû\u0094Ëzð°Êâ¦×\u001c Ö)\u000b7©\u0013¿¡éÁdÒ0\u0098M\u0002Ä(w%¸ArxìëQ";
      int var19 = "X\u0084ö\u0092¹Î\u0080\u009cÎÔ¢*éôù@\u0010¦\u0095+Æï çô\u0015\u007f\u0085¸Â£¾©(ýû\u0094Ëzð°Êâ¦×\u001c Ö)\u000b7©\u0013¿¡éÁdÒ0\u0098M\u0002Ä(w%¸ArxìëQ".length();
      char var16 = 16;
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[5];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "ì\u0005Wz\u001bY£ýî\u0092°\u009a\u0085øKá\u009abJ¸ºóùâ";
                  int var5 = "ì\u0005Wz\u001bY£ýî\u0092°\u009a\u0085øKá\u009abJ¸ºóùâ".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[3];
                  Z = new rp();
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "j3¯ÿ¿\u0094#â²9i\u009f\u0085àÔ&d\u0007b[Ý\u001dñ\u001f¦¾Ø®\u000e\u0004vê8K¤?\u008cÆ\u0012Ë I9$\u0098ò\u0015\u0004ît_¥Û§\u008c»\r7¹íN\u0004_ÆÂ\u001crý\\Ò÷#á";
               var19 = "j3¯ÿ¿\u0094#â²9i\u009f\u0085àÔ&d\u0007b[Ý\u001dñ\u001f¦¾Ø®\u000e\u0004vê8K¤?\u008cÆ\u0012Ë I9$\u0098ò\u0015\u0004ît_¥Û§\u008c»\r7¹íN\u0004_ÆÂ\u001crý\\Ò÷#á".length();
               var16 = '(';
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16050;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/rp", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/rp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15682;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/rp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/rp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
