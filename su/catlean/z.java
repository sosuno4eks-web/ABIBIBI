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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class z implements GeneratedSerializer {
   @NotNull
   public static final z v;
   @NotNull
   private static final SerialDescriptor h;
   private static final long a = j0.a(3783101015537900812L, 746645978638839144L, MethodHandles.lookup().lookupClass()).a(278266890800087L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private z() {
   }

   public final void A(char a, int a, @NotNull Encoder encoder, @NotNull x6 value, short a) {
      long var6 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(1780, 6800298053762834517L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.q<invokedynamic>(21444, 313480608667186535L ^ var6));
      SerialDescriptor var8 = h;
      CompositeEncoder var9 = var3.beginStructure(var8);
      x6.u(var4, var9, var8);
      var9.endStructure(var8);
   }

   @NotNull
   public final x6 Z(long a, @NotNull Decoder decoder) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return h;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 101694570361988L;
      long var10001 = var3 ^ 55533855373255L;
      int var5 = (int)((var3 ^ 55533855373255L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this.A((char)var5, var6, var1, (x6)var2, (short)var7);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 57111205729156L;
      long var4 = var2 ^ 27377348372752L;
      return this.Z(var4, var1);
   }

   static {
      long var9 = a ^ 83963793402846L;
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
      String var4 = "5r\u008bßëÌ\n]*ÉÔOy¼\u001f£\u0010ñ´¡<Aß\nÛ\nz\u008cÊ\u0016b8*\u0010÷\u0019½.\u0003dütqee\u0015´Û#ð \u0084\u0081d*\u001b²t\u007f\u00908ÑÉ¥O±\u001c·'\t\t÷ï0È\u008d??¢>;\u001eI";
      int var6 = "5r\u008bßëÌ\n]*ÉÔOy¼\u001f£\u0010ñ´¡<Aß\nÛ\nz\u008cÊ\u0016b8*\u0010÷\u0019½.\u0003dütqee\u0015´Û#ð \u0084\u0081d*\u001b²t\u007f\u00908ÑÉ¥O±\u001c·'\t\t÷ï0È\u008d??¢>;\u001eI".length();
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
                  v = new z();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.q<invokedynamic>(7131, 7694539840303220939L ^ var9), (GeneratedSerializer)v, 2);
                  var11.addElement(true.q<invokedynamic>(10445, 5877621465394510811L ^ var9), false);
                  var11.addElement(true.q<invokedynamic>(25016, 8937224213664838314L ^ var9), false);
                  h = (SerialDescriptor)var11;
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

               var4 = "®â\u0096øþ\u0093á@\u001e\u0003\u0010â4¨\u0001R\u0010wÙÿ0\u000e\u0014]ùøæeV]¥ID";
               var6 = "®â\u0096øþ\u0093á@\u001e\u0003\u0010â4¨\u0001R\u0010wÙÿ0\u000e\u0014]ùøæeV]¥ID".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26080;
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
            throw new RuntimeException("su/catlean/z", var10);
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
         throw new RuntimeException("su/catlean/z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
