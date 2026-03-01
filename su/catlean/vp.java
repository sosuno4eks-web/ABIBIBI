package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class vp implements xd {
   @NotNull
   private final Json N;
   @NotNull
   private final File C;
   public zw H;
   private static boolean t;
   private static final long a = j0.a(8482303137219059375L, 733334640613306951L, MethodHandles.lookup().lookupClass()).a(103262147764874L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public vp(long a, @NotNull Json json) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(28126, 4722513543403737305L ^ var1));
      super();
      this.N = var3;
      this.C = new File(kf.e(), true.f<invokedynamic>(1605, 7334600446740167488L ^ var1));
   }

   @NotNull
   public final zw A(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void J(long a, @NotNull zw <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(30636, 7049568889527499082L ^ var1));
      this.H = var3;
   }

   public void N(long var1) {
      long var3 = var1 ^ 79499455331793L;
      long var5 = var1 ^ 12378465845514L;

      vp var10000;
      zw var10001;
      label29: {
         try {
            var10000 = this;
            if (this.C.createNewFile()) {
               var10001 = new zw((String)null, var5, (String)null, (String)null, (String)null, false, true.b<invokedynamic>(5626, 4296937192947226553L ^ var1), (DefaultConstructorMarker)null);
               break label29;
            }
         } catch (Exception var12) {
            throw var12.A<invokedynamic>(var12, 62458191229484932L, var1);
         }

         vp var10 = var10000;

         zw var7;
         try {
            var10000 = var10;
            Json var13 = this.N;
            String var8 = FilesKt.readText$default(this.C, (Charset)null, 1, (Object)null);
            boolean var9 = false;
            var13.getSerializersModule();
            var7 = (zw)var13.decodeFromString((DeserializationStrategy)zw.w.h(), var8);
         } catch (Exception var11) {
            var10000 = var10;
            s8.T().warn(true.f<invokedynamic>(21806, 1297995478806718953L ^ var1));
            var7 = new zw((String)null, var5, (String)null, (String)null, (String)null, false, true.b<invokedynamic>(16875, 2320996372861502377L ^ var1), (DefaultConstructorMarker)null);
         }

         var10001 = var7;
      }

      var10000.J(var3, var10001);
   }

   public void i(long var1) {
      long var3 = var1 ^ 59766352215292L;
      File var10000 = this.C;
      Json var5 = this.N;
      zw var6 = this.A(var3);
      boolean var7 = false;
      var5.getSerializersModule();
      FilesKt.writeText$default(var10000, var5.encodeToString((SerializationStrategy)zw.w.h(), var6), (Charset)null, 2, (Object)null);
   }

   public static void I(boolean var0) {
      t = var0;
   }

   public static boolean Y() {
      return t;
   }

   public static boolean h() {
      boolean var0 = Y();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a((Exception)var1);
      }
   }

   static {
      long var20 = a ^ 135324028249070L;
      d = new HashMap(13);
      true.A<invokedynamic>(true, -1359841415421287722L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "\u0005Q\u00983£vò\u0087+\nGM\u00814öl$Zm\u0095·R]\u0082;ê°¢ÓDò%u!!\u0080(\u001fE*ÛAúZÜ\u0093æ\u009bÜ\"r\u009dõC°\u0090º®j\u0016¦\bcÖ\u0000ä\"Ã\u0080\u0003ÎâÈi\rÔ\fîv¢]ÃöÈv\u0015\u0013{ Í¨æ\u008c\u001aJ½®Â\u0094Ç)6PøEabkD\u0003»\u000e\u001c<Çq\u0089tDó\u001b\u0010îbãø\"J£àü\u0011Xô\u000f(²´";
      int var17 = "\u0005Q\u00983£vò\u0087+\nGM\u00814öl$Zm\u0095·R]\u0082;ê°¢ÓDò%u!!\u0080(\u001fE*ÛAúZÜ\u0093æ\u009bÜ\"r\u009dõC°\u0090º®j\u0016¦\bcÖ\u0000ä\"Ã\u0080\u0003ÎâÈi\rÔ\fîv¢]ÃöÈv\u0015\u0013{ Í¨æ\u008c\u001aJ½®Â\u0094Ç)6PøEabkD\u0003»\u000e\u001c<Çq\u0089tDó\u001b\u0010îbãø\"J£àü\u0011Xô\u000f(²´".length();
      char var14 = 'X';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var27;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[5];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "\u0002zÄîk\u00827[Û\u0001¡@1Ï\u009fÒ";
                  int var5 = "\u0002zÄîk\u00827[Û\u0001¡@1Ï\u009fÒ".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[2];
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var27;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u009d/\u0013ßAë>l~FÞ½\u0083Ã¢¬\u0010Ã¸98èuha\u009dZOä\u0088\u009eÊç";
               var17 = "\u009d/\u0013ßAë>l~FÞ½\u0083Ã¢¬\u0010Ã¸98èuha\u009dZOä\u0088\u009eÊç".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15864;
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
            throw new RuntimeException("su/catlean/vp", var10);
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
         throw new RuntimeException("su/catlean/vp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 892;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/vp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/vp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
