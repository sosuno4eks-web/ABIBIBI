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
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class f4 {
   @NotNull
   public static final m3 t;
   private final int I;
   @NotNull
   private final sm v;
   private static final long a = j0.a(4952539322278030992L, 8920490087167769036L, MethodHandles.lookup().lookupClass()).a(87773800314524L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public f4(long a, int pid, @NotNull sm activity) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(18091, 3407238260831939631L ^ var1));
      super();
      this.I = var3;
      this.v = var4;
   }

   public final int w() {
      return this.I;
   }

   @NotNull
   public final sm e() {
      return this.v;
   }

   public final int H() {
      return this.I;
   }

   @NotNull
   public final sm x() {
      return this.v;
   }

   @NotNull
   public final f4 x(long a, int pid, @NotNull sm activity) {
      var1 ^= a;
      long var5 = var1 ^ 68710481508447L;
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(17034, 5792073322868070131L ^ var1));
      return new f4(var5, var3, var4);
   }

   public static f4 J(f4 var0, long var1, int var3, sm var4, int var5, Object var6) {
      var1 ^= a;
      long var7 = var1 ^ 85566875441446L;
      int[] var9 = -8175172743810144880L.A<invokedynamic>(-8175172743810144880L, var1);

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
               throw var10.A<invokedynamic>(var10, -8144175574079383106L, var1);
            }

            var3 = var0.I;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.v;
      }

      return var0.x(var7, var3, var4);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 92689675197916L;
      int var10000 = this.I;
      sm var10001 = this.v;
      String var10003 = true.c<invokedynamic>(21841, 8998044262001429098L ^ var1);
      return var10003 + var10000 + true.c<invokedynamic>(1402, 4655971616196958786L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 108594303957319L;
      int var3 = Integer.hashCode(this.I);
      var3 = var3 * (int)e + this.v.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void M(f4 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeIntElement(var2, 0, var0.I);
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)as.L, var0.v);
   }

   public f4(int seen0, int pid, sm activity, SerializationConstructorMarker serializationConstructorMarker, long a) {
      long var10000 = a ^ var5;
      if (3 != (3 & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, 3, bf.i.getDescriptor());
      }

      super();
      this.I = var2;
      this.v = var3;
   }

   static {
      long var5 = a ^ 26335909639062L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "{\u000eÍî\u0094\u0006.f»yáásêUp%\u0082\u0095×\u0011\u0000\u001b\u0082\u0089\u008d\u0002\u0003Ö\u000fW? üÒ\\é\u0019(Æº7:\u000fã5\u009c\u000eB\u008eV|\u0007ÈüV\u0012Ø,\u0092÷KT`\u000e";
      int var13 = "{\u000eÍî\u0094\u0006.f»yáásêUp%\u0082\u0095×\u0011\u0000\u001b\u0082\u0089\u008d\u0002\u0003Ö\u000fW? üÒ\\é\u0019(Æº7:\u000fã5\u009c\u000eB\u008eV|\u0007ÈüV\u0012Ø,\u0092÷KT`\u000e".length();
      char var10 = ' ';
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
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 4223174858605890186L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  t = new m3((DefaultConstructorMarker)null);
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

               var11 = "2N\u0081B&H!\u007fY\u009dü'ã(bJ©\u00adï£\u0081Ï8À©\u008a4#]Ã¨Ì\u0018KX\"qò^|m@¯Ðs\u008fø êK#S\u009f{y,¹";
               var13 = "2N\u0081B&H!\u007fY\u009dü'ã(bJ©\u00adï£\u0081Ï8À©\u008a4#]Ã¨Ì\u0018KX\"qò^|m@¯Ðs\u008fø êK#S\u009f{y,¹".length();
               var10 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1095;
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
            throw new RuntimeException("su/catlean/f4", var10);
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
         throw new RuntimeException("su/catlean/f4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
