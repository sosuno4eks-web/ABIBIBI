package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
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
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;

public final class _1 extends _i {
   @NotNull
   public static final _1 a;
   private static final long c = j0.a(1909341030940494772L, 1825926459973715339L, MethodHandles.lookup().lookupClass()).a(3319516106543L);
   private static final String[] e;
   private static final String[] g;
   private static final Map i;
   private static final long j;

   private _1(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 31983752913692L;
      super(true.v<invokedynamic>(13248, 8987778122168001857L ^ var1), var3);
   }

   public void T(long a, @NotNull LiteralArgumentBuilder builder) {
      long var10001 = var1 ^ 8939855007606L;
      int var4 = (int)((var1 ^ 8939855007606L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(30039, 2420966065620333512L ^ var1));
      String var10002 = 20051.v<invokedynamic>(20051, 4629909780848675018L ^ var1);
      IntegerArgumentType var10003 = IntegerArgumentType.integer();
      Intrinsics.checkNotNullExpressionValue(var10003, true.v<invokedynamic>(31358, 3486256447272107236L ^ var1));
      ArgumentType var7 = (ArgumentType)var10003;
      var3.then(this.k(var10002, var4, (char)var5, var7, (short)var6).executes(_1::l));
      var3.executes(_1::L);
   }

   public final void j(long delay, long a) {
      var3 ^= c;
      long var5 = var3 ^ 44220040505977L;
      long var7 = var3 ^ 77529048549337L;
      long var9 = var3 ^ 42359389260334L;
      s8.Y(var9).method_45730(true.v<invokedynamic>(5538, 6556459201308439953L ^ var3));
      s8.r(var5).method_2906(s8.f(var7).field_7512.field_7763, 1, s8.f(var7).method_31548().method_67532(), class_1713.field_7791, (class_1657)s8.f(var7));
      u1 var11 = u1.Z;
      byte var12 = 0;
      boolean var13 = false;
      var11.d().execute((Runnable)(new br(var12, var1)));
   }

   private static final int l(CommandContext var0) {
      long var1 = c ^ 49673034394549L;
      long var3 = var1 ^ 29097303600742L;
      long var5 = (long)((Number)var0.getArgument(true.v<invokedynamic>(30881, 7458598518347890610L ^ var1), Integer.TYPE)).intValue();
      a.j(var5, var3);
      return 1;
   }

   private static final int L(CommandContext var0) {
      long var1 = c ^ 124614989926593L;
      long var3 = var1 ^ 77025571591442L;
      a.j(j, var3);
      return 1;
   }

   static {
      long var14 = c ^ 7194420378121L;
      long var16 = var14 ^ 48587023190379L;
      i = new HashMap(13);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "M\u0081\u001a\u008ar\u0093³\u008f\u008c\u0010\u0011îB¶î\u0015·\bu¥«í¤´¾·\u009f\u0093z»ùØ\u0010²Qz»\u0015ýð\u001csTF½®Æmß \u0001\u0004A\u0099\u009fãaàp¶ä\u0095ð\u0011\u0001õè\ný; Ú\u0086\u000f\u001aÞBÉ1Ô\"\u009b\u0010}\u009cÖ\u0018øÏ\u0088üÇÝ«\ný¡\u009bF";
      int var11 = "M\u0081\u001a\u008ar\u0093³\u008f\u008c\u0010\u0011îB¶î\u0015·\bu¥«í¤´¾·\u009f\u0093z»ùØ\u0010²Qz»\u0015ýð\u001csTF½®Æmß \u0001\u0004A\u0099\u009fãaàp¶ä\u0095ð\u0011\u0001õè\ný; Ú\u0086\u000f\u001aÞBÉ1Ô\"\u009b\u0010}\u009cÖ\u0018øÏ\u0088üÇÝ«\ný¡\u009bF".length();
      char var8 = ' ';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var18 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
            String var23 = b(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var23;
               if ((var7 += var8) >= var11) {
                  e = var12;
                  g = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 5786902398752600595L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var25 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var21 = true;
                  j = var25;
                  a = new _1(var16);
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var23;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "`!¿U\r_\u009d<è-0\u0081$\u0019WÚ\u0010Â°¼Ø¨)u\u000eë\u0093ÎÁo\u0093TÀ";
               var11 = "`!¿U\r_\u009d<è-0\u0081$\u0019WÚ\u0010Â°¼Ø¨)u\u000eë\u0093ÎÁo\u0093TÀ".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var18 = var9.substring(var7, var7 + var8);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9698;
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
            throw new RuntimeException("su/catlean/_1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/_1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
