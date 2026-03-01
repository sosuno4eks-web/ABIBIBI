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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cj {
   private final float P;
   private final float Q;
   private final float S;
   @NotNull
   private final zf Z;
   @NotNull
   private final aa n;
   private static final long a = j0.a(1460758154920457464L, 4816363420086962785L, MethodHandles.lookup().lookupClass()).a(105203416580580L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   public cj(long a, float x, float y, float w, @NotNull zf setting, @NotNull aa animation) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var6, true.g<invokedynamic>(14948, 1273886644567341413L ^ var1));
      Intrinsics.checkNotNullParameter(var7, true.g<invokedynamic>(29833, 3333556341264594825L ^ var1));
      super();
      this.P = var3;
      this.Q = var4;
      this.S = var5;
      this.Z = var6;
      this.n = var7;
   }

   // $FF: synthetic method
   public cj(float var1, float var2, long var3, char var5, float var6, zf var7, aa var8, int var9, DefaultConstructorMarker var10) {
      long var11 = (var3 << 16 | (long)var5 << 48 >>> 48) ^ a;
      long var13 = var11 ^ 85224282445156L;
      long var10001 = var11 ^ 68609064177783L;
      int var15 = (int)((var11 ^ 68609064177783L) >>> 48);
      int var16 = (int)(var10001 << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      if ((var9 & true.w<invokedynamic>(25608, 2282112495865521073L ^ var11)) != 0) {
         var8 = new aa(sa.OUT_EXPO, h, (short)var15, (short)var16, var17);
      }

      this(var13, var1, var2, var6, var7, var8);
   }

   public final float c() {
      return this.P;
   }

   public final float Y() {
      return this.Q;
   }

   public final float w() {
      return this.S;
   }

   @NotNull
   public final zf P() {
      return this.Z;
   }

   @NotNull
   public final aa E() {
      return this.n;
   }

   public final float D() {
      return this.P;
   }

   public final float K() {
      return this.Q;
   }

   public final float r() {
      return this.S;
   }

   @NotNull
   public final zf x() {
      return this.Z;
   }

   @NotNull
   public final aa S() {
      return this.n;
   }

   @NotNull
   public final cj V(float x, int a, float y, float w, @NotNull zf setting, char a, @NotNull aa animation, char a) {
      long var9 = ((long)var2 << 32 | (long)var6 << 48 >>> 32 | (long)var8 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 44260151727214L;
      Intrinsics.checkNotNullParameter(var5, true.g<invokedynamic>(11808, 6633987764595447004L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.g<invokedynamic>(16522, 502229116964780658L ^ var9));
      return new cj(var11, var1, var3, var4, var5, var7);
   }

   // $FF: synthetic method
   public static cj b(cj param0, float param1, float param2, float param3, zf param4, aa param5, long param6, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 29574463636893L;
      aa var3 = this.n;
      zf var4 = this.Z;
      float var5 = this.S;
      float var6 = this.Q;
      float var7 = this.P;
      String var10000 = 7256.g<invokedynamic>(7256, 3809092875352699766L ^ var1);
      return var10000 + var7 + true.g<invokedynamic>(32446, 4574498416804401555L ^ var1) + var6 + true.g<invokedynamic>(20739, 2050240368834297385L ^ var1) + var5 + true.g<invokedynamic>(991, 5789158833109560569L ^ var1) + var4 + true.g<invokedynamic>(25724, 9088610523632012112L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 121066110881197L;
      int var3 = Float.hashCode(this.P);
      var3 = var3 * true.w<invokedynamic>(31125, 3410436086893109958L ^ var1) + Float.hashCode(this.Q);
      var3 = var3 * true.w<invokedynamic>(25205, 7833741612341098784L ^ var1) + Float.hashCode(this.S);
      var3 = var3 * true.w<invokedynamic>(25205, 7833741612341098784L ^ var1) + this.Z.hashCode();
      var3 = var3 * true.w<invokedynamic>(25205, 7833741612341098784L ^ var1) + this.n.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 24250732045598L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[9];
      int var23 = 0;
      String var22 = "\u0083ùm\u0097°zÝ\u0005±=\u0096êd¤à\u008a-\u0016õ5S\u0095F-£\u0081ý;EÑ\u0000Å\t\u008f\u008e¯\u0080÷;\u0095\u0010E´4'X0\t-ô`\u0014\u0000¡\u009c2\u009c y\u009e\u0081/ÕSA\u0086¹ZßÞð\u0080Ê<S\u0016ØQ¼GÜU¬K\u008fSê\u000e\u008c=\u0010Tm×{½j>\u000fÂ@\u0006þª{\u0096ñ\u0010\u0002\u0006*Ø\u0082\u0090\u008aÃ=-&æ¨ù\u0089m \u001a©#þ(¹Uþã\u0019\u0083oÂ¡Ã(©Íë_\u009eýa:jK\u0000\u0088/qùv èaÔ?ÞQ´\u0011\u0004É\u0012BD\u0012ô¡k¼oíðæÃKQà\u008e$E´d\u0013";
      int var24 = "\u0083ùm\u0097°zÝ\u0005±=\u0096êd¤à\u008a-\u0016õ5S\u0095F-£\u0081ý;EÑ\u0000Å\t\u008f\u008e¯\u0080÷;\u0095\u0010E´4'X0\t-ô`\u0014\u0000¡\u009c2\u009c y\u009e\u0081/ÕSA\u0086¹ZßÞð\u0080Ê<S\u0016ØQ¼GÜU¬K\u008fSê\u000e\u008c=\u0010Tm×{½j>\u000fÂ@\u0006þª{\u0096ñ\u0010\u0002\u0006*Ø\u0082\u0090\u008aÃ=-&æ¨ù\u0089m \u001a©#þ(¹Uþã\u0019\u0083oÂ¡Ã(©Íë_\u009eýa:jK\u0000\u0088/qùv èaÔ?ÞQ´\u0011\u0004É\u0012BD\u0012ô¡k¼oíðæÃKQà\u008e$E´d\u0013".length();
      char var21 = '(';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  c = new String[9];
                  g = new HashMap(13);
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
                  String var9 = "\u0012ÑdXí\u009bK9âM$\u0002]\u000fdû,\u00038gÄµ\u0010\u0011";
                  int var10 = "\u0012ÑdXí\u009bK9âM$\u0002]\u000fdû,\u00038gÄµ\u0010\u0011".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              e = var11;
                              f = new Integer[5];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 4566954410465752267L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              h = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u000eA\u008e\u0004Z\u0019ý§X\u0099ñØTÅxÊ";
                           var10 = "\u000eA\u008e\u0004Z\u0019ý§X\u0099ñØTÅxÊ".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "ùR ²hìúyÉ\u000f¤\u0097\b_W¬ Ú\u0082[çrQAóúO²ðÍz\u001cûNF\u0098\u008c;Ëj\u000bå\u0007a¿\u0099R~\u000e";
               var24 = "ùR ²hìúyÉ\u000f¤\u0097\b_W¬ Ú\u0082[çrQAóúO²ðÍz\u001cûNF\u0098\u008c;Ëj\u000bå\u0007a¿\u0099R~\u000e".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1830;
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
            throw new RuntimeException("su/catlean/cj", var10);
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
         throw new RuntimeException("su/catlean/cj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15209;
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
            throw new RuntimeException("su/catlean/cj", var14);
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
         throw new RuntimeException("su/catlean/cj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
