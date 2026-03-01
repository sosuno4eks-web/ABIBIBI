package su.catlean;

import com.google.common.collect.Lists;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.PostTickEvent;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class u1 implements zh {
   @NotNull
   public static final u1 Z;
   @NotNull
   private static AtomicBoolean f;
   @NotNull
   private static ExecutorService u;
   @NotNull
   private static List l;
   private static String U;
   private static final long a = j0.a(3950228142087856728L, 6851459868329042448L, MethodHandles.lookup().lookupClass()).a(51117684542891L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private u1() {
   }

   @NotNull
   public final AtomicBoolean O() {
      return f;
   }

   public final void Y(long a, @NotNull AtomicBoolean <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.k<invokedynamic>(26133, 678603527217467299L ^ var1));
      f = var3;
   }

   @NotNull
   public final ExecutorService d() {
      return u;
   }

   public final void u(long a, @NotNull ExecutorService <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.k<invokedynamic>(27470, 4508390560766409069L ^ var1));
      u = var3;
   }

   @NotNull
   public final List x() {
      return l;
   }

   public final void m(@NotNull List <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(27470, 4508394623756282911L ^ var2));
      l = var1;
   }

   @Flow(
      priority = 20
   )
   private final void Q(TickEvent var1) {
      f.set(true);
   }

   @Flow(
      priority = -20
   )
   private final void l(PostTickEvent var1) {
      f.set(false);
   }

   public final boolean q(long param1, int param3) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = 20
   )
   public final void G(@NotNull PlayerUpdateEvent e) {
      long var2 = a ^ 81557436423569L;
      long var10001 = var2 ^ 126960480372834L;
      int var4 = (int)((var2 ^ 126960480372834L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, "e");
      ArrayList var10000 = Lists.newArrayList((Iterable)s8.i((char)var4, var5, (short)var6).method_18456());
      Intrinsics.checkNotNullExpressionValue(var10000, true.k<invokedynamic>(11340, 29244182351378316L ^ var2));
      l = (List)var10000;
   }

   public final void I(int delay, @NotNull Function0 runnable, long a) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.k<invokedynamic>(24269, 8113970079519539771L ^ var3));
      boolean var5 = false;
      this.d().execute((Runnable)(new fh(var1, var2)));
   }

   public static void U(u1 var0, int var1, Function0 var2, int var3, long var4, Object var6) {
      var4 ^= a;
      String[] var7 = -4794646004286538316L.A<invokedynamic>(-4794646004286538316L, var4);

      label33: {
         label32: {
            try {
               int var10000 = var3 & 1;
               if (var7 == null) {
                  break label33;
               }

               if (var10000 == 0) {
                  break label32;
               }
            } catch (NumberFormatException var9) {
               throw var9.A<invokedynamic>(var9, -4803475807859136666L, var4);
            }

            var1 = 0;
         }

         Intrinsics.checkNotNullParameter(var2, true.k<invokedynamic>(19030, 4008872686685364804L ^ var4));
         boolean var10 = false;
      }

      try {
         var0.d().execute((Runnable)(new fh(var1, var2)));
         if (var4 > 0L && var7 == null) {
            (new int[2]).A<invokedynamic>(new int[2], -4817521763963797857L, var4);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -4803475807859136666L, var4);
      }
   }

   static {
      long var9 = a ^ 139448187392780L;
      d = new HashMap(13);
      "HDhNpc".A<invokedynamic>("HDhNpc", 4620331409202076092L, var9);
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
      String var4 = "\u0090ºø\u0091\u0018ou$ô*\u009c\u0002ÂEw3H\u0012\u0088°%ª\u001e\u0080$\u0005\u0089À£`¯e8NA\u0002®¿\u008c´k\u0015ë¶\u0096\u0002\u0001Õ©D\u0093ïó\u0010\u0083\u0018ÏÙ\u0019öÌ\u008eF\u0090m¶Çõ<û\u0083\u0006¦ÃÑ©\u0011a\u0099\fâÖ\u009euÐw\u009aü® JÇ\u0018³¦((\u0085\b¶gêå\u0014¾|R\u0003&\u001f¢ÓíjvØPÐêZ¾\u0092 È\u0003FÂ\u0010ïl¼\u0089\u009b\u0006\u008aûÁê\u0002\u0083ó\fb\u0017Ö&§æ¤ï,®µ¿ã";
      int var6 = "\u0090ºø\u0091\u0018ou$ô*\u009c\u0002ÂEw3H\u0012\u0088°%ª\u001e\u0080$\u0005\u0089À£`¯e8NA\u0002®¿\u008c´k\u0015ë¶\u0096\u0002\u0001Õ©D\u0093ïó\u0010\u0083\u0018ÏÙ\u0019öÌ\u008eF\u0090m¶Çõ<û\u0083\u0006¦ÃÑ©\u0011a\u0099\fâÖ\u009euÐw\u009aü® JÇ\u0018³¦((\u0085\b¶gêå\u0014¾|R\u0003&\u001f¢ÓíjvØPÐêZ¾\u0092 È\u0003FÂ\u0010ïl¼\u0089\u009b\u0006\u008aûÁê\u0002\u0083ó\fb\u0017Ö&§æ¤ï,®µ¿ã".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var11 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var11.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  c = new String[6];
                  Z = new u1();
                  f = new AtomicBoolean(false);
                  ExecutorService var13 = Executors.newVirtualThreadPerTaskExecutor();
                  Intrinsics.checkNotNullExpressionValue(var13, true.k<invokedynamic>(30337, 3579937944902788057L ^ var9));
                  u = var13;
                  l = CollectionsKt.emptyList();
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

               var4 = "ÏÍ\u009aY±Ðg\u007f)\n9k<\u0084¦\t\u008c¸\u0089\u008cjÿbèfè1ÃKÒ\u0086ë\fö@áè.ª\u0001*oO\u0084íìG\u0011\u0010ò\u009c¹\u0011\u009f\u0003Â°\u0017x½ßìÖ$Ý";
               var6 = "ÏÍ\u009aY±Ðg\u007f)\n9k<\u0084¦\t\u008c¸\u0089\u008cjÿbèfè1ÃKÒ\u0086ë\fö@áè.ª\u0001*oO\u0084íìG\u0011\u0010ò\u009c¹\u0011\u009f\u0003Â°\u0017x½ßìÖ$Ý".length();
               var3 = '0';
               var2 = -1;
            }

            ++var2;
            var11 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   public static void F(String var0) {
      U = var0;
   }

   public static String p() {
      return U;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21529;
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
            throw new RuntimeException("su/catlean/u1", var10);
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
         throw new RuntimeException("su/catlean/u1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
