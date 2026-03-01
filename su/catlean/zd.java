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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class zd extends zt {
   @NotNull
   private final String l;
   @Nullable
   private Object o;
   private boolean n;
   private boolean A;
   @NotNull
   private String f;
   private static int[] L;
   private static final long a = j0.a(724329157489202527L, 8413334165385559242L, MethodHandles.lookup().lookupClass()).a(238123602071610L);
   private static final String[] m;
   private static final String[] p;
   private static final Map q;
   private static final long[] w;
   private static final Integer[] x;
   private static final Map y;
   private static final long C;

   public zd(@NotNull String title, long a) {
      var2 ^= a;
      long var4 = var2 ^ 18294102633839L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(3574, 5874386905255223124L ^ var2));
      super(var4);
      this.l = var1;
      this.n = true;
      this.f = "";
   }

   @NotNull
   protected final String q() {
      return this.f;
   }

   protected final void I(@NotNull String <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(18904, 904036643655770054L ^ var2));
      this.f = var1;
   }

   public void X(@NotNull class_332 context, int mouseX, int mouseY, long a) {
      long var6 = var4 ^ 88250731960632L;
      long var8 = var4 ^ 3169755080007L;
      long var10 = var4 ^ 115887261824114L;
      long var10001 = var4 ^ 108375153159173L;
      int var12 = (int)((var4 ^ 108375153159173L) >>> 48);
      int var13 = (int)(var10001 << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      long var15 = var4 ^ 42913705350596L;
      var10001 = var4 ^ 89529777428741L;
      int var17 = (int)((var4 ^ 89529777428741L) >>> 32);
      int var18 = (int)(var10001 << 32 >>> 48);
      int var19 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(8230, 5485885380842141830L ^ var4));
      float var20 = (float)s8.H((short)var12, (short)var13, var14).method_22683().method_4486() / 2.0F - this.M() / 2.0F;
      float var21 = (float)s8.H((short)var12, (short)var13, var14).method_22683().method_4502() / 2.0F - this.G() / 2.0F - 50.0F;
      g3.b(var17, var18, (short)var19).x(var1, this.l, var20 + this.M() / 2.0F, var21 + (float)3, true.w<invokedynamic>(13160, 2705232556503945500L ^ var4), var6);
      this.S(var1, var8, var20, var21);
      this.y(var1, var20, var21, var15);
      this.N(var1, var20, var10, var21, var2, var3);
   }

   private final void S(class_332 param1, long param2, float param4, float param5) {
      // $FF: Couldn't be decompiled
   }

   private final void y(class_332 param1, float param2, float param3, long param4) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected abstract List t(long var1);

   @NotNull
   protected abstract String Z(Object var1, long var2);

   protected abstract boolean d(long var1, Object var3);

   protected abstract void C(int var1, short var2, Object var3, int var4);

   private final void N(class_332 param1, float param2, long param3, float param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   public void p(int a, char a, int mouseX, short a, int mouseY, int mouseButton) {
      // $FF: Couldn't be decompiled
   }

   public void P(int key, long a) {
      // $FF: Couldn't be decompiled
   }

   public void B(char char, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   public void h(@NotNull class_332 context, float x, float y, Object component, long a) {
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(14743, 4664337337431421064L ^ var5));
   }

   public static void m(int[] var0) {
      L = var0;
   }

   public static int[] s() {
      return L;
   }

   static {
      long var25 = a ^ 59328900965470L;
      q = new HashMap(13);
      null.A<invokedynamic>((Object)null, -5113293448111256140L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[12];
      int var21 = 0;
      String var20 = "<ÔòÅ\u0019q\u0092\u0099ÁÔi5»ð\u0019Nø²}¢\u000f\u0092Ñ¤øMÄ¶R\u009a6\u0091\u0010\u001d3\u0093Ìp¾\n\u008f\u0011ëVÌ\u0088±\u009a\u0086 \u0016õ\u0095teÅ\nç5\bG¬¢i\u009a\\ \\åÏ\u000eV\u0014F\u009d7\u0097\u007f\u0081\u009a\u001cÛ\u0018ûMiÞªf^\u00828jèXñ\u009fWÔg3öKQÌ\u00110\u0010#]&múÔ^\n,ÂÀ\u0015¢xe¢\u0010:ê(*lGoj{k9ªí[\u0086J\u0018º\u0092`æÑèì9\u0083¡Y»\u009b ,\u0090f\u009c\t\u0097`\u0096G}\u0010Ü?#Áì4\u0001\u0011¿\u00ad\u0082êÙ®¿£ ¯{\u0012ñ3÷\u0087\u001fØ\u000bø'£4ñ\u001fÏOï9m¬\u0081\u0001p\u009cÈ*\u0086ñÔa\u0010_°\u0081\\\u009a÷0*`\u009fî\u0093\u001bÆ\u000bâ";
      int var22 = "<ÔòÅ\u0019q\u0092\u0099ÁÔi5»ð\u0019Nø²}¢\u000f\u0092Ñ¤øMÄ¶R\u009a6\u0091\u0010\u001d3\u0093Ìp¾\n\u008f\u0011ëVÌ\u0088±\u009a\u0086 \u0016õ\u0095teÅ\nç5\bG¬¢i\u009a\\ \\åÏ\u000eV\u0014F\u009d7\u0097\u007f\u0081\u009a\u001cÛ\u0018ûMiÞªf^\u00828jèXñ\u009fWÔg3öKQÌ\u00110\u0010#]&múÔ^\n,ÂÀ\u0015¢xe¢\u0010:ê(*lGoj{k9ªí[\u0086J\u0018º\u0092`æÑèì9\u0083¡Y»\u009b ,\u0090f\u009c\t\u0097`\u0096G}\u0010Ü?#Áì4\u0001\u0011¿\u00ad\u0082êÙ®¿£ ¯{\u0012ñ3÷\u0087\u001fØ\u000bø'£4ñ\u001fÏOï9m¬\u0081\u0001p\u009cÈ*\u0086ñÔa\u0010_°\u0081\\\u009a÷0*`\u009fî\u0093\u001bÆ\u000bâ".length();
      char var19 = ' ';
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var33;
               if ((var18 += var19) >= var22) {
                  m = var23;
                  p = new String[12];
                  y = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[9];
                  int var8 = 0;
                  String var9 = "\u008b ×k\u009c\u001c¹EÜáQöõL\u001eó@GÏz\u0090/ ³\tÈæ{\u009f\f*U¦¥TI.À\u009c\\Í4\u001cib½¦øüyozÇü\u0010°";
                  int var10 = "\u008b ×k\u009c\u001c¹EÜáQöõL\u001eó@GÏz\u0090/ ³\tÈæ{\u009f\f*U¦¥TI.À\u009c\\Í4\u001cib½¦øüyozÇü\u0010°".length();
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
                              w = var11;
                              x = new Integer[9];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -8103261843086483433L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              C = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "8ó\u0099\u0012ÕTnh(\rs\u0010TMÅ²";
                           var10 = "8ó\u0099\u0012ÕTnh(\rs\u0010TMÅ²".length();
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

               var20 = "± mDú\u0087½!+ó(B\u0017/O\u0014\u0010\u0014é\u0000\u001cÚc\u008aýo\u0007ªîeì³\u0080";
               var22 = "± mDú\u0087½!+ó(B\u0017/O\u0014\u0010\u0014é\u0000\u001cÚc\u008aýo\u0007ªîeì³\u0080".length();
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

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18038;
      if (p[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zd", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = m[var5].getBytes("ISO-8859-1");
         p[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return p[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/zd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15535;
      if (x[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = w[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/zd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/zd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
