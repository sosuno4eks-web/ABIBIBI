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
import org.jetbrains.annotations.NotNull;

public final class fd implements im {
   @NotNull
   public static final fd Z;
   private static int r;
   private static final long a = j0.a(5109641707570886973L, 773887881070086056L, MethodHandles.lookup().lookupClass()).a(159823113880195L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private fd() {
   }

   public final boolean X(boolean onlyWeapon, @NotNull m0 switchMode, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void U(short a, boolean silent, int a, char a) {
      // $FF: Couldn't be decompiled
   }

   public static void W(fd var0, boolean var1, int var2, char var3, int var4, char var5, Object var6) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var10001 = var7 ^ 81894945168931L;
      int var9 = (int)((var7 ^ 81894945168931L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      int[] var12 = 3037265862022419236L.A<invokedynamic>(3037265862022419236L, var7);

      label21: {
         int var10000;
         label20: {
            try {
               var10000 = var4 & 1;
               if (var12 == null) {
                  break label20;
               }

               if (var10000 == 0) {
                  break label21;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, 3058167522410011040L, var7);
            }

            var10000 = 0;
         }

         var1 = var10000;
      }

      var0.U((short)var9, (boolean)var1, var10, (char)var11);
   }

   public void b(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void r(long a, @NotNull qq rotation) {
      long var10001 = var1 ^ 103265957764613L;
      int var4 = (int)((var1 ^ 103265957764613L) >>> 56);
      long var5 = var10001 << 8 >>> 8;
      long var7 = var1 ^ 111624037492811L;

      try {
         Intrinsics.checkNotNullParameter(var3, true.x<invokedynamic>(24388, 5653607361554750261L ^ var1));
         if (od.B.U(var7) == m0.SILENT) {
            this.G((byte)var4, var5);
         }

      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 3632384081417109944L, var1);
      }
   }

   public void v(int var1, int var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 80941568104843L;
      int var6 = (int)((var4 ^ 80941568104843L) >>> 56);
      long var7 = var10001 << 8 >>> 8;
      this.G((byte)var6, var7);
   }

   public final void G(byte param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 74835155393084L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u000e\u0018¸\u0081Îã¤*9aþ¯\u009cÆ¦Ù÷ e|~q\u0012Ï\u001fêà\u0092¶\u0015Mz(6¦ ßß<Öç¹b\u0090\u0096\u0015'úP¸\u001f\bÉ \u009c\u009f¡p\u0093÷\u009bÚå½¥ªNJá\u0097»R4 qîÿk<\u000e&\tj8ø¬\u0014\u0016'\u0090aöÕRô¾¢W\u0005\u0013j¨Y\u0016D~";
      int var8 = "\u000e\u0018¸\u0081Îã¤*9aþ¯\u009cÆ¦Ù÷ e|~q\u0012Ï\u001fêà\u0092¶\u0015Mz(6¦ ßß<Öç¹b\u0090\u0096\u0015'úP¸\u001f\bÉ \u009c\u009f¡p\u0093÷\u009bÚå½¥ªNJá\u0097»R4 qîÿk<\u000e&\tj8ø¬\u0014\u0016'\u0090aöÕRô¾¢W\u0005\u0013j¨Y\u0016D~".length();
      char var5 = ' ';
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            Z = new fd();
            r = -1;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30579;
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
            throw new RuntimeException("su/catlean/fd", var10);
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
         throw new RuntimeException("su/catlean/fd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
