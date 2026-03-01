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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class s4 {
   @NotNull
   private String n;
   private float p;
   private float J;
   private float o;
   private float k;
   private float S;
   private float f;
   @Nullable
   private xp Z;
   private float V;
   private float l;
   private boolean r;
   private boolean C;
   private boolean A;
   private boolean e;
   private static int[] I;
   private static final long c = j0.a(6850780366978857403L, 3868127457109187572L, MethodHandles.lookup().lookupClass()).a(78541394485021L);
   private static final String[] y;
   private static final String[] L;
   private static final Map Q;
   private static final long[] ab;
   private static final Integer[] bb;
   private static final Map cb;

   public s4(@NotNull String name, float x, int a, float y, float width, char a, float height, short a) {
      long var9 = ((long)var3 << 32 | (long)var6 << 48 >>> 32 | (long)var8 << 48 >>> 48) ^ c;
      Intrinsics.checkNotNullParameter(var1, true.m<invokedynamic>(6946, 7482835556884423460L ^ var9));
      super();
      this.n = var1;
      this.p = var2;
      this.J = var4;
      this.o = var5;
      this.k = var7;
      this.S = this.o;
      this.f = this.k;
   }

   public s4(String var1, short var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, DefaultConstructorMarker var10) {
      long var11 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ c;
      long var10001 = var11 ^ 67113788303905L;
      int var13 = (int)((var11 ^ 67113788303905L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      if ((var9 & 2) != 0) {
         var5 = 50.0F;
      }

      if ((var9 & 4) != 0) {
         var6 = 50.0F;
      }

      if ((var9 & true.t<invokedynamic>(23345, 8419178150641665336L ^ var11)) != 0) {
         var7 = 230.0F;
      }

      if ((var9 & true.t<invokedynamic>(28738, 6001808483493064271L ^ var11)) != 0) {
         var8 = 180.0F;
      }

      this(var1, var5, var13, var6, var7, (char)var14, var8, (short)var15);
   }

   @NotNull
   public final String L() {
      return this.n;
   }

   public final void k(long a, @NotNull String <set-?>) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(12542, 7187344316002089732L ^ var1));
      this.n = var3;
   }

   public final float h() {
      return this.p;
   }

   public final void u(float <set-?>) {
      this.p = var1;
   }

   public final float R() {
      return this.J;
   }

   public final void P(float <set-?>) {
      this.J = var1;
   }

   public final float K() {
      return this.o;
   }

   public final void H(float <set-?>) {
      this.o = var1;
   }

   public final float t() {
      return this.k;
   }

   public final void z(float <set-?>) {
      this.k = var1;
   }

   @Nullable
   public final xp D() {
      return this.Z;
   }

   public final void K(@Nullable xp <set-?>) {
      this.Z = var1;
   }

   public final void J() {
      this.e = true;
   }

   public abstract void y(long var1);

   public void X(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void T(float mX, float mY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   public void u(long a, char key) {
      // $FF: Couldn't be decompiled
   }

   public void Z(int keyCode, int scanCode, int modifiers, long a) {
      // $FF: Couldn't be decompiled
   }

   public void D(double mouseX, long a, double mouseY, double amount) {
   }

   public final void v() {
      this.r = false;
      this.C = false;
      this.A = false;
      _u.w.C((s4)null);
   }

   public static void k(int[] var0) {
      I = var0;
   }

   public static int[] l() {
      return I;
   }

   static {
      long var20 = c ^ 117440521572372L;
      Q = new HashMap(13);
      null.A<invokedynamic>((Object)null, 61228197905917006L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "ûªpMb4Ïê\u00127\u0014D^ZÇt\u0010²\"ñ×ð&\u0096@°?¼Ü\t÷Þ\u0081\u0010\u0090ðÝI,Fæ&x¿Sg¾c\\L";
      int var17 = "ûªpMb4Ïê\u00127\u0014D^ZÇt\u0010²\"ñ×ð&\u0096@°?¼Ü\t÷Þ\u0081\u0010\u0090ðÝI,Fæ&x¿Sg¾c\\L".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  y = var18;
                  L = new String[5];
                  cb = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[10];
                  int var3 = 0;
                  String var4 = "Æ¼?\u0010< ]Ð\u008dó\u000e»©G»Éðÿ\u0019F\n\u001fðvu¤´èU`\u0012\u0018Uäõ\u0002´\u0013Ô\u0089ÉCh\u0002ßÐæ\u0095\u001d\u009e\u008eSi\u0096Ütô\u0099\u001b\u001au\u0099·\u0012";
                  int var5 = "Æ¼?\u0010< ]Ð\u008dó\u000e»©G»Éðÿ\u0019F\n\u001fðvu¤´èU`\u0012\u0018Uäõ\u0002´\u0013Ô\u0089ÉCh\u0002ßÐæ\u0095\u001d\u009e\u008eSi\u0096Ütô\u0099\u001b\u001au\u0099·\u0012".length();
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
                              ab = var6;
                              bb = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u009fH¢\u0080x\u0088Ã´ægi?Ø?V\u001c";
                           var5 = "\u009fH¢\u0080x\u0088Ã´ægi?Ø?V\u001c".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "K+\u001d,\u008e\u000e\u0016\u0087¦%{G\u009c\u008f¦¨a¾\u0098\u0081hFz[Ïë~º\bURý\u0018i\u008f'xm\u0080\u009f§Ñ\ne|\u0091\u0017´¼\u009b+ð\u009fÿ¸\u0099\u0018";
               var17 = "K+\u001d,\u008e\u000e\u0016\u0087¦%{G\u009c\u008f¦¨a¾\u0098\u0081hFz[Ïë~º\bURý\u0018i\u008f'xm\u0080\u009f§Ñ\ne|\u0091\u0017´¼\u009b+ð\u009fÿ¸\u0099\u0018".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29945;
      if (L[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])Q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               Q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/s4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = y[var5].getBytes("ISO-8859-1");
         L[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return L[var5];
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
         throw new RuntimeException("su/catlean/s4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26893;
      if (bb[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = ab[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])cb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               cb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/s4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         bb[var3] = var15;
      }

      return bb[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/s4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
