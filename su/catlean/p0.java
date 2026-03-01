package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

public abstract class p0 {
   private static String K;
   private static final long b = j0.a(5112603630244204387L, 3183057712569906324L, MethodHandles.lookup().lookupClass()).a(56268190328179L);
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long l;

   public final void a(int a, char a, @NotNull bk opcode, char a, @NotNull JsonElement element) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var8 = var6 ^ 55827397856073L;
      String var10000 = -4599345457363113608L.A<invokedynamic>(-4599345457363113608L, var6);
      Intrinsics.checkNotNullParameter(var3, true.x<invokedynamic>(27585, 3327989389666728429L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.x<invokedynamic>(9712, 2582342604061538271L ^ var6));
      Map var11 = MapsKt.toMutableMap((Map)JsonElementKt.getJsonObject(var5));
      var11.put(true.x<invokedynamic>(25667, 2339360479855916653L ^ var6), JsonElementKt.JsonPrimitive(UUID.randomUUID().toString()));
      Json var12 = q.K();
      JsonObject var13 = new JsonObject(var11);
      boolean var14 = false;
      var12.getSerializersModule();
      String var20 = var12.encodeToString((SerializationStrategy)JsonObject.Companion.serializer(), var13);
      byte[] var10001 = var20.getBytes(Charsets.UTF_8);
      Intrinsics.checkNotNullExpressionValue(var10001, true.x<invokedynamic>(25721, 8919796355929552468L ^ var6));
      byte[] var21 = var10001;
      byte[] var22 = var21;
      var14 = false;
      ByteBuffer var15 = ByteBuffer.allocate(var21.length + (int)l);
      ByteBuffer var16 = var15;
      p0 var17 = this;
      boolean var18 = false;
      var15.putInt(my.y(var3.ordinal()));
      var15.putInt(my.y(var21.length));
      String var10 = var10000;

      try {
         var16.put(var22);
         var16.flip();
         Intrinsics.checkNotNullExpressionValue(var15, true.x<invokedynamic>(27200, 3983453889210267753L ^ var6));
         var17.N(var8, var15);
         if (var10 != null) {
            (new int[4]).A<invokedynamic>(new int[4], -4545866279222967470L, var6);
         }

      } catch (NumberFormatException var19) {
         throw var19.A<invokedynamic>(var19, -4590244636261590775L, var6);
      }
   }

   protected abstract void N(long var1, @NotNull ByteBuffer var3);

   public abstract void E();

   public static void f(String var0) {
      K = var0;
   }

   public static String R() {
      return K;
   }

   static {
      long var14 = b ^ 104307929880224L;
      h = new HashMap(13);
      null.A<invokedynamic>((Object)null, 7786428428122815558L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[5];
      int var10 = 0;
      String var9 = "÷B°kª¢Àë5¦^\u008døÎ\u008cî \u000e\u009eu]\u0010\"\u0011\u0097\u0081ò\u0004Å\u0090>\u0094\u0010\u009b2bRùâI7`Ëþ7¹Ü\u0098õ\u0010C\u008eÄ#O¦¬¾méBe\u0010Ä¤R";
      int var11 = "÷B°kª¢Àë5¦^\u008døÎ\u008cî \u000e\u009eu]\u0010\"\u0011\u0097\u0081ò\u0004Å\u0090>\u0094\u0010\u009b2bRùâI7`Ëþ7¹Ü\u0098õ\u0010C\u008eÄ#O¦¬¾méBe\u0010Ä¤R".length();
      char var8 = ' ';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var16 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var21;
               if ((var7 += var8) >= var11) {
                  f = var12;
                  g = new String[5];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -3392538323084401223L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  l = var23;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var21;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "·Î\u008dqwº\u000f\u001a\u0085¯ìËÛÂ\u0089½ Kw\u008cô²ð/MqFr\u0005cHH\u001fëÐA\u0019\u008a\u0012ý\u0083MÉ&\u009cN\u0015\u0085v";
               var11 = "·Î\u008dqwº\u000f\u001a\u0085¯ìËÛÂ\u0089½ Kw\u008cô²ð/MqFr\u0005cHH\u001fëÐA\u0019\u008a\u0012ý\u0083MÉ&\u009cN\u0015\u0085v".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5096;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/p0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/p0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
