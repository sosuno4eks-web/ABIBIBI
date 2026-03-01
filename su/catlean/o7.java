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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.gofra.Flow;

public final class o7 extends k9 {
   @NotNull
   public static final o7 e;
   static final KProperty[] m;
   @NotNull
   private static final zr U;
   private static final long b = j0.a(-7364616323068957206L, 2006696028634857976L, MethodHandles.lookup().lookupClass()).a(162256085956321L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;

   private o7(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var6 = var4 ^ 602827748655L;
      super(var6, true.q<invokedynamic>(25291, 6724088580356323292L ^ var4), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final eq c(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 8424954369675L;
      int var6 = (int)((var4 ^ 8424954369675L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (eq)U.k((short)var6, this, m[0], (short)var7, var8);
   }

   @Flow
   public final void c(@NotNull MoveEvent e) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = b ^ 122482180881085L;
      long var18 = var16 ^ 93815007572559L;
      long var10001 = var16 ^ 62905864918254L;
      int var20 = (int)((var16 ^ 62905864918254L) >>> 56);
      long var21 = var10001 << 8 >>> 8;
      f = new HashMap(13);
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
      String var11 = "ç¦ú\u001avj\u0003ð\u008c\nh$\u0090R \u008eEù\u0005è\u0004¨\u0005\bïx»Æâgº¹0åL*¾\u008aO¬\u0004àÍ\f\u0080]=\u0098F'\u009aJ\"7\u0095eúÅÿ16ÈÑßÆgÛíM\u0087 #\u0005F\u0097KÃÕb\u0085\u0010";
      int var13 = "ç¦ú\u001avj\u0003ð\u008c\nh$\u0090R \u008eEù\u0005è\u0004¨\u0005\bïx»Æâgº¹0åL*¾\u008aO¬\u0004àÍ\f\u0080]=\u0098F'\u009aJ\"7\u0095eúÅÿ16ÈÑßÆgÛíM\u0087 #\u0005F\u0097KÃÕb\u0085\u0010".length();
      char var10 = ' ';
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
                  long var4 = 8012977453916702387L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var32 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var29 = true;
                  long var0 = var32;
                  KProperty[] var23 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o7.class, true.q<invokedynamic>(4250, 5832808201816620736L ^ var16), true.q<invokedynamic>(25538, 5007233623306390939L ^ var16), 0)))};
                  m = var23;
                  e = new o7((byte)var20, var21);
                  U = qi.M((il)e, true.q<invokedynamic>(11960, 7230393675835572451L ^ var16), (Enum)eq.NCP, (pj)null, (Function0)null, (int)var0, (Object)null, var18);
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

               var11 = "dÕ\b9nî÷f«\u008a\b\u000es¤O\t\u0010|÷^\u0096N\u0090\u0004,\u0003\u0012\u007f~Át-¯";
               var13 = "dÕ\b9nî÷f«\u008a\b\u000es¤O\t\u0010|÷^\u0096N\u0090\u0004,\u0003\u0012\u007f~Át-¯".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var24 = var11.substring(var9, var9 + var10);
            var26 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15172;
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
            throw new RuntimeException("su/catlean/o7", var10);
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
         throw new RuntimeException("su/catlean/o7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
