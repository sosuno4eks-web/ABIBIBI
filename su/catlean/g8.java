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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;
import su.catlean.gofra.Gofra;

public final class g8 {
   private static k9[] b;
   private static final long a = j0.a(5156841133575375509L, 545519303844815336L, MethodHandles.lookup().lookupClass()).a(267682027495172L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   public static final void Y(short a, @NotNull IPasteable $this$font, int a, char a) {
      long var4 = ((long)var0 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 94996120891443L;
      long var8 = var4 ^ 48025411750659L;
      long var10 = var4 ^ 42204764761656L;
      long var12 = var4 ^ 4269501508329L;
      long var14 = var4 ^ 117409786256314L;
      long var16 = var4 ^ 66437079723063L;
      long var10001 = var4 ^ 102514563740209L;
      long var18 = (var4 ^ 102514563740209L) >>> 32;
      int var20 = (int)(var10001 << 32 >>> 32);
      long var21 = var4 ^ 1271968333444L;
      var10001 = var4 ^ 41136805224746L;
      int var23 = (int)((var4 ^ 41136805224746L) >>> 32);
      int var24 = (int)(var10001 << 32 >>> 48);
      int var25 = (int)(var10001 << 48 >>> 48);
      long var26 = var4 ^ 29423245460030L;
      var10001 = var4 ^ 75151705262167L;
      int var28 = (int)((var4 ^ 75151705262167L) >>> 56);
      int var29 = (int)(var10001 << 8 >>> 32);
      int var30 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(5737, 4011902190789361998L ^ var4));
      g3.V(g3.w((byte)var28, var29, 7.5F, true.l<invokedynamic>(15504, 2749652334840294324L ^ var4), var30), var12);
      g3.U(g3.w((byte)var28, var29, 8.0F, true.l<invokedynamic>(12219, 1137939426343532699L ^ var4), var30), var8);
      -3991074243561919897L.A<invokedynamic>(-3991074243561919897L, var4);
      g3.f(var23, var24, g3.w((byte)var28, var29, 9.5F, true.l<invokedynamic>(12219, 1137939426343532699L ^ var4), var30), var25);
      g3.C(g3.w((byte)var28, var29, 6.5F, true.l<invokedynamic>(12219, 1137939426343532699L ^ var4), var30), var14);
      g3.c(g3.w((byte)var28, var29, 12.0F, true.l<invokedynamic>(18208, 9134872465366634499L ^ var4), var30), var26);

      try {
         g3.L(var16, g3.w((byte)var28, var29, 8.0F, true.l<invokedynamic>(24350, 1449989919081187387L ^ var4), var30));
         g3.M(g3.w((byte)var28, var29, 20.0F, true.l<invokedynamic>(24350, 1449989919081187387L ^ var4), var30), var6);
         g3.z(var21, g3.w((byte)var28, var29, 25.0F, true.l<invokedynamic>(24350, 1449989919081187387L ^ var4), var30));
         g3.D(g3.w((byte)var28, var29, 12.0F, true.l<invokedynamic>(5248, 3183092285534634918L ^ var4), var30), var18, var20);
         g3.o(g3.w((byte)var28, var29, 7.5F, true.l<invokedynamic>(20018, 3519201399907604755L ^ var4), var30), var10);
         Gofra.INSTANCE.plug(_o.w);
         if (-4017620890245018284L.A<invokedynamic>(-4017620890245018284L, var4) == null) {
            (new k9[3]).A<invokedynamic>(new k9[3], -4023425152290729329L, var4);
         }

      } catch (NumberFormatException var32) {
         throw var32.A<invokedynamic>(var32, -3954620684045035253L, var4);
      }
   }

   public static void u(k9[] var0) {
      b = var0;
   }

   public static k9[] g() {
      return b;
   }

   static {
      long var9 = a ^ 116306732877189L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, -8694511106473746960L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "e\u0083\u0004\u00905\u009cKD!ºý½ \u009e×Î gÇ¾8_§DÅÊ\u000b\u0016v\u0089ÛUÙ·ýÐa\u0092{\u0019²\u000bô\u000b\u0087ã\u009b¿\u001b\u0010*üô\r\u0083^¯\u001dÈ\u0088\rÆ\f\u0003}\u0094\u0018\u0083åÄ(\u0083À\u001f\u00000L\u0001ä\r!\u001eJ\u0086vy±\u00033\u0084K ®òé)\u001aÐ\u0011qL\u0013Bëaë:ú©&©4Åp!c\u0019WÁWí5T1";
      int var6 = "e\u0083\u0004\u00905\u009cKD!ºý½ \u009e×Î gÇ¾8_§DÅÊ\u000b\u0016v\u0089ÛUÙ·ýÐa\u0092{\u0019²\u000bô\u000b\u0087ã\u009b¿\u001b\u0010*üô\r\u0083^¯\u001dÈ\u0088\rÆ\f\u0003}\u0094\u0018\u0083åÄ(\u0083À\u001f\u00000L\u0001ä\r!\u001eJ\u0086vy±\u00033\u0084K ®òé)\u001aÐ\u0011qL\u0013Bëaë:ú©&©4Åp!c\u0019WÁWí5T1".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var11 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var15;
               if ((var2 += var3) >= var6) {
                  c = var7;
                  d = new String[7];
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var15;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "I\u0082\u0003R÷Àëi{\u0007 \u008dá¯\u0015-\u0006d§qÑPø\u009fº>ièEô\u001c÷\u0010i\u0004\u0006d¡ \rÒvÄe[/¿`È";
               var6 = "I\u0082\u0003R÷Àëi{\u0007 \u008dá¯\u0015-\u0006d§qÑPø\u009fº>ièEô\u001c÷\u0010i\u0004\u0006d¡ \rÒvÄe[/¿`È".length();
               var3 = ' ';
               var2 = -1;
            }

            ++var2;
            var11 = var4.substring(var2, var2 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24268;
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
            throw new RuntimeException("su/catlean/g8", var10);
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
         throw new RuntimeException("su/catlean/g8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
