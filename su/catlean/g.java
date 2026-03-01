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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class g implements GeneratedSerializer {
   @NotNull
   public static final g X;
   @NotNull
   private static final SerialDescriptor C;
   private static final long a = j0.a(2855127487361850362L, 5382185011501321625L, MethodHandles.lookup().lookupClass()).a(49392340498782L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private g() {
   }

   public final void j(@NotNull Encoder encoder, @NotNull bd value, long a) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(11759, 330885523087010677L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.d<invokedynamic>(31315, 6272795225612352712L ^ var3));
      SerialDescriptor var5 = C;
      CompositeEncoder var6 = var1.beginStructure(var5);
      bd.T(var2, var6, var5);
      var6.endStructure(var5);
   }

   @NotNull
   public final bd i(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return C;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE)};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 45262332615533L;
      long var5 = var3 ^ 15800687851653L;
      this.j(var1, (bd)var2, var5);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 57826308190892L;
      long var4 = var2 ^ 118143321537500L;
      return this.i(var1, var4);
   }

   static {
      long var20 = a ^ 85085319151594L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "\u00155\u001d ³´\u009eË\u0019l7\u0097[\u009ea·\u0010\u001a\u0018\u0096dÅgM½Ä8PrÎRáJ\u00106\u0006÷°1+ú\u0094,û°ÝéZ\u009c¸ '\u000e¶\u0015£\u0092\u0002oõÏ·£·¢xøß\"ë\u0012\u0081ä¹L2°É\u001e\u0004K\u001aS\u0018%{Ã\u000f3ø\u0097\u008aîþZzíe`Ó<¡´|h\u0093\u007f\u0085 ZÜDÜÇcÑo~EÍ\u00ad(Ûö\\±¶DL\u001e:¨\u001bò\u0004\u0083ø\u000f\u0007Ì\u0088";
      int var17 = "\u00155\u001d ³´\u009eË\u0019l7\u0097[\u009ea·\u0010\u001a\u0018\u0096dÅgM½Ä8PrÎRáJ\u00106\u0006÷°1+ú\u0094,û°ÝéZ\u009c¸ '\u000e¶\u0015£\u0092\u0002oõÏ·£·¢xøß\"ë\u0012\u0081ä¹L2°É\u001e\u0004K\u001aS\u0018%{Ã\u000f3ø\u0097\u008aîþZzíe`Ó<¡´|h\u0093\u007f\u0085 ZÜDÜÇcÑo~EÍ\u00ad(Ûö\\±¶DL\u001e:¨\u001bò\u0004\u0083ø\u000f\u0007Ì\u0088".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[8];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "i\u0012\u0080äñá¿°¾\u0092\u00981l\u0089ö+";
                  int var5 = "i\u0012\u0080äñá¿°¾\u0092\u00981l\u0089ö+".length();
                  int var2 = 0;

                  do {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var26 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var30 = true;
                     var6[var26] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[2];
                  X = new g();
                  PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(true.d<invokedynamic>(18210, 5386899851935700884L ^ var20), (GeneratedSerializer)X, 4);
                  var22.addElement(true.d<invokedynamic>(32155, 3064111113127324974L ^ var20), false);
                  var22.addElement(true.d<invokedynamic>(29600, 8350709196117074705L ^ var20), false);
                  var22.addElement(true.d<invokedynamic>(23777, 3476638570800204885L ^ var20), false);
                  var22.addElement(true.d<invokedynamic>(29703, 1254560717436314800L ^ var20), false);
                  C = (SerialDescriptor)var22;
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "n¹\u0094\u000f¦\nçõ\u0099\u0018K¡2¦ûøÿ'×\"f\u0001I\u0013 \u0081Eêd£Ve\u0082J\u0098Zóç>¨\u0094\u008ez\u0012\u009b\u0019y¬G 0d½t#t×";
               var17 = "n¹\u0094\u000f¦\nçõ\u0099\u0018K¡2¦ûøÿ'×\"f\u0001I\u0013 \u0081Eêd£Ve\u0082J\u0098Zóç>¨\u0094\u008ez\u0012\u009b\u0019y¬G 0d½t#t×".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9586;
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
            throw new RuntimeException("su/catlean/g", var10);
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
         throw new RuntimeException("su/catlean/g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20773;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/g", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
