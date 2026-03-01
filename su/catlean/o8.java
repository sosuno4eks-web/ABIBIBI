package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class o8 extends k9 {
   @NotNull
   public static final o8 d;
   private static int q;
   private static int Q;
   private static final long b = j0.a(1685659045872326509L, 7429586924133587948L, MethodHandles.lookup().lookupClass()).a(230321465291124L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private o8(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 124923001446772L;
      super(var3, true.f<invokedynamic>(17694, 5274708915433412235L ^ var1), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   private final void D(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final s1 j(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final void b() {
      long var0 = b ^ 20350584215405L;
      long var2 = var0 ^ 67475661302475L;
      long var4 = var0 ^ 86745102863807L;
      long var10001 = var0 ^ 119255705566572L;
      int var6 = (int)((var0 ^ 119255705566572L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      s8.f(var4).method_3137();
      s8.f(var4).method_7346();
      s8.H((short)var6, (short)var7, var8).method_1507((class_437)null);
      i4.v.B(var2);
   }

   static {
      long var20 = b ^ 19746145969475L;
      long var22 = var20 ^ 60163049070411L;
      f = new HashMap(13);
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
      String var15 = "È´4\u0016ê8\u009a#\u009c¨ä¸Â\u0091çíü©©\u0087çA\u001d`Z\u0083\u0096}ø :²p¤éÓY¿Q´k\u0014:\u0000Ý\u0087Åæ}\u000b³Âya'\u008f¬\u0089NäÊ»×gñ=(\u0087dÔÛ\u0080\u0097¢G¹¾ÚAË\u0088\u000e`Å\u0099;ó\u0000íïJmm\"Oä½÷\u009aäþ\u009fïK\u009cÐ];ÒbÎ\u0085Ê>H²fàÕ\u009b\u00888Í\u009bwßÎP\u0096ÊÇé\u0085\u007f\u00ad<\u009ejªzöíï$/";
      int var17 = "È´4\u0016ê8\u009a#\u009c¨ä¸Â\u0091çíü©©\u0087çA\u001d`Z\u0083\u0096}ø :²p¤éÓY¿Q´k\u0014:\u0000Ý\u0087Åæ}\u000b³Âya'\u008f¬\u0089NäÊ»×gñ=(\u0087dÔÛ\u0080\u0097¢G¹¾ÚAË\u0088\u000e`Å\u0099;ó\u0000íïJmm\"Oä½÷\u009aäþ\u009fïK\u009cÐ];ÒbÎ\u0085Ê>H²fàÕ\u009b\u00888Í\u009bwßÎP\u0096ÊÇé\u0085\u007f\u00ad<\u009ejªzöíï$/".length();
      char var14 = ' ';
      int var13 = -1;

      while(true) {
         ++var13;
         byte[] var19 = var11.doFinal(var15.substring(var13, var13 + var14).getBytes("ISO-8859-1"));
         String var27 = b(var19).intern();
         boolean var10001 = true;
         var18[var16++] = var27;
         if ((var13 += var14) >= var17) {
            c = var18;
            e = new String[2];
            k = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[10];
            int var3 = 0;
            String var4 = "\u0015Ç§÷Î´ì\u0002u\u0088Ûñ.Mß3^®\u0014\u000eÿ\u0010ùTbÇUØ\u0016¶$xUì\u0001>\u0083\u0092¡ª\u0085\\\u0016\u0015p\u0006e\u0089\u0084Õq ?ÝÎ1çëÐ\u001c+>\u008añ";
            int var5 = "\u0015Ç§÷Î´ì\u0002u\u0088Ûñ.Mß3^®\u0014\u000eÿ\u0010ùTbÇUØ\u0016¶$xUì\u0001>\u0083\u0092¡ª\u0085\\\u0016\u0015p\u0006e\u0089\u0084Õq ?ÝÎ1çëÐ\u001c+>\u008añ".length();
            int var2 = 0;

            label32:
            while(true) {
               int var26 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
               long[] var24 = var6;
               var26 = var3++;
               long var29 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var30 = -1;

               while(true) {
                  long var8 = var29;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch(var30) {
                  case 0:
                     var24[var26] = var33;
                     if (var2 >= var5) {
                        g = var6;
                        i = new Integer[10];
                        d = new o8(var22);
                        return;
                     }
                     break;
                  default:
                     var24[var26] = var33;
                     if (var2 < var5) {
                        continue label32;
                     }

                     var4 = "uº\u0018\u001c\u0081\u001cæâ¤cHl\u001fdÝQ";
                     var5 = "uº\u0018\u001c\u0081\u001cæâ¤cHl\u001fdÝQ".length();
                     var2 = 0;
                  }

                  var26 = var2;
                  var2 += 8;
                  var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                  var24 = var6;
                  var26 = var3++;
                  var29 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27037;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/o8", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
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
         throw new RuntimeException("su/catlean/o8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22877;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/o8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/o8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
