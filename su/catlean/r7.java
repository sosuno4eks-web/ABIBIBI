package su.catlean;

import com.mojang.authlib.GameProfile;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r7 {
   @NotNull
   private final GameProfile H;
   private boolean x;
   @NotNull
   private final class_640 z;
   @Nullable
   private String o;
   private static final long a = j0.a(7934620337953504694L, 2770578454572055915L, MethodHandles.lookup().lookupClass()).a(32626710154641L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public r7(short a, @NotNull GameProfile profile, boolean announced, long a) {
      long var6 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(9341, 2327760068760184309L ^ var6));
      super();
      this.H = var2;
      this.x = var3;
      this.z = new class_640(this.H, false);
   }

   @NotNull
   public final GameProfile T() {
      return this.H;
   }

   public final boolean L() {
      return this.x;
   }

   public final void u(boolean <set-?>) {
      this.x = var1;
   }

   @NotNull
   public final class_640 B() {
      return this.z;
   }

   @Nullable
   public final String f(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final String Q(int param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String m(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 116780985113764L;
      int var3 = (int)((var1 ^ 116780985113764L) >>> 32);
      long var4 = var10001 << 32 >>> 32;
      long var6 = var1 ^ 42789063880607L;
      String var10000 = this.Q(var3, var4);
      return var10000 + " " + this.f(var6);
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      return this.getClass().hashCode();
   }

   private static final String k(class_640 var0) {
      return var0.method_2966().name();
   }

   private static final String W(Function1 var0, Object var1) {
      return (String)var0.invoke(var1);
   }

   private static final boolean V(String var0, String var1) {
      return var1.equals(var0);
   }

   private static final boolean h(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var0 = a ^ 53242574833246L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "[M'¹¶#ÀÝÎ6\u0007w§#eæ\u0010(0*Ó§K\u001b¯\u0081U\u008dÄöÑ\u0098<";
      int var8 = "[M'¹¶#ÀÝÎ6\u0007w§#eæ\u0010(0*Ó§K\u001b¯\u0081U\u008dÄöÑ\u0098<".length();
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
                  c = new String[4];
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

               var6 = "z\fw\u001ep\u0098\u0087Ôé?hêd{ è\u0010\u009eúwU\u009d÷EA[T÷]tFÊf";
               var8 = "z\fw\u001ep\u0098\u0087Ôé?hêd{ è\u0010\u009eúwU\u009d÷EA[T÷]tFÊf".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22087;
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
            throw new RuntimeException("su/catlean/r7", var10);
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
         throw new RuntimeException("su/catlean/r7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
