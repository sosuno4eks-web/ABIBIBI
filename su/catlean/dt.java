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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class dt extends dx {
   @NotNull
   private Function0 v;
   private float y;
   @NotNull
   private KMutableProperty0 j;
   private static final long a = j0.a(-2896643216701886018L, 4311963085688792257L, MethodHandles.lookup().lookupClass()).a(215683983291974L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public dt(@NotNull Function0 clickAction, float width, long a, @NotNull KMutableProperty0 hoverRef) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(1056, 3054421035254512039L ^ var3));
      Intrinsics.checkNotNullParameter(var5, true.n<invokedynamic>(20876, 7836664092426578952L ^ var3));
      super();
      this.v = var1;
      this.y = var2;
      this.j = var5;
   }

   public final float m() {
      return this.y;
   }

   public final void M(float <set-?>) {
      this.y = var1;
   }

   public void D(@NotNull class_332 context, long a, float x, float y, float mouseX, float mouseY) {
      // $FF: Couldn't be decompiled
   }

   public boolean y(float x, long a, float y, int button) {
      this.v.invoke();
      return true;
   }

   static {
      long var5 = a ^ 31560960641904L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[8];
      int var12 = 0;
      String var11 = "LMàFL*Ôé\u0099\u0018)·ô{\u009d¸ \u0093¦ÅÆëÅåãR\u0016É\u0091[Y\u0004\u0007+´f\u001b\u0099\u0016\u00adñ\u00ad³\u0000v@MíJ ßCC¨OÖL\u0086Ggñ¸\u0007!S³9¦j\u0011\u0097WRæt\u00169\u0091eP\u0088°\u0018!b¶·\u0003¼+\u0094O\u0015Ñ\u009dü\u0095U\u008ebá\u0094\u0018\u008b¶½¾\u0010Ró\u0010R\tXp\u0082õ»KC>ÏFb\u0010C\u008cNß 0ñ·ò±\u008ab\u008eV\u0092(";
      int var13 = "LMàFL*Ôé\u0099\u0018)·ô{\u009d¸ \u0093¦ÅÆëÅåãR\u0016É\u0091[Y\u0004\u0007+´f\u001b\u0099\u0016\u00adñ\u00ad³\u0000v@MíJ ßCC¨OÖL\u0086Ggñ¸\u0007!S³9¦j\u0011\u0097WRæt\u00169\u0091eP\u0088°\u0018!b¶·\u0003¼+\u0094O\u0015Ñ\u009dü\u0095U\u008ebá\u0094\u0018\u008b¶½¾\u0010Ró\u0010R\tXp\u0082õ»KC>ÏFb\u0010C\u008cNß 0ñ·ò±\u008ab\u008eV\u0092(".length();
      char var10 = 16;
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
                  b = var14;
                  c = new String[8];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 8753719709984408940L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
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

               var11 = "¯$cñ(\u001b#ÐÊ>s\u009d\t\u0094º-\u00102Ä\u0011È\u001cJ=-ª¶ ÷\u008e(\b\u0003";
               var13 = "¯$cñ(\u001b#ÐÊ>s\u009d\t\u0094º-\u00102Ä\u0011È\u001cJ=-ª¶ ÷\u008e(\b\u0003".length();
               var10 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32676;
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
            throw new RuntimeException("su/catlean/dt", var10);
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
         throw new RuntimeException("su/catlean/dt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
