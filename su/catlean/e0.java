package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class e0 {
   @NotNull
   public static final d_ C;
   @NotNull
   private final List l;
   @NotNull
   private final List D;
   @NotNull
   private final List O;
   @JvmField
   @NotNull
   private static final Lazy[] g;
   private static final long a = j0.a(8571725247470304539L, 9128134874645030475L, MethodHandles.lookup().lookupClass()).a(56247170896241L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map h;

   public e0(@NotNull List settingMacros, char a, int a, @NotNull List chatMacros, char a, @NotNull List itemMacros) {
      long var7 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.z<invokedynamic>(32224, 2635326178323576937L ^ var7));
      Intrinsics.checkNotNullParameter(var4, true.z<invokedynamic>(9048, 1961819943389521630L ^ var7));
      Intrinsics.checkNotNullParameter(var6, true.z<invokedynamic>(27118, 1483901096444111973L ^ var7));
      super();
      this.l = var1;
      this.D = var4;
      this.O = var6;
   }

   public e0(List var1, List var2, List var3, long var4, int var6, DefaultConstructorMarker var7) {
      var4 ^= a;
      long var10001 = var4 ^ 109018150602719L;
      int var8 = (int)((var4 ^ 109018150602719L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      if ((var6 & 1) != 0) {
         var1 = (List)(new ArrayList());
      }

      if ((var6 & 2) != 0) {
         var2 = (List)(new ArrayList());
      }

      if ((var6 & 4) != 0) {
         var3 = (List)(new ArrayList());
      }

      this(var1, (char)var8, var9, var2, (char)var10, var3);
   }

   @NotNull
   public final List D() {
      return this.l;
   }

   @NotNull
   public final List U() {
      return this.D;
   }

   @NotNull
   public final List G() {
      return this.O;
   }

   @NotNull
   public final List i() {
      return this.l;
   }

   @NotNull
   public final List Y() {
      return this.D;
   }

   @NotNull
   public final List m() {
      return this.O;
   }

   @NotNull
   public final e0 b(@NotNull List settingMacros, @NotNull List chatMacros, long a, @NotNull List itemMacros) {
      var3 ^= a;
      long var10001 = var3 ^ 76950379543790L;
      int var6 = (int)((var3 ^ 76950379543790L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.z<invokedynamic>(17809, 4259056482707987017L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.z<invokedynamic>(24183, 5148481543430226346L ^ var3));
      Intrinsics.checkNotNullParameter(var5, true.z<invokedynamic>(24746, 6980337088499253108L ^ var3));
      return new e0(var1, (char)var6, var7, var2, (char)var8, var5);
   }

   public static e0 e(e0 var0, List var1, long var2, List var4, List var5, int var6, Object var7) {
      var2 ^= a;
      long var8 = var2 ^ 132961722944494L;
      int var10 = -7980962850329151255L.A<invokedynamic>(-7980962850329151255L, var2);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var6 & 1;
               if (var10 == 0) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, -7930815336460046347L, var2);
            }

            var1 = var0.l;
         }

         var10000 = var6 & 2;
      }

      label32: {
         label31: {
            try {
               if (var10 == 0) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, -7930815336460046347L, var2);
            }

            var4 = var0.D;
         }

         var10000 = var6 & 4;
      }

      if (var10000 != 0) {
         var5 = var0.O;
      }

      return var0.b(var1, var4, var8, var5);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 107564302697878L;
      List var3 = this.O;
      List var4 = this.D;
      List var5 = this.l;
      String var10000 = 11419.z<invokedynamic>(11419, 6792858370646240613L ^ var1);
      return var10000 + var5 + true.z<invokedynamic>(14808, 2909673524100692000L ^ var1) + var4 + true.z<invokedynamic>(9585, 433736645429388426L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 109712701405873L;
      int var3 = this.l.hashCode();
      var3 = var3 * true.f<invokedynamic>(20062, 8341012560453667630L ^ var1) + this.D.hashCode();
      var3 = var3 * true.f<invokedynamic>(8214, 7059418847157380453L ^ var1) + this.O.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void t(e0 self, long a, CompositeEncoder output, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public e0(int seen0, List settingMacros, List chatMacros, List itemMacros, SerializationConstructorMarker serializationConstructorMarker, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final KSerializer B() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)qz.g));
   }

   private static final KSerializer l() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)m1.O));
   }

   private static final KSerializer v() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)cb.r));
   }

   public e0(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 116505235365916L;
      this((List)null, (List)null, (List)null, var3, true.f<invokedynamic>(17050, 1028142537896336250L ^ var1), (DefaultConstructorMarker)null);
   }

   public static final Lazy[] H() {
      return g;
   }

   static {
      long var11 = a ^ 95380754410545L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[9];
      int var18 = 0;
      String var17 = "Ú8?â¥,Z|Íý\u001e\u009e7Ö!p\u0084G=O¯uø\u008e\u0088rÌf\u001a\u001cæ:\u0018J\u0081e¨Ö>Ü\u0098c\u008dô²Ô\u0099#l6½ÃøI\u0012Á\u0093 KLóÅÈ~}\u0012\u0000{\u0001=l:\u001dÃ\u0091\bj\u0012¢«\u0014ÉöG\u000f?\u000fZ\t\u0094 \u0094øý\u009b'\u0017¸\u0005\\3\u0015^Ô\u009c}¨ :\u0011)=·Ë}+y·\u0011jñ\u0011ð \u0092tË9\u001d\u0007¶ÅÉóù]å\u008f\u0099¼\u0089÷»uÚúÜú\u0098O\u00017ÏR;æ \u0085ÓÝg\u008eFF\u0092\u0095wÜ·Æô\u0092\u0005ã\u008dø\u009aVø×,\u00adS\u008c\u0097L\u009bA\u001a0#\u0018z¯\u009cðy\u0019ãÉGJ\u0097\u0086(pk\r´Ú\u008aóiÃ\u0018ñ\tlýì¿£:\u00ad\u0004\u008bÀñUüVd\u0016Ó;Ú\u0099\u009b";
      int var19 = "Ú8?â¥,Z|Íý\u001e\u009e7Ö!p\u0084G=O¯uø\u008e\u0088rÌf\u001a\u001cæ:\u0018J\u0081e¨Ö>Ü\u0098c\u008dô²Ô\u0099#l6½ÃøI\u0012Á\u0093 KLóÅÈ~}\u0012\u0000{\u0001=l:\u001dÃ\u0091\bj\u0012¢«\u0014ÉöG\u000f?\u000fZ\t\u0094 \u0094øý\u009b'\u0017¸\u0005\\3\u0015^Ô\u009c}¨ :\u0011)=·Ë}+y·\u0011jñ\u0011ð \u0092tË9\u001d\u0007¶ÅÉóù]å\u008f\u0099¼\u0089÷»uÚúÜú\u0098O\u00017ÏR;æ \u0085ÓÝg\u008eFF\u0092\u0095wÜ·Æô\u0092\u0005ã\u008dø\u009aVø×,\u00adS\u008c\u0097L\u009bA\u001a0#\u0018z¯\u009cðy\u0019ãÉGJ\u0097\u0086(pk\r´Ú\u008aóiÃ\u0018ñ\tlýì¿£:\u00ad\u0004\u008bÀñUüVd\u0016Ó;Ú\u0099\u009b".length();
      char var16 = ' ';
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var23 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var23.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[9];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "ícq\u008e{ >¨&8/a¥då\u001cF\u009cö.HÛ\u0084r";
                  int var5 = "ícq\u008e{ >¨&8/a¥då\u001cF\u009cö.HÛ\u0084r".length();
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
                  f = new Integer[3];
                  C = new d_((DefaultConstructorMarker)null);
                  Lazy[] var22 = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, e0::B), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, e0::l), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, e0::v)};
                  g = var22;
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "{\u009d\u0004ë@_ËÙN#È\u0080/\u009c\u0002üÄ$\u0013\u008d\u009c¸\u0000\u008f²À¹Õaê±\u0004 LßóT{$R0\u009bV76FÇ+x\u0093\u0092'QÕ©\tëk7º\u0002\u0084È×§";
               var19 = "{\u009d\u0004ë@_ËÙN#È\u0080/\u009c\u0002üÄ$\u0013\u008d\u009c¸\u0000\u008f²À¹Õaê±\u0004 LßóT{$R0\u009bV76FÇ+x\u0093\u0092'QÕ©\tëk7º\u0002\u0084È×§".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8914;
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
            throw new RuntimeException("su/catlean/e0", var10);
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
         throw new RuntimeException("su/catlean/e0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6527;
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
            throw new RuntimeException("su/catlean/e0", var14);
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
         throw new RuntimeException("su/catlean/e0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
