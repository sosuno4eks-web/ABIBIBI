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
import net.minecraft.class_1297;
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

public final class p3 implements h5 {
   @NotNull
   public static final p3 m;
   private static k9[] O;
   private static final long a = j0.a(7112927831214341952L, 7901232619855633715L, MethodHandles.lookup().lookupClass()).a(62738936191608L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private p3() {
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
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(20587, 4238356247429450862L ^ var1));
   }

   public void D(long a, @NotNull ReceivePacket e) {
      // $FF: Couldn't be decompiled
   }

   public void n(int a, @NotNull PlayerUpdateEvent e, char a, int a) {
      Intrinsics.checkNotNullParameter(var2, "e");
   }

   public void l(long var1) {
   }

   public void y(long var1) {
      long var3 = var1 ^ 105108100548319L;
      s8.f(var3).method_31549().field_7479 = false;
      s8.f(var3).method_31549().method_7248(0.05F);
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

   public final boolean T(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 14432320086079L;
      int var3 = (int)((var1 ^ 14432320086079L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 120102784247178L;
      return s8.i((char)var3, var4, (short)var5).method_20812((class_1297)s8.f(var6), s8.f(var6).method_5829().method_1009(-0.25D, 0.0D, -0.25D).method_989(0.0D, -0.3D, 0.0D)).iterator().hasNext();
   }

   static {
      long var20 = a ^ 42521469898142L;
      k9[] var10000 = new k9[2];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -6343014602361005975L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[2];
      int var16 = 0;
      String var15 = "\u0089êheëP\u0002je%\tY¯õE  !b}\u0092Ýl«âøl5\u0012\u0006ª÷¯\u0018ÉAØi<8(ÒMß´¡B&OHæ£\u0096\"V\u0019 :Ü:\u000b±\u009f\tJÏ5É©\u001a ´XÓ\u0010\u009c\u0083ñ&ÒÝ\b»xfÕ` \u008a\u008f×Êðk$ýehÌ\u0014\u0087B\u0081ÍÛ\u0093l»\u0011D\u001fóë¯$z1\u0005«\u0093\u0087ã\"V\u00975C\u0081\u00077ê£\u0004KÌ\nù\u0012\u0080nñ%\u0006+l!R\u0010úaÏÚ4Ç\u009b\u0010_\u0092*r\u00969Æ9ÈÙ¾ì×!Üµk\u009cÂÕÁ";
      int var17 = "\u0089êheëP\u0002je%\tY¯õE  !b}\u0092Ýl«âøl5\u0012\u0006ª÷¯\u0018ÉAØi<8(ÒMß´¡B&OHæ£\u0096\"V\u0019 :Ü:\u000b±\u009f\tJÏ5É©\u001a ´XÓ\u0010\u009c\u0083ñ&ÒÝ\b»xfÕ` \u008a\u008f×Êðk$ýehÌ\u0014\u0087B\u0081ÍÛ\u0093l»\u0011D\u001fóë¯$z1\u0005«\u0093\u0087ã\"V\u00975C\u0081\u00077ê£\u0004KÌ\nù\u0012\u0080nñ%\u0006+l!R\u0010úaÏÚ4Ç\u009b\u0010_\u0092*r\u00969Æ9ÈÙ¾ì×!Üµk\u009cÂÕÁ".length();
      char var14 = 16;
      int var13 = -1;

      while(true) {
         ++var13;
         byte[] var19 = var11.doFinal(var15.substring(var13, var13 + var14).getBytes("ISO-8859-1"));
         String var25 = a(var19).intern();
         boolean var10001 = true;
         var18[var16++] = var25;
         if ((var13 += var14) >= var17) {
            b = var18;
            c = new String[2];
            g = new HashMap(13);
            Cipher var0;
            var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "\u001f/Û\r\u009e(v\u00ad@â_- P{Æ";
            int var5 = "\u001f/Û\r\u009e(v\u00ad@â_- P{Æ".length();
            int var2 = 0;

            do {
               int var24 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
               var24 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
               long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
               boolean var27 = true;
               var6[var24] = var10004;
            } while(var2 < var5);

            e = var6;
            f = new Integer[2];
            m = new p3();
            return;
         }

         var14 = var15.charAt(var13);
      }
   }

   public static void u(k9[] var0) {
      O = var0;
   }

   public static k9[] X() {
      return O;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12224;
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
            throw new RuntimeException("su/catlean/p3", var10);
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
         throw new RuntimeException("su/catlean/p3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12709;
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
            throw new RuntimeException("su/catlean/p3", var14);
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
         throw new RuntimeException("su/catlean/p3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
