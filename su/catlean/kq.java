package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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
import org.jetbrains.annotations.Nullable;

public final class kq {
   @NotNull
   private final List L;
   private static String u;
   private static final long a = j0.a(1927650165544605475L, 5542969336102391968L, MethodHandles.lookup().lookupClass()).a(132229697708599L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   public kq(short a, int a, @NotNull List blocks, char a) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(30772, 55463251711457305L ^ var5));
      super();
      this.L = var3;
   }

   // $FF: synthetic method
   public kq(List var1, byte var2, int var3, int var4, DefaultConstructorMarker var5, int var6) {
      long var7 = ((long)var2 << 56 | (long)var4 << 32 >>> 8 | (long)var6 << 40 >>> 40) ^ a;
      long var10001 = var7 ^ 92731868615998L;
      int var9 = (int)((var7 ^ 92731868615998L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      if ((var3 & 1) != 0) {
         var1 = (List)(new ArrayList());
      }

      this((short)var9, var10, var1, (char)var11);
   }

   @NotNull
   public final List G() {
      return this.L;
   }

   @NotNull
   public final List Z() {
      return this.L;
   }

   @NotNull
   public final kq V(long a, @NotNull List blocks) {
      var1 ^= a;
      long var10001 = var1 ^ 47213581621645L;
      int var4 = (int)((var1 ^ 47213581621645L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(25534, 3574949049031860896L ^ var1));
      return new kq((short)var4, var5, var3, (char)var6);
   }

   // $FF: synthetic method
   public static kq y(kq var0, List var1, int var2, long var3, Object var5) {
      var3 ^= a;
      long var6 = var3 ^ 124047197805037L;
      if ((var2 & 1) != 0) {
         var1 = var0.L;
      }

      return var0.V(var6, var1);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 18367075004768L;
      List var10000 = this.L;
      String var10002 = true.t<invokedynamic>(11641, 7130305879146489309L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.L.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public kq(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 31530527891089L;
      int var3 = (int)((var1 ^ 31530527891089L) >>> 56);
      int var4 = (int)(var10001 << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      this((List)null, (byte)var3, 1, var4, (DefaultConstructorMarker)null, var5);
   }

   public static void w(String var0) {
      u = var0;
   }

   public static String J() {
      return u;
   }

   static {
      long var9 = a ^ 131118990824101L;
      d = new HashMap(13);
      "J05z9".A<invokedynamic>("J05z9", 824884966729019524L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0014_æ\u0015\u001d°\u0091y\u000eÚ0ÙÚ\u0015À.\u0010mS\u0004@ãMÝ\u0000\u0002*pu®:\u0015¿(?\u0012¡bu\u000eÆ\u008dæè\u0081[wDUA\u0089\u009b»¶Û¿dB\u0016\b¨Û3\u009aÜ@; BîÑ¾¯é";
      int var6 = "\u0014_æ\u0015\u001d°\u0091y\u000eÚ0ÙÚ\u0015À.\u0010mS\u0004@ãMÝ\u0000\u0002*pu®:\u0015¿(?\u0012¡bu\u000eÆ\u008dæè\u0081[wDUA\u0089\u009b»¶Û¿dB\u0016\b¨Û3\u009aÜ@; BîÑ¾¯é".length();
      char var3 = 16;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var12;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24953;
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
            throw new RuntimeException("su/catlean/kq", var10);
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
         throw new RuntimeException("su/catlean/kq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
