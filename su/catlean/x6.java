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
public final class x6 {
   @NotNull
   public static final pq B;
   @NotNull
   private final String p;
   @NotNull
   private final String j;
   private static String[] e;
   private static final long a = j0.a(4628347659628762498L, 241672315557103374L, MethodHandles.lookup().lookupClass()).a(24164262787271L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long f;

   public x6(@NotNull String id, long a, @NotNull String value) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(25020, 3753358670783254297L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.w<invokedynamic>(11050, 4043009647158314379L ^ var2));
      super();
      this.p = var1;
      this.j = var4;
   }

   @NotNull
   public final String d() {
      return this.p;
   }

   @NotNull
   public final String n() {
      return this.j;
   }

   @NotNull
   public final String s() {
      return this.p;
   }

   @NotNull
   public final String L() {
      return this.j;
   }

   @NotNull
   public final x6 A(@NotNull String id, @NotNull String value, long a) {
      var3 ^= a;
      long var5 = var3 ^ 51826316288786L;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(18006, 9005440224479172240L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.w<invokedynamic>(21524, 3289236850549736659L ^ var3));
      return new x6(var1, var5, var2);
   }

   public static x6 d(long var0, x6 var2, String var3, String var4, int var5, Object var6) {
      var0 ^= a;
      long var7 = var0 ^ 15025767521940L;
      int var9 = 8538753686869270443L.A<invokedynamic>(8538753686869270443L, var0);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var9 == 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 8525060548545448445L, var0);
            }

            var3 = var2.p;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var2.j;
      }

      return var2.A(var3, var4, var7);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 139266647968597L;
      String var10000 = this.p;
      String var10001 = this.j;
      String var10003 = true.w<invokedynamic>(4515, 4805335127905477560L ^ var1);
      return var10003 + var10000 + true.w<invokedynamic>(1487, 2108754161635047376L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 9313000310004L;
      int var3 = this.p.hashCode();
      var3 = var3 * (int)f + this.j.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void u(x6 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeStringElement(var2, 0, var0.p);
      var1.encodeStringElement(var2, 1, var0.j);
   }

   public x6(short a, int seen0, String id, String value, SerializationConstructorMarker serializationConstructorMarker, int a, int a) {
      long var8 = ((long)var1 << 48 | (long)var6 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ a;
      if (3 != (3 & var2)) {
         PluginExceptionsKt.throwMissingFieldException(var2, 3, z.v.getDescriptor());
      }

      super();
      this.p = var3;
      this.j = var4;
   }

   static {
      long var14 = a ^ 28556923556933L;
      String[] var10000 = new String[4];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 577963924921436025L, var14);
      Cipher var5;
      Cipher var16 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "Èb\bÈt\u008f8üØ|\u00948g\u0099´e=d\u0088Gá1\u0006×#â\u0019\fY©¥6\u000b\u0015CLÏÝÁ\u000f\u0010\u0006F¢}Ì\u0093\u0018f3\u0080\u0006õ\u0017ª+\u009d\u0010øP\u0012³\u0012ÆGy\u0004\u0013zÿä²fw\u0010óÀ\u0016y\b¼ø¿M¾Ëe\n\u0006\u0013®";
      int var11 = "Èb\bÈt\u008f8üØ|\u00948g\u0099´e=d\u0088Gá1\u0006×#â\u0019\fY©¥6\u000b\u0015CLÏÝÁ\u000f\u0010\u0006F¢}Ì\u0093\u0018f3\u0080\u0006õ\u0017ª+\u009d\u0010øP\u0012³\u0012ÆGy\u0004\u0013zÿä²fw\u0010óÀ\u0016y\b¼ø¿M¾Ëe\n\u0006\u0013®".length();
      char var8 = '(';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var17 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var17.getBytes("ISO-8859-1"));
            String var22 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var22;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[6];
                  Cipher var0;
                  var16 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -1020329041758403957L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var24 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var20 = true;
                  f = var24;
                  B = new pq((DefaultConstructorMarker)null);
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var22;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "þ+üê\u000fP+¢\u0016¤~\u008eB}\u0017ËÅÖ\u009e\u0089ÃP=n\u0081!@y\u0010H\u0004\u008e\u0010\u0094\u0093¥a\u0011?\u0002\u0087\"Y\u0088\u0016-¢º\u0018";
               var11 = "þ+üê\u000fP+¢\u0016¤~\u008eB}\u0017ËÅÖ\u009e\u0089ÃP=n\u0081!@y\u0010H\u0004\u008e\u0010\u0094\u0093¥a\u0011?\u0002\u0087\"Y\u0088\u0016-¢º\u0018".length();
               var8 = ' ';
               var7 = -1;
            }

            ++var7;
            var17 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void I(String[] var0) {
      e = var0;
   }

   public static String[] O() {
      return e;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9272;
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
            throw new RuntimeException("su/catlean/x6", var10);
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
         throw new RuntimeException("su/catlean/x6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
