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
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class ir implements GeneratedSerializer {
   @NotNull
   public static final ir W;
   @NotNull
   private static final SerialDescriptor Y;
   private static final long a = j0.a(81218583556307398L, 5811167815218441347L, MethodHandles.lookup().lookupClass()).a(122390387217844L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private ir() {
   }

   public final void f(long a, @NotNull Encoder encoder, @NotNull eb value) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(20785, 4130466856468788293L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(784, 7217651249987642982L ^ var1));
      SerialDescriptor var5 = Y;
      CompositeEncoder var6 = var3.beginStructure(var5);
      eb.E(var4, var6, var5);
      var6.endStructure(var5);
   }

   @NotNull
   public final eb b(int a, @NotNull Decoder decoder, int a, char a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return Y;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = eb.S();
      KSerializer[] var2 = new KSerializer[]{(KSerializer)var1[0].getValue()};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 42702076795761L;
      long var5 = var3 ^ 110445798742545L;
      this.f(var5, var1, (eb)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 69856608541281L;
      long var10001 = var2 ^ 87925825302251L;
      int var4 = (int)((var2 ^ 87925825302251L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return this.b(var4, var1, var5, (char)var6);
   }

   static {
      long var9 = a ^ 84953615039388L;
      d = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "®Þè\u001f~;\u0095þz6M\u0089\n\u0012öaôj\u0015 u\u0089\u0084\nyã\u00adWÀ\u0011\u0096\u0001\u0010\u0092\u008e\u0083¢ÝxËþDØ8\u007f?kDò Å\u0094\"2\u0092²6µÓ#ÑÂ¾\u0000\u008e2\u0082\u008e\u0002`ü\u008dìº\u0092\u0086ÂØ}5)\"";
      int var6 = "®Þè\u001f~;\u0095þz6M\u0089\n\u0012öaôj\u0015 u\u0089\u0084\nyã\u00adWÀ\u0011\u0096\u0001\u0010\u0092\u008e\u0083¢ÝxËþDØ8\u007f?kDò Å\u0094\"2\u0092²6µÓ#ÑÂ¾\u0000\u008e2\u0082\u008e\u0002`ü\u008dìº\u0092\u0086ÂØ}5)\"".length();
      char var3 = ' ';
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
                  c = new String[5];
                  W = new ir();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.v<invokedynamic>(29835, 5132157318461901762L ^ var9), (GeneratedSerializer)W, 1);
                  var11.addElement(true.v<invokedynamic>(5958, 6382918580207396877L ^ var9), false);
                  Y = (SerialDescriptor)var11;
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

               var4 = "\u001eX\u0097+Ë\tO\u000fÎm\u0080WÂh\u000f~\u0010\u0085vvódp\u008a`;\u007f êÁ¢\"Þ";
               var6 = "\u001eX\u0097+Ë\tO\u000fÎm\u0080WÂh\u000f~\u0010\u0085vvódp\u008a`;\u007f êÁ¢\"Þ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25621;
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
            throw new RuntimeException("su/catlean/ir", var10);
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
         throw new RuntimeException("su/catlean/ir" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
