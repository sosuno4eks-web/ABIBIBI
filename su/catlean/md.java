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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class md implements s6 {
   @NotNull
   public static final nh d;
   @NotNull
   private String C;
   @NotNull
   private n_ Z;
   private boolean M;
   @NotNull
   private String K;
   private static int[] f;
   private static final long a = j0.a(1992983907566893008L, 2300346997741445819L, MethodHandles.lookup().lookupClass()).a(112866094938982L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public md(@NotNull String id, @NotNull n_ bind, boolean enabled, @NotNull String message, long a) {
      var5 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(23493, 3598962256641586095L ^ var5));
      Intrinsics.checkNotNullParameter(var2, true.m<invokedynamic>(11394, 8660620348723004654L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.m<invokedynamic>(11325, 698514033088398426L ^ var5));
      super();
      this.C = var1;
      this.Z = var2;
      this.M = var3;
      this.K = var4;
   }

   @NotNull
   public String L() {
      return this.C;
   }

   public void T(@NotNull String <set-?>, long a) {
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(6602, 5515876075769757200L ^ var2));
      this.C = var1;
   }

   @NotNull
   public n_ f() {
      return this.Z;
   }

   public void d(long a, @NotNull n_ <set-?>) {
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(1044, 5964404437755422438L ^ var1));
      this.Z = var3;
   }

   public boolean X() {
      return this.M;
   }

   public void l(boolean <set-?>) {
      this.M = var1;
   }

   @NotNull
   public final String k() {
      return this.K;
   }

   public final void W(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(1044, 5964316176912957650L ^ var1));
      this.K = var3;
   }

   @NotNull
   public final String H() {
      return this.C;
   }

   @NotNull
   public final n_ e() {
      return this.Z;
   }

   public final boolean r() {
      return this.M;
   }

   @NotNull
   public final String s() {
      return this.K;
   }

   @NotNull
   public final md B(@NotNull String id, int a, @NotNull n_ bind, char a, boolean enabled, char a, @NotNull String message) {
      long var8 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var10 = var8 ^ 70957794901244L;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(10512, 941968447271356721L ^ var8));
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(4742, 379725525761061544L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.m<invokedynamic>(21293, 1501012410904916744L ^ var8));
      return new md(var1, var3, var5, var7, var10);
   }

   public static md J(int param0, md param1, short param2, short param3, String param4, n_ param5, boolean param6, String param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 8676040654700L;
      String var3 = this.K;
      boolean var4 = this.M;
      n_ var5 = this.Z;
      String var6 = this.C;
      String var10000 = 25551.m<invokedynamic>(25551, 1065556135713661022L ^ var1);
      return var10000 + var6 + true.m<invokedynamic>(31279, 4443827175932787131L ^ var1) + var5 + true.m<invokedynamic>(25566, 1643801091058589764L ^ var1) + var4 + true.m<invokedynamic>(32148, 432969269077900813L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 74413712423769L;
      int var3 = this.C.hashCode();
      var3 = var3 * true.g<invokedynamic>(16645, 4336352164094371645L ^ var1) + this.Z.hashCode();
      var3 = var3 * true.g<invokedynamic>(610, 622276011394933848L ^ var1) + Boolean.hashCode(this.M);
      var3 = var3 * true.g<invokedynamic>(610, 622276011394933848L ^ var1) + this.K.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void F(md self, CompositeEncoder output, SerialDescriptor serialDesc) {
      var1.encodeStringElement(var2, 0, var0.L());
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)x_.v, var0.f());
      var1.encodeBooleanElement(var2, 2, var0.X());
      var1.encodeStringElement(var2, 3, var0.K);
   }

   public md(char a, int seen0, String id, n_ bind, boolean enabled, int a, String message, SerializationConstructorMarker serializationConstructorMarker, int a) {
      long var10 = ((long)var1 << 48 | (long)var6 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ a;
      if (true.g<invokedynamic>(22199, 8991932649735169409L ^ var10) != (true.g<invokedynamic>(19694, 2493944068808228829L ^ var10) & var2)) {
         PluginExceptionsKt.throwMissingFieldException(var2, true.g<invokedynamic>(19694, 2493944068808228829L ^ var10), m1.O.getDescriptor());
      }

      super();
      this.C = var3;
      this.Z = var4;
      this.M = var5;
      this.K = var7;
   }

   static {
      long var20 = a ^ 119078433172921L;
      int[] var10000 = new int[1];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 6375955612650660768L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "(\u008eÝe¥ÏÐzL¯\u0001i\u007fô\u0013y\u0010³h*\u0011Z{d\u008fHÝí\u00056\rºí\u0010\u0087C\\:=ð>\u0088¾\u0016~t²Yå5 J\u0014ÝvßôìW{ÿC\u0001.~Ðá3¨\u0003%döl'\u00002±Pß÷\u0013Ú\u0010;*+\u009a\u008d^Hr{B\u001e\u0098Ì`*\u0089\u0010½\u0091S}E¶\u0016\u000fÐ\u0017ß\u0017dÖ\n+\u0010¬\u0005²\u0097N=cõå×»Øo\u009ff\u000f\u0010ÂLèC¢U\u0018\u007få\u0082ì\u009aàò@ý ×\u007f\u0099ø\u001d6\u00889B\u0083\tõ t\u0000ï§p½\"%\\\u001dvÚô%\u0098\u0080thò\u0010@¾\u007f\u008e²ÞQÄ£\u0003\u0095DÄbI[";
      int var17 = "(\u008eÝe¥ÏÐzL¯\u0001i\u007fô\u0013y\u0010³h*\u0011Z{d\u008fHÝí\u00056\rºí\u0010\u0087C\\:=ð>\u0088¾\u0016~t²Yå5 J\u0014ÝvßôìW{ÿC\u0001.~Ðá3¨\u0003%döl'\u00002±Pß÷\u0013Ú\u0010;*+\u009a\u008d^Hr{B\u001e\u0098Ì`*\u0089\u0010½\u0091S}E¶\u0016\u000fÐ\u0017ß\u0017dÖ\n+\u0010¬\u0005²\u0097N=cõå×»Øo\u009ff\u000f\u0010ÂLèC¢U\u0018\u007få\u0082ì\u009aàò@ý ×\u007f\u0099ø\u001d6\u00889B\u0083\tõ t\u0000ï§p½\"%\\\u001dvÚô%\u0098\u0080thò\u0010@¾\u007f\u008e²ÞQÄ£\u0003\u0095DÄbI[".length();
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
                  i = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "{ñ\u0094ëô:^{²bñÈ\u0096\u00057¦ê)Íj\u008b\u0004\u009b@";
                  int var5 = "{ñ\u0094ëô:^{²bñÈ\u0096\u00057¦ê)Íj\u008b\u0004\u009b@".length();
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
                              h = new Integer[5];
                              d = new nh((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "çÃ\u0014ü)ÎÙÁµ%=³FG¬×";
                           var5 = "çÃ\u0014ü)ÎÙÁµ%=³FG¬×".length();
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

               var15 = "\u0018ATÔàlå\u008e\u0017Ã\u008b§\u0084,4\u0090 \u009d IV\u0012U0]-\u009bÎp\u001f&=8KñÃT\u00ad»\u0016\u0097Siú¯\u001fñ\u0010B";
               var17 = "\u0018ATÔàlå\u008e\u0017Ã\u008b§\u0084,4\u0090 \u009d IV\u0012U0]-\u009bÎp\u001f&=8KñÃT\u00ad»\u0016\u0097Siú¯\u001fñ\u0010B".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void H(int[] var0) {
      f = var0;
   }

   public static int[] l() {
      return f;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18504;
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
            throw new RuntimeException("su/catlean/md", var10);
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
         throw new RuntimeException("su/catlean/md" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27093;
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
            throw new RuntimeException("su/catlean/md", var14);
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
         throw new RuntimeException("su/catlean/md" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
