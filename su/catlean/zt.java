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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public class zt {
   @NotNull
   private final aa O;
   private float e;
   private float H;
   private float z;
   private boolean G;
   private static String[] g;
   private static final long b = j0.a(1217044903991430789L, 9060334359384143885L, MethodHandles.lookup().lookupClass()).a(135939752799492L);
   private static final String[] d;
   private static final String[] j;
   private static final Map k;
   private static final long[] t;
   private static final Integer[] u;
   private static final Map v;
   private static final long B;

   public zt(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 109843717313989L;
      int var3 = (int)((var1 ^ 109843717313989L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      super();
      this.O = new aa(sa.OUT_QUINT, B, (short)var3, (short)var4, var5);
      this.e = 200.0F;
      this.H = 250.0F;
   }

   @NotNull
   public final aa I() {
      return this.O;
   }

   public final float M() {
      return this.e;
   }

   public final void y(float <set-?>) {
      this.e = var1;
   }

   public final float G() {
      return this.H;
   }

   public final void e(float <set-?>) {
      this.H = var1;
   }

   public final float J() {
      return this.z;
   }

   public final void P(float <set-?>) {
      this.z = var1;
   }

   public final boolean K() {
      return this.G;
   }

   public final void g(boolean <set-?>) {
      this.G = var1;
   }

   public final void B(@NotNull class_332 context, long a, int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void X(@NotNull class_332 context, int mouseX, int mouseY, long a) {
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(23846, 2335726656393604790L ^ var4));
   }

   public void p(int a, char a, int mouseX, short a, int mouseY, int mouseButton) {
      // $FF: Couldn't be decompiled
   }

   public void i() {
   }

   public void P(int key, long a) {
      try {
         if (var2 > 0L && var1 == true.b<invokedynamic>(463, 8685616892909509492L ^ var2)) {
            this.G = true;
         }

      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -8273015447337316175L, var2);
      }
   }

   public void B(char char, int a, int a) {
   }

   public void w(double mouseX, double mouseY, double verticalAmount, long a) {
      this.z += (float)var5 * 10.0F;
      this.z = Math.min(this.z, 0.0F);
   }

   public static void v(String[] var0) {
      g = var0;
   }

   public static String[] f() {
      return g;
   }

   static {
      long var25 = b ^ 72176085138377L;
      String[] var10000 = new String[5];
      k = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 8862452979914824532L, var25);
      Cipher var16;
      Cipher var27 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[5];
      int var21 = 0;
      String var20 = "a¢AI¯øØÎ\u0096{É\u0013JéQ»\u008e·¤¨Ý\u0094»L9QQ\u0010¥ÅÝ{ ,è®\u0097¶`'²\u009b>\u001b\u008dÆ#Õý]ò4*Ïìû×\u0099§1{\fâvr\u0010X\u009elñ\t\u001bKFkº|\u0003A>{¥";
      int var22 = "a¢AI¯øØÎ\u0096{É\u0013JéQ»\u008e·¤¨Ý\u0094»L9QQ\u0010¥ÅÝ{ ,è®\u0097¶`'²\u009b>\u001b\u008dÆ#Õý]ò4*Ïìû×\u0099§1{\fâvr\u0010X\u009elñ\t\u001bKFkº|\u0003A>{¥".length();
      char var19 = ' ';
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var28 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var28.getBytes("ISO-8859-1"));
            String var34 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var34;
               if ((var18 += var19) >= var22) {
                  d = var23;
                  j = new String[5];
                  v = new HashMap(13);
                  Cipher var5;
                  var27 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[11];
                  int var8 = 0;
                  String var9 = "$++î\u0097ÞÚéÈÖñ\u0013\u0095¶Óp´Cizþ\u0017È\f\t\u008d\u0091\u0015\u001c?\u001e\u0013öó*²x~ÿ_i&d¨xú\u008cáûÉ!\u00839«t\u0014\u0004H\\õC8\u008c\nû\u0082q½©\u0015\u008dÞ";
                  int var10 = "$++î\u0097ÞÚéÈÖñ\u0013\u0095¶Óp´Cizþ\u0017È\f\t\u008d\u0091\u0015\u001c?\u001e\u0013öó*²x~ÿ_i&d¨xú\u008cáûÉ!\u00839«t\u0014\u0004H\\õC8\u008c\nû\u0082q½©\u0015\u008dÞ".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var32 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var32, var7).getBytes("ISO-8859-1");
                     long[] var31 = var11;
                     var32 = var8++;
                     long var37 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var13 = var37;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var40 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var38) {
                        case 0:
                           var31[var32] = var40;
                           if (var7 >= var10) {
                              t = var11;
                              u = new Integer[11];
                              Cipher var0;
                              var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -6103672037894309849L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var37 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var35 = true;
                              B = var37;
                              return;
                           }
                           break;
                        default:
                           var31[var32] = var40;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u0019\u001cc-ëbÞM\u009bØÿ\u0081È.ë3";
                           var10 = "\u0019\u001cc-ëbÞM\u009bØÿ\u0081È.ë3".length();
                           var7 = 0;
                        }

                        var32 = var7;
                        var7 += 8;
                        var12 = var9.substring(var32, var7).getBytes("ISO-8859-1");
                        var31 = var11;
                        var32 = var8++;
                        var37 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var34;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "\u0018i\u0082\u001aþ\u001c¶÷\u001f\u0086ÈCõÝ\u0089'\u00ad\u008eì\u0080\u009e\u0001?\u0087Á»\n\u0089c(|\"\u00107\u0080%uáK]bý\u0087É,ñÂYq";
               var22 = "\u0018i\u0082\u001aþ\u001c¶÷\u001f\u0086ÈCõÝ\u0089'\u00ad\u008eì\u0080\u009e\u0001?\u0087Á»\n\u0089c(|\"\u00107\u0080%uáK]bý\u0087É,ñÂYq".length();
               var19 = ' ';
               var18 = -1;
            }

            ++var18;
            var28 = var20.substring(var18, var18 + var19);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException c(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27976;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zt", var10);
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
         j[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
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
         throw new RuntimeException("su/catlean/zt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22138;
      if (u[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = t[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/zt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/zt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
