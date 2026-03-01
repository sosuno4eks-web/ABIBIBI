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
public final class _b implements GeneratedSerializer {
   @NotNull
   public static final _b I;
   @NotNull
   private static final SerialDescriptor K;
   private static final long a = j0.a(216331397456505762L, 864359601608226323L, MethodHandles.lookup().lookupClass()).a(185939635439339L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private _b() {
   }

   public final void J(long a, @NotNull Encoder encoder, @NotNull ru value) {
      var1 ^= a;
      long var5 = var1 ^ 96195936805891L;
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(2819, 7570883102976535296L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(11726, 1557827543293414859L ^ var1));
      SerialDescriptor var7 = K;
      CompositeEncoder var8 = var3.beginStructure(var7);
      ru.s(var4, var5, var8, var7);
      var8.endStructure(var7);
   }

   @NotNull
   public final ru U(@NotNull Decoder decoder, long a, byte a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return K;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = ru.Y();
      KSerializer[] var2 = new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 93865133629354L;
      long var5 = var3 ^ 21535642028365L;
      this.J(var5, var1, (ru)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 29761749796855L;
      long var10001 = var2 ^ 114564690837616L;
      long var4 = (var2 ^ 114564690837616L) >>> 8;
      int var6 = (int)(var10001 << 56 >>> 56);
      return this.U(var1, var4, (byte)var6);
   }

   static {
      long var9 = a ^ 10088018962372L;
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
      String var4 = "êªoÌÒ2\u0091]Ñe\f\u00ad\u0096\u008a\u000f\u0095$=VZ\u0003×¥\u0085\u0010í\u0012\u0019\u009ee¥QHÙ[\u0006\\ù¿>·\u0010±Õi§\u0011\u0081Mz\u00195ìM<*\u0084³\u0010\u0011\u0087\u0099bù N·TDRìºU'\u0096";
      int var6 = "êªoÌÒ2\u0091]Ñe\f\u00ad\u0096\u008a\u000f\u0095$=VZ\u0003×¥\u0085\u0010í\u0012\u0019\u009ee¥QHÙ[\u0006\\ù¿>·\u0010±Õi§\u0011\u0081Mz\u00195ìM<*\u0084³\u0010\u0011\u0087\u0099bù N·TDRìºU'\u0096".length();
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
                  c = new String[6];
                  I = new _b();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.n<invokedynamic>(4127, 2907693833269924973L ^ var9), (GeneratedSerializer)I, 2);
                  var11.addElement(true.n<invokedynamic>(485, 4047914478710310293L ^ var9), false);
                  var11.addElement(true.n<invokedynamic>(9270, 8793792138724532288L ^ var9), true);
                  K = (SerialDescriptor)var11;
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

               var4 = " hßX\u0095\u0014øtÿ7³\u0016OfË\u0002\u0010ý1²æÙ\u001a¦õ\u0006ÛfryÕ+\u009e";
               var6 = " hßX\u0095\u0014øtÿ7³\u0016OfË\u0002\u0010ý1²æÙ\u001a¦õ\u0006ÛfryÕ+\u009e".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14055;
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
            throw new RuntimeException("su/catlean/_b", var10);
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
         throw new RuntimeException("su/catlean/_b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
