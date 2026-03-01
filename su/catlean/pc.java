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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pc {
   private final float j;
   private final float s;
   private final float h;
   @NotNull
   private final Enum c;
   @NotNull
   private final aa G;
   private static final long a = j0.a(2611388410877616311L, 7243635019090937377L, MethodHandles.lookup().lookupClass()).a(252277933751627L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;
   private static final long k;

   public pc(float x, float y, float w, @NotNull Enum value, @NotNull aa animation, long a) {
      var6 ^= a;
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(2283, 5634312394217968821L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.n<invokedynamic>(8808, 6292918913671265847L ^ var6));
      super();
      this.j = var1;
      this.s = var2;
      this.h = var3;
      this.c = var4;
      this.G = var5;
   }

   // $FF: synthetic method
   public pc(int var1, float var2, float var3, float var4, Enum var5, char var6, aa var7, int var8, DefaultConstructorMarker var9, char var10) {
      long var11 = ((long)var1 << 32 | (long)var6 << 48 >>> 32 | (long)var10 << 48 >>> 48) ^ a;
      long var10001 = var11 ^ 76475590750074L;
      int var13 = (int)((var11 ^ 76475590750074L) >>> 48);
      int var14 = (int)(var10001 << 16 >>> 48);
      int var15 = (int)(var10001 << 32 >>> 32);
      long var16 = var11 ^ 76366525483789L;
      if ((var8 & true.r<invokedynamic>(20527, 6202711229165522065L ^ var11)) != 0) {
         var7 = new aa(sa.OUT_EXPO, k, (short)var13, (short)var14, var15);
      }

      this(var2, var3, var4, var5, var7, var16);
   }

   public final float a() {
      return this.j;
   }

   public final float G() {
      return this.s;
   }

   public final float Y() {
      return this.h;
   }

   @NotNull
   public final Enum I() {
      return this.c;
   }

   @NotNull
   public final aa l() {
      return this.G;
   }

   public final float d() {
      return this.j;
   }

   public final float B() {
      return this.s;
   }

   public final float f() {
      return this.h;
   }

   @NotNull
   public final Enum j() {
      return this.c;
   }

   @NotNull
   public final aa L() {
      return this.G;
   }

   @NotNull
   public final pc U(float x, int a, float y, short a, float w, @NotNull Enum value, char a, @NotNull aa animation) {
      long var9 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 65534956751542L;
      Intrinsics.checkNotNullParameter(var6, true.n<invokedynamic>(15304, 5007934344409707408L ^ var9));
      Intrinsics.checkNotNullParameter(var8, true.n<invokedynamic>(24036, 7027544136303416766L ^ var9));
      return new pc(var1, var3, var5, var6, var8, var11);
   }

   // $FF: synthetic method
   public static pc C(pc param0, long param1, float param3, float param4, float param5, Enum param6, aa param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 1962420996804L;
      aa var3 = this.G;
      Enum var4 = this.c;
      float var5 = this.h;
      float var6 = this.s;
      float var7 = this.j;
      String var10000 = 28027.n<invokedynamic>(28027, 4539303545363362615L ^ var1);
      return var10000 + var7 + true.n<invokedynamic>(16260, 7832459062654149066L ^ var1) + var6 + true.n<invokedynamic>(19179, 8439727266838860972L ^ var1) + var5 + true.n<invokedynamic>(30098, 247394348347419610L ^ var1) + var4 + true.n<invokedynamic>(32355, 15208015757631530L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 47913892689299L;
      int var3 = Float.hashCode(this.j);
      var3 = var3 * true.r<invokedynamic>(8050, 5828612460380744500L ^ var1) + Float.hashCode(this.s);
      var3 = var3 * true.r<invokedynamic>(24385, 2063562649403403013L ^ var1) + Float.hashCode(this.h);
      var3 = var3 * true.r<invokedynamic>(24385, 2063562649403403013L ^ var1) + this.c.hashCode();
      var3 = var3 * true.r<invokedynamic>(24385, 2063562649403403013L ^ var1) + this.G.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 59004716258221L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[9];
      int var23 = 0;
      String var22 = "iwãÀ-\u001eö)0\u0001'6>Z\u001f\n9ÑH\u0015\u0014\u0090\u0089,t:F\"\u001eð=\u0098\u0010ÄÆÕÒwô¼)\u008c×*?Áf~\u001f\u0010ç\t=Ãgª\u008f¡\u00821,üÍæä_\u0018O+ßÍèæ35\u008b@;N=±\u0003Oª«Yú·^\u008dN\u0010PÚó\u001cC]¤¸ú\u0007BÂ8X\bÝ \u0081s¾\u0012ÉÄ¬t\u009d¤\u008fë\u0015¥ÎZUa\u0007\u008dú\\à\u008d\u0001\u0087ÖA$ë-\u0015 À\u0098FR?ü.\u001bXöl(Þ´\u001cß÷Ð[\u001c\u009f\u0010×dk×;Eú\u0090\u0004Å";
      int var24 = "iwãÀ-\u001eö)0\u0001'6>Z\u001f\n9ÑH\u0015\u0014\u0090\u0089,t:F\"\u001eð=\u0098\u0010ÄÆÕÒwô¼)\u008c×*?Áf~\u001f\u0010ç\t=Ãgª\u008f¡\u00821,üÍæä_\u0018O+ßÍèæ35\u008b@;N=±\u0003Oª«Yú·^\u008dN\u0010PÚó\u001cC]¤¸ú\u0007BÂ8X\bÝ \u0081s¾\u0012ÉÄ¬t\u009d¤\u008fë\u0015¥ÎZUa\u0007\u008dú\\à\u008d\u0001\u0087ÖA$ë-\u0015 À\u0098FR?ü.\u001bXöl(Þ´\u001cß÷Ð[\u001c\u009f\u0010×dk×;Eú\u0090\u0004Å".length();
      char var21 = ' ';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  d = new String[9];
                  i = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[5];
                  int var8 = 0;
                  String var9 = "¡Î\u001fÏ\u0099\u0096\u0007\u0080zÃ`ë\u0007õ~\u0006¹\u0000\u00adìòyäÿ";
                  int var10 = "¡Î\u001fÏ\u0099\u0096\u0007\u0080zÃ`ë\u0007õ~\u0006¹\u0000\u00adìòyäÿ".length();
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
                              g = new Integer[5];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 2854409528788779321L;
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

                           var9 = "WmÇL×Îö\u000fH4Ì:\u009b\\ß{";
                           var10 = "WmÇL×Îö\u000fH4Ì:\u009b\\ß{".length();
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

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "\u000eôé1ÐÕ\u0085ùÅÓ\u0001Û\u001a `\b`å\u0095$³î\u0093<¾vjâcõ¸£\u0010\u0092\u0089ó¨{ó\u0098\u001c?µIßK,`\u0092";
               var24 = "\u000eôé1ÐÕ\u0085ùÅÓ\u0001Û\u001a `\b`å\u0095$³î\u0093<¾vjâcõ¸£\u0010\u0092\u0089ó¨{ó\u0098\u001c?µIßK,`\u0092".length();
               var21 = ' ';
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19005;
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
            throw new RuntimeException("su/catlean/pc", var10);
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
         throw new RuntimeException("su/catlean/pc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8035;
      if (g[var3] == null) {
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
            throw new RuntimeException("su/catlean/pc", var14);
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
         throw new RuntimeException("su/catlean/pc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
