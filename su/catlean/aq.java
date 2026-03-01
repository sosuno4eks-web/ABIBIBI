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
import su.catlean.api.IPasteable;
import su.catlean.gofra.Gofra;

public final class aq {
   private static final long a = j0.a(4745096041572159429L, 7660033832410172300L, MethodHandles.lookup().lookupClass()).a(210561845123891L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public static final void p(long a, @NotNull IPasteable $this$bus) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, b);
      k9[] var10000 = 1901840943959849119L.A<invokedynamic>(1901840943959849119L, var0);
      Gofra var10001 = Gofra.INSTANCE;
      Object[] var4 = new Object[true.k<invokedynamic>(29130, 1926376691717820809L ^ var0)];
      var4[0] = var2;
      var4[1] = c0.S;
      var4[2] = sj.w;
      var4[3] = ux.F;
      var4[4] = ab.O;
      var4[5] = gz.M;
      var4[true.k<invokedynamic>(8444, 5646238920236236964L ^ var0)] = ez.N;
      var4[true.k<invokedynamic>(17781, 6336968772094158124L ^ var0)] = vi.o;
      var4[true.k<invokedynamic>(4144, 8342522215062450279L ^ var0)] = x7.Z;
      var4[true.k<invokedynamic>(22592, 9006660433128847375L ^ var0)] = dk.I;
      var4[true.k<invokedynamic>(20579, 6386776153602125874L ^ var0)] = pr.A;
      var4[true.k<invokedynamic>(7558, 6969553584905469392L ^ var0)] = x2.E;
      var4[true.k<invokedynamic>(18379, 8831140197546420102L ^ var0)] = _x.e;
      var4[true.k<invokedynamic>(2895, 840587400458808092L ^ var0)] = i4.v;
      var4[true.k<invokedynamic>(28570, 664175072448663496L ^ var0)] = um.c;
      var4[true.k<invokedynamic>(1575, 7727460869562508899L ^ var0)] = id.l;
      var4[true.k<invokedynamic>(31080, 4358398720212588854L ^ var0)] = pn.n;
      var4[true.k<invokedynamic>(19432, 5385942647966231485L ^ var0)] = vj.o;
      var4[true.k<invokedynamic>(26119, 6033504526377043522L ^ var0)] = vb.p;
      var4[true.k<invokedynamic>(13746, 2705543988323784190L ^ var0)] = u1.Z;
      var4[true.k<invokedynamic>(28678, 45412819894915142L ^ var0)] = pb.N;
      var4[true.k<invokedynamic>(24023, 6486907542973873561L ^ var0)] = lb.s;
      var4[true.k<invokedynamic>(17462, 6214616883401581695L ^ var0)] = ml.j;
      var4[true.k<invokedynamic>(31478, 605232048543095472L ^ var0)] = au.a;
      var4[true.k<invokedynamic>(7679, 4654887158696787375L ^ var0)] = v8.M;
      var4[true.k<invokedynamic>(2671, 8441259705960311333L ^ var0)] = bw.x;
      var4[true.k<invokedynamic>(5635, 5144606480235181634L ^ var0)] = xx.l;
      var4[true.k<invokedynamic>(11310, 9108109009760521333L ^ var0)] = gn.Y;
      var4[true.k<invokedynamic>(16275, 8691821665342595025L ^ var0)] = _7.V;
      var4[true.k<invokedynamic>(4817, 6893169762426532505L ^ var0)] = _y.f;
      var4[true.k<invokedynamic>(24984, 6198016347486372300L ^ var0)] = gk.E;
      var4[true.k<invokedynamic>(8702, 134336594838749604L ^ var0)] = q1.A;
      var4[true.k<invokedynamic>(14816, 2082736708810447275L ^ var0)] = v2.S;
      var4[true.k<invokedynamic>(80, 3511886164670816279L ^ var0)] = nf.s;
      var10001.plugAll(var4);
      k9[] var3 = var10000;

      try {
         if (var3 != null) {
            (new int[1]).A<invokedynamic>(new int[1], 1890827075558300038L, var0);
         }

      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 1873777467313100187L, var0);
      }
   }

   static {
      long var11 = a ^ 137251239986737L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("û\u0017X\u0006\u00839º#".getBytes("ISO-8859-1"));
      String var18 = a(var15).intern();
      boolean var10001 = true;
      b = var18;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[29];
      int var3 = 0;
      String var4 = "\rÊÖ\u000e\u00ad\u0087\u0001\u008cyÏ÷\tº8q\u001e\u0091·\u0093qê,þw]\u00825Ì =\u007fWh¤\\¼Jt\u009dñ-A\u0015ÏY±\u0088R\u0080\u0093Ô\u0090<ù»Ò`p-ïê~\u000b\u0007fÚ\u0018Ùíy\u0094ÖÑW\u0089%+j\u001e«!¡[×\u0013ÿ°\u0090\u0000¹\u001a4\"4èéëÖÖÃÀ6mKöÆ.óå\u001f¶¼ÄFØý+ÍåXgK\u008d;h\u0007R\u0097ò\u009a¹*úë\u0001`NO\u009d«wÖ\u0002\u009eÁØÁ\u0014õ|;\u0096\u00ad\u0083çòXZ#3TdÉ¼KºU\u00078ò\u0004BkaQKÜØ\u0015\u0082&5\u001eâ ã\u0012Ç?Ëv\u0089ct\u0097A!\r\u0082§÷ooî\u0006w\u0001Â+«Ê\t\u000eæÀÞ";
      int var5 = "\rÊÖ\u000e\u00ad\u0087\u0001\u008cyÏ÷\tº8q\u001e\u0091·\u0093qê,þw]\u00825Ì =\u007fWh¤\\¼Jt\u009dñ-A\u0015ÏY±\u0088R\u0080\u0093Ô\u0090<ù»Ò`p-ïê~\u000b\u0007fÚ\u0018Ùíy\u0094ÖÑW\u0089%+j\u001e«!¡[×\u0013ÿ°\u0090\u0000¹\u001a4\"4èéëÖÖÃÀ6mKöÆ.óå\u001f¶¼ÄFØý+ÍåXgK\u008d;h\u0007R\u0097ò\u009a¹*úë\u0001`NO\u009d«wÖ\u0002\u009eÁØÁ\u0014õ|;\u0096\u00ad\u0083çòXZ#3TdÉ¼KºU\u00078ò\u0004BkaQKÜØ\u0015\u0082&5\u001eâ ã\u0012Ç?Ëv\u0089ct\u0097A!\r\u0082§÷ooî\u0006w\u0001Â+«Ê\t\u000eæÀÞ".length();
      int var2 = 0;

      label29:
      while(true) {
         int var17 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var17, var2).getBytes("ISO-8859-1");
         long[] var16 = var6;
         var17 = var3++;
         long var19 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var21 = -1;

         while(true) {
            long var8 = var19;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var23 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch(var21) {
            case 0:
               var16[var17] = var23;
               if (var2 >= var5) {
                  c = var6;
                  d = new Integer[29];
                  return;
               }
               break;
            default:
               var16[var17] = var23;
               if (var2 < var5) {
                  continue label29;
               }

               var4 = "½Æòq!WÌã\u0019ÒÅ\u0096×\u0086P\u0099";
               var5 = "½Æòq!WÌã\u0019ÒÅ\u0096×\u0086P\u0099".length();
               var2 = 0;
            }

            var17 = var2;
            var2 += 8;
            var7 = var4.substring(var17, var2).getBytes("ISO-8859-1");
            var16 = var6;
            var17 = var3++;
            var19 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var21 = 0;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15187;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = c[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/aq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/aq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
