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

public final class vg implements h5 {
   @NotNull
   public static final vg a;
   @NotNull
   private static final iv p;
   @NotNull
   private static final iv w;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private vg() {
   }

   @NotNull
   public final iv J() {
      return p;
   }

   public void m(char a, @NotNull PreSyncEvent e, long a) {
      // $FF: Couldn't be decompiled
   }

   public void i(long a, @NotNull PreElytraEvent e) {
      Intrinsics.checkNotNullParameter(var3, "e");
   }

   public void p(@NotNull AfterElytraEvent e, long a) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   public void T(@NotNull MoveEvent e, long a) {
      // $FF: Couldn't be decompiled
   }

   public void y(long a, @NotNull AfterSendPacket event) {
      Intrinsics.checkNotNullParameter(var3, true.y<invokedynamic>(14225, 3129067625343177924L ^ var1));
   }

   public void D(long a, @NotNull ReceivePacket e) {
      Intrinsics.checkNotNullParameter(var3, "e");
   }

   public void n(int a, @NotNull PlayerUpdateEvent e, char a, int a) {
      // $FF: Couldn't be decompiled
   }

   public void l(long var1) {
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
      // $FF: Couldn't be decompiled
   }

   static {
      long var10000 = j0.a(6600730889063710465L, 1087773660313870864L, MethodHandles.lookup().lookupClass()).a(169832359113824L);
      d = new HashMap(13);
      long var11 = var10000 ^ 132453980695589L;
      Cipher var13;
      Cipher var22 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "wv(¾\u0096\u009ekÛ\rµ\u0090í»wXR¨¿©Õä\u001cUÉµ\u0010¤Öo\"J¥\f®¯÷\u00901ÜK\u0010²l~\u0007Í¾mí©\u0081\u0003¨\u0087¯ÞÚ(@\u0098<Ü\u0082~±AÍþ\u0085sµÜÒ©ï\u0002}\u0082Þ\u0018\u000b@\u0005\bäNO_:¡j\u0099ã\fóÌ0\u001e";
      int var19 = "wv(¾\u0096\u009ekÛ\rµ\u0090í»wXR¨¿©Õä\u001cUÉµ\u0010¤Öo\"J¥\f®¯÷\u00901ÜK\u0010²l~\u0007Í¾mí©\u0081\u0003¨\u0087¯ÞÚ(@\u0098<Ü\u0082~±AÍþ\u0085sµÜÒ©ï\u0002}\u0082Þ\u0018\u000b@\u0005\bäNO_:¡j\u0099ã\fóÌ0\u001e".length();
      char var16 = '(';
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var26 = a(var21).intern();
         boolean var10001 = true;
         var20[var18++] = var26;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[3];
            g = new HashMap(13);
            Cipher var0;
            var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[5];
            int var3 = 0;
            String var4 = "[>PC¦X1?ÀÎ}FIÚ\u001e\u0002\\\u0087\u001f+\u009a¦îã";
            int var5 = "[>PC¦X1?ÀÎ}FIÚ\u001e\u0002\\\u0087\u001f+\u009a¦îã".length();
            int var2 = 0;

            label32:
            while(true) {
               int var25 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
               long[] var23 = var6;
               var25 = var3++;
               long var28 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var29 = -1;

               while(true) {
                  long var8 = var28;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var32 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch(var29) {
                  case 0:
                     var23[var25] = var32;
                     if (var2 >= var5) {
                        e = var6;
                        f = new Integer[5];
                        a = new vg();
                        p = new iv();
                        w = new iv();
                        return;
                     }
                     break;
                  default:
                     var23[var25] = var32;
                     if (var2 < var5) {
                        continue label32;
                     }

                     var4 = "2É\t\u0081V\blg\n© ø\t\u0019}-";
                     var5 = "2É\t\u0081V\blg\n© ø\t\u0019}-".length();
                     var2 = 0;
                  }

                  var25 = var2;
                  var2 += 8;
                  var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                  var23 = var6;
                  var25 = var3++;
                  var28 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var29 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4241;
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
            throw new RuntimeException("su/catlean/vg", var10);
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
         throw new RuntimeException("su/catlean/vg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30635;
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
            throw new RuntimeException("su/catlean/vg", var14);
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
         throw new RuntimeException("su/catlean/vg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
