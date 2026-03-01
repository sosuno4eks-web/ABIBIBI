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
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

public final class zk extends zf {
   @NotNull
   private final Json M;
   private static String W;
   private static final long b = j0.a(4197267893598610688L, 1042253461009452463L, MethodHandles.lookup().lookupClass()).a(93611637311384L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i;
   private static final long j;

   public zk(short a, @NotNull String id, short a, int a, @NotNull pj defaultValue, @NotNull Function0 visible) {
      long var7 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      long var9 = var7 ^ 116867645694052L;
      Intrinsics.checkNotNullParameter(var2, true.q<invokedynamic>(23095, 2953470123297383613L ^ var7));
      Intrinsics.checkNotNullParameter(var5, true.q<invokedynamic>(21291, 1367918319306550695L ^ var7));
      Intrinsics.checkNotNullParameter(var6, true.q<invokedynamic>(3747, 2746033491608760360L ^ var7));
      super(var2, var5, (Object)null, var9, (pj)null, var6, (int)j, (DefaultConstructorMarker)null);
      this.M = JsonKt.Json$default((Json)null, zk::B, 1, (Object)null);
   }

   // $FF: synthetic method
   public zk(byte var1, int var2, String var3, pj var4, Function0 var5, int var6, int var7, DefaultConstructorMarker var8) {
      long var9 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var7 << 40 >>> 40) ^ b;
      long var10001 = var9 ^ 133410061596294L;
      int var11 = (int)((var9 ^ 133410061596294L) >>> 48);
      int var12 = (int)(var10001 << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      if ((var6 & 4) != 0) {
         var5 = zk::W;
      }

      this((short)var11, var3, (short)var12, var13, var4, var5);
   }

   public void n(long a, @NotNull String setting) {
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(31116, 9215767239803078733L ^ var1));
      this.v(this.x());
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 82163543732335L;
      String var10000 = this.M();
      String var10002 = true.q<invokedynamic>(21944, 1727245798012194428L ^ var1);
      return var10002 + var10000;
   }

   private static final boolean W() {
      return true;
   }

   private static final Unit B(JsonBuilder var0) {
      long var1 = b ^ 109216211635142L;
      Intrinsics.checkNotNullParameter(var0, true.q<invokedynamic>(18927, 8210025297093683590L ^ var1));
      var0.setIgnoreUnknownKeys(true);
      var0.setEncodeDefaults(true);
      return Unit.INSTANCE;
   }

   public static void S(String var0) {
      W = var0;
   }

   public static String E() {
      return W;
   }

   static {
      long var14 = b ^ 103024888811335L;
      i = new HashMap(13);
      "oIz3wc".A<invokedynamic>("oIz3wc", -1710576479988720423L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[6];
      int var10 = 0;
      String var9 = "\u0014ý¤¥·±¥ãBÐyê×FÍ\u0002 /É?u\u0080K\u0084{E)\u0016\u009a\u0086ÖZ;d,W#\u0006ò\u001fÜÀòg{\u009aGFá\u0010\u0006\u0016~È,%|`½ÿ8G\u0098²\u0093ú\u0010\u0007.aÂªû\u0095GaÝ\fn3¶\u009bj";
      int var11 = "\u0014ý¤¥·±¥ãBÐyê×FÍ\u0002 /É?u\u0080K\u0084{E)\u0016\u009a\u0086ÖZ;d,W#\u0006ò\u001fÜÀòg{\u009aGFá\u0010\u0006\u0016~È,%|`½ÿ8G\u0098²\u0093ú\u0010\u0007.aÂªû\u0095GaÝ\fn3¶\u009bj".length();
      char var8 = 16;
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
                  h = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -6989825466485980441L;
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

               var9 = "jÎ\u0016$MðB\u00964G\f¢\b\u0003±9\u0080\u0086\u001exh\u0017\u00ad\u007f\u0001¸m\u0080dÁº\f\u0010q:b©¦c\u0080g¹ÃYÅ¢\u0001EU";
               var11 = "jÎ\u0016$MðB\u00964G\f¢\b\u0003±9\u0080\u0086\u001exh\u0017\u00ad\u007f\u0001¸m\u0080dÁº\f\u0010q:b©¦c\u0080g¹ÃYÅ¢\u0001EU".length();
               var8 = ' ';
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19886;
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
            throw new RuntimeException("su/catlean/zk", var10);
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
         throw new RuntimeException("su/catlean/zk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
