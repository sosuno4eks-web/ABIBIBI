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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class dw extends dx {
   @NotNull
   private _k B;
   @NotNull
   private final aa l;
   private static final long a = j0.a(6101475563671513782L, 5837118043521593354L, MethodHandles.lookup().lookupClass()).a(165383900426181L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;
   private static final long f;

   public dw(long a, @NotNull _k point) {
      var1 ^= a;
      long var10001 = var1 ^ 27487502763958L;
      int var4 = (int)((var1 ^ 27487502763958L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(31030, 5270983722363263559L ^ var1));
      super();
      this.B = var3;
      this.l = new aa(sa.OUT_QUINT, f, (short)var4, (short)var5, var6);
   }

   @NotNull
   public final _k o() {
      return this.B;
   }

   public final void Q(@NotNull _k <set-?>, int a, byte a, int a) {
      long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(12183, 487969517067957662L ^ var5));
      this.B = var1;
   }

   public void D(@NotNull class_332 context, long a, float x, float y, float mouseX, float mouseY) {
      // $FF: Couldn't be decompiled
   }

   public boolean y(float x, long a, float y, int button) {
      return false;
   }

   static {
      long var10 = a ^ 89278385516343L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var10 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var19 = new String[6];
      int var17 = 0;
      String var16 = "ÕO\ff\u00068\u0016\u0098]\u0005¦ÎDâ\u0019P\u00102cç.Û\u0000\u0096z\u0016#6T\u001eßö¡\u00106Ð\u001ba\u009cü\u0010Ü1\"ýi³Ñ[®\u0010]Æ^\nqÏDj®ýWê¢ÍýF";
      int var18 = "ÕO\ff\u00068\u0016\u0098]\u0005¦ÎDâ\u0019P\u00102cç.Û\u0000\u0096z\u0016#6T\u001eßö¡\u00106Ð\u001ba\u009cü\u0010Ü1\"ýi³Ñ[®\u0010]Æ^\nqÏDj®ýWê¢ÍýF".length();
      char var15 = 16;
      int var14 = -1;

      label49:
      while(true) {
         ++var14;
         String var21 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var20 = var12.doFinal(var21.getBytes("ISO-8859-1"));
            String var26 = a(var20).intern();
            switch(var10001) {
            case 0:
               var19[var17++] = var26;
               if ((var14 += var15) >= var18) {
                  b = var19;
                  c = new String[6];
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var10 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var7 = -1494482628501842284L;
                  byte[] var9 = var5.doFinal(new byte[]{(byte)((int)(var7 >>> 56)), (byte)((int)(var7 >>> 48)), (byte)((int)(var7 >>> 40)), (byte)((int)(var7 >>> 32)), (byte)((int)(var7 >>> 24)), (byte)((int)(var7 >>> 16)), (byte)((int)(var7 >>> 8)), (byte)((int)var7)});
                  long var28 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
                  boolean var24 = true;
                  e = var28;
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var10 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8484692888840121595L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  var28 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  var24 = true;
                  f = var28;
                  return;
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var19[var17++] = var26;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label49;
               }

               var16 = "²\u0002P\u0085\u009a\u0080\u0015®Ú´\u0091\u001coè\u000e\u0007o-\\«\u0001í)w\r&>Ñ&\u0004ñô\u0010;Î\u000bkZ¸Ð\u0018?s´\u0081]Î\u0090²";
               var18 = "²\u0002P\u0085\u009a\u0080\u0015®Ú´\u0091\u001coè\u000e\u0007o-\\«\u0001í)w\r&>Ñ&\u0004ñô\u0010;Î\u000bkZ¸Ð\u0018?s´\u0081]Î\u0090²".length();
               var15 = ' ';
               var14 = -1;
            }

            ++var14;
            var21 = var16.substring(var14, var14 + var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18531;
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
            throw new RuntimeException("su/catlean/dw", var10);
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
         throw new RuntimeException("su/catlean/dw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
