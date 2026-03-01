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

public final class uj {
   @NotNull
   private final List l;
   private static boolean d;
   private static final long a = j0.a(3296528465191950230L, 3179781333389938618L, MethodHandles.lookup().lookupClass()).a(150257147854540L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;

   public uj(int a, short a, short a, @NotNull List items) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(13724, 1230566710624232161L ^ var5));
      super();
      this.l = var4;
   }

   // $FF: synthetic method
   public uj(long var1, List var3, int var4, DefaultConstructorMarker var5) {
      var1 ^= a;
      long var10001 = var1 ^ 31624484461800L;
      int var6 = (int)((var1 ^ 31624484461800L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      if ((var4 & 1) != 0) {
         var3 = (List)(new ArrayList());
      }

      this(var6, (short)var7, (short)var8, var3);
   }

   @NotNull
   public final List m() {
      return this.l;
   }

   @NotNull
   public final List c() {
      return this.l;
   }

   @NotNull
   public final uj O(long a, @NotNull List items) {
      var1 ^= a;
      long var10001 = var1 ^ 71268109193055L;
      int var4 = (int)((var1 ^ 71268109193055L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(10843, 5431771015106749489L ^ var1));
      return new uj(var4, (short)var5, (short)var6, var3);
   }

   // $FF: synthetic method
   public static uj m(long var0, uj var2, List var3, int var4, Object var5) {
      var0 ^= a;
      long var6 = var0 ^ 86595489266685L;
      if ((var4 & 1) != 0) {
         var3 = var2.l;
      }

      return var2.O(var6, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 136023483900574L;
      List var10000 = this.l;
      String var10002 = true.e<invokedynamic>(2673, 724083098538575602L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.l.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public uj(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var6 = var4 ^ 51307211642764L;
      this(var6, (List)null, 1, (DefaultConstructorMarker)null);
   }

   public static void s(boolean var0) {
      d = var0;
   }

   public static boolean X() {
      return d;
   }

   public static boolean D() {
      boolean var0 = X();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var9 = a ^ 75390020233524L;
      e = new HashMap(13);
      true.A<invokedynamic>(true, 9116503130774476900L, var9);
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
      String var4 = "[\u0088\u0087\u0015UÆI7\u00155ðßQ`\u0004¬$wÏ\u00ado(ûoGÑVp~\u009dFù\u0086Ú\u009aá\u0091Ë£\u0086\u0010i\u001bêÜÂhªÅû @\u0007J|âî\u0010´\r_^6`3ä$M_\u0011\u0090\u008eUÓ";
      int var6 = "[\u0088\u0087\u0015UÆI7\u00155ðßQ`\u0004¬$wÏ\u00ado(ûoGÑVp~\u009dFù\u0086Ú\u009aá\u0091Ë£\u0086\u0010i\u001bêÜÂhªÅû @\u0007J|âî\u0010´\r_^6`3ä$M_\u0011\u0090\u008eUÓ".length();
      char var3 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14422;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/uj", var10);
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
         throw new RuntimeException("su/catlean/uj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
