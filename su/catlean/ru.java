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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class ru {
   @NotNull
   public static final rh Z;
   @NotNull
   private final String N;
   @NotNull
   private List P;
   @JvmField
   @NotNull
   private static final Lazy[] n;
   private static k9[] z;
   private static final long a = j0.a(4823368588809768369L, 6872278156000688674L, MethodHandles.lookup().lookupClass()).a(55866025055852L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   public ru(@NotNull String id, long a, @NotNull List widgets) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(12745, 6881496661774841967L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(19108, 4150935047260947203L ^ var2));
      super();
      this.N = var1;
      this.P = var4;
   }

   public ru(String var1, List var2, int var3, long var4, DefaultConstructorMarker var6) {
      var4 ^= a;
      long var7 = var4 ^ 79668114915458L;
      if ((var3 & 2) != 0) {
         var2 = CollectionsKt.emptyList();
      }

      this(var1, var7, var2);
   }

   @NotNull
   public final String X() {
      return this.N;
   }

   @NotNull
   public final List j() {
      return this.P;
   }

   public final void X(@NotNull List <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(5000, 3152233764604047498L ^ var2));
      this.P = var1;
   }

   @NotNull
   public final String Z() {
      return this.N;
   }

   @NotNull
   public final List I() {
      return this.P;
   }

   @NotNull
   public final ru J(int a, short a, @NotNull String id, @NotNull List widgets, char a) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 117630317816554L;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(12298, 2142513959220900773L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(17445, 983328294797346702L ^ var6));
      return new ru(var3, var8, var4);
   }

   public static ru l(ru var0, String var1, long var2, List var4, int var5, Object var6) {
      var2 ^= a;
      long var10001 = var2 ^ 118103206564999L;
      int var7 = (int)((var2 ^ 118103206564999L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      int var10 = -7608328137945006147L.A<invokedynamic>(-7608328137945006147L, var2);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var10 == 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, -7600119963706679013L, var2);
            }

            var1 = var0.N;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.P;
      }

      return var0.J(var7, (short)var8, var1, var4, (char)var9);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 19202579174734L;
      String var10000 = this.N;
      List var10001 = this.P;
      String var10003 = true.f<invokedynamic>(4505, 4043475853072057589L ^ var1);
      return var10003 + var10000 + true.f<invokedynamic>(18916, 6945937668458290319L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 97624096516935L;
      int var3 = this.N.hashCode();
      var3 = var3 * (int)e + this.P.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void s(ru self, long a, CompositeEncoder output, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public ru(long a, int seen0, String id, List widgets, SerializationConstructorMarker serializationConstructorMarker) {
      // $FF: Couldn't be decompiled
   }

   private static final KSerializer v() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)h1.H));
   }

   public static final Lazy[] Y() {
      return n;
   }

   static {
      long var14 = a ^ 69289505428778L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -5388190972007712718L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[7];
      int var10 = 0;
      String var9 = "ýïGE«\u0019\u0080Ð\u0011}\tRÚQ\u0015ò\u0018\f\u0081\u0017êØ\u0004ò\u0012\\\u0018êä\u0092\u009c\u000f°\u0091ö@s\u0002\u0080Wã\u0010Ä\u0018©X9ðy#¥k\n+\u0081~µä\u0010\u0019\u009c¡*@¸:\u0092úÒ]:¡(¹r\u0010 {5\u0007Ä\u008d!Bm \u008f¡ºùòæ";
      int var11 = "ýïGE«\u0019\u0080Ð\u0011}\tRÚQ\u0015ò\u0018\f\u0081\u0017êØ\u0004ò\u0012\\\u0018êä\u0092\u009c\u000f°\u0091ö@s\u0002\u0080Wã\u0010Ä\u0018©X9ðy#¥k\n+\u0081~µä\u0010\u0019\u009c¡*@¸:\u0092úÒ]:¡(¹r\u0010 {5\u0007Ä\u008d!Bm \u008f¡ºùòæ".length();
      char var8 = 16;
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
                  c = new String[7];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 6555632008841047372L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var24 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var20 = true;
                  e = var24;
                  Z = new rh((DefaultConstructorMarker)null);
                  Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ru::v)};
                  n = var16;
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

               var9 = "\u009b\u0088ZA£Ó²é\u0096±N\n^q§+(ñ&\u0018\u0007d\u0082¨\u008e©\u001dy\u000fÄ}¤ \u0091.IÀÍ³¸7ßöÙÙX·ý\u001d@VÓ\r\u0081C°\u0096";
               var11 = "\u009b\u0088ZA£Ó²é\u0096±N\n^q§+(ñ&\u0018\u0007d\u0082¨\u008e©\u001dy\u000fÄ}¤ \u0091.IÀÍ³¸7ßöÙÙX·ý\u001d@VÓ\r\u0081C°\u0096".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var17 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void g(k9[] var0) {
      z = var0;
   }

   public static k9[] C() {
      return z;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24768;
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
            throw new RuntimeException("su/catlean/ru", var10);
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
         throw new RuntimeException("su/catlean/ru" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
