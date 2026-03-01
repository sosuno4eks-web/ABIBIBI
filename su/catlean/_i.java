package su.catlean;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.jetbrains.annotations.NotNull;

public abstract class _i {
   @NotNull
   private final String F;
   @NotNull
   private final String y;
   private static String[] n;
   private static final long b = j0.a(3648848425474150401L, 7784880821278546741L, MethodHandles.lookup().lookupClass()).a(99680400898470L);
   private static final String[] d;
   private static final String[] f;
   private static final Map h;

   public _i(@NotNull String name, long a) {
      var2 ^= b;
      long var4 = var2 ^ 87616894681475L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(12502, 3891059057011392485L ^ var2));
      super();
      this.F = var1;
      String var10002 = this.F;
      this.y = nf.s.G(true.a<invokedynamic>(21532, 5030307804090276648L ^ var2) + var10002, var4, new Object[0]);
   }

   @NotNull
   public final String h() {
      return this.F;
   }

   public abstract void T(long var1, @NotNull LiteralArgumentBuilder var3);

   public final void k(long a, @NotNull CommandDispatcher dispatcher) {
      var1 ^= b;
      long var4 = var1 ^ 42961984654379L;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(554, 1249428030085664286L ^ var1));
      LiteralArgumentBuilder var6 = LiteralArgumentBuilder.literal(this.F);
      Intrinsics.checkNotNull(var6);
      this.T(var4, var6);
      var3.register(var6);
   }

   @NotNull
   public final RequiredArgumentBuilder k(@NotNull String name, int a, char a, @NotNull ArgumentType type, short a) {
      long var6 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ b;
      -3354448963281256581L.A<invokedynamic>(-3354448963281256581L, var6);
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(20354, 6600411848063319235L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.a<invokedynamic>(20971, 4473718825953813163L ^ var6));

      try {
         RequiredArgumentBuilder var10000 = RequiredArgumentBuilder.argument(var1, var4);
         Intrinsics.checkNotNullExpressionValue(var10000, true.a<invokedynamic>(2219, 4588964190714084327L ^ var6));
         if (-3317580206591716193L.A<invokedynamic>(-3317580206591716193L, var6) == null) {
            (new String[1]).A<invokedynamic>(new String[1], -3357340143722372775L, var6);
         }

         return var10000;
      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, -3372635183176656931L, var6);
      }
   }

   @NotNull
   public final LiteralArgumentBuilder t(long a, @NotNull String name) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(20354, 6600421407554934077L ^ var1));
      LiteralArgumentBuilder var10000 = LiteralArgumentBuilder.literal(var3);
      Intrinsics.checkNotNullExpressionValue(var10000, true.a<invokedynamic>(811, 773745033985743255L ^ var1));
      return var10000;
   }

   public final void O(@NotNull String msg, long a) {
      var2 ^= b;
      long var10001 = var2 ^ 21500957217169L;
      int var4 = (int)((var2 ^ 21500957217169L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      var10001 = var2 ^ 122726927245916L;
      int var7 = (int)((var2 ^ 122726927245916L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(8294, 306100322243064755L ^ var2));
      this.n(var4, hl.W(var7, var8, var1), var5, (char)var6);
   }

   public final void n(int a, @NotNull class_2561 msg, int a, char a) {
      // $FF: Couldn't be decompiled
   }

   private static final void G(class_5250 var0) {
      long var1 = b ^ 110483528591176L;
      long var3 = var1 ^ 132489927973230L;
      s8.f(var3).method_7353((class_2561)var0, false);
   }

   public static void B(String[] var0) {
      n = var0;
   }

   public static String[] C() {
      return n;
   }

   static {
      long var9 = b ^ 396933257800L;
      String[] var10000 = new String[5];
      h = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -6400082354903935201L, var9);
      Cipher var0;
      Cipher var11 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var11.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "\u000b*ø\u0019Úëð K\u0007a6Á6\u008f\u0099\u00ad|%\tH{öèBp_èt?d\u0010wWÁ\u0013ý\u009eº´ NÎf\u0012M6gg¡¶ô¨ntÏ%/<lÜ\u0012ôö6/Z\u001eï_\"D\u0004\u0010m¢V£\u0089ü\u001c\u0098z\u00ad\u000eòâm\u0001=\u00107/\u0082\u0086\u0087Û+v8\u001aZ{Që¬\u0088\u0010Qá\u0093\rUÚ\n:\u008cT\u0019Fs\u009f1(\u00107\u0001\u0098Þ\u0095\u0014½é\u008bë:Ö\nü»9 \u0084kâÃ~b9P(Qp=3ÇE\u0099Ópâ\u0081(\u001d\\3 ³\u0099äIyvU";
      int var6 = "\u000b*ø\u0019Úëð K\u0007a6Á6\u008f\u0099\u00ad|%\tH{öèBp_èt?d\u0010wWÁ\u0013ý\u009eº´ NÎf\u0012M6gg¡¶ô¨ntÏ%/<lÜ\u0012ôö6/Z\u001eï_\"D\u0004\u0010m¢V£\u0089ü\u001c\u0098z\u00ad\u000eòâm\u0001=\u00107/\u0082\u0086\u0087Û+v8\u001aZ{Që¬\u0088\u0010Qá\u0093\rUÚ\n:\u008cT\u0019Fs\u009f1(\u00107\u0001\u0098Þ\u0095\u0014½é\u008bë:Ö\nü»9 \u0084kâÃ~b9P(Qp=3ÇE\u0099Ópâ\u0081(\u001d\\3 ³\u0099äIyvU".length();
      char var3 = '(';
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var12 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  d = var7;
                  f = new String[9];
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var16;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\u001c\u0015\u009búµOÇÇ96Tµ=ú9Ñ jÊØ_ØèÜö}gÇFºÞ\u0000ã7Êâ/\u0006öÜïÙwÅø\u0084¢\u001fª";
               var6 = "\u001c\u0015\u009búµOÇÇ96Tµ=ú9Ñ jÊØ_ØèÜö}gÇFºÞ\u0000ã7Êâ/\u0006öÜïÙwÅø\u0084¢\u001fª".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25446;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_i", var10);
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
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/_i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
