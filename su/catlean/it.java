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
import org.jetbrains.annotations.NotNull;

public final class it {
   @NotNull
   private static mm s;
   private static final long a = j0.a(8762570773346578583L, 1820683903593193627L, MethodHandles.lookup().lookupClass()).a(118324904577512L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   @NotNull
   public static final mm p() {
      return s;
   }

   public static final void v(long a, @NotNull mm <set-?>) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(31162, 4496110240969298779L ^ var0));
      s = var2;
   }

   static {
      long var20 = a ^ 9919641155006L;
      long var22 = var20 ^ 23956099777677L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[2];
      int var16 = 0;
      String var15 = "í\u0084iÊ\u0096Ò\u0081¢!û\fÉ\u0092Ì¹.\u0010>g=\u001d â?\u0080\u0002\rb\u001c6\u0007Þù";
      int var17 = "í\u0084iÊ\u0096Ò\u0081¢!û\fÉ\u0092Ì¹.\u0010>g=\u001d â?\u0080\u0002\rb\u001c6\u0007Þù".length();
      char var14 = 16;
      int var13 = -1;

      while(true) {
         ++var13;
         byte[] var19 = var11.doFinal(var15.substring(var13, var13 + var14).getBytes("ISO-8859-1"));
         String var39 = a(var19).intern();
         boolean var10001 = true;
         var18[var16++] = var39;
         if ((var13 += var14) >= var17) {
            b = var18;
            c = new String[2];
            Cipher var1;
            var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var2 = 1; var2 < 8; ++var2) {
               var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var0 = new long[29];
            int var4 = 0;
            String var5 = "¦ø.\u0095ï,·¦\u0091<¹,G´\u0083ñ3|\u001a{ðvz\u0010x\u000f«\t]A·¶§N\u0001\u0080:Ê\n\u0090(ô\u0097\u009c£ý\u0000#\u008cÈ«Ê/À¢\føz»\u0080\u00adQ[ÕÍ¹òð\u001f¿\u000eñ]\u0098¢\u0019{T>Ñtd:%\u0085\u0019åõù$ºL?<·n\u0014ÉTo¶6\u000bd9\u001aÀJ\u00ad\u009b]\"4~75\u0098m>X*\u0092\u009b52£\u0006_Ù\u009fE?n\u009d\u0085U \u00929n+Q\u0013f#\u0010Æ\u0098YÓÞz\u000f¶k\u001d¼´\u000e¦\u00adãXø'¼ï[Ñ\u009câ@EU/\u001fÞ\u0094Nf?zÔ\u001b7Gú\u009eàOc\u0088«\u00ad¾\u001b9@SV\u0081á\u0094-\u0099\u0019\u001dqÛÄ\u000f/î`âs";
            int var6 = "¦ø.\u0095ï,·¦\u0091<¹,G´\u0083ñ3|\u001a{ðvz\u0010x\u000f«\t]A·¶§N\u0001\u0080:Ê\n\u0090(ô\u0097\u009c£ý\u0000#\u008cÈ«Ê/À¢\føz»\u0080\u00adQ[ÕÍ¹òð\u001f¿\u000eñ]\u0098¢\u0019{T>Ñtd:%\u0085\u0019åõù$ºL?<·n\u0014ÉTo¶6\u000bd9\u001aÀJ\u00ad\u009b]\"4~75\u0098m>X*\u0092\u009b52£\u0006_Ù\u009fE?n\u009d\u0085U \u00929n+Q\u0013f#\u0010Æ\u0098YÓÞz\u000f¶k\u001d¼´\u000e¦\u00adãXø'¼ï[Ñ\u009câ@EU/\u001fÞ\u0094Nf?zÔ\u001b7Gú\u009eàOc\u0088«\u00ad¾\u001b9@SV\u0081á\u0094-\u0099\u0019\u001dqÛÄ\u000f/î`âs".length();
            int var3 = 0;

            label33:
            while(true) {
               int var38 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var38, var3).getBytes("ISO-8859-1");
               long[] var36 = var0;
               var38 = var4++;
               long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var42 = -1;

               while(true) {
                  long var8 = var41;
                  byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var45 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch(var42) {
                  case 0:
                     var36[var38] = var45;
                     if (var3 >= var6) {
                        var39 = 15514.h<invokedynamic>(15514, 2592116261194584762L ^ var20);
                        Color var46 = new Color((int)var0[3]);
                        Color var47 = new Color((int)var0[23]);
                        Color var10005 = new Color((int)var0[28], (int)var0[2], (int)var0[2]);
                        Color var10006 = new Color((int)var0[5], (int)var0[18], (int)var0[26]);
                        Color var10007 = new Color((int)var0[6], (int)var0[9], (int)var0[1]);
                        Color var10008 = new Color((int)var0[10], (int)var0[17], (int)var0[17]);
                        Color var10009 = new Color((int)var0[20], (int)var0[14], (int)var0[14]);
                        Color var10010 = new Color((int)var0[24], (int)var0[27], (int)var0[16]);
                        Color var10011 = new Color((int)var0[7], (int)var0[15], (int)var0[25], (int)var0[19]);
                        Color var10012 = new Color((int)var0[12], (int)var0[4], (int)var0[13], (int)var0[21]);
                        Color var10013 = new Color((int)var0[4], (int)var0[4], (int)var0[11], (int)var0[0]);
                        Color var24 = new Color((int)var0[22], (int)var0[22], (int)var0[8], (int)var0[17]);
                        Color var25 = var10013;
                        Color var26 = var10012;
                        Color var27 = var10011;
                        Color var28 = var10010;
                        Color var29 = var10009;
                        Color var30 = var10008;
                        Color var31 = var10007;
                        Color var32 = var10006;
                        Color var33 = var10005;
                        Color var34 = var47;
                        Color var35 = var46;
                        s = new mm(var39, var22, var35, var34, var33, var32, var31, var30, var29, var28, var27, var26, var25, var24);
                        return;
                     }
                     break;
                  default:
                     var36[var38] = var45;
                     if (var3 < var6) {
                        continue label33;
                     }

                     var5 = "NÊßo\u0015iïß\u0016i\u008e\"\u009e£Ct";
                     var6 = "NÊßo\u0015iïß\u0016i\u008e\"\u009e£Ct".length();
                     var3 = 0;
                  }

                  var38 = var3;
                  var3 += 8;
                  var7 = var5.substring(var38, var3).getBytes("ISO-8859-1");
                  var36 = var0;
                  var38 = var4++;
                  var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7894;
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
            throw new RuntimeException("su/catlean/it", var10);
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
         throw new RuntimeException("su/catlean/it" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
