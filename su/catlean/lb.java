package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class lb implements zh {
   @NotNull
   public static final lb s;
   @NotNull
   private static final ConcurrentHashMap C;
   private static final long a = j0.a(1537766985338992264L, 3476831044524027462L, MethodHandles.lookup().lookupClass()).a(98445880176191L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private lb() {
   }

   public final boolean p(long a, @NotNull class_2338 bp) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.z<invokedynamic>(14957, 4660906380053196543L ^ var1));
      return C.containsKey(var3);
   }

   public final void K(@NotNull class_2338 pos, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.z<invokedynamic>(15326, 7379639349017416064L ^ var2));
      ((Map)C).put(var1, s8.Z());
   }

   public final void T(long a, @NotNull class_2338 pos) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.z<invokedynamic>(27342, 213940244263812048L ^ var1));
      C.remove(var3);
   }

   @Flow(
      priority = 10
   )
   private final void G(PlayerUpdateEvent var1) {
      long var2 = a ^ 112819612140257L;
      long var4 = var2 ^ 46070983098782L;
      k9[] var10000 = 7251433219610838391L.A<invokedynamic>(7251433219610838391L, var2);
      Iterator var7 = C.entrySet().iterator();
      k9[] var6 = var10000;

      while(var7.hasNext()) {
         long var8 = ((Number)((Entry)var7.next()).getValue()).longValue();

         label25: {
            try {
               if (var6 == null) {
                  break label25;
               }

               if (s8.Z() - var8 <= (long)(vi.h(vi.o, (class_1657)null, 1, var4, (Object)null) * 3)) {
                  continue;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, 7252548393505158643L, var2);
            }

            var7.remove();
         }

         if (var6 == null) {
            break;
         }
      }

   }

   static {
      long var0 = a ^ 79580357165593L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = ">$\u0017Ç ç_\u0080.ÀðË\u000e\u008d+y\u0010\u0001\u008cö¡¸\u0010æRè\u0089DÚe\u0010\u009b¢\u0010¾»M¿¤v®IM4\u0018z¹\u009c\u008aõ";
      int var8 = ">$\u0017Ç ç_\u0080.ÀðË\u000e\u008d+y\u0010\u0001\u008cö¡¸\u0010æRè\u0089DÚe\u0010\u009b¢\u0010¾»M¿¤v®IM4\u0018z¹\u009c\u008aõ".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            s = new lb();
            C = new ConcurrentHashMap();
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22936;
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
            throw new RuntimeException("su/catlean/lb", var10);
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
         throw new RuntimeException("su/catlean/lb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
