package su.catlean;

import java.awt.Color;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;

public final class hr extends class_437 {
   private final float W;
   private final float L;
   @NotNull
   private sa N;
   private long m;
   private boolean M;
   private boolean S;
   private int i;
   @NotNull
   private final Color s;
   @NotNull
   private final Color j;
   @NotNull
   private final Color Q;
   @NotNull
   private final Color K;
   @NotNull
   private final Color X;
   @NotNull
   private final Color R;
   @NotNull
   private final Color t;
   private long o;
   @NotNull
   private final List z;
   private static final long a = j0.a(3942072890943617694L, 7753576020105595436L, MethodHandles.lookup().lookupClass()).a(342954656616L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;

   public hr(long var1) {
      var1 ^= a;
      super(class_2561.method_30163(true.k<invokedynamic>(31277, 986868180377650595L ^ var1)));
      this.W = 210.0F;
      this.L = 8.0F;
      this.N = sa.LINEAR;
      this.m = h;
      this.M = true;
      this.S = true;
      this.i = true.o<invokedynamic>(24900, 2345460293515801220L ^ var1);
      this.s = new Color(true.o<invokedynamic>(5515, 6200944541969974857L ^ var1));
      this.j = new Color(true.o<invokedynamic>(8338, 1531581814390731603L ^ var1));
      this.Q = new Color(-1);
      this.K = new Color(true.o<invokedynamic>(20705, 7661145847259022133L ^ var1));
      this.X = new Color(true.o<invokedynamic>(28753, 5735876173105652609L ^ var1));
      this.R = new Color(true.o<invokedynamic>(529, 1415029894790844887L ^ var1));
      this.t = new Color(true.o<invokedynamic>(17860, 1716316428412179969L ^ var1));
      this.z = CollectionsKt.toList((Iterable)sa.U());
   }

   @NotNull
   public final sa t() {
      return this.N;
   }

   public final long C() {
      return this.m;
   }

   public final void T(long <set-?>) {
      this.m = var1;
   }

   public final boolean A() {
      return this.M;
   }

   public final void P(boolean <set-?>) {
      this.M = var1;
   }

   public final boolean i() {
      return this.S;
   }

   public final void d(boolean <set-?>) {
      this.S = var1;
   }

   public final int T() {
      return this.i;
   }

   public final void K(int <set-?>) {
      this.i = var1;
   }

   @NotNull
   public final Color E() {
      return this.s;
   }

   @NotNull
   public final Color J() {
      return this.j;
   }

   @NotNull
   public final Color y() {
      return this.Q;
   }

   @NotNull
   public final Color p() {
      return this.K;
   }

   @NotNull
   public final Color f() {
      return this.X;
   }

   @NotNull
   public final Color q() {
      return this.R;
   }

   @NotNull
   public final Color r() {
      return this.t;
   }

   protected void method_57734(@NotNull class_332 context) {
      long var2 = a ^ 120648771742449L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(26060, 7952886487202128648L ^ var2));
   }

