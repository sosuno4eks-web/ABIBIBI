package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
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
import kotlin.ranges.RangesKt;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_332;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;

public final class nj extends nm {
   @NotNull
   public static final nj U;
   private static float F;
   private static final long c = j0.a(-4736516556110266619L, 1776226148596489107L, MethodHandles.lookup().lookupClass()).a(138710873663124L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] m;
   private static final Map n;

   private nj(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 52662932339700L;
      super(true.k<invokedynamic>(26022, 8103494286667698489L ^ var1), var3);
   }

   public final float p() {
      return F;
   }

   public final void t(float <set-?>) {
      F = var1;
   }

   public void k(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 64046659475928L;
      long var6 = var2 ^ 131986898433471L;
      long var10001 = var2 ^ 107625437959535L;
      int var8 = (int)((var2 ^ 107625437959535L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var2 ^ 3828277316068L;
      long var13 = var2 ^ 4741450426009L;
      long var15 = var2 ^ 13315936160300L;
      String[] var10000 = -1776618330756458784L.A<invokedynamic>(-1776618330756458784L, var2);
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(30512, 1064427831473087430L ^ var2));
      String[] var17 = var10000;
      Color var18 = z8.I.Z(var11, 0);
      float var19 = (float)s8.H((short)var8, (short)var9, var10).method_22683().method_4486() / 2.0F;
      float var20 = (float)s8.H((short)var8, (short)var9, var10).method_22683().method_4502() / 2.0F;
      class_746 var27 = s8.H((short)var8, (short)var9, var10).field_1724;
      Intrinsics.checkNotNull(var27);
      float var21 = 3.0F - var27.method_7261(0.5F) * 3.0F + RangesKt.coerceIn(i4.v.h() * 10.0F, 0.0F, 3.0F);
      float var22 = gk.E.i(F, var21, gk.E.h(var15)) + 7.0F;
      F = var21;
      VertexFormat var10002 = class_290.field_1576;
      Intrinsics.checkNotNullExpressionValue(var10002, true.k<invokedynamic>(26237, 1663944611979113096L ^ var2));
      ib var23 = new ib(var10002, true.n<invokedynamic>(539, 5607230475243345098L ^ var2), false, 4, var6, (DefaultConstructorMarker)null);
      gk var26 = gk.E;
      float var10003 = var19 - 1.0F;
      float var10004 = var20 - 6.0F + var22;
      Color[] var24 = new Color[1];
      Color var10009 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var10009, true.k<invokedynamic>(4586, 8343844458597172510L ^ var2));
      var24[0] = var10009;
      var26.O(var4, var23, var10003, var10004, 2.0F, 4.0F, var24);
      var26 = gk.E;
      var10003 = var19 - 0.5F;
      var10004 = var20 - 5.5F + var22;
      var24 = new Color[]{var18};
      var26.O(var4, var23, var10003, var10004, 1.0F, 3.0F, var24);
      var26 = gk.E;
      var10003 = var19 - 1.0F;
      var10004 = var20 + 2.0F - var22;
      var24 = new Color[1];
      var10009 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var10009, true.k<invokedynamic>(28070, 2570730375408073041L ^ var2));
      var24[0] = var10009;
      var26.O(var4, var23, var10003, var10004, 2.0F, 4.0F, var24);
      var26 = gk.E;
      var10003 = var19 - 0.5F;
      var10004 = var20 + 2.5F - var22;
      var24 = new Color[]{var18};
      var26.O(var4, var23, var10003, var10004, 1.0F, 3.0F, var24);
      var26 = gk.E;
      var10003 = var19 - 6.0F + var22;
      var10004 = var20 - 1.0F;
      var24 = new Color[1];
      var10009 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var10009, true.k<invokedynamic>(28070, 2570730375408073041L ^ var2));
      var24[0] = var10009;
      var26.O(var4, var23, var10003, var10004, 4.0F, 2.0F, var24);
      var26 = gk.E;
      var10003 = var19 - 5.5F + var22;
      var10004 = var20 - 0.5F;
      var24 = new Color[]{var18};
      var26.O(var4, var23, var10003, var10004, 3.0F, 1.0F, var24);
      var26 = gk.E;
      var10003 = var19 + 2.0F - var22;
      var10004 = var20 - 1.0F;
      var24 = new Color[1];
      var10009 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var10009, true.k<invokedynamic>(28070, 2570730375408073041L ^ var2));
      var24[0] = var10009;
      var26.O(var4, var23, var10003, var10004, 4.0F, 2.0F, var24);
      var26 = gk.E;
      var10001 = var4;
      ib var28 = var23;
      var10003 = var19 + 2.5F - var22;
      var10004 = var20 - 0.5F;
      float var10005 = 3.0F;
      float var10006 = 1.0F;
      var24 = new Color[1];

      try {
         var24[0] = var18;
         var26.O(var10001, var28, var10003, var10004, var10005, var10006, var24);
         ib.j(var23, v2.S.b(), (class_276)null, var13, (GpuBufferSlice)null, (Matrix4f)null, new Matrix3x2f((Matrix3x2fc)var1.method_51448()), (Map)null, true.n<invokedynamic>(13624, 1405013479023502312L ^ var2), (Object)null);
         if (var17 != null) {
            (new int[2]).A<invokedynamic>(new int[2], -1829945951420996319L, var2);
         }

      } catch (NumberFormatException var25) {
         throw var25.A<invokedynamic>(var25, -1831910526759257957L, var2);
      }
   }

   static {
      long var20 = c ^ 44527041594425L;
      long var22 = var20 ^ 4833406895073L;
      i = new HashMap(13);
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
      String var15 = "9·\u009fÖJ\u000eO½a°\u0093kã~§6s¯âw\u00981³\u000b\u0010Bô\u0098\u0016¸\\\u009fò2uXèØÖ.\u001e\u0010Z\u001d\u0005\u0013í\"\u0087be.îçØ]ãÓ";
      int var17 = "9·\u009fÖJ\u000eO½a°\u0093kã~§6s¯âw\u00981³\u000b\u0010Bô\u0098\u0016¸\\\u009fò2uXèØÖ.\u001e\u0010Z\u001d\u0005\u0013í\"\u0087be.îçØ]ãÓ".length();
      char var14 = 24;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[5];
                  n = new HashMap(13);
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
                  String var4 = "Ëÿògü\u009e\u00929{¢5©¶]k\u008d";
                  int var5 = "Ëÿògü\u009e\u00929{¢5©¶]k\u008d".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  j = var6;
                  m = new Integer[2];
                  U = new nj(var22);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "ÂXÒÞqêl\ræ\u008e©ëìº¤  Àúæ\u0004©7¢z*AqMâ7\u0090ð:\u0090Ä¨ÎÓª\u001eâmÄáR\u009bª\u0013";
               var17 = "ÂXÒÞqêl\ræ\u008e©ëìº¤  Àúæ\u0004©7¢z*AqMâ7\u0090ð:\u0090Ä¨ÎÓª\u001eâmÄáR\u009bª\u0013".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13123;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/nj", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/nj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12647;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/nj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/nj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
