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
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2596;
import net.minecraft.class_7202;
import net.minecraft.class_7204;
import org.jetbrains.annotations.NotNull;

public final class h4 {
   private static String N;
   private static final long a = j0.a(4294046384456028157L, 8340081980995728682L, MethodHandles.lookup().lookupClass()).a(14758636985661L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   public static final void G(@NotNull class_2596 packet, long a) {
      var1 ^= a;
      long var3 = var1 ^ 10983697865302L;
      Intrinsics.checkNotNullParameter(var0, true.z<invokedynamic>(19281, 6073336847319307563L ^ var1));
      s8.Y(var3).method_52787(var0);
   }

   public static final void G(@NotNull class_2596[] packet, long a) {
      // $FF: Couldn't be decompiled
   }

   public static final void n(@NotNull class_7204 packetCreator, long a) {
      var1 ^= a;
      long var10001 = var1 ^ 114225493248825L;
      int var3 = (int)((var1 ^ 114225493248825L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 16711056060178L;
      Intrinsics.checkNotNullParameter(var0, true.z<invokedynamic>(21415, 6341976545229378801L ^ var1));
      AutoCloseable var9 = (AutoCloseable)s8.i((char)var3, var4, (short)var5).method_41925().method_41937();
      String var10000 = 5591912226184393267L.A<invokedynamic>(5591912226184393267L, var1);
      Throwable var10 = null;
      String var8 = var10000;

      try {
         class_7202 var11 = (class_7202)var9;
         boolean var12 = false;
         class_2596 var20 = var0.predict(var11.method_41942());
         Intrinsics.checkNotNullExpressionValue(var20, true.z<invokedynamic>(25331, 4545880793807267238L ^ var1));
         G(var20, var6);
         Unit var19 = Unit.INSTANCE;
      } catch (Throwable var17) {
         var10 = var17;
         throw var17;
      } finally {
         AutoCloseableKt.closeFinally(var9, var10);
      }

      try {
         if (var1 >= 0L && var8 != null) {
            (new int[2]).A<invokedynamic>(new int[2], 5596564016950906385L, var1);
         }

      } catch (Throwable var16) {
         throw var16.A<invokedynamic>(var16, 5564703092437500357L, var1);
      }
   }

   public static final void I(long a, @NotNull String command) {
      var0 ^= a;
      long var3 = var0 ^ 12822569969073L;
      Intrinsics.checkNotNullParameter(var2, true.z<invokedynamic>(27904, 4782989121418169502L ^ var0));
      s8.Y(var3).method_45730(var2);
   }

   public static void T(String var0) {
      N = var0;
   }

   public static String j() {
      return N;
   }

   static {
      long var9 = a ^ 75206525555344L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -1885851233683527276L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "»\"v½pÄ\tFÁRã\u008e)C\u0096ï\u0018z{4éu\u0081b+\u0088\u0095\u0019ÊAa\u0007\u007f¶Ç¶\u0097.ªlh q\u00827é\u0016m\u0016R>\u009etWÒ\u0087={4\u0097\u008aß,oº±>5È÷±×\u001eõ";
      int var6 = "»\"v½pÄ\tFÁRã\u008e)C\u0096ï\u0018z{4éu\u0081b+\u0088\u0095\u0019ÊAa\u0007\u007f¶Ç¶\u0097.ªlh q\u00827é\u0016m\u0016R>\u009etWÒ\u0087={4\u0097\u008aß,oº±>5È÷±×\u001eõ".length();
      char var3 = 16;
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
                  c = new String[5];
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

               var4 = "ÛÎ\u0005\fúl\u007fw\u0016ý<çDÄ¼¿\u0010\u0004:i\u0003õºv\u0015mÏü\u0085½¨`\u001e";
               var6 = "ÛÎ\u0005\fúl\u007fw\u0016ý<çDÄ¼¿\u0010\u0004:i\u0003õºv\u0015mÏü\u0085½¨`\u001e".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var11 = var4.substring(var2, var2 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3025;
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
            throw new RuntimeException("su/catlean/h4", var10);
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
         throw new RuntimeException("su/catlean/h4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
