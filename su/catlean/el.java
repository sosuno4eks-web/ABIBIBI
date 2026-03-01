package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class el {
   @NotNull
   public static final el X;
   @Nullable
   private static class_1511 v;
   private static final long a = j0.a(5180412481439873617L, 3537777363816415350L, MethodHandles.lookup().lookupClass()).a(236133681257782L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   private el() {
   }

   @Nullable
   public final class_1511 L() {
      return v;
   }

   public final void E(@Nullable class_1511 <set-?>) {
      v = var1;
   }

   @Nullable
   public final f_ y(@NotNull o6 $this$getCrystalToExplode, short a, int a, @NotNull ej configState, int a) {
      // $FF: Couldn't be decompiled
   }

   private final List M(o6 param1, long param2, ej param4) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_243 K(@NotNull class_243 vec, @NotNull ej configState, long a, @NotNull class_243 eyes) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static class_243 a(long var0, el var2, class_243 var3, ej var4, class_243 var5, int var6, Object var7) {
      var0 ^= a;
      long var8 = var0 ^ 12421820928467L;
      long var10 = var0 ^ 117657500457858L;
      long var12 = var0 ^ 60122608865462L;
      if ((var6 & 4) != 0) {
         var5 = ml.j.d(var12, (class_1297)s8.f(var8));
      }

      return var2.K(var3, var4, var10, var5);
   }

   @Nullable
   public final mg c(@NotNull o6 $this$canAttackCrystal, @NotNull class_243 pos, @NotNull ej configState, boolean secondaryCrystal, long a, int age) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 119463471158546L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[9];
      int var12 = 0;
      String var11 = "y\u0092¬\u001a,ü\u0018\u009d²\u009cù\u0011×\u0013\u001e&;·ðì:\u0089\u0095¥\u0002¹\n\u0089¢*\u00915\u0010éQ \u0001N~1z\\\u001b~ \"iÞë ÕC»WJ\u0092xE*ä\u001e9`n/\" \"×!\u0087\u00ad!\u0004M)sh¬\u0006Úz\u0010ÙÃ\u009e;^ç\u009eP°1U°Ö:á\u001a\u0010ºMÜ\u0003=ý\u0084åÿÆ>2OÏÉ8\u0010³\u0006\u0096ÙT\f»\u008c\u0089s»Þ\u0002\u0010\\ü\u0010\u0006zé|\u0013¡è\u0003lø{HðT\u0007¯";
      int var13 = "y\u0092¬\u001a,ü\u0018\u009d²\u009cù\u0011×\u0013\u001e&;·ðì:\u0089\u0095¥\u0002¹\n\u0089¢*\u00915\u0010éQ \u0001N~1z\\\u001b~ \"iÞë ÕC»WJ\u0092xE*ä\u001e9`n/\" \"×!\u0087\u00ad!\u0004M)sh¬\u0006Úz\u0010ÙÃ\u009e;^ç\u009eP°1U°Ö:á\u001a\u0010ºMÜ\u0003=ý\u0084åÿÆ>2OÏÉ8\u0010³\u0006\u0096ÙT\f»\u008c\u0089s»Þ\u0002\u0010\\ü\u0010\u0006zé|\u0013¡è\u0003lø{HðT\u0007¯".length();
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
                  c = new String[9];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -7223504422347960298L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  X = new el();
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

               var11 = "øäÖJÐîÿ£äq1\u000fæ^\u008e´¿Án\u0083£ÕÄÁ \f\u0081\u0007\"~K:Úß¢\u0088'~ô6Ñ)\u0089â\u009fÐ\u009d `9¡\u0086Akìh\u0013";
               var13 = "øäÖJÐîÿ£äq1\u000fæ^\u008e´¿Án\u0083£ÕÄÁ \f\u0081\u0007\"~K:Úß¢\u0088'~ô6Ñ)\u0089â\u009fÐ\u009d `9¡\u0086Akìh\u0013".length();
               var10 = 24;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19507;
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
            throw new RuntimeException("su/catlean/el", var10);
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
         throw new RuntimeException("su/catlean/el" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
