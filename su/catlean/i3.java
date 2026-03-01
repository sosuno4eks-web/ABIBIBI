package su.catlean;

import java.awt.Color;
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
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;

public final class i3 extends class_437 {
   @NotNull
   public static final i3 O;
   @NotNull
   private static final fs U;
   private static final long a = j0.a(7251713831747792771L, 7108771605691003394L, MethodHandles.lookup().lookupClass()).a(206188154775473L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private i3(long var1) {
      var1 ^= a;
      super(class_2561.method_30163(true.g<invokedynamic>(22445, 5242527366922626398L ^ var1)));
   }

   public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
      long var5 = a ^ 63573662459469L;
      long var7 = var5 ^ 42450871558549L;
      long var10001 = var5 ^ 109596072342202L;
      int var9 = (int)((var5 ^ 109596072342202L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = var5 ^ 1324898217521L;
      Intrinsics.checkNotNullParameter(var1, true.g<invokedynamic>(17474, 3488128627288358168L ^ var5));
      int var14 = s8.H((short)var9, (short)var10, var11).method_22683().method_4486();
      int var15 = s8.H((short)var9, (short)var10, var11).method_22683().method_4502();
      int var16 = (new Color(true.n<invokedynamic>(12717, 7042628525846073551L ^ var5))).getRGB();
      var1.method_25294(0, 0, var14, var15, var16);
      fs var10000 = U;
      Matrix3x2fStack var17 = var1.method_51448();
      Intrinsics.checkNotNullExpressionValue(var17, true.g<invokedynamic>(18944, 869780980964569944L ^ var5));
      fs.J(var10000, (Matrix3x2f)var17, (double)var14 / 2.0D - (double)U.U() / 2.0D, (double)var15 / 2.0D - (double)U.O() / 2.0D, 0.0F, 0.0F, z8.I.Z(var12, 0), z8.I.Z(var12, true.n<invokedynamic>(26890, 3439106304129189998L ^ var5)), 0.0F, var7, true.n<invokedynamic>(13861, 6776726692982069056L ^ var5), (Object)null);
   }

   static {
      long var20 = a ^ 39364136232868L;
      long var22 = var20 ^ 14398041896014L;
      long var24 = var20 ^ 53842431552621L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "+Zÿüå'\u009dþÎv\u0087ã\u0002ÄõvzX\u001cÅiù\u0014ú ëZÀØ%/\u009ft\u0092\n.\u0096ÎV·{\u0093o\u0093âã\u0094^»d\u0012 \u008bIi\u001f8";
      int var17 = "+Zÿüå'\u009dþÎv\u0087ã\u0002ÄõvzX\u001cÅiù\u0014ú ëZÀØ%/\u009ft\u0092\n.\u0096ÎV·{\u0093o\u0093âã\u0094^»d\u0012 \u008bIi\u001f8".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var26 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
            String var32 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[4];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "\u0080p×\u0005ã3\u0013ó/\u0099Òî@1\u001b&F%\r»È \u0098®";
                  int var5 = "\u0080p×\u0005ã3\u0013ó/\u0099Òî@1\u001b&F%\r»È \u0098®".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     long[] var29 = var6;
                     var30 = var3++;
                     long var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var35 = -1;

                     while(true) {
                        long var8 = var34;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var37 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var35) {
                        case 0:
                           var29[var30] = var37;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[5];
                              O = new i3(var24);
                              U = new fs(true.g<invokedynamic>(14520, 2609867244970360842L ^ var20), var22, true.n<invokedynamic>(3578, 146821092410371444L ^ var20), true.n<invokedynamic>(11569, 2322269882126208446L ^ var20));
                              return;
                           }
                           break;
                        default:
                           var29[var30] = var37;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "L¾3{±r|â\u009bÒHSá\u0018!8";
                           var5 = "L¾3{±r|â\u009bÒHSá\u0018!8".length();
                           var2 = 0;
                        }

                        var30 = var2;
                        var2 += 8;
                        var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                        var29 = var6;
                        var30 = var3++;
                        var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var35 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "æ\u009a\u001dn·7²'\u009fä<RJ\u001f\u0013ü\u0010ÝµVcürÁÐ¸`nø\u0016RÔ¦";
               var17 = "æ\u009a\u001dn·7²'\u009fä<RJ\u001f\u0013ü\u0010ÝµVcürÁÐ¸`nø\u0016RÔ¦".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var26 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31034;
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
            throw new RuntimeException("su/catlean/i3", var10);
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
         throw new RuntimeException("su/catlean/i3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8453;
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
            throw new RuntimeException("su/catlean/i3", var14);
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
         throw new RuntimeException("su/catlean/i3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
