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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
public enum fq {
   @NotNull
   public static final zg Companion;
   @NotNull
   private static final Lazy J;
   public static final fq ERROR;
   public static final fq READY;
   private static final fq[] b;
   private static final EnumEntries G;
   private static final long a = j0.a(4001443230023687359L, 6679082232882373393L, MethodHandles.lookup().lookupClass()).a(89810954541755L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   @NotNull
   public static EnumEntries R() {
      return G;
   }

   private static final KSerializer c() {
      long var0 = a ^ 74789218452844L;
      return EnumsKt.createSimpleEnumSerializer(true.z<invokedynamic>(32299, 1501337917587796177L ^ var0), (Enum[])values());
   }

   private static final fq[] S() {
      fq[] var0 = new fq[]{ERROR, READY};
      return var0;
   }

   public static final Lazy s() {
      return J;
   }

   static {
      long var9 = a ^ 24137878011772L;
      e = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "ÁOü°\u000e\u0002påy5ñÝ\u0081\u0093Å$ \u008b¢ã)Ù*\u0084m%ÛüLªØÏEÖ\u001dD=\u0095¥³\u0086ùÑþæ´TÙo\u0010\u0081ÛsÆçKAXbN¨\u008dº!µÃ";
      int var6 = "ÁOü°\u000e\u0002påy5ñÝ\u0081\u0093Å$ \u008b¢ã)Ù*\u0084m%ÛüLªØÏEÖ\u001dD=\u0095¥³\u0086ùÑþæ´TÙo\u0010\u0081ÛsÆçKAXbN¨\u008dº!µÃ".length();
      char var3 = 16;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var12;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[3];
            ERROR = new fq(true.z<invokedynamic>(9462, 5410696187012616223L ^ var9), 0);
            READY = new fq(true.z<invokedynamic>(21038, 3107931613246285509L ^ var9), 1);
            b = S();
            G = EnumEntriesKt.enumEntries((Enum[])b);
            Companion = new zg((DefaultConstructorMarker)null);
            J = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, fq::c);
            return;
         }

         var3 = var4.charAt(var2);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30956;
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
            throw new RuntimeException("su/catlean/fq", var10);
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
         throw new RuntimeException("su/catlean/fq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
