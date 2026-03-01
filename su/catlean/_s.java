package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

public final class _s extends _i {
   @NotNull
   public static final _s e;
   private static final long a = j0.a(6145295821228050489L, 4577888435940690091L, MethodHandles.lookup().lookupClass()).a(70752589199977L);
   private static final String[] c;
   private static final String[] g;
   private static final Map i;

   private _s(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 38414179020573L;
      super(true.m<invokedynamic>(32137, 2949226329245320919L ^ var1), var3);
   }

   public void T(long a, @NotNull LiteralArgumentBuilder builder) {
      long var10001 = var1 ^ 8939855007606L;
      int var4 = (int)((var1 ^ 8939855007606L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 70331075405448L;
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(31641, 5010468800564010200L ^ var1));
      var3.then(this.t(var7, true.m<invokedynamic>(20916, 7245579896272959216L ^ var1)).executes(_s::F));
      IntegerArgumentType var10003 = IntegerArgumentType.integer();
      Intrinsics.checkNotNullExpressionValue(var10003, true.m<invokedynamic>(20662, 3206946675265583088L ^ var1));
      ArgumentType var9 = (ArgumentType)var10003;
      RequiredArgumentBuilder var10 = this.k("x", var4, (char)var5, var9, (short)var6);
      IntegerArgumentType var10004 = IntegerArgumentType.integer();
      Intrinsics.checkNotNullExpressionValue(var10004, true.m<invokedynamic>(31704, 8473474881998068895L ^ var1));
      var9 = (ArgumentType)var10004;
      var3.then(var10.then(this.k("z", var4, (char)var5, var9, (short)var6).executes(_s::P)));
      var3.executes(_s::s);
   }

   private static final int F(CommandContext var0) {
      pr.A.J((class_2338)null);
      return 1;
   }

   private static final int P(CommandContext var0) {
      Integer var1 = (Integer)var0.getArgument("x", Integer.TYPE);
      Integer var2 = (Integer)var0.getArgument("z", Integer.TYPE);
      pr var10000 = pr.A;
      Intrinsics.checkNotNull(var1);
      int var10003 = var1;
      Intrinsics.checkNotNull(var2);
      var10000.J(new class_2338(var10003, 0, var2));
      return 1;
   }

   private static final int s(CommandContext var0) {
      long var1 = a ^ 17446664555413L;
      long var3 = var1 ^ 2096153380816L;
      e.O(true.m<invokedynamic>(20896, 7480742196133732052L ^ var1), var3);
      return 1;
   }

   static {
      long var9 = a ^ 92082163088251L;
      long var11 = var9 ^ 78053099668504L;
      i = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "LÓg\u001c, V\u0018¼¢*y1\u008fì<\u0010ÜüR«º!ÌÂ»\u0015\u0087\u0005ÿÉµq îE<\u0094\u0005R<\u001dv¢5`QÓ¯\u0086õáûoHî5\u0095\"ó(b\u009ftêP íÿ\nª(¦HËÚèÂ}\u0010ßFVç\u008f(Öä\u0016ñ\u009cèK\rñ\u0090§äÕ";
      int var6 = "LÓg\u001c, V\u0018¼¢*y1\u008fì<\u0010ÜüR«º!ÌÂ»\u0015\u0087\u0005ÿÉµq îE<\u0094\u0005R<\u001dv¢5`QÓ¯\u0086õáûoHî5\u0095\"ó(b\u009ftêP íÿ\nª(¦HËÚèÂ}\u0010ßFVç\u008f(Öä\u0016ñ\u009cèK\rñ\u0090§äÕ".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var13 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = b(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var17;
               if ((var2 += var3) >= var6) {
                  c = var7;
                  g = new String[6];
                  e = new _s(var11);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var17;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\u0002¼\u0082\u0098èH\u0097;\u0090Ø\u001ff6\u0089ÉF UÇÅ*v$¶fð¿\u001dä\u0006\u00079El\u009eí¸$\u0093\u0080\u00063nkÝ\u0012\f>Â";
               var6 = "\u0002¼\u0082\u0098èH\u0097;\u0090Ø\u001ff6\u0089ÉF UÇÅ*v$¶fð¿\u001dä\u0006\u00079El\u009eí¸$\u0093\u0080\u00063nkÝ\u0012\f>Â".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var13 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1085;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_s", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/_s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
