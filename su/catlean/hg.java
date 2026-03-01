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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum hg {
   public static final hg VANILLA;
   public static final hg NCP;
   public static final hg GRIM;
   public static final hg MATRIX;
   public static final hg GRIM_V3;
   public static final hg GRIM_2;
   public static final hg GRIM_3;
   private static final hg[] x;
   private static final EnumEntries T;
   private static String[] Y;
   private static final long a = j0.a(2408293433469235945L, 1228285346870731912L, MethodHandles.lookup().lookupClass()).a(50159527207881L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   @NotNull
   public static EnumEntries o() {
      return T;
   }

   private static final hg[] s(short var0, short var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;
      hg[] var5 = new hg[true.e<invokedynamic>(18655, 8653592881127410489L ^ var3)];
      var5[0] = VANILLA;
      var5[1] = NCP;
      var5[2] = GRIM;
      var5[3] = MATRIX;
      var5[4] = GRIM_V3;
      var5[5] = GRIM_2;
      var5[true.e<invokedynamic>(14038, 5506758902639605041L ^ var3)] = GRIM_3;
      return var5;
   }

   static {
      long var20 = a ^ 17761949055094L;
      long var10001 = var20 ^ 31889354340990L;
      int var22 = (int)((var20 ^ 31889354340990L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      if (-1918365452494244692L.A<invokedynamic>(-1918365452494244692L, var20) != null) {
         (new String[4]).A<invokedynamic>(new String[4], -1894454037722978777L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[7];
      int var17 = 0;
      String var16 = "\u0088äõï\u0016\u0094\u0080$\b\u001d\u008d\fí\"\u0084ö÷\b¡P\u009aüÎ×c\u0088\bv\u007fwÀ¡ððÂ\båtËl\f\u007f\u009dñ";
      int var18 = "\u0088äõï\u0016\u0094\u0080$\b\u001d\u008d\fí\"\u0084ö÷\b¡P\u009aüÎ×c\u0088\bv\u007fwÀ¡ððÂ\båtËl\f\u007f\u009dñ".length();
      char var15 = '\b';
      int var14 = -1;

      label49:
      while(true) {
         ++var14;
         String var25 = var16.substring(var14, var14 + var15);
         byte var27 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var31 = a(var19).intern();
            switch(var27) {
            case 0:
               var11[var17++] = var31;
               if ((var14 += var15) >= var18) {
                  d = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "\nêÄ1¢,\u001akMlï1jª¡²\u009bR\u008d`ÿ|J\u0096";
                  int var5 = "\nêÄ1¢,\u001akMlï1jª¡²\u009bR\u008d`ÿ|J\u0096".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var33 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  b = var6;
                  c = new Integer[3];
                  VANILLA = new hg(var11[4], 0);
                  NCP = new hg(var11[3], 1);
                  GRIM = new hg(var11[5], 2);
                  MATRIX = new hg(var11[6], 3);
                  GRIM_V3 = new hg(var11[1], 4);
                  GRIM_2 = new hg(var11[0], 5);
                  GRIM_3 = new hg(var11[2], true.e<invokedynamic>(9294, 7238157058687828289L ^ var20));
                  x = s((short)var22, (short)var23, var24);
                  T = EnumEntriesKt.enumEntries((Enum[])x);
                  return;
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var31;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label49;
               }

               var16 = ".WB\u0096Y\u0007Ö*\bJµ§\u008cæo*â";
               var18 = ".WB\u0096Y\u0007Ö*\bJµ§\u008cæo*â".length();
               var15 = '\b';
               var14 = -1;
            }

            ++var14;
            var25 = var16.substring(var14, var14 + var15);
            var27 = 0;
         }
      }
   }

   public static void g(String[] var0) {
      Y = var0;
   }

   public static String[] c() {
      return Y;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16878;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/hg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/hg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
