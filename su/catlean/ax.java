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

public final class ax extends a_ {
   @NotNull
   private final zf V;
   @NotNull
   private final aa N;
   @NotNull
   private final aa h;
   @NotNull
   private final fs l;
   private static final long a = j0.a(2026267999096140584L, 2886968416499257792L, MethodHandles.lookup().lookupClass()).a(254999235921806L);
   private static final String[] c;
   private static final String[] g;
   private static final Map i = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map m;
   private static final long[] n;
   private static final Long[] o;
   private static final Map p;

   public ax(long a, @NotNull zf setting) {
      var1 ^= a;
      long var4 = var1 ^ 114952250917900L;
      long var6 = var1 ^ 100887318886149L;
      long var10001 = var1 ^ 33306001251694L;
      int var8 = (int)((var1 ^ 33306001251694L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(21650, 3219860110967044140L ^ var1));
      super(var6, var3);
      this.V = var3;
      this.N = new aa(sa.OUT_QUINT, true.y<invokedynamic>(20319, 3502168110859141231L ^ var1), (short)var8, (short)var9, var10);
      this.h = new aa(sa.OUT_QUINT, true.y<invokedynamic>(26465, 4578918483848915024L ^ var1), (short)var8, (short)var9, var10);
      this.l = new fs(true.m<invokedynamic>(1619, 5088369929084480238L ^ var1), var4, true.j<invokedynamic>(23534, 7451767301323155904L ^ var1), true.j<invokedynamic>(4, 6123051649379709480L ^ var1));
   }

   @NotNull
   public zf t() {
      return this.V;
   }

   public void v(@NotNull class_332 context, long a, char a, int mouseX, int mouseY, float factor) {
      // $FF: Couldn't be decompiled
   }

   public void d(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
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
      long var22 = a ^ 54794127227715L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[5];
      int var29 = 0;
      String var28 = ">\u00adyÚc_M/@¿ÙU;ýë$\u0010\u0089\u009eè\u0014I£KÂ\u009aó\u0097ÿ\u0015\u0091\u00136\u0018¤\u0007CM\u00ad\u008cÒ\u0085Wº[q\u0017Ô9Î\u0098\u000eAsFÙ\u0087\u0000";
      int var30 = ">\u00adyÚc_M/@¿ÙU;ýë$\u0010\u0089\u009eè\u0014I£KÂ\u009aó\u0097ÿ\u0015\u0091\u00136\u0018¤\u0007CM\u00ad\u008cÒ\u0085Wº[q\u0017Ô9Î\u0098\u000eAsFÙ\u0087\u0000".length();
      char var27 = 16;
      int var26 = -1;

      label72:
      while(true) {
         ++var26;
         String var33 = var28.substring(var26, var26 + var27);
         byte var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = b(var32).intern();
            switch(var10001) {
            case 0:
               var31[var29++] = var39;
               if ((var26 += var27) >= var30) {
                  c = var31;
                  g = new String[5];
                  m = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[8];
                  int var14 = 0;
                  String var15 = "l¨ÚG\u0003\u009aãÖ\u000fQÌ»\u0083s.º¢@OûBÑVþÊ\u009bpc\u0006\u0002\u0094¯_\u009e\"\u0002¹ ¾Ò\u0081ë\u0016ìÕò N";
                  int var16 = "l¨ÚG\u0003\u009aãÖ\u000fQÌ»\u0083s.º¢@OûBÑVþÊ\u009bpc\u0006\u0002\u0094¯_\u009e\"\u0002¹ ¾Ò\u0081ë\u0016ìÕò N".length();
                  int var13 = 0;

                  label54:
                  while(true) {
                     int var37 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                     long[] var36 = var17;
                     var37 = var14++;
                     long var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var19 = var41;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var44 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var42) {
                        case 0:
                           var36[var37] = var44;
                           if (var13 >= var16) {
                              j = var17;
                              k = new Integer[8];
                              p = new HashMap(13);
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[2];
                              int var3 = 0;
                              String var4 = "u©\"%Ry\u0099å²Jé\u0091\u0090äB[";
                              int var5 = "u©\"%Ry\u0099å²Jé\u0091\u0090äB[".length();
                              int var2 = 0;

                              do {
                                 var37 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                 var37 = var3++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var45 = true;
                                 var6[var37] = var44;
                              } while(var2 < var5);

                              n = var6;
                              o = new Long[2];
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "'~\u0081Â\u008bé/þ\u0015²0>I\u0092¶0";
                           var16 = "'~\u0081Â\u008bé/þ\u0015²0>I\u0092¶0".length();
                           var13 = 0;
                        }

                        var37 = var13;
                        var13 += 8;
                        var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                        var36 = var17;
                        var37 = var14++;
                        var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var27 = var28.charAt(var26);
               break;
            default:
               var31[var29++] = var39;
               if ((var26 += var27) < var30) {
                  var27 = var28.charAt(var26);
                  continue label72;
               }

               var28 = "Pk*ÞÔøÌç\"óü=BÒ\u008bk \u009c8z@D^ëÌY\u0095\u0006E-µK\u0095ökÁ¶{0Þ\u009b!Ãþ\u00adð\u0083¸\u008b";
               var30 = "Pk*ÞÔøÌç\"óü=BÒ\u008bk \u009c8z@D^ëÌY\u0095\u0006E-µK\u0095ökÁ¶{0Þ\u009b!Ãþ\u00adð\u0083¸\u008b".length();
               var27 = 16;
               var26 = -1;
            }

            ++var26;
            var33 = var28.substring(var26, var26 + var27);
            var10001 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7542;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ax", var10);
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
         throw new RuntimeException("su/catlean/ax" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 999;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ax", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/ax" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16121;
      if (o[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = n[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ax", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         o[var3] = var15;
      }

      return o[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ax" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
