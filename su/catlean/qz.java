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
import kotlinx.serialization.internal.BooleanSerializer;
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
public final class qz implements GeneratedSerializer {
   @NotNull
   public static final qz g;
   @NotNull
   private static final SerialDescriptor w;
   private static final long a = j0.a(7318978486813099041L, 5263044367859312413L, MethodHandles.lookup().lookupClass()).a(257662457923281L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map h;

   private qz() {
   }

   public final void Q(@NotNull Encoder encoder, @NotNull mt value, int a, long a) {
      long var6 = ((long)var3 << 32 | var4 << 32 >>> 32) ^ a;
      long var8 = var6 ^ 4257680269341L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(22502, 5417728202707621107L ^ var6));
      Intrinsics.checkNotNullParameter(var2, true.j<invokedynamic>(29285, 7123852280126009722L ^ var6));
      SerialDescriptor var10 = w;
      CompositeEncoder var11 = var1.beginStructure(var10);
      mt.G(var2, var11, var8, var10);
      var11.endStructure(var10);
   }

   @NotNull
   public final mt L(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return w;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      long var1 = a ^ 121532907126424L;
      KSerializer[] var3 = new KSerializer[true.d<invokedynamic>(29176, 1083010954196114137L ^ var1)];
      var3[0] = StringSerializer.INSTANCE;
      var3[1] = x_.v;
      var3[2] = BooleanSerializer.INSTANCE;
      var3[3] = StringSerializer.INSTANCE;
      var3[4] = StringSerializer.INSTANCE;
      var3[5] = StringSerializer.INSTANCE;
      var3[true.d<invokedynamic>(23389, 8593570997909647486L ^ var1)] = StringSerializer.INSTANCE;
      var3[true.d<invokedynamic>(16904, 1392148712558029094L ^ var1)] = BooleanSerializer.INSTANCE;
      return var3;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 139825518111176L;
      long var10001 = var3 ^ 90970856718740L;
      int var5 = (int)((var3 ^ 90970856718740L) >>> 32);
      long var6 = var10001 << 32 >>> 32;
      this.Q(var1, (mt)var2, var5, var6);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 108847200791386L;
      long var4 = var2 ^ 69911642966683L;
      return this.L(var1, var4);
   }

   static {
      long var20 = a ^ 39099422737079L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "\u008d±ÎY\u0081\u0083ð0\u0004Æ\u009d_¬\n\u000fG\u0010-ÆI_}ÈÌo15.3G\u0087ÿà\u0010å5 g][âZõô\u0014½\u0018àÛS\u0010¾Ó\u0000å\u0011/\u009e\u0092â\u0085c\u0084Øþ·\u0001 TiÅÖ±Fä¥%\fÂä\u0012`%÷Å½k§\u001b\u001d\u000e=\u0082'Ô3ÿ§5L\u0010\b\u001b\u0019\t\u009c\u0081¯\u001f\u0013\u0002÷®û\u0007¼C ¬\u0095[!Ì\u000eiMC¾ûÓå_\rNòÿK¼F\u0086\b\u008b£_\u008cö\u009a#Çõ\u0010F\u0019\rÀÆ$@Ñt¿\u0099\\®yV7 ¦ì\u008dp \u00adyç+ß\\½\u001eInÈ(_=v\u0000²-{v-Øªc<\u008a2\u0010ÊÄÏ\u009ceúKôÌAAÙ¼ûþ1";
      int var17 = "\u008d±ÎY\u0081\u0083ð0\u0004Æ\u009d_¬\n\u000fG\u0010-ÆI_}ÈÌo15.3G\u0087ÿà\u0010å5 g][âZõô\u0014½\u0018àÛS\u0010¾Ó\u0000å\u0011/\u009e\u0092â\u0085c\u0084Øþ·\u0001 TiÅÖ±Fä¥%\fÂä\u0012`%÷Å½k§\u001b\u001d\u000e=\u0082'Ô3ÿ§5L\u0010\b\u001b\u0019\t\u009c\u0081¯\u001f\u0013\u0002÷®û\u0007¼C ¬\u0095[!Ì\u000eiMC¾ûÓå_\rNòÿK¼F\u0086\b\u008b£_\u008cö\u009a#Çõ\u0010F\u0019\rÀÆ$@Ñt¿\u0099\\®yV7 ¦ì\u008dp \u00adyç+ß\\½\u001eInÈ(_=v\u0000²-{v-Øªc<\u008a2\u0010ÊÄÏ\u009ceúKôÌAAÙ¼ûþ1".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[12];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "¦\u0086\u0088`¨ötfª¦¶¯xZ\u0013\u001bÉòò³À\u0094ÉiÛ \u009dårÎM\u001cy¬.YÛh\u0087\u009c#¿Î¿\u001e\u009fÁ³²¶IàÏl\";ÆØÙ§`òûÝÛwèÑ\u009f9,Ñ\u009a]<ðw\u001b\u008cÞíFv²7%p¤\u00930wÖ&½0K";
                  int var5 = "¦\u0086\u0088`¨ötfª¦¶¯xZ\u0013\u001bÉòò³À\u0094ÉiÛ \u009dårÎM\u001cy¬.YÛh\u0087\u009c#¿Î¿\u001e\u009fÁ³²¶IàÏl\";ÆØÙ§`òûÝÛwèÑ\u009f9,Ñ\u009a]<ðw\u001b\u008cÞíFv²7%p¤\u00930wÖ&½0K".length();
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
                              e = var6;
                              f = new Integer[14];
                              g = new qz();
                              PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(true.j<invokedynamic>(32042, 1051554575605625944L ^ var20), (GeneratedSerializer)g, true.d<invokedynamic>(29176, 1083095638159304438L ^ var20));
                              var22.addElement(true.j<invokedynamic>(17529, 98319690357263626L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(6632, 2077840291356872857L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(3005, 1094125086769152704L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(22470, 815473549949034170L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(21372, 6083984253746534922L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(2952, 7580109485807633142L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(29411, 4798586726789905299L ^ var20), false);
                              var22.addElement(true.j<invokedynamic>(32016, 2668656222130599015L ^ var20), false);
                              w = (SerialDescriptor)var22;
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ýèÜLA\u001dT9 yT¶:Pú\u0098";
                           var5 = "ýèÜLA\u001dT9 yT¶:Pú\u0098".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0085-\n\u0006f\u0018?lkN-\u007fª\u0004aö\u0010ðÖ\u0094+ï5\u0018©\u000b\"\u0088\u00963èÿä";
               var17 = "\u0085-\n\u0006f\u0018?lkN-\u007fª\u0004aö\u0010ðÖ\u0094+ï5\u0018©\u000b\"\u0088\u00963èÿä".length();
               var14 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27456;
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
            throw new RuntimeException("su/catlean/qz", var10);
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
         throw new RuntimeException("su/catlean/qz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13618;
      if (f[var3] == null) {
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
            throw new RuntimeException("su/catlean/qz", var14);
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
         throw new RuntimeException("su/catlean/qz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
