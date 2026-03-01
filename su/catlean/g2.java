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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class g2 {
   @NotNull
   public static final fi f;
   @Nullable
   private final ex D;
   @Nullable
   private final Integer t;
   @Nullable
   private final String r;
   private static final long a = j0.a(6012741875615946283L, 9126543913604448879L, MethodHandles.lookup().lookupClass()).a(270526841278812L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   public g2(@Nullable ex user, @Nullable Integer code, @Nullable String message) {
      this.D = var1;
      this.t = var2;
      this.r = var3;
   }

   @Nullable
   public final ex o() {
      return this.D;
   }

   @Nullable
   public final Integer w() {
      return this.t;
   }

   @Nullable
   public final String j() {
      return this.r;
   }

   @Nullable
   public final ex W() {
      return this.D;
   }

   @Nullable
   public final Integer P() {
      return this.t;
   }

   @Nullable
   public final String q() {
      return this.r;
   }

   @NotNull
   public final g2 N(@Nullable ex user, @Nullable Integer code, @Nullable String message) {
      return new g2(var1, var2, var3);
   }

   public static g2 H(g2 var0, ex var1, Integer var2, String var3, int var4, Object var5, long var6) {
      var6 ^= a;
      int[] var8 = -8639156000522657024L.A<invokedynamic>(-8639156000522657024L, var6);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var4 & 1;
               if (var8 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -8617353953806047524L, var6);
            }

            var1 = var0.D;
         }

         var10000 = var4 & 2;
      }

      label32: {
         label31: {
            try {
               if (var8 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var9) {
               throw var9.A<invokedynamic>(var9, -8617353953806047524L, var6);
            }

            var2 = var0.t;
         }

         var10000 = var4 & 4;
      }

      if (var10000 != 0) {
         var3 = var0.r;
      }

      return var0.N(var1, var2, var3);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 54472824657351L;
      String var3 = this.r;
      Integer var4 = this.t;
      ex var5 = this.D;
      String var10000 = 22160.f<invokedynamic>(22160, 5251494298219091733L ^ var1);
      return var10000 + var5 + true.f<invokedynamic>(3763, 6526951111018663732L ^ var1) + var4 + true.f<invokedynamic>(28819, 6963132929092989207L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void F(g2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeNullableSerializableElement(var2, 0, (SerializationStrategy)lp.I, var0.D);
      var1.encodeNullableSerializableElement(var2, 1, (SerializationStrategy)IntSerializer.INSTANCE, var0.t);
      var1.encodeNullableSerializableElement(var2, 2, (SerializationStrategy)StringSerializer.INSTANCE, var0.r);
   }

   public g2(int seen0, ex user, Integer code, long a, String message, SerializationConstructorMarker serializationConstructorMarker) {
      var4 ^= a;
      if (true.t<invokedynamic>(3868, 3915859632887810953L ^ var4) != (true.t<invokedynamic>(629, 4443659475767084769L ^ var4) & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, true.t<invokedynamic>(629, 4443659475767084769L ^ var4), mc.T.getDescriptor());
      }

      super();
      this.D = var2;
      this.t = var3;
      this.r = var6;
   }

   static {
      long var11 = a ^ 18075744355435L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "±\u001f\u009dô°L;/Í¿h\u0002=\u0099ÛÊE\u001e ñ\u0018\u009d%\u008f\u0016Òñ\u0099¢ÅÕ>J\u008b\u0097P2\u0000þ\u0097\u0018%¢b\u009e\u0010ªêI/ânØS®k _qEõÂcD\u008b\u0010·T¬ù!Uj°\u0000[\u009d#E\u0006\u0081Ã";
      int var19 = "±\u001f\u009dô°L;/Í¿h\u0002=\u0099ÛÊE\u001e ñ\u0018\u009d%\u008f\u0016Òñ\u0099¢ÅÕ>J\u008b\u0097P2\u0000þ\u0097\u0018%¢b\u009e\u0010ªêI/ânØS®k _qEõÂcD\u008b\u0010·T¬ù!Uj°\u0000[\u009d#E\u0006\u0081Ã".length();
      char var16 = '(';
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var25 = a(var21).intern();
         boolean var10001 = true;
         var20[var18++] = var25;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[3];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[4];
            int var3 = 0;
            String var4 = "\u009dC\u0084@¯\u001ekæ4\u0083¶,$G¹C";
            int var5 = "\u009dC\u0084@¯\u001ekæ4\u0083¶,$G¹C".length();
            int var2 = 0;

            label32:
            while(true) {
               int var24 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
               long[] var22 = var6;
               var24 = var3++;
               long var27 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var28 = -1;

               while(true) {
                  long var8 = var27;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var31 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch(var28) {
                  case 0:
                     var22[var24] = var31;
                     if (var2 >= var5) {
                        e = var6;
                        g = new Integer[4];
                        f = new fi((DefaultConstructorMarker)null);
                        return;
                     }
                     break;
                  default:
                     var22[var24] = var31;
                     if (var2 < var5) {
                        continue label32;
                     }

                     var4 = "ð|(çMõê\\\u0086\u001f\u008aù\u0092Ï¸J";
                     var5 = "ð|(çMõê\\\u0086\u001f\u008aù\u0092Ï¸J".length();
                     var2 = 0;
                  }

                  var24 = var2;
                  var2 += 8;
                  var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                  var22 = var6;
                  var24 = var3++;
                  var27 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var28 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16381;
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
            throw new RuntimeException("su/catlean/g2", var10);
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
         throw new RuntimeException("su/catlean/g2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20172;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/g2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/g2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
