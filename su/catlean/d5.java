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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
public final class d5 implements GeneratedSerializer {
   @NotNull
   public static final d5 o;
   @NotNull
   private static final SerialDescriptor M;
   private static final long a = j0.a(2544402652200037345L, 5365632566986770155L, MethodHandles.lookup().lookupClass()).a(108756050839006L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private d5() {
   }

   public final void C(@NotNull Encoder encoder, @NotNull h2 value, long a) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.x<invokedynamic>(32424, 8936908750264481353L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.x<invokedynamic>(28500, 8661124500783769520L ^ var3));
      SerialDescriptor var5 = M;
      CompositeEncoder var6 = var1.beginStructure(var5);
      h2.j(var2, var6, var5);
      var6.endStructure(var5);
   }

   @NotNull
   public final h2 Y(int a, @NotNull Decoder decoder, char a, int a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return M;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = h2.t();
      KSerializer[] var2 = new KSerializer[]{BuiltinSerializersKt.getNullable((KSerializer)var1[0].getValue()), BuiltinSerializersKt.getNullable((KSerializer)var1[1].getValue()), mc.T};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 58010930803866L;
      long var5 = var3 ^ 137539645943776L;
      this.C(var1, (h2)var2, var5);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 29911064889102L;
      long var10001 = var2 ^ 27938102425901L;
      int var4 = (int)((var2 ^ 27938102425901L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return this.Y(var4, var1, (char)var5, var6);
   }

   static {
      long var9 = a ^ 76696912116497L;
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
      String var4 = "?õ,\u001dIB^çñó\n\u0099\u0096®\u00862\u0010_Ä#\u009c[\u0093b\u00ad\u009d\u000e=}¸\b\u009b.\u0010ÖGJsägìü}vÜÀ¢läç\u0010®B&ýþ)ÌÉëÇ!²\u007f\u0004©[\u00104[¤HWØ§\u0005¹À\u0000\u0088e\u0083÷¢";
      int var6 = "?õ,\u001dIB^çñó\n\u0099\u0096®\u00862\u0010_Ä#\u009c[\u0093b\u00ad\u009d\u000e=}¸\b\u009b.\u0010ÖGJsägìü}vÜÀ¢läç\u0010®B&ýþ)ÌÉëÇ!²\u007f\u0004©[\u00104[¤HWØ§\u0005¹À\u0000\u0088e\u0083÷¢".length();
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
                  o = new d5();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.x<invokedynamic>(897, 3841974879518683060L ^ var9), (GeneratedSerializer)o, 3);
                  var11.addElement(true.x<invokedynamic>(30395, 764284530304096911L ^ var9), false);
                  var11.addElement(true.x<invokedynamic>(12109, 458501398759883647L ^ var9), false);
                  var11.addElement(true.x<invokedynamic>(24945, 3492319776258460993L ^ var9), false);
                  M = (SerialDescriptor)var11;
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

               var4 = "/©\r¦¡É`°8[%ü[1z\u0084,ùd_\u000f\u0013\u009d\u000f¤ñIÃ\u0086SêÉ\u0010·[4¿6/\u0083\u0082v»sxÏý3\u0092";
               var6 = "/©\r¦¡É`°8[%ü[1z\u0084,ùd_\u000f\u0013\u009d\u000f¤ñIÃ\u0086SêÉ\u0010·[4¿6/\u0083\u0082v»sxÏý3\u0092".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5016;
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
            throw new RuntimeException("su/catlean/d5", var10);
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
         throw new RuntimeException("su/catlean/d5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
