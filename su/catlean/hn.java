package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hn {
   @NotNull
   private final UUID c;
   @NotNull
   private final class_1657 Y;
   private long O;
   private static final long a = j0.a(4506439178668419887L, 7547848824031977349L, MethodHandles.lookup().lookupClass()).a(75522050761396L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public hn(@NotNull UUID uuid, long a, @NotNull class_1657 player, long logTime) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(32653, 3366390506451827489L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.o<invokedynamic>(14846, 8945066875276868948L ^ var2));
      super();
      this.c = var1;
      this.Y = var4;
      this.O = var5;
   }

   @NotNull
   public final UUID u() {
      return this.c;
   }

   @NotNull
   public final class_1657 W() {
      return this.Y;
   }

   public final long J() {
      return this.O;
   }

   public final void j(long <set-?>) {
      this.O = var1;
   }

   @NotNull
   public final UUID l() {
      return this.c;
   }

   @NotNull
   public final class_1657 t() {
      return this.Y;
   }

   public final long s() {
      return this.O;
   }

   @NotNull
   public final hn y(@NotNull UUID uuid, long a, @NotNull class_1657 player, long logTime) {
      var2 ^= a;
      long var7 = var2 ^ 127007051805885L;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(29060, 6165256266535166210L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.o<invokedynamic>(28150, 45734589278584179L ^ var2));
      return new hn(var1, var7, var4, var5);
   }

   // $FF: synthetic method
   public static hn Y(hn var0, UUID var1, int var2, short var3, class_1657 var4, long var5, int var7, short var8, Object var9) {
      long var10 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var8 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 27030870851370L;
      String var14 = 551734776812487339L.A<invokedynamic>(551734776812487339L, var10);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var7 & 1;
               if (var14 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var16) {
               throw var16.A<invokedynamic>(var16, 534639309789606124L, var10);
            }

            var1 = var0.c;
         }

         var10000 = var7 & 2;
      }

      label32: {
         label31: {
            try {
               if (var14 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, 534639309789606124L, var10);
            }

            var4 = var0.Y;
         }

         var10000 = var7 & 4;
      }

      if (var10000 != 0) {
         var5 = var0.O;
      }

      return var0.y(var1, var12, var4, var5);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 102363497953276L;
      long var3 = this.O;
      class_1657 var5 = this.Y;
      UUID var6 = this.c;
      String var10000 = 17268.o<invokedynamic>(17268, 8926410271376891370L ^ var1);
      return var10000 + var6 + true.o<invokedynamic>(2089, 6729578224284178100L ^ var1) + var5 + true.o<invokedynamic>(11452, 2189816893121573411L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 25407281296236L;
      1341886626047678364L.A<invokedynamic>(1341886626047678364L, var1);
      int var4 = this.c.hashCode();
      var4 = var4 * true.m<invokedynamic>(31827, 4485936303781752252L ^ var1) + this.Y.hashCode();
      var4 = var4 * true.m<invokedynamic>(4679, 3620370756083499945L ^ var1) + Long.hashCode(this.O);

      try {
         if (1309282597261350721L.A<invokedynamic>(1309282597261350721L, var1) == null) {
            "KYmOm".A<invokedynamic>("KYmOm", 1368621281431171234L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 1322961542407267803L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 30532348410857L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "µ(n-I\u0094Ûj\"6Àpìå°Å ø(µ\u0095\u009b\\\u0084D\u0015ñ¼Q~%Hï9Ð\u0094q\u0003J\u0014 \u0087ïÝxºË\u0080 Ç\róvI5Rè\u0090À:·xîJ$·9< À\u0098\u0095¢\u0010`\u0093v\u0096¼\u001eô/Ó\u0002SL¾N[í S±Ø\u0016\u0004Ê`[¥\u008d£]\u0018\u001fÁ®ö¥år;\u0081¿&\u0097\u0010(½\u008cF50\u0010\b\u009dÚ\u0099\"\u009d¤`sÿsò\u0015\n\u0012o";
      int var19 = "µ(n-I\u0094Ûj\"6Àpìå°Å ø(µ\u0095\u009b\\\u0084D\u0015ñ¼Q~%Hï9Ð\u0094q\u0003J\u0014 \u0087ïÝxºË\u0080 Ç\róvI5Rè\u0090À:·xîJ$·9< À\u0098\u0095¢\u0010`\u0093v\u0096¼\u001eô/Ó\u0002SL¾N[í S±Ø\u0016\u0004Ê`[¥\u008d£]\u0018\u001fÁ®ö¥år;\u0081¿&\u0097\u0010(½\u008cF50\u0010\b\u009dÚ\u0099\"\u009d¤`sÿsò\u0015\n\u0012o".length();
      char var16 = '(';
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  d = new String[7];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "H%Ë\u0097N~Õ4\u0093V¤ygï\u0084\r";
                  int var5 = "H%Ë\u0097N~Õ4\u0093V¤ygï\u0084\r".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  g = new Integer[2];
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "\u008dëØÊ¡\rÐ²\u0091ÂÒ\u0092kôC\u0000\u0010\fý}¡\u001ea¶ªÚ( \u000bgd^\u0086";
               var19 = "\u008dëØÊ¡\rÐ²\u0091ÂÒ\u0092kôC\u0000\u0010\fý}¡\u001ea¶ªÚ( \u000bgd^\u0086".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2546;
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
            throw new RuntimeException("su/catlean/hn", var10);
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
         throw new RuntimeException("su/catlean/hn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16915;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/hn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/hn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
