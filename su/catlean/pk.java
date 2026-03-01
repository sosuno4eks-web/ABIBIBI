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

public final class pk {
   private final Object I;
   @NotNull
   private final mg K;
   private static final long a = j0.a(701300033725605446L, 6666847375249754196L, MethodHandles.lookup().lookupClass()).a(88007441825360L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public pk(long a, Object data, @NotNull mg damageData) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(15425, 1343618801929156954L ^ var1));
      super();
      this.I = var3;
      this.K = var4;
   }

   public final Object C() {
      return this.I;
   }

   @NotNull
   public final mg R() {
      return this.K;
   }

   public final Object u() {
      return this.I;
   }

   @NotNull
   public final mg I() {
      return this.K;
   }

   @NotNull
   public final pk j(Object data, long a, @NotNull mg damageData) {
      var2 ^= a;
      long var5 = var2 ^ 34351658301296L;
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(6293, 8116828154622839845L ^ var2));
      return new pk(var5, var1, var4);
   }

   // $FF: synthetic method
   public static pk c(pk var0, int var1, char var2, Object var3, char var4, mg var5, int var6, Object var7) {
      long var8 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var10 = var8 ^ 85250490858381L;
      boolean var12 = 5908173979605111268L.A<invokedynamic>(5908173979605111268L, var8);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var6 & 1;
               if (!var12) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, 5884773596249906658L, var8);
            }

            var3 = var0.I;
         }

         var10000 = var6 & 2;
      }

      if (var10000 != 0) {
         var5 = var0.K;
      }

      return var0.j(var3, var10, var5);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 14777304345238L;
      Object var10000 = this.I;
      mg var10001 = this.K;
      String var10003 = true.p<invokedynamic>(32203, 4486484852092152019L ^ var1);
      return var10003 + var10000 + true.p<invokedynamic>(8268, 8136559953043125591L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 69041475078568L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "\f:ËQÙ«\u008e\u0090\u0086\u0000zÇ\u0016G\u0010ås¦Gèï\u008c\u0094\u0004\u0088]\u0006e[J6ù $\u0092í1\r!¸\u0099c\u0095ÕbÜa\u0006nv\u0091_/jí=\u0093 \u008a\rÔm\u008a¤u";
      int var13 = "\f:ËQÙ«\u008e\u0090\u0086\u0000zÇ\u0016G\u0010ås¦Gèï\u008c\u0094\u0004\u0088]\u0006e[J6ù $\u0092í1\r!¸\u0099c\u0095ÕbÜa\u0006nv\u0091_/jí=\u0093 \u008a\rÔm\u008a¤u".length();
      char var10 = ' ';
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
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 2987883434834109868L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
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

               var11 = "Ch7%ë¥\u0087¤?\u008c´sR'¹\u0097ïÍ\\\fâù\u008bÆ(>½ø\u0011\u009a ÒÜ¾\u0010\u009cF)ÏiÎ×[\u008b;[\u000b~H\u001f\u009a.Ì\u0012\u000f~´É&_\u0007®Lý\u0086";
               var13 = "Ch7%ë¥\u0087¤?\u008c´sR'¹\u0097ïÍ\\\fâù\u008bÆ(>½ø\u0011\u009a ÒÜ¾\u0010\u009cF)ÏiÎ×[\u008b;[\u000b~H\u001f\u009a.Ì\u0012\u000f~´É&_\u0007®Lý\u0086".length();
               var10 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6485;
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
            throw new RuntimeException("su/catlean/pk", var10);
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
         throw new RuntimeException("su/catlean/pk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
