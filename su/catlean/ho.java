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
import net.minecraft.class_1293;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ho {
   @NotNull
   private final class_1293 A;
   @NotNull
   private final aa E;
   private boolean e;
   private static final long a = j0.a(34957932755856555L, 75615022353259028L, MethodHandles.lookup().lookupClass()).a(114819491740899L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public ho(@NotNull class_1293 instance, @NotNull aa animation, boolean removing, long a) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(19157, 7878180868603352559L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.l<invokedynamic>(12947, 8226449901293170094L ^ var4));
      super();
      this.A = var1;
      this.E = var2;
      this.e = var3;
   }

   // $FF: synthetic method
   public ho(class_1293 var1, aa var2, boolean var3, int var4, long var5, DefaultConstructorMarker var7) {
      var5 ^= a;
      long var10001 = var5 ^ 88484231032785L;
      int var8 = (int)((var5 ^ 88484231032785L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var5 ^ 120665740612478L;
      if ((var4 & 2) != 0) {
         var2 = new aa(sa.OUT_QUINT, i, (short)var8, (short)var9, var10);
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      this(var1, var2, var3, var11);
   }

   @NotNull
   public final class_1293 w() {
      return this.A;
   }

   @NotNull
   public final aa d() {
      return this.E;
   }

   public final boolean j() {
      return this.e;
   }

   public final void C(boolean <set-?>) {
      this.e = var1;
   }

   @NotNull
   public final class_1293 J() {
      return this.A;
   }

   @NotNull
   public final aa p() {
      return this.E;
   }

   public final boolean n() {
      return this.e;
   }

   @NotNull
   public final ho A(@NotNull class_1293 instance, @NotNull aa animation, long a, boolean removing) {
      var3 ^= a;
      long var6 = var3 ^ 75818212777301L;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(20910, 6151321982125005944L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.l<invokedynamic>(31506, 5550060693651814083L ^ var3));
      return new ho(var1, var2, var5, var6);
   }

   // $FF: synthetic method
   public static ho k(ho param0, class_1293 param1, aa param2, boolean param3, int param4, Object param5, long param6) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 19941625662794L;
      boolean var3 = this.e;
      aa var4 = this.E;
      class_1293 var5 = this.A;
      String var10000 = 26235.l<invokedynamic>(26235, 1848008175302845446L ^ var1);
      return var10000 + var5 + true.l<invokedynamic>(11533, 5978128835500404598L ^ var1) + var4 + true.l<invokedynamic>(6621, 3107791496561122209L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 29382860393687L;
      int var3 = this.A.hashCode();
      var3 = var3 * true.j<invokedynamic>(799, 6906241008116888759L ^ var1) + this.E.hashCode();
      var3 = var3 * true.j<invokedynamic>(31522, 355875567467924619L ^ var1) + Boolean.hashCode(this.e);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 75271087084503L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[7];
      int var23 = 0;
      String var22 = "ü\u0011\u009d\u0006~ÿQPX\u000f|p~D{\u001cì\u0099xQGc\u008e6;G° èºßl7\u0000.tõUÕ' \n003Æ\u0094k´\u0089uu\u000fy\bh¢ÇùyJ\u0084\u0003\u0092×óþ\u0007\u009c·gàÛ \f\\\u001e\u007f\u009e©?qZ\u00ad,c\u0014Î\u00903\rñ\u0082¿\b\u008fv\u008c\u0002O×x¹\u008fAx\u0018iá\t\u0007¿×\u0099v®á1\u000b¯-¬Î\u0090öëÖ\u000bÌ\u000eM ÇfRËú=\u009f?\t\u0081éEf\u00ad*\u0096Q\u001cVí^ÿ×t¾ÿÜÆM\u000f4Ë";
      int var24 = "ü\u0011\u009d\u0006~ÿQPX\u000f|p~D{\u001cì\u0099xQGc\u008e6;G° èºßl7\u0000.tõUÕ' \n003Æ\u0094k´\u0089uu\u000fy\bh¢ÇùyJ\u0084\u0003\u0092×óþ\u0007\u009c·gàÛ \f\\\u001e\u007f\u009e©?qZ\u00ad,c\u0014Î\u00903\rñ\u0082¿\b\u008fv\u008c\u0002O×x¹\u008fAx\u0018iá\t\u0007¿×\u0099v®á1\u000b¯-¬Î\u0090öëÖ\u000bÌ\u000eM ÇfRËú=\u009f?\t\u0081éEf\u00ad*\u0096Q\u001cVí^ÿ×t¾ÿÜÆM\u000f4Ë".length();
      char var21 = '(';
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
                  c = new String[7];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[2];
                  int var8 = 0;
                  String var9 = "®\u0085\u000ev\u0012«qÑI¸\u008d\u0095Æø~q";
                  int var10 = "®\u0085\u000ev\u0012«qÑI¸\u008d\u0095Æø~q".length();
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

                  f = var11;
                  g = new Integer[2];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8871807601527000538L;
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

               var22 = "i§0(\u0002Þ\u0012Y²^~(Î\u0080iäûI\u0093ÁÇ»@q>÷\ff,Úæ\u000f\u0018íX\u0089\u0090ÒÄ\u009e\u0098\u0088XË\u001e\u001b¡~\u009e\u0090À\u0086\u0013$ÁåÏ";
               var24 = "i§0(\u0002Þ\u0012Y²^~(Î\u0080iäûI\u0093ÁÇ»@q>÷\ff,Úæ\u000f\u0018íX\u0089\u0090ÒÄ\u009e\u0098\u0088XË\u001e\u001b¡~\u009e\u0090À\u0086\u0013$ÁåÏ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16527;
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
            throw new RuntimeException("su/catlean/ho", var10);
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
         throw new RuntimeException("su/catlean/ho" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13511;
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
            throw new RuntimeException("su/catlean/ho", var14);
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
         throw new RuntimeException("su/catlean/ho" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