   public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
      long var5 = a ^ 6872956312879L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(26060, 7952864245830374614L ^ var5));
   }

   public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
      // $FF: Couldn't be decompiled
   }

   private final void s(class_332 param1, float param2, float param3, float param4, long param5, float param7) {
      // $FF: Couldn't be decompiled
   }

   private final void V(class_332 param1, float param2, long param3, float param5, float param6, float param7) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
      // $FF: Couldn't be decompiled
   }

   private final double m(double var1) {
      return var1;
   }

   private final String C(double var1) {
      return String.valueOf((double)MathKt.roundToInt(var1 * 1000.0D) / 1000.0D);
   }

   static {
      long var16 = a ^ 54678624058840L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[20];
      int var23 = 0;
      String var22 = "\u0092\u0099g\u008cÂ\u0014Ýÿxè=Â Ý=Z\u0018^ð²û\u001dAc\u0003ý\u001bãøå\t¶\u0098ªoÙ\u0007knAÞ ÓÉ\u0017wF\u0013îø¢ä\u0092L\u009f\u0094þ{0«\u0091îUCìxMÕWEÜtíi\u0018?Ý\u000f\fAz\u0091rG*ð\u0011_\u001c!q@ûº\"Fs\u0097Ò\u0010\u0003~Çgr\u009aÐ!ÏLmg#Îá:\u0010Äv\u009e2I>(- *Ëáx\u009bÀi\u0010\u0091Ý\u0087¾ÁL\u0093ò{,D1àþ\u00050\u0018\tÖ0KòåX» Ë¼ÇF\u008eëãïvKg\u001e)õÍ\u0018ÌxUÚçn\rd8\u0090`c\\}\u0082ÖÛ\u008d\u0091ÀÃÎèO !»l©»\u007fÜ ¦c\b\u0097õ\u0002\r· ±%c\fO+qÂj¸\u0002eé;Ð\u0010~ngì\u0014~\u0091\u000f\u000evm½s\u0085Îí\u0018ë\u0005ñ#i\u0089\u0096{8?`6\u009eÑn)Z\u007f|çìÛ|r >\u0099Ö\u0014(\u0089ÊhåD¤\u0098¥M\u0006\u0091\u0089ÅRÒ\u001b³EÆ°Q¸Ì\u0010\u000fÙ\f q|ËXp-Â\u008c\u0019\u009cÉ÷\u0088Ú\u0080Ñ\u009cÚ9²Ø±åUÌúþñVÂ´Ç\u0010TNÌ8\u000b31W[\u0014»°Áb¬£\u0010*\u009bl]`5fmõu\u001a\u0002»ÌµU\u0010\u0000OF\u0007áÀ\u0006ÿá\u0016\f\u0003¨OÙ9\u0010\u00adè\u0000¸\u000f\u0092ê¸Mt|\u001ff\u0082,ð";
      int var24 = "\u0092\u0099g\u008cÂ\u0014Ýÿxè=Â Ý=Z\u0018^ð²û\u001dAc\u0003ý\u001bãøå\t¶\u0098ªoÙ\u0007knAÞ ÓÉ\u0017wF\u0013îø¢ä\u0092L\u009f\u0094þ{0«\u0091îUCìxMÕWEÜtíi\u0018?Ý\u000f\fAz\u0091rG*ð\u0011_\u001c!q@ûº\"Fs\u0097Ò\u0010\u0003~Çgr\u009aÐ!ÏLmg#Îá:\u0010Äv\u009e2I>(- *Ëáx\u009bÀi\u0010\u0091Ý\u0087¾ÁL\u0093ò{,D1àþ\u00050\u0018\tÖ0KòåX» Ë¼ÇF\u008eëãïvKg\u001e)õÍ\u0018ÌxUÚçn\rd8\u0090`c\\}\u0082ÖÛ\u008d\u0091ÀÃÎèO !»l©»\u007fÜ ¦c\b\u0097õ\u0002\r· ±%c\fO+qÂj¸\u0002eé;Ð\u0010~ngì\u0014~\u0091\u000f\u000evm½s\u0085Îí\u0018ë\u0005ñ#i\u0089\u0096{8?`6\u009eÑn)Z\u007f|çìÛ|r >\u0099Ö\u0014(\u0089ÊhåD¤\u0098¥M\u0006\u0091\u0089ÅRÒ\u001b³EÆ°Q¸Ì\u0010\u000fÙ\f q|ËXp-Â\u008c\u0019\u009cÉ÷\u0088Ú\u0080Ñ\u009cÚ9²Ø±åUÌúþñVÂ´Ç\u0010TNÌ8\u000b31W[\u0014»°Áb¬£\u0010*\u009bl]`5fmõu\u001a\u0002»ÌµU\u0010\u0000OF\u0007áÀ\u0006ÿá\u0016\f\u0003¨OÙ9\u0010\u00adè\u0000¸\u000f\u0092ê¸Mt|\u001ff\u0082,ð".length();
      char var21 = 16;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  c = new String[20];
                  g = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[26];
                  int var8 = 0;
                  String var9 = "ß¼u.Bdá\u001e;Æ/®\u0011Ú9ÌÕKöÀ'|Ìg\u0010\u00ad\u0016Þóc\u0097ù&¶\u0083»\u0094Å¶\u008fCXL\u0080)w\u0090U\u009aPEÅïN\u0012\u0006;oñ\u0006íPñIW\u0093_1ï£CeÅ.`çV\u00ad\u0089\u001eá\u0001Vs]¡|µóò*®~\u0014\u0080:\u0091BÉ\u009cc\u001f\u0018\b\u001eIO\u0017¶XH\u000f$\u0081É¼ò\u0002²ÄEµôU\u009cô¥\u0087þ-6Ç-Ø¤ð\u009e¿¦¿p\u0094C\u0005\u0010ý\u000fÆ\u009b\rÚ`½þåÙe7Î~|«ã'_( \u0092\u0089\u0016üÖñfÇvys±YìC²6z\u0098L°%q\u000f\u001a";
                  int var10 = "ß¼u.Bdá\u001e;Æ/®\u0011Ú9ÌÕKöÀ'|Ìg\u0010\u00ad\u0016Þóc\u0097ù&¶\u0083»\u0094Å¶\u008fCXL\u0080)w\u0090U\u009aPEÅïN\u0012\u0006;oñ\u0006íPñIW\u0093_1ï£CeÅ.`çV\u00ad\u0089\u001eá\u0001Vs]¡|µóò*®~\u0014\u0080:\u0091BÉ\u009cc\u001f\u0018\b\u001eIO\u0017¶XH\u000f$\u0081É¼ò\u0002²ÄEµôU\u009cô¥\u0087þ-6Ç-Ø¤ð\u009e¿¦¿p\u0094C\u0005\u0010ý\u000fÆ\u009b\rÚ`½þåÙe7Î~|«ã'_( \u0092\u0089\u0016üÖñfÇvys±YìC²6z\u0098L°%q\u000f\u001a".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              e = var11;
                              f = new Integer[26];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 940518878741957542L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              h = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "ü<\u0010OÜÏ\u0094PXÍ*i°T¹Þ";
                           var10 = "ü<\u0010OÜÏ\u0094PXÍ*i°T¹Þ".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "j;;\u0000\tÄ_\u00885Ä\u0081\u0081hg\\]\u0010Ú\u0017ª8~\u0006\"U\u00106±\fZ\u0086Òò";
               var24 = "j;;\u0000\tÄ_\u00885Ä\u0081\u0081hg\\]\u0010Ú\u0017ª8~\u0006\"U\u00106±\fZ\u0086Òò".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 626;
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
            throw new RuntimeException("su/catlean/hr", var10);
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
         throw new RuntimeException("su/catlean/hr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11808;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/hr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/hr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
