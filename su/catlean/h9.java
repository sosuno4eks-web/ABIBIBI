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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class h9 {
   @NotNull
   public static final se i;
   @NotNull
   private final String y;
   @NotNull
   private final String A;
   private static final long a = j0.a(1069857462619620233L, 4016398213154739606L, MethodHandles.lookup().lookupClass()).a(175591184724993L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public h9(long a, @NotNull String label, @NotNull String url) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(13075, 2331284176768436391L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(19669, 1882923284807513956L ^ var1));
      super();
      this.y = var3;
      this.A = var4;
   }

   @NotNull
   public final String Z() {
      return this.y;
   }

   @NotNull
   public final String y() {
      return this.A;
   }

   @NotNull
   public final String R() {
      return this.y;
   }

   @NotNull
   public final String W() {
      return this.A;
   }

   @NotNull
   public final h9 o(char a, int a, @NotNull String label, @NotNull String url, char a) {
      long var6 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 17323828997497L;
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(20833, 6047772942291152849L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(8830, 5702275355663391948L ^ var6));
      return new h9(var8, var3, var4);
   }

   public static h9 I(h9 var0, String var1, String var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var10001 = var5 ^ 138430758876955L;
      int var7 = (int)((var5 ^ 138430758876955L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      boolean var10 = -2785609425612430453L.A<invokedynamic>(-2785609425612430453L, var5);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (!var10) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, -2742068527077151273L, var5);
            }

            var1 = var0.y;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.A;
      }

      return var0.o((char)var7, var8, var1, var2, (char)var9);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 111019334294739L;
      String var10000 = this.y;
      String var10001 = this.A;
      String var10003 = true.p<invokedynamic>(19406, 2179950934722987731L ^ var1);
      return var10003 + var10000 + true.p<invokedynamic>(17668, 1622898708460783647L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 62343977564470L;
      int var3 = this.y.hashCode();
      var3 = var3 * (int)e + this.A.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void R(h9 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeStringElement(var2, 0, var0.y);
      var1.encodeStringElement(var2, 1, var0.A);
   }

   public h9(int seen0, String label, String url, SerializationConstructorMarker serializationConstructorMarker, long a) {
      long var10000 = a ^ var5;
      if (3 != (3 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 3, g_.M.getDescriptor());
      }

      super();
      this.y = var2;
      this.A = var3;
   }

   static {
      long var5 = a ^ 53972387392556L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "\u008c[¼\nò\u0011\u0012Tqd\u0011Ø4\u008e·ô\u00106q\u009f2dú\u0098\u009eçøaVh?Y\u0011\u0010\u0010#'ºî\bEn\u0095\u0012y-þÐ\u000b\n\u0010cv±N[¶G´Ó:\u0093ÁúÀ\\\u008b";
      int var13 = "\u008c[¼\nò\u0011\u0012Tqd\u0011Ø4\u008e·ô\u00106q\u009f2dú\u0098\u009eçøaVh?Y\u0011\u0010\u0010#'ºî\bEn\u0095\u0012y-þÐ\u000b\n\u0010cv±N[¶G´Ó:\u0093ÁúÀ\\\u008b".length();
      char var10 = 16;
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
                  c = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 7916361297479366120L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  i = new se((DefaultConstructorMarker)null);
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

               var11 = "]tÒgE\f©³Í¯\u001dÀÐu!\u0003(L\\\u001eßÉ¾Ø\u0007îkE®óf\u001f2m8'\u008a.érW£Å²o\u00149_53I( \u0000\u0087[*";
               var13 = "]tÒgE\f©³Í¯\u001dÀÐu!\u0003(L\\\u001eßÉ¾Ø\u0007îkE®óf\u001f2m8'\u008a.érW£Å²o\u00149_53I( \u0000\u0087[*".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31152;
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
            throw new RuntimeException("su/catlean/h9", var10);
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
         throw new RuntimeException("su/catlean/h9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
