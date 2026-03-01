package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cf {
   @NotNull
   private final List e;
   private static String c;
   private static final long a = j0.a(5265289817994236157L, 8174213243984317752L, MethodHandles.lookup().lookupClass()).a(61627254116663L);
   private static final String[] b;
   private static final String[] d;
   private static final Map f;

   public cf(@NotNull List items, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(27608, 3798350520640642091L ^ var2));
      super();
      this.e = var1;
   }

   @NotNull
   public final List U() {
      return this.e;
   }

   @NotNull
   public final class_243 G(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 140705517580133L;
      long var5 = var1 ^ 135913923008731L;
      String var7 = -5494638021594076679L.A<invokedynamic>(-5494638021594076679L, var1);

      try {
         if (this.e.isEmpty()) {
            class_243 var18 = class_243.field_1353;
            Intrinsics.checkNotNullExpressionValue(var18, true.j<invokedynamic>(18090, 6871291686550373973L ^ var1));
            return var18;
         }
      } catch (NumberFormatException var16) {
         throw var16.A<invokedynamic>(var16, -5585936545127005242L, var1);
      }

      double var8 = 0.0D;
      double var10 = 0.0D;
      double var12 = 0.0D;
      Iterator var14 = this.e.iterator();

      label28:
      while(true) {
         Object var10000;
         int var17;
         if (var14.hasNext()) {
            var10000 = var14.next();
         } else {
            var10000 = this.e;
            if (var1 > 0L) {
               var17 = ((List)var10000).size();
               return new class_243(var8 / (double)var17, var10 / (double)var17 + 0.7D, var12 / (double)var17);
            }
         }

         do {
            class_1542 var15 = (class_1542)var10000;
            var8 += gk.E.w(var15.field_6014, var3, b6.R(var5, (class_1297)var15).field_1352);
            var10 += gk.E.w(var15.field_6036, var3, b6.R(var5, (class_1297)var15).field_1351);
            var12 += gk.E.w(var15.field_5969, var3, b6.R(var5, (class_1297)var15).field_1350);
            if (var7 != null) {
               continue label28;
            }

            var10000 = this.e;
         } while(var1 <= 0L);

         var17 = ((List)var10000).size();
         return new class_243(var8 / (double)var17, var10 / (double)var17 + 0.7D, var12 / (double)var17);
      }
   }

   @NotNull
   public final List O(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final List h() {
      return this.e;
   }

   @NotNull
   public final cf f(long a, byte a, @NotNull List items) {
      long var5 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
      long var7 = var5 ^ 72070303311895L;
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(15092, 2185735931925121258L ^ var5));
      return new cf(var4, var7);
   }

   public static cf n(long var0, cf var2, List var3, int var4, Object var5) {
      var0 ^= a;
      long var10001 = var0 ^ 69837583620268L;
      long var6 = (var0 ^ 69837583620268L) >>> 8;
      int var8 = (int)(var10001 << 56 >>> 56);
      if ((var4 & 1) != 0) {
         var3 = var2.e;
      }

      return var2.f(var6, (byte)var8, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 116121693204381L;
      List var10000 = this.e;
      String var10002 = true.j<invokedynamic>(29758, 3864835240071152692L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.e.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public static void v(String var0) {
      c = var0;
   }

   public static String e() {
      return c;
   }

   static {
      long var9 = a ^ 59291359210563L;
      f = new HashMap(13);
      "ayd0bb".A<invokedynamic>("ayd0bb", -9164024817380232918L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "5%ÒÝ\u0085¡M\u00ad0Ëi$F\u0096k2â@'>Ð\u008f}à(àÏ,o»K±\t>Á9\u0097\n¤\u0002jL(<ì\u0013>_ñ\u008bèÛ@½\u0007[\u001e\u00183¶µ\u008a~#\u0097\u0010;\u00adt-ì\bäÁ¡G9Ü¤{'Û";
      int var6 = "5%ÒÝ\u0085¡M\u00ad0Ëi$F\u0096k2â@'>Ð\u008f}à(àÏ,o»K±\t>Á9\u0097\n¤\u0002jL(<ì\u0013>_ñ\u008bèÛ@½\u0007[\u001e\u00183¶µ\u008a~#\u0097\u0010;\u00adt-ì\bäÁ¡G9Ü¤{'Û".length();
      char var3 = 24;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var11 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var15;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  d = new String[5];
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var15;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "yþz\u0086²!z×\u009f_XôÅ\u0007ù£\u0010÷®ó¨Îán[\u0085])®EÕ\u0098ö";
               var6 = "yþz\u0086²!z×\u009f_XôÅ\u0007ù£\u0010÷®ó¨Îán[\u0085])®EÕ\u0098ö".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var11 = var4.substring(var2, var2 + var3);
            var10001 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29291;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/cf", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/cf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
