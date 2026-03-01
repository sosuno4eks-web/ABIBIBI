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

public final class t {
   @NotNull
   private final bk c;
   @NotNull
   private final h2 y;
   private static final long a = j0.a(6454280400755042860L, 8054824023644068905L, MethodHandles.lookup().lookupClass()).a(45170596086492L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public t(@NotNull bk opcode, long a, @NotNull h2 data) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(17071, 7342685126085800523L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.w<invokedynamic>(22133, 3850220707889866387L ^ var2));
      super();
      this.c = var1;
      this.y = var4;
   }

   @NotNull
   public final bk C() {
      return this.c;
   }

   @NotNull
   public final h2 D() {
      return this.y;
   }

   @NotNull
   public final bk l() {
      return this.c;
   }

   @NotNull
   public final h2 b() {
      return this.y;
   }

   @NotNull
   public final t I(@NotNull bk opcode, long a, @NotNull h2 data) {
      var2 ^= a;
      long var5 = var2 ^ 42635488271813L;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(30379, 3237483459550231714L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.w<invokedynamic>(4072, 5017804178864031204L ^ var2));
      return new t(var1, var5, var4);
   }

   // $FF: synthetic method
   public static t n(t var0, bk var1, h2 var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var7 = var5 ^ 61184514511157L;
      int[] var9 = 6854108946896286725L.A<invokedynamic>(6854108946896286725L, var5);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (var9 != null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 6911636314606083232L, var5);
            }

            var1 = var0.c;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.y;
      }

      return var0.I(var1, var7, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 95051744982010L;
      bk var10000 = this.c;
      h2 var10001 = this.y;
      String var10003 = true.w<invokedynamic>(3331, 711184809227320302L ^ var1);
      return var10003 + var10000 + true.w<invokedynamic>(22176, 1815562551956807755L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 123734595538518L;
      int var3 = this.c.hashCode();
      var3 = var3 * (int)f + this.y.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 110294051883908L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "\u0092Ø±P71\u009cpÙñP¹´ë;\u0000\u0010(½Î~G\u008dd ûÈ¯÷O\":Î\u0010úQ9\u0019\u0084IöÉ\u0017¿\u0092ë>Zêe\u00100ü÷\u0017[ysC\u0092Kf:\u0014\u001f\u0003O";
      int var13 = "\u0092Ø±P71\u009cpÙñP¹´ë;\u0000\u0010(½Î~G\u008dd ûÈ¯÷O\":Î\u0010úQ9\u0019\u0084IöÉ\u0017¿\u0092ë>Zêe\u00100ü÷\u0017[ysC\u0092Kf:\u0014\u001f\u0003O".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  d = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8161235787292317327L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  f = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "rj\u0089\u0090ny³\u0005q T§m\rÒÎ\u0018ð\u00adâÖ\u00adÒ\u001dï<\u0017ØGyHNår:-^\n\u0096ØF";
               var13 = "rj\u0089\u0090ny³\u0005q T§m\rÒÎ\u0018ð\u00adâÖ\u00adÒ\u001dï<\u0017ØGyHNår:-^\n\u0096ØF".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8761;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/t", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
