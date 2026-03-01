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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1041;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.KeyMappingAccessor;

public final class ip implements im {
   @NotNull
   public static final ip f;
   private static boolean O;
   private static boolean C;
   private static final long a = j0.a(3265215993503041312L, 9201316094380776480L, MethodHandles.lookup().lookupClass()).a(186875492548220L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   private ip() {
   }

   public final boolean n() {
      return C;
   }

   public final void K(boolean <set-?>) {
      C = var1;
   }

   public void b(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void r(long a, @NotNull qq rotation) {
      // $FF: Couldn't be decompiled
   }

   public void v(int var1, int var2, int var3) {
   }

   public final void j(boolean hvh, long a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean W(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final boolean s(boolean can, long a) {
      // $FF: Couldn't be decompiled
   }

   private static final void z(boolean var0) {
      long var1 = a ^ 26430017887511L;
      long var3 = var1 ^ 61105314955830L;
      long var10001 = var1 ^ 112954279368081L;
      int var5 = (int)((var1 ^ 112954279368081L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);

      try {
         ip var10000 = f;
         C = false;
         class_304 var9 = s8.H((short)var5, (short)var6, var7).field_1690.field_1867;
         class_1041 var10 = s8.H((short)var5, (short)var6, var7).method_22683();
         class_304 var10002 = s8.H((short)var5, (short)var6, var7).field_1690.field_1867;
         Intrinsics.checkNotNull(var10002, true.c<invokedynamic>(2867, 1454000775929369049L ^ var1));
         var9.method_23481(class_3675.method_15987(var10, ((KeyMappingAccessor)var10002).getKey().method_1444()));
         if (var0) {
            i4.v.B(var3);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, -1869312953944402339L, var1);
      }
   }

   static {
      long var5 = a ^ 44526102913354L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "oL\u008bY®\u0014¤÷Êý:BÈ¹c\u00165\u0015Ln@è9Ü\u0088/\"\u0005\u0002\\ÙÐÎW}\u0089VûÚM\u0096Gûåôaä°3®\u009fÌÏÍð¯f\u0005\u0001\u008dðeØ«sæ\u0094¿\u0088§Ð\u0005\"\"äùÇ©\u0086\u0087»ø\u001f+~FF\u0003°<n\u0091}\"ªJÇ¥óÄ\u0098C\u0011V\u0016lýã\u0099\u008e\u008d\u0086\u0089{ÖÑ\u008a±Û\u0089\u009e\u000eÏ?Ýc<oYbï\u009b×*ZTZÁ\u000fÙ»b¸êz\u001enÎ\n\u0082¼\u001e!\u0007\u0092\u000eÀÙ\u008c<Ä\u0088iÙ\u009bÍ1`ñ\\\u0084p\u0006lJ}\u00adLÙïD\u001bÜ\u0012\u009062\u008eã´B©½ä°/k\u0018\u009c{\u001a½®ùÇWâCÊÒ¨\u008f%¥á\u0006\u0002ÿ\u0093`C´.¿\u0095^\u001f`Ív\u0006mO9\u0086ÆJ\tê\u0084ys5\u000e\u009b9ý\u008bÍ3¡SÂÇÄµ\u008e!(ð\u0004\u0097\u000e5kHHÞJ\u0018sïYìØÖ¦\u0096i®l¯u¥!\u0010ÑYä\u0088òò>¨\u0012¹\u000e§";
      int var13 = "oL\u008bY®\u0014¤÷Êý:BÈ¹c\u00165\u0015Ln@è9Ü\u0088/\"\u0005\u0002\\ÙÐÎW}\u0089VûÚM\u0096Gûåôaä°3®\u009fÌÏÍð¯f\u0005\u0001\u008dðeØ«sæ\u0094¿\u0088§Ð\u0005\"\"äùÇ©\u0086\u0087»ø\u001f+~FF\u0003°<n\u0091}\"ªJÇ¥óÄ\u0098C\u0011V\u0016lýã\u0099\u008e\u008d\u0086\u0089{ÖÑ\u008a±Û\u0089\u009e\u000eÏ?Ýc<oYbï\u009b×*ZTZÁ\u000fÙ»b¸êz\u001enÎ\n\u0082¼\u001e!\u0007\u0092\u000eÀÙ\u008c<Ä\u0088iÙ\u009bÍ1`ñ\\\u0084p\u0006lJ}\u00adLÙïD\u001bÜ\u0012\u009062\u008eã´B©½ä°/k\u0018\u009c{\u001a½®ùÇWâCÊÒ¨\u008f%¥á\u0006\u0002ÿ\u0093`C´.¿\u0095^\u001f`Ív\u0006mO9\u0086ÆJ\tê\u0084ys5\u000e\u009b9ý\u008bÍ3¡SÂÇÄµ\u008e!(ð\u0004\u0097\u000e5kHHÞJ\u0018sïYìØÖ¦\u0096i®l¯u¥!\u0010ÑYä\u0088òò>¨\u0012¹\u000e§".length();
      char var10 = 24;
      int var9 = -1;

      while(true) {
         ++var9;
         byte[] var15 = var7.doFinal(var11.substring(var9, var9 + var10).getBytes("ISO-8859-1"));
         String var17 = a(var15).intern();
         boolean var10001 = true;
         var14[var12++] = var17;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -8064825719299870291L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            e = var19;
            f = new ip();
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32160;
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
            throw new RuntimeException("su/catlean/ip", var10);
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
         throw new RuntimeException("su/catlean/ip" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
