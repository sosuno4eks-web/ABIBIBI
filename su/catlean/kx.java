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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kx extends kr {
   @NotNull
   public static final kx C;
   static final KProperty[] A;
   @NotNull
   private static final zr q;
   @NotNull
   private static final zr c;
   private static final long e = j0.a(1635325386790691597L, 113918219484576283L, MethodHandles.lookup().lookupClass()).a(249928230273367L);
   private static final String[] k;
   private static final String[] m;
   private static final Map s;
   private static final long[] y;
   private static final Integer[] z;
   private static final Map B;

   private kx(long var1) {
      var1 ^= e;
      long var3 = var1 ^ 132921492029988L;
      super(true.w<invokedynamic>(27659, 986062674836398870L ^ var1), var3, pa.Q(), 0, false, true.u<invokedynamic>(6765, 1532063539873182055L ^ var1), (DefaultConstructorMarker)null);
   }

   private final i7 i(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 114504389996315L;
      int var3 = (int)((var1 ^ 114504389996315L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (i7)q.k((short)var3, this, A[0], (short)var4, var5);
   }

   private final eg T(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 94503493189759L;
      int var3 = (int)((var1 ^ 94503493189759L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (eg)c.k((short)var3, this, A[1], (short)var4, var5);
   }

   @Flow
   private final void s(PlayerUpdateEvent var1) {
      long var2 = e ^ 85298576952242L;
      long var10001 = var2 ^ 99062141359009L;
      int var4 = (int)((var2 ^ 99062141359009L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      long var7 = var2 ^ 122777844054695L;
      kr.X((kr)this, this.t(var7), false, var4, (byte)var5, var6, false, (List)null, false, true.u<invokedynamic>(18272, 6376387283009074988L ^ var2), (Object)null);
   }

   private final List t(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final List m(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected List W(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 112328108215371L;
      long var7 = var1 ^ 84734673819432L;
      String[] var9 = -6198678981148367627L.A<invokedynamic>(-6198678981148367627L, var1);

      kx var10000;
      label38: {
         label42: {
            try {
               var10000 = this;
               if (var9 != null) {
                  break label38;
               }

               if (this.T(var5) != eg.WEB) {
                  break label42;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -6212974591701968644L, var1);
            }

            dk var14 = dk.I;
            class_2248[] var10 = new class_2248[1];

            try {
               class_2248 var10003 = class_2246.field_10343;
               Intrinsics.checkNotNullExpressionValue(var10003, true.w<invokedynamic>(28084, 2019215614879452339L ^ var1));
               var10[0] = var10003;
               if (var14.A(var7, var10).y()) {
                  return CollectionsKt.listOf(class_2246.field_10343);
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, -6212974591701968644L, var1);
            }
         }

         var10000 = this;
      }

      try {
         List var15 = var10000.W(var3);
         if (var1 >= 0L && var9 != null) {
            (new int[2]).A<invokedynamic>(new int[2], -6199553200864925107L, var1);
         }

         return var15;
      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, -6212974591701968644L, var1);
      }
   }

   static {
      long var20 = e ^ 36267568253087L;
      long var22 = var20 ^ 94659078000218L;
      long var24 = var20 ^ 22281529244159L;
      s = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "R×<\f×âÙañp*\bËÆ)%w®i\u008f\u0087>åÂ\u0096ÕÛYF»kà0AEy½B\u0001Ð3J¤ùÒ.\u008fD=#\u0013ÀúãüBÔ/\u001cshkà\tÞ\u0010C£\u00043µ¿\u0017áh5Û\u001d\u0081;Û\u0010ô\u0010¦\u0001-4@rê\u0013¹ªß5t\u0082@\u0096r\u0095³0&ãAnPÖ;@ûÅa3\u0093õ¥É\u0086?ûwNÖ\u0003\u0010\u0086W7\u000b\u0090\u001b\u0099<7\u0011\u0018\u0011 <\\ÂÉA\u009fµÀý\u001c$Y.s¡q$-.W6\u0083 \u0089´\u0014äL\u0005¬ÿ\u0014WÏÙ\u0082Ttû®w\u0006È¨iá4k0¾\u009d¬%\u0004Q\u0010\n;÷¸×\u009b\u0017t\u0018s¤Ë5 z\u0015 \u001b×âã\u0004\u007f\u0002\u0082Ê8\u0005\\¹Vâ\u0099²]ë|è8\u001d}«L¨+²QÖº";
      int var17 = "R×<\f×âÙañp*\bËÆ)%w®i\u008f\u0087>åÂ\u0096ÕÛYF»kà0AEy½B\u0001Ð3J¤ùÒ.\u008fD=#\u0013ÀúãüBÔ/\u001cshkà\tÞ\u0010C£\u00043µ¿\u0017áh5Û\u001d\u0081;Û\u0010ô\u0010¦\u0001-4@rê\u0013¹ªß5t\u0082@\u0096r\u0095³0&ãAnPÖ;@ûÅa3\u0093õ¥É\u0086?ûwNÖ\u0003\u0010\u0086W7\u000b\u0090\u001b\u0099<7\u0011\u0018\u0011 <\\ÂÉA\u009fµÀý\u001c$Y.s¡q$-.W6\u0083 \u0089´\u0014äL\u0005¬ÿ\u0014WÏÙ\u0082Ttû®w\u0006È¨iá4k0¾\u009d¬%\u0004Q\u0010\n;÷¸×\u009b\u0017t\u0018s¤Ë5 z\u0015 \u001b×âã\u0004\u007f\u0002\u0082Ê8\u0005\\¹Vâ\u0099²]ë|è8\u001d}«L¨+²QÖº".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = c(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  k = var18;
                  m = new String[9];
                  B = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "\u0017ËàÅ*qUv\u0016\u001dX\u0005ÚV4\u008b-¬È\u009b¥ùÿ¢";
                  int var5 = "\u0017ËàÅ*qUv\u0016\u001dX\u0005ÚV4\u008b-¬È\u009b¥ùÿ¢".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  y = var6;
                  z = new Integer[3];
                  KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kx.class, true.w<invokedynamic>(22247, 1210704308049478036L ^ var20), true.w<invokedynamic>(5186, 4992285987659989815L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kx.class, true.w<invokedynamic>(27188, 2888125225193749830L ^ var20), true.w<invokedynamic>(32434, 3478394074286598597L ^ var20), 0)))};
                  A = var26;
                  C = new kx(var22);
                  q = qi.M((il)C, true.w<invokedynamic>(12417, 6739167199858845687L ^ var20), (Enum)i7.AROUND_PLAYERS, (pj)null, (Function0)null, true.u<invokedynamic>(29633, 5951713460358054049L ^ var20), (Object)null, var24);
                  c = qi.M((il)C, true.w<invokedynamic>(11847, 193945718451534139L ^ var20), (Enum)eg.OBBY, (pj)null, (Function0)null, true.u<invokedynamic>(29633, 5951713460358054049L ^ var20), (Object)null, var24);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u000bæ27\u0005\\%´G ÅSÃ@*c\u0010è\u0089Ë\u000b!\u0093\u00ad\u007fZ\u00968\u008d'\u0091\f¢";
               var17 = "\u000bæ27\u0005\\%´G ÅSÃ@*c\u0010è\u0089Ë\u000b!\u0093\u00ad\u007fZ\u00968\u008d'\u0091\f¢".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2520;
      if (m[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         m[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return m[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11725;
      if (z[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = y[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         z[var3] = var15;
      }

      return z[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
