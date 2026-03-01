package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

final class __ implements KSerializer {
   @NotNull
   private final SerialDescriptor V;
   private static final long a = j0.a(63383138517435589L, 2603180825141708113L, MethodHandles.lookup().lookupClass()).a(280314106071148L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public __(long var1) {
      var1 ^= a;
      super();
      this.V = SerialDescriptorsKt.PrimitiveSerialDescriptor(true.s<invokedynamic>(4554, 4128518555171479049L ^ var1), (PrimitiveKind)PrimitiveKind.INT.INSTANCE);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.V;
   }

   public void n(@NotNull Encoder encoder, byte a, long a, @NotNull Color value) {
      long var6 = ((long)var2 << 56 | var3 << 8 >>> 8) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.s<invokedynamic>(10382, 7936589084260734386L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.s<invokedynamic>(3441, 6703591365884948556L ^ var6));
      var1.encodeInt(var5.getRGB());
   }

   @NotNull
   public Color a(@NotNull Decoder decoder, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.s<invokedynamic>(14601, 4205931506646488520L ^ var2));
      return new Color(var1.decodeInt(), true);
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 25989607850426L;
      long var10001 = var3 ^ 108046219537531L;
      int var5 = (int)((var3 ^ 108046219537531L) >>> 56);
      long var6 = var10001 << 8 >>> 8;
      this.n(var1, (byte)var5, var6, (Color)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 125347775300415L;
      long var4 = var2 ^ 95305998122753L;
      return this.a(var1, var4);
   }

   static {
      long var0 = a ^ 89708188894559L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u0086°æ\u0085:«ç\f>¼¨ü@Y\u0083$\u0010\"¼.\u001b/\n§\u0098ðBsPuÆ\u0003ì";
      int var8 = "\u0086°æ\u0085:«ç\f>¼¨ü@Y\u0083$\u0010\"¼.\u001b/\n§\u0098ðBsPuÆ\u0003ì".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[4];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "\\d`Cã\u008bÝ\u0093y»\u0089ÚL¯üA\u0010\u0011\\ë´ô6£Üã\u0004ÜV\fÔ\u000f\u0081";
               var8 = "\\d`Cã\u008bÝ\u0093y»\u0089ÚL¯üA\u0010\u0011\\ë´ô6£Üã\u0004ÜV\fÔ\u000f\u0081".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20733;
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
            throw new RuntimeException("su/catlean/__", var10);
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
         throw new RuntimeException("su/catlean/__" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
