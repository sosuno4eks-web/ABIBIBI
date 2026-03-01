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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class k2 extends k9 {
   @NotNull
   public static final k2 J;
   static final KProperty[] X;
   @NotNull
   private static final zr r;
   private static k9[] N;
   private static final long b = j0.a(3221232455408464628L, 1173653512037758157L, MethodHandles.lookup().lookupClass()).a(187930709506782L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private k2(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 97345023092579L;
      super(var3, true.y<invokedynamic>(15655, 3984629975877844252L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @NotNull
   public final an s(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 88573903526526L;
      int var6 = (int)((var4 ^ 88573903526526L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      String[] var9 = -6223675928070782633L.A<invokedynamic>(-6223675928070782633L, var4);

      try {
         an var10000 = (an)r.k((short)var6, this, X[0], (short)var7, var8);
         if (var9 == null) {
            (new int[4]).A<invokedynamic>(new int[4], -6228503518158820812L, var4);
         }

         return var10000;
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, -6233594769137704803L, var4);
      }
   }

   static {
      long var16 = b ^ 61727256721424L;
      long var18 = var16 ^ 59874809414671L;
      long var20 = var16 ^ 16975859896159L;
      k9[] var10000 = new k9[4];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 2947029476883443706L, var16);
      Cipher var7;
      Cipher var23 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "ðþæe.\u0083@\n\u0093\u0006·\u0006\f\u0089jï\u009ch~ÃÑ\f\ræzC\u009evÚ\u0088¿m\u0010,\u0004\"Úz\u001aæ\u0090Ö2:dÃÐ\u0082\u0015";
      int var13 = "ðþæe.\u0083@\n\u0093\u0006·\u0006\f\u0089jï\u009ch~ÃÑ\f\ræzC\u009evÚ\u0088¿m\u0010,\u0004\"Úz\u001aæ\u0090Ö2:dÃÐ\u0082\u0015".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var24 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var29;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  d = new String[4];
                  Cipher var2;
                  var23 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 3026326596424043419L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var31 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var27 = true;
                  long var0 = var31;
                  KProperty[] var22 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k2.class, true.y<invokedynamic>(3000, 5458936121450717073L ^ var16), true.y<invokedynamic>(29639, 5147543386804856813L ^ var16), 0)))};
                  X = var22;
                  J = new k2(var18);
                  r = qi.M((il)J, true.y<invokedynamic>(13893, 2974067189630526062L ^ var16), (Enum)an.FREE, (pj)null, (Function0)null, (int)var0, (Object)null, var20);
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var29;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "ÜÂuvö¥g+vÖ£~¨\u0002Æÿ1\u0097ü ?ÆÔö\n\u0093.\u0092\u0098ò~\u0002\u009dïk¿\u008cHÓ¶Á®\u001c\u0005Ùrì\u0088\u0010$s©DLöÒ\\*çÂÅt©\u0089Y";
               var13 = "ÜÂuvö¥g+vÖ£~¨\u0002Æÿ1\u0097ü ?ÆÔö\n\u0093.\u0092\u0098ò~\u0002\u009dïk¿\u008cHÓ¶Á®\u001c\u0005Ùrì\u0088\u0010$s©DLöÒ\\*çÂÅt©\u0089Y".length();
               var10 = '0';
               var9 = -1;
            }

            ++var9;
            var24 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   public static void b(k9[] var0) {
      N = var0;
   }

   public static k9[] C() {
      return N;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31780;
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
            throw new RuntimeException("su/catlean/k2", var10);
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
         throw new RuntimeException("su/catlean/k2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
