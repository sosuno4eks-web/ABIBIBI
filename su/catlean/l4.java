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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.BasicProjectionMatrixEvent;
import su.catlean.gofra.Flow;

public final class l4 extends k9 {
   @NotNull
   public static final l4 U;
   // $FF: synthetic field
   static final KProperty[] I;
   @NotNull
   private static final zc f;
   private static final long b = j0.a(-2746608946502342069L, 3674560023635166045L, MethodHandles.lookup().lookupClass()).a(30186079895664L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private l4(int var1, char var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 137013948631055L;
      super(var6, true.f<invokedynamic>(1245, 6186866332468515366L ^ var4), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final float J(char param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public final void O(float <set-?>, long a) {
      var2 ^= b;
      long var10001 = var2 ^ 76259891006939L;
      int var4 = (int)((var2 ^ 76259891006939L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      boolean var7 = -8164845664433731225L.A<invokedynamic>(-8164845664433731225L, var2);

      try {
         f.P(this, var4, I[0], (short)var5, var1, (short)var6);
         if (var7) {
            (new int[2]).A<invokedynamic>(new int[2], -8200783679939785333L, var2);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -8200725163623489225L, var2);
      }
   }

   @Flow
   private final void N(BasicProjectionMatrixEvent var1) {
      long var2 = b ^ 67988923987985L;
      long var10001 = var2 ^ 73561970320722L;
      int var4 = (int)((var2 ^ 73561970320722L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      var1.setRatio(this.J((char)var4, var5));
      var1.cancel();
   }

   static {
      long var16 = b ^ 2219266585851L;
      long var10001 = var16 ^ 44281467987848L;
      int var18 = (int)((var16 ^ 44281467987848L) >>> 32);
      int var19 = (int)(var10001 << 32 >>> 48);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var16 ^ 23419281909273L;
      e = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "ÓÎ\u008dL\u0012\u0004\u00ad\u009b}¨\u0091;²Ì\u009c.\u0010D\u008cr\u009c\u0007#:ñp¥{´öNA½";
      int var13 = "ÓÎ\u008dL\u0012\u0004\u00ad\u009b}¨\u0091;²Ì\u009c.\u0010D\u008cr\u009c\u0007#:ñp¥{´öNA½".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var24 = var11.substring(var9, var9 + var10);
         byte var26 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = b(var15).intern();
            switch(var26) {
            case 0:
               var14[var12++] = var30;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  d = new String[4];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -4389381861518018050L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var32 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var29 = true;
                  long var0 = var32;
                  KProperty[] var23 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(l4.class, true.f<invokedynamic>(24654, 3421694806876921705L ^ var16), true.f<invokedynamic>(13653, 8689950422068054640L ^ var16), 0)))};
                  I = var23;
                  U = new l4(var18, (char)var19, var20);
                  f = qi.g((il)U, true.f<invokedynamic>(31923, 7968172637351707543L ^ var16), 1.0F, RangesKt.rangeTo(0.1F, 10.0F), (pj)null, (Function0)null, (int)var0, var21, (Object)null);
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var30;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "\u009e>\u0084ïàc»\u0006(Qt`ô\u0087/r\u0018Ùz¢ÓUS\u0084ÈèY;\u00134\u0000~¯Ã\u0091\u0099ü\u0096¾\u0091(";
               var13 = "\u009e>\u0084ïàc»\u0006(Qt`ô\u0087/r\u0018Ùz¢ÓUS\u0084ÈèY;\u00134\u0000~¯Ã\u0091\u0099ü\u0096¾\u0091(".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var24 = var11.substring(var9, var9 + var10);
            var26 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17800;
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
            throw new RuntimeException("su/catlean/l4", var10);
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
         throw new RuntimeException("su/catlean/l4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
