package su.catlean;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zv extends zf {
   private static String[] J;
   private static final long b = j0.a(-4562364207877443804L, 8918654837151542078L, MethodHandles.lookup().lookupClass()).a(207124399808692L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i;
   private static final long j;

   public zv(@NotNull String id, @NotNull Color defaultValue, @Nullable pj group, @NotNull Function0 visible, long a) {
      var5 ^= b;
      long var7 = var5 ^ 767086443879L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(10581, 5470078422845805958L ^ var5));
      Intrinsics.checkNotNullParameter(var2, true.c<invokedynamic>(21897, 8991543327014103384L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(26036, 6586809054042397030L ^ var5));
      super(var1, var2, (Object)null, var7, var3, var4, 4, (DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public zv(long var1, String var3, Color var4, pj var5, Function0 var6, int var7, DefaultConstructorMarker var8) {
      var1 ^= b;
      long var9 = var1 ^ 103878388232305L;
      if ((var7 & 4) != 0) {
         var5 = null;
      }

      if ((var7 & (int)j) != 0) {
         var6 = zv::w;
      }

      this(var3, var4, var5, var6, var9);
   }

   public void n(long a, @NotNull String setting) {
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(27582, 3116528190268261668L ^ var1));
      this.v(new Color(Integer.parseInt(var3), true));
   }

   @NotNull
   public String toString() {
      return String.valueOf(((Color)this.B()).getRGB());
   }

   private static final boolean w() {
      return true;
   }

   public static void i(String[] var0) {
      J = var0;
   }

   public static String[] E() {
      return J;
   }

   static {
      long var14 = b ^ 19445505588665L;
      i = new HashMap(13);
      null.A<invokedynamic>((Object)null, -3299027135385676175L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[4];
      int var10 = 0;
      String var9 = "\u0006ôø!w\u008fºl¤\u0081äcfÉ\u0002§\u0010á?,aö½\u0093ÿåAE\u008c\u0013\u001aoÍ";
      int var11 = "\u0006ôø!w\u008fºl¤\u0081äcfÉ\u0002§\u0010á?,aö½\u0093ÿåAE\u008c\u0013\u001aoÍ".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var16 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = b(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var21;
               if ((var7 += var8) >= var11) {
                  d = var12;
                  h = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1845487223342787369L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  j = var23;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var21;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "§¡!4¢\u008b¿óï\u000f¿Ð!¬{V\u0018Sý\u0094èujæ¥ã¾=£@+\u009b\u00041\u007fá½\u000füè\u0013";
               var11 = "§¡!4¢\u008b¿óï\u000f¿Ð!¬{V\u0018Sý\u0094èujæ¥ã¾=£@+\u009b\u00041\u007fá½\u000füè\u0013".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4855;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zv", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/zv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
