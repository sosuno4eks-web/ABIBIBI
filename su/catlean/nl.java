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
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nl extends nm {
   @NotNull
   public static final nl I;
   private static final long c = j0.a(-8283556763964087357L, 8123344677368568618L, MethodHandles.lookup().lookupClass()).a(126809709643890L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;

   private nl(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 91689187736863L;
      super(true.w<invokedynamic>(29515, 8768757155546934736L ^ var1), var3);
   }

   public void k(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 58527580722751L;
      long var6 = var2 ^ 60534192742326L;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(32026, 2572696037777491206L ^ var2));
      Pair var8 = this.H(var6);
      boolean var9 = false;
      Object var10000 = var8.getFirst();
      Object var10001 = var8.getSecond();
      String var10003 = true.w<invokedynamic>(9785, 4586096192917315108L ^ var2);
      String var12 = var10003 + var10000 + true.w<invokedynamic>(219, 3483708656282810563L ^ var2) + var10001;
      this.G(var1, var4, var12);
   }

   private final Pair H(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var9 = c ^ 27697078416207L;
      long var11 = var9 ^ 80999380890236L;
      i = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "ÔÞ`\u0095GsÌÉ\u0091V\u0097ü$.\u008e' P.·\u0081£NÄ\u0081³\u008e\u0001 \u000fÜûM´l/°Èa}Ú&hç\\¸\u001d¡J(àz\u000b×pú·2æ\u00019*2E/¿yþ.EµHM³(\u0080U]\u0015íçw\u0017o\u0092Ë[(\u0006P";
      int var6 = "ÔÞ`\u0095GsÌÉ\u0091V\u0097ü$.\u008e' P.·\u0081£NÄ\u0081³\u008e\u0001 \u000fÜûM´l/°Èa}Ú&hç\\¸\u001d¡J(àz\u000b×pú·2æ\u00019*2E/¿yþ.EµHM³(\u0080U]\u0015íçw\u0017o\u0092Ë[(\u0006P".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var13 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = b(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var17;
               if ((var2 += var3) >= var6) {
                  d = var7;
                  e = new String[5];
                  I = new nl(var11);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var17;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\u0081\u001fó\u0090l«\u008ds\u0092Ô\u0094ª >æ\u008f\u001d!ö·u·\u009a;\u0010B,WÔÜ%\\Fßö\u009fñ+ÝH8";
               var6 = "\u0081\u001fó\u0090l«\u008ds\u0092Ô\u0094ª >æ\u008f\u001d!ö·u·\u009a;\u0010B,WÔÜ%\\Fßö\u009fñ+ÝH8".length();
               var3 = 24;
               var2 = -1;
            }

            ++var2;
            var13 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24490;
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
            throw new RuntimeException("su/catlean/nl", var10);
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
         throw new RuntimeException("su/catlean/nl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
