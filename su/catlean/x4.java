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

public final class x4 implements Comparator {
   private static final long a = j0.a(7399794360720591880L, 3348897606510134582L, MethodHandles.lookup().lookupClass()).a(74937211933330L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public final int compare(Object a, Object b) {
      long var3 = a ^ 74817372339413L;
      long var5 = var3 ^ 132490506215005L;
      long var7 = var3 ^ 36949028619837L;
      long var9 = var3 ^ 125444884670371L;
      int[] var10000 = 5814993146333356560L.A<invokedynamic>(5814993146333356560L, var3);
      class_2338 var12 = (class_2338)var1;
      int[] var11 = var10000;
      boolean var13 = false;

      class_243 var10001;
      i4 var18;
      float var19;
      label39: {
         try {
            if (y5.o(var7, y5.l) == cr.FOV) {
               var19 = o3.X.U(var12, var9);
               break label39;
            }
         } catch (NumberFormatException var17) {
            throw var17.A<invokedynamic>(var17, 5798594527619465990L, var3);
         }

         var18 = i4.v;
         var10001 = var12.method_46558();
         Intrinsics.checkNotNullExpressionValue(var10001, true.l<invokedynamic>(19801, 2640857656111035940L ^ var3));
         var19 = var18.z(var10001, var5);
      }

      Comparable var20 = (Comparable)var19;
      var12 = (class_2338)var2;
      Comparable var14 = var20;
      var13 = false;

      label31: {
         try {
            if (y5.o(var7, y5.l) == cr.FOV) {
               var19 = o3.X.U(var12, var9);
               break label31;
            }
         } catch (NumberFormatException var16) {
            throw var16.A<invokedynamic>(var16, 5798594527619465990L, var3);
         }

         var18 = i4.v;
         var10001 = var12.method_46558();
         Intrinsics.checkNotNullExpressionValue(var10001, true.l<invokedynamic>(26089, 4966072469641256597L ^ var3));
         var19 = var18.z(var10001, var5);
      }

      try {
         int var21 = ComparisonsKt.compareValues(var14, (Comparable)var19);
         if (var11 != null) {
            (new int[3]).A<invokedynamic>(new int[3], 5793801093743219676L, var3);
         }

         return var21;
      } catch (NumberFormatException var15) {
         throw var15.A<invokedynamic>(var15, 5798594527619465990L, var3);
      }
   }

   static {
      long var0 = a ^ 78949185450515L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Ílp½ÿ\bOu%£,ç^î\u008d\u0097CLÍ1¼¬ìï jã\bèÅÃz³\u0096«\u0097¨¾J*N\u0000\u0006²ºs\u007fR\u0092\rô©ý·\rØÐ";
      int var8 = "Ílp½ÿ\bOu%£,ç^î\u008d\u0097CLÍ1¼¬ìï jã\bèÅÃz³\u0096«\u0097¨¾J*N\u0000\u0006²ºs\u007fR\u0092\rô©ý·\rØÐ".length();
      char var5 = 24;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27190;
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
            throw new RuntimeException("su/catlean/x4", var10);
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
         throw new RuntimeException("su/catlean/x4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
