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
public final class s9 implements GeneratedSerializer {
   @NotNull
   public static final s9 a;
   @NotNull
   private static final SerialDescriptor w;
   private static final long b = j0.a(7851951069384090846L, 9144710608801304226L, MethodHandles.lookup().lookupClass()).a(59317684428869L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private s9() {
   }

   public final void W(short a, @NotNull Encoder encoder, char a, @NotNull qs value, int a) {
      long var6 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ b;
      Intrinsics.checkNotNullParameter(var2, true.p<invokedynamic>(21507, 5525170217199370679L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(18859, 6140583734453836830L ^ var6));
      SerialDescriptor var8 = w;
      CompositeEncoder var9 = var2.beginStructure(var8);
      qs.Q(var4, var9, var8);
      var9.endStructure(var8);
   }

   @NotNull
   public final qs z(long a, @NotNull Decoder decoder) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return w;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = b ^ 134579181776887L;
      long var10001 = var3 ^ 47903070629954L;
      int var5 = (int)((var3 ^ 47903070629954L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      this.W((short)var5, var1, (char)var6, (qs)var2, var7);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = b ^ 58814619928421L;
      long var4 = var2 ^ 19029121332829L;
      return this.z(var4, var1);
   }

   static {
      long var9 = b ^ 114091852904528L;
      e = new HashMap(13);
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
      String var4 = "êõ¬Ý¤¡dG½\tW\u001a\u0084VQå\u0010\u008eÑ\u0012\u000e9\u008aºï&ëÒX\\¯ÿ¯\u0010{è\u00ad#)gJ\u0088è\"\u0012\u0000\u009a(%Ð";
      int var6 = "êõ¬Ý¤¡dG½\tW\u001a\u0084VQå\u0010\u008eÑ\u0012\u000e9\u008aºï&ëÒX\\¯ÿ¯\u0010{è\u00ad#)gJ\u0088è\"\u0012\u0000\u009a(%Ð".length();
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
                  c = var7;
                  d = new String[5];
                  a = new s9();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.p<invokedynamic>(32437, 6572351519624998526L ^ var9), (GeneratedSerializer)a, 2);
                  var11.addElement("v", false);
                  var11.addElement(true.p<invokedynamic>(24143, 2254050728267714179L ^ var9), false);
                  w = (SerialDescriptor)var11;
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

               var4 = "~}O¯ìCÆ\u00adx÷L§\u00020pË\u0093\u00ad\u0099Ý<ð\u0098\u000b{\u0014\u009d°{ÔY¤ pÄ\u000e-ô\u001fI®§u0 HÍ\u0004\u0011\u0012GÉÜn-³Kb\u001a\u0094õZ\u000f\fP";
               var6 = "~}O¯ìCÆ\u00adx÷L§\u00020pË\u0093\u00ad\u0099Ý<ð\u0098\u000b{\u0014\u009d°{ÔY¤ pÄ\u000e-ô\u001fI®§u0 HÍ\u0004\u0011\u0012GÉÜn-³Kb\u001a\u0094õZ\u000f\fP".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2560;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/s9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/s9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
