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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zn extends zf {
   private static final long b = j0.a(-277299369353421605L, 671804080431726875L, MethodHandles.lookup().lookupClass()).a(170801945733264L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long j;

   public zn(@NotNull String id, long a, @NotNull zu defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var2 ^= b;
      long var7 = var2 ^ 107803279364324L;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(3401, 5698796121993786477L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.l<invokedynamic>(20246, 6070301433352025651L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.l<invokedynamic>(16747, 155983119496050764L ^ var2));
      super(var1, var4, (Object)null, var7, var5, var6, 4, (DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public zn(String var1, long var2, zu var4, pj var5, Function0 var6, int var7, DefaultConstructorMarker var8) {
      var2 ^= b;
      long var9 = var2 ^ 12922101329535L;
      if ((var7 & 4) != 0) {
         var5 = null;
      }

      if ((var7 & (int)j) != 0) {
         var6 = zn::P;
      }

      this(var1, var9, var4, var5, var6);
   }

   public void n(long a, @NotNull String setting) {
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(14607, 2449888911135080416L ^ var1));
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 61773573321747L;
      return true.l<invokedynamic>(26300, 712409236218578633L ^ var1);
   }

   private static final boolean P() {
      return true;
   }

   static {
      long var5 = b ^ 102372913154402L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "\u0094».W\u001bÈ\u0084\u008f\u001bGþ\u0082ªÿ:\u0099\u0010\u000bUxüOÁö\u0018Ø\u007fB_e·\u0094´\u0010l}Í^Õ,vÒ04\u00857\u0093±qú";
      int var13 = "\u0094».W\u001bÈ\u0084\u008f\u001bGþ\u0082ªÿ:\u0099\u0010\u000bUxüOÁö\u0018Ø\u007fB_e·\u0094´\u0010l}Í^Õ,vÒ04\u00857\u0093±qú".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  d = var14;
                  h = new String[5];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 275689972969098278L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  j = var23;
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

               var11 = "àV§Ôq¬´\u009d\u000bú)ÒËX\u0016|\u009b:¨²ä7T\u000bÌFJq¹\u0000¬?\u0010\u0099eG8\u0005¿Lª{ÝÃ2?kz¤";
               var13 = "àV§Ôq¬´\u009d\u000bú)ÒËX\u0016|\u009b:¨²ä7T\u000bÌFJq¹\u0000¬?\u0010\u0099eG8\u0005¿Lª{ÝÃ2?kz¤".length();
               var10 = ' ';
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31360;
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
            throw new RuntimeException("su/catlean/zn", var10);
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
         throw new RuntimeException("su/catlean/zn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
