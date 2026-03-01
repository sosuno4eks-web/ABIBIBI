package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class f9 {
   private float o;
   private float h;
   private float l;
   private float Y;
   @NotNull
   private String K;
   @NotNull
   private Function0 F;
   private final int c;
   @NotNull
   private final Color z;
   @NotNull
   private final Color D;
   private final float S;
   private final float i;
   @NotNull
   private final aa O;
   private static String p;
   private static final long a = j0.a(8991084296695999351L, 5867912193592138625L, MethodHandles.lookup().lookupClass()).a(613005284954L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map j;
   private static final long k;

   public f9(float x, long a, float y, float width, float height, @NotNull String label, @NotNull Function0 clickActionX, int id, @NotNull Color fill, @NotNull Color outline, float outlineWidth, float radius) {
      var2 ^= a;
      long var10001 = var2 ^ 16324916715898L;
      int var14 = (int)((var2 ^ 16324916715898L) >>> 48);
      int var15 = (int)(var10001 << 16 >>> 48);
      int var16 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var7, true.u<invokedynamic>(17533, 5128259297848429315L ^ var2));
      Intrinsics.checkNotNullParameter(var8, true.u<invokedynamic>(3900, 2085503352377229377L ^ var2));
      Intrinsics.checkNotNullParameter(var10, true.u<invokedynamic>(1990, 5853575301704763580L ^ var2));
      -8349990232661588566L.A<invokedynamic>(-8349990232661588566L, var2);
      Intrinsics.checkNotNullParameter(var11, true.u<invokedynamic>(9329, 6468844270365928192L ^ var2));
      super();
      this.o = var1;
      this.h = var4;
      this.l = var5;
      this.Y = var6;
      this.K = var7;
      this.F = var8;
      this.c = var9;
      this.z = var10;
      this.D = var11;
      this.S = var12;
      this.i = var13;
      this.O = new aa(sa.OUT_QUINT, k, (short)var14, (short)var15, var16);
      if (-8355400030650267295L.A<invokedynamic>(-8355400030650267295L, var2) == null) {
         "NMdtvc".A<invokedynamic>("NMdtvc", -8323134002488461763L, var2);
      }

   }

   // $FF: synthetic method
   public f9(float var1, float var2, float var3, long var4, float var6, String var7, Function0 var8, int var9, Color var10, Color var11, float var12, float var13, int var14, DefaultConstructorMarker var15) {
      var4 ^= a;
      long var16 = var4 ^ 60880651446836L;
      if ((var14 & true.v<invokedynamic>(23198, 3613847626050031378L ^ var4)) != 0) {
         var9 = 0;
      }

      if ((var14 & true.v<invokedynamic>(32567, 7661198118648081086L ^ var4)) != 0) {
         var10 = z8.I.F();
      }

      if ((var14 & true.v<invokedynamic>(27159, 9147023867593719706L ^ var4)) != 0) {
         Color var10000 = Color.WHITE;
         Intrinsics.checkNotNullExpressionValue(var10000, true.u<invokedynamic>(2295, 3222829277992159307L ^ var4));
         var11 = var10000;
      }

      if ((var14 & true.v<invokedynamic>(25137, 2745729844955051961L ^ var4)) != 0) {
         var12 = 2.0F;
      }

      if ((var14 & true.v<invokedynamic>(9765, 4498346380356531114L ^ var4)) != 0) {
         var13 = 3.0F;
      }

      this(var1, var16, var2, var3, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public final float a() {
      return this.o;
   }

   public final void H(float <set-?>) {
      this.o = var1;
   }

   public final float R() {
      return this.h;
   }

   public final void I(float <set-?>) {
      this.h = var1;
   }

   public final float z() {
      return this.l;
   }

   public final void B(float <set-?>) {
      this.l = var1;
   }

   public final float O() {
      return this.Y;
   }

   public final void P(float <set-?>) {
      this.Y = var1;
   }

   @NotNull
   public final Function0 E() {
      return this.F;
   }

   public final void j(long a, @NotNull Function0 <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.u<invokedynamic>(25146, 2491589838222221896L ^ var1));
      this.F = var3;
   }

   public final int D() {
      return this.c;
   }

   @NotNull
   public final Color G() {
      return this.z;
   }

   @NotNull
   public final Color k() {
      return this.D;
   }

   public final float q() {
      return this.i;
   }

   public final void l(float posX, int a, float posY, float mouseX, long a, float mouseY, @NotNull class_332 context) {
      // $FF: Couldn't be decompiled
   }

   public final void k(float mouseX, float mouseY, long a) {
      // $FF: Couldn't be decompiled
   }

   private final boolean f(long param1, float param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   public static void H(String var0) {
      p = var0;
   }

   public static String f() {
      return p;
   }

   static {
      long var25 = a ^ 96355001881729L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, 8130189911052044951L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[9];
      int var21 = 0;
      String var20 = "Ñn§AXÎ5\u00073ªÞê1{å-\u0010V]9þ±*\u009e\n\u0015C\u0015°ï)=Í #\u000bÊ9\u00adÔ\u001fÀIG\u0019ÈÏì\u0089\u0096¾\u0099\t\u0094\u001c@\u0096\u0088\u009e½ ÐÖQÅ§\u0010:ï\u0005\u0091\u000ejåKÝÌÏ1\u0081\\Ù,\u0018ß\u001cÉë\u000fèj\u0087E\u0017n\u009e×ý\u0098¦iÊU\u0096\u0011.\u0017ª\u0010ò;\u0081a\u0018h·\t\u0017Û+\u0001°ÏM\u0092\u001010®Û£î§\u0003\u008b \u000ekiO\u0014ò";
      int var22 = "Ñn§AXÎ5\u00073ªÞê1{å-\u0010V]9þ±*\u009e\n\u0015C\u0015°ï)=Í #\u000bÊ9\u00adÔ\u001fÀIG\u0019ÈÏì\u0089\u0096¾\u0099\t\u0094\u001c@\u0096\u0088\u009e½ ÐÖQÅ§\u0010:ï\u0005\u0091\u000ejåKÝÌÏ1\u0081\\Ù,\u0018ß\u001cÉë\u000fèj\u0087E\u0017n\u009e×ý\u0098¦iÊU\u0096\u0011.\u0017ª\u0010ò;\u0081a\u0018h·\t\u0017Û+\u0001°ÏM\u0092\u001010®Û£î§\u0003\u008b \u000ekiO\u0014ò".length();
      char var19 = 16;
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var33;
               if ((var18 += var19) >= var22) {
                  b = var23;
                  d = new String[9];
                  j = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[6];
                  int var8 = 0;
                  String var9 = "±k±ËwºöSÉnóæF\u001c^¦x\u0018\u0092\u0096\u0081¹\u0090\u0014!\u0094ho!£ðì";
                  int var10 = "±k±ËwºöSÉnóæF\u001c^¦x\u0018\u0092\u0096\u0081¹\u0090\u0014!\u0094ho!£ðì".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              f = var11;
                              g = new Integer[6];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 4544734132870677486L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              k = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "FÆ,äm\u0004ôðÜÕ\u0015#N\u009f{$";
                           var10 = "FÆ,äm\u0004ôðÜÕ\u0015#N\u009f{$".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var33;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "\u001cË]aÂq2\u0001OÝ\u0084ð\u0005\u001eÀÎ\u0010\u008f=\u001a}\u0091/ö\u0088:²IÅ\u0011¯j3";
               var22 = "\u001cË]aÂq2\u0001OÝ\u0084ð\u0005\u001eÀÎ\u0010\u008f=\u001a}\u0091/ö\u0088:²IÅ\u0011¯j3".length();
               var19 = 16;
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17061;
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
            throw new RuntimeException("su/catlean/f9", var10);
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
         throw new RuntimeException("su/catlean/f9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22419;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/f9", var14);
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
         throw new RuntimeException("su/catlean/f9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
