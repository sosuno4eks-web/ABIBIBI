package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.gofra.Flow;

public final class ke extends k9 {
   @NotNull
   public static final ke s;
   static final KProperty[] e;
   @NotNull
   private static final zr x;
   @NotNull
   private static final zo L;
   private static final long b = j0.a(-3733151889651321400L, 9087597875246311334L, MethodHandles.lookup().lookupClass()).a(28566862889896L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private ke(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 5569223106061L;
      super(var3, true.d<invokedynamic>(6408, 4202531985210716040L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final qf Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 102287675353906L;
      int var3 = (int)((var1 ^ 102287675353906L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (qf)x.k((short)var3, this, e[0], (short)var4, var5);
   }

   private final void r(qf var1, char var2, int var3, short var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 121871942135742L;
      int var7 = (int)((var5 ^ 121871942135742L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      x.P(this, var7, e[0], (short)var8, var1, (short)var9);
   }

   private final boolean w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 38345833381887L;
      int var3 = (int)((var1 ^ 38345833381887L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)L.k((short)var3, this, e[1], (short)var4, var5);
   }

   private final void I(long var1, boolean var3) {
      var1 ^= b;
      long var10001 = var1 ^ 41200896219098L;
      int var4 = (int)((var1 ^ 41200896219098L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      L.P(this, var4, e[1], (short)var5, var3, (short)var6);
   }

   @Flow(
      priority = -20
   )
   public final void a(@NotNull MoveEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final boolean G(int param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean r() {
      long var0 = b ^ 20852695973621L;
      long var2 = var0 ^ 137442110875418L;

      boolean var10000;
      try {
         if (s.Y(var2) == qf.NCP) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -304710832047834033L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 75394207823310L;
      long var22 = var20 ^ 25688524861631L;
      long var24 = var20 ^ 107467074442771L;
      long var26 = var20 ^ 91875142521312L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "íÌ½\u001dÌ³ýx\u0003\u009da@\u009aÂc%\u0010@Ë\u0093¬Ù\u0093]ÆGì\u009a8I\u001cÎ\u0084\u0018o\u009c 4\u008a\u0085Æ\u0085=\u00996ý\u001eá?ä\u0094\u0017\u0095\\w{yu\u0018ÃxPpI\u0019åí\u001a\u0091ëqn\u009e\u007f\\ÂC4rÒ>\u0082\u0000(-h\u0013XG\u0000û»Õ]\u008b\u001a£PÙøFÎb(JYðºç\u008cÇ$s¦\b¦\"/\u0095i\u008eÊúõ";
      int var17 = "íÌ½\u001dÌ³ýx\u0003\u009da@\u009aÂc%\u0010@Ë\u0093¬Ù\u0093]ÆGì\u009a8I\u001cÎ\u0084\u0018o\u009c 4\u008a\u0085Æ\u0085=\u00996ý\u001eá?ä\u0094\u0017\u0095\\w{yu\u0018ÃxPpI\u0019åí\u001a\u0091ëqn\u009e\u007f\\ÂC4rÒ>\u0082\u0000(-h\u0013XG\u0000û»Õ]\u008b\u001a£PÙøFÎb(JYðºç\u008cÇ$s¦\b¦\"/\u0095i\u008eÊúõ".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[7];
                  k = new HashMap(13);
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
                  String var4 = "È\u0085\u0095²fH+\u0019\u0000\u0093¤,\u000bøþ?";
                  int var5 = "È\u0085\u0095²fH+\u0019\u0000\u0093¤,\u000bøþ?".length();
                  int var2 = 0;

                  do {
                     int var32 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                     var32 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var6[var32] = var10004;
                  } while(var2 < var5);

                  g = var6;
                  i = new Integer[2];
                  KProperty[] var28 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ke.class, true.d<invokedynamic>(22025, 6022433918838641850L ^ var20), true.d<invokedynamic>(11661, 5155168382395608891L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ke.class, true.d<invokedynamic>(26705, 7711379995640376038L ^ var20), true.d<invokedynamic>(31999, 7662996881202658890L ^ var20), 0)))};
                  e = var28;
                  s = new ke(var22);
                  x = qi.M((il)s, true.d<invokedynamic>(2669, 3689620899598551263L ^ var20), (Enum)qf.TIMER, (pj)null, (Function0)null, true.r<invokedynamic>(5687, 7131110407750933707L ^ var20), (Object)null, var24);
                  L = qi.R((il)s, true.d<invokedynamic>(381, 1719903118896710605L ^ var20), true, (pj)null, ke::r, 4, var26, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "ÔbWgp\\r\u001aþ+\u009eQ$Dx\u0096¯rdª^\u009aÖ-ì°OJDi\u0082(,PÆN\u0086Tm\u0084ÍO»Þ)@Ñ\u001dÕ\u009bò1\n\u007f[S(©\u008c\u0018ýüc^lÉ4E{FÂ@¼O\u0083\u0096\r¾$/cjØ\u0087\u0083\u009b>K\u0081\u0094Â\u0094{+§\u0096é";
               var17 = "ÔbWgp\\r\u001aþ+\u009eQ$Dx\u0096¯rdª^\u009aÖ-ì°OJDi\u0082(,PÆN\u0086Tm\u0084ÍO»Þ)@Ñ\u001dÕ\u009bò1\n\u007f[S(©\u008c\u0018ýüc^lÉ4E{FÂ@¼O\u0083\u0096\r¾$/cjØ\u0087\u0083\u009b>K\u0081\u0094Â\u0094{+§\u0096é".length();
               var14 = '8';
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13299;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ke", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
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
         throw new RuntimeException("su/catlean/ke" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15292;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ke", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ke" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
