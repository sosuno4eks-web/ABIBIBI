package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class df extends dh {
   @NotNull
   private final vp u;
   @NotNull
   private final File A;
   public f6 e;
   public List N;
   private static final long b = j0.a(2460762222238586319L, 5885245737116260641L, MethodHandles.lookup().lookupClass()).a(275441087102348L);
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long j;

   public df(@NotNull Json json, @NotNull vp sharedSource, long a) {
      var3 ^= b;
      long var10001 = var3 ^ 92886847688419L;
      int var5 = (int)((var3 ^ 92886847688419L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(13418, 2951565768082553685L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(24303, 3209902361613734354L ^ var3));
      super(var5, (char)var6, var1, (char)var7);
      this.u = var2;
      this.A = new File(kf.e(), true.i<invokedynamic>(5512, 5513667768526428854L ^ var3));
   }

   @NotNull
   public File K() {
      return this.A;
   }

   @NotNull
   public final f6 G(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d(long a, @NotNull f6 <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(24967, 6911743463985823550L ^ var1));
      this.e = var3;
   }

   @NotNull
   public final List L(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void w(long a, @NotNull List <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(27491, 7813910946876878298L ^ var1));
      this.N = var3;
   }

   public void N(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void i(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = b ^ 98903775739423L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[10];
      int var12 = 0;
      String var11 = "àÝ\u009emJ\u00adwV¹?\u009bT\tô«\u0092PM»ß\u0093-Ïpo>A\u0013\u008dnÍn\u0091.\u008c³OöS\"\u0098<ÂMm\u00156\u0080©?M\u0007ß~tmcX\u009a\u009d¾z@9\u009f\u009eF)ÿd\u000b\u0017cût´9f\u0080\u0090É\u001c~\u0018Îg\u008e*ïx`®Ðf\u0002úI\u0010ùK\u0001²|f\u00980ÒTæ\u0082\u0091\u008aÜù\u0010xR¡GUÌ¬\u0084]\u001f¾Úa\u0016O^\u0010ônë6DËÇ-f1ÜÑí\u000eUN\u0018\u0018g©¦ú\u009e\u001dß?\u0000r¼Y[\u0012 /fS\u008cQ0B\u0096 \u0013\u0006XI\u0086ª0À\u008a\u0087Z`:\u009a¾ó(Þ§}µJD²tN9\u0091»®rº\u0010\u0090W'\u0015Z@÷'G;\u0093§m¾\u000b«";
      int var13 = "àÝ\u009emJ\u00adwV¹?\u009bT\tô«\u0092PM»ß\u0093-Ïpo>A\u0013\u008dnÍn\u0091.\u008c³OöS\"\u0098<ÂMm\u00156\u0080©?M\u0007ß~tmcX\u009a\u009d¾z@9\u009f\u009eF)ÿd\u000b\u0017cût´9f\u0080\u0090É\u001c~\u0018Îg\u008e*ïx`®Ðf\u0002úI\u0010ùK\u0001²|f\u00980ÒTæ\u0082\u0091\u008aÜù\u0010xR¡GUÌ¬\u0084]\u001f¾Úa\u0016O^\u0010ônë6DËÇ-f1ÜÑí\u000eUN\u0018\u0018g©¦ú\u009e\u001dß?\u0000r¼Y[\u0012 /fS\u008cQ0B\u0096 \u0013\u0006XI\u0086ª0À\u008a\u0087Z`:\u009a¾ó(Þ§}µJD²tN9\u0091»®rº\u0010\u0090W'\u0015Z@÷'G;\u0093§m¾\u000b«".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  d = var14;
                  g = new String[10];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1490825600309748479L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  j = var23;
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

               var11 = "1ÒñÊâæ)¸:\u000fC\u0007Ñ\u0098\u001dO\u0010\u009eWó;kY\u0010\u001alq\u001e\u001ct\u0094VÉ";
               var13 = "1ÒñÊâæ)¸:\u000fC\u0007Ñ\u0098\u001dO\u0010\u009eWó;kY\u0010\u001alq\u001e\u001ct\u0094VÉ".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22164;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/df", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/df" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
