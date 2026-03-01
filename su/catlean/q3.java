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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class q3 {
   private static final long a = j0.a(4406009261826702901L, 1671168074689019675L, MethodHandles.lookup().lookupClass()).a(57462733481636L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static final void j(char a, int a, int a, @NotNull String id, @NotNull hh type) {
      // $FF: Couldn't be decompiled
   }

   public static final void D(@NotNull String id, long a, @NotNull hh type) {
      // $FF: Couldn't be decompiled
   }

   public static final void A(@NotNull String id, @NotNull hh type, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean j(String var0, hs var1) {
      long var2 = a ^ 26236198412565L;
      Intrinsics.checkNotNullParameter(var1, true.g<invokedynamic>(15121, 8433788790923547262L ^ var2));
      return Intrinsics.areEqual((Object)var1.b(), (Object)var0);
   }

   private static final boolean Q(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean d(String var0, ru var1) {
      long var2 = a ^ 80035361616439L;
      Intrinsics.checkNotNullParameter(var1, true.g<invokedynamic>(7556, 6808695361634428870L ^ var2));
      return Intrinsics.areEqual((Object)var1.X(), (Object)var0);
   }

   private static final boolean k(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var0 = a ^ 51357975824654L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "p¤^ö²\u0081t\u009397$Hãù\u008dÞ \u0005ñB>Ã9½\"\u0082\u001b\u009aèJ@3R\" ä;K#½5\u00ad\u0094Ü\u001f|@Zo\u0010Ì{\rÄË\u0080\u0003\u009dLTGÐ4Ñ«Ü\u0010 !.¢P\u0010\u0081è\u0018\u000bp\u000f6\u001f\f \u0010jù\u0090ú\u0086\u001eóûÍ\u0088¡¨Z\u0011³e\u0010ÉqX\u001dhKb(Þ5¤î`\fÅ\u0092\u0010Ì¬{\\6=®KöØUvÌ!U?\u0010\u0013\u007f§]¨FB\u009e\u0096\u008c ö\t O¤\u0010û¤K\u0015\u001dÌ\u0083Û\u001dèú¹Ò\u0016Y¾\u0010\u000f'þ¥ð\u0084Á1ÙÿÊã\u0003®¸¿";
      int var8 = "p¤^ö²\u0081t\u009397$Hãù\u008dÞ \u0005ñB>Ã9½\"\u0082\u001b\u009aèJ@3R\" ä;K#½5\u00ad\u0094Ü\u001f|@Zo\u0010Ì{\rÄË\u0080\u0003\u009dLTGÐ4Ñ«Ü\u0010 !.¢P\u0010\u0081è\u0018\u000bp\u000f6\u001f\f \u0010jù\u0090ú\u0086\u001eóûÍ\u0088¡¨Z\u0011³e\u0010ÉqX\u001dhKb(Þ5¤î`\fÅ\u0092\u0010Ì¬{\\6=®KöØUvÌ!U?\u0010\u0013\u007f§]¨FB\u009e\u0096\u008c ö\t O¤\u0010û¤K\u0015\u001dÌ\u0083Û\u001dèú¹Ò\u0016Y¾\u0010\u000f'þ¥ð\u0084Á1ÙÿÊã\u0003®¸¿".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[12];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "R\u0087\u0081!î\u0004¥$^Q\u0097\u0003k(É(\u0010P\u0087C\u0091¬1°Ðz\u009aCõ\u000f\u0001ßK";
               var8 = "R\u0087\u0081!î\u0004¥$^Q\u0097\u0003k(É(\u0010P\u0087C\u0091¬1°Ðz\u009aCõ\u000f\u0001ßK".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3160;
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
            throw new RuntimeException("su/catlean/q3", var10);
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
         throw new RuntimeException("su/catlean/q3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
