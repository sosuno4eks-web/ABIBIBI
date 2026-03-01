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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class h1 implements GeneratedSerializer {
   @NotNull
   public static final h1 H;
   @NotNull
   private static final SerialDescriptor X;
   private static final long a = j0.a(7317896629545462749L, 1253188428794936473L, MethodHandles.lookup().lookupClass()).a(263014511150610L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private h1() {
   }

   public final void j(long a, @NotNull Encoder encoder, @NotNull bj value) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.k<invokedynamic>(21073, 7824863492797428037L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.k<invokedynamic>(20418, 11200985417903315L ^ var1));
      SerialDescriptor var5 = X;
      CompositeEncoder var6 = var3.beginStructure(var5);
      bj.f(var4, var6, var5);
      var6.endStructure(var5);
   }

   @NotNull
   public final bj H(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return X;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = bj.e();
      KSerializer[] var2 = new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 138313583450969L;
      long var5 = var3 ^ 32269641845715L;
      this.j(var5, var1, (bj)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 8845878803307L;
      long var4 = var2 ^ 12151062520370L;
      return this.H(var1, var4);
   }

   static {
      long var9 = a ^ 128186171015750L;
      d = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "É\u0007k\u001f\u0086y£\u009f\u009cË\u0012\u0085ÁbZì\u0010\u0082w0Å{\u009fí \u001f3~GÆïÆ[\u0010»\u0006D@aÉ®}Û\u0080ÍÓ©5\u0006È\u0018Ì\u000f\u009c½²é®Q%)D°è9U\u0080\u0004\u007f%¦Û\u0096\u00848";
      int var6 = "É\u0007k\u001f\u0086y£\u009f\u009cË\u0012\u0085ÁbZì\u0010\u0082w0Å{\u009fí \u001f3~GÆïÆ[\u0010»\u0006D@aÉ®}Û\u0080ÍÓ©5\u0006È\u0018Ì\u000f\u009c½²é®Q%)D°è9U\u0080\u0004\u007f%¦Û\u0096\u00848".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var12 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  c = new String[6];
                  H = new h1();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.k<invokedynamic>(32445, 216751127807893686L ^ var9), (GeneratedSerializer)H, 2);
                  var11.addElement(true.k<invokedynamic>(17016, 9085053043598007409L ^ var9), false);
                  var11.addElement(true.k<invokedynamic>(32294, 4563424773406629930L ^ var9), false);
                  X = (SerialDescriptor)var11;
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var16;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "tiÃ\u0001\u009d_´Â¥\u0015r\u009cú§WÚ^âX×\b\u008d²ê\u0081aã\u001e\u001dNºÔ\u0010T%k×»©Z$Ç\u0087ÝäIe;r";
               var6 = "tiÃ\u0001\u009d_´Â¥\u0015r\u009cú§WÚ^âX×\b\u008d²ê\u0081aã\u001e\u001dNºÔ\u0010T%k×»©Z$Ç\u0087ÝäIe;r".length();
               var3 = ' ';
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static UnknownFieldException a(UnknownFieldException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29595;
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
            throw new RuntimeException("su/catlean/h1", var10);
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
         throw new RuntimeException("su/catlean/h1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
