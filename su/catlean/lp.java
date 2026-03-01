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
public final class lp implements GeneratedSerializer {
   @NotNull
   public static final lp I;
   @NotNull
   private static final SerialDescriptor C;
   private static final long a = j0.a(6072107432604913707L, 5808349668221519356L, MethodHandles.lookup().lookupClass()).a(14389979315273L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private lp() {
   }

   public final void I(@NotNull Encoder encoder, @NotNull ex value, long a) {
      var3 ^= a;
      long var5 = var3 ^ 19245479400803L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(29750, 47106240107108247L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.k<invokedynamic>(19789, 3413539477288808175L ^ var3));
      SerialDescriptor var7 = C;
      CompositeEncoder var8 = var1.beginStructure(var7);
      ex.N(var2, var5, var8, var7);
      var8.endStructure(var7);
   }

   @NotNull
   public final ex c(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return C;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 58804677386279L;
      long var5 = var3 ^ 68322539580441L;
      this.I(var1, (ex)var2, var5);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 89514854275088L;
      long var4 = var2 ^ 135706199311395L;
      return this.c(var1, var4);
   }

   static {
      long var9 = a ^ 99610569019956L;
      d = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "¿\u0093§Lwï3Z\u0004XlAÉé;\u0091QøËq\rµ¥´\u0010v\u0084·Ê\u0089Û\u0006\u0085´ø·±*£\u0083=\u0010\u008d\u0016ù{-Mû\u0097DÁ\u0091)0üÅý ÿ2\u008cª)#\u0017H\u0003¸Ë\u0006íhª\u000b=77j \u0094e6äbTv\u001eú\u0018X\u0010ÈzcªÊàÕþ\u0017²\u00adæ¾\u009c\u0013+";
      int var6 = "¿\u0093§Lwï3Z\u0004XlAÉé;\u0091QøËq\rµ¥´\u0010v\u0084·Ê\u0089Û\u0006\u0085´ø·±*£\u0083=\u0010\u008d\u0016ù{-Mû\u0097DÁ\u0091)0üÅý ÿ2\u008cª)#\u0017H\u0003¸Ë\u0006íhª\u000b=77j \u0094e6äbTv\u001eú\u0018X\u0010ÈzcªÊàÕþ\u0017²\u00adæ¾\u009c\u0013+".length();
      char var3 = 24;
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
                  c = new String[7];
                  I = new lp();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.k<invokedynamic>(2092, 4290500024164040801L ^ var9), (GeneratedSerializer)I, 3);
                  var11.addElement(true.k<invokedynamic>(16295, 2048663102404917229L ^ var9), true);
                  var11.addElement(true.k<invokedynamic>(17729, 3290877950559587599L ^ var9), true);
                  var11.addElement(true.k<invokedynamic>(7513, 8047159125538198805L ^ var9), true);
                  C = (SerialDescriptor)var11;
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

               var4 = "´VU\u0013\u008e°\u008dØ\tÍ&®såúÈ\u0010\u0084ù©÷WôÙÚ¸\u008aÛÍ\f¯ÀË";
               var6 = "´VU\u0013\u008e°\u008dØ\tÍ&®såúÈ\u0010\u0084ù©÷WôÙÚ¸\u008aÛÍ\f¯ÀË".length();
               var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12185;
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
            throw new RuntimeException("su/catlean/lp", var10);
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
         throw new RuntimeException("su/catlean/lp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
