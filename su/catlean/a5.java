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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class a5 {
   @NotNull
   private final String y;
   @NotNull
   private final String Q;
   @NotNull
   private final v6 Z;
   private final int s;
   @Nullable
   private final class_1799 m;
   private float G;
   @NotNull
   private final aa S;
   private final float J;
   @NotNull
   private final iv n;
   @NotNull
   private final fs f;
   private static final long a = j0.a(575509860422722255L, 3841040366200456269L, MethodHandles.lookup().lookupClass()).a(162807485816208L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public a5(@NotNull String title, @NotNull String message, @NotNull v6 type, int time, @Nullable class_1799 item, long a) {
      // $FF: Couldn't be decompiled
   }

   public a5(String var1, String var2, v6 var3, int var4, long var5, class_1799 var7, int var8, DefaultConstructorMarker var9) {
      var5 ^= a;
      long var10 = var5 ^ 116511965033790L;
      if ((var8 & true.a<invokedynamic>(30037, 2710715708255512259L ^ var5)) != 0) {
         var7 = null;
      }

      this(var1, var2, var3, var4, var7, var10);
   }

   @NotNull
   public final String j() {
      return this.y;
   }

   @NotNull
   public final String T() {
      return this.Q;
   }

   @NotNull
   public final v6 W() {
      return this.Z;
   }

   public final int l() {
      return this.s;
   }

   @Nullable
   public final class_1799 L() {
      return this.m;
   }

   public final float y() {
      return this.G;
   }

   public final void b(float <set-?>) {
      this.G = var1;
   }

   @NotNull
   public final aa R() {
      return this.S;
   }

   public final float n() {
      return this.J;
   }

   @NotNull
   public final iv C() {
      return this.n;
   }

   @NotNull
   public final fs F() {
      return this.f;
   }

   public final boolean s(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 25320745980355L;
      return this.n.C(this.s, var3);
   }

   @NotNull
   public final String p() {
      return this.y;
   }

   @NotNull
   public final String i() {
      return this.Q;
   }

   @NotNull
   public final v6 Y() {
      return this.Z;
   }

   public final int x() {
      return this.s;
   }

   @Nullable
   public final class_1799 e() {
      return this.m;
   }

   @NotNull
   public final a5 P(long a, @NotNull String title, @NotNull String message, @NotNull v6 type, int time, @Nullable class_1799 item) {
      var1 ^= a;
      long var8 = var1 ^ 48911540672354L;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(11064, 4990802596081677592L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(9247, 6557020479923993148L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.e<invokedynamic>(25632, 8491185831706098178L ^ var1));
      return new a5(var3, var4, var5, var6, var7, var8);
   }

   public static a5 I(a5 param0, String param1, String param2, v6 param3, int param4, long param5, class_1799 param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 67133209640064L;
      class_1799 var3 = this.m;
      int var4 = this.s;
      v6 var5 = this.Z;
      String var6 = this.Q;
      String var7 = this.y;
      String var10000 = 32456.e<invokedynamic>(32456, 3084691432133972859L ^ var1);
      return var10000 + var7 + true.e<invokedynamic>(16974, 8970083878982610935L ^ var1) + var6 + true.e<invokedynamic>(4969, 2116277366481207000L ^ var1) + var5 + true.e<invokedynamic>(11150, 2334893047653271094L ^ var1) + var4 + true.e<invokedynamic>(9082, 9040657213738880714L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 81319648703432L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[11];
      int var23 = 0;
      String var22 = "{£d!ð\u009f\u0080«êèÇz«üN¢\u0010\u0001Þâ{%æ²)Ø«ú÷PÀ2¦\u0010ÝÚgxý@Ô\u001ff¬Æ\u00ad\u0000cr1(¹©ü÷ÂÚT`\u0001©tßNPRq\u001f\t¹\u0019\u0095\f\u0095^·\u008dn\u0017êB\u0089À õ\u0087\u0007½åF\u0003\u0010ÔP2´!Á\u0003.6½âk«\u009d\u008eÓ\u0010ó\u0099/aø|\u0000\u0016ÊÒ¤\u009bm*Þ,\u0010\u0015Ô\u0091¯×\u009e\u000bÉ`PiH\u001a\u00ad÷ú\u0010X\u008fë\u000f÷´\u0082Ä´à»Í\u008f°\u009d_\u0010ÒM\u009e[Ë¬¢±õcÆ~æ¦\u001cL";
      int var24 = "{£d!ð\u009f\u0080«êèÇz«üN¢\u0010\u0001Þâ{%æ²)Ø«ú÷PÀ2¦\u0010ÝÚgxý@Ô\u001ff¬Æ\u00ad\u0000cr1(¹©ü÷ÂÚT`\u0001©tßNPRq\u001f\t¹\u0019\u0095\f\u0095^·\u008dn\u0017êB\u0089À õ\u0087\u0007½åF\u0003\u0010ÔP2´!Á\u0003.6½âk«\u009d\u008eÓ\u0010ó\u0099/aø|\u0000\u0016ÊÒ¤\u009bm*Þ,\u0010\u0015Ô\u0091¯×\u009e\u000bÉ`PiH\u001a\u00ad÷ú\u0010X\u008fë\u000f÷´\u0082Ä´à»Í\u008f°\u009d_\u0010ÒM\u009e[Ë¬¢±õcÆ~æ¦\u001cL".length();
      char var21 = 16;
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
                  c = new String[11];
                  h = new HashMap(13);
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
                  String var9 = "÷Õ\u008f\u0084Ó×\u009f$h\u0014à0¸\u000bÀ\u0010Ä\u009f\u009a3\u009f\u0081èE";
                  int var10 = "÷Õ\u008f\u0084Ó×\u009f$h\u0014à0¸\u000bÀ\u0010Ä\u009f\u009a3\u009f\u0081èE".length();
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
                              e = var11;
                              g = new Integer[5];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -6327849133398016809L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              i = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "W\u0013\u0010$\u0000\u009akåuÌ$ð¿·\u009dÏ";
                           var10 = "W\u0013\u0010$\u0000\u009akåuÌ$ð¿·\u009dÏ".length();
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

               var22 = "»ã\"Z½\u008f¯h\u0014¯5Ø\u0092Ý*Ê\u0012\u009d¡áàk\b¿\u0010ËL½w¿\u0005É\u0010ja\u0085\u001ed\u0001»+=7\u001bnÁëA\u0003";
               var24 = "»ã\"Z½\u008f¯h\u0014¯5Ø\u0092Ý*Ê\u0012\u009d¡áàk\b¿\u0010ËL½w¿\u0005É\u0010ja\u0085\u001ed\u0001»+=7\u001bnÁëA\u0003".length();
               var21 = ' ';
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29500;
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
            throw new RuntimeException("su/catlean/a5", var10);
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
         throw new RuntimeException("su/catlean/a5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23762;
      if (g[var3] == null) {
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
            throw new RuntimeException("su/catlean/a5", var14);
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
         throw new RuntimeException("su/catlean/a5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
