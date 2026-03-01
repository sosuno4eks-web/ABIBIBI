package su.catlean;

import java.io.File;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class dn extends dh {
   @NotNull
   private final vp O;
   @NotNull
   private final File M;
   public List v;
   public hs g;
   private static String[] R;
   private static final long b = j0.a(-8836817583152360496L, 5037997818521577985L, MethodHandles.lookup().lookupClass()).a(222047170532657L);
   private static final String[] d;
   private static final String[] e;
   private static final Map h;
   private static final long[] j;
   private static final Integer[] k;
   private static final Map o;

   public dn(long a, @NotNull Json json, @NotNull vp sharedSource) {
      var1 ^= b;
      long var10001 = var1 ^ 100496071767567L;
      int var5 = (int)((var1 ^ 100496071767567L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(11628, 3687917590567231280L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(31602, 9045974600234125609L ^ var1));
      super(var5, (char)var6, var3, (char)var7);
      this.O = var4;
      this.M = new File(kf.e(), true.p<invokedynamic>(11718, 6831719587555057563L ^ var1));
   }

   @NotNull
   public File K() {
      return this.M;
   }

   @NotNull
   public final List T(long var1) {
      var1 ^= b;

      try {
         List var10000 = this.v;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -7887906808726250946L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.p<invokedynamic>(24534, 46247265622777712L ^ var1));
      return null;
   }

   public final void b(long a, @NotNull List <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(7553, 4235377645513664923L ^ var1));
      this.v = var3;
   }

   @NotNull
   public final hs S(long var1) {
      var1 ^= b;

      try {
         hs var10000 = this.g;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -2419354108507531558L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.p<invokedynamic>(10166, 161426150190246904L ^ var1));
      return null;
   }

   public final void n(int a, char a, char a, @NotNull hs <set-?>) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(13737, 1291654385058645990L ^ var5));
      this.g = var4;
   }

   public void N(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void i(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void e(short a, int a, @NotNull List modules, @NotNull String id, char a) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean v(String var0, hs var1) {
      long var2 = b ^ 90022405570170L;
      Intrinsics.checkNotNullParameter(var1, true.p<invokedynamic>(18064, 2261108171356922152L ^ var2));
      return Intrinsics.areEqual((Object)var1.b(), (Object)var0);
   }

   private static final boolean S(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   public static void J(String[] var0) {
      R = var0;
   }

   public static String[] p() {
      return R;
   }

   static {
      long var20 = b ^ 130445073142755L;
      String[] var10000 = new String[4];
      h = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -7468223127960808251L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[13];
      int var16 = 0;
      String var15 = "\u0080wÅk\n:9ÿ\u008eGóÝV¶x[X\u0080æ\u0013,TþuñGÇ\u0089ß\u008cØC\u0000Âk-M·B<8¥\u008eµuO{T¤ÌþÖtµzî\u0086¿\r§ãÈ\u008f+/Âq(ÞrðtU]_\u0017ã\u008d\u0091Mr)\u0098ði\bÆ0É¾9ÂÈÓ:ùÖ¯R\u008a'\b]¸¾\u0010Tú\u0099Á\u009aÖ\u0016B\u0098³G7\u008a¦@!\u00103¾x^-ä\u001dàÂ:\u0095L²¾ÿ¥\u0010²Á=2AbL.¡Awt6\u001bòb\u0010PÓÑÆcò\u0001`rÛgmgÖB\u009d\u0010e\u0095Ï\u007f=^\"\u0005!d+ø¥ g\u00ad\u0010BÖ\u0017¶C¬\u0005Y\u0096pÓ\u0006\u008fÑ´\u000b\u0010/4\u009d×Þ\u0099;\u0012&çõ¹\u00140Bâ\u0010\u0017ø\u0097\u001c³\u000fu )76%ó¶63\u0010´æâ\u0085Ý\u0087ôp\u0005ñc±9\u0084Ï7";
      int var17 = "\u0080wÅk\n:9ÿ\u008eGóÝV¶x[X\u0080æ\u0013,TþuñGÇ\u0089ß\u008cØC\u0000Âk-M·B<8¥\u008eµuO{T¤ÌþÖtµzî\u0086¿\r§ãÈ\u008f+/Âq(ÞrðtU]_\u0017ã\u008d\u0091Mr)\u0098ði\bÆ0É¾9ÂÈÓ:ùÖ¯R\u008a'\b]¸¾\u0010Tú\u0099Á\u009aÖ\u0016B\u0098³G7\u008a¦@!\u00103¾x^-ä\u001dàÂ:\u0095L²¾ÿ¥\u0010²Á=2AbL.¡Awt6\u001bòb\u0010PÓÑÆcò\u0001`rÛgmgÖB\u009d\u0010e\u0095Ï\u007f=^\"\u0005!d+ø¥ g\u00ad\u0010BÖ\u0017¶C¬\u0005Y\u0096pÓ\u0006\u008fÑ´\u000b\u0010/4\u009d×Þ\u0099;\u0012&çõ¹\u00140Bâ\u0010\u0017ø\u0097\u001c³\u000fu )76%ó¶63\u0010´æâ\u0085Ý\u0087ôp\u0005ñc±9\u0084Ï7".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var28 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[13];
                  o = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "¡8À¤ì\u008d\u0095\u001a®7\nð8Eï\r";
                  int var5 = "¡8À¤ì\u008d\u0095\u001a®7\nð8Eï\r".length();
                  int var2 = 0;

                  do {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var26 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var30 = true;
                     var6[var26] = var10004;
                  } while(var2 < var5);

                  j = var6;
                  k = new Integer[2];
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "YV\\Wo\u0000UW4_<\u0097wY\t¥\u0018G\u008fJ \"z\u008f$wvLó/;¯7\u001aHqVÕ\u001eT!";
               var17 = "YV\\Wo\u0000UW4_<\u0097wY\t¥\u0018G\u008fJ \"z\u008f$wvLó/;¯7\u001aHqVÕ\u001eT!".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4884;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/dn", var10);
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
         throw new RuntimeException("su/catlean/dn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4375;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/dn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/dn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
