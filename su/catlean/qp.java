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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class qp {
   @NotNull
   public static final vx a;
   @NotNull
   private final hd M;
   @NotNull
   private final f4 l;
   @JvmField
   @NotNull
   private static final Lazy[] U;
   private static final long b = j0.a(8329052571814683009L, 3052630607833329730L, MethodHandles.lookup().lookupClass()).a(192756407631401L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public qp(@NotNull hd cmd, long a, @NotNull f4 args) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(26766, 6547165446076716784L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.k<invokedynamic>(22926, 7572852602123249655L ^ var2));
      super();
      this.M = var1;
      this.l = var4;
   }

   @NotNull
   public final hd Y() {
      return this.M;
   }

   @NotNull
   public final f4 z() {
      return this.l;
   }

   @NotNull
   public final hd c() {
      return this.M;
   }

   @NotNull
   public final f4 H() {
      return this.l;
   }

   @NotNull
   public final qp n(@NotNull hd cmd, @NotNull f4 args, long a) {
      var3 ^= b;
      long var5 = var3 ^ 96758389143377L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(2035, 726897213387181984L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.k<invokedynamic>(8968, 837757856278063961L ^ var3));
      return new qp(var1, var5, var2);
   }

   public static qp A(qp var0, hd var1, long var2, f4 var4, int var5, Object var6) {
      var2 ^= b;
      long var7 = var2 ^ 87061275564781L;
      int[] var9 = 2823742515911789620L.A<invokedynamic>(2823742515911789620L, var2);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var9 != null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 2834177600547911857L, var2);
            }

            var1 = var0.M;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.l;
      }

      return var0.n(var1, var4, var7);
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 11478311357421L;
      hd var10000 = this.M;
      f4 var10001 = this.l;
      String var10003 = true.k<invokedynamic>(21842, 4027552955815258654L ^ var1);
      return var10003 + var10000 + true.k<invokedynamic>(23731, 5347718619102274555L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 44473138458282L;
      int var3 = this.M.hashCode();
      var3 = var3 * (int)f + this.l.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void l(qp self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = U;
      var1.encodeSerializableElement(var2, 0, (SerializationStrategy)var3[0].getValue(), var0.M);
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)bf.i, var0.l);
   }

   public qp(char a, int seen0, hd cmd, int a, int a, f4 args, SerializationConstructorMarker serializationConstructorMarker) {
      long var8 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ b;
      if (3 != (3 & var2)) {
         PluginExceptionsKt.throwMissingFieldException(var2, 3, xg.x.getDescriptor());
      }

      super();
      this.M = var3;
      this.l = var6;
   }

   private static final KSerializer M() {
      return hd.Companion.j();
   }

   public static final Lazy[] W() {
      return U;
   }

   static {
      long var5 = b ^ 4842631792143L;
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
      String var11 = "\u0094\u0089K¾\u00ad7á|çÍLÜ\u008a\u009d[Ó(\b\u0012¶Àåó@A\u0012\u007fj\u0095£bßQ *¾\u008e\u0010\u0017ß¨\u0019(\n<Q8KVÙÅ8\u008dþ\u001av\u0003\u0010¨J*\bd6/4\fªÝ\u0016Ðµ\u0005Þ\u0010ËÇ\u0000\u0097\f¦è\u0003\u0090¼çYWM\u009b\u000b";
      int var13 = "\u0094\u0089K¾\u00ad7á|çÍLÜ\u008a\u009d[Ó(\b\u0012¶Àåó@A\u0012\u007fj\u0095£bßQ *¾\u008e\u0010\u0017ß¨\u0019(\n<Q8KVÙÅ8\u008dþ\u001av\u0003\u0010¨J*\bd6/4\fªÝ\u0016Ðµ\u0005Þ\u0010ËÇ\u0000\u0097\f¦è\u0003\u0090¼çYWM\u009b\u000b".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var17 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var17.getBytes("ISO-8859-1"));
            String var22 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var22;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  d = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 9144167877209849551L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var24 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var20 = true;
                  f = var24;
                  a = new vx((DefaultConstructorMarker)null);
                  Lazy[] var16 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, qp::M), null};
                  U = var16;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var22;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "X\u008f |p9MN,\u0007Iã,rLÂ\u0010\t\u0002\u001d÷B&d%¡+\t\u0017\u0007,½\u000f";
               var13 = "X\u008f |p9MN,\u0007Iã,rLÂ\u0010\t\u0002\u001d÷B&d%¡+\t\u0017\u0007,½\u000f".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var17 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13784;
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
            throw new RuntimeException("su/catlean/qp", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/qp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
