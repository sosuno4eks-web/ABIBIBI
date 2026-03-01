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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fr {
   @NotNull
   private final class_243 b;
   private int I;
   private int p;
   private static int V;
   private static final long a = j0.a(5263649418039394330L, 4823668789156118744L, MethodHandles.lookup().lookupClass()).a(279661587309020L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public fr(@NotNull class_243 pos, int color, long a, int age) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(9755, 588099189001353514L ^ var3));
      super();
      this.b = var1;
      this.I = var2;
      this.p = var5;
   }

   public fr(class_243 var1, int var2, int var3, long var4, int var6, DefaultConstructorMarker var7) {
      var4 ^= a;
      long var8 = var4 ^ 90326210105408L;
      if ((var6 & 2) != 0) {
         var2 = -1;
      }

      if ((var6 & 4) != 0) {
         var3 = 0;
      }

      this(var1, var2, var8, var3);
   }

   @NotNull
   public final class_243 W() {
      return this.b;
   }

   public final int h() {
      return this.I;
   }

   public final void J(int <set-?>) {
      this.I = var1;
   }

   public final int u() {
      return this.p;
   }

   public final void B(int <set-?>) {
      this.p = var1;
   }

   @NotNull
   public final class_243 q() {
      return this.b;
   }

   public final int Q() {
      return this.I;
   }

   public final int B() {
      return this.p;
   }

   @NotNull
   public final fr s(@NotNull class_243 pos, int color, int age, int a, byte a, int a) {
      long var7 = ((long)var4 << 32 | (long)var5 << 56 >>> 32 | (long)var6 << 40 >>> 40) ^ a;
      long var9 = var7 ^ 96103020381810L;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(5502, 5770616586833259263L ^ var7));
      return new fr(var1, var2, var9, var3);
   }

   public static fr b(fr param0, class_243 param1, int param2, int param3, int param4, Object param5, long param6) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 53345040820840L;
      int var3 = this.p;
      int var4 = this.I;
      class_243 var5 = this.b;
      String var10000 = 30587.d<invokedynamic>(30587, 3234986272103941271L ^ var1);
      return var10000 + var5 + true.d<invokedynamic>(11282, 4877590211905396732L ^ var1) + var4 + true.d<invokedynamic>(32589, 645137242486492327L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 43716039787772L;
      int var10000 = -6637990189404451992L.A<invokedynamic>(-6637990189404451992L, var1);
      int var4 = this.b.hashCode();
      var4 = var4 * true.g<invokedynamic>(1542, 8942210436532610777L ^ var1) + Integer.hashCode(this.I);
      var4 = var4 * true.g<invokedynamic>(23340, 8595354753927052274L ^ var1) + Integer.hashCode(this.p);
      int var3 = var10000;

      try {
         if (var3 != 0) {
            (new int[5]).A<invokedynamic>(new int[5], -6696668597270060885L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -6670909133013937111L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void A(int var0) {
      V = var0;
   }

   public static int L() {
      return V;
   }

   public static int z() {
      int var0 = L();

      try {
         return var0 == 0 ? 84 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = a ^ 15317494296898L;
      e = new HashMap(13);
      31.A<invokedynamic>(31, 1613789629700195725L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "Pzå\u001f\"Ç\u0091\u0010-Zå\u00003\u0015»ø/ë\u0087Q½ùj\u001e\u0093õ,\u009b5ÓQ÷\u0010\t\u009aÛß\u001a \u0007ñÁ©Z\u000b\t\u0081`\u0091 ¼×'*ªÚ¼\u0098[ë±\u00029±NÇ\u0017¿ca¼òáG\u009bð\u009f$¡\u008e\u0006Ô";
      int var17 = "Pzå\u001f\"Ç\u0091\u0010-Zå\u00003\u0015»ø/ë\u0087Q½ùj\u001e\u0093õ,\u009b5ÓQ÷\u0010\t\u009aÛß\u001a \u0007ñÁ©Z\u000b\t\u0081`\u0091 ¼×'*ªÚ¼\u0098[ë±\u00029±NÇ\u0017¿ca¼òáG\u009bð\u009f$¡\u008e\u0006Ô".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var27;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[5];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "9\u0082Å\u001f ÿÖ2?s`Â\u0018\u009c¼Ò";
                  int var5 = "9\u0082Å\u001f ÿÖ2?s`Â\u0018\u009c¼Ò".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var27;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "¸g\u0004\u0099F\u0019Làù\u0093n\u0095Å\u007fne\u0010\\úì´ä\u0012ky³ú\u00843k ÷X";
               var17 = "¸g\u0004\u0099F\u0019Làù\u0093n\u0095Å\u007fne\u0010\\úì´ä\u0012ky³ú\u00843k ÷X".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16198;
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
            throw new RuntimeException("su/catlean/fr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/fr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 739;
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
            throw new RuntimeException("su/catlean/fr", var14);
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
         throw new RuntimeException("su/catlean/fr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
