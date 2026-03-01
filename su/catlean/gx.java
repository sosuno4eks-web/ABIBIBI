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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;

final class gx implements KSerializer {
   @NotNull
   private final SerialDescriptor A;
   private static final long a = j0.a(3120646470930012271L, 2386325224517130681L, MethodHandles.lookup().lookupClass()).a(246358072902386L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gx(long var1) {
      var1 ^= a;
      super();
      this.A = SerialDescriptorsKt.PrimitiveSerialDescriptor(true.m<invokedynamic>(17464, 3650417924716790289L ^ var1), (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
   }

   @NotNull
   public SerialDescriptor getDescriptor() {
      return this.A;
   }

   @NotNull
   public class_1792 z(int a, @NotNull Decoder decoder, short a, char a) {
      // $FF: Couldn't be decompiled
   }

   public void X(@NotNull Encoder encoder, short a, @NotNull class_1792 value, int a, char a) {
      long var6 = ((long)var2 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(16963, 6888466389387683001L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(18094, 7621481247203172434L ^ var6));
      String var10001 = var3.method_7876();
      Intrinsics.checkNotNullExpressionValue(var10001, true.m<invokedynamic>(32155, 3139820620037954406L ^ var6));
      var1.encodeString(var10001);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 111572895656108L;
      long var10001 = var2 ^ 69504892514797L;
      int var4 = (int)((var2 ^ 69504892514797L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return this.z(var4, var1, (short)var5, (char)var6);
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 104419296068508L;
      long var10001 = var3 ^ 60990991369156L;
      int var5 = (int)((var3 ^ 60990991369156L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this.X(var1, (short)var5, (class_1792)var2, var6, (char)var7);
   }

   static {
      long var0 = a ^ 27584953510475L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "Û«\u001dÞÇ^E\u0016\u0014ê¦-\u008a\u0004~Ç\u0010.\u008fg\u00874\u0098+\"Nÿ\u0014\u009eÀ<ßi\u0018g\u00ad×¤\b[Ô\u009bn\u001cÔ1vHÎ³¨uá\u0019F\u0098\u001fb\u0010Û\u0080´%{¢óå×\u0012å\u009e}\u000fþl\u0010Åè#\u000b\tlìss3ýã W\u0082¡";
      int var8 = "Û«\u001dÞÇ^E\u0016\u0014ê¦-\u008a\u0004~Ç\u0010.\u008fg\u00874\u0098+\"Nÿ\u0014\u009eÀ<ßi\u0018g\u00ad×¤\b[Ô\u009bn\u001cÔ1vHÎ³¨uá\u0019F\u0098\u001fb\u0010Û\u0080´%{¢óå×\u0012å\u009e}\u000fþl\u0010Åè#\u000b\tlìss3ýã W\u0082¡".length();
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
                  c = new String[7];
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

               var6 = "%^Sù?r\u0004¾\u0084í\u009ez\u001bÂVô¡\u0095òø÷rð\u008cÐláôG=¿Ú\u001b)h\u0010âÕ|I\u0010\u0097G*Ñn\u001b \u0002\u009c<#£.\u0010wS";
               var8 = "%^Sù?r\u0004¾\u0084í\u009ez\u001bÂVô¡\u0095òø÷rð\u008cÐláôG=¿Ú\u001b)h\u0010âÕ|I\u0010\u0097G*Ñn\u001b \u0002\u009c<#£.\u0010wS".length();
               var5 = '(';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9888;
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
            throw new RuntimeException("su/catlean/gx", var10);
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
         throw new RuntimeException("su/catlean/gx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
