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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class cz extends c6 {
   @NotNull
   public static final cz y;
   private static int g;
   @NotNull
   private static qq n;
   private static final long a = j0.a(6496961458063900716L, 2392002672021325123L, MethodHandles.lookup().lookupClass()).a(241610156091526L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map i;

   private cz(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 100572193437708L;
      super(var3);
   }

   @NotNull
   public qq J(@NotNull class_1297 target, @NotNull qq currentRotation, long a, boolean attackTick) {
      // $FF: Couldn't be decompiled
   }

   private final float l(boolean var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 47177678491885L;
      String var6 = -7827467975890337622L.A<invokedynamic>(-7827467975890337622L, var2);

      float var7;
      float var8;
      label22: {
         int var10000;
         label21: {
            try {
               var10000 = var1;
               if (var6 != null) {
                  break label21;
               }

               if (var1 != 0) {
                  break label22;
               }
            } catch (NumberFormatException var14) {
               throw var14.A<invokedynamic>(var14, -7784043375253725868L, var2);
            }

            var10000 = s8.f(var4).field_6012;
         }

         var7 = (float)var10000 + 2.0F;
         var8 = (float)Math.sin((double)var7);
         double var9 = 0.2D * Math.sin(0.4D * (double)var7 * 0.7D + 1.23D);
         double var11 = (double)1 + 0.3D * Math.sin(0.4D * (double)var7 * 0.5D + 2.45D);
         float var13 = (float)(var11 * (double)var8 + var9);
         return var13 * 6.0F;
      }

      var7 = (float)s8.f(var4).field_6012;
      var8 = (float)Math.sin((double)var7) + gw.z(-0.1F, 0.1F, false);
      return var8 * 15.0F;
   }

   @NotNull
   public class_243 V(long a, @NotNull class_1297 target) {
      Intrinsics.checkNotNullParameter(var3, true.k<invokedynamic>(28797, 9177446377105975752L ^ var1));
      class_243 var10000 = var3.method_5829().method_1005();
      Intrinsics.checkNotNullExpressionValue(var10000, true.k<invokedynamic>(24940, 5120073807271852250L ^ var1));
      class_243 var4 = var10000;
      return new class_243(var4.field_1352, var4.field_1351, var4.field_1350);
   }

   static {
      long var20 = a ^ 134076066148573L;
      long var22 = var20 ^ 139982061836472L;
      long var24 = var20 ^ 41738555686863L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "\u0017+\u009cK~ü¥\u0003\u000eê$)søìw+²\u001a0£Ý§s\u0096²v\u0092c°-Ë\u0010¸Îâñ4\u0005ð¾\u0004\u0095\u009fS4e\u001fQ";
      int var17 = "\u0017+\u009cK~ü¥\u0003\u000eê$)søìw+²\u001a0£Ý§s\u0096²v\u0092c°-Ë\u0010¸Îâñ4\u0005ð¾\u0004\u0095\u009fS4e\u001fQ".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var26 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[4];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "ä©ÖZèáÐ\"N?í¦{$\u000f\u0005Ç\u0006çÙNy\u000eãï\u008b9Ý¶Ð!Í";
                  int var5 = "ä©ÖZèáÐ\"N?í¦{$\u000f\u0005Ç\u0006çÙNy\u000eãï\u008b9Ý¶Ð!Í".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     long[] var29 = var6;
                     var30 = var3++;
                     long var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var35 = -1;

                     while(true) {
                        long var8 = var34;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var37 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var35) {
                        case 0:
                           var29[var30] = var37;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[6];
                              y = new cz(var24);
                              n = new qq(0.0F, 0.0F, var22, false, (bc)null, true.a<invokedynamic>(5732, 3254415912861095774L ^ var20), (DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var29[var30] = var37;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0006\u009dÍ´_ï4ª6s\u009bè¹Ý\u009f$";
                           var5 = "\u0006\u009dÍ´_ï4ª6s\u009bè¹Ý\u009f$".length();
                           var2 = 0;
                        }

                        var30 = var2;
                        var2 += 8;
                        var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                        var29 = var6;
                        var30 = var3++;
                        var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var35 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "¾ä\u0015\u0013X¸\u009b7k||\u0082ª&\u0090¢Êº¢n\u0082Bjªø\u008b¢%q\u007f\u000fü\u0010v&Îr\u0017ÿ,\u0096åìñ°ó,Za";
               var17 = "¾ä\u0015\u0013X¸\u009b7k||\u0082ª&\u0090¢Êº¢n\u0082Bjªø\u008b¢%q\u007f\u000fü\u0010v&Îr\u0017ÿ,\u0096åìñ°ó,Za".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var26 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21831;
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
            throw new RuntimeException("su/catlean/cz", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/cz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7545;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/cz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/cz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
