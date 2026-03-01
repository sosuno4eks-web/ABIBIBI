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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class k7 implements GeneratedSerializer {
   @NotNull
   public static final k7 r;
   @NotNull
   private static final SerialDescriptor d;
   private static final long a = j0.a(6271046558460084067L, 6844070298247103294L, MethodHandles.lookup().lookupClass()).a(186540961507725L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;

   private k7() {
   }

   public final void X(@NotNull Encoder encoder, long a, @NotNull vn value) {
      var2 ^= a;
      long var5 = var2 ^ 121355942939114L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(20120, 6818305425581745731L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.c<invokedynamic>(22984, 7389421720848544017L ^ var2));
      SerialDescriptor var7 = d;
      CompositeEncoder var8 = var1.beginStructure(var7);
      vn.x(var4, var8, var5, var7);
      var8.endStructure(var7);
   }

   @NotNull
   public final vn A(long a, @NotNull Decoder decoder) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return d;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)LongSerializer.INSTANCE)};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 14230035368424L;
      long var5 = var3 ^ 30771023913183L;
      this.X(var1, var5, (vn)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 136033724343030L;
      long var4 = var2 ^ 25369895804653L;
      return this.A(var4, var1);
   }

   static {
      long var9 = a ^ 50239863048101L;
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
      String var4 = "?Æ\u000fb\u0003\u0018+\u008f³¢\u0001\u008c\u008ff\u0019V\u0010ê\n\u0004\u001a3\u001bk\u001c9mU|³\u0091Vó\u0010ü}+¤\u0013\u000fÍ§%«Mç \fþ\u0095\u0010\f\u0088¯£¶Às?ûÇÚ?\u0087\u0096\u000fj";
      int var6 = "?Æ\u000fb\u0003\u0018+\u008f³¢\u0001\u008c\u008ff\u0019V\u0010ê\n\u0004\u001a3\u001bk\u001c9mU|³\u0091Vó\u0010ü}+¤\u0013\u000fÍ§%«Mç \fþ\u0095\u0010\f\u0088¯£¶Às?ûÇÚ?\u0087\u0096\u000fj".length();
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
                  c = new String[6];
                  r = new k7();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.c<invokedynamic>(30277, 7745266735648158409L ^ var9), (GeneratedSerializer)r, 2);
                  var11.addElement(true.c<invokedynamic>(32341, 2241379671681022685L ^ var9), false);
                  var11.addElement(true.c<invokedynamic>(17616, 7258716208186064986L ^ var9), true);
                  d = (SerialDescriptor)var11;
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

               var4 = "ú9+â\u0099\u0003äìg\u0080¼¥[GÏ^ \u000eùt÷Q\u001a#\u009fO¡6ÀÓ[Éá\u00075\u008f§:\u001dÅa!\u0019 è\u009f\u0001H\"";
               var6 = "ú9+â\u0099\u0003äìg\u0080¼¥[GÏ^ \u000eùt÷Q\u001a#\u009fO¡6ÀÓ[Éá\u00075\u008f§:\u001dÅa!\u0019 è\u009f\u0001H\"".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16876;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/k7", var10);
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
         throw new RuntimeException("su/catlean/k7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
