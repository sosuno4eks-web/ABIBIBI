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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pf {
   @NotNull
   private final String D;
   @NotNull
   private final aa j;
   private boolean M;
   private static final long a = j0.a(7840949488330451932L, 5113948605908856805L, MethodHandles.lookup().lookupClass()).a(123723367358098L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   public pf(long a, @NotNull String name, @NotNull aa animation, boolean removing) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(25898, 5043893560140039547L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(19407, 7853168214683560859L ^ var1));
      super();
      this.D = var3;
      this.j = var4;
      this.M = var5;
   }

   // $FF: synthetic method
   public pf(String var1, aa var2, boolean var3, int var4, long var5, DefaultConstructorMarker var7) {
      var5 ^= a;
      long var8 = var5 ^ 70417047677250L;
      long var10001 = var5 ^ 23066042600338L;
      int var10 = (int)((var5 ^ 23066042600338L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      if ((var4 & 2) != 0) {
         var2 = new aa(sa.OUT_QUINT, h, (short)var10, (short)var11, var12);
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      this(var8, var1, var2, var3);
   }

   @NotNull
   public final String O() {
      return this.D;
   }

   @NotNull
   public final aa t() {
      return this.j;
   }

   public final boolean Y() {
      return this.M;
   }

   public final void F(boolean <set-?>) {
      this.M = var1;
   }

   @NotNull
   public final String B() {
      return this.D;
   }

   @NotNull
   public final aa p() {
      return this.j;
   }

   public final boolean C() {
      return this.M;
   }

   @NotNull
   public final pf H(@NotNull String name, @NotNull aa animation, boolean removing, long a) {
      var4 ^= a;
      long var6 = var4 ^ 121063516658707L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(25572, 704192567305065790L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.f<invokedynamic>(20012, 8597657502404376823L ^ var4));
      return new pf(var6, var1, var2, var3);
   }

   // $FF: synthetic method
   public static pf e(pf param0, String param1, aa param2, boolean param3, int param4, long param5, Object param7) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 72873507139069L;
      boolean var3 = this.M;
      aa var4 = this.j;
      String var5 = this.D;
      String var10000 = 299.f<invokedynamic>(299, 3686131444112982770L ^ var1);
      return var10000 + var5 + true.f<invokedynamic>(26090, 1022649690477553201L ^ var1) + var4 + true.f<invokedynamic>(11631, 3381824655037935287L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 47497482262957L;
      int var3 = this.D.hashCode();
      var3 = var3 * true.q<invokedynamic>(9838, 231135310608650939L ^ var1) + this.j.hashCode();
      var3 = var3 * true.q<invokedynamic>(28957, 2003300777743386057L ^ var1) + Boolean.hashCode(this.M);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 116746237344457L;
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
      String var22 = "jËÔ¯EK\u009bH\u0005ßMü'!Õ\u0098Øuô;~µI\u008a\u00148\u0099\u009d\u0091?\u0093\u001a :LFö\u009b\u0086\u009e\u000e\tì¨ÎÇ\u0007ñ>Û\u0085Ö\u00adµ\u0093®ÛBj0\u008f+S »\u0018¤\u0089ç}°\u0013¾ùg\u0011qÌ9Ù¢j»ÎÃ6=¥\u008aË\u0010\\$7¶\u001dýµâF\u0012'i.\u009c-í\u0010Bk\u0084r\u0089*ÆZ:\u001cg\u0012÷\u0007ä¯";
      int var24 = "jËÔ¯EK\u009bH\u0005ßMü'!Õ\u0098Øuô;~µI\u008a\u00148\u0099\u009d\u0091?\u0093\u001a :LFö\u009b\u0086\u009e\u000e\tì¨ÎÇ\u0007ñ>Û\u0085Ö\u00adµ\u0093®ÛBj0\u008f+S »\u0018¤\u0089ç}°\u0013¾ùg\u0011qÌ9Ù¢j»ÎÃ6=¥\u008aË\u0010\\$7¶\u001dýµâF\u0012'i.\u009c-í\u0010Bk\u0084r\u0089*ÆZ:\u001cg\u0012÷\u0007ä¯".length();
      char var21 = ' ';
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
                  g = new HashMap(13);
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
                  String var9 = "\u0004²\u000b^2ÏÜ0Öt^mæ¶¤%";
                  int var10 = "\u0004²\u000b^2ÏÜ0Öt^mæ¶¤%".length();
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
                  f = new Integer[2];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1320295751638323476L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var33 = true;
                  h = var36;
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

               var22 = "\u0012\u0007§\u000e\u000b\u0080\u0012A£ ²Ã\u00add²\r)\u008a:QXÌ\t75BÕ\\R:ûV H2MaºÔ¹\u00023Z¡ªØ×\u001dëhKu|ÚÓôþÉ\u0098©_ó?`\u007f";
               var24 = "\u0012\u0007§\u000e\u000b\u0080\u0012A£ ²Ã\u00add²\r)\u008a:QXÌ\t75BÕ\\R:ûV H2MaºÔ¹\u00023Z¡ªØ×\u001dëhKu|ÚÓôþÉ\u0098©_ó?`\u007f".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9403;
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
            throw new RuntimeException("su/catlean/pf", var10);
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
         throw new RuntimeException("su/catlean/pf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10215;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/pf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/pf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
