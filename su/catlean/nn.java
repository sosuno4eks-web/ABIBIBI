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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class nn {
   @NotNull
   public static final e q;
   @NotNull
   private final List R;
   @JvmField
   @NotNull
   private static final Lazy[] u;
   private static final long a = j0.a(718175793624223789L, 5826316038647264197L, MethodHandles.lookup().lookupClass()).a(187593222865765L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public nn(int a, byte a, @NotNull List players, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(20286, 4883676419758934952L ^ var5));
      super();
      this.R = var3;
   }

   @NotNull
   public final List e() {
      return this.R;
   }

   @NotNull
   public final List p() {
      return this.R;
   }

   @NotNull
   public final nn w(@NotNull List players, long a) {
      var2 ^= a;
      long var10001 = var2 ^ 35239303364470L;
      int var4 = (int)((var2 ^ 35239303364470L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(9812, 384213552178482172L ^ var2));
      return new nn(var4, (byte)var5, var1, var6);
   }

   public static nn A(nn var0, List var1, long var2, int var4, Object var5) {
      var2 ^= a;
      long var6 = var2 ^ 87407066876402L;
      if ((var4 & 1) != 0) {
         var1 = var0.R;
      }

      return var0.w(var1, var6);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 71012214460761L;
      List var10000 = this.R;
      String var10002 = true.f<invokedynamic>(8311, 3659181560664457778L ^ var1);
      return var10002 + var10000 + ")";
   }

   public int hashCode() {
      return this.R.hashCode();
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void U(nn self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = u;
      var1.encodeSerializableElement(var2, 0, (SerializationStrategy)var3[0].getValue(), var0.R);
   }

   public nn(int seen0, List players, long a, SerializationConstructorMarker serializationConstructorMarker) {
      long var10000 = a ^ var3;
      if (1 != (1 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 1, ah.p.getDescriptor());
      }

      super();
      this.R = var2;
   }

   private static final KSerializer U() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE));
   }

   public static final Lazy[] I() {
      return u;
   }

   static {
      long var0 = a ^ 22026826485072L;
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
      String var6 = "\u0084g\u0004§ñõ\tÎ¾æ\u001eBÛÃ)\u001e¨\u009cùï\u001e¶\u0010$Ò\u009f\u001aK¹¡üì\u0012k\u0013Á\rô¨Ó\u0092\u0018UGÜéZ\u008dÿëó¡'\u0097ã\u0089èðÄ«ô2*ø\u0010ú:u0\u0000Päâ¡ÿ\u0005¾^\u008a\u0092ê\u0010ç\"Îr4þ1×èó\u0088%º\u0014%]";
      int var8 = "\u0084g\u0004§ñõ\tÎ¾æ\u001eBÛÃ)\u001e¨\u009cùï\u001e¶\u0010$Ò\u009f\u001aK¹¡üì\u0012k\u0013Á\rô¨Ó\u0092\u0018UGÜéZ\u008dÿëó¡'\u0097ã\u0089èðÄ«ô2*ø\u0010ú:u0\u0000Päâ¡ÿ\u0005¾^\u008a\u0092ê\u0010ç\"Îr4þ1×èó\u0088%º\u0014%]".length();
      char var5 = '@';
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
            q = new e((DefaultConstructorMarker)null);
            Lazy[] var11 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, nn::U)};
            u = var11;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9559;
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
            throw new RuntimeException("su/catlean/nn", var10);
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
         throw new RuntimeException("su/catlean/nn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
