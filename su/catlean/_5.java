package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
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
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

public final class _5 extends _i {
   @NotNull
   public static final _5 I;
   private static final long a = j0.a(7686222034304334475L, 1353786155461014437L, MethodHandles.lookup().lookupClass()).a(119344649122329L);
   private static final String[] c;
   private static final String[] e;
   private static final Map g;

   private _5(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 90952735527263L;
      super(true.l<invokedynamic>(4620, 8187706607685925703L ^ var4), var6);
   }

   public void T(long a, @NotNull LiteralArgumentBuilder builder) {
      long var10001 = var1 ^ 8939855007606L;
      int var4 = (int)((var1 ^ 8939855007606L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(412, 1252065784004692613L ^ var1));
      String var10002 = 4020.l<invokedynamic>(4020, 476579473588470947L ^ var1);
      StringArgumentType var10003 = StringArgumentType.string();
      Intrinsics.checkNotNullExpressionValue(var10003, true.l<invokedynamic>(3414, 7891578483799443013L ^ var1));
      ArgumentType var7 = (ArgumentType)var10003;
      RequiredArgumentBuilder var8 = this.k(var10002, var4, (char)var5, var7, (short)var6);
      String var9 = 31414.l<invokedynamic>(31414, 349089286191690144L ^ var1);
      StringArgumentType var10004 = StringArgumentType.string();
      Intrinsics.checkNotNullExpressionValue(var10004, true.l<invokedynamic>(3733, 7306698646706603396L ^ var1));
      var7 = (ArgumentType)var10004;
      ((LiteralArgumentBuilder)var3.then(var8.then(this.k(var9, var4, (char)var5, var7, (short)var6).executes(_5::N)))).executes(_5::A);
   }

   private static final float r(long param0, String param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   private static final int N(CommandContext var0) {
      long var1 = a ^ 117018613038710L;
      long var3 = var1 ^ 113164590738837L;
      long var5 = var1 ^ 98753795468622L;
      String var7 = (String)var0.getArgument(true.l<invokedynamic>(2413, 8963550799772110494L ^ var1), String.class);
      String var8 = (String)var0.getArgument(true.l<invokedynamic>(31710, 5783720967958838316L ^ var1), String.class);
      class_746 var10000 = s8.f(var3);
      Intrinsics.checkNotNull(var7);
      var10000.method_36456(r(var5, var7, s8.f(var3).method_36454()));
      var10000 = s8.f(var3);
      Intrinsics.checkNotNull(var8);
      var10000.method_36457(r(var5, var8, s8.f(var3).method_36455()));
      return 1;
   }

   private static final int A(CommandContext var0) {
      long var1 = a ^ 20425466722519L;
      long var3 = var1 ^ 84988988188066L;
      I.O(true.l<invokedynamic>(19793, 7547920089316756487L ^ var1), var3);
      return 1;
   }

   static {
      long var9 = a ^ 27505298049155L;
      long var10001 = var9 ^ 136415985584546L;
      int var11 = (int)((var9 ^ 136415985584546L) >>> 32);
      long var12 = var10001 << 32 >>> 32;
      g = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "\\vÀív©3iJ7\u0000}èÚ\u0087å«h\u001eÎÐ{\u007fGSòZ\u0006\u0000\u0010Ø\u001d Nwû\u0083ÔV\fD\u0015ÝP9îÚÉp¶ªÙúàà'¼ÇéðF2¸\u0012i 1\u008d\u0000\u0014\u0017ÚA\u000b~£VÒG\u0006*sVtFW3Ø^~«\u00059\u0094²×ñê\u0010\u0089Rë1\u009f¨é~Zoú¨M»Wò\u0010%9\u001d\u0097Ñ;£Ås'T¶¤qOç\u0010òIX§© é?è\u0080\u000b(ÔÕÊZ\u0010òÀÚ?¶\u0019\u000bÑ$I\u0092T\u0006WTu";
      int var6 = "\\vÀív©3iJ7\u0000}èÚ\u0087å«h\u001eÎÐ{\u007fGSòZ\u0006\u0000\u0010Ø\u001d Nwû\u0083ÔV\fD\u0015ÝP9îÚÉp¶ªÙúàà'¼ÇéðF2¸\u0012i 1\u008d\u0000\u0014\u0017ÚA\u000b~£VÒG\u0006*sVtFW3Ø^~«\u00059\u0094²×ñê\u0010\u0089Rë1\u009f¨é~Zoú¨M»Wò\u0010%9\u001d\u0097Ñ;£Ås'T¶¤qOç\u0010òIX§© é?è\u0080\u000b(ÔÕÊZ\u0010òÀÚ?¶\u0019\u000bÑ$I\u0092T\u0006WTu".length();
      char var3 = ' ';
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var14 = var4.substring(var2, var2 + var3);
         byte var16 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch(var16) {
            case 0:
               var7[var5++] = var19;
               if ((var2 += var3) >= var6) {
                  c = var7;
                  e = new String[9];
                  I = new _5(var11, var12);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var19;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\bº6\u0094Oà\u009f*÷@Í4\u0090yM~\u0010yºý»·+y\\mj²ÉåÑsë";
               var6 = "\bº6\u0094Oà\u009f*÷@Í4\u0090yM~\u0010yºý»·+y\\mj²ÉåÑsë".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var14 = var4.substring(var2, var2 + var3);
            var16 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10345;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_5", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/_5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
