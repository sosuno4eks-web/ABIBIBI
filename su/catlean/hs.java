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
import kotlin.collections.CollectionsKt;
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
public final class hs {
   @NotNull
   public static final rk C;
   @NotNull
   private final String r;
   @NotNull
   private List F;
   @JvmField
   @NotNull
   private static final Lazy[] v;
   private static boolean i;
   private static final long a = j0.a(3081027487713414416L, 359818318743047261L, MethodHandles.lookup().lookupClass()).a(240537371019150L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   public hs(long a, @NotNull String id, @NotNull List modules) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(20873, 7678269159468161344L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(21708, 3950849298568043523L ^ var1));
      super();
      this.r = var3;
      this.F = var4;
   }

   public hs(String var1, List var2, int var3, DefaultConstructorMarker var4, long var5) {
      var5 ^= a;
      long var7 = var5 ^ 75377053497674L;
      if ((var3 & 2) != 0) {
         var2 = CollectionsKt.emptyList();
      }

      this(var7, var1, var2);
   }

   @NotNull
   public final String b() {
      return this.r;
   }

   @NotNull
   public final List M() {
      return this.F;
   }

   public final void z(long a, @NotNull List <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(16481, 4078769886510828070L ^ var1));
      this.F = var3;
   }

   @NotNull
   public final String T() {
      return this.r;
   }

   @NotNull
   public final List L() {
      return this.F;
   }

   @NotNull
   public final hs p(@NotNull String id, @NotNull List modules, long a) {
      var3 ^= a;
      long var5 = var3 ^ 47607714974133L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(5283, 107176317601196904L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(1120, 8119479225413155759L ^ var3));
      return new hs(var5, var1, var2);
   }

   public static hs P(hs var0, long var1, String var3, List var4, int var5, Object var6) {
      var1 ^= a;
      long var7 = var1 ^ 33445026775630L;
      int var9 = 5608843598638944732L.A<invokedynamic>(5608843598638944732L, var1);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var9 != 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 5587011870449746677L, var1);
            }

            var3 = var0.r;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.F;
      }

      return var0.p(var3, var4, var7);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 42610978602968L;
      String var10000 = this.r;
      List var10001 = this.F;
      String var10003 = true.v<invokedynamic>(12485, 1016248056149130881L ^ var1);
      return var10003 + var10000 + true.v<invokedynamic>(24418, 2232111842618921255L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 125353992129448L;
      int var3 = this.r.hashCode();
      var3 = var3 * (int)e + this.F.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void A(hs self, CompositeEncoder output, SerialDescriptor serialDesc, long a) {
      // $FF: Couldn't be decompiled
   }

   public hs(int seen0, String id, long a, List modules, SerializationConstructorMarker serializationConstructorMarker) {
      // $FF: Couldn't be decompiled
   }

   private static final KSerializer c() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)h1.H));
   }

   public static final Lazy[] s() {
      return v;
   }

   static {
      long var14 = a ^ 113601837974067L;
      d = new HashMap(13);
      true.A<invokedynamic>(true, 9049407818851484225L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[7];
      int var10 = 0;
      String var9 = "MÆ\u009d\u000bï\u0010òz?\u0019¶á\u0017l\u008a\u0085\u0010\u000b ß\rÞÏ¤\u008eÑ\u0010)\u0084 {ßê(½\u0091©\b\u0003Ø:\u000e¸\u0082A\u009aKÅ¶\u0002\u0003g\\û\u008f\u0091\ný¸\u009dÙä\u000eJõ¦0\u009e¥Ú\u000et\\\\ *»')\u0017ëîûN$¨Ã|\u000bÿH W\\å\u0090«ªsÀãØö½ªõÃ\u0010,tf´\u0083â$ã\u0086é\u0007\u0018\u000fî\u0003w";
      int var11 = "MÆ\u009d\u000bï\u0010òz?\u0019¶á\u0017l\u008a\u0085\u0010\u000b ß\rÞÏ¤\u008eÑ\u0010)\u0084 {ßê(½\u0091©\b\u0003Ø:\u000e¸\u0082A\u009aKÅ¶\u0002\u0003g\\û\u008f\u0091\ný¸\u009dÙä\u000eJõ¦0\u009e¥Ú\u000et\\\\ *»')\u0017ëîûN$¨Ã|\u000bÿH W\\å\u0090«ªsÀãØö½ªõÃ\u0010,tf´\u0083â$ã\u0086é\u0007\u0018\u000fî\u0003w".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var17 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var17.getBytes("ISO-8859-1"));
            String var22 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var22;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[7];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1178686892343381315L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var24 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var20 = true;
                  e = var24;
                  C = new rk((DefaultConstructorMarker)null);
                  Lazy[] var16 = new Lazy[]{null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, hs::c)};
                  v = var16;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var22;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "÷\u008bË\u001bÚt¦x&\u0090\u008bÃ>5\u0087à\u0010¨ÞÈÐ-Ù\u00adÞ\u0091à,5\u0005\u0019¬|";
               var11 = "÷\u008bË\u001bÚt¦x&\u0090\u008bÃ>5\u0087à\u0010¨ÞÈÐ-Ù\u00adÞ\u0091à,5\u0005\u0019¬|".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var17 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void d(boolean var0) {
      i = var0;
   }

   public static boolean U() {
      return i;
   }

   public static boolean Q() {
      boolean var0 = U();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3880;
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
            throw new RuntimeException("su/catlean/hs", var10);
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
         throw new RuntimeException("su/catlean/hs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
