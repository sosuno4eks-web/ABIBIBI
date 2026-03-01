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
public final class ah implements GeneratedSerializer {
   @NotNull
   public static final ah p;
   @NotNull
   private static final SerialDescriptor R;
   private static final long a = j0.a(876212845629746848L, 613245629421860487L, MethodHandles.lookup().lookupClass()).a(13979333947506L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private ah() {
   }

   public final void x(@NotNull Encoder encoder, int a, @NotNull nn value, int a, int a) {
      long var6 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(10190, 9205954289659442402L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.d<invokedynamic>(12843, 989890752483877123L ^ var6));
      SerialDescriptor var8 = R;
      CompositeEncoder var9 = var1.beginStructure(var8);
      nn.U(var3, var9, var8);
      var9.endStructure(var8);
   }

   @NotNull
   public final nn e(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return R;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = nn.I();
      KSerializer[] var2 = new KSerializer[]{(KSerializer)var1[0].getValue()};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 3200455073064L;
      long var10001 = var3 ^ 62236403112420L;
      int var5 = (int)((var3 ^ 62236403112420L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      this.x(var1, var5, (nn)var2, var6, var7);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 66973519413293L;
      long var4 = var2 ^ 47731383603793L;
      return this.e(var1, var4);
   }

   static {
      long var9 = a ^ 121208062338029L;
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
      String var4 = "\u0098P\f\u0017¯\ré¬*òñoc#µ\u0005\u0010\u0014ÅÓþ\u001dÔ×¨>{xxµ`£\u009c\u0010]N³~xÏK§É±/\u0097^CqZ";
      int var6 = "\u0098P\f\u0017¯\ré¬*òñoc#µ\u0005\u0010\u0014ÅÓþ\u001dÔ×¨>{xxµ`£\u009c\u0010]N³~xÏK§É±/\u0097^CqZ".length();
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
                  c = new String[5];
                  p = new ah();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.d<invokedynamic>(28361, 8231177416080058650L ^ var9), (GeneratedSerializer)p, 1);
                  var11.addElement(true.d<invokedynamic>(21579, 1446457337283826586L ^ var9), false);
                  R = (SerialDescriptor)var11;
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

               var4 = "¼/¦/SaGs\u001eKµ\nÿP\u0011¶e\u009a\u0002_µ-\u00076\u0007P£\u008a\u009etzá\u0010\u0014©\u0013úòq¥=\u0099ÂÊtåp6\u009e";
               var6 = "¼/¦/SaGs\u001eKµ\nÿP\u0011¶e\u009a\u0002_µ-\u00076\u0007P£\u008a\u009etzá\u0010\u0014©\u0013úòq¥=\u0099ÂÊtåp6\u009e".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6112;
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
            throw new RuntimeException("su/catlean/ah", var10);
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
         throw new RuntimeException("su/catlean/ah" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
