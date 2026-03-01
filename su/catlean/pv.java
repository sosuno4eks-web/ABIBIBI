package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pv {
   private final int S;
   @NotNull
   private final List a;
   private static final long b = j0.a(1107662597811270449L, 4343767109078625540L, MethodHandles.lookup().lookupClass()).a(132558427490247L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public pv(int playerId, @NotNull List particles, char a, long a) {
      long var6 = ((long)var3 << 48 | var4 << 16 >>> 16) ^ b;
      Intrinsics.checkNotNullParameter(var2, true.b<invokedynamic>(6283, 7531490797396385512L ^ var6));
      super();
      this.S = var1;
      this.a = var2;
   }

   public pv(int var1, List var2, int var3, DefaultConstructorMarker var4, long var5) {
      var5 ^= b;
      long var10001 = var5 ^ 76933000789963L;
      int var7 = (int)((var5 ^ 76933000789963L) >>> 48);
      long var8 = var10001 << 16 >>> 16;
      if ((var3 & 2) != 0) {
         var2 = (List)(new ArrayList());
      }

      this(var1, var2, (char)var7, var8);
   }

   public final int Q() {
      return this.S;
   }

   @NotNull
   public final List O() {
      return this.a;
   }

   public final int E() {
      return this.S;
   }

   @NotNull
   public final List P() {
      return this.a;
   }

   @NotNull
   public final pv D(int playerId, @NotNull List particles, long a) {
      var3 ^= b;
      long var10001 = var3 ^ 116042022732849L;
      int var5 = (int)((var3 ^ 116042022732849L) >>> 48);
      long var6 = var10001 << 16 >>> 16;
      Intrinsics.checkNotNullParameter(var2, true.b<invokedynamic>(14143, 8021412956210930851L ^ var3));
      return new pv(var1, var2, (char)var5, var6);
   }

   public static pv u(pv var0, long var1, int var3, List var4, int var5, Object var6) {
      var1 ^= b;
      long var7 = var1 ^ 46835258659913L;
      int var9 = -2808235589090395223L.A<invokedynamic>(-2808235589090395223L, var1);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var5 & 1;
               if (var9 != 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -2808424467549116984L, var1);
            }

            var3 = var0.S;
         }

         var10000 = var5 & 2;
      }

      if (var10000 != 0) {
         var4 = var0.a;
      }

      return var0.D(var3, var4, var7);
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 35990561013014L;
      int var10000 = this.S;
      List var10001 = this.a;
      String var10003 = true.b<invokedynamic>(17580, 6550034436201686607L ^ var1);
      return var10003 + var10000 + true.b<invokedynamic>(836, 6132346846657110437L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 119790742474096L;
      int var3 = Integer.hashCode(this.S);
      var3 = var3 * (int)f + this.a.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = b ^ 50311410502202L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "¨ÄÎO'èp\u000b\\!;\u0019$\u0013%&ÝÐ\u009a!Ì\u00919H\u0011¬\u00027²éåÑ Ô[í\u0088w\u001b\u0081êQ/KC9^!\u008b!G¼\u0012\"o>J\u0017 67Sj\tq";
      int var13 = "¨ÄÎO'èp\u000b\\!;\u0019$\u0013%&ÝÐ\u009a!Ì\u00919H\u0011¬\u00027²éåÑ Ô[í\u0088w\u001b\u0081êQ/KC9^!\u008b!G¼\u0012\"o>J\u0017 67Sj\tq".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  d = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -3306450957000125176L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  f = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "\tíïæ^ß©\u0000\u0006A]Þîr$\u009e\u00ad\u0004¯¶5\u001b!£rixðÕ\u008d\u0004\u0016ïp\u009c\u001d*E·\u0097¬ç¦ìo\u0002\u001ek [±Bd{\u001fÀÖåpy^ÆPÒ\rTb(?\u007f{°\u007f\u000b\u0081Ô|i\u0016-\u0013";
               var13 = "\tíïæ^ß©\u0000\u0006A]Þîr$\u009e\u00ad\u0004¯¶5\u001b!£rixðÕ\u008d\u0004\u0016ïp\u009c\u001d*E·\u0097¬ç¦ìo\u0002\u001ek [±Bd{\u001fÀÖåpy^ÆPÒ\rTb(?\u007f{°\u007f\u000b\u0081Ô|i\u0016-\u0013".length();
               var10 = '0';
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20027;
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
            throw new RuntimeException("su/catlean/pv", var10);
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
         throw new RuntimeException("su/catlean/pv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
