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
public enum hd {
   @NotNull
   public static final sw Companion;
   @NotNull
   private static final Lazy Q;
   public static final hd DISPATCH;
   public static final hd SET_ACTIVITY;
   private static final hd[] P;
   private static final EnumEntries y;
   private static final long a = j0.a(9090622274100861558L, 3898273562985133944L, MethodHandles.lookup().lookupClass()).a(165964312308651L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   @NotNull
   public static EnumEntries D() {
      return y;
   }

   private static final KSerializer w() {
      long var0 = a ^ 90770523906504L;
      return EnumsKt.createSimpleEnumSerializer(true.o<invokedynamic>(944, 5951334542256980633L ^ var0), (Enum[])values());
   }

   private static final hd[] Z() {
      hd[] var0 = new hd[]{DISPATCH, SET_ACTIVITY};
      return var0;
   }

   public static final Lazy L() {
      return Q;
   }

   static {
      long var9 = a ^ 70138255191263L;
      d = new HashMap(13);
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
      String var4 = "®£\u009a6\u0082²3/7rÿÒÝ¼ãw`~#\u0015v\u008dS\u0017 ý°ù2A\u0081Ì\f{\u008b¿\u0086e_\u0002Î\nÅWì\f\u0096\u0005Iz×4I\u0080Õ¬¨ Þ®èö¿ãg\u009aù¿Ú\u000f\u0090)%R5Â\u0090Ô â3r\u0018å\u0014N6íÀw";
      int var6 = "®£\u009a6\u0082²3/7rÿÒÝ¼ãw`~#\u0015v\u008dS\u0017 ý°ù2A\u0081Ì\f{\u008b¿\u0086e_\u0002Î\nÅWì\f\u0096\u0005Iz×4I\u0080Õ¬¨ Þ®èö¿ãg\u009aù¿Ú\u000f\u0090)%R5Â\u0090Ô â3r\u0018å\u0014N6íÀw".length();
      char var3 = 24;
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var12 = a(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var12;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            DISPATCH = new hd(true.o<invokedynamic>(28423, 8367627885310632763L ^ var9), 0);
            SET_ACTIVITY = new hd(true.o<invokedynamic>(28532, 7574022236736840521L ^ var9), 1);
            P = Z();
            y = EnumEntriesKt.enumEntries((Enum[])P);
            Companion = new sw((DefaultConstructorMarker)null);
            Q = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, hd::w);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24518;
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
            throw new RuntimeException("su/catlean/hd", var10);
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
         throw new RuntimeException("su/catlean/hd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
