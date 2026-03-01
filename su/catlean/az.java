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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public abstract class az extends a_ {
   @NotNull
   private final zf U;
   @NotNull
   private final aa S;
   private boolean P;
   private float j;
   private boolean J;
   @NotNull
   private String L;
   private static int[] l;
   private static final long c = j0.a(-8885846978867205548L, 6840427740550053702L, MethodHandles.lookup().lookupClass()).a(25955298950401L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i;
   private static final long[] o;
   private static final Integer[] p;
   private static final Map q;
   private static final long r;

   public az(@NotNull zf setting, long a) {
      var2 ^= c;
      long var4 = var2 ^ 127366338194128L;
      long var10001 = var2 ^ 59776445333691L;
      int var6 = (int)((var2 ^ 59776445333691L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(11902, 4633242757917300527L ^ var2));
      super(var4, var1);
      this.U = var1;
      this.H(24.0F);
      this.S = new aa(sa.OUT_QUINT, r, (short)var6, (short)var7, var8);
      this.L = "-";
   }

   @NotNull
   public zf t() {
      return this.U;
   }

   public final boolean q() {
      return this.P;
   }

   public final void s(boolean <set-?>) {
      this.P = var1;
   }

   public final float b() {
      return this.j;
   }

   public final void R(float <set-?>) {
      this.j = var1;
   }

   public void v(@NotNull class_332 context, long a, char a, int mouseX, int mouseY, float factor) {
      // $FF: Couldn't be decompiled
   }

   private final boolean a(int param1, int param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private final boolean i(int param1, int param2, char param3, long param4) {
      // $FF: Couldn't be decompiled
   }

   private final void f(int var1, short var2, class_332 var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
      long var10001 = var5 ^ 121258476879671L;
      int var7 = (int)((var5 ^ 121258476879671L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var5 ^ 9657986983704L;
      Matrix3x2fStack var10000 = var3.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10000, true.l<invokedynamic>(19335, 4418344450205068941L ^ var5));
      _8.M(var10000, this.i(), this.R() + 15.0F, this.L() - 7.0F, 4.0F, 2.0F, var7, 2.0F, 0.0F, (char)var8, 1.0F, z8.I.U(), z8.I.V(), 0.0F, 0.0F, (short)var9, 0.0F, true.b<invokedynamic>(24477, 3277892941216410542L ^ var5), (Object)null);
      float var12 = this.i();
      float var13 = this.R() + 15.0F;
      float var10002 = (this.L() - 7.0F) * this.j;
      Color var10006 = z8.I.h();
      Color var10007 = z8.I.h();
      Color var10008 = z8.I.h();
      Color var10009 = z8.I.h();
      Matrix3x2fStack var10010 = var3.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10010, true.l<invokedynamic>(31551, 7922818405980479028L ^ var5));
      bt.m(var12, var13, var10002, 4.0F, 2.0F, var10, var10006, var10007, var10008, var10009, var10010, 1.0F, z8.I.V());
      var12 = this.i() - (float)2 + (this.L() - 11.0F) * this.j;
      var13 = this.R() + 15.0F - 1.5F;
      var10006 = z8.I.h();
      var10007 = z8.I.h();
      var10008 = z8.I.h();
      var10009 = z8.I.h();
      var10010 = var3.method_51448();
      Intrinsics.checkNotNullExpressionValue(var10010, true.l<invokedynamic>(31551, 7922818405980479028L ^ var5));
      bt.m(var12, var13, 7.0F, 7.0F, 2.5F, var10, var10006, var10007, var10008, var10009, var10010, 1.0F + this.S.a(), z8.I.V());
   }

   private final void y(class_332 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public abstract void R(int var1, byte var2, int var3, int var4);

   public abstract float D(long var1);

   public void d(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
   }

   public void x(double mouseX, double mouseY, int button) {
      this.P = false;
   }

   public void Z(long a, int key) {
      // $FF: Couldn't be decompiled
   }

   public void G(long a, char char) {
      // $FF: Couldn't be decompiled
   }

   public boolean i(int a, int a, int a, double mouseX, double mouseY, double verticalAmount) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final IntRange U(long var1) {
      var1 ^= c;
      zf var10000 = this.t();
      Intrinsics.checkNotNull(var10000, true.l<invokedynamic>(224, 7618441678236021592L ^ var1));
      return ((z0)var10000).N();
   }

   @NotNull
   public final ClosedFloatingPointRange T(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      zf var10000 = this.t();
      Intrinsics.checkNotNull(var10000, true.l<invokedynamic>(25374, 8562288336364654714L ^ var4));
      return ((zc)var10000).i();
   }

   @NotNull
   public abstract Number z(@NotNull String var1, int var2, byte var3, int var4);

   @NotNull
   public abstract Number T(long var1, @NotNull Number var3, int var4);

   private final float j(float var1, long var2, float var4, float var5) {
      var2 ^= c;

      float var10000;
      label17: {
         try {
            if (au.a.z() > 5) {
               var10000 = 1.0F / (float)au.a.z();
               break label17;
            }
         } catch (NumberFormatException var7) {
            throw var7.A<invokedynamic>(var7, -8721889945986759373L, var2);
         }

         var10000 = 0.016F;
      }

      float var6 = Math.clamp(var10000 * var5, 0.0F, 1.0F);
      return (1.0F - var6) * var1 + var6 * var4;
   }

   public void e() {
      this.P = false;
      this.J = false;
   }

   public static void X(int[] var0) {
      l = var0;
   }

   public static int[] W() {
      return l;
   }

   static {
      long var25 = c ^ 49431557504007L;
      i = new HashMap(13);
      null.A<invokedynamic>((Object)null, 2890909282088701224L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[6];
      int var21 = 0;
      String var20 = "<×\u009d³éÏhF\u00ad\u008eÁ\\©)\u0082 OÎ\u001f\u009a\\\u00028ËO\u0019m \u0080\u0084Û\u0098 \u000e58ôs\u008dyL+\u0095û¬öû&·+Ätz!ÔµèFý~Áõ=\u0005µ\u0080{Í1xA\u0099ï[~®\u0099°\u0089\tt\u0001\u001b~:\u0081§,÷3ªÄZ\u0095Ñ©dêù\u0017\u0083\u0087VÇCéé.»yv¼r¿µèRU\u009e\u009c©\u001f\u0089]T\u0001I{TM¶$v\u008eÒC\u0084Ó|\u0088Ð%Â\u001f¢Æn\u001e\u0016P\u009e\u0095\\(âBÑ\u00861\u008f«\u009d³¶æ\u0094~ÍÊ\u0087\u001cu0x\u001eJnÃ\u0088x{\u0084\u00144-\u001c³I\u00870ù;«1\u0010ßAÇ\u0084|Êp¹X\u0007\u0011çj\u0019QU";
      int var22 = "<×\u009d³éÏhF\u00ad\u008eÁ\\©)\u0082 OÎ\u001f\u009a\\\u00028ËO\u0019m \u0080\u0084Û\u0098 \u000e58ôs\u008dyL+\u0095û¬öû&·+Ätz!ÔµèFý~Áõ=\u0005µ\u0080{Í1xA\u0099ï[~®\u0099°\u0089\tt\u0001\u001b~:\u0081§,÷3ªÄZ\u0095Ñ©dêù\u0017\u0083\u0087VÇCéé.»yv¼r¿µèRU\u009e\u009c©\u001f\u0089]T\u0001I{TM¶$v\u008eÒC\u0084Ó|\u0088Ð%Â\u001f¢Æn\u001e\u0016P\u009e\u0095\\(âBÑ\u00861\u008f«\u009d³¶æ\u0094~ÍÊ\u0087\u001cu0x\u001eJnÃ\u0088x{\u0084\u00144-\u001c³I\u00870ù;«1\u0010ßAÇ\u0084|Êp¹X\u0007\u0011çj\u0019QU".length();
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
                  g = var23;
                  h = new String[6];
                  q = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[10];
                  int var8 = 0;
                  String var9 = "àÏ9\rÉ\u0085?W1ÿþå\u0004RWPÁi²nô\u000fÐkó\u0011ÛÇ\u0002Cº\u0000\t\u0006\u009ciáÕ\n£Ä\u00ad¡s\u008d`\u0086å\u00ad5\u0001\u0010=~\u0013«æ%õ5)\u0013¤^";
                  int var10 = "àÏ9\rÉ\u0085?W1ÿþå\u0004RWPÁi²nô\u000fÐkó\u0011ÛÇ\u0002Cº\u0000\t\u0006\u009ciáÕ\n£Ä\u00ad¡s\u008d`\u0086å\u00ad5\u0001\u0010=~\u0013«æ%õ5)\u0013¤^".length();
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
                              o = var11;
                              p = new Integer[10];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 3463797459148253797L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              r = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "9Ò\u007f\u0006¿¡Ëöh\u0099\u0080èäÛã\u0007";
                           var10 = "9Ò\u007f\u0006¿¡Ëöh\u0099\u0080èäÛã\u0007".length();
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

               var20 = "¢\u0017;ä\u0095áK n|E.©ªGß\u0088Q¨g\u000bÝâçDX¾ø\u009f\u0094ßõlY\u0086\u0004\u0010¯Ã\u001eËÀ±ñ\u00adxíB \u009a\u0089¦ÊttI\u0018\nc0þ\u0004}Vü\u0089.É¥4|1\u0016\u008dy¯%D\u009d\u0088b§\"\u0000}yºäg\u0088K\\&WBÓµS`*Sôá\u001fs°9Æ\u0018Y\"\u0007\u008aP\u0006l \u00ad\u009e\u0095ê\"@\u0092wK\u000eº&\u0082â\u008d7\u0011B¡nËJ\u0002G*ÎÎsàDÖßÏU\u000f\u0084";
               var22 = "¢\u0017;ä\u0095áK n|E.©ªGß\u0088Q¨g\u000bÝâçDX¾ø\u009f\u0094ßõlY\u0086\u0004\u0010¯Ã\u001eËÀ±ñ\u00adxíB \u009a\u0089¦ÊttI\u0018\nc0þ\u0004}Vü\u0089.É¥4|1\u0016\u008dy¯%D\u009d\u0088b§\"\u0000}yºäg\u0088K\\&WBÓµS`*Sôá\u001fs°9Æ\u0018Y\"\u0007\u008aP\u0006l \u00ad\u009e\u0095ê\"@\u0092wK\u000eº&\u0082â\u008d7\u0011B¡nËJ\u0002G*ÎÎsàDÖßÏU\u000f\u0084".length();
               var19 = 16;
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5448;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/az", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/az" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17521;
      if (p[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = o[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/az", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
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
         throw new RuntimeException("su/catlean/az" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
