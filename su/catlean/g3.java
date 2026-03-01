package su.catlean;

import java.awt.Font;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class g3 {
   public static fc t;
   public static fc T;
   public static fc o;
   public static fc j;
   public static fc i;
   public static fc d;
   public static fc U;
   public static fc e;
   public static fc m;
   public static fc K;
   @NotNull
   private static final List l;
   private static k9[] X;
   private static final long a = j0.a(2470574114470096938L, 8779376643204672946L, MethodHandles.lookup().lookupClass()).a(159931241314250L);
   private static final String[] b;
   private static final String[] c;
   private static final Map f;

   @NotNull
   public static final fc D(long var0) {
      var0 ^= a;

      try {
         fc var10000 = t;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, 1475273060900860660L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(19732, 4626229985085392994L ^ var0));
      return null;
   }

   public static final void V(@NotNull fc <set-?>, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(15001, 6960249396607670590L ^ var1));
      t = var0;
   }

   @NotNull
   public static final fc C(long var0) {
      var0 ^= a;

      try {
         fc var10000 = T;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, 3814838979127661180L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(31688, 5291064477961756213L ^ var0));
      return null;
   }

   public static final void f(int a, int a, @NotNull fc <set-?>, int a) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(15001, 6960281857860178685L ^ var4));
      T = var2;
   }

   @NotNull
   public static final fc K(char var0, char var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;

      try {
         fc var10000 = o;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 7240159742257300215L, var3);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(3518, 7607306032882759878L ^ var3));
      return null;
   }

   public static final void U(@NotNull fc <set-?>, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(15001, 6960293144515066068L ^ var1));
      o = var0;
   }

   @NotNull
   public static final fc X(long var0) {
      var0 ^= a;

      try {
         fc var10000 = j;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, 4291753188744944898L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(2379, 527470845433111492L ^ var0));
      return null;
   }

   public static final void C(@NotNull fc <set-?>, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(15001, 6960221799454468205L ^ var1));
      j = var0;
   }

   @NotNull
   public static final fc H(int var0, int var1, char var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;

      try {
         fc var10000 = i;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -3654933606058218550L, var3);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(18467, 8942012498043884654L ^ var3));
      return null;
   }

   public static final void c(@NotNull fc <set-?>, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29991, 20577743558606411L ^ var1));
      i = var0;
   }

   @NotNull
   public static final fc R(long var0) {
      var0 ^= a;

      try {
         fc var10000 = d;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, 3147455946401434915L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(9413, 8768136739439861359L ^ var0));
      return null;
   }

   public static final void L(long a, @NotNull fc <set-?>) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(15001, 6960307166124892128L ^ var0));
      d = var2;
   }

   @NotNull
   public static final fc Y(long var0) {
      var0 ^= a;

      try {
         fc var10000 = U;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, 5831108934427719265L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(5237, 354171468946576794L ^ var0));
      return null;
   }

   public static final void M(@NotNull fc <set-?>, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(15001, 6960190590184702948L ^ var1));
      U = var0;
   }

   @NotNull
   public static final fc E(long var0) {
      var0 ^= a;

      try {
         fc var10000 = e;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, -1363904683346293857L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(28354, 4882849735493440209L ^ var0));
      return null;
   }

   public static final void z(long a, @NotNull fc <set-?>) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(15001, 6960250797654003027L ^ var0));
      e = var2;
   }

   @NotNull
   public static final fc b(int var0, int var1, short var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;

      try {
         fc var10000 = m;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -2993094965743701765L, var3);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(29720, 4526031830051222379L ^ var3));
      return null;
   }

   public static final void D(@NotNull fc <set-?>, long a, int a) {
      long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(15001, 6960202369297826278L ^ var4));
      m = var0;
   }

   @NotNull
   public static final fc V(long var0) {
      var0 ^= a;

      try {
         fc var10000 = K;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw var2.A<invokedynamic>(var2, 1173531157598500548L, var0);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.i<invokedynamic>(10111, 36304424329340472L ^ var0));
      return null;
   }

   public static final void o(@NotNull fc <set-?>, long a) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(15001, 6960278535847108079L ^ var1));
      K = var0;
   }

   @NotNull
   public static final List o() {
      return l;
   }

   @NotNull
   public static final Font H(float size, @NotNull String name, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(13049, 71339046464476980L ^ var2));
      ClassLoader var10001 = CatLean.class.getClassLoader();
      String var10004 = true.i<invokedynamic>(31340, 8688545631371206560L ^ var2);
      Font var10000 = Font.createFont(0, (InputStream)Objects.requireNonNull(var10001.getResourceAsStream(var10004 + var1 + true.i<invokedynamic>(22807, 9112849191113538768L ^ var2)))).deriveFont(0, var0);
      Intrinsics.checkNotNullExpressionValue(var10000, true.i<invokedynamic>(3976, 6254509449950915145L ^ var2));
      return var10000;
   }

   @NotNull
   public static final fc w(byte a, int a, float size, @NotNull String name, int a) {
      long var5 = ((long)var0 << 56 | (long)var1 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ a;
      long var7 = var5 ^ 76706808063956L;
      long var9 = var5 ^ 135236570526776L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(25431, 8486640121317466707L ^ var5));
      fc var11 = new fc(H(var2, var3, var9), H(var2, true.i<invokedynamic>(31564, 2255997255489337940L ^ var5), var9), var7, var2);
      l.add(var11);
      return var11;
   }

   static {
      long var9 = a ^ 55400551940892L;
      k9[] var10000 = new k9[5];
      f = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -7889892635710945788L, var9);
      Cipher var0;
      Cipher var11 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var11.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[18];
      int var5 = 0;
      String var4 = "\u0096-³\u008b 7GÉj<âè«¡<\u008c\u0010\u0088¯\u0006S\u000fk@\u0093\"ìÉ5PÕ6\u001e\u0010IÍÀhËòjÒèÛ\u0088à¦®¡ÿ(#ªñ}j\nô\nûÐÖ\u000b§£\"ú¢qB5ö\u000eµñ(â\u0098\u0080Bø*;%-k\"\u001eIÍ\u0001\u0010ÿÛ\u009b§\u0096¡dÆä\u00adsð\u0080x\u0013Q\u0010>\"»\u0082\u0083ÿ\nk¬³Z¸s¼\u0091 \u0010\u009a2-\u009dc\u00980fa*\u008cÉÈ\u0011b\u0089\u0010\u0087\u007f\u0091¸\u000fc9ìÜ\b5éÕC§ó\u0010\u001fBäå\fX.íÆNÒTÀ¥Þd\u0010Ö$a\u0012ãl\u001a\rQ\u009c¾¼¨óÐ=\u0010øç\u0085×m\u0094ã¨,ãíZ\u0098æç$\u0010ð5\u000f\u000fÿµl¤úØ\u0093lÂiR\u0013\u0010AI\"\u009e\u00ad°.ð\u008fZ&½Ñ×@s\u0010»yõ§4 þA\u008bÝ*\bw\u0003´¸ \u009b±\u001e\u0017±\u0097¿qÆ\\E\u0016Æ´Q\u0089ÅºC\u0003¯Y\u009e\u000fº(Î(u¢äl\u0010wb\u0086Ý$îÔ\u008a\u000b\u009b\u0083j\\\u0098\u008eñ";
      int var6 = "\u0096-³\u008b 7GÉj<âè«¡<\u008c\u0010\u0088¯\u0006S\u000fk@\u0093\"ìÉ5PÕ6\u001e\u0010IÍÀhËòjÒèÛ\u0088à¦®¡ÿ(#ªñ}j\nô\nûÐÖ\u000b§£\"ú¢qB5ö\u000eµñ(â\u0098\u0080Bø*;%-k\"\u001eIÍ\u0001\u0010ÿÛ\u009b§\u0096¡dÆä\u00adsð\u0080x\u0013Q\u0010>\"»\u0082\u0083ÿ\nk¬³Z¸s¼\u0091 \u0010\u009a2-\u009dc\u00980fa*\u008cÉÈ\u0011b\u0089\u0010\u0087\u007f\u0091¸\u000fc9ìÜ\b5éÕC§ó\u0010\u001fBäå\fX.íÆNÒTÀ¥Þd\u0010Ö$a\u0012ãl\u001a\rQ\u009c¾¼¨óÐ=\u0010øç\u0085×m\u0094ã¨,ãíZ\u0098æç$\u0010ð5\u000f\u000fÿµl¤úØ\u0093lÂiR\u0013\u0010AI\"\u009e\u00ad°.ð\u008fZ&½Ñ×@s\u0010»yõ§4 þA\u008bÝ*\bw\u0003´¸ \u009b±\u001e\u0017±\u0097¿qÆ\\E\u0016Æ´Q\u0089ÅºC\u0003¯Y\u009e\u000fº(Î(u¢äl\u0010wb\u0086Ý$îÔ\u008a\u000b\u009b\u0083j\\\u0098\u008eñ".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var12 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  c = new String[18];
                  l = (List)(new ArrayList());
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var16;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "7\u0093`ÉÄ\u0005\u001f#¬âFChûí\u009e\u0010$\u0016¨Ñb|ÕqÒÉé/\u0084ªä\u0006";
               var6 = "7\u0093`ÉÄ\u0005\u001f#¬âFChûí\u009e\u0010$\u0016¨Ñb|ÕqÒÉé/\u0084ªä\u0006".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   public static void C(k9[] var0) {
      X = var0;
   }

   public static k9[] L() {
      return X;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20553;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/g3", var10);
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
         throw new RuntimeException("su/catlean/g3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
