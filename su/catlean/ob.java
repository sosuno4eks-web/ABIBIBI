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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.ReachStateEvent;
import su.catlean.gofra.Flow;

public final class ob extends k9 {
   @NotNull
   public static final ob O;
   // $FF: synthetic field
   static final KProperty[] R;
   @NotNull
   private static final zc P;
   @NotNull
   private static final zc i;
   private static final long b = j0.a(4291957978220713053L, 4887339483346637181L, MethodHandles.lookup().lookupClass()).a(261004206830349L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private ob(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 112952505753285L;
      super(var3, true.f<invokedynamic>(8041, 3529825398704843894L ^ var1), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 96473890566604L;
      int var3 = (int)((var1 ^ 96473890566604L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)P.k((short)var3, this, R[0], (short)var4, var5)).floatValue();
   }

   private final float Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 58391178513225L;
      int var3 = (int)((var1 ^ 58391178513225L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)i.k((short)var3, this, R[1], (short)var4, var5)).floatValue();
   }

   @Flow
   private final void N(ReachStateEvent var1) {
      long var2 = b ^ 123955212850976L;
      long var4 = var2 ^ 24132022621233L;
      long var6 = var2 ^ 131219810217652L;
      var1.setBlockRange(this.x(var4));
      var1.setEntityRange(this.Y(var6));
      var1.cancel();
   }

   static {
      long var20 = b ^ 125872130585472L;
      long var22 = var20 ^ 72703165150777L;
      long var24 = var20 ^ 34355008851169L;
      e = new HashMap(13);
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
      String var15 = "pã\neÃ¯³ï@±õ¸\u0003B%c «\u0010Z$>\u000fÀrS\u0014ãÒæ\u0004Þ\u001f3\u0086\u0016æ|È¹G#\u001bºc\u009d´\u008a\u000b õ\u00068®Ð\u0006JÃ\u001c\u0012Bt\u0096lB \b>º\u0085ý\u009f$ð \töA)x¥ó\u0010&úî\u0007#ù\u001c\rdÖ\u009cÅ\u0095P\u008c\u0098(³\u0087âG|i\u0098\u001b\u009b¥ø°^^¯-£È\bh\u0082\u00ad[0\u0093À\u0081\u0097[ÓÊF\u008a*îÔ6ufX";
      int var17 = "pã\neÃ¯³ï@±õ¸\u0003B%c «\u0010Z$>\u000fÀrS\u0014ãÒæ\u0004Þ\u001f3\u0086\u0016æ|È¹G#\u001bºc\u009d´\u008a\u000b õ\u00068®Ð\u0006JÃ\u001c\u0012Bt\u0096lB \b>º\u0085ý\u009f$ð \töA)x¥ó\u0010&úî\u0007#ù\u001c\rdÖ\u009cÅ\u0095P\u008c\u0098(³\u0087âG|i\u0098\u001b\u009b¥ø°^^¯-£È\bh\u0082\u00ad[0\u0093À\u0081\u0097[ÓÊF\u008a*îÔ6ufX".length();
      char var14 = 16;
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[7];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[2];
                  int var4 = 0;
                  String var5 = "Heá\u001c2ìÕE\u009c¢\bÞKðz\u008c";
                  int var6 = "Heá\u001c2ìÕE\u009c¢\bÞKðz\u008c".length();
                  int var3 = 0;

                  do {
                     int var30 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var30, var3).getBytes("ISO-8859-1");
                     var30 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var0[var30] = var10004;
                  } while(var3 < var6);

                  KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ob.class, true.f<invokedynamic>(31608, 4966813651557014925L ^ var20), true.f<invokedynamic>(30874, 4903682657653579374L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ob.class, true.f<invokedynamic>(7831, 1227676908035192932L ^ var20), true.f<invokedynamic>(32228, 1462638383003228950L ^ var20), 0)))};
                  R = var26;
                  O = new ob(var22);
                  P = qi.g((il)O, true.f<invokedynamic>(8879, 1039919744449709145L ^ var20), 3.0F, RangesKt.rangeTo(0.1F, 10.0F), (pj)null, (Function0)null, (int)var0[0], var24, (Object)null);
                  i = qi.g((il)O, true.f<invokedynamic>(9767, 8205447592805236950L ^ var20), 3.0F, RangesKt.rangeTo(0.1F, 10.0F), (pj)null, (Function0)null, (int)var0[1], var24, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "þù\u0085V%¿ñ\tÌ²ñÂÖ\u0095\u0014\u001eÌ\u0015]Î\u0012\u008eØ\u000f @$\u0080í\u001eJÐ\u0012êá\u008fÇçR\u0085\u001e\u0087/\u0005M\u0001\t\u0015aê\u00ad0Bl=b|";
               var17 = "þù\u0085V%¿ñ\tÌ²ñÂÖ\u0095\u0014\u001eÌ\u0015]Î\u0012\u008eØ\u000f @$\u0080í\u001eJÐ\u0012êá\u008fÇçR\u0085\u001e\u0087/\u0005M\u0001\t\u0015aê\u00ad0Bl=b|".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30374;
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
            throw new RuntimeException("su/catlean/ob", var10);
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
         throw new RuntimeException("su/catlean/ob" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
