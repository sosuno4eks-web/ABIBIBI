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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class mc implements GeneratedSerializer {
   @NotNull
   public static final mc T;
   @NotNull
   private static final SerialDescriptor F;
   private static final long a = j0.a(7366454815608982694L, 7660902256410094988L, MethodHandles.lookup().lookupClass()).a(55854045073696L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private mc() {
   }

   public final void Q(@NotNull Encoder encoder, long a, @NotNull g2 value) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(8696, 4937684864392819706L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.x<invokedynamic>(29935, 6487417211715364584L ^ var2));
      SerialDescriptor var5 = F;
      CompositeEncoder var6 = var1.beginStructure(var5);
      g2.F(var4, var6, var5);
      var6.endStructure(var5);
   }

   @NotNull
   public final g2 f(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return F;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{BuiltinSerializersKt.getNullable((KSerializer)lp.I), BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE)};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 47174418867470L;
      long var5 = var3 ^ 132881573181971L;
      this.Q(var1, var5, (g2)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 40426489911774L;
      long var4 = var2 ^ 59147799751577L;
      return this.f(var1, var4);
   }

   static {
      long var9 = a ^ 125318680395395L;
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
      String var4 = "7\u0081Û6dÂ)\u0018\u0093f\u008a^\u0090@q\u0090\u0010]@Êç>\u0007¾ÇÒûT s¼%i Uò\u0006Q7v\u008bq&ÉEÜ:\u001d\u00ad]-]:\u0098 7þ2¹è?)Ô4ëB\u0010¼+\u0089\u001a¿±Ù!\u0091Âü\u0017{=;l\u0010Þ\u0088+õl\u0000á·AJ\u0011Òê\u000f\u00837";
      int var6 = "7\u0081Û6dÂ)\u0018\u0093f\u008a^\u0090@q\u0090\u0010]@Êç>\u0007¾ÇÒûT s¼%i Uò\u0006Q7v\u008bq&ÉEÜ:\u001d\u00ad]-]:\u0098 7þ2¹è?)Ô4ëB\u0010¼+\u0089\u001a¿±Ù!\u0091Âü\u0017{=;l\u0010Þ\u0088+õl\u0000á·AJ\u0011Òê\u000f\u00837".length();
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
                  c = new String[7];
                  T = new mc();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.x<invokedynamic>(3275, 4754756536588808296L ^ var9), (GeneratedSerializer)T, 3);
                  var11.addElement(true.x<invokedynamic>(2718, 6341590222252029499L ^ var9), false);
                  var11.addElement(true.x<invokedynamic>(11023, 6611079003277498285L ^ var9), false);
                  var11.addElement(true.x<invokedynamic>(5476, 4298963791905728964L ^ var9), false);
                  F = (SerialDescriptor)var11;
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

               var4 = "\u009a'Ó\u0013'þ} d¹i\u0003a6\u0097\u0004\u0010]¨ân?Æ¦XÃ\u009di¼½1\u009f\u0091";
               var6 = "\u009a'Ó\u0013'þ} d¹i\u0003a6\u0097\u0004\u0010]¨ân?Æ¦XÃ\u009di¼½1\u009f\u0091".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3359;
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
            throw new RuntimeException("su/catlean/mc", var10);
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
         throw new RuntimeException("su/catlean/mc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
