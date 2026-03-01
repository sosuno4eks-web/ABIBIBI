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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cx {
   private final double c;
   private final double U;
   private final double G;
   private final double E;
   private final double H;
   private final double k;
   private static final long a = j0.a(5294132726303372715L, 4094330852851735031L, MethodHandles.lookup().lookupClass()).a(137813031206266L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public cx(double westDelta, double eastDelta, double northDelta, double southDelta, double upDelta, double downDelta) {
      this.c = var1;
      this.U = var3;
      this.G = var5;
      this.E = var7;
      this.H = var9;
      this.k = var11;
   }

   public final double g() {
      return this.c;
   }

   public final double I() {
      return this.U;
   }

   public final double e() {
      return this.G;
   }

   public final double P() {
      return this.E;
   }

   public final double q() {
      return this.H;
   }

   public final double U() {
      return this.k;
   }

   public final double H() {
      return this.c;
   }

   public final double j() {
      return this.U;
   }

   public final double W() {
      return this.G;
   }

   public final double d() {
      return this.E;
   }

   public final double x() {
      return this.H;
   }

   public final double E() {
      return this.k;
   }

   @NotNull
   public final cx Q(double westDelta, double eastDelta, double northDelta, double southDelta, double upDelta, double downDelta) {
      return new cx(var1, var3, var5, var7, var9, var11);
   }

   public static cx i(cx param0, long param1, double param3, double param5, double param7, double param9, double param11, double param13, int param15, Object param16) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 22217871909720L;
      double var3 = this.k;
      double var5 = this.H;
      double var7 = this.E;
      double var9 = this.G;
      double var11 = this.U;
      double var13 = this.c;
      String var10000 = 46.t<invokedynamic>(46, 1662085536448437504L ^ var1);
      return var10000 + var13 + true.t<invokedynamic>(23567, 7288588196599267616L ^ var1) + var11 + true.t<invokedynamic>(9248, 6254528986307950856L ^ var1) + var9 + true.t<invokedynamic>(10824, 6290943212937181026L ^ var1) + var7 + true.t<invokedynamic>(15948, 5861771583510864743L ^ var1) + var5 + true.t<invokedynamic>(21856, 6826488296546863177L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 27648247481802L;
      int var3 = Double.hashCode(this.c);
      var3 = var3 * true.a<invokedynamic>(13422, 6737308006882954320L ^ var1) + Double.hashCode(this.U);
      var3 = var3 * true.a<invokedynamic>(21357, 4500321620237921106L ^ var1) + Double.hashCode(this.G);
      var3 = var3 * true.a<invokedynamic>(21357, 4500321620237921106L ^ var1) + Double.hashCode(this.E);
      var3 = var3 * true.a<invokedynamic>(21357, 4500321620237921106L ^ var1) + Double.hashCode(this.H);
      var3 = var3 * true.a<invokedynamic>(21357, 4500321620237921106L ^ var1) + Double.hashCode(this.k);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 47575461363217L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "ÏAO 1Õ\u0018ì\u0097\u0019´+ìy¨\u008d\u0099\nl\u0018\u0005É2-¸62\u008fdHrá \u0000²\u0096\t&¹\u0083~@\u009d\u0016µñ\u008a\u000f\rFn)\u0085Ä\\\u0001zì\u009bê\u001b õÞ\u0003 f\n\u00006t'Ôì\n:z:ú«úÖM\u0080lü\u0018Ul\u0019ëÐ¨\u0003²ißd É\"ó^ÍAuh\u000bOÞ\u0016øÀãÚ\u0099cè\u009cJ\u0018À\u009dý\tÍDÙhäû";
      int var19 = "ÏAO 1Õ\u0018ì\u0097\u0019´+ìy¨\u008d\u0099\nl\u0018\u0005É2-¸62\u008fdHrá \u0000²\u0096\t&¹\u0083~@\u009d\u0016µñ\u008a\u000f\rFn)\u0085Ä\\\u0001zì\u009bê\u001b õÞ\u0003 f\n\u00006t'Ôì\n:z:ú«úÖM\u0080lü\u0018Ul\u0019ëÐ¨\u0003²ißd É\"ó^ÍAuh\u000bOÞ\u0016øÀãÚ\u0099cè\u009cJ\u0018À\u009dý\tÍDÙhäû".length();
      char var16 = ' ';
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  d = new String[6];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "z\u0019'`FXt!¥#\u00adï\u00adT^\u0091m\u009f¼C©DæÕ";
                  int var5 = "z\u0019'`FXt!¥#\u00adï\u00adT^\u0091m\u009f¼C©DæÕ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0087!\u0001#J\u001eX'<Ô\u0091*T+L®";
                           var5 = "\u0087!\u0001#J\u001eX'<Ô\u0091*T+L®".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "g\u001b\u0014å\u0083öj\u0015Ù\t\u0011Äì\u0001´&\u008dÝdð' Á9Úd\u0003¶\u009e:q\u0082,\u001a£pYeøR¦\u0080nÇQ·\u0007¦\u0018S|©å\u0012\t«ÚºsJ\b[@r\u0005 è\u008d'§K\u0081\u009f";
               var19 = "g\u001b\u0014å\u0083öj\u0015Ù\t\u0011Äì\u0001´&\u008dÝdð' Á9Úd\u0003¶\u009e:q\u0082,\u001a£pYeøR¦\u0080nÇQ·\u0007¦\u0018S|©å\u0012\t«ÚºsJ\b[@r\u0005 è\u008d'§K\u0081\u009f".length();
               var16 = '0';
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22162;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/cx", var10);
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
         throw new RuntimeException("su/catlean/cx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21781;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/cx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/cx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
