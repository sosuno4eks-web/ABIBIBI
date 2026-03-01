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
import org.jetbrains.annotations.Nullable;

public final class g0 {
   @NotNull
   private final String e;
   private static final long a = j0.a(895285224571188767L, 6892870794727813095L, MethodHandles.lookup().lookupClass()).a(163356411182128L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public g0(long a, @NotNull String text) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(3854, 1484610202237604940L ^ var1));
      super();
      this.e = var3;
   }

   @NotNull
   public final String O() {
      return this.e;
   }

   @NotNull
   public final String j() {
      return this.e;
   }

   @NotNull
   public final g0 N(long a, @NotNull String text) {
      var1 ^= a;
      long var4 = var1 ^ 31320088489441L;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(10800, 7719460997070231307L ^ var1));
      return new g0(var4, var3);
   }

   // $FF: synthetic method
   public static g0 l(g0 var0, long var1, String var3, int var4, Object var5) {
      var1 ^= a;
      long var6 = var1 ^ 100185329201801L;
      if ((var4 & 1) != 0) {
         var3 = var0.e;
      }

      return var0.N(var6, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 40718920337270L;
      String var10000 = this.e;
      String var10002 = true.l<invokedynamic>(23749, 1172147113228766441L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.e.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 118605723715817L;
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
      String var6 = "\u008cåÙw\u0013\f Î\u0083Nçm²U\u0014m0T£OÅün\\]\u0011góùj?\u001f\u000e°\u009e½.Ç\rD\r\u001eç{M}Ì\u0085\u000b:Î\u0083\fIé\u0099J\u0007Î«ÙºÃL\u0094\u0010\u008cA;x,TÒ\u0081ç¹åå{\u008dS\u007f";
      int var8 = "\u008cåÙw\u0013\f Î\u0083Nçm²U\u0014m0T£OÅün\\]\u0011góùj?\u001f\u000e°\u009e½.Ç\rD\r\u001eç{M}Ì\u0085\u000b:Î\u0083\fIé\u0099J\u0007Î«ÙºÃL\u0094\u0010\u008cA;x,TÒ\u0081ç¹åå{\u008dS\u007f".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7361;
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
            throw new RuntimeException("su/catlean/g0", var10);
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
         throw new RuntimeException("su/catlean/g0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
