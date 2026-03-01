package su.catlean;

import java.io.RandomAccessFile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class pm extends p0 {
   @NotNull
   private final RandomAccessFile e;
   private static boolean B;
   private static final long a = j0.a(-7830471038378043887L, 9165838038009625521L, MethodHandles.lookup().lookupClass()).a(202670660639882L);
   private static final String[] c;
   private static final String[] d;
   private static final Map i;
   private static final long j;
   private static final long k;

   public pm(int a, @NotNull String name, char a, int a) {
      // $FF: Couldn't be decompiled
   }

   protected void N(long a, @NotNull ByteBuffer buffer) {
      long var4 = var1 ^ 90272817559527L;
      Intrinsics.checkNotNullParameter(var3, true.x<invokedynamic>(9642, 2306529495257609224L ^ var1));
      pm var6 = this;

      Result.Companion var10000;
      Object var7;
      try {
         var10000 = Result.Companion;
         pm var11 = (pm)var6;
         boolean var8 = false;
         var11.e.write(var3.array());
         var7 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var10) {
         var10000 = Result.Companion;
         var7 = Result.constructor-impl(ResultKt.createFailure(var10));
      }

      if (Result.exceptionOrNull-impl(var7) != null) {
         boolean var9 = false;
         co.P.k(var4);
      }

   }

   private final void L(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 34264698248415L;
      long var5 = var1 ^ 38685371091508L;
      long var10001 = var1 ^ 104095020622075L;
      int var7 = (int)((var1 ^ 104095020622075L) >>> 32);
      long var8 = var10001 << 32 >>> 32;
      ByteBuffer var10 = ByteBuffer.allocate(4);

      while(true) {
         Intrinsics.checkNotNull(var10);
         this.W(var3, var10);
         bk var11 = (bk)bk.o().get(Integer.reverseBytes(var10.getInt(0)));
         this.W(var3, var10);
         int var12 = Integer.reverseBytes(var10.getInt(0));
         ByteBuffer var13 = ByteBuffer.allocate(var12);
         Intrinsics.checkNotNull(var13);
         this.W(var3, var13);
         String var10000 = Charset.defaultCharset().decode(var13.rewind()).toString();
         Intrinsics.checkNotNullExpressionValue(var10000, true.x<invokedynamic>(17542, 8307095705770238057L ^ var1));
         String var14 = var10000;
         co var18 = co.P;
         Json var15 = q.K();
         boolean var17 = false;
         var15.getSerializersModule();
         var18.I(new t(var11, var5, (h2)var15.decodeFromString((DeserializationStrategy)h2.j.Q(), var14)), var7, var8);
      }
   }

   private final void W(long param1, ByteBuffer param3) {
      // $FF: Couldn't be decompiled
   }

   public void E() {
      pm var1 = this;

      Result.Companion var10000;
      Object var2;
      try {
         var10000 = Result.Companion;
         pm var5 = (pm)var1;
         boolean var3 = false;
         var5.e.close();
         var2 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var4) {
         var10000 = Result.Companion;
         var2 = Result.constructor-impl(ResultKt.createFailure(var4));
      }

   }

   private static final Unit O(pm var0) {
      long var1 = a ^ 47394081770745L;
      long var3 = var1 ^ 134549542875961L;
      var0.L(var3);
      return Unit.INSTANCE;
   }

   public static void P(boolean var0) {
      B = var0;
   }

   public static boolean M() {
      return B;
   }

   public static boolean Y() {
      boolean var0 = M();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw b(var1);
      }
   }

   static {
      long var19 = a ^ 46676449104318L;
      i = new HashMap(13);
      true.A<invokedynamic>(true, 4806685104634543489L, var19);
      Cipher var10;
      Cipher var10000 = var10 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var19 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var11 = 1; var11 < 8; ++var11) {
         var10003[var11] = (byte)((int)(var19 << var11 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var17 = new String[5];
      int var15 = 0;
      String var14 = "\u008bZdnÒp\u0084\u0081å\"¨¢éc\u008eg '¾û\u0011±â¼®\u000bñÙ\u0082\u008fã\u008euC Í\u008a_\u0006ûf\u008e\u00172»ém[\u0082\u0010í3'4`ÐØ$\n\u008fb\u0002â\u0006\u00023";
      int var16 = "\u008bZdnÒp\u0084\u0081å\"¨¢éc\u008eg '¾û\u0011±â¼®\u000bñÙ\u0082\u008fã\u008euC Í\u008a_\u0006ûf\u008e\u00172»ém[\u0082\u0010í3'4`ÐØ$\n\u008fb\u0002â\u0006\u00023".length();
      char var13 = 16;
      int var12 = -1;

      label49:
      while(true) {
         ++var12;
         String var21 = var14.substring(var12, var12 + var13);
         byte var10001 = -1;

         while(true) {
            byte[] var18 = var10.doFinal(var21.getBytes("ISO-8859-1"));
            String var26 = b(var18).intern();
            switch(var10001) {
            case 0:
               var17[var15++] = var26;
               if ((var12 += var13) >= var16) {
                  c = var17;
                  d = new String[5];
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var19 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var19 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var7 = -646063905220658243L;
                  byte[] var9 = var5.doFinal(new byte[]{(byte)((int)(var7 >>> 56)), (byte)((int)(var7 >>> 48)), (byte)((int)(var7 >>> 40)), (byte)((int)(var7 >>> 32)), (byte)((int)(var7 >>> 24)), (byte)((int)(var7 >>> 16)), (byte)((int)(var7 >>> 8)), (byte)((int)var7)});
                  long var28 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
                  boolean var24 = true;
                  j = var28;
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var19 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var19 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 5611368027624558377L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  var28 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  var24 = true;
                  k = var28;
                  return;
               }

               var13 = var14.charAt(var12);
               break;
            default:
               var17[var15++] = var26;
               if ((var12 += var13) < var16) {
                  var13 = var14.charAt(var12);
                  continue label49;
               }

               var14 = "J\u0095Â\u0086yéôÆ\u0082ÞÜb\u00884MZµlN5õ0N£µ\u0090oÄ\u00074DCs\u008cÈ·k\u001a\u000b\u0014ÁjÙÁëlTb\u0010(Ý\"QuM\u0002$\u0080ZW·ÓS-¢";
               var16 = "J\u0095Â\u0086yéôÆ\u0082ÞÜb\u00884MZµlN5õ0N£µ\u0090oÄ\u00074DCs\u008cÈ·k\u001a\u000b\u0014ÁjÙÁëlTb\u0010(Ý\"QuM\u0002$\u0080ZW·ÓS-¢".length();
               var13 = '0';
               var12 = -1;
            }

            ++var12;
            var21 = var14.substring(var12, var12 + var13);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23342;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/pm", var10);
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
         throw new RuntimeException("su/catlean/pm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
