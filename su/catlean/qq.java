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
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.mixins.accessors.LocalPlayerAccessor;

public final class qq {
   @NotNull
   public static final c7 g;
   private float d;
   private float Z;
   private boolean Y;
   @NotNull
   private bc D;
   private static String v;
   private static final long a = j0.a(8905562146105362571L, 1472435072200520148L, MethodHandles.lookup().lookupClass()).a(249210107873317L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   public qq(float yaw, float pitch, boolean grim, long a, @NotNull bc moveFix) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var6, true.i<invokedynamic>(9672, 7568046027367453236L ^ var4));
      super();
      this.d = var1;
      this.Z = var2;
      this.Y = var3;
      this.D = var6;
   }

   public qq(float var1, float var2, long var3, boolean var5, bc var6, int var7, DefaultConstructorMarker var8) {
      var3 ^= a;
      long var9 = var3 ^ 51323421126198L;
      if ((var7 & 4) != 0) {
         var5 = false;
      }

      if ((var7 & true.j<invokedynamic>(27498, 1356151185307602667L ^ var3)) != 0) {
         var6 = bc.NONE;
      }

      this(var1, var2, var5, var9, var6);
   }

   public final float M() {
      return this.d;
   }

   public final void f(float <set-?>) {
      this.d = var1;
   }

   public final float C() {
      return this.Z;
   }

   public final void D(float <set-?>) {
      this.Z = var1;
   }

   public final boolean l() {
      return this.Y;
   }

   public final void e(boolean <set-?>) {
      this.Y = var1;
   }

   @NotNull
   public final bc o() {
      return this.D;
   }

   public final void W(long a, @NotNull bc <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(31774, 6881692794186330822L ^ var1));
      this.D = var3;
   }

   @NotNull
   public final qq I(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 50612023354455L;
      long var10001 = var1 ^ 13857935398020L;
      int var5 = (int)((var1 ^ 13857935398020L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      double var8 = Math.pow(((Number)s8.H((short)var5, (short)var6, var7).field_1690.method_42495().method_41753()).doubleValue() * 0.6D + 0.2D, (double)3) * 8.0D * (double)0.15F;
      float var10000 = this.d;
      class_746 var16 = s8.f(var3);
      Intrinsics.checkNotNull(var16, true.i<invokedynamic>(31586, 551373009819271177L ^ var1));
      float var10 = class_3532.method_15393(var10000 - ((LocalPlayerAccessor)var16).getLastYaw());
      var10000 = this.Z;
      var16 = s8.f(var3);
      Intrinsics.checkNotNull(var16, true.i<invokedynamic>(20414, 8600570591850312919L ^ var1));
      float var11 = class_3532.method_15393(var10000 - ((LocalPlayerAccessor)var16).getLastPitch());
      double var12 = (double)MathKt.roundToInt((double)var10 / var8) * var8;
      double var14 = (double)MathKt.roundToInt((double)var11 / var8) * var8;
      var16 = s8.f(var3);
      Intrinsics.checkNotNull(var16, true.i<invokedynamic>(20414, 8600570591850312919L ^ var1));
      this.d = ((LocalPlayerAccessor)var16).getLastYaw() + (float)var12;
      var16 = s8.f(var3);
      Intrinsics.checkNotNull(var16, true.i<invokedynamic>(20414, 8600570591850312919L ^ var1));
      this.Z = RangesKt.coerceIn(((LocalPlayerAccessor)var16).getLastPitch() + (float)var14, -90.0F, 90.0F);
      return this;
   }

   @NotNull
   public final qq e(@NotNull bc v) {
      Intrinsics.checkNotNullParameter(var1, "v");
      this.D = var1;
      return this;
   }

   @NotNull
   public final qq g(boolean v) {
      this.Y = var1;
      return this;
   }

   public final float v() {
      return this.d;
   }

   public final float z() {
      return this.Z;
   }

   public final boolean O() {
      return this.Y;
   }

   @NotNull
   public final bc H() {
      return this.D;
   }

   @NotNull
   public final qq A(float yaw, float pitch, long a, boolean grim, @NotNull bc moveFix) {
      var3 ^= a;
      long var7 = var3 ^ 97098795098296L;
      Intrinsics.checkNotNullParameter(var6, true.i<invokedynamic>(21127, 5815166961195454459L ^ var3));
      return new qq(var1, var2, var5, var7, var6);
   }

   public static qq e(qq param0, float param1, float param2, boolean param3, bc param4, long param5, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 19080087097849L;
      bc var3 = this.D;
      boolean var4 = this.Y;
      float var5 = this.Z;
      float var6 = this.d;
      String var10000 = 2270.i<invokedynamic>(2270, 3398551674321014317L ^ var1);
      return var10000 + var6 + true.i<invokedynamic>(7906, 2246592842091698195L ^ var1) + var5 + true.i<invokedynamic>(21036, 3537977204527781072L ^ var1) + var4 + true.i<invokedynamic>(20663, 2562191313697396289L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 31397309725811L;
      int var3 = Float.hashCode(this.d);
      var3 = var3 * true.j<invokedynamic>(31462, 3904289590523193326L ^ var1) + Float.hashCode(this.Z);
      var3 = var3 * true.j<invokedynamic>(6631, 8509217702656345324L ^ var1) + Boolean.hashCode(this.Y);
      var3 = var3 * true.j<invokedynamic>(6631, 8509217702656345324L ^ var1) + this.D.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 106890143910866L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, -9185296721040503039L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "\u009d-²L½+×dÉ\u001d\fc\u008e«M\u009c\u0090\u0082\u008dÊãd\\²k\u0094\u000bJÏ\u0081Mw\u0018\u0096Û×æ\u0096«\u0007\u008c\u009e¦+2\u000fô(\u0004Ç[á\u000e¦C¬mhÏ\u007f\u0017\u001e¨`\u0019\u0004GÙÙéó\u009cß8ÊAh5²JóÙ9=<[ë\u008aS¼¢s7¼2þÈ7X¿Ë\u0082$\u0090:\u0097ÍÄe±_\u0017r\u009bàXðÒK¸*´^jh\u001b8Ù;Ï\u0083ã£ã4?Ò×ä¹îDê  l\u0002Þ7oëüQ~l\u0088Iâ1+r\u0018Ä\u0002ÖÛ\u0090©v±\u0012yãZÆ\u000e,þPi\u0087ð\u001fLy#\u0088>-\u001ah¾â9\u001fwR®\u0085¿§]2¶Ê-£ý\u000b\tËé\u001b\u0084åD¡ø\u0098A÷ÿMI¯ê=T\u009bTu:Ò5NïSÛ\u001d\u0004íá\u0015DkXyfrÈÓÄ\u009b¼æHU\u0085~\u0018Ñz\u0081¶\u00012ÉA\u0099<þ´g]¼\u0080\"¹ª)\u0004\u0083¯PáãÈ\u009b£§è\u001aün\u0007\u001bç\u0003\u0006\u009e\\í\t=xË\u0082ßº4Õ.Ï\u009e±ÃÈäÖ\u008bV\u0007\u008b\u0010rÒËre\u0089tr\u0018R\u0098ý\u00ad\f\u008b` \u0080´2mñõÞ \u0082¹:Á:B@ýØ\u0005\u0018\u0088nÙ¥Wu\u0081× ú\u00067¥\u0010iy¢ùC+\u0096ßÒ\u0011Ô95\u0084XC";
      int var17 = "\u009d-²L½+×dÉ\u001d\fc\u008e«M\u009c\u0090\u0082\u008dÊãd\\²k\u0094\u000bJÏ\u0081Mw\u0018\u0096Û×æ\u0096«\u0007\u008c\u009e¦+2\u000fô(\u0004Ç[á\u000e¦C¬mhÏ\u007f\u0017\u001e¨`\u0019\u0004GÙÙéó\u009cß8ÊAh5²JóÙ9=<[ë\u008aS¼¢s7¼2þÈ7X¿Ë\u0082$\u0090:\u0097ÍÄe±_\u0017r\u009bàXðÒK¸*´^jh\u001b8Ù;Ï\u0083ã£ã4?Ò×ä¹îDê  l\u0002Þ7oëüQ~l\u0088Iâ1+r\u0018Ä\u0002ÖÛ\u0090©v±\u0012yãZÆ\u000e,þPi\u0087ð\u001fLy#\u0088>-\u001ah¾â9\u001fwR®\u0085¿§]2¶Ê-£ý\u000b\tËé\u001b\u0084åD¡ø\u0098A÷ÿMI¯ê=T\u009bTu:Ò5NïSÛ\u001d\u0004íá\u0015DkXyfrÈÓÄ\u009b¼æHU\u0085~\u0018Ñz\u0081¶\u00012ÉA\u0099<þ´g]¼\u0080\"¹ª)\u0004\u0083¯PáãÈ\u009b£§è\u001aün\u0007\u001bç\u0003\u0006\u009e\\í\t=xË\u0082ßº4Õ.Ï\u009e±ÃÈäÖ\u008bV\u0007\u008b\u0010rÒËre\u0089tr\u0018R\u0098ý\u00ad\f\u008b` \u0080´2mñõÞ \u0082¹:Á:B@ýØ\u0005\u0018\u0088nÙ¥Wu\u0081× ú\u00067¥\u0010iy¢ùC+\u0096ßÒ\u0011Ô95\u0084XC".length();
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
                  b = var18;
                  c = new String[9];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "[\u001aÉÈ°\u0085±LÜ?·¡h¿¹`";
                  int var5 = "[\u001aÉÈ°\u0085±LÜ?·¡h¿¹`".length();
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
                              f = var6;
                              h = new Integer[4];
                              g = new c7((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ÐÙa,ÅÜ=pÊOP½1â¤\u0082";
                           var5 = "ÐÙa,ÅÜ=pÊOP½1â¤\u0082".length();
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

               var15 = "Á½Í×\u0011Ã_\u000e[þÖM<\u009f{\u0004\u0000hÅrs Ô\u0094\u008e\u0000e/à\u001e\u0000¤\u0010Iøxô³\u008e\"Bö¾ð\u001e±Zé\u000b";
               var17 = "Á½Í×\u0011Ã_\u000e[þÖM<\u009f{\u0004\u0000hÅrs Ô\u0094\u008e\u0000e/à\u001e\u0000¤\u0010Iøxô³\u008e\"Bö¾ð\u001e±Zé\u000b".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void G(String var0) {
      v = var0;
   }

   public static String f() {
      return v;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7479;
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
            throw new RuntimeException("su/catlean/qq", var10);
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
         throw new RuntimeException("su/catlean/qq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27458;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/qq", var14);
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
         throw new RuntimeException("su/catlean/qq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
