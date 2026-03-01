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

public final class d3 extends dx {
   @NotNull
   private s6 z;
   @NotNull
   private final aa W;
   private static String[] o;
   private static final long a = j0.a(3446396835721365594L, 5074639973960999373L, MethodHandles.lookup().lookupClass()).a(68272034350668L);
   private static final String[] c;
   private static final String[] d;
   private static final Map b;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   public d3(long a, @NotNull s6 macros) {
      var1 ^= a;
      long var10001 = var1 ^ 90545975624914L;
      int var4 = (int)((var1 ^ 90545975624914L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(20473, 7184270445613150377L ^ var1));
      super();
      this.z = var3;
      this.W = new aa(sa.OUT_QUINT, h, (short)var4, (short)var5, var6);
   }

   @NotNull
   public final s6 i() {
      return this.z;
   }

   public final void z(@NotNull s6 <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(26031, 4417452028797375837L ^ var2));
      this.z = var1;
   }

   public void D(@NotNull class_332 context, long a, float x, float y, float mouseX, float mouseY) {
      // $FF: Couldn't be decompiled
   }

   public boolean y(float x, long a, float y, int button) {
      return false;
   }

   public static void x(String[] var0) {
      o = var0;
   }

   public static String[] t() {
      return o;
   }

   static {
      long var25 = a ^ 27396149412096L;
      b = new HashMap(13);
      null.A<invokedynamic>((Object)null, -5173398574818653449L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[12];
      int var21 = 0;
      String var20 = "¯TÕ9yù\tÜá¹\u0001\u0089\u0083·b\u001c\u0010(K\u0089*L¸Õ\u0097yí,\u001a\u0092\r\u008c³\u0018\u0019\u0007µ\u00840Y\u0005\u0010$\u0002¶W\u0093\u001c°Z'´Ó\u0099\u0083\u0015]X \u0007)+Õ*.Ä\u001caxº?Y\u0082\u000bÁh°O_Ø\u0096\u0093B<\u0094Ì}Ý(«#\u0010L?Ø\u0000½'-\u0015ñ\u0003\u0087´\n\u0090\u009bý\u0010îÃÿÞ±uô\u00adC \u001dä\t#5ä\u0010\u0087\u007fÞ\u0013\u0005ü§²È\u0005BÉ\u0002ÒH$\u0010Æ\u0018\u001fr\n\u008fuúÔ«\bÚú\u0085gz\u0010º¨%ÛHF\u0089\u0089cì¯+-¸\\\u0006\u0010\u0089\u0099\u0082û,\u009f(Ü\u0084¶¶\u0083t\n·ù";
      int var22 = "¯TÕ9yù\tÜá¹\u0001\u0089\u0083·b\u001c\u0010(K\u0089*L¸Õ\u0097yí,\u001a\u0092\r\u008c³\u0018\u0019\u0007µ\u00840Y\u0005\u0010$\u0002¶W\u0093\u001c°Z'´Ó\u0099\u0083\u0015]X \u0007)+Õ*.Ä\u001caxº?Y\u0082\u000bÁh°O_Ø\u0096\u0093B<\u0094Ì}Ý(«#\u0010L?Ø\u0000½'-\u0015ñ\u0003\u0087´\n\u0090\u009bý\u0010îÃÿÞ±uô\u00adC \u001dä\t#5ä\u0010\u0087\u007fÞ\u0013\u0005ü§²È\u0005BÉ\u0002ÒH$\u0010Æ\u0018\u001fr\n\u008fuúÔ«\bÚú\u0085gz\u0010º¨%ÛHF\u0089\u0089cì¯+-¸\\\u0006\u0010\u0089\u0099\u0082û,\u009f(Ü\u0084¶¶\u0083t\n·ù".length();
      char var19 = 16;
      int var18 = -1;

      label56:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var32;
               if ((var18 += var19) >= var22) {
                  c = var23;
                  d = new String[12];
                  g = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[3];
                  int var8 = 0;
                  String var9 = "\u009eJ\u0006\u0004LGä\u0007\u0014Ä\\\u008fA\u0013YFDÿ8>º¤f¯";
                  int var10 = "\u009eJ\u0006\u0004LGä\u0007\u0014Ä\\\u008fA\u0013YFDÿ8>º¤f¯".length();
                  int var7 = 0;

                  do {
                     int var30 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var30, var7).getBytes("ISO-8859-1");
                     var30 = var8++;
                     long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                     long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                     boolean var35 = true;
                     var11[var30] = var10004;
                  } while(var7 < var10);

                  e = var11;
                  f = new Integer[3];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -4118260821272699578L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var33 = true;
                  h = var36;
                  return;
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var32;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label56;
               }

               var20 = "\u007fÿ&°<æ·7èê\u007f:,BiE \u009aïôó\u0002y\u001a\n\u009ar÷[¡ß4ïÉ\u009f-J\u0099¯øßõ¯\u001bj\bÒ\u008e¼";
               var22 = "\u007fÿ&°<æ·7èê\u007f:,BiE \u009aïôó\u0002y\u001a\n\u009ar÷[¡ß4ïÉ\u009f-J\u0099¯øßõ¯\u001bj\bÒ\u008e¼".length();
               var19 = 16;
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5932;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])b.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               b.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/d3", var10);
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
         throw new RuntimeException("su/catlean/d3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2945;
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
            throw new RuntimeException("su/catlean/d3", var14);
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
         throw new RuntimeException("su/catlean/d3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
