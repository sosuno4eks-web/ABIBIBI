package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AddHandlersEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class vb {
   @NotNull
   public static final vb p;
   @Nullable
   private static v1 V;
   @NotNull
   private static n E;
   private static boolean x;
   private static final long a = j0.a(2012890607631342366L, 7003490772173987995L, MethodHandles.lookup().lookupClass()).a(76506611480639L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   private vb() {
   }

   @NotNull
   public final List E(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var4 ^ 100789887955141L;
      int var6 = (int)((var4 ^ 100789887955141L) >>> 32);
      long var7 = var10001 << 32 >>> 32;
      return c0.S.o().O(var6, var7).H();
   }

   @Nullable
   public final v1 u() {
      return V;
   }

   public final void T(@Nullable v1 <set-?>) {
      V = var1;
   }

   @Flow
   private final void b(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void h(AddHandlersEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean d(@NotNull v1 proxy, long a) {
      var2 ^= a;
      long var10001 = var2 ^ 67586688837264L;
      int var4 = (int)((var2 ^ 67586688837264L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(15674, 2539160816757945756L ^ var2));
      return this.E(var4, (short)var5, (short)var6).remove(var1);
   }

   public final boolean Z(long a, @NotNull v1 proxy) {
      var1 ^= a;
      long var10001 = var1 ^ 76649483299742L;
      int var4 = (int)((var1 ^ 76649483299742L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.w<invokedynamic>(26441, 2495006081535533794L ^ var1));
      return this.E(var4, (short)var5, (short)var6).add(var3);
   }

   public final void l(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 127716679342499L;
      int var3 = (int)((var1 ^ 127716679342499L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 50363622707337L;
      int var6 = (int)((var1 ^ 50363622707337L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      Iterable var9 = (Iterable)this.E(var3, (short)var4, (short)var5);
      boolean var10 = false;
      int var11 = 0;
      Iterator var12 = var9.iterator();

      while(var12.hasNext()) {
         Object var13 = var12.next();
         int var14 = var11++;

         int var10000;
         label30: {
            try {
               if (var1 <= 0L) {
                  break;
               }

               var10000 = var14;
               if (var1 < 0L) {
                  break label30;
               }

               if (var14 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }
            } catch (NumberFormatException var18) {
               throw var18.A<invokedynamic>(var18, -5123479334454709809L, var1);
            }

            var10000 = var14;
         }

         v1 var15 = (v1)var13;
         int var16 = var10000;
         boolean var17 = false;
         p.f((char)var6, var15, var7, (char)var8, var16);
         if (var1 < 0L) {
            break;
         }
      }

   }

   private final void f(char var1, v1 var2, int var3, char var4, int var5) {
      long var6 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var8 = System.currentTimeMillis();
      var2.j(true.a<invokedynamic>(1643, 4254667688620829681L ^ var6));
      (new Thread(vb::f)).start();
   }

   private static final void f(int param0, v1 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var25 = a ^ 14108969705438L;
      long var10001 = var25 ^ 11005863349334L;
      int var27 = (int)((var25 ^ 11005863349334L) >>> 48);
      int var28 = (int)(var10001 << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      d = new HashMap(13);
      false.A<invokedynamic>(false, -4770114885986012572L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[3];
      int var21 = 0;
      String var20 = "ÆÚ¥\u000bX\u001fv(¯1É\u0086¼ÝU\u009e\u0019\u001aÐ%KÐ4Iä\u0080\u0080ºòë7D\u0010áÿ \u0012m9$2\u001a¼\r\u0002§\u0013-\u007f\u0010HøBIìñL%l\u008a«WÓ ¦º";
      int var22 = "ÆÚ¥\u000bX\u001fv(¯1É\u0086¼ÝU\u009e\u0019\u001aÐ%KÐ4Iä\u0080\u0080ºòë7D\u0010áÿ \u0012m9$2\u001a¼\r\u0002§\u0013-\u007f\u0010HøBIìñL%l\u008a«WÓ ¦º".length();
      char var19 = ' ';
      int var18 = -1;

      while(true) {
         ++var18;
         byte[] var24 = var16.doFinal(var20.substring(var18, var18 + var19).getBytes("ISO-8859-1"));
         String var33 = a(var24).intern();
         boolean var30 = true;
         var23[var21++] = var33;
         if ((var18 += var19) >= var22) {
            b = var23;
            c = new String[3];
            g = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var6 = 1; var6 < 8; ++var6) {
               var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[3];
            int var8 = 0;
            String var9 = "¿\u000b«è\b*X4>¢\u001fv+E\u009e,\n#¿Á\u009c©\u0015ö";
            int var10 = "¿\u000b«è\b*X4>¢\u001fv+E\u009e,\n#¿Á\u009c©\u0015ö".length();
            int var7 = 0;

            do {
               int var32 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var32, var7).getBytes("ISO-8859-1");
               var32 = var8++;
               long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
               byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
               long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
               boolean var35 = true;
               var11[var32] = var10004;
            } while(var7 < var10);

            e = var11;
            f = new Integer[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 7685080892040250684L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var30 = true;
            h = var36;
            p = new vb();
            E = new n((char)var27, var28, (char)var29);
            return;
         }

         var19 = var20.charAt(var18);
      }
   }

   public static void W(boolean var0) {
      x = var0;
   }

   public static boolean h() {
      return x;
   }

   public static boolean p() {
      boolean var0 = h();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a((Exception)var1);
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3746;
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
            throw new RuntimeException("su/catlean/vb", var10);
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
         throw new RuntimeException("su/catlean/vb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26313;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/vb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/vb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
