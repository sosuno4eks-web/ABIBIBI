package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

public final class z7 extends zf {
   @NotNull
   private final Json x;
   private static boolean s;
   private static final long b = j0.a(-776343161700709565L, 2434036357614093960L, MethodHandles.lookup().lookupClass()).a(109318549598554L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i;
   private static final long j;

   public z7(long a, @NotNull String id, @NotNull n_ defaultValue, @NotNull Function0 visible) {
      var1 ^= b;
      long var6 = var1 ^ 73863695971936L;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(28216, 472932839639908204L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.l<invokedynamic>(11974, 5357815079719321488L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.l<invokedynamic>(19353, 3837693228313598668L ^ var1));
      super(var3, var4, (Object)null, var6, (pj)null, var5, (int)j, (DefaultConstructorMarker)null);
      this.x = JsonKt.Json$default((Json)null, z7::C, 1, (Object)null);
   }

   // $FF: synthetic method
   public z7(String var1, n_ var2, short var3, short var4, Function0 var5, int var6, int var7, DefaultConstructorMarker var8) {
      long var9 = ((long)var3 << 48 | (long)var4 << 48 >>> 16 | (long)var7 << 32 >>> 32) ^ b;
      long var11 = var9 ^ 114433408842022L;
      if ((var6 & 4) != 0) {
         var5 = z7::w;
      }

      this(var11, var1, var2, var5);
   }

   public void n(long a, @NotNull String setting) {
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(27400, 2160660160886154007L ^ var1));
      Json var4 = this.x;
      boolean var6 = false;
      var4.getSerializersModule();
      this.v(var4.decodeFromString((DeserializationStrategy)n_.H.Q(), var3));
   }

   @NotNull
   public String toString() {
      Json var1 = this.x;
      Object var2 = this.B();
      boolean var3 = false;
      var1.getSerializersModule();
      return var1.encodeToString((SerializationStrategy)n_.H.Q(), var2);
   }

   private static final boolean w() {
      return true;
   }

   private static final Unit C(JsonBuilder var0) {
      long var1 = b ^ 125985904855330L;
      Intrinsics.checkNotNullParameter(var0, true.l<invokedynamic>(22712, 693924322990612018L ^ var1));
      var0.setIgnoreUnknownKeys(true);
      var0.setEncodeDefaults(true);
      return Unit.INSTANCE;
   }

   public static void Z(boolean var0) {
      s = var0;
   }

   public static boolean I() {
      return s;
   }

   public static boolean q() {
      boolean var0 = I();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw b(var1);
      }
   }

   static {
      long var14 = b ^ 43305853165261L;
      i = new HashMap(13);
      false.A<invokedynamic>(false, -1997078023326278263L, var14);
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
      String var9 = "k \u0091iüxwà¿í¶¦¸\u000bU\u0002Î\u0011\u0002Ò\u001aeI\u0019\u00183¯\u0096Kì\u0010\u0093*2~5µ\u0085ñI\u0099}\u0084µpèê\u0097\u0087\u0010X\u000b¯4m\u0090Hð8\u0098[Î\u009cd:\u0085";
      int var11 = "k \u0091iüxwà¿í¶¦¸\u000bU\u0002Î\u0011\u0002Ò\u001aeI\u0019\u00183¯\u0096Kì\u0010\u0093*2~5µ\u0085ñI\u0099}\u0084µpèê\u0097\u0087\u0010X\u000b¯4m\u0090Hð8\u0098[Î\u009cd:\u0085".length();
      char var8 = 24;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var16 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = b(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var21;
               if ((var7 += var8) >= var11) {
                  d = var12;
                  h = new String[5];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 4502067194092293591L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  j = var23;
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

               var9 = "\u000bUÈGîÒÔý\u007fÅR7)_\u0017Ë\u0010\\k\u008c læiT2\n\bußS\nµ";
               var11 = "\u000bUÈGîÒÔý\u007fÅR7)_\u0017Ë\u0010\\k\u008c læiT2\n\bußS\nµ".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29812;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/z7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/z7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
