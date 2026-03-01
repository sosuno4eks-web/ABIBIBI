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

public enum en {
   @NotNull
   private final c6 f;
   public static final en SNAP;
   public static final en DEFAULT;
   public static final en NONE;
   public static final en VULCAN;
   public static final en HVH;
   public static final en POLAR_SEP_25;
   public static final en GRIM_SILENT;
   public static final en ADVANCED;
   private static final en[] R;
   private static final EnumEntries Z;
   private static final long a = j0.a(7231599163848831601L, 5093506804029101280L, MethodHandles.lookup().lookupClass()).a(54596362386854L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private en(c6 var3) {
      this.f = var3;
   }

   @NotNull
   public final c6 k() {
      return this.f;
   }

   @NotNull
   public static EnumEntries S() {
      return Z;
   }

   private static final en[] K(long var0) {
      var0 ^= a;
      en[] var2 = new en[true.s<invokedynamic>(13373, 6175161592148692957L ^ var0)];
      var2[0] = SNAP;
      var2[1] = DEFAULT;
      var2[2] = NONE;
      var2[3] = VULCAN;
      var2[4] = HVH;
      var2[5] = POLAR_SEP_25;
      var2[true.s<invokedynamic>(12763, 806967824941386297L ^ var0)] = GRIM_SILENT;
      var2[true.s<invokedynamic>(8276, 5681070886988880823L ^ var0)] = ADVANCED;
      return var2;
   }

   static {
      long var20 = a ^ 118049144556892L;
      long var22 = var20 ^ 104493852292337L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[8];
      int var17 = 0;
      String var16 = "\u0013¶>R]\u0017Þ\u0006oòÀ|'\u009aGÅ\bÚæk6fl&l\b\u009c\u008bçd/;»ÿ\u0010\u0000\u008fÍ\u0090®O<\f[ï2)i\u0094üå\b,\"¬¸³ÍL\u0001\u0010V¸Èê^\u0091½Ó\fe\u0084\u0099Ï5þ¦";
      int var18 = "\u0013¶>R]\u0017Þ\u0006oòÀ|'\u009aGÅ\bÚæk6fl&l\b\u009c\u008bçd/;»ÿ\u0010\u0000\u008fÍ\u0090®O<\f[ï2)i\u0094üå\b,\"¬¸³ÍL\u0001\u0010V¸Èê^\u0091½Ó\fe\u0084\u0099Ï5þ¦".length();
      char var15 = 16;
      int var14 = -1;

      label54:
      while(true) {
         ++var14;
         String var24 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var30;
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
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "3\f[ã\u009b1.¦)ã³\u001bîNwµÝ&5\rQ%\u0087\u009b";
                  int var5 = "3\f[ã\u009b1.¦)ã³\u001bîNwµÝ&5\rQ%\u0087\u009b".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              SNAP = new en(var11[2], 0, (c6)cs.m);
                              DEFAULT = new en(var11[6], 1, (c6)ci.R);
                              NONE = new en(var11[1], 2, (c6)cw.B);
                              VULCAN = new en(var11[4], 3, (c6)c5.T);
                              HVH = new en(var11[7], 4, (c6)cg.p);
                              POLAR_SEP_25 = new en(var11[3], 5, (c6)cz.y);
                              GRIM_SILENT = new en(var11[5], true.s<invokedynamic>(11565, 2431401846550069986L ^ var20), (c6)cw.B);
                              ADVANCED = new en(var11[0], true.s<invokedynamic>(30199, 6646916184214198846L ^ var20), (c6)c3.s);
                              R = K(var22);
                              Z = EnumEntriesKt.enumEntries((Enum[])R);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u009f\u009dÌã[¿\u0095R\u001dHiPP\u0006ÄÂ";
                           var5 = "\u009f\u009dÌã[¿\u0095R\u001dHiPP\u0006ÄÂ".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var30;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label54;
               }

               var16 = "r\u008f1?\u0016¥%å\b\u0082cä\u0093\u008a\u0095Õµ";
               var18 = "r\u008f1?\u0016¥%å\b\u0082cä\u0093\u008a\u0095Õµ".length();
               var15 = '\b';
               var14 = -1;
            }

            ++var14;
            var24 = var16.substring(var14, var14 + var15);
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 590;
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
            throw new RuntimeException("su/catlean/en", var14);
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
         throw new RuntimeException("su/catlean/en" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
