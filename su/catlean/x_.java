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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class x_ implements GeneratedSerializer {
   @NotNull
   public static final x_ v;
   @NotNull
   private static final SerialDescriptor z;
   private static String w;
   private static final long a = j0.a(1333114189947609488L, 8374172013011701984L, MethodHandles.lookup().lookupClass()).a(132464560432819L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private x_() {
   }

   public final void P(@NotNull Encoder encoder, long a, @NotNull n_ value) {
      var2 ^= a;
      long var5 = var2 ^ 15038400813495L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(26451, 5129881311338483499L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(1680, 3756733167756619501L ^ var2));
      SerialDescriptor var7 = z;
      CompositeEncoder var8 = var1.beginStructure(var7);
      n_.b(var4, var8, var5, var7);
      var8.endStructure(var7);
   }

   @NotNull
   public final n_ h(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return z;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 59418754159233L;
      long var5 = var3 ^ 95635643741462L;
      this.P(var1, var5, (n_)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 12591025198528L;
      long var4 = var2 ^ 2007914543760L;
      return this.h(var1, var4);
   }

   static {
      long var9 = a ^ 29272781752851L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 4703016783017006602L, var9);
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
      String var4 = "ÂJÊÜªmAÍÃ.ud©vlÇ\u0010¤´oôb¬ÍEP\u007f\f+þÂdº\u0018\u0015Xà(ÄàK\u000f£^b\\«Ô\u001b½ò&h¶ÉÚ\u0004C\u0010H\u009f\u009c\u0011(\u0089ÁP\u0093 ëY7\tù\u0007\u0010¢£k\u0093õ7µ\u0015\u009e\t£ï¼¸\u0096{";
      int var6 = "ÂJÊÜªmAÍÃ.ud©vlÇ\u0010¤´oôb¬ÍEP\u007f\f+þÂdº\u0018\u0015Xà(ÄàK\u000f£^b\\«Ô\u001b½ò&h¶ÉÚ\u0004C\u0010H\u009f\u009c\u0011(\u0089ÁP\u0093 ëY7\tù\u0007\u0010¢£k\u0093õ7µ\u0015\u009e\t£ï¼¸\u0096{".length();
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
                  v = new x_();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.v<invokedynamic>(18013, 3907990626768783830L ^ var9), (GeneratedSerializer)v, 3);
                  var11.addElement(true.v<invokedynamic>(28959, 124656750956428944L ^ var9), true);
                  var11.addElement(true.v<invokedynamic>(14786, 1568432970912134730L ^ var9), true);
                  var11.addElement(true.v<invokedynamic>(25743, 1924178218193726213L ^ var9), true);
                  z = (SerialDescriptor)var11;
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

               var4 = "4Dæ©Ö\u000e!\u009fß¹â¿'5b?\u0010±¨\u0088óòÙí°\u0094«|\u0010L¿N\u0080";
               var6 = "4Dæ©Ö\u000e!\u009fß¹â¿'5b?\u0010±¨\u0088óòÙí°\u0094«|\u0010L¿N\u0080".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   public static void W(String var0) {
      w = var0;
   }

   public static String Y() {
      return w;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4074;
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
            throw new RuntimeException("su/catlean/x_", var10);
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
         throw new RuntimeException("su/catlean/x_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
