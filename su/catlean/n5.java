package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class n5 extends nm {
   @NotNull
   public static final n5 m;
   @NotNull
   private static final List V;
   @NotNull
   private static final aa u;
   private static final long c = j0.a(-9016365297081436433L, 7609790973278120209L, MethodHandles.lookup().lookupClass()).a(272593593638574L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] n;
   private static final Map p;

   private n5(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
      long var6 = var4 ^ 45693280926235L;
      super(true.b<invokedynamic>(22855, 6562661642050332317L ^ var4), var6);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean p(ho param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean Y(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var27 = c ^ 73974203760498L;
      long var10001 = var27 ^ 115681341536581L;
      int var29 = (int)((var27 ^ 115681341536581L) >>> 48);
      int var30 = (int)(var10001 << 16 >>> 48);
      int var31 = (int)(var10001 << 32 >>> 32);
      var10001 = var27 ^ 117824232905923L;
      int var32 = (int)((var27 ^ 117824232905923L) >>> 48);
      int var33 = (int)(var10001 << 16 >>> 48);
      int var34 = (int)(var10001 << 32 >>> 32);
      i = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[11];
      int var23 = 0;
      String var22 = "\u008b£¤bó©Ì\u0006\u008fÓäa\u0088\"Ù\f\u00137Åg\u0096\u0003\u0015\r 8H\u0085.æ\u001cì~\u009f´\u0013/®Jp\u0098 ¢DÑ\t3ÈýlîìG?O\u00057 \u009d\u0000YëîØçuãgíj\u008f\u0085¦\u0016%w£Ç\u0082bØü\u009aaÕ?õÜ\u0099\t(×\u007fTHª¾\u0093\u000f\u009d A\"\u0019Ì\u008f\u007fµ7\u0003Î'Q\u0007ý©\u000e<Ã\u0084×îB1~þNÚÓF¾ °ÂB÷Lò`y\u0094\u0011Ça\u009fc\u0085Ë\u0080Dàj_E\u0011+\\èácÇ\u0082jú(Æz. ´º\u000fX\u009e\u0099Ñ\u0015]½\u001bò\u0007´}\u0084¿Zü\u0016ØL°\u0095\u001cË¦aõNÔ\u009b&½2 (F\u0093:=²º\u009d¼\rí\u008c÷çÂÐ£ßiî\u0085¯\u0085Õ\u0081¯µúñ¡Õ*3e\u008d=÷u\u008e\u0007g\u0010åwrô\\u\u0095Á[\u00ad<Ñö\bb_\u0010\u0085HZ}\u000e¬\u0098ú/6$Tï²aø";
      int var24 = "\u008b£¤bó©Ì\u0006\u008fÓäa\u0088\"Ù\f\u00137Åg\u0096\u0003\u0015\r 8H\u0085.æ\u001cì~\u009f´\u0013/®Jp\u0098 ¢DÑ\t3ÈýlîìG?O\u00057 \u009d\u0000YëîØçuãgíj\u008f\u0085¦\u0016%w£Ç\u0082bØü\u009aaÕ?õÜ\u0099\t(×\u007fTHª¾\u0093\u000f\u009d A\"\u0019Ì\u008f\u007fµ7\u0003Î'Q\u0007ý©\u000e<Ã\u0084×îB1~þNÚÓF¾ °ÂB÷Lò`y\u0094\u0011Ça\u009fc\u0085Ë\u0080Dàj_E\u0011+\\èácÇ\u0082jú(Æz. ´º\u000fX\u009e\u0099Ñ\u0015]½\u001bò\u0007´}\u0084¿Zü\u0016ØL°\u0095\u001cË¦aõNÔ\u009b&½2 (F\u0093:=²º\u009d¼\rí\u008c÷çÂÐ£ßiî\u0085¯\u0085Õ\u0081¯µúñ¡Õ*3e\u008d=÷u\u008e\u0007g\u0010åwrô\\u\u0095Á[\u00ad<Ñö\bb_\u0010\u0085HZ}\u000e¬\u0098ú/6$Tï²aø".length();
      char var21 = 24;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var35 = var22.substring(var20, var20 + var21);
         byte var38 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var35.getBytes("ISO-8859-1"));
            String var41 = b(var26).intern();
            switch(var38) {
            case 0:
               var25[var23++] = var41;
               if ((var20 += var21) >= var24) {
                  d = var25;
                  e = new String[11];
                  p = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[8];
                  int var10 = 0;
                  String var11 = "ïØÔ\u0083×eC\u0093×\u008f\u0002«.t_¸_Àb(aÖ\u000b\u0013ehïßòºªã\u0098\u008d¸a¬\\¥KK9N<! ÿÍ";
                  int var12 = "ïØÔ\u0083×eC\u0093×\u008f\u0002«.t_¸_Àb(aÖ\u000b\u0013ehïßòºªã\u0098\u008d¸a¬\\¥KK9N<! ÿÍ".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var42 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var42, var9).getBytes("ISO-8859-1");
                     long[] var37 = var13;
                     var42 = var10++;
                     long var45 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var46 = -1;

                     while(true) {
                        long var15 = var45;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var48 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var46) {
                        case 0:
                           var37[var42] = var48;
                           if (var9 >= var12) {
                              j = var13;
                              n = new Integer[8];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = -569712969276170029L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var45 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var44 = true;
                              long var0 = var45;
                              m = new n5((short)var29, (short)var30, var31);
                              V = (List)(new ArrayList());
                              u = new aa(sa.OUT_BACK, var0, (short)var32, (short)var33, var34);
                              return;
                           }
                           break;
                        default:
                           var37[var42] = var48;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "Þ\u009f¥\u009avÀ^C\u009aöpj|ë°T";
                           var12 = "Þ\u009f¥\u009avÀ^C\u009aöpj|ë°T".length();
                           var9 = 0;
                        }

                        var42 = var9;
                        var9 += 8;
                        var14 = var11.substring(var42, var9).getBytes("ISO-8859-1");
                        var37 = var13;
                        var42 = var10++;
                        var45 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var46 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var41;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "a\u0089ò¸Í¿¾¼\u009d937ð\u0016ïs\u0010\u0013óÈûè|0ãLË\u0099ÈXOÆ¤";
               var24 = "a\u0089ò¸Í¿¾¼\u009d937ð\u0016ïs\u0010\u0013óÈûè|0ãLË\u0099ÈXOÆ¤".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var35 = var22.substring(var20, var20 + var21);
            var38 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31215;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/n5", var10);
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
         throw new RuntimeException("su/catlean/n5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10561;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
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
            throw new RuntimeException("su/catlean/n5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
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
         throw new RuntimeException("su/catlean/n5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
