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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nd extends nm {
   @NotNull
   public static final nd S;
   private static final long c = j0.a(8652201158689320625L, 2175880929291672892L, MethodHandles.lookup().lookupClass()).a(117860574543605L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long j;

   private nd(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 2554552574807L;
      super(true.m<invokedynamic>(27395, 2595645316299367126L ^ var4), var6);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var14 = c ^ 140712592587803L;
      long var10001 = var14 ^ 138913864393568L;
      int var16 = (int)((var14 ^ 138913864393568L) >>> 32);
      int var17 = (int)(var10001 << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      i = new HashMap(13);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "fÑÜ\u0081Å\u0011\u0016:¯d\n\u000f0R\u0081\u009az)Y\u0088ñ\u00132\u009a|æV¬\u0006\u008bl\u0089(\u000bxÑ×\u000b\u0081cÈ¹v·Ñl`J vòÃ\u0094ú4\u001b\u0085\u001cQUn\u001f\u001d½ìÆ 2ÝðC\u00adA\u0010\rá\u008a]ë·\u0089\u0015$\u00ad¶Ç\u0000\u000f\u0093`\u0010·6\nÅAØ³|¾\bôDê\b\u0003\u001e";
      int var11 = "fÑÜ\u0081Å\u0011\u0016:¯d\n\u000f0R\u0081\u009az)Y\u0088ñ\u00132\u009a|æV¬\u0006\u008bl\u0089(\u000bxÑ×\u000b\u0081cÈ¹v·Ñl`J vòÃ\u0094ú4\u001b\u0085\u001cQUn\u001f\u001d½ìÆ 2ÝðC\u00adA\u0010\rá\u008a]ë·\u0089\u0015$\u00ad¶Ç\u0000\u000f\u0093`\u0010·6\nÅAØ³|¾\bôDê\b\u0003\u001e".length();
      char var8 = ' ';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var19 = var9.substring(var7, var7 + var8);
         byte var21 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = b(var13).intern();
            switch(var21) {
            case 0:
               var12[var10++] = var25;
               if ((var7 += var8) >= var11) {
                  d = var12;
                  e = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 2625029845596780769L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var24 = true;
                  j = var27;
                  S = new nd(var16, (short)var17, (char)var18);
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var25;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "\u0089\b\rË\b\"\u0090i:æZ\u008eõ¿9\u0004\u0010íp]\u000bfv#·Ïhó\u0090Ì\u009bÏ®";
               var11 = "\u0089\b\rË\b\"\u0090i:æZ\u008eõ¿9\u0004\u0010íp]\u000bfv#·Ïhó\u0090Ì\u009bÏ®".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var19 = var9.substring(var7, var7 + var8);
            var21 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22191;
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
            throw new RuntimeException("su/catlean/nd", var10);
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
         throw new RuntimeException("su/catlean/nd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
