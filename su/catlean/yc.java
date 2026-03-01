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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yc extends k9 {
   @NotNull
   public static final yc i;
   // $FF: synthetic field
   static final KProperty[] T;
   @NotNull
   private static final zc N;
   @NotNull
   private static final zr R;
   private static final long b = j0.a(5400201662520245492L, 1674611225195464140L, MethodHandles.lookup().lookupClass()).a(22715869067526L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map k;

   private yc(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 49609925686114L;
      super(var3, true.e<invokedynamic>(11862, 510160710927030012L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float I(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 133948618251253L;
      int var3 = (int)((var1 ^ 133948618251253L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)N.k((short)var3, this, T[0], (short)var4, var5)).floatValue();
   }

   private final uw L(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 41277045887525L;
      int var6 = (int)((var4 ^ 41277045887525L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (uw)R.k((short)var6, this, T[1], (short)var7, var8);
   }

   private final void y(long var1, uw var3) {
      var1 ^= b;
      long var10001 = var1 ^ 93185872780157L;
      int var4 = (int)((var1 ^ 93185872780157L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      R.P(this, var4, T[1], (short)var5, var3, (short)var6);
   }

   @Flow(
      priority = -10
   )
   private final void c(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit y() {
      long var0 = b ^ 11284181237622L;
      long var10001 = var0 ^ 1780886486038L;
      int var2 = (int)((var0 ^ 1780886486038L) >>> 48);
      long var3 = var10001 << 16 >>> 16;
      ff.f(class_1268.field_5808, 0.0F, 0.0F, (char)var2, true.x<invokedynamic>(17302, 3320242753009630373L ^ var0), var3, (Object)null);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 56573241290260L;
      long var22 = var20 ^ 79933200336394L;
      long var24 = var20 ^ 41722034368359L;
      long var26 = var20 ^ 74505799488643L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "tðÁQ\u000eª¸ª\u0001n³\u001f¼7®\u0004 \u00045Áß\u001f\u0081b\u0085\u001cÓ\u0086ÚíüMÃ\rjr\fB\u0080\u0084¦ü\u0089ÀÄW¼\u008f=0L\u001cìZ\u0017yõ õAô1\u0000\u009aä/µÙ°¸S#Ó\u0014+û\u0082hôæl6è1¸\u009b\u001bT°JNMûÿ\u0001Ú(Z\u0010\u009f\f/%0\u0003oW\u0084\u008e\u009c;Q\u001dMÉ\u0018h|\u0013\u0094LL\u0097nÐrêX\u0006\tçªñ\u0083GX\u0012orô\u0018y'\u0002·ÏxV\fÞ¡ô¤Ã\u0003ÞìíÜø¤\u0097mOj";
      int var17 = "tðÁQ\u000eª¸ª\u0001n³\u001f¼7®\u0004 \u00045Áß\u001f\u0081b\u0085\u001cÓ\u0086ÚíüMÃ\rjr\fB\u0080\u0084¦ü\u0089ÀÄW¼\u008f=0L\u001cìZ\u0017yõ õAô1\u0000\u009aä/µÙ°¸S#Ó\u0014+û\u0082hôæl6è1¸\u009b\u001bT°JNMûÿ\u0001Ú(Z\u0010\u009f\f/%0\u0003oW\u0084\u008e\u009c;Q\u001dMÉ\u0018h|\u0013\u0094LL\u0097nÐrêX\u0006\tçªñ\u0083GX\u0012orô\u0018y'\u0002·ÏxV\fÞ¡ô¤Ã\u0003ÞìíÜø¤\u0097mOj".length();
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
                  d = new String[8];
                  k = new HashMap(13);
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
                  String var4 = "|~pñ\u0001H§\u007f»1úØ¹N\u009c\u001c½\nP7\u0087/\u0086À";
                  int var5 = "|~pñ\u0001H§\u007f»1úØ¹N\u009c\u001c½\nP7\u0087/\u0086À".length();
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

                  f = var6;
                  g = new Integer[3];
                  KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yc.class, true.e<invokedynamic>(13956, 790342617864295909L ^ var20), true.e<invokedynamic>(727, 3322251823524962740L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(yc.class, true.e<invokedynamic>(9923, 1191504329438086564L ^ var20), true.e<invokedynamic>(31595, 6215940679809767435L ^ var20), 0)))};
                  T = var28;
                  i = new yc(var22);
                  N = qi.g((il)i, true.e<invokedynamic>(31348, 5651129497924442386L ^ var20), 5.0F, RangesKt.rangeTo(1.0F, 20.0F), (pj)null, (Function0)null, true.x<invokedynamic>(17155, 1358115268124044625L ^ var20), var24, (Object)null);
                  R = qi.M((il)i, true.e<invokedynamic>(8873, 3023304775773766091L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.x<invokedynamic>(3436, 4122508639525380927L ^ var20), (Object)null, var26);
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

               var15 = "µ\tÛMô\u00130Òk\u000bÓÝùÚÌ\u0013/\u009a6m¯×]ß\u0018Ev\u000f\u008aoN\u0095ê\u001fN1\u0085\u008e\u0012_èø\u008bÊ\u0086Ð´®Ó";
               var17 = "µ\tÛMô\u00130Òk\u000bÓÝùÚÌ\u0013/\u009a6m¯×]ß\u0018Ev\u000f\u008aoN\u0095ê\u001fN1\u0085\u008e\u0012_èø\u008bÊ\u0086Ð´®Ó".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20658;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yc", var10);
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
         throw new RuntimeException("su/catlean/yc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7555;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/yc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/yc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
