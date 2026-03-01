package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nu extends nm {
   @NotNull
   public static final nu V;
   // $FF: synthetic field
   static final KProperty[] Z;
   @NotNull
   private static final zo c;
   private static final long d = j0.a(-4488668845498099066L, 2727059057366441153L, MethodHandles.lookup().lookupClass()).a(162340045344539L);
   private static final String[] e;
   private static final String[] i;
   private static final Map j;

   private nu(long var1) {
      var1 ^= d;
      long var3 = var1 ^ 96322531318380L;
      super(true.b<invokedynamic>(13659, 547683345693527129L ^ var1), var3);
   }

   private final boolean V(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ d;
      long var10001 = var4 ^ 138484784823146L;
      int var6 = (int)((var4 ^ 138484784823146L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var6, this, Z[0], (short)var7, var8);
   }

   public void k(@NotNull class_332 context, long a) {
      long var10001 = var2 ^ 138123970074053L;
      int var4 = (int)((var2 ^ 138123970074053L) >>> 32);
      long var5 = var10001 << 32 >>> 32;
      long var7 = var2 ^ 58527580722751L;
      long var9 = var2 ^ 133203098083079L;
      long var11 = var2 ^ 128966024353151L;
      String[] var10000 = -1776618330756458784L.A<invokedynamic>(-1776618330756458784L, var2);
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(5405, 8170319504257527268L ^ var2));
      String[] var13 = var10000;

      String var19;
      label24: {
         String var15;
         Object[] var16;
         StringCompanionObject var18;
         label23: {
            label22: {
               try {
                  if (var13 != null) {
                     break label22;
                  }

                  if (!this.V(var4, var5)) {
                     break label23;
                  }
               } catch (NumberFormatException var17) {
                  throw var17.A<invokedynamic>(var17, -1820826842468374620L, var2);
               }

               var18 = StringCompanionObject.INSTANCE;
            }

            var15 = true.b<invokedynamic>(13061, 5614657972317293567L ^ var2);
            var16 = new Object[]{(double)((float)Math.rint((double)(this.D(var9) * x2.E.g()))) * 0.1D};
            var19 = String.format(var15, Arrays.copyOf(var16, var16.length));
            Intrinsics.checkNotNullExpressionValue(var19, true.b<invokedynamic>(8741, 933530497317280472L ^ var2));
            var19 = var19 + true.b<invokedynamic>(30272, 3994677647014907576L ^ var2);
            break label24;
         }

         var18 = StringCompanionObject.INSTANCE;
         var15 = true.b<invokedynamic>(18818, 4590429654973018484L ^ var2);
         var16 = new Object[]{(double)((float)Math.rint((double)(this.w(var11) * x2.E.g()))) * 0.1D};
         var19 = String.format(var15, Arrays.copyOf(var16, var16.length));
         Intrinsics.checkNotNullExpressionValue(var19, true.b<invokedynamic>(14374, 4485947179751669978L ^ var2));
         var19 = var19 + true.b<invokedynamic>(4425, 4931164251538926006L ^ var2);
      }

      String var14 = var19;
      this.G(var1, var7, var14);
   }

   private final float w(long var1) {
      var1 ^= d;
      long var3 = var1 ^ 59438453820167L;

      float var10000;
      try {
         if (s8.f(var3).method_6128()) {
            var10000 = i4.v.b() * 720.0F;
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 576578252605409567L, var1);
      }

      var10000 = i4.v.h() * 720.0F;
      return var10000;
   }

   private final float D(long var1) {
      var1 ^= d;
      long var3 = var1 ^ 64192222904703L;

      float var10000;
      try {
         if (s8.f(var3).method_6128()) {
            var10000 = i4.v.b() * 200.0F;
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -4433680912709123225L, var1);
      }

      var10000 = i4.v.h() * 200.0F;
      return var10000;
   }

   static {
      long var16 = d ^ 2803847655242L;
      long var18 = var16 ^ 95561155102986L;
      long var20 = var16 ^ 85043309343790L;
      j = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[11];
      int var12 = 0;
      String var11 = "_7\nT\u0006x\\V&©××Ñ'\u008eÜ_8À#Ñé\u0083í\u0010\u008a:\u009bEÔß¼-ÀÕè\u001b\u0094öh¬ \u008a»\u001e\u0007tÿ¾¡¿ì\u0088¶ö\bD©Z^Ó¾\u009c\u0098¬äbqI\u008aa\u001b\"Õ ¦¯\u001d¥\u0084Â÷\u001dI]\u0093UpdÍa7LYâ&\b03B\\$\u001c¿®Ö\u0096\u0010\u0016,\u0010ãU\u0087°Hn·\u001b\u0014)Ù¾C\u0010¶\u0013\u0088·óL\u008b\rkêÔr÷¤5Ç\u0010ÔÔà\u0094\u0003\u000e\u0092úü\u001bY<0¢JK\u0010\u0089º\tò/õ;®¸®\u0081¼Í»Q\u0014\u0010û©4äd\u0084\u0002ß%`¼%\u0097Ì_I";
      int var13 = "_7\nT\u0006x\\V&©××Ñ'\u008eÜ_8À#Ñé\u0083í\u0010\u008a:\u009bEÔß¼-ÀÕè\u001b\u0094öh¬ \u008a»\u001e\u0007tÿ¾¡¿ì\u0088¶ö\bD©Z^Ó¾\u009c\u0098¬äbqI\u008aa\u001b\"Õ ¦¯\u001d¥\u0084Â÷\u001dI]\u0093UpdÍa7LYâ&\b03B\\$\u001c¿®Ö\u0096\u0010\u0016,\u0010ãU\u0087°Hn·\u001b\u0014)Ù¾C\u0010¶\u0013\u0088·óL\u008b\rkêÔr÷¤5Ç\u0010ÔÔà\u0094\u0003\u000e\u0092úü\u001bY<0¢JK\u0010\u0089º\tò/õ;®¸®\u0081¼Í»Q\u0014\u0010û©4äd\u0084\u0002ß%`¼%\u0097Ì_I".length();
      char var10 = 24;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var23 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var23.getBytes("ISO-8859-1"));
            String var28 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var28;
               if ((var9 += var10) >= var13) {
                  e = var14;
                  i = new String[11];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -7271825264401507859L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var30 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var26 = true;
                  long var0 = var30;
                  KProperty[] var22 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(nu.class, true.b<invokedynamic>(3774, 680834707297273213L ^ var16), true.b<invokedynamic>(12610, 3386325696204421764L ^ var16), 0)))};
                  Z = var22;
                  V = new nu(var18);
                  c = qi.R((il)V, true.b<invokedynamic>(12974, 1197732973442775393L ^ var16), false, (pj)null, (Function0)null, (int)var0, var20, (Object)null);
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var28;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "\u007f\u00024*¦\u0010\u0007ÆÄr?3\u001fv¤\u0010\u0018?Õ-\u008fS¨\u0095ÓýÁ\u0090\u0082¥Ï\u0001m¸)§IYß\u0085j";
               var13 = "\u007f\u00024*¦\u0010\u0007ÆÄr?3\u001fv¤\u0010\u0018?Õ-\u008fS¨\u0095ÓýÁ\u0090\u0082¥Ï\u0001m¸)§IYß\u0085j".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var23 = var11.substring(var9, var9 + var10);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24392;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/nu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/nu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
