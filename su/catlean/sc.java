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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class sc implements xd {
   @NotNull
   private final Json b;
   @NotNull
   private final File s;
   public List D;
   private static final long a = j0.a(1322388095519678159L, 1497528905727024155L, MethodHandles.lookup().lookupClass()).a(157561594959002L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public sc(char a, short a, int a, @NotNull Json json) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.y<invokedynamic>(21205, 8220491856344835096L ^ var5));
      super();
      this.b = var4;
      this.s = new File(kf.e(), true.y<invokedynamic>(18284, 1531127076784075168L ^ var5));
   }

   @NotNull
   public final List j(long var1) {
      var1 ^= a;

      try {
         List var10000 = this.D;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -4001577900427437190L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.y<invokedynamic>(3111, 1642019814244095539L ^ var1));
      return null;
   }

   public final void E(char a, short a, @NotNull List <set-?>, int a) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.y<invokedynamic>(28826, 481058153313987003L ^ var5));
      this.D = var3;
   }

   public void N(long var1) {
      long var10001 = var1 ^ 78498904720968L;
      int var3 = (int)((var1 ^ 78498904720968L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);

      List var14;
      sc var10000;
      label29: {
         try {
            var10000 = this;
            if (this.s.createNewFile()) {
               var14 = (List)(new ArrayList());
               break label29;
            }
         } catch (Exception var12) {
            throw var12.A<invokedynamic>(var12, 14577577432109886L, var1);
         }

         sc var10 = var10000;

         List var7;
         try {
            var10000 = var10;
            Json var13 = this.b;
            String var8 = FilesKt.readText$default(this.s, (Charset)null, 1, (Object)null);
            boolean var9 = false;
            var13.getSerializersModule();
            var7 = (List)var13.decodeFromString((DeserializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var8);
         } catch (Exception var11) {
            var10000 = var10;
            s8.T().warn(true.y<invokedynamic>(18973, 2288986028850518089L ^ var1));
            var7 = (List)(new ArrayList());
         }

         var14 = var7;
      }

      List var6 = var14;
      var10000.E((char)var3, (short)var4, var6, var5);
   }

   public void i(long var1) {
      long var3 = var1 ^ 59740569123533L;
      File var10000 = this.s;
      Json var5 = this.b;
      List var6 = this.j(var3);
      boolean var7 = false;
      var5.getSerializersModule();
      FilesKt.writeText$default(var10000, var5.encodeToString((SerializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var6), (Charset)null, 2, (Object)null);
   }

   static {
      long var0 = a ^ 104067954439636L;
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
      String var6 = "Ø\f÷\u009a¶\"\u009cÆø\u0019Ò4o>Á%ö$T\u0005·ë£\u008eX\u0088^Ö\u0002¾ÄÛÂÁ«Ë\u0083ru<\u001dg\u0083 \u0086ú\u0091\t{59.O\u0013/\u0089¹_Iý¦\u0010ßW\u0086Ëã\u0097ã\u0094\u0004.\u0087¦+ª¢k§B\u0010¿¬0\u0098fö!mª\u0086Ö9\u0010\u0087\u000eU \u001b¶\u001c[\u0096,æE\u0005'\u0096Ã½ý\u008f8À\u0006\u000b=ç Ú\u0081°\u0092¢\u0013Ô\u0084\u0000Å";
      int var8 = "Ø\f÷\u009a¶\"\u009cÆø\u0019Ò4o>Á%ö$T\u0005·ë£\u008eX\u0088^Ö\u0002¾ÄÛÂÁ«Ë\u0083ru<\u001dg\u0083 \u0086ú\u0091\t{59.O\u0013/\u0089¹_Iý¦\u0010ßW\u0086Ëã\u0097ã\u0094\u0004.\u0087¦+ª¢k§B\u0010¿¬0\u0098fö!mª\u0086Ö9\u0010\u0087\u000eU \u001b¶\u001c[\u0096,æE\u0005'\u0096Ã½ý\u008f8À\u0006\u000b=ç Ú\u0081°\u0092¢\u0013Ô\u0084\u0000Å".length();
      char var5 = 'P';
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
                  c = var9;
                  d = new String[5];
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

               var6 = "Âg\u009cäÃÃj\u0011\u0099ñ¥«\u0098å½h\u0010Ü, «PÉ±þg4ÿt7·ô\u0098";
               var8 = "Âg\u009cäÃÃj\u0011\u0099ñ¥«\u0098å½h\u0010Ü, «PÉ±þg4ÿt7·ô\u0098".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21355;
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
            throw new RuntimeException("su/catlean/sc", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/sc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
