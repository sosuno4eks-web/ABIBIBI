package su.catlean;

import dev.redstones.mediaplayerinfo.MediaInfo;
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
import kotlin.Unit;
import net.minecraft.class_241;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ng extends nm {
   @NotNull
   public static final ng R;
   @Nullable
   private static MediaInfo W;
   @NotNull
   private static class_2960 I;
   @NotNull
   private static class_241 T;
   private static boolean x;
   @NotNull
   private static String i;
   @NotNull
   private static final aa p;
   @NotNull
   private static final aa B;
   private static boolean n;
   private static int G;
   @NotNull
   private static iv S;
   private static final long c = j0.a(2875778444603757565L, 7195735835466911866L, MethodHandles.lookup().lookupClass()).a(68346457217915L);
   private static final String[] d;
   private static final String[] e;
   private static final Map j;
   private static final long[] m;
   private static final Integer[] t;
   private static final Map u;

   private ng(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 11133812465382L;
      super(true.l<invokedynamic>(32395, 1420966254800263865L ^ var4), var6);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void Y(long param1, char param3) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit k() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var31 = c ^ 53645478332868L;
      long var10001 = var31 ^ 62764804549390L;
      int var33 = (int)((var31 ^ 62764804549390L) >>> 32);
      int var34 = (int)(var10001 << 32 >>> 48);
      int var35 = (int)(var10001 << 48 >>> 48);
      long var36 = var31 ^ 132240462124473L;
      var10001 = var31 ^ 80235734407437L;
      int var38 = (int)((var31 ^ 80235734407437L) >>> 48);
      int var39 = (int)(var10001 << 16 >>> 48);
      int var40 = (int)(var10001 << 32 >>> 32);
      j = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[9];
      int var27 = 0;
      String var26 = "ÞZVXvï\u000f=L5PÈä\t9a\u0010Ð\u0010+\u0080ò¬\u0091\u0082\u0000×\u0096¼\u001d¿\u001bÜ\u0010d\u008dãk=½\u009bEÔ\u0092û¨ÿì¯¨ (o püD\u0002\u001aQb¾\u0007\u0084À\u007fðX\u001e\u0096\u0001\n8 z\u0011ó[\u001bZ½JÜ\u0018Õìm\u0000º\u001dçFvÿL\u0000Z\u0091-&¬ðÙh\u009bÁ¡\u0011\u0010*$¢E\u0080\u0097¨+÷S]\n¨ öb(hFÞ`û\u0019SÈ\u0010i\bFq\u008c9þ¥7\u009e¯\u008b/à\u0014È\u0012söÄ¦\u0094+KD¤Y\u000b\u0083\u0087\u008d";
      int var28 = "ÞZVXvï\u000f=L5PÈä\t9a\u0010Ð\u0010+\u0080ò¬\u0091\u0082\u0000×\u0096¼\u001d¿\u001bÜ\u0010d\u008dãk=½\u009bEÔ\u0092û¨ÿì¯¨ (o püD\u0002\u001aQb¾\u0007\u0084À\u007fðX\u001e\u0096\u0001\n8 z\u0011ó[\u001bZ½JÜ\u0018Õìm\u0000º\u001dçFvÿL\u0000Z\u0091-&¬ðÙh\u009bÁ¡\u0011\u0010*$¢E\u0080\u0097¨+÷S]\n¨ öb(hFÞ`û\u0019SÈ\u0010i\bFq\u008c9þ¥7\u009e¯\u008b/à\u0014È\u0012söÄ¦\u0094+KD¤Y\u000b\u0083\u0087\u008d".length();
      char var25 = 16;
      int var24 = -1;

      label74:
      while(true) {
         ++var24;
         String var41 = var26.substring(var24, var24 + var25);
         byte var44 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var41.getBytes("ISO-8859-1"));
            String var47 = b(var30).intern();
            switch(var44) {
            case 0:
               var29[var27++] = var47;
               if ((var24 += var25) >= var28) {
                  d = var29;
                  e = new String[9];
                  u = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[7];
                  int var14 = 0;
                  String var15 = "+Õ¹\u0007%5Ç·Eç\u0083\u0090\u008b¹\f\u0019Ã\u0016\u008d?/\u0099ÓKÔ|\u009fä\u009f\u0012±!Üp×=L«jp";
                  int var16 = "+Õ¹\u0007%5Ç·Eç\u0083\u0090\u008b¹\f\u0019Ã\u0016\u008d?/\u0099ÓKÔ|\u009fä\u009f\u0012±!Üp×=L«jp".length();
                  int var13 = 0;

                  label56:
                  while(true) {
                     int var48 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var48, var13).getBytes("ISO-8859-1");
                     long[] var43 = var17;
                     var48 = var14++;
                     long var50 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var51 = -1;

                     while(true) {
                        long var19 = var50;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var53 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var51) {
                        case 0:
                           var43[var48] = var53;
                           if (var13 >= var16) {
                              m = var17;
                              t = new Integer[7];
                              Cipher var1;
                              var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var2 = 1; var2 < 8; ++var2) {
                                 var10003[var2] = (byte)((int)(var31 << var2 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var0 = new long[2];
                              int var4 = 0;
                              String var5 = "e\u0099_§\u0085K\u0090×Q8\u0098nT/Æ\u0080";
                              int var6 = "e\u0099_§\u0085K\u0090×Q8\u0098nT/Æ\u0080".length();
                              int var3 = 0;

                              do {
                                 var48 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var48, var3).getBytes("ISO-8859-1");
                                 var48 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var53 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var54 = true;
                                 var0[var48] = var53;
                              } while(var3 < var6);

                              R = new ng(var33, var34, var35);
                              I = hp.o(var36, true.l<invokedynamic>(16681, 8487045062579909241L ^ var31), true.l<invokedynamic>(20573, 1745430407704175371L ^ var31));
                              T = new class_241(1.0F, 1.0F);
                              x = true;
                              i = "";
                              p = new aa(sa.OUT_QUINT, var0[0], (short)var38, (short)var39, var40);
                              B = new aa(sa.OUT_BACK, var0[1], (short)var38, (short)var39, var40);
                              S = new iv();
                              return;
                           }
                           break;
                        default:
                           var43[var48] = var53;
                           if (var13 < var16) {
                              continue label56;
                           }

                           var15 = "ÈV¦ ¥égCã\u008aió:z\u0085\\";
                           var16 = "ÈV¦ ¥égCã\u008aió:z\u0085\\".length();
                           var13 = 0;
                        }

                        var48 = var13;
                        var13 += 8;
                        var18 = var15.substring(var48, var13).getBytes("ISO-8859-1");
                        var43 = var17;
                        var48 = var14++;
                        var50 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var51 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var47;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label74;
               }

               var26 = "\b\b^þä´\u0010-=¶oºá#!W \u009faä\u0095\u0089?Í\u0006\u0086+¢XF\u00ad\u0089¨ÙüÄÊæÚ(\u001e\u009dµOU\"k\u001e÷";
               var28 = "\b\b^þä´\u0010-=¶oºá#!W \u009faä\u0095\u0089?Í\u0006\u0086+¢XF\u00ad\u0089¨ÙüÄÊæÚ(\u001e\u009dµOU\"k\u001e÷".length();
               var25 = 16;
               var24 = -1;
            }

            ++var24;
            var41 = var26.substring(var24, var24 + var25);
            var44 = 0;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1790;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ng", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ng" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3379;
      if (t[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ng", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ng" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
