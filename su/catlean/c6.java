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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public abstract class c6 {
   @NotNull
   private class_243 w;
   private static k9[] h;
   private static final long ab = j0.a(5195275657351140253L, 3996438825134264518L, MethodHandles.lookup().lookupClass()).a(58979978559319L);
   private static final String[] cb;
   private static final String[] db;
   private static final Map eb;
   private static final long ib;

   public c6(long var1) {
      var1 ^= ab;
      super();
      class_243 var10001 = class_243.field_1353;
      Intrinsics.checkNotNullExpressionValue(var10001, true.t<invokedynamic>(6914, 4582786925554054862L ^ var1));
      this.w = var10001;
   }

   @NotNull
   public abstract qq J(@NotNull class_1297 var1, @NotNull qq var2, long var3, boolean var5);

   @NotNull
   public class_243 V(long a, @NotNull class_1297 target) {
      // $FF: Couldn't be decompiled
   }

   public boolean r() {
      return true;
   }

   public boolean w() {
      return true;
   }

   public static void U(k9[] var0) {
      h = var0;
   }

   public static k9[] d() {
      return h;
   }

   static {
      long var14 = ab ^ 71114005451588L;
      eb = new HashMap(13);
      null.A<invokedynamic>((Object)null, 9141507405763918479L, var14);
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
      String var9 = "¹\u0004³«]q\u008fbt1\u0093\u0088'\b¢M(\u0087\u001dë{E$9Ä'ßp\u00002RZYD¸ìºK\u008dâèìøOéÞMÎ?³²ª|´[+I";
      int var11 = "¹\u0004³«]q\u008fbt1\u0093\u0088'\b¢M(\u0087\u001dë{E$9Ä'ßp\u00002RZYD¸ìºK\u008dâèìøOéÞMÎ?³²ª|´[+I".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var16 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var21;
               if ((var7 += var8) >= var11) {
                  cb = var12;
                  db = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -9137420868943209256L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  ib = var23;
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

               var9 = "z\u0087Hþ \u009aµ\u0016\"£\u0017í:/\u0099ãï¸½ê\u00adç^¦PHM{U<p~\u0010Fr\tè\u008dµ%}\u001c\u0015*\u0002oã'@";
               var11 = "z\u0087Hþ \u009aµ\u0016\"£\u0017í:/\u0099ãï¸½ê\u00adç^¦PHM{U<p~\u0010Fr\tè\u008dµ%}\u001c\u0015*\u0002oã'@".length();
               var8 = ' ';
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13970;
      if (db[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])eb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/c6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = cb[var5].getBytes("ISO-8859-1");
         db[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return db[var5];
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
         throw new RuntimeException("su/catlean/c6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
