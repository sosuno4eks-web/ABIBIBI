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
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;

public final class _v implements zh {
   @NotNull
   public static final _v n;
   private static String[] E;
   private static final long a = j0.a(4210572406963522582L, 1275319807563491394L, MethodHandles.lookup().lookupClass()).a(88860691956306L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private _v() {
   }

   public final boolean p(long a, @NotNull String name) {
      var1 ^= a;
      long var4 = var1 ^ 26223402311879L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(17484, 7927288339825170195L ^ var1));
      return c0.S.L().j(var4).contains(var3);
   }

   public final boolean m(@NotNull class_1657 player, long a) {
      var2 ^= a;
      long var4 = var2 ^ 19231941484959L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(15015, 2696492982676331604L ^ var2));
      String var10001 = var1.method_7334().name();
      Intrinsics.checkNotNullExpressionValue(var10001, true.i<invokedynamic>(23076, 2097680367192571088L ^ var2));
      return this.P(var4, var10001);
   }

   public final boolean P(long a, @NotNull String name) {
      var1 ^= a;
      long var4 = var1 ^ 108057397769153L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(5234, 4401696526851019823L ^ var1));
      return c0.S.L().j(var4).add(var3);
   }

   public final boolean v(@NotNull class_1657 player, long a) {
      var2 ^= a;
      long var4 = var2 ^ 62979688497533L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(1894, 382706884996103243L ^ var2));
      String var10001 = var1.method_7334().name();
      Intrinsics.checkNotNullExpressionValue(var10001, true.i<invokedynamic>(18317, 5291633485547060386L ^ var2));
      return this.s(var4, var10001);
   }

   public final boolean s(long a, @NotNull String name) {
      var1 ^= a;
      long var4 = var1 ^ 30751677419260L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(17484, 7927301337702431016L ^ var1));
      return c0.S.L().j(var4).remove(var3);
   }

   public final void o(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 18484628317794L;
      c0.S.L().j(var3).clear();
   }

   static {
      long var9 = a ^ 27521352916436L;
      String[] var10000 = new String[3];
      d = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -7242384826052385624L, var9);
      Cipher var0;
      Cipher var11 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var11.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "Ñ\u008býR\u0084éÓ\u0097â\u0090Q°X\u0017g\u008e\u0096_\u0018ïUX³8¹2\u0017:\u0085\u001a\u0086Ì\u0010Xåª´¼aPð¯\u001fiv\u0096ì\u0011K\u0010X\u000b\u0018Gu\u0088\u00adUf\u0080ÅQüWF\u009f\u0010¾ÚwÏê\u0016ú§\u009a\u009d±¤®~ó\u0083";
      int var6 = "Ñ\u008býR\u0084éÓ\u0097â\u0090Q°X\u0017g\u008e\u0096_\u0018ïUX³8¹2\u0017:\u0085\u001a\u0086Ì\u0010Xåª´¼aPð¯\u001fiv\u0096ì\u0011K\u0010X\u000b\u0018Gu\u0088\u00adUf\u0080ÅQüWF\u009f\u0010¾ÚwÏê\u0016ú§\u009a\u009d±¤®~ó\u0083".length();
      char var3 = ' ';
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var12 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  c = new String[6];
                  n = new _v();
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var16;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\u0080µ×íd`\u001aã\u0011¸Å2P8\u0016K¾Æ\u0081\u008a\u0086ß$]Í\u000bæ\u007f\u0096\u0016\u0080_\u0010PÉ&uÍÀ\u0015`\u008e\u0005\u0093g\u0091G\u001f\u0083";
               var6 = "\u0080µ×íd`\u001aã\u0011¸Å2P8\u0016K¾Æ\u0081\u008a\u0086ß$]Í\u000bæ\u007f\u0096\u0016\u0080_\u0010PÉ&uÍÀ\u0015`\u008e\u0005\u0093g\u0091G\u001f\u0083".length();
               var3 = ' ';
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   public static void P(String[] var0) {
      E = var0;
   }

   public static String[] y() {
      return E;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30682;
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
            throw new RuntimeException("su/catlean/_v", var10);
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
         throw new RuntimeException("su/catlean/_v" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
