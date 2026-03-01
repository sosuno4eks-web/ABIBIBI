package su.catlean;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import kotlin.Metadata;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.commons.lang3.SystemUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExcludeCommon
@Metadata(
   mv = {2, 2, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"},
   d2 = {"Lsu/catlean/PreLaunch;", "Lnet/fabricmc/loader/api/entrypoint/PreLaunchEntrypoint;", "PreLaunch", "()V", "", "H", "onPreLaunch", "Ljavax/swing/JFrame;", "s", "Ljavax/swing/JFrame;", "catlean"}
)
public final class PreLaunch implements PreLaunchEntrypoint {
   @NotNull
   public static final PreLaunch INSTANCE;
   @Nullable
   private static JFrame s;
   private static final long a = j0.a(1651361048916452963L, 1437113692946711671L, MethodHandles.lookup().lookupClass()).a(1985726356079L);
   private static final String b;
   private static final long c;

   private PreLaunch() {
   }

   public final void H() {
      try {
         JFrame var10000 = s;
         if (var10000 != null) {
            var10000.setVisible(false);
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

   }

   public void onPreLaunch() {
      try {
         if (!SystemUtils.IS_OS_WINDOWS) {
            return;
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

      SwingUtilities.invokeLater(PreLaunch::V);
   }

   private static final void A(ActionEvent param0) {
      // $FF: Couldn't be decompiled
   }

   private static final void V() {
      long var0 = a ^ 81960422834760L;
      PreLaunch var10000 = INSTANCE;
      JFrame var2 = new JFrame(b);
      boolean var4 = false;
      var2.setDefaultCloseOperation(2);
      var2.getContentPane().add((Component)LoadingPanel.INSTANCE);
      var2.pack();
      var2.setVisible(true);
      var2.setResizable(false);
      var2.setLayout((LayoutManager)(new GridLayout()));
      var2.setLocationRelativeTo((Component)null);
      s = var2;
      Timer var5 = new Timer((int)c, PreLaunch::A);
      var4 = false;
      var5.setRepeats(true);
      var5.start();
   }

   static {
      long var5 = a ^ 138681566158070L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("\u0092³ a¼½ô.".getBytes("ISO-8859-1"));
      String var10 = a(var9).intern();
      boolean var10001 = true;
      b = var10;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -2308901106572952648L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      long var11 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      var10001 = true;
      c = var11;
      INSTANCE = new PreLaunch();
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
}
