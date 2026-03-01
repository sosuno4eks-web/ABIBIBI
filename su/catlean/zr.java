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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zr extends zf {
   private static k9[] D;
   private static final long b = j0.a(-5334982883325094327L, 5165704642067510880L, MethodHandles.lookup().lookupClass()).a(118097865946120L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i;
   private static final long j;

   public zr(@NotNull String id, long a, @NotNull Enum defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var2 ^= b;
      long var7 = var2 ^ 95866036927843L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(26501, 1383437595706976586L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.k<invokedynamic>(1947, 1529171020092049749L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.k<invokedynamic>(13850, 8051381782822205654L ^ var2));
      super(var1, var4, (Object)null, var7, var5, var6, 4, (DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public zr(String var1, Enum var2, pj var3, Function0 var4, long var5, int var7, DefaultConstructorMarker var8) {
      var5 ^= b;
      long var9 = var5 ^ 118761703017591L;
      if ((var7 & 4) != 0) {
         var3 = null;
      }

      if ((var7 & (int)j) != 0) {
         var4 = zr::i;
      }

      this(var1, var9, var2, var3, var4);
   }

   public void n(long a, @NotNull String setting) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      return ((Enum)this.B()).name();
   }

   private static final boolean i() {
      return true;
   }

   public static void p(k9[] var0) {
      D = var0;
   }

   public static k9[] o() {
      return D;
   }

   static {
      long var14 = b ^ 86865528334800L;
      k9[] var10000 = new k9[1];
      i = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -886444337593850358L, var14);
      Cipher var5;
      Cipher var16 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[5];
      int var10 = 0;
      String var9 = "øÙ\u0093\u008b\u00974H\u000ecMíì/CL©\u0010AðQ\u000e\u0095\u0000÷\u0091`\u008að\u0006^A¸E\u0010H.CäýÙª¤áJ\r\u0080üZ\u0015Ì";
      int var11 = "øÙ\u0093\u008b\u00974H\u000ecMíì/CL©\u0010AðQ\u000e\u0095\u0000÷\u0091`\u008að\u0006^A¸E\u0010H.CäýÙª¤áJ\r\u0080üZ\u0015Ì".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var17 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var17.getBytes("ISO-8859-1"));
            String var22 = b(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var22;
               if ((var7 += var8) >= var11) {
                  d = var12;
                  h = new String[5];
                  Cipher var0;
                  var16 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -5181095328799762456L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var24 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var20 = true;
                  j = var24;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var22;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "Q%®*\u0017~\u0019nyÓ\u0004¯\u0014Bï~±ö\u0014i½^¬\u0007²ªN\u009a\u0085J\rÁ(8\u0003Ü¦\u000e¯\n\u0098ÂÈïù³u\u008cãGX¢Í\u0010 Wµñ\u0091ý,\u0096Y@úÜuy±bÅU\u001d";
               var11 = "Q%®*\u0017~\u0019nyÓ\u0004¯\u0014Bï~±ö\u0014i½^¬\u0007²ªN\u009a\u0085J\rÁ(8\u0003Ü¦\u000e¯\n\u0098ÂÈïù³u\u008cãGX¢Í\u0010 Wµñ\u0091ý,\u0096Y@úÜuy±bÅU\u001d".length();
               var8 = ' ';
               var7 = -1;
            }

            ++var7;
            var17 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24812;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/zr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
