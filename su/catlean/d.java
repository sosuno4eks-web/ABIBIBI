package su.catlean;

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
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;

public final class d {
   private static int[] D;
   private static final long a = j0.a(5451801125443356115L, 7754912051318391452L, MethodHandles.lookup().lookupClass()).a(110851071228830L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   public static final boolean Q(@NotNull class_1799 stack, long a, @NotNull class_5321 enchantment) {
      var1 ^= a;
      long var10001 = var1 ^ 56907922050176L;
      int var4 = (int)((var1 ^ 56907922050176L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(20357, 3892610863787616043L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(5151, 2638057825830993074L ^ var1));
      return class_1890.method_57532(var0).method_57534().contains(s8.i((char)var4, var5, (short)var6).method_30349().method_58561(var3).get());
   }

   public static final int F(@NotNull class_1799 stack, long a, @NotNull class_5321 enchantment) {
      var1 ^= a;
      long var10001 = var1 ^ 73054746030133L;
      int var4 = (int)((var1 ^ 73054746030133L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(748, 9099106301370455798L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(26814, 2163021458198641831L ^ var1));
      return class_1890.method_8225((class_6880)s8.i((char)var4, var5, (short)var6).method_30349().method_58561(var3).get(), var0);
   }

   public static void W(int[] var0) {
      D = var0;
   }

   public static int[] G() {
      return D;
   }

   static {
      long var9 = a ^ 103384439359957L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -4266280117178227011L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "AÕvþcèå×\u008c\u008ab\u0012±\u0090G\u0082ßmÎ¤Ðp¨Ch´¶+ã*qt\u0018òr&¤\u008eÚäV~]XmDz·x\u0081\u001dpc\u0088b\u0011\u0000";
      int var6 = "AÕvþcèå×\u008c\u008ab\u0012±\u0090G\u0082ßmÎ¤Ðp¨Ch´¶+ã*qt\u0018òr&¤\u008eÚäV~]XmDz·x\u0081\u001dpc\u0088b\u0011\u0000".length();
      char var3 = ' ';
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var11 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var15;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  c = new String[4];
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var15;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "J#â\u0000#2+\u0090\u0012Oý-{nþ½\u0010\u0010M]åZ\u0017/Ý5û8xQ¶é¸";
               var6 = "J#â\u0000#2+\u0090\u0012Oý-{nþ½\u0010\u0010M]åZ\u0017/Ý5û8xQ¶é¸".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var11 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9106;
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
            throw new RuntimeException("su/catlean/d", var10);
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
         throw new RuntimeException("su/catlean/d" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
