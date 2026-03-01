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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class n3 extends nm {
   @NotNull
   public static final n3 m;
   private static int I;
   private static final long c = j0.a(-365488774438730334L, 2383358718149054434L, MethodHandles.lookup().lookupClass()).a(138134150159104L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;

   private n3(byte var1, int var2, int var3) {
      long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ c;
      long var6 = var4 ^ 60799947359503L;
      super(true.m<invokedynamic>(21731, 2591045975411332033L ^ var4), var6);
   }

   public void k(@NotNull class_332 context, long a) {
      long var10001 = var2 ^ 107625437959535L;
      int var4 = (int)((var2 ^ 107625437959535L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 58527580722751L;

      class_332 var10;
      n3 var10000;
      int var10002;
      String var10003;
      label17: {
         try {
            Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(5156, 8702164369954377104L ^ var2));
            var10000 = this;
            var10 = var1;
            var10002 = I;
            if ((Boolean)s8.H((short)var4, (short)var5, var6).field_1690.method_42433().method_41753()) {
               var10003 = 20394.m<invokedynamic>(20394, 6857985002719827484L ^ var2);
               break label17;
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, -1857899995499755171L, var2);
         }

         var10003 = 1908.m<invokedynamic>(1908, 6623439925340446401L ^ var2);
      }

      var10000.G(var10, var7, var10002 + " " + var10003);
   }

   public void Y(long param1, char param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var9 = c ^ 90823667101468L;
      long var10001 = var9 ^ 112326473225791L;
      int var11 = (int)((var9 ^ 112326473225791L) >>> 56);
      int var12 = (int)(var10001 << 8 >>> 32);
      int var13 = (int)(var10001 << 40 >>> 40);
      i = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "\u009eòeÉë6\u009a7)\u0007æÒd\u0086ýì¬yèyV\u0012W7\u0010´\n\u00ad\u0099ë\u009d\u0086\u0087¬]·\u0003ê\u0013ò\u0006";
      int var6 = "\u009eòeÉë6\u009a7)\u0007æÒd\u0086ýì¬yèyV\u0012W7\u0010´\n\u00ad\u0099ë\u009d\u0086\u0087¬]·\u0003ê\u0013ò\u0006".length();
      char var3 = 24;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var14 = var4.substring(var2, var2 + var3);
         byte var16 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch(var16) {
            case 0:
               var7[var5++] = var19;
               if ((var2 += var3) >= var6) {
                  d = var7;
                  e = new String[4];
                  m = new n3((byte)var11, var12, var13);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var19;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\u0002?mX\u008bMõ9°:éÇ\u009f \u0092É\u0010ÄP5AC!'úeå\u001c\u008f\u00075k\u0017";
               var6 = "\u0002?mX\u008bMõ9°:éÇ\u009f \u0092É\u0010ÄP5AC!'úeå\u001c\u008f\u00075k\u0017".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var14 = var4.substring(var2, var2 + var3);
            var16 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32257;
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
            throw new RuntimeException("su/catlean/n3", var10);
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
         throw new RuntimeException("su/catlean/n3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
