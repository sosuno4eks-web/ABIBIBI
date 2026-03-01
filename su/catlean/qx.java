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
import net.minecraft.class_1293;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qx {
   private final int e;
   @Nullable
   private final class_1293 A;
   private static String[] s;
   private static final long a = j0.a(2054216813715029157L, 6805766592116883365L, MethodHandles.lookup().lookupClass()).a(233192334723318L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long f;

   public qx(int slot, @Nullable class_1293 effect) {
      this.e = var1;
      this.A = var2;
   }

   public final int V() {
      return this.e;
   }

   @Nullable
   public final class_1293 T() {
      return this.A;
   }

   public final int g() {
      return this.e;
   }

   @Nullable
   public final class_1293 W() {
      return this.A;
   }

   @NotNull
   public final qx j(int slot, @Nullable class_1293 effect) {
      return new qx(var1, var2);
   }

   public static qx a(qx var0, long var1, int var3, class_1293 var4, int var5, Object var6) {
      var1 ^= a;
      String[] var7 = -3053202445065992682L.A<invokedynamic>(-3053202445065992682L, var1);

      int var10000;
      label35: {
         label34: {
            try {
               var10000 = var5 & 1;
               if (var7 != null) {
                  break label35;
               }

               if (var10000 == 0) {
                  break label34;
               }
            } catch (NumberFormatException var9) {
               throw var9.A<invokedynamic>(var9, -3053494412869429799L, var1);
            }

            var3 = var0.e;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.A;
      }

      try {
         qx var10 = var0.j(var3, var4);
         if (var1 > 0L && -3074846381706063815L.A<invokedynamic>(-3074846381706063815L, var1) == null) {
            (new String[3]).A<invokedynamic>(new String[3], -3084859950761547565L, var1);
         }

         return var10;
      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -3053494412869429799L, var1);
      }
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 73553693250673L;
      int var10000 = this.e;
      class_1293 var10001 = this.A;
      String var10003 = true.b<invokedynamic>(4646, 5843073600912218801L ^ var1);
      return var10003 + var10000 + true.b<invokedynamic>(22301, 3768021632949395339L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void U(String[] var0) {
      s = var0;
   }

   public static String[] q() {
      return s;
   }

   static {
      long var14 = a ^ 3340112259389L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 1656515878268218142L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[2];
      int var10 = 0;
      String var9 = "5\u0007\bx´íÏ!´!Ççÿ\u008b×(þQ\u0093F\u001eÈH\u0094\bB\u007f\u0080N\u001f%W\u0018X\u009e²öõu^¼j\u008f,o\u0081ù\u009af¨rô\\\u0086\fI\u0010";
      int var11 = "5\u0007\bx´íÏ!´!Ççÿ\u008b×(þQ\u0093F\u001eÈH\u0094\bB\u007f\u0080N\u001f%W\u0018X\u009e²öõu^¼j\u008f,o\u0081ù\u009af¨rô\\\u0086\fI\u0010".length();
      char var8 = ' ';
      int var7 = -1;

      while(true) {
         ++var7;
         byte[] var13 = var5.doFinal(var9.substring(var7, var7 + var8).getBytes("ISO-8859-1"));
         String var17 = a(var13).intern();
         boolean var10001 = true;
         var12[var10++] = var17;
         if ((var7 += var8) >= var11) {
            b = var12;
            c = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -1682689231416566919L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            f = var19;
            return;
         }

         var8 = var9.charAt(var7);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8850;
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
            throw new RuntimeException("su/catlean/qx", var10);
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
         throw new RuntimeException("su/catlean/qx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
