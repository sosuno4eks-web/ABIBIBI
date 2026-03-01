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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class h2 {
   @NotNull
   public static final m j;
   @Nullable
   private final fq a;
   @Nullable
   private final hd K;
   @NotNull
   private final g2 f;
   @JvmField
   @NotNull
   private static final Lazy[] p;
   private static final long b = j0.a(2363175191219816377L, 3955222393549446071L, MethodHandles.lookup().lookupClass()).a(64816291952165L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public h2(@Nullable fq evt, @Nullable hd cmd, char a, char a, int a, @NotNull g2 data) {
      long var7 = ((long)var3 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ b;
      Intrinsics.checkNotNullParameter(var6, true.u<invokedynamic>(14958, 457081284692734211L ^ var7));
      super();
      this.a = var1;
      this.K = var2;
      this.f = var6;
   }

   @Nullable
   public final fq c() {
      return this.a;
   }

   @Nullable
   public final hd D() {
      return this.K;
   }

   @NotNull
   public final g2 k() {
      return this.f;
   }

   @Nullable
   public final fq o() {
      return this.a;
   }

   @Nullable
   public final hd R() {
      return this.K;
   }

   @NotNull
   public final g2 m() {
      return this.f;
   }

   @NotNull
   public final h2 A(@Nullable fq evt, @Nullable hd cmd, @NotNull g2 data, long a) {
      var4 ^= b;
      long var10001 = var4 ^ 105910378157774L;
      int var6 = (int)((var4 ^ 105910378157774L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var3, true.u<invokedynamic>(10359, 7762899218414425089L ^ var4));
      return new h2(var1, var2, (char)var6, (char)var7, var8, var3);
   }

   public static h2 x(h2 var0, fq var1, char var2, hd var3, g2 var4, int var5, Object var6, long var7) {
      long var9 = ((long)var2 << 48 | var7 << 16 >>> 16) ^ b;
      long var11 = var9 ^ 132191975254488L;
      int[] var13 = -4997999750172798536L.A<invokedynamic>(-4997999750172798536L, var9);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var5 & 1;
               if (var13 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, -4978484269147977248L, var9);
            }

            var1 = var0.a;
         }

         var10000 = var5 & 2;
      }

      label32: {
         label31: {
            try {
               if (var13 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var14) {
               throw var14.A<invokedynamic>(var14, -4978484269147977248L, var9);
            }

            var3 = var0.K;
         }

         var10000 = var5 & 4;
      }

      if (var10000 != 0) {
         var4 = var0.f;
      }

      return var0.A(var1, var3, var4, var11);
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 113011377273299L;
      g2 var3 = this.f;
      hd var4 = this.K;
      fq var5 = this.a;
      String var10000 = 11605.u<invokedynamic>(11605, 4993099540175567545L ^ var1);
      return var10000 + var5 + true.u<invokedynamic>(14000, 5330146460835193182L ^ var1) + var4 + true.u<invokedynamic>(24252, 2388759997903522129L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void j(h2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
      Lazy[] var3 = p;
      var1.encodeNullableSerializableElement(var2, 0, (SerializationStrategy)var3[0].getValue(), var0.a);
      var1.encodeNullableSerializableElement(var2, 1, (SerializationStrategy)var3[1].getValue(), var0.K);
      var1.encodeSerializableElement(var2, 2, (SerializationStrategy)mc.T, var0.f);
   }

   public h2(int seen0, fq evt, hd cmd, g2 data, long a, SerializationConstructorMarker serializationConstructorMarker) {
      var5 ^= b;
      if (true.v<invokedynamic>(3233, 1238934318672618304L ^ var5) != (true.v<invokedynamic>(15549, 9179269248838439774L ^ var5) & var1)) {
         PluginExceptionsKt.throwMissingFieldException(var1, true.v<invokedynamic>(15549, 9179269248838439774L ^ var5), d5.o.getDescriptor());
      }

      super();
      this.a = var2;
      this.K = var3;
      this.f = var4;
   }

   private static final KSerializer H() {
      return fq.Companion.i();
   }

   private static final KSerializer L() {
      return hd.Companion.j();
   }

   public static final Lazy[] t() {
      return p;
   }

   static {
      long var11 = b ^ 122832367169889L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "ñ/Z\u0005§~ÎU\u0006¢c}Kl\u0090\u0087(\b]¯\u0099ã\u001b5y·öãÅ5\u001béÉÔâ\u008c2\u0017\u0095\u0001/×ÿê°e\u008f*ö}\u0082}ÅÄ\u0084õ¼\u0010ªAì5J\u000f\u008aúM6}\u001bÞ\\uR";
      int var19 = "ñ/Z\u0005§~ÎU\u0006¢c}Kl\u0090\u0087(\b]¯\u0099ã\u001b5y·öãÅ5\u001béÉÔâ\u008c2\u0017\u0095\u0001/×ÿê°e\u008f*ö}\u0082}ÅÄ\u0084õ¼\u0010ªAì5J\u000f\u008aúM6}\u001bÞ\\uR".length();
      char var16 = 16;
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
                  c = var20;
                  d = new String[5];
                  i = new HashMap(13);
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
                  String var4 = "z\u008a´3èÊU×\u0014\f³Çû5PK";
                  int var5 = "z\u008a´3èÊU×\u0014\f³Çû5PK".length();
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
                              h = new Integer[4];
                              j = new m((DefaultConstructorMarker)null);
                              Lazy[] var22 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, h2::H), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, h2::L), null};
                              p = var22;
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Nåú§gúØÂ\u008f\bøÔù\u0019¬1";
                           var5 = "Nåú§gúØÂ\u008f\bøÔù\u0019¬1".length();
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

               var17 = "\u0083vdl8Ô+ÞqÝ\u001fk{\u001e¬ÿ\u0010\u008a&\u0089|æ\u001fjE¥\u008aK\u008c\u009a¬@q";
               var19 = "\u0083vdl8Ô+ÞqÝ\u001fk{\u001e¬ÿ\u0010\u008a&\u0089|æ\u001fjE¥\u008aK\u008c\u009a¬@q".length();
               var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4077;
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
            throw new RuntimeException("su/catlean/h2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/h2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14780;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/h2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/h2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
