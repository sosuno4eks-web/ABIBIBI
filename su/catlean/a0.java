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
public final class a0 implements GeneratedSerializer {
   @NotNull
   public static final a0 Y;
   @NotNull
   private static final SerialDescriptor w;
   private static final long a = j0.a(2243708490850885095L, 1646046868176587779L, MethodHandles.lookup().lookupClass()).a(152514035653049L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private a0() {
   }

   public final void V(short a, @NotNull Encoder encoder, long a, @NotNull hs value) {
      long var6 = ((long)var1 << 48 | var3 << 16 >>> 16) ^ a;
      long var8 = var6 ^ 36003939057087L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(20491, 5445914757830201850L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.i<invokedynamic>(17541, 8233666390548071795L ^ var6));
      SerialDescriptor var10 = w;
      CompositeEncoder var11 = var2.beginStructure(var10);
      hs.A(var5, var11, var10, var8);
      var11.endStructure(var10);
   }

   @NotNull
   public final hs F(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return w;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      Lazy[] var1 = hs.s();
      KSerializer[] var2 = new KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var1[1].getValue()};
      return var2;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 85217870651928L;
      long var10001 = var3 ^ 26659346692334L;
      int var5 = (int)((var3 ^ 26659346692334L) >>> 48);
      long var6 = var10001 << 16 >>> 16;
      this.V((short)var5, var1, var6, (hs)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 36071923005449L;
      long var4 = var2 ^ 125253776061717L;
      return this.F(var1, var4);
   }

   static {
      long var9 = a ^ 125580447806976L;
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
      String var4 = " jeÎR\\û;\u000bÓ«ª`\u000e\u0011s\b¿\u009a§\u0004ÁÈ\u008cL6!¦Ç\u0019ò¿\u0010Ü$<ñ1\u0092Æzýç^ó\\~°%\u0010\u001c\u00031f.Íø¡\u0096.ZÕ\u0086Ý\fË\u0010¼ÒEXéDò¨¨%#ñÈè¬Ö";
      int var6 = " jeÎR\\û;\u000bÓ«ª`\u000e\u0011s\b¿\u009a§\u0004ÁÈ\u008cL6!¦Ç\u0019ò¿\u0010Ü$<ñ1\u0092Æzýç^ó\\~°%\u0010\u001c\u00031f.Íø¡\u0096.ZÕ\u0086Ý\fË\u0010¼ÒEXéDò¨¨%#ñÈè¬Ö".length();
      char var3 = ' ';
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
                  Y = new a0();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.i<invokedynamic>(8450, 5133385339867775530L ^ var9), (GeneratedSerializer)Y, 2);
                  var11.addElement(true.i<invokedynamic>(14025, 7649809859473102304L ^ var9), false);
                  var11.addElement(true.i<invokedynamic>(30006, 373476127660414493L ^ var9), true);
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

               var4 = "ì§°ót8_ÓØ\u0095(ºûsån\u0010CEoÐ±É\u0083ÏºÛÔ\u001fí\u0010Ã\u009a";
               var6 = "ì§°ót8_ÓØ\u0095(ºûsån\u0010CEoÐ±É\u0083ÏºÛÔ\u001fí\u0010Ã\u009a".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6917;
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
            throw new RuntimeException("su/catlean/a0", var10);
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
         throw new RuntimeException("su/catlean/a0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
