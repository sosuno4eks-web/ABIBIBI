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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

public final class fs {
   @NotNull
   private String B;
   private int w;
   private int j;
   private int k;
   @Nullable
   private class_2960 o;
   private static boolean F;
   private static final long a = j0.a(7298654329889155360L, 8789402301894728567L, MethodHandles.lookup().lookupClass()).a(225246590586247L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public fs(@NotNull String name, long a, int width, int height) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(14216, 6652286236908315401L ^ var2));
      super();
      this.B = var1;
      this.w = var4;
      this.j = var5;
      this.k = -1;
   }

   public fs(String var1, int var2, char var3, int var4, int var5, int var6, DefaultConstructorMarker var7, int var8) {
      long var9 = ((long)var3 << 48 | (long)var6 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 113070303996782L;
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var4 = 0;
      }

      this(var1, var11, var2, var4);
   }

   public final int U() {
      return this.w;
   }

   public final void u(int <set-?>) {
      this.w = var1;
   }

   public final int O() {
      return this.j;
   }

   public final void l(int <set-?>) {
      this.j = var1;
   }

   private final void Q(float param1, int param2, float param3, int param4, short param5) {
      // $FF: Couldn't be decompiled
   }

   public final void l(@NotNull Matrix3x2f stack, int a, double x, double y, float renderWidth, float renderHeight, @NotNull Color primaryColor, byte a, int a, @NotNull Color secondaryColor, float alpha) {
      // $FF: Couldn't be decompiled
   }

   public static void J(fs param0, Matrix3x2f param1, double param2, double param4, float param6, float param7, Color param8, Color param9, float param10, long param11, int param13, Object param14) {
      // $FF: Couldn't be decompiled
   }

   private final void x(long param1) {
      // $FF: Couldn't be decompiled
   }

   public static void s(boolean var0) {
      F = var0;
   }

   public static boolean T() {
      return F;
   }

   public static boolean J() {
      boolean var0 = T();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a((Throwable)var1);
      }
   }

   static {
      long var20 = a ^ 43238719956874L;
      d = new HashMap(13);
      true.A<invokedynamic>(true, 7056908359285148383L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "B®Íî#Ð\u0085\u000bHû&'g\u0081lí\u0012û\u0090·ß\u0093É\n½\u008c9e\u0003í%\u007f\u0010º\u0097Ò3!éÛR«[sq·nR\u0086\u0018bD\u008a\t@\u0099Çæù\u0019û¾jÅ9 Sßlæñx/\u0013\u0010!\u0010\u009b©a[áå1=à\u0097Õc\u001a\u0099\u0018\u0084Ô`öõ9û;1oP\u0096\u009a}hy\u0001Ms\u00ad\rüçh\u00101\n\b¿o~\u001f&Õn»dÁ\u0005\u0095\u009d0äYÓ\tÍü\u0007\u0019·æ\u001a\\Æ°B+·l¶\u0012ã\u0013x°w.\u0002Û0µÕ\u0081\u0086ãû\"rH#\u008cÙËÄ\u0007NV<è\u0010°ÒA\u001e\u0098cX\u0098C@+\u0017\u0017B\u0091ñ";
      int var17 = "B®Íî#Ð\u0085\u000bHû&'g\u0081lí\u0012û\u0090·ß\u0093É\n½\u008c9e\u0003í%\u007f\u0010º\u0097Ò3!éÛR«[sq·nR\u0086\u0018bD\u008a\t@\u0099Çæù\u0019û¾jÅ9 Sßlæñx/\u0013\u0010!\u0010\u009b©a[áå1=à\u0097Õc\u001a\u0099\u0018\u0084Ô`öõ9û;1oP\u0096\u009a}hy\u0001Ms\u00ad\rüçh\u00101\n\b¿o~\u001f&Õn»dÁ\u0005\u0095\u009d0äYÓ\tÍü\u0007\u0019·æ\u001a\\Æ°B+·l¶\u0012ã\u0013x°w.\u0002Û0µÕ\u0081\u0086ãû\"rH#\u008cÙËÄ\u0007NV<è\u0010°ÒA\u001e\u0098cX\u0098C@+\u0017\u0017B\u0091ñ".length();
      char var14 = ' ';
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
                  c = new String[10];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "C<F\u0005wPNR\u0083eê\u001dp\u001c`1|\u009e±\u008cÙÁrì×q;\u0002$\\\nx";
                  int var5 = "C<F\u0005wPNR\u0083eê\u001dp\u001c`1|\u009e±\u008cÙÁrì×q;\u0002$\\\nx".length();
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
                              e = var6;
                              f = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0092=©®·óø'T°,\u008eVA\u0000ì";
                           var5 = "\u0092=©®·óø'T°,\u008eVA\u0000ì".length();
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

               var15 = "\u0092V\rTÝ£0äÀ¹¢mÉ23\u0003¯éDÂvdÌU\u0010ÝCB\u001a;&\u0004j\u0095\u0018l¸@\r\b2";
               var17 = "\u0092V\rTÝ£0äÀ¹¢mÉ23\u0003¯éDÂvdÌU\u0010ÝCB\u001a;&\u0004j\u0095\u0018l¸@\r\b2".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9883;
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
            throw new RuntimeException("su/catlean/fs", var10);
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
         throw new RuntimeException("su/catlean/fs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3103;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/fs", var14);
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
         throw new RuntimeException("su/catlean/fs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
