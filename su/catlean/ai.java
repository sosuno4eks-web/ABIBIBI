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

public final class ai extends a_ {
   @NotNull
   private final zf t;
   @NotNull
   private final aa R;
   private static final long a = j0.a(-7177483669274656398L, 1598934677752783360L, MethodHandles.lookup().lookupClass()).a(54043906474830L);
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;
   private static final long l;

   public ai(@NotNull zf setting, long a) {
      var2 ^= a;
      long var4 = var2 ^ 96473499126350L;
      long var10001 = var2 ^ 20027369005093L;
      int var6 = (int)((var2 ^ 20027369005093L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(27118, 3834084927111079682L ^ var2));
      super(var4, var1);
      this.t = var1;
      this.R = new aa(sa.OUT_QUINT, l, (short)var6, (short)var7, var8);
   }

   @NotNull
   public zf t() {
      return this.t;
   }

   public void v(@NotNull class_332 context, long a, char a, int mouseX, int mouseY, float factor) {
      // $FF: Couldn't be decompiled
   }

   public void d(double mouseX, double mouseY, long a, int button) {
   }

   public void x(double mouseX, double mouseY, int button) {
   }

   public void Z(long a, int key) {
   }

   public void G(long a, char char) {
   }

   public boolean i(int a, int a, int a, double mouseX, double mouseY, double verticalAmount) {
      return false;
   }

   public void e() {
   }

   static {
      long var16 = a ^ 92760080729342L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[3];
      int var23 = 0;
      String var22 = "_.\b\u00adþf\u0093\u0004\u0006\u0089KoSZBè\u001061N¾|\u009eÒ5ÏßCRºZ;Ñ }j5\u0014\u0000Ôà\u0013GÆ¹ç[#\t\u0014V'½\\¥,EhË\u0005¯ÈÒðE\u001c";
      int var24 = "_.\b\u00adþf\u0093\u0004\u0006\u0089KoSZBè\u001061N¾|\u009eÒ5ÏßCRºZ;Ñ }j5\u0014\u0000Ôà\u0013GÆ¹ç[#\t\u0014V'½\\¥,EhË\u0005¯ÈÒðE\u001c".length();
      char var21 = 16;
      int var20 = -1;

      while(true) {
         ++var20;
         byte[] var26 = var18.doFinal(var22.substring(var20, var20 + var21).getBytes("ISO-8859-1"));
         String var30 = b(var26).intern();
         boolean var10001 = true;
         var25[var23++] = var30;
         if ((var20 += var21) >= var24) {
            c = var25;
            g = new String[3];
            k = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var6 = 1; var6 < 8; ++var6) {
               var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[5];
            int var8 = 0;
            String var9 = "sÿIFE¬RPÙk\u001e#Ì<\u0004\u0017\u001cçF`a\u000f\u0010.";
            int var10 = "sÿIFE¬RPÙk\u001e#Ì<\u0004\u0017\u001cçF`a\u000f\u0010.".length();
            int var7 = 0;

            label42:
            while(true) {
               int var29 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var29, var7).getBytes("ISO-8859-1");
               long[] var27 = var11;
               var29 = var8++;
               long var32 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
               byte var33 = -1;

               while(true) {
                  long var13 = var32;
                  byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                  long var36 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                  switch(var33) {
                  case 0:
                     var27[var29] = var36;
                     if (var7 >= var10) {
                        i = var11;
                        j = new Integer[5];
                        Cipher var0;
                        var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                        var10002 = SecretKeyFactory.getInstance("DES");
                        var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                        for(int var1 = 1; var1 < 8; ++var1) {
                           var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                        }

                        var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                        long var2 = -7810854899047513059L;
                        byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                        var32 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                        var10001 = true;
                        l = var32;
                        return;
                     }
                     break;
                  default:
                     var27[var29] = var36;
                     if (var7 < var10) {
                        continue label42;
                     }

                     var9 = "ák\u008cEßÿ+?\u0000²+â¼\u001b#t";
                     var10 = "ák\u008cEßÿ+?\u0000²+â¼\u001b#t".length();
                     var7 = 0;
                  }

                  var29 = var7;
                  var7 += 8;
                  var12 = var9.substring(var29, var7).getBytes("ISO-8859-1");
                  var27 = var11;
                  var29 = var8++;
                  var32 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                  var33 = 0;
               }
            }
         }

         var21 = var22.charAt(var20);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17006;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ai", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/ai" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1537;
      if (j[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ai", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/ai" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
