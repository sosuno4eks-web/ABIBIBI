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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vo {
   private static final long a = j0.a(4719824559494631322L, 5221258630233665979L, MethodHandles.lookup().lookupClass()).a(244775554234947L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   @Nullable
   public static final pk y(@NotNull ej configState, long a, @NotNull List clearedList) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean s(float param0, int param1, char param2, float param3, int param4, ej param5) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean k(float param0, char param1, long param2, ej param4) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public static final mg S(@NotNull o6 $this$compareDamages, @NotNull class_2338 pos, @NotNull ej configState, long a, boolean ignoreMinDamage, boolean place, boolean basePlace) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean r(float param0, float param1, boolean param2, long param3, ej param5) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 13122822216293L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[9];
      int var12 = 0;
      String var11 = "\u0005\u0005²2\nom¸\u0099_Ñ\u008b\u000føö\u009d!sLN\u001aµÇ\t¯\u009dcë\u009dáÚø \u0002óÈ\u001e´c\u0084\u00ad\u001d_\u0007G¡·úÍÃ6`\u009e\u008ba±\u0091ÏäGµÁ#\u0003¿\u0080_¡¼¡v¤h\u000f\u0004ìetÜÿ\u0000J\b\u0007\u0098m1¤\u0093ùKÐM6â \r¦\u0013\fNòÿX*Ï\u0094ç\u001eó\u0004EIÛHÂ*¬~\u0091\u000fó¾´\u0019\u0094Å\u0012ÂÎ\u0090å$\u000eøy\t\u000bW\u008aU\u009b\u0011rá3»etaê\u0091\u0002°\u0017¾{¹X|\u001e«ð4ÀÝ\"\u001aòÿpô%ý\u0095QyýO\u0004êÐ_$QÐ1ðù\u008b\u0087o\u0082Î\u0010o³³\u0005\u0099Z]¦\u008aøH[\u0081dÝ\u008c(¾\u0084ÇZ\b\u0096\u0095Ï\u0096\u001cÌU(\u0012=\u0010Cø¤i1×dM!=P\u00022\u0017Ä\u0086ViTÕÓ\"PS(\u0093\u001a\u0086JP|¦C\u0082\u0094g×\\â\u000f\u0016+!\u008b\u0001ÙíÒOú\u0013ê\bOt¢\u008f\u0099f\u008e\u009f=\u0095ô\u00ad\u0018i=A\u0015Mt÷ÕSæ\u0089ÓC\u0013[\u0092\u0011\u0084ÉÔúÜWm";
      int var13 = "\u0005\u0005²2\nom¸\u0099_Ñ\u008b\u000føö\u009d!sLN\u001aµÇ\t¯\u009dcë\u009dáÚø \u0002óÈ\u001e´c\u0084\u00ad\u001d_\u0007G¡·úÍÃ6`\u009e\u008ba±\u0091ÏäGµÁ#\u0003¿\u0080_¡¼¡v¤h\u000f\u0004ìetÜÿ\u0000J\b\u0007\u0098m1¤\u0093ùKÐM6â \r¦\u0013\fNòÿX*Ï\u0094ç\u001eó\u0004EIÛHÂ*¬~\u0091\u000fó¾´\u0019\u0094Å\u0012ÂÎ\u0090å$\u000eøy\t\u000bW\u008aU\u009b\u0011rá3»etaê\u0091\u0002°\u0017¾{¹X|\u001e«ð4ÀÝ\"\u001aòÿpô%ý\u0095QyýO\u0004êÐ_$QÐ1ðù\u008b\u0087o\u0082Î\u0010o³³\u0005\u0099Z]¦\u008aøH[\u0081dÝ\u008c(¾\u0084ÇZ\b\u0096\u0095Ï\u0096\u001cÌU(\u0012=\u0010Cø¤i1×dM!=P\u00022\u0017Ä\u0086ViTÕÓ\"PS(\u0093\u001a\u0086JP|¦C\u0082\u0094g×\\â\u000f\u0016+!\u008b\u0001ÙíÒOú\u0013ê\bOt¢\u008f\u0099f\u008e\u009f=\u0095ô\u00ad\u0018i=A\u0015Mt÷ÕSæ\u0089ÓC\u0013[\u0092\u0011\u0084ÉÔúÜWm".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[9];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 3750273654024568425L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "~Èà\u009aCl\u0000èùJlúôë.\u0012\u0018@È\u0019,ª0\u0018\u0016éfìþ\u0010\u001eý«ß{tÈ4µb¸";
               var13 = "~Èà\u009aCl\u0000èùJlúôë.\u0012\u0018@È\u0019,ª0\u0018\u0016éfìþ\u0010\u001eý«ß{tÈ4µb¸".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 987;
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
            throw new RuntimeException("su/catlean/vo", var10);
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
         throw new RuntimeException("su/catlean/vo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
