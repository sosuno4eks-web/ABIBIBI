package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class id {
   @NotNull
   public static final id l;
   @NotNull
   private static final ArrayList B;
   private static boolean I;
   private static final long a = j0.a(9076902524234505261L, 1655367596142802056L, MethodHandles.lookup().lookupClass()).a(17179352316863L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   private id() {
   }

   @Flow
   private final void Z(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void k(PlayerUpdateEvent var1) {
      B.removeIf(id::N);
   }

   public final boolean y(@NotNull ft p) {
      Intrinsics.checkNotNullParameter(var1, "p");
      return B.add(var1);
   }

   private static final boolean T(ft var0) {
      long var1 = a ^ 80280083474518L;
      long var3 = var1 ^ 57075216631468L;
      Intrinsics.checkNotNullParameter(var0, true.v<invokedynamic>(14005, 9208082303642715315L ^ var1));
      return var0.a(var3);
   }

   private static final boolean N(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var14 = a ^ 98199950846062L;
      d = new HashMap(13);
      false.A<invokedynamic>(false, -7763686959821067622L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "ÞjX!b³Æ¶[FÒ5'¡å\u0004\u0084\u0090wGý°)\f\u0010Ù\u000bµï9!¾ÞÜÜb\u0091N\u001bYú\u0018¤*\u008fæ\u009e]*\u00835bÕ,\u009b¯\u0006\ryP6¡A\u0086k\u0005(\u0080\u001f]¢ªãª\u001cLp~c\u0089¸{¢T\u0004\u000f\u0095Yr\u0016¼v\u0094fë)/íS5U\u009b\u0014\u009a\"\u0086Í";
      int var11 = "ÞjX!b³Æ¶[FÒ5'¡å\u0004\u0084\u0090wGý°)\f\u0010Ù\u000bµï9!¾ÞÜÜb\u0091N\u001bYú\u0018¤*\u008fæ\u009e]*\u00835bÕ,\u009b¯\u0006\ryP6¡A\u0086k\u0005(\u0080\u001f]¢ªãª\u001cLp~c\u0089¸{¢T\u0004\u000f\u0095Yr\u0016¼v\u0094fë)/íS5U\u009b\u0014\u009a\"\u0086Í".length();
      char var8 = 24;
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
                  b = var12;
                  c = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -627299451425032431L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  l = new id();
                  B = new ArrayList();
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

               var9 = "7EV²Ñ\u009c\\\u0084\u0098&¹4íq\u0018ã\r¼À\u009c¹¢´½0Á#\r\u0080mÐ\u0091jkX\u0011\u000fÇ\u008f\u0012Ù0Úc\u0081yë¼Å\tÑz\u0002\f¹ê¤u¨9¡p´r³ú\u00152\u0018eâÒ¤";
               var11 = "7EV²Ñ\u009c\\\u0084\u0098&¹4íq\u0018ã\r¼À\u009c¹¢´½0Á#\r\u0080mÐ\u0091jkX\u0011\u000fÇ\u008f\u0012Ù0Úc\u0081yë¼Å\tÑz\u0002\f¹ê¤u¨9¡p´r³ú\u00152\u0018eâÒ¤".length();
               var8 = 24;
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void S(boolean var0) {
      I = var0;
   }

   public static boolean G() {
      return I;
   }

   public static boolean V() {
      boolean var0 = G();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9993;
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
            throw new RuntimeException("su/catlean/id", var10);
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
         throw new RuntimeException("su/catlean/id" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
