package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yd extends k9 {
   @NotNull
   public static final yd n;
   @NotNull
   private static final iv x;
   private static final long b = j0.a(7885428268856983335L, 5178541007809019426L, MethodHandles.lookup().lookupClass()).a(33003608452112L);
   private static final String c;
   private static final long d;

   private yd(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 61866647793265L;
      super(var3, c, pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   public final void H(@NotNull SendPacket e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void e(@NotNull PlayerUpdateEvent e) {
      long var2 = b ^ 128007538784173L;
      long var10001 = var2 ^ 61323061138115L;
      int var4 = (int)((var2 ^ 61323061138115L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 96611829274486L;
      Intrinsics.checkNotNullParameter(var1, "e");
      int[] var10000 = -3120959195427886078L.A<invokedynamic>(-3120959195427886078L, var2);
      int var10 = (int)(s8.f(var7).method_23317() - (double)2);
      int[] var9 = var10000;
      int var11 = (int)(s8.f(var7).method_23317() + (double)2);

      do {
         int var17 = var10;

         label52:
         while(true) {
            if (var17 >= var11) {
               return;
            }

            int var12 = (int)(s8.f(var7).method_23321() - (double)2);
            int var13 = (int)(s8.f(var7).method_23321() + (double)2);

            while(true) {
               var17 = var12;

               label47:
               while(true) {
                  if (var17 >= var13) {
                     break label52;
                  }

                  int var14 = (int)(s8.f(var7).method_23318() - (double)2);
                  var17 = (int)(s8.f(var7).method_23318() + (double)2);
                  if (var9 != null) {
                     continue label52;
                  }

                  int var15 = var17;

                  do {
                     if (var14 >= var15) {
                        break label47;
                     }

                     var17 = Intrinsics.areEqual((Object)s8.i((char)var4, var5, (short)var6).method_8320(class_2338.method_49637((double)var10, (double)var14, (double)var12)).method_26204(), (Object)class_2246.field_10316);
                     if (var9 != null) {
                        continue label47;
                     }

                     try {
                        if (var17 != 0) {
                           x.a();
                        }
                     } catch (NumberFormatException var16) {
                        throw var16.A<invokedynamic>(var16, -3109704709355345688L, var2);
                     }

                     ++var14;
                  } while(var9 == null);

                  (new int[1]).A<invokedynamic>(new int[1], -3147825423595726869L, var2);
                  break;
               }

               ++var12;
               if (var9 != null) {
                  break label52;
               }
            }
         }

         ++var10;
      } while(var9 == null);

   }

   static {
      long var15 = b ^ 109812398504727L;
      long var17 = var15 ^ 14587497713178L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var15 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var15 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("¼0ØZ\u009eÏÖê\u001d#¦-?DS¤".getBytes("ISO-8859-1"));
      String var19 = b(var14).intern();
      boolean var10001 = true;
      c = var19;
      Cipher var7;
      var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var15 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var15 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var9 = 674900419773919876L;
      byte[] var11 = var7.doFinal(new byte[]{(byte)((int)(var9 >>> 56)), (byte)((int)(var9 >>> 48)), (byte)((int)(var9 >>> 40)), (byte)((int)(var9 >>> 32)), (byte)((int)(var9 >>> 24)), (byte)((int)(var9 >>> 16)), (byte)((int)(var9 >>> 8)), (byte)((int)var9)});
      long var20 = ((long)var11[0] & 255L) << 56 | ((long)var11[1] & 255L) << 48 | ((long)var11[2] & 255L) << 40 | ((long)var11[3] & 255L) << 32 | ((long)var11[4] & 255L) << 24 | ((long)var11[5] & 255L) << 16 | ((long)var11[6] & 255L) << 8 | (long)var11[7] & 255L;
      var10001 = true;
      long var5 = var20;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var15 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var15 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 8223909747987691528L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      var20 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      var10001 = true;
      d = var20;
      n = new yd(var17);
      x = new iv();
      x.H((int)var5);
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
}
