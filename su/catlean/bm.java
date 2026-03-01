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
public final class bm {
   @NotNull
   public static final ug p;
   @NotNull
   private final List D;
   @JvmField
   @NotNull
   private static final Lazy[] S;
   private static final long a = j0.a(2468655613390583882L, 7112785728897017436L, MethodHandles.lookup().lookupClass()).a(33843372286688L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public bm(long a, @NotNull List proxies) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(25342, 1031744883365017365L ^ var1));
      super();
      this.D = var3;
   }

   @NotNull
   public final List H() {
      return this.D;
   }

   @NotNull
   public final List W() {
      return this.D;
   }

   @NotNull
   public final bm o(long a, @NotNull List proxies) {
      var1 ^= a;
      long var4 = var1 ^ 49352534356713L;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(30435, 5437278103264525377L ^ var1));
      return new bm(var4, var3);
   }

   public static bm W(bm var0, int var1, List var2, int var3, Object var4, int var5, int var6) {
      long var7 = ((long)var1 << 32 | (long)var5 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 37510388915937L;
      if ((var3 & 1) != 0) {
         var2 = var0.D;
      }

      return var0.o(var9, var2);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 116284646906163L;
      List var10000 = this.D;
      String var10002 = true.v<invokedynamic>(22856, 5001162515338464572L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.D.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void C(bm self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = S;
      var1.encodeSerializableElement(var2, 0, (SerializationStrategy)var3[0].getValue(), var0.D);
   }

   public bm(long a, int seen0, List proxies, SerializationConstructorMarker serializationConstructorMarker) {
      long var10000 = a ^ var1;
      if (1 != (1 & var3)) {
         PluginExceptionsKt.throwMissingFieldException(var3, 1, _9.z.getDescriptor());
      }

      super();
      this.D = var4;
   }

   private static final KSerializer i() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)x0.q));
   }

   public static final Lazy[] d() {
      return S;
   }

   static {
      long var0 = a ^ 126871848754910L;
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
      String var6 = "~\u008bÊ$\u0007\\\u0084Ü2éÆ  \u0098ð\u0011(ù\u0006\u008fsÓ\u0016ÃêVæü¢¤à6`MÃóÛÐú\"eU¥THB}'\u0096\u0088\u0018\u0094[h]\u0015D\u0010´oâ\u000bI\fj\u0018$|VR !÷R";
      int var8 = "~\u008bÊ$\u0007\\\u0084Ü2éÆ  \u0098ð\u0011(ù\u0006\u008fsÓ\u0016ÃêVæü¢¤à6`MÃóÛÐú\"eU¥THB}'\u0096\u0088\u0018\u0094[h]\u0015D\u0010´oâ\u000bI\fj\u0018$|VR !÷R".length();
      char var5 = 16;
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
            p = new ug((DefaultConstructorMarker)null);
            Lazy[] var11 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, bm::i)};
            S = var11;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24804;
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
            throw new RuntimeException("su/catlean/bm", var10);
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
         throw new RuntimeException("su/catlean/bm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
