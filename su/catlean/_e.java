package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class _e implements zh {
   @NotNull
   public static final _e J;
   @NotNull
   private static final ConcurrentHashMap o;
   @NotNull
   private static final ConcurrentHashMap Z;
   @NotNull
   private static final ConcurrentHashMap C;
   @NotNull
   private static final ConcurrentHashMap n;
   private static String[] R;
   private static final long a = j0.a(6870802513848285238L, 1639786611976697530L, MethodHandles.lookup().lookupClass()).a(99015446078237L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;

   private _e() {
   }

   @NotNull
   public final ConcurrentHashMap w() {
      return n;
   }

   public final void p(long a, @NotNull Pair crystal) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.p<invokedynamic>(32437, 2286310658599891752L ^ var1));
      this.R(((Number)var3.getFirst()).intValue(), s8.Z());
      this.h(var3);
   }

   public final void S() {
      o.clear();
      Z.clear();
      C.clear();
   }

   public final void n(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 53302516143974L;
      long var5 = s8.Z();
      long var7 = (long)vi.h(vi.o, (class_1657)null, 1, var3, (Object)null) * true.r<invokedynamic>(13696, 8038753038419651845L ^ var1);
      o.entrySet().removeIf(_e::q);
      Z.entrySet().removeIf(_e::Q);
      C.entrySet().removeIf(_e::j);
      n.entrySet().removeIf(_e::i);
   }

   public final boolean p(int id) {
      return o.containsKey(var1);
   }

   public final long m(int id, int a, byte a, int a) {
      long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      Object var10000 = o.getOrDefault(var1, true.r<invokedynamic>(1200, 3193021714830706612L ^ var5));
      Intrinsics.checkNotNullExpressionValue(var10000, true.p<invokedynamic>(14241, 1522866297878602309L ^ var5));
      return ((Number)var10000).longValue();
   }

   @Nullable
   public final Long R(int id, long deathTime) {
      return (Long)o.putIfAbsent(var1, var2);
   }

   public final boolean z(int id, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void h(Pair var1) {
      Z.compute(var1.getFirst(), _e::v);
   }

   public final void n(@NotNull class_2338 blockPos, long a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean q(@NotNull class_2338 blockPos, int a, boolean ignoreMid, int a, short a) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final ck G(long a, @NotNull class_243 pos) {
      // $FF: Couldn't be decompiled
   }

   public final boolean o(byte a, @NotNull class_2338 bp, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean S(long var0, long var2, Entry var4) {
      long var5 = a ^ 76256556672159L;
      String[] var10000 = 1059156886044653112L.A<invokedynamic>(1059156886044653112L, var5);
      Intrinsics.checkNotNullParameter(var4, true.p<invokedynamic>(9901, 2516356023270888823L ^ var5));
      String[] var7 = var10000;

      int var9;
      label32: {
         try {
            Object var10001 = var4.getValue();
            Intrinsics.checkNotNullExpressionValue(var10001, true.p<invokedynamic>(21555, 2707355375913478141L ^ var5));
            long var10;
            var9 = (var10 = var0 - ((Number)var10001).longValue() - var2) == 0L ? 0 : (var10 < 0L ? -1 : 1);
            if (var7 != null) {
               return (boolean)var9;
            }

            if (var9 > 0) {
               break label32;
            }
         } catch (NumberFormatException var8) {
            throw var8.A<invokedynamic>(var8, 1011447522501108046L, var5);
         }

         var9 = 0;
         return (boolean)var9;
      }

      var9 = 1;
      return (boolean)var9;
   }

   private static final boolean q(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean u(Entry var0) {
      long var1 = a ^ 69386682106638L;
      long var10001 = var1 ^ 84850275359109L;
      int var3 = (int)((var1 ^ 84850275359109L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(9867, 1390600819300807376L ^ var1));
      return ((ck)var0.getValue()).N((short)var3, (char)var4, var5);
   }

   private static final boolean Q(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean m(Entry var0) {
      long var1 = a ^ 73078986832980L;
      long var10001 = var1 ^ 53085275907807L;
      int var3 = (int)((var1 ^ 53085275907807L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(9867, 1390510022526258570L ^ var1));
      return ((ck)var0.getValue()).N((short)var3, (char)var4, var5);
   }

   private static final boolean j(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean X(Entry var0) {
      long var1 = a ^ 39618323777779L;
      long var3 = var1 ^ 53850166265507L;
      String[] var10000 = 7124273227013872212L.A<invokedynamic>(7124273227013872212L, var1);
      Intrinsics.checkNotNullParameter(var0, true.p<invokedynamic>(9867, 1390612832384268589L ^ var1));
      String[] var5 = var10000;

      int var8;
      label32: {
         try {
            long var7 = s8.Z();
            Object var10001 = var0.getValue();
            Intrinsics.checkNotNullExpressionValue(var10001, true.p<invokedynamic>(24590, 4668929971047104416L ^ var1));
            double var9;
            var8 = (var9 = (double)(var7 - ((Number)var10001).longValue()) - Math.max((double)vi.h(vi.o, (class_1657)null, 1, var3, (Object)null) * 1.5D, 50.0D)) == 0.0D ? 0 : (var9 < 0.0D ? -1 : 1);
            if (var5 != null) {
               return (boolean)var8;
            }

            if (var8 > 0) {
               break label32;
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, 7090077015973678370L, var1);
         }

         var8 = 0;
         return (boolean)var8;
      }

      var8 = 1;
      return (boolean)var8;
   }

   private static final boolean i(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final ck D(Pair param0, int param1, ck param2) {
      // $FF: Couldn't be decompiled
   }

   private static final ck v(Function2 var0, Object var1, Object var2) {
      return (ck)var0.invoke(var1, var2);
   }

   private static final ck r(class_2338 param0, boolean param1, class_2338 param2, ck param3) {
      // $FF: Couldn't be decompiled
   }

   private static final ck c(Function2 var0, Object var1, Object var2) {
      return (ck)var0.invoke(var1, var2);
   }

   private static final boolean L(class_243 var0, class_2338 var1) {
      long var2 = a ^ 110610459635893L;
      String[] var4 = 6528179113457803794L.A<invokedynamic>(6528179113457803794L, var2);

      int var10000;
      label32: {
         try {
            double var6;
            var10000 = (var6 = var0.method_1025(var1.method_46558()) - 0.3D) == 0.0D ? 0 : (var6 < 0.0D ? -1 : 1);
            if (var4 != null) {
               return (boolean)var10000;
            }

            if (var10000 < 0) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 6495109763968267620L, var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   private static final boolean X(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 61691623465551L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -8642611389130915337L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[19];
      int var16 = 0;
      String var15 = "¿\tN¼]yÑE\rmxáà.t0\u0018\t7@Sèh7í_öPuø\u0095_\u009dN,\u0005\u000fÌ8HL\u0018\u0019\u009e¶bÄ\u0091À,\u0093Yì?:óUU4×(2\u0016¥`í \u000eD\u0099D\u000eé\u0099\u001dp²Ö\u0087xCO®F\u0082\u009fÙ¼\u001fBªO»¾¬\u0088É7ä(ÀW\fôÛQ\u0089¢frmZÄ\u00897\u0001f%ÿ%¼\u009aÃ7ùmc\u0005»]\u0086`k(\u0098\u0098\u0014YQ\u001e V~aÈºV\u009eñ%u\u0005\u0083%Tæ²Æë;-Ì\u0080\u0089c\u0089s\u0086\f«cÅê '\u0017\u0003\u0004{ÛbºûàÜ:\u001f\u0099ÅáX}6f]ö0ç\u0089x\u008f\u0090éòB{(!\u0081\tXI,\u001euCµà\u0011ã\u0018(%¾TÆ\u008f\u00869\u0094Æ:²Ç½Z\u0004\u0092ßhï\u009a±\u008e)âj( ¦Ã\u0085äÀ\u0011À\b<,üE\b\u0017/\u008erÈ\u0095'Ü\u0015.d¹+3C\u000f\u001dìgº\u001a?\u00170dB XT¦HOj9+\u0012ë\u0017¸\u009a«y\u0018ç\u008f£Zãê¿7{üîï\u0003Àµá\u0010ý\u008d¢Ò\n|½¢\u000fEìÃhz(N ¯Ê\u001f EÚâ\u0080f|«vìI\u0015\u0098í\u0092n}¤FÍ \u0013fÿkZ\u0088\u00968 \u009f\u0080\u00ad\u008d¥À(J¦\u001fAÌÇyÚ\u0088Z\u000fÍ\r\u0006\u0095F]\u008dªú?}®ú\f\u0010\u0019ÑÕ¹!¹,aÌ&»\u0091&\u009dÃ2 ÿ\u009f\u009b\u001d\u001eR\u008eÇ\u00185a\u0012\u001egöá\u001cf\u0094çÀ\u0003Y`å\u0085Ñ6ßH\u0086ã\u0010\u0093Ó®.hÿ\u000b\"S·±ÑÌ\u0098»»\u0010OîU\fs\rH\u0096\u0093¢\u0098æ&µf8";
      int var17 = "¿\tN¼]yÑE\rmxáà.t0\u0018\t7@Sèh7í_öPuø\u0095_\u009dN,\u0005\u000fÌ8HL\u0018\u0019\u009e¶bÄ\u0091À,\u0093Yì?:óUU4×(2\u0016¥`í \u000eD\u0099D\u000eé\u0099\u001dp²Ö\u0087xCO®F\u0082\u009fÙ¼\u001fBªO»¾¬\u0088É7ä(ÀW\fôÛQ\u0089¢frmZÄ\u00897\u0001f%ÿ%¼\u009aÃ7ùmc\u0005»]\u0086`k(\u0098\u0098\u0014YQ\u001e V~aÈºV\u009eñ%u\u0005\u0083%Tæ²Æë;-Ì\u0080\u0089c\u0089s\u0086\f«cÅê '\u0017\u0003\u0004{ÛbºûàÜ:\u001f\u0099ÅáX}6f]ö0ç\u0089x\u008f\u0090éòB{(!\u0081\tXI,\u001euCµà\u0011ã\u0018(%¾TÆ\u008f\u00869\u0094Æ:²Ç½Z\u0004\u0092ßhï\u009a±\u008e)âj( ¦Ã\u0085äÀ\u0011À\b<,üE\b\u0017/\u008erÈ\u0095'Ü\u0015.d¹+3C\u000f\u001dìgº\u001a?\u00170dB XT¦HOj9+\u0012ë\u0017¸\u009a«y\u0018ç\u008f£Zãê¿7{üîï\u0003Àµá\u0010ý\u008d¢Ò\n|½¢\u000fEìÃhz(N ¯Ê\u001f EÚâ\u0080f|«vìI\u0015\u0098í\u0092n}¤FÍ \u0013fÿkZ\u0088\u00968 \u009f\u0080\u00ad\u008d¥À(J¦\u001fAÌÇyÚ\u0088Z\u000fÍ\r\u0006\u0095F]\u008dªú?}®ú\f\u0010\u0019ÑÕ¹!¹,aÌ&»\u0091&\u009dÃ2 ÿ\u009f\u009b\u001d\u001eR\u008eÇ\u00185a\u0012\u001egöá\u001cf\u0094çÀ\u0003Y`å\u0085Ñ6ßH\u0086ã\u0010\u0093Ó®.hÿ\u000b\"S·±ÑÌ\u0098»»\u0010OîU\fs\rH\u0096\u0093¢\u0098æ&µf8".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var27;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[19];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "ç\n¼ä\u0005ç6|ÿOâ\u007f\u00ad=L½";
                  int var5 = "ç\n¼ä\u0005ç6|ÿOâ\u007f\u00ad=L½".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Long[2];
                  J = new _e();
                  o = new ConcurrentHashMap();
                  Z = new ConcurrentHashMap();
                  C = new ConcurrentHashMap();
                  n = new ConcurrentHashMap();
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var27;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u0003â$}ª\u000b{Q-3ò\u0018+Û'pô¸zQX\u008fã\u009a4Xû¼\u009a\u009fÓa\u0018\u001ble'\u001dì\u0081\u0087\u0017\u0013:ÅÓ0£æI\u007ffCºj\u0097Ù";
               var17 = "\u0003â$}ª\u000b{Q-3ò\u0018+Û'pô¸zQX\u008fã\u009a4Xû¼\u009a\u009fÓa\u0018\u001ble'\u001dì\u0081\u0087\u0017\u0013:ÅÓ0£æI\u007ffCºj\u0097Ù".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void A(String[] var0) {
      R = var0;
   }

   public static String[] k() {
      return R;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31947;
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
            throw new RuntimeException("su/catlean/_e", var10);
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
         throw new RuntimeException("su/catlean/_e" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27180;
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
            throw new RuntimeException("su/catlean/_e", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/_e" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
