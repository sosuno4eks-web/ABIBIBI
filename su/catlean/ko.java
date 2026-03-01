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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ko {
   @NotNull
   private String N;
   private float R;
   private float Q;
   @NotNull
   private final hh y;
   private static final long a = j0.a(8627731323780007304L, 6401939884418878897L, MethodHandles.lookup().lookupClass()).a(71633726623567L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ko(long a, @NotNull String name, float x, float y, @NotNull hh type) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(21983, 6370383043490500580L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(22010, 6190492818538942402L ^ var1));
      super();
      this.N = var3;
      this.R = var4;
      this.Q = var5;
      this.y = var6;
   }

   // $FF: synthetic method
   public ko(String var1, float var2, float var3, hh var4, int var5, long var6, DefaultConstructorMarker var8) {
      var6 ^= a;
      long var9 = var6 ^ 112904054006542L;
      if ((var5 & 2) != 0) {
         var2 = 0.0F;
      }

      if ((var5 & 4) != 0) {
         var3 = 0.0F;
      }

      this(var9, var1, var2, var3, var4);
   }

   @NotNull
   public final String z() {
      return this.N;
   }

   public final void A(@NotNull String <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(3783, 7583671755131819263L ^ var2));
      this.N = var1;
   }

   public final float Q() {
      return this.R;
   }

   public final void e(float <set-?>) {
      this.R = var1;
   }

   public final float q() {
      return this.Q;
   }

   public final void U(float <set-?>) {
      this.Q = var1;
   }

   @NotNull
   public final hh S() {
      return this.y;
   }

   static {
      long var0 = a ^ 68960142450316L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "E\u0003éI\u001ek\u00069ÅT\r\u0097*eXË\u0010W\"Ó{N¨Ò\u009c\r\u0095S÷Üx¦>\u0010@jÿ|\u0010È,\u0012³\u0094y§\u001d\u0013ë\u0099";
      int var8 = "E\u0003éI\u001ek\u00069ÅT\r\u0097*eXË\u0010W\"Ó{N¨Ò\u009c\r\u0095S÷Üx¦>\u0010@jÿ|\u0010È,\u0012³\u0094y§\u001d\u0013ë\u0099".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2116;
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
            throw new RuntimeException("su/catlean/ko", var10);
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
         throw new RuntimeException("su/catlean/ko" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
