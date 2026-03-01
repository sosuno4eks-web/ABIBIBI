package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class m8 implements xd {
   @NotNull
   private final Json L;
   @NotNull
   private final File r;
   public eb D;
   private static final long a = j0.a(2763274278969169120L, 3472017918199309799L, MethodHandles.lookup().lookupClass()).a(104123009002504L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public m8(byte a, long a, @NotNull Json json) {
      long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(16372, 9037013128145529497L ^ var5));
      super();
      this.L = var4;
      this.r = new File(kf.e(), true.n<invokedynamic>(9766, 156348455138751311L ^ var5));
   }

   @NotNull
   public final eb A(long var1) {
      var1 ^= a;

      try {
         eb var10000 = this.D;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, 2984044004332849325L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.n<invokedynamic>(28013, 986787996908291718L ^ var1));
      return null;
   }

   public final void T(@NotNull eb <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(5190, 2473458278244179503L ^ var2));
      this.D = var1;
   }

   public void N(long var1) {
      long var3 = var1 ^ 66950001343471L;
      long var5 = var1 ^ 108729215593641L;

      m8 var10000;
      eb var10001;
      label29: {
         try {
            var10000 = this;
            if (this.r.createNewFile()) {
               var10001 = new eb(var5, (List)(new ArrayList()));
               break label29;
            }
         } catch (Exception var12) {
            throw var12.A<invokedynamic>(var12, 49956241656177013L, var1);
         }

         m8 var10 = var10000;

         eb var7;
         try {
            var10000 = var10;
            Json var13 = this.L;
            String var8 = FilesKt.readText$default(this.r, (Charset)null, 1, (Object)null);
            boolean var9 = false;
            var13.getSerializersModule();
            var7 = (eb)var13.decodeFromString((DeserializationStrategy)eb.o.N(), var8);
         } catch (Exception var11) {
            var10000 = var10;
            s8.T().warn(true.n<invokedynamic>(11272, 2593096978022362680L ^ var1));
            var7 = new eb(var5, (List)(new ArrayList()));
         }

         var10001 = var7;
      }

      var10000.T(var10001, var3);
   }

   public void i(long var1) {
      long var3 = var1 ^ 11803953784281L;
      File var10000 = this.r;
      Json var5 = this.L;
      eb var6 = this.A(var3);
      boolean var7 = false;
      var5.getSerializersModule();
      FilesKt.writeText$default(var10000, var5.encodeToString((SerializationStrategy)eb.o.N(), var6), (Charset)null, 2, (Object)null);
   }

   static {
      long var0 = a ^ 1903352977932L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u0095\u0007\u0085Ú\u0019µ\u0007«\"·Ç¤(\u008aD×X¶½\u0004x¼\u009däÓÄHd^(\u008f2î\u00126,ïÕ\u00834FxnÐZò\u008d*Í \u00988\b'À<ö\u0094È(çÙ\u000bP\u009aE\u0016\u009dhÏÝ/\b<\u009d~\u009fò>G^Åê\u001e\\\u0088ò\u0003dpï\u0010¥\f<\u00adµÝ\u00073\u001dú}¨\u0016\u0010\frH\u007fËÁòâ\u008b°ôqZB\bÚ";
      int var8 = "\u0095\u0007\u0085Ú\u0019µ\u0007«\"·Ç¤(\u008aD×X¶½\u0004x¼\u009däÓÄHd^(\u008f2î\u00126,ïÕ\u00834FxnÐZò\u008d*Í \u00988\b'À<ö\u0094È(çÙ\u000bP\u009aE\u0016\u009dhÏÝ/\b<\u009d~\u009fò>G^Åê\u001e\\\u0088ò\u0003dpï\u0010¥\f<\u00adµÝ\u00073\u001dú}¨\u0016\u0010\frH\u007fËÁòâ\u008b°ôqZB\bÚ".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[5];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "»wc\u0091-\u001bJÕ§\u0088¼Üh\u0016ð\u0010\u0018L\u0084ZSê©.ê\u0084ºÑñ\u0001\u008eG \u0014LGX\u008dXe\u008d";
               var8 = "»wc\u0091-\u001bJÕ§\u0088¼Üh\u0016ð\u0010\u0018L\u0084ZSê©.ê\u0084ºÑñ\u0001\u008eG \u0014LGX\u008dXe\u008d".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17166;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/m8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/m8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
