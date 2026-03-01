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

public final class vh {
   @NotNull
   private final List i;
   private static final long a = j0.a(8425325274003766434L, 8847834985509261115L, MethodHandles.lookup().lookupClass()).a(183446801869490L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vh(@NotNull List entities, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(12282, 5822815915131622945L ^ var2));
      super();
      this.i = var1;
   }

   // $FF: synthetic method
   public vh(List var1, int var2, DefaultConstructorMarker var3, long var4) {
      var4 ^= a;
      long var6 = var4 ^ 27856319436978L;
      if ((var2 & 1) != 0) {
         var1 = (List)(new ArrayList());
      }

      this(var1, var6);
   }

   @NotNull
   public final List L() {
      return this.i;
   }

   @NotNull
   public final List v() {
      return this.i;
   }

   @NotNull
   public final vh t(long a, @NotNull List entities) {
      var1 ^= a;
      long var4 = var1 ^ 4610780683262L;
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(1511, 4529436516784385225L ^ var1));
      return new vh(var3, var4);
   }

   // $FF: synthetic method
   public static vh Q(vh var0, List var1, int var2, Object var3, long var4) {
      var4 ^= a;
      long var6 = var4 ^ 66845798439021L;
      if ((var2 & 1) != 0) {
         var1 = var0.i;
      }

      return var0.t(var6, var1);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 126758325198660L;
      List var10000 = this.i;
      String var10002 = true.t<invokedynamic>(13706, 3120994839728899694L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.i.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public vh(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 23564006066897L;
      this((List)null, 1, (DefaultConstructorMarker)null, var6);
   }

   static {
      long var0 = a ^ 108258411051955L;
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
      String var6 = "É\u007f\u00942JüÀÖÝ¸ÿþvLóbGbÿc.vp¼({XK\f\u001dß\u0096\u009e\u0087\u001eD?\u0015±\u001e¹\u0012¶ð^9ÓÂ\u0095\u0080W¢Ù$'\u008bÐ\u001d¾\u0087\t¿,PÞ\u0018=ÂÊ@·üw_\u009a\u0094\u001d\u0012É»ëQ¿É8\u0007?\u00055g";
      int var8 = "É\u007f\u00942JüÀÖÝ¸ÿþvLóbGbÿc.vp¼({XK\f\u001dß\u0096\u009e\u0087\u001eD?\u0015±\u001e¹\u0012¶ð^9ÓÂ\u0095\u0080W¢Ù$'\u008bÐ\u001d¾\u0087\t¿,PÞ\u0018=ÂÊ@·üw_\u009a\u0094\u001d\u0012É»ëQ¿É8\u0007?\u00055g".length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26536;
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
            throw new RuntimeException("su/catlean/vh", var10);
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
         throw new RuntimeException("su/catlean/vh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
