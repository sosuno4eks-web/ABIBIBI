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
public final class eb {
   @NotNull
   public static final ub o;
   @NotNull
   private final List C;
   @JvmField
   @NotNull
   private static final Lazy[] e;
   private static final long a = j0.a(8626775755157420886L, 4547938481313596572L, MethodHandles.lookup().lookupClass()).a(226960411917089L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public eb(long a, @NotNull List wayPoints) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.d<invokedynamic>(9222, 3356754872773171381L ^ var1));
      super();
      this.C = var3;
   }

   @NotNull
   public final List r() {
      return this.C;
   }

   @NotNull
   public final List G() {
      return this.C;
   }

   @NotNull
   public final eb C(@NotNull List wayPoints, long a) {
      var2 ^= a;
      long var4 = var2 ^ 127049632251767L;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(22350, 1451101829833651825L ^ var2));
      return new eb(var4, var1);
   }

   public static eb k(eb var0, List var1, long var2, int var4, Object var5) {
      var2 ^= a;
      long var6 = var2 ^ 67359626888394L;
      if ((var4 & 1) != 0) {
         var1 = var0.C;
      }

      return var0.C(var1, var6);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 88932183207929L;
      List var10000 = this.C;
      String var10002 = true.d<invokedynamic>(32138, 6960506648431117143L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.C.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void E(eb self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = e;
      var1.encodeSerializableElement(var2, 0, (SerializationStrategy)var3[0].getValue(), var0.C);
   }

   public eb(short a, int seen0, List wayPoints, int a, char a, SerializationConstructorMarker serializationConstructorMarker) {
      long var7 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      if (1 != (1 & var2)) {
         PluginExceptionsKt.throwMissingFieldException(var2, 1, ir.W.getDescriptor());
      }

      super();
      this.C = var3;
   }

   private static final KSerializer A() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)a7.t));
   }

   public static final Lazy[] S() {
      return e;
   }

   static {
      long var0 = a ^ 96843146646205L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0007Yql:\b²F\u000e\u0004l\r!FL7\u0094Î°Égã^à´õD¼\u000bó>;Y?`Ü \u0017\u0002Êéu¨-¬9\u009cU< èÆ^\u0080{= LË\u0095WakØÞÖý\rwÖ\u0091!8þY8\u0095c»¾l½\u000bz\u001e\u0016\u0085\u0019¾ Àm\u000eö®èºìA\u000fÉõ\u001b\u0083È_E~¦4oêáG¹ÿj<Ì\u009f\u0017ó";
      int var8 = "\u0007Yql:\b²F\u000e\u0004l\r!FL7\u0094Î°Égã^à´õD¼\u000bó>;Y?`Ü \u0017\u0002Êéu¨-¬9\u009cU< èÆ^\u0080{= LË\u0095WakØÞÖý\rwÖ\u0091!8þY8\u0095c»¾l½\u000bz\u001e\u0016\u0085\u0019¾ Àm\u000eö®èºìA\u000fÉõ\u001b\u0083È_E~¦4oêáG¹ÿj<Ì\u009f\u0017ó".length();
      char var5 = '8';
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            o = new ub((DefaultConstructorMarker)null);
            Lazy[] var11 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, eb::A)};
            e = var11;
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29660;
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
            throw new RuntimeException("su/catlean/eb", var10);
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
         throw new RuntimeException("su/catlean/eb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
