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
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;

public final class e9 {
   @NotNull
   public static final e9 A;
   @NotNull
   private static final Map D;
   private static final long a = j0.a(5725783215491266187L, 7587853716793087687L, MethodHandles.lookup().lookupClass()).a(114156467870712L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private e9() {
   }

   @NotNull
   public final Map w() {
      return D;
   }

   public final void g(long a, @NotNull class_4587 matrixStack) {
      // $FF: Couldn't be decompiled
   }

   public final void u(@NotNull class_2338 pos, @NotNull Color lineColor, @NotNull Color fillColor, long a, @NotNull py animationMode, @NotNull vr renderMode) {
      // $FF: Couldn't be decompiled
   }

   public final boolean O(@NotNull class_2338 pos, long a, short a) {
      long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.q<invokedynamic>(29925, 553408196966379070L ^ var5));
      return D.keySet().stream().anyMatch(e9::a);
   }

   private static final boolean c(class_2338 var0, hm var1) {
      return Intrinsics.areEqual((Object)var1.p(), (Object)var0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var0 = a ^ 110885628677585L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "µ¶+\"\u0000Þ7&6\u009ae|}\u0001\nmÏØ\u009a\u009cÏå¡ko:¸\u000e@,íY\u0018u«R\u0002¸à÷lÐsºnÜüU¯»S\n´?j´¾\u00103\u0007î=z\u001bsJÓty\u0081»_hw  A\u0005ÐñÁî¾ã¯\u0090£ô\u0010¢°\u0011w1\u0080ôÊ3\u0082\u0014{\u0002Éá\u008f}[\u0010}µ_º®÷àÉ\u0001á$\bÿÑG\u0083";
      int var8 = "µ¶+\"\u0000Þ7&6\u009ae|}\u0001\nmÏØ\u009a\u009cÏå¡ko:¸\u000e@,íY\u0018u«R\u0002¸à÷lÐsºnÜüU¯»S\n´?j´¾\u00103\u0007î=z\u001bsJÓty\u0081»_hw  A\u0005ÐñÁî¾ã¯\u0090£ô\u0010¢°\u0011w1\u0080ôÊ3\u0082\u0014{\u0002Éá\u008f}[\u0010}µ_º®÷àÉ\u0001á$\bÿÑG\u0083".length();
      char var5 = ' ';
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[7];
                  A = new e9();
                  D = (Map)(new ConcurrentHashMap());
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "@u@\u0003\u008d®«Êà\u0097Ø¨&\u009f\u0085\\=¯\u0096\bÖS\u009f\u008cP£Ô\u0080Ç¹Ò\u0091 ²\u0099ädù\u0097d\u0010MSM¿\boÕ¦\u0083\\\u0012\u008fA\u00adÕYÔ'\u0086àÑ£z\u001e";
               var8 = "@u@\u0003\u008d®«Êà\u0097Ø¨&\u009f\u0085\\=¯\u0096\bÖS\u009f\u008cP£Ô\u0080Ç¹Ò\u0091 ²\u0099ädù\u0097d\u0010MSM¿\boÕ¦\u0083\\\u0012\u008fA\u00adÕYÔ'\u0086àÑ£z\u001e".length();
               var5 = ' ';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22302;
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
            throw new RuntimeException("su/catlean/e9", var10);
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
         throw new RuntimeException("su/catlean/e9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
