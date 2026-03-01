package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.DisconnectEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

public final class gn implements zh {
   @NotNull
   public static final gn Y;
   public static final double t = -0.0784D;
   public static final double I = 0.2837D;
   public static final double O = 0.08511D;
   public static final double G = 0.45392000000000005D;
   public static final double M = 0.056740000000000006D;
   @NotNull
   private static final Map H;
   private static int C;
   private static final long a = j0.a(7868309634298412647L, 6143227429197347539L, MethodHandles.lookup().lookupClass()).a(243071797221323L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private gn() {
   }

   @NotNull
   public final Map k() {
      return H;
   }

   @Flow(
      priority = 20
   )
   private final void f(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void r(EntityRemove var1) {
      long var2 = a ^ 88270362022963L;
      if (var1.getEntity() != null) {
         Map var4 = H;
         synchronized(var4) {
            boolean var6 = false;
            gn var10000 = Y;
            Map var9 = H;
            class_1297 var10001 = var1.getEntity();
            Intrinsics.checkNotNull(var10001);
            g7 var10 = (g7)var9.remove(var10001.method_5628());
         }
      }

   }

   @Flow
   private final void V(DisconnectEvent var1) {
      H.clear();
   }

   @NotNull
   public final synchronized class_243 x(long a, @NotNull class_1657 player, int ticks) {
      var1 ^= a;
      long var5 = var1 ^ 2739221732194L;
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(24435, 3842936989333940054L ^ var1));
      class_243 var10000 = this.s(var3, var5, var4).method_1005().method_1031(0.0D, -var3.method_5829().method_17940() / 2.0D, 0.0D);
      Intrinsics.checkNotNullExpressionValue(var10000, true.r<invokedynamic>(5419, 8658853463581797640L ^ var1));
      return var10000;
   }

   @NotNull
   public final synchronized class_238 s(@NotNull class_1657 player, long a, int ticks) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_243 P(@NotNull class_1657 entity, int a, byte a, int ticks, int a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var9 = a ^ 122529107065825L;
      d = new HashMap(13);
      0.A<invokedynamic>(0, -8372428924510791097L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "U´ÎÈ~ÛVëMº©\u0092MÀ\u0003 \u0018\u008b{ó\u00066$\u001an·\u0017\u000b`íNÖD\n\u009bûô[S;x(,]@0Y¼ú-×\u001dÙÑ1ÿð~åx\u0088°n«¹\u0081lïj<\u0003ÎH\u0005mE×#Ó¡ù\u0017(BÙ{\u000bBä\u001a\u008eÑk\u0005ñCrä\u00108CÍÃ-YK°\u0094\u009d~\u009a\u0098rä5w0\u0086ã\u0086\u0081Ò]\u0010\u0080gð=wä±±,)¦¹$4\u0018´(l-ªæÊ¸5ËSÅäØT£Q\u009b'¼Õé\u0089«©®5}\u008f\u0092\n5I\\xrS\u0005\u0086\u0092ä\"";
      int var6 = "U´ÎÈ~ÛVëMº©\u0092MÀ\u0003 \u0018\u008b{ó\u00066$\u001an·\u0017\u000b`íNÖD\n\u009bûô[S;x(,]@0Y¼ú-×\u001dÙÑ1ÿð~åx\u0088°n«¹\u0081lïj<\u0003ÎH\u0005mE×#Ó¡ù\u0017(BÙ{\u000bBä\u001a\u008eÑk\u0005ñCrä\u00108CÍÃ-YK°\u0094\u009d~\u009a\u0098rä5w0\u0086ã\u0086\u0081Ò]\u0010\u0080gð=wä±±,)¦¹$4\u0018´(l-ªæÊ¸5ËSÅäØT£Q\u009b'¼Õé\u0089«©®5}\u008f\u0092\n5I\\xrS\u0005\u0086\u0092ä\"".length();
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
                  c = new String[8];
                  Y = new gn();
                  Map var13 = Collections.synchronizedMap((Map)(new HashMap()));
                  Intrinsics.checkNotNullExpressionValue(var13, true.r<invokedynamic>(27584, 4678475818353256432L ^ var9));
                  H = var13;
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

               var4 = "jÓýYäs^\u0093\"\u009b¤+Ã\u0003z\u00931WÁ\u0086¡¸ìZdG\u009bpä\u009aêN\u0010Ð\u0011¬×öÖ8\u0011Í \u0081uíí«\u008b";
               var6 = "jÓýYäs^\u0093\"\u009b¤+Ã\u0003z\u00931WÁ\u0086¡¸ìZdG\u009bpä\u009aêN\u0010Ð\u0011¬×öÖ8\u0011Í \u0081uíí«\u008b".length();
               var3 = ' ';
               var2 = -1;
            }

            ++var2;
            var11 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   public static void Q(int var0) {
      C = var0;
   }

   public static int T() {
      return C;
   }

   public static int Z() {
      int var0 = T();

      try {
         return var0 == 0 ? 45 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1727;
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
            throw new RuntimeException("su/catlean/gn", var10);
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
         throw new RuntimeException("su/catlean/gn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
