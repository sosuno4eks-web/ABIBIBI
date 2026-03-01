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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class f6 {
   @NotNull
   public static final m4 z;
   @NotNull
   private String q;
   @NotNull
   private Map e;
   @JvmField
   @NotNull
   private static final Lazy[] r;
   private static int[] n;
   private static final long a = j0.a(3023496689139152022L, 3071881184178190622L, MethodHandles.lookup().lookupClass()).a(250956425784727L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long f;

   public f6(@NotNull String id, long a, @NotNull Map items) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(14859, 8853411714515097086L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.a<invokedynamic>(22301, 2737184669095016682L ^ var2));
      super();
      this.q = var1;
      this.e = var4;
   }

   @NotNull
   public final String h() {
      return this.q;
   }

   public final void f(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(17589, 6978427646255677717L ^ var1));
      this.q = var3;
   }

   @NotNull
   public final Map X() {
      return this.e;
   }

   public final void c(long a, @NotNull Map <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(6932, 6017397971288418637L ^ var1));
      this.e = var3;
   }

   @NotNull
   public final String J() {
      return this.q;
   }

   @NotNull
   public final Map D() {
      return this.e;
   }

   @NotNull
   public final f6 T(@NotNull String id, long a, @NotNull Map items) {
      var2 ^= a;
      long var5 = var2 ^ 92282396294815L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(14622, 7436115685885220759L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.a<invokedynamic>(26547, 5710673616083044670L ^ var2));
      return new f6(var1, var5, var4);
   }

   public static f6 u(f6 var0, String var1, long var2, Map var4, int var5, Object var6) {
      var2 ^= a;
      long var7 = var2 ^ 32476961555640L;
      int[] var9 = -3525193037133475283L.A<invokedynamic>(-3525193037133475283L, var2);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var9 == null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -3481968457936873980L, var2);
            }

            var1 = var0.q;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.e;
      }

      return var0.T(var1, var7, var4);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 130261913339690L;
      String var10000 = this.q;
      Map var10001 = this.e;
      String var10003 = true.a<invokedynamic>(23804, 6374463249545658331L ^ var1);
      return var10003 + var10000 + true.a<invokedynamic>(22961, 6829256328279653009L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 89758283836313L;
      int var3 = this.q.hashCode();
      var3 = var3 * (int)f + this.e.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void S(f6 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = r;
      var1.encodeStringElement(var2, 0, var0.q);
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)var3[1].getValue(), var0.e);
   }

   public f6(int seen0, String id, Map items, long a, SerializationConstructorMarker serializationConstructorMarker) {
      long var10000 = a ^ var4;
      if (3 != (3 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 3, cv.c.getDescriptor());
      }

      super();
      this.q = var2;
      this.e = var3;
   }

   private static final KSerializer j() {
      long var0 = a ^ 31379310248479L;
      long var2 = var0 ^ 89206936397335L;
      return (KSerializer)(new LinkedHashMapSerializer((KSerializer)IntSerializer.INSTANCE, (KSerializer)(new gx(var2))));
   }

   public static final Lazy[] x() {
      return r;
   }

   static {
      long var14 = a ^ 17208620952557L;
      int[] var10000 = new int[1];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 6195528420858840310L, var14);
      Cipher var5;
      Cipher var17 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[8];
      int var10 = 0;
      String var9 = ")þ½CØ\u0007\u008d\u00adj\u0014+\u0000MRu´\u0010c=D\u001c\u0081Û®GÔ\u0014£G¡ñ§\u0004\u0010â\u0016è¯í\u0000\"\t_múÚKÌ\\\u0089 ü\u000b+çd4Ô3ø(k\u0003¯ÐÏ¹kô¡z¥é'A)ÌËZÌ\\õK(²\u008fd)µÔ58ìvÚ-Y\u0012#?Ý\u009d$¥\u001c\u0006¸ÿ\u008b\tk\u009b6NøÂqêö>¹IØ\u009a\u0010w¹\u008d\u009c¨æÐ>\u000b*^\u0084ì\u0000óß";
      int var11 = ")þ½CØ\u0007\u008d\u00adj\u0014+\u0000MRu´\u0010c=D\u001c\u0081Û®GÔ\u0014£G¡ñ§\u0004\u0010â\u0016è¯í\u0000\"\t_múÚKÌ\\\u0089 ü\u000b+çd4Ô3ø(k\u0003¯ÐÏ¹kô¡z¥é'A)ÌËZÌ\\õK(²\u008fd)µÔ58ìvÚ-Y\u0012#?Ý\u009d$¥\u001c\u0006¸ÿ\u008b\tk\u009b6NøÂqêö>¹IØ\u009a\u0010w¹\u008d\u009c¨æÐ>\u000b*^\u0084ì\u0000óß".length();
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
                  c = new String[8];
                  Cipher var0;
                  var17 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 503286069786401960L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  f = var25;
                  z = new m4((DefaultConstructorMarker)null);
                  Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, f6::j)};
                  r = var16;
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

               var9 = "¹äÜ5¢\u001fÊïÎ\u0091ªmB\n/\u0019\u0010\u008a½É\"= Ç«¾\u0010AÐ~!\u000f\u0089";
               var11 = "¹äÜ5¢\u001fÊïÎ\u0091ªmB\n/\u0019\u0010\u008a½É\"= Ç«¾\u0010AÐ~!\u000f\u0089".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var18 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void P(int[] var0) {
      n = var0;
   }

   public static int[] t() {
      return n;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23529;
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
            throw new RuntimeException("su/catlean/f6", var10);
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
         throw new RuntimeException("su/catlean/f6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
