package su.catlean;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.client.InputSuggestorEvent;
import su.catlean.api.event.events.network.SendMessageEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class pr implements zh {
   @NotNull
   public static final pr A;
   @NotNull
   private static String s;
   @Nullable
   private static class_2338 C;
   @NotNull
   private static final List q;
   @NotNull
   private static final CommandDispatcher m;
   private static final long a = j0.a(6208067395165980373L, 6437606776725086090L, MethodHandles.lookup().lookupClass()).a(60553838512971L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private pr() {
   }

   @NotNull
   public final String j() {
      return s;
   }

   public final void j(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(7802, 1831196964735209217L ^ var1));
      s = var3;
   }

   @Nullable
   public final class_2338 u() {
      return C;
   }

   public final void J(@Nullable class_2338 <set-?>) {
      C = var1;
   }

   @NotNull
   public final List I() {
      return q;
   }

   @NotNull
   public final CommandDispatcher c() {
      return m;
   }

   private final void H(char var1, int var2, _i var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 105159725007261L;
      var3.k(var7, m);
      q.add(var3);
   }

   @Flow
   private final void a(SendMessageEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void n(InputSuggestorEvent var1) {
      long var2 = a ^ 22566482961243L;
      long var10001 = var2 ^ 67116145515374L;
      int var4 = (int)((var2 ^ 67116145515374L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      class_634 var7 = s8.H((short)var4, (short)var5, var6).method_1562();
      Intrinsics.checkNotNull(var7);
      var1.setSource(var7.method_2875());
      var1.setPrefix(s);
      var1.setDispatcher(m);
      var1.cancel();
   }

   @Flow
   private final void F(Render2DEvent var1) {
      long var2 = a ^ 121696032897094L;
      long var4 = var2 ^ 121436225578879L;
      long var10001 = var2 ^ 105949807181279L;
      int var6 = (int)((var2 ^ 105949807181279L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 111808786641056L;
      long var11 = var2 ^ 33993225841047L;
      long var13 = var2 ^ 3012230445610L;
      var10001 = var2 ^ 78211522216051L;
      int var15 = (int)((var2 ^ 78211522216051L) >>> 48);
      int var16 = (int)(var10001 << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      long var18 = var2 ^ 41485644619000L;
      long var20 = var2 ^ 50603898593173L;
      long var22 = var2 ^ 63062980527154L;
      long var24 = var2 ^ 50760331966332L;
      if (C != null) {
         float var26 = (float)s8.H((short)var15, (short)var16, var17).method_22683().method_4486() / 2.0F;
         float var27 = 40.0F;
         class_4587 var28 = new class_4587();
         var28.method_22903();
         var28.method_46416(var26, var27, 0.0F);
         var28.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(90.0F / Math.abs(90.0F / Math.clamp(55.0F, s8.f(var9).method_36455(), 90.0F)) - (float)true.j<invokedynamic>(15251, 5596062928141660612L ^ var2)));
         var28.method_46416(-var26, -var27, 0.0F);
         var28.method_22903();
         double var29 = gk.E.s(s8.f(var9).field_6014, s8.f(var9).method_23317(), (double)q1.A.s(var4));
         double var31 = gk.E.s(s8.f(var9).field_5969, s8.f(var9).method_23321(), (double)q1.A.s(var4));
         class_2338 var10000 = C;
         Intrinsics.checkNotNull(var10000);
         double var36 = (double)var10000.method_10260() - var31;
         class_2338 var40 = C;
         Intrinsics.checkNotNull(var40);
         float var33 = (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var36, (double)var40.method_10263() - var29)) - 90.0D) - s8.f(var9).method_36454();
         var28.method_46416(var26, var27, 0.0F);
         var28.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(var33));
         var28.method_46416(-var26, -var27, 0.0F);
         l5.f.J(var11, var28, var26, var27, 32.0F, z8.I.Z(var18, 0));
         var28.method_46416(var26, var27, 0.0F);
         var28.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(-var33));
         var28.method_46416(-var26, -var27, 0.0F);
         var28.method_22909();
         var28.method_22909();
         i4 var37 = i4.v;
         var40 = C;
         Intrinsics.checkNotNull(var40);
         double var42 = var40.method_46558().field_1352;
         class_2338 var10002 = C;
         Intrinsics.checkNotNull(var10002);
         int var38 = (int)var37.w(var42, var13, var10002.method_46558().field_1350);
         String var34 = var38 + "m";
         float var35 = g3.D(var24).e(var20, var34);
         Matrix3x2fStack var39 = var1.getContext().method_51448();
         Intrinsics.checkNotNullExpressionValue(var39, true.c<invokedynamic>(24561, 3758217259815445459L ^ var2));
         _8.M(var39, var26 - var35 / 2.0F - 2.0F, 56.0F, var35 + 4.0F, 11.0F, 3.0F, var6, 1.5F, 0.0F, (char)var7, 1.0F, z8.I.r(), z8.I.E(), 0.0F, 0.0F, (short)var8, 0.0F, true.j<invokedynamic>(16835, 3192759961424186261L ^ var2), (Object)null);
         fc var41 = g3.D(var24);
         class_332 var43 = var1.getContext();
         Color var10005 = Color.WHITE;
         Intrinsics.checkNotNullExpressionValue(var10005, true.c<invokedynamic>(6427, 2296587584285500730L ^ var2));
         var41.R(var43, var34, var26, 60.0F, var22, var10005);
      }

   }

   static {
      long var20 = a ^ 119674904434301L;
      long var10001 = var20 ^ 125535000429727L;
      int var22 = (int)((var20 ^ 125535000429727L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 32);
      int var24 = (int)(var10001 << 48 >>> 48);
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "\u0004sv;\u0098Ü{\"\\\u0092Ä\u0019[Dp\u0084\u00963\u001f\u00998V1û[r|E<wAl\u0010zÌ\u000b~Yi\u00adesÈ´\u0082Ó-úÐ";
      int var17 = "\u0004sv;\u0098Ü{\"\\\u0092Ä\u0019[Dp\u0084\u00963\u001f\u00998V1û[r|E<wAl\u0010zÌ\u000b~Yi\u00adesÈ´\u0082Ó-úÐ".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var25 = var15.substring(var13, var13 + var14);
         byte var27 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var31 = a(var19).intern();
            switch(var27) {
            case 0:
               var18[var16++] = var31;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[4];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "Yh·Ó¯\u0091\"ö³õ\tæ¢\u0006)Í";
                  int var5 = "Yh·Ó¯\u0091\"ö³õ\tæ¢\u0006)Í".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var33 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[2];
                  A = new pr();
                  s = "^";
                  q = (List)(new ArrayList());
                  m = new CommandDispatcher();
                  A.H((char)var22, var23, (_i)_z.B, var24);
                  A.H((char)var22, var23, (_i)_2.S, var24);
                  A.H((char)var22, var23, (_i)_w.g, var24);
                  A.H((char)var22, var23, (_i)_s.e, var24);
                  A.H((char)var22, var23, (_i)_1.a, var24);
                  A.H((char)var22, var23, (_i)_5.I, var24);
                  A.H((char)var22, var23, (_i)_g.R, var24);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var31;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "xY}<öÍü\u0086U7r<A\u0098F:\u0004\u0007\u001aî)=(¬\u0010¼~]xÔY+\u0082Æø\u0004\u000b\n'|!";
               var17 = "xY}<öÍü\u0086U7r<A\u0098F:\u0004\u0007\u001aî)=(¬\u0010¼~]xÔY+\u0082Æø\u0004\u000b\n'|!".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var25 = var15.substring(var13, var13 + var14);
            var27 = 0;
         }
      }
   }

   private static CommandSyntaxException a(CommandSyntaxException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20104;
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
            throw new RuntimeException("su/catlean/pr", var10);
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
         throw new RuntimeException("su/catlean/pr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14588;
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
            throw new RuntimeException("su/catlean/pr", var14);
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
         throw new RuntimeException("su/catlean/pr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
