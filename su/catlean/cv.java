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
public final class cv implements GeneratedSerializer {
   @NotNull
   public static final cv c;
   @NotNull
   private static final SerialDescriptor l;
   private static final long a = j0.a(2807704878602703849L, 2659473907005421138L, MethodHandles.lookup().lookupClass()).a(272908454064784L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;

   private cv() {
   }

   public final void T(@NotNull Encoder encoder, long a, @NotNull f6 value) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.p<invokedynamic>(16360, 6430066407016465130L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(25274, 578550656341401534L ^ var2));
      SerialDescriptor var5 = l;
      CompositeEncoder var6 = var1.beginStructure(var5);
      f6.S(var4, var6, var5);
      var6.endStructure(var5);
   }

   @NotNull
   public final f6 u(long a, @NotNull Decoder decoder) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return l;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = f6.x();
      KSerializer[] var2 = new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 1112301422658L;
      long var5 = var3 ^ 68716681746013L;
      this.T(var1, var5, (f6)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 7875152649086L;
      long var4 = var2 ^ 35357684295781L;
      return this.u(var4, var1);
   }

   static {
      long var9 = a ^ 128164733528041L;
      e = new HashMap(13);
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
      String var4 = "UwzàM\u0087î*Âr\u0014:Íe\u008b\u009e\u0010ê\u0085½`\rõ|³¼\u00833'2\u009aÜ\u008a\u0010B°\u0017\u0018s\u0094æ¶Äb\u0014õë\u0085\u0017Û Ì\u00adE\u0017\u0094±Gû\b\u0086 Ká\u009d¦§Ù\u0088½Ïíì}?Â\u008b\u001b^j±u½";
      int var6 = "UwzàM\u0087î*Âr\u0014:Íe\u008b\u009e\u0010ê\u0085½`\rõ|³¼\u00833'2\u009aÜ\u008a\u0010B°\u0017\u0018s\u0094æ¶Äb\u0014õë\u0085\u0017Û Ì\u00adE\u0017\u0094±Gû\b\u0086 Ká\u009d¦§Ù\u0088½Ïíì}?Â\u008b\u001b^j±u½".length();
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
                  d = new String[6];
                  c = new cv();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.p<invokedynamic>(7007, 2822074447367446399L ^ var9), (GeneratedSerializer)c, 2);
                  var11.addElement(true.p<invokedynamic>(5819, 3651272137333576345L ^ var9), false);
                  var11.addElement(true.p<invokedynamic>(26449, 4890545060148601719L ^ var9), false);
                  l = (SerialDescriptor)var11;
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

               var4 = "X\u0090NiÝ=\u0091\u001fÓ¨\u0091\n\u0000ø\u0011¤\u0010àM.\u0087Ýfïu\u0014ù<ðÐé\u0018¦";
               var6 = "X\u0090NiÝ=\u0091\u001fÓ¨\u0091\n\u0000ø\u0011¤\u0010àM.\u0087Ýfïu\u0014ù<ðÐé\u0018¦".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8985;
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
            throw new RuntimeException("su/catlean/cv", var10);
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
         throw new RuntimeException("su/catlean/cv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
