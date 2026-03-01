package su.catlean;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2784;
import org.jetbrains.annotations.NotNull;

public final class g7 {
   @NotNull
   private final class_1657 E;
   @NotNull
   private final ArrayList p;
   private static final long a = j0.a(6773491312526236062L, 7551346510836817755L, MethodHandles.lookup().lookupClass()).a(267096592747750L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public g7(long a, @NotNull class_1657 target) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(11849, 2208466120661520456L ^ var1));
      super();
      this.E = var3;
      this.p = new ArrayList();
   }

   @NotNull
   public final class_1657 j() {
      return this.E;
   }

   @NotNull
   public final synchronized ArrayList l() {
      return this.p;
   }

   public final void G(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final double B(double d) {
      return (var1 - 0.08D) * 0.98D;
   }

   public final boolean e(int a, byte a, int a, @NotNull class_1657 player, @NotNull class_238 box) {
      long var6 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
      long var10001 = var6 ^ 119850171241503L;
      int var8 = (int)((var6 ^ 119850171241503L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(15024, 9161132594563397094L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.j<invokedynamic>(4724, 2281694466086706467L ^ var6));
      return s8.i((char)var8, var9, (short)var10).method_20812((class_1297)var4, var5).iterator().hasNext();
   }

   @NotNull
   public final class_238 y(long a, @NotNull class_1657 entity) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.j<invokedynamic>(26343, 8688616099989492652L ^ var1));
      class_238 var10000 = var3.method_5829();
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(18271, 1232478927827350045L ^ var1));
      class_238 var5 = var10000;
      k9[] var11 = -6250332563130103657L.A<invokedynamic>(-6250332563130103657L, var1);
      class_243 var6 = new class_243(var3.field_6014, var3.field_6036, var3.field_5969);
      k9[] var4 = var11;

      int var12;
      label32: {
         label31: {
            try {
               double var13;
               var12 = (var13 = var6.method_1027() - 0.0D) == 0.0D ? 0 : (var13 < 0.0D ? -1 : 1);
               if (var4 == null) {
                  break label32;
               }

               if (var12 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -6274888738963062616L, var1);
            }

            var12 = 0;
            break label32;
         }

         var12 = 1;
      }

      try {
         if (var12 != 0) {
            var10000 = var3.method_5829();
            Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(19091, 3859707775044009938L ^ var1));
            return var10000;
         }
      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, -6274888738963062616L, var1);
      }

      double var7 = var5.method_17939() / 2.0D;
      return new class_238(-var7 + var6.field_1352, var6.field_1351, -var7 + var6.field_1350, var7 + var6.field_1352, var5.method_17940() + var6.field_1351, var7 + var6.field_1350);
   }

   private final List M(class_1297 var1, List var2, long var3, class_238 var5) {
      var3 ^= a;
      long var10001 = var3 ^ 72587008319446L;
      int var6 = (int)((var3 ^ 72587008319446L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      Builder var10000 = ImmutableList.builderWithExpectedSize(var2.size() + 1);
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(1404, 2350898142478303718L ^ var3));
      Builder var9 = var10000;

      try {
         if (!var2.isEmpty()) {
            var9.addAll((Iterable)var2);
         }
      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, -2796137142248246927L, var3);
      }

      class_2784 var14 = s8.i((char)var6, var7, (short)var8).method_8621();
      Intrinsics.checkNotNullExpressionValue(var14, true.j<invokedynamic>(8807, 1507536658309424886L ^ var3));
      class_2784 var10 = var14;
      boolean var11 = var10.method_39459(var1, var5);

      try {
         if (var3 > 0L && var11) {
            var9.add(var10.method_17903());
         }
      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, -2796137142248246927L, var3);
      }

      ImmutableList var15 = var9.addAll(s8.i((char)var6, var7, (short)var8).method_20812(var1, var5)).build();
      Intrinsics.checkNotNullExpressionValue(var15, true.j<invokedynamic>(17859, 4089852951785193818L ^ var3));
      return (List)var15;
   }

   @NotNull
   public final class_238 q(@NotNull class_238 box, int a, double motionX, int a, double motionY, double motionZ, short a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 130278888522774L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[14];
      int var18 = 0;
      String var17 = "®D¡B7¢Þ)µµiCÀw?;(\u008cÖµ\u0014_;Ý?\u0002\u0097\rlãè\u00adU@Ð÷sþ\u0093\u001bÜåëHË\u009co9x\r¢P$hS<\u00060\u0085\u001a$Ë \u001d\u0010ÀÞDÜ\u0091q\u000eî\u0093q/b\u0086E\u0098\u0019·qL¤\u001d;ÿ\u009bg{Â\u0004\u001e¶Ñ\u0019f\u0000¢\u001d\u0088\u001bh%»(¡ÜO\\UpF\u001fkÌ\u0085=.'D£3\u009apþ< b±ôµ\u001bF\u00111\u000e\u001eé|&.\u008bÛÀ\u0006\u0010\u0093éîzÜw/±[P\u009c\tçØð\u0085\u0010\u0010\u0013[\u0086ÉB;E5öVûÌzØa \u0000\u000eµD\u001fñ\u0082%\u009c\u0096ºÊ\u008c\u0017e\u0084hg÷\u0096ù\u0012f´µvËcXÃ¸¡ Ûß\bs\u0005\u0007\u0088y\u0016ù5qü¬»\u0094Cþ@5\u0095QMý\u0086\b\u009f\u009f8\u0014\f¸0\u0015\u009cGÑ\u0011\u0080Ú]\u009d¶NZi¦öìëä\u001dWdl\u001cõ\u0006\u008eZ\u0003óñcÂ\u0082î\u008c£í\r\u0006Ñ)0¦\u0084Ú@\u0089\u008e(\u009d?VÂÊ)x\t\u00943\u0094E\r7,*çñ~/1'zº¨¼ßÂØ¡\u0083\u001f\u009cü¿¹Ëv\u0095ò(¹I\tx\u008d\u001e\u000b\u0080a Á,).K\\\u0083\nØd\u008aÑa)(«vÛqofo\u001f¸ÿ%ácÉ; ZH\u008e±+\u0092È\u0090kl\u008b5\u0088\u0099ðVÍÁ\f¬jÁ ¨±xc¸©ÛÎ\u0091";
      int var19 = "®D¡B7¢Þ)µµiCÀw?;(\u008cÖµ\u0014_;Ý?\u0002\u0097\rlãè\u00adU@Ð÷sþ\u0093\u001bÜåëHË\u009co9x\r¢P$hS<\u00060\u0085\u001a$Ë \u001d\u0010ÀÞDÜ\u0091q\u000eî\u0093q/b\u0086E\u0098\u0019·qL¤\u001d;ÿ\u009bg{Â\u0004\u001e¶Ñ\u0019f\u0000¢\u001d\u0088\u001bh%»(¡ÜO\\UpF\u001fkÌ\u0085=.'D£3\u009apþ< b±ôµ\u001bF\u00111\u000e\u001eé|&.\u008bÛÀ\u0006\u0010\u0093éîzÜw/±[P\u009c\tçØð\u0085\u0010\u0010\u0013[\u0086ÉB;E5öVûÌzØa \u0000\u000eµD\u001fñ\u0082%\u009c\u0096ºÊ\u008c\u0017e\u0084hg÷\u0096ù\u0012f´µvËcXÃ¸¡ Ûß\bs\u0005\u0007\u0088y\u0016ù5qü¬»\u0094Cþ@5\u0095QMý\u0086\b\u009f\u009f8\u0014\f¸0\u0015\u009cGÑ\u0011\u0080Ú]\u009d¶NZi¦öìëä\u001dWdl\u001cõ\u0006\u008eZ\u0003óñcÂ\u0082î\u008c£í\r\u0006Ñ)0¦\u0084Ú@\u0089\u008e(\u009d?VÂÊ)x\t\u00943\u0094E\r7,*çñ~/1'zº¨¼ßÂØ¡\u0083\u001f\u009cü¿¹Ëv\u0095ò(¹I\tx\u008d\u001e\u000b\u0080a Á,).K\\\u0083\nØd\u008aÑa)(«vÛqofo\u001f¸ÿ%ácÉ; ZH\u008e±+\u0092È\u0090kl\u008b5\u0088\u0099ðVÍÁ\f¬jÁ ¨±xc¸©ÛÎ\u0091".length();
      char var16 = 16;
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[14];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "§µizEÐD\u0002¡9Ù\u008aø8Ú\f";
                  int var5 = "§µizEÐD\u0002¡9Ù\u008aø8Ú\f".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[2];
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "q\u008aÔðà¡ëf\u008f\u001ca¦O1¥í\u0010±4HÆ)cýÖ<}µÒbæ\u0088\u0082";
               var19 = "q\u008aÔðà¡ëf\u008f\u001ca¦O1¥í\u0010±4HÆ)cýÖ<}µÒbæ\u0088\u0082".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23803;
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
            throw new RuntimeException("su/catlean/g7", var10);
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
         throw new RuntimeException("su/catlean/g7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32277;
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
            throw new RuntimeException("su/catlean/g7", var14);
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
         throw new RuntimeException("su/catlean/g7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
