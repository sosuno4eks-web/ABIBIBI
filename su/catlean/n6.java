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
import kotlin.collections.ArrayDeque;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class n6 extends nm {
   @NotNull
   public static final n6 D;
   @NotNull
   private static final ArrayDeque p;
   @NotNull
   private static final aa c;
   private static final long d = j0.a(-2849940897312057740L, 1050550284863168245L, MethodHandles.lookup().lookupClass()).a(219027074557674L);
   private static final String[] e;
   private static final String[] i;
   private static final Map j;
   private static final long[] m;
   private static final Integer[] n;
   private static final Map t;

   private n6(long var1) {
      var1 ^= d;
      long var3 = var1 ^ 112508160309942L;
      super(true.u<invokedynamic>(19779, 4343783123846829745L ^ var1), var3);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void Y(long param1, char param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var27 = d ^ 97333988537307L;
      long var29 = var27 ^ 67253173400897L;
      long var10001 = var27 ^ 105834341315449L;
      int var31 = (int)((var27 ^ 105834341315449L) >>> 48);
      int var32 = (int)(var10001 << 16 >>> 48);
      int var33 = (int)(var10001 << 32 >>> 32);
      j = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "ÿ\u0095Âvg\u008a¤\u0085Ìe\u00173,÷\u0080à @!Ý\u0086O\u0087Úïðó\u0001Ü*M»â#Ñ\u0084à5R\u0003\u001a\r\u0015ô\u0085 8Èk GG\u0087©Í§ß\u0094Ê,o/0ZØ\u008bÛâú§l¼%\u009fÒþE0zh/i Ñw\u0085tX-mkÂ\u001dØOóè~\u0099N¢n\u0092Ç²-É\u001eR\u009c\u0090l\u000fåM \u0092qHÞ`1Ý½ÇqF\bähýêJçïi\u007f\u0010\u001eÑ.\u0091\u009cý/Î7Y\u0010ºN\u0018\f¢/';9Ì\u0099íA\u0012àu \u008a&(±ü\u0091\u007fÁQ,\u0007\u0097æA!\u001d\u008ey\u0095/\u001bòim{£Õ\u0016] e\b(\u0016rþCñèÝ$e&\u0019Ên!uÀw0s\u0094½ÿ\u008d6\u0007i×\bô´\u0095ñ;[ÙÐq\u0010ùÜ\u0018\".CÉ\u0013\u00978³²Çá#j¬Vè»\u0096!ÿ3#Ò| \u0095\u0092ÀÜéIö[Â\u008f\u009bÉ\u0003\u001a\u0013×_oßÄ+d\u0010\u008b¦yÝ½c·°ç %\u0087Nùøìú\u0086\u0087eÉ|\u008d\b¦Å\u000bM\u007f\r\u0019\u0019 ì\u0003\u001d0B¨ \u009b\u000b îÈ\u0016\u0094^I¤ï3éEI¦²2÷\u0092r¦âOk0n\u0092Dõ\u0091{Ò:ò\u0018%Y\u0012Y!1x\u0080e/¾í×\u00adü-D®3×\u0013>kÃ";
      int var24 = "ÿ\u0095Âvg\u008a¤\u0085Ìe\u00173,÷\u0080à @!Ý\u0086O\u0087Úïðó\u0001Ü*M»â#Ñ\u0084à5R\u0003\u001a\r\u0015ô\u0085 8Èk GG\u0087©Í§ß\u0094Ê,o/0ZØ\u008bÛâú§l¼%\u009fÒþE0zh/i Ñw\u0085tX-mkÂ\u001dØOóè~\u0099N¢n\u0092Ç²-É\u001eR\u009c\u0090l\u000fåM \u0092qHÞ`1Ý½ÇqF\bähýêJçïi\u007f\u0010\u001eÑ.\u0091\u009cý/Î7Y\u0010ºN\u0018\f¢/';9Ì\u0099íA\u0012àu \u008a&(±ü\u0091\u007fÁQ,\u0007\u0097æA!\u001d\u008ey\u0095/\u001bòim{£Õ\u0016] e\b(\u0016rþCñèÝ$e&\u0019Ên!uÀw0s\u0094½ÿ\u008d6\u0007i×\bô´\u0095ñ;[ÙÐq\u0010ùÜ\u0018\".CÉ\u0013\u00978³²Çá#j¬Vè»\u0096!ÿ3#Ò| \u0095\u0092ÀÜéIö[Â\u008f\u009bÉ\u0003\u001a\u0013×_oßÄ+d\u0010\u008b¦yÝ½c·°ç %\u0087Nùøìú\u0086\u0087eÉ|\u008d\b¦Å\u000bM\u007f\r\u0019\u0019 ì\u0003\u001d0B¨ \u009b\u000b îÈ\u0016\u0094^I¤ï3éEI¦²2÷\u0092r¦âOk0n\u0092Dõ\u0091{Ò:ò\u0018%Y\u0012Y!1x\u0080e/¾í×\u00adü-D®3×\u0013>kÃ".length();
      char var21 = 16;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var34 = var22.substring(var20, var20 + var21);
         byte var36 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var26).intern();
            switch(var36) {
            case 0:
               var25[var23++] = var41;
               if ((var20 += var21) >= var24) {
                  e = var25;
                  i = new String[15];
                  t = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[5];
                  int var10 = 0;
                  String var11 = "\n\u008eµôÀ¿\u009f)\u0006ïQ¶ìo³\n\u0091Á½\u007fÖ\u0000a\u0017";
                  int var12 = "\n\u008eµôÀ¿\u009f)\u0006ïQ¶ìo³\n\u0091Á½\u007fÖ\u0000a\u0017".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var40 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var40, var9).getBytes("ISO-8859-1");
                     long[] var37 = var13;
                     var40 = var10++;
                     long var44 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var45 = -1;

                     while(true) {
                        long var15 = var44;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var47 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var45) {
                        case 0:
                           var37[var40] = var47;
                           if (var9 >= var12) {
                              m = var13;
                              n = new Integer[5];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = 1466647352317678384L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var44 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var43 = true;
                              long var0 = var44;
                              D = new n6(var29);
                              p = new ArrayDeque(true.m<invokedynamic>(8375, 1716920882291086617L ^ var27));
                              c = new aa(sa.OUT_BACK, var0, (short)var31, (short)var32, var33);
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var47;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "&Æ\u0087@\u0087ì\u0014*ç\u008b¡\rå¾·½";
                           var12 = "&Æ\u0087@\u0087ì\u0014*ç\u008b¡\rå¾·½".length();
                           var9 = 0;
                        }

                        var40 = var9;
                        var9 += 8;
                        var14 = var11.substring(var40, var9).getBytes("ISO-8859-1");
                        var37 = var13;
                        var40 = var10++;
                        var44 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var45 = 0;
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

               var22 = "dË\u008b·p´IØ\u0003-\u0084§pÜó®j\"\u0098\u0084\u0083¡±U\u0010\u008eu·ÀØMÆíüt`VE\u0099²µ";
               var24 = "dË\u008b·p´IØ\u0003-\u0084§pÜó®j\"\u0098\u0084\u0083¡±U\u0010\u008eu·ÀØMÆíüt`VE\u0099²µ".length();
               var21 = 24;
               var20 = -1;
            }

            ++var20;
            var34 = var22.substring(var20, var20 + var21);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23905;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/n6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("su/catlean/n6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10865;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/n6", var14);
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
         throw new RuntimeException("su/catlean/n6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
