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
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class bj {
   @NotNull
   public static final ap R;
   @NotNull
   private final String g;
   @NotNull
   private final List c;
   @JvmField
   @NotNull
   private static final Lazy[] Z;
   private static String[] p;
   private static final long a = j0.a(4215334118448518244L, 3696080986350564266L, MethodHandles.lookup().lookupClass()).a(175251906418155L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long f;

   public bj(char a, @NotNull String id, @NotNull List settings, short a, int a) {
      long var6 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.o<invokedynamic>(14338, 5901278237076352840L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(4022, 4351296479645882622L ^ var6));
      super();
      this.g = var2;
      this.c = var3;
   }

   @NotNull
   public final String k() {
      return this.g;
   }

   @NotNull
   public final List a() {
      return this.c;
   }

   @NotNull
   public final String J() {
      return this.g;
   }

   @NotNull
   public final List z() {
      return this.c;
   }

   @NotNull
   public final bj L(@NotNull String id, long a, @NotNull List settings) {
      var2 ^= a;
      long var10001 = var2 ^ 60668148953494L;
      int var5 = (int)((var2 ^ 60668148953494L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(10620, 8997826840580485082L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.o<invokedynamic>(15785, 2530662836471921418L ^ var2));
      return new bj((char)var5, var1, var4, (short)var6, var7);
   }

   public static bj c(bj var0, char var1, short var2, String var3, List var4, int var5, int var6, Object var7) {
      long var8 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      long var10 = var8 ^ 118239121389246L;
      int var12 = 8292441511342856896L.A<invokedynamic>(8292441511342856896L, var8);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var12 == 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, 8296144509011366997L, var8);
            }

            var3 = var0.g;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.c;
      }

      return var0.L(var3, var10, var4);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 124342100218622L;
      String var10000 = this.g;
      List var10001 = this.c;
      String var10003 = true.o<invokedynamic>(4114, 7192544139976523909L ^ var1);
      return var10003 + var10000 + true.o<invokedynamic>(13817, 4183777460381312360L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 21875562985226L;
      int var3 = this.g.hashCode();
      var3 = var3 * (int)f + this.c.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void f(bj self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = Z;
      var1.encodeStringElement(var2, 0, var0.g);
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)var3[1].getValue(), var0.c);
   }

   public bj(int seen0, int a, String id, int a, List settings, SerializationConstructorMarker serializationConstructorMarker, short a) {
      long var8 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      if (3 != (3 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 3, h1.H.getDescriptor());
      }

      super();
      this.g = var3;
      this.c = var5;
   }

   private static final KSerializer Y() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)z.v));
   }

   public static final Lazy[] e() {
      return Z;
   }

   static {
      long var14 = a ^ 30890893953707L;
      String[] var10000 = new String[4];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -1471978949849488744L, var14);
      Cipher var5;
      Cipher var17 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "Lfà\u0013ÿ\u0081\u0010\\hÈú°'â7\u009c\u0010\u008cxC¤ô¨½×N:ïW\u008c\u0087Þl\u0018º}«q\u0091HF\u0014U!*\u007fÓa\u001c£¡¹\u0016`NØùº\u0018\u0012:µ\u0098®&\u008cÉvÈ7\nhQ>×vx\u0010À&×ä\u0019";
      int var11 = "Lfà\u0013ÿ\u0081\u0010\\hÈú°'â7\u009c\u0010\u008cxC¤ô¨½×N:ïW\u008c\u0087Þl\u0018º}«q\u0091HF\u0014U!*\u007fÓa\u001c£¡¹\u0016`NØùº\u0018\u0012:µ\u0098®&\u008cÉvÈ7\nhQ>×vx\u0010À&×ä\u0019".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var18 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
            String var23 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var23;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  d = new String[6];
                  Cipher var0;
                  var17 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 8312054341381348210L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  f = var25;
                  R = new ap((DefaultConstructorMarker)null);
                  Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, bj::Y)};
                  Z = var16;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var23;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = ",x\u009cãnÙ²Q·\u0007µf¼Ñì\t´Qùäìà]\u009b Ü:æ/4Ñ\u0090 Â\u001dè\u008eÍt\u001c¿|\u009a¼)¾³\u008b:Ù\u0002ï\u0011,`*A\\ó\bP4§\u0011\u0002";
               var11 = ",x\u009cãnÙ²Q·\u0007µf¼Ñì\t´Qùäìà]\u009b Ü:æ/4Ñ\u0090 Â\u001dè\u008eÍt\u001c¿|\u009a¼)¾³\u008b:Ù\u0002ï\u0011,`*A\\ó\bP4§\u0011\u0002".length();
               var8 = ' ';
               var7 = -1;
            }

            ++var7;
            var18 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void y(String[] var0) {
      p = var0;
   }

   public static String[] Z() {
      return p;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8726;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/bj", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/bj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
