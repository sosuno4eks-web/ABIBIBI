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

public final class vm implements xd {
   @NotNull
   private final Json u;
   @NotNull
   private final File V;
   public bm k;
   private static final long a = j0.a(291491153791074881L, 7186492124778512890L, MethodHandles.lookup().lookupClass()).a(26429179570796L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vm(@NotNull Json json, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(29728, 5994842975628074082L ^ var2));
      super();
      this.u = var1;
      this.V = new File(kf.e(), true.f<invokedynamic>(1088, 6213243589878934531L ^ var2));
   }

   @NotNull
   public final bm O(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;

      try {
         bm var10000 = this.k;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -5363814876323504214L, var4);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.f<invokedynamic>(19345, 4069195430955044669L ^ var4));
      return null;
   }

   public final void d(long a, @NotNull bm <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(12776, 6354187392793922203L ^ var1));
      this.k = var3;
   }

   public void N(long var1) {
      long var3 = var1 ^ 88807659883609L;
      long var5 = var1 ^ 88536208808336L;

      vm var10000;
      bm var10001;
      label29: {
         try {
            var10000 = this;
            if (this.V.createNewFile()) {
               var10001 = new bm(var5, (List)(new ArrayList()));
               break label29;
            }
         } catch (Exception var12) {
            throw var12.A<invokedynamic>(var12, 39308083300575918L, var1);
         }

         vm var10 = var10000;

         bm var7;
         try {
            var10000 = var10;
            Json var13 = this.u;
            String var8 = FilesKt.readText$default(this.V, (Charset)null, 1, (Object)null);
            boolean var9 = false;
            var13.getSerializersModule();
            var7 = (bm)var13.decodeFromString((DeserializationStrategy)bm.p.X(), var8);
         } catch (Exception var11) {
            var10000 = var10;
            s8.T().warn(true.f<invokedynamic>(2302, 1734786565581158743L ^ var1));
            var7 = new bm(var5, (List)(new ArrayList()));
         }

         var10001 = var7;
      }

      var10000.d(var3, var10001);
   }

   public void i(long var1) {
      long var10001 = var1 ^ 3300755917878L;
      int var3 = (int)((var1 ^ 3300755917878L) >>> 32);
      long var4 = var10001 << 32 >>> 32;
      File var10000 = this.V;
      Json var6 = this.u;
      bm var7 = this.O(var3, var4);
      boolean var8 = false;
      var6.getSerializersModule();
      FilesKt.writeText$default(var10000, var6.encodeToString((SerializationStrategy)bm.p.X(), var7), (Charset)null, 2, (Object)null);
   }

   static {
      long var0 = a ^ 64903148852140L;
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
      String var6 = "\u001fV¿Õ®\u000bÔçrz\u0081\u0080ë\\<Óù\u000b\u0003\u0010Ã\u0017÷ý\u0011 z)Yîgz%\u0087g\u0007\u007fqBÊh½àTri\u0086e\u0092H\n¹\u0099E#\u0093gxþÖ\u0099]DÖÂjvn\u0010\u008b¤aRü\u0010\u000b\u0088ÀÞI5¯\u0011!b}¡ì\u0010x9Gq#9Ð£\u0081ã\u0015w\u008e¸eþ\u0018Ê\u001còáxö\u0016}¡VT\u0005\u0087°aS` Ïk\u0013\u0010øå";
      int var8 = "\u001fV¿Õ®\u000bÔçrz\u0081\u0080ë\\<Óù\u000b\u0003\u0010Ã\u0017÷ý\u0011 z)Yîgz%\u0087g\u0007\u007fqBÊh½àTri\u0086e\u0092H\n¹\u0099E#\u0093gxþÖ\u0099]DÖÂjvn\u0010\u008b¤aRü\u0010\u000b\u0088ÀÞI5¯\u0011!b}¡ì\u0010x9Gq#9Ð£\u0081ã\u0015w\u008e¸eþ\u0018Ê\u001còáxö\u0016}¡VT\u0005\u0087°aS` Ïk\u0013\u0010øå".length();
      char var5 = 'X';
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

               var6 = "¦\u0091c7Â\n×p¶\u0007\u009d\u001bU\u009c9Q\u00109\u0092X\u001dÄ\u0092aE\u0082\u0098r²\u008b\f\t\u0082";
               var8 = "¦\u0091c7Â\n×p¶\u0007\u009d\u001bU\u009c9Q\u00109\u0092X\u001dÄ\u0092aE\u0082\u0098r²\u008b\f\t\u0082".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12438;
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
            throw new RuntimeException("su/catlean/vm", var10);
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
         throw new RuntimeException("su/catlean/vm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
