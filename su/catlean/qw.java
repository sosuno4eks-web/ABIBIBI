package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qw implements class_11281 {
   @NotNull
   private final class_241 J;
   private static final long a = j0.a(6510623101805465588L, 3290833919744643294L, MethodHandles.lookup().lookupClass()).a(80119048453298L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public qw(@NotNull class_241 halfTexelSize, long a, short a) {
      long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(19751, 8398609941163969659L ^ var5));
      super();
      this.J = var1;
   }

   @NotNull
   public final class_241 S() {
      return this.J;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 113121360964157L;
      long var4 = var2 ^ 93754608945964L;
      long var6 = var2 ^ 133661042186317L;
      long var8 = var2 ^ 60459387942877L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(14460, 2803726138012569262L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.J.field_1343, this.J.field_1342).putFloat(Math.abs(gk.E.i((float)(s8.f(var6).field_6012 - 1) / 48.0F, (float)s8.f(var6).field_6012 / 48.0F, gk.E.h(var8)))).putInt(la.A.L(var4).ordinal());
   }

   @NotNull
   public final class_241 m() {
      return this.J;
   }

   @NotNull
   public final qw E(@NotNull class_241 halfTexelSize, long a) {
      var2 ^= a;
      long var10001 = var2 ^ 36314283629096L;
      long var4 = (var2 ^ 36314283629096L) >>> 16;
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(26952, 5093475074110882373L ^ var2));
      return new qw(var1, var4, (short)var6);
   }

   public static qw V(long var0, qw var2, class_241 var3, int var4, Object var5) {
      var0 ^= a;
      long var6 = var0 ^ 119555155233923L;
      if ((var4 & 1) != 0) {
         var3 = var2.J;
      }

      return var2.E(var3, var6);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 25740763415457L;
      class_241 var10000 = this.J;
      String var10002 = true.t<invokedynamic>(19733, 221289195176514136L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.J.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 103770660092722L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "£òWqº ¼\u0003|k\u001cÇ\u0090ãÃ6û\u008aû\u008a\u008c\u00ady0\ró?\u0096\u009bvÅ{8ü}¶v©êb\u008fZS¡\u0094K*´èhQ\u001c}\u0086k\u008e\u009f¯=e¹Ç\u000bC\u0086\u001aÃ$s:\u0097Ô\u009cÚ'Ó©,\u0005MASü\u009e\u008c\u0089ÔW®";
      int var8 = "£òWqº ¼\u0003|k\u001cÇ\u0090ãÃ6û\u008aû\u008a\u008c\u00ady0\ró?\u0096\u009bvÅ{8ü}¶v©êb\u008fZS¡\u0094K*´èhQ\u001c}\u0086k\u008e\u009f¯=e¹Ç\u000bC\u0086\u001aÃ$s:\u0097Ô\u009cÚ'Ó©,\u0005MASü\u009e\u008c\u0089ÔW®".length();
      char var5 = ' ';
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[4];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "mòRÅ¤5%Ð,ÕL\fd6:2 \u0096¼(\u00848\u0013\u009e\u00876P¥ê¤`nÚ\u001fM\u0005\b\u00067bi\u008cs?©\u0085ºÑJ";
               var8 = "mòRÅ¤5%Ð,ÕL\fd6:2 \u0096¼(\u00848\u0013\u009e\u00876P¥ê¤`nÚ\u001fM\u0005\b\u00067bi\u008cs?©\u0085ºÑJ".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11415;
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
            throw new RuntimeException("su/catlean/qw", var10);
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
         throw new RuntimeException("su/catlean/qw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
