package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zb implements class_11281 {
   private final float a;
   private final float S;
   private final float k;
   private final float B;
   private final float n;
   @NotNull
   private final Color V;
   @NotNull
   private final Color O;
   private final float w;
   private static final long b = j0.a(8539136169730475426L, 6220740500895028232L, MethodHandles.lookup().lookupClass()).a(178811076249695L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public zb(float uRadius1, float uRadius2, float uRadius3, float uRadius4, long a, float uBorderWidth, @NotNull Color uColor, @NotNull Color uBorderColor, float uMix) {
      var5 ^= b;
      Intrinsics.checkNotNullParameter(var8, true.w<invokedynamic>(4918, 99742178344367124L ^ var5));
      Intrinsics.checkNotNullParameter(var9, true.w<invokedynamic>(5696, 8267762712618692964L ^ var5));
      super();
      this.a = var1;
      this.S = var2;
      this.k = var3;
      this.B = var4;
      this.n = var7;
      this.V = var8;
      this.O = var9;
      this.w = var10;
   }

   public final float H() {
      return this.a;
   }

   public final float Y() {
      return this.S;
   }

   public final float o() {
      return this.k;
   }

   public final float r() {
      return this.B;
   }

   public final float E() {
      return this.n;
   }

   @NotNull
   public final Color M() {
      return this.V;
   }

   @NotNull
   public final Color K() {
      return this.O;
   }

   public final float a() {
      return this.w;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = b ^ 49295804310105L;
      long var4 = var2 ^ 3769300497216L;
      long var6 = var2 ^ 123555749121984L;
      long var8 = var2 ^ 135105035745771L;
      long var10 = var2 ^ 123492133774162L;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(2036, 6408739716920555828L ^ var2));
      Std140Builder.intoBuffer(var1).putVec4(this.S, this.a, this.B, this.k).putFloat(this.n).putVec4(gk.E.H(this.V, var8), gk.E.L(var10, this.V), gk.E.M(var4, this.V), gk.E.D(var6, this.V)).putVec4(gk.E.H(this.O, var8), gk.E.L(var10, this.O), gk.E.M(var4, this.O), gk.E.D(var6, this.O)).putFloat(this.w);
   }

   public final float t() {
      return this.a;
   }

   public final float l() {
      return this.S;
   }

   public final float w() {
      return this.k;
   }

   public final float P() {
      return this.B;
   }

   public final float v() {
      return this.n;
   }

   @NotNull
   public final Color n() {
      return this.V;
   }

   @NotNull
   public final Color G() {
      return this.O;
   }

   public final float V() {
      return this.w;
   }

   @NotNull
   public final zb k(long a, float uRadius1, float uRadius2, float uRadius3, float uRadius4, float uBorderWidth, @NotNull Color uColor, @NotNull Color uBorderColor, float uMix) {
      var1 ^= b;
      long var11 = var1 ^ 100044004641252L;
      Intrinsics.checkNotNullParameter(var8, true.w<invokedynamic>(8019, 7599157872123730491L ^ var1));
      Intrinsics.checkNotNullParameter(var9, true.w<invokedynamic>(5391, 5410720728341237859L ^ var1));
      return new zb(var3, var4, var5, var6, var11, var7, var8, var9, var10);
   }

   public static zb c(long param0, zb param2, float param3, float param4, float param5, float param6, float param7, Color param8, Color param9, float param10, int param11, Object param12) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 29919730599273L;
      float var3 = this.w;
      Color var4 = this.O;
      Color var5 = this.V;
      float var6 = this.n;
      float var7 = this.B;
      float var8 = this.k;
      float var9 = this.S;
      float var10 = this.a;
      String var10000 = 5347.w<invokedynamic>(5347, 5143543530292808991L ^ var1);
      return var10000 + var10 + true.w<invokedynamic>(23233, 1868334731537564467L ^ var1) + var9 + true.w<invokedynamic>(4908, 4532299636344589010L ^ var1) + var8 + true.w<invokedynamic>(26131, 3236896129796210668L ^ var1) + var7 + true.w<invokedynamic>(14730, 5958920875821834352L ^ var1) + var6 + true.w<invokedynamic>(31179, 2640621625223209010L ^ var1) + var5 + true.w<invokedynamic>(20413, 5734517810939516492L ^ var1) + var4 + true.w<invokedynamic>(19259, 3951343108924297923L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 21058103617363L;
      int var3 = Float.hashCode(this.a);
      var3 = var3 * true.q<invokedynamic>(8304, 4128054584352993553L ^ var1) + Float.hashCode(this.S);
      var3 = var3 * true.q<invokedynamic>(5058, 2608879887262106274L ^ var1) + Float.hashCode(this.k);
      var3 = var3 * true.q<invokedynamic>(5058, 2608879887262106274L ^ var1) + Float.hashCode(this.B);
      var3 = var3 * true.q<invokedynamic>(5058, 2608879887262106274L ^ var1) + Float.hashCode(this.n);
      var3 = var3 * true.q<invokedynamic>(5058, 2608879887262106274L ^ var1) + this.V.hashCode();
      var3 = var3 * true.q<invokedynamic>(5058, 2608879887262106274L ^ var1) + this.O.hashCode();
      var3 = var3 * true.q<invokedynamic>(5058, 2608879887262106274L ^ var1) + Float.hashCode(this.w);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = b ^ 130628528003555L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[13];
      int var18 = 0;
      String var17 = "µq®ô¢/z\u008bÞ\u008féF\u0013\u0089\u0092=YÁÔÛÙL&µ,\u0007q¿¡\u0004®û Kþ\rÛj&\u009d\u009a«]B)ßw\u0016NA6?\u0088ßt¡\u000fîÞ\u0088zfuF*\u0018\u000e\u009b.@Û\u0000T\f»\u0004ÞvË)\u00ad½~\u0085\u008dÔkâ\u0081\u001a\u0010ø(ö\u008f[yA\u001b\u0018Ù\u0015v\u0093âC÷ µ¢®\u000f\u008c/_8°§\u001aë\u0091]ô9ê\u008cs\u001boa¶9l©pÜ\u0083eQ\u0097 n\u001b\u008fËýKAOn´ó\u0016 \u008a-Û\u0015ÅÕ&\u0093\u0003\u009fO9\u0090·À\u0018!\u0088o\u0010Ð<Í\u008aÄâ°cf4ñ`öæÇi(¾\u001aAnÇ¤µS#\u0001ì\u0086\u0094\u008f;Rß\u009bÖÖääQÓÈ°\u00192\u00ad\u009bykRc\u0094\u0097êedZ\u0010KÎ\u008d&\u0094qe6róì\u009fzg½J\u0018yØï§.\u0000\u009fÛ\u009c\u0092wcD\r\tù\u0097\u008di¼\u0011@ð« ?ØîÖ\u0099\u008c\u000ez\u0099Íj1¦»\u0085É5Êë\u0015Á0¼\u0083á`oÊ2á¯P";
      int var19 = "µq®ô¢/z\u008bÞ\u008féF\u0013\u0089\u0092=YÁÔÛÙL&µ,\u0007q¿¡\u0004®û Kþ\rÛj&\u009d\u009a«]B)ßw\u0016NA6?\u0088ßt¡\u000fîÞ\u0088zfuF*\u0018\u000e\u009b.@Û\u0000T\f»\u0004ÞvË)\u00ad½~\u0085\u008dÔkâ\u0081\u001a\u0010ø(ö\u008f[yA\u001b\u0018Ù\u0015v\u0093âC÷ µ¢®\u000f\u008c/_8°§\u001aë\u0091]ô9ê\u008cs\u001boa¶9l©pÜ\u0083eQ\u0097 n\u001b\u008fËýKAOn´ó\u0016 \u008a-Û\u0015ÅÕ&\u0093\u0003\u009fO9\u0090·À\u0018!\u0088o\u0010Ð<Í\u008aÄâ°cf4ñ`öæÇi(¾\u001aAnÇ¤µS#\u0001ì\u0086\u0094\u008f;Rß\u009bÖÖääQÓÈ°\u00192\u00ad\u009bykRc\u0094\u0097êedZ\u0010KÎ\u008d&\u0094qe6róì\u009fzg½J\u0018yØï§.\u0000\u009fÛ\u009c\u0092wcD\r\tù\u0097\u008di¼\u0011@ð« ?ØîÖ\u0099\u008c\u000ez\u0099Íj1¦»\u0085É5Êë\u0015Á0¼\u0083á`oÊ2á¯P".length();
      char var16 = ' ';
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  c = var20;
                  d = new String[13];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "-1\u0099>¢Åä¸c\u0016ª\u0019Ï½oës\u001d\f\u0014=ôáJ\u0011ÿ\u0090FfæÉA£j+Ñ\\ ãI";
                  int var5 = "-1\u0099>¢Åä¸c\u0016ª\u0019Ï½oës\u001d\f\u0014=ôáJ\u0011ÿ\u0090FfæÉA£j+Ñ\\ ãI".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "³ÉÕ;¹\u008d\u001fª\u0006ãñrh0è\u00ad";
                           var5 = "³ÉÕ;¹\u008d\u001fª\u0006ãñrh0è\u00ad".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "lnäE\u0088\u000f'F_ÆÔ\u001ai\u008f\u009cÎ Õ´\u0018²#¥N\u0086\u0002#\u009a\u0097ç\u0002:ê±\u0003øBî\u0096_V«\u0013ùÇ¾÷v×";
               var19 = "lnäE\u0088\u000f'F_ÆÔ\u001ai\u008f\u009cÎ Õ´\u0018²#¥N\u0086\u0002#\u009a\u0097ç\u0002:ê±\u0003øBî\u0096_V«\u0013ùÇ¾÷v×".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30514;
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
            throw new RuntimeException("su/catlean/zb", var10);
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
         throw new RuntimeException("su/catlean/zb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7574;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/zb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/zb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
