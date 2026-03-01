package su.catlean;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import org.jetbrains.annotations.NotNull;

public final class u4 {
   static final u4 c;
   private static final long a = j0.a(7011774414387169009L, 1397942080077561886L, MethodHandles.lookup().lookupClass()).a(181460632713772L);
   private static final String b;

   private u4() {
   }

   @NotNull
   public final KSerializer l(long var1) {
      long var10000 = a ^ var1;
      String var10002 = b;
      KClass var10003 = Reflection.getOrCreateKotlinClass(s6.class);
      KClass[] var3 = new KClass[]{Reflection.getOrCreateKotlinClass(md.class), Reflection.getOrCreateKotlinClass(so.class), Reflection.getOrCreateKotlinClass(mt.class)};
      KClass[] var10004 = var3;
      KSerializer[] var4 = new KSerializer[]{m1.O, cb.r, qz.g};
      return (KSerializer)(new SealedClassSerializer(var10002, var10003, var10004, var4, new Annotation[0]));
   }

   static {
      long var0 = a ^ 62397867687988L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÛI|«\u001b@\u00adUf\u001c\u0016¦1\u008f80".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
      c = new u4();
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
}
