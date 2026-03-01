package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class no implements Comparator {
   private static int[] q;
   private static final long a = j0.a(5749998889032311535L, 6690259586754846969L, MethodHandles.lookup().lookupClass()).a(62575530437433L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   public final int compare(Object a, Object b) {
      long var3 = a ^ 136407268221311L;
      long var5 = var3 ^ 90465060556198L;
      long var7 = var3 ^ 12790647117254L;
      long var9 = var3 ^ 96961999516760L;
      -4375199424876088853L.A<invokedynamic>(-4375199424876088853L, var3);
      class_2338 var12 = (class_2338)var1;
      boolean var13 = false;

      i4 var10000;
      class_243 var10001;
      float var18;
      label39: {
         try {
            if (y5.o(var7, y5.l) == cr.FOV) {
               var18 = o3.X.U(var12, var9);
               break label39;
            }
         } catch (NumberFormatException var17) {
            throw var17.A<invokedynamic>(var17, -4385879901887701916L, var3);
         }

         var10000 = i4.v;
         var10001 = var12.method_46558();
         Intrinsics.checkNotNullExpressionValue(var10001, true.n<invokedynamic>(12883, 1972946924561653251L ^ var3));
         var18 = var10000.z(var10001, var5);
      }

      Comparable var19 = (Comparable)var18;
      var12 = (class_2338)var2;
      Comparable var14 = var19;
      var13 = false;

      label31: {
         try {
            if (y5.o(var7, y5.l) == cr.FOV) {
               var18 = o3.X.U(var12, var9);
               break label31;
            }
         } catch (NumberFormatException var16) {
            throw var16.A<invokedynamic>(var16, -4385879901887701916L, var3);
         }

         var10000 = i4.v;
         var10001 = var12.method_46558();
         Intrinsics.checkNotNullExpressionValue(var10001, true.n<invokedynamic>(10006, 7859280104395656007L ^ var3));
         var18 = var10000.z(var10001, var5);
      }

      try {
         int var20 = ComparisonsKt.compareValues(var14, (Comparable)var18);
         if (-4366259482988984819L.A<invokedynamic>(-4366259482988984819L, var3) == null) {
            (new int[3]).A<invokedynamic>(new int[3], -4449152642718145140L, var3);
         }

         return var20;
      } catch (NumberFormatException var15) {
         throw var15.A<invokedynamic>(var15, -4385879901887701916L, var3);
      }
   }

   public static void e(int[] var0) {
      q = var0;
   }

   public static int[] S() {
      return q;
   }

   static {
      long var9 = a ^ 137083068694144L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -7080098845923591565L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "Ö\u009bñ ¬3\u0087w¿Ðxì¸@7\u0084ù\u001fôM O`V (þ'<\nT¾Ü«\u0098è×äqº\bO\u0088\u0019\u007fe\u008bN!ù\u009f\u0014æDOG@";
      int var6 = "Ö\u009bñ ¬3\u0087w¿Ðxì¸@7\u0084ù\u001fôM O`V (þ'<\nT¾Ü«\u0098è×äqº\bO\u0088\u0019\u007fe\u008bN!ù\u009f\u0014æDOG@".length();
      char var3 = 24;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var12;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12001;
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
            throw new RuntimeException("su/catlean/no", var10);
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
         throw new RuntimeException("su/catlean/no" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
