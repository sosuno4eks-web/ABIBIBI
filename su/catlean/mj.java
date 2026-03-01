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

public final class mj {
   private final float M;
   @NotNull
   private final String f;
   @NotNull
   private final aa z;
   @NotNull
   private final Function0 k;
   private static final long a = j0.a(7865650947104223661L, 5965757312997180779L, MethodHandles.lookup().lookupClass()).a(93326808905905L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public mj(long a, float x, @NotNull String name, @NotNull aa animation, @NotNull Function0 action) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(26718, 5455615488397570880L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.n<invokedynamic>(1980, 4396381076878990504L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.n<invokedynamic>(3673, 7543620128102815045L ^ var1));
      super();
      this.M = var3;
      this.f = var4;
      this.z = var5;
      this.k = var6;
   }

   // $FF: synthetic method
   public mj(float var1, String var2, aa var3, char var4, long var5, Function0 var7, int var8, DefaultConstructorMarker var9) {
      long var10 = ((long)var4 << 48 | var5 << 16 >>> 16) ^ a;
      long var12 = var10 ^ 26019097352895L;
      long var10001 = var10 ^ 1718665060577L;
      int var14 = (int)((var10 ^ 1718665060577L) >>> 48);
      int var15 = (int)(var10001 << 16 >>> 48);
      int var16 = (int)(var10001 << 32 >>> 32);
      if ((var8 & 4) != 0) {
         var3 = new aa(sa.OUT_EXPO, i, (short)var14, (short)var15, var16);
      }

      this(var12, var1, var2, var3, var7);
   }

   public final float I() {
      return this.M;
   }

   @NotNull
   public final String Q() {
      return this.f;
   }

   @NotNull
   public final aa E() {
      return this.z;
   }

   @NotNull
   public final Function0 v() {
      return this.k;
   }

   public final float X() {
      return this.M;
   }

   @NotNull
   public final String f() {
      return this.f;
   }

   @NotNull
   public final aa n() {
      return this.z;
   }

   @NotNull
   public final Function0 Z() {
      return this.k;
   }

   @NotNull
   public final mj O(float x, @NotNull String name, @NotNull aa animation, @NotNull Function0 action, long a) {
      var5 ^= a;
      long var7 = var5 ^ 19203990760938L;
      Intrinsics.checkNotNullParameter(var2, true.n<invokedynamic>(1255, 4932562285610340075L ^ var5));
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(1214, 2477802688519311025L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(19023, 2878009514135470145L ^ var5));
      return new mj(var7, var1, var2, var3, var4);
   }

   // $FF: synthetic method
   public static mj p(mj param0, float param1, String param2, aa param3, Function0 param4, long param5, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 83982220356315L;
      Function0 var3 = this.k;
      aa var4 = this.z;
      String var5 = this.f;
      float var6 = this.M;
      String var10000 = 17212.n<invokedynamic>(17212, 7667745034315768832L ^ var1);
      return var10000 + var6 + true.n<invokedynamic>(25773, 3496045801967911835L ^ var1) + var5 + true.n<invokedynamic>(20829, 1142650838033217126L ^ var1) + var4 + true.n<invokedynamic>(2780, 4720992962010901986L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 95862960306084L;
      int var3 = Float.hashCode(this.M);
      var3 = var3 * true.h<invokedynamic>(26145, 6757339072998786250L ^ var1) + this.f.hashCode();
      var3 = var3 * true.h<invokedynamic>(21897, 7856007097340196705L ^ var1) + this.z.hashCode();
      var3 = var3 * true.h<invokedynamic>(21897, 7856007097340196705L ^ var1) + this.k.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 118777796147127L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[10];
      int var23 = 0;
      String var22 = "NG¢£Cy\u000e¸µÐ\u0012=ß\r\u001fê\u0018\u009a\u0087I\u0013\u0088%¡sq¬å\u0093«©Ï:\u00ad'ni5([+\u0010Ö4w¼×´\u0015Æ\u0086\fÎ\n1\u0014\u00adÏ\u0018û\u000b~\u000f\tä\u0007ÙYVçñ6\u0089\b\u0012c²ØC4¾/¯ \u000b¾*Là\u0091µ©±²\u00ad\u007föQ©rmÒwÃ Â\u00934\bß\u0087\u0094@\tý»\u0010v[:u_Ûßè\bÝÙýº9Ò\u0082\u0018xôìßVôGq\u0083Æ\u0080éò\u0015^\u0094ÜrÇU\u0081à¬\u0015\u0010$\u000f¬9F\u0000ûÃ»\u0096VSÜ\u001fhl";
      int var24 = "NG¢£Cy\u000e¸µÐ\u0012=ß\r\u001fê\u0018\u009a\u0087I\u0013\u0088%¡sq¬å\u0093«©Ï:\u00ad'ni5([+\u0010Ö4w¼×´\u0015Æ\u0086\fÎ\n1\u0014\u00adÏ\u0018û\u000b~\u000f\tä\u0007ÙYVçñ6\u0089\b\u0012c²ØC4¾/¯ \u000b¾*Là\u0091µ©±²\u00ad\u007föQ©rmÒwÃ Â\u00934\bß\u0087\u0094@\tý»\u0010v[:u_Ûßè\bÝÙýº9Ò\u0082\u0018xôìßVôGq\u0083Æ\u0080éò\u0015^\u0094ÜrÇU\u0081à¬\u0015\u0010$\u000f¬9F\u0000ûÃ»\u0096VSÜ\u001fhl".length();
      char var21 = 16;
      int var20 = -1;

      label56:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var32;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  c = new String[10];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[3];
                  int var8 = 0;
                  String var9 = "eKÇÈ\u0083\bþW\u001aÄoxÜ\fk\u0014pQk\u0012\u0017\u001cV\u009f";
                  int var10 = "eKÇÈ\u0083\bþW\u001aÄoxÜ\fk\u0014pQk\u0012\u0017\u001cV\u009f".length();
                  int var7 = 0;

                  do {
                     int var30 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var30, var7).getBytes("ISO-8859-1");
                     var30 = var8++;
                     long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                     long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                     boolean var35 = true;
                     var11[var30] = var10004;
                  } while(var7 < var10);

                  e = var11;
                  g = new Integer[3];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1221486602037761258L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var33 = true;
                  i = var36;
                  return;
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var32;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label56;
               }

               var22 = "!\u001a\u0019\u001c«\u0014ÕxÛff¿W4>×\u0012\u0001v¾\u000b¤*\u0004Xå@\u0014\u0006mE\u0011\u0010ª\u0092\u0086W<ôpD\u0011Òî\u008a«=\u0094Ò";
               var24 = "!\u001a\u0019\u001c«\u0014ÕxÛff¿W4>×\u0012\u0001v¾\u000b¤*\u0004Xå@\u0014\u0006mE\u0011\u0010ª\u0092\u0086W<ôpD\u0011Òî\u008a«=\u0094Ò".length();
               var21 = ' ';
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12571;
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
            throw new RuntimeException("su/catlean/mj", var10);
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
         throw new RuntimeException("su/catlean/mj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10673;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
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
            throw new RuntimeException("su/catlean/mj", var14);
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
         throw new RuntimeException("su/catlean/mj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
