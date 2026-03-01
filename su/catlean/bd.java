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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class bd {
   @NotNull
   public static final fg S;
   @Nullable
   private final String f;
   @Nullable
   private final String Z;
   @Nullable
   private final String Q;
   @Nullable
   private final String I;
   private static final long a = j0.a(2960373457393629350L, 2617115388300343147L, MethodHandles.lookup().lookupClass()).a(256753999142553L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   public bd(@Nullable String largeImage, @Nullable String largeText, @Nullable String smallImage, @Nullable String smallText) {
      this.f = var1;
      this.Z = var2;
      this.Q = var3;
      this.I = var4;
   }

   @Nullable
   public final String I() {
      return this.f;
   }

   @Nullable
   public final String D() {
      return this.Z;
   }

   @Nullable
   public final String x() {
      return this.Q;
   }

   @Nullable
   public final String k() {
      return this.I;
   }

   @Nullable
   public final String B() {
      return this.f;
   }

   @Nullable
   public final String P() {
      return this.Z;
   }

   @Nullable
   public final String j() {
      return this.Q;
   }

   @Nullable
   public final String N() {
      return this.I;
   }

   @NotNull
   public final bd T(@Nullable String largeImage, @Nullable String largeText, @Nullable String smallImage, @Nullable String smallText) {
      return new bd(var1, var2, var3, var4);
   }

   public static bd H(bd param0, String param1, String param2, String param3, String param4, long param5, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 63145773817954L;
      String var3 = this.I;
      String var4 = this.Q;
      String var5 = this.Z;
      String var6 = this.f;
      String var10000 = 2859.n<invokedynamic>(2859, 1302266721219473983L ^ var1);
      return var10000 + var6 + true.n<invokedynamic>(17748, 5711103196529572930L ^ var1) + var5 + true.n<invokedynamic>(28789, 3966418411258808674L ^ var1) + var4 + true.n<invokedynamic>(9609, 2390647341266525340L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void T(bd self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeNullableSerializableElement(var2, 0, (SerializationStrategy)StringSerializer.INSTANCE, var0.f);
      var1.encodeNullableSerializableElement(var2, 1, (SerializationStrategy)StringSerializer.INSTANCE, var0.Z);
      var1.encodeNullableSerializableElement(var2, 2, (SerializationStrategy)StringSerializer.INSTANCE, var0.Q);
      var1.encodeNullableSerializableElement(var2, 3, (SerializationStrategy)StringSerializer.INSTANCE, var0.I);
   }

   public bd(int seen0, String largeImage, String largeText, long a, String smallImage, String smallText, SerializationConstructorMarker serializationConstructorMarker) {
      var4 ^= a;
      if (true.k<invokedynamic>(14518, 6203554372365107592L ^ var4) != (true.k<invokedynamic>(5699, 9101543180188741502L ^ var4) & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, true.k<invokedynamic>(5699, 9101543180188741502L ^ var4), su.catlean.g.X.getDescriptor());
      }

      super();
      this.f = var2;
      this.Z = var3;
      this.Q = var6;
      this.I = var7;
   }

   static {
      long var11 = a ^ 16871723530182L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "Ù®ñG5Ö\u0086ÐEç\u008e\u008dç²¥$_ÿXþ'\u0003¸J (yôº¢\\Î\u008f?M\u0092o÷\u007fTÿïõCå\u0001©pr«\u001d\u0096÷½\u0018ä\r";
      int var19 = "Ù®ñG5Ö\u0086ÐEç\u008e\u008dç²¥$_ÿXþ'\u0003¸J (yôº¢\\Î\u008f?M\u0092o÷\u007fTÿïõCå\u0001©pr«\u001d\u0096÷½\u0018ä\r".length();
      char var16 = 24;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[4];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "\u000fW~Ù\u001fjô9\u001càmïJp\u0000VÙ?ì|úV2ö";
                  int var5 = "\u000fW~Ù\u001fjô9\u001càmïJp\u0000VÙ?ì|úV2ö".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              e = var6;
                              g = new Integer[5];
                              S = new fg((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "nÜP+\u001a»Ño®\u009dx6¿È½\u008e";
                           var5 = "nÜP+\u001a»Ño®\u009dx6¿È½\u008e".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "§o\u000f¿W·\u0006Íö\u00185\u0088\u0006\u001aËÔö\u009aõ¤ä\u0000zôú%\u0093\u0091SS8«0\u0002\u0001ð¤¤!ê\u009b²G\u0089w¿\u0090P\u009fá·Éa\u008bðÙl>k\u0001\u0014qië\u009e\u0099\u000eU\u0004qªÔ\\\u00adàQñËéEê";
               var19 = "§o\u000f¿W·\u0006Íö\u00185\u0088\u0006\u001aËÔö\u009aõ¤ä\u0000zôú%\u0093\u0091SS8«0\u0002\u0001ð¤¤!ê\u009b²G\u0089w¿\u0090P\u009fá·Éa\u008bðÙl>k\u0001\u0014qië\u009e\u0099\u000eU\u0004qªÔ\\\u00adàQñËéEê".length();
               var16 = ' ';
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26445;
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
            throw new RuntimeException("su/catlean/bd", var10);
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
         throw new RuntimeException("su/catlean/bd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23523;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/bd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/bd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
