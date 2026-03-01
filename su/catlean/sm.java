package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class sm {
   @NotNull
   public static final vw A;
   @Nullable
   private final String D;
   @Nullable
   private final String h;
   @NotNull
   private final vn a;
   @Nullable
   private final bd Z;
   @Nullable
   private final List Q;
   @JvmField
   @NotNull
   private static final Lazy[] b;
   private static final long c = j0.a(6003960408327357070L, 1398495126057775855L, MethodHandles.lookup().lookupClass()).a(189324777171324L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] i;
   private static final Map j;

   public sm(@Nullable String details, @Nullable String state, @NotNull vn timestamps, @Nullable bd assets, @Nullable List buttons, long a) {
      var6 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.x<invokedynamic>(32512, 621756083838723549L ^ var6));
      super();
      this.D = var1;
      this.h = var2;
      this.a = var3;
      this.Z = var4;
      this.Q = var5;
   }

   @Nullable
   public final String k() {
      return this.D;
   }

   @Nullable
   public final String p() {
      return this.h;
   }

   @NotNull
   public final vn y() {
      return this.a;
   }

   @Nullable
   public final bd X() {
      return this.Z;
   }

   @Nullable
   public final List O() {
      return this.Q;
   }

   @Nullable
   public final String Q() {
      return this.D;
   }

   @Nullable
   public final String g() {
      return this.h;
   }

   @NotNull
   public final vn T() {
      return this.a;
   }

   @Nullable
   public final bd L() {
      return this.Z;
   }

   @Nullable
   public final List P() {
      return this.Q;
   }

   @NotNull
   public final sm S(@Nullable String details, long a, @Nullable String state, @NotNull vn timestamps, byte a, @Nullable bd assets, @Nullable List buttons) {
      long var9 = (var2 << 8 | (long)var6 << 56 >>> 56) ^ c;
      long var11 = var9 ^ 118734434660302L;
      Intrinsics.checkNotNullParameter(var5, true.x<invokedynamic>(25541, 596394978144501040L ^ var9));
      return new sm(var1, var4, var5, var7, var8, var11);
   }

   public static sm l(sm param0, String param1, String param2, vn param3, bd param4, List param5, long param6, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = c ^ 80301590944680L;
      List var3 = this.Q;
      bd var4 = this.Z;
      vn var5 = this.a;
      String var6 = this.h;
      String var7 = this.D;
      String var10000 = 29405.x<invokedynamic>(29405, 6818241970767535990L ^ var1);
      return var10000 + var7 + true.x<invokedynamic>(17492, 6584358033493436925L ^ var1) + var6 + true.x<invokedynamic>(20881, 7315228545908325439L ^ var1) + var5 + true.x<invokedynamic>(30206, 531937601605212242L ^ var1) + var4 + true.x<invokedynamic>(7972, 4801009738224628361L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void t(sm self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = b;
      var1.encodeNullableSerializableElement(var2, 0, (SerializationStrategy)StringSerializer.INSTANCE, var0.D);
      var1.encodeNullableSerializableElement(var2, 1, (SerializationStrategy)StringSerializer.INSTANCE, var0.h);
      var1.encodeSerializableElement(var2, 2, (SerializationStrategy)k7.r, var0.a);
      var1.encodeNullableSerializableElement(var2, 3, (SerializationStrategy)su.catlean.g.X, var0.Z);
      var1.encodeNullableSerializableElement(var2, 4, (SerializationStrategy)var3[4].getValue(), var0.Q);
   }

   public sm(int seen0, String details, String state, long a, vn timestamps, bd assets, List buttons, SerializationConstructorMarker serializationConstructorMarker) {
      var4 ^= c;
      if (true.w<invokedynamic>(675, 8764159925599589505L ^ var4) != (true.w<invokedynamic>(26581, 3938047426676765173L ^ var4) & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, true.w<invokedynamic>(26581, 3938047426676765173L ^ var4), as.L.getDescriptor());
      }

      super();
      this.D = var2;
      this.h = var3;
      this.a = var6;
      this.Z = var7;
      this.Q = var8;
   }

   private static final KSerializer c() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)g_.M));
   }

   public static final Lazy[] n() {
      return b;
   }

   static {
      long var11 = c ^ 122531597082087L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "À\f¿\u001aê5\u009d\u001då\u0083Óû04X kûÆÃvW\\;s©g!\u0083¸\u0000ð ¸D,\u0091ã\u008f\u0091z\t6ìT\u009eKmïÍ¸L\u009co¶Á¥UðÎÈñ)Cã ê\u009cåv\u0001F\u0016\u0090\u0085Á\u000b\u0001üçÿ8SÂQ>ë\r\u00adû\u008cLJ']Ï¹k zñ¯ö% Ë«\u0000±m\u0093¥\u0095opÜq)ÿ ËòMu\\}OÁ\u0000çý(\t§0:\u001e2èW\u009f?\u0090\u0095µ}x\u0001\u0003|6)Å²\u0094\u0012&.ìãÙfµöùªÎ\u008a\u0018\u00128r";
      int var19 = "À\f¿\u001aê5\u009d\u001då\u0083Óû04X kûÆÃvW\\;s©g!\u0083¸\u0000ð ¸D,\u0091ã\u008f\u0091z\t6ìT\u009eKmïÍ¸L\u009co¶Á¥UðÎÈñ)Cã ê\u009cåv\u0001F\u0016\u0090\u0085Á\u000b\u0001üçÿ8SÂQ>ë\r\u00adû\u008cLJ']Ï¹k zñ¯ö% Ë«\u0000±m\u0093¥\u0095opÜq)ÿ ËòMu\\}OÁ\u0000çý(\t§0:\u001e2èW\u009f?\u0090\u0095µ}x\u0001\u0003|6)Å²\u0094\u0012&.ìãÙfµöùªÎ\u008a\u0018\u00128r".length();
      char var16 = ' ';
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var23 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var29;
               if ((var15 += var16) >= var19) {
                  d = var20;
                  e = new String[7];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "=m#\u009b©0/\u0015\u007f\u0083\u0092ñ\u007fßá\u0003";
                  int var5 = "=m#\u009b©0/\u0015\u007f\u0083\u0092ñ\u007fßá\u0003".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[4];
                              A = new vw((DefaultConstructorMarker)null);
                              Lazy[] var22 = new Lazy[]{null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, sm::c)};
                              b = var22;
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001f\u0006\u001eÈL¦\u008fm£ú\u0092¾oh ù";
                           var5 = "\u001f\u0006\u001eÈL¦\u008fm£ú\u0092¾oh ù".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var29;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "\u0092%R$ØGw(¾Nz\u001ek.\tÃ½«è=Ó,\u0010\u0099vç¤Ù\u0094CYð Òük3î\u0097ìµ¦¦\u0080\u0097c*¾Äo\u001d\"F\u000e\u0011ä\u0018\u0083[è·Ï\rÕ\u0092";
               var19 = "\u0092%R$ØGw(¾Nz\u001ek.\tÃ½«è=Ó,\u0010\u0099vç¤Ù\u0094CYð Òük3î\u0097ìµ¦¦\u0080\u0097c*¾Äo\u001d\"F\u000e\u0011ä\u0018\u0083[è·Ï\rÕ\u0092".length();
               var16 = ' ';
               var15 = -1;
            }

            ++var15;
            var23 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7652;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/sm", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/sm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31707;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/sm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/sm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
